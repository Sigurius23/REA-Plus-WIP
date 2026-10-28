package g40;

import java.util.ArrayList;
import p031b9.AbstractC2875y;
import p696zy.C41210b;

/* JADX INFO: renamed from: g40.o3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15401o3 extends AbstractC15416r3 {

    /* JADX INFO: renamed from: a */
    public final C41210b f57856a;

    /* JADX INFO: renamed from: b */
    public final boolean f57857b;

    /* JADX INFO: renamed from: c */
    public final C15396n3 f57858c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f57859d;

    public C15401o3(C41210b c41210b, boolean z4, C15396n3 c15396n3, ArrayList arrayList) {
        this.f57856a = c41210b;
        this.f57857b = z4;
        this.f57858c = c15396n3;
        this.f57859d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15401o3)) {
            return false;
        }
        C15401o3 c15401o3 = (C15401o3) obj;
        return this.f57856a.equals(c15401o3.f57856a) && this.f57857b == c15401o3.f57857b && this.f57858c.equals(c15401o3.f57858c) && this.f57859d.equals(c15401o3.f57859d);
    }

    public final int hashCode() {
        return this.f57859d.hashCode() + ((this.f57858c.hashCode() + AbstractC2875y.m8289b(this.f57856a.hashCode() * 31, 31, this.f57857b)) * 31);
    }

    public final String toString() {
        return "Dropdown(title=" + this.f57856a + ", hide=" + this.f57857b + ", currentItem=" + this.f57858c + ", items=" + this.f57859d + ")";
    }
}
