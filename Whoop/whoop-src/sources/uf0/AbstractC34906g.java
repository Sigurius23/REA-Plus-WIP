package uf0;

import a80.C0546j;
import a80.C0547k;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.WeakHashMap;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p127ev.AbstractC13673n;
import p132f0.C13821r1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import re1.C31324k;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sf0.C32445c;
import sf0.InterfaceC32443a;
import t01.C33259e;
import u71.C34569c;
import u91.C34656a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uf0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lsf0/c$d;", "viewState", "Lf0/r1;", "scrollState", "Lkotlin/Function1;", "Lsf0/a;", "Ll83/a0;", "onEvent", "j", "(Lsf0/c$d;Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "item", "", "s", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "hasViewEventSent", "advanced-labs-join_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34906g {

    /* JADX INFO: renamed from: uf0.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.join.view.AdvancedLabsJoinScreenContentKt$AdvancedLabsJoinScreenContent$1$1", m100430f = "AdvancedLabsJoinScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f146992w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f146993x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32445c.d f146994y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f146995z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C32445c.d dVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f146993x = function1;
            this.f146994y = dVar;
            this.f146995z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f146993x, this.f146994y, this.f146995z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f146992w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC34906g.m110069l(this.f146995z)) {
                AbstractC34906g.m110070m(this.f146995z, true);
                this.f146993x.invoke(new InterfaceC32443a.a(this.f146994y.getSource(), this.f146994y.getSelectedSegmentId()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v14, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v8, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r27v4, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r27v5, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v28 */
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
    /* JADX INFO: renamed from: j */
    public static final void m110067j(C32445c.d viewState, C13821r1 c13821r1, Function1 function1, Composer composer, int i13, int i14) {
        C13821r1 c13821r1M92099U;
        C13821r1 c13821r2;
        ?? r14;
        int i15;
        Object obj;
        ?? r10;
        int i16;
        C2314t c2314t;
        C28676v0 c28676v0;
        C28655q c28655q;
        boolean z4;
        C28676v0 c28676v1;
        ?? r15;
        C28676v0 c28676v2;
        ?? r16;
        C28676v0 c28676v3;
        Function1 onEvent = function1;
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-409856919);
        int i17 = (i13 & 6) == 0 ? (c28655q2.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c13821r1M92099U = c13821r1;
                int i18 = c28655q2.m87153g(c13821r1M92099U) ? 32 : 16;
                i17 |= i18;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i17 |= i18;
        } else {
            c13821r1M92099U = c13821r1;
        }
        if ((i13 & 384) == 0) {
            i17 |= c28655q2.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i17 & 1, (i17 & 147) != 146)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
                if ((i14 & 2) != 0) {
                    i17 &= -113;
                }
            } else if ((i14 & 2) != 0) {
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                i17 &= -113;
            }
            C13821r1 c13821r3 = c13821r1M92099U;
            int i19 = i17;
            c28655q2.m87175r();
            Object[] objArr = new Object[0];
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v4 = C28635l.f115821a;
            Object obj2 = objM87133R;
            if (objM87133R == c28676v4) {
                C34656a c34656a = new C34656a(10);
                c28655q2.m87172p0(c34656a);
                obj2 = c34656a;
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) obj2, c28655q2, 48);
            int i24 = i19 & 896;
            boolean zM87153g = c28655q2.m87153g(interfaceC28601c1) | (i24 == 256) | c28655q2.m87157i(viewState);
            Object objM87133R2 = c28655q2.m87133R();
            Object obj3 = objM87133R2;
            if (zM87153g || objM87133R2 == c28676v4) {
                a aVar = new a(onEvent, viewState, interfaceC28601c1, null);
                c28655q2.m87172p0(aVar);
                obj3 = aVar;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, viewState);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44038g0(AbstractC1102d.m3407d(1.0f, c2314t2)));
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(viewState.getDisplayRefreshingAnimation() ? AbstractC8693b.m21278l("") : viewState.getToolbarTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f13 = 8;
            float f14 = 1 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, c2314t2);
            boolean z13 = i24 == 256;
            Object objM87133R3 = c28655q2.m87133R();
            if (z13 || objM87133R3 == c28676v4) {
                i15 = 0;
                C34904e c34904e = new C34904e(function1, i15);
                c28655q2.m87172p0(c34904e);
                obj = c34904e;
            } else {
                i15 = 0;
                obj = objM87133R3;
            }
            C28676v0 c28676v5 = c28676v4;
            int i25 = i24;
            onEvent = function1;
            AbstractC6719b.m20143d(modifierM3394p, aVar2, null, (InterfaceC4339a) obj, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C34909j.f147008a.m110102c(), c28655q2, 224640, 2);
            c28655q2.m87173q(true);
            Modifier modifierM44089m = AbstractC15674c.m44089m(c2314t2, 0.0f, 1, null);
            float f15 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM44089m, f15, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(modifierM3396r.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r3, 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 48);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t2));
            c28655q2.m87150e0(-161694735);
            for (C32445c.b bVar : viewState.m101294b()) {
                c28655q2.m87150e0(-161692998);
                for (InterfaceC25312u interfaceC25312u : bVar.m101288b()) {
                    int i26 = i25;
                    boolean zM87157i = (i26 == 256) | c28655q2.m87157i(interfaceC25312u);
                    Object objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        c28676v3 = c28676v5;
                    } else {
                        c28676v3 = c28676v5;
                        if (objM87133R4 == c28676v3) {
                        }
                        m110076s(interfaceC25312u, (Function1) objM87133R4, c28655q2, 0, 0);
                        float f16 = 4;
                        AbstractC11266d.m30469w(f16, f16, c2314t2, c28655q2);
                        i25 = i26;
                        c28676v5 = c28676v3;
                    }
                    objM87133R4 = new C0546j(onEvent, interfaceC25312u, 29);
                    c28655q2.m87172p0(objM87133R4);
                    m110076s(interfaceC25312u, (Function1) objM87133R4, c28655q2, 0, 0);
                    float f17 = 4;
                    AbstractC11266d.m30469w(f17, f17, c2314t2, c28655q2);
                    i25 = i26;
                    c28676v5 = c28676v3;
                }
                c28655q2.m87173q(false);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(bVar.getInsetBottom().getSpacing(), c2314t2));
            }
            int i27 = i25;
            C28676v0 c28676v6 = c28676v5;
            AbstractC18489d0.m53356B(c28655q2, false, c2314t2, f15, c28655q2);
            c28655q2.m87173q(true);
            C32445c.e eVarM101297e = viewState.getSticky();
            if (eVarM101297e == null) {
                c28655q2.m87150e0(-108877663);
                c28655q2.m87173q(false);
                c13821r2 = c13821r3;
                z4 = true;
                r16 = c28655q2;
            } else {
                c28655q2.m87150e0(-108877662);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), ((float) 2.5d) * f13, 0.0f, 2);
                WeakHashMap weakHashMap = C22944c2.f90553v;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3398t(modifierM3396r2, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), 7), 0.0f, f14, 0.0f, 3 * f13, 5);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q2, 54);
                int iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                C0209i c0209i5 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                String strM101300b = eVarM101297e.getText();
                if (strM101300b == null) {
                    c28655q2.m87150e0(364428710);
                    c28655q2.m87173q(false);
                    r10 = 0;
                    c2314t = c2314t2;
                    c13821r2 = c13821r3;
                    i16 = i27;
                    c28676v0 = c28676v6;
                    c28655q = c28655q2;
                } else {
                    c28655q2.m87150e0(364428711);
                    String strM21275i = AbstractC8693b.m21275i(strM101300b, c28655q2, 0);
                    C21053l c21053l = C21053l.f79834a;
                    C38072d c38072d = C38072d.f163053a;
                    int i28 = C38072d.f163054b;
                    c13821r2 = c13821r3;
                    r10 = 0;
                    i16 = i27;
                    c2314t = c2314t2;
                    c28676v0 = c28676v6;
                    AbstractC21048g.m58807M(strM21275i, null, true, c21053l.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q2, i28), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q2, i28).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q2, (C21054m.f79836p << 9) | 384, 498);
                    C28655q c28655q3 = c28655q2;
                    c28655q3.m87173q(false);
                    c28655q = c28655q3;
                }
                c28655q.m87150e0(-1927891755);
                ?? r17 = c28655q;
                for (InterfaceC25312u interfaceC25312u2 : eVarM101297e.m101299a()) {
                    if (interfaceC25312u2 instanceof C27256h) {
                        r17.m87150e0(1132297104);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C27256h c27256h = (C27256h) interfaceC25312u2;
                        int i29 = (r17.m87157i(interfaceC25312u2) ? 1 : 0) | (r17.m87157i(viewState) ? 1 : 0) | (i16 == 256 ? 1 : r10);
                        Object objM87133R5 = r17.m87133R();
                        if (i29 == 0) {
                            c28676v2 = c28676v0;
                            if (objM87133R5 == c28676v2) {
                            }
                            obj = objM87133R5;
                            ?? r27 = r17;
                            c28676v1 = c28676v2;
                            AbstractC27249e.m82121d(modifierM3409f2, c27256h, null, (InterfaceC4339a) obj, r27, 6, 4);
                            r15 = r27;
                            r15.m87173q(r10);
                        } else {
                            c28676v2 = c28676v0;
                        }
                        obj = objM87133R5;
                        C31324k c31324k = new C31324k(onEvent, viewState, c27256h, 7);
                        r17.m87172p0(c31324k);
                        Object obj4 = c31324k;
                        obj4 = objM87133R5;
                        ?? r28 = r17;
                        c28676v1 = c28676v2;
                        AbstractC27249e.m82121d(modifierM3409f2, c27256h, null, (InterfaceC4339a) obj4, r28, 6, 4);
                        r15 = r28;
                        r15.m87173q(r10);
                    } else {
                        c28676v1 = c28676v0;
                        r17.m87150e0(1132834303);
                        int i34 = (r17.m87157i(interfaceC25312u2) ? 1 : 0) | (i16 == 256 ? 1 : r10);
                        Object objM87133R6 = r17.m87133R();
                        Object obj5 = objM87133R6;
                        if (i34 != 0 || objM87133R6 == c28676v1) {
                            C34905f c34905f = new C34905f(onEvent, interfaceC25312u2, (int) r10);
                            r17.m87172p0(c34905f);
                            obj5 = c34905f;
                        }
                        ?? r29 = r17;
                        AbstractC25303l.m74291r(interfaceC25312u2, null, null, (Function1) obj5, r29, 0, 6);
                        r15 = r29;
                        r15.m87173q(r10);
                    }
                    c28676v0 = c28676v1;
                    r17 = r15;
                }
                z4 = true;
                AbstractC25012a.m73392y(r17, r10, true, r10);
                r16 = r17;
            }
            r16.m87173q(z4);
            r14 = r16;
        } else {
            viewState = viewState;
            c28655q2.m87138X();
            c13821r2 = c13821r1M92099U;
            r14 = c28655q2;
        }
        C28677v1 c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(viewState, c13821r2, onEvent, i13, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC28601c1 m110068k() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final boolean m110069l(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m110070m(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m110071n(Function1 function1) {
        function1.invoke(InterfaceC32443a.e.f134354a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m110072o(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC32443a.f(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m110073p(Function1 function1, C32445c.d dVar, InterfaceC25312u interfaceC25312u) {
        function1.invoke(new InterfaceC32443a.j(dVar.getSelectedSegmentId()));
        function1.invoke(new InterfaceC32443a.f(interfaceC25312u, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m110074q(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC32443a.f(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m110075r(C32445c.d dVar, C13821r1 c13821r1, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m110067j(dVar, c13821r1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m110076s(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1797807375);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C34569c(16);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C34569c(17);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R2), null, function3, c28655q, (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m110077t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m110078u(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m110079v(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m110076s(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
