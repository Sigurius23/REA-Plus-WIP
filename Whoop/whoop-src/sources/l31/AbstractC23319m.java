package l31;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16319p0;
import hy0.EnumC17727b2;
import java.util.List;
import p715kotlin.Metadata;
import p736sz0.C33182g1;
import p736sz0.C33203n1;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l31.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\u0007\u0010\u0005¨\u0006\f"}, m65681d2 = {"", "Lsz0/n1;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "verticalStatWithoutTrendWithIcon", "b", "d", "verticalStatWithoutTrendWithOutIcon", "verticalStatWithTrendWithIcon", "verticalStatWithTrendWithoutIcon", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23319m {

    /* JADX INFO: renamed from: a */
    private static final List<C33203n1> f92444a;

    /* JADX INFO: renamed from: b */
    private static final List<C33203n1> f92445b;

    /* JADX INFO: renamed from: c */
    private static final List<C33203n1> f92446c;

    /* JADX INFO: renamed from: d */
    private static final List<C33203n1> f92447d;

    static {
        int tinyHeartRate = AbstractC16319p0.m46430a().getTinyIcons().getTinyHeartRate();
        f92444a = AbstractC37056f.m118958J(new C33203n1(null, Integer.valueOf(tinyHeartRate), AbstractC8693b.m21278l("123"), AbstractC8693b.m21278l("STAT TITLE"), null, false, null, 65, null));
        f92445b = AbstractC37056f.m118958J(new C33203n1(null, null, AbstractC8693b.m21278l("123"), AbstractC8693b.m21278l("STAT TITLE"), null, false, null, 65, null));
        int tinyHeartRate2 = AbstractC16319p0.m46430a().getTinyIcons().getTinyHeartRate();
        TextResource textResourceM21278l = AbstractC8693b.m21278l("123");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("STAT TITLE");
        EnumC17727b2 enumC17727b2 = EnumC17727b2.POSITIVE;
        f92446c = AbstractC37056f.m118958J(new C33203n1(null, Integer.valueOf(tinyHeartRate2), textResourceM21278l, textResourceM21278l2, new C33182g1(AbstractC8693b.m21278l("8% past month"), enumC17727b2), false, null, 65, null));
        f92447d = AbstractC37056f.m118958J(new C33203n1(null, null, AbstractC8693b.m21278l("123"), AbstractC8693b.m21278l("STAT TITLE"), new C33182g1(AbstractC8693b.m21278l("8% past month"), enumC17727b2), false, null, 65, null));
    }

    /* JADX INFO: renamed from: a */
    public static final List<C33203n1> m67508a() {
        return f92446c;
    }

    /* JADX INFO: renamed from: b */
    public static final List<C33203n1> m67509b() {
        return f92447d;
    }

    /* JADX INFO: renamed from: c */
    public static final List<C33203n1> m67510c() {
        return f92444a;
    }

    /* JADX INFO: renamed from: d */
    public static final List<C33203n1> m67511d() {
        return f92445b;
    }
}
