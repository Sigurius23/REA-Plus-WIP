package p734sl0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import is0.C20898o;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: sl0.z0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "icon", "", "alpha", "", "hasFeedback", "Lkotlin/Function1;", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "Ll83/a0;", "onFeedbackClicked", "e", "(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32699z0 {

    /* JADX INFO: renamed from: sl0.z0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f135822w = new a();

        /* JADX INFO: renamed from: a */
        public final long m102611a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m102611a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: sl0.z0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f135823w = new b();

        /* JADX INFO: renamed from: a */
        public final long m102612a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m102612a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: sl0.z0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f135824w = new c();

        /* JADX INFO: renamed from: a */
        public final long m102613a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m102613a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0236  */
    /* JADX WARN: Code duplicated, block: B:118:0x026d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0271  */
    /* JADX WARN: Code duplicated, block: B:122:0x0284  */
    /* JADX WARN: Code duplicated, block: B:124:0x0292  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x02db  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:141:0x030b  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3 A[PHI: r1 r2 r18 r28
      0x00c3: PHI (r1v8 androidx.compose.ui.Modifier) = (r1v5 androidx.compose.ui.Modifier), (r1v3 androidx.compose.ui.Modifier) binds: [B:79:0x00e8, B:67:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r2v28 int) = (r2v15 int), (r2v29 int) binds: [B:79:0x00e8, B:67:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r18v2 int) = (r18v0 int), (r18v3 int) binds: [B:79:0x00e8, B:67:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r28v5 float) = (r28v0 float), (r28v6 float) binds: [B:79:0x00e8, B:67:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: e */
    public static final void m102606e(Modifier modifier, int i13, float f13, boolean z4, Function1 onFeedbackClicked, Composer composer, int i14, int i15) {
        Modifier modifier2;
        int i16;
        int i17;
        float f14;
        int i18;
        boolean z13;
        int i19;
        boolean z14;
        int i24;
        float f15;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i25;
        C2314t c2314t;
        int iM46357r;
        float f16;
        int i26;
        float f17;
        boolean z16;
        boolean zIsFeatureEnabled;
        C28676v0 c28676v0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        boolean z17;
        Object objM87133R2;
        int i27;
        AbstractC22676k.m65750j(onFeedbackClicked, "onFeedbackClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-508090819);
        int i28 = i15 & 1;
        if (i28 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) == 0) {
                i17 = i13;
                int i29 = c28655q.m87149e(i17) ? 32 : 16;
                i16 |= i29;
            } else {
                i17 = i13;
            }
            i16 |= i29;
        } else {
            i17 = i13;
        }
        int i34 = i15 & 4;
        if (i34 == 0) {
            if ((i14 & 384) == 0) {
                f14 = f13;
                i16 |= c28655q.m87147d(f14) ? 256 : 128;
            }
            i18 = i15 & 8;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i19;
                }
                if ((i14 & 24576) == 0) {
                    if (c28655q.m87157i(onFeedbackClicked)) {
                        i27 = 16384;
                    } else {
                        i27 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i27;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i16 & 1, z14)) {
                    c28655q.m87140Z();
                    i25 = i14 & 1;
                    c2314t = C2314t.f9131w;
                    if (i25 != 0 || c28655q.m87118C()) {
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i15 & 2) != 0) {
                            iM46357r = C38072d.f163053a.m121951d().getVarious().getFeedback();
                            i16 &= -113;
                        } else {
                            iM46357r = i17;
                        }
                        if (i34 != 0) {
                            f16 = 1.0f;
                        } else {
                            f16 = f14;
                        }
                        i26 = iM46357r;
                        f17 = f16;
                        if (i18 != 0) {
                            z16 = false;
                        }
                        c28655q.m87175r();
                        zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_FEEDBACK_V3);
                        c28676v0 = C28635l.f115821a;
                        if (zIsFeatureEnabled || z16) {
                            c28655q.m87150e0(-1067354218);
                            Modifier modifierMo3471e = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9105H, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = c.f135824w;
                                c28655q.m87172p0(objM87133R);
                            }
                            float f18 = f17;
                            C27270o c27270o = new C27270o(bVar, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f18, false, 760, null);
                            f17 = f18;
                            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                            if ((i16 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C32644n(onFeedbackClicked, 7);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1068496165);
                            Modifier modifierMo3471e2 = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            int iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                            InterfaceC0221l.f734a.getClass();
                            C0213j c0213j2 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                            C0209i c0209i2 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                            AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
                            C38072d c38072d = C38072d.f163053a;
                            int iM46344k0 = c38072d.m121951d().getVarious().getThumbUp();
                            Object objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = a.f135822w;
                                c28655q.m87172p0(objM87133R3);
                            }
                            C27270o c27270o2 = new C27270o(bVar2, iM46344k0, p745y81.Function1.m125323a((Function1) objM87133R3), null, null, false, false, false, f17, false, 760, null);
                            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159613C0);
                            int i35 = i16 & 57344;
                            boolean z18 = i35 == 16384;
                            Object objM87133R4 = c28655q.m87133R();
                            if (z18 || objM87133R4 == c28676v0) {
                                objM87133R4 = new C32644n(onFeedbackClicked, 5);
                                c28655q.m87172p0(objM87133R4);
                            }
                            int i36 = C27270o.f109105k;
                            AbstractC27242b1.m82092d(c27270o2, strM92103Y2, null, null, (InterfaceC4339a) objM87133R4, c28655q, i36, 12);
                            int iM46342j0 = c38072d.m121951d().getVarious().getThumbDown();
                            Object objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = b.f135823w;
                                c28655q.m87172p0(objM87133R5);
                            }
                            C27270o c27270o3 = new C27270o(bVar2, iM46342j0, p745y81.Function1.m125323a((Function1) objM87133R5), null, null, false, false, false, f17, false, 760, null);
                            String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159611B0);
                            boolean z19 = i35 == 16384;
                            Object objM87133R6 = c28655q.m87133R();
                            if (z19 || objM87133R6 == c28676v0) {
                                objM87133R6 = new C32644n(onFeedbackClicked, 6);
                                c28655q.m87172p0(objM87133R6);
                            }
                            AbstractC27242b1.m82092d(c27270o3, strM92103Y3, null, null, (InterfaceC4339a) objM87133R6, c28655q, i36, 12);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        z15 = z16;
                        i24 = i26;
                        f15 = f17;
                    } else {
                        c28655q.m87138X();
                        if ((i15 & 2) != 0) {
                            i16 &= -113;
                        }
                        i26 = i17;
                        f17 = f14;
                    }
                    z16 = z13;
                    c28655q.m87175r();
                    zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_FEEDBACK_V3);
                    c28676v0 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-1067354218);
                        Modifier modifierMo3471e3 = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        AbstractC27274q.b bVar3 = AbstractC27274q.b.f109138f;
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = c.f135824w;
                            c28655q.m87172p0(objM87133R);
                        }
                        float f19 = f17;
                        C27270o c27270o4 = new C27270o(bVar3, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f19, false, 760, null);
                        f17 = f19;
                        String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                        if ((i16 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C32644n(onFeedbackClicked, 7);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C32644n(onFeedbackClicked, 7);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27242b1.m82092d(c27270o4, strM92103Y4, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1067354218);
                        Modifier modifierMo3471e4 = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                        AbstractC27274q.b bVar4 = AbstractC27274q.b.f109138f;
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = c.f135824w;
                            c28655q.m87172p0(objM87133R);
                        }
                        float f110 = f17;
                        C27270o c27270o5 = new C27270o(bVar4, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f110, false, 760, null);
                        f17 = f110;
                        String strM92103Y5 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                        if ((i16 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            objM87133R2 = new C32644n(onFeedbackClicked, 7);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C32644n(onFeedbackClicked, 7);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27242b1.m82092d(c27270o5, strM92103Y5, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                    i24 = i26;
                    f15 = f17;
                } else {
                    c28655q.m87138X();
                    i24 = i17;
                    f15 = f14;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C20898o(modifier2, i24, f15, z15, onFeedbackClicked, i14, i15);
                }
            }
            i16 |= 3072;
            z13 = z4;
            if ((i14 & 24576) == 0) {
                if (c28655q.m87157i(onFeedbackClicked)) {
                    i27 = 16384;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i27;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                i25 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 2) != 0) {
                        iM46357r = C38072d.f163053a.m121951d().getVarious().getFeedback();
                        i16 &= -113;
                    } else {
                        iM46357r = i17;
                    }
                    if (i34 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    i26 = iM46357r;
                    f17 = f16;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                } else {
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 2) != 0) {
                        iM46357r = C38072d.f163053a.m121951d().getVarious().getFeedback();
                        i16 &= -113;
                    } else {
                        iM46357r = i17;
                    }
                    if (i34 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    i26 = iM46357r;
                    f17 = f16;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                }
                c28655q.m87175r();
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_FEEDBACK_V3);
                c28676v0 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-1067354218);
                    Modifier modifierMo3471e5 = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    AbstractC27274q.b bVar5 = AbstractC27274q.b.f109138f;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = c.f135824w;
                        c28655q.m87172p0(objM87133R);
                    }
                    float f111 = f17;
                    C27270o c27270o6 = new C27270o(bVar5, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f111, false, 760, null);
                    f17 = f111;
                    String strM92103Y6 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                    if ((i16 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C32644n(onFeedbackClicked, 7);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32644n(onFeedbackClicked, 7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27242b1.m82092d(c27270o6, strM92103Y6, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1067354218);
                    Modifier modifierMo3471e6 = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    AbstractC27274q.b bVar6 = AbstractC27274q.b.f109138f;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = c.f135824w;
                        c28655q.m87172p0(objM87133R);
                    }
                    float f112 = f17;
                    C27270o c27270o7 = new C27270o(bVar6, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f112, false, 760, null);
                    f17 = f112;
                    String strM92103Y7 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                    if ((i16 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C32644n(onFeedbackClicked, 7);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32644n(onFeedbackClicked, 7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27242b1.m82092d(c27270o7, strM92103Y7, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                z15 = z16;
                i24 = i26;
                f15 = f17;
            } else {
                c28655q.m87138X();
                i24 = i17;
                f15 = f14;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20898o(modifier2, i24, f15, z15, onFeedbackClicked, i14, i15);
            }
        }
        i16 |= 384;
        f14 = f13;
        i18 = i15 & 8;
        if (i18 != 0) {
            if ((i14 & 3072) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i19;
            }
            if ((i14 & 24576) == 0) {
                if (c28655q.m87157i(onFeedbackClicked)) {
                    i27 = 16384;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i27;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i16 & 1, z14)) {
                c28655q.m87140Z();
                i25 = i14 & 1;
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 2) != 0) {
                        iM46357r = C38072d.f163053a.m121951d().getVarious().getFeedback();
                        i16 &= -113;
                    } else {
                        iM46357r = i17;
                    }
                    if (i34 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    i26 = iM46357r;
                    f17 = f16;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                } else {
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 2) != 0) {
                        iM46357r = C38072d.f163053a.m121951d().getVarious().getFeedback();
                        i16 &= -113;
                    } else {
                        iM46357r = i17;
                    }
                    if (i34 != 0) {
                        f16 = 1.0f;
                    } else {
                        f16 = f14;
                    }
                    i26 = iM46357r;
                    f17 = f16;
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                }
                c28655q.m87175r();
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_FEEDBACK_V3);
                c28676v0 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-1067354218);
                    Modifier modifierMo3471e7 = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    AbstractC27274q.b bVar7 = AbstractC27274q.b.f109138f;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = c.f135824w;
                        c28655q.m87172p0(objM87133R);
                    }
                    float f113 = f17;
                    C27270o c27270o8 = new C27270o(bVar7, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f113, false, 760, null);
                    f17 = f113;
                    String strM92103Y8 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                    if ((i16 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C32644n(onFeedbackClicked, 7);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32644n(onFeedbackClicked, 7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27242b1.m82092d(c27270o8, strM92103Y8, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1067354218);
                    Modifier modifierMo3471e8 = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                    AbstractC27274q.b bVar8 = AbstractC27274q.b.f109138f;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = c.f135824w;
                        c28655q.m87172p0(objM87133R);
                    }
                    float f114 = f17;
                    C27270o c27270o9 = new C27270o(bVar8, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f114, false, 760, null);
                    f17 = f114;
                    String strM92103Y9 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                    if ((i16 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        objM87133R2 = new C32644n(onFeedbackClicked, 7);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32644n(onFeedbackClicked, 7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27242b1.m82092d(c27270o9, strM92103Y9, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                z15 = z16;
                i24 = i26;
                f15 = f17;
            } else {
                c28655q.m87138X();
                i24 = i17;
                f15 = f14;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20898o(modifier2, i24, f15, z15, onFeedbackClicked, i14, i15);
            }
        }
        i16 |= 3072;
        z13 = z4;
        if ((i14 & 24576) == 0) {
            if (c28655q.m87157i(onFeedbackClicked)) {
                i27 = 16384;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i27;
        }
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i16 & 1, z14)) {
            c28655q.m87140Z();
            i25 = i14 & 1;
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                if ((i15 & 2) != 0) {
                    iM46357r = C38072d.f163053a.m121951d().getVarious().getFeedback();
                    i16 &= -113;
                } else {
                    iM46357r = i17;
                }
                if (i34 != 0) {
                    f16 = 1.0f;
                } else {
                    f16 = f14;
                }
                i26 = iM46357r;
                f17 = f16;
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
            } else {
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                if ((i15 & 2) != 0) {
                    iM46357r = C38072d.f163053a.m121951d().getVarious().getFeedback();
                    i16 &= -113;
                } else {
                    iM46357r = i17;
                }
                if (i34 != 0) {
                    f16 = 1.0f;
                } else {
                    f16 = f14;
                }
                i26 = iM46357r;
                f17 = f16;
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
            }
            c28655q.m87175r();
            zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_FEEDBACK_V3);
            c28676v0 = C28635l.f115821a;
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(-1067354218);
                Modifier modifierMo3471e9 = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3471e9);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                AbstractC27274q.b bVar9 = AbstractC27274q.b.f109138f;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = c.f135824w;
                    c28655q.m87172p0(objM87133R);
                }
                float f115 = f17;
                C27270o c27270o10 = new C27270o(bVar9, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f115, false, 760, null);
                f17 = f115;
                String strM92103Y10 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                if ((i16 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    objM87133R2 = new C32644n(onFeedbackClicked, 7);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32644n(onFeedbackClicked, 7);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27242b1.m82092d(c27270o10, strM92103Y10, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1067354218);
                Modifier modifierMo3471e10 = AbstractC1099a.m3394p((float) 0.5d, c2314t).mo3471e(modifier2);
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierMo3471e10);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d9);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                AbstractC27274q.b bVar10 = AbstractC27274q.b.f109138f;
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = c.f135824w;
                    c28655q.m87172p0(objM87133R);
                }
                float f116 = f17;
                C27270o c27270o11 = new C27270o(bVar10, i26, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, f116, false, 760, null);
                f17 = f116;
                String strM92103Y11 = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159609A0);
                if ((i16 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    objM87133R2 = new C32644n(onFeedbackClicked, 7);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32644n(onFeedbackClicked, 7);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27242b1.m82092d(c27270o11, strM92103Y11, null, null, (InterfaceC4339a) objM87133R2, c28655q, C27270o.f109105k, 12);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            z15 = z16;
            i24 = i26;
            f15 = f17;
        } else {
            c28655q.m87138X();
            i24 = i17;
            f15 = f14;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20898o(modifier2, i24, f15, z15, onFeedbackClicked, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m102607f(Function1 function1) {
        function1.invoke(AiFeedbackType.BETTER);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m102608g(Function1 function1) {
        function1.invoke(AiFeedbackType.WORSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m102609h(Function1 function1) {
        function1.invoke(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m102610i(Modifier modifier, int i13, float f13, boolean z4, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m102606e(modifier, i13, f13, z4, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
