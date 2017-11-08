package neuralNetworkTrainer;

import java.util.ArrayList;

/**
 * A parent class for all data classes
 */
public abstract class Data {

    /**
     * The data points
     */
    protected ArrayList<ArrayList<Object>> dataPoints;

    /**
     * Number of inputs/attributes of the data
     */
    protected int numInputs;

    /**
     * Number of outputs of the data
     */
    protected int numOutputs;

    /**
     * Gets the data points for this data set
     * @return the data points for this set of data
     */
    public ArrayList<ArrayList<Object>> getDataPoints() {
        return dataPoints;
    }

    /**
     * Gets the number of inputs for this data set
     * @return the number of inputs for this data set
     */
    public int getNumInputs() {
        return numInputs;
    }

    /**
     * Gets the number of outputs for this data set
     * @return the number of outputs for this data set
     */
    public int getNumOutputs() {
        return numOutputs;
    }


    /**
     * Gets a subset of the data used for evaluation
     * @param size size of eval network, if 0 it defaults to 10% the size of the whole dataset
     * @return data to be used in fitness evaluation
     */
    public ArrayList<ArrayList<Object>> getEvalDataSet(int size){
        ArrayList<ArrayList<Object>> evalSet = new ArrayList<>();
        if (size == 0){
            size = dataPoints.size() / 10;
        }
        for (int dataIter = 0; dataIter < size; dataIter++) {
            evalSet.add(dataPoints.get((int) (Math.random() * size)));
        }
        return evalSet;

    }
}
