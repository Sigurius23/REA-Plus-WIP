package uj0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C3022j0;
import bc3.C3075y1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.ble.api.pair.PairFailure;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ft0.InterfaceC14765a;
import ft0.InterfaceC14766b;
import ft0.InterfaceC14767c;
import ik0.C18602c;
import ik0.InterfaceC18603d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import mj0.C25615d;
import mj0.C25616e;
import mj0.EnumC25613b;
import mj0.InterfaceC25612a;
import mj0.InterfaceC25614c;
import nj0.InterfaceC26750f;
import oj0.InterfaceC27978a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qj0.AbstractC30426h;
import qj0.AbstractC30427i;
import qj0.InterfaceC30421c;
import qj0.InterfaceC30422d;
import qj0.InterfaceC30423e;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: uj0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001JBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010 \u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J.\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b&\u0010'J(\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020(H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020*2\u0006\u00105\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020*H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010=\u001a\u00020*2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020*H\u0002¢\u0006\u0004\b?\u00109J\u000f\u0010@\u001a\u00020*H\u0002¢\u0006\u0004\b@\u00109J#\u0010D\u001a\b\u0012\u0004\u0012\u00020\"0C2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0016¢\u0006\u0004\bD\u0010EJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020%0\u00172\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\bH\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010OR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR0\u0010\\\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0Xj\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e`Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0:0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R&\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0:0a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bJ\u0010dR\u001c\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010f0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010_R\"\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010f0a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010c\u001a\u0004\bM\u0010d¨\u0006k"}, m65681d2 = {"Luj0/a;", "Lft0/c;", "Lik0/d;", "registry", "Loj0/a;", "scanner", "Lqj0/e;", "sessionFactory", "Lbc3/c0;", "scope", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "Lkotlin/Function0;", "Lbc3/z;", "deviceDispatcherFactory", "<init>", "(Lik0/d;Loj0/a;Lqj0/e;Lbc3/c0;Ljava/time/Clock;Ltr2/n;Lc93/a;)V", "Lmj0/d;", "deviceId", "Lnj0/f;", "protocol", "Ll83/n;", "Luj0/a$b;", "r", "(Ljava/lang/String;Lnj0/f;Lq83/d;)Ljava/lang/Object;", "Lbc3/i0;", "Lqj0/c;", "attempt", "Lqj0/h;", "handle", "q", "(Lbc3/i0;Lqj0/h;Lq83/d;)Ljava/lang/Object;", "Lmj0/e;", "candidate", "outcome", "Lft0/b;", "A", "(Lqj0/h;Lmj0/e;Lqj0/c;Lq83/d;)Ljava/lang/Object;", "", "serial", "Ll83/a0;", "s", "(Lqj0/h;Lmj0/e;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "message", "Lcom/whoop/ble/api/pair/PairFailure;", "B", "(Ljava/lang/String;)Lcom/whoop/ble/api/pair/PairFailure;", "z", "(Lqj0/h;)V", "t", "(Ljava/lang/String;)V", "newSensorId", "y", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "u", "()V", "", "Lik0/c;", "records", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/util/List;)V", "v", "x", "", "filter", "Lec3/l;", "a", "(Ljava/util/Set;)Lec3/l;", "e", "(Lmj0/e;Lq83/d;)Ljava/lang/Object;", "c", "Lik0/d;", "b", "Loj0/a;", "Lqj0/e;", "d", "Lbc3/c0;", "Ljava/time/Clock;", "f", "Ltr2/n;", "g", "Lc93/a;", "Lmc3/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lmc3/a;", "mutex", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "i", "Ljava/util/LinkedHashMap;", "handles", "Lec3/p1;", "j", "Lec3/p1;", "_pairedDevices", "Lec3/f2;", "k", "Lec3/f2;", "()Lec3/f2;", "pairedDevices", "Lft0/a;", "l", "_primarySensor", "m", "primarySensor", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35036a implements InterfaceC14767c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC18603d registry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC27978a scanner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30423e sessionFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC4339a deviceDispatcherFactory;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final LinkedHashMap<C25615d, AbstractC30426h> handles;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC13075p1 _pairedDevices;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC13037f2 pairedDevices;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC13075p1 _primarySensor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC13037f2 primarySensor;

    /* JADX INFO: renamed from: uj0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final a f148383w = new a();

        public a() {
            super(0, AbstractC30427i.class, "defaultDeviceDispatcher", "defaultDeviceDispatcher()Lkotlinx/coroutines/CoroutineDispatcher;", 1);
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC3076z invoke() {
            return AbstractC30427i.m93040b();
        }
    }

    /* JADX INFO: renamed from: uj0.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Luj0/a$b;", "", "Lqj0/h;", "handle", "Lqj0/d;", "session", "<init>", "(Lqj0/h;Lqj0/d;)V", "a", "()Lqj0/h;", "b", "()Lqj0/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lqj0/h;", "getHandle", "Lqj0/d;", "getSession", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC30426h handle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC30422d session;

        public b(AbstractC30426h handle, InterfaceC30422d session) {
            AbstractC22676k.m65750j(handle, "handle");
            AbstractC22676k.m65750j(session, "session");
            this.handle = handle;
            this.session = session;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC30426h getHandle() {
            return this.handle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC30422d getSession() {
            return this.session;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.handle, bVar.handle) && AbstractC22676k.m65745e(this.session, bVar.session);
        }

        public int hashCode() {
            return this.session.hashCode() + (this.handle.hashCode() * 31);
        }

        public String toString() {
            return "Pairing(handle=" + this.handle + ", session=" + this.session + ")";
        }
    }

    /* JADX INFO: renamed from: uj0.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {148}, m100432m = "awaitOutcome", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148386E;

        /* JADX INFO: renamed from: w */
        Object f148387w;

        /* JADX INFO: renamed from: x */
        Object f148388x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f148389y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148389y = obj;
            this.f148386E |= Integer.MIN_VALUE;
            return C35036a.this.m110728q(null, null, this);
        }
    }

    /* JADX INFO: renamed from: uj0.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {314}, m100432m = "beginPairing-_kSD9aE", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f148391E;

        /* JADX INFO: renamed from: G */
        int f148393G;

        /* JADX INFO: renamed from: w */
        Object f148394w;

        /* JADX INFO: renamed from: x */
        Object f148395x;

        /* JADX INFO: renamed from: y */
        Object f148396y;

        /* JADX INFO: renamed from: z */
        int f148397z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148391E = obj;
            this.f148393G |= Integer.MIN_VALUE;
            Object objM110729r = C35036a.this.m110729r(null, null, this);
            return objM110729r == EnumC31071a.f128113w ? objM110729r : new C23468n(objM110729r);
        }
    }

    /* JADX INFO: renamed from: uj0.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {184, 196, 197}, m100432m = "commit", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f148398E;

        /* JADX INFO: renamed from: G */
        int f148400G;

        /* JADX INFO: renamed from: w */
        Object f148401w;

        /* JADX INFO: renamed from: x */
        Object f148402x;

        /* JADX INFO: renamed from: y */
        Object f148403y;

        /* JADX INFO: renamed from: z */
        long f148404z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148398E = obj;
            this.f148400G |= Integer.MIN_VALUE;
            return C35036a.this.m110730s(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: uj0.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl$observeRegistry$1", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {246}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148405w;

        /* JADX INFO: renamed from: uj0.a$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C35036a f148407w;

            /* JADX INFO: renamed from: uj0.a$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl$observeRegistry$1$1", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {314}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42483a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                /* synthetic */ Object f148408E;

                /* JADX INFO: renamed from: F */
                final /* synthetic */ a<T> f148409F;

                /* JADX INFO: renamed from: G */
                int f148410G;

                /* JADX INFO: renamed from: w */
                Object f148411w;

                /* JADX INFO: renamed from: x */
                Object f148412x;

                /* JADX INFO: renamed from: y */
                Object f148413y;

                /* JADX INFO: renamed from: z */
                int f148414z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42483a(a<? super T> aVar, InterfaceC30057d<? super C42483a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f148409F = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f148408E = obj;
                    this.f148410G |= Integer.MIN_VALUE;
                    return this.f148409F.emit(null, this);
                }
            }

            public a(C35036a c35036a) {
                this.f148407w = c35036a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<C18602c> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C42483a c42483a;
                List<C18602c> list2;
                InterfaceC25435a interfaceC25435a;
                C35036a c35036a;
                if (interfaceC30057d instanceof C42483a) {
                    c42483a = (C42483a) interfaceC30057d;
                    int i13 = c42483a.f148410G;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42483a.f148410G = i13 - Integer.MIN_VALUE;
                    } else {
                        c42483a = new C42483a(this, interfaceC30057d);
                    }
                } else {
                    c42483a = new C42483a(this, interfaceC30057d);
                }
                Object obj = c42483a.f148408E;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42483a.f148410G;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC25435a interfaceC25435a2 = this.f148407w.mutex;
                    C35036a c35036a2 = this.f148407w;
                    c42483a.f148411w = list;
                    c42483a.f148412x = interfaceC25435a2;
                    c42483a.f148413y = c35036a2;
                    c42483a.f148414z = 0;
                    c42483a.f148410G = 1;
                    if (interfaceC25435a2.mo68211b(c42483a) == enumC31071a) {
                        return enumC31071a;
                    }
                    list2 = list;
                    interfaceC25435a = interfaceC25435a2;
                    c35036a = c35036a2;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c35036a = (C35036a) c42483a.f148413y;
                    interfaceC25435a = (InterfaceC25435a) c42483a.f148412x;
                    list2 = (List) c42483a.f148411w;
                    AbstractC34132o.m107864I(obj);
                }
                try {
                    c35036a.m110734w(list2);
                    return C23454a0.f92919a;
                } finally {
                    interfaceC25435a.mo68214i(null);
                }
            }
        }

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35036a.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148405w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 records = C35036a.this.registry.getRecords();
                a aVar = new a(C35036a.this);
                this.f148405w = 1;
                if (records.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uj0.a$g */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl$observeRegistry$2", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {253}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148415w;

        /* JADX INFO: renamed from: uj0.a$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C35036a f148417w;

            /* JADX INFO: renamed from: uj0.a$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl$observeRegistry$2$1", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {314}, m100432m = "emit-5gQNZ-0", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42484a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                /* synthetic */ Object f148418E;

                /* JADX INFO: renamed from: F */
                final /* synthetic */ a<T> f148419F;

                /* JADX INFO: renamed from: G */
                int f148420G;

                /* JADX INFO: renamed from: w */
                Object f148421w;

                /* JADX INFO: renamed from: x */
                Object f148422x;

                /* JADX INFO: renamed from: y */
                Object f148423y;

                /* JADX INFO: renamed from: z */
                int f148424z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42484a(a<? super T> aVar, InterfaceC30057d<? super C42484a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f148419F = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f148418E = obj;
                    this.f148420G |= Integer.MIN_VALUE;
                    return this.f148419F.m110742b(null, this);
                }
            }

            public a(C35036a c35036a) {
                this.f148417w = c35036a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX INFO: renamed from: b */
            public final Object m110742b(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C42484a c42484a;
                InterfaceC25435a interfaceC25435a;
                C35036a c35036a;
                if (interfaceC30057d instanceof C42484a) {
                    c42484a = (C42484a) interfaceC30057d;
                    int i13 = c42484a.f148420G;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42484a.f148420G = i13 - Integer.MIN_VALUE;
                    } else {
                        c42484a = new C42484a(this, interfaceC30057d);
                    }
                } else {
                    c42484a = new C42484a(this, interfaceC30057d);
                }
                Object obj = c42484a.f148418E;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42484a.f148420G;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a = this.f148417w.mutex;
                    C35036a c35036a2 = this.f148417w;
                    c42484a.f148421w = null;
                    c42484a.f148422x = interfaceC25435a;
                    c42484a.f148423y = c35036a2;
                    c42484a.f148424z = 0;
                    c42484a.f148420G = 1;
                    if (interfaceC25435a.mo68211b(c42484a) == enumC31071a) {
                        return enumC31071a;
                    }
                    c35036a = c35036a2;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c35036a = (C35036a) c42484a.f148423y;
                    interfaceC25435a = (InterfaceC25435a) c42484a.f148422x;
                    AbstractC34132o.m107864I(obj);
                }
                try {
                    c35036a.m110735x();
                    return C23454a0.f92919a;
                } finally {
                    interfaceC25435a.mo68214i(null);
                }
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C25615d c25615d = (C25615d) obj;
                return m110742b(c25615d != null ? c25615d.getValue() : null, interfaceC30057d);
            }
        }

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35036a.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148415w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 primaryDeviceId = C35036a.this.registry.getPrimaryDeviceId();
                a aVar = new a(C35036a.this);
                this.f148415w = 1;
                if (primaryDeviceId.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uj0.a$h */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {85, 92, 315, 93, 96}, m100432m = "pair-gIAlu-s", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f148425E;

        /* JADX INFO: renamed from: F */
        Object f148426F;

        /* JADX INFO: renamed from: G */
        Object f148427G;

        /* JADX INFO: renamed from: H */
        int f148428H;

        /* JADX INFO: renamed from: I */
        int f148429I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f148430J;

        /* JADX INFO: renamed from: L */
        int f148432L;

        /* JADX INFO: renamed from: w */
        Object f148433w;

        /* JADX INFO: renamed from: x */
        Object f148434x;

        /* JADX INFO: renamed from: y */
        Object f148435y;

        /* JADX INFO: renamed from: z */
        Object f148436z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f148430J = obj;
            this.f148432L |= Integer.MIN_VALUE;
            Object objMo42335e = C35036a.this.mo42335e(null, this);
            return objMo42335e == EnumC31071a.f128113w ? objMo42335e : new C23468n(objMo42335e);
        }
    }

    /* JADX INFO: renamed from: uj0.a$i */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl$pair$4", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {97, 314}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f148437E;

        /* JADX INFO: renamed from: F */
        int f148438F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC3018i0 f148439G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C35036a f148440H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f148441I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ AbstractC30426h f148442J;

        /* JADX INFO: renamed from: w */
        Object f148443w;

        /* JADX INFO: renamed from: x */
        Object f148444x;

        /* JADX INFO: renamed from: y */
        Object f148445y;

        /* JADX INFO: renamed from: z */
        Object f148446z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC3018i0 interfaceC3018i0, C35036a c35036a, String str, AbstractC30426h abstractC30426h, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148439G = interfaceC3018i0;
            this.f148440H = c35036a;
            this.f148441I = str;
            this.f148442J = abstractC30426h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f148439G, this.f148440H, this.f148441I, this.f148442J, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC25435a interfaceC25435a;
            String str;
            C35036a c35036a;
            AbstractC30426h abstractC30426h;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148438F;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC3018i0 interfaceC3018i0 = this.f148439G;
                this.f148438F = 1;
                if (AbstractC3006f0.m8716j(interfaceC3018i0, this) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC30426h = (AbstractC30426h) this.f148446z;
                str = (String) this.f148445y;
                c35036a = (C35036a) this.f148444x;
                interfaceC25435a = (InterfaceC25435a) this.f148443w;
                AbstractC34132o.m107864I(obj);
            }
            try {
                if (c35036a.handles.get(C25615d.m75336a(str)) == abstractC30426h && abstractC30426h.getIsPairing()) {
                    abstractC30426h.m93036f(false);
                    c35036a.m110737z(abstractC30426h);
                }
                return C23454a0.f92919a;
            } finally {
                interfaceC25435a.mo68214i(null);
            }
            interfaceC25435a = this.f148440H.mutex;
            C35036a c35036a2 = this.f148440H;
            str = this.f148441I;
            AbstractC30426h abstractC30426h2 = this.f148442J;
            this.f148443w = interfaceC25435a;
            this.f148444x = c35036a2;
            this.f148445y = str;
            this.f148446z = abstractC30426h2;
            this.f148437E = 0;
            this.f148438F = 2;
            if (interfaceC25435a.mo68211b(this) != enumC31071a) {
                c35036a = c35036a2;
                abstractC30426h = abstractC30426h2;
                if (c35036a.handles.get(C25615d.m75336a(str)) == abstractC30426h) {
                    abstractC30426h.m93036f(false);
                    c35036a.m110737z(abstractC30426h);
                }
                return C23454a0.f92919a;
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: uj0.a$j */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl$pair$attempt$1", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lqj0/c;", "<anonymous>", "(Lbc3/c0;)Lqj0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148447w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC30422d f148448x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC30422d interfaceC30422d, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148448x = interfaceC30422d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f148448x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC30421c> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148447w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC30422d interfaceC30422d = this.f148448x;
            this.f148447w = 1;
            Object objMo93006g = interfaceC30422d.mo93006g(true, this);
            return objMo93006g == enumC31071a ? enumC31071a : objMo93006g;
        }
    }

    /* JADX INFO: renamed from: uj0.a$k */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {240}, m100432m = "replaceExistingSensor-cjISt7w", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f148449E;

        /* JADX INFO: renamed from: F */
        int f148450F;

        /* JADX INFO: renamed from: G */
        int f148451G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f148452H;

        /* JADX INFO: renamed from: J */
        int f148454J;

        /* JADX INFO: renamed from: w */
        Object f148455w;

        /* JADX INFO: renamed from: x */
        Object f148456x;

        /* JADX INFO: renamed from: y */
        Object f148457y;

        /* JADX INFO: renamed from: z */
        Object f148458z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148452H = obj;
            this.f148454J |= Integer.MIN_VALUE;
            return C35036a.this.m110736y(null, this);
        }
    }

    /* JADX INFO: renamed from: uj0.a$l */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {171}, m100432m = "settle-BWLJW6A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f148460F;

        /* JADX INFO: renamed from: w */
        Object f148461w;

        /* JADX INFO: renamed from: x */
        Object f148462x;

        /* JADX INFO: renamed from: y */
        Object f148463y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f148464z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148464z = obj;
            this.f148460F |= Integer.MIN_VALUE;
            Object objM110715A = C35036a.this.m110715A(null, null, null, this);
            return objM110715A == EnumC31071a.f128113w ? objM110715A : new C23468n(objM110715A);
        }
    }

    /* JADX INFO: renamed from: uj0.a$m */
    @InterfaceC32271e(m100429c = "com.whoop.ble.manager.WhoopDeviceManagerImpl", m100430f = "WhoopDeviceManagerImpl.kt", m100431l = {314, 219}, m100432m = "unpair-cjISt7w", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f148465E;

        /* JADX INFO: renamed from: G */
        int f148467G;

        /* JADX INFO: renamed from: w */
        Object f148468w;

        /* JADX INFO: renamed from: x */
        Object f148469x;

        /* JADX INFO: renamed from: y */
        int f148470y;

        /* JADX INFO: renamed from: z */
        int f148471z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148465E = obj;
            this.f148467G |= Integer.MIN_VALUE;
            return C35036a.this.mo42333c(null, this);
        }
    }

    public C35036a(InterfaceC18603d registry, InterfaceC27978a scanner, InterfaceC30423e sessionFactory, InterfaceC2994c0 scope, Clock clock, InterfaceC34116n logger, InterfaceC4339a deviceDispatcherFactory) {
        AbstractC22676k.m65750j(registry, "registry");
        AbstractC22676k.m65750j(scanner, "scanner");
        AbstractC22676k.m65750j(sessionFactory, "sessionFactory");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(deviceDispatcherFactory, "deviceDispatcherFactory");
        this.registry = registry;
        this.scanner = scanner;
        this.sessionFactory = sessionFactory;
        this.scope = scope;
        this.clock = clock;
        this.logger = logger;
        this.deviceDispatcherFactory = deviceDispatcherFactory;
        this.mutex = AbstractC25438d.m74669a();
        this.handles = new LinkedHashMap<>();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25271y.f99162w);
        this._pairedDevices = c13045h2M36593c;
        this.pairedDevices = AbstractC13091v.m36598h(c13045h2M36593c);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this._primarySensor = c13045h2M36593c2;
        this.primarySensor = AbstractC13091v.m36598h(c13045h2M36593c2);
        m110732u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m110715A(AbstractC30426h abstractC30426h, C25616e c25616e, InterfaceC30421c interfaceC30421c, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        l lVar;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f148460F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f148460F = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object obj = lVar.f148464z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = lVar.f148460F;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC30426h abstractC30426h2 = (AbstractC30426h) lVar.f148461w;
            AbstractC34132o.m107864I(obj);
            return abstractC30426h2;
        }
        AbstractC34132o.m107864I(obj);
        abstractC30426h.m93036f(false);
        if (this.handles.get(C25615d.m75336a(abstractC30426h.getId())) != abstractC30426h) {
            this.logger.mo85216g(AbstractC11895b.m31996o("pair: ", abstractC30426h.getId(), " was unpaired mid-pair, discarding the outcome"), new AbstractC30556a.a[0]);
            return AbstractC34132o.m107888l(m110716B(AbstractC2875y.m8299l(abstractC30426h.getId(), " was unpaired while pairing")));
        }
        if (!(interfaceC30421c instanceof InterfaceC30421c.a)) {
            if (!(interfaceC30421c instanceof InterfaceC30421c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m110737z(abstractC30426h);
            InterfaceC30421c.b bVar = (InterfaceC30421c.b) interfaceC30421c;
            return AbstractC34132o.m107888l(new PairFailure(bVar.getPhase(), bVar.getCause()));
        }
        String serial = ((InterfaceC30421c.a) interfaceC30421c).getHello().getSerial();
        lVar.f148461w = abstractC30426h;
        lVar.f148462x = null;
        lVar.f148463y = null;
        lVar.f148460F = 1;
        return m110730s(abstractC30426h, c25616e, serial, lVar) == obj2 ? obj2 : abstractC30426h;
    }

    /* JADX INFO: renamed from: B */
    private final PairFailure m110716B(String message) {
        return new PairFailure(EnumC25613b.Linking, new InterfaceC25612a.i(new IllegalStateException(message)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m110728q(InterfaceC3018i0 interfaceC3018i0, AbstractC30426h abstractC30426h, InterfaceC30057d<? super InterfaceC30421c> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f148386E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f148386E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objAwait = cVar.f148389y;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f148386E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objAwait);
                cVar.f148387w = null;
                cVar.f148388x = abstractC30426h;
                cVar.f148386E = 1;
                objAwait = interfaceC3018i0.await(cVar);
                if (objAwait == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC30426h = (AbstractC30426h) cVar.f148388x;
                AbstractC34132o.m107864I(objAwait);
            }
            return (InterfaceC30421c) objAwait;
        } catch (CancellationException e5) {
            AbstractC3006f0.m8721o(cVar.getContext());
            return new InterfaceC30421c.b(EnumC25613b.Linking, new InterfaceC25612a.i(e5));
        } catch (Exception e13) {
            AbstractC3006f0.m8721o(cVar.getContext());
            this.logger.mo85230v(AbstractC11266d.m30461o("Connect threw while pairing ", abstractC30426h.getId()), e13, new AbstractC30556a.a[0]);
            return new InterfaceC30421c.b(EnumC25613b.Linking, new InterfaceC25612a.i(e13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: r */
    public final Object m110729r(String str, InterfaceC26750f interfaceC26750f, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        d dVar;
        InterfaceC25435a interfaceC25435a;
        Object bVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f148393G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f148393G = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f148391E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f148393G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            dVar.f148394w = str;
            dVar.f148395x = interfaceC26750f;
            dVar.f148396y = interfaceC25435a;
            dVar.f148397z = 0;
            dVar.f148393G = 1;
            if (interfaceC25435a.mo68211b(dVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) dVar.f148396y;
            interfaceC26750f = (InterfaceC26750f) dVar.f148395x;
            String str2 = (String) dVar.f148394w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            AbstractC30426h abstractC30426h = this.handles.get(C25615d.m75336a(str));
            if (abstractC30426h == null || !abstractC30426h.getIsPairing()) {
                AbstractC30426h abstractC30426hM93039a = abstractC30426h == null ? AbstractC30427i.m93039a(str, interfaceC26750f, InterfaceC25614c.b.f100488a, (AbstractC3076z) this.deviceDispatcherFactory.invoke()) : abstractC30426h;
                InterfaceC30422d session = abstractC30426hM93039a.getSession();
                if (session != null) {
                    this.handles.put(C25615d.m75336a(str), abstractC30426hM93039a);
                    abstractC30426hM93039a.m93036f(true);
                    m110733v();
                    bVar = new b(abstractC30426hM93039a, session);
                } else {
                    session = this.sessionFactory.mo92987a(abstractC30426hM93039a);
                    if (session == null) {
                        if (abstractC30426h == null) {
                            abstractC30426hM93039a.m93032b();
                        }
                        bVar = AbstractC34132o.m107888l(m110716B("No transport for " + str));
                    } else {
                        abstractC30426hM93039a.m93037g(session);
                        this.handles.put(C25615d.m75336a(str), abstractC30426hM93039a);
                        abstractC30426hM93039a.m93036f(true);
                        m110733v();
                        bVar = new b(abstractC30426hM93039a, session);
                    }
                }
            } else {
                bVar = AbstractC34132o.m107888l(m110716B(str + " is already pairing"));
            }
            return bVar;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: s */
    public final Object m110730s(AbstractC30426h abstractC30426h, C25616e c25616e, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e eVar;
        long jMillis;
        String str2;
        AbstractC30426h abstractC30426h2;
        long j7;
        String id4;
        AbstractC30426h abstractC30426h3;
        String str3;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f148400G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f148400G = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f148398E;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = eVar.f148400G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            jMillis = this.clock.millis();
            InterfaceC18603d interfaceC18603d = this.registry;
            str2 = str;
            C18602c c18602c = new C18602c(abstractC30426h.getId(), str2, c25616e.getAdvertisingName(), c25616e.getProtocol().mo79621c(), jMillis, jMillis, null, 64, null);
            abstractC30426h2 = abstractC30426h;
            eVar.f148401w = abstractC30426h2;
            eVar.f148402x = null;
            eVar.f148403y = str2;
            eVar.f148404z = jMillis;
            eVar.f148400G = 1;
            if (interfaceC18603d.mo53817a(c18602c, eVar) != obj2) {
            }
            return obj2;
        }
        if (i14 == 1) {
            long j13 = eVar.f148404z;
            String str4 = (String) eVar.f148403y;
            AbstractC30426h abstractC30426h4 = (AbstractC30426h) eVar.f148401w;
            AbstractC34132o.m107864I(obj);
            str2 = str4;
            abstractC30426h2 = abstractC30426h4;
            jMillis = j13;
        } else {
            if (i14 == 2) {
                j7 = eVar.f148404z;
                String str5 = (String) eVar.f148403y;
                AbstractC30426h abstractC30426h5 = (AbstractC30426h) eVar.f148401w;
                AbstractC34132o.m107864I(obj);
                str2 = str5;
                abstractC30426h2 = abstractC30426h5;
                id4 = abstractC30426h2.getId();
                eVar.f148401w = abstractC30426h2;
                eVar.f148402x = null;
                eVar.f148403y = str2;
                eVar.f148404z = j7;
                eVar.f148400G = 3;
                if (m110736y(id4, eVar) != obj2) {
                    abstractC30426h3 = abstractC30426h2;
                    str3 = str2;
                }
                return obj2;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) eVar.f148403y;
            abstractC30426h3 = (AbstractC30426h) eVar.f148401w;
            AbstractC34132o.m107864I(obj);
        }
        abstractC30426h2 = abstractC30426h3;
        str2 = str3;
        m110733v();
        m110735x();
        this.logger.mo85216g(AbstractC2875y.m8300m("pair: committed ", abstractC30426h2.getId(), " (serial ", str2, ")"), new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
        abstractC30426h2.m93038h(InterfaceC25614c.c.f100489a);
        if (abstractC30426h2 instanceof InterfaceC14765a) {
            InterfaceC18603d interfaceC18603d2 = this.registry;
            String id5 = abstractC30426h2.getId();
            eVar.f148401w = abstractC30426h2;
            eVar.f148402x = null;
            eVar.f148403y = str2;
            eVar.f148404z = jMillis;
            eVar.f148400G = 2;
            if (interfaceC18603d2.mo53819c(id5, eVar) != obj2) {
                j7 = jMillis;
                id4 = abstractC30426h2.getId();
                eVar.f148401w = abstractC30426h2;
                eVar.f148402x = null;
                eVar.f148403y = str2;
                eVar.f148404z = j7;
                eVar.f148400G = 3;
                if (m110736y(id4, eVar) != obj2) {
                    abstractC30426h3 = abstractC30426h2;
                    str3 = str2;
                    abstractC30426h2 = abstractC30426h3;
                    str2 = str3;
                }
            }
            return obj2;
        }
        m110733v();
        m110735x();
        this.logger.mo85216g(AbstractC2875y.m8300m("pair: committed ", abstractC30426h2.getId(), " (serial ", str2, ")"), new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private final void m110731t(String deviceId) {
        AbstractC30426h abstractC30426hRemove = this.handles.remove(C25615d.m75336a(deviceId));
        if (abstractC30426hRemove != null) {
            abstractC30426hRemove.m93032b();
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m110732u() {
        AbstractC3006f0.m8732z(this.scope, null, null, new f(null), 3);
        AbstractC3006f0.m8732z(this.scope, null, null, new g(null), 3);
    }

    /* JADX INFO: renamed from: v */
    private final void m110733v() {
        InterfaceC13075p1 interfaceC13075p1 = this._pairedDevices;
        Collection<AbstractC30426h> collectionValues = this.handles.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        List listM74093D1 = AbstractC25265s.m74093D1(collectionValues);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, listM74093D1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m110734w(List<C18602c> records) {
        List<C18602c> list = records;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C25615d.m75336a(((C18602c) it.next()).getDeviceId()));
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        Set<C25615d> setKeySet = this.handles.keySet();
        AbstractC22676k.m65749i(setKeySet, "<get-keys>(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            String value = ((C25615d) obj).getValue();
            if (!setM74103I1.contains(C25615d.m75336a(value))) {
                if (!((AbstractC30426h) AbstractC25247g0.m73986U(C25615d.m75336a(value), this.handles)).getIsPairing()) {
                    arrayList2.add(obj);
                }
            }
        }
        Iterator it3 = AbstractC25265s.m74093D1(arrayList2).iterator();
        while (it3.hasNext()) {
            String value2 = ((C25615d) it3.next()).getValue();
            AbstractC22676k.m65747g(C25615d.m75336a(value2));
            m110731t(value2);
        }
        for (C18602c c18602c : records) {
            if (!this.handles.containsKey(C25615d.m75336a(c18602c.getDeviceId()))) {
                InterfaceC26750f interfaceC26750fM79623a = InterfaceC26750f.INSTANCE.m79623a(c18602c.getServiceId());
                if (interfaceC26750fM79623a == null) {
                    this.logger.mo85226q("Skipping paired record " + C25615d.m75341f(c18602c.getDeviceId()) + ": unknown serviceId " + c18602c.getServiceId(), new AbstractC30556a.a[0]);
                } else {
                    this.handles.put(C25615d.m75336a(c18602c.getDeviceId()), AbstractC30427i.m93039a(c18602c.getDeviceId(), interfaceC26750fM79623a, InterfaceC25614c.b.f100488a, (AbstractC3076z) this.deviceDispatcherFactory.invoke()));
                }
            }
        }
        m110733v();
        m110735x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final void m110735x() {
        C25615d c25615d = (C25615d) this.registry.getPrimaryDeviceId().getValue();
        InterfaceC14765a interfaceC14765a = null;
        String value = c25615d != null ? c25615d.getValue() : null;
        if (value != null) {
            InterfaceC14766b interfaceC14766b = this.handles.get(C25615d.m75336a(value));
            if (interfaceC14766b instanceof InterfaceC14765a) {
                interfaceC14765a = (InterfaceC14765a) interfaceC14766b;
            }
        }
        if (value != null && interfaceC14765a == null) {
            this.logger.mo85226q(AbstractC11895b.m31996o("Registry primary ", C25615d.m75341f(value), " has no SensorDevice handle; primarySensor stays null"), new AbstractC30556a.a[0]);
        }
        ((C13045h2) this._primarySensor).m36570j(interfaceC14765a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m110736y(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        k kVar;
        Iterator it;
        int i13;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i14 = kVar.f148454J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f148454J = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object obj = kVar.f148452H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = kVar.f148454J;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            Collection<AbstractC30426h> collectionValues = this.handles.values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collectionValues) {
                if (obj2 instanceof InterfaceC14765a) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!C25615d.m75339d(((InterfaceC14765a) obj3).getId(), str)) {
                    arrayList2.add(obj3);
                }
            }
            it = arrayList2.iterator();
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = kVar.f148450F;
            it = (Iterator) kVar.f148457y;
            AbstractC34132o.m107864I(obj);
        }
        while (it.hasNext()) {
            InterfaceC14765a interfaceC14765a = (InterfaceC14765a) it.next();
            m110731t(interfaceC14765a.getId());
            InterfaceC18603d interfaceC18603d = this.registry;
            String id4 = interfaceC14765a.getId();
            kVar.f148455w = null;
            kVar.f148456x = null;
            kVar.f148457y = it;
            kVar.f148458z = null;
            kVar.f148449E = null;
            kVar.f148450F = i13;
            kVar.f148451G = 0;
            kVar.f148454J = 1;
            if (interfaceC18603d.mo53820d(id4, kVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final void m110737z(AbstractC30426h handle) {
        Iterable iterable = (Iterable) this.registry.getRecords().getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            m110731t(handle.getId());
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (C25615d.m75339d(((C18602c) it.next()).getDeviceId(), handle.getId())) {
                    handle.m93038h(InterfaceC25614c.b.f100488a);
                }
            }
            m110731t(handle.getId());
        }
        m110733v();
        m110735x();
    }

    @Override // ft0.InterfaceC14767c
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo42331a(Set<? extends InterfaceC26750f> filter) {
        AbstractC22676k.m65750j(filter, "filter");
        return this.scanner.mo84397a(filter);
    }

    @Override // ft0.InterfaceC14767c
    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC13037f2 getPairedDevices() {
        return this.pairedDevices;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft0.InterfaceC14767c
    /* JADX INFO: renamed from: c */
    public Object mo42333c(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        m mVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        String str2;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i14 = mVar.f148467G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f148467G = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        Object obj = mVar.f148465E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = mVar.f148467G;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.mutex;
                mVar.f148468w = str;
                mVar.f148469x = interfaceC25435a;
                mVar.f148470y = 0;
                mVar.f148467G = 1;
                if (interfaceC25435a.mo68211b(mVar) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) mVar.f148469x;
                str2 = (String) mVar.f148468w;
                try {
                    AbstractC34132o.m107864I(obj);
                    m110731t(str2);
                    m110733v();
                    m110735x();
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i16 = mVar.f148470y;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) mVar.f148469x;
            String str3 = (String) mVar.f148468w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            i13 = i16;
            str = str3;
            InterfaceC18603d interfaceC18603d = this.registry;
            mVar.f148468w = str;
            mVar.f148469x = interfaceC25435a;
            mVar.f148470y = i13;
            mVar.f148471z = 0;
            mVar.f148467G = 2;
            if (interfaceC18603d.mo53820d(str, mVar) != enumC31071a) {
                str2 = str;
                interfaceC25435a2 = interfaceC25435a;
                m110731t(str2);
                m110733v();
                m110735x();
                interfaceC25435a2.mo68214i(null);
                return C23454a0.f92919a;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a4;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    @Override // ft0.InterfaceC14767c
    /* JADX INFO: renamed from: d, reason: from getter */
    public InterfaceC13037f2 getPrimarySensor() {
        return this.primarySensor;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x015d  */
    /* JADX WARN: Code duplicated, block: B:52:0x017c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00aa: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:29:0x00a9 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ab: MOVE (r3 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:29:0x00a9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [uj0.a] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [bc3.i0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [qj0.h] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // ft0.InterfaceC14767c
    /* JADX INFO: renamed from: e */
    public Object mo42335e(C25616e c25616e, InterfaceC30057d<? super C23468n> interfaceC30057d) throws Throwable {
        h hVar;
        ?? r10;
        Object obj;
        Object obj2;
        ?? r14;
        CancellationException cancellationException;
        String str;
        Object obj3;
        C25616e c25616e2;
        AbstractC30426h handle;
        C25616e c25616e3;
        InterfaceC3018i0 interfaceC3018i0;
        InterfaceC30421c interfaceC30421c;
        InterfaceC25435a interfaceC25435a;
        InterfaceC25435a interfaceC25435a2;
        int i13;
        InterfaceC3018i0 interfaceC3018i1;
        Object objM110715A;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i14 = hVar.f148432L;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f148432L = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object objM110728q = hVar2.f148430J;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = hVar2.f148432L;
        ?? r15 = 3;
        try {
            try {
                if (i15 == 0) {
                    AbstractC34132o.m107864I(objM110728q);
                    String strM75337b = C25615d.m75337b(c25616e.getAddress());
                    this.logger.mo85216g(AbstractC11266d.m30461o("pair: connecting ", strM75337b), new AbstractC30556a.a[0]);
                    InterfaceC26750f protocol = c25616e.getProtocol();
                    hVar2.f148433w = c25616e;
                    hVar2.f148434x = strM75337b;
                    hVar2.f148432L = 1;
                    Object objM110729r = m110729r(strM75337b, protocol, hVar2);
                    if (objM110729r != enumC31071a) {
                        str = strM75337b;
                        obj3 = objM110729r;
                        c25616e2 = c25616e;
                    }
                    return enumC31071a;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        InterfaceC3018i0 interfaceC3018i2 = (InterfaceC3018i0) hVar2.f148425E;
                        handle = (AbstractC30426h) hVar2.f148435y;
                        str = (String) hVar2.f148434x;
                        C25616e c25616e4 = (C25616e) hVar2.f148433w;
                        AbstractC34132o.m107864I(objM110728q);
                        c25616e3 = c25616e4;
                        interfaceC3018i0 = interfaceC3018i2;
                        interfaceC30421c = (InterfaceC30421c) objM110728q;
                        interfaceC25435a = this.mutex;
                        hVar2.f148433w = c25616e3;
                        hVar2.f148434x = str;
                        hVar2.f148435y = handle;
                        hVar2.f148436z = null;
                        hVar2.f148425E = interfaceC3018i0;
                        hVar2.f148426F = interfaceC30421c;
                        hVar2.f148427G = interfaceC25435a;
                        hVar2.f148428H = 0;
                        hVar2.f148432L = 3;
                        if (interfaceC25435a.mo68211b(hVar2) != enumC31071a) {
                            interfaceC25435a2 = interfaceC25435a;
                            i13 = 0;
                            interfaceC3018i1 = interfaceC3018i0;
                            AbstractC30426h abstractC30426h = handle;
                            hVar2.f148433w = null;
                            hVar2.f148434x = str;
                            hVar2.f148435y = abstractC30426h;
                            hVar2.f148436z = null;
                            hVar2.f148425E = interfaceC3018i1;
                            hVar2.f148426F = null;
                            hVar2.f148427G = interfaceC25435a2;
                            hVar2.f148428H = i13;
                            hVar2.f148429I = 0;
                            hVar2.f148432L = 4;
                            objM110715A = m110715A(abstractC30426h, c25616e3, interfaceC30421c, hVar2);
                            if (objM110715A != enumC31071a) {
                                interfaceC25435a2.mo68214i(null);
                                return objM110715A;
                            }
                        }
                        return enumC31071a;
                    }
                    if (i15 != 3) {
                        if (i15 != 4) {
                            if (i15 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            CancellationException cancellationException2 = (CancellationException) hVar2.f148426F;
                            AbstractC34132o.m107864I(objM110728q);
                            throw cancellationException2;
                        }
                        interfaceC25435a2 = (InterfaceC25435a) hVar2.f148427G;
                        try {
                            AbstractC34132o.m107864I(objM110728q);
                            objM110715A = ((C23468n) objM110728q).f92940w;
                            interfaceC25435a2.mo68214i(null);
                            return objM110715A;
                        } catch (Throwable th3) {
                            th = th3;
                            interfaceC25435a2.mo68214i(null);
                            throw th;
                        }
                    }
                    int i16 = hVar2.f148428H;
                    InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) hVar2.f148427G;
                    interfaceC30421c = (InterfaceC30421c) hVar2.f148426F;
                    InterfaceC3018i0 interfaceC3018i3 = (InterfaceC3018i0) hVar2.f148425E;
                    handle = (AbstractC30426h) hVar2.f148435y;
                    str = (String) hVar2.f148434x;
                    c25616e3 = (C25616e) hVar2.f148433w;
                    AbstractC34132o.m107864I(objM110728q);
                    i13 = i16;
                    interfaceC25435a2 = interfaceC25435a3;
                    interfaceC3018i1 = interfaceC3018i3;
                    AbstractC30426h abstractC30426h2 = handle;
                    try {
                        hVar2.f148433w = null;
                        hVar2.f148434x = str;
                        hVar2.f148435y = abstractC30426h2;
                        hVar2.f148436z = null;
                        hVar2.f148425E = interfaceC3018i1;
                        hVar2.f148426F = null;
                        hVar2.f148427G = interfaceC25435a2;
                        hVar2.f148428H = i13;
                        hVar2.f148429I = 0;
                        hVar2.f148432L = 4;
                        objM110715A = m110715A(abstractC30426h2, c25616e3, interfaceC30421c, hVar2);
                        if (objM110715A != enumC31071a) {
                            interfaceC25435a2.mo68214i(null);
                            return objM110715A;
                        }
                        return enumC31071a;
                    } catch (Throwable th4) {
                        th = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th;
                    }
                }
                String str2 = (String) hVar2.f148434x;
                c25616e2 = (C25616e) hVar2.f148433w;
                AbstractC34132o.m107864I(objM110728q);
                obj3 = ((C23468n) objM110728q).f92940w;
                str = str2;
                Throwable thM68037a = C23468n.m68037a(obj3);
                if (thM68037a != null) {
                    return AbstractC34132o.m107888l(thM68037a);
                }
                b bVar = (b) obj3;
                handle = bVar.getHandle();
                C3022j0 c3022j0M8711e = AbstractC3006f0.m8711e(handle.getScope(), null, new j(bVar.getSession(), null), 3);
                try {
                    hVar2.f148433w = c25616e2;
                    hVar2.f148434x = str;
                    hVar2.f148435y = handle;
                    hVar2.f148436z = null;
                    hVar2.f148425E = c3022j0M8711e;
                    hVar2.f148432L = 2;
                    objM110728q = m110728q(c3022j0M8711e, handle, hVar2);
                    if (objM110728q != enumC31071a) {
                        c25616e3 = c25616e2;
                        interfaceC3018i0 = c3022j0M8711e;
                        interfaceC30421c = (InterfaceC30421c) objM110728q;
                        interfaceC25435a = this.mutex;
                        hVar2.f148433w = c25616e3;
                        hVar2.f148434x = str;
                        hVar2.f148435y = handle;
                        hVar2.f148436z = null;
                        hVar2.f148425E = interfaceC3018i0;
                        hVar2.f148426F = interfaceC30421c;
                        hVar2.f148427G = interfaceC25435a;
                        hVar2.f148428H = 0;
                        hVar2.f148432L = 3;
                        if (interfaceC25435a.mo68211b(hVar2) != enumC31071a) {
                            interfaceC25435a2 = interfaceC25435a;
                            i13 = 0;
                            interfaceC3018i1 = interfaceC3018i0;
                            AbstractC30426h abstractC30426h3 = handle;
                            hVar2.f148433w = null;
                            hVar2.f148434x = str;
                            hVar2.f148435y = abstractC30426h3;
                            hVar2.f148436z = null;
                            hVar2.f148425E = interfaceC3018i1;
                            hVar2.f148426F = null;
                            hVar2.f148427G = interfaceC25435a2;
                            hVar2.f148428H = i13;
                            hVar2.f148429I = 0;
                            hVar2.f148432L = 4;
                            objM110715A = m110715A(abstractC30426h3, c25616e3, interfaceC30421c, hVar2);
                            if (objM110715A != enumC31071a) {
                                interfaceC25435a2.mo68214i(null);
                                return objM110715A;
                            }
                        }
                    }
                } catch (CancellationException e5) {
                    cancellationException = e5;
                    r15 = handle;
                    r14 = str;
                    r10 = c3022j0M8711e;
                    C3075y1 c3075y1 = C3075y1.f12109w;
                    i iVar = new i(r10, this, r14, r15, null);
                    hVar2.f148433w = null;
                    hVar2.f148434x = null;
                    hVar2.f148435y = null;
                    hVar2.f148436z = null;
                    hVar2.f148425E = null;
                    hVar2.f148426F = cancellationException;
                    hVar2.f148427G = null;
                    hVar2.f148432L = 5;
                    if (AbstractC3006f0.m8705K(c3075y1, iVar, hVar2) != enumC31071a) {
                        throw cancellationException;
                    }
                }
                return enumC31071a;
            } catch (CancellationException e13) {
                cancellationException = e13;
                r10 = 4;
                r14 = 2;
            }
        } catch (CancellationException e14) {
            r10 = 1;
            r15 = obj;
            r14 = obj2;
            cancellationException = e14;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C35036a(InterfaceC18603d interfaceC18603d, InterfaceC27978a interfaceC27978a, InterfaceC30423e interfaceC30423e, InterfaceC2994c0 interfaceC2994c0, Clock clock, InterfaceC34116n interfaceC34116n, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 16) != 0) {
            clock = Clock.systemUTC();
            AbstractC22676k.m65749i(clock, "systemUTC(...)");
        }
        this(interfaceC18603d, interfaceC27978a, interfaceC30423e, interfaceC2994c0, clock, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("WhoopDeviceManager") : interfaceC34116n, (i13 & 64) != 0 ? a.f148383w : interfaceC4339a);
    }
}
