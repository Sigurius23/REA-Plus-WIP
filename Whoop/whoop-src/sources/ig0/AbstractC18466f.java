package ig0;

import a80.C0546j;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d30.C11558r;
import gb1.AbstractC15673b0;
import gg0.C15824c;
import gg0.InterfaceC15822a;
import hy0.C17794v;
import if0.C18451b;
import ih0.AbstractC18489d0;
import kotlin.C2032u;
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
import p043c4.C3948a0;
import p132f0.C13821r1;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ig0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lgg0/c;", "viewState", "Lkotlin/Function1;", "Lgg0/a;", "Ll83/a0;", "onEvent", "Lf0/r1;", "scrollState", "f", "(Lgg0/c;Lkotlin/jvm/functions/Function1;Lf0/r1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs-join_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18466f {

    /* JADX INFO: renamed from: ig0.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.view.UpdateTestsPopUpDialogKt$UpdateTestsPopUpDialog$1$1", m100430f = "UpdateTestsPopUpDialog.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71898w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15824c f71899x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f71900y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15824c c15824c, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71899x = c15824c;
            this.f71900y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f71899x, this.f71900y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f71898w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C15824c.c cVarM44643d = this.f71899x.getScreenContent();
            if (cVarM44643d != null) {
                this.f71900y.invoke(new InterfaceC15822a.k(cVarM44643d.getSelectedSegmentId(), cVarM44643d.getInitialSelectedSegmentId()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m53227f(C15824c viewState, Function1 onEvent, C13821r1 c13821r1, Composer composer, int i13, int i14) {
        int i15;
        C13821r1 c13821r1M92099U;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(376496512);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c13821r1M92099U = c13821r1;
                int i16 = c28655q.m87153g(c13821r1M92099U) ? 256 : 128;
                i15 |= i16;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i15 |= i16;
        } else {
            c13821r1M92099U = c13821r1;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
            } else if ((i14 & 4) != 0) {
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                i15 &= -897;
            }
            c28655q.m87175r();
            C15824c.e eVarM44642c = viewState.getPopUpDialog();
            if (eVarM44642c != null) {
                c28655q.m87150e0(2048331050);
                String strM44659a = eVarM44642c.getId();
                int i17 = i15 & 112;
                boolean zM87157i = c28655q.m87157i(viewState) | (i17 == 32);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new a(viewState, onEvent, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, strM44659a);
                boolean z4 = i17 == 32;
                Object objM87133R2 = c28655q.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C18451b(onEvent, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R2, new C3948a0(3), AbstractC37817c.m121344e(-171160654, c28655q, new C2032u((Object) c13821r1M92099U, (Object) eVarM44642c, (Object) viewState, onEvent, 15)), c28655q, 432);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2051675330);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C13821r1 c13821r2 = c13821r1M92099U;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 11, (Object) viewState, (Object) c13821r2, onEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m53228g(Function1 function1) {
        function1.invoke(InterfaceC15822a.e.f59724a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:31:0x016d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0189  */
    /* JADX WARN: Code duplicated, block: B:36:0x0195  */
    /* JADX WARN: Code duplicated, block: B:39:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ee  */
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
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m53229h(C13821r1 c13821r1, C15824c.e eVar, C15824c c15824c, Function1 function1, Composer composer, int i13) {
        float f13;
        int iHashCode;
        boolean z4;
        float f14;
        boolean zM87153g;
        Object objM87133R;
        C27256h c27256h;
        boolean zM87157i;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f15 = 3;
            float f16 = 8;
            float f17 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15 * f16, 0.0f, 2), f15, f17);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i14).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            float f18 = 1.0f;
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
            if (c28655q.f115903S) {
                f13 = f16;
            } else {
                f13 = f16;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                float f19 = 2 * f13;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(AbstractC15673b0.m44028b0(c2314t), f19, 0.0f, 2), c13821r1, 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(eVar.getTitle(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH3(), Float.valueOf(1.0f), c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65530);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19, c2314t));
                c28655q.m87150e0(755689744);
                for (C15824c.a aVar : eVar.m44660b()) {
                    c28655q.m87150e0(755691713);
                    for (InterfaceC25312u interfaceC25312u : aVar.m44644a()) {
                        z4 = interfaceC25312u instanceof C27256h;
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (z4) {
                            c28655q.m87150e0(437611555);
                            f14 = f18;
                            Modifier modifierM3409f = AbstractC1102d.m3409f(f14, c2314t);
                            c27256h = (C27256h) interfaceC25312u;
                            zM87157i = c28655q.m87157i(interfaceC25312u) | c28655q.m87157i(c15824c) | c28655q.m87153g(function1);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i || objM87133R2 == c28676v0) {
                                objM87133R2 = new C11558r(c15824c, function1, c27256h, 28);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC27249e.m82121d(modifierM3409f, c27256h, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 4);
                            c28655q.m87173q(false);
                        } else {
                            f14 = f18;
                            c28655q.m87150e0(438282922);
                            zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
                            objM87133R = c28655q.m87133R();
                            if (zM87153g || objM87133R == c28676v0) {
                                objM87133R = new C0546j(function1, interfaceC25312u, 10);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC18467g.m53255v(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                            c28655q.m87173q(false);
                        }
                        AbstractC11266d.m30469w(f17, f17, c2314t, c28655q);
                        f18 = f14;
                    }
                    c28655q.m87173q(false);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar.getSectionType().getSpacing(), c2314t));
                }
                AbstractC18489d0.m53356B(c28655q, false, c2314t, f19, c28655q);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            float f110 = 2 * f13;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(AbstractC15673b0.m44028b0(c2314t), f110, 0.0f, 2), c13821r1, 14);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(eVar.getTitle(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH3(), Float.valueOf(1.0f), c28655q, 0, (C2886a.f11498d << 18) | 12582912, 65530);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f110, c2314t));
            c28655q.m87150e0(755689744);
            while (r4.hasNext()) {
                c28655q.m87150e0(755691713);
                while (r14.hasNext()) {
                    z4 = interfaceC25312u instanceof C27256h;
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (z4) {
                        c28655q.m87150e0(437611555);
                        f14 = f18;
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(f14, c2314t);
                        c27256h = (C27256h) interfaceC25312u;
                        zM87157i = c28655q.m87157i(interfaceC25312u) | c28655q.m87157i(c15824c) | c28655q.m87153g(function1);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C11558r(c15824c, function1, c27256h, 28);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C11558r(c15824c, function1, c27256h, 28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27249e.m82121d(modifierM3409f2, c27256h, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 4);
                        c28655q.m87173q(false);
                    } else {
                        f14 = f18;
                        c28655q.m87150e0(438282922);
                        zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = new C0546j(function1, interfaceC25312u, 10);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C0546j(function1, interfaceC25312u, 10);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC18467g.m53255v(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    }
                    AbstractC11266d.m30469w(f17, f17, c2314t, c28655q);
                    f18 = f14;
                }
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar.getSectionType().getSpacing(), c2314t));
            }
            AbstractC18489d0.m53356B(c28655q, false, c2314t, f110, c28655q);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m53230i(C15824c c15824c, Function1 function1, InterfaceC25312u interfaceC25312u) {
        String strM44653d;
        C15824c.c cVarM44643d = c15824c.getScreenContent();
        if (cVarM44643d != null && (strM44653d = cVarM44643d.getSelectedSegmentId()) != null) {
            function1.invoke(new InterfaceC15822a.d((C27256h) interfaceC25312u, strM44653d, true));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m53231j(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC15822a.g(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m53232k(C15824c c15824c, Function1 function1, C13821r1 c13821r1, int i13, int i14, Composer composer, int i15) {
        m53227f(c15824c, function1, c13821r1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
