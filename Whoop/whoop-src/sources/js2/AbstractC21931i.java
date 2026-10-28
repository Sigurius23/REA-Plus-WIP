package js2;

import android.content.Context;
import android.view.View;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.navigation.C9598e;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import eu.C13620k;
import fs2.InterfaceC14759l;
import fs2.InterfaceC14760m;
import fy1.AbstractC14874j;
import gs2.C16159a;
import gs2.C16161c;
import hs2.C17610d;
import hs2.C17611e;
import hs2.InterfaceC17607a;
import hy0.C17749h0;
import ig0.C18468h;
import j41.C21313a;
import jf3.C21647a;
import jp1.C21852d;
import jp2.C21875f;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p245j8.AbstractC21412c;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: renamed from: js2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0017²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, m65681d2 = {"", "callId", "Lgs2/c;", "navRouter", "Lgs2/a;", "actionRouter", "Lfs2/m;", "videoCallUiProvider", "Ll83/a0;", "k", "(Ljava/lang/String;Lgs2/c;Lgs2/a;Lfs2/m;Landroidx/compose/runtime/Composer;I)V", "Lhs2/e;", "viewState", "Lkotlin/Function1;", "Lhs2/a;", "onEvent", "j", "(Lhs2/e;Lkotlin/jvm/functions/Function1;Lfs2/m;Landroidx/compose/runtime/Composer;II)V", "Lhs2/d;", "viewModel", "Lfs2/l;", "currentCallState", "currentNavRouter", "video-call_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21931i {

    /* JADX INFO: renamed from: js2.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f84697w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f84698x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f84699y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f84700z;

        /* JADX INFO: renamed from: js2.i$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41858a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f84701w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41858a(C21647a c21647a) {
                super(0);
                this.f84701w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f84701w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f84697w = c38266c;
            this.f84698x = interfaceC35951a;
            this.f84699y = interfaceC4339a;
            this.f84700z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, hs2.d] */
        @Override // c93.InterfaceC4339a
        public final C17610d invoke() {
            return AbstractC21598x.m60668X(this.f84697w, this.f84698x, new C41858a(this.f84700z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17610d.class), null, this.f84699y);
        }
    }

    /* JADX INFO: renamed from: js2.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.view.VideoCallScreenKt$VideoCallScreen$2$1", m100430f = "VideoCallScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f84702w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f84703x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f84704y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84703x = str;
            this.f84704y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f84703x, this.f84704y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f84702w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC21931i.m62472l(this.f84704y).m50152o(new InterfaceC17607a.c(this.f84703x));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: js2.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.view.VideoCallScreenKt$VideoCallScreen$3$1", m100430f = "VideoCallScreen.kt", m100431l = {58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f84705w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f84706x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C16161c f84707y;

        /* JADX INFO: renamed from: js2.i$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C16161c f84708w;

            public a(C16161c c16161c) {
                this.f84708w = c16161c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC17607a.g gVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f84708w.m45704b(gVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, C16161c c16161c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f84706x = interfaceC23462h;
            this.f84707y = c16161c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f84706x, this.f84707y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f84705w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM50151n = AbstractC21931i.m62472l(this.f84706x).getNavigationEvents();
                a aVar = new a(this.f84707y);
                this.f84705w = 1;
                if (interfaceC13058lM50151n.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: js2.i$d */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"js2/i$d", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f84709a;

        public d(View view) {
            this.f84709a = view;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f84709a.setKeepScreenOn(false);
        }
    }

    /* JADX INFO: renamed from: js2.i$e */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"js2/i$e", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f84710a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f84711b;

        public e(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f84710a = interfaceC1585g0;
            this.f84711b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f84710a.getLifecycle().mo4988d(this.f84711b);
        }
    }

    /* JADX INFO: renamed from: js2.i$f */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"js2/i$f", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f84712a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f84713b;

        public f(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f84712a = interfaceC1585g0;
            this.f84713b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f84712a.getLifecycle().mo4988d(this.f84713b);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m62470j(C17611e viewState, Function1 function1, InterfaceC14760m videoCallUiProvider, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(videoCallUiProvider, "videoCallUiProvider");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(977240880);
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
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(videoCallUiProvider) : c28655q.m87157i(videoCallUiProvider) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21875f(8);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function2 = function1;
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-1469345512);
                AbstractC21925c.m62422k(viewState.getFullScreenModal(), function2, c28655q, i15 & 112, 0);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(1695050162);
                AbstractC21928f.m62432E(viewState.getCallState(), viewState.getScreenContent(), videoCallUiProvider, function2, c28655q, ((((C9598e.f28134d | DialogModel.$stable) | C4092p2.f16593v) | C17749h0.f69004h) << 3) | (i15 & 896) | ((i15 << 6) & 7168), 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1695302130);
                c28655q.m87173q(false);
            }
            function1 = function2;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(i13, i14, 4, viewState, videoCallUiProvider, function1);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m62471k(String callId, C16161c navRouter, C16159a actionRouter, InterfaceC14760m videoCallUiProvider, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(videoCallUiProvider, "videoCallUiProvider");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2002853303);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(callId) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(navRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(actionRouter) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(videoCallUiProvider) : c28655q.m87157i(videoCallUiProvider) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
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
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m62472l(interfaceC23462h).getViewState(), new C17611e(null, null, null, 7, null), null, c28655q, 0, 2);
            c28655q = c28655q;
            View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
            boolean zM87157i = c28655q.m87157i(view);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C21929g(view, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R2, c28655q);
            C17610d c17610dM62472l = m62472l(interfaceC23462h);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i14 & 14) == 4);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new b(callId, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c17610dM62472l);
            C17610d c17610dM62472l2 = m62472l(interfaceC23462h);
            boolean zM87157i3 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new c(interfaceC23462h, navRouter, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c17610dM62472l2);
            InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(m62473m(interfaceC28601c1M87260n).getCallState(), c28655q);
            int i15 = i14 >> 3;
            InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(navRouter, c28655q);
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c1M87238F2) | c28655q.m87157i(interfaceC1585g0);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87153g2 || objM87133R5 == c28676v0) {
                objM87133R5 = new C18468h(interfaceC1585g0, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, 28);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R5, c28655q);
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            boolean zM87157i4 = c28655q.m87157i(context) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(interfaceC1585g0);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i4 || objM87133R6 == c28676v0) {
                objM87133R6 = new C18468h(interfaceC1585g0, context, interfaceC23462h, 29);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R6, c28655q);
            AbstractC14874j.m42904c(m62473m(interfaceC28601c1M87260n), "healthcare_loop_video_call", c28655q, 48);
            C17611e c17611eM62473m = m62473m(interfaceC28601c1M87260n);
            boolean zM87157i5 = ((i14 & 896) == 256) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i5 || objM87133R7 == c28676v0) {
                objM87133R7 = new C21930h(actionRouter, navRouter, interfaceC23462h, 0);
                c28655q.m87172p0(objM87133R7);
            }
            m62470j(c17611eM62473m, (Function1) objM87133R7, videoCallUiProvider, c28655q, i15 & 896, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21313a(callId, navRouter, actionRouter, videoCallUiProvider, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C17610d m62472l(InterfaceC23462h interfaceC23462h) {
        return (C17610d) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: m */
    private static final C17611e m62473m(InterfaceC28670t2 interfaceC28670t2) {
        return (C17611e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m62474n(String str, C16161c c16161c, C16159a c16159a, InterfaceC14760m interfaceC14760m, int i13, Composer composer, int i14) {
        m62471k(str, c16161c, c16159a, interfaceC14760m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m62475o(InterfaceC17607a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m62476p(C17611e c17611e, Function1 function1, InterfaceC14760m interfaceC14760m, int i13, int i14, Composer composer, int i15) {
        m62470j(c17611e, function1, interfaceC14760m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC28620h0 m62477q(View view, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        view.setKeepScreenOn(true);
        return new d(view);
    }

    /* JADX INFO: renamed from: r */
    private static final InterfaceC14759l m62478r(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC14759l) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final C16161c m62479s(InterfaceC28670t2 interfaceC28670t2) {
        return (C16161c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC28620h0 m62480t(InterfaceC1585g0 interfaceC1585g0, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C13620k c13620k = new C13620k(3, interfaceC28670t2, interfaceC28670t3);
        interfaceC1585g0.getLifecycle().mo4986a(c13620k);
        return new e(interfaceC1585g0, c13620k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m62481u(InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_RESUME && (m62478r(interfaceC28670t2) instanceof InterfaceC14759l.b)) {
            m62479s(interfaceC28670t3).m45704b(InterfaceC17607a.b.f68219a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC28620h0 m62482v(InterfaceC1585g0 interfaceC1585g0, Context context, InterfaceC23462h interfaceC23462h, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C13620k c13620k = new C13620k(4, context, interfaceC23462h);
        interfaceC1585g0.getLifecycle().mo4986a(c13620k);
        return new f(interfaceC1585g0, c13620k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m62483w(Context context, InterfaceC23462h interfaceC23462h, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_RESUME) {
            m62472l(interfaceC23462h).m50152o(new InterfaceC17607a.h(((AbstractC32122c.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0) && (AbstractC32122c.checkSelfPermission(context, "android.permission.CAMERA") == 0)) ? false : true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m62484x(C16159a c16159a, C16161c c16161c, InterfaceC23462h interfaceC23462h, InterfaceC17607a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC17607a interfaceC17607aM45702a = c16159a.m45702a(event);
        if (interfaceC17607aM45702a instanceof InterfaceC17607a.j) {
            m62472l(interfaceC23462h).m50152o((InterfaceC17607a.j) interfaceC17607aM45702a);
        } else if (interfaceC17607aM45702a instanceof InterfaceC17607a.g) {
            c16161c.m45704b((InterfaceC17607a.g) interfaceC17607aM45702a);
        }
        return C23454a0.f92919a;
    }
}
