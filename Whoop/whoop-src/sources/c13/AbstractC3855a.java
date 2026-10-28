package c13;

import android.os.Parcel;
import b91.AbstractC2890e;
import com.mapbox.bindgen.RecordUtils;
import dp0.AbstractC12252h;
import fy1.AbstractC14877m;
import fy1.C14873i;
import gz0.AbstractC16319p0;
import io.getstream.android.video.generated.models.CallResponse;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jg3.C21682i;
import m83.C25235a0;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28655q;
import p390p1.C28674u2;
import p715kotlin.jvm.internal.C22677k0;
import p720m91.InterfaceC25312u;
import p745y81.AbstractC42793j;
import p747z81.AbstractC42794f;
import p747z81.Function1;
import qf1.AbstractC30320a;
import x81.AbstractC38071c;
import x81.AbstractC38073e;
import x81.C38069a;

/* JADX INFO: renamed from: c13.a */
/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC3855a {
    /* JADX INFO: renamed from: A */
    public static AbstractC28669t1 m11814A(AbstractC28669t1 abstractC28669t1, C22677k0 c22677k0) {
        c22677k0.m65760a(abstractC28669t1.mo86977a(Function1.m128938q()));
        return AbstractC38073e.m121973u();
    }

    /* JADX INFO: renamed from: B */
    public static AbstractC28669t1 m11815B(AbstractC28669t1 abstractC28669t1, C22677k0 c22677k0) {
        c22677k0.m65760a(abstractC28669t1.mo86977a(AbstractC42794f.m128943c()));
        return AbstractC38073e.m121968p();
    }

    /* JADX INFO: renamed from: C */
    public static AbstractC28669t1 m11816C(AbstractC28669t1 abstractC28669t1, C22677k0 c22677k0) {
        c22677k0.m65760a(abstractC28669t1.mo86977a(AbstractC2890e.m8450e()));
        return AbstractC38073e.m121970r();
    }

    /* JADX INFO: renamed from: a */
    public static int m11817a() {
        return AbstractC16319p0.m46430a().getActivities().getCycling();
    }

    /* JADX INFO: renamed from: b */
    public static int m11818b(CallResponse callResponse, int i13, int i14) {
        return (callResponse.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: c */
    public static int m11819c(DownstreamUserDto downstreamUserDto, int i13, int i14) {
        return (downstreamUserDto.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: d */
    public static int m11820d(ExactDate exactDate, int i13, int i14) {
        return (exactDate.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: e */
    public static int m11821e(Map map, int i13, int i14) {
        return (map.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: f */
    public static int m11822f(C21682i c21682i, int i13, int i14) {
        return (c21682i.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: g */
    public static int m11823g(C28674u2 c28674u2, C22677k0 c22677k0, ArrayList arrayList) {
        c22677k0.m65760a(c28674u2.mo86977a(AbstractC38073e.m121974v()));
        c22677k0.m65764e(AbstractC38071c.m121947d());
        return arrayList.size();
    }

    /* JADX INFO: renamed from: h */
    public static String m11824h(IOException iOException, StringBuilder sb4) {
        sb4.append(iOException.getMessage());
        return sb4.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m11825i(String str, String str2, String str3, String str4, boolean z4) {
        return str + z4 + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: j */
    public static String m11826j(String str, String str2, StringBuilder sb4) {
        sb4.append(RecordUtils.fieldToString(str));
        sb4.append(str2);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m11827k(String str, String str2, boolean z4) {
        return str + z4 + str2;
    }

    /* JADX INFO: renamed from: l */
    public static String m11828l(StringBuilder sb4, String str, StringBuilder sb5, String str2) {
        sb4.append(str);
        sb5.append(sb4.toString());
        sb5.append(str2);
        return sb5.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m11829m(StringBuilder sb4, List list, String str) {
        sb4.append(list);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m11830n(String str, String str2, String str3, Date date, String str4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(date);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: o */
    public static C28633k1 m11831o(float f13, C28655q c28655q) {
        C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(Float.valueOf(f13));
        c28655q.m87172p0(c28633k1M87272z);
        return c28633k1M87272z;
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC28669t1 m11832p(C25235a0 c25235a0, AbstractC28669t1 abstractC28669t1, C22677k0 c22677k0) {
        c22677k0.m65760a(abstractC28669t1.mo86977a(new C38069a(c25235a0)));
        return AbstractC30320a.m92665c();
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC28669t1 m11833q(AbstractC28669t1 abstractC28669t1, C14873i c14873i, C22677k0 c22677k0) {
        c22677k0.m65760a(abstractC28669t1.mo86977a(c14873i));
        return AbstractC12252h.m34153c();
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC28669t1 m11834r(AbstractC28669t1 abstractC28669t1, C22677k0 c22677k0) {
        c22677k0.m65760a(abstractC28669t1.mo86977a(AbstractC42793j.m125436c()));
        return AbstractC38073e.m121972t();
    }

    /* JADX INFO: renamed from: s */
    public static void m11835s(double d3, String str, StringBuilder sb4) {
        sb4.append(RecordUtils.fieldToString(Double.valueOf(d3)));
        sb4.append(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m11836t(long j7, String str, StringBuilder sb4) {
        sb4.append(RecordUtils.fieldToString(Long.valueOf(j7)));
        sb4.append(str);
    }

    /* JADX INFO: renamed from: u */
    public static void m11837u(Parcel parcel, int i13, Integer num) {
        parcel.writeInt(i13);
        parcel.writeInt(num.intValue());
    }

    /* JADX INFO: renamed from: v */
    public static void m11838v(String str, String str2, StringBuilder sb4) {
        sb4.append(RecordUtils.fieldToString(str));
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m11839w(StringBuilder sb4, Boolean bool, String str, Boolean bool2, String str2) {
        sb4.append(bool);
        sb4.append(str);
        sb4.append(bool2);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: x */
    public static void m11840x(StringBuilder sb4, Map map, String str, Map map2, String str2) {
        sb4.append(map);
        sb4.append(str);
        sb4.append(map2);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m11841y(InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: z */
    public static AbstractC28669t1 m11842z(C25235a0 c25235a0, AbstractC28669t1 abstractC28669t1, C22677k0 c22677k0) {
        c22677k0.m65760a(abstractC28669t1.mo86977a(new C38069a(c25235a0)));
        return AbstractC14877m.m42918c();
    }
}
