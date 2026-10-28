package x90;

import ad3.AbstractC0757c;
import android.database.sqlite.SQLiteException;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.json.C9602a;
import java.util.Iterator;
import java.util.UUID;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import l83.C23468n;
import p088dc.AbstractC11895b;
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
import u82.AbstractC34650k;

/* JADX INFO: renamed from: x90.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b \u0010!J,\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0096@¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0096@¢\u0006\u0004\b(\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+¨\u0006,"}, m65681d2 = {"Lx90/i;", "Lx90/f;", "Lx90/a;", "dao", "Ltr2/n;", "logger", "Lad3/c;", "json", "<init>", "(Lx90/a;Ltr2/n;Lad3/c;)V", "", "raw", "Lx90/g;", "g", "(Ljava/lang/String;)Lx90/g;", "Lcom/whoop/navigation/e;", "destination", "f", "(Lcom/whoop/navigation/e;)Ljava/lang/String;", "e", "(Ljava/lang/String;)Lcom/whoop/navigation/e;", "Lx90/d;", "b", "(Lq83/d;)Ljava/lang/Object;", "selectedActivityInternalName", "", "gpsTrackingEnabled", "resumeSessionDestination", "", "startTimeMs", "Ll83/n;", "Ll83/a0;", "a", "(Ljava/lang/String;ZLcom/whoop/navigation/e;JLq83/d;)Ljava/lang/Object;", "state", "", "Lcom/whoop/activitysession/PauseSegment;", "pauseSegments", "c", "(Lx90/g;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "d", "Lx90/a;", "Ltr2/n;", "Lad3/c;", "activity-session_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38103i implements InterfaceC38100f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC38095a dao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: x90.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.activitysession.RoomActivitySessionHandler", m100430f = "RoomActivitySessionHandler.kt", m100431l = {71}, m100432m = "clearSession-IoAF18A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f163173w;

        /* JADX INFO: renamed from: y */
        int f163175y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163173w = obj;
            this.f163175y |= Integer.MIN_VALUE;
            Object objMo122075d = C38103i.this.mo122075d(this);
            return objMo122075d == EnumC31071a.f128113w ? objMo122075d : new C23468n(objMo122075d);
        }
    }

    /* JADX INFO: renamed from: x90.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.activitysession.RoomActivitySessionHandler", m100430f = "RoomActivitySessionHandler.kt", m100431l = {37}, m100432m = "createSession-yxL6bBk", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f163176E;

        /* JADX INFO: renamed from: G */
        int f163178G;

        /* JADX INFO: renamed from: w */
        Object f163179w;

        /* JADX INFO: renamed from: x */
        Object f163180x;

        /* JADX INFO: renamed from: y */
        boolean f163181y;

        /* JADX INFO: renamed from: z */
        long f163182z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163176E = obj;
            this.f163178G |= Integer.MIN_VALUE;
            Object objMo122072a = C38103i.this.mo122072a(null, false, null, 0L, this);
            return objMo122072a == EnumC31071a.f128113w ? objMo122072a : new C23468n(objMo122072a);
        }
    }

    /* JADX INFO: renamed from: x90.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.activitysession.RoomActivitySessionHandler", m100430f = "RoomActivitySessionHandler.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "getActiveSession", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f163183w;

        /* JADX INFO: renamed from: y */
        int f163185y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163183w = obj;
            this.f163185y |= Integer.MIN_VALUE;
            return C38103i.this.mo122073b(this);
        }
    }

    /* JADX INFO: renamed from: x90.i$d */
    @InterfaceC32271e(m100429c = "com.whoop.activitysession.RoomActivitySessionHandler", m100430f = "RoomActivitySessionHandler.kt", m100431l = {57, 58}, m100432m = "updatePauseSegments-0E7RQCE", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f163187F;

        /* JADX INFO: renamed from: w */
        Object f163188w;

        /* JADX INFO: renamed from: x */
        Object f163189x;

        /* JADX INFO: renamed from: y */
        Object f163190y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f163191z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163191z = obj;
            this.f163187F |= Integer.MIN_VALUE;
            Object objMo122074c = C38103i.this.mo122074c(null, null, this);
            return objMo122074c == EnumC31071a.f128113w ? objMo122074c : new C23468n(objMo122074c);
        }
    }

    public C38103i(InterfaceC38095a dao, InterfaceC34116n logger, AbstractC0757c json) {
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(json, "json");
        this.dao = dao;
        this.logger = logger;
        this.json = json;
    }

    /* JADX INFO: renamed from: e */
    private final C9598e m122079e(String json) {
        try {
            return (C9598e) this.json.m1831b(new C9602a(null, null, 3, null), json);
        } catch (SerializationException e5) {
            this.logger.mo85230v("Failed to deserialize resume session destination", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private final String m122080f(C9598e destination) {
        try {
            return this.json.m1833d(new C9602a(null, null, 3, null), destination);
        } catch (SerializationException e5) {
            this.logger.mo85230v("Failed to serialize resume session destination", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private final EnumC38101g m122081g(String raw) {
        Object next;
        Iterator<E> it = EnumC38101g.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((EnumC38101g) next).name(), raw));
        EnumC38101g enumC38101g = (EnumC38101g) next;
        if (enumC38101g == null) {
            this.logger.mo85222m(AbstractC11895b.m31996o("Unknown activity session state '", raw, "', defaulting to ACTIVE"), new AbstractC30556a.a[0]);
        }
        return enumC38101g == null ? EnumC38101g.ACTIVE : enumC38101g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // x90.InterfaceC38100f
    /* JADX INFO: renamed from: a */
    public Object mo122072a(String str, boolean z4, C9598e c9598e, long j7, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f163178G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f163178G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f163176E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f163178G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC38095a interfaceC38095a = this.dao;
                String string = UUID.randomUUID().toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                C38097c c38097c = new C38097c(0, string, "ACTIVE", str, z4, j7, c9598e != null ? m122080f(c9598e) : null, null, 129, null);
                bVar.f163179w = null;
                bVar.f163180x = null;
                bVar.f163181y = z4;
                bVar.f163182z = j7;
                bVar.f163178G = 1;
                if (interfaceC38095a.mo122045b(c38097c, bVar) == enumC31071a) {
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
            this.logger.mo85230v("Failed to create activity session", e5, new AbstractC30556a.a[0]);
            return AbstractC34132o.m107888l(e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x90.InterfaceC38100f
    /* JADX INFO: renamed from: b */
    public Object mo122073b(InterfaceC30057d<? super C38098d> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f163185y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f163185y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo122044a = cVar.f163183w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f163185y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo122044a);
            InterfaceC38095a interfaceC38095a = this.dao;
            cVar.f163185y = 1;
            objMo122044a = interfaceC38095a.mo122044a(cVar);
            if (objMo122044a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo122044a);
        }
        C38097c c38097c = (C38097c) objMo122044a;
        if (c38097c == null) {
            return null;
        }
        String selectedActivityInternalName = c38097c.getSelectedActivityInternalName();
        boolean gpsTrackingEnabled = c38097c.getGpsTrackingEnabled();
        String resumeNavigationJson = c38097c.getResumeNavigationJson();
        return new C38098d(selectedActivityInternalName, gpsTrackingEnabled, resumeNavigationJson != null ? m122079e(resumeNavigationJson) : null, m122081g(c38097c.getState()), c38097c.getStartTimeMs(), c38097c.m122060f());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r0.mo122045b(r4, r2) == r3) goto L33;
     */
    @Override // x90.InterfaceC38100f
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo122074c(x90.EnumC38101g r19, java.util.List<com.whoop.activitysession.PauseSegment> r20, q83.InterfaceC30057d<? super l83.C23468n> r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            boolean r2 = r0 instanceof x90.C38103i.d
            if (r2 == 0) goto L17
            r2 = r0
            x90.i$d r2 = (x90.C38103i.d) r2
            int r3 = r2.f163187F
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f163187F = r3
            goto L1c
        L17:
            x90.i$d r2 = new x90.i$d
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f163191z
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r2.f163187F
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L52
            if (r4 == r6) goto L44
            if (r4 != r5) goto L3c
            java.lang.Object r3 = r2.f163190y
            x90.c r3 = (x90.C38097c) r3
            java.lang.Object r3 = r2.f163189x
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r2.f163188w
            x90.g r2 = (x90.EnumC38101g) r2
            p505ts.AbstractC34132o.m107864I(r0)     // Catch: android.database.sqlite.SQLiteException -> L3a
            goto L9f
        L3a:
            r0 = move-exception
            goto La2
        L3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L44:
            java.lang.Object r4 = r2.f163189x
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r6 = r2.f163188w
            x90.g r6 = (x90.EnumC38101g) r6
            p505ts.AbstractC34132o.m107864I(r0)     // Catch: android.database.sqlite.SQLiteException -> L3a
            r15 = r4
            r4 = r6
            goto L69
        L52:
            p505ts.AbstractC34132o.m107864I(r0)
            x90.a r0 = r1.dao     // Catch: android.database.sqlite.SQLiteException -> L3a
            r4 = r19
            r2.f163188w = r4     // Catch: android.database.sqlite.SQLiteException -> L3a
            r7 = r20
            r2.f163189x = r7     // Catch: android.database.sqlite.SQLiteException -> L3a
            r2.f163187F = r6     // Catch: android.database.sqlite.SQLiteException -> L3a
            java.lang.Object r0 = r0.mo122044a(r2)     // Catch: android.database.sqlite.SQLiteException -> L3a
            if (r0 != r3) goto L68
            goto L9e
        L68:
            r15 = r7
        L69:
            r6 = r0
            x90.c r6 = (x90.C38097c) r6     // Catch: android.database.sqlite.SQLiteException -> L3a
            if (r6 != 0) goto L7a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: android.database.sqlite.SQLiteException -> L3a
            java.lang.String r2 = "No active session to update"
            r0.<init>(r2)     // Catch: android.database.sqlite.SQLiteException -> L3a
            l83.m r0 = p505ts.AbstractC34132o.m107888l(r0)     // Catch: android.database.sqlite.SQLiteException -> L3a
            return r0
        L7a:
            x90.a r0 = r1.dao     // Catch: android.database.sqlite.SQLiteException -> L3a
            java.lang.String r9 = r4.name()     // Catch: android.database.sqlite.SQLiteException -> L3a
            r16 = 123(0x7b, float:1.72E-43)
            r17 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            x90.c r4 = x90.C38097c.m122055b(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)     // Catch: android.database.sqlite.SQLiteException -> L3a
            r6 = 0
            r2.f163188w = r6     // Catch: android.database.sqlite.SQLiteException -> L3a
            r2.f163189x = r6     // Catch: android.database.sqlite.SQLiteException -> L3a
            r2.f163190y = r6     // Catch: android.database.sqlite.SQLiteException -> L3a
            r2.f163187F = r5     // Catch: android.database.sqlite.SQLiteException -> L3a
            java.lang.Object r0 = r0.mo122045b(r4, r2)     // Catch: android.database.sqlite.SQLiteException -> L3a
            if (r0 != r3) goto L9f
        L9e:
            return r3
        L9f:
            l83.a0 r0 = l83.C23454a0.f92919a     // Catch: android.database.sqlite.SQLiteException -> L3a
            return r0
        La2:
            tr2.n r2 = r1.logger
            r3 = 0
            qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r3]
            java.lang.String r4 = "Failed to update activity session pause segments"
            r2.mo85230v(r4, r0, r3)
            l83.m r0 = p505ts.AbstractC34132o.m107888l(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x90.C38103i.mo122074c(x90.g, java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x90.InterfaceC38100f
    /* JADX INFO: renamed from: d */
    public Object mo122075d(InterfaceC30057d<? super C23468n> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f163175y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f163175y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f163173w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f163175y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC38095a interfaceC38095a = this.dao;
                aVar.f163175y = 1;
                if (interfaceC38095a.deleteAll(aVar) == enumC31071a) {
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
            this.logger.mo85230v("Failed to clear activity session", e5, new AbstractC30556a.a[0]);
            return AbstractC34132o.m107888l(e5);
        }
    }

    public /* synthetic */ C38103i(InterfaceC38095a interfaceC38095a, InterfaceC34116n interfaceC34116n, AbstractC0757c abstractC0757c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC38095a, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RoomActivitySessionHandler") : interfaceC34116n, (i13 & 4) != 0 ? AbstractC34650k.m109496c() : abstractC0757c);
    }
}
