package vk2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whoop.activitysession.PauseSegment;
import com.whoop.trackactivity.service.TrackSessionService;
import ec3.C13054k;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import mk2.C25645l;
import mk2.InterfaceC25654u;
import p000.AbstractC11266d;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ`\u0010\u001c\u001a\u00020\u001b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0096@¢\u0006\u0004\b#\u0010$JZ\u0010&\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0096@¢\u0006\u0004\b&\u0010\u001dJ\u000f\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020,H\u0016¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0016¢\u0006\u0004\b1\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00105R\u0014\u00106\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Lvk2/a;", "Lmk2/u;", "Landroid/content/Context;", "context", "Lvk2/d;", "stateHolder", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Lvk2/d;Ljava/time/Clock;Ltr2/n;)V", "Lec3/l;", "Lmk2/w;", "sessionUpdateFlow", "", "gpsTrackingEnabled", "", "sessionStartTimeMs", "", "activityInternalName", "", "Lcom/whoop/activitysession/PauseSegment;", "pauseSegments", "enableHeartRateStream", "Lcom/whoop/trackactivity/domain/models/SessionTargets;", "targetsFlow", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;ZJLjava/lang/String;Ljava/util/List;ZLec3/l;Lq83/d;)Ljava/lang/Object;", "k", "(Z)Z", "permission", "j", "(Ljava/lang/String;)Z", "c", "(Lec3/l;ZJLjava/lang/String;ZLec3/l;Lq83/d;)Ljava/lang/Object;", "startTimeMs", "b", "pause", "()V", "resume", "a", "(Lq83/d;)Ljava/lang/Object;", "Lmk2/l;", "f", "()Lec3/l;", "d", "()Lmk2/l;", "e", "Landroid/content/Context;", "Lvk2/d;", "Ljava/time/Clock;", "Ltr2/n;", "isRunning", "()Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36089a implements InterfaceC25654u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36092d stateHolder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vk2.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.LiveTrackSessionServiceConnector", m100430f = "LiveTrackSessionServiceConnector.kt", m100431l = {72}, m100432m = "attach", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f154189E;

        /* JADX INFO: renamed from: F */
        boolean f154190F;

        /* JADX INFO: renamed from: G */
        long f154191G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f154192H;

        /* JADX INFO: renamed from: J */
        int f154194J;

        /* JADX INFO: renamed from: w */
        Object f154195w;

        /* JADX INFO: renamed from: x */
        Object f154196x;

        /* JADX INFO: renamed from: y */
        Object f154197y;

        /* JADX INFO: renamed from: z */
        Object f154198z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154192H = obj;
            this.f154194J |= Integer.MIN_VALUE;
            return C36089a.this.mo75543b(null, false, 0L, null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: vk2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.LiveTrackSessionServiceConnector", m100430f = "LiveTrackSessionServiceConnector.kt", m100431l = {101}, m100432m = "beginTracking", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f154199E;

        /* JADX INFO: renamed from: F */
        boolean f154200F;

        /* JADX INFO: renamed from: G */
        long f154201G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f154202H;

        /* JADX INFO: renamed from: J */
        int f154204J;

        /* JADX INFO: renamed from: w */
        Object f154205w;

        /* JADX INFO: renamed from: x */
        Object f154206x;

        /* JADX INFO: renamed from: y */
        Object f154207y;

        /* JADX INFO: renamed from: z */
        Object f154208z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154202H = obj;
            this.f154204J |= Integer.MIN_VALUE;
            return C36089a.this.m114623h(null, false, 0L, null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: vk2.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.LiveTrackSessionServiceConnector", m100430f = "LiveTrackSessionServiceConnector.kt", m100431l = {47}, m100432m = "start", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f154209E;

        /* JADX INFO: renamed from: F */
        long f154210F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f154211G;

        /* JADX INFO: renamed from: I */
        int f154213I;

        /* JADX INFO: renamed from: w */
        Object f154214w;

        /* JADX INFO: renamed from: x */
        Object f154215x;

        /* JADX INFO: renamed from: y */
        Object f154216y;

        /* JADX INFO: renamed from: z */
        boolean f154217z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154211G = obj;
            this.f154213I |= Integer.MIN_VALUE;
            return C36089a.this.mo75544c(null, false, 0L, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: vk2.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.LiveTrackSessionServiceConnector", m100430f = "LiveTrackSessionServiceConnector.kt", m100431l = {131}, m100432m = "stop", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f154218w;

        /* JADX INFO: renamed from: y */
        int f154220y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154218w = obj;
            this.f154220y |= Integer.MIN_VALUE;
            return C36089a.this.mo75542a(this);
        }
    }

    public C36089a(Context context, C36092d stateHolder, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(stateHolder, "stateHolder");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.stateHolder = stateHolder;
        this.clock = clock;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: h */
    public final Object m114623h(InterfaceC13058l interfaceC13058l, boolean z4, long j7, String str, List<PauseSegment> list, boolean z13, InterfaceC13058l interfaceC13058l2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f154204J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f154204J = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f154202H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f154204J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C36092d c36092d = this.stateHolder;
            bVar2.f154205w = null;
            bVar2.f154206x = null;
            bVar2.f154207y = null;
            bVar2.f154208z = null;
            bVar2.f154199E = z4;
            bVar2.f154201G = j7;
            bVar2.f154200F = z13;
            bVar2.f154204J = 1;
            if (c36092d.m114661w(interfaceC13058l, z4, j7, str, list, z13, interfaceC13058l2, bVar2) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = bVar2.f154199E;
            AbstractC34132o.m107864I(obj);
        }
        Intent intentPutExtra = new Intent(this.context, (Class<?>) TrackSessionService.class).putExtra("com.whoop.trackactivity.EXTRA_GPS_TRACKING_ENABLED", z4);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        AbstractC32122c.startForegroundService(this.context, intentPutExtra);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m114624i(C36089a c36089a, InterfaceC13058l interfaceC13058l, boolean z4, long j7, String str, List list, boolean z13, InterfaceC13058l interfaceC13058l2, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        return c36089a.m114623h(interfaceC13058l, z4, j7, str, (i13 & 16) != 0 ? C25271y.f99162w : list, (i13 & 32) != 0 ? true : z13, (i13 & 64) != 0 ? C13054k.f45116w : interfaceC13058l2, interfaceC30057d);
    }

    /* JADX INFO: renamed from: j */
    private final boolean m114625j(String permission) {
        return AbstractC32122c.checkSelfPermission(this.context, permission) == 0;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m114626k(boolean gpsTrackingEnabled) {
        if (Build.VERSION.SDK_INT < 34) {
            return true;
        }
        if (gpsTrackingEnabled) {
            return m114625j("android.permission.FOREGROUND_SERVICE_LOCATION") && m114625j("android.permission.ACCESS_FINE_LOCATION");
        }
        return m114625j("android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE") && m114625j("android.permission.BLUETOOTH_CONNECT");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mk2.InterfaceC25654u
    /* JADX INFO: renamed from: a */
    public Object mo75542a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f154220y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f154220y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f154218w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f154220y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C36092d c36092d = this.stateHolder;
            dVar.f154220y = 1;
            if (c36092d.m114662x(dVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.context.stopService(new Intent(this.context, (Class<?>) TrackSessionService.class));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // mk2.InterfaceC25654u
    /* JADX INFO: renamed from: b */
    public Object mo75543b(InterfaceC13058l interfaceC13058l, boolean z4, long j7, String str, List<PauseSegment> list, boolean z13, InterfaceC13058l interfaceC13058l2, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f154194J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f154194J = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f154192H;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = aVar2.f154194J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (this.stateHolder.m114658s()) {
                return Boolean.TRUE;
            }
            if (!m114626k(z4)) {
                this.logger.mo85222m(AbstractC11266d.m30462p("Cannot restart TrackSessionService on attach: missing required permissions for gpsTrackingEnabled=", z4), new AbstractC30556a.a[0]);
                return Boolean.FALSE;
            }
            aVar2.f154195w = null;
            aVar2.f154196x = null;
            aVar2.f154197y = null;
            aVar2.f154198z = null;
            aVar2.f154189E = z4;
            aVar2.f154191G = j7;
            aVar2.f154190F = z13;
            aVar2.f154194J = 1;
            if (m114623h(interfaceC13058l, z4, j7, str, list, z13, interfaceC13058l2, aVar2) == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // mk2.InterfaceC25654u
    /* JADX INFO: renamed from: c */
    public Object mo75544c(InterfaceC13058l interfaceC13058l, boolean z4, long j7, String str, boolean z13, InterfaceC13058l interfaceC13058l2, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f154213I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f154213I = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f154211G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f154213I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!m114626k(z4)) {
                this.logger.mo85222m(AbstractC11266d.m30462p("Cannot start TrackSessionService: missing required permissions for gpsTrackingEnabled=", z4), new AbstractC30556a.a[0]);
                return Boolean.FALSE;
            }
            cVar2.f154214w = null;
            cVar2.f154215x = null;
            cVar2.f154216y = null;
            cVar2.f154217z = z4;
            cVar2.f154210F = j7;
            cVar2.f154209E = z13;
            cVar2.f154213I = 1;
            if (m114624i(this, interfaceC13058l, z4, j7, str, null, z13, interfaceC13058l2, cVar2, 16, null) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return Boolean.TRUE;
    }

    @Override // mk2.InterfaceC25654u
    /* JADX INFO: renamed from: d */
    public C25645l mo75545d() {
        return (C25645l) this.stateHolder.getTrackSessionState().getValue();
    }

    @Override // mk2.InterfaceC25654u
    /* JADX INFO: renamed from: e */
    public InterfaceC13058l mo75546e() {
        return this.stateHolder.getTargets();
    }

    @Override // mk2.InterfaceC25654u
    /* JADX INFO: renamed from: f */
    public InterfaceC13058l mo75547f() {
        return this.stateHolder.getTrackSessionState();
    }

    @Override // mk2.InterfaceC25654u
    public boolean isRunning() {
        return this.stateHolder.m114658s();
    }

    @Override // mk2.InterfaceC25654u
    public void pause() {
        this.stateHolder.m114659t();
    }

    @Override // mk2.InterfaceC25654u
    public void resume() {
        this.stateHolder.m114660v();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C36089a(Context context, C36092d c36092d, Clock clock, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            clock = Clock.systemUTC();
            AbstractC22676k.m65749i(clock, "systemUTC(...)");
        }
        this(context, c36092d, clock, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LiveTrackSessionServiceConnector") : interfaceC34116n);
    }
}
