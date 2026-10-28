package com.whoop.memberdataexport.models;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "", "<init>", "()V", "screenTitleDisplay", "Lcom/whoop/design/util/TextResource;", "getScreenTitleDisplay", "()Lcom/whoop/design/util/TextResource;", "headlineDisplay", "getHeadlineDisplay", "bodyDisplay", "getBodyDisplay", "LoadingEmptyMemberDataExportModel", "AvailableMemberDataExportModel", "SubmittingMemberDataExportModel", "UnavailableMemberDataExportModel", "SubmissionComplete", "ErrorMemberDataExportModel", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$LoadingEmptyMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$UnavailableMemberDataExportModel;", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class MemberDataExportModel {
    public static final int $stable = TextResource.$stable;
    private final TextResource bodyDisplay;
    private final TextResource headlineDisplay;
    private final TextResource screenTitleDisplay;

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0014\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0083\u0004J\n\u00104\u001a\u000205HÖ\u0081\u0004J\n\u00106\u001a\u00020\bHÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00067"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "screenTitleDisplay", "Lcom/whoop/design/util/TextResource;", "headlineDisplay", "bodyDisplay", "learnMoreTextDisplay", "learnMoreLink", "", "updateAccountTextDisplay", "updateAccountLink", "confirmationTextDisplay", "recipientEmailDisplay", "recipientEmailLabelDisplay", "submitButtonTextDisplay", "submissionLoadingTextDisplay", "submissionSuccessTextDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "getScreenTitleDisplay", "()Lcom/whoop/design/util/TextResource;", "getHeadlineDisplay", "getBodyDisplay", "getLearnMoreTextDisplay", "getLearnMoreLink", "()Ljava/lang/String;", "getUpdateAccountTextDisplay", "getUpdateAccountLink", "getConfirmationTextDisplay", "getRecipientEmailDisplay", "getRecipientEmailLabelDisplay", "getSubmitButtonTextDisplay", "getSubmissionLoadingTextDisplay", "getSubmissionSuccessTextDisplay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "", "hashCode", "", "toString", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class AvailableMemberDataExportModel extends MemberDataExportModel {
        public static final int $stable = TextResource.$stable;
        private final TextResource bodyDisplay;
        private final TextResource confirmationTextDisplay;
        private final TextResource headlineDisplay;
        private final String learnMoreLink;
        private final TextResource learnMoreTextDisplay;
        private final String recipientEmailDisplay;
        private final TextResource recipientEmailLabelDisplay;
        private final TextResource screenTitleDisplay;
        private final TextResource submissionLoadingTextDisplay;
        private final TextResource submissionSuccessTextDisplay;
        private final TextResource submitButtonTextDisplay;
        private final String updateAccountLink;
        private final TextResource updateAccountTextDisplay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvailableMemberDataExportModel(TextResource screenTitleDisplay, TextResource headlineDisplay, TextResource bodyDisplay, TextResource learnMoreTextDisplay, String learnMoreLink, TextResource updateAccountTextDisplay, String updateAccountLink, TextResource confirmationTextDisplay, String recipientEmailDisplay, TextResource recipientEmailLabelDisplay, TextResource submitButtonTextDisplay, TextResource submissionLoadingTextDisplay, TextResource submissionSuccessTextDisplay) {
            super(null);
            AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
            AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
            AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
            AbstractC22676k.m65750j(learnMoreTextDisplay, "learnMoreTextDisplay");
            AbstractC22676k.m65750j(learnMoreLink, "learnMoreLink");
            AbstractC22676k.m65750j(updateAccountTextDisplay, "updateAccountTextDisplay");
            AbstractC22676k.m65750j(updateAccountLink, "updateAccountLink");
            AbstractC22676k.m65750j(confirmationTextDisplay, "confirmationTextDisplay");
            AbstractC22676k.m65750j(recipientEmailDisplay, "recipientEmailDisplay");
            AbstractC22676k.m65750j(recipientEmailLabelDisplay, "recipientEmailLabelDisplay");
            AbstractC22676k.m65750j(submitButtonTextDisplay, "submitButtonTextDisplay");
            AbstractC22676k.m65750j(submissionLoadingTextDisplay, "submissionLoadingTextDisplay");
            AbstractC22676k.m65750j(submissionSuccessTextDisplay, "submissionSuccessTextDisplay");
            this.screenTitleDisplay = screenTitleDisplay;
            this.headlineDisplay = headlineDisplay;
            this.bodyDisplay = bodyDisplay;
            this.learnMoreTextDisplay = learnMoreTextDisplay;
            this.learnMoreLink = learnMoreLink;
            this.updateAccountTextDisplay = updateAccountTextDisplay;
            this.updateAccountLink = updateAccountLink;
            this.confirmationTextDisplay = confirmationTextDisplay;
            this.recipientEmailDisplay = recipientEmailDisplay;
            this.recipientEmailLabelDisplay = recipientEmailLabelDisplay;
            this.submitButtonTextDisplay = submitButtonTextDisplay;
            this.submissionLoadingTextDisplay = submissionLoadingTextDisplay;
            this.submissionSuccessTextDisplay = submissionSuccessTextDisplay;
        }

        public static /* synthetic */ AvailableMemberDataExportModel copy$default(AvailableMemberDataExportModel availableMemberDataExportModel, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, TextResource textResource5, String str2, TextResource textResource6, String str3, TextResource textResource7, TextResource textResource8, TextResource textResource9, TextResource textResource10, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = availableMemberDataExportModel.screenTitleDisplay;
            }
            return availableMemberDataExportModel.copy(textResource, (i13 & 2) != 0 ? availableMemberDataExportModel.headlineDisplay : textResource2, (i13 & 4) != 0 ? availableMemberDataExportModel.bodyDisplay : textResource3, (i13 & 8) != 0 ? availableMemberDataExportModel.learnMoreTextDisplay : textResource4, (i13 & 16) != 0 ? availableMemberDataExportModel.learnMoreLink : str, (i13 & 32) != 0 ? availableMemberDataExportModel.updateAccountTextDisplay : textResource5, (i13 & 64) != 0 ? availableMemberDataExportModel.updateAccountLink : str2, (i13 & 128) != 0 ? availableMemberDataExportModel.confirmationTextDisplay : textResource6, (i13 & 256) != 0 ? availableMemberDataExportModel.recipientEmailDisplay : str3, (i13 & 512) != 0 ? availableMemberDataExportModel.recipientEmailLabelDisplay : textResource7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? availableMemberDataExportModel.submitButtonTextDisplay : textResource8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? availableMemberDataExportModel.submissionLoadingTextDisplay : textResource9, (i13 & 4096) != 0 ? availableMemberDataExportModel.submissionSuccessTextDisplay : textResource10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getScreenTitleDisplay() {
            return this.screenTitleDisplay;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final TextResource getRecipientEmailLabelDisplay() {
            return this.recipientEmailLabelDisplay;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final TextResource getSubmitButtonTextDisplay() {
            return this.submitButtonTextDisplay;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final TextResource getSubmissionLoadingTextDisplay() {
            return this.submissionLoadingTextDisplay;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final TextResource getSubmissionSuccessTextDisplay() {
            return this.submissionSuccessTextDisplay;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TextResource getHeadlineDisplay() {
            return this.headlineDisplay;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TextResource getBodyDisplay() {
            return this.bodyDisplay;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TextResource getLearnMoreTextDisplay() {
            return this.learnMoreTextDisplay;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLearnMoreLink() {
            return this.learnMoreLink;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final TextResource getUpdateAccountTextDisplay() {
            return this.updateAccountTextDisplay;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getUpdateAccountLink() {
            return this.updateAccountLink;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final TextResource getConfirmationTextDisplay() {
            return this.confirmationTextDisplay;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getRecipientEmailDisplay() {
            return this.recipientEmailDisplay;
        }

        public final AvailableMemberDataExportModel copy(TextResource screenTitleDisplay, TextResource headlineDisplay, TextResource bodyDisplay, TextResource learnMoreTextDisplay, String learnMoreLink, TextResource updateAccountTextDisplay, String updateAccountLink, TextResource confirmationTextDisplay, String recipientEmailDisplay, TextResource recipientEmailLabelDisplay, TextResource submitButtonTextDisplay, TextResource submissionLoadingTextDisplay, TextResource submissionSuccessTextDisplay) {
            AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
            AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
            AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
            AbstractC22676k.m65750j(learnMoreTextDisplay, "learnMoreTextDisplay");
            AbstractC22676k.m65750j(learnMoreLink, "learnMoreLink");
            AbstractC22676k.m65750j(updateAccountTextDisplay, "updateAccountTextDisplay");
            AbstractC22676k.m65750j(updateAccountLink, "updateAccountLink");
            AbstractC22676k.m65750j(confirmationTextDisplay, "confirmationTextDisplay");
            AbstractC22676k.m65750j(recipientEmailDisplay, "recipientEmailDisplay");
            AbstractC22676k.m65750j(recipientEmailLabelDisplay, "recipientEmailLabelDisplay");
            AbstractC22676k.m65750j(submitButtonTextDisplay, "submitButtonTextDisplay");
            AbstractC22676k.m65750j(submissionLoadingTextDisplay, "submissionLoadingTextDisplay");
            AbstractC22676k.m65750j(submissionSuccessTextDisplay, "submissionSuccessTextDisplay");
            return new AvailableMemberDataExportModel(screenTitleDisplay, headlineDisplay, bodyDisplay, learnMoreTextDisplay, learnMoreLink, updateAccountTextDisplay, updateAccountLink, confirmationTextDisplay, recipientEmailDisplay, recipientEmailLabelDisplay, submitButtonTextDisplay, submissionLoadingTextDisplay, submissionSuccessTextDisplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvailableMemberDataExportModel)) {
                return false;
            }
            AvailableMemberDataExportModel availableMemberDataExportModel = (AvailableMemberDataExportModel) other;
            return AbstractC22676k.m65745e(this.screenTitleDisplay, availableMemberDataExportModel.screenTitleDisplay) && AbstractC22676k.m65745e(this.headlineDisplay, availableMemberDataExportModel.headlineDisplay) && AbstractC22676k.m65745e(this.bodyDisplay, availableMemberDataExportModel.bodyDisplay) && AbstractC22676k.m65745e(this.learnMoreTextDisplay, availableMemberDataExportModel.learnMoreTextDisplay) && AbstractC22676k.m65745e(this.learnMoreLink, availableMemberDataExportModel.learnMoreLink) && AbstractC22676k.m65745e(this.updateAccountTextDisplay, availableMemberDataExportModel.updateAccountTextDisplay) && AbstractC22676k.m65745e(this.updateAccountLink, availableMemberDataExportModel.updateAccountLink) && AbstractC22676k.m65745e(this.confirmationTextDisplay, availableMemberDataExportModel.confirmationTextDisplay) && AbstractC22676k.m65745e(this.recipientEmailDisplay, availableMemberDataExportModel.recipientEmailDisplay) && AbstractC22676k.m65745e(this.recipientEmailLabelDisplay, availableMemberDataExportModel.recipientEmailLabelDisplay) && AbstractC22676k.m65745e(this.submitButtonTextDisplay, availableMemberDataExportModel.submitButtonTextDisplay) && AbstractC22676k.m65745e(this.submissionLoadingTextDisplay, availableMemberDataExportModel.submissionLoadingTextDisplay) && AbstractC22676k.m65745e(this.submissionSuccessTextDisplay, availableMemberDataExportModel.submissionSuccessTextDisplay);
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getBodyDisplay() {
            return this.bodyDisplay;
        }

        public final TextResource getConfirmationTextDisplay() {
            return this.confirmationTextDisplay;
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getHeadlineDisplay() {
            return this.headlineDisplay;
        }

        public final String getLearnMoreLink() {
            return this.learnMoreLink;
        }

        public final TextResource getLearnMoreTextDisplay() {
            return this.learnMoreTextDisplay;
        }

        public final String getRecipientEmailDisplay() {
            return this.recipientEmailDisplay;
        }

        public final TextResource getRecipientEmailLabelDisplay() {
            return this.recipientEmailLabelDisplay;
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getScreenTitleDisplay() {
            return this.screenTitleDisplay;
        }

        public final TextResource getSubmissionLoadingTextDisplay() {
            return this.submissionLoadingTextDisplay;
        }

        public final TextResource getSubmissionSuccessTextDisplay() {
            return this.submissionSuccessTextDisplay;
        }

        public final TextResource getSubmitButtonTextDisplay() {
            return this.submitButtonTextDisplay;
        }

        public final String getUpdateAccountLink() {
            return this.updateAccountLink;
        }

        public final TextResource getUpdateAccountTextDisplay() {
            return this.updateAccountTextDisplay;
        }

        public int hashCode() {
            return this.submissionSuccessTextDisplay.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.screenTitleDisplay.hashCode() * 31, this.headlineDisplay, 31), this.bodyDisplay, 31), this.learnMoreTextDisplay, 31), 31, this.learnMoreLink), this.updateAccountTextDisplay, 31), 31, this.updateAccountLink), this.confirmationTextDisplay, 31), 31, this.recipientEmailDisplay), this.recipientEmailLabelDisplay, 31), this.submitButtonTextDisplay, 31), this.submissionLoadingTextDisplay, 31);
        }

        public String toString() {
            TextResource textResource = this.screenTitleDisplay;
            TextResource textResource2 = this.headlineDisplay;
            TextResource textResource3 = this.bodyDisplay;
            TextResource textResource4 = this.learnMoreTextDisplay;
            String str = this.learnMoreLink;
            TextResource textResource5 = this.updateAccountTextDisplay;
            String str2 = this.updateAccountLink;
            TextResource textResource6 = this.confirmationTextDisplay;
            String str3 = this.recipientEmailDisplay;
            TextResource textResource7 = this.recipientEmailLabelDisplay;
            TextResource textResource8 = this.submitButtonTextDisplay;
            TextResource textResource9 = this.submissionLoadingTextDisplay;
            TextResource textResource10 = this.submissionSuccessTextDisplay;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("AvailableMemberDataExportModel(screenTitleDisplay=", textResource, ", headlineDisplay=", textResource2, ", bodyDisplay=");
            AbstractC30007c.m91855y(sbM106658q, textResource3, ", learnMoreTextDisplay=", textResource4, ", learnMoreLink=");
            AbstractC30007c.m91826A(sbM106658q, str, ", updateAccountTextDisplay=", textResource5, ", updateAccountLink=");
            AbstractC30007c.m91826A(sbM106658q, str2, ", confirmationTextDisplay=", textResource6, ", recipientEmailDisplay=");
            AbstractC30007c.m91826A(sbM106658q, str3, ", recipientEmailLabelDisplay=", textResource7, ", submitButtonTextDisplay=");
            AbstractC30007c.m91855y(sbM106658q, textResource8, ", submissionLoadingTextDisplay=", textResource9, ", submissionSuccessTextDisplay=");
            return AbstractC30007c.m91841k(sbM106658q, textResource10, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "screenTitleDisplay", "Lcom/whoop/design/util/TextResource;", "headlineDisplay", "bodyDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "getScreenTitleDisplay", "()Lcom/whoop/design/util/TextResource;", "getHeadlineDisplay", "getBodyDisplay", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ErrorMemberDataExportModel extends MemberDataExportModel {
        public static final int $stable = TextResource.$stable;
        private final TextResource bodyDisplay;
        private final TextResource headlineDisplay;
        private final TextResource screenTitleDisplay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorMemberDataExportModel(TextResource screenTitleDisplay, TextResource headlineDisplay, TextResource bodyDisplay) {
            super(null);
            AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
            AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
            AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
            this.screenTitleDisplay = screenTitleDisplay;
            this.headlineDisplay = headlineDisplay;
            this.bodyDisplay = bodyDisplay;
        }

        public static /* synthetic */ ErrorMemberDataExportModel copy$default(ErrorMemberDataExportModel errorMemberDataExportModel, TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = errorMemberDataExportModel.screenTitleDisplay;
            }
            if ((i13 & 2) != 0) {
                textResource2 = errorMemberDataExportModel.headlineDisplay;
            }
            if ((i13 & 4) != 0) {
                textResource3 = errorMemberDataExportModel.bodyDisplay;
            }
            return errorMemberDataExportModel.copy(textResource, textResource2, textResource3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getScreenTitleDisplay() {
            return this.screenTitleDisplay;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TextResource getHeadlineDisplay() {
            return this.headlineDisplay;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TextResource getBodyDisplay() {
            return this.bodyDisplay;
        }

        public final ErrorMemberDataExportModel copy(TextResource screenTitleDisplay, TextResource headlineDisplay, TextResource bodyDisplay) {
            AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
            AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
            AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
            return new ErrorMemberDataExportModel(screenTitleDisplay, headlineDisplay, bodyDisplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorMemberDataExportModel)) {
                return false;
            }
            ErrorMemberDataExportModel errorMemberDataExportModel = (ErrorMemberDataExportModel) other;
            return AbstractC22676k.m65745e(this.screenTitleDisplay, errorMemberDataExportModel.screenTitleDisplay) && AbstractC22676k.m65745e(this.headlineDisplay, errorMemberDataExportModel.headlineDisplay) && AbstractC22676k.m65745e(this.bodyDisplay, errorMemberDataExportModel.bodyDisplay);
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getBodyDisplay() {
            return this.bodyDisplay;
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getHeadlineDisplay() {
            return this.headlineDisplay;
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getScreenTitleDisplay() {
            return this.screenTitleDisplay;
        }

        public int hashCode() {
            return this.bodyDisplay.hashCode() + AbstractC31061c.m95625a(this.screenTitleDisplay.hashCode() * 31, this.headlineDisplay, 31);
        }

        public String toString() {
            TextResource textResource = this.screenTitleDisplay;
            TextResource textResource2 = this.headlineDisplay;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("ErrorMemberDataExportModel(screenTitleDisplay=", textResource, ", headlineDisplay=", textResource2, ", bodyDisplay="), this.bodyDisplay, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel$LoadingEmptyMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "<init>", "()V", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class LoadingEmptyMemberDataExportModel extends MemberDataExportModel {
        public static final LoadingEmptyMemberDataExportModel INSTANCE = new LoadingEmptyMemberDataExportModel();
        public static final int $stable = TextResource.$stable;

        private LoadingEmptyMemberDataExportModel() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\bHÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "screenTitleDisplay", "Lcom/whoop/design/util/TextResource;", "headlineDisplay", "bodyDisplay", "helpLinkTextDisplay", "helpLink", "", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "getScreenTitleDisplay", "()Lcom/whoop/design/util/TextResource;", "getHeadlineDisplay", "getBodyDisplay", "getHelpLinkTextDisplay", "getHelpLink", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class SubmissionComplete extends MemberDataExportModel {
        public static final int $stable = TextResource.$stable;
        private final TextResource bodyDisplay;
        private final TextResource headlineDisplay;
        private final String helpLink;
        private final TextResource helpLinkTextDisplay;
        private final TextResource screenTitleDisplay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmissionComplete(TextResource screenTitleDisplay, TextResource headlineDisplay, TextResource bodyDisplay, TextResource helpLinkTextDisplay, String helpLink) {
            super(null);
            AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
            AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
            AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
            AbstractC22676k.m65750j(helpLinkTextDisplay, "helpLinkTextDisplay");
            AbstractC22676k.m65750j(helpLink, "helpLink");
            this.screenTitleDisplay = screenTitleDisplay;
            this.headlineDisplay = headlineDisplay;
            this.bodyDisplay = bodyDisplay;
            this.helpLinkTextDisplay = helpLinkTextDisplay;
            this.helpLink = helpLink;
        }

        public static /* synthetic */ SubmissionComplete copy$default(SubmissionComplete submissionComplete, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = submissionComplete.screenTitleDisplay;
            }
            if ((i13 & 2) != 0) {
                textResource2 = submissionComplete.headlineDisplay;
            }
            if ((i13 & 4) != 0) {
                textResource3 = submissionComplete.bodyDisplay;
            }
            if ((i13 & 8) != 0) {
                textResource4 = submissionComplete.helpLinkTextDisplay;
            }
            if ((i13 & 16) != 0) {
                str = submissionComplete.helpLink;
            }
            String str2 = str;
            TextResource textResource5 = textResource3;
            return submissionComplete.copy(textResource, textResource2, textResource5, textResource4, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getScreenTitleDisplay() {
            return this.screenTitleDisplay;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TextResource getHeadlineDisplay() {
            return this.headlineDisplay;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TextResource getBodyDisplay() {
            return this.bodyDisplay;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TextResource getHelpLinkTextDisplay() {
            return this.helpLinkTextDisplay;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getHelpLink() {
            return this.helpLink;
        }

        public final SubmissionComplete copy(TextResource screenTitleDisplay, TextResource headlineDisplay, TextResource bodyDisplay, TextResource helpLinkTextDisplay, String helpLink) {
            AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
            AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
            AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
            AbstractC22676k.m65750j(helpLinkTextDisplay, "helpLinkTextDisplay");
            AbstractC22676k.m65750j(helpLink, "helpLink");
            return new SubmissionComplete(screenTitleDisplay, headlineDisplay, bodyDisplay, helpLinkTextDisplay, helpLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmissionComplete)) {
                return false;
            }
            SubmissionComplete submissionComplete = (SubmissionComplete) other;
            return AbstractC22676k.m65745e(this.screenTitleDisplay, submissionComplete.screenTitleDisplay) && AbstractC22676k.m65745e(this.headlineDisplay, submissionComplete.headlineDisplay) && AbstractC22676k.m65745e(this.bodyDisplay, submissionComplete.bodyDisplay) && AbstractC22676k.m65745e(this.helpLinkTextDisplay, submissionComplete.helpLinkTextDisplay) && AbstractC22676k.m65745e(this.helpLink, submissionComplete.helpLink);
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getBodyDisplay() {
            return this.bodyDisplay;
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getHeadlineDisplay() {
            return this.headlineDisplay;
        }

        public final String getHelpLink() {
            return this.helpLink;
        }

        public final TextResource getHelpLinkTextDisplay() {
            return this.helpLinkTextDisplay;
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getScreenTitleDisplay() {
            return this.screenTitleDisplay;
        }

        public int hashCode() {
            return this.helpLink.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.screenTitleDisplay.hashCode() * 31, this.headlineDisplay, 31), this.bodyDisplay, 31), this.helpLinkTextDisplay, 31);
        }

        public String toString() {
            TextResource textResource = this.screenTitleDisplay;
            TextResource textResource2 = this.headlineDisplay;
            TextResource textResource3 = this.bodyDisplay;
            TextResource textResource4 = this.helpLinkTextDisplay;
            String str = this.helpLink;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("SubmissionComplete(screenTitleDisplay=", textResource, ", headlineDisplay=", textResource2, ", bodyDisplay=");
            AbstractC30007c.m91855y(sbM106658q, textResource3, ", helpLinkTextDisplay=", textResource4, ", helpLink=");
            return AbstractC25012a.m73376i(str, ")", sbM106658q);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "submissionLoadingTextDisplay", "Lcom/whoop/design/util/TextResource;", "submissionSuccessTextDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "getSubmissionLoadingTextDisplay", "()Lcom/whoop/design/util/TextResource;", "getSubmissionSuccessTextDisplay", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class SubmittingMemberDataExportModel extends MemberDataExportModel {
        public static final int $stable = TextResource.$stable;
        private final TextResource submissionLoadingTextDisplay;
        private final TextResource submissionSuccessTextDisplay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmittingMemberDataExportModel(TextResource submissionLoadingTextDisplay, TextResource submissionSuccessTextDisplay) {
            super(null);
            AbstractC22676k.m65750j(submissionLoadingTextDisplay, "submissionLoadingTextDisplay");
            AbstractC22676k.m65750j(submissionSuccessTextDisplay, "submissionSuccessTextDisplay");
            this.submissionLoadingTextDisplay = submissionLoadingTextDisplay;
            this.submissionSuccessTextDisplay = submissionSuccessTextDisplay;
        }

        public static /* synthetic */ SubmittingMemberDataExportModel copy$default(SubmittingMemberDataExportModel submittingMemberDataExportModel, TextResource textResource, TextResource textResource2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = submittingMemberDataExportModel.submissionLoadingTextDisplay;
            }
            if ((i13 & 2) != 0) {
                textResource2 = submittingMemberDataExportModel.submissionSuccessTextDisplay;
            }
            return submittingMemberDataExportModel.copy(textResource, textResource2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getSubmissionLoadingTextDisplay() {
            return this.submissionLoadingTextDisplay;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TextResource getSubmissionSuccessTextDisplay() {
            return this.submissionSuccessTextDisplay;
        }

        public final SubmittingMemberDataExportModel copy(TextResource submissionLoadingTextDisplay, TextResource submissionSuccessTextDisplay) {
            AbstractC22676k.m65750j(submissionLoadingTextDisplay, "submissionLoadingTextDisplay");
            AbstractC22676k.m65750j(submissionSuccessTextDisplay, "submissionSuccessTextDisplay");
            return new SubmittingMemberDataExportModel(submissionLoadingTextDisplay, submissionSuccessTextDisplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmittingMemberDataExportModel)) {
                return false;
            }
            SubmittingMemberDataExportModel submittingMemberDataExportModel = (SubmittingMemberDataExportModel) other;
            return AbstractC22676k.m65745e(this.submissionLoadingTextDisplay, submittingMemberDataExportModel.submissionLoadingTextDisplay) && AbstractC22676k.m65745e(this.submissionSuccessTextDisplay, submittingMemberDataExportModel.submissionSuccessTextDisplay);
        }

        public final TextResource getSubmissionLoadingTextDisplay() {
            return this.submissionLoadingTextDisplay;
        }

        public final TextResource getSubmissionSuccessTextDisplay() {
            return this.submissionSuccessTextDisplay;
        }

        public int hashCode() {
            return this.submissionSuccessTextDisplay.hashCode() + (this.submissionLoadingTextDisplay.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79501e("SubmittingMemberDataExportModel(submissionLoadingTextDisplay=", this.submissionLoadingTextDisplay, ", submissionSuccessTextDisplay=", this.submissionSuccessTextDisplay, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u000bHÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel$UnavailableMemberDataExportModel;", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "screenTitleDisplay", "Lcom/whoop/design/util/TextResource;", "headlineDisplay", "bodyDisplay", "exportUnavailableSectionIcon", "exportUnavailableSectionHeadlineDisplay", "exportUnavailableSectionBodyDisplay", "helpLinkTextDisplay", "helpLink", "", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "getScreenTitleDisplay", "()Lcom/whoop/design/util/TextResource;", "getHeadlineDisplay", "getBodyDisplay", "getExportUnavailableSectionIcon", "getExportUnavailableSectionHeadlineDisplay", "getExportUnavailableSectionBodyDisplay", "getHelpLinkTextDisplay", "getHelpLink", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UnavailableMemberDataExportModel extends MemberDataExportModel {
        public static final int $stable = TextResource.$stable;
        private final TextResource bodyDisplay;
        private final TextResource exportUnavailableSectionBodyDisplay;
        private final TextResource exportUnavailableSectionHeadlineDisplay;
        private final TextResource exportUnavailableSectionIcon;
        private final TextResource headlineDisplay;
        private final String helpLink;
        private final TextResource helpLinkTextDisplay;
        private final TextResource screenTitleDisplay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnavailableMemberDataExportModel(TextResource screenTitleDisplay, TextResource headlineDisplay, TextResource bodyDisplay, TextResource exportUnavailableSectionIcon, TextResource exportUnavailableSectionHeadlineDisplay, TextResource exportUnavailableSectionBodyDisplay, TextResource helpLinkTextDisplay, String helpLink) {
            super(null);
            AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
            AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
            AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
            AbstractC22676k.m65750j(exportUnavailableSectionIcon, "exportUnavailableSectionIcon");
            AbstractC22676k.m65750j(exportUnavailableSectionHeadlineDisplay, "exportUnavailableSectionHeadlineDisplay");
            AbstractC22676k.m65750j(exportUnavailableSectionBodyDisplay, "exportUnavailableSectionBodyDisplay");
            AbstractC22676k.m65750j(helpLinkTextDisplay, "helpLinkTextDisplay");
            AbstractC22676k.m65750j(helpLink, "helpLink");
            this.screenTitleDisplay = screenTitleDisplay;
            this.headlineDisplay = headlineDisplay;
            this.bodyDisplay = bodyDisplay;
            this.exportUnavailableSectionIcon = exportUnavailableSectionIcon;
            this.exportUnavailableSectionHeadlineDisplay = exportUnavailableSectionHeadlineDisplay;
            this.exportUnavailableSectionBodyDisplay = exportUnavailableSectionBodyDisplay;
            this.helpLinkTextDisplay = helpLinkTextDisplay;
            this.helpLink = helpLink;
        }

        public static /* synthetic */ UnavailableMemberDataExportModel copy$default(UnavailableMemberDataExportModel unavailableMemberDataExportModel, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = unavailableMemberDataExportModel.screenTitleDisplay;
            }
            if ((i13 & 2) != 0) {
                textResource2 = unavailableMemberDataExportModel.headlineDisplay;
            }
            if ((i13 & 4) != 0) {
                textResource3 = unavailableMemberDataExportModel.bodyDisplay;
            }
            if ((i13 & 8) != 0) {
                textResource4 = unavailableMemberDataExportModel.exportUnavailableSectionIcon;
            }
            if ((i13 & 16) != 0) {
                textResource5 = unavailableMemberDataExportModel.exportUnavailableSectionHeadlineDisplay;
            }
            if ((i13 & 32) != 0) {
                textResource6 = unavailableMemberDataExportModel.exportUnavailableSectionBodyDisplay;
            }
            if ((i13 & 64) != 0) {
                textResource7 = unavailableMemberDataExportModel.helpLinkTextDisplay;
            }
            if ((i13 & 128) != 0) {
                str = unavailableMemberDataExportModel.helpLink;
            }
            TextResource textResource8 = textResource7;
            String str2 = str;
            TextResource textResource9 = textResource5;
            TextResource textResource10 = textResource6;
            return unavailableMemberDataExportModel.copy(textResource, textResource2, textResource3, textResource4, textResource9, textResource10, textResource8, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextResource getScreenTitleDisplay() {
            return this.screenTitleDisplay;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TextResource getHeadlineDisplay() {
            return this.headlineDisplay;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TextResource getBodyDisplay() {
            return this.bodyDisplay;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TextResource getExportUnavailableSectionIcon() {
            return this.exportUnavailableSectionIcon;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final TextResource getExportUnavailableSectionHeadlineDisplay() {
            return this.exportUnavailableSectionHeadlineDisplay;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final TextResource getExportUnavailableSectionBodyDisplay() {
            return this.exportUnavailableSectionBodyDisplay;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final TextResource getHelpLinkTextDisplay() {
            return this.helpLinkTextDisplay;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getHelpLink() {
            return this.helpLink;
        }

        public final UnavailableMemberDataExportModel copy(TextResource screenTitleDisplay, TextResource headlineDisplay, TextResource bodyDisplay, TextResource exportUnavailableSectionIcon, TextResource exportUnavailableSectionHeadlineDisplay, TextResource exportUnavailableSectionBodyDisplay, TextResource helpLinkTextDisplay, String helpLink) {
            AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
            AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
            AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
            AbstractC22676k.m65750j(exportUnavailableSectionIcon, "exportUnavailableSectionIcon");
            AbstractC22676k.m65750j(exportUnavailableSectionHeadlineDisplay, "exportUnavailableSectionHeadlineDisplay");
            AbstractC22676k.m65750j(exportUnavailableSectionBodyDisplay, "exportUnavailableSectionBodyDisplay");
            AbstractC22676k.m65750j(helpLinkTextDisplay, "helpLinkTextDisplay");
            AbstractC22676k.m65750j(helpLink, "helpLink");
            return new UnavailableMemberDataExportModel(screenTitleDisplay, headlineDisplay, bodyDisplay, exportUnavailableSectionIcon, exportUnavailableSectionHeadlineDisplay, exportUnavailableSectionBodyDisplay, helpLinkTextDisplay, helpLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnavailableMemberDataExportModel)) {
                return false;
            }
            UnavailableMemberDataExportModel unavailableMemberDataExportModel = (UnavailableMemberDataExportModel) other;
            return AbstractC22676k.m65745e(this.screenTitleDisplay, unavailableMemberDataExportModel.screenTitleDisplay) && AbstractC22676k.m65745e(this.headlineDisplay, unavailableMemberDataExportModel.headlineDisplay) && AbstractC22676k.m65745e(this.bodyDisplay, unavailableMemberDataExportModel.bodyDisplay) && AbstractC22676k.m65745e(this.exportUnavailableSectionIcon, unavailableMemberDataExportModel.exportUnavailableSectionIcon) && AbstractC22676k.m65745e(this.exportUnavailableSectionHeadlineDisplay, unavailableMemberDataExportModel.exportUnavailableSectionHeadlineDisplay) && AbstractC22676k.m65745e(this.exportUnavailableSectionBodyDisplay, unavailableMemberDataExportModel.exportUnavailableSectionBodyDisplay) && AbstractC22676k.m65745e(this.helpLinkTextDisplay, unavailableMemberDataExportModel.helpLinkTextDisplay) && AbstractC22676k.m65745e(this.helpLink, unavailableMemberDataExportModel.helpLink);
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getBodyDisplay() {
            return this.bodyDisplay;
        }

        public final TextResource getExportUnavailableSectionBodyDisplay() {
            return this.exportUnavailableSectionBodyDisplay;
        }

        public final TextResource getExportUnavailableSectionHeadlineDisplay() {
            return this.exportUnavailableSectionHeadlineDisplay;
        }

        public final TextResource getExportUnavailableSectionIcon() {
            return this.exportUnavailableSectionIcon;
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getHeadlineDisplay() {
            return this.headlineDisplay;
        }

        public final String getHelpLink() {
            return this.helpLink;
        }

        public final TextResource getHelpLinkTextDisplay() {
            return this.helpLinkTextDisplay;
        }

        @Override // com.whoop.memberdataexport.models.MemberDataExportModel
        public TextResource getScreenTitleDisplay() {
            return this.screenTitleDisplay;
        }

        public int hashCode() {
            return this.helpLink.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.screenTitleDisplay.hashCode() * 31, this.headlineDisplay, 31), this.bodyDisplay, 31), this.exportUnavailableSectionIcon, 31), this.exportUnavailableSectionHeadlineDisplay, 31), this.exportUnavailableSectionBodyDisplay, 31), this.helpLinkTextDisplay, 31);
        }

        public String toString() {
            TextResource textResource = this.screenTitleDisplay;
            TextResource textResource2 = this.headlineDisplay;
            TextResource textResource3 = this.bodyDisplay;
            TextResource textResource4 = this.exportUnavailableSectionIcon;
            TextResource textResource5 = this.exportUnavailableSectionHeadlineDisplay;
            TextResource textResource6 = this.exportUnavailableSectionBodyDisplay;
            TextResource textResource7 = this.helpLinkTextDisplay;
            String str = this.helpLink;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("UnavailableMemberDataExportModel(screenTitleDisplay=", textResource, ", headlineDisplay=", textResource2, ", bodyDisplay=");
            AbstractC30007c.m91855y(sbM106658q, textResource3, ", exportUnavailableSectionIcon=", textResource4, ", exportUnavailableSectionHeadlineDisplay=");
            AbstractC30007c.m91855y(sbM106658q, textResource5, ", exportUnavailableSectionBodyDisplay=", textResource6, ", helpLinkTextDisplay=");
            sbM106658q.append(textResource7);
            sbM106658q.append(", helpLink=");
            sbM106658q.append(str);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }
    }

    public /* synthetic */ MemberDataExportModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public TextResource getBodyDisplay() {
        return this.bodyDisplay;
    }

    public TextResource getHeadlineDisplay() {
        return this.headlineDisplay;
    }

    public TextResource getScreenTitleDisplay() {
        return this.screenTitleDisplay;
    }

    private MemberDataExportModel() {
        this.screenTitleDisplay = AbstractC8693b.m21267a();
        this.headlineDisplay = AbstractC8693b.m21267a();
        this.bodyDisplay = AbstractC8693b.m21267a();
    }
}
