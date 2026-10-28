package p098dt;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1578e1;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1620r;
import androidx.room.AbstractC1848z0;
import androidx.room.C1771c0;
import androidx.room.C1797i2;
import androidx.room.C1835v;
import androidx.room.C1844y;
import bc3.AbstractC2985a;
import bg.C3217l;
import c93.InterfaceC4339a;
import com.iterable.iterableapi.C5341k;
import com.iterable.iterableapi.C5381w;
import com.whoop.android.R;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import gb.C15633a;
import gb.C15657r;
import gb.C15658s;
import ge3.AbstractC15751g;
import hc3.AbstractC17167b;
import hg3.AbstractC17269i;
import i63.AbstractC18157a;
import i63.C18185x;
import i63.C18186y;
import i63.InterfaceC18184w;
import io.sentry.util.network.InterfaceC20595c;
import io.sentry.util.network.InterfaceC20596d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DispatchException;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n83.C26463f;
import n83.C26466i;
import ne3.C26616h;
import o63.C27614e;
import p000.AbstractC11266d;
import p002a0.AbstractC0015d1;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p005a3.C0231n1;
import p005a3.C0237p;
import p026b2.C2314t;
import p029b5.AbstractC2724c;
import p031b9.AbstractC2875y;
import p114eb.AbstractC12939a0;
import p114eb.C12944c;
import p114eb.C12982q;
import p132f0.C13825t;
import p133f1.C13921a0;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15081m5;
import p163g1.AbstractC15166v0;
import p163g1.C14970c1;
import p163g1.C15071l5;
import p163g1.C15077m1;
import p180h0.C16375d0;
import p180h0.InterfaceC16478x2;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p212i6.C18149b;
import p245j8.AbstractC21412c;
import p291l0.C22976l1;
import p298l8.C23418a;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p471rx.exceptions.CompositeException;
import p471rx.exceptions.OnCompletedFailedException;
import p471rx.exceptions.OnErrorFailedException;
import p471rx.exceptions.OnErrorNotImplementedException;
import p471rx.exceptions.OnErrorThrowable;
import p478s3.C32095a;
import p478s3.C32096b;
import p490t0.AbstractC33244a;
import p505ts.AbstractC34132o;
import p557vo.AbstractC36221c;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p619xl.C38445a;
import p634y1.InterfaceC39030c;
import p636y3.C39183o;
import p636y3.C39184p;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22709l;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import ud3.C34818h0;
import ud3.C34854z0;
import xb3.AbstractC38176k;
import xg3.InterfaceC38281h;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: dt.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12350b {
    /* JADX INFO: renamed from: A */
    public static Set m34552A(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC25247g0.m73988W(objArr.length));
        AbstractC25260n.m74043S0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: B */
    public static ConcurrentHashMap m34553B(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: C */
    public static C3217l m34554C(String scheme) {
        AbstractC22676k.m65750j(scheme, "scheme");
        LinkedHashMap linkedHashMap = C3217l.f12585e;
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        C3217l c3217l = (C3217l) linkedHashMap.get(lowerCase);
        return c3217l == null ? new C3217l(scheme, -1) : c3217l;
    }

    /* JADX INFO: renamed from: D */
    public static LinkedHashSet m34555D(Object obj, Set set) {
        AbstractC22676k.m65750j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC25247g0.m73988W(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: E */
    public static LinkedHashSet m34556E(Set set, Iterable elements) {
        int size;
        AbstractC22676k.m65750j(set, "<this>");
        AbstractC22676k.m65750j(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC25247g0.m73988W(size));
        linkedHashSet.addAll(set);
        AbstractC25265s.m74141p0(linkedHashSet, elements);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: F */
    public static void m34557F() {
        try {
            m34577Z("Iterable Call", Thread.currentThread().getStackTrace()[3].getFileName() + " => " + Thread.currentThread().getStackTrace()[3].getClassName() + " => " + Thread.currentThread().getStackTrace()[3].getMethodName() + " => Line #" + Thread.currentThread().getStackTrace()[3].getLineNumber());
        } catch (Exception unused) {
            m34595p("Iterable Call", "Couldn't print info");
        }
    }

    /* JADX INFO: renamed from: G */
    public static C18149b m34558G(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j7;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i13 = byteBufferDuplicate.getShort() & 65535;
        if (i13 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                j7 = -1;
                break;
            }
            int i15 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j7 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i15) {
                break;
            }
            i14++;
        }
        if (j7 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j7 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j13 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i16 = 0; i16 < j13; i16++) {
                int i17 = byteBufferDuplicate.getInt();
                long j14 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i17 || 1701669481 == i17) {
                    byteBufferDuplicate.position((int) (j14 + j7));
                    C18149b c18149b = new C18149b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c18149b.f70446z = byteBufferDuplicate;
                    c18149b.f70443w = iPosition;
                    int i18 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c18149b.f70444x = i18;
                    c18149b.f70445y = ((ByteBuffer) c18149b.f70446z).getShort(i18);
                    return c18149b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: H */
    public static final InterfaceC16478x2 m34559H(Function1 function1, C28655q c28655q) {
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(function1, c28655q);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            C16375d0 c16375d0 = new C16375d0(new C13921a0(14, interfaceC28601c1M87238F));
            c28655q.m87172p0(c16375d0);
            objM87133R = c16375d0;
        }
        return (InterfaceC16478x2) objM87133R;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m34560I(C0057v0 c0057v0, Object obj, Object obj2) {
        Object objM129g = c0057v0.m129g(obj);
        if (objM129g == null) {
            return false;
        }
        if (!(objM129g instanceof C0059w0)) {
            if (!objM129g.equals(obj2)) {
                return false;
            }
            c0057v0.m133k(obj);
            return true;
        }
        C0059w0 c0059w0 = (C0059w0) objM129g;
        boolean zM147l = c0059w0.m147l(obj2);
        if (zM147l && c0059w0.m142g()) {
            c0057v0.m133k(obj);
        }
        return zM147l;
    }

    /* JADX INFO: renamed from: J */
    public static final void m34561J(C0057v0 c0057v0, Object obj) {
        boolean zM142g;
        long[] jArr = c0057v0.f170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j7) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj2 = c0057v0.f171b[i16];
                        Object obj3 = c0057v0.f172c[i16];
                        if (obj3 instanceof C0059w0) {
                            C0059w0 c0059w0 = (C0059w0) obj3;
                            c0059w0.m147l(obj);
                            zM142g = c0059w0.m142g();
                        } else {
                            zM142g = obj3 == obj;
                        }
                        if (zM142g) {
                            c0057v0.m134l(i16);
                        }
                    }
                    j7 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static final float m34562K(float f13, long j7, InterfaceC39171c interfaceC39171c) {
        if (C39183o.m124803a(j7, C39183o.f168428c)) {
            return f13;
        }
        long jM124804b = C39183o.m124804b(j7);
        if (C39184p.m124808a(jM124804b, 4294967296L)) {
            return interfaceC39171c.mo726K(j7);
        }
        if (C39184p.m124808a(jM124804b, 8589934592L)) {
            return C39183o.m124805c(j7) * f13;
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: L */
    public static final float m34563L(float f13, long j7, InterfaceC39171c interfaceC39171c) {
        float fM124805c;
        long jM124804b = C39183o.m124804b(j7);
        if (C39184p.m124808a(jM124804b, 4294967296L)) {
            if (interfaceC39171c.getFontScale() <= 1.05d) {
                return interfaceC39171c.mo726K(j7);
            }
            fM124805c = C39183o.m124805c(j7) / C39183o.m124805c(interfaceC39171c.mo742q(f13));
        } else {
            if (!C39184p.m124808a(jM124804b, 8589934592L)) {
                return Float.NaN;
            }
            fM124805c = C39183o.m124805c(j7);
        }
        return fM124805c * f13;
    }

    /* JADX INFO: renamed from: M */
    public static int m34564M(int i13) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i13 - 1));
    }

    /* JADX INFO: renamed from: N */
    public static final Modifier m34565N(float f13, Modifier modifier) {
        return (f13 == 1.0f && f13 == 1.0f) ? modifier : AbstractC1127a.m3488c(modifier, f13, f13, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284);
    }

    /* JADX INFO: renamed from: O */
    public static final void m34566O(TextPaint textPaint, float f13) {
        if (Float.isNaN(f13)) {
            return;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f13 * 255));
    }

    /* JADX INFO: renamed from: P */
    public static final void m34567P(Spannable spannable, long j7, int i13, int i14) {
        if (j7 != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC17918w0.m51506H(j7)), i13, i14, 33);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m34568Q(Spannable spannable, long j7, InterfaceC39171c interfaceC39171c, int i13, int i14) {
        long jM124804b = C39183o.m124804b(j7);
        if (C39184p.m124808a(jM124804b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC12889b.m36258X(interfaceC39171c.mo726K(j7)), false), i13, i14, 33);
        } else if (C39184p.m124808a(jM124804b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C39183o.m124805c(j7)), i13, i14, 33);
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m34569R(Spannable spannable, C32096b c32096b, int i13, int i14) {
        if (c32096b != null) {
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c32096b, 10));
            Iterator it = c32096b.f133099w.iterator();
            while (it.hasNext()) {
                arrayList.add(((C32095a) it.next()).f133097a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i13, i14, 33);
        }
    }

    /* JADX INFO: renamed from: S */
    public static Set m34570S(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC22676k.m65749i(setSingleton, "singleton(...)");
        return setSingleton;
    }

    /* JADX INFO: renamed from: T */
    public static final void m34571T(InterfaceC30057d interfaceC30057d, AbstractC2985a abstractC2985a) throws Throwable {
        try {
            AbstractC17167b.m48481g(C23454a0.f92919a, AbstractC15751g.m44424D(interfaceC30057d));
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f89396w;
            }
            abstractC2985a.resumeWith(AbstractC34132o.m107888l(th));
            throw th;
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m34572U(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != 1) {
            throw new CompositeException(arrayList);
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof RuntimeException) {
            throw ((RuntimeException) th3);
        }
        if (!(th3 instanceof Error)) {
            throw new RuntimeException(th3);
        }
        throw ((Error) th3);
    }

    /* JADX INFO: renamed from: V */
    public static void m34573V(Throwable th3) {
        if (th3 instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th3);
        }
        if (th3 instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th3);
        }
        if (th3 instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th3);
        }
        if (th3 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th3);
        }
        if (th3 instanceof ThreadDeath) {
            throw ((ThreadDeath) th3);
        }
        if (th3 instanceof LinkageError) {
            throw ((LinkageError) th3);
        }
    }

    /* JADX INFO: renamed from: W */
    public static void m34574W(Throwable th3, InterfaceC38281h interfaceC38281h) {
        m34573V(th3);
        interfaceC38281h.onError(th3);
    }

    /* JADX INFO: renamed from: X */
    public static void m34575X(Throwable th3, InterfaceC38281h interfaceC38281h, Object obj) {
        m34573V(th3);
        OnErrorThrowable.m99122a(obj, th3);
        interfaceC38281h.onError(th3);
    }

    /* JADX INFO: renamed from: Y */
    public static final boolean m34576Y(Throwable th3, InterfaceC4339a interfaceC4339a) {
        DiagnosticComposeException diagnosticComposeException;
        List listM88493B = AbstractC29125c.m88493B(th3);
        boolean z4 = false;
        if (!(listM88493B instanceof Collection) || !listM88493B.isEmpty()) {
            Iterator it = listM88493B.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof DiagnosticComposeException) {
                    return false;
                }
            }
        }
        try {
            List list = (List) interfaceC4339a.invoke();
            boolean zIsEmpty = list.isEmpty();
            z4 = !zIsEmpty;
            diagnosticComposeException = !zIsEmpty ? new DiagnosticComposeException(list) : null;
        } catch (Throwable th4) {
            diagnosticComposeException = th4;
        }
        if (diagnosticComposeException != null) {
            AbstractC29125c.m88530g(th3, diagnosticComposeException);
        }
        return z4;
    }

    /* JADX INFO: renamed from: Z */
    public static void m34577Z(String str, String str2) {
        if (m34603x(2)) {
            Log.v(str, " 💛 " + str2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static final void m34578a(c93.InterfaceC4339a r27, androidx.compose.p018ui.Modifier r28, boolean r29, p163g1.C15117q1 r30, p208i2.InterfaceC17869a1 r31, p132f0.C13825t r32, p163g1.InterfaceC15156u0 r33, p291l0.InterfaceC22973k1 r34, p715kotlin.jvm.functions.Function3 r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p098dt.AbstractC12350b.m34578a(c93.a, androidx.compose.ui.Modifier, boolean, g1.q1, i2.a1, f0.t, g1.u0, l0.k1, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: a0 */
    public static void m34579a0(String str, String str2) {
        if (m34603x(5)) {
            Log.w(str, " 🧡️ " + str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m34580b(C12982q c12982q, InterfaceC39030c interfaceC39030c, C37816b c37816b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1579360880);
        if ((((c28655q.m87157i(c12982q) ? 4 : 2) | i13 | (c28655q.m87157i(interfaceC39030c) ? 32 : 16)) & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC25218a.f99032a.mo86977a(c12982q), AbstractC21412c.f82093a.mo86977a(c12982q), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().mo86977a(c12982q)}, AbstractC37817c.m121344e(-52928304, c28655q, new C0231n1(3, interfaceC39030c, c37816b)), c28655q, 56);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15657r(c12982q, interfaceC39030c, c37816b, i13, 0);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m34581b0(String str, String str2, Throwable th3) {
        if (m34603x(5)) {
            Log.w(str, " 🧡 ".concat(str2), th3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m34582c(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, C13825t c13825t, C15077m1 c15077m1, Function3 function3, C28655q c28655q, int i13, int i14) {
        if ((i14 & 2) != 0) {
            modifier = C2314t.f9131w;
        }
        if ((i14 & 4) != 0) {
            z4 = true;
        }
        AbstractC33244a abstractC33244aM43154c = ((C15071l5) c28655q.m87161k(AbstractC15081m5.m43156a())).m43154c();
        if ((i14 & 64) != 0) {
            c13825t = AbstractC17269i.m48880a(AbstractC15166v0.f56894d, C17919x.m51541c(0.12f, ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43090e()));
        }
        m34578a(interfaceC4339a, modifier, z4, null, abstractC33244aM43154c, c13825t, (i14 & 128) != 0 ? AbstractC15166v0.m43198c(0L, 0L, c28655q, 7) : c15077m1, AbstractC15166v0.f56891a, function3, c28655q, i13 & 2147483646, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m34583d(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, InterfaceC17869a1 interfaceC17869a1, C13825t c13825t, C15077m1 c15077m1, C22976l1 c22976l1, C37816b c37816b, Composer composer, int i13, int i14) {
        if ((i14 & 2) != 0) {
            modifier = C2314t.f9131w;
        }
        Modifier modifier2 = modifier;
        if ((i14 & 4) != 0) {
            z4 = true;
        }
        boolean z13 = z4;
        if ((i14 & 32) != 0) {
            interfaceC17869a1 = ((C15071l5) ((C28655q) composer).m87161k(AbstractC15081m5.m43156a())).m43154c();
        }
        m34578a(interfaceC4339a, modifier2, z13, null, interfaceC17869a1, (i14 & 64) != 0 ? null : c13825t, (i14 & 128) != 0 ? AbstractC15166v0.m43199d(0L, composer, 7) : c15077m1, (i14 & 256) != 0 ? AbstractC15166v0.f56895e : c22976l1, c37816b, composer, i13 & 2147483646, 0);
    }

    /* JADX INFO: renamed from: e */
    public static final void m34584e(InterfaceC39030c interfaceC39030c, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1211832233);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC39030c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87152f0(1729797275);
            InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
            if (interfaceC1583f2M73844a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            AbstractC1637w1 abstractC1637w1M88523c0 = AbstractC29125c.m88523c0(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15633a.class), interfaceC1583f2M73844a, null, null, interfaceC1583f2M73844a instanceof InterfaceC1620r ? ((InterfaceC1620r) interfaceC1583f2M73844a).getDefaultViewModelCreationExtras() : C23418a.f92771b, c28655q);
            c28655q.m87173q(false);
            C15633a c15633a = (C15633a) abstractC1637w1M88523c0;
            c15633a.f58674x = new WeakReference(interfaceC39030c);
            interfaceC39030c.mo86875c(c15633a.f58673w, c37816b, c28655q, ((i14 << 6) & 896) | (i14 & 112));
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15658s(interfaceC39030c, c37816b, i13);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m34585f(C0057v0 c0057v0, Object obj, Object obj2) {
        int iM128f = c0057v0.m128f(obj);
        boolean z4 = iM128f < 0;
        Object obj3 = z4 ? null : c0057v0.f172c[iM128f];
        if (obj3 != null) {
            if (obj3 instanceof C0059w0) {
                ((C0059w0) obj3).m136a(obj2);
            } else if (obj3 != obj2) {
                C0059w0 c0059w0 = new C0059w0();
                c0059w0.m136a(obj3);
                c0059w0.m136a(obj2);
                obj2 = c0059w0;
            }
            obj2 = obj3;
        }
        if (!z4) {
            c0057v0.f172c[iM128f] = obj2;
            return;
        }
        int i13 = ~iM128f;
        c0057v0.f171b[i13] = obj;
        c0057v0.f172c[i13] = obj2;
    }

    /* JADX INFO: renamed from: g */
    public static C26466i m34586g(C26466i c26466i) {
        C26463f c26463f = c26466i.f105120w;
        c26463f.m78380b();
        return c26463f.f105108I > 0 ? c26466i : C26466i.f105119x;
    }

    /* JADX INFO: renamed from: h */
    public static final C27614e m34587h(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return new C27614e(str);
    }

    /* JADX INFO: renamed from: i */
    public static C0057v0 m34588i() {
        long[] jArr = AbstractC0015d1.f36a;
        return new C0057v0();
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC28601c1 m34589j() {
        return new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
    }

    /* JADX INFO: renamed from: k */
    public static C34854z0 m34590k(String string, C34818h0 c34818h0) {
        AbstractC22676k.m65750j(string, "<this>");
        C23465k c23465kM115321b = AbstractC36221c.m115321b(c34818h0);
        Charset charset = (Charset) c23465kM115321b.f92937w;
        C34818h0 c34818h1 = (C34818h0) c23465kM115321b.f92938x;
        C26616h c26616h = new C26616h();
        AbstractC22676k.m65750j(charset, "charset");
        int length = string.length();
        AbstractC22676k.m65750j(string, "string");
        AbstractC22676k.m65750j(charset, "charset");
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > string.length()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(length, "endIndex > string.length: ", " > ");
            sbM30466t.append(string.length());
            throw new IllegalArgumentException(sbM30466t.toString().toString());
        }
        if (charset.equals(AbstractC39397a.f169546a)) {
            c26616h.m79231t1(0, length, string);
        } else {
            String strSubstring = string.substring(0, length);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            byte[] bytes = strSubstring.getBytes(charset);
            AbstractC22676k.m65749i(bytes, "getBytes(...)");
            c26616h.m134463write(bytes, 0, bytes.length);
        }
        return new C34854z0(c34818h1, c26616h.f105866x, c26616h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final C13060l1 m34591l(AbstractC1848z0 db4, String[] strArr, Function1 function1) {
        AbstractC22676k.m65750j(db4, "db");
        C1835v invalidationTracker = db4.getInvalidationTracker();
        String[] tables = (String[]) Arrays.copyOf(strArr, strArr.length);
        invalidationTracker.getClass();
        AbstractC22676k.m65750j(tables, "tables");
        C1797i2 c1797i2 = invalidationTracker.f7189c;
        C23465k c23465kM5425g = c1797i2.m5425g(tables);
        String[] resolvedTableNames = (String[]) c23465kM5425g.f92937w;
        int[] tableIds = (int[]) c23465kM5425g.f92938x;
        AbstractC22676k.m65750j(resolvedTableNames, "resolvedTableNames");
        AbstractC22676k.m65750j(tableIds, "tableIds");
        InterfaceC13058l c13084s1 = new C13084s1(new C1578e1((Object) c1797i2, (Object) tableIds, (Object) resolvedTableNames, (InterfaceC30057d) (0 == true ? 1 : 0), 2));
        C1771c0 c1771c0 = invalidationTracker.f7196j;
        C1844y c1844yM5364a = c1771c0 != null ? c1771c0.m5364a(resolvedTableNames) : null;
        int i13 = 2;
        if (c1844yM5364a != null) {
            c13084s1 = AbstractC13091v.m36584J(c13084s1, c1844yM5364a);
        }
        return new C13060l1(AbstractC13091v.m36599i(c13084s1, -1, 2), db4, function1, i13);
    }

    /* JADX INFO: renamed from: m */
    public static C0237p m34592m(Object obj, Long l7, boolean z4, InterfaceC20595c interfaceC20595c, List list, InterfaceC20596d interfaceC20596d) {
        C38445a c38445aMo19987a = z4 ? interfaceC20595c.mo19987a(obj) : null;
        LinkedHashMap linkedHashMapMo51937a = interfaceC20596d.mo51937a(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                hashSet.add(str.toLowerCase(Locale.ROOT));
            }
        }
        for (Map.Entry entry : linkedHashMapMo51937a.entrySet()) {
            if (hashSet.contains(((String) entry.getKey()).toLowerCase(Locale.ROOT))) {
                linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new C0237p(l7, c38445aMo19987a, linkedHashMap, 13);
    }

    /* JADX INFO: renamed from: n */
    public static void m34593n(String str, String str2) {
        if (m34603x(3)) {
            Log.d(str, " 💚 " + str2);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC18184w m34594o(C18185x c18185x) {
        C18185x c18185x2 = new C18185x(3);
        for (String str : ((Map) c18185x.f3536x).keySet()) {
            List listM2427x0 = c18185x.m2427x0(str);
            if (listM2427x0 == null) {
                listM2427x0 = C25271y.f99162w;
            }
            String strM52155e = AbstractC18157a.m52155e(0, 0, 15, str, false);
            List list = listM2427x0;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC18157a.m52155e(0, 0, 11, (String) it.next(), true));
            }
            c18185x2.mo2297E(strM52155e, arrayList);
        }
        Map values = (Map) c18185x2.f3536x;
        AbstractC22676k.m65750j(values, "values");
        return new C18186y(values);
    }

    /* JADX INFO: renamed from: p */
    public static void m34595p(String str, String str2) {
        if (m34603x(6)) {
            Log.e(str, " ❤️ " + str2);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m34596q(String str, String str2, Exception exc) {
        if (m34603x(6)) {
            Log.e(str, " ❤️ " + str2, exc);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC12939a0 m34597r(Activity activity, int i13) {
        AbstractC22676k.m65750j(activity, "activity");
        View viewRequireViewById = ActivityCompat.requireViewById(activity, i13);
        AbstractC22676k.m65749i(viewRequireViewById, "requireViewById<View>(activity, viewId)");
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) AbstractC38176k.m122283s(AbstractC38176k.m122273B(AbstractC38176k.m122288x(viewRequireViewById, C12944c.f44714G), C12944c.f44715H));
        if (abstractC12939a0 != null) {
            return abstractC12939a0;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i13);
    }

    /* JADX INFO: renamed from: s */
    public static final AbstractC12939a0 m34598s(View view) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) AbstractC38176k.m122283s(AbstractC38176k.m122273B(AbstractC38176k.m122288x(view, C12944c.f44714G), C12944c.f44715H));
        if (abstractC12939a0 != null) {
            return abstractC12939a0;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Collection m34599t(InterfaceC22714q interfaceC22714q, C22704g c22704g, int i13) {
        if ((i13 & 1) != 0) {
            c22704g = C22704g.f89363m;
        }
        InterfaceC22712o.f89379a.getClass();
        return interfaceC22714q.getContributedDescriptors(c22704g, C22709l.f89376w);
    }

    /* JADX INFO: renamed from: u */
    public static Object m34600u(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2724c.m7690b(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final ViewParent m34601v(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static HashSet m34602w(Object... objArr) {
        HashSet hashSet = new HashSet(AbstractC25247g0.m73988W(objArr.length));
        AbstractC25260n.m74043S0(objArr, hashSet);
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: x */
    public static boolean m34603x(int i13) {
        int i14;
        if (C5341k.f21742r == null || C5341k.f21742r.f21744b == null) {
            i14 = 6;
        } else {
            C5341k.f21742r.getClass();
            C5381w c5381w = C5341k.f21742r.f21744b;
            if (c5381w != null) {
                i14 = c5381w.f21878d;
            } else {
                i14 = 6;
            }
        }
        return i13 >= i14;
    }

    /* JADX INFO: renamed from: y */
    public static LinkedHashSet m34604y(Object obj, Set set) {
        AbstractC22676k.m65750j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC25247g0.m73988W(set.size()));
        boolean z4 = false;
        for (Object obj2 : set) {
            boolean z13 = true;
            if (!z4 && AbstractC22676k.m65745e(obj2, obj)) {
                z4 = true;
                z13 = false;
            }
            if (z13) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: z */
    public static Set m34605z(Set set, Iterable elements) {
        AbstractC22676k.m65750j(set, "<this>");
        AbstractC22676k.m65750j(elements, "elements");
        Collection<?> collectionM74157x0 = AbstractC25265s.m74157x0(elements);
        if (collectionM74157x0.isEmpty()) {
            return AbstractC25265s.m74103I1(set);
        }
        if (!(collectionM74157x0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM74157x0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionM74157x0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }
}
