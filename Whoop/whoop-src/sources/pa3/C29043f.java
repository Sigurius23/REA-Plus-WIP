package pa3;

import fa3.AbstractC14331x;
import java.security.AccessControlException;
import java.util.HashMap;
import live.hms.video.factories.MediaConstraintsFactory;
import oa3.InterfaceC27771n;
import oa3.InterfaceC27773p;
import p037bu.C3632c;
import va3.AbstractC35844b;
import va3.C35845c;
import va3.C35847e;
import w93.C36968a;

/* JADX INFO: renamed from: pa3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C29043f implements InterfaceC27773p {

    /* JADX INFO: renamed from: I */
    public static final boolean f117536I;

    /* JADX INFO: renamed from: J */
    public static final HashMap f117537J;

    /* JADX INFO: renamed from: E */
    public String[] f117538E;

    /* JADX INFO: renamed from: F */
    public String[] f117539F;

    /* JADX INFO: renamed from: G */
    public EnumC29038a f117540G;

    /* JADX INFO: renamed from: H */
    public String[] f117541H;

    /* JADX INFO: renamed from: w */
    public int[] f117542w;

    /* JADX INFO: renamed from: x */
    public String f117543x;

    /* JADX INFO: renamed from: y */
    public int f117544y;

    /* JADX INFO: renamed from: z */
    public String[] f117545z;

    static {
        try {
            f117536I = MediaConstraintsFactory.kValueTrue.equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f117536I = false;
        }
        HashMap map = new HashMap();
        f117537J = map;
        map.put(AbstractC35844b.m113770k(new C35847e("kotlin.jvm.internal.KotlinClass")), EnumC29038a.CLASS);
        map.put(AbstractC35844b.m113770k(new C35847e("kotlin.jvm.internal.KotlinFileFacade")), EnumC29038a.FILE_FACADE);
        map.put(AbstractC35844b.m113770k(new C35847e("kotlin.jvm.internal.KotlinMultifileClass")), EnumC29038a.MULTIFILE_CLASS);
        map.put(AbstractC35844b.m113770k(new C35847e("kotlin.jvm.internal.KotlinMultifileClassPart")), EnumC29038a.MULTIFILE_CLASS_PART);
        map.put(AbstractC35844b.m113770k(new C35847e("kotlin.jvm.internal.KotlinSyntheticClass")), EnumC29038a.SYNTHETIC_CLASS);
    }

    @Override // oa3.InterfaceC27773p
    /* JADX INFO: renamed from: i */
    public final InterfaceC27771n mo45165i(C35845c c35845c, C36968a c36968a) {
        EnumC29038a enumC29038a;
        C35847e c35847eM113773a = c35845c.m113773a();
        if (c35847eM113773a.equals(AbstractC14331x.f52306a)) {
            return new C3632c(this);
        }
        if (c35847eM113773a.equals(AbstractC14331x.f52320o)) {
            return new C29041d(this, 0);
        }
        if (f117536I || this.f117540G != null || (enumC29038a = (EnumC29038a) f117537J.get(c35845c)) == null) {
            return null;
        }
        this.f117540G = enumC29038a;
        return new C29041d(this, 1);
    }
}
