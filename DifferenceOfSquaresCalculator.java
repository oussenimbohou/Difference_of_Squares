class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        Double sum = 0.0;
        while(input > 0){
            sum += input;
            input--;
        }
        return (int)Math.round(sum*sum);
    }

    int computeSumOfSquaresTo(int input) {
       Double sum = 0.0;
        while(input > 0){
            int squareNum = input*input;
            sum += squareNum;
            input--;
        }
        return  (int)Math.round(sum);
    }

    int computeDifferenceOfSquares(int input) {
        return  computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }

}
