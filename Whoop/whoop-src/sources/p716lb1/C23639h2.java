package p716lb1;

import com.whoop.design.models.items.ImpactStyle;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.h2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, m65681d2 = {"Llb1/h2;", "", "<init>", "()V", "Lcom/whoop/design/models/items/ImpactStyle;", "impactStyle", "Ly81/f;", "c", "(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;", "a", "d", "b", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23639h2 {

    /* JADX INFO: renamed from: a */
    public static final C23639h2 f93783a = new C23639h2();

    /* JADX INFO: renamed from: lb1.h2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93784a;

        static {
            int[] iArr = new int[ImpactStyle.values().length];
            try {
                iArr[ImpactStyle.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImpactStyle.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImpactStyle.NEGLIGIBLE_POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImpactStyle.NEGLIGIBLE_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f93784a = iArr;
        }
    }

    private C23639h2() {
    }

    /* JADX INFO: renamed from: a */
    public final EnumC39333f m68830a(ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        int i13 = a.f93784a[impactStyle.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? EnumC39333f.WHITE_10 : EnumC39333f.ACCENT_NEGATIVE_TREND_15;
        }
        return EnumC39333f.ACCENT_POSITIVE_TREND_15;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC39333f m68831b(ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        int i13 = a.f93784a[impactStyle.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? EnumC39333f.WHITE_50 : EnumC39333f.ACCENT_NEGATIVE_TREND;
        }
        return EnumC39333f.ACCENT_POSITIVE_TREND;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC39333f m68832c(ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        int i13 = a.f93784a[impactStyle.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
        if (i13 != 2) {
            return (i13 == 3 || i13 == 4) ? EnumC39333f.BRAND_WHITE : EnumC39333f.WHITE_50;
        }
        return EnumC39333f.ACCENT_NEGATIVE_TREND;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC39333f m68833d(ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        int i13 = a.f93784a[impactStyle.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
        if (i13 != 2) {
            return (i13 == 3 || i13 == 4) ? EnumC39333f.BRAND_WHITE : EnumC39333f.WHITE_50;
        }
        return EnumC39333f.ACCENT_NEGATIVE_TREND;
    }
}
