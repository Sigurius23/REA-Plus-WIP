package com.whoop.memberdataexport.models;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWBÛ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017BÙ\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001eJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001eJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001eJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001eJì\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109J'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010C\u001a\u0004\bE\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bF\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bG\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bH\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bI\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bJ\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bK\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bL\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bM\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bN\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bO\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bP\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bQ\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bR\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bS\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bT\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bU\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bV\u0010\u001e¨\u0006Y"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;", "", "", "state", "screenTitleDisplay", "headlineDisplay", "bodyDisplay", "learnMoreTextDisplay", "learnMoreLink", "updateAccountTextDisplay", "updateAccountLink", "confirmationTextDisplay", "recipientEmailDisplay", "recipientEmailLabelDisplay", "submitButtonTextDisplay", "submissionLoadingTextDisplay", "submissionSuccessTextDisplay", "exportUnavailableSectionIcon", "exportUnavailableSectionHeadlineDisplay", "exportUnavailableSectionBodyDisplay", "helpLinkTextDisplay", "helpLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$member_data_export_release", "(Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getState", "getScreenTitleDisplay", "getHeadlineDisplay", "getBodyDisplay", "getLearnMoreTextDisplay", "getLearnMoreLink", "getUpdateAccountTextDisplay", "getUpdateAccountLink", "getConfirmationTextDisplay", "getRecipientEmailDisplay", "getRecipientEmailLabelDisplay", "getSubmitButtonTextDisplay", "getSubmissionLoadingTextDisplay", "getSubmissionSuccessTextDisplay", "getExportUnavailableSectionIcon", "getExportUnavailableSectionHeadlineDisplay", "getExportUnavailableSectionBodyDisplay", "getHelpLinkTextDisplay", "getHelpLink", "Companion", "$serializer", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntermediateMemberDataExportDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("body_display")
    private final String bodyDisplay;

    @SerializedName("confirmation_text_display")
    private final String confirmationTextDisplay;

    @SerializedName("export_unavailable_section_body_display")
    private final String exportUnavailableSectionBodyDisplay;

    @SerializedName("export_unavailable_section_headline_display")
    private final String exportUnavailableSectionHeadlineDisplay;

    @SerializedName("export_unavailable_section_icon")
    private final String exportUnavailableSectionIcon;

    @SerializedName("headline_display")
    private final String headlineDisplay;

    @SerializedName("help_link")
    private final String helpLink;

    @SerializedName("help_link_text_display")
    private final String helpLinkTextDisplay;

    @SerializedName("learn_more_link")
    private final String learnMoreLink;

    @SerializedName("learn_more_text_display")
    private final String learnMoreTextDisplay;

    @SerializedName("recipient_email_display")
    private final String recipientEmailDisplay;

    @SerializedName("recipient_email_label_display")
    private final String recipientEmailLabelDisplay;

    @SerializedName("screen_title_display")
    private final String screenTitleDisplay;

    @SerializedName("state")
    private final String state;

    @SerializedName("submission_loading_text_display")
    private final String submissionLoadingTextDisplay;

    @SerializedName("submission_success_text_display")
    private final String submissionSuccessTextDisplay;

    @SerializedName("submit_button_text_display")
    private final String submitButtonTextDisplay;

    @SerializedName("update_account_link")
    private final String updateAccountLink;

    @SerializedName("update_account_text_display")
    private final String updateAccountTextDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;", "serializer", "()Lwc3/c;", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntermediateMemberDataExportDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IntermediateMemberDataExportDto(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, IntermediateMemberDataExportDto$$serializer.INSTANCE.getDescriptor());
        }
        this.state = str;
        this.screenTitleDisplay = str2;
        this.headlineDisplay = str3;
        this.bodyDisplay = str4;
        if ((i13 & 16) == 0) {
            this.learnMoreTextDisplay = null;
        } else {
            this.learnMoreTextDisplay = str5;
        }
        if ((i13 & 32) == 0) {
            this.learnMoreLink = null;
        } else {
            this.learnMoreLink = str6;
        }
        if ((i13 & 64) == 0) {
            this.updateAccountTextDisplay = null;
        } else {
            this.updateAccountTextDisplay = str7;
        }
        if ((i13 & 128) == 0) {
            this.updateAccountLink = null;
        } else {
            this.updateAccountLink = str8;
        }
        if ((i13 & 256) == 0) {
            this.confirmationTextDisplay = null;
        } else {
            this.confirmationTextDisplay = str9;
        }
        if ((i13 & 512) == 0) {
            this.recipientEmailDisplay = null;
        } else {
            this.recipientEmailDisplay = str10;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.recipientEmailLabelDisplay = null;
        } else {
            this.recipientEmailLabelDisplay = str11;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.submitButtonTextDisplay = null;
        } else {
            this.submitButtonTextDisplay = str12;
        }
        if ((i13 & 4096) == 0) {
            this.submissionLoadingTextDisplay = null;
        } else {
            this.submissionLoadingTextDisplay = str13;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.submissionSuccessTextDisplay = null;
        } else {
            this.submissionSuccessTextDisplay = str14;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.exportUnavailableSectionIcon = null;
        } else {
            this.exportUnavailableSectionIcon = str15;
        }
        if ((32768 & i13) == 0) {
            this.exportUnavailableSectionHeadlineDisplay = null;
        } else {
            this.exportUnavailableSectionHeadlineDisplay = str16;
        }
        if ((65536 & i13) == 0) {
            this.exportUnavailableSectionBodyDisplay = null;
        } else {
            this.exportUnavailableSectionBodyDisplay = str17;
        }
        if ((131072 & i13) == 0) {
            this.helpLinkTextDisplay = null;
        } else {
            this.helpLinkTextDisplay = str18;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
            this.helpLink = null;
        } else {
            this.helpLink = str19;
        }
    }

    public static /* synthetic */ IntermediateMemberDataExportDto copy$default(IntermediateMemberDataExportDto intermediateMemberDataExportDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i13, Object obj) {
        String str20;
        String str21;
        String str22 = (i13 & 1) != 0 ? intermediateMemberDataExportDto.state : str;
        String str23 = (i13 & 2) != 0 ? intermediateMemberDataExportDto.screenTitleDisplay : str2;
        String str24 = (i13 & 4) != 0 ? intermediateMemberDataExportDto.headlineDisplay : str3;
        String str25 = (i13 & 8) != 0 ? intermediateMemberDataExportDto.bodyDisplay : str4;
        String str26 = (i13 & 16) != 0 ? intermediateMemberDataExportDto.learnMoreTextDisplay : str5;
        String str27 = (i13 & 32) != 0 ? intermediateMemberDataExportDto.learnMoreLink : str6;
        String str28 = (i13 & 64) != 0 ? intermediateMemberDataExportDto.updateAccountTextDisplay : str7;
        String str29 = (i13 & 128) != 0 ? intermediateMemberDataExportDto.updateAccountLink : str8;
        String str30 = (i13 & 256) != 0 ? intermediateMemberDataExportDto.confirmationTextDisplay : str9;
        String str31 = (i13 & 512) != 0 ? intermediateMemberDataExportDto.recipientEmailDisplay : str10;
        String str32 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? intermediateMemberDataExportDto.recipientEmailLabelDisplay : str11;
        String str33 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? intermediateMemberDataExportDto.submitButtonTextDisplay : str12;
        String str34 = (i13 & 4096) != 0 ? intermediateMemberDataExportDto.submissionLoadingTextDisplay : str13;
        String str35 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? intermediateMemberDataExportDto.submissionSuccessTextDisplay : str14;
        String str36 = str22;
        String str37 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? intermediateMemberDataExportDto.exportUnavailableSectionIcon : str15;
        String str38 = (i13 & 32768) != 0 ? intermediateMemberDataExportDto.exportUnavailableSectionHeadlineDisplay : str16;
        String str39 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? intermediateMemberDataExportDto.exportUnavailableSectionBodyDisplay : str17;
        String str40 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? intermediateMemberDataExportDto.helpLinkTextDisplay : str18;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            str21 = str40;
            str20 = intermediateMemberDataExportDto.helpLink;
        } else {
            str20 = str19;
            str21 = str40;
        }
        return intermediateMemberDataExportDto.copy(str36, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str37, str38, str39, str21, str20);
    }

    public static final /* synthetic */ void write$Self$member_data_export_release(IntermediateMemberDataExportDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.state);
        output.encodeStringElement(serialDesc, 1, self.screenTitleDisplay);
        output.encodeStringElement(serialDesc, 2, self.headlineDisplay);
        output.encodeStringElement(serialDesc, 3, self.bodyDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.learnMoreTextDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.learnMoreTextDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.learnMoreLink != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.learnMoreLink);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.updateAccountTextDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.updateAccountTextDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.updateAccountLink != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.updateAccountLink);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.confirmationTextDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.confirmationTextDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.recipientEmailDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.recipientEmailDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.recipientEmailLabelDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.recipientEmailLabelDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.submitButtonTextDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.submitButtonTextDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.submissionLoadingTextDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.submissionLoadingTextDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.submissionSuccessTextDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.submissionSuccessTextDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.exportUnavailableSectionIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.exportUnavailableSectionIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.exportUnavailableSectionHeadlineDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.exportUnavailableSectionHeadlineDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.exportUnavailableSectionBodyDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.exportUnavailableSectionBodyDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.helpLinkTextDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.helpLinkTextDisplay);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 18) && self.helpLink == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, self.helpLink);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRecipientEmailDisplay() {
        return this.recipientEmailDisplay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRecipientEmailLabelDisplay() {
        return this.recipientEmailLabelDisplay;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSubmitButtonTextDisplay() {
        return this.submitButtonTextDisplay;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSubmissionLoadingTextDisplay() {
        return this.submissionLoadingTextDisplay;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSubmissionSuccessTextDisplay() {
        return this.submissionSuccessTextDisplay;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getExportUnavailableSectionIcon() {
        return this.exportUnavailableSectionIcon;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getExportUnavailableSectionHeadlineDisplay() {
        return this.exportUnavailableSectionHeadlineDisplay;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getExportUnavailableSectionBodyDisplay() {
        return this.exportUnavailableSectionBodyDisplay;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getHelpLinkTextDisplay() {
        return this.helpLinkTextDisplay;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getHelpLink() {
        return this.helpLink;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScreenTitleDisplay() {
        return this.screenTitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeadlineDisplay() {
        return this.headlineDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBodyDisplay() {
        return this.bodyDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLearnMoreTextDisplay() {
        return this.learnMoreTextDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLearnMoreLink() {
        return this.learnMoreLink;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUpdateAccountTextDisplay() {
        return this.updateAccountTextDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUpdateAccountLink() {
        return this.updateAccountLink;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getConfirmationTextDisplay() {
        return this.confirmationTextDisplay;
    }

    public final IntermediateMemberDataExportDto copy(String state, String screenTitleDisplay, String headlineDisplay, String bodyDisplay, String learnMoreTextDisplay, String learnMoreLink, String updateAccountTextDisplay, String updateAccountLink, String confirmationTextDisplay, String recipientEmailDisplay, String recipientEmailLabelDisplay, String submitButtonTextDisplay, String submissionLoadingTextDisplay, String submissionSuccessTextDisplay, String exportUnavailableSectionIcon, String exportUnavailableSectionHeadlineDisplay, String exportUnavailableSectionBodyDisplay, String helpLinkTextDisplay, String helpLink) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
        AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
        AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
        return new IntermediateMemberDataExportDto(state, screenTitleDisplay, headlineDisplay, bodyDisplay, learnMoreTextDisplay, learnMoreLink, updateAccountTextDisplay, updateAccountLink, confirmationTextDisplay, recipientEmailDisplay, recipientEmailLabelDisplay, submitButtonTextDisplay, submissionLoadingTextDisplay, submissionSuccessTextDisplay, exportUnavailableSectionIcon, exportUnavailableSectionHeadlineDisplay, exportUnavailableSectionBodyDisplay, helpLinkTextDisplay, helpLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntermediateMemberDataExportDto)) {
            return false;
        }
        IntermediateMemberDataExportDto intermediateMemberDataExportDto = (IntermediateMemberDataExportDto) other;
        return AbstractC22676k.m65745e(this.state, intermediateMemberDataExportDto.state) && AbstractC22676k.m65745e(this.screenTitleDisplay, intermediateMemberDataExportDto.screenTitleDisplay) && AbstractC22676k.m65745e(this.headlineDisplay, intermediateMemberDataExportDto.headlineDisplay) && AbstractC22676k.m65745e(this.bodyDisplay, intermediateMemberDataExportDto.bodyDisplay) && AbstractC22676k.m65745e(this.learnMoreTextDisplay, intermediateMemberDataExportDto.learnMoreTextDisplay) && AbstractC22676k.m65745e(this.learnMoreLink, intermediateMemberDataExportDto.learnMoreLink) && AbstractC22676k.m65745e(this.updateAccountTextDisplay, intermediateMemberDataExportDto.updateAccountTextDisplay) && AbstractC22676k.m65745e(this.updateAccountLink, intermediateMemberDataExportDto.updateAccountLink) && AbstractC22676k.m65745e(this.confirmationTextDisplay, intermediateMemberDataExportDto.confirmationTextDisplay) && AbstractC22676k.m65745e(this.recipientEmailDisplay, intermediateMemberDataExportDto.recipientEmailDisplay) && AbstractC22676k.m65745e(this.recipientEmailLabelDisplay, intermediateMemberDataExportDto.recipientEmailLabelDisplay) && AbstractC22676k.m65745e(this.submitButtonTextDisplay, intermediateMemberDataExportDto.submitButtonTextDisplay) && AbstractC22676k.m65745e(this.submissionLoadingTextDisplay, intermediateMemberDataExportDto.submissionLoadingTextDisplay) && AbstractC22676k.m65745e(this.submissionSuccessTextDisplay, intermediateMemberDataExportDto.submissionSuccessTextDisplay) && AbstractC22676k.m65745e(this.exportUnavailableSectionIcon, intermediateMemberDataExportDto.exportUnavailableSectionIcon) && AbstractC22676k.m65745e(this.exportUnavailableSectionHeadlineDisplay, intermediateMemberDataExportDto.exportUnavailableSectionHeadlineDisplay) && AbstractC22676k.m65745e(this.exportUnavailableSectionBodyDisplay, intermediateMemberDataExportDto.exportUnavailableSectionBodyDisplay) && AbstractC22676k.m65745e(this.helpLinkTextDisplay, intermediateMemberDataExportDto.helpLinkTextDisplay) && AbstractC22676k.m65745e(this.helpLink, intermediateMemberDataExportDto.helpLink);
    }

    public final String getBodyDisplay() {
        return this.bodyDisplay;
    }

    public final String getConfirmationTextDisplay() {
        return this.confirmationTextDisplay;
    }

    public final String getExportUnavailableSectionBodyDisplay() {
        return this.exportUnavailableSectionBodyDisplay;
    }

    public final String getExportUnavailableSectionHeadlineDisplay() {
        return this.exportUnavailableSectionHeadlineDisplay;
    }

    public final String getExportUnavailableSectionIcon() {
        return this.exportUnavailableSectionIcon;
    }

    public final String getHeadlineDisplay() {
        return this.headlineDisplay;
    }

    public final String getHelpLink() {
        return this.helpLink;
    }

    public final String getHelpLinkTextDisplay() {
        return this.helpLinkTextDisplay;
    }

    public final String getLearnMoreLink() {
        return this.learnMoreLink;
    }

    public final String getLearnMoreTextDisplay() {
        return this.learnMoreTextDisplay;
    }

    public final String getRecipientEmailDisplay() {
        return this.recipientEmailDisplay;
    }

    public final String getRecipientEmailLabelDisplay() {
        return this.recipientEmailLabelDisplay;
    }

    public final String getScreenTitleDisplay() {
        return this.screenTitleDisplay;
    }

    public final String getState() {
        return this.state;
    }

    public final String getSubmissionLoadingTextDisplay() {
        return this.submissionLoadingTextDisplay;
    }

    public final String getSubmissionSuccessTextDisplay() {
        return this.submissionSuccessTextDisplay;
    }

    public final String getSubmitButtonTextDisplay() {
        return this.submitButtonTextDisplay;
    }

    public final String getUpdateAccountLink() {
        return this.updateAccountLink;
    }

    public final String getUpdateAccountTextDisplay() {
        return this.updateAccountTextDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.state.hashCode() * 31, 31, this.screenTitleDisplay), 31, this.headlineDisplay), 31, this.bodyDisplay);
        String str = this.learnMoreTextDisplay;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.learnMoreLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updateAccountTextDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.updateAccountLink;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.confirmationTextDisplay;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.recipientEmailDisplay;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.recipientEmailLabelDisplay;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.submitButtonTextDisplay;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.submissionLoadingTextDisplay;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.submissionSuccessTextDisplay;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.exportUnavailableSectionIcon;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.exportUnavailableSectionHeadlineDisplay;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.exportUnavailableSectionBodyDisplay;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.helpLinkTextDisplay;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.helpLink;
        return iHashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    public String toString() {
        String str = this.state;
        String str2 = this.screenTitleDisplay;
        String str3 = this.headlineDisplay;
        String str4 = this.bodyDisplay;
        String str5 = this.learnMoreTextDisplay;
        String str6 = this.learnMoreLink;
        String str7 = this.updateAccountTextDisplay;
        String str8 = this.updateAccountLink;
        String str9 = this.confirmationTextDisplay;
        String str10 = this.recipientEmailDisplay;
        String str11 = this.recipientEmailLabelDisplay;
        String str12 = this.submitButtonTextDisplay;
        String str13 = this.submissionLoadingTextDisplay;
        String str14 = this.submissionSuccessTextDisplay;
        String str15 = this.exportUnavailableSectionIcon;
        String str16 = this.exportUnavailableSectionHeadlineDisplay;
        String str17 = this.exportUnavailableSectionBodyDisplay;
        String str18 = this.helpLinkTextDisplay;
        String str19 = this.helpLink;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("IntermediateMemberDataExportDto(state=", str, ", screenTitleDisplay=", str2, ", headlineDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", bodyDisplay=", str4, ", learnMoreTextDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", learnMoreLink=", str6, ", updateAccountTextDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", updateAccountLink=", str8, ", confirmationTextDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", recipientEmailDisplay=", str10, ", recipientEmailLabelDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str11, ", submitButtonTextDisplay=", str12, ", submissionLoadingTextDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str13, ", submissionSuccessTextDisplay=", str14, ", exportUnavailableSectionIcon=");
        AbstractC11266d.m30444B(sbM32001t, str15, ", exportUnavailableSectionHeadlineDisplay=", str16, ", exportUnavailableSectionBodyDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str17, ", helpLinkTextDisplay=", str18, ", helpLink=");
        return AbstractC25012a.m73376i(str19, ")", sbM32001t);
    }

    public IntermediateMemberDataExportDto(String state, String screenTitleDisplay, String headlineDisplay, String bodyDisplay, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(screenTitleDisplay, "screenTitleDisplay");
        AbstractC22676k.m65750j(headlineDisplay, "headlineDisplay");
        AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
        this.state = state;
        this.screenTitleDisplay = screenTitleDisplay;
        this.headlineDisplay = headlineDisplay;
        this.bodyDisplay = bodyDisplay;
        this.learnMoreTextDisplay = str;
        this.learnMoreLink = str2;
        this.updateAccountTextDisplay = str3;
        this.updateAccountLink = str4;
        this.confirmationTextDisplay = str5;
        this.recipientEmailDisplay = str6;
        this.recipientEmailLabelDisplay = str7;
        this.submitButtonTextDisplay = str8;
        this.submissionLoadingTextDisplay = str9;
        this.submissionSuccessTextDisplay = str10;
        this.exportUnavailableSectionIcon = str11;
        this.exportUnavailableSectionHeadlineDisplay = str12;
        this.exportUnavailableSectionBodyDisplay = str13;
        this.helpLinkTextDisplay = str14;
        this.helpLink = str15;
    }

    public /* synthetic */ IntermediateMemberDataExportDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) != 0 ? null : str8, (i13 & 256) != 0 ? null : str9, (i13 & 512) != 0 ? null : str10, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str11, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str12, (i13 & 4096) != 0 ? null : str13, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str14, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str15, (32768 & i13) != 0 ? null : str16, (65536 & i13) != 0 ? null : str17, (131072 & i13) != 0 ? null : str18, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str19);
    }
}
