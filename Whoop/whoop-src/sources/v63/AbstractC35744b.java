package v63;

import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import io.ktor.utils.p228io.core.InsufficientSpaceException;
import io.seon.androidsdk.service.AbstractC20660e1;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l83.C23465k;
import ne3.C26616h;
import ne3.C26621j0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.TimeMark;
import p715kotlin.time.TimeSource;
import p715kotlin.time.TimedValue;
import t63.AbstractC33559b;
import va3.C35850h;
import xa3.AbstractC38153n;
import xf3.C38264a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: v63.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35744b {
    /* JADX INFO: renamed from: a */
    public static final long m113228a(int i13, int i14) {
        return (((long) i14) & 4294967295L) | (((long) i13) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final void m113229b(int i13, int i14) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m113230c(int i13, int i14) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m113231d(int i13, int i14, int i15) {
        if (i13 < 0 || i14 > i15) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "fromIndex: ", ", toIndex: ", ", size: ");
            sbM30465s.append(i15);
            throw new IndexOutOfBoundsException(sbM30465s.toString());
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i13, i14, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m113232e(C26616h c26616h) {
        AbstractC22676k.m65750j(c26616h, "<this>");
        try {
            C26621j0 c26621j0Peek = c26616h.peek();
            for (long j7 = 0; j7 < 16 && !c26621j0Peek.mo79222o(); j7++) {
                c26621j0Peek.mo79207g0(1L);
                C26616h c26616h2 = c26621j0Peek.f105872x;
                byte bM79229s = c26616h2.m79229s(0L);
                if ((bM79229s & 224) == 192) {
                    c26621j0Peek.mo79207g0(2L);
                } else if ((bM79229s & 240) == 224) {
                    c26621j0Peek.mo79207g0(3L);
                } else if ((bM79229s & 248) == 240) {
                    c26621j0Peek.mo79207g0(4L);
                }
                int iM79196T0 = c26616h2.m79196T0();
                if (Character.isISOControl(iM79196T0) && !Character.isWhitespace(iM79196T0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final double m113233f(InterfaceC4339a interfaceC4339a) {
        TimeMark timeMarkMarkNow = TimeSource.Monotonic.INSTANCE.markNow();
        interfaceC4339a.invoke();
        return Duration.toDouble-impl(timeMarkMarkNow.mo134250elapsedNowUwyO8pc(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: g */
    public static final C23465k m113234g(C38264a c38264a) {
        TimedValue timedValue = new TimedValue(c38264a.invoke(), TimeSource.Monotonic.INSTANCE.markNow().mo134250elapsedNowUwyO8pc(), null);
        return new C23465k(timedValue.getValue(), Double.valueOf(Duration.toDouble-impl(timedValue.m134401getDurationUwyO8pc(), TimeUnit.MILLISECONDS)));
    }

    /* JADX INFO: renamed from: h */
    public static String m113235h(C35850h c35850h) {
        AbstractC22676k.m65750j(c35850h, "<this>");
        String strM113817b = c35850h.m113817b();
        AbstractC22676k.m65747g(strM113817b);
        if (!AbstractC38153n.f163393a.contains(strM113817b)) {
            for (int i13 = 0; i13 < strM113817b.length(); i13++) {
                char cCharAt = strM113817b.charAt(i13);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strM113817b.length() != 0 && Character.isJavaIdentifierStart(strM113817b.codePointAt(0))) {
                return strM113817b;
            }
        }
        return "`".concat(strM113817b) + '`';
    }

    /* JADX INFO: renamed from: i */
    public static final String m113236i(String lowerRendered, String upperRendered, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 escape) {
        AbstractC22676k.m65750j(lowerRendered, "lowerRendered");
        AbstractC22676k.m65750j(upperRendered, "upperRendered");
        AbstractC22676k.m65750j(escape, "escape");
        String str = (String) interfaceC4339a.invoke();
        String strM113238k = m113238k(lowerRendered, AbstractC2875y.m8299l(str, "Mutable"), upperRendered, str, AbstractC2875y.m8299l(str, "(Mutable)"));
        if (strM113238k != null) {
            return strM113238k;
        }
        String strM113238k2 = m113238k(lowerRendered, str.concat("MutableMap.MutableEntry"), upperRendered, str.concat("Map.Entry"), str.concat("(Mutable)Map.(Mutable)Entry"));
        if (strM113238k2 != null) {
            return strM113238k2;
        }
        String str2 = (String) interfaceC4339a2.invoke();
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str2);
        sbM53374o.append((String) escape.invoke("Array<"));
        String string = sbM53374o.toString();
        StringBuilder sbM53374o2 = AbstractC18489d0.m53374o(str2);
        sbM53374o2.append((String) escape.invoke("Array<out "));
        String string2 = sbM53374o2.toString();
        StringBuilder sbM53374o3 = AbstractC18489d0.m53374o(str2);
        sbM53374o3.append((String) escape.invoke("Array<(out) "));
        String strM113238k3 = m113238k(lowerRendered, string, upperRendered, string2, sbM53374o3.toString());
        if (strM113238k3 != null) {
            return strM113238k3;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final String m113237j(List list) {
        StringBuilder sb4 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C35850h c35850h = (C35850h) it.next();
            if (sb4.length() > 0) {
                sb4.append(".");
            }
            sb4.append(m113235h(c35850h));
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static final String m113238k(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        AbstractC22676k.m65750j(lowerRendered, "lowerRendered");
        AbstractC22676k.m65750j(lowerPrefix, "lowerPrefix");
        AbstractC22676k.m65750j(upperRendered, "upperRendered");
        AbstractC22676k.m65750j(upperPrefix, "upperPrefix");
        AbstractC22676k.m65750j(foldedPrefix, "foldedPrefix");
        if (!AbstractC39421y.m125930O(lowerRendered, lowerPrefix, false) || !AbstractC39421y.m125930O(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        String strConcat = foldedPrefix.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!m113240m(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    /* JADX INFO: renamed from: l */
    public static final long m113239l(long j7) {
        return (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m113240m(String lower, String upper) {
        AbstractC22676k.m65750j(lower, "lower");
        AbstractC22676k.m65750j(upper, "upper");
        if (lower.equals(AbstractC39421y.m125926K(upper, "?", "", false))) {
            return true;
        }
        if (AbstractC39421y.m125920E(upper, "?", false) && AbstractC22676k.m65745e(lower.concat("?"), upper)) {
            return true;
        }
        StringBuilder sb4 = new StringBuilder("(");
        sb4.append(lower);
        sb4.append(")?");
        return AbstractC22676k.m65745e(sb4.toString(), upper);
    }

    /* JADX INFO: renamed from: n */
    public static final void m113241n(AbstractC20660e1 abstractC20660e1, ByteBuffer byteBuffer) throws InsufficientSpaceException, EOFException {
        AbstractC22676k.m65750j(abstractC20660e1, "<this>");
        int iRemaining = byteBuffer.remaining();
        ByteBuffer destination = (ByteBuffer) abstractC20660e1.f77291g;
        int i13 = abstractC20660e1.f77287c;
        int i14 = abstractC20660e1.f77289e - i13;
        if (i14 < iRemaining) {
            throw new InsufficientSpaceException("buffer content", iRemaining, i14);
        }
        AbstractC22676k.m65750j(destination, "destination");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            AbstractC12889b.m36264b0(destination, i13, byteBuffer.remaining()).put(byteBuffer);
        } else {
            byte[] bArrArray = byteBuffer.array();
            AbstractC22676k.m65749i(bArrArray, "array()");
            int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            int iRemaining2 = byteBuffer.remaining();
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrArray, iPosition, iRemaining2).slice().order(ByteOrder.BIG_ENDIAN);
            AbstractC22676k.m65749i(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            AbstractC33559b.m105978a(byteBufferOrder, destination, 0, iRemaining2, i13);
            byteBuffer.position(byteBuffer.limit());
        }
        abstractC20660e1.m56791b(iRemaining);
    }
}
