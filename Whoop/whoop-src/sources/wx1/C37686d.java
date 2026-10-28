package wx1;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.api.FileDownloaderApi;
import java.io.File;
import l83.C23454a0;
import or2.C28144a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;

/* JADX INFO: renamed from: wx1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!¨\u0006\""}, m65681d2 = {"Lwx1/d;", "", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "fileDownloaderApi", "Lor2/a0;", "fileManager", "Ltr2/n;", "logger", "Lq83/j;", "ioContext", "<init>", "(Lcom/whoop/data/remote/api/FileDownloaderApi;Lor2/a0;Ltr2/n;Lq83/j;)V", "", "labelUrl", "Lu02/a;", "Lud3/a1;", "e", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "responseBody", "fileName", "Ljava/io/File;", "f", "(Lud3/a1;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/membership/returns/domain/models/DownloadButton;", "button", "d", "(Lcom/whoop/membership/returns/domain/models/DownloadButton;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "b", "Lor2/a0;", "c", "Ltr2/n;", "Lq83/j;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37686d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FileDownloaderApi fileDownloaderApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28144a0 fileManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: wx1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.domain.ReturnsPdfHandler", m100430f = "ReturnsPdfHandler.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER, 24}, m100432m = "applyPdfPath$membership_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f161475E;

        /* JADX INFO: renamed from: G */
        int f161477G;

        /* JADX INFO: renamed from: w */
        Object f161478w;

        /* JADX INFO: renamed from: x */
        Object f161479x;

        /* JADX INFO: renamed from: y */
        Object f161480y;

        /* JADX INFO: renamed from: z */
        int f161481z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f161475E = obj;
            this.f161477G |= Integer.MIN_VALUE;
            return C37686d.this.m121112d(null, this);
        }
    }

    /* JADX INFO: renamed from: wx1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.domain.ReturnsPdfHandler$getPdf$2", m100430f = "ReturnsPdfHandler.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lud3/a1;", "<anonymous>", "()Lud3/a1;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f161482w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f161484y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f161484y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37686d.this.new b(this.f161484y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161482w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FileDownloaderApi fileDownloaderApi = C37686d.this.fileDownloaderApi;
            String str = this.f161484y;
            this.f161482w = 1;
            Object objDownloadFile = fileDownloaderApi.downloadFile(str, this);
            return objDownloadFile == enumC31071a ? enumC31071a : objDownloadFile;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: wx1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.domain.ReturnsPdfHandler$savePdf$2", m100430f = "ReturnsPdfHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ljava/io/File;", "<anonymous>", "(Lbc3/c0;)Ljava/io/File;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC34799a1 f161485E;

        /* JADX INFO: renamed from: w */
        int f161486w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f161487x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f161489z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, AbstractC34799a1 abstractC34799a1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161489z = str;
            this.f161485E = abstractC34799a1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C37686d.this.new c(this.f161489z, this.f161485E, interfaceC30057d);
            cVar.f161487x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super File> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f161487x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f161486w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                return C37686d.this.fileManager.m85164h(this.f161489z, this.f161485E);
            } catch (Exception e5) {
                AbstractC3006f0.m8721o(interfaceC2994c0.getCoroutineContext());
                C37686d.this.logger.mo85230v("Failed to save pdf file", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    public C37686d(FileDownloaderApi fileDownloaderApi, C28144a0 fileManager, InterfaceC34116n logger, InterfaceC30063j ioContext) {
        AbstractC22676k.m65750j(fileDownloaderApi, "fileDownloaderApi");
        AbstractC22676k.m65750j(fileManager, "fileManager");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        this.fileDownloaderApi = fileDownloaderApi;
        this.fileManager = fileManager;
        this.logger = logger;
        this.ioContext = ioContext;
    }

    /* JADX INFO: renamed from: e */
    private final Object m121110e(String str, InterfaceC30057d<? super InterfaceC34385a<? extends AbstractC34799a1>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, "Failed to download pdf", new b(str, null), interfaceC30057d, 2, null);
    }

    /* JADX INFO: renamed from: f */
    private final Object m121111f(AbstractC34799a1 abstractC34799a1, String str, InterfaceC30057d<? super File> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.ioContext, new c(str, abstractC34799a1, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m121112d(com.whoop.membership.returns.domain.models.DownloadButton r10, q83.InterfaceC30057d<? super java.lang.String> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof wx1.C37686d.a
            if (r0 == 0) goto L13
            r0 = r11
            wx1.d$a r0 = (wx1.C37686d.a) r0
            int r1 = r0.f161477G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161477G = r1
            goto L18
        L13:
            wx1.d$a r0 = new wx1.d$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f161475E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f161477G
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r10 = r0.f161480y
            ud3.a1 r10 = (ud3.AbstractC34799a1) r10
            java.lang.Object r10 = r0.f161479x
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f161478w
            com.whoop.membership.returns.domain.models.DownloadButton r10 = (com.whoop.membership.returns.domain.models.DownloadButton) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L9d
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            java.lang.Object r10 = r0.f161479x
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f161478w
            com.whoop.membership.returns.domain.models.DownloadButton r2 = (com.whoop.membership.returns.domain.models.DownloadButton) r2
            p505ts.AbstractC34132o.m107864I(r11)
            goto L82
        L4c:
            p505ts.AbstractC34132o.m107864I(r11)
            java.lang.String r11 = r10.getText()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            p715kotlin.jvm.internal.AbstractC22676k.m65749i(r11, r2)
            java.lang.String r2 = " "
            java.lang.String r7 = "_"
            java.lang.String r11 = yb3.AbstractC39421y.m125926K(r11, r2, r7, r3)
            java.lang.String r2 = "whoop_"
            java.lang.String r7 = ".pdf"
            java.lang.String r11 = p088dc.AbstractC11895b.m31996o(r2, r11, r7)
            java.lang.String r10 = r10.getUrl()
            r0.f161478w = r6
            r0.f161479x = r11
            r0.f161477G = r5
            java.lang.Object r10 = r9.m121110e(r10, r0)
            if (r10 != r1) goto L7f
            goto L9c
        L7f:
            r8 = r11
            r11 = r10
            r10 = r8
        L82:
            u02.a r11 = (u02.InterfaceC34385a) r11
            java.lang.Object r11 = u02.AbstractC34386b.m108737b(r11)
            ud3.a1 r11 = (ud3.AbstractC34799a1) r11
            if (r11 == 0) goto La6
            r0.f161478w = r6
            r0.f161479x = r6
            r0.f161480y = r6
            r0.f161481z = r3
            r0.f161477G = r4
            java.lang.Object r11 = r9.m121111f(r11, r10, r0)
            if (r11 != r1) goto L9d
        L9c:
            return r1
        L9d:
            java.io.File r11 = (java.io.File) r11
            if (r11 == 0) goto La6
            java.lang.String r10 = r11.getPath()
            return r10
        La6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wx1.C37686d.m121112d(com.whoop.membership.returns.domain.models.DownloadButton, q83.d):java.lang.Object");
    }
}
