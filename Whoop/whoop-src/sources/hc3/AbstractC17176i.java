package hc3;

import android.os.Bundle;
import androidx.compose.foundation.layout.AbstractC1102d;
import gz0.EnumC16313m0;
import hms.webrtc.Logging;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingState;
import io.ktor.utils.p228io.internal.C19992b;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n23.AbstractC26202e;
import ng3.InterfaceC26700m;
import p026b2.C2314t;
import p108e4.AbstractC12682p;
import p194hg.C17248i;
import p291l0.AbstractC22953f;
import p363ob.C27785h;
import p363ob.C27788k;
import p390p1.C28655q;
import p518ub.InterfaceC34728a;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: hc3.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC17176i {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m48498A(int i13) {
        if (i13 == 1) {
            return "IDLE";
        }
        if (i13 == 2) {
            return "QUEUING";
        }
        if (i13 != 3) {
            return i13 != 4 ? "null" : "RUNNING";
        }
        return "QUEUED";
    }

    public static int[] _values() {
        return AbstractC12682p.m35486f(20);
    }

    /* JADX INFO: renamed from: a */
    public static int m48499a(int i13, int i14, double d3) {
        return (Double.hashCode(d3) + i13) * i14;
    }

    /* JADX INFO: renamed from: b */
    public static int m48500b(EnumC16313m0 enumC16313m0, int i13, int i14) {
        return (enumC16313m0.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: c */
    public static String m48501c(Message message, String str, String str2) {
        return str + message + str2;
    }

    /* JADX INFO: renamed from: d */
    public static String m48502d(String str, RecordingState recordingState) {
        return str + recordingState;
    }

    /* JADX INFO: renamed from: e */
    public static String m48503e(String str, AbstractC26202e abstractC26202e, String str2) {
        return str + abstractC26202e + str2;
    }

    /* JADX INFO: renamed from: f */
    public static String m48504f(String str, InterfaceC26700m interfaceC26700m) {
        return str + interfaceC26700m;
    }

    /* JADX INFO: renamed from: g */
    public static String m48505g(String str, C27788k c27788k, String str2, C27788k c27788k2) {
        return str + c27788k + str2 + c27788k2;
    }

    /* JADX INFO: renamed from: h */
    public static String m48506h(StringBuilder sb4, List list, char c3) {
        sb4.append(list);
        sb4.append(c3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: i */
    public static LinkedHashSet m48507i(LinkedHashMap linkedHashMap, String str, C27785h c27785h) {
        linkedHashMap.put(str, c27785h);
        return new LinkedHashSet();
    }

    /* JADX INFO: renamed from: j */
    public static C38445a m48508j(C17248i c17248i) {
        C38445a c38445a = new C38445a(13);
        c38445a.m123180p(c17248i);
        return c38445a;
    }

    /* JADX INFO: renamed from: k */
    public static void m48509k(int i13, String str, String str2) {
        Logging.m49570d(str2, str + i13);
    }

    /* JADX INFO: renamed from: l */
    public static void m48510l(String str, String str2, String str3) {
        Logging.m49570d(str3, str + str2);
    }

    /* JADX INFO: renamed from: m */
    public static void m48511m(String str, String str2, String str3, StringBuilder sb4, List list) {
        sb4.append(list);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: n */
    public static void m48512n(StringBuilder sb4, Date date, String str, Date date2, String str2) {
        sb4.append(date);
        sb4.append(str);
        sb4.append(date2);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m48513o(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m48514p(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C17179l c17179l, C17181n c17181n, C17181n c17181n2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c17179l, c17181n, c17181n2) && atomicReferenceFieldUpdater.get(c17179l) == c17181n) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m48515q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C17181n c17181n, C17181n c17181n2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c17181n, null, c17181n2) && atomicReferenceFieldUpdater.get(c17181n) == null) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m48516r(C28655q c28655q, boolean z4, C2314t c2314t, float f13, C28655q c28655q2) {
        c28655q.m87173q(z4);
        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
    }

    /* JADX INFO: renamed from: s */
    public static void m48517s(InterfaceC34728a interfaceC34728a, String str, String str2, String str3, String str4) {
        AbstractC22676k.m65750j(interfaceC34728a, str);
        interfaceC34728a.mo109660E(str2);
        interfaceC34728a.mo109660E(str3);
        interfaceC34728a.mo109660E(str4);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m48518t(Bundle bundle, Class cls, String str) {
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.containsKey(str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m48519u(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m48520v(String str, Locale locale, String str2, String str3) {
        String upperCase = str.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, str2);
        return upperCase.equals(str3);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m48521w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C17178k c17178k, C17178k c17178k2, C17178k c17178k3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c17178k, c17178k2, c17178k3)) {
            if (atomicReferenceFieldUpdater.get(c17178k) != c17178k2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m48522x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C19992b c19992b, Object obj) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c19992b, obj, null)) {
            if (atomicReferenceFieldUpdater.get(c19992b) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ boolean m48523y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, InterfaceC30057d interfaceC30057d) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, null, interfaceC30057d)) {
            if (atomicReferenceFieldUpdater.get(obj) != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m48524z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, InterfaceC30057d interfaceC30057d) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, interfaceC30057d, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != interfaceC30057d) {
                return false;
            }
        }
        return true;
    }
}
