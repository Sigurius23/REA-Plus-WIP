package v41;

import p163g1.C15136s0;
import p163g1.C15199y3;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v41.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lv41/f;", "", "<init>", "()V", "a", "b", "Lv41/f$a;", "Lv41/f$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35664f {

    /* JADX INFO: renamed from: a */
    public static final int f151586a = 0;

    /* JADX INFO: renamed from: v41.f$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lv41/f$a;", "Lv41/f;", "Lg1/y3;", "modalBottomSheetState", "<init>", "(Lg1/y3;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lg1/y3;", "a", "()Lg1/y3;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35664f {

        /* JADX INFO: renamed from: c */
        public static final int f151587c = 8;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C15199y3 modalBottomSheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 modalBottomSheetState) {
            super(null);
            AbstractC22676k.m65750j(modalBottomSheetState, "modalBottomSheetState");
            this.modalBottomSheetState = modalBottomSheetState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C15199y3 getModalBottomSheetState() {
            return this.modalBottomSheetState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.modalBottomSheetState, ((a) other).modalBottomSheetState);
        }

        public int hashCode() {
            return this.modalBottomSheetState.hashCode();
        }

        public String toString() {
            return "BottomSheetGestures(modalBottomSheetState=" + this.modalBottomSheetState + ")";
        }
    }

    /* JADX INFO: renamed from: v41.f$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lv41/f$b;", "Lv41/f;", "Lg1/s0;", "bottomDrawerState", "<init>", "(Lg1/s0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lg1/s0;", "a", "()Lg1/s0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC35664f {

        /* JADX INFO: renamed from: c */
        public static final int f151589c = 8;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C15136s0 bottomDrawerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15136s0 bottomDrawerState) {
            super(null);
            AbstractC22676k.m65750j(bottomDrawerState, "bottomDrawerState");
            this.bottomDrawerState = bottomDrawerState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C15136s0 getBottomDrawerState() {
            return this.bottomDrawerState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.bottomDrawerState, ((b) other).bottomDrawerState);
        }

        public int hashCode() {
            return this.bottomDrawerState.hashCode();
        }

        public String toString() {
            return "BottomSheetNoGestures(bottomDrawerState=" + this.bottomDrawerState + ")";
        }
    }

    public /* synthetic */ AbstractC35664f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35664f() {
    }
}
