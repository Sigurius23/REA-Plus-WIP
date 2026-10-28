package i92;

import com.whoop.data.local.prefs.SharedPreferenceConstants;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ga1.C15621b;
import ge3.AbstractC15751g;
import kh2.AbstractC22486a;
import l83.InterfaceC23462h;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import or2.C28218y1;
import or2.InterfaceC28215x1;
import p007a6.InterfaceC0422g;
import p088dc.AbstractC11895b;
import p138f6.AbstractC14134f;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: i92.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Li92/c;", "", "Lor2/x1;", "uuidGenerator", "La6/g;", "Lf6/f;", "dataStore", "<init>", "(Lor2/x1;La6/g;)V", "", "c", "(Lq83/d;)Ljava/lang/Object;", "f", "a", "Lor2/x1;", "b", "La6/g;", "Lmc3/a;", "Lmc3/a;", "mutex", "d", "Ljava/lang/String;", "uuidCache", "Ltr2/n;", "e", "Ll83/h;", "()Ltr2/n;", "logger", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18258c {

    /* JADX INFO: renamed from: g */
    private static final C14132d f71060g = AbstractC15751g.m44441U(SharedPreferenceConstants.KEY_APP_INSTALLATION_UUID);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28215x1 uuidGenerator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String uuidCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: i92.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.InstallationUuidProvider", m100430f = "InstallationUuidProvider.kt", m100431l = {43}, m100432m = "generateAndSaveInstallationUuid", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f71066w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f71067x;

        /* JADX INFO: renamed from: z */
        int f71069z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71067x = obj;
            this.f71069z |= Integer.MIN_VALUE;
            return C18258c.this.m52598c(this);
        }
    }

    /* JADX INFO: renamed from: i92.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.InstallationUuidProvider", m100430f = "InstallationUuidProvider.kt", m100431l = {56, 35, 37}, m100432m = "provideInstallationUuidSuspend", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f71071F;

        /* JADX INFO: renamed from: w */
        Object f71072w;

        /* JADX INFO: renamed from: x */
        int f71073x;

        /* JADX INFO: renamed from: y */
        int f71074y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f71075z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71075z = obj;
            this.f71071F |= Integer.MIN_VALUE;
            return C18258c.this.m52601f(this);
        }
    }

    public C18258c(InterfaceC28215x1 uuidGenerator, InterfaceC0422g dataStore) {
        AbstractC22676k.m65750j(uuidGenerator, "uuidGenerator");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        this.uuidGenerator = uuidGenerator;
        this.dataStore = dataStore;
        this.mutex = AbstractC25438d.m74669a();
        this.logger = AbstractC30060g.m92088H(new C15621b(18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m52598c(InterfaceC30057d<? super String> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f71069z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f71069z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM64987c = bVar.f71067x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f71069z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM64987c);
            String string = this.uuidGenerator.mo85405a().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            InterfaceC0422g interfaceC0422g = this.dataStore;
            C14132d c14132d = f71060g;
            bVar.f71066w = null;
            bVar.f71069z = 1;
            objM64987c = AbstractC22486a.m64987c(interfaceC0422g, c14132d, string, bVar);
            if (objM64987c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM64987c);
        }
        String str = (String) objM64987c;
        this.uuidCache = str;
        m52599d().mo85228t(AbstractC11895b.m31996o("generated ", str, " into datastore"), new AbstractC30556a.a[0]);
        return objM64987c;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC34116n m52599d() {
        return (InterfaceC34116n) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC34116n m52600e() {
        return InterfaceC34116n.INSTANCE.m107848a("InstallationUuidProvider");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0096 A[Catch: all -> 0x004b, TryCatch #2 {all -> 0x004b, blocks: (B:21:0x0047, B:37:0x008a, B:39:0x0096, B:40:0x0099), top: B:56:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:21:0x0047, B:37:0x008a, B:39:0x0096, B:40:0x0099), top: B:56:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m52601f(InterfaceC30057d<? super String> interfaceC30057d) {
        c cVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        InterfaceC25435a interfaceC25435a3;
        String str;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i14 = cVar.f71071F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f71071F = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM52598c = cVar.f71075z;
        Object obj = EnumC31071a.f128113w;
        int i15 = cVar.f71071F;
        int i16 = 0;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM52598c);
                String str2 = this.uuidCache;
                if (str2 != null) {
                    return str2;
                }
                interfaceC25435a = this.mutex;
                cVar.f71072w = interfaceC25435a;
                cVar.f71073x = 0;
                cVar.f71071F = 1;
                if (interfaceC25435a.mo68211b(cVar) != obj) {
                    i13 = 0;
                }
                return obj;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) cVar.f71072w;
                    try {
                        AbstractC34132o.m107864I(objM52598c);
                        str = (String) objM52598c;
                        interfaceC25435a3 = interfaceC25435a2;
                        interfaceC25435a3.mo68214i(null);
                        return str;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th3;
                    }
                }
                i16 = cVar.f71074y;
                i13 = cVar.f71073x;
                interfaceC25435a3 = (InterfaceC25435a) cVar.f71072w;
                try {
                    AbstractC34132o.m107864I(objM52598c);
                    str = (String) ((AbstractC14134f) objM52598c).mo40227b(f71060g);
                    if (str == null) {
                        cVar.f71072w = interfaceC25435a3;
                        cVar.f71073x = i13;
                        cVar.f71074y = i16;
                        cVar.f71071F = 3;
                        objM52598c = m52598c(cVar);
                        if (objM52598c != obj) {
                            interfaceC25435a2 = interfaceC25435a3;
                            str = (String) objM52598c;
                            interfaceC25435a3 = interfaceC25435a2;
                        }
                        return obj;
                    }
                    this.uuidCache = str;
                    interfaceC25435a3.mo68214i(null);
                    return str;
                } catch (Throwable th5) {
                    th3 = th5;
                    interfaceC25435a2 = interfaceC25435a3;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            i13 = cVar.f71073x;
            InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) cVar.f71072w;
            AbstractC34132o.m107864I(objM52598c);
            interfaceC25435a = interfaceC25435a4;
            InterfaceC13058l data = this.dataStore.getData();
            cVar.f71072w = interfaceC25435a;
            cVar.f71073x = i13;
            cVar.f71074y = 0;
            cVar.f71071F = 2;
            Object objM36575A = AbstractC13091v.m36575A(data, cVar);
            if (objM36575A != obj) {
                interfaceC25435a3 = interfaceC25435a;
                objM52598c = objM36575A;
                str = (String) ((AbstractC14134f) objM52598c).mo40227b(f71060g);
                if (str == null) {
                    this.uuidCache = str;
                } else {
                    cVar.f71072w = interfaceC25435a3;
                    cVar.f71073x = i13;
                    cVar.f71074y = i16;
                    cVar.f71071F = 3;
                    objM52598c = m52598c(cVar);
                    if (objM52598c != obj) {
                        interfaceC25435a2 = interfaceC25435a3;
                        str = (String) objM52598c;
                        interfaceC25435a3 = interfaceC25435a2;
                    }
                }
                interfaceC25435a3.mo68214i(null);
                return str;
            }
            return obj;
        } catch (Throwable th6) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th6;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    public /* synthetic */ C18258c(InterfaceC28215x1 interfaceC28215x1, InterfaceC0422g interfaceC0422g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28218y1() : interfaceC28215x1, interfaceC0422g);
    }
}
