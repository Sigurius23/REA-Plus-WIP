package p032bc;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p031b9.AbstractC2875y;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: bc.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2946e0 {

    /* JADX INFO: renamed from: b */
    public final View f11844b;

    /* JADX INFO: renamed from: a */
    public final HashMap f11843a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f11845c = new ArrayList();

    public C2946e0(View view) {
        this.f11844b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2946e0)) {
            return false;
        }
        C2946e0 c2946e0 = (C2946e0) obj;
        return this.f11844b == c2946e0.f11844b && this.f11843a.equals(c2946e0.f11843a);
    }

    public final int hashCode() {
        return this.f11843a.hashCode() + (this.f11844b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM35484d = AbstractC12682p.m35484d("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM35484d.append(this.f11844b);
        sbM35484d.append("\n");
        String strM8299l = AbstractC2875y.m8299l(sbM35484d.toString(), "    values:");
        HashMap map = this.f11843a;
        for (String str : map.keySet()) {
            strM8299l = strM8299l + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM8299l;
    }
}
