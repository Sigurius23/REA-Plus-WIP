package mr1;

import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9791o;
import io.sentry.config.AbstractC20301a;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p114eb.AbstractC12939a0;
import p114eb.C12997x0;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15011f9;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p392p3.C28780r;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf3.C29155a;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: mr1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m65681d2 = {"Leb/a0;", "globalNavController", "Ll83/a0;", "f", "(Leb/a0;Landroidx/compose/runtime/Composer;I)V", "Lmr1/k;", "viewModel", "Lmr1/l;", "viewState", "internal-tooling_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25920j {

    /* JADX INFO: renamed from: mr1.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f102335w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f102336x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f102337y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f102338z;

        /* JADX INFO: renamed from: mr1.j$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42024a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f102339w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42024a(C21647a c21647a) {
                super(0);
                this.f102339w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f102339w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f102335w = c38266c;
            this.f102336x = interfaceC35951a;
            this.f102337y = interfaceC4339a;
            this.f102338z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mr1.k] */
        @Override // c93.InterfaceC4339a
        public final C25921k invoke() {
            return AbstractC21598x.m60668X(this.f102335w, this.f102336x, new C42024a(this.f102338z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25921k.class), null, this.f102337y);
        }
    }

    /* JADX INFO: renamed from: mr1.j$b */
    @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchScreenKt$UniversalCheckoutDataFetchScreen$2$1", m100430f = "UniversalCheckoutDataFetchScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102340w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC12939a0 f102341x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f102342y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f102343z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC12939a0 abstractC12939a0, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102341x = abstractC12939a0;
            this.f102342y = interfaceC28670t2;
            this.f102343z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f102341x, this.f102342y, this.f102343z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f102340w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC25920j.m76662h(this.f102342y).getShouldNavigateToCheckout() && AbstractC25920j.m76662h(this.f102342y).getCartId() != null) {
                String strM76675a = AbstractC25920j.m76662h(this.f102342y).getCartId();
                C12997x0 c12997x0 = new C12997x0(true, false, -1, false, false, -1, -1, -1, -1);
                this.f102341x.m36403r(Uri.parse("android-app://com.whoop/UniversalCheckout?path=/commerce-service/v2/mobile/carts&payload={\"cart_items\":[{\"sku\":\"810114362662\",\"quantity\":1},{\"sku\":\"ALBL1-OTP-12M-STA\",\"quantity\":1}]}&source=debug&cartId=" + strM76675a), c12997x0);
                AbstractC25920j.m76661g(this.f102343z).m76674n(AbstractC25914d.a.c.f102300a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x02af  */
    /* JADX WARN: Code duplicated, block: B:65:0x0352  */
    /* JADX WARN: Code duplicated, block: B:67:0x037a  */
    /* JADX WARN: Code duplicated, block: B:73:0x03ea  */
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
    /* JADX INFO: renamed from: f */
    public static final void m76660f(AbstractC12939a0 globalNavController, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        int i15;
        int i16;
        float f13;
        float f14;
        boolean z4;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1950514526);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(globalNavController) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g || objM87133R2 == c28676v1) {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R2;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m76661g(interfaceC23462h).getViewState(), new C25922l(null, false, null, false, false, false, null, null, 255, null), null, c28655q, 0, 2);
            boolean zM87157i2 = c28655q.m87157i(globalNavController);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v1) {
                objM87133R3 = new C25918h(globalNavController, 0);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
            Boolean boolValueOf = Boolean.valueOf(m76662h(interfaceC28601c1M87260n).getShouldNavigateToCheckout());
            String strM76675a = m76662h(interfaceC28601c1M87260n).getCartId();
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(globalNavController) | c28655q.m87157i(interfaceC23462h);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g2 || objM87133R4 == c28676v1) {
                objM87133R4 = new b(globalNavController, interfaceC28601c1M87260n, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(boolValueOf, strM76675a, (InterfaceC4351m) objM87133R4, c28655q);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
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
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Universal Checkout Debug");
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, AbstractC13673n.m38561h(c38072d), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f15 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f15, 0.0f, 0.0f, 13);
            boolean zM87157i3 = c28655q.m87157i(globalNavController);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i3 || objM87133R5 == c28676v1) {
                objM87133R5 = new C25918h(globalNavController, 1);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R5, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3394p(4 * f15, c2314t));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Fetch Cart ID");
            int i17 = C38072d.f163054b;
            C2886a c2886aM8430k = c38072d.m121952e(c28655q, i17).getBtS();
            boolean z14 = !m76662h(interfaceC28601c1M87260n).getIsLoading();
            boolean zM87157i4 = c28655q.m87157i(interfaceC23462h);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i4) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R6 == c28676v0) {
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
                i15 = (TextResource.$stable << 18) | 6;
                i16 = C2886a.f11498d << 6;
                C28676v0 c28676v2 = c28676v0;
                AbstractC27292z.m82343j(modifierM3409f, z14, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, c2886aM8430k, interfaceC4339a, c28655q, i15, i16, 4028);
                c28655q = c28655q;
                f13 = 24;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                if (m76662h(interfaceC28601c1M87260n).getCartId() != null) {
                    c28655q.m87150e0(614063232);
                    float f16 = 16;
                    f14 = f13;
                    AbstractC30795n.m94707h(AbstractC11266d.m30461o("Cart ID: ", m76662h(interfaceC28601c1M87260n).getCartId()), AbstractC1099a.m3394p(f16, c2314t), C17919x.f69629f, 0L, null, C28780r.f116540G, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, null, c28655q, 197040, 0, 261592);
                    Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f16, c28655q, c2314t, 1.0f);
                    C2886a c2886aM8430k2 = c38072d.m121952e(c28655q, i17).getBtS();
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Navigate to Universal Checkout");
                    z13 = true;
                    boolean z15 = !m76662h(interfaceC28601c1M87260n).getIsLoading();
                    zM87157i = c28655q.m87157i(interfaceC23462h);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v2) {
                        objM87133R = new C9791o(interfaceC23462h, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27292z.m82343j(modifierM91835e, z15, false, null, null, null, textResourceM21278l3, null, null, null, 0.0f, null, c2886aM8430k2, (InterfaceC4339a) objM87133R, c28655q, i15, i16, 4028);
                    c28655q = c28655q;
                    z4 = false;
                    c28655q.m87173q(false);
                } else {
                    f14 = f13;
                    z4 = false;
                    z13 = true;
                    c28655q.m87150e0(614843564);
                    c28655q.m87173q(false);
                }
                if (m76662h(interfaceC28601c1M87260n).getError() != null || m76662h(interfaceC28601c1M87260n).getShowDialog()) {
                    c28655q.m87150e0(615224492);
                    c28655q.m87173q(z4);
                } else {
                    AbstractC33745d.m106667z(c28655q, 614920816, c2314t, f14, c28655q);
                    C28655q c28655q2 = c28655q;
                    AbstractC15011f9.m43114b(AbstractC11266d.m30461o("Error: ", m76662h(interfaceC28601c1M87260n).getError()), AbstractC1099a.m3394p(16, c2314t), C17919x.f69629f, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, c28655q2, 432, 0, 130552);
                    c28655q = c28655q2;
                    c28655q.m87173q(z4);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z13);
            }
            objM87133R6 = new C9791o(interfaceC23462h, 1);
            c28655q.m87172p0(objM87133R6);
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
            i15 = (TextResource.$stable << 18) | 6;
            i16 = C2886a.f11498d << 6;
            C28676v0 c28676v3 = c28676v0;
            AbstractC27292z.m82343j(modifierM3409f, z14, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, c2886aM8430k, interfaceC4339a2, c28655q, i15, i16, 4028);
            c28655q = c28655q;
            f13 = 24;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            if (m76662h(interfaceC28601c1M87260n).getCartId() != null) {
                c28655q.m87150e0(614063232);
                float f17 = 16;
                f14 = f13;
                AbstractC30795n.m94707h(AbstractC11266d.m30461o("Cart ID: ", m76662h(interfaceC28601c1M87260n).getCartId()), AbstractC1099a.m3394p(f17, c2314t), C17919x.f69629f, 0L, null, C28780r.f116540G, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, null, c28655q, 197040, 0, 261592);
                Modifier modifierM91835e2 = AbstractC30007c.m91835e(c2314t, f17, c28655q, c2314t, 1.0f);
                C2886a c2886aM8430k3 = c38072d.m121952e(c28655q, i17).getBtS();
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Navigate to Universal Checkout");
                z13 = true;
                boolean z16 = !m76662h(interfaceC28601c1M87260n).getIsLoading();
                zM87157i = c28655q.m87157i(interfaceC23462h);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C9791o(interfaceC23462h, 2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C9791o(interfaceC23462h, 2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27292z.m82343j(modifierM91835e2, z16, false, null, null, null, textResourceM21278l4, null, null, null, 0.0f, null, c2886aM8430k3, (InterfaceC4339a) objM87133R, c28655q, i15, i16, 4028);
                c28655q = c28655q;
                z4 = false;
                c28655q.m87173q(false);
            } else {
                f14 = f13;
                z4 = false;
                z13 = true;
                c28655q.m87150e0(614843564);
                c28655q.m87173q(false);
            }
            if (m76662h(interfaceC28601c1M87260n).getError() != null) {
                c28655q.m87150e0(615224492);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(615224492);
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25919i(globalNavController, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C25921k m76661g(InterfaceC23462h interfaceC23462h) {
        return (C25921k) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C25922l m76662h(InterfaceC28670t2 interfaceC28670t2) {
        return (C25922l) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m76663i(AbstractC12939a0 abstractC12939a0) {
        abstractC12939a0.m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m76664j(AbstractC12939a0 abstractC12939a0) {
        abstractC12939a0.m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m76665k(InterfaceC23462h interfaceC23462h) {
        m76661g(interfaceC23462h).m76674n(AbstractC25914d.a.C42022a.f102298a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m76666l(InterfaceC23462h interfaceC23462h) {
        m76661g(interfaceC23462h).m76674n(AbstractC25914d.a.b.f102299a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m76667m(AbstractC12939a0 abstractC12939a0, int i13, Composer composer, int i14) {
        m76660f(abstractC12939a0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
