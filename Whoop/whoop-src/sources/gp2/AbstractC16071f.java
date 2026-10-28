package gp2;

import a81.AbstractC0564o;
import a81.InterfaceC0569t;
import ad3.AbstractC0757c;
import am2.C1042s;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import ao1.C1871f;
import ap2.C1882a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import dp2.C12255a;
import dp2.C12256b;
import ep2.C13430b;
import ep2.C13431c;
import ep2.InterfaceC13429a;
import f02.C13917c;
import fy1.AbstractC14874j;
import g90.C15595a;
import ge0.C15728c;
import ge3.AbstractC15751g;
import go1.C16016a;
import gp1.C16065a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import o02.InterfaceC27353d;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.C33205o0;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: renamed from: gp2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006!²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "source", "Leb/a0;", "globalNavController", "Landroidx/fragment/app/r0;", "activity", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;", "navArgs", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Leb/a0;Landroidx/fragment/app/r0;Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;Landroidx/compose/runtime/Composer;I)V", "Lep2/c;", "viewState", "Lkotlin/Function1;", "Lep2/a;", "onEvent", "i", "(Ljava/lang/String;Lep2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "La81/t;", "y", "(La81/t;)Lep2/a;", "Lep2/b;", "viewModel", "Ldp2/a;", "actionRouter", "Lap2/a;", "analyticsHelper", "Lj02/o0;", "navigator", "Lo02/d;", "baseNavReducer", "Lad3/c;", "json", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16071f {

    /* JADX INFO: renamed from: gp2.f$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f60765w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f60766x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f60767y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f60765w = c38266c;
            this.f60766x = interfaceC35951a;
            this.f60767y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [dp2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C12255a invoke() {
            return this.f60765w.m122602a(this.f60767y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12255a.class), this.f60766x);
        }
    }

    /* JADX INFO: renamed from: gp2.f$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f60768w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f60769x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f60770y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f60768w = c38266c;
            this.f60769x = interfaceC35951a;
            this.f60770y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ap2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C1882a invoke() {
            return this.f60768w.m122602a(this.f60770y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C1882a.class), this.f60769x);
        }
    }

    /* JADX INFO: renamed from: gp2.f$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f60771w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f60772x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f60773y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f60771w = c38266c;
            this.f60772x = interfaceC35951a;
            this.f60773y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            return this.f60771w.m122602a(this.f60773y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), this.f60772x);
        }
    }

    /* JADX INFO: renamed from: gp2.f$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f60774w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f60775x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f60776y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f60774w = c38266c;
            this.f60775x = interfaceC35951a;
            this.f60776y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            return this.f60774w.m122602a(this.f60776y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), this.f60775x);
        }
    }

    /* JADX INFO: renamed from: gp2.f$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f60777w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f60778x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f60779y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f60777w = c38266c;
            this.f60778x = interfaceC35951a;
            this.f60779y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ad3.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final AbstractC0757c invoke() {
            return this.f60777w.m122602a(this.f60779y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), this.f60778x);
        }
    }

    /* JADX INFO: renamed from: gp2.f$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f60780w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f60781x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f60782y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f60783z;

        /* JADX INFO: renamed from: gp2.f$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f60784w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f60784w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f60784w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f60780w = c38266c;
            this.f60781x = interfaceC35951a;
            this.f60782y = interfaceC4339a;
            this.f60783z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ep2.b] */
        @Override // c93.InterfaceC4339a
        public final C13430b invoke() {
            return AbstractC21598x.m60668X(this.f60780w, this.f60781x, new a(this.f60783z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13430b.class), null, this.f60782y);
        }
    }

    /* JADX INFO: renamed from: gp2.f$g */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.view.ReceiptScreenKt$ReceiptScreen$1$1", m100430f = "ReceiptScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f60785w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ UniversalCheckoutDestination.C10631c.a f60786x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f60787y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f60788z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(UniversalCheckoutDestination.C10631c.a aVar, String str, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60786x = aVar;
            this.f60787y = str;
            this.f60788z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f60786x, this.f60787y, this.f60788z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f60785w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC16071f.m45410j(this.f60788z).m38153n(new InterfaceC13429a.g(this.f60786x.getCartId(), this.f60787y));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final void m45408h(String source, AbstractC12939a0 globalNavController, AbstractActivityC1340r0 activity, UniversalCheckoutDestination.C10631c.a navArgs, Composer composer, int i13) {
        int i14;
        Object c12256b;
        InterfaceC30057d interfaceC30057d;
        int i15;
        C28655q c28655q;
        String str;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(navArgs, "navArgs");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1465356412);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(source) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(globalNavController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(activity) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(navArgs) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14;
        if (c28655q2.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            c28655q2.m87152f0(-1688186518);
            C29155a c29155a = C29155a.f118016a;
            C38266c c38266c = c29155a.m88599a().f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
            boolean zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c, null, null, c21647aM114690r));
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q2.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m45410j(interfaceC23462h).getViewState(), new C13431c(null, new C13431c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 13, null), null, c28655q2, 0, 2);
            c28655q2.m87152f0(1903845737);
            C38266c c38266c2 = c29155a.m88599a().f106046a.f159364d;
            c28655q2.m87152f0(-3686552);
            boolean zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c2, null, null));
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q2.m87173q(false);
            InterfaceC23462h interfaceC23462h2 = (InterfaceC23462h) objM87133R2;
            c28655q2.m87173q(false);
            c28655q2.m87152f0(1903845737);
            C38266c c38266c3 = c29155a.m88599a().f106046a.f159364d;
            c28655q2.m87152f0(-3686552);
            boolean zM87153g3 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c3, null, null));
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q2.m87173q(false);
            InterfaceC23462h interfaceC23462h3 = (InterfaceC23462h) objM87133R3;
            c28655q2.m87173q(false);
            boolean zM87157i = c28655q2.m87157i(activity);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                objM87133R4 = new C1871f(activity, 3);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
            c28655q2.m87152f0(1903845737);
            C38266c c38266c4 = c29155a.m88599a().f106046a.f159364d;
            c28655q2.m87152f0(-3686552);
            boolean zM87153g4 = c28655q2.m87153g(null) | c28655q2.m87153g(interfaceC4339a);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87153g4 || objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(c38266c4, null, interfaceC4339a));
                c28655q2.m87172p0(objM87133R5);
            }
            c28655q2.m87173q(false);
            InterfaceC23462h interfaceC23462h4 = (InterfaceC23462h) objM87133R5;
            c28655q2.m87173q(false);
            c28655q2.m87152f0(1903845737);
            C38266c c38266c5 = c29155a.m88599a().f106046a.f159364d;
            c28655q2.m87152f0(-3686552);
            boolean zM87153g5 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
            Object objM87133R6 = c28655q2.m87133R();
            if (zM87153g5 || objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c5, null, null));
                c28655q2.m87172p0(objM87133R6);
            }
            c28655q2.m87173q(false);
            InterfaceC23462h interfaceC23462h5 = (InterfaceC23462h) objM87133R6;
            c28655q2.m87173q(false);
            C35953c c35953c = new C35953c("universal-checkout-json");
            c28655q2.m87152f0(1903845737);
            C38266c c38266c6 = c29155a.m88599a().f106046a.f159364d;
            c28655q2.m87152f0(-3686552);
            boolean zM87153g6 = c28655q2.m87153g(c35953c) | c28655q2.m87153g(null);
            Object objM87133R7 = c28655q2.m87133R();
            if (zM87153g6 || objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new e(c38266c6, c35953c, null));
                c28655q2.m87172p0(objM87133R7);
            }
            c28655q2.m87173q(false);
            InterfaceC23462h interfaceC23462h6 = (InterfaceC23462h) objM87133R7;
            c28655q2.m87173q(false);
            int i17 = i16 & 14;
            boolean zM87153g7 = c28655q2.m87153g(globalNavController) | (i17 == 4);
            Object objM87133R8 = c28655q2.m87133R();
            if (zM87153g7 || objM87133R8 == c28676v0) {
                interfaceC30057d = null;
                i15 = i17;
                c28655q = c28655q2;
                c12256b = new C12256b(m45421u(interfaceC23462h4), globalNavController, m45422v(interfaceC23462h5), m45419s(interfaceC23462h3), m45423w(interfaceC23462h6), source, null, 64, null);
                str = source;
                c28655q.m87172p0(c12256b);
            } else {
                c12256b = objM87133R8;
                c28655q = c28655q2;
                i15 = i17;
                interfaceC30057d = null;
                str = source;
            }
            C12256b c12256b2 = (C12256b) c12256b;
            C13430b c13430bM45410j = m45410j(interfaceC23462h);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i16 & 7168) == 2048) | (i15 == 4);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87157i2 || objM87133R9 == c28676v0) {
                objM87133R9 = new g(navArgs, str, interfaceC23462h, interfaceC30057d);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, c13430bM45410j);
            AbstractC14874j.m42904c(m45411k(interfaceC28601c1M87260n), "universal_checkout_receipt", c28655q, 48);
            Object objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = new C16065a(7);
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R10, false, c28655q, 48, 1);
            C13431c c13431cM45411k = m45411k(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(interfaceC23462h2) | (i15 == 4) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(c12256b2);
            Object objM87133R11 = c28655q.m87133R();
            if (zM87157i3 || objM87133R11 == c28676v0) {
                C1042s c1042s = new C1042s(str, c12256b2, interfaceC23462h2, interfaceC23462h, 22);
                c28655q.m87172p0(c1042s);
                objM87133R11 = c1042s;
            }
            c28655q2 = c28655q;
            m45409i(source, c13431cM45411k, (Function1) objM87133R11, c28655q2, i15, 0);
        } else {
            c28655q2.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15595a(source, globalNavController, activity, navArgs, i13, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m45409i(String source, C13431c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-79102629);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(source) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16016a(2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(1291790465);
                    AbstractC16068c.m45371j(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 3) & 112);
                    c28655q.m87173q(false);
                } else if (viewState.getScreenContent() != null) {
                    c28655q.m87150e0(1390920056);
                    AnyModal anyModalM38155c = viewState.getModal();
                    z13 = (i15 & 896) == 256;
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C15728c(function3, 7);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC0564o.m1394P(anyModalM38155c, (Function1) objM87133R, null, null, null, null, c28655q, AnyModal.$stable, 60);
                    AbstractC16069d.m45378c(viewState, function3, c28655q, (i15 >> 3) & 126);
                    AbstractC16070e.m45390j(source, viewState.getScreenContent(), function3, c28655q, i15 & 910);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1391247943);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13917c(source, viewState, function3, i13, i14, 15);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16016a(2);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(1291790465);
                AbstractC16068c.m45371j(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(1390920056);
                AnyModal anyModalM38155c2 = viewState.getModal();
                if ((i15 & 896) == 256) {
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C15728c(function3, 7);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C15728c(function3, 7);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC0564o.m1394P(anyModalM38155c2, (Function1) objM87133R, null, null, null, null, c28655q, AnyModal.$stable, 60);
                AbstractC16069d.m45378c(viewState, function3, c28655q, (i15 >> 3) & 126);
                AbstractC16070e.m45390j(source, viewState.getScreenContent(), function3, c28655q, i15 & 910);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1391247943);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(source, viewState, function3, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C13430b m45410j(InterfaceC23462h interfaceC23462h) {
        return (C13430b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: k */
    private static final C13431c m45411k(InterfaceC28670t2 interfaceC28670t2) {
        return (C13431c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m45412l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m45413m(String str, C12256b c12256b, InterfaceC23462h interfaceC23462h, InterfaceC23462h interfaceC23462h2, InterfaceC13429a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC13429a interfaceC13429aM34174f = m45418r(interfaceC23462h).m34174f(event, str);
        if (interfaceC13429aM34174f instanceof InterfaceC13429a.q) {
            m45410j(interfaceC23462h2).m38153n((InterfaceC13429a.q) interfaceC13429aM34174f);
        } else if (interfaceC13429aM34174f instanceof InterfaceC13429a.l) {
            c12256b.m34184j((InterfaceC13429a.l) interfaceC13429aM34174f);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m45414n(String str, AbstractC12939a0 abstractC12939a0, AbstractActivityC1340r0 abstractActivityC1340r0, UniversalCheckoutDestination.C10631c.a aVar, int i13, Composer composer, int i14) {
        m45408h(str, abstractC12939a0, abstractActivityC1340r0, aVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m45415o(InterfaceC13429a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m45416p(Function1 function1, InterfaceC0569t modalEvent) {
        AbstractC22676k.m65750j(modalEvent, "modalEvent");
        function1.invoke(m45425y(modalEvent));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m45417q(String str, C13431c c13431c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m45409i(str, c13431c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final C12255a m45418r(InterfaceC23462h interfaceC23462h) {
        return (C12255a) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final C1882a m45419s(InterfaceC23462h interfaceC23462h) {
        return (C1882a) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C34911a m45420t(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: renamed from: u */
    private static final InterfaceC21159o0 m45421u(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC21159o0) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: v */
    private static final InterfaceC27353d m45422v(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC27353d) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: w */
    private static final AbstractC0757c m45423w(InterfaceC23462h interfaceC23462h) {
        return (AbstractC0757c) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC13429a m45425y(InterfaceC0569t interfaceC0569t) {
        AbstractC22676k.m65750j(interfaceC0569t, "<this>");
        if (interfaceC0569t instanceof InterfaceC0569t.a) {
            return InterfaceC13429a.e.f47028a;
        }
        if (interfaceC0569t instanceof InterfaceC0569t.f) {
            return new InterfaceC13429a.n(((InterfaceC0569t.f) interfaceC0569t).getModal());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.e) {
            return new InterfaceC13429a.m(((InterfaceC0569t.e) interfaceC0569t).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.d) {
            return InterfaceC13429a.e.f47028a;
        }
        if (interfaceC0569t instanceof InterfaceC0569t.c) {
            return new InterfaceC13429a.d(((InterfaceC0569t.c) interfaceC0569t).getDestination());
        }
        if (!(interfaceC0569t instanceof InterfaceC0569t.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC0569t.b bVar = (InterfaceC0569t.b) interfaceC0569t;
        return new InterfaceC13429a.k(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), bVar.getElement());
    }
}
