package com.whoop.coacheverywhere.onboarding.model;

import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wl2.C37358a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001f\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;", "", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;", "highlightID", "", "showBottomBar", "<init>", "(Ljava/lang/String;ILcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Z)V", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;", "getHighlightID", "()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;", "Z", "getShowBottomBar", "()Z", "Companion", "a", "COACH_EVERYWHERE_DAY_ZERO_INTRO", "COACH_EVERYWHERE_DAY_ZERO_PLUS_BUTTON", "COACH_EVERYWHERE_DAY_ZERO_INPUT_FIELD", "COACH_EVERYWHERE_DAY_ZERO_TEXT", "COACH_EVERYWHERE_DAY_ZERO_SPEECH", "COACH_EVERYWHERE_DAY_ZERO_HISTORY", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum CoachOnboardingStepID {
    COACH_EVERYWHERE_DAY_ZERO_INTRO(null, false, 1, null),
    COACH_EVERYWHERE_DAY_ZERO_PLUS_BUTTON(CoachOnboardingHighlightID.IMAGE_UPLOAD_HIGHLIGHT, false, 2, null),
    COACH_EVERYWHERE_DAY_ZERO_INPUT_FIELD(CoachOnboardingHighlightID.INPUT_BAR_HIGHLIGHT, false, 2, null),
    COACH_EVERYWHERE_DAY_ZERO_TEXT(CoachOnboardingHighlightID.ASK_A_QUESTION_HIGHLIGHT, false, 2, null),
    COACH_EVERYWHERE_DAY_ZERO_SPEECH(CoachOnboardingHighlightID.VOICE_TO_TEXT_HIGHLIGHT, false, 2, null),
    COACH_EVERYWHERE_DAY_ZERO_HISTORY(CoachOnboardingHighlightID.CHAT_HISTORY_HIGHLIGHT, false, 2, null);

    private final CoachOnboardingHighlightID highlightID;
    private final boolean showBottomBar;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37358a(22));

    /* JADX INFO: renamed from: com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepID$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;", "serializer", "()Lwc3/c;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC37138c m18508a() {
            return (InterfaceC37138c) CoachOnboardingStepID.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return m18508a();
        }

        private Companion() {
        }
    }

    CoachOnboardingStepID(CoachOnboardingHighlightID coachOnboardingHighlightID, boolean z4) {
        this.highlightID = coachOnboardingHighlightID;
        this.showBottomBar = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepID", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final CoachOnboardingHighlightID getHighlightID() {
        return this.highlightID;
    }

    public final boolean getShowBottomBar() {
        return this.showBottomBar;
    }

    /* synthetic */ CoachOnboardingStepID(CoachOnboardingHighlightID coachOnboardingHighlightID, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : coachOnboardingHighlightID, (i13 & 2) != 0 ? true : z4);
    }
}
