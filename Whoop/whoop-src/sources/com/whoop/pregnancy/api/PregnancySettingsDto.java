package com.whoop.pregnancy.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NOBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bk\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/Jd\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\"J\u0010\u00103\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010)R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010E\u0012\u0004\bG\u0010<\u001a\u0004\bF\u0010+R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010H\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010/¨\u0006P"}, m65681d2 = {"Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "", "", "screenTitle", "betaTag", "Lcom/whoop/pregnancy/api/PregnancyToggleDto;", "pregnancyToggle", "Lcom/whoop/pregnancy/api/DueDateDto;", "dueDate", "Lcom/whoop/pregnancy/api/PrivacyDto;", "privacy", "Lcom/whoop/pregnancy/api/DueDateOptionsDto;", "dueDateOptions", "Lcom/whoop/pregnancy/api/ExitDialogDto;", "exitDialog", "Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;", "previousPregnanciesSection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/pregnancy/api/PregnancyToggleDto;Lcom/whoop/pregnancy/api/DueDateDto;Lcom/whoop/pregnancy/api/PrivacyDto;Lcom/whoop/pregnancy/api/DueDateOptionsDto;Lcom/whoop/pregnancy/api/ExitDialogDto;Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/pregnancy/api/PregnancyToggleDto;Lcom/whoop/pregnancy/api/DueDateDto;Lcom/whoop/pregnancy/api/PrivacyDto;Lcom/whoop/pregnancy/api/DueDateOptionsDto;Lcom/whoop/pregnancy/api/ExitDialogDto;Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$pregnancy_release", "(Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/pregnancy/api/PregnancyToggleDto;", "component4", "()Lcom/whoop/pregnancy/api/DueDateDto;", "component5", "()Lcom/whoop/pregnancy/api/PrivacyDto;", "component6", "()Lcom/whoop/pregnancy/api/DueDateOptionsDto;", "component7", "()Lcom/whoop/pregnancy/api/ExitDialogDto;", "component8", "()Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/pregnancy/api/PregnancyToggleDto;Lcom/whoop/pregnancy/api/DueDateDto;Lcom/whoop/pregnancy/api/PrivacyDto;Lcom/whoop/pregnancy/api/DueDateOptionsDto;Lcom/whoop/pregnancy/api/ExitDialogDto;Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;)Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreenTitle", "getScreenTitle$annotations", "()V", "getBetaTag", "getBetaTag$annotations", "Lcom/whoop/pregnancy/api/PregnancyToggleDto;", "getPregnancyToggle", "Lcom/whoop/pregnancy/api/DueDateDto;", "getDueDate", "Lcom/whoop/pregnancy/api/PrivacyDto;", "getPrivacy", "Lcom/whoop/pregnancy/api/DueDateOptionsDto;", "getDueDateOptions", "getDueDateOptions$annotations", "Lcom/whoop/pregnancy/api/ExitDialogDto;", "getExitDialog", "getExitDialog$annotations", "Lcom/whoop/pregnancy/api/PreviousPregnanciesSectionDto;", "getPreviousPregnanciesSection", "Companion", "$serializer", "a", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PregnancySettingsDto {
    private final String betaTag;
    private final DueDateDto dueDate;
    private final DueDateOptionsDto dueDateOptions;
    private final ExitDialogDto exitDialog;
    private final PregnancyToggleDto pregnancyToggle;
    private final PreviousPregnanciesSectionDto previousPregnanciesSection;
    private final PrivacyDto privacy;
    private final String screenTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.pregnancy.api.PregnancySettingsDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/pregnancy/api/PregnancySettingsDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "serializer", "()Lwc3/c;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PregnancySettingsDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PregnancySettingsDto(int i13, String str, String str2, PregnancyToggleDto pregnancyToggleDto, DueDateDto dueDateDto, PrivacyDto privacyDto, DueDateOptionsDto dueDateOptionsDto, ExitDialogDto exitDialogDto, PreviousPregnanciesSectionDto previousPregnanciesSectionDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, PregnancySettingsDto$$serializer.INSTANCE.getDescriptor());
        }
        this.screenTitle = str;
        this.betaTag = str2;
        this.pregnancyToggle = pregnancyToggleDto;
        this.dueDate = dueDateDto;
        this.privacy = privacyDto;
        this.dueDateOptions = dueDateOptionsDto;
        this.exitDialog = exitDialogDto;
        if ((i13 & 128) == 0) {
            this.previousPregnanciesSection = null;
        } else {
            this.previousPregnanciesSection = previousPregnanciesSectionDto;
        }
    }

    public static /* synthetic */ PregnancySettingsDto copy$default(PregnancySettingsDto pregnancySettingsDto, String str, String str2, PregnancyToggleDto pregnancyToggleDto, DueDateDto dueDateDto, PrivacyDto privacyDto, DueDateOptionsDto dueDateOptionsDto, ExitDialogDto exitDialogDto, PreviousPregnanciesSectionDto previousPregnanciesSectionDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pregnancySettingsDto.screenTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = pregnancySettingsDto.betaTag;
        }
        if ((i13 & 4) != 0) {
            pregnancyToggleDto = pregnancySettingsDto.pregnancyToggle;
        }
        if ((i13 & 8) != 0) {
            dueDateDto = pregnancySettingsDto.dueDate;
        }
        if ((i13 & 16) != 0) {
            privacyDto = pregnancySettingsDto.privacy;
        }
        if ((i13 & 32) != 0) {
            dueDateOptionsDto = pregnancySettingsDto.dueDateOptions;
        }
        if ((i13 & 64) != 0) {
            exitDialogDto = pregnancySettingsDto.exitDialog;
        }
        if ((i13 & 128) != 0) {
            previousPregnanciesSectionDto = pregnancySettingsDto.previousPregnanciesSection;
        }
        ExitDialogDto exitDialogDto2 = exitDialogDto;
        PreviousPregnanciesSectionDto previousPregnanciesSectionDto2 = previousPregnanciesSectionDto;
        PrivacyDto privacyDto2 = privacyDto;
        DueDateOptionsDto dueDateOptionsDto2 = dueDateOptionsDto;
        return pregnancySettingsDto.copy(str, str2, pregnancyToggleDto, dueDateDto, privacyDto2, dueDateOptionsDto2, exitDialogDto2, previousPregnanciesSectionDto2);
    }

    @InterfaceC37143h("beta_display")
    public static /* synthetic */ void getBetaTag$annotations() {
    }

    @InterfaceC37143h("due_date_drawer")
    public static /* synthetic */ void getDueDateOptions$annotations() {
    }

    @InterfaceC37143h("exit_dialogue")
    public static /* synthetic */ void getExitDialog$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getScreenTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$pregnancy_release(PregnancySettingsDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.screenTitle);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.betaTag);
        output.encodeSerializableElement(serialDesc, 2, PregnancyToggleDto$$serializer.INSTANCE, self.pregnancyToggle);
        output.encodeSerializableElement(serialDesc, 3, DueDateDto$$serializer.INSTANCE, self.dueDate);
        output.encodeSerializableElement(serialDesc, 4, PrivacyDto$$serializer.INSTANCE, self.privacy);
        output.encodeSerializableElement(serialDesc, 5, DueDateOptionsDto$$serializer.INSTANCE, self.dueDateOptions);
        output.encodeSerializableElement(serialDesc, 6, ExitDialogDto$$serializer.INSTANCE, self.exitDialog);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.previousPregnanciesSection == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, PreviousPregnanciesSectionDto$$serializer.INSTANCE, self.previousPregnanciesSection);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBetaTag() {
        return this.betaTag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PregnancyToggleDto getPregnancyToggle() {
        return this.pregnancyToggle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DueDateDto getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PrivacyDto getPrivacy() {
        return this.privacy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DueDateOptionsDto getDueDateOptions() {
        return this.dueDateOptions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ExitDialogDto getExitDialog() {
        return this.exitDialog;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PreviousPregnanciesSectionDto getPreviousPregnanciesSection() {
        return this.previousPregnanciesSection;
    }

    public final PregnancySettingsDto copy(String screenTitle, String betaTag, PregnancyToggleDto pregnancyToggle, DueDateDto dueDate, PrivacyDto privacy, DueDateOptionsDto dueDateOptions, ExitDialogDto exitDialog, PreviousPregnanciesSectionDto previousPregnanciesSection) {
        AbstractC22676k.m65750j(screenTitle, "screenTitle");
        AbstractC22676k.m65750j(pregnancyToggle, "pregnancyToggle");
        AbstractC22676k.m65750j(dueDate, "dueDate");
        AbstractC22676k.m65750j(privacy, "privacy");
        AbstractC22676k.m65750j(dueDateOptions, "dueDateOptions");
        AbstractC22676k.m65750j(exitDialog, "exitDialog");
        return new PregnancySettingsDto(screenTitle, betaTag, pregnancyToggle, dueDate, privacy, dueDateOptions, exitDialog, previousPregnanciesSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregnancySettingsDto)) {
            return false;
        }
        PregnancySettingsDto pregnancySettingsDto = (PregnancySettingsDto) other;
        return AbstractC22676k.m65745e(this.screenTitle, pregnancySettingsDto.screenTitle) && AbstractC22676k.m65745e(this.betaTag, pregnancySettingsDto.betaTag) && AbstractC22676k.m65745e(this.pregnancyToggle, pregnancySettingsDto.pregnancyToggle) && AbstractC22676k.m65745e(this.dueDate, pregnancySettingsDto.dueDate) && AbstractC22676k.m65745e(this.privacy, pregnancySettingsDto.privacy) && AbstractC22676k.m65745e(this.dueDateOptions, pregnancySettingsDto.dueDateOptions) && AbstractC22676k.m65745e(this.exitDialog, pregnancySettingsDto.exitDialog) && AbstractC22676k.m65745e(this.previousPregnanciesSection, pregnancySettingsDto.previousPregnanciesSection);
    }

    public final String getBetaTag() {
        return this.betaTag;
    }

    public final DueDateDto getDueDate() {
        return this.dueDate;
    }

    public final DueDateOptionsDto getDueDateOptions() {
        return this.dueDateOptions;
    }

    public final ExitDialogDto getExitDialog() {
        return this.exitDialog;
    }

    public final PregnancyToggleDto getPregnancyToggle() {
        return this.pregnancyToggle;
    }

    public final PreviousPregnanciesSectionDto getPreviousPregnanciesSection() {
        return this.previousPregnanciesSection;
    }

    public final PrivacyDto getPrivacy() {
        return this.privacy;
    }

    public final String getScreenTitle() {
        return this.screenTitle;
    }

    public int hashCode() {
        int iHashCode = this.screenTitle.hashCode() * 31;
        String str = this.betaTag;
        int iHashCode2 = (this.exitDialog.hashCode() + ((this.dueDateOptions.hashCode() + ((this.privacy.hashCode() + ((this.dueDate.hashCode() + ((this.pregnancyToggle.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        PreviousPregnanciesSectionDto previousPregnanciesSectionDto = this.previousPregnanciesSection;
        return iHashCode2 + (previousPregnanciesSectionDto != null ? previousPregnanciesSectionDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.screenTitle;
        String str2 = this.betaTag;
        PregnancyToggleDto pregnancyToggleDto = this.pregnancyToggle;
        DueDateDto dueDateDto = this.dueDate;
        PrivacyDto privacyDto = this.privacy;
        DueDateOptionsDto dueDateOptionsDto = this.dueDateOptions;
        ExitDialogDto exitDialogDto = this.exitDialog;
        PreviousPregnanciesSectionDto previousPregnanciesSectionDto = this.previousPregnanciesSection;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PregnancySettingsDto(screenTitle=", str, ", betaTag=", str2, ", pregnancyToggle=");
        sbM32001t.append(pregnancyToggleDto);
        sbM32001t.append(", dueDate=");
        sbM32001t.append(dueDateDto);
        sbM32001t.append(", privacy=");
        sbM32001t.append(privacyDto);
        sbM32001t.append(", dueDateOptions=");
        sbM32001t.append(dueDateOptionsDto);
        sbM32001t.append(", exitDialog=");
        sbM32001t.append(exitDialogDto);
        sbM32001t.append(", previousPregnanciesSection=");
        sbM32001t.append(previousPregnanciesSectionDto);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PregnancySettingsDto(String screenTitle, String str, PregnancyToggleDto pregnancyToggle, DueDateDto dueDate, PrivacyDto privacy, DueDateOptionsDto dueDateOptions, ExitDialogDto exitDialog, PreviousPregnanciesSectionDto previousPregnanciesSectionDto) {
        AbstractC22676k.m65750j(screenTitle, "screenTitle");
        AbstractC22676k.m65750j(pregnancyToggle, "pregnancyToggle");
        AbstractC22676k.m65750j(dueDate, "dueDate");
        AbstractC22676k.m65750j(privacy, "privacy");
        AbstractC22676k.m65750j(dueDateOptions, "dueDateOptions");
        AbstractC22676k.m65750j(exitDialog, "exitDialog");
        this.screenTitle = screenTitle;
        this.betaTag = str;
        this.pregnancyToggle = pregnancyToggle;
        this.dueDate = dueDate;
        this.privacy = privacy;
        this.dueDateOptions = dueDateOptions;
        this.exitDialog = exitDialog;
        this.previousPregnanciesSection = previousPregnanciesSectionDto;
    }

    public /* synthetic */ PregnancySettingsDto(String str, String str2, PregnancyToggleDto pregnancyToggleDto, DueDateDto dueDateDto, PrivacyDto privacyDto, DueDateOptionsDto dueDateOptionsDto, ExitDialogDto exitDialogDto, PreviousPregnanciesSectionDto previousPregnanciesSectionDto, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, pregnancyToggleDto, dueDateDto, privacyDto, dueDateOptionsDto, exitDialogDto, (i13 & 128) != 0 ? null : previousPregnanciesSectionDto);
    }
}
