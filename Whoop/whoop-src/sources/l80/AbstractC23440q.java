package l80;

import android.net.Uri;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import ih0.AbstractC18489d0;
import java.util.Map;
import l60.C23374a;
import m83.AbstractC25265s;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l80.q */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "", "", "", "arguments", "b", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)Ljava/lang/String;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23440q {
    /* JADX INFO: renamed from: b */
    public static final String m68002b(ActivationFlowDestination activationFlowDestination, Map<String, ? extends Object> arguments) {
        AbstractC22676k.m65750j(activationFlowDestination, "<this>");
        AbstractC22676k.m65750j(arguments, "arguments");
        return arguments.isEmpty() ? activationFlowDestination.name() : AbstractC25265s.m74110N0(arguments.entrySet(), "&", AbstractC2875y.m8299l(activationFlowDestination.name(), "?"), null, new C23374a(23), 28);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m68003c(ActivationFlowDestination activationFlowDestination, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = C25272z.f99163w;
        }
        return m68002b(activationFlowDestination, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final CharSequence m68004d(Map.Entry entry) {
        AbstractC22676k.m65750j(entry, "<destruct>");
        return AbstractC18489d0.m53370k((String) entry.getKey(), "=", Uri.encode(entry.getValue().toString()));
    }
}
