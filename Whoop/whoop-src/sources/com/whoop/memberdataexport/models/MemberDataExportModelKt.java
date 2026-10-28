package com.whoop.memberdataexport.models;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import lv1.EnumC24761b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m65681d2 = {"reduceDtoToModel", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "intermediateMdeDto", "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;", "member-data-export_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MemberDataExportModelKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC24761b.values().length];
            try {
                iArr[EnumC24761b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24761b.AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24761b.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC24761b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MemberDataExportModel reduceDtoToModel(IntermediateMemberDataExportDto intermediateMdeDto) {
        AbstractC22676k.m65750j(intermediateMdeDto, "intermediateMdeDto");
        int i13 = WhenMappings.$EnumSwitchMapping$0[EnumC24761b.INSTANCE.m72502a(intermediateMdeDto.getState()).ordinal()];
        if (i13 == 1) {
            return MemberDataExportModel.LoadingEmptyMemberDataExportModel.INSTANCE;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                if (i13 == 4) {
                    return new MemberDataExportModel.ErrorMemberDataExportModel(AbstractC8693b.m21267a(), AbstractC8693b.m21267a(), AbstractC8693b.m21267a());
                }
                throw new NoWhenBranchMatchedException();
            }
            TextResource textResourceM21278l = AbstractC8693b.m21278l(intermediateMdeDto.getScreenTitleDisplay());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(intermediateMdeDto.getHeadlineDisplay());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(intermediateMdeDto.getBodyDisplay());
            String exportUnavailableSectionIcon = intermediateMdeDto.getExportUnavailableSectionIcon();
            AbstractC22676k.m65747g(exportUnavailableSectionIcon);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(exportUnavailableSectionIcon);
            String exportUnavailableSectionHeadlineDisplay = intermediateMdeDto.getExportUnavailableSectionHeadlineDisplay();
            AbstractC22676k.m65747g(exportUnavailableSectionHeadlineDisplay);
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(exportUnavailableSectionHeadlineDisplay);
            String exportUnavailableSectionBodyDisplay = intermediateMdeDto.getExportUnavailableSectionBodyDisplay();
            AbstractC22676k.m65747g(exportUnavailableSectionBodyDisplay);
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(exportUnavailableSectionBodyDisplay);
            String helpLinkTextDisplay = intermediateMdeDto.getHelpLinkTextDisplay();
            AbstractC22676k.m65747g(helpLinkTextDisplay);
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(helpLinkTextDisplay);
            String helpLink = intermediateMdeDto.getHelpLink();
            AbstractC22676k.m65747g(helpLink);
            return new MemberDataExportModel.UnavailableMemberDataExportModel(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, helpLink);
        }
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(intermediateMdeDto.getScreenTitleDisplay());
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(intermediateMdeDto.getHeadlineDisplay());
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l(intermediateMdeDto.getBodyDisplay());
        String learnMoreTextDisplay = intermediateMdeDto.getLearnMoreTextDisplay();
        AbstractC22676k.m65747g(learnMoreTextDisplay);
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l(learnMoreTextDisplay);
        String learnMoreLink = intermediateMdeDto.getLearnMoreLink();
        AbstractC22676k.m65747g(learnMoreLink);
        String updateAccountTextDisplay = intermediateMdeDto.getUpdateAccountTextDisplay();
        AbstractC22676k.m65747g(updateAccountTextDisplay);
        TextResource textResourceM21278l12 = AbstractC8693b.m21278l(updateAccountTextDisplay);
        String confirmationTextDisplay = intermediateMdeDto.getConfirmationTextDisplay();
        AbstractC22676k.m65747g(confirmationTextDisplay);
        TextResource textResourceM21278l13 = AbstractC8693b.m21278l(confirmationTextDisplay);
        String recipientEmailDisplay = intermediateMdeDto.getRecipientEmailDisplay();
        AbstractC22676k.m65747g(recipientEmailDisplay);
        String recipientEmailLabelDisplay = intermediateMdeDto.getRecipientEmailLabelDisplay();
        AbstractC22676k.m65747g(recipientEmailLabelDisplay);
        TextResource textResourceM21278l14 = AbstractC8693b.m21278l(recipientEmailLabelDisplay);
        String submitButtonTextDisplay = intermediateMdeDto.getSubmitButtonTextDisplay();
        AbstractC22676k.m65747g(submitButtonTextDisplay);
        TextResource textResourceM21278l15 = AbstractC8693b.m21278l(submitButtonTextDisplay);
        String submissionLoadingTextDisplay = intermediateMdeDto.getSubmissionLoadingTextDisplay();
        AbstractC22676k.m65747g(submissionLoadingTextDisplay);
        TextResource textResourceM21278l16 = AbstractC8693b.m21278l(submissionLoadingTextDisplay);
        String submissionSuccessTextDisplay = intermediateMdeDto.getSubmissionSuccessTextDisplay();
        AbstractC22676k.m65747g(submissionSuccessTextDisplay);
        return new MemberDataExportModel.AvailableMemberDataExportModel(textResourceM21278l8, textResourceM21278l9, textResourceM21278l10, textResourceM21278l11, learnMoreLink, textResourceM21278l12, "android-app://com.whoop/settings/profileUpdateFragment", textResourceM21278l13, recipientEmailDisplay, textResourceM21278l14, textResourceM21278l15, textResourceM21278l16, AbstractC8693b.m21278l(submissionSuccessTextDisplay));
    }
}
