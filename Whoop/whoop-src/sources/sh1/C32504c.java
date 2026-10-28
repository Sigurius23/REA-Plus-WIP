package sh1;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.google.android.gms.location.LocationRequest;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import gi1.C15892b;
import ii1.InterfaceC18571a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ki1.AbstractC22503a;
import ki1.AbstractC22504b;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yh1.C39540a;

/* JADX INFO: renamed from: sh1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001aJ\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u001cJ\r\u0010 \u001a\u00020\u0018¢\u0006\u0004\b \u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010/¨\u00061"}, m65681d2 = {"Lsh1/c;", "", "Landroid/content/Context;", "context", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lii1/a;", "gpsStorage", "Lgi1/b;", "gpsPermissionHelper", "Lbc3/c0;", "scope", "Ltr2/n;", "logger", "Lsh1/g;", "locationClient", "Lsh1/d;", "backgroundLocationRequest", "<init>", "(Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Lii1/a;Lgi1/b;Lbc3/c0;Ltr2/n;Lsh1/g;Lsh1/d;)V", "Ll83/a0;", "k", "(Lq83/d;)Ljava/lang/Object;", "m", "", "f", "()Z", "j", "()V", "l", "i", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "Landroid/content/Context;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Lii1/a;", "d", "Lgi1/b;", "e", "Lbc3/c0;", "Ltr2/n;", "Lsh1/g;", "Lsh1/d;", "Landroid/app/PendingIntent;", "Landroid/app/PendingIntent;", "pendingIntent", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32504c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC18571a gpsStorage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15892b gpsPermissionHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC32508g locationClient;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C32505d backgroundLocationRequest;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private PendingIntent pendingIntent;

    /* JADX INFO: renamed from: sh1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gps.collector.BackgroundLocationCollector$getCurrentLocation$1", m100430f = "BackgroundLocationCollector.kt", m100431l = {85, 88}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f134605w;

        /* JADX INFO: renamed from: x */
        Object f134606x;

        /* JADX INFO: renamed from: y */
        int f134607y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32504c.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Location location;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134607y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC32508g interfaceC32508g = C32504c.this.locationClient;
                this.f134607y = 1;
                obj = interfaceC32508g.mo101514c(102, this);
                if (obj != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                location = (Location) this.f134605w;
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC34116n interfaceC34116n = C32504c.this.logger;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            StringBuilder sbM8306s = AbstractC2875y.m8306s("Current location fetched and saved: lat=", latitude, ", lng=");
            sbM8306s.append(longitude);
            interfaceC34116n.mo85216g(sbM8306s.toString(), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
            Location location2 = (Location) obj;
            if (location2 != null) {
                C39540a c39540aM65007a = AbstractC22504b.m65007a(location2, "app_foreground");
                InterfaceC18571a interfaceC18571a = C32504c.this.gpsStorage;
                this.f134605w = location2;
                this.f134606x = null;
                this.f134607y = 2;
                if (interfaceC18571a.mo53786c(c39540aM65007a, this) != enumC31071a) {
                    location = location2;
                    InterfaceC34116n interfaceC34116n2 = C32504c.this.logger;
                    double latitude2 = location.getLatitude();
                    double longitude2 = location.getLongitude();
                    StringBuilder sbM8306s2 = AbstractC2875y.m8306s("Current location fetched and saved: lat=", latitude2, ", lng=");
                    sbM8306s2.append(longitude2);
                    interfaceC34116n2.mo85216g(sbM8306s2.toString(), new AbstractC30556a.a[0]);
                }
                return enumC31071a;
            }
            C32504c.this.logger.mo85216g("No current location available", new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sh1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gps.collector.BackgroundLocationCollector$startCollection$1", m100430f = "BackgroundLocationCollector.kt", m100431l = {47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134609w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32504c.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134609w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!C32504c.this.m101498i()) {
                    return c23454a0;
                }
                C32504c c32504c = C32504c.this;
                this.f134609w = 1;
                if (c32504c.m101494k(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: sh1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gps.collector.BackgroundLocationCollector$stopCollection$1", m100430f = "BackgroundLocationCollector.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134611w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32504c.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134611w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C32504c c32504c = C32504c.this;
                this.f134611w = 1;
                if (c32504c.m101495m(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C32504c.this.logger.mo85216g("Background location collection stopped", new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sh1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gps.collector.BackgroundLocationCollector", m100430f = "BackgroundLocationCollector.kt", m100431l = {117}, m100432m = "stopLocationUpdates", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f134613E;

        /* JADX INFO: renamed from: w */
        Object f134614w;

        /* JADX INFO: renamed from: x */
        int f134615x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f134616y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f134616y = obj;
            this.f134613E |= Integer.MIN_VALUE;
            return C32504c.this.m101495m(this);
        }
    }

    public C32504c(Context context, FeatureFlagChecker featureFlagChecker, InterfaceC18571a gpsStorage, C15892b gpsPermissionHelper, InterfaceC2994c0 scope, InterfaceC34116n logger, InterfaceC32508g locationClient, C32505d backgroundLocationRequest) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(gpsStorage, "gpsStorage");
        AbstractC22676k.m65750j(gpsPermissionHelper, "gpsPermissionHelper");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(locationClient, "locationClient");
        AbstractC22676k.m65750j(backgroundLocationRequest, "backgroundLocationRequest");
        this.context = context;
        this.featureFlagChecker = featureFlagChecker;
        this.gpsStorage = gpsStorage;
        this.gpsPermissionHelper = gpsPermissionHelper;
        this.scope = scope;
        this.logger = logger;
        this.locationClient = locationClient;
        this.backgroundLocationRequest = backgroundLocationRequest;
    }

    /* JADX INFO: renamed from: f */
    private final boolean m101493f() {
        return this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ANDROID_FOREGROUND_GPS_COLLECTION) && this.gpsPermissionHelper.m44826b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Object m101494k(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        LocationRequest locationRequestM101501a = this.backgroundLocationRequest.m101501a();
        this.logger.mo85216g("GPS COLLECTOR: About to request updates, request=" + locationRequestM101501a + ", pi=" + this.pendingIntent, new AbstractC30556a.a[0]);
        PendingIntent pendingIntentM101502b = this.backgroundLocationRequest.m101502b(this.context);
        this.pendingIntent = pendingIntentM101502b;
        InterfaceC32508g interfaceC32508g = this.locationClient;
        AbstractC22676k.m65747g(pendingIntentM101502b);
        Object objMo101512a = interfaceC32508g.mo101512a(locationRequestM101501a, pendingIntentM101502b, interfaceC30057d);
        return objMo101512a == EnumC31071a.f128113w ? objMo101512a : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m101495m(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f134613E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f134613E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f134616y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f134613E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            PendingIntent pendingIntent = this.pendingIntent;
            if (pendingIntent != null) {
                this.logger.mo85216g("GPS COLLECTOR: Stopping updates, pi=" + pendingIntent, new AbstractC30556a.a[0]);
                InterfaceC32508g interfaceC32508g = this.locationClient;
                dVar.f134614w = null;
                dVar.f134615x = 0;
                dVar.f134613E = 1;
                if (interfaceC32508g.mo101513b(pendingIntent, dVar) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        this.pendingIntent = null;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public final void m101496g() {
        if (m101493f()) {
            AbstractC3006f0.m8732z(this.scope, null, null, new a(null), 3);
        } else {
            this.logger.mo85216g("Skipping current location - feature flag disabled or fine location not granted", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m101497h() {
        return this.pendingIntent != null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m101498i() {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ANDROID_BACKGROUND_GPS_COLLECTION);
        boolean zM44826b = this.gpsPermissionHelper.m44826b();
        boolean zM44825a = this.gpsPermissionHelper.m44825a();
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("GPS COLLECTOR: shouldCollect() - featureFlag: ", ", fineLocation: ", ", backgroundLocation: ", zIsFeatureEnabled, zM44826b);
        sbM32002u.append(zM44825a);
        interfaceC34116n.mo85216g(sbM32002u.toString(), new AbstractC30556a.a[0]);
        return zIsFeatureEnabled && zM44826b && zM44825a;
    }

    /* JADX INFO: renamed from: j */
    public final void m101499j() {
        AbstractC3006f0.m8732z(this.scope, null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: l */
    public final void m101500l() {
        AbstractC3006f0.m8732z(this.scope, null, null, new c(null), 3);
    }

    public /* synthetic */ C32504c(Context context, FeatureFlagChecker featureFlagChecker, InterfaceC18571a interfaceC18571a, C15892b c15892b, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, InterfaceC32508g interfaceC32508g, C32505d c32505d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, featureFlagChecker, interfaceC18571a, c15892b, interfaceC2994c0, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BackgroundLocationCollector") : interfaceC34116n, (i13 & 64) != 0 ? new C32509h(AbstractC22503a.m65006a(context)) : interfaceC32508g, (i13 & 128) != 0 ? new C32505d() : c32505d);
    }
}
