package p461rh;

import ai.C0899e;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.AbstractC1638x;
import b30.C2570m;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C2986a0;
import c53.C4256b;
import e93.AbstractC12889b;
import f93.C14289a;
import fi.AbstractC14505k;
import fi.C14498d;
import fi.C14500f;
import fi.C14503i;
import fi.C14511q;
import fi.InterfaceC14497c;
import fi.InterfaceC14502h;
import gi.C15875f;
import hc3.AbstractC17182o;
import hc3.C17171d;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kc3.C22365e;
import ki.ComponentCallbacks2C22489a;
import l83.C23465k;
import li.C24093b;
import mc3.AbstractC25444j;
import mc3.C25443i;
import n43.C26285a;
import ne3.C26611e0;
import p196hi.C17302a;
import p253ji.C21710c;
import p253ji.InterfaceC21711d;
import p253ji.InterfaceC21712e;
import p615xh.C38299f;
import p648yh.C39534a;
import p681zh.C40637a;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import sh.C32477c;
import sh.C32488n;
import sh.C32495u;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: rh.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C31431t implements InterfaceC31425n {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f129318f = 0;

    /* JADX INFO: renamed from: a */
    public final C31428q f129319a;

    /* JADX INFO: renamed from: b */
    public final C17171d f129320b;

    /* JADX INFO: renamed from: c */
    public final C0899e f129321c;

    /* JADX INFO: renamed from: d */
    public final C31415d f129322d;

    /* JADX INFO: renamed from: e */
    public volatile /* synthetic */ int f129323e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C31431t.class, "e");
    }

    public C31431t(C31428q c31428q) {
        this.f129319a = c31428q;
        int i13 = 2;
        this.f129320b = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), new C4256b(C2986a0.f11990w, i13)));
        ComponentCallbacks2C22489a componentCallbacks2C22489a = new ComponentCallbacks2C22489a(this);
        C0899e c0899e = new C0899e(this);
        this.f129321c = c0899e;
        C2570m c2570m = new C2570m(c31428q.f129305e);
        ArrayList arrayList = (ArrayList) c2570m.f9987x;
        ArrayList arrayList2 = (ArrayList) c2570m.f9984E;
        ArrayList arrayList3 = (ArrayList) c2570m.f9989z;
        ArrayList arrayList4 = (ArrayList) c2570m.f9985F;
        C14500f c14500f = c31428q.f129302b;
        Object obj = c14500f.f52961n.f129287a.get(AbstractC31426o.f129297a);
        int i14 = 1;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList2.add(new C31423l(i14));
            arrayList4.add(new C31423l(i13));
        }
        C40637a c40637a = new C40637a(0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c2570m.m7490i(c40637a, c22673i0.getOrCreateKotlinClass(Uri.class));
        c2570m.m7490i(new C40637a(3), c22673i0.getOrCreateKotlinClass(Integer.class));
        arrayList3.add(new C23465k(new C39534a(0), c22673i0.getOrCreateKotlinClass(C31436y.class)));
        c2570m.m7489g(new C24093b(i14), c22673i0.getOrCreateKotlinClass(C31436y.class));
        c2570m.m7489g(new C24093b(5), c22673i0.getOrCreateKotlinClass(C31436y.class));
        c2570m.m7489g(new C24093b(10), c22673i0.getOrCreateKotlinClass(C31436y.class));
        c2570m.m7489g(new C24093b(7), c22673i0.getOrCreateKotlinClass(Drawable.class));
        c2570m.m7489g(new C24093b(i13), c22673i0.getOrCreateKotlinClass(Bitmap.class));
        C14289a c14289a = AbstractC31427p.f129298a;
        Object obj2 = c14500f.f52961n.f129287a.get(AbstractC31427p.f129298a);
        C25443i c25443iM74674a = AbstractC25444j.m74674a(((Number) (obj2 == null ? 4 : obj2)).intValue());
        int i15 = Build.VERSION.SDK_INT;
        Object obj3 = C32488n.f134519b;
        if (i15 >= 29) {
            Object obj4 = c14500f.f52961n.f129287a.get(AbstractC31427p.f129300c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = c14500f.f52961n.f129287a.get(AbstractC31427p.f129299b);
                C32488n c32488n = (C32488n) (obj5 == null ? obj3 : obj5);
                if (c32488n.equals(obj3) || c32488n.equals(C32488n.f134520c)) {
                    arrayList4.add(new C31414c(new C32495u(c25443iM74674a), 0));
                }
            }
        }
        Object obj6 = c14500f.f52961n.f129287a.get(AbstractC31427p.f129299b);
        arrayList4.add(new C31414c(new C32477c(c25443iM74674a, (C32488n) (obj6 != null ? obj6 : obj3)), 0));
        c2570m.m7490i(new C40637a(1), c22673i0.getOrCreateKotlinClass(File.class));
        c2570m.m7489g(new C24093b(9), c22673i0.getOrCreateKotlinClass(C31436y.class));
        int i16 = 4;
        c2570m.m7489g(new C24093b(i16), c22673i0.getOrCreateKotlinClass(ByteBuffer.class));
        c2570m.m7490i(new C40637a(i16), c22673i0.getOrCreateKotlinClass(String.class));
        c2570m.m7490i(new C40637a(2), c22673i0.getOrCreateKotlinClass(C26611e0.class));
        arrayList3.add(new C23465k(new C39534a(1), c22673i0.getOrCreateKotlinClass(C31436y.class)));
        arrayList3.add(new C23465k(new C39534a(2), c22673i0.getOrCreateKotlinClass(C31436y.class)));
        c2570m.m7489g(new C24093b(8), c22673i0.getOrCreateKotlinClass(C31436y.class));
        c2570m.m7489g(new C24093b(3), c22673i0.getOrCreateKotlinClass(byte[].class));
        c2570m.m7489g(new C24093b(6), c22673i0.getOrCreateKotlinClass(C31436y.class));
        arrayList.add(new C38299f(this, componentCallbacks2C22489a, c0899e));
        this.f129322d = new C31415d(AbstractC37978j.m121637V(arrayList), AbstractC37978j.m121637V((ArrayList) c2570m.f9988y), AbstractC37978j.m121637V(arrayList3), AbstractC37978j.m121637V(arrayList2), AbstractC37978j.m121637V(arrayList4));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC14497c m96747a(C14503i c14503i) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC31426o.m96740d(c14503i, AbstractC3006f0.m8711e(this.f129320b, AbstractC17182o.f65999a.mo8825s(), new C31429r(this, c14503i, null, 0), 2));
    }

    /* JADX WARN: Code duplicated, block: B:116:0x019d A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:133:0x0202, B:135:0x0208, B:136:0x0211, B:138:0x0215, B:141:0x0221, B:142:0x0226, B:27:0x006f, B:114:0x0196, B:116:0x019d, B:118:0x01a7, B:119:0x01b1, B:120:0x01b4, B:122:0x01bb, B:123:0x01be), top: B:170:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a7 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:133:0x0202, B:135:0x0208, B:136:0x0211, B:138:0x0215, B:141:0x0221, B:142:0x0226, B:27:0x006f, B:114:0x0196, B:116:0x019d, B:118:0x01a7, B:119:0x01b1, B:120:0x01b4, B:122:0x01bb, B:123:0x01be), top: B:170:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01bb A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:133:0x0202, B:135:0x0208, B:136:0x0211, B:138:0x0215, B:141:0x0221, B:142:0x0226, B:27:0x006f, B:114:0x0196, B:116:0x019d, B:118:0x01a7, B:119:0x01b1, B:120:0x01b4, B:122:0x01bb, B:123:0x01be), top: B:170:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:132:0x0200  */
    /* JADX WARN: Code duplicated, block: B:135:0x0208 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:133:0x0202, B:135:0x0208, B:136:0x0211, B:138:0x0215, B:141:0x0221, B:142:0x0226, B:27:0x006f, B:114:0x0196, B:116:0x019d, B:118:0x01a7, B:119:0x01b1, B:120:0x01b4, B:122:0x01bb, B:123:0x01be), top: B:170:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0211 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:133:0x0202, B:135:0x0208, B:136:0x0211, B:138:0x0215, B:141:0x0221, B:142:0x0226, B:27:0x006f, B:114:0x0196, B:116:0x019d, B:118:0x01a7, B:119:0x01b1, B:120:0x01b4, B:122:0x01bb, B:123:0x01be), top: B:170:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0215 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:133:0x0202, B:135:0x0208, B:136:0x0211, B:138:0x0215, B:141:0x0221, B:142:0x0226, B:27:0x006f, B:114:0x0196, B:116:0x019d, B:118:0x01a7, B:119:0x01b1, B:120:0x01b4, B:122:0x01bb, B:123:0x01be), top: B:170:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0221 A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:133:0x0202, B:135:0x0208, B:136:0x0211, B:138:0x0215, B:141:0x0221, B:142:0x0226, B:27:0x006f, B:114:0x0196, B:116:0x019d, B:118:0x01a7, B:119:0x01b1, B:120:0x01b4, B:122:0x01bb, B:123:0x01be), top: B:170:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0239 A[Catch: all -> 0x0246, TryCatch #2 {all -> 0x0246, blocks: (B:149:0x0235, B:151:0x0239, B:153:0x0242, B:154:0x0245, B:157:0x0248), top: B:165:0x0235 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0242 A[Catch: all -> 0x0246, TryCatch #2 {all -> 0x0246, blocks: (B:149:0x0235, B:151:0x0239, B:153:0x0242, B:154:0x0245, B:157:0x0248), top: B:165:0x0235 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0248 A[Catch: all -> 0x0246, TRY_LEAVE, TryCatch #2 {all -> 0x0246, blocks: (B:149:0x0235, B:151:0x0239, B:153:0x0242, B:154:0x0245, B:157:0x0248), top: B:165:0x0235 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x018d, code lost:
    
        if (r5.mo41414b(r0) == r8) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rh.f] */
    /* JADX WARN: Type inference failed for: r3v10, types: [rh.f] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, rh.f] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [rh.f] */
    /* JADX WARN: Type inference failed for: r3v16, types: [rh.f] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [fi.p] */
    /* JADX WARN: Type inference failed for: r5v4, types: [fi.p] */
    /* JADX WARN: Type inference failed for: r5v5, types: [fi.p] */
    /* JADX WARN: Type inference failed for: r5v6, types: [fi.p] */
    /* JADX WARN: Type inference failed for: r5v7, types: [fi.p] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [rh.t] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [rh.t] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m96748b(fi.C14503i r22, int r23, s83.AbstractC32269c r24) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p461rh.C31431t.m96748b(fi.i, int, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final Object m96749c(C14503i c14503i, AbstractC32275i abstractC32275i) {
        return ((c14503i.f52970c instanceof C17302a) || (c14503i.f52983p instanceof C15875f) || ((AbstractC1638x) AbstractC31426o.m96741e(c14503i, AbstractC14505k.f52997e)) != null) ? AbstractC3006f0.m8719m(new C26285a(c14503i, this, (InterfaceC30057d) null, 17), abstractC32275i) : m96748b(c14503i, 1, abstractC32275i);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX INFO: renamed from: d */
    public final void m96750d(C14498d c14498d, C17302a c17302a, C31417f c31417f) {
        C14503i c14503i = c14498d.f52931b;
        InterfaceC31421j interfaceC31421j = c14498d.f52930a;
        if (c17302a instanceof C17302a) {
            InterfaceC21712e interfaceC21712eMo61162a = ((InterfaceC21711d) AbstractC31426o.m96741e(c14503i, AbstractC14505k.f52993a)).mo61162a(c17302a, c14498d);
            if (interfaceC21712eMo61162a instanceof C21710c) {
                c17302a.m48989b(interfaceC31421j);
            } else {
                c31417f.getClass();
                interfaceC21712eMo61162a.mo1686a();
            }
        } else if (c17302a != null) {
            c17302a.m48989b(interfaceC31421j);
        }
        c31417f.getClass();
        InterfaceC14502h interfaceC14502h = c14503i.f52971d;
        if (interfaceC14502h != null) {
            interfaceC14502h.onError(c14503i, c14498d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX INFO: renamed from: e */
    public final void m96751e(C14511q c14511q, C17302a c17302a, C31417f c31417f) {
        C14503i c14503i = c14511q.f53014b;
        InterfaceC31421j interfaceC31421j = c14511q.f53013a;
        if (c17302a instanceof C17302a) {
            InterfaceC21712e interfaceC21712eMo61162a = ((InterfaceC21711d) AbstractC31426o.m96741e(c14503i, AbstractC14505k.f52993a)).mo61162a(c17302a, c14511q);
            if (interfaceC21712eMo61162a instanceof C21710c) {
                c17302a.m48989b(interfaceC31421j);
            } else {
                c31417f.getClass();
                interfaceC21712eMo61162a.mo1686a();
            }
        } else if (c17302a != null) {
            c17302a.m48989b(interfaceC31421j);
        }
        c31417f.getClass();
        InterfaceC14502h interfaceC14502h = c14503i.f52971d;
        if (interfaceC14502h != null) {
            interfaceC14502h.onSuccess(c14503i, c14511q);
        }
    }
}
