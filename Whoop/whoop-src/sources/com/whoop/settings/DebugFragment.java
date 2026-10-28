package com.whoop.settings;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.room.ExecutorC1834u1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.squareup.wire.AbstractC5583n;
import com.whoop.analytics.MetricEventModel;
import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.debug.dismissalplayground.DismissalPlaygroundFragment;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.home.domain.HomeApi;
import com.whoop.home.domain.dayOneTransition.TransitionOverlayCompleteBody;
import com.whoop.navigation.GenericCachePolicy;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.puffin.sync.BatteryPackRelativeEventsWorker;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.settings.DebugFragment;
import com.whoop.video.VideoActivity;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import dt0.InterfaceC12361d;
import dx2.C12430a;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f52.C14103a;
import fc3.AbstractC14371b;
import ge3.AbstractC15751g;
import gk2.C15929d;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.EnumC21177x0;
import j02.InterfaceC21159o0;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import jk0.InterfaceC21750d;
import kd1.AbstractC22387b0;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import or2.AbstractC28163g0;
import or2.C28198s;
import p007a6.InterfaceC0422g;
import p114eb.C12997x0;
import p114eb.InterfaceC12981p0;
import p138f6.C14129a;
import p218ic.AbstractC18377p0;
import p218ic.C18391y;
import p249jc.C21596v;
import p314m.C24844i;
import p314m.DialogInterfaceC24846j;
import p390p1.C28635l;
import p390p1.C28655q;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p705ea2.C12894a;
import p705ea2.C12896b;
import p705ea2.DialogInterfaceOnDismissListenerC12898c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import pf.AbstractC29125c;
import px0.C29592b;
import q80.C30036h;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc.C32352b;
import sj2.InterfaceC32564a;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import uf3.C34911a;
import vf3.C35953c;
import vh2.InterfaceC36049d;
import vk0.InterfaceC36079e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import xf3.C38266c;
import y42.C39228j;
import y42.InterfaceC39219a;
import yh2.EnumC39542a;
import yh2.InterfaceC39544c;
import yr2.AbstractC39738c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0003J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\u0003J\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0003J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010\u0003R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, m65681d2 = {"Lcom/whoop/settings/DebugFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Q3", "f4", "Lyh2/c;", "api", "Ljk0/d;", "strap", "Lyh2/a;", "type", "Lec3/l;", "", "S3", "(Lyh2/c;Ljk0/d;Lyh2/a;)Lec3/l;", "epochMs", "", "O3", "(J)Ljava/lang/String;", "E1", "P3", "R3", "T3", "N3", "U3", "Lj02/x0;", "autoTrigger", "Y3", "(Lj02/x0;)V", "W3", "I3", "H3", "M3", "a4", "K3", "L3", "J3", "e4", "Lu92/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lu92/d;", "sharedPrefs", "La6/g;", "Lf6/f;", "x", "La6/g;", "prefsDataStore", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "y", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljava/time/format/DateTimeFormatter;", "z", "Ljava/time/format/DateTimeFormatter;", "localHpsWatermarkTimeFormat", "", "Lcom/whoop/settings/b;", "E", "Ljava/util/List;", "categorizedItems", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DebugFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final List<C10093b> categorizedItems;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C34660d sharedPrefs;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final DateTimeFormatter localHpsWatermarkTimeFormat;

    /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$abortBatterySync$1", m100430f = "DebugFragment.kt", m100431l = {458}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10025a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30074w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC39219a f30075x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10025a(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super C10025a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30075x = interfaceC39219a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10025a(this.f30075x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10025a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30074w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14103a c14103a = new C14103a();
                InterfaceC39219a interfaceC39219a = this.f30075x;
                this.f30074w = 1;
                obj = c14103a.m40171a(interfaceC39219a, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC34116n.INSTANCE.m107848a("DebugFragment").mo85228t("Puffin HPS resulted in " + ((InterfaceC36079e) obj), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$categorizedItems$103$1", m100430f = "DebugFragment.kt", m100431l = {364}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10026b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30076w;

        public C10026b(InterfaceC30057d<? super C10026b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DebugFragment.this.new C10026b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10026b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30076w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15929d c15929d = (C15929d) AbstractC29125c.m88492A(DebugFragment.this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15929d.class), null);
                this.f30076w = 1;
                if (c15929d.m44976m(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$clearAllDayZeroNotificationCardsTasksCompletion$1", m100430f = "DebugFragment.kt", m100431l = {542, 545, 548, 551, 554, 557}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10027c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f30078w;

        /* JADX INFO: renamed from: x */
        int f30079x;

        public C10027c(InterfaceC30057d<? super C10027c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DebugFragment.this.new C10027c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10027c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0083 A[PHI: r1
          0x0083: PHI (r1v9 com.whoop.home.domain.HomeApi) = (r1v6 com.whoop.home.domain.HomeApi), (r1v11 com.whoop.home.domain.HomeApi) binds: [B:17:0x0080, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x0096 A[PHI: r1
          0x0096: PHI (r1v12 com.whoop.home.domain.HomeApi) = (r1v9 com.whoop.home.domain.HomeApi), (r1v14 com.whoop.home.domain.HomeApi) binds: [B:20:0x0093, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x00a9 A[PHI: r1
          0x00a9: PHI (r1v15 com.whoop.home.domain.HomeApi) = (r1v12 com.whoop.home.domain.HomeApi), (r1v17 com.whoop.home.domain.HomeApi) binds: [B:23:0x00a6, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e0, code lost:
        
            if (r6.updateSleepCoachOnBoardingStatus(r1, r5) == r0) goto L30;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.DebugFragment.C10027c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$d */
    @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$clearTransitionOverlay$1", m100430f = "DebugFragment.kt", m100431l = {572}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10028d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30081w;

        public C10028d(InterfaceC30057d<? super C10028d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DebugFragment.this.new C10028d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10028d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30081w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HomeApi homeApi = (HomeApi) AbstractC29125c.m88492A(DebugFragment.this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(HomeApi.class), null);
                TransitionOverlayCompleteBody transitionOverlayCompleteBody = new TransitionOverlayCompleteBody(16358, false);
                this.f30081w = 1;
                if (homeApi.completeFeatureEducation(transitionOverlayCompleteBody, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$e */
    @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$initBatterySync$1", m100430f = "DebugFragment.kt", m100431l = {470}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10029e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30083w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC39219a f30084x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10029e(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super C10029e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30084x = interfaceC39219a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10029e(this.f30084x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10029e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30083w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC3018i0 interfaceC3018i0M40172b = new C14103a().m40172b(this.f30084x);
                this.f30083w = 1;
                obj = interfaceC3018i0M40172b.await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC34116n.INSTANCE.m107848a("DebugFragment").mo85228t("Puffin HPS resulted in " + ((InterfaceC36079e) obj), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$f */
    @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$liveWatermarkFlow$1", m100430f = "DebugFragment.kt", m100431l = {436, 439, 440}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10030f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        long f30085w;

        /* JADX INFO: renamed from: x */
        int f30086x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f30087y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13037f2 f30088z;

        /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC11936u f30089w;

            public a(InterfaceC11936u interfaceC11936u) {
                this.f30089w = interfaceC11936u;
            }

            /* JADX INFO: renamed from: b */
            public final Object m25046b(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objMo32219t = ((C11935t) this.f30089w).f39041z.mo32219t(new Long(j7), interfaceC30057d);
                return objMo32219t == EnumC31071a.f128113w ? objMo32219t : C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m25046b(((Number) obj).longValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$f$b */
        @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$liveWatermarkFlow$1$first$1", m100430f = "DebugFragment.kt", m100431l = {437}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)J"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f30090w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13037f2 f30091x;

            /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$f$b$a */
            @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$liveWatermarkFlow$1$first$1$1", m100430f = "DebugFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "it", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f30092w;

                /* JADX INFO: renamed from: x */
                /* synthetic */ long f30093x;

                public a(InterfaceC30057d<? super a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    a aVar = new a(interfaceC30057d);
                    aVar.f30093x = ((Number) obj).longValue();
                    return aVar;
                }

                /* JADX INFO: renamed from: f */
                public final Object m25047f(long j7, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                    return ((a) create(Long.valueOf(j7), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m25047f(((Number) obj).longValue(), (InterfaceC30057d) obj2);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    long j7 = this.f30093x;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    if (this.f30092w != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return Boolean.valueOf(j7 == 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13037f2 interfaceC13037f2, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f30091x = interfaceC13037f2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f30091x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Long> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f30090w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C13015a0 c13015a0 = new C13015a0(3, new a(null), this.f30091x);
                this.f30090w = 1;
                Object objM36575A = AbstractC13091v.m36575A(c13015a0, this);
                return objM36575A == enumC31071a ? enumC31071a : objM36575A;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10030f(InterfaceC13037f2 interfaceC13037f2, InterfaceC30057d<? super C10030f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30088z = interfaceC13037f2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10030f c10030f = new C10030f(this.f30088z, interfaceC30057d);
            c10030f.f30087y = obj;
            return c10030f;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10030f) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        
            if (r9.collect(r2, r8) == r1) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f30087y
                dc3.u r0 = (dc3.InterfaceC11936u) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f30086x
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L2a
                if (r2 == r6) goto L26
                if (r2 == r5) goto L20
                if (r2 == r4) goto L1c
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L82
            L20:
                long r5 = r8.f30085w
                p505ts.AbstractC34132o.m107864I(r9)
                goto L6e
            L26:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L41
            L2a:
                p505ts.AbstractC34132o.m107864I(r9)
                com.whoop.settings.DebugFragment$f$b r9 = new com.whoop.settings.DebugFragment$f$b
                ec3.f2 r2 = r8.f30088z
                r9.<init>(r2, r3)
                r8.f30087y = r0
                r8.f30086x = r6
                r6 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r9 = bc3.AbstractC3028k2.m8750d(r6, r9, r8)
                if (r9 != r1) goto L41
                goto L81
            L41:
                java.lang.Long r9 = (java.lang.Long) r9
                if (r9 == 0) goto L4a
                long r6 = r9.longValue()
                goto L56
            L4a:
                ec3.f2 r9 = r8.f30088z
                java.lang.Object r9 = r9.getValue()
                java.lang.Number r9 = (java.lang.Number) r9
                long r6 = r9.longValue()
            L56:
                java.lang.Long r9 = new java.lang.Long
                r9.<init>(r6)
                r8.f30087y = r0
                r8.f30085w = r6
                r8.f30086x = r5
                r2 = r0
                dc3.t r2 = (dc3.C11935t) r2
                dc3.h r2 = r2.f39041z
                java.lang.Object r9 = r2.mo32219t(r9, r8)
                if (r9 != r1) goto L6d
                goto L81
            L6d:
                r5 = r6
            L6e:
                ec3.f2 r9 = r8.f30088z
                com.whoop.settings.DebugFragment$f$a r2 = new com.whoop.settings.DebugFragment$f$a
                r2.<init>(r0)
                r8.f30087y = r3
                r8.f30085w = r5
                r8.f30086x = r4
                java.lang.Object r9 = r9.collect(r2, r8)
                if (r9 != r1) goto L82
            L81:
                return r1
            L82:
                kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.DebugFragment.C10030f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$g */
    @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$lockStrap$1", m100430f = "DebugFragment.kt", m100431l = {492}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10031g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30094w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21750d f30096y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10031g(InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C10031g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30096y = interfaceC21750d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DebugFragment.this.new C10031g(this.f30096y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10031g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30094w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC36049d interfaceC36049d = (InterfaceC36049d) AbstractC29125c.m88492A(DebugFragment.this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC36049d.class), null);
                InterfaceC21750d interfaceC21750d = this.f30096y;
                this.f30094w = 1;
                obj = interfaceC36049d.mo114450c(interfaceC21750d, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Toast.makeText(DebugFragment.this.requireContext(), ((Boolean) obj).booleanValue() ? "Strap locked" : "Lock failed", 0).show();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$h */
    @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$resetIsFirstAppLaunchLocalFlag$1", m100430f = "DebugFragment.kt", m100431l = {600}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10032h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30097w;

        /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$resetIsFirstAppLaunchLocalFlag$1$1", m100430f = "DebugFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f30099w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f30100x;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f30100x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f30100x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f30099w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c14129a.m40230g(AbstractC39738c.m127158a(), Boolean.TRUE);
                return C23454a0.f92919a;
            }
        }

        public C10032h(InterfaceC30057d<? super C10032h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DebugFragment.this.new C10032h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10032h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30097w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = DebugFragment.this.prefsDataStore;
                a aVar = new a(null);
                this.f30097w = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$i */
    @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$showLocalStorageWatermarks$collectJob$1", m100430f = "DebugFragment.kt", m100431l = {413}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10033i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ TextView f30101E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC39544c f30102F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC21750d f30103G;

        /* JADX INFO: renamed from: w */
        Object f30104w;

        /* JADX INFO: renamed from: x */
        Object f30105x;

        /* JADX INFO: renamed from: y */
        int f30106y;

        /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ DebugFragment f30108w;

            public a(DebugFragment debugFragment) {
                this.f30108w = debugFragment;
            }

            @Override // p715kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(C23465k c23465k) {
                AbstractC22676k.m65750j(c23465k, "<destruct>");
                return AbstractC18489d0.m53370k(((EnumC39542a) c23465k.f92937w).name(), ": ", this.f30108w.m24877O3(((Number) c23465k.f92938x).longValue()));
            }
        }

        /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$i$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ DebugFragment f30109w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ TextView f30110x;

            public b(DebugFragment debugFragment, TextView textView) {
                this.f30109w = debugFragment;
                this.f30110x = textView;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (this.f30109w.isAdded()) {
                    this.f30110x.setText(str);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$i$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l[] f30111w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC33616a f30112x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ DebugFragment f30113y;

            /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$i$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a implements InterfaceC4339a {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13058l[] f30114w;

                public a(InterfaceC13058l[] interfaceC13058lArr) {
                    this.f30114w = interfaceC13058lArr;
                }

                @Override // c93.InterfaceC4339a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long[] invoke() {
                    return new Long[this.f30114w.length];
                }
            }

            /* JADX INFO: renamed from: com.whoop.settings.DebugFragment$i$c$b */
            @InterfaceC32271e(m100429c = "com.whoop.settings.DebugFragment$showLocalStorageWatermarks$collectJob$1$invokeSuspend$$inlined$combine$1$3", m100430f = "DebugFragment.kt", m100431l = {288}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"R", "T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lkotlin/Array;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class b extends AbstractC32275i implements Function3 {

                /* JADX INFO: renamed from: E */
                final /* synthetic */ DebugFragment f30115E;

                /* JADX INFO: renamed from: w */
                int f30116w;

                /* JADX INFO: renamed from: x */
                private /* synthetic */ Object f30117x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f30118y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ InterfaceC33616a f30119z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(InterfaceC30057d interfaceC30057d, InterfaceC33616a interfaceC33616a, DebugFragment debugFragment) {
                    super(3, interfaceC30057d);
                    this.f30119z = interfaceC33616a;
                    this.f30115E = debugFragment;
                }

                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(InterfaceC13062m interfaceC13062m, Long[] lArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    b bVar = new b(interfaceC30057d, this.f30119z, this.f30115E);
                    bVar.f30117x = interfaceC13062m;
                    bVar.f30118y = lArr;
                    return bVar.invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f30116w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f30117x;
                        String strM74110N0 = AbstractC25265s.m74110N0(AbstractC25265s.m74107K1(this.f30119z, AbstractC25260n.m74049W0((Long[]) ((Object[]) this.f30118y))), "\n", null, null, new a(this.f30115E), 30);
                        this.f30117x = null;
                        this.f30118y = null;
                        this.f30116w = 1;
                        if (interfaceC13062m.emit(strM74110N0, this) == enumC31071a) {
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

            public c(InterfaceC13058l[] interfaceC13058lArr, InterfaceC33616a interfaceC33616a, DebugFragment debugFragment) {
                this.f30111w = interfaceC13058lArr;
                this.f30112x = interfaceC33616a;
                this.f30113y = debugFragment;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                InterfaceC13058l[] interfaceC13058lArr = this.f30111w;
                Object objM41038a = AbstractC14371b.m41038a(new a(interfaceC13058lArr), interfaceC13062m, new b(null, this.f30112x, this.f30113y), interfaceC30057d, interfaceC13058lArr);
                return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10033i(TextView textView, InterfaceC39544c interfaceC39544c, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C10033i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30101E = textView;
            this.f30102F = interfaceC39544c;
            this.f30103G = interfaceC21750d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DebugFragment.this.new C10033i(this.f30101E, this.f30102F, this.f30103G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10033i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30106y;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC33616a entries = EnumC39542a.getEntries();
                    DebugFragment debugFragment = DebugFragment.this;
                    InterfaceC39544c interfaceC39544c = this.f30102F;
                    InterfaceC21750d interfaceC21750d = this.f30103G;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(entries, 10));
                    Iterator<E> it = entries.iterator();
                    while (it.hasNext()) {
                        arrayList.add(debugFragment.m24897S3(interfaceC39544c, interfaceC21750d, (EnumC39542a) it.next()));
                    }
                    c cVar = new c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), entries, DebugFragment.this);
                    b bVar = new b(DebugFragment.this, this.f30101E);
                    this.f30104w = null;
                    this.f30105x = null;
                    this.f30106y = 1;
                    if (cVar.collect(bVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (CancellationException e5) {
                throw e5;
            } catch (Exception e13) {
                if (DebugFragment.this.isAdded()) {
                    TextView textView = this.f30101E;
                    String message = e13.getMessage();
                    if (message == null) {
                        message = "Could not read watermarks";
                    }
                    textView.setText(message);
                }
            }
            return C23454a0.f92919a;
        }
    }

    public DebugFragment() {
        C35953c c35953c = new C35953c("mainPrefs");
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.sharedPrefs = (C34660d) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c);
        this.prefsDataStore = (InterfaceC0422g) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        this.featureFlagChecker = featureFlagChecker;
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS zzz").withLocale(Locale.getDefault()).withZone(ZoneId.systemDefault());
        AbstractC22676k.m65749i(dateTimeFormatterWithZone, "withZone(...)");
        this.localHpsWatermarkTimeFormat = dateTimeFormatterWithZone;
        C10093b c10093b = new C10093b("🎨 Design", AbstractC37056f.m118959K(new C23465k("design showcase", new C12896b(this, 18)), new C23465k("JSON Playground", new C12896b(this, 13)), new C23465k("lottie tester", new C12896b(this, 25)), new C23465k("toggle design viewstate names debug mode", new C12430a(29))));
        final int i13 = 18;
        C23465k c23465k = new C23465k("feature flag settings", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        });
        final int i14 = 0;
        C23465k c23465k2 = new C23465k("local service overrides 🔧", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        });
        final int i15 = 13;
        C23465k c23465k3 = new C23465k("iterable", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        });
        final int i16 = 25;
        C23465k c23465k4 = new C23465k("iterable tool", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        });
        final int i17 = 7;
        C23465k c23465k5 = new C23465k("main console", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        });
        C23465k c23465k6 = new C23465k("Experiments 🧪", new C12896b(this, 3));
        final int i18 = 1;
        C23465k c23465k7 = new C23465k("Set fake battery level 🔋", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        });
        final int i19 = 12;
        C23465k c23465k8 = new C23465k("prune workmanager jobs", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        });
        final int i24 = 23;
        C10093b c10093b2 = new C10093b("🛠️ Tools", AbstractC37056f.m118959K(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, c23465k7, c23465k8, new C23465k("crash immediately", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        })));
        final int i25 = 4;
        final int i26 = 15;
        C10093b c10093b3 = new C10093b("🏗️ Arch-V2", AbstractC25260n.m74077r0(new C23465k[]{new C23465k("Arch V2 Playground", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Dismissal Playground 🚪", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), featureFlagChecker.isFeatureEnabled("track-activity-targets") ? new C23465k("Targets Demo Screen 🎯", new C12896b(this, 8)) : null}));
        C10093b c10093b4 = new C10093b("🩺 CITL", AbstractC37056f.m118959K(new C23465k("Video call", new C12896b(this, 9)), new C23465k("Clinician In The Loop Scheduling", new C12896b(this, 10)), new C23465k("Health Intake", new C12896b(this, 11))));
        C10093b c10093b5 = new C10093b("📡 Connectivity", AbstractC37056f.m118959K(new C23465k("Whoop BLE Pipeline V2", new C12896b(this, 12)), new C23465k("whoop strap test", new C12896b(this, 14)), new C23465k("lock strap 🔒", new C12896b(this, 15)), new C23465k("strap sync (process now)", new C12896b(this, 16)), new C23465k("strap sync (standard)", new C12896b(this, 17)), new C23465k("local HPS watermarks", new C12896b(this, 19)), new C23465k("INIT BATTERY PACK SYNC", new C12896b(this, 20)), new C23465k("ABORT BATTERY PACK SYNC", new C12896b(this, 21)), new C23465k("INIT BATTERY UPLOAD", new C12896b(this, 22)), new C23465k("INIT STRAP SYNC", new C12896b(this, 23))));
        final int i27 = 0;
        final int i28 = 1;
        final int i29 = 2;
        final int i34 = 3;
        final int i35 = 4;
        final int i36 = 5;
        final int i37 = 6;
        final int i38 = 7;
        final int i39 = 8;
        final int i44 = 10;
        final int i45 = 11;
        final int i46 = 12;
        final int i47 = 13;
        final int i48 = 14;
        final int i49 = 15;
        final int i54 = 16;
        final int i55 = 17;
        C10093b c10093b6 = new C10093b("📈 Growth", AbstractC37056f.m118959K(new C23465k("ACTIVATION", new C12896b(this, 24)), new C23465k("UPCYCLE", new C12896b(this, 26)), new C23465k("NATIVE FAMILY PLAN", new C12896b(this, 27)), new C23465k("REACTIVATION UPSELL", new C12896b(this, 28)), new C23465k("GIFT MEMBERSHIP", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Gifted", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Gifting AL", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Universal Checkout", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i34) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Universal Checkout - Shipping Info Testing", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i35) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Order Confirmation", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i36) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("LimitedTimeOffer", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i37) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("RAF Receiver 🤝", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i38) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Advanced Labs Join", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i39) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Advanced Labs Management", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Marketing Consent", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i45) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("whoopshare", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i46) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Payment V2", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i47) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Native Shop", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i48) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Buy Now", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i49) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Universal Checkout - Auto-open Shipping Address", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i54) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Universal Checkout - Auto-open Payment Method", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i55) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        })));
        final int i56 = 19;
        final int i57 = 21;
        final int i58 = 22;
        final int i59 = 23;
        final int i64 = 24;
        C10093b c10093b7 = new C10093b("🤖 AI", AbstractC37056f.m118959K(new C23465k("AI Insights", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i56) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("AI Chat Talk/Text Card", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i57) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("AI Chat Q&A Form Widget", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i58) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("AI Chat Journal-Entry Widget", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i59) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Coach Auto-Pop drawer_presentation tester", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i64) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        })));
        final int i65 = 25;
        C23465k c23465k9 = new C23465k("Motion Tracking Sandbox", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i65) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        });
        final int i66 = 26;
        C23465k c23465k10 = new C23465k("hub and spoke", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i66) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        });
        final int i67 = 27;
        final int i68 = 28;
        final int i69 = 29;
        final int i74 = 2;
        final int i75 = 3;
        final int i76 = 4;
        final int i77 = 5;
        C10093b c10093b8 = new C10093b("⚡ Core", AbstractC37056f.m118959K(c23465k9, c23465k10, new C23465k("Challenge Details", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i67) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Achievements", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i68) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("clear journal settings", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i69) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }), new C23465k("Year in Review 2025", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i74) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("Action Plan", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i75) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("SMS Setup", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i76) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("SMS Settings", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i77) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        })));
        final int i78 = 6;
        C23465k c23465k11 = new C23465k("Day-0 Personalization Chat 💬", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i78) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        });
        final int i79 = 7;
        final int i83 = 8;
        final int i84 = 9;
        final int i85 = 10;
        final int i86 = 11;
        final int i87 = 14;
        final int i88 = 15;
        final int i89 = 16;
        final int i94 = 17;
        final int i95 = 18;
        final int i96 = 19;
        C10093b c10093b9 = new C10093b("📚 Onboarding", AbstractC37056f.m118959K(c23465k11, new C23465k("Onboarding Stories Tester 📚", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i79) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("Feature Education Tester 🎓", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i83) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("Onboarding Status Debug 📁", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i84) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("sage onboarding", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i85) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("Password Reset Screen 🔐", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i86) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("clear new home onboarding settings", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i87) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("clear fab onboarding settings", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i88) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("reset transition overlay", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i89) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("reset All Day Zero Tasks", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i94) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("reset All Day Zero Animations", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i95) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("Reset IS_FIRST_APP_LAUNCH local flag", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i96) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        })));
        final int i97 = 20;
        final int i98 = 21;
        final int i99 = 22;
        final int i100 = 24;
        final int i101 = 26;
        final int i102 = 27;
        final int i103 = 28;
        final int i104 = 29;
        final int i105 = 0;
        final int i106 = 1;
        final int i107 = 2;
        final int i108 = 3;
        final int i109 = 5;
        final int i110 = 6;
        final int i111 = 8;
        final int i112 = 9;
        final int i113 = 10;
        final int i114 = 11;
        final int i115 = 12;
        C10093b c10093b10 = new C10093b("❤️ Health", AbstractC37056f.m118959K(new C23465k("Reconfirm Labs", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i97) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("amoeba", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i98) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("sage", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i99) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("stress monitor", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i100) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("healthspan", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i101) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("Log Symptoms", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i102) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("Sanguine", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i103) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("Composable Health Monitor", new InterfaceC4339a(this) { // from class: ea2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44403x;

            {
                this.f44403x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i104) {
                    case 0:
                        return DebugFragment.m24826E2(this.f44403x);
                    case 1:
                        return DebugFragment.m24855K1(this.f44403x);
                    case 2:
                        return DebugFragment.m24891R2(this.f44403x);
                    case 3:
                        return DebugFragment.m24896S2(this.f44403x);
                    case 4:
                        return DebugFragment.m24901T2(this.f44403x);
                    case 5:
                        return DebugFragment.m24906U2(this.f44403x);
                    case 6:
                        return DebugFragment.m24911V2(this.f44403x);
                    case 7:
                        return DebugFragment.m24916W2(this.f44403x);
                    case 8:
                        return DebugFragment.m24921X2(this.f44403x);
                    case 9:
                        return DebugFragment.m24926Y2(this.f44403x);
                    case 10:
                        return DebugFragment.m24931Z2(this.f44403x);
                    case 11:
                        return DebugFragment.m24941b3(this.f44403x);
                    case 12:
                        return DebugFragment.m24880P1(this.f44403x);
                    case 13:
                        return DebugFragment.m24881P2(this.f44403x);
                    case 14:
                        return DebugFragment.m24946c3(this.f44403x);
                    case 15:
                        return DebugFragment.m24951d3(this.f44403x);
                    case 16:
                        return DebugFragment.m24956e3(this.f44403x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24961f3(this.f44403x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m24966g3(this.f44403x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24971h3(this.f44403x);
                    case 20:
                        return DebugFragment.m24975i3(this.f44403x);
                    case 21:
                        return DebugFragment.m24979j3(this.f44403x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24983k3(this.f44403x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24885Q1(this.f44403x);
                    case 24:
                        return DebugFragment.m24991m3(this.f44403x);
                    case 25:
                        return DebugFragment.m24936a3(this.f44403x);
                    case 26:
                        return DebugFragment.m24995n3(this.f44403x);
                    case 27:
                        return DebugFragment.m24999o3(this.f44403x);
                    case 28:
                        return DebugFragment.m25003p3(this.f44403x);
                    default:
                        return DebugFragment.m25007q3(this.f44403x);
                }
            }
        }), new C23465k("Scheduling Form", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i105) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Scheduling Step (Overview)", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i106) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Schedule Primer", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i107) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Advanced Labs", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i108) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Biomarker Summary", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i109) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Biomarker Details", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i110) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("All Recordings", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i111) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Test Results", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i112) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Test History", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i113) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Hormonal Context", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i114) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Omron Auth", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i115) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        })));
        final int i116 = 13;
        final int i117 = 14;
        final int i118 = 9;
        C10093b c10093b11 = new C10093b("🔧 Platform", AbstractC37056f.m118959K(new C23465k("MFA Setup", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i116) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Multi Consent (External Upload)", new InterfaceC4339a(this) { // from class: ea2.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44407x;

            {
                this.f44407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i117) {
                    case 0:
                        return DebugFragment.m25011r3(this.f44407x);
                    case 1:
                        return DebugFragment.m25015s3(this.f44407x);
                    case 2:
                        return DebugFragment.m25019t3(this.f44407x);
                    case 3:
                        return DebugFragment.m25023u3(this.f44407x);
                    case 4:
                        return DebugFragment.m24890R1(this.f44407x);
                    case 5:
                        return DebugFragment.m25027v3(this.f44407x);
                    case 6:
                        return DebugFragment.m25035x3(this.f44407x);
                    case 7:
                        return DebugFragment.m24987l3(this.f44407x);
                    case 8:
                        return DebugFragment.m25040y3(this.f44407x);
                    case 9:
                        return DebugFragment.m25045z3(this.f44407x);
                    case 10:
                        return DebugFragment.m24807A3(this.f44407x);
                    case 11:
                        return DebugFragment.m24812B3(this.f44407x);
                    case 12:
                        return DebugFragment.m24817C3(this.f44407x);
                    case 13:
                        return DebugFragment.m24822D3(this.f44407x);
                    case 14:
                        return DebugFragment.m24827E3(this.f44407x);
                    default:
                        return DebugFragment.m24895S1(this.f44407x);
                }
            }
        }), new C23465k("Multi Consent (Galleri Scheduling)", new C12896b(this, 0)), new C23465k("video", new C12896b(this, 1)), new C23465k("Template Fragment", new C12896b(this, 2)), new C23465k("Profile Template", new C12896b(this, 29)), new C23465k("Invoke app update telemetry", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i118) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        })));
        final int i119 = 20;
        this.categorizedItems = AbstractC37056f.m118959K(c10093b, c10093b2, c10093b3, c10093b4, c10093b5, c10093b6, c10093b7, c10093b8, c10093b9, c10093b10, c10093b11, new C10093b("🔔 Notifications", AbstractC37056f.m118958J(new C23465k("push notifications", new InterfaceC4339a(this) { // from class: ea2.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugFragment f44399x;

            {
                this.f44399x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i119) {
                    case 0:
                        return DebugFragment.m24994n2(this.f44399x);
                    case 1:
                        return DebugFragment.m24998o2(this.f44399x);
                    case 2:
                        return DebugFragment.m25002p2(this.f44399x);
                    case 3:
                        return DebugFragment.m25006q2(this.f44399x);
                    case 4:
                        return DebugFragment.m25010r2(this.f44399x);
                    case 5:
                        return DebugFragment.m25014s2(this.f44399x);
                    case 6:
                        return DebugFragment.m25022u2(this.f44399x);
                    case 7:
                        return DebugFragment.m25026v2(this.f44399x);
                    case 8:
                        return DebugFragment.m25030w2(this.f44399x);
                    case 9:
                        return DebugFragment.m24870N1(this.f44399x);
                    case 10:
                        return DebugFragment.m25034x2(this.f44399x);
                    case 11:
                        return DebugFragment.m25039y2(this.f44399x);
                    case 12:
                        return DebugFragment.m25044z2(this.f44399x);
                    case 13:
                        return DebugFragment.m24806A2(this.f44399x);
                    case 14:
                        return DebugFragment.m24811B2(this.f44399x);
                    case 15:
                        return DebugFragment.m24816C2(this.f44399x);
                    case 16:
                        return DebugFragment.m24821D2(this.f44399x);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return DebugFragment.m24831F2(this.f44399x);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return DebugFragment.m25018t2(this.f44399x);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return DebugFragment.m24836G2(this.f44399x);
                    case 20:
                        return DebugFragment.m24875O1(this.f44399x);
                    case 21:
                        return DebugFragment.m24841H2(this.f44399x);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return DebugFragment.m24846I2(this.f44399x);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return DebugFragment.m24851J2(this.f44399x);
                    case 24:
                        return DebugFragment.m24856K2(this.f44399x);
                    case 25:
                        return DebugFragment.m24861L2(this.f44399x);
                    case 26:
                        return DebugFragment.m24866M2(this.f44399x);
                    case 27:
                        return DebugFragment.m24871N2(this.f44399x);
                    case 28:
                        return DebugFragment.m24876O2(this.f44399x);
                    default:
                        return DebugFragment.m24886Q2(this.f44399x);
                }
            }
        }))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final C23454a0 m24806A2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85342h("android-app://com.whoop/paymentMethodManagement");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public static final C23454a0 m24807A3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/testHistoryFragment"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final C23454a0 m24811B2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/nativeStore?source=debug"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final C23454a0 m24812B3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/hormonalContext?testId=841dc044-abec-4578-8e54-857b674078bc"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final C23454a0 m24816C2(DebugFragment debugFragment) {
        debugFragment.m24907U3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public static final C23454a0 m24817C3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/omronAuthFragment?source=debug"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final C23454a0 m24821D2(DebugFragment debugFragment) {
        debugFragment.m24927Y3(EnumC21177x0.SHIPPING_ADDRESS);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public static final C23454a0 m24822D3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85342h("android-app://com.whoop/mfasetupfragment?source=");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E1 */
    private final void m24825E1() {
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC39219a interfaceC39219a = (InterfaceC39219a) AbstractC25265s.m74100H0(((C39228j) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null)).m124993d());
        if (interfaceC39219a == null) {
            Toast.makeText(requireContext(), "No connected puffin found", 0).show();
        } else {
            AbstractC3006f0.m8732z((InterfaceC2994c0) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, null, new C10025a(interfaceC39219a, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final C23454a0 m24826E2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/debug/localServiceOverrides"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public static final C23454a0 m24827E3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/multiConsentFragment?consentAction=EXTERNAL_UPLOAD"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final C23454a0 m24831F2(DebugFragment debugFragment) {
        debugFragment.m24927Y3(EnumC21177x0.PAYMENT_METHOD);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final C23454a0 m24832F3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/multiConsentFragment?consentAction=GALLERI_SCHEDULING"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final C23454a0 m24836G2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/aiInsights?sourceId=2a8ecc57-d6ee-4661-91f3-373d9c6badc1&sourceContextType=ACTIVITY_RECOMMENDATION"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public static final C23454a0 m24837G3(DebugFragment debugFragment) {
        debugFragment.m24937a4();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final C23454a0 m24841H2(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25343b = AbstractC10094c.m25343b();
        AbstractC22676k.m65749i(interfaceC12981p0M25343b, "actionDebugToAiTalkTextCardDebug(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25343b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H3 */
    private final void m24842H3() {
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_CHARGE_ANIMATED, false);
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_SLEEP_ANIMATED, false);
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_ANIMATED, false);
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COACH_ANIMATED, false);
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ARRHYTHMIA_ANIMATED, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final C23454a0 m24845I1(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        AbstractC10094c.a aVarM25346e = AbstractC10094c.m25346e();
        AbstractC22676k.m65749i(aVarM25346e, "actionDebugToDesignShowcase(...)");
        c28198sM85259o.m85340f(aVarM25346e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final C23454a0 m24846I2(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25353l = AbstractC10094c.m25353l();
        AbstractC22676k.m65749i(interfaceC12981p0M25353l, "actionDebugToQnaFormDebug(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25353l);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I3 */
    private final void m24847I3() {
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_CHARGE_COMPLETED, false);
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_SLEEP_COMPLETED, false);
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_COMPLETED, false);
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COACH_COMPLETED, false);
        this.sharedPrefs.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ARRHYTHMIA_COMPLETED, false);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10027c(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final C23454a0 m24850J1(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/jsonplayground"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final C23454a0 m24851J2(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25342a = AbstractC10094c.m25342a();
        AbstractC22676k.m65749i(interfaceC12981p0M25342a, "actionDebugToAiChatJournalEntryWidgetDebug(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25342a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J3 */
    private final void m24852J3() {
        this.sharedPrefs.m109538q(SharedPreferenceConstants.HAS_SEEN_FAB_ONBOARDING, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final C23454a0 m24855K1(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85342h("android-app://com.whoop/batteryDebug");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final C23454a0 m24856K2(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25354m = AbstractC10094c.m25354m();
        AbstractC22676k.m65749i(interfaceC12981p0M25354m, "actionDebugToWakeUpAutopopHeightTester(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25354m);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K3 */
    private final void m24857K3() {
        this.sharedPrefs.m109542u(SharedPreferenceConstants.KEY_HAS_JOURNAL_BEEN_SEEN_FOR_TODAY, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final C23454a0 m24860L1(DebugFragment debugFragment) {
        Toast.makeText(debugFragment.requireContext(), "Adding fragment to settings_graph_redesign", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final C23454a0 m24861L2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/motionTrackingSandbox"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L3 */
    private final void m24862L3() {
        this.sharedPrefs.m109538q(SharedPreferenceConstants.HAS_SEEN_NEW_HOME_ONBOARDING, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final C23454a0 m24865M1(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/ProfileFoundation"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final C23454a0 m24866M2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/hubAndSpoke?locked=false&planName=CUSTOM&analyticsSource="));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M3 */
    private final void m24867M3() {
        this.sharedPrefs.m109538q(SharedPreferenceConstants.HAS_SEEN_TRANSITION_OVERLAY, false);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10028d(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final C23454a0 m24870N1(DebugFragment debugFragment) {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(debugFragment), null, null, debugFragment.new C10026b(null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public static final C23454a0 m24871N2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/challengeDetails?name=GLOBAL_STRAIN_CHALLENGE_2024"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N3 */
    private final void m24872N3() {
        throw new RuntimeException("test exception!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final C23454a0 m24875O1(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25352k = AbstractC10094c.m25352k();
        AbstractC22676k.m65749i(interfaceC12981p0M25352k, "actionDebugToPushes(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25352k);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public static final C23454a0 m24876O2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/Achievements"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public final String m24877O3(long epochMs) {
        if (epochMs == 0) {
            return UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE;
        }
        String str = this.localHpsWatermarkTimeFormat.format(Instant.ofEpochMilli(epochMs));
        AbstractC22676k.m65747g(str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final C23454a0 m24880P1(DebugFragment debugFragment) {
        C21596v c21596v = (C21596v) ((AbstractC18377p0) AbstractC29125c.m88492A(debugFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")));
        C18391y c18391y = c21596v.f82806b.f71458m;
        ExecutorC1834u1 executorC1834u1 = ((C32352b) c21596v.f82808d).f133915a;
        AbstractC22676k.m65749i(executorC1834u1, "getSerialTaskExecutor(...)");
        AbstractC37056f.m118957I(c18391y, "CancelAllWork", executorC1834u1, new C30036h(c21596v, 12));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final C23454a0 m24881P2(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25349h = AbstractC10094c.m25349h();
        AbstractC22676k.m65749i(interfaceC12981p0M25349h, "actionDebugToIterable(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25349h);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P3 */
    private final void m24882P3() {
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC39219a interfaceC39219a = (InterfaceC39219a) AbstractC25265s.m74100H0(((C39228j) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null)).m124993d());
        if (interfaceC39219a == null) {
            Toast.makeText(requireContext(), "No connected puffin found", 0).show();
        } else {
            AbstractC3006f0.m8732z((InterfaceC2994c0) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, null, new C10029e(interfaceC39219a, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public static final C23454a0 m24885Q1(DebugFragment debugFragment) {
        debugFragment.m24872N3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final C23454a0 m24886Q2(DebugFragment debugFragment) {
        debugFragment.m24857K3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q3 */
    private final void m24887Q3() {
        BatteryPackRelativeEventsWorker.INSTANCE.m23644a((AbstractC18377p0) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final C23454a0 m24890R1(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/archv2playground"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final C23454a0 m24891R2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/userJourneyFragment?year=2025"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R3 */
    private final void m24892R3() {
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h((InterfaceC4733b) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null));
        if (interfaceC21750d == null) {
            Toast.makeText(requireContext(), "No strap connected", 0).show();
        } else {
            ((InterfaceC39544c) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39544c.class), null)).mo26279a(interfaceC21750d, InterfaceC32564a.b.f134906a);
            Toast.makeText(requireContext(), "Sensor HPS triggered", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final C23454a0 m24895S1(DebugFragment debugFragment) {
        C29592b.f120827a.m90731e();
        AbstractC28163g0.m85259o(debugFragment).m85338d(DismissalPlaygroundFragment.Companion.m20046b(DismissalPlaygroundFragment.INSTANCE, null, null, 3, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public static final C23454a0 m24896S2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/actionPlanFragment?testId=821b7680-97ff-45ab-8e27-cf90593945b0"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public final InterfaceC13058l m24897S3(InterfaceC39544c api, InterfaceC21750d strap, EnumC39542a type) {
        return AbstractC13091v.m36610t(AbstractC13091v.m36602l(new C10030f(api.mo26280b(strap, type), null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public static final C23454a0 m24900T1(DebugFragment debugFragment) {
        debugFragment.m24917W3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public static final C23454a0 m24901T2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85342h("android-app://com.whoop/sms_setup?source=debug");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T3 */
    private final void m24902T3() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h((InterfaceC4733b) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4733b.class), null));
        if (interfaceC21750d == null || !interfaceC21750d.mo24752w0().isMaverickOrGoose()) {
            Toast.makeText(requireContext(), "No Maverick/Goose strap connected", 0).show();
        } else {
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10031g(interfaceC21750d, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final C23454a0 m24905U1(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/videoCallFragment?call_id=cool"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final C23454a0 m24906U2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85342h("android-app://com.whoop/sms_settings?source=debug");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U3 */
    private final void m24907U3() {
        C12896b c12896b = new C12896b(this, 6);
        ((InterfaceC21159o0) AbstractC29125c.m88492A(this).m122602a(c12896b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), null)).mo59393b(new AbstractC21155m0.i5("810114361597", null, null, null, null, null, null, null, "shop", 254, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final C23454a0 m24910V1(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/clinicianVideoSchedulingIntake?appointmentType=SCHEDULED_AHEAD"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public static final C23454a0 m24911V2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/day-zero-personalization?fingerprint=CHAT_WITH_AGENTday-zero-onboarding-agent_36939096&sourceId=day-zero-onboarding-agent&sourceType=CHAT_WITH_AGENT&source=day_0_personalization&conversationSeedId=&dismissible=true"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public static final C34911a m24912V3(DebugFragment debugFragment) {
        return AbstractC15751g.m44431K(debugFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final C23454a0 m24915W1(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/clinicianVideoSchedulingIntake?intakeType=HEALTH"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public static final C23454a0 m24916W2(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25345d = AbstractC10094c.m25345d();
        AbstractC22676k.m65749i(interfaceC12981p0M25345d, "actionDebugToDebugOnboardingStories(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25345d);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    private final void m24917W3() {
        GenericCachePolicy genericCachePolicy = null;
        MetricEventModel metricEventModel = null;
        GenericInteraction genericInteraction = null;
        C12997x0 c12997x0 = null;
        List list = null;
        List list2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        ((InterfaceC21159o0) AbstractC29125c.m88492A(this).m122602a(new C12896b(this, 4), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), null)).mo59393b(new AbstractC21155m0.m1(new ApiRequest("core-details-bff/v1/live-activity-targets/bff/demo", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), genericCachePolicy, objArr2, objArr3, metricEventModel, objArr, genericInteraction, c12997x0, list, list2, 1022, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final C23454a0 m24920X1(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85342h("android-app://com.whoop/lottieTester");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public static final C23454a0 m24921X2(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25347f = AbstractC10094c.m25347f();
        AbstractC22676k.m65749i(interfaceC12981p0M25347f, "actionDebugToFeatureEducationDebug(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25347f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public static final C34911a m24922X3(DebugFragment debugFragment) {
        return AbstractC15751g.m44431K(debugFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final C23454a0 m24925Y1(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/whoopBleDebug"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public static final C23454a0 m24926Y2(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25351j = AbstractC10094c.m25351j();
        AbstractC22676k.m65749i(interfaceC12981p0M25351j, "actionDebugToOnboardingStatusDebug(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25351j);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m24927Y3(EnumC21177x0 autoTrigger) {
        ((InterfaceC21159o0) AbstractC29125c.m88492A(this).m122602a(new C12896b(this, 5), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), null)).mo59393b(new AbstractC21155m0.k5("/commerce-service/v2/mobile/carts", "{\"cart_items\":[{\"sku\":\"ALBL1-OTP-12M-STA\",\"quantity\":1}]}", "debug", null, autoTrigger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final C23454a0 m24930Z1(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25355n = AbstractC10094c.m25355n();
        AbstractC22676k.m65749i(interfaceC12981p0M25355n, "actionDebugToWhoopStrapTest(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25355n);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public static final C23454a0 m24931Z2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/sage/onboarding"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public static final C34911a m24932Z3(DebugFragment debugFragment) {
        return AbstractC15751g.m44431K(debugFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final C23454a0 m24935a2(DebugFragment debugFragment) {
        debugFragment.m24902T3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public static final C23454a0 m24936a3(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25350i = AbstractC10094c.m25350i();
        AbstractC22676k.m65749i(interfaceC12981p0M25350i, "actionDebugToIterableTool(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25350i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a4 */
    private final void m24937a4() {
        Intent intent = new Intent(requireActivity(), (Class<?>) VideoActivity.class);
        intent.putExtra("videoUrl", "https://s3.us-west-2.amazonaws.com/videos.qa.whoop.com/outputs/Horizontal/Whoop_HorizontalTest.m3u8");
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final C23454a0 m24940b2(DebugFragment debugFragment) {
        ((InterfaceC12361d) AbstractC29125c.m88492A(debugFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12361d.class), null)).mo34625c(DeviceTriggerSource.SLEEP_PROCESS_NOW);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public static final C23454a0 m24941b3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/resetPassword?resetToken=test-token"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public static final C23454a0 m24942b4(DebugFragment debugFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(1791052361, c28655q, new C12894a(debugFragment, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final C23454a0 m24945c2(DebugFragment debugFragment) {
        ((InterfaceC12361d) AbstractC29125c.m88492A(debugFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12361d.class), null)).mo34625c(DeviceTriggerSource.IMPLICIT_UPLOAD);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public static final C23454a0 m24946c3(DebugFragment debugFragment) {
        debugFragment.m24862L3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public static final C23454a0 m24947c4(DebugFragment debugFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            List<C10093b> list = debugFragment.categorizedItems;
            boolean zM87157i = c28655q.m87157i(debugFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C12896b(debugFragment, 7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC10104h.m25405l(list, (InterfaceC4339a) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final C23454a0 m24950d2(DebugFragment debugFragment) {
        debugFragment.m24962f4();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public static final C23454a0 m24951d3(DebugFragment debugFragment) {
        debugFragment.m24852J3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public static final C23454a0 m24952d4(DebugFragment debugFragment) {
        AbstractC5583n.m16799z(debugFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final C23454a0 m24955e2(DebugFragment debugFragment) {
        debugFragment.m24882P3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public static final C23454a0 m24956e3(DebugFragment debugFragment) {
        debugFragment.m24867M3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e4 */
    private final void m24957e4() {
        Toast.makeText(requireContext(), "Local flag reset!", 0).show();
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10032h(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final C23454a0 m24960f2(DebugFragment debugFragment) {
        debugFragment.m24825E1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public static final C23454a0 m24961f3(DebugFragment debugFragment) {
        debugFragment.m24847I3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f4 */
    private final void m24962f4() {
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h((InterfaceC4733b) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null));
        if (interfaceC21750d == null) {
            Toast.makeText(requireContext(), "No strap connected", 0).show();
            return;
        }
        WhoopStrapInfo whoopStrapInfoMo24726f = interfaceC21750d.get_strapInfo();
        if ((whoopStrapInfoMo24726f != null ? whoopStrapInfoMo24726f.getSerialNumber() : null) == null) {
            Toast.makeText(requireContext(), "Device serial number is not available", 1).show();
            return;
        }
        int i13 = (int) (24 * getResources().getDisplayMetrics().density);
        TextView textView = new TextView(requireContext());
        textView.setPadding(i13, i13, i13, i13);
        textView.setTextSize(14.0f);
        textView.setText("Loading…");
        DialogInterfaceC24846j dialogInterfaceC24846jCreate = new C24844i(requireContext()).setTitle("Local HPS watermarks").setView(textView).setPositiveButton(R.string.ok, null).create();
        AbstractC22676k.m65749i(dialogInterfaceC24846jCreate, "create(...)");
        dialogInterfaceC24846jCreate.show();
        dialogInterfaceC24846jCreate.setOnDismissListener(new DialogInterfaceOnDismissListenerC12898c(AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10033i(textView, (InterfaceC39544c) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39544c.class), null), interfaceC21750d, null), 3), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public static final C23454a0 m24965g2(DebugFragment debugFragment) {
        debugFragment.m24887Q3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final C23454a0 m24966g3(DebugFragment debugFragment) {
        debugFragment.m24842H3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public static final void m24967g4(InterfaceC3027k1 interfaceC3027k1, DialogInterface dialogInterface) {
        interfaceC3027k1.cancel((CancellationException) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final C23454a0 m24970h2(DebugFragment debugFragment) {
        debugFragment.m24892R3();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public static final C23454a0 m24971h3(DebugFragment debugFragment) {
        debugFragment.m24957e4();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final C23454a0 m24974i2() {
        AbstractC25303l.m74273D(!AbstractC25303l.m74271B());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final C23454a0 m24975i3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/reconfirmLabsFragment?source=debug&nextScreen=CHOLESTEROL"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final C23454a0 m24978j2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/activation"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3 */
    public static final C23454a0 m24979j3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/amoeba"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final C23454a0 m24982k2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/upcycle_landing"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public static final C23454a0 m24983k3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/sage?date="));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final C23454a0 m24986l2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/familyPlan?startDestination=FAMILY_PLAN_HUB"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final C23454a0 m24987l3(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25344c = AbstractC10094c.m25344c();
        AbstractC22676k.m65749i(interfaceC12981p0M25344c, "actionDebugToConsole(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25344c);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final C23454a0 m24990m2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/extensions?promoCode=null&isOnTrial=false&isReactivationUpsell=true"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public static final C23454a0 m24991m3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/stress-monitor/HomeScreen"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final C23454a0 m24994n2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/gifting?giftType=membership&selected_tier=PEAK"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public static final C23454a0 m24995n3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/healthspan"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final C23454a0 m24998o2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/gifted?source=debug&giftCode=MADDIEALGIFT"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public static final C23454a0 m24999o3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/log_symptoms?source=debug&requestDate=2024-11-06"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final C23454a0 m25002p2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/gifting?giftType=advanced-labs-gift&test_count=2"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final C23454a0 m25003p3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/SanguineFragment"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final C23454a0 m25006q2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/UniversalCheckout?path=/commerce-service/v2/mobile/carts&payload={\"cart_items\":[{\"sku\":\"ALBL1-OTP-12M-STA\",\"quantity\":1}]}&source=debug&cartId="));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public static final C23454a0 m25007q3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/composableHealthMonitor"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final C23454a0 m25010r2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/UniversalCheckoutDataFetch"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final C23454a0 m25011r3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/schedulingFormFragment"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final C23454a0 m25014s2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/OrderConfirmation?source=debug"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public static final C23454a0 m25015s3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/schedulingStepFragment?step=OVERVIEW"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final C23454a0 m25018t2(DebugFragment debugFragment) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(debugFragment);
        InterfaceC12981p0 interfaceC12981p0M25348g = AbstractC10094c.m25348g();
        AbstractC22676k.m65749i(interfaceC12981p0M25348g, "actionDebugToFeatureFlagSettings(...)");
        c28198sM85259o.m85340f(interfaceC12981p0M25348g);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final C23454a0 m25019t3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/schedulePrimerFragment?source=debug"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final C23454a0 m25022u2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/LimitedTimeOffer"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public static final C23454a0 m25023u3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/AdvancedLabsFragment"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final C23454a0 m25026v2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/rafReceiverFragment?code=C84E81"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public static final C23454a0 m25027v3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/biomarkerSummaryFragment"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final C23454a0 m25030w2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/advanced_labs_join?source=debug&test_count=2&initially_selected_segment_id=one_time_test"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public static final C23454a0 m25031w3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85342h("android-app://com.whoop/experimentsDebug");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final C23454a0 m25034x2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/advancedLabsManagement"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final C23454a0 m25035x3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/biomarkerDetailsFragment?biomarkerId=ldl_cholesterol"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final C23454a0 m25039y2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/MarketingConsent?source=debug"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public static final C23454a0 m25040y3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/allRecordingsFragment?biomarkerId=ldl_cholesterol"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final C23454a0 m25044z2(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85342h("android-app://com.whoop/shareDebug");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3 */
    public static final C23454a0 m25045z3(DebugFragment debugFragment) {
        AbstractC28163g0.m85259o(debugFragment).m85338d(Uri.parse("android-app://com.whoop/testResultsFragment?testId=id"));
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C12894a(this, 0), true, -1750053020));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }
}
