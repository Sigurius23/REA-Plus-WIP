package lf0;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import aw0.C2108h;
import b30.C2611r1;
import b91.C2886a;
import bb2.C2929e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ej1.C13258u;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import ih1.C18522f;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l72.C23401h;
import l83.C23454a0;
import lc0.C23825g;
import ld0.C23845d;
import ld0.C23854m;
import ld0.C23856o;
import ld0.C23861t;
import ld0.EnumC23855n;
import md0.AbstractC25448c;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C39916z;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p708hb2.C17101i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lf0.b0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001aM\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000bH\u0003¢\u0006\u0004\b!\u0010\"¨\u0006'²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lld0/m;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "n", "(Landroidx/compose/ui/Modifier;Lld0/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lld0/o;", "", "isExpanded", "Lkotlin/Function0;", "onHeaderClick", "u", "(Lld0/o;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "title", "Li2/x;", "titleColor", "isExpandable", "Lld0/n;", NotificationCompat.CATEGORY_STATUS, "D", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JZZLld0/n;Landroidx/compose/runtime/Composer;II)V", "subtitle", "", "Lm91/u;", "items", "y", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isComplete", "G", "(ZLandroidx/compose/runtime/Composer;I)V", "", "expandedStepIndex", "", "rotationAngle", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23899b0 {

    /* JADX INFO: renamed from: lf0.b0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94524a;

        static {
            int[] iArr = new int[EnumC23855n.values().length];
            try {
                iArr[EnumC23855n.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23855n.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC23855n.NOT_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94524a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m70205A(Modifier modifier, String str, List list, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70237y(modifier, str, list, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Modifier m70206B(InterfaceC25312u interfaceC25312u, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-976427954);
        boolean z4 = interfaceC25312u instanceof C23845d;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3398t = z4 ? AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7) : AbstractC1102d.m3409f(1.0f, c2314t);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m70207C(Modifier modifier, String str, List list, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70237y(modifier, str, list, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m70208D(Modifier modifier, String str, long j7, boolean z4, boolean z13, EnumC23855n enumC23855n, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        EnumC23855n enumC23855n2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1103379599);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87151f(j7) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87149e(enumC23855n.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            enumC23855n2 = enumC23855n;
            m70211G(enumC23855n2 == EnumC23855n.COMPLETE, c28655q, 0);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * 8, 0.0f, 2));
            Modifier modifier3 = modifier2;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f, true, 1.0f);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(str, modifierM31988g, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, ((i15 >> 3) & 14) | (i15 & 896), C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            if (z4) {
                c28655q.m87150e0(-545586874);
                float f13 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, z13 ? AbstractC16277f.f62278S : AbstractC16277f.f62363p0), AbstractC1772c1.m5375L(m70209E(AbstractC11352g.m30588b(z13 ? -180.0f : 0.0f, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28)), AbstractC1102d.m3419p(f13 * f13, c2314t)), c38072d.m121949b(c28655q, i17).getWhite50(), c28655q, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-544995859);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            enumC23855n2 = enumC23855n;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2611r1(modifier2, str, j7, z4, z13, enumC23855n2, i13, i14);
        }
    }

    /* JADX INFO: renamed from: E */
    private static final float m70209E(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m70210F(Modifier modifier, String str, long j7, boolean z4, boolean z13, EnumC23855n enumC23855n, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m70208D(modifier, str, j7, z4, z13, enumC23855n, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final void m70211G(boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(455042997);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87150e0(-790338916);
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, c2314t);
            C33252i c33252i = AbstractC33253j.f138651a;
            Modifier modifierM118994r = AbstractC37056f.m118994r(modifierM3419p, c33252i);
            Modifier modifierMo3471e = z4 ? modifierM118994r.mo3471e(AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentPositiveTrend(), AbstractC17918w0.f69621a)) : modifierM118994r.mo3471e(AbstractC15751g.m44455h(c2314t, (float) 1.5d, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20(), c33252i));
            c28655q.m87173q(false);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (z4) {
                c28655q.m87150e0(306392019);
                C38072d c38072d = C38072d.f163053a;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getCheckmark(), c28655q, 6), null, AbstractC1102d.m3419p(((float) 2.5d) * f13, c2314t), c38072d.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), c28655q, 432, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(306668787);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2929e(z4, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m70212H(boolean z4, int i13, Composer composer, int i14) {
        m70211G(z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd A[LOOP:0: B:52:0x00a9->B:57:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0110  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1 A[EDGE_INSN: B:71:0x00c1->B:59:0x00c1 BREAK  A[LOOP:0: B:52:0x00a9->B:57:0x00bd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public static final void m70226n(Modifier modifier, C23854m viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        int i17;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87153g;
        Object objM87133R;
        Iterator<C23856o> it;
        Integer numValueOf;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1961047955);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            i17 = 0;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23825g(8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                zM87153g = c28655q2.m87153g(viewState.m70087b());
                objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    it = viewState.m70087b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        } else if (it.next().getIsExpanded()) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    numValueOf = Integer.valueOf(i17);
                    if (i17 == -1) {
                        numValueOf = null;
                    }
                    objM87133R = AbstractC28683x.m87272z(numValueOf);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q = c28655q2;
                Modifier modifier4 = modifier3;
                AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-2057100509, c28655q2, new C39916z(viewState, 8 * 2, (InterfaceC28601c1) objM87133R, function4, 1)), c28655q, (i16 & 14) | 12582912, 114);
                function3 = function4;
                modifier2 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 10, (Object) modifier2, (Object) viewState, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        i17 = 0;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23825g(8);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            zM87153g = c28655q2.m87153g(viewState.m70087b());
            objM87133R = c28655q2.m87133R();
            if (zM87153g) {
                it = viewState.m70087b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else {
                        if (it.next().getIsExpanded()) {
                            break;
                            break;
                        }
                        i17++;
                    }
                }
                numValueOf = Integer.valueOf(i17);
                if (i17 == -1) {
                    numValueOf = null;
                }
                objM87133R = AbstractC28683x.m87272z(numValueOf);
                c28655q2.m87172p0(objM87133R);
            } else {
                it = viewState.m70087b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else {
                        if (it.next().getIsExpanded()) {
                            break;
                            break;
                        }
                        i17++;
                    }
                }
                numValueOf = Integer.valueOf(i17);
                if (i17 == -1) {
                    numValueOf = null;
                }
                objM87133R = AbstractC28683x.m87272z(numValueOf);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            Modifier modifier5 = modifier3;
            AbstractC31926e.m99375j(modifier5, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-2057100509, c28655q2, new C39916z(viewState, 8 * 2, (InterfaceC28601c1) objM87133R, function4, 1)), c28655q, (i16 & 14) | 12582912, 114);
            function3 = function4;
            modifier2 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 10, (Object) modifier2, (Object) viewState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m70227o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final Integer m70228p(InterfaceC28601c1 interfaceC28601c1) {
        return (Integer) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: q */
    private static final void m70229q(InterfaceC28601c1 interfaceC28601c1, Integer num) {
        interfaceC28601c1.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m70230r(C23854m c23854m, float f13, InterfaceC28601c1 interfaceC28601c1, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C23861t c23861tM70086a = c23854m.getHeader();
            if (c23861tM70086a == null) {
                c28655q.m87150e0(1596554723);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1596554724);
                AbstractC23929i2.m70425b(AbstractC1099a.m3397s(c2314t, f13, f13, f13, 1 * 8), c23861tM70086a, c28655q, AbstractC22403o.f87638a << 3, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(882799312);
            int i14 = 0;
            for (Object obj : c23854m.m70087b()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C23856o c23856o = (C23856o) obj;
                Integer numM70228p = m70228p(interfaceC28601c1);
                boolean z4 = numM70228p != null && numM70228p.intValue() == i14;
                boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | c28655q.m87149e(i14);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C17101i(interfaceC28601c1, i14, 1);
                    c28655q.m87172p0(objM87133R);
                }
                m70233u(c23856o, z4, (InterfaceC4339a) objM87133R, function1, c28655q, 0, 0);
                if (i14 < AbstractC37056f.m118951C(c23854m.m70087b())) {
                    c28655q.m87150e0(1705004120);
                    C28655q c28655q2 = c28655q;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1705115596);
                    c28655q.m87173q(false);
                }
                c2314t = c2314t;
                i14 = i15;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m70231s(int i13, InterfaceC28601c1 interfaceC28601c1) {
        Integer numM70228p = m70228p(interfaceC28601c1);
        m70229q(interfaceC28601c1, (numM70228p != null && numM70228p.intValue() == i13) ? null : Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m70232t(Modifier modifier, C23854m c23854m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70226n(modifier, c23854m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x0161  */
    /* JADX WARN: Code duplicated, block: B:82:0x0176  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    private static final void m70233u(C23856o c23856o, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Function1 function2;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        boolean zM87153g;
        Object objM87133R;
        boolean z14;
        String strM70090c;
        boolean zBooleanValue;
        Modifier modifierM3362g;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        long jM95624D;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1485339310);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c23856o) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23825g(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                zM87153g = c28655q.m87153g(c23856o.m70088a()) | c28655q.m87153g(c23856o.getSubtitle());
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    if (c23856o.m70088a().isEmpty() || !((strM70090c = c23856o.getSubtitle()) == null || AbstractC39414r.m125890i0(strM70090c))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = Boolean.valueOf(z14);
                    c28655q.m87172p0(objM87133R);
                }
                zBooleanValue = ((Boolean) objM87133R).booleanValue();
                float f13 = 8;
                modifierM3362g = C2314t.f9131w;
                Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3362g, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                String strM70091d = c23856o.getTitle();
                i16 = a.f94524a[c23856o.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().ordinal()];
                if (i16 != 1 || i16 == 2) {
                    c28655q.m87150e0(1220256578);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    if (i16 != 3) {
                        throw AbstractC11895b.m32003v(1220252298, c28655q, false);
                    }
                    c28655q.m87150e0(1220259135);
                    jM95624D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                EnumC23855n enumC23855nM70089b = c23856o.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String();
                if (zBooleanValue) {
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, interfaceC4339a, 15);
                }
                float f14 = 2 * f13;
                m70208D(AbstractC1099a.m3397s(modifierM3362g, f14, ((float) 2.5d) * f13, f14, ((float) 1.5d) * f13), strM70091d, jM95624D, zBooleanValue, z4, enumC23855nM70089b, c28655q, (i15 << 9) & 57344, 0);
                AbstractC1090b.m3350e(C23016z.f90757a, z4, null, null, null, null, AbstractC37817c.m121344e(-598200800, c28655q, new C18522f(14, c23856o, function3)), c28655q, 1572870 | (i15 & 112), 30);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(c23856o, z4, interfaceC4339a, function3, i13, i14, 20);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23825g(9);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            zM87153g = c28655q.m87153g(c23856o.m70088a()) | c28655q.m87153g(c23856o.getSubtitle());
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                if (c23856o.m70088a().isEmpty()) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                objM87133R = Boolean.valueOf(z14);
                c28655q.m87172p0(objM87133R);
            } else {
                if (c23856o.m70088a().isEmpty()) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                objM87133R = Boolean.valueOf(z14);
                c28655q.m87172p0(objM87133R);
            }
            zBooleanValue = ((Boolean) objM87133R).booleanValue();
            float f15 = 8;
            modifierM3362g = C2314t.f9131w;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifierM3362g, 0.0f, 0.0f, 0.0f, 1 * f15, 7);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            String strM70091d2 = c23856o.getTitle();
            i16 = a.f94524a[c23856o.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().ordinal()];
            if (i16 != 1) {
                c28655q.m87150e0(1220256578);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(1220256578);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            EnumC23855n enumC23855nM70089b2 = c23856o.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String();
            if (zBooleanValue) {
                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, interfaceC4339a, 15);
            }
            float f16 = 2 * f15;
            m70208D(AbstractC1099a.m3397s(modifierM3362g, f16, ((float) 2.5d) * f15, f16, ((float) 1.5d) * f15), strM70091d2, jM95624D, zBooleanValue, z4, enumC23855nM70089b2, c28655q, (i15 << 9) & 57344, 0);
            AbstractC1090b.m3350e(C23016z.f90757a, z4, null, null, null, null, AbstractC37817c.m121344e(-598200800, c28655q, new C18522f(14, c23856o, function3)), c28655q, 1572870 | (i15 & 112), 30);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(c23856o, z4, interfaceC4339a, function3, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m70234v(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m70235w(C23856o c23856o, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        float f13 = 8;
        float f14 = 2 * f13;
        m70237y(AbstractC1099a.m3398t(C2314t.f9131w, f14, 0.0f, f14, ((float) 1.5d) * f13, 2), c23856o.getSubtitle(), c23856o.m70088a(), function1, composer, 6, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m70236x(C23856o c23856o, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m70233u(c23856o, z4, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0213  */
    /* JADX WARN: Code duplicated, block: B:103:0x0226  */
    /* JADX WARN: Code duplicated, block: B:106:0x0234  */
    /* JADX WARN: Code duplicated, block: B:107:0x023f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX INFO: renamed from: y */
    private static final void m70237y(Modifier modifier, String str, List<? extends InterfaceC25312u> list, Function1 function1, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        final String str2;
        int i16;
        List<? extends InterfaceC25312u> list2;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        boolean z4;
        final Modifier modifier3;
        C28655q c28655q;
        final List<? extends InterfaceC25312u> list3;
        final Function1 function3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C2314t c2314t;
        Modifier modifier4;
        List<? extends InterfaceC25312u> list4;
        Function1 function4;
        List<? extends InterfaceC25312u> list5;
        final Modifier modifier5;
        final String str3;
        final Function1 function5;
        int i24;
        C2314t c2314t2;
        boolean z13;
        String str4;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1774381902);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q2.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    list2 = list;
                    if (c28655q2.m87157i(list2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i25 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i26 != 0) {
                            str2 = null;
                        }
                        if (i16 != 0) {
                            list4 = null;
                        } else {
                            list4 = list2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C23825g(10);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function4 = (Function1) objM87133R;
                        } else {
                            function4 = function2;
                        }
                        if ((str2 != null || AbstractC39414r.m125890i0(str2)) && ((list5 = list4) == null || list5.isEmpty())) {
                            modifier5 = modifier4;
                            str3 = str2;
                            function5 = function4;
                            c28677v1M87180u = c28655q2.m87180u();
                            if (c28677v1M87180u == null) {
                                return;
                            }
                            final int i27 = 0;
                            final List<? extends InterfaceC25312u> list6 = list4;
                            interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i27) {
                                        case 0:
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC23899b0.m70205A(modifier5, str3, list6, function5, i13, i14, (Composer) obj, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            return AbstractC23899b0.m70207C(modifier5, str3, list6, function5, i13, i14, (Composer) obj, iIntValue2);
                                    }
                                }
                            };
                        } else {
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                            int iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
                            InterfaceC0221l.f734a.getClass();
                            C0213j c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                            C0209i c0209i = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                            if (str2 == null) {
                                c28655q2.m87150e0(-2048027754);
                                c28655q2.m87173q(false);
                                i24 = i15;
                                str4 = str2;
                                c2314t2 = c2314t;
                                z13 = false;
                            } else {
                                c28655q2.m87150e0(-2048027753);
                                C38072d c38072d = C38072d.f163053a;
                                int i28 = C38072d.f163054b;
                                C2886a c2886aM8420a = c38072d.m121952e(c28655q2, i28).getB1();
                                String str5 = str2;
                                i24 = i15;
                                c2314t2 = c2314t;
                                z13 = false;
                                AbstractC30795n.m94707h(str5, null, c38072d.m121949b(c28655q2, i28).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                                str4 = str5;
                                c28655q2.m87173q(false);
                            }
                            if (list4 == null) {
                                c28655q2 = c28655q2;
                                c28655q2.m87150e0(-2047821356);
                                c28655q2.m87173q(z13);
                            } else {
                                c28655q2 = c28655q2;
                                c28655q2.m87150e0(-2047821355);
                                for (InterfaceC25312u interfaceC25312u : list4) {
                                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(((float) 1.5d) * 8, c2314t2));
                                    AbstractC25303l.m74291r(interfaceC25312u, AbstractC25448c.m74678B0(), new C13258u(2, interfaceC25312u), function4, c28655q2, (i24 & 7168) | (C25307p.f99300b << 3), 0);
                                }
                                c28655q2.m87173q(z13);
                            }
                            c28655q2.m87173q(true);
                            modifier3 = modifier4;
                            function3 = function4;
                            c28655q = c28655q2;
                            str2 = str4;
                            list3 = list4;
                        }
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    c28655q2.m87138X();
                    modifier3 = modifier2;
                    c28655q = c28655q2;
                    list3 = list2;
                    function3 = function2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i29 = 1;
                        interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i29) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70205A(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70207C(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i15 |= 3072;
                function2 = function1;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i26 != 0) {
                        str2 = null;
                    }
                    if (i16 != 0) {
                        list4 = null;
                    } else {
                        list4 = list2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C23825g(10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if (str2 != null) {
                        modifier5 = modifier4;
                        str3 = str2;
                        function5 = function4;
                        c28677v1M87180u = c28655q2.m87180u();
                        if (c28677v1M87180u == null) {
                            return;
                        }
                        final int i210 = 0;
                        final List list7 = list4;
                        interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i210) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70205A(modifier5, str3, list7, function5, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70207C(modifier5, str3, list7, function5, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    } else {
                        modifier5 = modifier4;
                        str3 = str2;
                        function5 = function4;
                        c28677v1M87180u = c28655q2.m87180u();
                        if (c28677v1M87180u == null) {
                            return;
                        }
                        final int i211 = 0;
                        final List list8 = list4;
                        interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i211) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70205A(modifier5, str3, list8, function5, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70207C(modifier5, str3, list8, function5, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q2.m87138X();
                modifier3 = modifier2;
                c28655q = c28655q2;
                list3 = list2;
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i212 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i212) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70205A(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70207C(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 384;
            list2 = list;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i26 != 0) {
                        str2 = null;
                    }
                    if (i16 != 0) {
                        list4 = null;
                    } else {
                        list4 = list2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C23825g(10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if (str2 != null) {
                        modifier5 = modifier4;
                        str3 = str2;
                        function5 = function4;
                        c28677v1M87180u = c28655q2.m87180u();
                        if (c28677v1M87180u == null) {
                            return;
                        }
                        final int i213 = 0;
                        final List list9 = list4;
                        interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i213) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70205A(modifier5, str3, list9, function5, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70207C(modifier5, str3, list9, function5, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    } else {
                        modifier5 = modifier4;
                        str3 = str2;
                        function5 = function4;
                        c28677v1M87180u = c28655q2.m87180u();
                        if (c28677v1M87180u == null) {
                            return;
                        }
                        final int i214 = 0;
                        final List list10 = list4;
                        interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i214) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70205A(modifier5, str3, list10, function5, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70207C(modifier5, str3, list10, function5, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q2.m87138X();
                modifier3 = modifier2;
                c28655q = c28655q2;
                list3 = list2;
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i215 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i215) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70205A(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70207C(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i26 != 0) {
                    str2 = null;
                }
                if (i16 != 0) {
                    list4 = null;
                } else {
                    list4 = list2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C23825g(10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (str2 != null) {
                    modifier5 = modifier4;
                    str3 = str2;
                    function5 = function4;
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    }
                    final int i216 = 0;
                    final List list11 = list4;
                    interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i216) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70205A(modifier5, str3, list11, function5, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70207C(modifier5, str3, list11, function5, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    modifier5 = modifier4;
                    str3 = str2;
                    function5 = function4;
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    }
                    final int i217 = 0;
                    final List list12 = list4;
                    interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i217) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70205A(modifier5, str3, list12, function5, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70207C(modifier5, str3, list12, function5, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q2.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q2;
            list3 = list2;
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i218 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i218) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70205A(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70207C(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                list2 = list;
                if (c28655q2.m87157i(list2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i26 != 0) {
                        str2 = null;
                    }
                    if (i16 != 0) {
                        list4 = null;
                    } else {
                        list4 = list2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C23825g(10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if (str2 != null) {
                        modifier5 = modifier4;
                        str3 = str2;
                        function5 = function4;
                        c28677v1M87180u = c28655q2.m87180u();
                        if (c28677v1M87180u == null) {
                            return;
                        }
                        final int i219 = 0;
                        final List list13 = list4;
                        interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i219) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70205A(modifier5, str3, list13, function5, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70207C(modifier5, str3, list13, function5, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    } else {
                        modifier5 = modifier4;
                        str3 = str2;
                        function5 = function4;
                        c28677v1M87180u = c28655q2.m87180u();
                        if (c28677v1M87180u == null) {
                            return;
                        }
                        final int i2110 = 0;
                        final List list14 = list4;
                        interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i2110) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70205A(modifier5, str3, list14, function5, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC23899b0.m70207C(modifier5, str3, list14, function5, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q2.m87138X();
                modifier3 = modifier2;
                c28655q = c28655q2;
                list3 = list2;
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i2111 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2111) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70205A(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70207C(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i26 != 0) {
                    str2 = null;
                }
                if (i16 != 0) {
                    list4 = null;
                } else {
                    list4 = list2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C23825g(10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (str2 != null) {
                    modifier5 = modifier4;
                    str3 = str2;
                    function5 = function4;
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    }
                    final int i2112 = 0;
                    final List list15 = list4;
                    interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2112) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70205A(modifier5, str3, list15, function5, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70207C(modifier5, str3, list15, function5, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    modifier5 = modifier4;
                    str3 = str2;
                    function5 = function4;
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    }
                    final int i2113 = 0;
                    final List list16 = list4;
                    interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2113) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70205A(modifier5, str3, list16, function5, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70207C(modifier5, str3, list16, function5, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q2.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q2;
            list3 = list2;
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i2114 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i2114) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70205A(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70207C(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 384;
        list2 = list;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i26 != 0) {
                    str2 = null;
                }
                if (i16 != 0) {
                    list4 = null;
                } else {
                    list4 = list2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C23825g(10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (str2 != null) {
                    modifier5 = modifier4;
                    str3 = str2;
                    function5 = function4;
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    }
                    final int i2115 = 0;
                    final List list17 = list4;
                    interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2115) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70205A(modifier5, str3, list17, function5, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70207C(modifier5, str3, list17, function5, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    modifier5 = modifier4;
                    str3 = str2;
                    function5 = function4;
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    }
                    final int i2116 = 0;
                    final List list18 = list4;
                    interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2116) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70205A(modifier5, str3, list18, function5, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23899b0.m70207C(modifier5, str3, list18, function5, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q2.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q2;
            list3 = list2;
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i2117 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i2117) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70205A(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70207C(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i26 != 0) {
                str2 = null;
            }
            if (i16 != 0) {
                list4 = null;
            } else {
                list4 = list2;
            }
            if (i18 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C23825g(10);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            if (str2 != null) {
                modifier5 = modifier4;
                str3 = str2;
                function5 = function4;
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i2118 = 0;
                final List list19 = list4;
                interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i2118) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70205A(modifier5, str3, list19, function5, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70207C(modifier5, str3, list19, function5, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                modifier5 = modifier4;
                str3 = str2;
                function5 = function4;
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i2119 = 0;
                final List list110 = list4;
                interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i2119) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70205A(modifier5, str3, list110, function5, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC23899b0.m70207C(modifier5, str3, list110, function5, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q2.m87138X();
        modifier3 = modifier2;
        c28655q = c28655q2;
        list3 = list2;
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i21110 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: lf0.a0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i21110) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC23899b0.m70205A(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC23899b0.m70207C(modifier3, str2, list3, function3, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m70238z(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
