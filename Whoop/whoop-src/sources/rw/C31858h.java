package rw;

import java.util.Calendar;
import java.util.GregorianCalendar;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p384ow.EnumC28428x;
import p384ow.InterfaceC28405a0;
import p563vw.C36540a;

/* JADX INFO: renamed from: rw.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C31858h implements InterfaceC28405a0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132122w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f132123x;

    public /* synthetic */ C31858h(Object obj, int i13) {
        this.f132122w = i13;
        this.f132123x = obj;
    }

    @Override // p384ow.InterfaceC28405a0
    /* JADX INFO: renamed from: a */
    public final AbstractC28430z mo86129a(C28417m c28417m, C36540a c36540a) {
        switch (this.f132122w) {
            case 0:
                if (c36540a.f156459a == Number.class) {
                    return (C31859i) this.f132123x;
                }
                return null;
            case 1:
                if (c36540a.f156459a == Object.class) {
                    return new C31860j(c28417m, (EnumC28428x) this.f132123x);
                }
                return null;
            default:
                Class cls = c36540a.f156459a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C31857g) this.f132123x;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f132122w) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C31857g) this.f132123x) + "]";
            default:
                return super.toString();
        }
    }
}
