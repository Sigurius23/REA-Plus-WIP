package kd1;

import android.content.Context;
import android.net.Uri;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hy0.EnumC17776p;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import jp2.C21875f;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25260n;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.AbstractC32145e0;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import ud3.AbstractC34799a1;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import va3.AbstractC35854l;
import x83.AbstractC38093j;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: kd1.u */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, m65681d2 = {"Lkd1/u;", "", "Landroid/content/Context;", "context", "Lud3/l0;", "okHttpClient", "Lsr2/y;", "urlProvider", "<init>", "(Landroid/content/Context;Lud3/l0;Lsr2/y;)V", "", QueryParams.URL, "Ljava/io/File;", "i", "(Ljava/lang/String;)Ljava/io/File;", "l", "(Ljava/lang/String;)Ljava/lang/String;", "Lhy0/p;", "type", "Ll83/n;", "j", "(Ljava/lang/String;Lhy0/p;Lq83/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "g", "(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lud3/l0;", "c", "Lsr2/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/io/File;", "cacheDir", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22409u {

    /* JADX INFO: renamed from: e */
    public static final int f87656e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34826l0 okHttpClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: kd1.u$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.util.PdfCacheManager", m100430f = "PdfCacheManager.kt", m100431l = {63}, m100432m = "copyFromUri-gIAlu-s", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f87660w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f87661x;

        /* JADX INFO: renamed from: z */
        int f87663z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f87661x = obj;
            this.f87663z |= Integer.MIN_VALUE;
            Object objM64530g = C22409u.this.m64530g(null, this);
            return objM64530g == EnumC31071a.f128113w ? objM64530g : new C23468n(objM64530g);
        }
    }

    /* JADX INFO: renamed from: kd1.u$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.util.PdfCacheManager$copyFromUri$2", m100430f = "PdfCacheManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ll83/n;", "Ljava/io/File;", "<anonymous>", "(Lbc3/c0;)Ll83/n;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87664w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f87665x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Uri f87667z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87667z = uri;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C22409u.this.new c(this.f87667z, interfaceC30057d);
            cVar.f87665x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23468n> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM107888l;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f87665x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f87664w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C22409u c22409u = C22409u.this;
            String string = this.f87667z.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            File fileM64526i = c22409u.m64526i(string);
            if (fileM64526i.exists() && fileM64526i.length() > 0) {
                return new C23468n(fileM64526i);
            }
            try {
                InputStream inputStreamOpenInputStream = C22409u.this.context.getContentResolver().openInputStream(this.f87667z);
                if (inputStreamOpenInputStream == null) {
                    throw new IllegalStateException("Could not open content URI");
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileM64526i);
                    try {
                        AbstractC32145e0.m100096c(inputStreamOpenInputStream, fileOutputStream);
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        objM107888l = fileM64526i;
                        return new C23468n(objM107888l);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(fileOutputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC35854l.m113829i(inputStreamOpenInputStream, th5);
                        throw th6;
                    }
                }
            } catch (Exception e5) {
                AbstractC3006f0.m8720n(interfaceC2994c0);
                fileM64526i.delete();
                objM107888l = AbstractC34132o.m107888l(e5);
            }
        }
    }

    /* JADX INFO: renamed from: kd1.u$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.util.PdfCacheManager", m100430f = "PdfCacheManager.kt", m100431l = {24}, m100432m = "getOrDownload-0E7RQCE", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f87668E;

        /* JADX INFO: renamed from: w */
        Object f87669w;

        /* JADX INFO: renamed from: x */
        Object f87670x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f87671y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f87671y = obj;
            this.f87668E |= Integer.MIN_VALUE;
            Object objM64531j = C22409u.this.m64531j(null, null, this);
            return objM64531j == EnumC31071a.f128113w ? objM64531j : new C23468n(objM64531j);
        }
    }

    /* JADX INFO: renamed from: kd1.u$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.util.PdfCacheManager$getOrDownload$2", m100430f = "PdfCacheManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ll83/n;", "Ljava/io/File;", "<anonymous>", "(Lbc3/c0;)Ll83/n;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f87673E;

        /* JADX INFO: renamed from: w */
        int f87674w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f87675x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC17776p f87676y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22409u f87677z;

        /* JADX INFO: renamed from: kd1.u$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f87678a;

            static {
                int[] iArr = new int[EnumC17776p.values().length];
                try {
                    iArr[EnumC17776p.RELATIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17776p.ABSOLUTE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f87678a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumC17776p enumC17776p, C22409u c22409u, String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87676y = enumC17776p;
            this.f87677z = c22409u;
            this.f87673E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f87676y, this.f87677z, this.f87673E, interfaceC30057d);
            eVar.f87675x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23468n> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strM8299l;
            Object objM107888l;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f87675x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f87674w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            int i13 = a.f87678a[this.f87676y.ordinal()];
            if (i13 == 1) {
                strM8299l = AbstractC2875y.m8299l(this.f87677z.urlProvider.getApiBaseUrl(), this.f87673E);
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strM8299l = this.f87673E;
            }
            File fileM64526i = this.f87677z.m64526i(strM8299l);
            if (fileM64526i.exists() && fileM64526i.length() > 0) {
                return new C23468n(fileM64526i);
            }
            File file = new File(this.f87677z.m64525h(), AbstractC38093j.m122040n(fileM64526i).concat(".tmp"));
            try {
                C34830n0 c34830n0 = new C34830n0();
                c34830n0.m109905f(strM8299l);
                C34850x0 c34850x0M131549e = this.f87677z.okHttpClient.m109898b(new C34832o0(c34830n0)).m131549e();
                try {
                    if (!c34850x0M131549e.f146788Q) {
                        throw new IllegalStateException("Download failed: " + c34850x0M131549e.f146792z);
                    }
                    AbstractC34799a1 abstractC34799a1 = c34850x0M131549e.f146778G;
                    if (abstractC34799a1 == null) {
                        throw new IllegalStateException("Empty response body");
                    }
                    InputStream inputStreamM109858b = abstractC34799a1.m109858b();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            AbstractC32145e0.m100096c(inputStreamM109858b, fileOutputStream);
                            fileOutputStream.close();
                            inputStreamM109858b.close();
                            c34850x0M131549e.close();
                            boolean zRenameTo = file.renameTo(fileM64526i);
                            objM107888l = fileM64526i;
                            if (!zRenameTo) {
                                file.delete();
                                return new C23468n(AbstractC34132o.m107888l(new IllegalStateException("Failed to move temp file to cache")));
                            }
                            return new C23468n(objM107888l);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC35854l.m113829i(fileOutputStream, th3);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            AbstractC35854l.m113829i(inputStreamM109858b, th5);
                            throw th6;
                        }
                    }
                    return new C23468n(objM107888l);
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        AbstractC35854l.m113829i(c34850x0M131549e, th7);
                        throw th8;
                    }
                }
            } catch (Exception e5) {
                AbstractC3006f0.m8720n(interfaceC2994c0);
                file.delete();
                fileM64526i.delete();
                objM107888l = AbstractC34132o.m107888l(e5);
            }
            AbstractC3006f0.m8720n(interfaceC2994c0);
            file.delete();
            fileM64526i.delete();
            objM107888l = AbstractC34132o.m107888l(e5);
        }
    }

    public C22409u(Context context, C34826l0 okHttpClient, AbstractC32943y urlProvider) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(okHttpClient, "okHttpClient");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        this.context = context;
        this.okHttpClient = okHttpClient;
        this.urlProvider = urlProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final File m64525h() {
        File file = new File(this.context.getCacheDir(), "pdf_preview_cache");
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final File m64526i(String url) {
        return new File(m64525h(), AbstractC2875y.m8299l(m64528l(url), ".pdf"));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m64527k(C22409u c22409u, String str, EnumC17776p enumC17776p, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            enumC17776p = EnumC17776p.ABSOLUTE;
        }
        return c22409u.m64531j(str, enumC17776p, interfaceC30057d);
    }

    /* JADX INFO: renamed from: l */
    private final String m64528l(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC22676k.m65749i(bArrDigest, "digest(...)");
        return AbstractC25260n.m74027C0(bArrDigest, "", new C21875f(27), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final CharSequence m64529m(byte b6) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b6)}, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m64530g(Uri uri, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f87663z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f87663z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM8705K = bVar.f87661x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f87663z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            c cVar = new c(uri, null);
            bVar.f87660w = null;
            bVar.f87663z = 1;
            objM8705K = AbstractC3006f0.m8705K(executorC22364d, cVar, bVar);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m64531j(String str, EnumC17776p enumC17776p, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f87668E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f87668E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM8705K = dVar.f87671y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f87668E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            e eVar = new e(enumC17776p, this, str, null);
            dVar.f87669w = null;
            dVar.f87670x = null;
            dVar.f87668E = 1;
            objM8705K = AbstractC3006f0.m8705K(executorC22364d, eVar, dVar);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }
}
