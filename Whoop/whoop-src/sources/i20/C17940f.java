package i20;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivity;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p026b2.C2314t;
import p114eb.C12991u0;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p708hb2.C17095c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C17940f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69719w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12991u0 f69720x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AddressElementActivity f69721y;

    public /* synthetic */ C17940f(C12991u0 c12991u0, AddressElementActivity addressElementActivity, int i13) {
        this.f69719w = i13;
        this.f69720x = c12991u0;
        this.f69721y = addressElementActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        AddressElementActivity addressElementActivity;
        boolean zM87157i;
        Object objM87133R;
        switch (this.f69719w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(1051396892);
                        addressElementActivity = this.f69721y;
                        zM87157i = c28655q.m87157i(addressElementActivity);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == C28635l.f115821a) {
                            objM87133R = new C17095c(addressElementActivity, 5);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        AbstractC17269i.m48886d(this.f69720x, "InputAddress", null, null, null, null, null, null, null, (Function1) objM87133R, c28655q, 0, 1020);
                    }
                } else {
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(1051396892);
                    addressElementActivity = this.f69721y;
                    zM87157i = c28655q.m87157i(addressElementActivity);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C17095c(addressElementActivity, 5);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C17095c(addressElementActivity, 5);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC17269i.m48886d(this.f69720x, "InputAddress", null, null, null, null, null, null, null, (Function1) objM87133R, c28655q, 0, 1020);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, 0L, 0L, null, 0.0f, AbstractC37817c.m121344e(754384291, composer2, new C17940f(this.f69720x, this.f69721y, 0)), composer2, 1572870, 62);
                    }
                } else {
                    AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, 0L, 0L, null, 0.0f, AbstractC37817c.m121344e(754384291, composer2, new C17940f(this.f69720x, this.f69721y, 0)), composer2, 1572870, 62);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
