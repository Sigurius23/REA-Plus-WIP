package s32;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e31.AbstractC12610b;
import e31.C12611c;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import p026b2.C2314t;
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
import p701ce2.C4493a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p90.C29000h;
import pf3.C29155a;
import q32.C29951c;
import q32.C29952d;
import q32.InterfaceC29949a;
import q32.InterfaceC29950b;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qb0.C30179a;
import r83.EnumC31071a;
import rm2.C31604d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: renamed from: s32.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ls32/g;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Landroidx/compose/ui/Modifier;Ls32/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lq32/d;", "viewState", "onEvent", "i", "(Landroidx/compose/ui/Modifier;Lq32/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lq32/c;", "viewModel", "personal-records-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32114f {

    /* JADX INFO: renamed from: s32.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f133126w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f133127x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f133128y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f133129z;

        /* JADX INFO: renamed from: s32.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42312a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f133130w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42312a(C21647a c21647a) {
                super(0);
                this.f133130w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f133130w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f133126w = c38266c;
            this.f133127x = interfaceC35951a;
            this.f133128y = interfaceC4339a;
            this.f133129z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, q32.c] */
        @Override // c93.InterfaceC4339a
        public final C29951c invoke() {
            return AbstractC21598x.m60668X(this.f133126w, this.f133127x, new C42312a(this.f133129z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29951c.class), null, this.f133128y);
        }
    }

    /* JADX INFO: renamed from: s32.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.personalrecords.miniarch.view.PersonalRecordsScreenKt$PersonalRecordsMiniArchScreen$2$1", m100430f = "PersonalRecordsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f133131w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32115g f133132x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f133133y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C32115g c32115g, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f133132x = c32115g;
            this.f133133y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f133132x, this.f133133y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f133131w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC32114f.m99963l(this.f133133y).m91626o(new InterfaceC29949a.a(this.f133132x.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m99960i(Modifier modifier, final C29952d viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function2;
        final Function1 function3;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1528886795);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32112d(0);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            if (viewState.getMiniArchModal() != null) {
                c28655q.m87150e0(1061873921);
                C12611c state = viewState.getMiniArchModal().getState();
                int i18 = i15 & 896;
                boolean zM87157i = c28655q.m87157i(viewState) | (i18 == 256);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    final int i19 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: s32.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC32114f.m99969r(viewState, function3);
                                default:
                                    return AbstractC32114f.m99970s(viewState, function3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean zM87157i2 = c28655q.m87157i(viewState) | (i18 == 256);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i24 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: s32.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return AbstractC32114f.m99969r(viewState, function3);
                                default:
                                    return AbstractC32114f.m99970s(viewState, function3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC12610b.m35349f(state, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, C12611c.f43049g, 0);
                c28655q.m87173q(false);
                modifier3 = modifier;
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(1062240868);
                C29952d.b screenContent = viewState.getScreenContent();
                boolean z4 = (i15 & 896) == 256;
                Object objM87133R4 = c28655q.m87133R();
                if (z4 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C29000h(function3, 25);
                    c28655q.m87172p0(objM87133R4);
                }
                int i25 = i15 & 14;
                modifier3 = modifier;
                AbstractC32111c.m99948q(modifier3, screenContent, (Function1) objM87133R4, c28655q, i25, 0);
                c28655q.m87173q(false);
            } else {
                modifier3 = modifier;
                c28655q.m87150e0(1062378477);
                c28655q.m87173q(false);
            }
            modifier2 = modifier3;
            function2 = function3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 29, modifier2, viewState, function2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static final void m99961j(Modifier modifier, C32115g state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function3;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1943498884);
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
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
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
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C31604d(29);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function2;
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
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m99963l(interfaceC23462h).getViewState(), state.getViewState(), null, c28655q, 0, 2);
                C29951c c29951cM99963l = m99963l(interfaceC23462h);
                zM87157i = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(state);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new b(state, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c29951cM99963l);
                C29952d c29952dM99965n = m99965n(interfaceC28601c1M87260n);
                zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i15 & 896) == 256);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C4493a(function3, interfaceC23462h, 7);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifier5 = modifier4;
                m99960i(modifier5, c29952dM99965n, (Function1) objM87133R3, c28655q, i15 & 14, 0);
                function2 = function3;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(i13, i14, 28, modifier3, state, function2);
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
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C31604d(29);
                    c28655q.m87172p0(objM87133R4);
                }
                function3 = (Function1) objM87133R4;
            } else {
                function3 = function2;
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
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m99963l(interfaceC23462h).getViewState(), state.getViewState(), null, c28655q, 0, 2);
            C29951c c29951cM99963l2 = m99963l(interfaceC23462h);
            zM87157i = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(state);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new b(state, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(state, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c29951cM99963l2);
            C29952d c29952dM99965n2 = m99965n(interfaceC28601c1M87260n2);
            zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i15 & 896) == 256);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R3 = new C4493a(function3, interfaceC23462h, 7);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C4493a(function3, interfaceC23462h, 7);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifier6 = modifier4;
            m99960i(modifier6, c29952dM99965n2, (Function1) objM87133R3, c28655q, i15 & 14, 0);
            function2 = function3;
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 28, modifier3, state, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m99962k(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C29951c m99963l(InterfaceC23462h interfaceC23462h) {
        return (C29951c) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m99964m(Modifier modifier, C29952d c29952d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m99960i(modifier, c29952d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final C29952d m99965n(InterfaceC28670t2 interfaceC28670t2) {
        return (C29952d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m99966o(Function1 function1, InterfaceC23462h interfaceC23462h, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC29949a.d) {
            m99963l(interfaceC23462h).m91626o((InterfaceC29949a.d) event);
        } else if (event instanceof InterfaceC29950b) {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m99967p(Modifier modifier, C32115g c32115g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m99961j(modifier, c32115g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m99968q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m99969r(C29952d c29952d, Function1 function1) {
        InterfaceC29949a primaryClickEvent = c29952d.getMiniArchModal().getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m99970s(C29952d c29952d, Function1 function1) {
        InterfaceC29949a secondaryClickEvent = c29952d.getMiniArchModal().getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m99971t(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }
}
