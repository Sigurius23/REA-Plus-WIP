package d13;

import android.net.Uri;
import android.os.Parcel;
import androidx.health.platform.client.proto.C1508p;
import b83.C2807c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import dc3.C11923h;
import dc3.C11931p;
import eh3.C13198b;
import eh3.C13203g;
import hc3.AbstractC17189v;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import io.getstream.chat.android.models.User;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p108e4.AbstractC12682p;
import p114eb.C12969k0;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.InterfaceC17242c;
import p251jg.C21649b;
import p294l3.C23285v0;
import p452r7.C31003b0;
import p558vp.AbstractC36259c;
import p619xl.C38445a;
import p636y3.C39183o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: d13.a */
/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC11478a {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m30847A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11923h c11923h, AbstractC17189v abstractC17189v, AbstractC17189v abstractC17189v2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c11923h, abstractC17189v, abstractC17189v2)) {
            if (atomicReferenceFieldUpdater.get(c11923h) != abstractC17189v) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m30848B(int i13) {
        switch (i13) {
            case 1:
                return "Created";
            case 2:
                return "Started";
            case 3:
                return "Resumed";
            case 4:
                return "Paused";
            case 5:
                return "Stopped";
            case 6:
                return "Destroyed";
            default:
                return "null";
        }
    }

    public static int[] _values() {
        return AbstractC12682p.m35486f(9);
    }

    /* JADX INFO: renamed from: a */
    public static int m30849a(int i13, int i14, C23285v0 c23285v0) {
        return (c23285v0.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: b */
    public static int m30850b(User user, int i13, int i14) {
        return (user.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: c */
    public static int m30851c(InterfaceC25312u interfaceC25312u, int i13, int i14) {
        return (interfaceC25312u.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: d */
    public static long m30852d(long j7, long j13, float f13) {
        return AbstractC35745c.m113248j(C39183o.m124805c(j7) * f13, j13);
    }

    /* JADX INFO: renamed from: e */
    public static TextResource m30853e(Locale locale, String str, String str2) {
        String upperCase = str.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, str2);
        return AbstractC8693b.m21278l(upperCase);
    }

    /* JADX INFO: renamed from: f */
    public static C12969k0 m30854f(Uri uri, String str, Uri uri2, String str2, String str3) {
        AbstractC22676k.m65750j(uri, str);
        return new C12969k0(uri2, str2, str3);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC17242c m30855g(C38445a c38445a, C21649b c21649b) {
        return c21649b.m60916d(new C17249j(c38445a));
    }

    /* JADX INFO: renamed from: h */
    public static String m30856h(String str, Action action, String str2) {
        return str + action + str2;
    }

    /* JADX INFO: renamed from: i */
    public static String m30857i(String str, String str2, String str3, boolean z4) {
        return str + str2 + str3 + z4;
    }

    /* JADX INFO: renamed from: j */
    public static String m30858j(StringBuilder sb4, Boolean bool, String str) {
        sb4.append(bool);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m30859k(StringBuilder sb4, Integer num, String str) {
        sb4.append(num);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m30860l(StringBuilder sb4, Object obj, char c3) {
        sb4.append(obj);
        sb4.append(c3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: m */
    public static StringBuilder m30861m(String str, String str2, String str3, ExactDate exactDate, String str4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(exactDate);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m30862n(String str, AbstractC33208p0 abstractC33208p0, String str2, TextResource textResource, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(abstractC33208p0);
        sb4.append(str2);
        sb4.append(textResource);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: o */
    public static Iterator m30863o(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    /* JADX INFO: renamed from: p */
    public static C38445a m30864p(C17248i c17248i, C17248i c17248i2) {
        C38445a c38445a = new C38445a(13);
        c38445a.m123180p(c17248i);
        c38445a.m123180p(c17248i2);
        return c38445a;
    }

    /* JADX INFO: renamed from: q */
    public static void m30865q(StringBuilder sb4, DownstreamUserDto downstreamUserDto, String str, String str2, String str3) {
        sb4.append(downstreamUserDto);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: r */
    public static void m30866r(StringBuilder sb4, String str, String str2, User user, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(user);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: s */
    public static void m30867s(C31003b0 c31003b0, C1508p c1508p, String str) {
        c1508p.m4794e(AbstractC36259c.m115668D(c31003b0.m95540b()), str);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m30868t(AtomicReference atomicReference, C2807c c2807c) {
        while (!atomicReference.compareAndSet(null, c2807c)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m30869u(AtomicReference atomicReference, C13198b c13198b, Object obj) {
        while (!atomicReference.compareAndSet(c13198b, obj)) {
            if (atomicReference.get() != c13198b) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m30870v(AtomicReference atomicReference, C13203g c13203g, Object obj) {
        while (!atomicReference.compareAndSet(c13203g, obj)) {
            if (atomicReference.get() != c13203g) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m30871w(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m30872x(AtomicReference atomicReference, Throwable th3) {
        while (!atomicReference.compareAndSet(null, th3)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ boolean m30873y(AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService) {
        while (!atomicReference.compareAndSet(null, scheduledExecutorService)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m30874z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11923h c11923h, AbstractC17189v abstractC17189v, C11931p c11931p) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c11923h, abstractC17189v, c11931p)) {
            if (atomicReferenceFieldUpdater.get(c11923h) != abstractC17189v) {
                return false;
            }
        }
        return true;
    }
}
