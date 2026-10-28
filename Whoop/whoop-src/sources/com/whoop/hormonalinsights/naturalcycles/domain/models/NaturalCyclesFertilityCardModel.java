package com.whoop.hormonalinsights.naturalcycles.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JZ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%¨\u0006="}, m65681d2 = {"Lcom/whoop/hormonalinsights/naturalcycles/domain/models/NaturalCyclesFertilityCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "cardTitle", "icon", "title", "subtitle", "description", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/naturalcycles/domain/models/NaturalCyclesFertilityCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/design/models/items/ImpactModel;", "component7", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/hormonalinsights/naturalcycles/domain/models/NaturalCyclesFertilityCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardTitle", "getIcon", "getTitle", "getSubtitle", "getDescription", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "a", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NaturalCyclesFertilityCardModel implements DesignSystemModel {
    private final String cardTitle;
    private final String description;
    private final String icon;
    private final GenericInteraction interaction;
    private final String subtitle;
    private final String title;
    private final ImpactModel trend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable | ImpactModel.$stable;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.naturalcycles.domain.models.NaturalCyclesFertilityCardModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/naturalcycles/domain/models/NaturalCyclesFertilityCardModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/naturalcycles/domain/models/NaturalCyclesFertilityCardModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NaturalCyclesFertilityCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NaturalCyclesFertilityCardModel(int i13, String str, String str2, String str3, String str4, String str5, ImpactModel impactModel, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, NaturalCyclesFertilityCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.cardTitle = str;
        this.icon = str2;
        this.title = str3;
        this.subtitle = str4;
        this.description = str5;
        this.trend = impactModel;
        this.interaction = genericInteraction;
    }

    public static /* synthetic */ NaturalCyclesFertilityCardModel copy$default(NaturalCyclesFertilityCardModel naturalCyclesFertilityCardModel, String str, String str2, String str3, String str4, String str5, ImpactModel impactModel, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = naturalCyclesFertilityCardModel.cardTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = naturalCyclesFertilityCardModel.icon;
        }
        if ((i13 & 4) != 0) {
            str3 = naturalCyclesFertilityCardModel.title;
        }
        if ((i13 & 8) != 0) {
            str4 = naturalCyclesFertilityCardModel.subtitle;
        }
        if ((i13 & 16) != 0) {
            str5 = naturalCyclesFertilityCardModel.description;
        }
        if ((i13 & 32) != 0) {
            impactModel = naturalCyclesFertilityCardModel.trend;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = naturalCyclesFertilityCardModel.interaction;
        }
        ImpactModel impactModel2 = impactModel;
        GenericInteraction genericInteraction2 = genericInteraction;
        String str6 = str5;
        String str7 = str3;
        return naturalCyclesFertilityCardModel.copy(str, str2, str7, str4, str6, impactModel2, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(NaturalCyclesFertilityCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.cardTitle);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subtitle);
        output.encodeStringElement(serialDesc, 4, self.description);
        output.encodeNullableSerializableElement(serialDesc, 5, ImpactModel$$serializer.INSTANCE, self.trend);
        output.encodeSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final NaturalCyclesFertilityCardModel copy(String cardTitle, String icon, String title, String subtitle, String description, ImpactModel trend, GenericInteraction interaction) {
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(interaction, "interaction");
        return new NaturalCyclesFertilityCardModel(cardTitle, icon, title, subtitle, description, trend, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaturalCyclesFertilityCardModel)) {
            return false;
        }
        NaturalCyclesFertilityCardModel naturalCyclesFertilityCardModel = (NaturalCyclesFertilityCardModel) other;
        return AbstractC22676k.m65745e(this.cardTitle, naturalCyclesFertilityCardModel.cardTitle) && AbstractC22676k.m65745e(this.icon, naturalCyclesFertilityCardModel.icon) && AbstractC22676k.m65745e(this.title, naturalCyclesFertilityCardModel.title) && AbstractC22676k.m65745e(this.subtitle, naturalCyclesFertilityCardModel.subtitle) && AbstractC22676k.m65745e(this.description, naturalCyclesFertilityCardModel.description) && AbstractC22676k.m65745e(this.trend, naturalCyclesFertilityCardModel.trend) && AbstractC22676k.m65745e(this.interaction, naturalCyclesFertilityCardModel.interaction);
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.cardTitle.hashCode() * 31, 31, this.icon), 31, this.title);
        String str = this.subtitle;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.description);
        ImpactModel impactModel = this.trend;
        return this.interaction.hashCode() + ((iM30450d2 + (impactModel != null ? impactModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.cardTitle;
        String str2 = this.icon;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.description;
        ImpactModel impactModel = this.trend;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NaturalCyclesFertilityCardModel(cardTitle=", str, ", icon=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", description=");
        sbM32001t.append(str5);
        sbM32001t.append(", trend=");
        sbM32001t.append(impactModel);
        sbM32001t.append(", interaction=");
        return AbstractC26725a.m79506j(sbM32001t, genericInteraction, ")");
    }

    public NaturalCyclesFertilityCardModel(String cardTitle, String icon, String title, String str, String description, ImpactModel impactModel, GenericInteraction interaction) {
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(interaction, "interaction");
        this.cardTitle = cardTitle;
        this.icon = icon;
        this.title = title;
        this.subtitle = str;
        this.description = description;
        this.trend = impactModel;
        this.interaction = interaction;
    }
}
