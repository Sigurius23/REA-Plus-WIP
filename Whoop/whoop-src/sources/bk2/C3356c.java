package bk2;

import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.util.TextResource;
import h91.C17027b;
import i11.C17863f;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: bk2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0019\u0010(¨\u0006)"}, m65681d2 = {"Lbk2/c;", "", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarState", "Li11/f;", "dateSelectorState", "", "leftIcon", "Lcom/whoop/design/util/TextResource;", "leftText", "rightText", "", "calendarInitialState", "<init>", "(Lh91/b;Li11/f;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lh91/b;", "b", "()Lh91/b;", "Li11/f;", "c", "()Li11/f;", "I", "getLeftIcon", "d", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "e", "f", "Z", "()Z", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3356c {

    /* JADX INFO: renamed from: g */
    public static final int f13040g = (TextResource.$stable | C17863f.f69516k) | C17027b.f65485k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17027b<CalendarDateModel> calendarState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17863f dateSelectorState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int leftIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource leftText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource rightText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean calendarInitialState;

    public C3356c(C17027b<CalendarDateModel> c17027b, C17863f dateSelectorState, int i13, TextResource leftText, TextResource rightText, boolean z4) {
        AbstractC22676k.m65750j(dateSelectorState, "dateSelectorState");
        AbstractC22676k.m65750j(leftText, "leftText");
        AbstractC22676k.m65750j(rightText, "rightText");
        this.calendarState = c17027b;
        this.dateSelectorState = dateSelectorState;
        this.leftIcon = i13;
        this.leftText = leftText;
        this.rightText = rightText;
        this.calendarInitialState = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCalendarInitialState() {
        return this.calendarInitialState;
    }

    /* JADX INFO: renamed from: b */
    public final C17027b<CalendarDateModel> m9688b() {
        return this.calendarState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17863f getDateSelectorState() {
        return this.dateSelectorState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getLeftText() {
        return this.leftText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getRightText() {
        return this.rightText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3356c)) {
            return false;
        }
        C3356c c3356c = (C3356c) other;
        return AbstractC22676k.m65745e(this.calendarState, c3356c.calendarState) && AbstractC22676k.m65745e(this.dateSelectorState, c3356c.dateSelectorState) && this.leftIcon == c3356c.leftIcon && AbstractC22676k.m65745e(this.leftText, c3356c.leftText) && AbstractC22676k.m65745e(this.rightText, c3356c.rightText) && this.calendarInitialState == c3356c.calendarInitialState;
    }

    public int hashCode() {
        C17027b<CalendarDateModel> c17027b = this.calendarState;
        return Boolean.hashCode(this.calendarInitialState) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.leftIcon, (this.dateSelectorState.hashCode() + ((c17027b == null ? 0 : c17027b.hashCode()) * 31)) * 31, 31), this.leftText, 31), this.rightText, 31);
    }

    public String toString() {
        return "TiltGraphToolbarState(calendarState=" + this.calendarState + ", dateSelectorState=" + this.dateSelectorState + ", leftIcon=" + this.leftIcon + ", leftText=" + this.leftText + ", rightText=" + this.rightText + ", calendarInitialState=" + this.calendarInitialState + ")";
    }

    public /* synthetic */ C3356c(C17027b c17027b, C17863f c17863f, int i13, TextResource textResource, TextResource textResource2, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17027b, c17863f, i13, textResource, textResource2, (i14 & 32) != 0 ? false : z4);
    }
}
