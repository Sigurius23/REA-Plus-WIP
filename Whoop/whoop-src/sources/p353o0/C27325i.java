package p353o0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.settings.journalv2.AbstractC10114e;
import java.util.List;
import l83.C23454a0;
import o72.AbstractC27647h;
import ox0.AbstractC28449c;
import p389p0.InterfaceC28509b0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import pj2.AbstractC29310i;
import pj2.AbstractC29321t;
import pp1.AbstractC29436i;
import qm1.AbstractC30483e;
import r90.AbstractC31099f;
import rm1.AbstractC31595i;
import s80.AbstractC32255c;
import sg2.AbstractC32471v;
import te1.AbstractC33751b;
import uz1.AbstractC35430h;

/* JADX INFO: renamed from: o0.i */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C27325i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f109402w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f109403x;

    public /* synthetic */ C27325i(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f109402w = i13;
        this.f109403x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f109402w) {
            case 0:
                return new C27323g((Function1) this.f109403x.getValue());
            case 1:
                return AbstractC27647h.m83494E(this.f109403x);
            case 2:
                return AbstractC28449c.m86230m(this.f109403x);
            case 3:
                return (InterfaceC28509b0) ((InterfaceC4339a) this.f109403x.getValue()).invoke();
            case 4:
                this.f109403x.setValue(Boolean.TRUE);
                return C23454a0.f92919a;
            case 5:
                return AbstractC29310i.m89073v0(this.f109403x);
            case 6:
                return AbstractC29310i.m89075w0(this.f109403x);
            case 7:
                return AbstractC29310i.m89077x0(this.f109403x);
            case 8:
                return AbstractC29310i.m89053l0(this.f109403x);
            case 9:
                return AbstractC29310i.m89069t0(this.f109403x);
            case 10:
                return AbstractC29321t.m89196G(this.f109403x);
            case 11:
                return AbstractC29321t.m89197H(this.f109403x);
            case 12:
                return AbstractC29321t.m89200K(this.f109403x);
            case 13:
                return AbstractC29436i.m89741Q0(this.f109403x);
            case 14:
                return AbstractC29436i.m89743R0(this.f109403x);
            case 15:
                return AbstractC29436i.m89725I0(this.f109403x);
            case 16:
                return AbstractC29436i.m89798u0(this.f109403x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC30483e.m93343z(this.f109403x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC31099f.m95793p(this.f109403x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC31595i.m97475x(this.f109403x);
            case 20:
                return AbstractC32255c.m100367o(this.f109403x);
            case 21:
                return AbstractC32471v.m101458z(this.f109403x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.f109403x.setValue(Boolean.TRUE);
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f109403x.setValue(Boolean.FALSE);
                return C23454a0.f92919a;
            case 24:
                return AbstractC33751b.m106713n(this.f109403x);
            case 25:
                return AbstractC33751b.m106714o(this.f109403x);
            case 26:
                InterfaceC28601c1 interfaceC28601c1 = this.f109403x;
                if (interfaceC28601c1 != null) {
                    return (List) interfaceC28601c1.getValue();
                }
                return null;
            case 27:
                Boolean bool = (Boolean) this.f109403x.getValue();
                bool.booleanValue();
                return bool;
            case 28:
                return AbstractC10114e.m25474x(this.f109403x);
            default:
                return AbstractC35430h.m112456x(this.f109403x);
        }
    }
}
