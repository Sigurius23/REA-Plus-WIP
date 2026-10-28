package hg1;

import bc3.InterfaceC2994c0;
import bu0.C3634a;
import c93.InterfaceC4351m;
import fg1.C14456b;
import fg1.InterfaceC14457c;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.List;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import mh2.C25561a;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vt0.C36484a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: hg1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 '2\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lhg1/d;", "Lhg1/c;", "Ltr2/n;", "logger", "Ljava/io/File;", "androidCacheDir", "Lfg1/c;", "firmwareEventsRoomInteractor", "Ljs0/c;", "configurationRepository", "Lmh2/a;", "strapMetadataDaoInteractor", "Lvt0/a;", "dataPacketUploadFileWriter", "<init>", "(Ltr2/n;Ljava/io/File;Lfg1/c;Ljs0/c;Lmh2/a;Lvt0/a;)V", "", "Lbu0/a;", "records", "Lfg1/b;", "e", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "b", "(Lq83/d;)Ljava/lang/Object;", "", "oldestTimestamp", "newestTimestamp", "Ll83/a0;", "a", "(JJLq83/d;)Ljava/lang/Object;", "Ltr2/n;", "Ljava/io/File;", "c", "Lfg1/c;", "d", "Ljs0/c;", "Lmh2/a;", "f", "Lvt0/a;", "g", "firmware-events_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17259d implements InterfaceC17258c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final File androidCacheDir;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14457c firmwareEventsRoomInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C25561a strapMetadataDaoInteractor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C36484a dataPacketUploadFileWriter;

    /* JADX INFO: renamed from: hg1.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.uploader.StrapFirmwareEventsFileExporterImpl", m100430f = "StrapFirmwareEventsFileExporter.kt", m100431l = {37, 41, 47}, m100432m = "getStrapEventsToUpload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f66311F;

        /* JADX INFO: renamed from: w */
        int f66312w;

        /* JADX INFO: renamed from: x */
        int f66313x;

        /* JADX INFO: renamed from: y */
        Object f66314y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f66315z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f66315z = obj;
            this.f66311F |= Integer.MIN_VALUE;
            return C17259d.this.mo48838b(this);
        }
    }

    /* JADX INFO: renamed from: hg1.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.uploader.StrapFirmwareEventsFileExporterImpl", m100430f = "StrapFirmwareEventsFileExporter.kt", m100431l = {53, 57}, m100432m = "processRecords", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f66316E;

        /* JADX INFO: renamed from: G */
        int f66318G;

        /* JADX INFO: renamed from: w */
        Object f66319w;

        /* JADX INFO: renamed from: x */
        Object f66320x;

        /* JADX INFO: renamed from: y */
        Object f66321y;

        /* JADX INFO: renamed from: z */
        int f66322z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f66316E = obj;
            this.f66318G |= Integer.MIN_VALUE;
            return C17259d.this.m48841e(null, this);
        }
    }

    /* JADX INFO: renamed from: hg1.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.uploader.StrapFirmwareEventsFileExporterImpl$processRecords$2", m100430f = "StrapFirmwareEventsFileExporter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f66323w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22669g0 f66324x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17259d f66325y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C22669g0 c22669g0, C17259d c17259d, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f66324x = c22669g0;
            this.f66325y = c17259d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f66324x, this.f66325y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f66323w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f66324x.f89336w = File.createTempFile("status_packets_new", "", this.f66325y.androidCacheDir);
            return C23454a0.f92919a;
        }
    }

    public C17259d(InterfaceC34116n logger, File androidCacheDir, InterfaceC14457c firmwareEventsRoomInteractor, AbstractC21909c configurationRepository, C25561a strapMetadataDaoInteractor, C36484a dataPacketUploadFileWriter) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(androidCacheDir, "androidCacheDir");
        AbstractC22676k.m65750j(firmwareEventsRoomInteractor, "firmwareEventsRoomInteractor");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(strapMetadataDaoInteractor, "strapMetadataDaoInteractor");
        AbstractC22676k.m65750j(dataPacketUploadFileWriter, "dataPacketUploadFileWriter");
        this.logger = logger;
        this.androidCacheDir = androidCacheDir;
        this.firmwareEventsRoomInteractor = firmwareEventsRoomInteractor;
        this.configurationRepository = configurationRepository;
        this.strapMetadataDaoInteractor = strapMetadataDaoInteractor;
        this.dataPacketUploadFileWriter = dataPacketUploadFileWriter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r0 == r1) goto L32;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m48841e(java.util.List<bu0.C3634a> r14, q83.InterfaceC30057d<? super fg1.C14456b> r15) {
        /*
            r13 = this;
            r0 = r15
            boolean r1 = r0 instanceof hg1.C17259d.c
            if (r1 == 0) goto L15
            r1 = r0
            hg1.d$c r1 = (hg1.C17259d.c) r1
            int r2 = r1.f66318G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f66318G = r2
        L13:
            r8 = r1
            goto L1b
        L15:
            hg1.d$c r1 = new hg1.d$c
            r1.<init>(r15)
            goto L13
        L1b:
            java.lang.Object r0 = r8.f66316E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r8.f66318G
            r11 = 0
            r3 = 2
            r4 = 1
            r12 = 0
            if (r2 == 0) goto L52
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r1 = r8.f66321y
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r2 = r8.f66320x
            kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
            java.lang.Object r2 = r8.f66319w
            java.util.List r2 = (java.util.List) r2
            p505ts.AbstractC34132o.m107864I(r0)     // Catch: java.lang.Exception -> L3c
            r3 = r1
            goto L8d
        L3c:
            r0 = move-exception
            goto Lae
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L46:
            java.lang.Object r2 = r8.f66320x
            kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
            java.lang.Object r4 = r8.f66319w
            java.util.List r4 = (java.util.List) r4
            p505ts.AbstractC34132o.m107864I(r0)     // Catch: java.lang.Exception -> L3c
            goto L6d
        L52:
            kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r0)
            kc3.e r0 = bc3.AbstractC3050q0.f12077a     // Catch: java.lang.Exception -> L3c
            kc3.d r0 = kc3.ExecutorC22364d.f87316w     // Catch: java.lang.Exception -> L3c
            hg1.d$d r5 = new hg1.d$d     // Catch: java.lang.Exception -> L3c
            r5.<init>(r2, r13, r12)     // Catch: java.lang.Exception -> L3c
            r8.f66319w = r14     // Catch: java.lang.Exception -> L3c
            r8.f66320x = r2     // Catch: java.lang.Exception -> L3c
            r8.f66318G = r4     // Catch: java.lang.Exception -> L3c
            java.lang.Object r0 = bc3.AbstractC3006f0.m8705K(r0, r5, r8)     // Catch: java.lang.Exception -> L3c
            if (r0 != r1) goto L6c
            goto L8c
        L6c:
            r4 = r14
        L6d:
            java.lang.Object r0 = r2.f89336w     // Catch: java.lang.Exception -> L3c
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto Lb7
            vt0.a r2 = r13.dataPacketUploadFileWriter     // Catch: java.lang.Exception -> L3c
            r8.f66319w = r12     // Catch: java.lang.Exception -> L3c
            r8.f66320x = r12     // Catch: java.lang.Exception -> L3c
            r8.f66321y = r0     // Catch: java.lang.Exception -> L3c
            r8.f66322z = r11     // Catch: java.lang.Exception -> L3c
            r8.f66318G = r3     // Catch: java.lang.Exception -> L3c
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 28
            r10 = 0
            r3 = r0
            java.lang.Object r0 = vt0.C36484a.m116916b(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L3c
            if (r0 != r1) goto L8d
        L8c:
            return r1
        L8d:
            vt0.b r0 = (vt0.C36485b) r0     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto Lb7
            mh2.a r1 = r13.strapMetadataDaoInteractor     // Catch: java.lang.Exception -> L3c
            int r2 = r0.getVersion()     // Catch: java.lang.Exception -> L3c
            oh2.a r2 = r1.m75170g(r2)     // Catch: java.lang.Exception -> L3c
            fg1.b r1 = new fg1.b     // Catch: java.lang.Exception -> L3c
            long r4 = r0.getOldestTimestamp()     // Catch: java.lang.Exception -> L3c
            long r6 = r0.getNewestTimestamp()     // Catch: java.lang.Exception -> L3c
            long r8 = r0.getPacketCount()     // Catch: java.lang.Exception -> L3c
            int r8 = (int) r8     // Catch: java.lang.Exception -> L3c
            r1.<init>(r2, r3, r4, r6, r8)     // Catch: java.lang.Exception -> L3c
            return r1
        Lae:
            tr2.n r1 = r13.logger
            java.lang.String r2 = "Something went wrong trying to create a temp file to write fw events"
            qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r11]
            r1.mo85218i(r2, r0, r3)
        Lb7:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hg1.C17259d.m48841e(java.util.List, q83.d):java.lang.Object");
    }

    @Override // hg1.InterfaceC17258c
    /* JADX INFO: renamed from: a */
    public Object mo48837a(long j7, long j13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo41191d = this.firmwareEventsRoomInteractor.mo41191d(j7, j13, interfaceC30057d);
        return objMo41191d == EnumC31071a.f128113w ? objMo41191d : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hg1.InterfaceC17258c
    /* JADX INFO: renamed from: b */
    public Object mo48838b(InterfaceC30057d<? super C14456b> interfaceC30057d) {
        b bVar;
        Object objM125868N0;
        int i13;
        int i14;
        int i15;
        List<C3634a> list;
        Object objM48841e;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i16 = bVar.f66311F;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                bVar.f66311F = i16 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f66315z;
        Object obj2 = EnumC31071a.f128113w;
        int i17 = bVar.f66311F;
        if (i17 != 0) {
            if (i17 == 1) {
                i13 = bVar.f66312w;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i17 != 2) {
                    if (i17 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                i14 = bVar.f66313x;
                i15 = bVar.f66312w;
                AbstractC34132o.m107864I(obj);
            }
            list = (List) obj;
            if (list.isEmpty()) {
                this.logger.mo85228t(AbstractC2875y.m8295h(i14, "No firmware events found for version "), new AbstractC30556a.a[0]);
                return null;
            }
            this.logger.mo85228t(AbstractC25012a.m73372e(list.size(), i14, "Uploading ", " number of firmware event packets for version ", " to cloud"), new AbstractC30556a.a[0]);
            bVar.f66314y = null;
            bVar.f66312w = i15;
            bVar.f66313x = i14;
            bVar.f66311F = 3;
            objM48841e = m48841e(list, bVar);
            if (objM48841e != obj2) {
                return obj2;
            }
            return objM48841e;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC21909c abstractC21909c = this.configurationRepository;
        Companion.C41695a c41695a = Companion.C41695a.f66309a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c41695a.getName();
        Object defaultValue = c41695a.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            } else {
                objM125868N0 = null;
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int iIntValue = ((Integer) defaultValue).intValue();
        InterfaceC14457c interfaceC14457c = this.firmwareEventsRoomInteractor;
        bVar.f66312w = iIntValue;
        bVar.f66311F = 1;
        Object objMo41189b = interfaceC14457c.mo41189b(bVar);
        if (objMo41189b != obj2) {
            i13 = iIntValue;
            obj = objMo41189b;
        }
        return obj2;
        Integer num = (Integer) obj;
        if (num == null) {
            this.logger.mo85228t("No firmware events found in database", new AbstractC30556a.a[0]);
            return null;
        }
        int iIntValue2 = num.intValue();
        InterfaceC14457c interfaceC14457c2 = this.firmwareEventsRoomInteractor;
        bVar.f66312w = i13;
        bVar.f66313x = iIntValue2;
        bVar.f66311F = 2;
        Object objMo41188a = interfaceC14457c2.mo41188a(iIntValue2, i13, bVar);
        if (objMo41188a != obj2) {
            int i18 = i13;
            i14 = iIntValue2;
            obj = objMo41188a;
            i15 = i18;
            list = (List) obj;
            if (list.isEmpty()) {
                this.logger.mo85228t(AbstractC2875y.m8295h(i14, "No firmware events found for version "), new AbstractC30556a.a[0]);
                return null;
            }
            this.logger.mo85228t(AbstractC25012a.m73372e(list.size(), i14, "Uploading ", " number of firmware event packets for version ", " to cloud"), new AbstractC30556a.a[0]);
            bVar.f66314y = null;
            bVar.f66312w = i15;
            bVar.f66313x = i14;
            bVar.f66311F = 3;
            objM48841e = m48841e(list, bVar);
            if (objM48841e != obj2) {
                return objM48841e;
            }
        }
        return obj2;
    }
}
