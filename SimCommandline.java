public class SimCommandline {
    public simFilter predict = new simFilter();
    public fileReader dictM = new fileReader();
    public simPredict predictreal = new simPredict();

    public void run() {
        dictM.insertFromFileFull();
        predict.checkAll(dictM.Sample.SimList);
        dictM.insertFromFile();
        predict.checkAll(dictM.Test.SimList);
        predictreal.ganPrice(dictM.Test.SimList, dictM.Sample.SimList);
        dictM.exportToFile(dictM.Test.SimList);
    }
}