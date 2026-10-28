package p114eb;

import androidx.fragment.app.C1345s1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1579e2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12942b0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: x */
    public static final C1345s1 f44709x = new C1345s1(1);

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f44710w = new LinkedHashMap();

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f44710w;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C1579e2) it.next()).m4975a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("NavControllerViewModel{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append("} ViewModelStores (");
        Iterator it = this.f44710w.keySet().iterator();
        while (it.hasNext()) {
            sb4.append((String) it.next());
            if (it.hasNext()) {
                sb4.append(", ");
            }
        }
        sb4.append(')');
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }
}
