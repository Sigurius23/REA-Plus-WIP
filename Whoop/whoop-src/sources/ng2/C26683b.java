package ng2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fv1.C14814b;
import fv1.InterfaceC14815c;
import gi1.C15892b;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w41.C36823w;

/* JADX INFO: renamed from: ng2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lng2/b;", "", "Lfv1/c;", "locationManager", "Lgi1/b;", "gpsPermissionHelper", "<init>", "(Lfv1/c;Lgi1/b;)V", "Lw41/w;", "b", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "", "isGpsTrackingEnabledFlow", "c", "(Lec3/l;)Lec3/l;", "a", "Lfv1/c;", "Lgi1/b;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26683b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14815c locationManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C15892b gpsPermissionHelper;

    /* JADX INFO: renamed from: ng2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.PreSessionUserLocationProvider", m100430f = "PreSessionUserLocationProvider.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "getLocationIfPermitted", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f106073w;

        /* JADX INFO: renamed from: y */
        int f106075y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f106073w = obj;
            this.f106075y |= Integer.MIN_VALUE;
            return C26683b.this.m79369b(this);
        }
    }

    /* JADX INFO: renamed from: ng2.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.PreSessionUserLocationProvider$locationFlow$$inlined$flatMapLatest$1", m100430f = "PreSessionUserLocationProvider.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f106076w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f106077x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f106078y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26683b f106079z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C26683b c26683b) {
            super(3, interfaceC30057d);
            this.f106079z = c26683b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f106079z);
            bVar.f106077x = interfaceC13062m;
            bVar.f106078y = bool;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f106076w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f106077x;
                ((Boolean) this.f106078y).getClass();
                C13084s1 c13084s1 = new C13084s1(this.f106079z.new c(null));
                this.f106077x = null;
                this.f106078y = null;
                this.f106076w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ng2.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.PreSessionUserLocationProvider$locationFlow$1$1", m100430f = "PreSessionUserLocationProvider.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER, C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lw41/w;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f106080w;

        /* JADX INFO: renamed from: x */
        int f106081x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f106082y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C26683b.this.new c(interfaceC30057d);
            cVar.f106082y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f106082y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f106081x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f106080w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                ng2.b r7 = ng2.C26683b.this
                r6.f106082y = r5
                r6.f106080w = r0
                r6.f106081x = r4
                java.lang.Object r7 = ng2.C26683b.m79368a(r7, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f106082y = r5
                r6.f106080w = r5
                r6.f106081x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ng2.C26683b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C26683b(InterfaceC14815c locationManager, C15892b gpsPermissionHelper) {
        AbstractC22676k.m65750j(locationManager, "locationManager");
        AbstractC22676k.m65750j(gpsPermissionHelper, "gpsPermissionHelper");
        this.locationManager = locationManager;
        this.gpsPermissionHelper = gpsPermissionHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m79369b(InterfaceC30057d<? super C36823w> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f106075y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f106075y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo42556a = aVar.f106073w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f106075y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo42556a);
            if (!this.gpsPermissionHelper.m44826b()) {
                return null;
            }
            InterfaceC14815c interfaceC14815c = this.locationManager;
            aVar.f106075y = 1;
            objMo42556a = interfaceC14815c.mo42556a(aVar);
            if (objMo42556a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo42556a);
        }
        C14814b c14814b = (C14814b) objMo42556a;
        if (c14814b != null) {
            return new C36823w(c14814b.getLatitude(), c14814b.getLongitude());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m79370c(InterfaceC13058l isGpsTrackingEnabledFlow) {
        AbstractC22676k.m65750j(isGpsTrackingEnabledFlow, "isGpsTrackingEnabledFlow");
        return AbstractC13091v.m36590P(AbstractC13091v.m36610t(isGpsTrackingEnabledFlow), new b(null, this));
    }
}
