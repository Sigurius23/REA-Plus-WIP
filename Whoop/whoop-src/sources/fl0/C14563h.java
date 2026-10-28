package fl0;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.ImageUploadRequest;
import com.whoop.bot.models.conversation.ImageUploadRequestBody;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: fl0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001a\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f¨\u0006 "}, m65681d2 = {"Lfl0/h;", "", "Lfl0/g;", "fileSystemProvider", "Lq83/j;", "dispatcher", "Ltr2/n;", "logger", "<init>", "(Lfl0/g;Lq83/j;Ltr2/n;)V", "Landroid/net/Uri;", "uri", "", "f", "(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;", "", "width", "height", "maxSize", "e", "(III)I", "Landroid/graphics/Bitmap;", "bitmap", "c", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "Lcom/whoop/bot/models/conversation/ImageUploadRequest;", "d", "a", "Lfl0/g;", "b", "Lq83/j;", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14563h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14562g fileSystemProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC30063j dispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fl0.h$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.ImageFileHandler$buildImageUploadRequest$2", m100430f = "ImageFileHandler.kt", m100431l = {21, C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/bot/models/conversation/ImageUploadRequest;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/bot/models/conversation/ImageUploadRequest;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f53524w;

        /* JADX INFO: renamed from: x */
        int f53525x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Uri f53527z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53527z = uri;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14563h.this.new a(this.f53527z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ImageUploadRequest> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53525x;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f53524w;
                    AbstractC34132o.m107864I(obj);
                }
                return new ImageUploadRequest(new ImageUploadRequestBody(str, (String) obj, "image/jpeg"));
            }
            AbstractC34132o.m107864I(obj);
            C14563h c14563h = C14563h.this;
            Uri uri = this.f53527z;
            this.f53525x = 1;
            obj = c14563h.m41692f(uri, this);
            if (obj != enumC31071a) {
            }
            return enumC31071a;
            String str2 = (String) obj;
            if (str2 == null) {
                str2 = "";
            }
            InterfaceC14562g interfaceC14562g = C14563h.this.fileSystemProvider;
            Uri uri2 = this.f53527z;
            this.f53524w = str2;
            this.f53525x = 2;
            Object objMo41680b = interfaceC14562g.mo41680b(uri2, this);
            if (objMo41680b != enumC31071a) {
                str = str2;
                obj = objMo41680b;
                return new ImageUploadRequest(new ImageUploadRequestBody(str, (String) obj, "image/jpeg"));
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: fl0.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.ImageFileHandler", m100430f = "ImageFileHandler.kt", m100431l = {31, 34}, m100432m = "uriToBase64", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f53528E;

        /* JADX INFO: renamed from: G */
        int f53530G;

        /* JADX INFO: renamed from: w */
        Object f53531w;

        /* JADX INFO: renamed from: x */
        int f53532x;

        /* JADX INFO: renamed from: y */
        int f53533y;

        /* JADX INFO: renamed from: z */
        int f53534z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f53528E = obj;
            this.f53530G |= Integer.MIN_VALUE;
            return C14563h.this.m41692f(null, this);
        }
    }

    public C14563h(InterfaceC14562g fileSystemProvider, InterfaceC30063j dispatcher, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(fileSystemProvider, "fileSystemProvider");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(logger, "logger");
        this.fileSystemProvider = fileSystemProvider;
        this.dispatcher = dispatcher;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final String m41690c(Bitmap bitmap) {
        return C14560e.f53516a.m41682a(bitmap);
    }

    /* JADX INFO: renamed from: e */
    private final int m41691e(int width, int height, int maxSize) {
        int i13 = 1;
        while (true) {
            if (width / i13 <= maxSize && height / i13 <= maxSize) {
                return i13;
            }
            i13 *= 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m41692f(android.net.Uri r8, q83.InterfaceC30057d<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof fl0.C14563h.b
            if (r0 == 0) goto L13
            r0 = r9
            fl0.h$b r0 = (fl0.C14563h.b) r0
            int r1 = r0.f53530G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53530G = r1
            goto L18
        L13:
            fl0.h$b r0 = new fl0.h$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53528E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f53530G
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r8 = r0.f53531w
            android.net.Uri r8 = (android.net.Uri) r8
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L2f
            goto L7c
        L2f:
            r8 = move-exception
            goto L83
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f53531w
            android.net.Uri r8 = (android.net.Uri) r8
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L2f
            goto L51
        L41:
            p505ts.AbstractC34132o.m107864I(r9)
            fl0.g r9 = r7.fileSystemProvider     // Catch: java.lang.Exception -> L2f
            r0.f53531w = r8     // Catch: java.lang.Exception -> L2f
            r0.f53530G = r5     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r9.mo41681c(r8, r0)     // Catch: java.lang.Exception -> L2f
            if (r9 != r1) goto L51
            goto L7b
        L51:
            l83.k r9 = (l83.C23465k) r9     // Catch: java.lang.Exception -> L2f
            java.lang.Object r2 = r9.f92937w     // Catch: java.lang.Exception -> L2f
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Exception -> L2f
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r9.f92938x     // Catch: java.lang.Exception -> L2f
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Exception -> L2f
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L2f
            r5 = 1024(0x400, float:1.435E-42)
            int r5 = r7.m41691e(r2, r9, r5)     // Catch: java.lang.Exception -> L2f
            fl0.g r6 = r7.fileSystemProvider     // Catch: java.lang.Exception -> L2f
            r0.f53531w = r3     // Catch: java.lang.Exception -> L2f
            r0.f53532x = r2     // Catch: java.lang.Exception -> L2f
            r0.f53533y = r9     // Catch: java.lang.Exception -> L2f
            r0.f53534z = r5     // Catch: java.lang.Exception -> L2f
            r0.f53530G = r4     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r6.mo41679a(r8, r5, r0)     // Catch: java.lang.Exception -> L2f
            if (r9 != r1) goto L7c
        L7b:
            return r1
        L7c:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9     // Catch: java.lang.Exception -> L2f
            java.lang.String r8 = r7.m41690c(r9)     // Catch: java.lang.Exception -> L2f
            return r8
        L83:
            q83.j r9 = r0.getContext()
            bc3.AbstractC3006f0.m8721o(r9)
            tr2.n r9 = r7.logger
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "Failed to convert uri to base64 "
            java.lang.String r8 = p000.AbstractC11266d.m30461o(r0, r8)
            r0 = 0
            qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r0]
            r9.mo85228t(r8, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fl0.C14563h.m41692f(android.net.Uri, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final Object m41693d(Uri uri, InterfaceC30057d<? super ImageUploadRequest> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher, new a(uri, null), interfaceC30057d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14563h(InterfaceC14562g interfaceC14562g, InterfaceC30063j interfaceC30063j, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        this(interfaceC14562g, interfaceC30063j, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ImageFileHandler") : interfaceC34116n);
    }
}
