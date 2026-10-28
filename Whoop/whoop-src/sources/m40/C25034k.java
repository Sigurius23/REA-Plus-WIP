package m40;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bc3.C3033m;
import ge3.AbstractC15751g;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import l83.C23468n;
import p000.C31931s;
import p497t7.InterfaceC33561b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: m40.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C25034k {
    /* JADX INFO: renamed from: b */
    public static Object m73479b(BitmapFactory.Options options, URL url, AbstractC32269c abstractC32269c) {
        Object objM107888l;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(abstractC32269c));
        c3033m.m8774s();
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            AbstractC22676k.m65749i(uRLConnectionOpenConnection, "openConnection(...)");
            uRLConnectionOpenConnection.setConnectTimeout(InterfaceC33561b.INVALID_OWNERSHIP);
            uRLConnectionOpenConnection.setReadTimeout(InterfaceC33561b.INVALID_OWNERSHIP);
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            AbstractC22676k.m65749i(inputStream, "getInputStream(...)");
            c3033m.m8776u(new C31931s(options, inputStream));
            objM107888l = null;
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                inputStream.close();
                if (bitmapDecodeStream != null) {
                    String outMimeType = options.outMimeType;
                    AbstractC22676k.m65749i(outMimeType, "outMimeType");
                    objM107888l = new C25032i(outMimeType, bitmapDecodeStream);
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(inputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            objM107888l = AbstractC34132o.m107888l(th5);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a == null) {
            c3033m.resumeWith((C25032i) objM107888l);
        } else {
            c3033m.resumeWith(AbstractC34132o.m107888l(thM68037a));
        }
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m73480a(java.net.URL r8, int r9, int r10, s83.AbstractC32269c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof m40.C25033j
            if (r0 == 0) goto L13
            r0 = r11
            m40.j r0 = (m40.C25033j) r0
            int r1 = r0.f98057H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98057H = r1
            goto L18
        L13:
            m40.j r0 = new m40.j
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f98055F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f98057H
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r11)
            goto L8d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            int r10 = r0.f98054E
            int r9 = r0.f98061z
            android.graphics.BitmapFactory$Options r8 = r0.f98060y
            java.net.URL r2 = r0.f98059x
            m40.k r5 = r0.f98058w
            p505ts.AbstractC34132o.m107864I(r11)
            goto L60
        L40:
            p505ts.AbstractC34132o.m107864I(r11)
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options
            r11.<init>()
            r11.inJustDecodeBounds = r4
            r0.f98058w = r7
            r0.f98059x = r8
            r0.f98060y = r11
            r0.f98061z = r9
            r0.f98054E = r10
            r0.f98057H = r4
            java.lang.Object r2 = m73479b(r11, r8, r0)
            if (r2 != r1) goto L5d
            goto L8c
        L5d:
            r5 = r7
            r2 = r8
            r8 = r11
        L60:
            r5.getClass()
            int r11 = r8.outHeight
            int r5 = r8.outWidth
            if (r11 > r10) goto L6b
            if (r5 <= r9) goto L78
        L6b:
            int r11 = r11 / r3
            int r5 = r5 / r3
        L6d:
            int r6 = r11 / r4
            if (r6 < r10) goto L78
            int r6 = r5 / r4
            if (r6 < r9) goto L78
            int r4 = r4 * 2
            goto L6d
        L78:
            r8.inSampleSize = r4
            r9 = 0
            r8.inJustDecodeBounds = r9
            r9 = 0
            r0.f98058w = r9
            r0.f98059x = r9
            r0.f98060y = r9
            r0.f98057H = r3
            java.lang.Object r11 = m73479b(r8, r2, r0)
            if (r11 != r1) goto L8d
        L8c:
            return r1
        L8d:
            m40.i r11 = (m40.C25032i) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m40.C25034k.m73480a(java.net.URL, int, int, s83.c):java.lang.Object");
    }
}
