package li;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import e93.AbstractC12889b;
import f93.C14289a;
import fi.AbstractC14504j;
import fi.AbstractC14505k;
import fi.C14509o;
import gi.C15870a;
import gi.C15878i;
import gi.EnumC15873d;
import gi.EnumC15876g;
import gi.InterfaceC15872c;
import gl.C15961z;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import ne3.AbstractC26632p;
import p029b5.AbstractC2722a;
import p461rh.AbstractC31426o;
import p474s.AbstractC32004s;
import p477s2.AbstractC32069a;
import q83.InterfaceC30057d;
import sh.C32475a;
import sh.C32481g;
import sh.C32483i;
import sh.C32492r;
import sh.InterfaceC32485k;
import sh.InterfaceC32491q;
import va3.AbstractC35854l;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: li.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C24098g implements InterfaceC32485k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32491q f95180a;

    /* JADX INFO: renamed from: b */
    public final C14509o f95181b;

    public C24098g(InterfaceC32491q interfaceC32491q, C14509o c14509o) {
        this.f95180a = interfaceC32491q;
        this.f95181b = c14509o;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[PHI: r3
      0x0056: PHI (r3v20 int) = (r3v17 int), (r3v17 int), (r3v39 int), (r3v39 int) binds: [B:35:0x0070, B:37:0x0076, B:22:0x0049, B:24:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // sh.InterfaceC32485k
    /* JADX INFO: renamed from: a */
    public final Object mo71006a(InterfaceC30057d interfaceC30057d) throws Exception {
        boolean zIsTerminated;
        int iIntValue;
        Integer numM125932Q;
        int iIntValue2;
        Integer numM125932Q2;
        C15878i c15878i;
        Long lM125933R;
        C14509o c14509o;
        long j7;
        Bitmap bitmapM7676c;
        boolean zIsTerminated2;
        Integer numM125932Q3;
        Integer numM125932Q4;
        Integer numM125932Q5;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            m71008c(mediaMetadataRetriever, this.f95180a);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
            int iIntValue3 = (strExtractMetadata == null || (numM125932Q5 = AbstractC39421y.m125932Q(strExtractMetadata)) == null) ? 0 : numM125932Q5.intValue();
            if (iIntValue3 == 90 || iIntValue3 == 270) {
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                iIntValue = (strExtractMetadata2 == null || (numM125932Q2 = AbstractC39421y.m125932Q(strExtractMetadata2)) == null) ? 0 : numM125932Q2.intValue();
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
                if (strExtractMetadata3 == null || (numM125932Q = AbstractC39421y.m125932Q(strExtractMetadata3)) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = numM125932Q.intValue();
                }
            } else {
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
                iIntValue = (strExtractMetadata4 == null || (numM125932Q4 = AbstractC39421y.m125932Q(strExtractMetadata4)) == null) ? 0 : numM125932Q4.intValue();
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
                if (strExtractMetadata5 == null || (numM125932Q3 = AbstractC39421y.m125932Q(strExtractMetadata5)) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = numM125932Q3.intValue();
                }
            }
            int width = iIntValue;
            int height = iIntValue2;
            C14509o c14509o2 = this.f95181b;
            if (width <= 0 || height <= 0) {
                c15878i = C15878i.f59992c;
            } else {
                C15878i c15878i2 = c14509o2.f53004b;
                EnumC15876g enumC15876g = c14509o2.f53005c;
                long jM99537f = AbstractC32004s.m99537f(width, height, c15878i2, enumC15876g, (C15878i) AbstractC31426o.m96742f(c14509o2, AbstractC14504j.f52990b));
                double dM99538g = AbstractC32004s.m99538g(width, height, (int) (jM99537f >> 32), (int) (jM99537f & 4294967295L), enumC15876g);
                if (c14509o2.f53006d == EnumC15873d.f59981x && dM99538g > 1.0d) {
                    dM99538g = 1.0d;
                }
                int iM36257W = AbstractC12889b.m36257W(((double) width) * dM99538g);
                int iM36257W2 = AbstractC12889b.m36257W(dM99538g * ((double) height));
                if (iM36257W <= 0) {
                    throw new IllegalArgumentException("px must be > 0.");
                }
                C15870a c15870a = new C15870a(iM36257W);
                if (iM36257W2 <= 0) {
                    throw new IllegalArgumentException("px must be > 0.");
                }
                c15878i = new C15878i(c15870a, new C15870a(iM36257W2));
            }
            C15878i c15878i3 = c15878i;
            long jLongValue = ((Number) AbstractC31426o.m96742f(c14509o2, AbstractC24092a.f95169b)).longValue();
            long jLongValue2 = 0;
            if (jLongValue < 0) {
                double dDoubleValue = ((Number) AbstractC31426o.m96742f(c14509o2, AbstractC24092a.f95170c)).doubleValue();
                if (dDoubleValue >= 0.0d) {
                    String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(9);
                    if (strExtractMetadata6 != null && (lM125933R = AbstractC39421y.m125933R(strExtractMetadata6)) != null) {
                        jLongValue2 = lM125933R.longValue();
                    }
                    jLongValue = AbstractC12889b.m36259Y(dDoubleValue * jLongValue2) * ((long) 1000);
                } else {
                    jLongValue = 0;
                }
            }
            InterfaceC15872c interfaceC15872c = c15878i3.f59993a;
            InterfaceC15872c interfaceC15872c2 = c15878i3.f59994b;
            int i13 = Build.VERSION.SDK_INT;
            C14289a c14289a = AbstractC24092a.f95168a;
            Bitmap bitmapM7677d = null;
            if (((Number) AbstractC31426o.m96742f(c14509o2, c14289a)).intValue() >= 0) {
                int iIntValue4 = ((Number) AbstractC31426o.m96742f(c14509o2, c14289a)).intValue();
                Bitmap.Config config = (Bitmap.Config) AbstractC31426o.m96742f(c14509o2, AbstractC14505k.f52994b);
                MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
                bitmapParams.setPreferredConfig(config);
                bitmapM7676c = mediaMetadataRetriever.getFrameAtIndex(iIntValue4, bitmapParams);
                if (bitmapM7676c != null) {
                    width = bitmapM7676c.getWidth();
                    height = bitmapM7676c.getHeight();
                    c14509o = c14509o2;
                    j7 = jLongValue;
                    bitmapM7677d = bitmapM7676c;
                } else {
                    c14509o = c14509o2;
                    j7 = jLongValue;
                }
            } else {
                boolean z4 = interfaceC15872c instanceof C15870a;
                C14289a c14289a2 = AbstractC24092a.f95171d;
                if (z4 && (interfaceC15872c2 instanceof C15870a)) {
                    int iIntValue5 = ((Number) AbstractC31426o.m96742f(c14509o2, c14289a2)).intValue();
                    int i14 = ((C15870a) interfaceC15872c).f59978a;
                    int i15 = ((C15870a) interfaceC15872c2).f59978a;
                    Bitmap.Config config2 = (Bitmap.Config) AbstractC31426o.m96742f(c14509o2, AbstractC14505k.f52994b);
                    j7 = jLongValue;
                    bitmapM7677d = AbstractC2722a.m7677d(mediaMetadataRetriever, j7, iIntValue5, i14, i15, config2);
                    c14509o = c14509o2;
                } else {
                    c14509o = c14509o2;
                    j7 = jLongValue;
                    bitmapM7676c = AbstractC2722a.m7676c(mediaMetadataRetriever, j7, ((Number) AbstractC31426o.m96742f(c14509o, c14289a2)).intValue(), (Bitmap.Config) AbstractC31426o.m96742f(c14509o, AbstractC14505k.f52994b));
                    if (bitmapM7676c != null) {
                        width = bitmapM7676c.getWidth();
                        height = bitmapM7676c.getHeight();
                        bitmapM7677d = bitmapM7676c;
                    }
                }
            }
            if (bitmapM7677d == null) {
                throw new IllegalStateException(("Failed to decode frame at " + j7 + " microseconds.").toString());
            }
            Bitmap bitmapM71007b = m71007b(bitmapM7677d, c15878i3);
            C32483i c32483i = new C32483i(AbstractC31426o.m96739c(new BitmapDrawable(c14509o.f53003a.getResources(), bitmapM71007b)), width <= 0 || height <= 0 || AbstractC32004s.m99538g(width, height, bitmapM71007b.getWidth(), bitmapM71007b.getHeight(), c14509o.f53005c) < 1.0d);
            if (i13 < 29) {
                mediaMetadataRetriever.release();
                return c32483i;
            }
            if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
                return c32483i;
            }
            if (!(mediaMetadataRetriever instanceof ExecutorService)) {
                mediaMetadataRetriever.release();
                return c32483i;
            }
            ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z13 = false;
                while (!zIsTerminated2) {
                    try {
                        zIsTerminated2 = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z13) {
                            executorService.shutdownNow();
                            z13 = true;
                        }
                    }
                }
                if (z13) {
                    Thread.currentThread().interrupt();
                }
            }
            return c32483i;
        } catch (Throwable th3) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    boolean z14 = false;
                    while (!zIsTerminated) {
                        try {
                            try {
                                zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused2) {
                                if (!z14) {
                                    executorService2.shutdownNow();
                                    z14 = true;
                                }
                            }
                        } catch (InterruptedException unused3) {
                        }
                    }
                    if (z14) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (p474s.AbstractC32004s.m99538g(r9.getWidth(), r9.getHeight(), r10 instanceof gi.C15870a ? ((gi.C15870a) r10).f59978a : r9.getWidth(), r0 instanceof gi.C15870a ? ((gi.C15870a) r0).f59978a : r9.getHeight(), r3.f53005c) == 1.0d) goto L19;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m71007b(android.graphics.Bitmap r9, gi.C15878i r10) {
        /*
            r8 = this;
            gi.c r0 = r10.f59994b
            gi.c r10 = r10.f59993a
            android.graphics.Bitmap$Config r1 = r9.getConfig()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            fi.o r3 = r8.f95181b
            if (r1 != r2) goto L14
            android.graphics.Bitmap$Config r1 = fi.AbstractC14505k.m41412a(r3)
            if (r1 != r2) goto L4c
        L14:
            gi.d r1 = r3.f53006d
            gi.d r4 = gi.EnumC15873d.f59981x
            if (r1 != r4) goto L1b
            goto L4b
        L1b:
            int r1 = r9.getWidth()
            int r4 = r9.getHeight()
            boolean r5 = r10 instanceof gi.C15870a
            if (r5 == 0) goto L2d
            r5 = r10
            gi.a r5 = (gi.C15870a) r5
            int r5 = r5.f59978a
            goto L31
        L2d:
            int r5 = r9.getWidth()
        L31:
            boolean r6 = r0 instanceof gi.C15870a
            if (r6 == 0) goto L3b
            r6 = r0
            gi.a r6 = (gi.C15870a) r6
            int r6 = r6.f59978a
            goto L3f
        L3b:
            int r6 = r9.getHeight()
        L3f:
            gi.g r7 = r3.f53005c
            double r4 = p474s.AbstractC32004s.m99538g(r1, r4, r5, r6, r7)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L4c
        L4b:
            return r9
        L4c:
            int r1 = r9.getWidth()
            int r4 = r9.getHeight()
            boolean r5 = r10 instanceof gi.C15870a
            if (r5 == 0) goto L5d
            gi.a r10 = (gi.C15870a) r10
            int r10 = r10.f59978a
            goto L61
        L5d:
            int r10 = r9.getWidth()
        L61:
            boolean r5 = r0 instanceof gi.C15870a
            if (r5 == 0) goto L6a
            gi.a r0 = (gi.C15870a) r0
            int r0 = r0.f59978a
            goto L6e
        L6a:
            int r0 = r9.getHeight()
        L6e:
            gi.g r5 = r3.f53005c
            double r0 = p474s.AbstractC32004s.m99538g(r1, r4, r10, r0, r5)
            float r10 = (float) r0
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r10
            int r0 = e93.AbstractC12889b.m36258X(r0)
            int r1 = r9.getHeight()
            float r1 = (float) r1
            float r1 = r1 * r10
            int r1 = e93.AbstractC12889b.m36258X(r1)
            f93.a r4 = fi.AbstractC14505k.f52994b
            java.lang.Object r5 = p461rh.AbstractC31426o.m96742f(r3, r4)
            android.graphics.Bitmap$Config r5 = (android.graphics.Bitmap.Config) r5
            if (r5 != r2) goto L96
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L9c
        L96:
            java.lang.Object r2 = p461rh.AbstractC31426o.m96742f(r3, r4)
            android.graphics.Bitmap$Config r2 = (android.graphics.Bitmap.Config) r2
        L9c:
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 3
            r3.<init>(r4)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r1.scale(r10, r10)
            r10 = 0
            r1.drawBitmap(r9, r10, r10, r3)
            r9.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: li.C24098g.m71007b(android.graphics.Bitmap, gi.i):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: c */
    public final void m71008c(MediaMetadataRetriever mediaMetadataRetriever, InterfaceC32491q interfaceC32491q) throws IOException {
        AbstractC32069a abstractC32069aMo101469c = interfaceC32491q.mo101469c();
        if (abstractC32069aMo101469c instanceof C24095d) {
            mediaMetadataRetriever.setDataSource(((C24095d) abstractC32069aMo101469c).f95176a);
            return;
        }
        boolean z4 = abstractC32069aMo101469c instanceof C32475a;
        C14509o c14509o = this.f95181b;
        if (z4) {
            AssetFileDescriptor assetFileDescriptorOpenFd = c14509o.f53003a.getAssets().openFd(((C32475a) abstractC32069aMo101469c).f134489a);
            try {
                mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                assetFileDescriptorOpenFd.close();
                return;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(assetFileDescriptorOpenFd, th3);
                    throw th4;
                }
            }
        }
        if (abstractC32069aMo101469c instanceof C32481g) {
            mediaMetadataRetriever.setDataSource(c14509o.f53003a, Uri.parse(((C32481g) abstractC32069aMo101469c).f134504a.f129327a));
            return;
        }
        if (!(abstractC32069aMo101469c instanceof C32492r)) {
            if (interfaceC32491q.getFileSystem() == AbstractC26632p.f105900w) {
                mediaMetadataRetriever.setDataSource(interfaceC32491q.mo101467D0().toFile().getPath());
                return;
            } else {
                mediaMetadataRetriever.setDataSource(new C15961z(interfaceC32491q.getFileSystem().mo79150b0(interfaceC32491q.mo101467D0())));
                return;
            }
        }
        StringBuilder sb4 = new StringBuilder("android.resource://");
        C32492r c32492r = (C32492r) abstractC32069aMo101469c;
        sb4.append(c32492r.f134530a);
        sb4.append('/');
        sb4.append(c32492r.f134531b);
        mediaMetadataRetriever.setDataSource(sb4.toString());
    }
}
