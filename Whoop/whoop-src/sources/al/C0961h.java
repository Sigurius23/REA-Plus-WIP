package al;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p437qt.C30582e;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: al.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0961h implements InterfaceC0955b {

    /* JADX INFO: renamed from: J */
    public static final Bitmap.Config f3552J = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: E */
    public long f3553E;

    /* JADX INFO: renamed from: F */
    public int f3554F;

    /* JADX INFO: renamed from: G */
    public int f3555G;

    /* JADX INFO: renamed from: H */
    public int f3556H;

    /* JADX INFO: renamed from: I */
    public int f3557I;

    /* JADX INFO: renamed from: w */
    public final C0965l f3558w;

    /* JADX INFO: renamed from: x */
    public final Set f3559x;

    /* JADX INFO: renamed from: y */
    public final C30582e f3560y;

    /* JADX INFO: renamed from: z */
    public final long f3561z;

    public C0961h(long j7) {
        C0965l c0965l = new C0965l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f3561z = j7;
        this.f3558w = c0965l;
        this.f3559x = setUnmodifiableSet;
        this.f3560y = new C30582e(3);
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: a */
    public final void mo2430a(int i13) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i13);
        }
        if (i13 >= 40 || i13 >= 20) {
            mo2431b();
        } else if (i13 >= 20 || i13 == 15) {
            m2451f(this.f3561z / 2);
        }
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: b */
    public final void mo2431b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m2451f(0L);
    }

    /* JADX INFO: renamed from: c */
    public final void m2449c() {
        Log.v("LruBitmapPool", "Hits=" + this.f3554F + ", misses=" + this.f3555G + ", puts=" + this.f3556H + ", evictions=" + this.f3557I + ", currentSize=" + this.f3553E + ", maxSize=" + this.f3561z + "\nStrategy=" + this.f3558w);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Bitmap m2450d(int i13, int i14, Bitmap.Config config) {
        Bitmap bitmapM2455b;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM2455b = this.f3558w.m2455b(i13, i14, config != null ? config : f3552J);
            if (bitmapM2455b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb4 = new StringBuilder("Missing bitmap=");
                    this.f3558w.getClass();
                    sb4.append(C0965l.m2453c(AbstractC33913l.m107267b(i13, i14, config), config));
                    Log.d("LruBitmapPool", sb4.toString());
                }
                this.f3555G++;
            } else {
                this.f3554F++;
                long j7 = this.f3553E;
                this.f3558w.getClass();
                this.f3553E = j7 - ((long) AbstractC33913l.m107268c(bitmapM2455b));
                this.f3560y.getClass();
                bitmapM2455b.setHasAlpha(true);
                bitmapM2455b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb5 = new StringBuilder("Get bitmap=");
                this.f3558w.getClass();
                sb5.append(C0965l.m2453c(AbstractC33913l.m107267b(i13, i14, config), config));
                Log.v("LruBitmapPool", sb5.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m2449c();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return bitmapM2455b;
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: e */
    public final Bitmap mo2432e(int i13, int i14, Bitmap.Config config) {
        Bitmap bitmapM2450d = m2450d(i13, i14, config);
        if (bitmapM2450d != null) {
            return bitmapM2450d;
        }
        if (config == null) {
            config = f3552J;
        }
        return Bitmap.createBitmap(i13, i14, config);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m2451f(long j7) {
        while (this.f3553E > j7) {
            try {
                C0965l c0965l = this.f3558w;
                Bitmap bitmap = (Bitmap) c0965l.f3572b.m16052d0();
                if (bitmap != null) {
                    c0965l.m2454a(bitmap, Integer.valueOf(AbstractC33913l.m107268c(bitmap)));
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m2449c();
                    }
                    this.f3553E = 0L;
                    return;
                }
                this.f3560y.getClass();
                long j13 = this.f3553E;
                this.f3558w.getClass();
                this.f3553E = j13 - ((long) AbstractC33913l.m107268c(bitmap));
                this.f3557I++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Evicting bitmap=");
                    this.f3558w.getClass();
                    sb4.append(C0965l.m2453c(AbstractC33913l.m107268c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb4.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m2449c();
                }
                bitmap.recycle();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: h */
    public final synchronized void mo2433h(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f3558w.getClass();
                if (AbstractC33913l.m107268c(bitmap) <= this.f3561z && this.f3559x.contains(bitmap.getConfig())) {
                    this.f3558w.getClass();
                    int iM107268c = AbstractC33913l.m107268c(bitmap);
                    this.f3558w.m2457e(bitmap);
                    this.f3560y.getClass();
                    this.f3556H++;
                    this.f3553E += (long) iM107268c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb4 = new StringBuilder("Put bitmap in pool=");
                        this.f3558w.getClass();
                        sb4.append(C0965l.m2453c(AbstractC33913l.m107268c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb4.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m2449c();
                    }
                    m2451f(this.f3561z);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb5 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f3558w.getClass();
                sb5.append(C0965l.m2453c(AbstractC33913l.m107268c(bitmap), bitmap.getConfig()));
                sb5.append(", is mutable: ");
                sb5.append(bitmap.isMutable());
                sb5.append(", is allowed config: ");
                sb5.append(this.f3559x.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb5.toString());
            }
            bitmap.recycle();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: o */
    public final Bitmap mo2434o(int i13, int i14, Bitmap.Config config) {
        Bitmap bitmapM2450d = m2450d(i13, i14, config);
        if (bitmapM2450d != null) {
            bitmapM2450d.eraseColor(0);
            return bitmapM2450d;
        }
        if (config == null) {
            config = f3552J;
        }
        return Bitmap.createBitmap(i13, i14, config);
    }
}
