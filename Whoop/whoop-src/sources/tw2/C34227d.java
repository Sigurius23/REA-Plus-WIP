package tw2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p273k6.C22222g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p733ry2.C31915d;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: tw2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\b*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Ltw2/d;", "Ltw2/c;", "Landroid/content/Context;", "context", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Ltr2/n;)V", "Landroid/graphics/Bitmap;", "", "maxBytes", "", "j", "(Landroid/graphics/Bitmap;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;", "", "quality", "o", "(Landroid/graphics/Bitmap;I)[B", "l", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Landroid/net/Uri;", "uri", "maxEdge", "m", "(Landroid/net/Uri;I)I", "i", "(Landroid/graphics/Bitmap;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;", "n", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "", "Ltw2/b;", "bounds", "a", "(Ljava/lang/String;Ltw2/b;Lq83/d;)Ljava/lang/Object;", "Landroid/content/Context;", "b", "Ltr2/n;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34227d implements InterfaceC34226c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: tw2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.media.UploadMediaPreparerImpl$prepare$2", m100430f = "UploadMediaPreparerImpl.kt", m100431l = {45, 48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)[B"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f143584E;

        /* JADX INFO: renamed from: F */
        Object f143585F;

        /* JADX INFO: renamed from: G */
        int f143586G;

        /* JADX INFO: renamed from: H */
        int f143587H;

        /* JADX INFO: renamed from: I */
        private /* synthetic */ Object f143588I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f143589J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ C34225b f143590K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ C34227d f143591L;

        /* JADX INFO: renamed from: w */
        Object f143592w;

        /* JADX INFO: renamed from: x */
        Object f143593x;

        /* JADX INFO: renamed from: y */
        Object f143594y;

        /* JADX INFO: renamed from: z */
        Object f143595z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C34225b c34225b, C34227d c34227d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f143589J = str;
            this.f143590K = c34225b;
            this.f143591L = c34227d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f143589J, this.f143590K, this.f143591L, interfaceC30057d);
            aVar.f143588I = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super byte[]> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00df  */
        /* JADX WARN: Code duplicated, block: B:52:0x0116 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #2 {all -> 0x0031, blocks: (B:7:0x002c, B:50:0x0112, B:52:0x0116), top: B:81:0x002c }] */
        /* JADX WARN: Code duplicated, block: B:55:0x013d A[Catch: Exception -> 0x009a, SecurityException -> 0x0178, FileNotFoundException -> 0x0186, OutOfMemoryError -> 0x0194, TryCatch #10 {FileNotFoundException -> 0x0186, SecurityException -> 0x0178, Exception -> 0x009a, OutOfMemoryError -> 0x0194, blocks: (B:53:0x0138, B:55:0x013d, B:57:0x0142, B:63:0x014e, B:65:0x0153, B:67:0x0158, B:68:0x015b, B:21:0x006f, B:23:0x008c, B:28:0x00a1, B:30:0x00a6, B:72:0x015f, B:73:0x0162), top: B:95:0x006f }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0142 A[Catch: Exception -> 0x009a, SecurityException -> 0x0178, FileNotFoundException -> 0x0186, OutOfMemoryError -> 0x0194, TryCatch #10 {FileNotFoundException -> 0x0186, SecurityException -> 0x0178, Exception -> 0x009a, OutOfMemoryError -> 0x0194, blocks: (B:53:0x0138, B:55:0x013d, B:57:0x0142, B:63:0x014e, B:65:0x0153, B:67:0x0158, B:68:0x015b, B:21:0x006f, B:23:0x008c, B:28:0x00a1, B:30:0x00a6, B:72:0x015f, B:73:0x0162), top: B:95:0x006f }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0153 A[Catch: Exception -> 0x009a, SecurityException -> 0x0178, FileNotFoundException -> 0x0186, OutOfMemoryError -> 0x0194, TryCatch #10 {FileNotFoundException -> 0x0186, SecurityException -> 0x0178, Exception -> 0x009a, OutOfMemoryError -> 0x0194, blocks: (B:53:0x0138, B:55:0x013d, B:57:0x0142, B:63:0x014e, B:65:0x0153, B:67:0x0158, B:68:0x015b, B:21:0x006f, B:23:0x008c, B:28:0x00a1, B:30:0x00a6, B:72:0x015f, B:73:0x0162), top: B:95:0x006f }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0158 A[Catch: Exception -> 0x009a, SecurityException -> 0x0178, FileNotFoundException -> 0x0186, OutOfMemoryError -> 0x0194, TryCatch #10 {FileNotFoundException -> 0x0186, SecurityException -> 0x0178, Exception -> 0x009a, OutOfMemoryError -> 0x0194, blocks: (B:53:0x0138, B:55:0x013d, B:57:0x0142, B:63:0x014e, B:65:0x0153, B:67:0x0158, B:68:0x015b, B:21:0x006f, B:23:0x008c, B:28:0x00a1, B:30:0x00a6, B:72:0x015f, B:73:0x0162), top: B:95:0x006f }] */
        /* JADX WARN: Instruction removed from duplicated block: B:52:0x0116, please report this as an issue */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Bitmap bitmapDecodeStream;
            Bitmap bitmap;
            Bitmap bitmap2;
            Bitmap bitmap3;
            int i13;
            byte[] bArr;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f143588I;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f143587H;
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Uri uri = Uri.parse(this.f143589J);
                    int iM108174b = this.f143590K.m108174b();
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = this.f143591L.m108187m(uri, iM108174b);
                        InputStream inputStreamOpenInputStream = this.f143591L.context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            this.f143591L.logger.mo85222m("The picked file could not be opened", new AbstractC30556a.a[0]);
                            return null;
                        }
                        try {
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                            inputStreamOpenInputStream.close();
                            if (bitmapDecodeStream == null) {
                                this.f143591L.logger.mo85222m("The picked file is not a decodable image", new AbstractC30556a.a[0]);
                                return null;
                            }
                            try {
                                Bitmap bitmapM108188n = this.f143591L.m108188n(bitmapDecodeStream, iM108174b);
                                if (bitmapM108188n != bitmapDecodeStream) {
                                    try {
                                        bitmapDecodeStream.recycle();
                                        C34227d c34227d = this.f143591L;
                                        this.f143588I = interfaceC2994c0;
                                        this.f143592w = null;
                                        this.f143593x = null;
                                        this.f143594y = null;
                                        this.f143595z = bitmapDecodeStream;
                                        this.f143584E = bitmapM108188n;
                                        this.f143586G = iM108174b;
                                        this.f143587H = 1;
                                        obj = c34227d.m108183i(bitmapM108188n, uri, this);
                                        if (obj != enumC31071a) {
                                            i13 = iM108174b;
                                            bitmap2 = bitmapM108188n;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bitmap = null;
                                        bitmap3 = bitmapDecodeStream;
                                        bitmap2 = bitmapM108188n;
                                        bitmap3.recycle();
                                        if (bitmap2 != null) {
                                            bitmap2.recycle();
                                        }
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                        }
                                        throw th;
                                    }
                                } else {
                                    C34227d c34227d2 = this.f143591L;
                                    this.f143588I = interfaceC2994c0;
                                    this.f143592w = null;
                                    this.f143593x = null;
                                    this.f143594y = null;
                                    this.f143595z = bitmapDecodeStream;
                                    this.f143584E = bitmapM108188n;
                                    this.f143586G = iM108174b;
                                    this.f143587H = 1;
                                    obj = c34227d2.m108183i(bitmapM108188n, uri, this);
                                    if (obj != enumC31071a) {
                                        i13 = iM108174b;
                                        bitmap2 = bitmapM108188n;
                                    }
                                }
                                return enumC31071a;
                            } catch (Throwable th4) {
                                th = th4;
                                bitmap = null;
                                bitmap2 = null;
                                bitmap3 = bitmapDecodeStream;
                                bitmap3.recycle();
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                AbstractC35854l.m113829i(inputStreamOpenInputStream, th5);
                                throw th6;
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        this.f143591L.logger.mo85222m("The picked file could not be found", new AbstractC30556a.a[0]);
                        return null;
                    } catch (SecurityException unused2) {
                        this.f143591L.logger.mo85222m("Not permitted to read the picked file", new AbstractC30556a.a[0]);
                        return null;
                    } catch (Exception e5) {
                        AbstractC3006f0.m8721o(interfaceC2994c0.getCoroutineContext());
                        this.f143591L.logger.mo85230v("Could not prepare the picked file for upload", e5, new AbstractC30556a.a[0]);
                        return null;
                    } catch (OutOfMemoryError unused3) {
                        this.f143591L.logger.mo85222m("Ran out of memory preparing the picked file", new AbstractC30556a.a[0]);
                        return null;
                    }
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bitmap = (Bitmap) this.f143585F;
                    bitmap2 = (Bitmap) this.f143584E;
                    bitmap3 = (Bitmap) this.f143595z;
                    try {
                        AbstractC34132o.m107864I(obj);
                        bArr = (byte[]) obj;
                        if (bArr == null) {
                            this.f143591L.logger.mo85222m("Could not bring the picked file under " + this.f143590K.getMaxBytes() + " base64 bytes", new AbstractC30556a.a[0]);
                        }
                        bitmap3.recycle();
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        return bArr;
                    } catch (Throwable th7) {
                        th = th7;
                        bitmap3.recycle();
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                }
                int i15 = this.f143586G;
                Bitmap bitmap4 = (Bitmap) this.f143584E;
                bitmapDecodeStream = (Bitmap) this.f143595z;
                try {
                    AbstractC34132o.m107864I(obj);
                    i13 = i15;
                    bitmap2 = bitmap4;
                } catch (Throwable th8) {
                    th = th8;
                    bitmap2 = bitmap4;
                    bitmap = null;
                    bitmap3 = bitmapDecodeStream;
                    bitmap3.recycle();
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    throw th;
                }
                Bitmap bitmap5 = (Bitmap) obj;
                if (bitmap5 != bitmap2) {
                    try {
                        bitmap2.recycle();
                    } catch (Throwable th9) {
                        bitmap = bitmap5;
                        th = th9;
                        bitmap3 = bitmapDecodeStream;
                        bitmap3.recycle();
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                }
                C34227d c34227d3 = this.f143591L;
                Long maxBytes = this.f143590K.getMaxBytes();
                this.f143588I = interfaceC2994c0;
                this.f143592w = null;
                this.f143593x = null;
                this.f143594y = null;
                this.f143595z = bitmapDecodeStream;
                this.f143584E = bitmap2;
                this.f143585F = bitmap5;
                this.f143586G = i13;
                this.f143587H = 2;
                Object objM108184j = c34227d3.m108184j(bitmap5, maxBytes, this);
                if (objM108184j != enumC31071a) {
                    bitmap = bitmap5;
                    obj = objM108184j;
                    bitmap3 = bitmapDecodeStream;
                    bArr = (byte[]) obj;
                    if (bArr == null) {
                        this.f143591L.logger.mo85222m("Could not bring the picked file under " + this.f143590K.getMaxBytes() + " base64 bytes", new AbstractC30556a.a[0]);
                    }
                    bitmap3.recycle();
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    return bArr;
                }
                return enumC31071a;
            } catch (Throwable th10) {
                th = th10;
                bitmap = null;
                bitmap3 = bitmapDecodeStream;
                bitmap3.recycle();
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        }
    }

    public C34227d(Context context, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Object m108183i(Bitmap bitmap, Uri uri, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
        C23465k c23465k;
        try {
            InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    C22222g c22222g = new C22222g(inputStreamOpenInputStream);
                    c23465k = new C23465k(new Integer(c22222g.m63700l()), Boolean.valueOf(c22222g.m63704p()));
                    inputStreamOpenInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(inputStreamOpenInputStream, th3);
                        throw th4;
                    }
                }
            } else {
                c23465k = new C23465k(new Integer(0), Boolean.FALSE);
            }
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(interfaceC30057d.getContext());
            this.logger.mo85228t(AbstractC11266d.m30461o("No usable EXIF orientation, leaving the photo as decoded: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(e5.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
            c23465k = new C23465k(new Integer(0), Boolean.FALSE);
        }
        int iIntValue = ((Number) c23465k.f92937w).intValue();
        boolean zBooleanValue = ((Boolean) c23465k.f92938x).booleanValue();
        if (iIntValue == 0 && !zBooleanValue) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        if (zBooleanValue) {
            matrix.preScale(-1.0f, 1.0f);
        }
        if (iIntValue != 0) {
            matrix.postRotate(iIntValue);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final Object m108184j(Bitmap bitmap, Long l7, InterfaceC30057d<? super byte[]> interfaceC30057d) throws Throwable {
        Bitmap bitmap2;
        Bitmap bitmap3;
        InterfaceC30063j context = interfaceC30057d.getContext();
        C22669g0 c22669g0 = new C22669g0();
        try {
            bitmap2 = bitmap;
            try {
                byte[] bArrM108192b = AbstractC34229f.m108192b(l7, new C31915d(context, bitmap2, c22669g0, this, 9));
                Bitmap bitmap4 = (Bitmap) c22669g0.f89336w;
                if (bitmap4 != null) {
                    bitmap3 = bitmap4 != bitmap2 ? bitmap4 : null;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                }
                return bArrM108192b;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                Bitmap bitmap5 = (Bitmap) c22669g0.f89336w;
                if (bitmap5 == null) {
                    throw th4;
                }
                bitmap3 = bitmap5 != bitmap2 ? bitmap5 : null;
                if (bitmap3 == null) {
                    throw th4;
                }
                bitmap3.recycle();
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            bitmap2 = bitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final byte[] m108185k(InterfaceC30063j interfaceC30063j, Bitmap bitmap, C22669g0 c22669g0, C34227d c34227d, C34224a attempt) {
        AbstractC22676k.m65750j(attempt, "attempt");
        AbstractC3006f0.m8721o(interfaceC30063j);
        if (attempt.getHalved()) {
            Bitmap bitmap2 = (Bitmap) c22669g0.f89336w;
            if (bitmap2 == null) {
                bitmap = c34227d.m108186l(bitmap);
                c22669g0.f89336w = bitmap;
            } else {
                bitmap = bitmap2;
            }
        }
        return c34227d.m108189o(bitmap, attempt.getQuality());
    }

    /* JADX INFO: renamed from: l */
    private final Bitmap m108186l(Bitmap bitmap) {
        int width = bitmap.getWidth() / 2;
        if (width < 1) {
            width = 1;
        }
        int height = bitmap.getHeight() / 2;
        if (height < 1) {
            height = 1;
        }
        return Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final int m108187m(Uri uri, int maxEdge) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                inputStreamOpenInputStream.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        }
        return AbstractC34228e.m108190a(Math.max(options.outWidth, options.outHeight), maxEdge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final Bitmap m108188n(Bitmap bitmap, int i13) {
        int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (iMax <= i13) {
            return bitmap;
        }
        float f13 = i13 / iMax;
        int width = (int) (bitmap.getWidth() * f13);
        if (width < 1) {
            width = 1;
        }
        int height = (int) (bitmap.getHeight() * f13);
        if (height < 1) {
            height = 1;
        }
        return Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    /* JADX INFO: renamed from: o */
    private final byte[] m108189o(Bitmap bitmap, int i13) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.JPEG, i13, byteArrayOutputStream)) {
                throw new IllegalStateException(("JPEG encoding failed at quality " + i13).toString());
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            AbstractC22676k.m65749i(byteArray, "use(...)");
            return byteArray;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    @Override // tw2.InterfaceC34226c
    /* JADX INFO: renamed from: a */
    public Object mo108175a(String str, C34225b c34225b, InterfaceC30057d<? super byte[]> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new a(str, c34225b, this, null), interfaceC30057d);
    }

    public /* synthetic */ C34227d(Context context, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UploadMediaPreparer") : interfaceC34116n);
    }
}
