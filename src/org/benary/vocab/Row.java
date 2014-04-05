/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.benary.vocab;

/**
 *
 * @author benaryorg
 */
class Row
{

    protected String de;
    protected String en;

    public Row(String de,String en)
    {
        this.de=de;
        this.en=en;
    }

    @Override
    public String toString()
    {
        return de+';'+en;
    }
}
