package TextManipulationEngine


import org.apache.spark.mllib.clustering.LDA
import org.apache.spark.mllib.linalg.Vectors

class UnsupervisedModel(
  pd : PreparedData,
  nClust : Int
) extends Serializable {

}