package ix0;

import com.whoop.researchPacket.api.ResearchMetricsApi;
import eu0.InterfaceC13641b;
import java.util.Map;
import js0.AbstractC21909c;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;

/* JADX INFO: renamed from: ix0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lix0/e;", "Lix0/d;", "Leu0/b;", "repository", "Lcom/whoop/researchPacket/api/ResearchMetricsApi;", "researchMetricsApi", "Ljs0/c;", "configurationRepository", "Ltr2/n;", "logger", "<init>", "(Leu0/b;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Ltr2/n;)V", "", "Lgu0/c;", "batch", "", "d", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lic/u;", "a", "(Lq83/d;)Ljava/lang/Object;", "Leu0/b;", "b", "Lcom/whoop/researchPacket/api/ResearchMetricsApi;", "c", "Ljs0/c;", "Ltr2/n;", "e", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21016e implements InterfaceC21015d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13641b repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ResearchMetricsApi researchMetricsApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ix0.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.rawdata.rev2.Rev2RawDataUploaderImpl", m100430f = "Rev2RawDataUploaderImpl.kt", m100431l = {56}, m100432m = "send", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f79559E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f79560F;

        /* JADX INFO: renamed from: H */
        int f79562H;

        /* JADX INFO: renamed from: w */
        Object f79563w;

        /* JADX INFO: renamed from: x */
        Object f79564x;

        /* JADX INFO: renamed from: y */
        Object f79565y;

        /* JADX INFO: renamed from: z */
        Object f79566z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79560F = obj;
            this.f79562H |= Integer.MIN_VALUE;
            return C21016e.this.m58589d(null, this);
        }
    }

    /* JADX INFO: renamed from: ix0.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.rawdata.rev2.Rev2RawDataUploaderImpl$send$response$1", m100430f = "Rev2RawDataUploaderImpl.kt", m100431l = {57}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f79567w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34846v0 f79569y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Map<String, String> f79570z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC34846v0 abstractC34846v0, Map<String, String> map, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f79569y = abstractC34846v0;
            this.f79570z = map;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21016e.this.new c(this.f79569y, this.f79570z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79567w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ResearchMetricsApi researchMetricsApi = C21016e.this.researchMetricsApi;
            AbstractC34846v0 abstractC34846v0 = this.f79569y;
            Map<String, String> map = this.f79570z;
            this.f79567w = 1;
            Object objUploadRev2RawData = researchMetricsApi.uploadRev2RawData(abstractC34846v0, map, this);
            return objUploadRev2RawData == enumC31071a ? enumC31071a : objUploadRev2RawData;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ix0.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.rawdata.rev2.Rev2RawDataUploaderImpl", m100430f = "Rev2RawDataUploaderImpl.kt", m100431l = {38, 41, 42}, m100432m = "upload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f79571E;

        /* JADX INFO: renamed from: F */
        Object f79572F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f79573G;

        /* JADX INFO: renamed from: I */
        int f79575I;

        /* JADX INFO: renamed from: w */
        int f79576w;

        /* JADX INFO: renamed from: x */
        int f79577x;

        /* JADX INFO: renamed from: y */
        int f79578y;

        /* JADX INFO: renamed from: z */
        int f79579z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79573G = obj;
            this.f79575I |= Integer.MIN_VALUE;
            return C21016e.this.mo58586a(this);
        }
    }

    public C21016e(InterfaceC13641b repository, ResearchMetricsApi researchMetricsApi, AbstractC21909c configurationRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(researchMetricsApi, "researchMetricsApi");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.repository = repository;
        this.researchMetricsApi = researchMetricsApi;
        this.configurationRepository = configurationRepository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f1 -> B:24:0x00f4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m58589d(java.util.List<gu0.C16211c> r13, q83.InterfaceC30057d<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.C21016e.m58589d(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:104:0x0268 A[LOOP:0: B:99:0x0241->B:104:0x0268, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0273 A[EDGE_INSN: B:125:0x0273->B:106:0x0273 BREAK  A[LOOP:0: B:99:0x0241->B:104:0x0268], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x02b2 -> B:15:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ix0.InterfaceC21015d
    /* JADX INFO: renamed from: a */
    public java.lang.Object mo58586a(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r23) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.C21016e.mo58586a(q83.d):java.lang.Object");
    }

    public /* synthetic */ C21016e(InterfaceC13641b interfaceC13641b, ResearchMetricsApi researchMetricsApi, AbstractC21909c abstractC21909c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC13641b, researchMetricsApi, abstractC21909c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("Rev2RawDataUploader") : interfaceC34116n);
    }
}
