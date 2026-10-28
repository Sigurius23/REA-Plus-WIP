package gl;

import a33.C0352d;
import al.C0960g;
import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import androidx.profileinstaller.ProfileVerifier;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import p437qt.C30582e;
import p586wk.C37329g;
import p586wk.C37330h;
import p586wk.EnumC37324b;
import p586wk.EnumC37331i;
import pf.AbstractC29125c;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: gl.m */
/* JADX INFO: loaded from: classes.dex */
public final class C15948m {

    /* JADX INFO: renamed from: f */
    public static final C37329g f60362f = C37329g.m119568a(EnumC37324b.f159587y, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g */
    public static final C37329g f60363g = C37329g.m119568a(EnumC37331i.f159596w, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h */
    public static final C37329g f60364h;

    /* JADX INFO: renamed from: i */
    public static final C37329g f60365i;

    /* JADX INFO: renamed from: j */
    public static final C30582e f60366j;

    /* JADX INFO: renamed from: k */
    public static final ArrayDeque f60367k;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0955b f60368a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f60369b;

    /* JADX INFO: renamed from: c */
    public final C0960g f60370c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f60371d;

    /* JADX INFO: renamed from: e */
    public final C15954s f60372e = C15954s.m45019a();

    static {
        C15946k c15946k = C15946k.f60354b;
        Boolean bool = Boolean.FALSE;
        f60364h = C37329g.m119568a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f60365i = C37329g.m119568a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f60366j = new C30582e(20);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC33913l.f142093a;
        f60367k = new ArrayDeque(0);
    }

    public C15948m(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0955b interfaceC0955b, C0960g c0960g) {
        this.f60371d = arrayList;
        AbstractC29125c.m88539p(displayMetrics, "Argument must not be null");
        this.f60369b = displayMetrics;
        this.f60368a = interfaceC0955b;
        this.f60370c = c0960g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r5;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m45013c(a33.C0352d r9, android.graphics.BitmapFactory.Options r10, gl.InterfaceC15947l r11, al.InterfaceC0955b r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.mo45012k()
            r9.m929R()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = gl.AbstractC15958w.m45025c()
            r4.lock()
            android.graphics.Bitmap r9 = r9.m938j(r10)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L67
        L1d:
            java.util.concurrent.locks.Lock r10 = gl.AbstractC15958w.m45025c()
            r10.unlock()
            return r9
        L25:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = p000.AbstractC11266d.m30465s(r1, r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L67
            r1.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L67
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = m45014d(r2)     // Catch: java.lang.Throwable -> L67
            r1.append(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L67
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L67
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L56
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L67
        L56:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L66
            r12.mo2433h(r0)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L67
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L67
            android.graphics.Bitmap r9 = m45013c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L67
            goto L1d
        L65:
            throw r5     // Catch: java.lang.Throwable -> L67
        L66:
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = gl.AbstractC15958w.m45025c()
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.C15948m.m45013c(a33.d, android.graphics.BitmapFactory$Options, gl.l, al.b):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: d */
    public static String m45014d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: e */
    public static void m45015e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: a */
    public final C15938c m45016a(C0352d c0352d, int i13, int i14, C37330h c37330h, InterfaceC15947l interfaceC15947l) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f60370c.m2444c(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, byte[].class);
        synchronized (C15948m.class) {
            arrayDeque = f60367k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m45015e(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC37324b enumC37324b = (EnumC37324b) c37330h.m119569c(f60362f);
        EnumC37331i enumC37331i = (EnumC37331i) c37330h.m119569c(f60363g);
        C15946k c15946k = (C15946k) c37330h.m119569c(C15946k.f60359g);
        boolean zBooleanValue = ((Boolean) c37330h.m119569c(f60364h)).booleanValue();
        C37329g c37329g = f60365i;
        try {
            C15938c c15938cM44994b = C15938c.m44994b(this.f60368a, m45017b(c0352d, options, c15946k, enumC37324b, enumC37331i, c37330h.m119569c(c37329g) != null && ((Boolean) c37330h.m119569c(c37329g)).booleanValue(), i13, i14, zBooleanValue, interfaceC15947l));
            m45015e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return c15938cM44994b;
        } finally {
            m45015e(options);
            ArrayDeque arrayDeque2 = f60367k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f60370c.m2448g(bArr);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.instructions.PhiInsn.getResult()" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:117)
        	at jadx.core.dex.visitors.InitCodeVariables.lambda$collectConnectedVars$1(InitCodeVariables.java:124)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:121)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: b */
    public final android.graphics.Bitmap m45017b(a33.C0352d r43, android.graphics.BitmapFactory.Options r44, gl.C15946k r45, p586wk.EnumC37324b r46, p586wk.EnumC37331i r47, boolean r48, int r49, int r50, boolean r51, gl.InterfaceC15947l r52) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.C15948m.m45017b(a33.d, android.graphics.BitmapFactory$Options, gl.k, wk.b, wk.i, boolean, int, int, boolean, gl.l):android.graphics.Bitmap");
    }
}
