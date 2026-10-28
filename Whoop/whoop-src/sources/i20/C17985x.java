package i20;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivity;
import g40.C15383l0;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p026b2.C2314t;
import p088dc.AbstractC11894a;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import y30.C39189d;

/* JADX INFO: renamed from: i20.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C17985x implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69823w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AutocompleteActivity f69824x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC17929b0 f69825y;

    public /* synthetic */ C17985x(AutocompleteActivity autocompleteActivity, InterfaceC17929b0 interfaceC17929b0, int i13) {
        this.f69823w = i13;
        this.f69824x = autocompleteActivity;
        this.f69825y = interfaceC17929b0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69823w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC17960l1.m51575b((C17982v0) this.f69824x.f22380x.getValue(), this.f69825y, C39189d.m124826e(AbstractC11894a.m31939G(composer), new C15383l0(0)), composer, 3072);
                    }
                } else {
                    AbstractC17960l1.m51575b((C17982v0) this.f69824x.f22380x.getValue(), this.f69825y, C39189d.m124826e(AbstractC11894a.m31939G(composer), new C15383l0(0)), composer, 3072);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, 0L, 0L, null, 0.0f, AbstractC37817c.m121344e(1374566682, composer2, new C17985x(this.f69824x, this.f69825y, 0)), composer2, 1572870, 62);
                    }
                } else {
                    AbstractC17269i.m48898k(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, 0L, 0L, null, 0.0f, AbstractC37817c.m121344e(1374566682, composer2, new C17985x(this.f69824x, this.f69825y, 0)), composer2, 1572870, 62);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
