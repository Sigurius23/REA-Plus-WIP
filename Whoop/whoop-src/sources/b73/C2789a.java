package b73;

import a73.AbstractC0529d;
import a73.C0530e;
import a73.EnumC0528c;
import android.text.style.StrikethroughSpan;
import b30.C2570m;
import c73.C4285a;
import c73.C4286b;
import c73.C4287c;
import c73.C4288d;
import c73.C4289e;
import c73.C4290f;
import c73.C4291g;
import c73.C4293i;
import p171g9.C15594k;
import p671z5.C40084b;
import z63.InterfaceC40133e;

/* JADX INFO: renamed from: b73.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2789a implements InterfaceC40133e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10952a;

    public /* synthetic */ C2789a(int i13) {
        this.f10952a = i13;
    }

    @Override // z63.InterfaceC40133e
    /* JADX INFO: renamed from: a */
    public final Object mo7932a(C2570m c2570m, C15594k c15594k) {
        switch (this.f10952a) {
            case 0:
                return new C4285a((C0530e) c2570m.f9987x, 0);
            case 1:
                return new C4287c((C0530e) c2570m.f9987x);
            case 2:
                return new C4288d((C0530e) c2570m.f9987x, 0);
            case 3:
                return new C4289e(0);
            case 4:
                return new C4290f((C0530e) c2570m.f9987x, ((Integer) AbstractC0529d.f1829d.m128674a(c15594k)).intValue());
            case 5:
                return new C4291g((C0530e) c2570m.f9987x, (String) AbstractC0529d.f1830e.m128674a(c15594k), (C40084b) c2570m.f9989z);
            case 6:
                if (EnumC0528c.f1823w == AbstractC0529d.f1826a.m128674a(c15594k)) {
                    return new C4286b((C0530e) c2570m.f9987x, ((Integer) AbstractC0529d.f1827b.m128674a(c15594k)).intValue());
                }
                return new C4293i((C0530e) c2570m.f9987x, String.valueOf(AbstractC0529d.f1828c.m128674a(c15594k)).concat(". "));
            case 7:
                return new C4289e(1);
            case 8:
                return new C4285a((C0530e) c2570m.f9987x, 1);
            default:
                return new StrikethroughSpan();
        }
    }
}
