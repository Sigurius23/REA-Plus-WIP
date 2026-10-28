package bh;

import aa3.C0627i1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import ch.C4589j;
import e93.AbstractC12889b;
import gh.C15832a;
import gh.C15841j;
import hc3.AbstractC17182o;
import hc3.C17171d;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kc3.C22365e;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25265s;
import mh.C25535c;
import mh.C25537e;
import mh.C25542j;
import mh.InterfaceC25541i;
import p007a6.C0410c;
import p037bu.C3632c;
import p092dh.C12016c;
import p195hh.C17276g;
import p220ih.C18479a;
import p220ih.C18481c;
import p252jh.C21692a;
import p369oh.InterfaceC27932a;
import p425qh.C30359e;
import p425qh.ComponentCallbacks2C30361g;
import ph.C29230d;
import ph.InterfaceC29232f;
import q83.AbstractC30060g;
import s83.AbstractC32269c;
import ud3.C34810e0;

/* JADX INFO: renamed from: bh.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3247j implements InterfaceC3242e {

    /* JADX INFO: renamed from: a */
    public final Context f12726a;

    /* JADX INFO: renamed from: b */
    public final C25535c f12727b;

    /* JADX INFO: renamed from: c */
    public final C23470p f12728c;

    /* JADX INFO: renamed from: d */
    public final C23470p f12729d;

    /* JADX INFO: renamed from: e */
    public final C30359e f12730e;

    /* JADX INFO: renamed from: f */
    public final C17171d f12731f;

    /* JADX INFO: renamed from: g */
    public final C3632c f12732g;

    /* JADX INFO: renamed from: h */
    public final C3239b f12733h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f12734i;

    public C3247j(Context context, C25535c c25535c, C23470p c23470p, C23470p c23470p2, C23470p c23470p3, C3239b c3239b, C30359e c30359e) {
        this.f12726a = context;
        this.f12727b = c25535c;
        this.f12728c = c23470p;
        this.f12729d = c23470p2;
        this.f12730e = c30359e;
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.f12731f = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, AbstractC17182o.f65999a.mo8825s()).plus(new C3246i(this)));
        ComponentCallbacks2C30361g componentCallbacks2C30361g = new ComponentCallbacks2C30361g(this);
        C3632c c3632c = new C3632c();
        c3632c.f14788w = componentCallbacks2C30361g;
        this.f12732g = c3632c;
        C0627i1 c0627i1 = new C0627i1(c3239b);
        c0627i1.m1627k(new C21692a(2), C34810e0.class);
        int i13 = 5;
        c0627i1.m1627k(new C21692a(i13), String.class);
        c0627i1.m1627k(new C21692a(1), Uri.class);
        int i14 = 4;
        c0627i1.m1627k(new C21692a(i14), Uri.class);
        int i15 = 3;
        c0627i1.m1627k(new C21692a(i15), Integer.class);
        int i16 = 0;
        c0627i1.m1627k(new C21692a(i16), byte[].class);
        C18481c c18481c = new C18481c();
        ArrayList arrayList = (ArrayList) c0627i1.f2197d;
        arrayList.add(new C23465k(c18481c, Uri.class));
        arrayList.add(new C23465k(new C18479a(c30359e.f124551a), File.class));
        c0627i1.m1626j(new C15841j(c23470p3, c23470p2, c30359e.f124553c), Uri.class);
        c0627i1.m1626j(new C15832a(i13), File.class);
        c0627i1.m1626j(new C15832a(i16), Uri.class);
        c0627i1.m1626j(new C15832a(i15), Uri.class);
        c0627i1.m1626j(new C15832a(6), Uri.class);
        c0627i1.m1626j(new C15832a(i14), Drawable.class);
        c0627i1.m1626j(new C15832a(1), Bitmap.class);
        c0627i1.m1626j(new C15832a(2), ByteBuffer.class);
        C12016c c12016c = new C12016c(c30359e.f124554d, c30359e.f124555e);
        ArrayList arrayList2 = (ArrayList) c0627i1.f2199f;
        arrayList2.add(c12016c);
        List listM92108b0 = AbstractC30060g.m92108b0((ArrayList) c0627i1.f2195b);
        this.f12733h = new C3239b(listM92108b0, AbstractC30060g.m92108b0((ArrayList) c0627i1.f2196c), AbstractC30060g.m92108b0(arrayList), AbstractC30060g.m92108b0((ArrayList) c0627i1.f2198e), AbstractC30060g.m92108b0(arrayList2));
        this.f12734i = AbstractC25265s.m74128f1(new C17276g(this, componentCallbacks2C30361g, c3632c), listM92108b0);
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ac A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #4 {all -> 0x01aa, blocks: (B:93:0x0198, B:95:0x019c, B:97:0x01a6, B:98:0x01a9, B:101:0x01ac), top: B:112:0x0198 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:43:0x00c6, B:45:0x00d0, B:48:0x00d9, B:50:0x00e8, B:51:0x00eb, B:53:0x00f2, B:54:0x00f5), top: B:106:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8 A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:43:0x00c6, B:45:0x00d0, B:48:0x00d9, B:50:0x00e8, B:51:0x00eb, B:53:0x00f2, B:54:0x00f5), top: B:106:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2 A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:43:0x00c6, B:45:0x00d0, B:48:0x00d9, B:50:0x00e8, B:51:0x00eb, B:53:0x00f2, B:54:0x00f5), top: B:106:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d A[Catch: all -> 0x016d, TryCatch #6 {all -> 0x016d, blocks: (B:64:0x0137, B:66:0x013d, B:73:0x015f, B:75:0x0166, B:69:0x014c, B:72:0x0159, B:80:0x016f, B:82:0x0173, B:85:0x0184, B:86:0x0189), top: B:115:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:69:0x014c A[Catch: all -> 0x016d, TryCatch #6 {all -> 0x016d, blocks: (B:64:0x0137, B:66:0x013d, B:73:0x015f, B:75:0x0166, B:69:0x014c, B:72:0x0159, B:80:0x016f, B:82:0x0173, B:85:0x0184, B:86:0x0189), top: B:115:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159 A[Catch: all -> 0x016d, TryCatch #6 {all -> 0x016d, blocks: (B:64:0x0137, B:66:0x013d, B:73:0x015f, B:75:0x0166, B:69:0x014c, B:72:0x0159, B:80:0x016f, B:82:0x0173, B:85:0x0184, B:86:0x0189), top: B:115:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0166 A[Catch: all -> 0x016d, TryCatch #6 {all -> 0x016d, blocks: (B:64:0x0137, B:66:0x013d, B:73:0x015f, B:75:0x0166, B:69:0x014c, B:72:0x0159, B:80:0x016f, B:82:0x0173, B:85:0x0184, B:86:0x0189), top: B:115:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x016f A[Catch: all -> 0x016d, TryCatch #6 {all -> 0x016d, blocks: (B:64:0x0137, B:66:0x013d, B:73:0x015f, B:75:0x0166, B:69:0x014c, B:72:0x0159, B:80:0x016f, B:82:0x0173, B:85:0x0184, B:86:0x0189), top: B:115:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0173 A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #6 {all -> 0x016d, blocks: (B:64:0x0137, B:66:0x013d, B:73:0x015f, B:75:0x0166, B:69:0x014c, B:72:0x0159, B:80:0x016f, B:82:0x0173, B:85:0x0184, B:86:0x0189), top: B:115:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0184 A[Catch: all -> 0x016d, TRY_ENTER, TryCatch #6 {all -> 0x016d, blocks: (B:64:0x0137, B:66:0x013d, B:73:0x015f, B:75:0x0166, B:69:0x014c, B:72:0x0159, B:80:0x016f, B:82:0x0173, B:85:0x0184, B:86:0x0189), top: B:115:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x019c A[Catch: all -> 0x01aa, TryCatch #4 {all -> 0x01aa, blocks: (B:93:0x0198, B:95:0x019c, B:97:0x01a6, B:98:0x01a9, B:101:0x01ac), top: B:112:0x0198 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a6 A[Catch: all -> 0x01aa, TryCatch #4 {all -> 0x01aa, blocks: (B:93:0x0198, B:95:0x019c, B:97:0x01a6, B:98:0x01a9, B:101:0x01ac), top: B:112:0x0198 }] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (p715kotlin.jvm.internal.AbstractC22674j.m65735u(r0, r2) == r3) goto L62;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9384a(bh.C3247j r19, mh.C25542j r20, int r21, s83.AbstractC32269c r22) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.C3247j.m9384a(bh.j, mh.j, int, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public static void m9385c(C25537e c25537e, InterfaceC27932a interfaceC27932a, C3240c c3240c) {
        C25542j c25542jMo75115b = c25537e.mo75115b();
        if (interfaceC27932a instanceof C4589j) {
            InterfaceC29232f interfaceC29232fMo88737a = c25537e.mo75115b().f100117j.mo88737a((C4589j) interfaceC27932a, c25537e);
            if (!(interfaceC29232fMo88737a instanceof C29230d)) {
                c3240c.getClass();
                interfaceC29232fMo88737a.mo88738a();
            }
        }
        c3240c.getClass();
        InterfaceC25541i interfaceC25541i = c25542jMo75115b.f100111d;
        if (interfaceC25541i != null) {
            interfaceC25541i.mo9382d(c25542jMo75115b, c25537e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m9386b(C25542j c25542j, AbstractC32269c abstractC32269c) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(AbstractC17182o.f65999a.mo8825s(), new C0410c(this, c25542j, null, 9), abstractC32269c);
    }
}
