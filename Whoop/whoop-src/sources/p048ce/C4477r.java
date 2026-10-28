package p048ce;

import bi.AbstractC3269g;
import p035bp.AbstractC3511b;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ce.r */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C4477r extends C22672i implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C4477r f18008w = new C4477r(3, AbstractC4482w.class, "credentialProfile", "credentialProfile(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Section;", 1);

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4472m p13 = (C4472m) obj;
        AbstractC22676k.m65750j(p13, "p0");
        String str = p13.f18003b;
        if (!AbstractC3269g.m9482K(p13)) {
            return null;
        }
        if (AbstractC3269g.m9482K(p13) && AbstractC39414r.m125876U(str, "sso-session", false)) {
            return null;
        }
        AbstractC22676k.m65750j(str, "<this>");
        String strM10369I = AbstractC3511b.m10369I(AbstractC3511b.m10369I(str, " #"), " ;");
        AbstractC22676k.m65750j(strM10369I, "<this>");
        String string = AbstractC39414r.m125869O0(AbstractC39414r.m125879X(1, AbstractC39414r.m125878W(1, AbstractC3511b.m10369I(AbstractC3511b.m10369I(strM10369I, "#"), ";")))).toString();
        return new C4485z(string, EnumC4471l.f17998w, false, AbstractC3511b.m10362B(string));
    }
}
