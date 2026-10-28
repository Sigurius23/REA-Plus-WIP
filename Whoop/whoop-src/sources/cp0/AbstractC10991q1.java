package cp0;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: cp0.q1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lcp0/q1;", "", "<init>", "()V", "a", "b", "Lcp0/q1$a;", "Lcp0/q1$b;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10991q1 {

    /* JADX INFO: renamed from: cp0.q1$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcp0/q1$b;", "Lcp0/q1;", "", "targetHeight", "heroProgress", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC10991q1 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float targetHeight;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float heroProgress;

        public b(float f13, float f14) {
            super(null);
            this.targetHeight = f13;
            this.heroProgress = f14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getHeroProgress() {
            return this.heroProgress;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getTargetHeight() {
            return this.targetHeight;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Float.compare(this.targetHeight, bVar.targetHeight) == 0 && Float.compare(this.heroProgress, bVar.heroProgress) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.heroProgress) + (Float.hashCode(this.targetHeight) * 31);
        }

        public String toString() {
            return AbstractC31061c.m95638n("SnapBack(targetHeight=", this.targetHeight, ", heroProgress=", this.heroProgress, ")");
        }
    }

    public /* synthetic */ AbstractC10991q1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10991q1() {
    }

    /* JADX INFO: renamed from: cp0.q1$a */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcp0/q1$a;", "Lcp0/q1;", "Lcp0/u1;", "newSheetState", "", "newTargetHeight", "newHeroProgress", "", "shouldDismiss", "<init>", "(Lcp0/u1;FFZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcp0/u1;", "b", "()Lcp0/u1;", "F", "c", "()F", "d", "Z", "()Z", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC10991q1 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC11003u1 newSheetState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float newTargetHeight;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float newHeroProgress;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean shouldDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC11003u1 newSheetState, float f13, float f14, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(newSheetState, "newSheetState");
            this.newSheetState = newSheetState;
            this.newTargetHeight = f13;
            this.newHeroProgress = f14;
            this.shouldDismiss = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getNewHeroProgress() {
            return this.newHeroProgress;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC11003u1 getNewSheetState() {
            return this.newSheetState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getNewTargetHeight() {
            return this.newTargetHeight;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShouldDismiss() {
            return this.shouldDismiss;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.newSheetState == aVar.newSheetState && Float.compare(this.newTargetHeight, aVar.newTargetHeight) == 0 && Float.compare(this.newHeroProgress, aVar.newHeroProgress) == 0 && this.shouldDismiss == aVar.shouldDismiss;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldDismiss) + AbstractC11266d.m30447a(this.newHeroProgress, AbstractC11266d.m30447a(this.newTargetHeight, this.newSheetState.hashCode() * 31, 31), 31);
        }

        public String toString() {
            return "ChangeState(newSheetState=" + this.newSheetState + ", newTargetHeight=" + this.newTargetHeight + ", newHeroProgress=" + this.newHeroProgress + ", shouldDismiss=" + this.shouldDismiss + ")";
        }

        public /* synthetic */ a(EnumC11003u1 enumC11003u1, float f13, float f14, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC11003u1, f13, f14, (i13 & 8) != 0 ? false : z4);
        }
    }
}
