package p51;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm2.C3428b1;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.Iterator;
import l83.C23454a0;
import ny0.AbstractC27282u;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p718lz1.C24823a;
import p725ot1.C28330f;
import p736sz0.AbstractC33166b0;
import p736sz0.C33169c0;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: p51.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lp51/e;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Landroidx/compose/ui/Modifier;Lp51/e;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "text", "g", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "Lt0/i;", "a", "Lt0/i;", "cardShape", "Li2/t;", "i", "(Landroidx/compose/runtime/Composer;I)Li2/t;", "aiBrush", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28855c {

    /* JADX INFO: renamed from: a */
    private static final C33252i f116779a = AbstractC33253j.m105489e(2 * 4);

    /* JADX INFO: renamed from: p51.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f116780a;

        static {
            int[] iArr = new int[EnumC28856d.values().length];
            try {
                iArr[EnumC28856d.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28856d.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC28856d.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f116780a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m87767d(Modifier modifier, C28857e viewState, InterfaceC4339a onClick, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q;
        char c3;
        Modifier modifierM3358c;
        boolean z4;
        char c7;
        long jM73366B;
        int i16;
        C28655q c28655q2;
        C38072d c38072d;
        C28655q c28655q3;
        C28655q c28655q4;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C2306l c2306l;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        InterfaceC4339a interfaceC4339a2;
        C0209i c0209i5;
        int i17;
        boolean z13;
        C28655q c28655q5;
        C38072d c38072d2;
        C23454a0 c23454a0;
        C28655q c28655q6;
        C38072d c38072d3;
        InterfaceC4339a interfaceC4339a3;
        C0209i c0209i6;
        C0209i c0209i7;
        C0209i c0209i8;
        C0209i c0209i9;
        C0209i c0209i10;
        InterfaceC4339a interfaceC4339a4;
        boolean z14;
        C28655q c28655q7;
        C38072d c38072d4;
        boolean z15;
        C28655q c28655q8;
        boolean z16;
        C2306l c2306l2 = C2299e.f9108K;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q9 = (C28655q) composer;
        c28655q9.m87154g0(-1157788653);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q9.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q9.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q9.m87157i(onClick) ? 256 : 128;
        }
        if (c28655q9.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i18 != 0 ? c2314t : modifier2;
            int i19 = a.f116780a[viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().ordinal()];
            if (i19 != 1) {
                if (i19 == 2) {
                    c28655q9.m87150e0(-238354856);
                    c28655q9.m87173q(false);
                    modifierM3358c = AbstractC1092a.m3357b(c2314t, C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.15f, AbstractC17918w0.m51517e(4287324927L))), new C17919x(C17919x.m51541c(0.15f, AbstractC17918w0.m51517e(4283487743L)))), 0L, 0L, 14), f116779a, 0.0f, 4);
                } else {
                    if (i19 != 3) {
                        throw AbstractC11895b.m32003v(-238360654, c28655q9, false);
                    }
                    c28655q9.m87150e0(-238345811);
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q9, 6).getBackgroundDarkAlt(), f116779a);
                    c28655q9.m87173q(false);
                }
                c3 = 6;
            } else {
                c28655q9.m87150e0(-238358429);
                c3 = 6;
                modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q9, 6).getWhite10(), f116779a);
                c28655q9.m87173q(false);
            }
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3362g(AbstractC1102d.m3409f(1.0f, modifier4).mo3471e(modifierM3358c), false, null, null, onClick, 15));
            C2306l c2306l3 = C2299e.f9107J;
            C22961h c22961h = AbstractC22977m.f90656g;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l3, c28655q9, 54);
            int iHashCode = Long.hashCode(c28655q9.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q9.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q9, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a5 = C0217k.f724b;
            c28655q9.m87158i0();
            if (c28655q9.f115903S) {
                c28655q9.m87163l(interfaceC4339a5);
            } else {
                c28655q9.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q9, c0209i11, c22994r1M66759a);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q9, c0209i12, interfaceC28653p1M87165m);
            C0209i c0209i13 = C0217k.f732j;
            if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q9, iHashCode, c0209i13);
            }
            C0209i c0209i14 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q9, c0209i14, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q9, 0);
            int iHashCode2 = Long.hashCode(c28655q9.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q9.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q9, layoutWeightElement);
            c28655q9.m87158i0();
            if (c28655q9.f115903S) {
                c28655q9.m87163l(interfaceC4339a5);
            } else {
                c28655q9.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q9, c0209i11, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q9, c0209i12, interfaceC28653p1M87165m2);
            if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q9, iHashCode2, c0209i13);
            }
            AbstractC28683x.m87239G(c28655q9, c0209i14, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q9, 0);
            C38072d c38072d5 = C38072d.f163053a;
            C2886a c2886aM8420a = c38072d5.m121952e(c28655q9, 6).getB1();
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC28856d.INACTIVE) {
                long jM73370c = AbstractC25012a.m73370c(c28655q9, -1684418892, c38072d5, c28655q9, 6);
                z4 = false;
                c28655q9.m87173q(false);
                jM73366B = jM73370c;
                c7 = 6;
            } else {
                z4 = false;
                c7 = 6;
                jM73366B = AbstractC25012a.m73366B(c28655q9, -1684348367, c38072d5, c28655q9, 6);
                c28655q9.m87173q(false);
            }
            boolean z17 = z4;
            Modifier modifier5 = modifier4;
            float f14 = f13;
            AbstractC30795n.m94707h(strM21274h, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q9, 0, 0, 196602);
            C28655q c28655q10 = c28655q9;
            AbstractC28853a abstractC28853aM87773a = viewState.getDescription();
            if (abstractC28853aM87773a == null) {
                c28655q10.m87150e0(-1684209643);
                c28655q10.m87173q(z17);
                c38072d = c38072d5;
                i16 = 1;
                c28655q3 = c28655q10;
            } else {
                c28655q10.m87150e0(-1684209642);
                AbstractC11266d.m30469w(1, f14, c2314t, c28655q10);
                if (abstractC28853aM87773a instanceof AbstractC28853a.a) {
                    c28655q10.m87150e0(-568951714);
                    AbstractC28853a.a aVar = (AbstractC28853a.a) abstractC28853aM87773a;
                    AbstractC33166b0.m105053d(null, C33169c0.m105070b(aVar.getState(), AbstractC39414r.m125863I0(aVar.getState().getText(), "\n\n"), null, null, 0, null, null, null, null, false, null, 1022, null), 2, 0, 2, c28655q10, 24960, 9);
                    c28655q10.m87173q(z17);
                    i16 = 1;
                    c28655q2 = c28655q10;
                } else {
                    if (!(abstractC28853aM87773a instanceof AbstractC28853a.b)) {
                        throw AbstractC11895b.m32003v(-568953586, c28655q10, false);
                    }
                    c28655q10.m87150e0(-457351383);
                    String strM87758a = ((AbstractC28853a.b) abstractC28853aM87773a).getText();
                    C2886a c2886aM8420a2 = c38072d5.m121952e(c28655q10, 6).getB1();
                    long white70 = c38072d5.m121949b(c28655q10, 6).getWhite70();
                    i16 = 1;
                    AbstractC30795n.m94707h(strM87758a, null, white70, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8420a2, null, c28655q10, 0, 3120, 186362);
                    C28655q c28655q11 = c28655q10;
                    c28655q11.m87173q(z17);
                    c28655q2 = c28655q11;
                }
                c28655q2.m87173q(z17);
                c28655q3 = c28655q2;
                c38072d = c38072d5;
            }
            if (viewState.m87777f().isEmpty()) {
                c28655q3.m87150e0(-1683014251);
                c28655q3.m87173q(z17);
                c28655q4 = c28655q3;
            } else {
                c28655q3.m87150e0(-1683414027);
                AbstractC11266d.m30469w((float) 1.5d, f14, c2314t, c28655q3);
                float f15 = i16 * f14;
                C28655q c28655q12 = c28655q3;
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(f15), AbstractC22977m.m66746i(f15), null, 0, 0, AbstractC37817c.m121344e(2102562541, c28655q3, new C24823a(viewState, 12)), c28655q12, 1573296, 57);
                C28655q c28655q13 = c28655q12;
                c28655q13.m87173q(z17);
                c28655q4 = c28655q13;
            }
            if (viewState.getLastUpdatedAtText() == null && viewState.getExpiresAtText() == null) {
                c28655q4.m87150e0(-1680264427);
                c28655q4.m87173q(z17);
                c0209i9 = c0209i12;
                f14 = f14;
                z15 = i16;
                c2306l = c2306l2;
                interfaceC4339a4 = interfaceC4339a5;
                c0209i10 = c0209i11;
                c0209i7 = c0209i13;
                c0209i8 = c0209i14;
                c38072d4 = c38072d;
                c28655q8 = c28655q4;
            } else {
                c28655q4.m87150e0(-1682842790);
                AbstractC11266d.m30469w(i16, f14, c2314t, c28655q4);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h, c2306l2, c28655q4, 54);
                int iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    interfaceC4339a = interfaceC4339a5;
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    interfaceC4339a = interfaceC4339a5;
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i11, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q4, c0209i12, interfaceC28653p1M87165m3);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                    c0209i = c0209i13;
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i);
                } else {
                    c0209i = c0209i13;
                }
                AbstractC28683x.m87239G(c28655q4, c0209i14, modifierM118962N3);
                TextResource textResourceM87775c = viewState.getLastUpdatedAtText();
                if (textResourceM87775c == null) {
                    c28655q4.m87150e0(661456339);
                    c28655q4.m87173q(z17);
                    c23454a0 = null;
                    c38072d3 = c38072d;
                    c2306l = c2306l2;
                    c0209i2 = c0209i12;
                    c0209i3 = c0209i14;
                    c0209i4 = c0209i;
                    interfaceC4339a2 = interfaceC4339a;
                    c0209i5 = c0209i11;
                    z13 = z17;
                    i17 = 6;
                } else {
                    c28655q4.m87150e0(661456340);
                    boolean zM65745e = AbstractC22676k.m65745e(viewState.getIsUpdateSeen(), Boolean.FALSE);
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 0.5d, f14, c2306l2, c28655q4, 54);
                    int iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i11, c22994r1M53376q);
                    AbstractC28683x.m87239G(c28655q4, c0209i12, interfaceC28653p1M87165m4);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i14, modifierM118962N4);
                    if (zM65745e) {
                        c28655q4.m87150e0(1302264550);
                        AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3419p(((float) 1.5d) * 4, c2314t), m87772i(c28655q4, 0), AbstractC33253j.m105486b(50), 0.0f, 4), c28655q4, 0);
                        C38072d c38072d6 = c38072d;
                        i17 = 6;
                        C28655q c28655q14 = c28655q4;
                        c0209i2 = c0209i12;
                        c2306l = c2306l2;
                        c0209i5 = c0209i11;
                        interfaceC4339a2 = interfaceC4339a;
                        c0209i4 = c0209i;
                        c0209i3 = c0209i14;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM87775c, c28655q4, 0), AbstractC27282u.m82299o(c2314t, AbstractC15673b0.m43972A()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q4, 6).getB4(), null, c28655q14, 0, 0, 196604);
                        C28655q c28655q15 = c28655q14;
                        z13 = false;
                        c28655q15.m87173q(false);
                        c38072d2 = c38072d6;
                        c28655q5 = c28655q15;
                    } else {
                        C38072d c38072d7 = c38072d;
                        c2306l = c2306l2;
                        c0209i2 = c0209i12;
                        c0209i3 = c0209i14;
                        c0209i4 = c0209i;
                        interfaceC4339a2 = interfaceC4339a;
                        c0209i5 = c0209i11;
                        i17 = 6;
                        c28655q4.m87150e0(1302888487);
                        C28655q c28655q16 = c28655q4;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM87775c, c28655q4, 0), null, c38072d7.m121949b(c28655q4, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q4, 6).getB4(), null, c28655q16, 0, 0, 196602);
                        C28655q c28655q17 = c28655q16;
                        z13 = false;
                        c28655q17.m87173q(false);
                        c38072d2 = c38072d7;
                        c28655q5 = c28655q17;
                    }
                    c28655q5.m87173q(true);
                    c28655q5.m87173q(z13);
                    c23454a0 = C23454a0.f92919a;
                    c38072d3 = c38072d2;
                    c28655q6 = c28655q5;
                }
                if (c23454a0 == null) {
                    c28655q6 = c28655q4;
                    c28655q6.m87150e0(852662462);
                    AbstractC22953f.m66715b(c28655q6, c2314t);
                } else {
                    c28655q6 = c28655q4;
                    c28655q6.m87150e0(852620426);
                }
                c28655q6.m87173q(z13);
                TextResource textResourceM87774b = viewState.getExpiresAtText();
                if (textResourceM87774b == null) {
                    c28655q6.m87150e0(662832088);
                    c28655q6.m87173q(z13);
                    interfaceC4339a4 = interfaceC4339a2;
                    c0209i10 = c0209i5;
                    c0209i9 = c0209i2;
                    c0209i7 = c0209i4;
                    c0209i8 = c0209i3;
                    z14 = true;
                    c28655q7 = c28655q6;
                } else {
                    c28655q6.m87150e0(662832089);
                    C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 0.5d, f14, c2306l, c28655q6, 54);
                    int iHashCode5 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q6.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q6, c2314t);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q6.m87163l(interfaceC4339a3);
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q6.m87178s0();
                    }
                    C0209i c0209i15 = c0209i5;
                    AbstractC28683x.m87239G(c28655q6, c0209i15, c22994r1M53376q2);
                    C0209i c0209i16 = c0209i2;
                    AbstractC28683x.m87239G(c28655q6, c0209i16, interfaceC28653p1M87165m5);
                    if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode5))) {
                        c0209i6 = c0209i4;
                        AbstractC11266d.m30471y(iHashCode5, c28655q6, iHashCode5, c0209i6);
                    } else {
                        c0209i6 = c0209i4;
                    }
                    C0209i c0209i17 = c0209i3;
                    AbstractC28683x.m87239G(c28655q6, c0209i17, modifierM118962N5);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(AbstractC16272a.f62153s0, c28655q6, i17);
                    long white71 = c38072d3.m121949b(c28655q6, i17).getWhite70();
                    float f16 = 4;
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f16 * f16, c2314t);
                    c0209i7 = c0209i6;
                    c0209i8 = c0209i17;
                    c0209i9 = c0209i16;
                    AbstractC23164r1.m67133b(c27430eM107874S, null, modifierM3419p, white71, c28655q6, 432, 0);
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM87774b, c28655q6, 0);
                    C2886a c2886aM8423d = c38072d3.m121952e(c28655q6, 6).getB4();
                    long white72 = c38072d3.m121949b(c28655q6, 6).getWhite70();
                    C28655q c28655q18 = c28655q6;
                    c0209i10 = c0209i15;
                    interfaceC4339a4 = interfaceC4339a3;
                    AbstractC30795n.m94707h(strM21274h2, null, white72, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q18, 0, 0, 196602);
                    C28655q c28655q19 = c28655q18;
                    z14 = true;
                    c28655q19.m87173q(true);
                    z13 = false;
                    c28655q19.m87173q(false);
                    c28655q7 = c28655q19;
                }
                c28655q7.m87173q(z14);
                c28655q7.m87173q(z13);
                c28655q8 = c28655q7;
                z15 = z14;
                c38072d4 = c38072d3;
            }
            c28655q8.m87173q(z15);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q8, 48);
            int iHashCode6 = Long.hashCode(c28655q8.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q8.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q8, c2314t);
            c28655q8.m87158i0();
            if (c28655q8.f115903S) {
                c28655q8.m87163l(interfaceC4339a4);
            } else {
                c28655q8.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q8, c0209i10, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q8, c0209i9, interfaceC28653p1M87165m6);
            if (c28655q8.f115903S || !AbstractC22676k.m65745e(c28655q8.m87133R(), Integer.valueOf(iHashCode6))) {
                AbstractC11266d.m30471y(iHashCode6, c28655q8, iHashCode6, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q8, c0209i8, modifierM118962N6);
            if (viewState.getLastUpdatedAtText() == null) {
                c28655q8.m87150e0(-289668369);
                TextResource textResourceM87779h = viewState.getIsNewText();
                if (textResourceM87779h == null) {
                    c28655q8.m87150e0(-389784846);
                    z16 = false;
                } else {
                    z16 = false;
                    c28655q8.m87150e0(-389784845);
                    m87770g(textResourceM87779h, c28655q8, 0);
                }
                c28655q8.m87173q(z16);
                c28655q8.m87173q(z16);
            } else {
                c28655q8.m87150e0(-389751737);
                c28655q8.m87173q(false);
            }
            AbstractC23164r1.m67133b(AbstractC34132o.m107874S(c38072d4.m121951d().getTinyIcons().getForwardArrow(), c28655q8, 6), null, AbstractC1102d.m3419p(3 * 4, AbstractC1099a.m3398t(c2314t, 1 * f14, 0.0f, 0.0f, 0.0f, 14)), c38072d4.m121949b(c28655q8, 6).getWhite70(), c28655q8, 432, 0);
            c28655q8.m87173q(true);
            c28655q8.m87173q(true);
            modifier3 = modifier5;
            c28655q = c28655q8;
        } else {
            c28655q9.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q9;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f((Object) modifier3, (Object) viewState, onClick, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m87768e(C28857e c28857e, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator<T> it = c28857e.m87777f().iterator();
            while (it.hasNext()) {
                AbstractC17746g1.m50872h((C17750h1) it.next(), null, null, c28655q, 0, 6);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m87769f(Modifier modifier, C28857e c28857e, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m87767d(modifier, c28857e, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m87770g(TextResource textResource, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1673800018);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i14 & 14);
            C38072d c38072d = C38072d.f163053a;
            float f13 = 8;
            float f14 = 1 * f13;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC1099a.m3398t(C2314t.f9131w, f14, 0.0f, 0.0f, 0.0f, 14), c38072d.m121949b(c28655q2, 6).getBrandWhite(), AbstractC33253j.m105486b(50)), f14, ((float) 0.5d) * f13), c38072d.m121949b(c28655q2, 6).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB4(), null, c28655q, 0, 0, 196600);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(textResource, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m87771h(TextResource textResource, int i13, Composer composer, int i14) {
        m87770g(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final AbstractC17911t m87772i(Composer composer, int i13) {
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4287324927L)), new C17919x(AbstractC17918w0.m51517e(4283487743L))), 0L, 0L, 14);
    }
}
