package vh2;

import bc3.AbstractC3006f0;
import j93.InterfaceC21461d;
import js0.AbstractC21907a;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vs0.InterfaceC36471a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: vh2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001\u0019B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lvh2/g;", "", "Lvh2/f;", "store", "Ljs0/c;", "configurationRepository", "Lvs0/a;", "signedInProvider", "Lvh2/c;", "unlockMetrics", "Ltr2/n;", "logger", "<init>", "(Lvh2/f;Ljs0/c;Lvs0/a;Lvh2/c;Ltr2/n;)V", "", "b", "()I", "", "serial", "Lvh2/h;", "result", "", "isRetry", "firmwareVersion", "Ll83/a0;", "a", "(Ljava/lang/String;Lvh2/h;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lvh2/f;", "Ljs0/c;", "c", "Lvs0/a;", "d", "Lvh2/c;", "e", "Ltr2/n;", "f", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36052g {

    /* JADX INFO: renamed from: f */
    private static final a f153902f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C36051f store;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC36471a signedInProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C36048c unlockMetrics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vh2.g$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Lvh2/g$a;", "", "<init>", "()V", "a", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: vh2.g$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lvh2/g$a$a;", "Ljs0/a;", "", "<init>", "()V", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42543a extends AbstractC21907a<Integer> {

            /* JADX INFO: renamed from: a */
            public static final C42543a f153908a = new C42543a();

            private C42543a() {
                super("mobile-strap-stuck-locked-connect-threshold", 3);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vh2.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.unlock.StuckLockedTracker", m100430f = "StuckLockedTracker.kt", m100431l = {49, 52, 54}, m100432m = "onUnlockResolved", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f153909E;

        /* JADX INFO: renamed from: F */
        int f153910F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f153911G;

        /* JADX INFO: renamed from: I */
        int f153913I;

        /* JADX INFO: renamed from: w */
        Object f153914w;

        /* JADX INFO: renamed from: x */
        Object f153915x;

        /* JADX INFO: renamed from: y */
        Object f153916y;

        /* JADX INFO: renamed from: z */
        boolean f153917z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153911G = obj;
            this.f153913I |= Integer.MIN_VALUE;
            return C36052g.this.m114473a(null, null, false, null, this);
        }
    }

    public C36052g(C36051f store, AbstractC21909c configurationRepository, InterfaceC36471a signedInProvider, C36048c unlockMetrics, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(signedInProvider, "signedInProvider");
        AbstractC22676k.m65750j(unlockMetrics, "unlockMetrics");
        AbstractC22676k.m65750j(logger, "logger");
        this.store = store;
        this.configurationRepository = configurationRepository;
        this.signedInProvider = signedInProvider;
        this.unlockMetrics = unlockMetrics;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final int m114472b() {
        AbstractC21909c abstractC21909c = this.configurationRepository;
        a.C42543a c42543a = a.C42543a.f153908a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c42543a.getName();
        Object defaultValue = c42543a.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue != null) {
            return ((Integer) defaultValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c2 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:63:0x0166, B:65:0x0172, B:66:0x01a0, B:21:0x005b, B:56:0x012b, B:58:0x0133, B:59:0x014d, B:24:0x0071, B:46:0x00ba, B:48:0x00c2, B:27:0x0078, B:29:0x007c, B:31:0x0080, B:36:0x008f, B:38:0x0093, B:43:0x00a2, B:50:0x00de, B:52:0x00fa, B:53:0x0114), top: B:71:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0133 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:63:0x0166, B:65:0x0172, B:66:0x01a0, B:21:0x005b, B:56:0x012b, B:58:0x0133, B:59:0x014d, B:24:0x0071, B:46:0x00ba, B:48:0x00c2, B:27:0x0078, B:29:0x007c, B:31:0x0080, B:36:0x008f, B:38:0x0093, B:43:0x00a2, B:50:0x00de, B:52:0x00fa, B:53:0x0114), top: B:71:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014d A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:63:0x0166, B:65:0x0172, B:66:0x01a0, B:21:0x005b, B:56:0x012b, B:58:0x0133, B:59:0x014d, B:24:0x0071, B:46:0x00ba, B:48:0x00c2, B:27:0x0078, B:29:0x007c, B:31:0x0080, B:36:0x008f, B:38:0x0093, B:43:0x00a2, B:50:0x00de, B:52:0x00fa, B:53:0x0114), top: B:71:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0172 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:63:0x0166, B:65:0x0172, B:66:0x01a0, B:21:0x005b, B:56:0x012b, B:58:0x0133, B:59:0x014d, B:24:0x0071, B:46:0x00ba, B:48:0x00c2, B:27:0x0078, B:29:0x007c, B:31:0x0080, B:36:0x008f, B:38:0x0093, B:43:0x00a2, B:50:0x00de, B:52:0x00fa, B:53:0x0114), top: B:71:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0 A[Catch: Exception -> 0x003e, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:63:0x0166, B:65:0x0172, B:66:0x01a0, B:21:0x005b, B:56:0x012b, B:58:0x0133, B:59:0x014d, B:24:0x0071, B:46:0x00ba, B:48:0x00c2, B:27:0x0078, B:29:0x007c, B:31:0x0080, B:36:0x008f, B:38:0x0093, B:43:0x00a2, B:50:0x00de, B:52:0x00fa, B:53:0x0114), top: B:71:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00c2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0133, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0172, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01a0, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final Object m114473a(String str, InterfaceC36053h interfaceC36053h, boolean z4, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        int i13;
        int i14;
        Object objMo116827a;
        String str3;
        String str4;
        int iIntValue;
        int iM114472b;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i15 = bVar.f153913I;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f153913I = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM114471d = bVar.f153911G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = bVar.f153913I;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(objM114471d);
                i13 = ((interfaceC36053h instanceof InterfaceC36053h.c) || ((interfaceC36053h instanceof InterfaceC36053h.a) && ((InterfaceC36053h.a) interfaceC36053h).getReason() == InterfaceC36053h.b.FORBIDDEN)) ? 1 : 0;
                i14 = ((interfaceC36053h instanceof InterfaceC36053h.a) && ((InterfaceC36053h.a) interfaceC36053h).getReason() == InterfaceC36053h.b.NO_NETWORK) ? 1 : 0;
                if (i13 != 0) {
                    C36051f c36051f = this.store;
                    bVar.f153914w = str;
                    bVar.f153915x = null;
                    bVar.f153916y = null;
                    bVar.f153917z = z4;
                    bVar.f153909E = i13;
                    bVar.f153910F = i14;
                    bVar.f153913I = 1;
                    objM114471d = c36051f.m114471d(str, bVar);
                    if (objM114471d == enumC31071a) {
                    }
                    if (((Boolean) objM114471d).booleanValue()) {
                        this.logger.mo85216g("Strap " + str + " unlocked, clearing its stuck-locked count", new AbstractC30556a.a[0]);
                    }
                } else if (i14 != 0) {
                    this.logger.mo85216g("Strap " + str + " unlock failed with no network, leaving its stuck-locked count alone", new AbstractC30556a.a[0]);
                } else if (z4) {
                    this.logger.mo85216g("Strap " + str + " unlock retry failed, this connection is already counted", new AbstractC30556a.a[0]);
                } else {
                    InterfaceC36471a interfaceC36471a = this.signedInProvider;
                    bVar.f153914w = str;
                    bVar.f153915x = null;
                    bVar.f153916y = str2;
                    bVar.f153917z = z4;
                    bVar.f153909E = i13;
                    bVar.f153910F = i14;
                    bVar.f153913I = 2;
                    objMo116827a = interfaceC36471a.mo116827a(bVar);
                    if (objMo116827a != enumC31071a) {
                        if (!((Boolean) objMo116827a).booleanValue()) {
                            C36051f c36051f2 = this.store;
                            bVar.f153914w = str;
                            bVar.f153915x = null;
                            bVar.f153916y = str2;
                            bVar.f153917z = z4;
                            bVar.f153909E = i13;
                            bVar.f153910F = i14;
                            bVar.f153913I = 3;
                            objM114471d = c36051f2.m114470b(str, bVar);
                            if (objM114471d != enumC31071a) {
                                str3 = str;
                                str4 = str2;
                                iIntValue = ((Number) objM114471d).intValue();
                                iM114472b = m114472b();
                                if (iIntValue == iM114472b) {
                                    this.logger.mo85226q("Strap " + str3 + " on firmware " + str4 + " is stuck Locked, " + iIntValue + " consecutive Locked connections reached the threshold", new AbstractC30556a.a[0]);
                                    this.unlockMetrics.m114446i(str4);
                                } else {
                                    this.logger.mo85216g("Strap " + str3 + " stayed Locked, " + iIntValue + " of " + iM114472b + " consecutive Locked connections", new AbstractC30556a.a[0]);
                                }
                            }
                        } else {
                            this.logger.mo85216g("Strap " + str + " unlock failed while signed out, not counting it", new AbstractC30556a.a[0]);
                        }
                    }
                }
                return enumC31071a;
            }
            if (i16 != 1) {
                if (i16 == 2) {
                    int i17 = bVar.f153910F;
                    int i18 = bVar.f153909E;
                    z4 = bVar.f153917z;
                    str2 = (String) bVar.f153916y;
                    String str5 = (String) bVar.f153914w;
                    AbstractC34132o.m107864I(objM114471d);
                    i14 = i17;
                    str = str5;
                    objMo116827a = objM114471d;
                    i13 = i18;
                    if (!((Boolean) objMo116827a).booleanValue()) {
                        C36051f c36051f3 = this.store;
                        bVar.f153914w = str;
                        bVar.f153915x = null;
                        bVar.f153916y = str2;
                        bVar.f153917z = z4;
                        bVar.f153909E = i13;
                        bVar.f153910F = i14;
                        bVar.f153913I = 3;
                        objM114471d = c36051f3.m114470b(str, bVar);
                        if (objM114471d != enumC31071a) {
                            str3 = str;
                            str4 = str2;
                        }
                        return enumC31071a;
                    }
                    this.logger.mo85216g("Strap " + str + " unlock failed while signed out, not counting it", new AbstractC30556a.a[0]);
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (String) bVar.f153916y;
                    str3 = (String) bVar.f153914w;
                    AbstractC34132o.m107864I(objM114471d);
                }
                iIntValue = ((Number) objM114471d).intValue();
                iM114472b = m114472b();
                if (iIntValue == iM114472b) {
                    this.logger.mo85226q("Strap " + str3 + " on firmware " + str4 + " is stuck Locked, " + iIntValue + " consecutive Locked connections reached the threshold", new AbstractC30556a.a[0]);
                    this.unlockMetrics.m114446i(str4);
                } else {
                    this.logger.mo85216g("Strap " + str3 + " stayed Locked, " + iIntValue + " of " + iM114472b + " consecutive Locked connections", new AbstractC30556a.a[0]);
                }
            } else {
                str = (String) bVar.f153914w;
                AbstractC34132o.m107864I(objM114471d);
                if (((Boolean) objM114471d).booleanValue()) {
                    this.logger.mo85216g("Strap " + str + " unlocked, clearing its stuck-locked count", new AbstractC30556a.a[0]);
                }
            }
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(bVar.getContext());
            this.logger.mo85230v("Failed to update stuck-locked state", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C36052g(C36051f c36051f, AbstractC21909c abstractC21909c, InterfaceC36471a interfaceC36471a, C36048c c36048c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36051f, abstractC21909c, interfaceC36471a, c36048c, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StuckLockedTracker") : interfaceC34116n);
    }
}
