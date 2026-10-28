package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b3\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b4\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b5\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b6\u0010\u001f¨\u00069"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/DualBarStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;", "leftBar", "rightBar", "", "footerText", "footerSubText", "name", "theme", "themeVariant", "<init>", "(Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/user/journey/model/yearinreview/VerticalBarModel;Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/DualBarStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "copy", "(Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/DualBarStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;", "getLeftBar", "getRightBar", "Ljava/lang/String;", "getFooterText", "getFooterSubText", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DualBarStep implements UserJourneyStep {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String footerSubText;
    private final String footerText;
    private final VerticalBarModel leftBar;
    private final String name;
    private final VerticalBarModel rightBar;
    private final String theme;
    private final String themeVariant;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/DualBarStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/DualBarStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DualBarStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DualBarStep(int i13, VerticalBarModel verticalBarModel, VerticalBarModel verticalBarModel2, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, DualBarStep$$serializer.INSTANCE.getDescriptor());
        }
        this.leftBar = verticalBarModel;
        this.rightBar = verticalBarModel2;
        this.footerText = str;
        this.footerSubText = str2;
        this.name = str3;
        this.theme = str4;
        this.themeVariant = str5;
    }

    public static /* synthetic */ DualBarStep copy$default(DualBarStep dualBarStep, VerticalBarModel verticalBarModel, VerticalBarModel verticalBarModel2, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            verticalBarModel = dualBarStep.leftBar;
        }
        if ((i13 & 2) != 0) {
            verticalBarModel2 = dualBarStep.rightBar;
        }
        if ((i13 & 4) != 0) {
            str = dualBarStep.footerText;
        }
        if ((i13 & 8) != 0) {
            str2 = dualBarStep.footerSubText;
        }
        if ((i13 & 16) != 0) {
            str3 = dualBarStep.name;
        }
        if ((i13 & 32) != 0) {
            str4 = dualBarStep.theme;
        }
        if ((i13 & 64) != 0) {
            str5 = dualBarStep.themeVariant;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return dualBarStep.copy(verticalBarModel, verticalBarModel2, str9, str2, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(DualBarStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        VerticalBarModel$$serializer verticalBarModel$$serializer = VerticalBarModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, verticalBarModel$$serializer, self.leftBar);
        output.encodeSerializableElement(serialDesc, 1, verticalBarModel$$serializer, self.rightBar);
        output.encodeStringElement(serialDesc, 2, self.footerText);
        output.encodeStringElement(serialDesc, 3, self.footerSubText);
        output.encodeStringElement(serialDesc, 4, self.name);
        output.encodeStringElement(serialDesc, 5, self.theme);
        output.encodeStringElement(serialDesc, 6, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VerticalBarModel getLeftBar() {
        return this.leftBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VerticalBarModel getRightBar() {
        return this.rightBar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFooterSubText() {
        return this.footerSubText;
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

    public final DualBarStep copy(VerticalBarModel leftBar, VerticalBarModel rightBar, String footerText, String footerSubText, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(leftBar, "leftBar");
        AbstractC22676k.m65750j(rightBar, "rightBar");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new DualBarStep(leftBar, rightBar, footerText, footerSubText, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DualBarStep)) {
            return false;
        }
        DualBarStep dualBarStep = (DualBarStep) other;
        return AbstractC22676k.m65745e(this.leftBar, dualBarStep.leftBar) && AbstractC22676k.m65745e(this.rightBar, dualBarStep.rightBar) && AbstractC22676k.m65745e(this.footerText, dualBarStep.footerText) && AbstractC22676k.m65745e(this.footerSubText, dualBarStep.footerSubText) && AbstractC22676k.m65745e(this.name, dualBarStep.name) && AbstractC22676k.m65745e(this.theme, dualBarStep.theme) && AbstractC22676k.m65745e(this.themeVariant, dualBarStep.themeVariant);
    }

    public final String getFooterSubText() {
        return this.footerSubText;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final VerticalBarModel getLeftBar() {
        return this.leftBar;
    }

    public final String getName() {
        return this.name;
    }

    public final VerticalBarModel getRightBar() {
        return this.rightBar;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public int hashCode() {
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.rightBar.hashCode() + (this.leftBar.hashCode() * 31)) * 31, 31, this.footerText), 31, this.footerSubText), 31, this.name), 31, this.theme);
    }

    public String toString() {
        VerticalBarModel verticalBarModel = this.leftBar;
        VerticalBarModel verticalBarModel2 = this.rightBar;
        String str = this.footerText;
        String str2 = this.footerSubText;
        String str3 = this.name;
        String str4 = this.theme;
        String str5 = this.themeVariant;
        StringBuilder sb4 = new StringBuilder("DualBarStep(leftBar=");
        sb4.append(verticalBarModel);
        sb4.append(", rightBar=");
        sb4.append(verticalBarModel2);
        sb4.append(", footerText=");
        AbstractC11266d.m30444B(sb4, str, ", footerSubText=", str2, ", name=");
        AbstractC11266d.m30444B(sb4, str3, ", theme=", str4, ", themeVariant=");
        return AbstractC25012a.m73376i(str5, ")", sb4);
    }

    public DualBarStep(VerticalBarModel leftBar, VerticalBarModel rightBar, String footerText, String footerSubText, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(leftBar, "leftBar");
        AbstractC22676k.m65750j(rightBar, "rightBar");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.leftBar = leftBar;
        this.rightBar = rightBar;
        this.footerText = footerText;
        this.footerSubText = footerSubText;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }
}
