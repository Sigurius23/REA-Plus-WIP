package nq2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b30.C2559k4;
import b30.C2635u4;
import b30.C2655x3;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c30.C3911b;
import c41.C4095p5;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import gz0.AbstractC16300g;
import j40.C21312a;
import java.io.IOException;
import kr2.AbstractC22813b;
import kr2.EnumC22818g;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26944e0;
import no0.C26984y0;
import no1.C26993g;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p077d0.C11393q0;
import p127ev.AbstractC13673n;
import p134f2.C14015d;
import p134f2.C14018g;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: nq2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006\""}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lnq2/f;", "state", "Ll83/a0;", "I", "(Landroidx/compose/ui/Modifier;Lnq2/f;Landroidx/compose/runtime/Composer;II)V", "Lnq2/a;", "item", "", "index", "", "isFirst", "isLast", "p", "(Landroidx/compose/ui/Modifier;Lnq2/a;IZZLandroidx/compose/runtime/Composer;II)V", "K", "(Landroidx/compose/ui/Modifier;Lnq2/a;ZZLandroidx/compose/runtime/Composer;II)V", "z", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "text", "D", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "x", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "t", "v", "Ly3/f;", "a", "F", "CONNECTOR_LINE_WIDTH", "b", "CONNECTOR_LINE_HEIGHT", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27062e {

    /* JADX INFO: renamed from: a */
    private static final float f108181a;

    /* JADX INFO: renamed from: b */
    private static final float f108182b;

    /* JADX INFO: renamed from: nq2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.cards.YearInReviewHighlightsListKt$YirAnimatedHighlightsListItem$1$1", m100430f = "YearInReviewHighlightsList.kt", m100431l = {125}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108183w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ long f108184x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C11393q0 f108185y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7, C11393q0 c11393q0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108184x = j7;
            this.f108185y = c11393q0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f108184x, this.f108185y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108183w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = this.f108184x;
                this.f108183w = 1;
                if (AbstractC3034m0.m8783c(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f108185y.m30628I0(Boolean.TRUE);
            return C23454a0.f92919a;
        }
    }

    static {
        float f13 = 4;
        f108181a = ((float) 0.5d) * f13;
        f108182b = 11 * f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m81303A(boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(-947719682);
            m81338x(null, c28655q, 0, 1);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-947644476);
            m81336v(null, c28655q, 0, 1);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m81304B(boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(-185839270);
            m81334t(null, c28655q, 0, 1);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-185761181);
            m81336v(null, c28655q, 0, 1);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m81305C(Modifier modifier, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m81340z(modifier, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: D */
    public static final void m81306D(Modifier modifier, TextResource text, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1508933687);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(text) : c28655q2.m87157i(text) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            float f13 = 3;
            float f14 = 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f13 * f14);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            float f15 = ((float) 0.25d) * f14;
            C17909s c17909s = AbstractC17911t.f69612b;
            long j7 = C17919x.f69629f;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC15751g.m44456i(f15, modifierM3409f, C17909s.m51483a(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.0f, j7)), new C17919x(C17919x.m51541c(0.05f, j7))), 0.0f, 0.0f, 14), c33252iM105489e), C17919x.f69636m, c33252iM105489e);
            boolean zM87153g = c28655q2.m87153g(c33252iM105489e);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C26944e0(c33252iM105489e, 1);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3358c, (Function1) objM87133R);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C26993g(7);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3479b = AbstractC1125a.m3479b(modifierM3486a, (Function1) objM87133R2);
            float f16 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3479b, 2 * f16, f13 * f16);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(text, c28655q2, TextResource.$stable | ((i15 >> 3) & 14));
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, true, Integer.MAX_VALUE, 0, null, c38072d.m121952e(c28655q2, i17).getB1(), null, c28655q2, 0, (C2886a.f11498d << 18) | 3456, 184314);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4095p5(modifier3, text, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m81307E(C33252i c33252i, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51554e(true);
        c17920x0.m51563t(c33252i);
        c17920x0.m51555f(2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C14018g m81308F(C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        C17909s c17909s = AbstractC17911t.f69612b;
        long j7 = C17919x.f69629f;
        return drawWithCache.m39910a(new C27060c(C17909s.m51483a(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.0f, j7)), new C17919x(C17919x.m51541c(0.1f, j7))), 0.0f, Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32)), 8), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m81309G(AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        InterfaceC22131e.m63385u(onDrawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 0, 126);
        ((C0238p0) onDrawWithContent).m728a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m81310H(Modifier modifier, TextResource textResource, int i13, int i14, Composer composer, int i15) {
        m81306D(modifier, textResource, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    public static final void m81311I(Modifier modifier, C27063f state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1897485056);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier4);
            C22961h c22961h = AbstractC22977m.f90654e;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h((75 * f13) / state.m81341a().size(), c2314t)));
            String strM21274h = AbstractC8693b.m21274h(state.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3398t(c2314t, 2 * 8, 0.0f, 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f13 * f13, c2314t)));
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3406c);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(2069994308);
            int i18 = 0;
            for (Object obj : state.m81341a()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                m81330p(null, (C27058a) obj, i18, i18 == 0, i18 == AbstractC37056f.m118951C(state.m81341a()), c28655q, TextResource.$stable << 3, 1);
                i18 = i19;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier3, state, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m81312J(Modifier modifier, C27063f c27063f, int i13, int i14, Composer composer, int i15) {
        m81311I(modifier, c27063f, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    public static final void m81313K(Modifier modifier, C27058a item, boolean z4, boolean z13, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        boolean z14;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1281702025);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(item) : c28655q.m87157i(item) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            z14 = z13;
            i15 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            z14 = z13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier2), 0.0f, 0.0f, 3 * 8, 0.0f, 11);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            int i17 = i15 >> 3;
            m81340z(AbstractC1102d.m3427x(c2314t, null, 3), z4, z14, c28655q, (i17 & 112) | 6 | (i17 & 896), 0);
            TextResource textResourceM81299a = item.getText();
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m81306D(new LayoutWeightElement(1.0f, true), textResourceM81299a, c28655q, TextResource.$stable << 3, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2559k4(modifier2, item, z4, z13, i13, i14, 3, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m81314L(Modifier modifier, C27058a c27058a, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m81313K(modifier, c27058a, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m81330p(Modifier modifier, final C27058a item, final int i13, final boolean z4, final boolean z13, Composer composer, final int i14, final int i15) {
        int i16;
        boolean z14;
        boolean z15;
        final Modifier modifier2;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2058613341);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(modifier) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? c28655q.m87153g(item) : c28655q.m87157i(item) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z14 = z4;
            i16 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            z14 = z4;
        }
        if ((i14 & 24576) == 0) {
            z15 = z13;
            i16 |= c28655q.m87155h(z15) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            z15 = z13;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 9363) != 9362)) {
            Modifier modifier3 = i17 != 0 ? C2314t.f9131w : modifier;
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(((double) i13) * 0.5d, DurationUnit.SECONDS);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C11393q0(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            C11393q0 c11393q0 = (C11393q0) objM87133R;
            boolean zM87151f = c28655q.m87151f(duration) | c28655q.m87157i(c11393q0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87151f || objM87133R2 == c28676v0) {
                objM87133R2 = new a(duration, c11393q0, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            AbstractC22813b.m66084k(c11393q0, null, AbstractC37817c.m121344e(811928403, c28655q, new C2655x3(c11393q0, modifier3, item, z14, z15)), c28655q, 384, 2);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: nq2.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC27062e.m81333s(modifier2, item, i13, z4, z13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m81331q(C11393q0 c11393q0, Modifier modifier, C27058a c27058a, boolean z4, boolean z13, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC22813b.m66094u(c11393q0, EnumC22818g.TOP, null, AbstractC37817c.m121344e(-1323219416, c28655q, new C2635u4(modifier, c27058a, z4, z13)), c28655q, 3120, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m81332r(Modifier modifier, C27058a c27058a, boolean z4, boolean z13, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m81313K(modifier, c27058a, z4, z13, c28655q, TextResource.$stable << 3, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m81333s(Modifier modifier, C27058a c27058a, int i13, boolean z4, boolean z13, int i14, int i15, Composer composer, int i16) {
        m81330p(modifier, c27058a, i13, z4, z13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final void m81334t(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1731937817);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3411h(f108182b, AbstractC1102d.m3424u(f108181a, modifier)), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC13673n.m38559f(C38072d.f163053a, c28655q, C38072d.f163054b, 0.1f)), new C17919x(C17919x.f69636m)), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 22, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m81335u(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m81334t(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m81336v(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-654367833);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(f108182b, AbstractC1102d.m3424u(f108181a, modifier)), AbstractC13673n.m38559f(C38072d.f163053a, c28655q, C38072d.f163054b, 0.1f), AbstractC17918w0.f69621a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 23, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m81337w(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m81336v(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m81338x(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1326715617);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3411h(f108182b, AbstractC1102d.m3424u(f108181a, modifier)), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(AbstractC13673n.m38559f(C38072d.f163053a, c28655q, C38072d.f163054b, 0.1f))), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 21, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m81339y(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m81338x(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m81340z(Modifier modifier, boolean z4, boolean z13, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1826132327);
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
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier2 = C2314t.f9131w;
            }
            AbstractC16300g.m46209n(modifier2, null, null, 3 * 4, 0.0f, true, AbstractC37817c.m121344e(-1087505826, c28655q, new C3911b(z4, 1)), AbstractC37817c.m121344e(1938791391, c28655q, new C3911b(z13, 2)), c28655q, (i15 & 14) | 14355456, 22);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21312a(modifier3, z4, z13, i13, i14);
        }
    }
}
