package d60;

import c93.InterfaceC4351m;
import com.whoop.access.reconfirmlabs.domain.GetReconfirmLabsRequest;
import com.whoop.access.reconfirmlabs.domain.models.ReconfirmLabsScreenResponse;
import com.whoop.labfileupload.domain.LabFileUploadApi;
import com.whoop.labfileupload.domain.models.ExternalDataUploadMetadata;
import com.whoop.labfileupload.domain.models.ExternalDataUploadSource;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import ns1.AbstractC27104b;
import od1.InterfaceC27844g;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import ps1.C29503a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.C34820i0;

/* JADX INFO: renamed from: d60.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u0018*\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Ld60/d;", "Lod1/g;", "Ld60/b;", "Ld60/c;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/labfileupload/domain/LabFileUploadApi;", "labFileUploadApi", "Lps1/a;", "testUploadFileProcessor", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lcom/whoop/labfileupload/domain/LabFileUploadApi;Lps1/a;Ltr2/n;)V", "", "nextScreen", "Lec3/l;", "m", "(Ljava/lang/String;)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "cacheResult", "l", "(Lpm0/a$c;)Ld60/c;", "Ld60/d$a;", "cacheState", "j", "(Ld60/d$a;Ld60/c;)Ld60/d$a;", "", "Lns1/b;", "files", "k", "(Ld60/d$a;Ljava/util/List;)Ld60/d$a;", "previous", "Ld60/e;", "n", "(Ld60/d$a;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lcom/whoop/labfileupload/domain/LabFileUploadApi;", "c", "Lps1/a;", "d", "Ltr2/n;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11730d implements InterfaceC27844g<AbstractC11728b, C11729c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LabFileUploadApi labFileUploadApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29503a testUploadFileProcessor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d60.d$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ReconfirmLabsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f37911w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f37912x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f37913y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C11730d f37914z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C11730d c11730d) {
            super(3, interfaceC30057d);
            this.f37914z = c11730d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC11728b abstractC11728b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f37914z);
            bVar.f37912x = interfaceC13062m;
            bVar.f37913y = abstractC11728b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f37911w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f37912x;
                AbstractC11728b abstractC11728b = (AbstractC11728b) this.f37913y;
                if (abstractC11728b instanceof AbstractC11728b.e) {
                    c13084s1 = new f(this.f37914z.m31350m(((AbstractC11728b.e) abstractC11728b).getNextScreen()));
                } else {
                    c13084s1 = abstractC11728b instanceof AbstractC11728b.f ? new C13084s1(new d(abstractC11728b, null)) : new C0456u(abstractC11728b, 1);
                }
                this.f37912x = null;
                this.f37913y = null;
                this.f37911w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC11728b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: d60.d$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f37915w;

        /* JADX INFO: renamed from: d60.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f37916w;

            /* JADX INFO: renamed from: d60.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$interact$$inlined$map$1$2", m100430f = "ReconfirmLabsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41453a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f37917E;

                /* JADX INFO: renamed from: F */
                Object f37918F;

                /* JADX INFO: renamed from: G */
                Object f37919G;

                /* JADX INFO: renamed from: H */
                int f37920H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f37921w;

                /* JADX INFO: renamed from: x */
                int f37922x;

                /* JADX INFO: renamed from: y */
                Object f37923y;

                public C41453a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f37921w = obj;
                    this.f37922x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f37916w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41453a c41453a;
                if (interfaceC30057d instanceof C41453a) {
                    c41453a = (C41453a) interfaceC30057d;
                    int i13 = c41453a.f37922x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41453a.f37922x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41453a = new C41453a(interfaceC30057d);
                    }
                } else {
                    c41453a = new C41453a(interfaceC30057d);
                }
                Object obj2 = c41453a.f37921w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41453a.f37922x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f37916w;
                    C11729c state = ((a) obj).getState();
                    c41453a.f37923y = null;
                    c41453a.f37917E = null;
                    c41453a.f37918F = null;
                    c41453a.f37919G = null;
                    c41453a.f37920H = 0;
                    c41453a.f37922x = 1;
                    if (interfaceC13062m.emit(state, c41453a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l) {
            this.f37915w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f37915w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d60.d$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$interact$1$2", m100430f = "ReconfirmLabsInteractor.kt", m100431l = {58, 59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ld60/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f37925w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f37926x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC11728b f37927y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC11728b abstractC11728b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f37927y = abstractC11728b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f37927y, interfaceC30057d);
            dVar.f37926x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f37926x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f37925w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L3e
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                d60.b$g r6 = d60.AbstractC11728b.g.f37898a
                r5.f37926x = r0
                r5.f37925w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L3d
            L30:
                d60.b r6 = r5.f37927y
                r2 = 0
                r5.f37926x = r2
                r5.f37925w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L3e
            L3d:
                return r1
            L3e:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: d60.C11730d.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: d60.d$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$interact$2", m100430f = "ReconfirmLabsInteractor.kt", m100431l = {69, 72, 81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ld60/d$a;", "previous", "Ld60/b;", "action", "<anonymous>", "(Ld60/d$a;Ld60/b;)Ld60/d$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f37928E;

        /* JADX INFO: renamed from: w */
        Object f37930w;

        /* JADX INFO: renamed from: x */
        Object f37931x;

        /* JADX INFO: renamed from: y */
        int f37932y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f37933z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, AbstractC11728b abstractC11728b, InterfaceC30057d<? super a> interfaceC30057d) {
            e eVar = C11730d.this.new e(interfaceC30057d);
            eVar.f37933z = aVar;
            eVar.f37928E = abstractC11728b;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
        
            if (r1 == r3) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
        
            if (r1 == r3) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
        
            if (r1 == r3) goto L41;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 309
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d60.C11730d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: d60.d$f */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f37934w;

        /* JADX INFO: renamed from: d60.d$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f37935w;

            /* JADX INFO: renamed from: d60.d$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "ReconfirmLabsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41454a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f37936E;

                /* JADX INFO: renamed from: F */
                Object f37937F;

                /* JADX INFO: renamed from: G */
                Object f37938G;

                /* JADX INFO: renamed from: H */
                int f37939H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f37940w;

                /* JADX INFO: renamed from: x */
                int f37941x;

                /* JADX INFO: renamed from: y */
                Object f37942y;

                public C41454a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f37940w = obj;
                    this.f37941x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f37935w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41454a c41454a;
                if (interfaceC30057d instanceof C41454a) {
                    c41454a = (C41454a) interfaceC30057d;
                    int i13 = c41454a.f37941x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41454a.f37941x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41454a = new C41454a(interfaceC30057d);
                    }
                } else {
                    c41454a = new C41454a(interfaceC30057d);
                }
                Object obj2 = c41454a.f37940w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41454a.f37941x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f37935w;
                    AbstractC11728b.a aVar = new AbstractC11728b.a((C11729c) obj);
                    c41454a.f37942y = null;
                    c41454a.f37936E = null;
                    c41454a.f37937F = null;
                    c41454a.f37938G = null;
                    c41454a.f37939H = 0;
                    c41454a.f37941x = 1;
                    if (interfaceC13062m.emit(aVar, c41454a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public f(InterfaceC13058l interfaceC13058l) {
            this.f37934w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f37934w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d60.d$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$loadCache$$inlined$cacheAPI$1", m100430f = "ReconfirmLabsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f37944w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f37945x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f37946y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f37947z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f37947z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f37947z);
            gVar.f37945x = interfaceC13062m;
            gVar.f37946y = c26832c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f37944w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f37945x;
                C26832c c26832c = (C26832c) this.f37946y;
                InterfaceC26834e interfaceC26834e = this.f37947z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ReconfirmLabsScreenResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ReconfirmLabsScreenResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f37945x = null;
                this.f37946y = null;
                this.f37944w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: d60.d$h */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f37948w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11730d f37949x;

        /* JADX INFO: renamed from: d60.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f37950w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11730d f37951x;

            /* JADX INFO: renamed from: d60.d$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$loadCache$$inlined$map$1$2", m100430f = "ReconfirmLabsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41455a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f37952E;

                /* JADX INFO: renamed from: F */
                Object f37953F;

                /* JADX INFO: renamed from: G */
                Object f37954G;

                /* JADX INFO: renamed from: H */
                int f37955H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f37956w;

                /* JADX INFO: renamed from: x */
                int f37957x;

                /* JADX INFO: renamed from: y */
                Object f37958y;

                public C41455a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f37956w = obj;
                    this.f37957x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11730d c11730d) {
                this.f37950w = interfaceC13062m;
                this.f37951x = c11730d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41455a c41455a;
                C11729c c11729cM31349l;
                if (interfaceC30057d instanceof C41455a) {
                    c41455a = (C41455a) interfaceC30057d;
                    int i13 = c41455a.f37957x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41455a.f37957x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41455a = new C41455a(interfaceC30057d);
                    }
                } else {
                    c41455a = new C41455a(interfaceC30057d);
                }
                Object obj2 = c41455a.f37956w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41455a.f37957x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f37950w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c11729cM31349l = new C11729c(InterfaceC11727a.b.f37889a, null, null, null, null, 30, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c11729cM31349l = new C11729c(null, (ReconfirmLabsScreenResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), null, null, null, 29, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c11729cM31349l = new C11729c(null, (ReconfirmLabsScreenResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), null, null, null, 29, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c11729cM31349l = new C11729c(null, (ReconfirmLabsScreenResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), null, null, null, 29, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c11729cM31349l = this.f37951x.m31349l((InterfaceC29354a.c) interfaceC29354a);
                    }
                    c41455a.f37958y = null;
                    c41455a.f37952E = null;
                    c41455a.f37953F = null;
                    c41455a.f37954G = null;
                    c41455a.f37955H = 0;
                    c41455a.f37957x = 1;
                    if (interfaceC13062m.emit(c11729cM31349l, c41455a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public h(InterfaceC13058l interfaceC13058l, C11730d c11730d) {
            this.f37948w = interfaceC13058l;
            this.f37949x = c11730d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f37948w.collect(new a(interfaceC13062m, this.f37949x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d60.d$i */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor", m100430f = "ReconfirmLabsInteractor.kt", m100431l = {167}, m100432m = "upload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f37960E;

        /* JADX INFO: renamed from: G */
        int f37962G;

        /* JADX INFO: renamed from: w */
        Object f37963w;

        /* JADX INFO: renamed from: x */
        Object f37964x;

        /* JADX INFO: renamed from: y */
        Object f37965y;

        /* JADX INFO: renamed from: z */
        Object f37966z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f37960E = obj;
            this.f37962G |= Integer.MIN_VALUE;
            return C11730d.this.m31351n(null, this);
        }
    }

    /* JADX INFO: renamed from: d60.d$j */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$upload$response$1", m100430f = "ReconfirmLabsInteractor.kt", m100431l = {DateTimeConstants.HOURS_PER_WEEK}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f37967w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C34820i0> f37969y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ExternalDataUploadMetadata f37970z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<C34820i0> list, ExternalDataUploadMetadata externalDataUploadMetadata, InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f37969y = list;
            this.f37970z = externalDataUploadMetadata;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11730d.this.new j(this.f37969y, this.f37970z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f37967w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            LabFileUploadApi labFileUploadApi = C11730d.this.labFileUploadApi;
            List<C34820i0> list = this.f37969y;
            ExternalDataUploadMetadata externalDataUploadMetadata = this.f37970z;
            this.f37967w = 1;
            Object objUploadAccessFiles = labFileUploadApi.uploadAccessFiles(list, externalDataUploadMetadata, this);
            return objUploadAccessFiles == enumC31071a ? enumC31071a : objUploadAccessFiles;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<String>> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C11730d(InterfaceC26834e cachedApiSource, LabFileUploadApi labFileUploadApi, C29503a testUploadFileProcessor, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(labFileUploadApi, "labFileUploadApi");
        AbstractC22676k.m65750j(testUploadFileProcessor, "testUploadFileProcessor");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.labFileUploadApi = labFileUploadApi;
        this.testUploadFileProcessor = testUploadFileProcessor;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final a m31347j(a aVar, C11729c c11729c) {
        ReconfirmLabsScreenResponse response = c11729c.getResponse();
        if (response == null) {
            response = aVar.getResponse();
        }
        ReconfirmLabsScreenResponse reconfirmLabsScreenResponse = response;
        C11729c state = aVar.getState();
        InterfaceC11727a currentDialogType = c11729c.getCurrentDialogType();
        ReconfirmLabsScreenResponse response2 = c11729c.getResponse();
        if (response2 == null) {
            response2 = aVar.getState().getResponse();
        }
        return a.m31352b(aVar, reconfirmLabsScreenResponse, null, C11729c.m31334b(state, currentDialogType, response2, null, InterfaceC11731e.b.f37972a, null, 4, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final a m31348k(a aVar, List<? extends AbstractC27104b> list) {
        if (!list.isEmpty()) {
            return a.m31352b(aVar, null, list, C11729c.m31334b(aVar.getState(), null, null, list, InterfaceC11731e.b.f37972a, null, 3, null), 1, null);
        }
        this.logger.mo85226q("File processing returned empty list - all files were skipped or failed", new AbstractC30556a.a[0]);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C11729c m31349l(InterfaceC29354a.c<ReconfirmLabsScreenResponse> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C11729c(InterfaceC11727a.d.f37891a, null, null, null, null, 30, null) : new C11729c(InterfaceC11727a.c.f37890a, null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m31350m(String nextScreen) {
        return new h(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetReconfirmLabsRequest(nextScreen), 1), AbstractC12350b.m34570S("AccessReconfirmLabsScope"), null, 2, null), new g(null, this.cachedApiSource)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: n */
    public final Object m31351n(a aVar, InterfaceC30057d<? super InterfaceC11731e> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f37962G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f37962G = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM108729b = iVar2.f37960E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar2.f37962G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            List<AbstractC27104b> listM31354c = aVar.m31354c();
            if (listM31354c.isEmpty()) {
                this.logger.mo85222m("Cannot upload files - no processed files available", new AbstractC30556a.a[0]);
                return InterfaceC11731e.a.f37971a;
            }
            C29503a c29503a = this.testUploadFileProcessor;
            List<AbstractC27104b> list = listM31354c;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC27104b) it.next()).getFilePath());
            }
            C29503a.b bVarM90145f = c29503a.m90145f(arrayList);
            if (!(bVarM90145f instanceof C29503a.b.C42187b)) {
                if (!(bVarM90145f instanceof C29503a.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.logger.mo85222m(AbstractC11266d.m30461o("Failed to prepare files for upload: ", ((C29503a.b.a) bVarM90145f).getMessage()), new AbstractC30556a.a[0]);
                return InterfaceC11731e.a.f37971a;
            }
            List<C34820i0> listM90148a = ((C29503a.b.C42187b) bVarM90145f).m90148a();
            ReconfirmLabsScreenResponse response = aVar.getResponse();
            String title = response != null ? response.getTitle() : null;
            if (title == null) {
                title = "";
            }
            String string = DateTime.now().withZone(DateTimeZone.UTC).toString("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
            AbstractC22676k.m65749i(string, "toString(...)");
            ExternalDataUploadMetadata externalDataUploadMetadata = new ExternalDataUploadMetadata(title, string, ExternalDataUploadSource.ACCESS);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            j jVar = new j(listM90148a, externalDataUploadMetadata, null);
            iVar2.f37963w = null;
            iVar2.f37964x = null;
            iVar2.f37965y = null;
            iVar2.f37966z = null;
            iVar2.f37962G = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to upload files", jVar, iVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC11731e.c((String) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85230v("File upload failed", ((InterfaceC34385a.b) interfaceC34385a).getException(), new AbstractC30556a.a[0]);
        return InterfaceC11731e.a.f37971a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new c(new C13060l1(new a(null, null, null, 7, null), AbstractC13091v.m36590P(upstream, new b(null, this)), new e(null)));
    }

    /* JADX INFO: renamed from: d60.d$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Ld60/d$a;", "", "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "response", "", "Lns1/b;", "processedFiles", "Ld60/c;", "state", "<init>", "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;)V", "a", "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;)Ld60/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "d", "()Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ld60/c;", "e", "()Ld60/c;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ReconfirmLabsScreenResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<AbstractC27104b> processedFiles;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C11729c state;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ReconfirmLabsScreenResponse reconfirmLabsScreenResponse, List<? extends AbstractC27104b> processedFiles, C11729c state) {
            AbstractC22676k.m65750j(processedFiles, "processedFiles");
            AbstractC22676k.m65750j(state, "state");
            this.response = reconfirmLabsScreenResponse;
            this.processedFiles = processedFiles;
            this.state = state;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m31352b(a aVar, ReconfirmLabsScreenResponse reconfirmLabsScreenResponse, List list, C11729c c11729c, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                reconfirmLabsScreenResponse = aVar.response;
            }
            if ((i13 & 2) != 0) {
                list = aVar.processedFiles;
            }
            if ((i13 & 4) != 0) {
                c11729c = aVar.state;
            }
            return aVar.m31353a(reconfirmLabsScreenResponse, list, c11729c);
        }

        /* JADX INFO: renamed from: a */
        public final a m31353a(ReconfirmLabsScreenResponse response, List<? extends AbstractC27104b> processedFiles, C11729c state) {
            AbstractC22676k.m65750j(processedFiles, "processedFiles");
            AbstractC22676k.m65750j(state, "state");
            return new a(response, processedFiles, state);
        }

        /* JADX INFO: renamed from: c */
        public final List<AbstractC27104b> m31354c() {
            return this.processedFiles;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ReconfirmLabsScreenResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C11729c getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.response, aVar.response) && AbstractC22676k.m65745e(this.processedFiles, aVar.processedFiles) && AbstractC22676k.m65745e(this.state, aVar.state);
        }

        public int hashCode() {
            ReconfirmLabsScreenResponse reconfirmLabsScreenResponse = this.response;
            return this.state.hashCode() + AbstractC11895b.m31983b((reconfirmLabsScreenResponse == null ? 0 : reconfirmLabsScreenResponse.hashCode()) * 31, 31, this.processedFiles);
        }

        public String toString() {
            return "InternalData(response=" + this.response + ", processedFiles=" + this.processedFiles + ", state=" + this.state + ")";
        }

        public /* synthetic */ a(ReconfirmLabsScreenResponse reconfirmLabsScreenResponse, List list, C11729c c11729c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : reconfirmLabsScreenResponse, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? new C11729c(InterfaceC11727a.b.f37889a, null, null, null, null, 30, null) : c11729c);
        }
    }

    public /* synthetic */ C11730d(InterfaceC26834e interfaceC26834e, LabFileUploadApi labFileUploadApi, C29503a c29503a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, labFileUploadApi, c29503a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ReconfirmLabsInteractor") : interfaceC34116n);
    }
}
