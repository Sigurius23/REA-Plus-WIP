package sh1;

import android.location.Location;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import ii1.InterfaceC18571a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: sh1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lsh1/f;", "Lof3/a;", "Lbc3/c0;", "scope", "<init>", "(Lbc3/c0;)V", "", "Landroid/location/Location;", "locations", "Ll83/a0;", "d", "(Ljava/util/List;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lii1/a;", "x", "Ll83/h;", "b", "()Lii1/a;", "gpsStorage", "Ltr2/n;", "y", "Ltr2/n;", "c", "()Ltr2/n;", "logger", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32507f implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h gpsStorage;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: sh1.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.gps.collector.KoinBackgroundLocationHelper$processLocations$1", m100430f = "BackgroundLocationReceiver.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List<Location> f134634E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C32507f f134635F;

        /* JADX INFO: renamed from: w */
        Object f134636w;

        /* JADX INFO: renamed from: x */
        Object f134637x;

        /* JADX INFO: renamed from: y */
        Object f134638y;

        /* JADX INFO: renamed from: z */
        int f134639z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Location> list, C32507f c32507f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134634E = list;
            this.f134635F = c32507f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f134634E, this.f134635F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031  */
        /* JADX WARN: Code duplicated, block: B:13:0x0052 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0067  */
        /* JADX WARN: Code duplicated, block: B:17:0x0071  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:14:0x0053). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0071
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r11.f134639z
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r11.f134638y
                yh1.a r1 = (yh1.C39540a) r1
                java.lang.Object r3 = r11.f134637x
                android.location.Location r3 = (android.location.Location) r3
                java.lang.Object r4 = r11.f134636w
                java.util.Iterator r4 = (java.util.Iterator) r4
                p505ts.AbstractC34132o.m107864I(r12)
                goto L53
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                p505ts.AbstractC34132o.m107864I(r12)
                java.util.List<android.location.Location> r12 = r11.f134634E
                java.util.Iterator r12 = r12.iterator()
                r4 = r12
            L2b:
                boolean r12 = r4.hasNext()
                if (r12 == 0) goto L91
                java.lang.Object r12 = r4.next()
                r3 = r12
                android.location.Location r3 = (android.location.Location) r3
                java.lang.String r12 = "distance_change"
                yh1.a r1 = ki1.AbstractC22504b.m65007a(r3, r12)
                sh1.f r12 = r11.f134635F
                ii1.a r12 = sh1.C32507f.m101508a(r12)
                r11.f134636w = r4
                r11.f134637x = r3
                r11.f134638y = r1
                r11.f134639z = r2
                java.lang.Object r12 = r12.mo53786c(r1, r11)
                if (r12 != r0) goto L53
                return r0
            L53:
                sh1.f r12 = r11.f134635F
                tr2.n r12 = r12.getLogger()
                double r5 = r3.getLatitude()
                double r7 = r3.getLongitude()
                yh1.b r1 = r1.getSpeed()
                if (r1 == 0) goto L71
                double r9 = r1.getValue()
                java.lang.Double r1 = new java.lang.Double
                r1.<init>(r9)
                goto L73
            L71:
                java.lang.String r1 = "null"
            L73:
                java.lang.String r3 = "Location saved: lat="
                java.lang.String r9 = ", lng="
                java.lang.StringBuilder r3 = p031b9.AbstractC2875y.m8306s(r3, r5, r9)
                r3.append(r7)
                java.lang.String r5 = ", speed="
                r3.append(r5)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r3 = 0
                qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r3]
                r12.mo85216g(r1, r3)
                goto L2b
            L91:
                l83.a0 r12 = l83.C23454a0.f92919a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: sh1.C32507f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sh1.f$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f134640w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f134641x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f134642y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f134640w = interfaceC27903a;
            this.f134641x = interfaceC35951a;
            this.f134642y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [ii1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC18571a invoke() {
            InterfaceC27903a interfaceC27903a = this.f134640w;
            InterfaceC35951a interfaceC35951a = this.f134641x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f134642y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC18571a.class), interfaceC35951a);
        }
    }

    public C32507f(InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        this.scope = scope;
        this.gpsStorage = AbstractC30060g.m92087G(EnumC23463i.f92933w, new b(this, null, null));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("BackgroundLocationReceiver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final InterfaceC18571a m101509b() {
        return (InterfaceC18571a) this.gpsStorage.getValue();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: d */
    public final void m101511d(List<? extends Location> locations) {
        AbstractC22676k.m65750j(locations, "locations");
        AbstractC3006f0.m8732z(this.scope, null, null, new a(locations, this, null), 3);
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C32507f(InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0 = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, ExecutorC22364d.f87316w));
        }
        this(interfaceC2994c0);
    }
}
