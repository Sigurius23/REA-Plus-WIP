package qg0;

import androidx.compose.runtime.Composer;
import aw0.C2108h;
import bc3.InterfaceC2994c0;
import bg0.C3226h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import fy1.AbstractC14874j;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import ng0.C26679a;
import ng0.C26681c;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26954j0;
import og0.C27916b;
import og0.C27917c;
import og0.InterfaceC27915a;
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
import qe0.C30301b;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: renamed from: qg0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Log0/a$a;", "screenViewEvent", "Lng0/c;", "navRouter", "Lng0/a;", "actionRouter", "", "isPresented", "Ll83/a0;", "e", "(Log0/a$a;Lng0/c;Lng0/a;ZLandroidx/compose/runtime/Composer;II)V", "Log0/c;", "viewState", "Lkotlin/Function1;", "Log0/a;", "onEvent", "f", "(Log0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Log0/b;", "viewModel", "advanced-labs-management_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30344e {

    /* JADX INFO: renamed from: qg0.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f124484w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f124485x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f124486y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f124487z;

        /* JADX INFO: renamed from: qg0.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42221a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f124488w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42221a(C21647a c21647a) {
                super(0);
                this.f124488w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f124488w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f124484w = c38266c;
            this.f124485x = interfaceC35951a;
            this.f124486y = interfaceC4339a;
            this.f124487z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, og0.b] */
        @Override // c93.InterfaceC4339a
        public final C27916b invoke() {
            return AbstractC21598x.m60668X(this.f124484w, this.f124485x, new C42221a(this.f124487z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27916b.class), null, this.f124486y);
        }
    }

    /* JADX INFO: renamed from: qg0.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsmanagement.view.AdvancedLabsManagementScreenKt$AdvancedLabsManagementScreen$1$1", m100430f = "AdvancedLabsManagementScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f124489w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26679a f124490x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC27915a.a f124491y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f124492z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26679a c26679a, InterfaceC27915a.a aVar, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f124490x = c26679a;
            this.f124491y = aVar;
            this.f124492z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f124490x, this.f124491y, this.f124492z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f124489w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f124490x.m79361c(this.f124491y);
            AbstractC30344e.m92734g(this.f124492z).m84228n(InterfaceC27915a.h.f112520a);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0164  */
    /* JADX WARN: Code duplicated, block: B:68:0x016e  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m92732e(InterfaceC27915a.a screenViewEvent, C26681c navRouter, C26679a actionRouter, boolean z4, Composer composer, int i13, int i14) {
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
        Object obj;
        InterfaceC23462h interfaceC23462h;
        boolean zM87157i;
        Object obj2;
        boolean zM87157i2;
        Object obj3;
        AbstractC22676k.m65750j(screenViewEvent, "screenViewEvent");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1465384862);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(screenViewEvent) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(navRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(actionRouter) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
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
                    obj = objM87133R;
                    InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(interfaceC23462hM92087G);
                    obj = interfaceC23462hM92087G;
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) obj;
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m92734g(interfaceC23462h).getViewState(), new C27917c(null, new C27917c.c(C33205o0.f138451a.m105288b(), null, null, null, 14, null), false ? 1 : 0, 5, false ? 1 : 0), null, c28655q, 0, 2);
                C27916b c27916bM92734g = m92734g(interfaceC23462h);
                zM87157i = c28655q.m87157i(actionRouter) | ((i15 & 14) == 4) | c28655q.m87157i(interfaceC23462h);
                Object objM87133R2 = c28655q.m87133R();
                obj2 = objM87133R2;
                if (zM87157i || objM87133R2 == c28676v0) {
                    b bVar = new b(actionRouter, screenViewEvent, interfaceC23462h, null);
                    c28655q.m87172p0(bVar);
                    obj2 = bVar;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj2, c27916bM92734g);
                C27917c c27917cM92735h = m92735h(interfaceC28601c1M87260n);
                zM87157i2 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
                Object objM87133R3 = c28655q.m87133R();
                obj3 = objM87133R3;
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    C26954j0 c26954j0 = new C26954j0(actionRouter, navRouter, interfaceC23462h, 23);
                    c28655q.m87172p0(c26954j0);
                    obj3 = c26954j0;
                }
                z13 = z16;
                m92733f(c27917cM92735h, z13, (Function1) obj3, c28655q, (i15 >> 6) & 112, 0);
            } else {
                c28655q.m87138X();
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(screenViewEvent, navRouter, actionRouter, z15, i13, i14, 26);
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i15 & 1171) != 1170) {
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
                obj = objM87133R;
                InterfaceC23462h interfaceC23462hM92087G2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(interfaceC23462hM92087G2);
                obj = interfaceC23462hM92087G2;
            } else {
                obj = objM87133R;
                InterfaceC23462h interfaceC23462hM92087G3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(interfaceC23462hM92087G3);
                obj = interfaceC23462hM92087G3;
            }
            c28655q.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) obj;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m92734g(interfaceC23462h).getViewState(), new C27917c(null, new C27917c.c(C33205o0.f138451a.m105288b(), null, null, null, 14, null), false ? 1 : 0, 5, false ? 1 : 0), null, c28655q, 0, 2);
            C27916b c27916bM92734g2 = m92734g(interfaceC23462h);
            zM87157i = c28655q.m87157i(actionRouter) | ((i15 & 14) == 4) | c28655q.m87157i(interfaceC23462h);
            Object objM87133R4 = c28655q.m87133R();
            obj2 = objM87133R4;
            if (zM87157i) {
                b bVar2 = new b(actionRouter, screenViewEvent, interfaceC23462h, null);
                c28655q.m87172p0(bVar2);
                obj2 = bVar2;
            } else {
                b bVar3 = new b(actionRouter, screenViewEvent, interfaceC23462h, null);
                c28655q.m87172p0(bVar3);
                obj2 = bVar3;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj2, c27916bM92734g2);
            C27917c c27917cM92735h2 = m92735h(interfaceC28601c1M87260n2);
            zM87157i2 = c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R5 = c28655q.m87133R();
            obj3 = objM87133R5;
            if (zM87157i2) {
                C26954j0 c26954j1 = new C26954j0(actionRouter, navRouter, interfaceC23462h, 23);
                c28655q.m87172p0(c26954j1);
                obj3 = c26954j1;
            } else {
                C26954j0 c26954j2 = new C26954j0(actionRouter, navRouter, interfaceC23462h, 23);
                c28655q.m87172p0(c26954j2);
                obj3 = c26954j2;
            }
            z13 = z16;
            m92733f(c27917cM92735h2, z13, (Function1) obj3, c28655q, (i15 >> 6) & 112, 0);
        } else {
            c28655q.m87138X();
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(screenViewEvent, navRouter, actionRouter, z15, i13, i14, 26);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m92733f(C27917c viewState, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1110949860);
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
                    objM87133R = new C30301b(8);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            int i18 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "advanced_labs_management", c28655q, i18 | 48);
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(1824052241);
                AbstractC30341b.m92697g(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(711175290);
                AbstractC30342c.m92707c(viewState, function3, c28655q, i18 | ((i15 >> 3) & 112));
                AbstractC30343d.m92718i(viewState.getScreenContent(), z14, function3, c28655q, i15 & MessageListItemViewType.GIPHY, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(711346534);
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
            c28677v1M87180u.f115982d = new C3226h(viewState, z13, function2, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C27916b m92734g(InterfaceC23462h interfaceC23462h) {
        return (C27916b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final C27917c m92735h(InterfaceC28670t2 interfaceC28670t2) {
        return (C27917c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m92736i(C26679a c26679a, C26681c c26681c, InterfaceC23462h interfaceC23462h, InterfaceC27915a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC27915a interfaceC27915aM79361c = c26679a.m79361c(event);
        if (interfaceC27915aM79361c instanceof InterfaceC27915a.i) {
            m92734g(interfaceC23462h).m84228n((InterfaceC27915a.i) interfaceC27915aM79361c);
        } else if (interfaceC27915aM79361c instanceof InterfaceC27915a.g) {
            c26681c.m79363b((InterfaceC27915a.g) interfaceC27915aM79361c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m92737j(InterfaceC27915a.a aVar, C26681c c26681c, C26679a c26679a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m92732e(aVar, c26681c, c26679a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m92738k(InterfaceC27915a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m92739l(C27917c c27917c, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m92733f(c27917c, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
