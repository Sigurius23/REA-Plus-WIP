package com.whoop.settings;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1565b0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci0.C4726a;
import ck1.C4780c;
import com.squareup.wire.AbstractC5583n;
import com.whoop.navigation.DrawerPresentation;
import dp0.InterfaceC12251g;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p078d1.C11456i;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p705ea2.AbstractC12911i0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lcom/whoop/navigation/DrawerPresentation;", "preset", "Ll83/a0;", "F", "(Lcom/whoop/navigation/DrawerPresentation;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Ldp0/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Ldp0/g;", "globalCoachManager", "x", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WakeUpAutopopHeightTesterFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: y */
    public static final int f30320y = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h globalCoachManager = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10087b(this, null, null));

    /* JADX INFO: renamed from: com.whoop.settings.WakeUpAutopopHeightTesterFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10087b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30322w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30323x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30324y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10087b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30322w = componentCallbacks;
            this.f30323x = interfaceC35951a;
            this.f30324y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dp0.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC12251g invoke() {
            ComponentCallbacks componentCallbacks = this.f30322w;
            InterfaceC35951a interfaceC35951a = this.f30323x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30324y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12251g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.WakeUpAutopopHeightTesterFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.settings.WakeUpAutopopHeightTesterFragment$triggerAutopop$1", m100430f = "WakeUpAutopopHeightTesterFragment.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10088c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30325w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC12251g f30326x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13404j f30327y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10088c(InterfaceC12251g interfaceC12251g, C13404j c13404j, InterfaceC30057d<? super C10088c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30326x = interfaceC12251g;
            this.f30327y = c13404j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10088c(this.f30326x, this.f30327y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10088c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30325w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f30325w = 1;
                if (AbstractC3034m0.m8782b(400L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC12251g.m34132f(this.f30326x, 0L, null, this.f30327y, 3, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: B */
    private final InterfaceC12251g m25301B() {
        return (InterfaceC12251g) this.globalCoachManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m25302C(WakeUpAutopopHeightTesterFragment wakeUpAutopopHeightTesterFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(wakeUpAutopopHeightTesterFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C11456i(wakeUpAutopopHeightTesterFragment, 15);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(wakeUpAutopopHeightTesterFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C4780c(wakeUpAutopopHeightTesterFragment, 29);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC12911i0.m36318j(interfaceC4339a, (Function1) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m25303D(WakeUpAutopopHeightTesterFragment wakeUpAutopopHeightTesterFragment) {
        AbstractC5583n.m16799z(wakeUpAutopopHeightTesterFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m25304E(WakeUpAutopopHeightTesterFragment wakeUpAutopopHeightTesterFragment, DrawerPresentation preset) {
        AbstractC22676k.m65750j(preset, "preset");
        wakeUpAutopopHeightTesterFragment.m25305F(preset);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private final void m25305F(DrawerPresentation preset) {
        C13404j c13404jM36323o = AbstractC12911i0.m36323o(preset);
        if (c13404jM36323o == null) {
            Toast.makeText(requireContext(), "Reducer returned null — payload is malformed", 0).show();
            return;
        }
        Toast.makeText(requireContext(), "Auto-pop dispatched: " + preset.name(), 0).show();
        InterfaceC12251g interfaceC12251gM25301B = m25301B();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        C1565b0 c1565b0M5020j = AbstractC1613o1.m5020j(abstractActivityC1340r0RequireActivity);
        AbstractC5583n.m16799z(this).m36402q(Uri.parse("android-app://com.whoop/home"));
        AbstractC3006f0.m8732z(c1565b0M5020j, null, null, new C10088c(interfaceC12251gM25301B, c13404jM36323o, null), 3);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 28), true, -581316232));
    }
}
