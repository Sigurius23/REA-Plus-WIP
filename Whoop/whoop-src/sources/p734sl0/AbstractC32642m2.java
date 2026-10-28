package p734sl0;

import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sl0.m2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lsl0/v2;", "type", "", "index", "", "a", "(Lsl0/v2;I)Ljava/lang/String;", "number", "b", "(I)Ljava/lang/String;", "", "Ljava/util/List;", "values", "letters", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32642m2 {

    /* JADX INFO: renamed from: a */
    private static final List<Integer> f135290a = AbstractC37056f.m118959K(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);

    /* JADX INFO: renamed from: b */
    private static final List<String> f135291b = AbstractC37056f.m118959K("m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i");

    /* JADX INFO: renamed from: sl0.m2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f135292a;

        static {
            int[] iArr = new int[EnumC32685v2.values().length];
            try {
                iArr[EnumC32685v2.NUMBERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32685v2.LETTERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32685v2.ROMAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f135292a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m102014a(EnumC32685v2 type, int i13) {
        AbstractC22676k.m65750j(type, "type");
        int i14 = a.f135292a[type.ordinal()];
        if (i14 == 1) {
            return AbstractC31061c.m95635k(i13 + 1, ". ");
        }
        if (i14 != 2) {
            if (i14 == 3) {
                return AbstractC2875y.m8299l(m102015b(i13 + 1), ". ");
            }
            throw new NoWhenBranchMatchedException();
        }
        return ((char) ((i13 % 26) + 97)) + ". ";
    }

    /* JADX INFO: renamed from: b */
    private static final String m102015b(int i13) {
        StringBuilder sb4 = new StringBuilder();
        int size = f135290a.size();
        for (int i14 = 0; i14 < size; i14++) {
            while (true) {
                List<Integer> list = f135290a;
                if (i13 >= list.get(i14).intValue()) {
                    i13 -= list.get(i14).intValue();
                    sb4.append(f135291b.get(i14));
                }
            }
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
