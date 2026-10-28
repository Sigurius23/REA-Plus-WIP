package x30;

import ad3.AbstractC0757c;
import ad3.C0775r;
import android.util.Log;
import com.stripe.android.p056ui.core.elements.SharedDataSpec;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p599wz.C37722h1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.d1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37882d1 {

    /* JADX INFO: renamed from: a */
    public static final C0775r f162204a = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C37722h1(18));

    /* JADX INFO: renamed from: a */
    public static Object m121447a(String str) {
        Object objM107888l;
        AbstractC22676k.m65750j(str, "str");
        try {
            objM107888l = (List) f162204a.m1831b(new ArrayListSerializer(SharedDataSpec.Companion.serializer()), str);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            Log.w("STRIPE", "Error parsing LPMs", thM68037a);
        }
        return objM107888l;
    }
}
