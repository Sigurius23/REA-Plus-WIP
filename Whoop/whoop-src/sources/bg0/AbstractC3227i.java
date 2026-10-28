package bg0;

import androidx.compose.runtime.Composer;
import b72.C2783a;
import bc3.InterfaceC2994c0;
import bf0.C3195g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import fy1.AbstractC14874j;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C29656q;
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
import vf3.InterfaceC35951a;
import xf3.C38266c;
import yf0.C39509a;
import yf0.C39511c;
import zf0.C40610b;
import zf0.C40611c;
import zf0.InterfaceC40609a;

/* JADX INFO: renamed from: bg0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "source", "testCount", "Lyf0/c;", "navRouter", "Lyf0/a;", "actionRouter", "", "isPresented", "Ll83/a0;", "e", "(Ljava/lang/String;Ljava/lang/String;Lyf0/c;Lyf0/a;ZLandroidx/compose/runtime/Composer;II)V", "Lzf0/c;", "viewState", "Lkotlin/Function1;", "Lzf0/a;", "onEvent", "f", "(Lzf0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lzf0/b;", "viewModel", "advanced-labs-join_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3227i {

    /* JADX INFO: renamed from: bg0.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f12610w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f12611x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f12612y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f12613z;

        /* JADX INFO: renamed from: bg0.i$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41307a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f12614w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41307a(C21647a c21647a) {
                super(0);
                this.f12614w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f12614w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f12610w = c38266c;
            this.f12611x = interfaceC35951a;
            this.f12612y = interfaceC4339a;
            this.f12613z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, zf0.b] */
        @Override // c93.InterfaceC4339a
        public final C40610b invoke() {
            return AbstractC21598x.m60668X(this.f12610w, this.f12611x, new C41307a(this.f12613z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40610b.class), null, this.f12612y);
        }
    }

    /* JADX INFO: renamed from: bg0.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.purchaseaddons.view.PurchaseAddOnsScreenKt$PurchaseAddOnsScreen$1$1", m100430f = "PurchaseAddOnsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12615w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f12616x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f12617y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f12618z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12616x = str;
            this.f12617y = str2;
            this.f12618z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f12616x, this.f12617y, this.f12618z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12615w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3227i.m9321g(this.f12618z).m131696n(new InterfaceC40609a.h(this.f12616x, this.f12617y));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x0180  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m9319e(String source, String testCount, C39511c navRouter, C39509a actionRouter, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        boolean zM87157i;
        Object objM87133R3;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1242990533);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(source) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(testCount) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(navRouter) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(actionRouter) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28655q.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m9321g(interfaceC23462h).getViewState(), new C40611c(null, new C40611c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null), null, c28655q, 0, 2);
                C40610b c40610bM9321g = m9321g(interfaceC23462h);
                boolean zM87157i2 = c28655q.m87157i(interfaceC23462h);
                if ((i15 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z24 = z17 | zM87157i2;
                if ((i15 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z24 | z18;
                objM87133R2 = c28655q.m87133R();
                if (z19 || objM87133R2 == c28676v0) {
                    objM87133R2 = new b(source, testCount, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c40610bM9321g);
                C40611c c40611cM9322h = m9322h(interfaceC28601c1M87260n);
                zM87157i = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C29656q(actionRouter, navRouter, interfaceC23462h, 11);
                    c28655q.m87172p0(objM87133R3);
                }
                z13 = z16;
                m9320f(c40611cM9322h, z13, (Function1) objM87133R3, c28655q, (i15 >> 9) & 112, 0);
            } else {
                c28655q.m87138X();
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(source, testCount, navRouter, actionRouter, z15, i13, i14, 2);
            }
        }
        i15 |= 24576;
        z13 = z4;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28655q.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m9321g(interfaceC23462h).getViewState(), new C40611c(null, new C40611c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null), null, c28655q, 0, 2);
            C40610b c40610bM9321g2 = m9321g(interfaceC23462h);
            boolean zM87157i3 = c28655q.m87157i(interfaceC23462h);
            if ((i15 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z25 = z17 | zM87157i3;
            if ((i15 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z25 | z18;
            objM87133R2 = c28655q.m87133R();
            if (z19) {
                objM87133R2 = new b(source, testCount, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(source, testCount, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c40610bM9321g2);
            C40611c c40611cM9322h2 = m9322h(interfaceC28601c1M87260n2);
            zM87157i = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R3 = new C29656q(actionRouter, navRouter, interfaceC23462h, 11);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C29656q(actionRouter, navRouter, interfaceC23462h, 11);
                c28655q.m87172p0(objM87133R3);
            }
            z13 = z16;
            m9320f(c40611cM9322h2, z13, (Function1) objM87133R3, c28655q, (i15 >> 9) & 112, 0);
        } else {
            c28655q.m87138X();
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(source, testCount, navRouter, actionRouter, z15, i13, i14, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9320f(C40611c viewState, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-207410076);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            boolean z14 = i16 != 0 ? false : z4;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C2783a(15);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            int i18 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "advanced_labs_purchase_addons", c28655q, i18 | 48);
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-1752577039);
                AbstractC3222d.m9274j(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(1504809866);
                AbstractC3224f.m9283e(viewState, function3, c28655q, i18 | ((i15 >> 3) & 112));
                AbstractC3225g.m9299k(viewState.getScreenContent(), null, z14, function3, c28655q, (i15 << 3) & 8064, 2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1504988798);
                c28655q.m87173q(false);
            }
            z13 = z14;
            function2 = function3;
        } else {
            c28655q.m87138X();
            z13 = z4;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(viewState, z13, function2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C40610b m9321g(InterfaceC23462h interfaceC23462h) {
        return (C40610b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final C40611c m9322h(InterfaceC28670t2 interfaceC28670t2) {
        return (C40611c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m9323i(C39509a c39509a, C39511c c39511c, InterfaceC23462h interfaceC23462h, InterfaceC40609a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC40609a interfaceC40609aM126166c = c39509a.m126166c(event);
        if (interfaceC40609aM126166c instanceof InterfaceC40609a.j) {
            m9321g(interfaceC23462h).m131696n((InterfaceC40609a.j) interfaceC40609aM126166c);
        } else if (interfaceC40609aM126166c instanceof InterfaceC40609a.f) {
            c39511c.m126168b((InterfaceC40609a.f) interfaceC40609aM126166c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m9324j(String str, String str2, C39511c c39511c, C39509a c39509a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m9319e(str, str2, c39511c, c39509a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m9325k(InterfaceC40609a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m9326l(C40611c c40611c, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m9320f(c40611c, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
