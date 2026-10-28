package com.whoop.whooplabs;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3055s;
import bc3.InterfaceC3061u;
import c12.C3853d;
import c12.EnumC3851b;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.WhoopLabsService;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.domain.LabsCampaignKt;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import com.whoop.whooplabs.p070io.HrDeviceConnection;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import in2.AbstractC18737i;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m32.InterfaceC25005a;
import nz2.AbstractC27308b;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import uv0.AbstractC35281a;
import uv0.AbstractC35282b;
import xf3.C38266c;
import yw2.AbstractC39833e;
import yw2.C39836h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u0004J)\u0010\u0010\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u0004J\u0010\u0010 \u001a\u00020\nH\u0086@¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010#\u001a\u00020\nH\u0086@¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\nH\u0003¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\u0004J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010;R(\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0011\u0010T\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010X\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010`\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006b"}, m65681d2 = {"Lcom/whoop/whooplabs/WhoopLabsService;", "Landroid/app/Service;", "Lbc3/c0;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Ll83/a0;", "onCreate", "onDestroy", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "", "A", "(Lq83/d;)Ljava/lang/Object;", "n", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "", "note", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)V", "address", "t", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "m", "x", "l", "B", "D", "s", "z", "C", "k", "Lcom/whoop/design/util/TextResource;", "error", "y", "(Lcom/whoop/design/util/TextResource;)V", "Landroid/content/Context;", "context", "Landroidx/core/app/NotificationCompat$Builder;", "j", "(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;", "Ltr2/n;", "Ltr2/n;", "logger", "Lyw2/h;", "Lyw2/h;", "serviceModel", "Lin2/d;", "Lin2/d;", "dispatcherFactory", "Lbc3/u;", "Lbc3/u;", "supervisorJob", "Lbc3/s;", "E", "Lbc3/s;", "q", "()Lbc3/s;", "setStartupCompleted", "(Lbc3/s;)V", "startupCompleted", "Lbc3/k1;", "F", "Lbc3/k1;", "serviceModelJob", "Lm32/a;", "G", "Lm32/a;", "permissionChecker", "Landroidx/core/app/NotificationManagerCompat;", "H", "Landroidx/core/app/NotificationManagerCompat;", "notificationManager", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "r", "()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "study", "Lcom/whoop/whooplabs/io/HrDeviceConnection;", "o", "()Lcom/whoop/whooplabs/io/HrDeviceConnection;", "hrDeviceConnection", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "Lorg/joda/time/DateTime;", "p", "()Lorg/joda/time/DateTime;", "lastBtHrReceivedTime", "a", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhoopLabsService extends Service implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private InterfaceC3055s startupCompleted;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private InterfaceC3027k1 serviceModelJob;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC25005a permissionChecker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final NotificationManagerCompat notificationManager;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger = AbstractC27308b.m82458a("WhoopLabsService");

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C39836h serviceModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC3061u supervisorJob;

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/whooplabs/WhoopLabsService$a;", "Landroid/os/Binder;", "<init>", "(Lcom/whoop/whooplabs/WhoopLabsService;)V", "Lcom/whoop/whooplabs/WhoopLabsService;", "a", "()Lcom/whoop/whooplabs/WhoopLabsService;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class BinderC10813a extends Binder {
        public BinderC10813a() {
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WhoopLabsService getF33159f() {
            return WhoopLabsService.this;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$b */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsService", m100430f = "WhoopLabsService.kt", m100431l = {188}, m100432m = "cancelStudy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10814b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f33160w;

        /* JADX INFO: renamed from: y */
        int f33162y;

        public C10814b(InterfaceC30057d<? super C10814b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33160w = obj;
            this.f33162y |= Integer.MIN_VALUE;
            return WhoopLabsService.this.m28469i(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$c */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsService", m100430f = "WhoopLabsService.kt", m100431l = {202}, m100432m = "onConnectDeviceClicked", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10815c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f33163w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33164x;

        /* JADX INFO: renamed from: z */
        int f33166z;

        public C10815c(InterfaceC30057d<? super C10815c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33164x = obj;
            this.f33166z |= Integer.MIN_VALUE;
            return WhoopLabsService.this.m28477t(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$d */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsService$onConnectDeviceClicked$2", m100430f = "WhoopLabsService.kt", m100431l = {203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10816d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33167w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f33169y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10816d(String str, InterfaceC30057d<? super C10816d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33169y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return WhoopLabsService.this.new C10816d(this.f33169y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C10816d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33167w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C39836h c39836h = WhoopLabsService.this.serviceModel;
            String str = this.f33169y;
            this.f33167w = 1;
            Object objM127858M = c39836h.m127858M(str, this);
            return objM127858M == enumC31071a ? enumC31071a : objM127858M;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$e */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsService$onCreate$1", m100430f = "WhoopLabsService.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10817e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33170w;

        public C10817e(InterfaceC30057d<? super C10817e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return WhoopLabsService.this.new C10817e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10817e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33170w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C39836h c39836h = WhoopLabsService.this.serviceModel;
                this.f33170w = 1;
                if (c39836h.m127859O(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$f */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsService$onCreate$2", m100430f = "WhoopLabsService.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10818f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33172w;

        /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ WhoopLabsService f33174w;

            public a(WhoopLabsService whoopLabsService) {
                this.f33174w = whoopLabsService;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(TextResource textResource, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f33174w.m28463y(textResource);
                return C23454a0.f92919a;
            }
        }

        public C10818f(InterfaceC30057d<? super C10818f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return WhoopLabsService.this.new C10818f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10818f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33172w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 interfaceC13087t1M77511e = WhoopLabsService.this.serviceModel.getFileWriter().getErrorFlow();
                a aVar = new a(WhoopLabsService.this);
                this.f33172w = 1;
                if (interfaceC13087t1M77511e.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$g */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsService$onCreate$3", m100430f = "WhoopLabsService.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10819g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33175w;

        /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ WhoopLabsService f33177w;

            public a(WhoopLabsService whoopLabsService) {
                this.f33177w = whoopLabsService;
            }

            /* JADX INFO: renamed from: b */
            public final Object m28482b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (z4) {
                    this.f33177w.m28464z();
                } else {
                    this.f33177w.m28460s();
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m28482b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        public C10819g(InterfaceC30057d<? super C10819g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return WhoopLabsService.this.new C10819g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10819g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33175w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1M127848A = WhoopLabsService.this.serviceModel.getBtHrMissing();
                a aVar = new a(WhoopLabsService.this);
                this.f33175w = 1;
                if (((C13045h2) interfaceC13075p1M127848A).collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$h */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsService$onStartCommand$1", m100430f = "WhoopLabsService.kt", m100431l = {163, DateTimeConstants.HOURS_PER_WEEK}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10820h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33178w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ LabsCampaign f33179x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopLabsService f33180y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10820h(LabsCampaign labsCampaign, WhoopLabsService whoopLabsService, InterfaceC30057d<? super C10820h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33179x = labsCampaign;
            this.f33180y = whoopLabsService;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10820h(this.f33179x, this.f33180y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10820h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        
            if (r7.m127861Q(r1, r6) == r0) goto L18;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f33178w
                r2 = 2
                r3 = 1
                l83.a0 r4 = l83.C23454a0.f92919a
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                p505ts.AbstractC34132o.m107864I(r7)
                goto L8f
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L5c
            L1f:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.whooplabs.data.domain.LabsCampaign r7 = r6.f33179x
                r1 = 0
                if (r7 == 0) goto L68
                com.whoop.whooplabs.WhoopLabsService r7 = r6.f33180y
                tr2.n r7 = com.whoop.whooplabs.WhoopLabsService.m28453c(r7)
                java.lang.String r2 = "Starting with intent"
                qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r1]
                r7.mo85228t(r2, r5)
                com.whoop.whooplabs.WhoopLabsService r7 = r6.f33180y
                tr2.n r7 = com.whoop.whooplabs.WhoopLabsService.m28453c(r7)
                com.whoop.whooplabs.data.domain.LabsCampaign r2 = r6.f33179x
                int r2 = r2.getCampaignId()
                java.lang.String r5 = "updating study with campaignId "
                java.lang.String r2 = p031b9.AbstractC2875y.m8295h(r2, r5)
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                r7.mo85228t(r2, r1)
                com.whoop.whooplabs.WhoopLabsService r7 = r6.f33180y
                yw2.h r7 = com.whoop.whooplabs.WhoopLabsService.m28454d(r7)
                com.whoop.whooplabs.data.domain.LabsCampaign r1 = r6.f33179x
                r6.f33178w = r3
                java.lang.Object r7 = r7.m127861Q(r1, r6)
                if (r7 != r0) goto L5c
                goto L8e
            L5c:
                com.whoop.whooplabs.WhoopLabsService r7 = r6.f33180y
                bc3.s r7 = r7.getStartupCompleted()
                bc3.t r7 = (bc3.C3058t) r7
                r7.m8807L(r4)
                goto L8f
            L68:
                com.whoop.whooplabs.WhoopLabsService r7 = r6.f33180y
                tr2.n r7 = com.whoop.whooplabs.WhoopLabsService.m28453c(r7)
                java.lang.String r3 = "Starting without campaign"
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                r7.mo85228t(r3, r1)
                com.whoop.whooplabs.WhoopLabsService r7 = r6.f33180y
                bc3.s r7 = r7.getStartupCompleted()
                bc3.t r7 = (bc3.C3058t) r7
                r7.m8807L(r4)
                com.whoop.whooplabs.WhoopLabsService r7 = r6.f33180y
                yw2.h r7 = com.whoop.whooplabs.WhoopLabsService.m28454d(r7)
                r6.f33178w = r2
                java.lang.Object r7 = r7.m127862R(r6)
                if (r7 != r0) goto L8f
            L8e:
                return r0
            L8f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.whooplabs.WhoopLabsService.C10820h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$i */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsService$reportError$1", m100430f = "WhoopLabsService.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10821i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33181w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f33183y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10821i(String str, InterfaceC30057d<? super C10821i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33183y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return WhoopLabsService.this.new C10821i(this.f33183y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10821i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33181w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC18737i.m54482g(WhoopLabsService.this, this.f33183y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.WhoopLabsService$j */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsService", m100430f = "WhoopLabsService.kt", m100431l = {175}, m100432m = "startStudy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10822j extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f33184w;

        /* JADX INFO: renamed from: y */
        int f33186y;

        public C10822j(InterfaceC30057d<? super C10822j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33184w = obj;
            this.f33186y |= Integer.MIN_VALUE;
            return WhoopLabsService.this.m28465A(this);
        }
    }

    public WhoopLabsService() {
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.serviceModel = (C39836h) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(C39836h.class), null);
        this.dispatcherFactory = (InterfaceC18732d) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null);
        this.supervisorJob = AbstractC3006f0.m8710d();
        this.startupCompleted = AbstractC3006f0.m8707a();
        this.permissionChecker = (InterfaceC25005a) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25005a.class), null);
        this.notificationManager = (NotificationManagerCompat) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(NotificationManagerCompat.class), null);
    }

    /* JADX INFO: renamed from: C */
    private final void m28450C() {
        m28459k();
        C3853d c3853dM11812k = new C3853d(EnumC3851b.LOW, "06625_WhoopLabs", AbstractC39833e.f171738w).m11812k(false);
        NotificationCompat.Builder onlyAlertOnce = m28458j(this).setContentTitle(AbstractC32122c.getString(this, AbstractC39833e.f171740y)).setContentText(AbstractC32122c.getString(this, AbstractC39833e.f171739x)).setOnlyAlertOnce(true);
        AbstractC22676k.m65749i(onlyAlertOnce, "setOnlyAlertOnce(...)");
        c3853dM11812k.m11805a(onlyAlertOnce);
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(109, onlyAlertOnce.build(), 16);
        } else {
            startForeground(109, onlyAlertOnce.build());
        }
    }

    /* JADX INFO: renamed from: j */
    private final NotificationCompat.Builder m28458j(Context context) {
        NotificationCompat.Builder color = new NotificationCompat.Builder(context, "00100_General").setAutoCancel(true).setSmallIcon(AbstractC35282b.f150162a).setColor(AbstractC32122c.getColor(context, AbstractC35281a.f150161a));
        AbstractC22676k.m65749i(color, "setColor(...)");
        return color;
    }

    /* JADX INFO: renamed from: k */
    private final void m28459k() {
        NotificationChannel notificationChannel = new NotificationChannel("06625_WhoopLabs", AbstractC32122c.getString(this, AbstractC39833e.f171738w), 3);
        notificationChannel.setLockscreenVisibility(0);
        Object systemService = getSystemService("notification");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m28460s() {
        this.logger.mo85216g("Hiding missing bthr notification", new AbstractC30556a.a[0]);
        if (this.permissionChecker.mo73346a("android.permission.POST_NOTIFICATIONS")) {
            stopForeground(1);
            this.notificationManager.cancel(109);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m28461u(WhoopLabsService whoopLabsService, C23454a0 c23454a0) {
        whoopLabsService.stopSelf();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m28462v(WhoopLabsService whoopLabsService, TextResource textResource) {
        AbstractC22676k.m65747g(textResource);
        whoopLabsService.m28463y(textResource);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final void m28463y(TextResource error) {
        String string = error.resolve(this).toString();
        this.logger.mo85226q(string, new AbstractC30556a.a[0]);
        AbstractC3006f0.m8732z(this, this.dispatcherFactory.getMain(), null, new C10821i(string, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: z */
    public final void m28464z() {
        this.logger.mo85216g("Showing missing bthr notification", new AbstractC30556a.a[0]);
        if (this.permissionChecker.mo73346a("android.permission.POST_NOTIFICATIONS")) {
            C3853d c3853dM11812k = new C3853d(EnumC3851b.MEDIUM, "06625_WhoopLabs", AbstractC39833e.f171731p).m11812k(false);
            NotificationCompat.Builder style = m28458j(this).setSmallIcon(AbstractC35282b.f150162a).setContentTitle(AbstractC32122c.getString(this, AbstractC39833e.f171731p)).setContentText(AbstractC32122c.getString(this, AbstractC39833e.f171730o)).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(AbstractC32122c.getString(this, AbstractC39833e.f171731p)).bigText(AbstractC32122c.getString(this, AbstractC39833e.f171730o)));
            AbstractC22676k.m65749i(style, "setStyle(...)");
            c3853dM11812k.m11805a(style);
            this.notificationManager.notify(109, style.build());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m28465A(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C10822j c10822j;
        if (interfaceC30057d instanceof C10822j) {
            c10822j = (C10822j) interfaceC30057d;
            int i13 = c10822j.f33186y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10822j.f33186y = i13 - Integer.MIN_VALUE;
            } else {
                c10822j = new C10822j(interfaceC30057d);
            }
        } else {
            c10822j = new C10822j(interfaceC30057d);
        }
        Object objM127867d0 = c10822j.f33184w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10822j.f33186y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127867d0);
            C39836h c39836h = this.serviceModel;
            c10822j.f33186y = 1;
            objM127867d0 = c39836h.m127867d0(c10822j);
            if (objM127867d0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM127867d0);
        }
        boolean zBooleanValue = ((Boolean) objM127867d0).booleanValue();
        if (zBooleanValue) {
            m28450C();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: B */
    public final Object m28466B(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM127868e0 = this.serviceModel.m127868e0(interfaceC30057d);
        return objM127868e0 == EnumC31071a.f128113w ? objM127868e0 : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public final Object m28467D(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM127869k0 = this.serviceModel.m127869k0(interfaceC30057d);
        return objM127869k0 == EnumC31071a.f128113w ? objM127869k0 : C23454a0.f92919a;
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.dispatcherFactory.getDefault().plus(this.supervisorJob);
    }

    /* JADX INFO: renamed from: h */
    public final void m28468h(String note) {
        this.serviceModel.m127870q(note);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m28469i(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10814b c10814b;
        if (interfaceC30057d instanceof C10814b) {
            c10814b = (C10814b) interfaceC30057d;
            int i13 = c10814b.f33162y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10814b.f33162y = i13 - Integer.MIN_VALUE;
            } else {
                c10814b = new C10814b(interfaceC30057d);
            }
        } else {
            c10814b = new C10814b(interfaceC30057d);
        }
        Object obj = c10814b.f33160w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10814b.f33162y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C39836h c39836h = this.serviceModel;
            c10814b.f33162y = 1;
            if (c39836h.m127871r(c10814b) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        stopForeground(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m28470l(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return this.serviceModel.m127873w(interfaceC30057d);
    }

    /* JADX INFO: renamed from: m */
    public final void m28471m() {
        this.serviceModel.m127874x();
    }

    /* JADX INFO: renamed from: n */
    public final Object m28472n(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.serviceModel.m127875y();
        stopForeground(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public final HrDeviceConnection m28473o() {
        return this.serviceModel.getHrDeviceConnection();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new BinderC10813a();
    }

    @Override // android.app.Service
    public void onCreate() throws Throwable {
        super.onCreate();
        this.logger.mo85228t("creating service", new AbstractC30556a.a[0]);
        AbstractC3006f0.m8699E(C30064k.f122676w, new C10817e(null));
        AbstractC3006f0.m8732z(this, null, null, new C10818f(null), 3);
        AbstractC3006f0.m8732z(this, null, null, new C10819g(null), 3);
        final int i13 = 0;
        this.serviceModel.getStopSelfAction().observeForever(new AbstractC10824b.a(new Function1(this) { // from class: yw2.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WhoopLabsService f171809x;

            {
                this.f171809x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return WhoopLabsService.m28461u(this.f171809x, (C23454a0) obj);
                    default:
                        return WhoopLabsService.m28462v(this.f171809x, (TextResource) obj);
                }
            }
        }));
        final int i14 = 1;
        this.serviceModel.m127849B().observeForever(new AbstractC10824b.a(new Function1(this) { // from class: yw2.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WhoopLabsService f171809x;

            {
                this.f171809x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return WhoopLabsService.m28461u(this.f171809x, (C23454a0) obj);
                    default:
                        return WhoopLabsService.m28462v(this.f171809x, (TextResource) obj);
                }
            }
        }));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.serviceModel.m127860P();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.logger.mo85228t("onStartCommand", new AbstractC30556a.a[0]);
        this.logger.mo85228t("default scheduler is " + this.dispatcherFactory.getDefault(), new AbstractC30556a.a[0]);
        this.startupCompleted = AbstractC3006f0.m8707a();
        InterfaceC3027k1 interfaceC3027k1 = this.serviceModelJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.serviceModelJob = AbstractC3006f0.m8732z(this, null, null, new C10820h(intent != null ? (LabsCampaign) intent.getParcelableExtra(LabsCampaignKt.LABS_CAMPAIGN_TABLE) : null, this, null), 3);
        return 3;
    }

    /* JADX INFO: renamed from: p */
    public final DateTime m28474p() {
        return this.serviceModel.getLastBtHrReceivedTime();
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC3055s getStartupCompleted() {
        return this.startupCompleted;
    }

    /* JADX INFO: renamed from: r */
    public final WhoopLabsStudy m28476r() {
        return this.serviceModel.m127856I();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m28477t(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C10815c c10815c;
        boolean zBooleanValue;
        if (interfaceC30057d instanceof C10815c) {
            c10815c = (C10815c) interfaceC30057d;
            int i13 = c10815c.f33166z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10815c.f33166z = i13 - Integer.MIN_VALUE;
            } else {
                c10815c = new C10815c(interfaceC30057d);
            }
        } else {
            c10815c = new C10815c(interfaceC30057d);
        }
        Object objM8751e = c10815c.f33164x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10815c.f33166z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8751e);
            long jM28487a = AbstractC10824b.m28487a();
            C10816d c10816d = new C10816d(str, null);
            c10815c.f33163w = str;
            c10815c.f33166z = 1;
            objM8751e = AbstractC3028k2.m8751e(jM28487a, c10816d, c10815c);
            if (objM8751e == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c10815c.f33163w;
            AbstractC34132o.m107864I(objM8751e);
        }
        Boolean bool = (Boolean) objM8751e;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            this.logger.mo85216g(AbstractC11266d.m30461o("Device connection attempt timeout ", str), new AbstractC30556a.a[0]);
            m28471m();
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: w */
    public final Object m28478w(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        stopForeground(true);
        return this.serviceModel.m127863S(interfaceC30057d);
    }

    /* JADX INFO: renamed from: x */
    public final Object m28479x(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM127864T = this.serviceModel.m127864T(interfaceC30057d);
        return objM127864T == EnumC31071a.f128113w ? objM127864T : C23454a0.f92919a;
    }
}
