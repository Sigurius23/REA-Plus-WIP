package we0;

import android.net.Uri;
import c93.InterfaceC4351m;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadResponse;
import com.whoop.labfileupload.domain.LabFileUploadApi;
import com.whoop.labfileupload.domain.models.ExternalDataUploadMetadata;
import com.whoop.labfileupload.domain.models.ExternalDataUploadResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import ns1.AbstractC27104b;
import od1.InterfaceC27844g;
import p236j.C21062a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import ps1.C29503a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.C34820i0;

/* JADX INFO: renamed from: we0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\u00020\u00032\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"Lwe0/f;", "Lod1/g;", "Lwe0/a;", "Lwe0/b;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Lcom/whoop/labfileupload/domain/LabFileUploadApi;", "labFileUploadApi", "Lps1/a;", "testUploadFileProcessor", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/labfileupload/domain/LabFileUploadApi;Lps1/a;Ltr2/n;)V", "Lj/a;", "result", "", "Lns1/b;", "k", "(Lj/a;Lq83/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "uris", "l", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "j", "(Lq83/d;)Ljava/lang/Object;", "processedFiles", "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;", "uploadMetadata", "m", "(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Lcom/whoop/labfileupload/domain/LabFileUploadApi;", "c", "Lps1/a;", "d", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37216f implements InterfaceC27844g<AbstractC37211a, InterfaceC37212b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LabFileUploadApi labFileUploadApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29503a testUploadFileProcessor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: we0.f$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor", m100430f = "TestUploadInteractor.kt", m100431l = {169}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f159088w;

        /* JADX INFO: renamed from: y */
        int f159090y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159088w = obj;
            this.f159090y |= Integer.MIN_VALUE;
            return C37216f.this.m119261j(this);
        }
    }

    /* JADX INFO: renamed from: we0.f$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor$fetchData$response$1", m100430f = "TestUploadInteractor.kt", m100431l = {170}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f159091w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37216f.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159091w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C37216f.this.api;
            this.f159091w = 1;
            Object testUpload = advancedLabsApi.getTestUpload(this);
            return testUpload == enumC31071a ? enumC31071a : testUpload;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super TestUploadResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: we0.f$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159093w;

        /* JADX INFO: renamed from: we0.f$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159094w;

            /* JADX INFO: renamed from: we0.f$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor$interact$$inlined$map$1$2", m100430f = "TestUploadInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42585a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159095E;

                /* JADX INFO: renamed from: F */
                Object f159096F;

                /* JADX INFO: renamed from: G */
                Object f159097G;

                /* JADX INFO: renamed from: H */
                int f159098H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159099w;

                /* JADX INFO: renamed from: x */
                int f159100x;

                /* JADX INFO: renamed from: y */
                Object f159101y;

                public C42585a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159099w = obj;
                    this.f159100x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f159094w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42585a c42585a;
                if (interfaceC30057d instanceof C42585a) {
                    c42585a = (C42585a) interfaceC30057d;
                    int i13 = c42585a.f159100x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42585a.f159100x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42585a = new C42585a(interfaceC30057d);
                    }
                } else {
                    c42585a = new C42585a(interfaceC30057d);
                }
                Object obj2 = c42585a.f159099w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42585a.f159100x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159094w;
                    InterfaceC37212b result = ((a) obj).getResult();
                    c42585a.f159101y = null;
                    c42585a.f159095E = null;
                    c42585a.f159096F = null;
                    c42585a.f159097G = null;
                    c42585a.f159098H = 0;
                    c42585a.f159100x = 1;
                    if (interfaceC13062m.emit(result, c42585a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f159093w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159093w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: we0.f$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor$interact$$inlined$transform$1", m100430f = "TestUploadInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159103w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f159104x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f159105y;

        /* JADX INFO: renamed from: we0.f$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159106w;

            /* JADX INFO: renamed from: we0.f$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor$interact$$inlined$transform$1$1", m100430f = "TestUploadInteractor.kt", m100431l = {40, 41, 45}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42586a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159107E;

                /* JADX INFO: renamed from: F */
                Object f159108F;

                /* JADX INFO: renamed from: G */
                Object f159109G;

                /* JADX INFO: renamed from: H */
                int f159110H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159111w;

                /* JADX INFO: renamed from: x */
                int f159112x;

                /* JADX INFO: renamed from: z */
                Object f159114z;

                public C42586a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159111w = obj;
                    this.f159112x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f159106w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
            
                if (r2.emit(r10, r0) == r1) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
            
                r4 = r9;
                r9 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
            
                if (r2.emit(r10, r0) == r1) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L31;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof we0.C37216f.e.a.C42586a
                    if (r0 == 0) goto L13
                    r0 = r10
                    we0.f$e$a$a r0 = (we0.C37216f.e.a.C42586a) r0
                    int r1 = r0.f159112x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f159112x = r1
                    goto L18
                L13:
                    we0.f$e$a$a r0 = new we0.f$e$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f159111w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f159112x
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r5) goto L43
                    if (r2 == r4) goto L43
                    if (r2 != r3) goto L3b
                    java.lang.Object r9 = r0.f159109G
                    ec3.m r9 = (ec3.InterfaceC13062m) r9
                    java.lang.Object r9 = r0.f159108F
                    we0.a r9 = (we0.AbstractC37211a) r9
                    java.lang.Object r9 = r0.f159107E
                    q83.d r9 = (q83.InterfaceC30057d) r9
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto La7
                L3b:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L43:
                    int r9 = r0.f159110H
                    java.lang.Object r2 = r0.f159109G
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f159108F
                    we0.a r4 = (we0.AbstractC37211a) r4
                    java.lang.Object r5 = r0.f159107E
                    q83.d r5 = (q83.InterfaceC30057d) r5
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto L78
                L55:
                    p505ts.AbstractC34132o.m107864I(r10)
                    ec3.m r2 = r8.f159106w
                    we0.a r9 = (we0.AbstractC37211a) r9
                    boolean r10 = r9 instanceof we0.AbstractC37211a.c
                    r7 = 0
                    if (r10 == 0) goto L7b
                    we0.a$d r10 = we0.AbstractC37211a.d.f159064a
                    r0.f159114z = r6
                    r0.f159107E = r6
                    r0.f159108F = r9
                    r0.f159109G = r2
                    r0.f159110H = r7
                    r0.f159112x = r5
                    java.lang.Object r10 = r2.emit(r10, r0)
                    if (r10 != r1) goto L76
                    goto La6
                L76:
                    r4 = r9
                    r9 = r7
                L78:
                    r7 = r9
                    r9 = r4
                    goto L94
                L7b:
                    boolean r10 = r9 instanceof we0.AbstractC37211a.h
                    if (r10 == 0) goto L94
                    we0.a$i r10 = we0.AbstractC37211a.i.f159070a
                    r0.f159114z = r6
                    r0.f159107E = r6
                    r0.f159108F = r9
                    r0.f159109G = r2
                    r0.f159110H = r7
                    r0.f159112x = r4
                    java.lang.Object r10 = r2.emit(r10, r0)
                    if (r10 != r1) goto L76
                    goto La6
                L94:
                    r0.f159114z = r6
                    r0.f159107E = r6
                    r0.f159108F = r6
                    r0.f159109G = r6
                    r0.f159110H = r7
                    r0.f159112x = r3
                    java.lang.Object r9 = r2.emit(r9, r0)
                    if (r9 != r1) goto La7
                La6:
                    return r1
                La7:
                    l83.a0 r9 = l83.C23454a0.f92919a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: we0.C37216f.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f159105y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f159105y, interfaceC30057d);
            eVar.f159104x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159103w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f159104x;
                InterfaceC13058l interfaceC13058l = this.f159105y;
                a aVar = new a(interfaceC13062m);
                this.f159104x = null;
                this.f159103w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: we0.f$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor$interact$2", m100430f = "TestUploadInteractor.kt", m100431l = {57, 68, 86, 125}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lwe0/f$a;", "previousData", "Lwe0/a;", "action", "<anonymous>", "(Lwe0/f$a;Lwe0/a;)Lwe0/f$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        Object f159116w;

        /* JADX INFO: renamed from: x */
        int f159117x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f159118y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f159119z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, AbstractC37211a abstractC37211a, InterfaceC30057d<? super a> interfaceC30057d) {
            f fVar = C37216f.this.new f(interfaceC30057d);
            fVar.f159118y = aVar;
            fVar.f159119z = abstractC37211a;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        
            if (r10 == r2) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
        
            if (r10 == r2) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
        
            if (r10 == r2) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01a7, code lost:
        
            if (r10 == r2) goto L78;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 531
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: we0.C37216f.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: we0.f$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor", m100430f = "TestUploadInteractor.kt", m100431l = {155}, m100432m = "processFilePickerResult", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f159120w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f159121x;

        /* JADX INFO: renamed from: z */
        int f159123z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159121x = obj;
            this.f159123z |= Integer.MIN_VALUE;
            return C37216f.this.m119262k(null, this);
        }
    }

    /* JADX INFO: renamed from: we0.f$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor", m100430f = "TestUploadInteractor.kt", m100431l = {163}, m100432m = "processImagesSelection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f159124w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f159125x;

        /* JADX INFO: renamed from: z */
        int f159127z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159125x = obj;
            this.f159127z |= Integer.MIN_VALUE;
            return C37216f.this.m119263l(null, this);
        }
    }

    /* JADX INFO: renamed from: we0.f$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor", m100430f = "TestUploadInteractor.kt", m100431l = {207}, m100432m = "tryUploadFiles", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f159128E;

        /* JADX INFO: renamed from: G */
        int f159130G;

        /* JADX INFO: renamed from: w */
        Object f159131w;

        /* JADX INFO: renamed from: x */
        Object f159132x;

        /* JADX INFO: renamed from: y */
        Object f159133y;

        /* JADX INFO: renamed from: z */
        Object f159134z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159128E = obj;
            this.f159130G |= Integer.MIN_VALUE;
            return C37216f.this.m119264m(null, null, this);
        }
    }

    /* JADX INFO: renamed from: we0.f$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor$tryUploadFiles$response$1", m100430f = "TestUploadInteractor.kt", m100431l = {208}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f159135w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C34820i0> f159137y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ExternalDataUploadMetadata f159138z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<C34820i0> list, ExternalDataUploadMetadata externalDataUploadMetadata, InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f159137y = list;
            this.f159138z = externalDataUploadMetadata;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37216f.this.new j(this.f159137y, this.f159138z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159135w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            LabFileUploadApi labFileUploadApi = C37216f.this.labFileUploadApi;
            List<C34820i0> list = this.f159137y;
            ExternalDataUploadMetadata externalDataUploadMetadata = this.f159138z;
            this.f159135w = 1;
            Object objUploadFiles = labFileUploadApi.uploadFiles(list, externalDataUploadMetadata, this);
            return objUploadFiles == enumC31071a ? enumC31071a : objUploadFiles;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<ExternalDataUploadResponse>> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C37216f(AdvancedLabsApi api, LabFileUploadApi labFileUploadApi, C29503a testUploadFileProcessor, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(labFileUploadApi, "labFileUploadApi");
        AbstractC22676k.m65750j(testUploadFileProcessor, "testUploadFileProcessor");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.labFileUploadApi = labFileUploadApi;
        this.testUploadFileProcessor = testUploadFileProcessor;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m119261j(InterfaceC30057d<? super InterfaceC37212b> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f159090y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f159090y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f159088w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f159090y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(null);
            bVar2.f159090y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch test upload data", cVar, bVar2, 2, null);
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
            return new C37213c((TestUploadResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC37212b.a.f159071a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m119262k(C21062a c21062a, InterfaceC30057d<? super List<? extends AbstractC27104b>> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f159123z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f159123z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM90143d = gVar.f159121x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f159123z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM90143d);
            C29503a c29503a = this.testUploadFileProcessor;
            gVar.f159120w = null;
            gVar.f159123z = 1;
            objM90143d = c29503a.m90143d(c21062a, gVar);
            if (objM90143d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM90143d);
        }
        Collection collection = (Collection) objM90143d;
        if (!collection.isEmpty()) {
            return collection;
        }
        this.logger.mo85226q("File processing returned empty list - all files were skipped or failed", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m119263l(List<? extends Uri> list, InterfaceC30057d<? super List<? extends AbstractC27104b>> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f159127z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f159127z = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM90144e = hVar.f159125x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f159127z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM90144e);
            C29503a c29503a = this.testUploadFileProcessor;
            hVar.f159124w = null;
            hVar.f159127z = 1;
            objM90144e = c29503a.m90144e(list, hVar);
            if (objM90144e == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM90144e);
        }
        Collection collection = (Collection) objM90144e;
        if (!collection.isEmpty()) {
            return collection;
        }
        this.logger.mo85226q("Image processing returned empty list - all images were skipped or failed", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Object m119264m(List<? extends AbstractC27104b> list, ExternalDataUploadMetadata externalDataUploadMetadata, InterfaceC30057d<? super InterfaceC37212b> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f159130G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f159130G = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM108729b = iVar2.f159128E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar2.f159130G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM108729b);
                if (list == null) {
                    this.logger.mo85222m("Cannot upload files - no processed files available", new AbstractC30556a.a[0]);
                    return InterfaceC37212b.a.f159071a;
                }
                if (externalDataUploadMetadata == null) {
                    this.logger.mo85222m("Cannot upload files - no upload metadata available", new AbstractC30556a.a[0]);
                    return InterfaceC37212b.a.f159071a;
                }
                List<? extends AbstractC27104b> list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC27104b) it.next()).getFilePath());
                }
                C29503a.b bVarM90145f = this.testUploadFileProcessor.m90145f(arrayList);
                if (!(bVarM90145f instanceof C29503a.b.C42187b)) {
                    if (!(bVarM90145f instanceof C29503a.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.logger.mo85222m("Failed to prepare files for upload: " + ((C29503a.b.a) bVarM90145f).getMessage(), new AbstractC30556a.a[0]);
                    return InterfaceC37212b.a.f159071a;
                }
                List<C34820i0> listM90148a = ((C29503a.b.C42187b) bVarM90145f).m90148a();
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                j jVar = new j(listM90148a, externalDataUploadMetadata, null);
                iVar2.f159131w = null;
                iVar2.f159132x = null;
                iVar2.f159133y = null;
                iVar2.f159134z = null;
                iVar2.f159130G = 1;
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
                ExternalDataUploadResponse externalDataUploadResponse = (ExternalDataUploadResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                return new InterfaceC37212b.c(externalDataUploadResponse != null ? externalDataUploadResponse.getNavigation() : null);
            }
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85222m("File upload failed: " + ((InterfaceC34385a.b) interfaceC34385a).getException().getMessage(), new AbstractC30556a.a[0]);
            return InterfaceC37212b.a.f159071a;
        } catch (Exception e5) {
            this.logger.mo85230v("File upload exception", e5, new AbstractC30556a.a[0]);
            return InterfaceC37212b.a.f159071a;
        }
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new d(AbstractC13091v.m36612v(new C13060l1(new a(null, null, null, null, 15, null), new C13084s1(new e(upstream, null)), new f(null)), 1));
    }

    /* JADX INFO: renamed from: we0.f$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lwe0/f$a;", "", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "response", "", "Lns1/b;", "processedFiles", "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;", "uploadMetadata", "Lwe0/b;", "result", "<init>", "(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;)V", "a", "(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;)Lwe0/f$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "d", "()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;", "f", "()Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;", "Lwe0/b;", "e", "()Lwe0/b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TestUploadResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<AbstractC27104b> processedFiles;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final ExternalDataUploadMetadata uploadMetadata;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC37212b result;

        /* JADX WARN: Multi-variable type inference failed */
        public a(TestUploadResponse testUploadResponse, List<? extends AbstractC27104b> list, ExternalDataUploadMetadata externalDataUploadMetadata, InterfaceC37212b result) {
            AbstractC22676k.m65750j(result, "result");
            this.response = testUploadResponse;
            this.processedFiles = list;
            this.uploadMetadata = externalDataUploadMetadata;
            this.result = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m119265b(a aVar, TestUploadResponse testUploadResponse, List list, ExternalDataUploadMetadata externalDataUploadMetadata, InterfaceC37212b interfaceC37212b, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                testUploadResponse = aVar.response;
            }
            if ((i13 & 2) != 0) {
                list = aVar.processedFiles;
            }
            if ((i13 & 4) != 0) {
                externalDataUploadMetadata = aVar.uploadMetadata;
            }
            if ((i13 & 8) != 0) {
                interfaceC37212b = aVar.result;
            }
            return aVar.m119266a(testUploadResponse, list, externalDataUploadMetadata, interfaceC37212b);
        }

        /* JADX INFO: renamed from: a */
        public final a m119266a(TestUploadResponse response, List<? extends AbstractC27104b> processedFiles, ExternalDataUploadMetadata uploadMetadata, InterfaceC37212b result) {
            AbstractC22676k.m65750j(result, "result");
            return new a(response, processedFiles, uploadMetadata, result);
        }

        /* JADX INFO: renamed from: c */
        public final List<AbstractC27104b> m119267c() {
            return this.processedFiles;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TestUploadResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC37212b getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.response, aVar.response) && AbstractC22676k.m65745e(this.processedFiles, aVar.processedFiles) && AbstractC22676k.m65745e(this.uploadMetadata, aVar.uploadMetadata) && AbstractC22676k.m65745e(this.result, aVar.result);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ExternalDataUploadMetadata getUploadMetadata() {
            return this.uploadMetadata;
        }

        public int hashCode() {
            TestUploadResponse testUploadResponse = this.response;
            int iHashCode = (testUploadResponse == null ? 0 : testUploadResponse.hashCode()) * 31;
            List<AbstractC27104b> list = this.processedFiles;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            ExternalDataUploadMetadata externalDataUploadMetadata = this.uploadMetadata;
            return this.result.hashCode() + ((iHashCode2 + (externalDataUploadMetadata != null ? externalDataUploadMetadata.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "InternalData(response=" + this.response + ", processedFiles=" + this.processedFiles + ", uploadMetadata=" + this.uploadMetadata + ", result=" + this.result + ")";
        }

        public /* synthetic */ a(TestUploadResponse testUploadResponse, List list, ExternalDataUploadMetadata externalDataUploadMetadata, InterfaceC37212b interfaceC37212b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : testUploadResponse, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? null : externalDataUploadMetadata, (i13 & 8) != 0 ? InterfaceC37212b.b.f159072a : interfaceC37212b);
        }
    }

    public /* synthetic */ C37216f(AdvancedLabsApi advancedLabsApi, LabFileUploadApi labFileUploadApi, C29503a c29503a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, labFileUploadApi, c29503a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TestUploadInteractor") : interfaceC34116n);
    }
}
