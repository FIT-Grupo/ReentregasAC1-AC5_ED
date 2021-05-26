/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;
// Retorna uma exceção quando se tenta criar uma raíz
// de uma árvore que não está vazia.

@SuppressWarnings("serial")
public class NonEmptyTreeException extends RuntimeException {

    public NonEmptyTreeException(String err) {
        super(err);
    }
}
