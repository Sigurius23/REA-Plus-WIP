package y00;

import com.whoop.android.R;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.C0030i1;
import p098dt.AbstractC12350b;
import p441qx.C30706d0;
import p499t9.C33623c0;
import p695zx.C41185g;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.C33617b;
import yb3.AbstractC39414r;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.i[], still in use, count: 1, list:
  (r0v1 y00.i[]) from 0x0299: INVOKE (r0v2 t83.b) = (r0v1 y00.i[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: y00.i */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38853i {
    Visa("visa", "Visa", R.drawable.stripe_ic_visa, null, 0, Pattern.compile("^(4)[0-9]*$"), AbstractC25247g0.m73989X(new C23465k(1, Pattern.compile("^4$"))), null, 1, 1656),
    MasterCard("mastercard", "Mastercard", R.drawable.stripe_ic_mastercard, null, 0, Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), AbstractC25247g0.m73990Y(new C23465k(1, Pattern.compile("^2|5|6$")), new C23465k(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, 2, 1656),
    AmericanExpress("amex", "American Express", R.drawable.stripe_ic_amex, AbstractC25260n.m74059b1(new Integer[]{3, 4}), 15, Pattern.compile("^(34|37)[0-9]*$"), AbstractC25247g0.m73989X(new C23465k(1, Pattern.compile("^3$"))), null, 3, 1552),
    Discover("discover", "Discover", R.drawable.stripe_ic_discover, null, 0, Pattern.compile("^(60|64|65)[0-9]*$"), AbstractC25247g0.m73989X(new C23465k(1, Pattern.compile("^6$"))), null, 4, 1656),
    JCB("jcb", "JCB", R.drawable.stripe_ic_jcb, null, 0, Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$"), AbstractC25247g0.m73990Y(new C23465k(1, Pattern.compile("^3$")), new C23465k(2, Pattern.compile("^(35)$")), new C23465k(3, Pattern.compile("^(35[2-8])$"))), null, 5, 1656),
    DinersClub("diners", "Diners Club", R.drawable.stripe_ic_diners, null, 16, Pattern.compile("^(36|30|38|39)[0-9]*$"), AbstractC25247g0.m73989X(new C23465k(1, Pattern.compile("^3$"))), AbstractC25247g0.m73989X(new C23465k(Pattern.compile("^(36)[0-9]*$"), 14)), 6, 1080),
    UnionPay("unionpay", "UnionPay", R.drawable.stripe_ic_unionpay, null, 0, Pattern.compile("^(62|81)[0-9]*$"), AbstractC25247g0.m73989X(new C23465k(1, Pattern.compile("^6|8$"))), null, 7, 1656),
    CartesBancaires("cartes_bancaires", "Cartes Bancaires", R.drawable.stripe_ic_cartes_bancaires, null, 0, Pattern.compile("(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), AbstractC25247g0.m73990Y(new C23465k(1, Pattern.compile("^4$")), new C23465k(2, Pattern.compile("^2|5|6$")), new C23465k(3, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, 8, 632),
    Interac("interac", "Interac", R.drawable.stripe_ic_interac, null, 0, Pattern.compile("^(4506|4519|4724|4536|500|5510|629449)[0-9]*$"), AbstractC25247g0.m73990Y(new C23465k(1, Pattern.compile("^(4|5|6)$")), new C23465k(2, Pattern.compile("^(45|50|55|62)$")), new C23465k(3, Pattern.compile("^(450|451|472|453|500|551|629)$")), new C23465k(4, Pattern.compile("^(4506|4519|4724|4536|5510|6294)$")), new C23465k(5, Pattern.compile("^(62944)$")), new C23465k(6, Pattern.compile("^(629449)$"))), null, 9, 632),
    Unknown("unknown", "Unknown", R.drawable.stripe_ic_unknown, AbstractC25260n.m74059b1(new Integer[]{3, 4}), 0, null, C25272z.f99163w, null, -1, 1752);


    /* JADX INFO: renamed from: M */
    public static final C33623c0 f167238M;

    /* JADX INFO: renamed from: N */
    public static final List f167239N;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C33617b f167251Z;

    /* JADX INFO: renamed from: E */
    public final int f167252E;

    /* JADX INFO: renamed from: F */
    public final Set f167253F;

    /* JADX INFO: renamed from: G */
    public final int f167254G;

    /* JADX INFO: renamed from: H */
    public final Pattern f167255H;

    /* JADX INFO: renamed from: I */
    public final Map f167256I;

    /* JADX INFO: renamed from: J */
    public final Map f167257J;

    /* JADX INFO: renamed from: K */
    public final boolean f167258K;

    /* JADX INFO: renamed from: L */
    public final int f167259L;

    /* JADX INFO: renamed from: w */
    public final String f167260w;

    /* JADX INFO: renamed from: x */
    public final String f167261x;

    /* JADX INFO: renamed from: y */
    public final int f167262y;

    /* JADX INFO: renamed from: z */
    public final int f167263z;

    static {
        C33617b c33617bM44468u = AbstractC15751g.m44468u(enumC38853iArr);
        f167251Z = c33617bM44468u;
        f167238M = new C33623c0();
        ArrayList arrayList = new ArrayList();
        C0030i1 c0030i1 = new C0030i1(c33617bM44468u, 2);
        while (c0030i1.hasNext()) {
            Object next = c0030i1.next();
            if (((EnumC38853i) next).f167258K) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((EnumC38853i) obj).f167259L > 0) {
                arrayList2.add(obj);
            }
        }
        f167239N = AbstractC25265s.m74152u1(arrayList2, new C30706d0(10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumC38853i(String str, String str2, int i13, Set set, int i14, Pattern pattern, Map map, Map map2, int i15, int i16) {
        super(str, i);
        int i17 = (i16 & 8) != 0 ? R.drawable.stripe_ic_cvc : R.drawable.stripe_ic_cvc_amex;
        set = (i16 & 32) != 0 ? AbstractC12350b.m34570S(3) : set;
        i14 = (i16 & 64) != 0 ? 16 : i14;
        pattern = (i16 & 128) != 0 ? null : pattern;
        map2 = (i16 & 512) != 0 ? C25272z.f99163w : map2;
        boolean z4 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0;
        this.f167260w = str;
        this.f167261x = str2;
        this.f167262y = i13;
        this.f167263z = i17;
        this.f167252E = R.drawable.stripe_ic_error;
        this.f167253F = set;
        this.f167254G = i14;
        this.f167255H = pattern;
        this.f167256I = map;
        this.f167257J = map2;
        this.f167258K = z4;
        this.f167259L = i15;
    }

    public static EnumC38853i valueOf(String str) {
        return (EnumC38853i) Enum.valueOf(EnumC38853i.class, str);
    }

    public static EnumC38853i[] values() {
        return (EnumC38853i[]) f167250Y.clone();
    }

    /* JADX INFO: renamed from: a */
    public final String m124352a() {
        return this.f167260w;
    }

    /* JADX INFO: renamed from: b */
    public final int m124353b() {
        Integer num = (Integer) AbstractC25265s.m74115S0(this.f167253F);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    /* JADX INFO: renamed from: c */
    public final int m124354c(String cardNumber) {
        Object next;
        AbstractC22676k.m65750j(cardNumber, "cardNumber");
        C41185g c41185g = new C41185g(cardNumber);
        Iterator it = this.f167257J.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Pattern) ((Map.Entry) next).getKey()).matcher(c41185g.f177696d).matches());
        Map.Entry entry = (Map.Entry) next;
        return entry != null ? ((Number) entry.getValue()).intValue() : this.f167254G;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m124355d(String str) {
        String string;
        return m124353b() == ((str == null || (string = AbstractC39414r.m125869O0(str).toString()) == null) ? 0 : string.length());
    }
}
