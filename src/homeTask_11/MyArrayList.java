package homeTask_11;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {

  private static final int DEFAULT_CAPACITY = 10;
  private static final Object[] EMPTY_ELEMENT_DATA = {};

  private Object[] elementData;
  private int size;


  public MyArrayList() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity > 0) {
      this.elementData = new Object[initialCapacity];
    } else if (initialCapacity == 0) {
      this.elementData = EMPTY_ELEMENT_DATA;
    } else {
      throw new InvalidCapacityException("Неверная емкость: " + initialCapacity);
    }
  }


  public void add(E element) {
    ensureCapacity(size + 1);
    elementData[size++] = element;
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    rangeCheck(index);
    return (E) elementData[index];
  }


  public void remove(int index) {
    rangeCheck(index);

    int numMoved = size - index - 1;
    if (numMoved > 0) {
      System.arraycopy(elementData, index + 1, elementData, index, numMoved);
    }

    elementData[--size] = null; // Помогаем сборщику мусора
  }


  public boolean contains(E element) {
    for (int i = 0; i < size; i++) {
      if (Objects.equals(element, elementData[i])) {
        return true;
      }
    }
    return false;
  }


  public void clear() {
    for (int i = 0; i < size; i++) {
      elementData[i] = null;
    }
    size = 0;
  }


  public int size() {
    return size;
  }


  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public String toString() {
    if (size == 0) {
      return "[]";
    }

    StringBuilder sb = new StringBuilder();
    sb.append('[');
    for (int i = 0; i < size; i++) {
      sb.append(elementData[i]);
      if (i < size - 1) {
        sb.append(", ");
      }
    }
    sb.append(']');
    return sb.toString();
  }

  private void ensureCapacity(int minCapacity) {
    if (minCapacity > elementData.length) {
      int oldCapacity = elementData.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1); // Увеличиваем на 50%
      if (newCapacity < minCapacity) {
        newCapacity = minCapacity;
      }
      elementData = Arrays.copyOf(elementData, newCapacity);
    }
  }

  private void rangeCheck(int index) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
    }
  }
}
