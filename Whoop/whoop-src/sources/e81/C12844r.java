package e81;

import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e81.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, m65681d2 = {"Le81/r;", "", "", "sliceCount", "", "gapAngle", "<init>", "(IF)V", "index", "b", "(I)F", "startDegrees", "degrees", "e", "(FF)F", "", "Le81/x;", "d", "()Ljava/util/List;", "angleDegrees", "c", "(F)Ljava/lang/Integer;", "a", "I", "()I", "F", "getGapAngle", "()F", "getSegmentAngle", "segmentAngle", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12844r {

    /* JADX INFO: renamed from: d */
    private static final a f44031d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int sliceCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float gapAngle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float segmentAngle;

    /* JADX INFO: renamed from: e81.r$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Le81/r$a;", "", "<init>", "()V", "", "FIRST_CELL_START_ANGLE", "F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C12844r(int i13, float f13) {
        this.sliceCount = i13;
        this.gapAngle = Math.abs(f13) > Float.MAX_VALUE ? 0.0f : f13;
        this.segmentAngle = i13 > 0 ? 360.0f / i13 : 0.0f;
    }

    /* JADX INFO: renamed from: b */
    private final float m36053b(int index) {
        return (this.segmentAngle * index) - 90.0f;
    }

    /* JADX INFO: renamed from: e */
    private final float m36054e(float startDegrees, float degrees) {
        float f13 = (degrees - startDegrees) % 360.0f;
        return f13 < 0.0f ? f13 + 360.0f : f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getSliceCount() {
        return this.sliceCount;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m36056c(float angleDegrees) {
        if (this.sliceCount <= 0 || Float.isNaN(angleDegrees)) {
            return null;
        }
        return Integer.valueOf(AbstractC12889b.m36284n((int) (m36054e(-90.0f, angleDegrees) / this.segmentAngle), 0, this.sliceCount - 1));
    }

    /* JADX INFO: renamed from: d */
    public final List<C12850x> m36057d() {
        if (this.sliceCount <= 0) {
            return C25271y.f99162w;
        }
        float f13 = this.segmentAngle;
        float fM36283m = AbstractC12889b.m36283m(f13 - this.gapAngle, 0.0f, f13);
        float f14 = (this.segmentAngle - fM36283m) / 2.0f;
        int i13 = this.sliceCount;
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(new C12850x(m36053b(i14) + f14, fM36283m, m36053b(i14), this.segmentAngle));
        }
        return arrayList;
    }
}
