import com.amazingfish.beans.KuduColumn;
import com.amazingfish.kuduApi.KuduAgent;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import org.apache.kudu.client.KuduClient;
import org.apache.kudu.client.KuduException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    @org.junit.Test
    public void TestKudu() throws KuduException {
        KuduClient kuduClient = new KuduClient.KuduClientBuilder("10.122.44.118,7051,10.122.44.119,7051,10.122.44.120,7051").build();

        KuduAgent kuduAgent = new KuduAgent();
        kuduAgent.setClient(kuduClient);
        kuduAgent.detailOpen("sa_mos-pms-mysql-product_tm_product");

        ArrayList<KuduColumn> kuduColumns = new ArrayList<>();

        List<Map<String, Object>> list = kuduAgent.select("sa_mos-pms-mysql-product_tm_product", kuduClient, kuduColumns);
        if (!list.isEmpty()){

        }
        else {
            System.out.println("This is a empty kudu table~");
        }

    }
}
