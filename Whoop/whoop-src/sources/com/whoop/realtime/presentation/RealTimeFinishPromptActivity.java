package com.whoop.realtime.presentation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bh3.InterfaceC3256c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.connectivityCore.dataSyncService.models.ProcessNowSource;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.p069ui.C10540h;
import com.whoop.p069ui.C10594l;
import com.whoop.realtime.presentation.RealTimeFinishPromptActivity;
import com.whoop.realtime.service.AbstractC9908c;
import com.whoop.realtime.service.C9907b;
import com.whoop.service.network.model.UserState;
import dt0.InterfaceC12362e;
import hj0.AbstractActivityC17347f;
import hj0.C17358q;
import io.getstream.chat.android.p226ui.viewmodel.channels.DialogInterfaceOnClickListenerC19917e;
import j02.InterfaceC21153l0;
import java.util.List;
import k52.AbstractC22210f;
import k52.AbstractC22211g;
import kh3.C22488a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m02.InterfaceC24882a;
import mm.C25680d;
import nq0.C27050m;
import ny0.C27266m;
import od1.C27843f;
import od1.C27848k;
import p233ix.C21011a;
import p313lz.DialogInterfaceOnClickListenerC24814k;
import p314m.C24836e;
import p314m.C24844i;
import p505ts.AbstractC34132o;
import p705ea2.DialogInterfaceOnDismissListenerC12898c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29014c;
import p92.C29016e;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qp0.C30531a;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wm0.C37378a;
import xf3.C38266c;
import xg3.AbstractC38292s;
import xg3.C38280g;
import zg3.C40634a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 N2\u00020\u0001:\u0002OPB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010\u001bR\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010*\u001a\u0004\bK\u0010L¨\u0006Q"}, m65681d2 = {"Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;", "Lhj0/f;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lp92/e;", "startInfo", "h0", "(Lp92/e;)V", "c0", "b0", "a0", "", "endTime", "o0", "(Lp92/e;J)V", "e0", "Y", NotificationCompat.CATEGORY_STATUS, "r0", "(Lp92/e;JI)V", "Z", "T", "m0", "Ltr2/n;", "I", "Ltr2/n;", "logger", "Lwm0/a;", "J", "Ll83/h;", "W", "()Lwm0/a;", "scopeCoordinator", "Lm02/a;", "K", "U", "()Lm02/a;", "homeNavigator", "Ldt0/e;", "L", "V", "()Ldt0/e;", "processNowApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "M", "getFeatureFlagChecker", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lp92/c;", "N", "Lp92/c;", "gpsDataStore", "Lcom/whoop/ui/h;", "O", "Lcom/whoop/ui/h;", "progressDialogFragment", "Lcom/whoop/realtime/service/b;", "P", "Lcom/whoop/realtime/service/b;", "controller", "Lu92/d;", "Q", "X", "()Lu92/d;", "sharedPrefs", "R", "a", "b", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RealTimeFinishPromptActivity extends AbstractActivityC17347f {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: S */
    public static final int f28736S = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("RealTimeFinishPromptActivity");

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h scopeCoordinator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h homeNavigator;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h processNowApi;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C29014c gpsDataStore;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private C10540h progressDialogFragment;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private C9907b controller;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC23462h sharedPrefs;

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeFinishPromptActivity$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$b;", "a", "(Landroid/content/Context;)Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$b;", "", "RESULT_FAILURE", "I", "", "PROGRESS_TAG", "Ljava/lang/String;", "REQUEST_CODE_REVISE_ACTIVITY", "KEY_IS_DISCARD", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C9836b m23751a(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return new C9836b(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeFinishPromptActivity$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$b;", "Lhj0/q;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "q", "()Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$b;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9836b extends C17358q {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9836b(Context context) {
            super(context, (Class<?>) RealTimeFinishPromptActivity.class);
            AbstractC22676k.m65750j(context, "context");
        }

        /* JADX INFO: renamed from: q */
        public final C9836b m23752q() {
            m49150i().putExtra("isDiscard", false);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeFinishPromptActivity$c */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"com/whoop/realtime/presentation/RealTimeFinishPromptActivity$c", "Lxg3/s;", "", "Ll83/a0;", "onCompleted", "()V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "aBoolean", "g", "(Z)V", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9837c extends AbstractC38292s {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C29016e f28747F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ long f28748G;

        public C9837c(C29016e c29016e, long j7) {
            this.f28747F = c29016e;
            this.f28748G = j7;
        }

        /* JADX INFO: renamed from: g */
        public void m23753g(boolean aBoolean) {
        }

        @Override // xg3.InterfaceC38281h
        public void onCompleted() {
            RealTimeFinishPromptActivity.this.gpsDataStore.m88164d(this.f28747F.m88170c(), this.f28748G);
            RealTimeFinishPromptActivity.this.m23729Y();
            RealTimeFinishPromptActivity.this.logger.mo85216g("Batch uploading of Gps data is completed", new AbstractC30556a.a[0]);
        }

        @Override // xg3.InterfaceC38281h
        public void onError(Throwable e5) {
            AbstractC22676k.m65750j(e5, "e");
            RealTimeFinishPromptActivity.this.gpsDataStore.m88166i(this.f28747F.m88170c(), this.f28748G);
            RealTimeFinishPromptActivity.this.m23729Y();
            RealTimeFinishPromptActivity.this.logger.mo85230v("Error occurred while uploading Gps data", e5, new AbstractC30556a.a[0]);
        }

        @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            m23753g(((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeFinishPromptActivity$d */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.RealTimeFinishPromptActivity$showSaveProgress$1$1$1", m100430f = "RealTimeFinishPromptActivity.kt", m100431l = {205}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9838d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28749w;

        public C9838d(InterfaceC30057d<? super C9838d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RealTimeFinishPromptActivity.this.new C9838d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9838d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28749w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C37378a c37378aM23727W = RealTimeFinishPromptActivity.this.m23727W();
                this.f28749w = 1;
                if (C37378a.m119655c(c37378aM23727W, null, this, 1, null) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeFinishPromptActivity$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9839e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28751w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28752x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28753y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9839e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28751w = componentCallbacks;
            this.f28752x = interfaceC35951a;
            this.f28753y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wm0.a] */
        @Override // c93.InterfaceC4339a
        public final C37378a invoke() {
            ComponentCallbacks componentCallbacks = this.f28751w;
            InterfaceC35951a interfaceC35951a = this.f28752x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28753y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37378a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeFinishPromptActivity$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9840f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28754w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28755x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28756y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9840f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28754w = componentCallbacks;
            this.f28755x = interfaceC35951a;
            this.f28756y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m02.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC24882a invoke() {
            ComponentCallbacks componentCallbacks = this.f28754w;
            InterfaceC35951a interfaceC35951a = this.f28755x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28756y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC24882a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeFinishPromptActivity$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9841g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28757w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28758x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28759y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9841g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28757w = componentCallbacks;
            this.f28758x = interfaceC35951a;
            this.f28759y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dt0.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC12362e invoke() {
            ComponentCallbacks componentCallbacks = this.f28757w;
            InterfaceC35951a interfaceC35951a = this.f28758x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28759y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12362e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeFinishPromptActivity$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9842h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28760w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28761x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28762y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9842h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28760w = componentCallbacks;
            this.f28761x = interfaceC35951a;
            this.f28762y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f28760w;
            InterfaceC35951a interfaceC35951a = this.f28761x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28762y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.RealTimeFinishPromptActivity$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9843i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28763w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28764x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28765y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9843i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28763w = componentCallbacks;
            this.f28764x = interfaceC35951a;
            this.f28765y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u92.d] */
        @Override // c93.InterfaceC4339a
        public final C34660d invoke() {
            ComponentCallbacks componentCallbacks = this.f28763w;
            InterfaceC35951a interfaceC35951a = this.f28764x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28765y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), interfaceC35951a);
        }
    }

    public RealTimeFinishPromptActivity() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.scopeCoordinator = AbstractC30060g.m92087G(enumC23463i, new C9839e(this, null, null));
        this.homeNavigator = AbstractC30060g.m92087G(enumC23463i, new C9840f(this, null, null));
        this.processNowApi = AbstractC30060g.m92087G(enumC23463i, new C9841g(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C9842h(this, null, null));
        this.gpsDataStore = (C29014c) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29014c.class), null);
        this.sharedPrefs = AbstractC30060g.m92087G(enumC23463i, new C9843i(this, new C35953c("mainPrefs"), null));
    }

    /* JADX INFO: renamed from: T */
    private final void m23724T() {
        this.logger.mo85228t("Cleaning up from finished activity", new AbstractC30556a.a[0]);
        C35953c c35953c = new C35953c("strainCoachPrefs");
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        ((C34660d) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c)).m109537p(SharedPreferenceConstants.IS_USING_STRAIN_COACH_IN_REAL_TIME);
        ((C27843f) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(C27843f.class), null)).m83944o(UserState.States.IDLE, com.whoop.data.remote.domain.request.UserState.Idle).m122660J();
    }

    /* JADX INFO: renamed from: U */
    private final InterfaceC24882a m23725U() {
        return (InterfaceC24882a) this.homeNavigator.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final InterfaceC12362e m23726V() {
        return (InterfaceC12362e) this.processNowApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final C37378a m23727W() {
        return (C37378a) this.scopeCoordinator.getValue();
    }

    /* JADX INFO: renamed from: X */
    private final C34660d m23728X() {
        return (C34660d) this.sharedPrefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m23729Y() {
        AbstractC1638x lifecycle;
        EnumC1635w enumC1635wMo4987b;
        C10540h c10540h;
        C10540h c10540h2 = this.progressDialogFragment;
        if (c10540h2 != null && (lifecycle = c10540h2.getLifecycle()) != null && (enumC1635wMo4987b = lifecycle.getCurrentState()) != null && enumC1635wMo4987b.m5040a(EnumC1635w.f6328z) && (c10540h = this.progressDialogFragment) != null) {
            c10540h.dismiss();
        }
        finish();
    }

    /* JADX INFO: renamed from: Z */
    private final void m23730Z(C29016e startInfo, long endTime) {
        Uri uri = Uri.parse(C30531a.Companion.m93590e(C30531a.INSTANCE, startInfo.m88170c(), endTime, null, 4, null));
        InterfaceC24882a interfaceC24882aM23725U = m23725U();
        AbstractC22676k.m65747g(uri);
        interfaceC24882aM23725U.mo58971a(this, uri);
        setResult(-1);
        m23724T();
    }

    /* JADX INFO: renamed from: a0 */
    private final void m23731a0(C29016e startInfo) {
        m49099s().m129065w0(AbstractC9885i.m24030d(startInfo));
        setResult(0);
        finish();
    }

    /* JADX INFO: renamed from: b0 */
    private final void m23732b0(C29016e startInfo) {
        m49099s().m129063v0(AbstractC9885i.m24030d(startInfo));
        C9907b c9907b = this.controller;
        if (c9907b == null) {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
        c9907b.m24276p();
        setResult(-1);
        finish();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m23733c0(C29016e startInfo) {
        this.logger.mo85228t("Saving Workout", new AbstractC30556a.a[0]);
        m49099s().m129067x0(AbstractC9885i.m24030d(startInfo));
        m23726V().mo34626a(ProcessNowSource.STRAIN_COACH);
        C9907b c9907b = this.controller;
        if (c9907b == null) {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
        AbstractC1615p0 abstractC1615p0M24279u = c9907b.m24279u();
        if (abstractC1615p0M24279u != null) {
            abstractC1615p0M24279u.observe(this, new AbstractC9885i.a(new C27050m(7, this, startInfo)));
        } else {
            m23745o0(startInfo, System.currentTimeMillis());
            this.logger.mo85216g("getLocationHistoryLiveData returned null", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m23734d0(RealTimeFinishPromptActivity realTimeFinishPromptActivity, C29016e c29016e, List list) {
        C9907b c9907b = realTimeFinishPromptActivity.controller;
        if (c9907b == null) {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
        c9907b.m24272P(list);
        realTimeFinishPromptActivity.m23745o0(c29016e, System.currentTimeMillis());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e0 */
    private final void m23735e0(C29016e startInfo, long endTime) {
        C9907b c9907b = this.controller;
        if (c9907b != null) {
            m49097o(C38280g.m122644q(c9907b.m24270N(startInfo, endTime)).m122679o(new C25680d(new C27266m(18), 6)).m122665P(C22488a.m64989a().f88182b).m122652B(C40634a.m131874a()).m122664N(new C9837c(startInfo, endTime)));
        } else {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C38280g m23736f0(C38280g c38280g) {
        return c38280g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C38280g m23737g0(Function1 function1, Object obj) {
        return (C38280g) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    private final void m23738h0(final C29016e startInfo) {
        int i13;
        boolean zM24032f = AbstractC9885i.m24032f(startInfo);
        boolean zM24031e = AbstractC9885i.m24031e(startInfo);
        final C21011a c21011a = new C21011a(0);
        String string = getString(zM24032f ? AbstractC22210f.f86526w : AbstractC22210f.f86523v);
        AbstractC22676k.m65749i(string, "getString(...)");
        if (zM24032f) {
            i13 = AbstractC22210f.f86462a1;
        } else {
            i13 = zM24031e ? AbstractC22210f.f86457Y0 : AbstractC22210f.f86459Z0;
        }
        int i14 = zM24032f ? AbstractC22210f.f86517t : AbstractC22210f.f86520u;
        C24844i c24844i = new C24844i(this, AbstractC22211g.f86538a);
        c24844i.m72849b(i13);
        c24844i.m72848a(i14);
        final int i15 = 0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: o52.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ RealTimeFinishPromptActivity f110933x;

            {
                this.f110933x = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                switch (i15) {
                    case 0:
                        RealTimeFinishPromptActivity.m23739i0(this.f110933x, startInfo, c21011a, dialogInterface, i16);
                        break;
                    default:
                        RealTimeFinishPromptActivity.m23740j0(this.f110933x, startInfo, c21011a, dialogInterface, i16);
                        break;
                }
            }
        };
        C24836e c24836e = c24844i.f97324a;
        c24836e.f97262g = string;
        c24836e.f97263h = onClickListener;
        int i16 = AbstractC22210f.f86472e;
        final int i17 = 1;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: o52.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ RealTimeFinishPromptActivity f110933x;

            {
                this.f110933x = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i18) {
                switch (i17) {
                    case 0:
                        RealTimeFinishPromptActivity.m23739i0(this.f110933x, startInfo, c21011a, dialogInterface, i18);
                        break;
                    default:
                        RealTimeFinishPromptActivity.m23740j0(this.f110933x, startInfo, c21011a, dialogInterface, i18);
                        break;
                }
            }
        };
        c24836e.f97266k = c24836e.f97256a.getText(i16);
        c24836e.f97267l = onClickListener2;
        C24844i negativeButton = c24844i.setNegativeButton(AbstractC22210f.f86495l1, new DialogInterfaceOnClickListenerC19917e(1, this, startInfo));
        negativeButton.f97324a.f97270o = new DialogInterface.OnDismissListener() { // from class: o52.i
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                RealTimeFinishPromptActivity.m23742l0(c21011a, this, startInfo, dialogInterface);
            }
        };
        negativeButton.m72850c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m23739i0(RealTimeFinishPromptActivity realTimeFinishPromptActivity, C29016e c29016e, C21011a c21011a, DialogInterface dialogInterface, int i13) {
        realTimeFinishPromptActivity.m23733c0(c29016e);
        c21011a.f79523a = Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m23740j0(RealTimeFinishPromptActivity realTimeFinishPromptActivity, C29016e c29016e, C21011a c21011a, DialogInterface dialogInterface, int i13) {
        realTimeFinishPromptActivity.m23732b0(c29016e);
        c21011a.f79523a = Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m23741k0(RealTimeFinishPromptActivity realTimeFinishPromptActivity, C29016e c29016e, DialogInterface dialogInterface, int i13) {
        realTimeFinishPromptActivity.m23731a0(c29016e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m23742l0(C21011a c21011a, RealTimeFinishPromptActivity realTimeFinishPromptActivity, C29016e c29016e, DialogInterface dialogInterface) {
        if (((Boolean) c21011a.f79523a).booleanValue()) {
            return;
        }
        realTimeFinishPromptActivity.m49099s().m129061u0(AbstractC9885i.m24030d(c29016e));
        realTimeFinishPromptActivity.setResult(0);
        realTimeFinishPromptActivity.finish();
    }

    /* JADX INFO: renamed from: m0 */
    private final void m23743m0(C29016e startInfo, long endTime) {
        C9907b c9907b = this.controller;
        if (c9907b == null) {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
        c9907b.m24268J(startInfo, endTime);
        C24844i c24844i = new C24844i(this);
        c24844i.m72849b(AbstractC22210f.f86487j);
        c24844i.m72848a(AbstractC22210f.f86484i);
        c24844i.f97324a.f97268m = false;
        C24844i positiveButton = c24844i.setPositiveButton(AbstractC22210f.f86498m1, null);
        positiveButton.f97324a.f97270o = new DialogInterfaceOnDismissListenerC12898c(this, 2);
        positiveButton.m72850c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m23744n0(RealTimeFinishPromptActivity realTimeFinishPromptActivity, DialogInterface dialogInterface) {
        realTimeFinishPromptActivity.setResult(-1);
        realTimeFinishPromptActivity.finish();
    }

    /* JADX INFO: renamed from: o0 */
    private final void m23745o0(final C29016e startInfo, final long endTime) {
        final C21011a c21011a = new C21011a(0);
        AbstractC1329o1 supportFragmentManager = getSupportFragmentManager();
        String string = getString(AbstractC22210f.f86430L);
        C10594l c10594lM49098r = m49098r();
        C9907b c9907b = this.controller;
        if (c9907b == null) {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
        C38280g<C27848k> c38280gM24269M = c9907b.m24269M(endTime);
        final int i13 = 0;
        InterfaceC3256c interfaceC3256c = new InterfaceC3256c() { // from class: o52.j
            @Override // bh3.InterfaceC3256c
            /* JADX INFO: renamed from: c */
            public final void mo9473c(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        RealTimeFinishPromptActivity.m23746p0(c21011a, this, startInfo, endTime, (C27848k) obj, (C10540h) obj2);
                        break;
                    default:
                        RealTimeFinishPromptActivity.m23747q0(c21011a, this, startInfo, endTime, (Throwable) obj, (C10540h) obj2);
                        break;
                }
            }
        };
        final int i14 = 1;
        C10540h.m27198L(supportFragmentManager, "SaveProgress", string, null, c10594lM49098r, c38280gM24269M, interfaceC3256c, new InterfaceC3256c() { // from class: o52.j
            @Override // bh3.InterfaceC3256c
            /* JADX INFO: renamed from: c */
            public final void mo9473c(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        RealTimeFinishPromptActivity.m23746p0(c21011a, this, startInfo, endTime, (C27848k) obj, (C10540h) obj2);
                        break;
                    default:
                        RealTimeFinishPromptActivity.m23747q0(c21011a, this, startInfo, endTime, (Throwable) obj, (C10540h) obj2);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m23746p0(C21011a c21011a, RealTimeFinishPromptActivity realTimeFinishPromptActivity, C29016e c29016e, long j7, C27848k c27848k, C10540h progressDialogFragment) {
        AbstractC22676k.m65750j(progressDialogFragment, "progressDialogFragment");
        synchronized (c21011a) {
            try {
                if (!((Boolean) c21011a.f79523a).booleanValue()) {
                    c21011a.f79523a = Boolean.TRUE;
                    int iM24286g = AbstractC9908c.m24286g(c27848k);
                    if (iM24286g == 0) {
                        realTimeFinishPromptActivity.m23728X().m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_COMPLETED, true);
                        realTimeFinishPromptActivity.setResult(-1);
                        realTimeFinishPromptActivity.progressDialogFragment = progressDialogFragment;
                        realTimeFinishPromptActivity.m23735e0(c29016e, System.currentTimeMillis());
                        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(realTimeFinishPromptActivity), null, null, realTimeFinishPromptActivity.new C9838d(null), 3);
                        realTimeFinishPromptActivity.m23725U().mo58972b(realTimeFinishPromptActivity);
                    } else if (iM24286g != 5) {
                        progressDialogFragment.dismiss();
                        realTimeFinishPromptActivity.m23748r0(c29016e, j7, iM24286g);
                    } else {
                        progressDialogFragment.dismiss();
                        realTimeFinishPromptActivity.m23743m0(c29016e, j7);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m23747q0(C21011a c21011a, RealTimeFinishPromptActivity realTimeFinishPromptActivity, C29016e c29016e, long j7, Throwable th3, C10540h progressDialogFragment) {
        AbstractC22676k.m65750j(progressDialogFragment, "progressDialogFragment");
        progressDialogFragment.dismissAllowingStateLoss();
        synchronized (c21011a) {
            if (!((Boolean) c21011a.f79523a).booleanValue()) {
                c21011a.f79523a = Boolean.TRUE;
                realTimeFinishPromptActivity.m23748r0(c29016e, j7, 400);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    private final void m23748r0(final C29016e startInfo, final long endTime, int status) {
        String strM24284e = AbstractC9908c.m24284e(this, status);
        String strM24282c = AbstractC9908c.m24282c(this, status, startInfo, endTime);
        C24844i title = new C24844i(this).setTitle(strM24284e);
        C24836e c24836e = title.f97324a;
        c24836e.f97261f = strM24282c;
        c24836e.f97268m = false;
        title.setPositiveButton(AbstractC22210f.f86475f, new DialogInterface.OnClickListener() { // from class: o52.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                RealTimeFinishPromptActivity.m23749s0(this.f110938w, startInfo, endTime, dialogInterface, i13);
            }
        }).setNegativeButton(AbstractC22210f.f86495l1, new DialogInterfaceOnClickListenerC24814k(this, 1)).m72850c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m23749s0(RealTimeFinishPromptActivity realTimeFinishPromptActivity, C29016e c29016e, long j7, DialogInterface dialogInterface, int i13) {
        realTimeFinishPromptActivity.m23730Z(c29016e, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m23750t0(RealTimeFinishPromptActivity realTimeFinishPromptActivity, DialogInterface dialogInterface, int i13) {
        realTimeFinishPromptActivity.setResult(241);
        realTimeFinishPromptActivity.finish();
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 311) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == -1) {
            setResult(-1);
        } else {
            setResult(241);
        }
        finish();
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C9907b c9907b = new C9907b(this);
        this.controller = c9907b;
        C29016e c29016eM24278s = c9907b.m24278s();
        if (c29016eM24278s == null) {
            this.logger.mo85222m("No running activity found, aborting", new AbstractC30556a.a[0]);
            setResult(0);
            finish();
            return;
        }
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = getSupportFragmentManager().m4140E("SaveProgress");
        C10540h c10540hM27205S = abstractComponentCallbacksC1320m0M4140E instanceof C10540h ? (C10540h) abstractComponentCallbacksC1320m0M4140E : null;
        if (c10540hM27205S == null) {
            c10540hM27205S = C10540h.m27205S();
        }
        this.progressDialogFragment = c10540hM27205S;
        m23738h0(c29016eM24278s);
        ((InterfaceC21153l0) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21153l0.class), null)).mo59004J("RealTimeFinishPromptActivity");
    }

    @Override // hj0.AbstractActivityC17347f, p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9907b c9907b = this.controller;
        if (c9907b != null) {
            c9907b.m24277q();
        } else {
            AbstractC22676k.m65757q("controller");
            throw null;
        }
    }
}
