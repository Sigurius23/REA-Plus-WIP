package op0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qe2.AbstractC30311d;
import qe2.AbstractC30314g;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: op0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BU\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000b\u0010\u0016j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m65681d2 = {"Lop0/c;", "", "", "title", "descriptionOne", "descriptionTwo", "backgroundImage", "", "backButtonVisibility", "nextButtonText", "nextButtonVisibility", "isCloseIconVisible", "<init>", "(Ljava/lang/String;IIIIIZIZZ)V", "I", "getTitle", "()I", "getDescriptionOne", "getDescriptionTwo", "getBackgroundImage", "Z", "getBackButtonVisibility", "()Z", "getNextButtonText", "getNextButtonVisibility", "ONBOARDING_SCREEN_PLANNER_ONE", "ONBOARDING_SCREEN_PLANNER_TWO", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC28085c {
    ONBOARDING_SCREEN_PLANNER_ONE(AbstractC30314g.f124351t0, AbstractC30314g.f124345r0, AbstractC30314g.f124310f1, AbstractC30311d.f124039j, false, AbstractC30314g.f124314h, true, true),
    ONBOARDING_SCREEN_PLANNER_TWO(AbstractC30314g.f124354u0, AbstractC30314g.f124313g1, AbstractC30314g.f124348s0, AbstractC30311d.f124038i, true, AbstractC30314g.f124325k1, true, false);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final boolean backButtonVisibility;
    private final int backgroundImage;
    private final int descriptionOne;
    private final int descriptionTwo;
    private final boolean isCloseIconVisible;
    private final int nextButtonText;
    private final boolean nextButtonVisibility;
    private final int title;

    EnumC28085c(int i13, int i14, int i15, int i16, boolean z4, int i17, boolean z13, boolean z14) {
        this.title = i13;
        this.descriptionOne = i14;
        this.descriptionTwo = i15;
        this.backgroundImage = i16;
        this.backButtonVisibility = z4;
        this.nextButtonText = i17;
        this.nextButtonVisibility = z13;
        this.isCloseIconVisible = z14;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final boolean getBackButtonVisibility() {
        return this.backButtonVisibility;
    }

    public final int getBackgroundImage() {
        return this.backgroundImage;
    }

    public final int getDescriptionOne() {
        return this.descriptionOne;
    }

    public final int getDescriptionTwo() {
        return this.descriptionTwo;
    }

    public final int getNextButtonText() {
        return this.nextButtonText;
    }

    public final boolean getNextButtonVisibility() {
        return this.nextButtonVisibility;
    }

    public final int getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: isCloseIconVisible, reason: from getter */
    public final boolean getIsCloseIconVisible() {
        return this.isCloseIconVisible;
    }

    /* synthetic */ EnumC28085c(int i13, int i14, int i15, int i16, boolean z4, int i17, boolean z13, boolean z14, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i18 & 2) != 0 ? 0 : i14, (i18 & 4) != 0 ? 0 : i15, i16, (i18 & 16) != 0 ? false : z4, (i18 & 32) != 0 ? 0 : i17, (i18 & 64) != 0 ? false : z13, (i18 & 128) != 0 ? false : z14);
    }
}
