package f70;

import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.navigation.AfterActivationFinalScreensScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import java.util.Map;
import m83.C25272z;
import n70.AbstractC26417d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: f70.v */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/e;", "", "a", "(Lcom/whoop/navigation/e;)Ljava/lang/String;", "Lf70/t$a;", "Ln70/d$a;", "b", "(Lf70/t$a;)Ln70/d$a;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14210v {
    /* JADX INFO: renamed from: a */
    public static final String m40610a(C9598e c9598e) {
        AbstractC22676k.m65750j(c9598e, "<this>");
        NavigationScreenModel parameters = c9598e.getParameters();
        AfterActivationFinalScreensScreenModel afterActivationFinalScreensScreenModel = parameters instanceof AfterActivationFinalScreensScreenModel ? (AfterActivationFinalScreensScreenModel) parameters : null;
        if (afterActivationFinalScreensScreenModel != null) {
            return afterActivationFinalScreensScreenModel.getSource();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC26417d.a m40611b(AbstractC14206t.a aVar) {
        AbstractC22676k.m65750j(aVar, "<this>");
        ActivationFlowDestination destination = aVar.getDestination();
        String source = aVar.getSource();
        Map mapM95645u = source != null ? AbstractC31061c.m95645u("source", source) : null;
        if (mapM95645u == null) {
            mapM95645u = C25272z.f99163w;
        }
        return new AbstractC26417d.a(destination, mapM95645u);
    }
}
