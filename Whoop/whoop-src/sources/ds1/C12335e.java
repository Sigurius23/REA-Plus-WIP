package ds1;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.C9598e;
import h91.C17027b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import w71.C36873b;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ds1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f\u0012\b\b\u0002\u0010 \u001a\u00020\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u000f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bI\u0010K\u001a\u0004\bN\u0010MR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bO\u0010MR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bN\u0010P\u001a\u0004\bG\u0010QR%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u00198\u0006¢\u0006\f\n\u0004\bA\u0010R\u001a\u0004\b?\u0010SR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bV\u0010X\u001a\u0004\bT\u0010YR\u0017\u0010\u001f\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010K\u001a\u0004\bZ\u0010MR\u0017\u0010 \u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010MR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b:\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010#\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\\\u0010K\u001a\u0004\b4\u0010MR\u0019\u0010$\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\b<\u0010-R\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\bZ\u0010`\u001a\u0004\bC\u0010aR\u0019\u0010'\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b^\u0010=\u001a\u0004\b8\u0010-R\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bL\u0010b\u001a\u0004\b[\u0010c¨\u0006d"}, m65681d2 = {"Lds1/e;", "", "Lds1/c;", "defaultAnswersToggleInfo", "", "Lw71/b;", "questions", "", "notes", "Lcom/whoop/design/util/TextResource;", "headerText", "Lds1/b;", "shouldShowBottomSheet", "Lds1/d;", "exitConfirmationDialog", "", "isJournalEditable", "hasUserEditJournal", "exitNow", "Lds1/o;", "subtitleCallout", "Lds1/g;", "dateSelectorState", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "Lds1/n;", "navigationButton", "Lds1/f;", "journalDatePillViewState", "shouldUpdateDatePicker", "shouldRefresh", "Lm91/u;", "talkTextWidget", "autoSaveEnabled", "bottomButtonText", "Lcom/whoop/navigation/AiAction;", "coachAiAction", "autosaveInstructionText", "Lcom/whoop/navigation/e;", "onSaveNavigation", "<init>", "(Lds1/c;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lds1/b;Lds1/d;ZZZLds1/o;Lds1/g;Lh91/b;Lds1/n;Lds1/f;ZZLm91/u;ZLjava/lang/String;Lcom/whoop/navigation/AiAction;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lds1/c;", "g", "()Lds1/c;", "b", "Ljava/util/List;", "p", "()Ljava/util/List;", "c", "Ljava/lang/String;", "n", "d", "Lcom/whoop/design/util/TextResource;", "k", "()Lcom/whoop/design/util/TextResource;", "e", "Lds1/b;", "r", "()Lds1/b;", "f", "Lds1/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lds1/d;", "Z", "u", "()Z", "j", "i", "Lds1/g;", "()Lds1/g;", "Lh91/b;", "()Lh91/b;", "l", "Lds1/n;", "m", "()Lds1/n;", "Lds1/f;", "()Lds1/f;", "s", "o", "q", "Lm91/u;", "t", "()Lm91/u;", "Lcom/whoop/navigation/AiAction;", "()Lcom/whoop/navigation/AiAction;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12335e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12333c defaultAnswersToggleInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C36873b> questions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String notes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource headerText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C12332b shouldShowBottomSheet;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C12334d exitConfirmationDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isJournalEditable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean hasUserEditJournal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean exitNow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C12337g dateSelectorState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C17027b<CalendarDateModel> calendarDomainState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C12344n navigationButton;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final AbstractC12336f journalDatePillViewState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean shouldUpdateDatePicker;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean shouldRefresh;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC25312u talkTextWidget;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean autoSaveEnabled;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final String bottomButtonText;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final AiAction coachAiAction;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final String autosaveInstructionText;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C9598e onSaveNavigation;

    public C12335e(C12333c defaultAnswersToggleInfo, List<C36873b> questions, String notes, TextResource headerText, C12332b c12332b, C12334d exitConfirmationDialog, boolean z4, boolean z13, boolean z14, AbstractC12345o abstractC12345o, C12337g c12337g, C17027b<CalendarDateModel> c17027b, C12344n c12344n, AbstractC12336f abstractC12336f, boolean z15, boolean z16, InterfaceC25312u interfaceC25312u, boolean z17, String str, AiAction aiAction, String str2, C9598e c9598e) {
        AbstractC22676k.m65750j(defaultAnswersToggleInfo, "defaultAnswersToggleInfo");
        AbstractC22676k.m65750j(questions, "questions");
        AbstractC22676k.m65750j(notes, "notes");
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(exitConfirmationDialog, "exitConfirmationDialog");
        this.defaultAnswersToggleInfo = defaultAnswersToggleInfo;
        this.questions = questions;
        this.notes = notes;
        this.headerText = headerText;
        this.shouldShowBottomSheet = c12332b;
        this.exitConfirmationDialog = exitConfirmationDialog;
        this.isJournalEditable = z4;
        this.hasUserEditJournal = z13;
        this.exitNow = z14;
        this.dateSelectorState = c12337g;
        this.calendarDomainState = c17027b;
        this.navigationButton = c12344n;
        this.journalDatePillViewState = abstractC12336f;
        this.shouldUpdateDatePicker = z15;
        this.shouldRefresh = z16;
        this.talkTextWidget = interfaceC25312u;
        this.autoSaveEnabled = z17;
        this.bottomButtonText = str;
        this.coachAiAction = aiAction;
        this.autosaveInstructionText = str2;
        this.onSaveNavigation = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutoSaveEnabled() {
        return this.autoSaveEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAutosaveInstructionText() {
        return this.autosaveInstructionText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBottomButtonText() {
        return this.bottomButtonText;
    }

    /* JADX INFO: renamed from: d */
    public final C17027b<CalendarDateModel> m34445d() {
        return this.calendarDomainState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AiAction getCoachAiAction() {
        return this.coachAiAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12335e)) {
            return false;
        }
        C12335e c12335e = (C12335e) other;
        return AbstractC22676k.m65745e(this.defaultAnswersToggleInfo, c12335e.defaultAnswersToggleInfo) && AbstractC22676k.m65745e(this.questions, c12335e.questions) && AbstractC22676k.m65745e(this.notes, c12335e.notes) && AbstractC22676k.m65745e(this.headerText, c12335e.headerText) && AbstractC22676k.m65745e(this.shouldShowBottomSheet, c12335e.shouldShowBottomSheet) && AbstractC22676k.m65745e(this.exitConfirmationDialog, c12335e.exitConfirmationDialog) && this.isJournalEditable == c12335e.isJournalEditable && this.hasUserEditJournal == c12335e.hasUserEditJournal && this.exitNow == c12335e.exitNow && AbstractC22676k.m65745e(this.dateSelectorState, c12335e.dateSelectorState) && AbstractC22676k.m65745e(this.calendarDomainState, c12335e.calendarDomainState) && AbstractC22676k.m65745e(this.navigationButton, c12335e.navigationButton) && AbstractC22676k.m65745e(this.journalDatePillViewState, c12335e.journalDatePillViewState) && this.shouldUpdateDatePicker == c12335e.shouldUpdateDatePicker && this.shouldRefresh == c12335e.shouldRefresh && AbstractC22676k.m65745e(this.talkTextWidget, c12335e.talkTextWidget) && this.autoSaveEnabled == c12335e.autoSaveEnabled && AbstractC22676k.m65745e(this.bottomButtonText, c12335e.bottomButtonText) && AbstractC22676k.m65745e(this.coachAiAction, c12335e.coachAiAction) && AbstractC22676k.m65745e(this.autosaveInstructionText, c12335e.autosaveInstructionText) && AbstractC22676k.m65745e(this.onSaveNavigation, c12335e.onSaveNavigation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C12337g getDateSelectorState() {
        return this.dateSelectorState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C12333c getDefaultAnswersToggleInfo() {
        return this.defaultAnswersToggleInfo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C12334d getExitConfirmationDialog() {
        return this.exitConfirmationDialog;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.defaultAnswersToggleInfo.hashCode() * 31, 31, this.questions), 31, this.notes), this.headerText, 31);
        C12332b c12332b = this.shouldShowBottomSheet;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.exitConfirmationDialog.hashCode() + ((iM95625a + (c12332b == null ? 0 : c12332b.hashCode())) * 31)) * 31, 31, this.isJournalEditable), 31, this.hasUserEditJournal), 961, this.exitNow);
        C12337g c12337g = this.dateSelectorState;
        int iHashCode = (iM8289b + (c12337g == null ? 0 : c12337g.hashCode())) * 31;
        C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
        int iHashCode2 = (iHashCode + (c17027b == null ? 0 : c17027b.hashCode())) * 31;
        C12344n c12344n = this.navigationButton;
        int iHashCode3 = (iHashCode2 + (c12344n == null ? 0 : c12344n.hashCode())) * 31;
        AbstractC12336f abstractC12336f = this.journalDatePillViewState;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (abstractC12336f == null ? 0 : abstractC12336f.hashCode())) * 31, 31, this.shouldUpdateDatePicker), 31, this.shouldRefresh);
        InterfaceC25312u interfaceC25312u = this.talkTextWidget;
        int iM8289b3 = AbstractC2875y.m8289b((iM8289b2 + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31, 31, this.autoSaveEnabled);
        String str = this.bottomButtonText;
        int iHashCode4 = (iM8289b3 + (str == null ? 0 : str.hashCode())) * 31;
        AiAction aiAction = this.coachAiAction;
        int iHashCode5 = (iHashCode4 + (aiAction == null ? 0 : aiAction.hashCode())) * 31;
        String str2 = this.autosaveInstructionText;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.onSaveNavigation;
        return iHashCode6 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getExitNow() {
        return this.exitNow;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getHasUserEditJournal() {
        return this.hasUserEditJournal;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final AbstractC12336f getJournalDatePillViewState() {
        return this.journalDatePillViewState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C12344n getNavigationButton() {
        return this.navigationButton;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C9598e getOnSaveNavigation() {
        return this.onSaveNavigation;
    }

    /* JADX INFO: renamed from: p */
    public final List<C36873b> m34457p() {
        return this.questions;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShouldRefresh() {
        return this.shouldRefresh;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final C12332b getShouldShowBottomSheet() {
        return this.shouldShowBottomSheet;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getShouldUpdateDatePicker() {
        return this.shouldUpdateDatePicker;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final InterfaceC25312u getTalkTextWidget() {
        return this.talkTextWidget;
    }

    public String toString() {
        C12333c c12333c = this.defaultAnswersToggleInfo;
        List<C36873b> list = this.questions;
        String str = this.notes;
        TextResource textResource = this.headerText;
        C12332b c12332b = this.shouldShowBottomSheet;
        C12334d c12334d = this.exitConfirmationDialog;
        boolean z4 = this.isJournalEditable;
        boolean z13 = this.hasUserEditJournal;
        boolean z14 = this.exitNow;
        C12337g c12337g = this.dateSelectorState;
        C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
        C12344n c12344n = this.navigationButton;
        AbstractC12336f abstractC12336f = this.journalDatePillViewState;
        boolean z15 = this.shouldUpdateDatePicker;
        boolean z16 = this.shouldRefresh;
        InterfaceC25312u interfaceC25312u = this.talkTextWidget;
        boolean z17 = this.autoSaveEnabled;
        String str2 = this.bottomButtonText;
        AiAction aiAction = this.coachAiAction;
        String str3 = this.autosaveInstructionText;
        C9598e c9598e = this.onSaveNavigation;
        StringBuilder sb4 = new StringBuilder("JournalBody(defaultAnswersToggleInfo=");
        sb4.append(c12333c);
        sb4.append(", questions=");
        sb4.append(list);
        sb4.append(", notes=");
        AbstractC30007c.m91826A(sb4, str, ", headerText=", textResource, ", shouldShowBottomSheet=");
        sb4.append(c12332b);
        sb4.append(", exitConfirmationDialog=");
        sb4.append(c12334d);
        sb4.append(", isJournalEditable=");
        AbstractC38963t7.m124392v(sb4, z4, ", hasUserEditJournal=", z13, ", exitNow=");
        sb4.append(z14);
        sb4.append(", subtitleCallout=null, dateSelectorState=");
        sb4.append(c12337g);
        sb4.append(", calendarDomainState=");
        sb4.append(c17027b);
        sb4.append(", navigationButton=");
        sb4.append(c12344n);
        sb4.append(", journalDatePillViewState=");
        sb4.append(abstractC12336f);
        sb4.append(", shouldUpdateDatePicker=");
        sb4.append(z15);
        sb4.append(", shouldRefresh=");
        sb4.append(z16);
        sb4.append(", talkTextWidget=");
        sb4.append(interfaceC25312u);
        sb4.append(", autoSaveEnabled=");
        AbstractC38963t7.m124391u(sb4, z17, ", bottomButtonText=", str2, ", coachAiAction=");
        sb4.append(aiAction);
        sb4.append(", autosaveInstructionText=");
        sb4.append(str3);
        sb4.append(", onSaveNavigation=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsJournalEditable() {
        return this.isJournalEditable;
    }

    public /* synthetic */ C12335e(C12333c c12333c, List list, String str, TextResource textResource, C12332b c12332b, C12334d c12334d, boolean z4, boolean z13, boolean z14, AbstractC12345o abstractC12345o, C12337g c12337g, C17027b c17027b, C12344n c12344n, AbstractC12336f abstractC12336f, boolean z15, boolean z16, InterfaceC25312u interfaceC25312u, boolean z17, String str2, AiAction aiAction, String str3, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C12333c(false, false, 3, null) : c12333c, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 16) != 0 ? null : c12332b, (i13 & 32) != 0 ? new C12334d(false, false, null, null, null, null, null, 127, null) : c12334d, (i13 & 64) != 0 ? true : z4, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? null : abstractC12345o, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c12337g, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c17027b, (i13 & 4096) != 0 ? null : c12344n, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : abstractC12336f, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z15, (i13 & 32768) != 0 ? false : z16, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : interfaceC25312u, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? false : z17, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str2, (i13 & 524288) != 0 ? null : aiAction, (i13 & 1048576) != 0 ? null : str3, (i13 & 2097152) != 0 ? null : c9598e);
    }
}
