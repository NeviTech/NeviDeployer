package xxnvt.model.file;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xxtg.fnd.deployment.util;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayIterator implements Iterator {
  private Object array[];
  private int pos = 0;

  public ArrayIterator(Object anArray[]) {
    array = anArray;
  }

  public boolean hasNext() {
    try {
        return pos < array.length;
    } catch (NullPointerException npe) {
        return false;
    }
  }

  public Object next() throws NoSuchElementException {
    if (hasNext())
      return array[pos++];
    else
      throw new NoSuchElementException();
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}


