package bm2;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import cr2.AbstractC11089e;
import d41.AbstractC11679e;
import f90.AbstractC14281b;
import is0.AbstractC20903q0;
import j11.AbstractC21202e;
import n31.AbstractC26217b;
import o11.AbstractC27401g;
import p51.AbstractC28855c;
import p730qt2.AbstractC30613s;
import p734sl0.AbstractC32616h1;
import pj2.AbstractC29310i;
import pj2.AbstractC29318q;
import qn0.AbstractC30514i;
import r81.AbstractC31066b;
import wo1.AbstractC37457k0;
import z51.AbstractC40097h;
import z71.AbstractC40153l;

/* JADX INFO: renamed from: bm2.b1 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3428b1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13417w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f13418x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f13419y;

    public /* synthetic */ C3428b1(TextResource textResource, int i13, int i14) {
        this.f13417w = i14;
        this.f13418x = textResource;
        this.f13419y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f13417w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3431c1.m9901c(this.f13418x, this.f13419y, composer, iIntValue);
            case 1:
                return AbstractC11089e.m29934i(this.f13418x, this.f13419y, composer, iIntValue);
            case 2:
                return AbstractC11679e.m31130w(this.f13418x, this.f13419y, composer, iIntValue);
            case 3:
                return AbstractC14281b.m40773e(this.f13418x, this.f13419y, composer, iIntValue);
            case 4:
                return AbstractC20903q0.m57884i(this.f13418x, this.f13419y, composer, iIntValue);
            case 5:
                return AbstractC21202e.m59450g(this.f13418x, this.f13419y, composer, iIntValue);
            case 6:
                return AbstractC26217b.m77857z(this.f13418x, this.f13419y, composer, iIntValue);
            case 7:
                return AbstractC27401g.m82559B(this.f13418x, this.f13419y, composer, iIntValue);
            case 8:
                return AbstractC28855c.m87771h(this.f13418x, this.f13419y, composer, iIntValue);
            case 9:
                return AbstractC29310i.m89012W(this.f13418x, this.f13419y, composer, iIntValue);
            case 10:
                return AbstractC29318q.m89119O0(this.f13418x, this.f13419y, composer, iIntValue);
            case 11:
                return AbstractC29318q.m89126V(this.f13418x, this.f13419y, composer, iIntValue);
            case 12:
                return AbstractC30514i.m93463c(this.f13418x, this.f13419y, composer, iIntValue);
            case 13:
                return AbstractC30613s.m93975u(this.f13418x, this.f13419y, composer, iIntValue);
            case 14:
                return AbstractC31066b.m95691i(this.f13418x, this.f13419y, composer, iIntValue);
            case 15:
                return AbstractC32616h1.m101808c(this.f13418x, this.f13419y, composer, iIntValue);
            case 16:
                return AbstractC37457k0.m119995h(this.f13418x, this.f13419y, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40097h.m128552B(this.f13418x, this.f13419y, composer, iIntValue);
            default:
                return AbstractC40153l.m128738C(this.f13418x, this.f13419y, composer, iIntValue);
        }
    }
}
