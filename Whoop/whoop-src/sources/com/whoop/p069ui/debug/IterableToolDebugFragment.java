package com.whoop.p069ui.debug;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.WhoopApplication;
import com.whoop.settings.AbstractC10105i;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import mm2.C25699b;
import n92.C26480b;
import n92.EnumC26479a;
import nf3.C26669a;
import p027b3.C2384h2;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import p724or1.Function2;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import x81.AbstractC38073e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lcom/whoop/ui/debug/IterableToolDebugFragment;", "Lcom/whoop/settings/i;", "<init>", "()V", "", "action", "", "delay", "Ll83/a0;", "N", "(Ljava/lang/String;Z)V", "M", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "x", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Ln92/b;", "y", "Ll83/h;", "L", "()Ln92/b;", "handler", "Lbc3/c0;", "z", "K", "()Lbc3/c0;", "applicationScope", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class IterableToolDebugFragment extends AbstractC10105i {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String logTag = "DebugIterableToolFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h handler;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h applicationScope;

    /* JADX INFO: renamed from: com.whoop.ui.debug.IterableToolDebugFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.ui.debug.IterableToolDebugFragment$navigateTo$1", m100430f = "IterableToolDebugFragment.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10466a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31665w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f31666x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10466a(String str, InterfaceC30057d<? super C10466a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f31666x = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10466a(this.f31666x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10466a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31665w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                this.f31665w = 1;
                if (AbstractC3034m0.m8783c(duration, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            EnumC26479a enumC26479aM78504u = C26480b.m78504u((C26480b) c26669a.f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26480b.class), null), this.f31666x, false, null, 6, null);
            Toast.makeText(WhoopApplication.INSTANCE.m16948a(), this.f31666x + ": " + enumC26479aM78504u, 0).show();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.IterableToolDebugFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10467b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31667w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31668x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31669y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10467b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31667w = componentCallbacks;
            this.f31668x = interfaceC35951a;
            this.f31669y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, n92.b] */
        @Override // c93.InterfaceC4339a
        public final C26480b invoke() {
            ComponentCallbacks componentCallbacks = this.f31667w;
            InterfaceC35951a interfaceC35951a = this.f31668x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31669y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26480b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.IterableToolDebugFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10468c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31670w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31671x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31672y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10468c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31670w = componentCallbacks;
            this.f31671x = interfaceC35951a;
            this.f31672y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bc3.c0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC2994c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f31670w;
            InterfaceC35951a interfaceC35951a = this.f31671x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31672y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), interfaceC35951a);
        }
    }

    public IterableToolDebugFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.handler = AbstractC30060g.m92087G(enumC23463i, new C10467b(this, null, null));
        this.applicationScope = AbstractC30060g.m92087G(enumC23463i, new C10468c(this, null, null));
    }

    /* JADX INFO: renamed from: K */
    private final InterfaceC2994c0 m26752K() {
        return (InterfaceC2994c0) this.applicationScope.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final C26480b m26753L() {
        return (C26480b) this.handler.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final void m26754M() {
        AbstractC5583n.m16799z(this).m36410z();
    }

    /* JADX INFO: renamed from: N */
    private final void m26755N(String action, boolean delay) {
        if (delay) {
            AbstractC3006f0.m8732z(m26752K(), null, null, new C10466a(action, null), 3);
            return;
        }
        EnumC26479a enumC26479aM78504u = C26480b.m78504u(m26753L(), action, false, null, 6, null);
        Toast.makeText(requireContext(), action + ": " + enumC26479aM78504u, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m26756O(IterableToolDebugFragment iterableToolDebugFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-1390358088, c28655q, new C25699b(iterableToolDebugFragment, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m26757P(IterableToolDebugFragment iterableToolDebugFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(iterableToolDebugFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C25699b(iterableToolDebugFragment, 2);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(iterableToolDebugFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C24117a(iterableToolDebugFragment, 9);
                c28655q.m87172p0(objM87133R2);
            }
            Function2.m85147e(interfaceC4351m, (InterfaceC4339a) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m26758Q(IterableToolDebugFragment iterableToolDebugFragment, String action, boolean z4) {
        AbstractC22676k.m65750j(action, "action");
        iterableToolDebugFragment.m26755N(action, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m26759R(IterableToolDebugFragment iterableToolDebugFragment) {
        iterableToolDebugFragment.m26754M();
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setViewCompositionStrategy(C2384h2.f9434x);
        composeView.setContent(new C37816b(new C25699b(this, 0), true, -1759568515));
        return composeView;
    }
}
