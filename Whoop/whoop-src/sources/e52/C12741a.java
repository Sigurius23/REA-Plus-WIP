package e52;

import bc3.InterfaceC2994c0;
import c52.C4253d;
import c52.C4254e;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.time.Instant;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import y42.C39228j;
import y42.InterfaceC39219a;

/* JADX INFO: renamed from: e52.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 #2\u00020\u0001:\u0001\u001bB-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Le52/a;", "", "La6/g;", "Lf6/f;", "dataStorePreferences", "Ly42/j;", "puffinManager", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(La6/g;Ly42/j;Ljava/time/Clock;Ltr2/n;)V", "Lbc3/c0;", "scope", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lbc3/c0;)V", "", "macAddress", "serialNumber", "j", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "i", "Lc52/e;", "g", "(Lq83/d;)Ljava/lang/Object;", "a", "La6/g;", "b", "Ly42/j;", "c", "Ljava/time/Clock;", "d", "Ltr2/n;", "e", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12741a {

    /* JADX INFO: renamed from: f */
    private static final C14132d f43590f = AbstractC15751g.m44441U("lastConnectedPuffinMacAddress");

    /* JADX INFO: renamed from: g */
    private static final C14132d f43591g = AbstractC15751g.m44441U("lastConnectedPuffinSerialNumber");

    /* JADX INFO: renamed from: h */
    private static final C14132d f43592h = AbstractC15751g.m44429I("lastConnectedPuffinTimestamp");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePreferences;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39228j puffinManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e52.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.store.PuffinStore", m100430f = "PuffinStore.kt", m100431l = {57}, m100432m = "getLastConnectedPuffin$puffin_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f43597w;

        /* JADX INFO: renamed from: y */
        int f43599y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f43597w = obj;
            this.f43599y |= Integer.MIN_VALUE;
            return C12741a.this.m35668g(this);
        }
    }

    /* JADX INFO: renamed from: e52.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.store.PuffinStore$observeConnectedPuffinFlow$1", m100430f = "PuffinStore.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ly42/a;", "puffin", "Ll83/a0;", "<anonymous>", "(Ly42/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f43601w;

        /* JADX INFO: renamed from: x */
        int f43602x;

        /* JADX INFO: renamed from: y */
        int f43603y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f43604z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C12741a.this.new c(interfaceC30057d);
            cVar.f43604z = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC39219a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC39219a interfaceC39219a = (InterfaceC39219a) this.f43604z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43603y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4253d c4253dMo124935O = interfaceC39219a.mo124935O();
                if (c4253dMo124935O != null) {
                    C12741a c12741a = C12741a.this;
                    String macAddress = c4253dMo124935O.getMacAddress();
                    String serialNumber = c4253dMo124935O.getSerialNumber();
                    this.f43604z = null;
                    this.f43601w = null;
                    this.f43602x = 0;
                    this.f43603y = 1;
                    if (c12741a.m35667j(macAddress, serialNumber, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e52.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.store.PuffinStore$observeConnectedPuffinFlow$2", m100430f = "PuffinStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Ly42/a;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f43605w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f43606x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = C12741a.this.new d(interfaceC30057d);
            dVar.f43606x = th3;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = (Throwable) this.f43606x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f43605w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12741a.this.logger.mo85230v("Error observing connected Puffin flow", th3, new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e52.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.store.PuffinStore", m100430f = "PuffinStore.kt", m100431l = {48}, m100432m = "updateLastConnectedPuffin", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f43608E;

        /* JADX INFO: renamed from: w */
        Object f43609w;

        /* JADX INFO: renamed from: x */
        Object f43610x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f43611y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f43611y = obj;
            this.f43608E |= Integer.MIN_VALUE;
            return C12741a.this.m35667j(null, null, this);
        }
    }

    /* JADX INFO: renamed from: e52.a$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.store.PuffinStore$updateLastConnectedPuffin$2", m100430f = "PuffinStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C12741a f43613E;

        /* JADX INFO: renamed from: w */
        int f43614w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f43615x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f43616y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f43617z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, C12741a c12741a, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f43616y = str;
            this.f43617z = str2;
            this.f43613E = c12741a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f43616y, this.f43617z, this.f43613E, interfaceC30057d);
            fVar.f43615x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f43615x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f43614w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C12741a.f43590f, this.f43616y);
            c14129a.m40230g(C12741a.f43591g, this.f43617z);
            c14129a.m40230g(C12741a.f43592h, new Long(Instant.now(this.f43613E.clock).toEpochMilli()));
            return C23454a0.f92919a;
        }
    }

    public C12741a(InterfaceC0422g dataStorePreferences, C39228j puffinManager, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dataStorePreferences, "dataStorePreferences");
        AbstractC22676k.m65750j(puffinManager, "puffinManager");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.dataStorePreferences = dataStorePreferences;
        this.puffinManager = puffinManager;
        this.clock = clock;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: h */
    private final void m35666h(InterfaceC2994c0 scope) {
        AbstractC13091v.m36582H(new C13015a0(new C13052j1(this.puffinManager.m124994e(), new c(null), 0), new d(null)), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m35667j(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f43608E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f43608E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f43611y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f43608E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC0422g interfaceC0422g = this.dataStorePreferences;
            f fVar = new f(str, str2, this, null);
            eVar.f43609w = str;
            eVar.f43610x = str2;
            eVar.f43608E = 1;
            if (AbstractC17269i.m48861G(interfaceC0422g, fVar, eVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) eVar.f43610x;
            str = (String) eVar.f43609w;
            AbstractC34132o.m107864I(obj);
        }
        this.logger.mo85216g(AbstractC31061c.m95640p("Updated last connected Puffin to mac address: ", str, " and serial number: ", str2), new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m35668g(InterfaceC30057d<? super C4254e> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f43599y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f43599y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM36575A = bVar.f43597w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f43599y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l data = this.dataStorePreferences.getData();
            bVar.f43599y = 1;
            objM36575A = AbstractC13091v.m36575A(data, bVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
        }
        AbstractC14134f abstractC14134f = (AbstractC14134f) objM36575A;
        String str = (String) abstractC14134f.mo40227b(f43590f);
        String str2 = (String) abstractC14134f.mo40227b(f43591g);
        Long l7 = (Long) abstractC14134f.mo40227b(f43592h);
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || l7 == null) {
            return null;
        }
        return new C4254e(str, str2, l7.longValue());
    }

    /* JADX INFO: renamed from: i */
    public final void m35669i(InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        m35666h(scope);
    }
}
