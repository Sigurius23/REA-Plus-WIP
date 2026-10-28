package p048ce;

import ge3.AbstractC15751g;
import java.util.List;
import m83.AbstractC25265s;
import p250jf.AbstractC21636e;
import p250jf.C21632a;
import p646yd.AbstractC39455f;
import p715kotlin.jvm.internal.AbstractC22676k;
import vg.C35971r;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ce.v[], still in use, count: 1, list:
  (r0v1 ce.v[]) from 0x0067: INVOKE (r0v1 ce.v[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ce.v */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC4481v {
    CONFIGURATION(AbstractC39455f.f169745g, AbstractC37056f.m118959K(C4473n.f18004w, C4474o.f18005w, C4475p.f18006w, C4476q.f18007w), AbstractC37056f.m118959K("~", ".aws", "config")),
    CREDENTIAL(AbstractC39455f.f169746h, AbstractC37056f.m118959K(C4477r.f18008w, C4478s.f18009w, C4479t.f18010w, C4480u.f18011w), AbstractC37056f.m118959K("~", ".aws", "credentials"));


    /* JADX INFO: renamed from: w */
    public final C21632a f18015w;

    /* JADX INFO: renamed from: x */
    public final List f18016x;

    /* JADX INFO: renamed from: y */
    public final List f18017y;

    static {
        AbstractC15751g.m44468u(enumC4481vArr);
    }

    public EnumC4481v(C21632a c21632a, List list, List list2) {
        super(str, i);
        this.f18015w = c21632a;
        this.f18016x = list;
        this.f18017y = list2;
    }

    public static EnumC4481v valueOf(String str) {
        return (EnumC4481v) Enum.valueOf(EnumC4481v.class, str);
    }

    public static EnumC4481v[] values() {
        return (EnumC4481v[]) f18013F.clone();
    }

    /* JADX INFO: renamed from: a */
    public final String m13964a(InterfaceC35967n platform) {
        String string;
        AbstractC22676k.m65750j(platform, "platform");
        String str = (String) AbstractC21636e.m60881b(this.f18015w, platform);
        if (str != null && (string = AbstractC39414r.m125869O0(str).toString()) != null) {
            return string;
        }
        List list = this.f18017y;
        Object value = C35971r.f153160d.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return AbstractC25265s.m74110N0(list, (String) value, null, null, null, 62);
    }
}
