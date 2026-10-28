package vu0;

import b12.C2288d;
import b12.EnumC2287c;
import m83.AbstractC25260n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: vu0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lvu0/f;", "", "Lvu0/e;", "streakInfoHandler", "Lvu0/a;", "lowBatteryNotificationBuilder", "Ltr2/n;", "logger", "<init>", "(Lvu0/e;Lvu0/a;Ltr2/n;)V", "Lb12/c;", "bucket", "Lst0/v;", "strapGen", "", "b", "(Lb12/c;Lst0/v;)Z", "Lvu0/d;", "streak", "a", "(Lvu0/d;)Z", "Lb12/d;", "standardContent", "c", "(Lb12/c;Lst0/v;Lb12/d;Lq83/d;)Ljava/lang/Object;", "Lvu0/e;", "Lvu0/a;", "Ltr2/n;", "d", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36509f {

    /* JADX INFO: renamed from: e */
    public static final int f155980e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C36508e streakInfoHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36504a lowBatteryNotificationBuilder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vu0.f$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155984a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f155984a = iArr;
        }
    }

    /* JADX INFO: renamed from: vu0.f$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.lowbattery.StreakLowBatteryNotificationResolver", m100430f = "StreakLowBatteryNotificationResolver.kt", m100431l = {26}, m100432m = "resolve", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f155985E;

        /* JADX INFO: renamed from: G */
        int f155987G;

        /* JADX INFO: renamed from: w */
        Object f155988w;

        /* JADX INFO: renamed from: x */
        Object f155989x;

        /* JADX INFO: renamed from: y */
        Object f155990y;

        /* JADX INFO: renamed from: z */
        boolean f155991z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155985E = obj;
            this.f155987G |= Integer.MIN_VALUE;
            return C36509f.this.m117023c(null, null, null, this);
        }
    }

    public C36509f(C36508e streakInfoHandler, C36504a lowBatteryNotificationBuilder, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(streakInfoHandler, "streakInfoHandler");
        AbstractC22676k.m65750j(lowBatteryNotificationBuilder, "lowBatteryNotificationBuilder");
        AbstractC22676k.m65750j(logger, "logger");
        this.streakInfoHandler = streakInfoHandler;
        this.lowBatteryNotificationBuilder = lowBatteryNotificationBuilder;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m117021a(C36507d streak) {
        Integer numM125932Q;
        if (streak != null && (numM125932Q = AbstractC39421y.m125932Q(streak.getStreakValue())) != null) {
            int iIntValue = numM125932Q.intValue();
            if (AbstractC25260n.m74059b1(new String[]{"ACTIVE", "FROZEN", "PENDING"}).contains(streak.getStreakState()) && iIntValue >= 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0022 A[RETURN] */
    /* JADX INFO: renamed from: b */
    private final boolean m117022b(EnumC2287c bucket, EnumC32978v strapGen) {
        switch (strapGen == null ? -1 : b.f155984a[strapGen.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                if (bucket == EnumC2287c.BUCKET_MEDIUM) {
                    return true;
                }
                return false;
            case 5:
            case 6:
                return bucket == EnumC2287c.BUCKET_LOW;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m117023c(EnumC2287c enumC2287c, EnumC32978v enumC32978v, C2288d c2288d, InterfaceC30057d<? super C2288d> interfaceC30057d) {
        c cVar;
        boolean zM117022b;
        C36507d c36507d;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f155987G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f155987G = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM117020b = cVar.f155985E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f155987G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM117020b);
            zM117022b = m117022b(enumC2287c, enumC32978v);
            c36507d = null;
            if (zM117022b) {
                C36508e c36508e = this.streakInfoHandler;
                cVar.f155988w = null;
                cVar.f155989x = enumC32978v;
                cVar.f155990y = c2288d;
                cVar.f155991z = zM117022b;
                cVar.f155987G = 1;
                objM117020b = c36508e.m117020b(cVar);
                if (objM117020b == enumC31071a) {
                    return enumC31071a;
                }
            }
            return (zM117022b || c36507d == null || !m117021a(c36507d)) ? c2288d : new C2288d(this.lowBatteryNotificationBuilder.m117007f(enumC32978v), this.lowBatteryNotificationBuilder.m117006e(c36507d.getStreakValue()), this.lowBatteryNotificationBuilder.m117005d(enumC32978v));
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zM117022b = cVar.f155991z;
        c2288d = (C2288d) cVar.f155990y;
        enumC32978v = (EnumC32978v) cVar.f155989x;
        AbstractC34132o.m107864I(objM117020b);
        c36507d = (C36507d) objM117020b;
        if (zM117022b) {
        }
    }

    public /* synthetic */ C36509f(C36508e c36508e, C36504a c36504a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36508e, c36504a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StreakResolver") : interfaceC34116n);
    }
}
