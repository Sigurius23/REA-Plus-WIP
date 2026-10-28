package oi2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ti2.C33860g;
import ui2.EnumC35020a;

/* JADX INFO: renamed from: oi2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Loi2/a;", "", "<init>", "()V", "c", "b", "a", "Loi2/a$a;", "Loi2/a$b;", "Loi2/a$c;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27950a {

    /* JADX INFO: renamed from: oi2.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Loi2/a$a;", "Loi2/a;", "", "streakValue", "Lui2/a;", "streakState", "<init>", "(Ljava/lang/String;Lui2/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lui2/a;", "()Lui2/a;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC27950a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String streakValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC35020a streakState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String streakValue, EnumC35020a enumC35020a) {
            super(null);
            AbstractC22676k.m65750j(streakValue, "streakValue");
            this.streakValue = streakValue;
            this.streakState = enumC35020a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC35020a getStreakState() {
            return this.streakState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStreakValue() {
            return this.streakValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.streakValue, aVar.streakValue) && this.streakState == aVar.streakState;
        }

        public int hashCode() {
            int iHashCode = this.streakValue.hashCode() * 31;
            EnumC35020a enumC35020a = this.streakState;
            return iHashCode + (enumC35020a == null ? 0 : enumC35020a.hashCode());
        }

        public String toString() {
            return "ClickShareIcon(streakValue=" + this.streakValue + ", streakState=" + this.streakState + ")";
        }
    }

    /* JADX INFO: renamed from: oi2.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loi2/a$b;", "Loi2/a;", "<init>", "()V", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC27950a {

        /* JADX INFO: renamed from: a */
        public static final b f112738a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: oi2.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loi2/a$c;", "Loi2/a;", "Lti2/g;", "streaksViewState", "<init>", "(Lti2/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lti2/g;", "()Lti2/g;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC27950a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33860g streaksViewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C33860g streaksViewState) {
            super(null);
            AbstractC22676k.m65750j(streaksViewState, "streaksViewState");
            this.streaksViewState = streaksViewState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C33860g getStreaksViewState() {
            return this.streaksViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.streaksViewState, ((c) other).streaksViewState);
        }

        public int hashCode() {
            return this.streaksViewState.hashCode();
        }

        public String toString() {
            return "ViewStreaksExplainerScreen(streaksViewState=" + this.streaksViewState + ")";
        }
    }

    public /* synthetic */ AbstractC27950a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC27950a() {
    }
}
