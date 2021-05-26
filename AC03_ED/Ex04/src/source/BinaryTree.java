/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;
import exceptions.BoundaryViolationException;
import exceptions.InvalidPositionException;
import position.Position;

public interface BinaryTree<E> extends Tree<E> {
// Retorna o filho da esquerda do nodo.

    public Position<E> left(Position<E> v) throws InvalidPositionException, BoundaryViolationException;
// Retorna o filho da direita do nodo.

    public Position<E> right(Position<E> v) throws InvalidPositionException, BoundaryViolationException;
// Retorna se o nodo tem filho da esquerda.

    public boolean hasLeft(Position<E> v) throws InvalidPositionException;
// Retorna se o nodo tem filho da direita.

    public boolean hasRight(Position<E> v) throws InvalidPositionException;
}
