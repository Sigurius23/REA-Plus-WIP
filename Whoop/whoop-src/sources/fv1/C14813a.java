package fv1;

import com.google.android.gms.location.FusedLocationProviderClient;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: fv1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0097@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lfv1/a;", "Lfv1/c;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedLocationClient", "Ltr2/n;", "logger", "<init>", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Ltr2/n;)V", "Lfv1/b;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "b", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14813a implements InterfaceC14815c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FusedLocationProviderClient fusedLocationClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fv1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.location.FusedLocationManager", m100430f = "FusedLocationManager.kt", m100431l = {35, 39}, m100432m = "getCurrentLocation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f55000w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f55001x;

        /* JADX INFO: renamed from: z */
        int f55003z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f55001x = obj;
            this.f55003z |= Integer.MIN_VALUE;
            return C14813a.this.mo42556a(this);
        }
    }

    public C14813a(FusedLocationProviderClient fusedLocationClient, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(fusedLocationClient, "fusedLocationClient");
        AbstractC22676k.m65750j(logger, "logger");
        this.fusedLocationClient = fusedLocationClient;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:13:0x002f, B:30:0x0074, B:32:0x0078, B:19:0x003d, B:25:0x0058, B:27:0x005c, B:22:0x0044), top: B:37:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r0 == r3) goto L29;
     */
    @Override // fv1.InterfaceC14815c
    @android.annotation.SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo42556a(q83.InterfaceC30057d<? super fv1.C14814b> r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            boolean r2 = r0 instanceof fv1.C14813a.a
            if (r2 == 0) goto L17
            r2 = r0
            fv1.a$a r2 = (fv1.C14813a.a) r2
            int r3 = r2.f55003z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f55003z = r3
            goto L1c
        L17:
            fv1.a$a r2 = new fv1.a$a
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f55001x
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r2.f55003z
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L41
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L35
            java.lang.Object r3 = r2.f55000w
            android.location.Location r3 = (android.location.Location) r3
            p505ts.AbstractC34132o.m107864I(r0)     // Catch: java.lang.Exception -> L33
            goto L74
        L33:
            r0 = move-exception
            goto L9c
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3d:
            p505ts.AbstractC34132o.m107864I(r0)     // Catch: java.lang.Exception -> L33
            goto L58
        L41:
            p505ts.AbstractC34132o.m107864I(r0)
            com.google.android.gms.location.FusedLocationProviderClient r0 = r1.fusedLocationClient     // Catch: java.lang.Exception -> L33
            com.google.android.gms.tasks.Task r0 = r0.getLastLocation()     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = "getLastLocation(...)"
            p715kotlin.jvm.internal.AbstractC22676k.m65749i(r0, r4)     // Catch: java.lang.Exception -> L33
            r2.f55003z = r6     // Catch: java.lang.Exception -> L33
            java.lang.Object r0 = com.squareup.wire.AbstractC5583n.m16789o(r0, r2)     // Catch: java.lang.Exception -> L33
            if (r0 != r3) goto L58
            goto L73
        L58:
            android.location.Location r0 = (android.location.Location) r0     // Catch: java.lang.Exception -> L33
            if (r0 != 0) goto L76
            com.google.android.gms.location.FusedLocationProviderClient r0 = r1.fusedLocationClient     // Catch: java.lang.Exception -> L33
            r4 = 104(0x68, float:1.46E-43)
            com.google.android.gms.tasks.Task r0 = r0.getCurrentLocation(r4, r7)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = "getCurrentLocation(...)"
            p715kotlin.jvm.internal.AbstractC22676k.m65749i(r0, r4)     // Catch: java.lang.Exception -> L33
            r2.f55000w = r7     // Catch: java.lang.Exception -> L33
            r2.f55003z = r5     // Catch: java.lang.Exception -> L33
            java.lang.Object r0 = com.squareup.wire.AbstractC5583n.m16789o(r0, r2)     // Catch: java.lang.Exception -> L33
            if (r0 != r3) goto L74
        L73:
            return r3
        L74:
            android.location.Location r0 = (android.location.Location) r0     // Catch: java.lang.Exception -> L33
        L76:
            if (r0 == 0) goto L9b
            fv1.b r8 = new fv1.b     // Catch: java.lang.Exception -> L33
            double r9 = r0.getLatitude()     // Catch: java.lang.Exception -> L33
            double r11 = r0.getLongitude()     // Catch: java.lang.Exception -> L33
            double r13 = r0.getAltitude()     // Catch: java.lang.Exception -> L33
            float r3 = r0.getAccuracy()     // Catch: java.lang.Exception -> L33
            double r3 = (double) r3     // Catch: java.lang.Exception -> L33
            float r5 = r0.getVerticalAccuracyMeters()     // Catch: java.lang.Exception -> L33
            double r5 = (double) r5     // Catch: java.lang.Exception -> L33
            long r19 = r0.getTime()     // Catch: java.lang.Exception -> L33
            r15 = r3
            r17 = r5
            r8.<init>(r9, r11, r13, r15, r17, r19)     // Catch: java.lang.Exception -> L33
            return r8
        L9b:
            return r7
        L9c:
            q83.j r2 = r2.getContext()
            bc3.AbstractC3006f0.m8721o(r2)
            tr2.n r2 = r1.logger
            r3 = 0
            qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r3]
            java.lang.String r4 = "Failed to retrieve location"
            r2.mo85230v(r4, r0, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fv1.C14813a.mo42556a(q83.d):java.lang.Object");
    }
}
