package com.whoop.healthspan.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b2\u0010\u001a¨\u00065"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/HealthspanVowModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "subtitleDisplay", "ctaTextDisplay", "Lcom/whoop/navigation/e;", "destination", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/models/HealthspanVowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/navigation/e;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/HealthspanVowModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getSubtitleDisplay", "getCtaTextDisplay", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "getStyle", "Companion", "$serializer", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthspanVowModel implements DesignSystemModel {
    private final String ctaTextDisplay;
    private final C9598e destination;
    private final String style;
    private final String subtitleDisplay;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15620a(17)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/HealthspanVowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/models/HealthspanVowModel;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthspanVowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthspanVowModel(int i13, String str, String str2, String str3, C9598e c9598e, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, HealthspanVowModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.subtitleDisplay = str2;
        this.ctaTextDisplay = str3;
        this.destination = c9598e;
        this.style = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ HealthspanVowModel copy$default(HealthspanVowModel healthspanVowModel, String str, String str2, String str3, C9598e c9598e, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthspanVowModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = healthspanVowModel.subtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = healthspanVowModel.ctaTextDisplay;
        }
        if ((i13 & 8) != 0) {
            c9598e = healthspanVowModel.destination;
        }
        if ((i13 & 16) != 0) {
            str4 = healthspanVowModel.style;
        }
        String str5 = str4;
        String str6 = str3;
        return healthspanVowModel.copy(str, str2, str6, c9598e, str5);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$healthspan_release(HealthspanVowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.subtitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.ctaTextDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.destination);
        output.encodeStringElement(serialDesc, 4, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final HealthspanVowModel copy(String titleDisplay, String subtitleDisplay, String ctaTextDisplay, C9598e destination, String style) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(style, "style");
        return new HealthspanVowModel(titleDisplay, subtitleDisplay, ctaTextDisplay, destination, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthspanVowModel)) {
            return false;
        }
        HealthspanVowModel healthspanVowModel = (HealthspanVowModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, healthspanVowModel.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, healthspanVowModel.subtitleDisplay) && AbstractC22676k.m65745e(this.ctaTextDisplay, healthspanVowModel.ctaTextDisplay) && AbstractC22676k.m65745e(this.destination, healthspanVowModel.destination) && AbstractC22676k.m65745e(this.style, healthspanVowModel.style);
    }

    public final String getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.subtitleDisplay);
        String str = this.ctaTextDisplay;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return this.style.hashCode() + ((iHashCode + (c9598e != null ? c9598e.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.subtitleDisplay;
        String str3 = this.ctaTextDisplay;
        C9598e c9598e = this.destination;
        String str4 = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthspanVowModel(titleDisplay=", str, ", subtitleDisplay=", str2, ", ctaTextDisplay=");
        AbstractC30007c.m91827B(sbM32001t, str3, ", destination=", c9598e, ", style=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public HealthspanVowModel(String titleDisplay, String subtitleDisplay, String str, C9598e c9598e, String style) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = subtitleDisplay;
        this.ctaTextDisplay = str;
        this.destination = c9598e;
        this.style = style;
    }
}
