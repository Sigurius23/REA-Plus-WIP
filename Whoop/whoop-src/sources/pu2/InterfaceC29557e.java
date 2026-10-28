package pu2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pu2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lpu2/e;", "", "b", "a", "Lpu2/e$a;", "Lpu2/e$b;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC29557e {

    /* JADX INFO: renamed from: pu2.e$a */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001d\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b\u0019\u0010'¨\u0006("}, m65681d2 = {"Lpu2/e$a;", "Lpu2/e;", "Lpu2/q;", "headerState", "Lpu2/r;", "heartRateDisplayState", "Lpu2/s;", "timerState", "Lpu2/o;", "exerciseContentState", "Lpu2/n;", "actionButtonState", "<init>", "(Lpu2/q;Lpu2/r;Lpu2/s;Lpu2/o;Lpu2/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpu2/q;", "c", "()Lpu2/q;", "b", "Lpu2/r;", "d", "()Lpu2/r;", "Lpu2/s;", "e", "()Lpu2/s;", "Lpu2/o;", "()Lpu2/o;", "Lpu2/n;", "()Lpu2/n;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC29557e {

        /* JADX INFO: renamed from: f */
        public static final int f120360f = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C29569q headerState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C29570r heartRateDisplayState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C29571s timerState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C29567o exerciseContentState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C29566n actionButtonState;

        public a(C29569q headerState, C29570r heartRateDisplayState, C29571s timerState, C29567o exerciseContentState, C29566n actionButtonState) {
            AbstractC22676k.m65750j(headerState, "headerState");
            AbstractC22676k.m65750j(heartRateDisplayState, "heartRateDisplayState");
            AbstractC22676k.m65750j(timerState, "timerState");
            AbstractC22676k.m65750j(exerciseContentState, "exerciseContentState");
            AbstractC22676k.m65750j(actionButtonState, "actionButtonState");
            this.headerState = headerState;
            this.heartRateDisplayState = heartRateDisplayState;
            this.timerState = timerState;
            this.exerciseContentState = exerciseContentState;
            this.actionButtonState = actionButtonState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C29566n getActionButtonState() {
            return this.actionButtonState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C29567o getExerciseContentState() {
            return this.exerciseContentState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C29569q getHeaderState() {
            return this.headerState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C29570r getHeartRateDisplayState() {
            return this.heartRateDisplayState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C29571s getTimerState() {
            return this.timerState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.headerState, aVar.headerState) && AbstractC22676k.m65745e(this.heartRateDisplayState, aVar.heartRateDisplayState) && AbstractC22676k.m65745e(this.timerState, aVar.timerState) && AbstractC22676k.m65745e(this.exerciseContentState, aVar.exerciseContentState) && AbstractC22676k.m65745e(this.actionButtonState, aVar.actionButtonState);
        }

        public int hashCode() {
            return this.actionButtonState.hashCode() + ((this.exerciseContentState.hashCode() + ((this.timerState.hashCode() + ((this.heartRateDisplayState.hashCode() + (this.headerState.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Interactive(headerState=" + this.headerState + ", heartRateDisplayState=" + this.heartRateDisplayState + ", timerState=" + this.timerState + ", exerciseContentState=" + this.exerciseContentState + ", actionButtonState=" + this.actionButtonState + ")";
        }
    }

    /* JADX INFO: renamed from: pu2.e$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpu2/e$b;", "Lpu2/e;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC29557e {

        /* JADX INFO: renamed from: a */
        public static final b f120366a = new b();

        private b() {
        }
    }
}
