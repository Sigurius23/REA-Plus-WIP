package p703ct1;

import a01.C0089i;
import a41.C0373i;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bt1.C3620a;
import bt1.C3622c;
import bt1.C3625f;
import bt1.InterfaceC3621b;
import bt1.InterfaceC3623d;
import c41.C4007d1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.C9813i;
import ec3.InterfaceC13058l;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import jf3.C21647a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p000.C29656q;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p635y2.C39102j;
import p701ce2.C4493a;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p720m91.AbstractC25303l;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.C39336i;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rs1.AbstractC31794f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ss1.C32948a;
import ss1.EnumC32949b;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: ct1.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00152\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lkotlin/Function1;", "Lbt1/b$c;", "Ll83/a0;", "onNavEvent", "Lss1/a;", "analytics", "r", "(Lkotlin/jvm/functions/Function1;Lss1/a;Landroidx/compose/runtime/Composer;II)V", "Lbt1/d;", "viewState", "Lbt1/b;", "onEvent", "q", "(Lbt1/d;Lkotlin/jvm/functions/Function1;Lss1/a;Landroidx/compose/runtime/Composer;II)V", "Lbt1/d$a;", "k", "(Lbt1/d$a;Lkotlin/jvm/functions/Function1;Lss1/a;Landroidx/compose/runtime/Composer;II)V", "Lbt1/a;", "item", "o", "(Lbt1/a;Landroidx/compose/runtime/Composer;I)V", "Lbt1/d$b;", "x", "(Lbt1/d$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lbt1/c;", "viewModel", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {

    /* JADX INFO: renamed from: ct1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f35303w = new a();

        /* JADX INFO: renamed from: a */
        public final long m30066a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30066a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ct1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f35304w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f35305x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f35306y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f35307z;

        /* JADX INFO: renamed from: ct1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f35308w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f35308w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f35308w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f35304w = c38266c;
            this.f35305x = interfaceC35951a;
            this.f35306y = interfaceC4339a;
            this.f35307z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, bt1.c] */
        @Override // c93.InterfaceC4339a
        public final C3622c invoke() {
            return AbstractC21598x.m60668X(this.f35304w, this.f35305x, new a(this.f35307z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3622c.class), null, this.f35306y);
        }
    }

    /* JADX INFO: renamed from: ct1.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.about.view.LabradorAboutScreenKt$LabradorAboutScreen$1$1", m100430f = "LabradorAboutScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f35309w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f35310x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f35310x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f35310x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f35309w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Function1.m30058s(this.f35310x).m10994p(InterfaceC3621b.b.f14718a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m30038A(InterfaceC3623d.b bVar, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m30063x(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x0176  */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0233  */
    /* JADX WARN: Code duplicated, block: B:71:0x0250  */
    /* JADX WARN: Code duplicated, block: B:74:0x029b  */
    /* JADX WARN: Code duplicated, block: B:75:0x029d  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e6 A[LOOP:1: B:84:0x02e0->B:86:0x02e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0384  */
    /* JADX WARN: Code duplicated, block: B:91:0x038e  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
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
    private static final void m30050k(InterfaceC3623d.a aVar, p715kotlin.jvm.functions.Function1 function1, C32948a c32948a, Composer composer, int i13, int i14) {
        C32948a c32948a2;
        boolean z4;
        C32948a c32948a3;
        C28677v1 c28677v1M87180u;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i15;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v0;
        int iHashCode2;
        C28655q c28655q;
        Iterator<T> it;
        Object objM87133R2;
        boolean z14;
        boolean z15;
        Object objM87133R3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-766915487);
        int i16 = (i13 & 6) == 0 ? (c28655q2.m87157i(aVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                c32948a2 = c32948a;
                i16 |= c28655q2.m87157i(c32948a2) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    c32948a3 = null;
                } else {
                    c32948a3 = c32948a2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM94757f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(aVar.getTitle(), null, Integer.valueOf(aVar.getIcon()), AbstractC30060g.m92103Y(c28655q2, AbstractC31794f.f131631M), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i15 = i16 & 112;
                if (i15 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C9813i(function1, 5);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                float f13 = 2 * 8;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(aVar.getAboutTitle(), c28655q2, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getT2(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(aVar.getAboutImage(), null, null, c28655q2, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3411h(80 * 4, AbstractC1102d.m3409f(1.0f, c2314t)), null, C39102j.f168200b, 0.0f, null, c28655q2, 25008, 104);
                c28655q = c28655q2;
                c28655q.m87150e0(-2133216019);
                for (C3625f c3625f : aVar.m11001g()) {
                    C39282o.Companion companion = C39282o.INSTANCE;
                    TextResource textResourceM11016c = c3625f.getTileLabel();
                    C39274g c39274g = new C39274g(c3625f.getCaretIcon(), null, 2, 0 == true ? 1 : 0);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = a.f35303w;
                        c28655q.m87172p0(objM87133R2);
                    }
                    C39282o c39282oM125229d = C39282o.Companion.m125229d(companion, textResourceM11016c, null, null, null, null, null, null, c39274g, p745y81.Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R2), null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388222, null);
                    boolean zM87157i = c28655q.m87157i(c3625f) | c28655q.m87157i(c32948a3);
                    if (i15 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i | z14;
                    objM87133R3 = c28655q.m87133R();
                    if (z15 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C29656q(c3625f, c32948a3, function1, 24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q3 = c28655q;
                    AbstractC25303l.m74291r(c39282oM125229d, null, null, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q3, C39282o.f168987q, 6);
                    c28655q = c28655q3;
                }
                AbstractC18489d0.m53356B(c28655q, false, c2314t, f13, c28655q);
                c28655q.m87150e0(-2133166024);
                it = aVar.m10998d().iterator();
                while (it.hasNext()) {
                    m30054o((C3620a) it.next(), c28655q, TextResource.$stable);
                    C28655q c28655q4 = c28655q;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q4, 0, 255);
                    c28655q = c28655q4;
                }
                c28655q.m87173q(false);
                TextResource textResourceM11000f = aVar.getManufacturerLabel();
                int i19 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM11000f, c28655q, i19);
                C38072d c38072d2 = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                long jM125430y = c38072d2.m121949b(c28655q, i24).getBrandWhite();
                C2886a c2886aM8420a = c38072d2.m121952e(c28655q, i24).getB1();
                int i25 = C2886a.f11498d << 18;
                C28655q c28655q5 = c28655q;
                AbstractC30795n.m94707h(strM21274h2, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q5, 0, i25, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getManufacturerAddress(), c28655q5, i19), null, c38072d2.m121949b(c28655q5, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q5, i24).getB1(), null, c28655q5, 0, i25, 196602);
                c28655q2 = c28655q5;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
            } else {
                c28655q2.m87138X();
                c32948a3 = c32948a2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(i13, i14, 19, aVar, c32948a3, function1);
            }
        }
        i16 |= 384;
        c32948a2 = c32948a;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                c32948a3 = null;
            } else {
                c32948a3 = c32948a2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM94757f2 = AbstractC30802r.m94757f(c2314t2, 1.0f);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM94757f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            AbstractC6721d.a aVar3 = new AbstractC6721d.a(aVar.getTitle(), null, Integer.valueOf(aVar.getIcon()), AbstractC30060g.m92103Y(c28655q2, AbstractC31794f.f131631M), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            i15 = i16 & 112;
            if (i15 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z13) {
                objM87133R = new C9813i(function1, 5);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C9813i(function1, 5);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar3, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
            float f14 = 2 * 8;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t2));
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(c2314t2, f14, 0.0f, 2), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k2, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            String strM21274h3 = AbstractC8693b.m21274h(aVar.getAboutTitle(), c28655q2, TextResource.$stable);
            C38072d c38072d3 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h3, null, c38072d3.m121949b(c28655q2, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i110).getT2(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(aVar.getAboutImage(), null, null, c28655q2, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3411h(80 * 4, AbstractC1102d.m3409f(1.0f, c2314t2)), null, C39102j.f168200b, 0.0f, null, c28655q2, 25008, 104);
            c28655q = c28655q2;
            c28655q.m87150e0(-2133216019);
            while (r3.hasNext()) {
                C39282o.Companion companion2 = C39282o.INSTANCE;
                TextResource textResourceM11016c2 = c3625f.getTileLabel();
                C39274g c39274g2 = new C39274g(c3625f.getCaretIcon(), null, 2, 0 == true ? 1 : 0);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = a.f35303w;
                    c28655q.m87172p0(objM87133R2);
                }
                C39282o c39282oM125229d2 = C39282o.Companion.m125229d(companion2, textResourceM11016c2, null, null, null, null, null, null, c39274g2, p745y81.Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R2), null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388222, null);
                boolean zM87157i2 = c28655q.m87157i(c3625f) | c28655q.m87157i(c32948a3);
                if (i15 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i2 | z14;
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C29656q(c3625f, c32948a3, function1, 24);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C29656q(c3625f, c32948a3, function1, 24);
                    c28655q.m87172p0(objM87133R3);
                }
                C28655q c28655q6 = c28655q;
                AbstractC25303l.m74291r(c39282oM125229d2, null, null, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q6, C39282o.f168987q, 6);
                c28655q = c28655q6;
            }
            AbstractC18489d0.m53356B(c28655q, false, c2314t2, f14, c28655q);
            c28655q.m87150e0(-2133166024);
            it = aVar.m10998d().iterator();
            while (it.hasNext()) {
                m30054o((C3620a) it.next(), c28655q, TextResource.$stable);
                C28655q c28655q7 = c28655q;
                AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q7, 0, 255);
                c28655q = c28655q7;
            }
            c28655q.m87173q(false);
            TextResource textResourceM11000f2 = aVar.getManufacturerLabel();
            int i111 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(textResourceM11000f2, c28655q, i111);
            C38072d c38072d4 = C38072d.f163053a;
            int i26 = C38072d.f163054b;
            long jM125430y2 = c38072d4.m121949b(c28655q, i26).getBrandWhite();
            C2886a c2886aM8420a2 = c38072d4.m121952e(c28655q, i26).getB1();
            int i27 = C2886a.f11498d << 18;
            C28655q c28655q8 = c28655q;
            AbstractC30795n.m94707h(strM21274h4, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q8, 0, i27, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getManufacturerAddress(), c28655q8, i111), null, c38072d4.m121949b(c28655q8, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q8, i26).getB1(), null, c28655q8, 0, i27, 196602);
            c28655q2 = c28655q8;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t2));
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
        } else {
            c28655q2.m87138X();
            c32948a3 = c32948a2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(i13, i14, 19, aVar, c32948a3, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m30051l(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC3621b.a.f14717a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m30052m(C3625f c3625f, C32948a c32948a, p715kotlin.jvm.functions.Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e c9598eM11015b = c3625f.getDestination();
        if (c9598eM11015b != null) {
            AppScreen screen = c9598eM11015b.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
            if (AbstractC22676k.m65745e(screen, AppScreen.C9330i2.f27668w)) {
                if (c32948a != null) {
                    c32948a.m104033g(EnumC32949b.LEARN_ABOUT);
                }
                function1.invoke(InterfaceC3621b.e.f14721a);
            } else if (AbstractC22676k.m65745e(screen, AppScreen.C9457y2.f28061w)) {
                if (c32948a != null) {
                    c32948a.m104033g(EnumC32949b.IFU);
                }
                function1.invoke(new InterfaceC3621b.d(c9598eM11015b));
            } else if (AbstractC22676k.m65745e(screen, AppScreen.C9339j3.f27696w)) {
                if (c32948a != null) {
                    c32948a.m104033g(EnumC32949b.REG_DETAILS);
                }
                function1.invoke(new InterfaceC3621b.f(c9598eM11015b));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m30053n(InterfaceC3623d.a aVar, p715kotlin.jvm.functions.Function1 function1, C32948a c32948a, int i13, int i14, Composer composer, int i15) {
        m30050k(aVar, function1, c32948a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m30054o(C3620a c3620a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(335481065);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c3620a) : c28655q.m87157i(c3620a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            TextResource textResourceM10985a = c3620a.getLabel();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM10985a, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i16).getB1();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i17, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3620a.getValue(), c28655q, i15), null, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 0, i17, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c3620a, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m30055p(C3620a c3620a, int i13, Composer composer, int i14) {
        m30054o(c3620a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m30056q(InterfaceC3623d viewState, p715kotlin.jvm.functions.Function1 onEvent, C32948a c32948a, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1106248113);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(c32948a) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                c32948a = null;
            }
            C32948a c32948a2 = c32948a;
            if (viewState instanceof InterfaceC3623d.b) {
                c28655q.m87150e0(-2047445286);
                m30063x((InterfaceC3623d.b) viewState, onEvent, c28655q, i15 & 126);
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof InterfaceC3623d.a)) {
                    throw AbstractC11895b.m32003v(-2047447425, c28655q, false);
                }
                c28655q.m87150e0(-2047442533);
                m30050k((InterfaceC3623d.a) viewState, onEvent, c32948a2, c28655q, i15 & 1022, 0);
                c28655q.m87173q(false);
            }
            c32948a = c32948a2;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(i13, i14, 18, viewState, c32948a, onEvent);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m30057r(p715kotlin.jvm.functions.Function1 onNavEvent, C32948a c32948a, Composer composer, int i13, int i14) {
        int i15;
        C32948a c32948a2;
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1055711103);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(onNavEvent) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c32948a) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C32948a c32948a3 = i16 != 0 ? null : c32948a;
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC13058l viewState = m30058s(interfaceC23462h).getViewState();
            InterfaceC3623d.b bVarM11010b = InterfaceC3623d.b.INSTANCE.m11010b();
            int i17 = AbstractC33208p0.f138461d;
            int i18 = TextResource.$stable;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, bVarM11010b, null, c28655q, (((i17 | i18) | i18) | i18) << 3, 2);
            C3622c c3622cM30058s = m30058s(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(interfaceC23462h);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new c(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c3622cM30058s);
            InterfaceC3623d interfaceC3623dM30059t = m30059t(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i15 & 14) == 4);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4493a(onNavEvent, interfaceC23462h, 1);
                c28655q.m87172p0(objM87133R3);
            }
            C32948a c32948a4 = c32948a3;
            m30056q(interfaceC3623dM30059t, (p715kotlin.jvm.functions.Function1) objM87133R3, c32948a4, c28655q, (i15 << 3) & 896, 0);
            c32948a2 = c32948a4;
        } else {
            c28655q.m87138X();
            c32948a2 = c32948a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(onNavEvent, i13, c32948a2, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C3622c m30058s(InterfaceC23462h interfaceC23462h) {
        return (C3622c) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: t */
    private static final InterfaceC3623d m30059t(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC3623d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m30060u(p715kotlin.jvm.functions.Function1 function1, InterfaceC23462h interfaceC23462h, InterfaceC3621b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC3621b.g) {
            m30058s(interfaceC23462h).m10994p((InterfaceC3621b.g) event);
        } else {
            if (!(event instanceof InterfaceC3621b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m30061v(p715kotlin.jvm.functions.Function1 function1, C32948a c32948a, int i13, int i14, Composer composer, int i15) {
        m30057r(function1, c32948a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m30062w(InterfaceC3623d interfaceC3623d, p715kotlin.jvm.functions.Function1 function1, C32948a c32948a, int i13, int i14, Composer composer, int i15) {
        m30056q(interfaceC3623d, function1, c32948a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m30063x(InterfaceC3623d.b viewState, p715kotlin.jvm.functions.Function1 onEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-911610288);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            AbstractC33208p0 abstractC33208p0M11008f = viewState.getType();
            TextResource textResourceM11007e = viewState.getSupportText();
            TextResource textResourceM11005c = viewState.getPrimaryButtonText();
            int i16 = i15 & 112;
            boolean z4 = i16 == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C9813i(onEvent, 3);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            TextResource textResourceM11006d = viewState.getSecondaryButtonText();
            boolean z13 = i16 == 32;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C9813i(onEvent, 4);
                c28655q2.m87172p0(objM87133R2);
            }
            int i17 = 196608 | AbstractC33208p0.f138461d;
            int i18 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(abstractC33208p0M11008f, textResourceM11007e, null, textResourceM11005c, interfaceC4339a, true, false, textResourceM11006d, (InterfaceC4339a) objM87133R2, null, false, false, c28655q, i17 | (i18 << 3) | (i18 << 9) | (i18 << 21), 0, 3652);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(viewState, onEvent, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m30064y(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC3621b.b.f14718a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m30065z(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC3621b.a.f14717a);
        return C23454a0.f92919a;
    }
}
