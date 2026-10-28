package zh1;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Looper;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import fv1.C14814b;
import fv1.InterfaceC14815c;
import gi1.C15892b;
import l83.C23454a0;
import live.hms.video.utils.HMSConstantsKt;
import p503tp.AbstractC34036g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zh1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lzh1/d;", "Lzh1/a;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedLocationClient", "Lfv1/c;", "locationManager", "Lgi1/b;", "gpsPermissionHelper", "<init>", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Lfv1/c;Lgi1/b;)V", "Lec3/l;", "Lfv1/b;", "start", "()Lec3/l;", "Ll83/a0;", "stop", "()V", "a", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "b", "Lfv1/c;", "c", "Lgi1/b;", "Ltp/g;", "d", "Ltp/g;", "locationCallback", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40642d implements InterfaceC40639a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FusedLocationProviderClient fusedLocationClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14815c locationManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C15892b gpsPermissionHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private AbstractC34036g locationCallback;

    /* JADX INFO: renamed from: zh1.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.gps.foreground.ForegroundGpsCollectorImpl$start$1", m100430f = "foregroundGpsCollector.kt", m100431l = {36, 57}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Lfv1/b;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f175400w;

        /* JADX INFO: renamed from: x */
        Object f175401x;

        /* JADX INFO: renamed from: y */
        int f175402y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f175403z;

        /* JADX INFO: renamed from: zh1.d$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.gps.foreground.ForegroundGpsCollectorImpl$start$1$2", m100430f = "foregroundGpsCollector.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42758a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f175404w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40642d f175405x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC11936u f175406y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42758a(C40642d c40642d, InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C42758a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f175405x = c40642d;
                this.f175406y = interfaceC11936u;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42758a(this.f175405x, this.f175406y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42758a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f175404w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC14815c interfaceC14815c = this.f175405x.locationManager;
                    this.f175404w = 1;
                    obj = interfaceC14815c.mo42556a(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C14814b c14814b = (C14814b) obj;
                if (c14814b != null) {
                    ((C11935t) this.f175406y).mo32218s(c14814b);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: zh1.d$a$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"zh1/d$a$b", "Ltp/g;", "Lcom/google/android/gms/location/LocationResult;", "result", "Ll83/a0;", "onLocationResult", "(Lcom/google/android/gms/location/LocationResult;)V", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends AbstractC34036g {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC11936u f175407a;

            public b(InterfaceC11936u interfaceC11936u) {
                this.f175407a = interfaceC11936u;
            }

            @Override // p503tp.AbstractC34036g
            public void onLocationResult(LocationResult result) {
                C14814b c14814bM131886b;
                AbstractC22676k.m65750j(result, "result");
                Location locationM15632b = result.m15632b();
                if (locationM15632b == null || (c14814bM131886b = AbstractC40643e.m131886b(locationM15632b)) == null) {
                    return;
                }
                ((C11935t) this.f175407a).f39041z.mo32218s(c14814bM131886b);
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final C23454a0 m131883i() {
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C23454a0 m131884j(C40642d c40642d, b bVar) {
            c40642d.fusedLocationClient.removeLocationUpdates(bVar);
            if (c40642d.locationCallback == bVar) {
                c40642d.locationCallback = null;
            }
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C40642d.this.new a(interfaceC30057d);
            aVar.f175403z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0095 A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f175403z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f175402y;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (!C40642d.this.gpsPermissionHelper.m44826b()) {
                C40640b c40640b = new C40640b();
                this.f175403z = null;
                this.f175402y = 1;
                if (AbstractC37056f.m118984h(interfaceC11936u, c40640b, this) == enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
            }
            AbstractC3006f0.m8732z(interfaceC11936u, null, null, new C42758a(C40642d.this, interfaceC11936u, null), 3);
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.f20585w = 100;
            locationRequest.m15629i(HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS);
            locationRequest.m15628h(2000L);
            final b bVar = new b(interfaceC11936u);
            C40642d.this.locationCallback = bVar;
            C40642d.this.fusedLocationClient.requestLocationUpdates(locationRequest, bVar, Looper.getMainLooper());
            final C40642d c40642d = C40642d.this;
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: zh1.c
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return C40642d.a.m131884j(c40642d, bVar);
                }
            };
            this.f175403z = null;
            this.f175400w = null;
            this.f175401x = null;
            this.f175402y = 2;
            if (AbstractC37056f.m118984h(interfaceC11936u, interfaceC4339a, this) == enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
        }
    }

    public C40642d(FusedLocationProviderClient fusedLocationClient, InterfaceC14815c locationManager, C15892b gpsPermissionHelper) {
        AbstractC22676k.m65750j(fusedLocationClient, "fusedLocationClient");
        AbstractC22676k.m65750j(locationManager, "locationManager");
        AbstractC22676k.m65750j(gpsPermissionHelper, "gpsPermissionHelper");
        this.fusedLocationClient = fusedLocationClient;
        this.locationManager = locationManager;
        this.gpsPermissionHelper = gpsPermissionHelper;
    }

    @Override // zh1.InterfaceC40639a
    @SuppressLint({"MissingPermission"})
    public InterfaceC13058l start() {
        return AbstractC13091v.m36600j(new a(null));
    }

    @Override // zh1.InterfaceC40639a
    public void stop() {
        AbstractC34036g abstractC34036g = this.locationCallback;
        if (abstractC34036g != null) {
            this.fusedLocationClient.removeLocationUpdates(abstractC34036g);
        }
        this.locationCallback = null;
    }
}
