package p384ow;

import com.nimbusds.jose.shaded.gson.JsonParseException;
import ih0.AbstractC18489d0;
import p440qw.AbstractC30672g;
import p596ww.C37653a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ow.x */
/* JADX INFO: loaded from: classes6.dex */
public abstract class EnumC28428x {

    /* JADX INFO: renamed from: w */
    public static final C28424t f114645w;

    /* JADX INFO: renamed from: x */
    public static final C28425u f114646x;

    /* JADX INFO: renamed from: y */
    public static final C28426v f114647y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC28428x[] f114648z;

    static {
        C28424t c28424t = new C28424t();
        f114645w = c28424t;
        C28425u c28425u = new C28425u();
        f114646x = c28425u;
        C28426v c28426v = new C28426v();
        f114647y = c28426v;
        f114648z = new EnumC28428x[]{c28424t, c28425u, c28426v, new EnumC28428x() { // from class: ow.w
            @Override // p384ow.EnumC28428x
            /* JADX INFO: renamed from: a */
            public final Number mo86143a(C37653a c37653a) {
                String strNextString = c37653a.nextString();
                try {
                    return AbstractC30672g.m94273i(strNextString);
                } catch (NumberFormatException e5) {
                    StringBuilder sbM53375p = AbstractC18489d0.m53375p("Cannot parse ", strNextString, "; at path ");
                    sbM53375p.append(c37653a.m121060k(true));
                    throw new JsonParseException(sbM53375p.toString(), e5);
                }
            }
        }};
    }

    public static EnumC28428x valueOf(String str) {
        return (EnumC28428x) Enum.valueOf(EnumC28428x.class, str);
    }

    public static EnumC28428x[] values() {
        return (EnumC28428x[]) f114648z.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract Number mo86143a(C37653a c37653a);
}
