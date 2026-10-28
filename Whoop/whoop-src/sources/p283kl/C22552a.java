package p283kl;

import al.C0960g;
import al.InterfaceC0955b;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import ar.C1913a;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.crypto.tink.internal.C5101l0;
import il.C18616b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p000.AbstractC11266d;
import p014aj.C0928c;
import p150fl.C14555a;
import p249jc.C21565a;
import p479s4.AbstractC32121b;
import p586wk.C37330h;
import p586wk.EnumC37324b;
import p586wk.InterfaceC37332j;
import tl.AbstractC33908g;
import uk.C35044c;
import uk.C35045d;
import uk.C35046e;

/* JADX INFO: renamed from: kl.a */
/* JADX INFO: loaded from: classes.dex */
public final class C22552a implements InterfaceC37332j {

    /* JADX INFO: renamed from: f */
    public static final C21565a f88713f = new C21565a(7);

    /* JADX INFO: renamed from: g */
    public static final C0928c f88714g = new C0928c(19, (byte) 0);

    /* JADX INFO: renamed from: a */
    public final Context f88715a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f88716b;

    /* JADX INFO: renamed from: e */
    public final C5101l0 f88719e;

    /* JADX INFO: renamed from: d */
    public final C21565a f88718d = f88713f;

    /* JADX INFO: renamed from: c */
    public final C0928c f88717c = f88714g;

    public C22552a(Context context, ArrayList arrayList, InterfaceC0955b interfaceC0955b, C0960g c0960g) {
        this.f88715a = context.getApplicationContext();
        this.f88716b = arrayList;
        this.f88719e = new C5101l0(interfaceC0955b, c0960g, false, 24);
    }

    /* JADX INFO: renamed from: d */
    public static int m65282d(C35044c c35044c, int i13, int i14) {
        int iMin = Math.min(c35044c.m110764a() / i14, c35044c.m110767d() / i13);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(iMax, i13, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbM30465s.append(i14);
            sbM30465s.append("], actual dimens: [");
            sbM30465s.append(c35044c.m110767d());
            sbM30465s.append("x");
            sbM30465s.append(c35044c.m110764a());
            sbM30465s.append("]");
            Log.v("BufferGifDecoder", sbM30465s.toString());
        }
        return iMax;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x0056
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: a */
    public final p684zk.InterfaceC40801z mo44989a(java.lang.Object r8, int r9, int r10, p586wk.C37330h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            aj.c r8 = r7.f88717c
            monitor-enter(r8)
            java.lang.Object r0 = r8.f3421x     // Catch: java.lang.Throwable -> L51
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L51
            uk.d r0 = (uk.C35045d) r0     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L17
            uk.d r0 = new uk.d     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
        L17:
            r5 = r0
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L54
        L1d:
            r5.m110774g(r2)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            il.b r8 = r1.m65283c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3c
            aj.c r9 = r1.f88717c
            monitor-enter(r9)
            r5.m110768a()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r9.f3421x     // Catch: java.lang.Throwable -> L38
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10     // Catch: java.lang.Throwable -> L38
            r10.offer(r5)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r9)
            return r8
        L38:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L38
            throw r8
        L3c:
            r0 = move-exception
            r8 = r0
            aj.c r9 = r1.f88717c
            monitor-enter(r9)
            r5.m110768a()     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r10 = r9.f3421x     // Catch: java.lang.Throwable -> L4d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10     // Catch: java.lang.Throwable -> L4d
            r10.offer(r5)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r9)
            throw r8
        L4d:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4d
            throw r8
        L51:
            r0 = move-exception
            r1 = r7
        L53:
            r9 = r0
        L54:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L56:
            r0 = move-exception
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: p283kl.C22552a.mo44989a(java.lang.Object, int, int, wk.h):zk.z");
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: b */
    public final boolean mo44990b(Object obj, C37330h c37330h) {
        return !((Boolean) c37330h.m119569c(AbstractC22559h.f88754b)).booleanValue() && AbstractC32121b.m100007l(this.f88716b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    /* JADX INFO: renamed from: c */
    public final C18616b m65283c(ByteBuffer byteBuffer, int i13, int i14, C35045d c35045d, C37330h c37330h) {
        StringBuilder sb4;
        long jM107259b = AbstractC33908g.m107259b();
        try {
            C35044c c35044cM110770c = c35045d.m110770c();
            if (c35044cM110770c.m110765b() > 0 && c35044cM110770c.m110766c() == 0) {
                Bitmap.Config config = c37330h.m119569c(AbstractC22559h.f88753a) == EnumC37324b.f159586x ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM65282d = m65282d(c35044cM110770c, i13, i14);
                C21565a c21565a = this.f88718d;
                C5101l0 c5101l0 = this.f88719e;
                c21565a.getClass();
                C35046e c35046e = new C35046e(c5101l0, c35044cM110770c, byteBuffer, iM65282d);
                c35046e.m110779d(config);
                c35046e.m110776a();
                Bitmap bitmapM110778c = c35046e.m110778c();
                if (bitmapM110778c == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb4 = new StringBuilder("Decoded GIF from stream in ");
                        sb4.append(AbstractC33908g.m107258a(jM107259b));
                        Log.v("BufferGifDecoder", sb4.toString());
                        return null;
                    }
                    return null;
                }
                C18616b c18616b = new C18616b(1, new C22553b(new C1913a(new C22558g(ComponentCallbacks2C4960b.m15527c(this.f88715a), c35046e, i13, i14, C14555a.f53195b, bitmapM110778c), 2)));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC33908g.m107258a(jM107259b));
                }
                return c18616b;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb4 = new StringBuilder("Decoded GIF from stream in ");
                sb4.append(AbstractC33908g.m107258a(jM107259b));
                Log.v("BufferGifDecoder", sb4.toString());
                return null;
            }
            return null;
        } catch (Throwable th3) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC33908g.m107258a(jM107259b));
            }
            throw th3;
        }
    }
}
