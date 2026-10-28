package p730qt2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import cz0.C11251l;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11361i0;
import p077d0.EnumC11408v0;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q81.C30048f;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qt2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, m65681d2 = {"Ll83/a0;", "f", "(Landroidx/compose/runtime/Composer;I)V", "m", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30604j {

    /* JADX INFO: renamed from: qt2.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.components.EndingPlanModalKt$LoadingCircle$1$1", m100430f = "EndingPlanModal.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125866w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11344e f125867x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11344e c11344e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125867x = c11344e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f125867x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125866w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11344e c11344e = this.f125867x;
                Float f13 = new Float(1.0f);
                C11361i0 c11361i0M30569q = AbstractC11348f.m30569q(AbstractC11348f.m30574v(1500, 0, null, 6), EnumC11408v0.f36577w, 4);
                this.f125866w = 1;
                if (C11344e.m30547d(c11344e, f13, c11361i0M30569q, null, this, 12) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m93897f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1007969621);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3394p(6 * 8, AbstractC1102d.m3407d(1.0f, c2314t).mo3471e(AbstractC15673b0.m44028b0(c2314t))), "progress_modal");
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
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
            m93904m(c28655q, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(27, c2314t));
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62268O1, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21273g, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH3(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
            c28655q = c28655q;
            AbstractC25012a.m73389v(c2314t, 30, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m93898g(int i13, Composer composer, int i14) {
        m93897f(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

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
    public static final void m93899h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-427431876);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11348f.m30553a(0.0f);
                c28655q.m87172p0(objM87133R);
            }
            C11344e c11344e = (C11344e) objM87133R;
            c28655q.m87150e0(1554830724);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            float fMo743q0 = interfaceC39171c.mo743q0(c38072d.m121948a(c28655q, i14).getStroke2Dp().f49345a);
            c28655q.m87173q(false);
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            boolean zM87157i = c28655q.m87157i(c11344e);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new a(c11344e, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c11344e);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean zM87151f = c28655q.m87151f(jM125430y) | c28655q.m87157i(c11344e) | c28655q.m87147d(fMo743q0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87151f || objM87133R3 == c28676v0) {
                objM87133R3 = new C11251l(jM125430y, c11344e, fMo743q0);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R3, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m93900i(long j7, C11344e c11344e, float f13, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC22131e.m63380P(Canvas, j7, 270.0f, ((Number) c11344e.m30549e()).floatValue() * 360.0f, 0L, 0L, 0.0f, new C22135i(f13, 0.0f, 1, 0, null, 26), 880);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m93901j(int i13, Composer composer, int i14) {
        m93899h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m93902k(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1866972590);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            C13825t c13825tM48880a = AbstractC17269i.m48880a(2, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10());
            AbstractC22989q.m66760a(AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifierM3407d, c13825tM48880a.f49346b, AbstractC33253j.f138651a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m93903l(int i13, Composer composer, int i14) {
        m93902k(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m93904m(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-171117214);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2307m c2307m = C2299e.f9102E;
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(((float) 22.5d) * f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
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
            m93902k(c28655q, 0);
            m93899h(c28655q, 0);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16272a.f61891A3, c28655q, 6), null, AbstractC1102d.m3419p(8 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m93905n(int i13, Composer composer, int i14) {
        m93904m(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
