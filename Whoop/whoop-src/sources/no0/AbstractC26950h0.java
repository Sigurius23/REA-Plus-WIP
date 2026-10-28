package no0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fy1.AbstractC14874j;
import io.sentry.config.AbstractC20301a;
import j81.C21421e;
import jf3.C21647a;
import js2.C21930h;
import ko0.C22646d;
import ko0.C22647e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lo0.C24569a0;
import lo0.C24571b0;
import lo0.InterfaceC24615z;
import mf2.C25514e;
import n72.C26439b;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
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

/* JADX INFO: renamed from: no0.h0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lko0/e;", "navRouter", "Lko0/d;", "actionRouter", "", "appointmentType", "intakeType", "appointmentId", "Ll83/a0;", "f", "(Lko0/e;Lko0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Llo0/b0;", "viewState", "Lkotlin/Function1;", "Llo0/z;", "onEvent", "g", "(Llo0/b0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llo0/a0;", "viewModel", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26950h0 {

    /* JADX INFO: renamed from: no0.h0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f107481w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f107482x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f107483y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f107484z;

        /* JADX INFO: renamed from: no0.h0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42071a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f107485w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42071a(C21647a c21647a) {
                super(0);
                this.f107485w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f107485w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f107481w = c38266c;
            this.f107482x = interfaceC35951a;
            this.f107483y = interfaceC4339a;
            this.f107484z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, lo0.a0] */
        @Override // c93.InterfaceC4339a
        public final C24569a0 invoke() {
            return AbstractC21598x.m60668X(this.f107481w, this.f107482x, new C42071a(this.f107484z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24569a0.class), null, this.f107483y);
        }
    }

    /* JADX INFO: renamed from: no0.h0$b */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingIntakeScreenKt$ClinicianVideoSchedulingIntakeScreen$1$1", m100430f = "ClinicianVideoSchedulingIntakeScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC23462h f107486E;

        /* JADX INFO: renamed from: w */
        int f107487w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f107488x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f107489y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f107490z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107488x = str;
            this.f107489y = str2;
            this.f107490z = str3;
            this.f107486E = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f107488x, this.f107489y, this.f107490z, this.f107486E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f107487w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC26950h0.m80511h(this.f107486E).m71706o(new InterfaceC24615z.d(this.f107488x, this.f107489y, this.f107490z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.h0$c */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingIntakeScreenKt$ClinicianVideoSchedulingIntakeScreen$2$1", m100430f = "ClinicianVideoSchedulingIntakeScreen.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107491w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f107492x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22647e f107493y;

        /* JADX INFO: renamed from: no0.h0$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22647e f107494w;

            public a(C22647e c22647e) {
                this.f107494w = c22647e;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC24615z.g gVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f107494w.m65604c(gVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, C22647e c22647e, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107492x = interfaceC23462h;
            this.f107493y = c22647e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f107492x, this.f107493y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107491w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM71705n = AbstractC26950h0.m80511h(this.f107492x).getNavigationEvents();
                a aVar = new a(this.f107493y);
                this.f107491w = 1;
                if (interfaceC13058lM71705n.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: no0.h0$d */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingIntakeScreenKt$ClinicianVideoSchedulingIntakeScreen$3$1", m100430f = "ClinicianVideoSchedulingIntakeScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107495w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC24615z.v f107496x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f107497y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC24615z.v vVar, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107496x = vVar;
            this.f107497y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f107496x, this.f107497y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f107495w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f107496x != null) {
                AbstractC26950h0.m80511h(this.f107497y).m71706o(this.f107496x);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0136  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f2  */
    /* JADX INFO: renamed from: f */
    public static final void m80509f(C22647e navRouter, C22646d actionRouter, String appointmentType, String str, String str2, Composer composer, int i13, int i14) {
        int i15;
        String str3;
        boolean z4;
        C28655q c28655q;
        String str4;
        C28677v1 c28677v1M87180u;
        String str5;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        C28655q c28655q2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object bVar;
        InterfaceC23462h interfaceC23462h2;
        boolean zM87157i;
        Object objM87133R2;
        InterfaceC30057d interfaceC30057d;
        InterfaceC24615z.v vVarM71710d;
        boolean zM87157i2;
        Object objM87133R3;
        boolean zM87157i3;
        Object objM87133R4;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(appointmentType, "appointmentType");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1024714790);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(navRouter) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87153g(actionRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87153g(appointmentType) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q3.m87153g(str) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                str3 = str2;
                i15 |= c28655q3.m87153g(str3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                c28655q3.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
                zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(null);
                objM87133R = c28655q3.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q3.m87172p0(objM87133R);
                }
                c28655q3.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q3.m87173q(false);
                InterfaceC24615z.v vVar = null;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m80511h(interfaceC23462h).getViewState(), new C24571b0(new C24571b0.a(C33205o0.f138451a.m105288b(), null, vVar, null, 14, null), null, false ? 1 : 0, vVar, 14, null), null, c28655q3, 0, 2);
                c28655q2 = c28655q3;
                C24569a0 c24569a0M80511h = m80511h(interfaceC23462h);
                boolean zM87157i4 = c28655q2.m87157i(interfaceC23462h);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z17 = zM87157i4 | z13;
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z18 = z17 | z14;
                if ((57344 & i15) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z18 | z15;
                Object objM87133R5 = c28655q2.m87133R();
                if (!z16 || objM87133R5 == c28676v0) {
                    interfaceC23462h2 = interfaceC23462h;
                    str3 = str5;
                    bVar = new b(appointmentType, str, str3, interfaceC23462h2, null);
                    c28655q2.m87172p0(bVar);
                } else {
                    bVar = objM87133R5;
                    interfaceC23462h2 = interfaceC23462h;
                    str3 = str5;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, c24569a0M80511h);
                C24569a0 c24569a0M80511h2 = m80511h(interfaceC23462h2);
                zM87157i = c28655q2.m87157i(interfaceC23462h2) | c28655q2.m87157i(navRouter);
                objM87133R2 = c28655q2.m87133R();
                if (!zM87157i || objM87133R2 == c28676v0) {
                    interfaceC30057d = null;
                    objM87133R2 = new c(interfaceC23462h2, navRouter, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    interfaceC30057d = null;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, c24569a0M80511h2);
                vVarM71710d = m80512i(interfaceC28601c1M87260n).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                zM87157i2 = c28655q2.m87157i(vVarM71710d) | c28655q2.m87157i(interfaceC23462h2);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new d(vVarM71710d, interfaceC23462h2, interfaceC30057d);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, vVarM71710d);
                AbstractC14874j.m42904c(m80512i(interfaceC28601c1M87260n), "healthcare_loop_scheduling_intake", c28655q2, 48);
                C24571b0 c24571b0M80512i = m80512i(interfaceC28601c1M87260n);
                zM87157i3 = ((i15 & 112) == 32) | c28655q2.m87157i(interfaceC23462h2) | c28655q2.m87157i(navRouter);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C21930h(actionRouter, navRouter, interfaceC23462h2, 28);
                    c28655q2.m87172p0(objM87133R4);
                }
                m80510g(c24571b0M80512i, (Function1) objM87133R4, c28655q2, 0, 0);
                c28655q = c28655q2;
            } else {
                C28655q c28655q4 = c28655q3;
                c28655q4.m87138X();
                c28655q = c28655q4;
            }
            str4 = str3;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e((Object) navRouter, (Object) actionRouter, appointmentType, (Object) str, (Object) str4, i13, i14, 9);
            }
        }
        i15 |= 24576;
        str3 = str2;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            c28655q3.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
            zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            objM87133R = c28655q3.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q3.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q3.m87172p0(objM87133R);
            }
            c28655q3.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q3.m87173q(false);
            InterfaceC24615z.v vVar2 = null;
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m80511h(interfaceC23462h).getViewState(), new C24571b0(new C24571b0.a(C33205o0.f138451a.m105288b(), null, vVar2, null, 14, null), null, false ? 1 : 0, vVar2, 14, null), null, c28655q3, 0, 2);
            c28655q2 = c28655q3;
            C24569a0 c24569a0M80511h3 = m80511h(interfaceC23462h);
            boolean zM87157i5 = c28655q2.m87157i(interfaceC23462h);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = zM87157i5 | z13;
            if ((i15 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z110 = z19 | z14;
            if ((57344 & i15) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z110 | z15;
            Object objM87133R6 = c28655q2.m87133R();
            if (z16) {
                interfaceC23462h2 = interfaceC23462h;
                str3 = str5;
                bVar = new b(appointmentType, str, str3, interfaceC23462h2, null);
                c28655q2.m87172p0(bVar);
            } else {
                interfaceC23462h2 = interfaceC23462h;
                str3 = str5;
                bVar = new b(appointmentType, str, str3, interfaceC23462h2, null);
                c28655q2.m87172p0(bVar);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, c24569a0M80511h3);
            C24569a0 c24569a0M80511h4 = m80511h(interfaceC23462h2);
            zM87157i = c28655q2.m87157i(interfaceC23462h2) | c28655q2.m87157i(navRouter);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                interfaceC30057d = null;
                objM87133R2 = new c(interfaceC23462h2, navRouter, null);
                c28655q2.m87172p0(objM87133R2);
            } else {
                interfaceC30057d = null;
                objM87133R2 = new c(interfaceC23462h2, navRouter, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, c24569a0M80511h4);
            vVarM71710d = m80512i(interfaceC28601c1M87260n2).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            zM87157i2 = c28655q2.m87157i(vVarM71710d) | c28655q2.m87157i(interfaceC23462h2);
            objM87133R3 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R3 = new d(vVarM71710d, interfaceC23462h2, interfaceC30057d);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new d(vVarM71710d, interfaceC23462h2, interfaceC30057d);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, vVarM71710d);
            AbstractC14874j.m42904c(m80512i(interfaceC28601c1M87260n2), "healthcare_loop_scheduling_intake", c28655q2, 48);
            C24571b0 c24571b0M80512i2 = m80512i(interfaceC28601c1M87260n2);
            zM87157i3 = ((i15 & 112) == 32) | c28655q2.m87157i(interfaceC23462h2) | c28655q2.m87157i(navRouter);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i3) {
                objM87133R4 = new C21930h(actionRouter, navRouter, interfaceC23462h2, 28);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C21930h(actionRouter, navRouter, interfaceC23462h2, 28);
                c28655q2.m87172p0(objM87133R4);
            }
            m80510g(c24571b0M80512i2, (Function1) objM87133R4, c28655q2, 0, 0);
            c28655q = c28655q2;
        } else {
            C28655q c28655q5 = c28655q3;
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        str4 = str3;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e((Object) navRouter, (Object) actionRouter, appointmentType, (Object) str, (Object) str4, i13, i14, 9);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m80510g(C24571b0 viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1667958965);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
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
                    objM87133R = new C26439b(22);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            boolean z4 = viewState.getScreenContent() != null;
            int i17 = i15 & 112;
            boolean z13 = i17 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C25514e(function3, 22);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, z4, c28655q, 0, 0);
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(885775282);
                AbstractC26939c0.m80452k(viewState.getFullScreenModal(), function3, c28655q, i17, 0);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(1689365686);
                AbstractC26948g0.m80491n(viewState, function3, c28655q, i15 & 126, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1689455245);
                c28655q.m87173q(false);
            }
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26942d0(viewState, function2, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C24569a0 m80511h(InterfaceC23462h interfaceC23462h) {
        return (C24569a0) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: i */
    private static final C24571b0 m80512i(InterfaceC28670t2 interfaceC28670t2) {
        return (C24571b0) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m80513j(C22646d c22646d, C22647e c22647e, InterfaceC23462h interfaceC23462h, InterfaceC24615z event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC24615z interfaceC24615zM65601e = c22646d.m65601e(event);
        if (interfaceC24615zM65601e instanceof InterfaceC24615z.v) {
            m80511h(interfaceC23462h).m71706o((InterfaceC24615z.v) interfaceC24615zM65601e);
        } else if (interfaceC24615zM65601e instanceof InterfaceC24615z.g) {
            c22647e.m65604c((InterfaceC24615z.g) interfaceC24615zM65601e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m80514k(C22647e c22647e, C22646d c22646d, String str, String str2, String str3, int i13, int i14, Composer composer, int i15) {
        m80509f(c22647e, c22646d, str, str2, str3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m80515l(InterfaceC24615z it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m80516m(Function1 function1) {
        function1.invoke(InterfaceC24615z.n.f96241a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m80517n(C24571b0 c24571b0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80510g(c24571b0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
