package p355o2;

import android.graphics.Bitmap;
import io.sentry.android.core.internal.util.C20106g;
import p181h2.C16620e;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17921y;
import p208i2.C17873c;
import p208i2.C17885g;
import p208i2.C17903p;
import p208i2.C17919x;
import p208i2.InterfaceC17915v;
import p270k2.C22127a;
import p270k2.C22128b;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p603x2.AbstractC37831a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: o2.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C27429d0 extends AbstractC27425b0 {

    /* JADX INFO: renamed from: b */
    public final C27424b f110524b;

    /* JADX INFO: renamed from: c */
    public String f110525c;

    /* JADX INFO: renamed from: d */
    public boolean f110526d;

    /* JADX INFO: renamed from: e */
    public final C20106g f110527e;

    /* JADX INFO: renamed from: f */
    public AbstractC22680m f110528f;

    /* JADX INFO: renamed from: g */
    public final C28633k1 f110529g;

    /* JADX INFO: renamed from: h */
    public C17903p f110530h;

    /* JADX INFO: renamed from: i */
    public final C28633k1 f110531i;

    /* JADX INFO: renamed from: j */
    public long f110532j;

    /* JADX INFO: renamed from: k */
    public float f110533k;

    /* JADX INFO: renamed from: l */
    public float f110534l;

    /* JADX INFO: renamed from: m */
    public final C27427c0 f110535m;

    public C27429d0(C27424b c27424b) {
        this.f110524b = c27424b;
        c27424b.f110489i = new C27427c0(this, 0);
        this.f110525c = "";
        this.f110526d = true;
        this.f110527e = new C20106g();
        this.f110528f = C27432f.f110559y;
        this.f110529g = AbstractC28683x.m87272z(null);
        this.f110531i = AbstractC28683x.m87272z(new C16620e(0L));
        this.f110532j = 9205357640488583168L;
        this.f110533k = 1.0f;
        this.f110534l = 1.0f;
        this.f110535m = new C27427c0(this, 1);
    }

    @Override // p355o2.AbstractC27425b0
    /* JADX INFO: renamed from: a */
    public final void mo82851a(InterfaceC22131e interfaceC22131e) {
        m82860e(interfaceC22131e, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0116  */
    /* JADX INFO: renamed from: e */
    public final void m82860e(InterfaceC22131e interfaceC22131e, float f13, AbstractC17921y abstractC17921y) {
        int i13;
        C17903p c17903p;
        C17885g c17885gM51520h;
        char c3;
        long j7;
        long jM51541c;
        int i14;
        int i15;
        AbstractC17921y abstractC17921y2 = abstractC17921y;
        C27424b c27424b = this.f110524b;
        boolean z4 = c27424b.f110484d;
        C28633k1 c28633k1 = this.f110529g;
        if (!z4 || c27424b.f110485e == 16) {
            i13 = 0;
        } else {
            AbstractC17921y abstractC17921y3 = (AbstractC17921y) c28633k1.getValue();
            int i16 = AbstractC27433f0.f110561a;
            if (!(abstractC17921y3 instanceof C17903p) ? abstractC17921y3 == null : (i15 = ((C17903p) abstractC17921y3).f69605c) == 5 || i15 == 3) {
                i13 = 0;
            } else if (!(abstractC17921y2 instanceof C17903p) ? abstractC17921y2 == null : (i14 = ((C17903p) abstractC17921y2).f69605c) == 5 || i14 == 3) {
                i13 = 0;
            } else {
                i13 = 1;
            }
        }
        boolean z13 = this.f110526d;
        C20106g c20106g = this.f110527e;
        if (z13 || !C16620e.m47210b(this.f110532j, interfaceC22131e.mo731d())) {
            if (i13 == 1) {
                jM51541c = c27424b.f110485e;
                int i17 = AbstractC27433f0.f110561a;
                if (C17919x.m51543e(jM51541c) != 1.0f) {
                    jM51541c = C17919x.m51541c(1.0f, jM51541c);
                }
                c17903p = new C17903p(jM51541c, 5);
            } else {
                c17903p = null;
            }
            this.f110530h = c17903p;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32));
            C28633k1 c28633k2 = this.f110531i;
            this.f110533k = fIntBitsToFloat / Float.intBitsToFloat((int) (((C16620e) c28633k2.getValue()).f63951a >> 32));
            this.f110534l = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) / Float.intBitsToFloat((int) (((C16620e) c28633k2.getValue()).f63951a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L))))) & 4294967295L);
            EnumC39181m layoutDirection = interfaceC22131e.getLayoutDirection();
            c17885gM51520h = (C17885g) c20106g.f75535c;
            C17873c c17873cM51513a = (C17873c) c20106g.f75536d;
            if (c17885gM51520h != null || c17873cM51513a == null) {
                c3 = ' ';
                j7 = 4294967295L;
            } else {
                int i18 = (int) (jCeil >> 32);
                Bitmap bitmap = c17885gM51520h.f69577a;
                c3 = ' ';
                j7 = 4294967295L;
                if (i18 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || c20106g.f75534b != i13) {
                }
                c20106g.f75533a = jCeil;
                C22128b c22128b = (C22128b) c20106g.f75537e;
                long jM113239l = AbstractC35744b.m113239l(jCeil);
                C22127a c22127a = c22128b.f85851w;
                InterfaceC39171c interfaceC39171c = c22127a.f85847a;
                EnumC39181m enumC39181m = c22127a.f85848b;
                InterfaceC17915v interfaceC17915v = c22127a.f85849c;
                C17873c c17873c = c17873cM51513a;
                long j13 = c22127a.f85850d;
                c22127a.f85847a = interfaceC22131e;
                c22127a.f85848b = layoutDirection;
                c22127a.f85849c = c17873c;
                c22127a.f85850d = jM113239l;
                c17873c.mo51426q();
                InterfaceC22131e.m63383i0(c22128b, C17919x.f69625b, 0L, 0L, 0.0f, null, 0, 62);
                this.f110535m.invoke(c22128b);
                c17873c.mo51417g();
                C22127a c22127a2 = c22128b.f85851w;
                c22127a2.f85847a = interfaceC39171c;
                c22127a2.f85848b = enumC39181m;
                c22127a2.f85849c = interfaceC17915v;
                c22127a2.f85850d = j13;
                c17885gM51520h.f69577a.prepareToDraw();
                this.f110526d = false;
                this.f110532j = interfaceC22131e.mo731d();
            }
            c17885gM51520h = AbstractC17918w0.m51520h((int) (jCeil >> c3), (int) (jCeil & j7), i13);
            c17873cM51513a = AbstractC17918w0.m51513a(c17885gM51520h);
            c20106g.f75535c = c17885gM51520h;
            c20106g.f75536d = c17873cM51513a;
            c20106g.f75534b = i13;
            c20106g.f75533a = jCeil;
            C22128b c22128b2 = (C22128b) c20106g.f75537e;
            long jM113239l2 = AbstractC35744b.m113239l(jCeil);
            C22127a c22127a3 = c22128b2.f85851w;
            InterfaceC39171c interfaceC39171c2 = c22127a3.f85847a;
            EnumC39181m enumC39181m2 = c22127a3.f85848b;
            InterfaceC17915v interfaceC17915v2 = c22127a3.f85849c;
            C17873c c17873c2 = c17873cM51513a;
            long j14 = c22127a3.f85850d;
            c22127a3.f85847a = interfaceC22131e;
            c22127a3.f85848b = layoutDirection;
            c22127a3.f85849c = c17873c2;
            c22127a3.f85850d = jM113239l2;
            c17873c2.mo51426q();
            InterfaceC22131e.m63383i0(c22128b2, C17919x.f69625b, 0L, 0L, 0.0f, null, 0, 62);
            this.f110535m.invoke(c22128b2);
            c17873c2.mo51417g();
            C22127a c22127a4 = c22128b2.f85851w;
            c22127a4.f85847a = interfaceC39171c2;
            c22127a4.f85848b = enumC39181m2;
            c22127a4.f85849c = interfaceC17915v2;
            c22127a4.f85850d = j14;
            c17885gM51520h.f69577a.prepareToDraw();
            this.f110526d = false;
            this.f110532j = interfaceC22131e.mo731d();
        } else {
            C17885g c17885g = (C17885g) c20106g.f75535c;
            if (i13 != (c17885g != null ? c17885g.m51442a() : 0)) {
                if (i13 == 1) {
                    jM51541c = c27424b.f110485e;
                    int i19 = AbstractC27433f0.f110561a;
                    if (C17919x.m51543e(jM51541c) != 1.0f) {
                        jM51541c = C17919x.m51541c(1.0f, jM51541c);
                    }
                    c17903p = new C17903p(jM51541c, 5);
                } else {
                    c17903p = null;
                }
                this.f110530h = c17903p;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32));
                C28633k1 c28633k3 = this.f110531i;
                this.f110533k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((C16620e) c28633k3.getValue()).f63951a >> 32));
                this.f110534l = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) / Float.intBitsToFloat((int) (((C16620e) c28633k3.getValue()).f63951a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L))))) & 4294967295L);
                EnumC39181m layoutDirection2 = interfaceC22131e.getLayoutDirection();
                c17885gM51520h = (C17885g) c20106g.f75535c;
                C17873c c17873cM51513a2 = (C17873c) c20106g.f75536d;
                if (c17885gM51520h != null) {
                    c3 = ' ';
                    j7 = 4294967295L;
                    c17885gM51520h = AbstractC17918w0.m51520h((int) (jCeil2 >> c3), (int) (jCeil2 & j7), i13);
                    c17873cM51513a2 = AbstractC17918w0.m51513a(c17885gM51520h);
                    c20106g.f75535c = c17885gM51520h;
                    c20106g.f75536d = c17873cM51513a2;
                    c20106g.f75534b = i13;
                } else {
                    c3 = ' ';
                    j7 = 4294967295L;
                    c17885gM51520h = AbstractC17918w0.m51520h((int) (jCeil2 >> c3), (int) (jCeil2 & j7), i13);
                    c17873cM51513a2 = AbstractC17918w0.m51513a(c17885gM51520h);
                    c20106g.f75535c = c17885gM51520h;
                    c20106g.f75536d = c17873cM51513a2;
                    c20106g.f75534b = i13;
                }
                c20106g.f75533a = jCeil2;
                C22128b c22128b3 = (C22128b) c20106g.f75537e;
                long jM113239l3 = AbstractC35744b.m113239l(jCeil2);
                C22127a c22127a5 = c22128b3.f85851w;
                InterfaceC39171c interfaceC39171c3 = c22127a5.f85847a;
                EnumC39181m enumC39181m3 = c22127a5.f85848b;
                InterfaceC17915v interfaceC17915v3 = c22127a5.f85849c;
                C17873c c17873c3 = c17873cM51513a2;
                long j15 = c22127a5.f85850d;
                c22127a5.f85847a = interfaceC22131e;
                c22127a5.f85848b = layoutDirection2;
                c22127a5.f85849c = c17873c3;
                c22127a5.f85850d = jM113239l3;
                c17873c3.mo51426q();
                InterfaceC22131e.m63383i0(c22128b3, C17919x.f69625b, 0L, 0L, 0.0f, null, 0, 62);
                this.f110535m.invoke(c22128b3);
                c17873c3.mo51417g();
                C22127a c22127a6 = c22128b3.f85851w;
                c22127a6.f85847a = interfaceC39171c3;
                c22127a6.f85848b = enumC39181m3;
                c22127a6.f85849c = interfaceC17915v3;
                c22127a6.f85850d = j15;
                c17885gM51520h.f69577a.prepareToDraw();
                this.f110526d = false;
                this.f110532j = interfaceC22131e.mo731d();
            }
        }
        if (abstractC17921y2 == null) {
            abstractC17921y2 = ((AbstractC17921y) c28633k1.getValue()) != null ? (AbstractC17921y) c28633k1.getValue() : this.f110530h;
        }
        AbstractC17921y abstractC17921y4 = abstractC17921y2;
        C17885g c17885g2 = (C17885g) c20106g.f75535c;
        if (c17885g2 == null) {
            AbstractC37831a.m121374b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC22131e.m63377K0(interfaceC22131e, c17885g2, c20106g.f75533a, 0L, f13, abstractC17921y4, 0, 858);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Params: \tname: ");
        sb4.append(this.f110525c);
        sb4.append("\n\tviewportWidth: ");
        C28633k1 c28633k1 = this.f110531i;
        sb4.append(Float.intBitsToFloat((int) (((C16620e) c28633k1.getValue()).f63951a >> 32)));
        sb4.append("\n\tviewportHeight: ");
        sb4.append(Float.intBitsToFloat((int) (((C16620e) c28633k1.getValue()).f63951a & 4294967295L)));
        sb4.append("\n");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
