package com.whoop.settings.notification;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import b30.C2476a1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.settings.notification.SettingsNotificationFragment;
import hj0.AbstractC17354m;
import ic2.AbstractC18401f;
import ic2.C18398c;
import ic2.C18402g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/settings/notification/SettingsNotificationFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "M", "N", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lcom/whoop/settings/notification/e;", "x", "Ll83/h;", "L", "()Lcom/whoop/settings/notification/e;", "viewModel", "Lic2/g;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SettingsNotificationFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SettingsNotificationFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10141c(this, null, new C10140b(this), null));

    /* JADX INFO: renamed from: com.whoop.settings.notification.SettingsNotificationFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationFragment$onResume$1", m100430f = "SettingsNotificationFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10139a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30605w;

        public C10139a(InterfaceC30057d<? super C10139a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SettingsNotificationFragment.this.new C10139a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10139a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f30605w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SettingsNotificationFragment.this.m25665L().m25703o(AbstractC10145d.a.f30663a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.SettingsNotificationFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10140b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30607w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10140b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30607w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30607w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.SettingsNotificationFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10141c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30608w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30609x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30610y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30611z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10141c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30608w = componentCallbacks;
            this.f30609x = interfaceC35951a;
            this.f30610y = interfaceC4339a;
            this.f30611z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.settings.notification.e] */
        @Override // c93.InterfaceC4339a
        public final C10146e invoke() {
            return AbstractC34132o.m107857B(this.f30608w, this.f30609x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10146e.class), this.f30610y, this.f30611z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final C10146e m25665L() {
        return (C10146e) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final void m25666M() {
        Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", requireContext().getPackageName());
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        startActivity(intentPutExtra);
    }

    /* JADX INFO: renamed from: N */
    private final void m25667N() {
        AbstractC5583n.m16799z(this).m36402q(Uri.parse("android-app://com.whoop/settings/shepherdNotificationHistoryFragment"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m25668O(final SettingsNotificationFragment settingsNotificationFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C18402g c18402gM25669P = m25669P(AbstractC28683x.m87260n(settingsNotificationFragment.m25665L().getViewState(), new C18402g(true, null, null, false, 14, null), null, c28655q, 0, 2));
            boolean zM87157i = c28655q.m87157i(settingsNotificationFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new InterfaceC4339a(settingsNotificationFragment) { // from class: ic2.d

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SettingsNotificationFragment f71578x;

                    {
                        this.f71578x = settingsNotificationFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return SettingsNotificationFragment.m25670Q(this.f71578x);
                            case 1:
                                return SettingsNotificationFragment.m25673T(this.f71578x);
                            default:
                                return SettingsNotificationFragment.m25674U(this.f71578x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(settingsNotificationFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C18398c(settingsNotificationFragment, 1);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(settingsNotificationFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C2476a1(settingsNotificationFragment, 20);
                c28655q.m87172p0(objM87133R3);
            }
            Function3 function3 = (Function3) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(settingsNotificationFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i15 = 1;
                objM87133R4 = new InterfaceC4339a(settingsNotificationFragment) { // from class: ic2.d

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SettingsNotificationFragment f71578x;

                    {
                        this.f71578x = settingsNotificationFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return SettingsNotificationFragment.m25670Q(this.f71578x);
                            case 1:
                                return SettingsNotificationFragment.m25673T(this.f71578x);
                            default:
                                return SettingsNotificationFragment.m25674U(this.f71578x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(settingsNotificationFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                final int i16 = 2;
                objM87133R5 = new InterfaceC4339a(settingsNotificationFragment) { // from class: ic2.d

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SettingsNotificationFragment f71578x;

                    {
                        this.f71578x = settingsNotificationFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return SettingsNotificationFragment.m25670Q(this.f71578x);
                            case 1:
                                return SettingsNotificationFragment.m25673T(this.f71578x);
                            default:
                                return SettingsNotificationFragment.m25674U(this.f71578x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC18401f.m52935r(c18402gM25669P, interfaceC4339a, interfaceC4351m, function3, interfaceC4339a2, (InterfaceC4339a) objM87133R5, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final C18402g m25669P(InterfaceC28670t2 interfaceC28670t2) {
        return (C18402g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m25670Q(SettingsNotificationFragment settingsNotificationFragment) {
        AbstractC5583n.m16799z(settingsNotificationFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m25671R(SettingsNotificationFragment settingsNotificationFragment, String namespace, boolean z4) {
        AbstractC22676k.m65750j(namespace, "namespace");
        settingsNotificationFragment.m25665L().m25703o(new AbstractC10145d.b(namespace, z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m25672S(SettingsNotificationFragment settingsNotificationFragment, String namespace, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(namespace, "namespace");
        settingsNotificationFragment.m25665L().m25703o(new AbstractC10145d.c(namespace, z4, z13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m25673T(SettingsNotificationFragment settingsNotificationFragment) {
        settingsNotificationFragment.m25666M();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m25674U(SettingsNotificationFragment settingsNotificationFragment) {
        settingsNotificationFragment.m25667N();
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C18398c(this, 0), true, -1117547411));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C10139a(null), 3);
        getActivity();
    }
}
