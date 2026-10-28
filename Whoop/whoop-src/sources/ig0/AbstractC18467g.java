package ig0;

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
import d30.C11558r;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gg0.C15824c;
import gg0.InterfaceC15822a;
import h02.C16576i;
import hy0.C17794v;
import i21.C18008r;
import ib0.C18332c;
import if0.C18451b;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.WeakHashMap;
import l83.C23454a0;
import l83.InterfaceC23459e;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
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
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ig0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lgg0/c$c;", "viewState", "Lf0/r1;", "scrollState", "Lkotlin/Function1;", "Lgg0/a;", "Ll83/a0;", "onEvent", "o", "(Lgg0/c$c;Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lgg0/c$d;", "sticky", "k", "(Lgg0/c$d;Lkotlin/jvm/functions/Function1;Lgg0/c$c;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "item", "", "v", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "hasViewEventSent", "advanced-labs-join_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18467g {

    /* JADX INFO: renamed from: ig0.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.view.UpdateTestsScreenContentKt$UpdateTestsScreenContent$1$1", m100430f = "UpdateTestsScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71901w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f71902x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15824c.c f71903y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f71904z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C15824c.c cVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71902x = function1;
            this.f71903y = cVar;
            this.f71904z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f71902x, this.f71903y, this.f71904z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f71901w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC18467g.m53250q(this.f71904z)) {
                AbstractC18467g.m53251r(this.f71904z, true);
                this.f71902x.invoke(new InterfaceC15822a.l(this.f71903y.getSource(), this.f71903y.getSelectedSegmentId()));
            }
            return C23454a0.f92919a;
        }
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
    /* JADX INFO: renamed from: k */
    private static final void m53244k(C15824c.d dVar, Function1 function1, C15824c.c cVar, Composer composer, int i13) {
        C2314t c2314t;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1631659752);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(dVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(cVar) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), ((float) 2.5d) * f13, 0.0f, 2);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3398t(modifierM3396r, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a(), 7), 0.0f, 1 * f13, 0.0f, 3 * f13, 5);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, C2299e.f9111N, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM44658b = dVar.getText();
            if (strM44658b == null) {
                c28655q.m87150e0(462238544);
                c28655q.m87173q(false);
                c2314t = c2314t2;
                z4 = false;
            } else {
                c28655q.m87150e0(462238545);
                String strM21275i = AbstractC8693b.m21275i(strM44658b, c28655q, 0);
                C21053l c21053l = C21053l.f79834a;
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                c2314t = c2314t2;
                z4 = false;
                AbstractC21048g.m58807M(strM21275i, null, true, c21053l.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q, i15), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32764), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 384, 498);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(292018026);
            for (InterfaceC25312u interfaceC25312u : dVar.m44657a()) {
                boolean z13 = interfaceC25312u instanceof C27256h;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13) {
                    c28655q.m87150e0(-1113726942);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C27256h c27256h = (C27256h) interfaceC25312u;
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | ((i14 & 112) == 32 ? true : z4) | c28655q.m87157i(cVar);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C11558r(function1, c27256h, cVar, 29);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27249e.m82121d(modifierM3409f, c27256h, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(-1113310550);
                    boolean zM87157i2 = c28655q.m87157i(interfaceC25312u) | ((i14 & 112) == 32 ? true : z4);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C0546j(function1, interfaceC25312u, 12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R2, c28655q, 0, 6);
                    c28655q.m87173q(z4);
                }
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(i13, 12, dVar, cVar, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m53245l(Function1 function1, InterfaceC25312u interfaceC25312u, C15824c.c cVar) {
        function1.invoke(new InterfaceC15822a.d((C27256h) interfaceC25312u, cVar.getSelectedSegmentId(), false));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m53246m(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC15822a.g(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m53247n(C15824c.d dVar, Function1 function1, C15824c.c cVar, int i13, Composer composer, int i14) {
        m53244k(dVar, function1, cVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m53248o(C15824c.c cVar, C13821r1 c13821r1, Function1 onEvent, Composer composer, int i13, int i14) {
        C13821r1 c13821r1M92099U;
        C28676v0 c28676v0;
        C15824c.c viewState = cVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1702295075);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c13821r1M92099U = c13821r1;
                int i16 = c28655q.m87153g(c13821r1M92099U) ? 32 : 16;
                i15 |= i16;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i15 |= i16;
        } else {
            c13821r1M92099U = c13821r1;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
            } else if ((i14 & 2) != 0) {
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                i15 &= -113;
            }
            c28655q.m87175r();
            Object[] objArr = new Object[0];
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R == c28676v1) {
                objM87133R = new C18008r(19);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 48);
            int i17 = i15 & 896;
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | (i17 == 256) | c28655q.m87157i(viewState);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v1) {
                objM87133R2 = new a(onEvent, viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewState);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            int i18 = i15;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC6721d.a aVar = new AbstractC6721d.a(cVar.getDisplayRefreshingAnimation() ? AbstractC8693b.m21278l("") : cVar.getToolbarTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, c2314t);
            boolean z4 = i17 == 256;
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v1) {
                objM87133R3 = new C18451b(onEvent, 2);
                c28655q.m87172p0(objM87133R3);
            }
            C28676v0 c28676v2 = c28676v1;
            AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            AbstractC1090b.m3351f(cVar.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C18462b.f71889a.m53207c(), c28655q, 224640, 2);
            c28655q.m87173q(true);
            float f14 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC15674c.m44089m(c2314t, 0.0f, 1, null), f14, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(modifierM3396r.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r1M92099U, 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            c28655q.m87150e0(1796805096);
            for (C15824c.a aVar2 : cVar.m44652c()) {
                c28655q.m87150e0(1796806833);
                for (InterfaceC25312u interfaceC25312u : aVar2.m44644a()) {
                    boolean zM87157i = (i17 == 256) | c28655q.m87157i(interfaceC25312u);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        c28676v0 = c28676v2;
                    } else {
                        c28676v0 = c28676v2;
                        if (objM87133R4 == c28676v0) {
                        }
                        m53255v(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                        float f15 = 4;
                        AbstractC11266d.m30469w(f15, f15, c2314t, c28655q);
                        c28676v2 = c28676v0;
                    }
                    objM87133R4 = new C0546j(onEvent, interfaceC25312u, 11);
                    c28655q.m87172p0(objM87133R4);
                    m53255v(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                    float f16 = 4;
                    AbstractC11266d.m30469w(f16, f16, c2314t, c28655q);
                    c28676v2 = c28676v0;
                }
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar2.getSectionType().getSpacing(), c2314t));
            }
            AbstractC18489d0.m53356B(c28655q, false, c2314t, f14, c28655q);
            c28655q.m87173q(true);
            C15824c.d dVarM44655f = cVar.getSticky();
            if (dVarM44655f == null) {
                c28655q.m87150e0(-1317143230);
                c28655q.m87173q(false);
                viewState = cVar;
            } else {
                c28655q.m87150e0(-1317143229);
                viewState = cVar;
                m53244k(dVarM44655f, onEvent, viewState, c28655q, ((i18 >> 3) & 112) | ((i18 << 6) & 896));
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 12, (Object) viewState, (Object) c13821r1M92099U, (InterfaceC23459e) onEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC28601c1 m53249p() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final boolean m53250q(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m53251r(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m53252s(Function1 function1) {
        function1.invoke(InterfaceC15822a.f.f59725a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m53253t(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC15822a.g(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m53254u(C15824c.c cVar, C13821r1 c13821r1, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m53248o(cVar, c13821r1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m53255v(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2030434711);
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
                    objM87133R = new C18332c(18);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C18332c(19);
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
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m53256w(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m53257x(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m53258y(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m53255v(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
