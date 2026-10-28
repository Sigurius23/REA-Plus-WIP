package jd1;

import com.whoop.design.util.AbstractC8693b;
import gz0.AbstractC16319p0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.EnumC40298d0;
import v41.C35666g;
import y71.C39274g;

/* JADX INFO: renamed from: jd1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lzc1/d0;", "type", "Lv41/g;", "a", "(Lzc1/d0;)Lv41/g;", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21611a {

    /* JADX INFO: renamed from: jd1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82950a;

        static {
            int[] iArr = new int[EnumC40298d0.values().length];
            try {
                iArr[EnumC40298d0.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC40298d0.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC40298d0.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC40298d0.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f82950a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C35666g m60776a(EnumC40298d0 type) {
        AbstractC22676k.m65750j(type, "type");
        int i13 = a.f82950a[type.ordinal()];
        if (i13 == 1) {
            return new C35666g(AbstractC8693b.m21278l("Left Icon"), new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward(), AbstractC8693b.m21278l("Go Back")), null, null, null, 0.0f, 0.0f, 124, null);
        }
        if (i13 == 2) {
            return new C35666g(AbstractC8693b.m21278l("Right Icon"), null, new C39274g(AbstractC16319p0.m46430a().getAction().getPencil(), AbstractC8693b.m21278l("Journal")), null, null, 0.0f, 0.0f, 122, null);
        }
        if (i13 == 3) {
            return new C35666g(AbstractC8693b.m21278l("Full Title"), new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward(), AbstractC8693b.m21278l("Go Back")), new C39274g(AbstractC16319p0.m46430a().getAction().getPencil(), AbstractC8693b.m21278l("Journal")), null, null, 0.0f, 0.0f, 120, null);
        }
        if (i13 == 4) {
            return new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
