package ej1;

import a81.C0555f;
import am2.C1040r;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import bc3.InterfaceC2994c0;
import bj1.C3330a;
import bj1.C3332c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cj1.C4752h;
import cj1.C4753i;
import cj1.InterfaceC4751g;
import com.whoop.health.domain.models.HealthTabScrollBackgroundStyle;
import cy1.C11186b;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22392e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
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
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.AbstractC33208p0;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import xf3.C38266c;

/* JADX INFO: renamed from: ej1.t */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcj1/g$k;", "screenViewEvent", "Lbj1/c;", "navRouter", "Lbj1/a;", "actionRouter", "Lkotlin/Function1;", "", "Ll83/a0;", "onOverlayDisplayed", "f", "(Lcj1/g$k;Lbj1/c;Lbj1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcj1/i;", "viewState", "Lcj1/g;", "onEvent", "g", "(Lcj1/i;Lcj1/g$k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;", "style", "", "Li2/x;", "p", "(Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;)Ljava/util/List;", "Lcj1/h;", "viewModel", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13257t {

    /* JADX INFO: renamed from: ej1.t$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f45900w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f45901x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f45902y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f45903z;

        /* JADX INFO: renamed from: ej1.t$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41527a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f45904w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41527a(C21647a c21647a) {
                super(0);
                this.f45904w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f45904w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f45900w = c38266c;
            this.f45901x = interfaceC35951a;
            this.f45902y = interfaceC4339a;
            this.f45903z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, cj1.h] */
        @Override // c93.InterfaceC4339a
        public final C4752h invoke() {
            return AbstractC21598x.m60668X(this.f45900w, this.f45901x, new C41527a(this.f45903z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4752h.class), null, this.f45902y);
        }
    }

    /* JADX INFO: renamed from: ej1.t$b */
    @InterfaceC32271e(m100429c = "com.whoop.health.view.HealthTabScreenKt$HealthTabScreen$2$1", m100430f = "HealthTabScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f45905w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f45906x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45906x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f45906x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f45905w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC13257t.m37274i(this.f45906x).m14959o(new InterfaceC4751g.m(false, 1, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ej1.t$c */
    @InterfaceC32271e(m100429c = "com.whoop.health.view.HealthTabScreenKt$HealthTabScreen$3$1", m100430f = "HealthTabScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Landroidx/lifecycle/x;", "lifecycle", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;Landroidx/lifecycle/x;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f45907w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f45908x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f45909y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f45909y = interfaceC23462h;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, AbstractC1638x abstractC1638x, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(this.f45909y, interfaceC30057d);
            cVar.f45908x = abstractC1638x;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC1638x abstractC1638x = (AbstractC1638x) this.f45908x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f45907w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            abstractC1638x.mo4986a(AbstractC13257t.m37274i(this.f45909y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ej1.t$d */
    @InterfaceC32271e(m100429c = "com.whoop.health.view.HealthTabScreenKt$HealthTabScreen$6$1", m100430f = "HealthTabScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f45910w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f45911x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4751g.k f45912y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, InterfaceC4751g.k kVar, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45911x = function1;
            this.f45912y = kVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f45911x, this.f45912y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f45910w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f45911x.invoke(this.f45912y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ej1.t$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45913a;

        static {
            int[] iArr = new int[HealthTabScrollBackgroundStyle.values().length];
            try {
                iArr[HealthTabScrollBackgroundStyle.HEALTHSPAN_YOUNGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HealthTabScrollBackgroundStyle.HEALTHSPAN_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HealthTabScrollBackgroundStyle.HEALTHSPAN_OLDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HealthTabScrollBackgroundStyle.LIVE_HR_BLUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HealthTabScrollBackgroundStyle.LOCKED_PURPLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HealthTabScrollBackgroundStyle.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f45913a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0164  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x019e  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m37271f(InterfaceC4751g.k screenViewEvent, C3332c navRouter, C3330a actionRouter, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        boolean zM87153g2;
        Object objM87133R4;
        Function1 function5;
        Object objM87133R5;
        AbstractC22676k.m65750j(screenViewEvent, "screenViewEvent");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-643796076);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(screenViewEvent) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(navRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(actionRouter) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13251n(3);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                c28655q2.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
                zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
                objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q2.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q2.m87173q(false);
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(m37274i(interfaceC23462h).getViewState(), new C4753i(new C4753i.c(C33205o0.f138451a.m105288b(), null, null, 6, null), null, null, null, 14, null), null, c28655q2, 0, 2);
                c28655q = c28655q2;
                C4752h c4752hM37274i = m37274i(interfaceC23462h);
                zM87157i = c28655q.m87157i(interfaceC23462h);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new b(interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c4752hM37274i);
                EnumC1632v enumC1632v = EnumC1632v.ON_CREATE;
                zM87157i2 = c28655q.m87157i(interfaceC23462h);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new c(interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC22392e.m64443d(enumC1632v, (Function3) objM87133R3, c28655q, 6);
                C4753i c4753iM37276k = m37276k(interfaceC28601c1M87260n);
                zM87153g2 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter) | ((i16 & 7168) == 2048);
                objM87133R4 = c28655q.m87133R();
                if (!zM87153g2 || objM87133R4 == c28676v0) {
                    function5 = function4;
                    C1040r c1040r = new C1040r(actionRouter, navRouter, function5, interfaceC28601c1M87260n, interfaceC23462h, 9, false);
                    c28655q.m87172p0(c1040r);
                    objM87133R4 = c1040r;
                } else {
                    function5 = function4;
                }
                m37272g(c4753iM37276k, screenViewEvent, (Function1) objM87133R4, c28655q, (i16 << 3) & 112);
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) screenViewEvent, (Object) navRouter, (Object) actionRouter, function3, i13, i14, 19);
            }
        }
        i15 |= 3072;
        function2 = function1;
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13251n(3);
                    c28655q2.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            c28655q2.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
            zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(null);
            objM87133R = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q2.m87173q(false);
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(m37274i(interfaceC23462h).getViewState(), new C4753i(new C4753i.c(C33205o0.f138451a.m105288b(), null, null, 6, null), null, null, null, 14, null), null, c28655q2, 0, 2);
            c28655q = c28655q2;
            C4752h c4752hM37274i2 = m37274i(interfaceC23462h);
            zM87157i = c28655q.m87157i(interfaceC23462h);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new b(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c4752hM37274i2);
            EnumC1632v enumC1632v2 = EnumC1632v.ON_CREATE;
            zM87157i2 = c28655q.m87157i(interfaceC23462h);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R3 = new c(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new c(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC22392e.m64443d(enumC1632v2, (Function3) objM87133R3, c28655q, 6);
            C4753i c4753iM37276k2 = m37276k(interfaceC28601c1M87260n);
            zM87153g2 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(actionRouter) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter) | ((i16 & 7168) == 2048);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g2) {
                function5 = function4;
                C1040r c1040r2 = new C1040r(actionRouter, navRouter, function5, interfaceC28601c1M87260n, interfaceC23462h, 9, false);
                c28655q.m87172p0(c1040r2);
                objM87133R4 = c1040r2;
            } else {
                function5 = function4;
                C1040r c1040r3 = new C1040r(actionRouter, navRouter, function5, interfaceC28601c1M87260n, interfaceC23462h, 9, false);
                c28655q.m87172p0(c1040r3);
                objM87133R4 = c1040r3;
            }
            m37272g(c4753iM37276k2, screenViewEvent, (Function1) objM87133R4, c28655q, (i16 << 3) & 112);
            function3 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) screenViewEvent, (Object) navRouter, (Object) actionRouter, function3, i13, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX INFO: renamed from: g */
    public static final void m37272g(C4753i viewState, InterfaceC4751g.k screenViewEvent, Function1 onEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Object objM37281p;
        C33211q0 state;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(screenViewEvent, "screenViewEvent");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1859338899);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(screenViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC14874j.m42904c(viewState, "health_tab", c28655q, (i14 & 14) | 48);
            C4753i.d content = viewState.getContent();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (content != null) {
                c28655q.m87150e0(-627686886);
                if ((i14 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i14 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z4 | z13;
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new d(onEvent, screenViewEvent, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                c28655q.m87173q(false);
            } else {
                C4753i.c fullScreenModal = viewState.getFullScreenModal();
                if (((fullScreenModal == null || (state = fullScreenModal.getState()) == null) ? null : state.getType()) instanceof AbstractC33208p0.c) {
                    c28655q.m87150e0(-627605201);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-627686886);
                    if ((i14 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((i14 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z4 | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new d(onEvent, screenViewEvent, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new d(onEvent, screenViewEvent, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                    c28655q.m87173q(false);
                }
            }
            HealthTabScrollBackgroundStyle backgroundStyle = viewState.getBackgroundStyle();
            boolean zM87149e = c28655q.m87149e(backgroundStyle == null ? -1 : backgroundStyle.ordinal());
            Object objM87133R2 = c28655q.m87133R();
            if (zM87149e || objM87133R2 == c28676v0) {
                HealthTabScrollBackgroundStyle backgroundStyle2 = viewState.getBackgroundStyle();
                if (backgroundStyle2 == null || (objM37281p = m37281p(backgroundStyle2)) == null) {
                    objM37281p = C25271y.f99162w;
                }
                objM87133R2 = objM37281p;
                c28655q.m87172p0(objM87133R2);
            }
            List list = (List) objM87133R2;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            boolean z15 = !list.isEmpty();
            boolean zM87157i = c28655q.m87157i(list);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C13256s(list, 0);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15676d.m44099b(modifierM44028b0, z15, (Function1) objM87133R3));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(2053305244);
                AbstractC13246j.m37220e(viewState.getFullScreenModal(), onEvent, c28655q, (i14 >> 3) & 112);
                c28655q.m87173q(false);
            } else if (viewState.getContent() != null) {
                c28655q.m87150e0(2053309109);
                AbstractC13252o.m37246i(viewState.getContent(), onEvent, c28655q, (i14 >> 3) & 112);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-771847947);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(i13, 6, viewState, screenViewEvent, onEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m37273h(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C4752h m37274i(InterfaceC23462h interfaceC23462h) {
        return (C4752h) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m37275j(C4753i c4753i, InterfaceC4751g.k kVar, Function1 function1, int i13, Composer composer, int i14) {
        m37272g(c4753i, kVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final C4753i m37276k(InterfaceC28670t2 interfaceC28670t2) {
        return (C4753i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m37277l(C3330a c3330a, C3332c c3332c, Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, InterfaceC4751g event) {
        InterfaceC4751g.k kVarM14947b;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC4751g.k) {
            C4753i.a analyticsData = m37276k(interfaceC28670t2).getAnalyticsData();
            if (analyticsData == null) {
                event = (InterfaceC4751g.k) event;
            } else {
                if (analyticsData.getLabel() != null && analyticsData.getValue() != null) {
                    kVarM14947b = InterfaceC4751g.k.m14947b((InterfaceC4751g.k) event, null, analyticsData.getLabel(), analyticsData.getValue(), 1, null);
                } else if (analyticsData.getLabel() != null) {
                    kVarM14947b = InterfaceC4751g.k.m14947b((InterfaceC4751g.k) event, null, analyticsData.getLabel(), null, 5, null);
                } else {
                    kVarM14947b = analyticsData.getValue() != null ? InterfaceC4751g.k.m14947b((InterfaceC4751g.k) event, null, null, analyticsData.getValue(), 3, null) : (InterfaceC4751g.k) event;
                }
                if (kVarM14947b == null) {
                    event = (InterfaceC4751g.k) event;
                } else {
                    event = kVarM14947b;
                }
            }
        }
        InterfaceC4751g interfaceC4751gM9637c = c3330a.m9637c(event);
        if (interfaceC4751gM9637c instanceof InterfaceC4751g.p) {
            m37274i(interfaceC23462h).m14959o((InterfaceC4751g.p) interfaceC4751gM9637c);
        } else if (interfaceC4751gM9637c instanceof InterfaceC4751g.n) {
            c3332c.m9639b((InterfaceC4751g.n) interfaceC4751gM9637c);
        } else if (interfaceC4751gM9637c instanceof InterfaceC4751g.g) {
            function1.invoke(Boolean.valueOf(((InterfaceC4751g.g) interfaceC4751gM9637c).getIsVisible()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m37278m(InterfaceC4751g.k kVar, C3332c c3332c, C3330a c3330a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37271f(kVar, c3332c, c3330a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Modifier m37279n(List list, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC15673b0.m44021Y0(applyIf, list);
    }

    /* JADX INFO: renamed from: p */
    public static final List<C17919x> m37281p(HealthTabScrollBackgroundStyle style) {
        AbstractC22676k.m65750j(style, "style");
        switch (e.f45913a[style.ordinal()]) {
            case 1:
                return AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278251935L)), new C17919x(AbstractC17918w0.m51515c(61855)));
            case 2:
                return AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4280920241L)), new C17919x(AbstractC17918w0.m51515c(6794982)));
            case 3:
                return AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4294944546L)), new C17919x(AbstractC17918w0.m51515c(16754466)));
            case 4:
                return AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278227943L)), new C17919x(AbstractC17918w0.m51515c(6794982)));
            case 5:
                return AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4291382999L)), new C17919x(AbstractC17918w0.m51515c(13192919)));
            case 6:
                return C25271y.f99162w;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
