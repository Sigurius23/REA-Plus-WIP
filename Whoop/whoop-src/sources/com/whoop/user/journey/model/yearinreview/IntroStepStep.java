package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001c¨\u00069"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/IntroStepStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "year", "greetingName", "greetingText", "Lcom/whoop/user/journey/model/yearinreview/FootNoteModel;", "footNote", "name", "theme", "themeVariant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/FootNoteModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/FootNoteModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/IntroStepStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/user/journey/model/yearinreview/FootNoteModel;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/FootNoteModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/IntroStepStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getYear", "getGreetingName", "getGreetingText", "Lcom/whoop/user/journey/model/yearinreview/FootNoteModel;", "getFootNote", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntroStepStep implements UserJourneyStep {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FootNoteModel footNote;
    private final String greetingName;
    private final String greetingText;
    private final String name;
    private final String theme;
    private final String themeVariant;
    private final String year;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/IntroStepStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/IntroStepStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntroStepStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IntroStepStep(int i13, String str, String str2, String str3, FootNoteModel footNoteModel, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, IntroStepStep$$serializer.INSTANCE.getDescriptor());
        }
        this.year = str;
        this.greetingName = str2;
        this.greetingText = str3;
        this.footNote = footNoteModel;
        this.name = str4;
        this.theme = str5;
        this.themeVariant = str6;
    }

    public static /* synthetic */ IntroStepStep copy$default(IntroStepStep introStepStep, String str, String str2, String str3, FootNoteModel footNoteModel, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = introStepStep.year;
        }
        if ((i13 & 2) != 0) {
            str2 = introStepStep.greetingName;
        }
        if ((i13 & 4) != 0) {
            str3 = introStepStep.greetingText;
        }
        if ((i13 & 8) != 0) {
            footNoteModel = introStepStep.footNote;
        }
        if ((i13 & 16) != 0) {
            str4 = introStepStep.name;
        }
        if ((i13 & 32) != 0) {
            str5 = introStepStep.theme;
        }
        if ((i13 & 64) != 0) {
            str6 = introStepStep.themeVariant;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return introStepStep.copy(str, str2, str10, footNoteModel, str9, str7, str8);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(IntroStepStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.year);
        output.encodeStringElement(serialDesc, 1, self.greetingName);
        output.encodeStringElement(serialDesc, 2, self.greetingText);
        output.encodeSerializableElement(serialDesc, 3, FootNoteModel$$serializer.INSTANCE, self.footNote);
        output.encodeStringElement(serialDesc, 4, self.name);
        output.encodeStringElement(serialDesc, 5, self.theme);
        output.encodeStringElement(serialDesc, 6, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGreetingName() {
        return this.greetingName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGreetingText() {
        return this.greetingText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FootNoteModel getFootNote() {
        return this.footNote;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final IntroStepStep copy(String year, String greetingName, String greetingText, FootNoteModel footNote, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(year, "year");
        AbstractC22676k.m65750j(greetingName, "greetingName");
        AbstractC22676k.m65750j(greetingText, "greetingText");
        AbstractC22676k.m65750j(footNote, "footNote");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new IntroStepStep(year, greetingName, greetingText, footNote, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntroStepStep)) {
            return false;
        }
        IntroStepStep introStepStep = (IntroStepStep) other;
        return AbstractC22676k.m65745e(this.year, introStepStep.year) && AbstractC22676k.m65745e(this.greetingName, introStepStep.greetingName) && AbstractC22676k.m65745e(this.greetingText, introStepStep.greetingText) && AbstractC22676k.m65745e(this.footNote, introStepStep.footNote) && AbstractC22676k.m65745e(this.name, introStepStep.name) && AbstractC22676k.m65745e(this.theme, introStepStep.theme) && AbstractC22676k.m65745e(this.themeVariant, introStepStep.themeVariant);
    }

    public final FootNoteModel getFootNote() {
        return this.footNote;
    }

    public final String getGreetingName() {
        return this.greetingName;
    }

    public final String getGreetingText() {
        return this.greetingText;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.footNote.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.year.hashCode() * 31, 31, this.greetingName), 31, this.greetingText)) * 31, 31, this.name), 31, this.theme);
    }

    public String toString() {
        String str = this.year;
        String str2 = this.greetingName;
        String str3 = this.greetingText;
        FootNoteModel footNoteModel = this.footNote;
        String str4 = this.name;
        String str5 = this.theme;
        String str6 = this.themeVariant;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("IntroStepStep(year=", str, ", greetingName=", str2, ", greetingText=");
        sbM32001t.append(str3);
        sbM32001t.append(", footNote=");
        sbM32001t.append(footNoteModel);
        sbM32001t.append(", name=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", theme=", str5, ", themeVariant=");
        return AbstractC25012a.m73376i(str6, ")", sbM32001t);
    }

    public IntroStepStep(String year, String greetingName, String greetingText, FootNoteModel footNote, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(year, "year");
        AbstractC22676k.m65750j(greetingName, "greetingName");
        AbstractC22676k.m65750j(greetingText, "greetingText");
        AbstractC22676k.m65750j(footNote, "footNote");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.year = year;
        this.greetingName = greetingName;
        this.greetingText = greetingText;
        this.footNote = footNote;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }
}
