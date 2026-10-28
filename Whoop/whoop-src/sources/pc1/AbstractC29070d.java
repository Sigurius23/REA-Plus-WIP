package pc1;

import com.whoop.design.models.items.recommendationtile.RecommendationTileLayoutStyle;
import com.whoop.design.models.items.recommendationtile.RecommendationTileStatus;
import h31.EnumC16809b;
import h31.EnumC16810c;
import h31.EnumC16813f;
import h31.EnumC16821n;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pc1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", "Lh31/n;", "e", "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/n;", "Lh31/f;", "b", "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/f;", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;", "Lh31/b;", "d", "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;)Lh31/b;", "Lh31/c;", "a", "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;)Lh31/c;", "c", "(Lh31/n;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29070d {

    /* JADX INFO: renamed from: pc1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f117610a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f117611b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f117612c;

        static {
            int[] iArr = new int[RecommendationTileStatus.values().length];
            try {
                iArr[RecommendationTileStatus.UNCOMMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationTileStatus.COMMITTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecommendationTileStatus.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f117610a = iArr;
            int[] iArr2 = new int[RecommendationTileLayoutStyle.values().length];
            try {
                iArr2[RecommendationTileLayoutStyle.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecommendationTileLayoutStyle.CAROUSEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f117611b = iArr2;
            int[] iArr3 = new int[EnumC16821n.values().length];
            try {
                iArr3[EnumC16821n.UNCOMMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EnumC16821n.COMMITTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EnumC16821n.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f117612c = iArr3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC16810c m88375a(RecommendationTileLayoutStyle recommendationTileLayoutStyle) {
        AbstractC22676k.m65750j(recommendationTileLayoutStyle, "<this>");
        int i13 = a.f117611b[recommendationTileLayoutStyle.ordinal()];
        if (i13 == 1) {
            return EnumC16810c.LIST;
        }
        if (i13 == 2) {
            return EnumC16810c.CAROUSEL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC16813f m88376b(RecommendationTileStatus recommendationTileStatus) {
        AbstractC22676k.m65750j(recommendationTileStatus, "<this>");
        int i13 = a.f117610a[recommendationTileStatus.ordinal()];
        if (i13 == 1) {
            return EnumC16813f.UNCOMMITTED;
        }
        if (i13 == 2) {
            return EnumC16813f.COMMITTED;
        }
        if (i13 == 3) {
            return EnumC16813f.COMPLETED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final RecommendationTileStatus m88377c(EnumC16821n enumC16821n) {
        AbstractC22676k.m65750j(enumC16821n, "<this>");
        int i13 = a.f117612c[enumC16821n.ordinal()];
        if (i13 == 1) {
            return RecommendationTileStatus.UNCOMMITTED;
        }
        if (i13 == 2) {
            return RecommendationTileStatus.COMMITTED;
        }
        if (i13 == 3) {
            return RecommendationTileStatus.COMPLETED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static final EnumC16809b m88378d(RecommendationTileLayoutStyle recommendationTileLayoutStyle) {
        AbstractC22676k.m65750j(recommendationTileLayoutStyle, "<this>");
        int i13 = a.f117611b[recommendationTileLayoutStyle.ordinal()];
        if (i13 == 1) {
            return EnumC16809b.LIST;
        }
        if (i13 == 2) {
            return EnumC16809b.CAROUSEL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    public static final EnumC16821n m88379e(RecommendationTileStatus recommendationTileStatus) {
        AbstractC22676k.m65750j(recommendationTileStatus, "<this>");
        int i13 = a.f117610a[recommendationTileStatus.ordinal()];
        if (i13 == 1) {
            return EnumC16821n.UNCOMMITTED;
        }
        if (i13 == 2) {
            return EnumC16821n.COMMITTED;
        }
        if (i13 == 3) {
            return EnumC16821n.COMPLETED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
