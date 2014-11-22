package storm.kafka;

import java.io.Serializable;

public interface CommitListener extends Serializable {

    void onCommit(PartitionManager manager);

}
