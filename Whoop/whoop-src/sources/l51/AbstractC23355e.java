package l51;

import androidx.compose.runtime.Composer;
import p027b3.AbstractC2453v1;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28593a1;
import p479s4.AbstractC32128i;
import p492t2.InterfaceC33313a;
import p636y3.C39185q;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: l51.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ln0/u;", "listState", "Ly3/f;", "collapsedBottomInsetDp", "Ll51/f;", "b", "(Ln0/u;FLandroidx/compose/runtime/Composer;II)Ll51/f;", "Lp1/a1;", "consumedOffsetPx", "", "maxConsumePx", "Lt2/a;", "a", "(Ln0/u;Lp1/a1;I)Lt2/a;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23355e {

    /* JADX INFO: renamed from: l51.e$a */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"l51/e$a", "Lt2/a;", "Lh2/b;", "available", "", "source", "l0", "(JI)J", "Ly3/q;", "p0", "(JLq83/d;)Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC33313a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C26068u f92572w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f92573x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28593a1 f92574y;

        public a(C26068u c26068u, int i13, InterfaceC28593a1 interfaceC28593a1) {
            this.f92572w = c26068u;
            this.f92573x = i13;
            this.f92574y = interfaceC28593a1;
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: J */
        public /* bridge */ long mo9761J(long j7, long j13, int i13) {
            return 0L;
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: V */
        public Object mo9762V(long j7, long j13, InterfaceC30057d<? super C39185q> interfaceC30057d) {
            return new C39185q(0L);
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: l0 */
        public long mo29341l0(long available, int source) {
            int i13;
            long jFloatToRawIntBits;
            int iFloatToRawIntBits;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (available & 4294967295L));
            boolean zMo39182c = this.f92572w.mo39182c();
            if (fIntBitsToFloat >= 0.0f) {
                if (fIntBitsToFloat > 0.0f && !zMo39182c && ((C28621h1) this.f92574y).m87024x() > 0) {
                    int iMin = Math.min((int) fIntBitsToFloat, ((C28621h1) this.f92574y).m87024x());
                    i13 = iMin >= 0 ? iMin : 0;
                    if (i13 > 0) {
                        C28621h1 c28621h1 = (C28621h1) this.f92574y;
                        c28621h1.m87025y(c28621h1.m87024x() - i13);
                        jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                        iFloatToRawIntBits = Float.floatToRawIntBits(i13);
                    }
                }
                return 0L;
            }
            int iMin2 = Math.min((int) (-fIntBitsToFloat), this.f92573x - ((C28621h1) this.f92574y).m87024x());
            i13 = iMin2 >= 0 ? iMin2 : 0;
            if (i13 <= 0) {
                return 0L;
            }
            C28621h1 c28621h2 = (C28621h1) this.f92574y;
            c28621h2.m87025y(c28621h2.m87024x() + i13);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(-i13);
            return (jFloatToRawIntBits << 32) | (4294967295L & ((long) iFloatToRawIntBits));
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: p0 */
        public Object mo29342p0(long j7, InterfaceC30057d<? super C39185q> interfaceC30057d) {
            long jM100047a;
            boolean zMo39182c = this.f92572w.mo39182c();
            if (C39185q.m124814e(j7) >= 0.0f || ((C28621h1) this.f92574y).m87024x() >= this.f92573x) {
                jM100047a = (C39185q.m124814e(j7) <= 0.0f || zMo39182c || ((C28621h1) this.f92574y).m87024x() <= 0) ? 0L : AbstractC32128i.m100047a(0.0f, C39185q.m124814e(j7));
            } else {
                jM100047a = AbstractC32128i.m100047a(0.0f, C39185q.m124814e(j7));
            }
            return new C39185q(jM100047a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC33313a m67619a(C26068u listState, InterfaceC28593a1 consumedOffsetPx, int i13) {
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(consumedOffsetPx, "consumedOffsetPx");
        return new a(listState, i13, consumedOffsetPx);
    }

    /* JADX INFO: renamed from: b */
    public static final C23356f m67620b(C26068u c26068u, float f13, Composer composer, int i13, int i14) {
        if ((i14 & 1) != 0) {
            c26068u = AbstractC26071x.m77569a(0, 0, composer, 3);
        }
        if ((i14 & 2) != 0) {
            f13 = 0;
        }
        C28655q c28655q = (C28655q) composer;
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        C23357g.Companion companion = C23357g.INSTANCE;
        int iMo724F = interfaceC39171c.mo724F(companion.m67644b()) - interfaceC39171c.mo724F(companion.m67643a() + f13);
        if (iMo724F < 1) {
            iMo724F = 1;
        }
        boolean zM87149e = c28655q.m87149e(iMo724F);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87149e || objM87133R == c28676v0) {
            objM87133R = AbstractC31061c.m95646v(0, c28655q);
        }
        InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
        int i15 = (i13 & 14) ^ 6;
        boolean zM87149e2 = ((i15 > 4 && c28655q.m87153g(c26068u)) || (i13 & 6) == 4) | c28655q.m87149e(iMo724F);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87149e2 || objM87133R2 == c28676v0) {
            objM87133R2 = m67619a(c26068u, interfaceC28593a1, iMo724F);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC33313a interfaceC33313a = (InterfaceC33313a) objM87133R2;
        boolean zM87153g = c28655q.m87153g(interfaceC33313a) | ((i15 > 4 && c28655q.m87153g(c26068u)) || (i13 & 6) == 4) | c28655q.m87153g(interfaceC28593a1) | c28655q.m87149e(iMo724F);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g || objM87133R3 == c28676v0) {
            objM87133R3 = new C23356f(c26068u, interfaceC33313a, interfaceC28593a1, iMo724F);
            c28655q.m87172p0(objM87133R3);
        }
        return (C23356f) objM87133R3;
    }
}
