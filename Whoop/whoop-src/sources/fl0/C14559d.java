package fl0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
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
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import va3.AbstractC35854l;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: fl0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lfl0/d;", "Lfl0/g;", "Landroid/content/Context;", "context", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Ltr2/n;)V", "Landroid/net/Uri;", "uri", "Landroid/graphics/Bitmap;", "bitmap", "g", "(Landroid/net/Uri;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Ll83/k;", "", "c", "(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;", "sampleSize", "a", "(Landroid/net/Uri;ILq83/d;)Ljava/lang/Object;", "", "b", "Landroid/content/Context;", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14559d implements InterfaceC14562g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fl0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AndroidFileSystemProvider$decodeBitmap$2", m100430f = "AndroidFileSystemProvider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lbc3/c0;)Landroid/graphics/Bitmap;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53505w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Uri f53507y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f53508z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, int i13, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53507y = uri;
            this.f53508z = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14559d.this.new a(this.f53507y, this.f53508z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53505w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InputStream inputStreamOpenInputStream = C14559d.this.context.getContentResolver().openInputStream(this.f53507y);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException("Failed to open input stream");
            }
            C14559d c14559d = C14559d.this;
            Uri uri = this.f53507y;
            int i13 = this.f53508z;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = i13;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (bitmapDecodeStream == null) {
                    throw new IllegalStateException("Failed to decode bitmap");
                }
                Bitmap bitmapM41678g = c14559d.m41678g(uri, bitmapDecodeStream);
                inputStreamOpenInputStream.close();
                return bitmapM41678g;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: fl0.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AndroidFileSystemProvider$getFilename$2", m100430f = "AndroidFileSystemProvider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53509w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53510x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Uri f53511y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14559d f53512z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, C14559d c14559d, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53511y = uri;
            this.f53512z = c14559d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f53511y, this.f53512z, interfaceC30057d);
            bVar.f53510x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f53510x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53509w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                String lastPathSegment = this.f53511y.getLastPathSegment();
                if (lastPathSegment == null || lastPathSegment.length() <= 0) {
                    return "image.jpeg";
                }
                int iM125893l0 = AbstractC39414r.m125893l0(lastPathSegment, ".", 0, 6);
                if (iM125893l0 != -1) {
                    lastPathSegment = lastPathSegment.substring(0, iM125893l0);
                    AbstractC22676k.m65749i(lastPathSegment, "substring(...)");
                }
                return lastPathSegment.concat(".jpeg");
            } catch (Exception e5) {
                AbstractC3006f0.m8720n(interfaceC2994c0);
                this.f53512z.logger.mo85228t(AbstractC11266d.m30461o("Failed to get filename ", e5.getMessage()), new AbstractC30556a.a[0]);
                return "image.jpeg";
            }
        }
    }

    /* JADX INFO: renamed from: fl0.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AndroidFileSystemProvider$getImageDimensions$2", m100430f = "AndroidFileSystemProvider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ll83/k;", "", "<anonymous>", "(Lbc3/c0;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53513w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Uri f53515y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53515y = uri;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14559d.this.new c(this.f53515y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23465k> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53513w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InputStream inputStreamOpenInputStream = C14559d.this.context.getContentResolver().openInputStream(this.f53515y);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException("Failed to read image dimensions");
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                C23465k c23465k = new C23465k(new Integer(options.outWidth), new Integer(options.outHeight));
                inputStreamOpenInputStream.close();
                return c23465k;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        }
    }

    public C14559d(Context context, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final Bitmap m41678g(Uri uri, Bitmap bitmap) throws IOException {
        InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            this.logger.mo85228t("Failed to open input stream for EXIF orientation read; returning bitmap unmodified", new AbstractC30556a.a[0]);
            return bitmap;
        }
        try {
            int iM63691c = new C22222g(inputStreamOpenInputStream).m63691c();
            inputStreamOpenInputStream.close();
            C14561f.a aVarM41683a = C14561f.f53517a.m41683a(iM63691c);
            if (aVarM41683a.m41687d()) {
                return bitmap;
            }
            Matrix matrix = new Matrix();
            if (aVarM41683a.getRotationDegrees() != 0.0f) {
                matrix.postRotate(aVarM41683a.getRotationDegrees());
            }
            if (aVarM41683a.getFlipHorizontal()) {
                matrix.postScale(-1.0f, 1.0f);
            }
            if (aVarM41683a.getFlipVertical()) {
                matrix.postScale(1.0f, -1.0f);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
            if (!bitmapCreateBitmap.equals(bitmap)) {
                bitmap.recycle();
            }
            return bitmapCreateBitmap;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(inputStreamOpenInputStream, th3);
                throw th4;
            }
        }
    }

    @Override // fl0.InterfaceC14562g
    /* JADX INFO: renamed from: a */
    public Object mo41679a(Uri uri, int i13, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new a(uri, i13, null), interfaceC30057d);
    }

    @Override // fl0.InterfaceC14562g
    /* JADX INFO: renamed from: b */
    public Object mo41680b(Uri uri, InterfaceC30057d<? super String> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new b(uri, this, null), interfaceC30057d);
    }

    @Override // fl0.InterfaceC14562g
    /* JADX INFO: renamed from: c */
    public Object mo41681c(Uri uri, InterfaceC30057d<? super C23465k> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new c(uri, null), interfaceC30057d);
    }

    public /* synthetic */ C14559d(Context context, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("FileSystemProvider") : interfaceC34116n);
    }
}
