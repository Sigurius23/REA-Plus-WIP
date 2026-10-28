package p716lb1;

import com.whoop.design.models.IconSize;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb1.d2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/IconSize;", "Ly3/f;", "a", "(Lcom/whoop/design/models/IconSize;)F", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23611d2 {

    /* JADX INFO: renamed from: lb1.d2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93716a;

        static {
            int[] iArr = new int[IconSize.values().length];
            try {
                iArr[IconSize.EXTRA_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconSize.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconSize.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconSize.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IconSize.EXTRA_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f93716a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final float m68642a(IconSize iconSize) {
        AbstractC22676k.m65750j(iconSize, "<this>");
        int i13 = a.f93716a[iconSize.ordinal()];
        if (i13 == 1) {
            return 2 * 4;
        }
        if (i13 == 2) {
            return 3 * 4;
        }
        if (i13 == 3) {
            float f13 = 4;
            return f13 * f13;
        }
        if (i13 == 4) {
            return 6 * 4;
        }
        if (i13 == 5) {
            return 8 * 4;
        }
        throw new NoWhenBranchMatchedException();
    }
}
