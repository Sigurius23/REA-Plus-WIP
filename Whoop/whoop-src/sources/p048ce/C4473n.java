package p048ce;

import bi.AbstractC3269g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p035bp.AbstractC3511b;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ce.n */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C4473n extends C22672i implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C4473n f18004w = new C4473n(3, AbstractC4482w.class, "configurationSection", "configurationSection(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Section;", 1);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00de  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EnumC4471l enumC4471l;
        C4472m p13 = (C4472m) obj;
        AbstractC22676k.m65750j(p13, "p0");
        if (!AbstractC3269g.m9482K(p13)) {
            return null;
        }
        String str = p13.f18003b;
        AbstractC22676k.m65750j(str, "<this>");
        String strM10369I = AbstractC3511b.m10369I(AbstractC3511b.m10369I(str, " #"), " ;");
        AbstractC22676k.m65750j(strM10369I, "<this>");
        boolean z4 = true;
        List listM125906y0 = AbstractC39414r.m125906y0(AbstractC39414r.m125869O0(AbstractC39414r.m125879X(1, AbstractC39414r.m125878W(1, AbstractC3511b.m10369I(AbstractC3511b.m10369I(strM10369I, "#"), ";")))).toString(), new String[]{" ", "\t"}, 2);
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : listM125906y0) {
            if (!AbstractC39414r.m125890i0((String) obj4)) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC39414r.m125869O0((String) it.next()).toString());
        }
        boolean zM65745e = AbstractC22676k.m65745e(AbstractC25265s.m74100H0(arrayList2), HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY);
        boolean z13 = !zM65745e;
        switch ((String) arrayList2.get(0)) {
            case "sso-session":
                enumC4471l = EnumC4471l.f17999x;
                break;
            case "profile":
                enumC4471l = EnumC4471l.f17998w;
                break;
            case "services":
                enumC4471l = EnumC4471l.f18000y;
                break;
            case "default":
                enumC4471l = EnumC4471l.f17998w;
                break;
            default:
                enumC4471l = EnumC4471l.f18001z;
                break;
        }
        String str2 = (String) AbstractC25265s.m74114R0(arrayList2);
        if (str2 == null) {
            str2 = "";
        }
        if ((arrayList2.size() != 1 || !AbstractC22676k.m65745e(arrayList2.get(0), HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY)) && (arrayList2.size() != 2 || str2.length() <= 0 || zM65745e || !AbstractC3511b.m10362B((String) arrayList2.get(1)))) {
            z4 = false;
        }
        return new C4485z(str2, enumC4471l, z13, z4);
    }
}
