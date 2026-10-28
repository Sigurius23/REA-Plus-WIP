package p329n0;

import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import m83.C25271y;
import p180h0.EnumC16377d2;
import p389p0.C28539n0;
import p390p1.C28635l;
import p390p1.C28655q;
import p549vb.AbstractC35862g;
import p634y1.AbstractC39038k;
import p636y3.AbstractC39170b;
import q83.C30064k;

/* JADX INFO: renamed from: n0.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC26071x {

    /* JADX INFO: renamed from: a */
    public static final C26061n f103243a = new C26061n(null, 0, false, 0.0f, new C26070w(), 0.0f, false, AbstractC3006f0.m8708b(C30064k.f122676w), AbstractC35862g.m113838a(), AbstractC39170b.m124770b(0, 0, 15), C25271y.f99162w, 0, 0, 0, EnumC16377d2.f62971w, 0, 0);

    /* JADX INFO: renamed from: a */
    public static final C26068u m77569a(final int i13, final int i14, Composer composer, int i15) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        Object[] objArr = new Object[0];
        C28539n0 c28539n0 = C26068u.f103217x;
        boolean zM87149e = ((C28655q) composer).m87149e(i13) | ((C28655q) composer).m87149e(i14);
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (zM87149e || objM87133R == C28635l.f115821a) {
            objM87133R = new InterfaceC4339a() { // from class: n0.v
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return new C26068u(i13, i14);
                }
            };
            c28655q.m87172p0(objM87133R);
        }
        return (C26068u) AbstractC39038k.m124458d(objArr, c28539n0, (InterfaceC4339a) objM87133R, c28655q, 0);
    }
}
