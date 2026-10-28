package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyWelcomeScreenDto;", "welcomeScreen", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;", "dueDateScreen", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyWelcomeScreenDto;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyWelcomeScreenDto;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyWelcomeScreenDto;", "component2", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;", "copy", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyWelcomeScreenDto;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyWelcomeScreenDto;", "getWelcomeScreen", "getWelcomeScreen$annotations", "()V", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;", "getDueDateScreen", "getDueDateScreen$annotations", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MciPregnancyOnboardingDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("due_date_screen")
    private final MciPregnancyDueDateScreenDto dueDateScreen;

    @SerializedName("welcome_screen")
    private final MciPregnancyWelcomeScreenDto welcomeScreen;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MciPregnancyOnboardingDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MciPregnancyOnboardingDto(int i13, MciPregnancyWelcomeScreenDto mciPregnancyWelcomeScreenDto, MciPregnancyDueDateScreenDto mciPregnancyDueDateScreenDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, MciPregnancyOnboardingDto$$serializer.INSTANCE.getDescriptor());
        }
        this.welcomeScreen = mciPregnancyWelcomeScreenDto;
        this.dueDateScreen = mciPregnancyDueDateScreenDto;
    }

    public static /* synthetic */ MciPregnancyOnboardingDto copy$default(MciPregnancyOnboardingDto mciPregnancyOnboardingDto, MciPregnancyWelcomeScreenDto mciPregnancyWelcomeScreenDto, MciPregnancyDueDateScreenDto mciPregnancyDueDateScreenDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            mciPregnancyWelcomeScreenDto = mciPregnancyOnboardingDto.welcomeScreen;
        }
        if ((i13 & 2) != 0) {
            mciPregnancyDueDateScreenDto = mciPregnancyOnboardingDto.dueDateScreen;
        }
        return mciPregnancyOnboardingDto.copy(mciPregnancyWelcomeScreenDto, mciPregnancyDueDateScreenDto);
    }

    @InterfaceC37143h("due_date_screen")
    public static /* synthetic */ void getDueDateScreen$annotations() {
    }

    @InterfaceC37143h("welcome_screen")
    public static /* synthetic */ void getWelcomeScreen$annotations() {
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MciPregnancyOnboardingDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, MciPregnancyWelcomeScreenDto$$serializer.INSTANCE, self.welcomeScreen);
        output.encodeSerializableElement(serialDesc, 1, MciPregnancyDueDateScreenDto$$serializer.INSTANCE, self.dueDateScreen);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MciPregnancyWelcomeScreenDto getWelcomeScreen() {
        return this.welcomeScreen;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MciPregnancyDueDateScreenDto getDueDateScreen() {
        return this.dueDateScreen;
    }

    public final MciPregnancyOnboardingDto copy(MciPregnancyWelcomeScreenDto welcomeScreen, MciPregnancyDueDateScreenDto dueDateScreen) {
        AbstractC22676k.m65750j(welcomeScreen, "welcomeScreen");
        AbstractC22676k.m65750j(dueDateScreen, "dueDateScreen");
        return new MciPregnancyOnboardingDto(welcomeScreen, dueDateScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MciPregnancyOnboardingDto)) {
            return false;
        }
        MciPregnancyOnboardingDto mciPregnancyOnboardingDto = (MciPregnancyOnboardingDto) other;
        return AbstractC22676k.m65745e(this.welcomeScreen, mciPregnancyOnboardingDto.welcomeScreen) && AbstractC22676k.m65745e(this.dueDateScreen, mciPregnancyOnboardingDto.dueDateScreen);
    }

    public final MciPregnancyDueDateScreenDto getDueDateScreen() {
        return this.dueDateScreen;
    }

    public final MciPregnancyWelcomeScreenDto getWelcomeScreen() {
        return this.welcomeScreen;
    }

    public int hashCode() {
        return this.dueDateScreen.hashCode() + (this.welcomeScreen.hashCode() * 31);
    }

    public String toString() {
        return "MciPregnancyOnboardingDto(welcomeScreen=" + this.welcomeScreen + ", dueDateScreen=" + this.dueDateScreen + ")";
    }

    public MciPregnancyOnboardingDto(MciPregnancyWelcomeScreenDto welcomeScreen, MciPregnancyDueDateScreenDto dueDateScreen) {
        AbstractC22676k.m65750j(welcomeScreen, "welcomeScreen");
        AbstractC22676k.m65750j(dueDateScreen, "dueDateScreen");
        this.welcomeScreen = welcomeScreen;
        this.dueDateScreen = dueDateScreen;
    }
}
