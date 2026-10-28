package rk2;

import android.database.sqlite.SQLiteException;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.addactivity.network.CreateActivityPauseSegment;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25267u;
import m83.C25271y;
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

/* JADX INFO: renamed from: rk2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJN\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0096@¢\u0006\u0004\b#\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&¨\u0006'"}, m65681d2 = {"Lrk2/g;", "Lrk2/f;", "Lrk2/c;", "dao", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lrk2/c;Ljava/time/Clock;Ltr2/n;)V", "Lrk2/e;", "Lrk2/b;", "d", "(Lrk2/e;)Lrk2/b;", "", "activityInternalName", "", "garmentId", "startTime", "endTime", "", "gpsEnabled", "", "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;", "pauseSegments", "Ll83/n;", "Ll83/a0;", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;", "getAll", "(Lq83/d;)Ljava/lang/Object;", "", "id", "b", "(JLq83/d;)Ljava/lang/Object;", "c", "Lrk2/c;", "Ljava/time/Clock;", "Ltr2/n;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31503g implements InterfaceC31502f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC31499c dao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: rk2.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.RoomPendingActivitySaveStore", m100430f = "RoomPendingActivitySaveStore.kt", m100431l = {55}, m100432m = "clearAll-IoAF18A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f129949w;

        /* JADX INFO: renamed from: y */
        int f129951y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129949w = obj;
            this.f129951y |= Integer.MIN_VALUE;
            Object objMo97070c = C31503g.this.mo97070c(this);
            return objMo97070c == EnumC31071a.f128113w ? objMo97070c : new C23468n(objMo97070c);
        }
    }

    /* JADX INFO: renamed from: rk2.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.RoomPendingActivitySaveStore", m100430f = "RoomPendingActivitySaveStore.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "enqueue-bMdYcbs", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129952E;

        /* JADX INFO: renamed from: F */
        boolean f129953F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f129954G;

        /* JADX INFO: renamed from: I */
        int f129956I;

        /* JADX INFO: renamed from: w */
        Object f129957w;

        /* JADX INFO: renamed from: x */
        Object f129958x;

        /* JADX INFO: renamed from: y */
        Object f129959y;

        /* JADX INFO: renamed from: z */
        Object f129960z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129954G = obj;
            this.f129956I |= Integer.MIN_VALUE;
            Object objMo97068a = C31503g.this.mo97068a(null, 0, null, null, false, null, this);
            return objMo97068a == EnumC31071a.f128113w ? objMo97068a : new C23468n(objMo97068a);
        }
    }

    /* JADX INFO: renamed from: rk2.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.RoomPendingActivitySaveStore", m100430f = "RoomPendingActivitySaveStore.kt", m100431l = {40}, m100432m = "getAll", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f129961w;

        /* JADX INFO: renamed from: y */
        int f129963y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129961w = obj;
            this.f129963y |= Integer.MIN_VALUE;
            return C31503g.this.getAll(this);
        }
    }

    /* JADX INFO: renamed from: rk2.g$d */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.RoomPendingActivitySaveStore", m100430f = "RoomPendingActivitySaveStore.kt", m100431l = {47}, m100432m = "remove-gIAlu-s", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f129964w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f129965x;

        /* JADX INFO: renamed from: z */
        int f129967z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129965x = obj;
            this.f129967z |= Integer.MIN_VALUE;
            Object objMo97069b = C31503g.this.mo97069b(0L, this);
            return objMo97069b == EnumC31071a.f128113w ? objMo97069b : new C23468n(objMo97069b);
        }
    }

    public C31503g(InterfaceC31499c dao, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.dao = dao;
        this.clock = clock;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    private final C31498b m97071d(C31501e c31501e) {
        return new C31498b(c31501e.getId(), c31501e.getActivityInternalName(), c31501e.getGarmentId(), c31501e.getStartTime(), c31501e.getEndTime(), c31501e.getGpsEnabled(), c31501e.m97065f());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // rk2.InterfaceC31502f
    /* JADX INFO: renamed from: a */
    public Object mo97068a(String str, int i13, String str2, String str3, boolean z4, List<CreateActivityPauseSegment> list, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f129956I;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f129956I = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f129954G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f129956I;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC31499c interfaceC31499c = this.dao;
                C31501e c31501e = new C31501e(0L, str, i13, str2, str3, z4, this.clock.millis(), list, 1, null);
                bVar.f129957w = null;
                bVar.f129958x = null;
                bVar.f129959y = null;
                bVar.f129960z = null;
                bVar.f129952E = i13;
                bVar.f129953F = z4;
                bVar.f129956I = 1;
                if (interfaceC31499c.mo97048b(c31501e, bVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Failed to enqueue pending activity save", e5, new AbstractC30556a.a[0]);
            return AbstractC34132o.m107888l(e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rk2.InterfaceC31502f
    /* JADX INFO: renamed from: b */
    public Object mo97069b(long j7, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f129967z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f129967z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f129965x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f129967z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC31499c interfaceC31499c = this.dao;
                dVar.f129964w = j7;
                dVar.f129967z = 1;
                if (interfaceC31499c.mo97047a(j7, dVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Failed to remove pending activity save", e5, new AbstractC30556a.a[0]);
            return AbstractC34132o.m107888l(e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rk2.InterfaceC31502f
    /* JADX INFO: renamed from: c */
    public Object mo97070c(InterfaceC30057d<? super C23468n> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f129951y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f129951y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f129949w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f129951y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC31499c interfaceC31499c = this.dao;
                aVar.f129951y = 1;
                if (interfaceC31499c.deleteAll(aVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Failed to clear pending activity saves", e5, new AbstractC30556a.a[0]);
            return AbstractC34132o.m107888l(e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rk2.InterfaceC31502f
    public Object getAll(InterfaceC30057d<? super List<C31498b>> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f129963y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f129963y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object all = cVar.f129961w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f129963y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(all);
                InterfaceC31499c interfaceC31499c = this.dao;
                cVar.f129963y = 1;
                all = interfaceC31499c.getAll(cVar);
                if (all == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(all);
            }
            Iterable iterable = (Iterable) all;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m97071d((C31501e) it.next()));
            }
            return arrayList;
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Failed to fetch pending activity saves", e5, new AbstractC30556a.a[0]);
            return C25271y.f99162w;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C31503g(InterfaceC31499c interfaceC31499c, Clock clock, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            clock = Clock.systemUTC();
            AbstractC22676k.m65749i(clock, "systemUTC(...)");
        }
        this(interfaceC31499c, clock, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RoomPendingActivitySaveStore") : interfaceC34116n);
    }
}
