package com.example;

import org.junit.Test;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maksymilian Podraza
 */
public class TicTacToeTest {

    @Test
    public void simpleNoWinnerBoard() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O...X.X.."));
    }

    @Test
    public void allXImpossibleCase() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard( "XXXXXXXXX"));
    }

    @Test
    public void allOImpossibleCase() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("OOOOOOOOO"));
    }

    @Test
    public void noWinnerAllFields() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("XOXXXOOXO"));
    }

    @Test
    public void xWinsInterchangedMaxFields() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XOXOXOXOX"));
    }

    @Test
    public void OWinnerDiagonal() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("OXOXOXOX."));
    }

    @Test
    public void unreachableStateBoard2o() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("OO..X.X.."));
    }


    @Test
    public void unreachableBoardTooManyO() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("O..OX.X.O"));
    }

    @Test
    public void simpleNoWinnerBoard6() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O..OX.X.X"));
    }

    @Test
    public void unreachableStateBoard3o() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("OO.OX.X.."));
    }

    @Test
    public void simpleNoWinnerBoard8() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O...X.X.."));
    }

    @Test
    public void xWinsDiagonal() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("O.XOX.X.."));
    }

    @Test
    public void simpleNoWinnerBoard10() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O..OXXX.."));
    }

    @Test
    public void simpleNoWinnerBoard11() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O..OX.XX."));
    }

    @Test
    public void simpleNoWinnerBoard12() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O..OX.X.X"));
    }

    @Test
    public void simpleNoWinnerBoard13() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O.XOX..X."));
    }

    @Test
    public void unreachableState2o1x() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("O..OX...."));
    }

    @Test
    public void simpleNoWinnerBoard15() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("........."));
    }

    @Test
    public void simpleUnreachableStateBoard() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("O........"));
    }


    @Test
    public void mixedXWinCase1() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XxXOo...."));
    }

    @Test
    public void mixedXWinCase2() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("xXxoO...."));
    }

    @Test
    public void mixedOWinCase1() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("OoOxX...X"));
    }

    @Test
    public void mixedOWinCase2() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("oOoXx..x."));
    }

    @Test
    public void mixedNoWinCase1() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("XoX......"));
    }

    @Test
    public void mixedNoWinCase2() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("xOx......"));
    }

    @Test
    public void mixedNoWinCase3() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("xOX......"));
    }

    @Test
    public void mixedNoWinCase4() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("XOx......"));
    }

    @Test
    public void mixedNoWinCase5() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("oXo.X...."));
    }

    @Test
    public void verticalXWinLeft() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XO.XO.X.."));
    }

    @Test
    public void verticalXWinMiddle() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("OXOXX.OX."));
    }

    @Test
    public void verticalXWinRight() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("OOX.OXX.X"));
    }

    @Test
    public void verticalOWinLeft() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("O.XOXXO.."));
    }

    @Test
    public void verticalOWinMiddle() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("XOX.OX.O."));
    }

    @Test
    public void verticalOWinRight() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("X.O.XO.XO"));
    }

    @Test
    public void horizontalXWinTop() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XXXO.O.XO"));
    }

    @Test
    public void horizontalXWinMiddle() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XO.XXX.OO"));
    }

    @Test
    public void horizontalXWinBottom() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("OO....XXX"));
    }

    @Test
    public void horizontalOWinTop() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("OOOX..XX."));
    }

    @Test
    public void horizontalOWinMiddle() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard(".X.OOOXX."));
    }

    @Test
    public void horizontalOWinBottom() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("XX..X.OOO"));
    }

    @Test
    public void spaceNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("         "));
    }

    @Test
    public void newLineNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("\n\n\n\n\n\n\n\n\n"));
    }

    @Test
    public void ampersandNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("@@@@@@@@@"));
    }

    @Test
    public void dashNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("---------"));
    }

    @Test
    public void zeroNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("000000000"));
    }

    @Test
    public void oneNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("111111111"));
    }

    @Test
    public void twoNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("222222222"));
    }

    @Test
    public void threeNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("333333333"));
    }

    @Test
    public void fourNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("444444444"));
    }

    @Test
    public void fiveNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("555555555"));
    }

    @Test
    public void sixNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("666666666"));
    }

    @Test
    public void sevenNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("777777777"));
    }

    @Test
    public void eightNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("888888888"));
    }

    @Test
    public void nineNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("999999999"));
    }

    @Test
    public void exclamationNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("!!!!!!!!!"));
    }

    @Test
    public void poundNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("#########"));
    }

    @Test
    public void dollarNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("$$$$$$$$$"));
    }

    @Test
    public void percentageNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("%%%%%%%%%"));
    }

    @Test
    public void uptickNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("^^^^^^^^^"));
    }

    @Test
    public void asteriskNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("*********"));
    }

    @Test
    public void backSlashNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("/////////"));
    }

    @Test
    public void underscoreSlashNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("_________"));
    }

    @Test
    public void parentheseOpenNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("((((((((("));
    }

    @Test
    public void parentheseCloseNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard(")))))))))"));
    }

    @Test
    public void plusNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("+++++++++"));
    }

    @Test
    public void equalSignNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("========="));
    }

    @Test
    public void tildaNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("~~~~~~~~~"));
    }

    @Test
    public void periodNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("........."));
    }

    @Test
    public void commaNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard(",,,,,,,,,"));
    }

    @Test
    public void braceOpenNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("{{{{{{{{{"));
    }

    @Test
    public void braceCloseNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("}}}}}}}}}"));
    }

    @Test
    public void squareOpenBracketNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("[[[[[[[[["));
    }

    @Test
    public void squareCloseBracketNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("]]]]]]]]]"));
    }

    @Test
    public void pipeNoWinner() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("|||||||||"));
    }

    @Test
    public void invalidInputTooManyFields() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("XXXXXXXXXX"));
    }

    @Test
    public void invalidInputTooFewFields() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard(""));
    }

    @Test
    public void diagonalXWinCase1() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XO.OXX.OX"));
    }

    @Test
    public void diagonalXWinCase2() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("OOX.X.X.."));
    }

    @Test
    public void diagonalOWin1() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("O..XOX.XO"));
    }

    @Test
    public void diagonalOWin2() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard(".XO.OXOX."));
    }

    @Test
    public void unreachableStateTooManyOMoves() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("OOOXX...."));
    }

    @Test
    public void invalidInputTooFewMoves() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("12345"));
    }

    @Test
    public void nullTest() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard(null));
    }

}
