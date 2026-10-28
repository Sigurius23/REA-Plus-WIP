package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001a¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/StrainBreakDownModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "cardioPercentDisplay", "cardioTitleDisplay", "", "cardioTotalPercent", "mskPercentDisplay", "mskTitleDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/StrainBreakDownModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()D", "component4", "component5", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/models/items/StrainBreakDownModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getCardioPercentDisplay", "getCardioTitleDisplay", "D", "getCardioTotalPercent", "getMskPercentDisplay", "getMskTitleDisplay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrainBreakDownModel implements DesignSystemModel {
    private final TextResource cardioPercentDisplay;
    private final TextResource cardioTitleDisplay;
    private final double cardioTotalPercent;
    private final TextResource mskPercentDisplay;
    private final TextResource mskTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/StrainBreakDownModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/StrainBreakDownModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrainBreakDownModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrainBreakDownModel(int i13, TextResource textResource, TextResource textResource2, double d3, TextResource textResource3, TextResource textResource4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StrainBreakDownModel$$serializer.INSTANCE.getDescriptor());
        }
        this.cardioPercentDisplay = textResource;
        this.cardioTitleDisplay = textResource2;
        this.cardioTotalPercent = d3;
        this.mskPercentDisplay = textResource3;
        this.mskTitleDisplay = textResource4;
    }

    public static /* synthetic */ StrainBreakDownModel copy$default(StrainBreakDownModel strainBreakDownModel, TextResource textResource, TextResource textResource2, double d3, TextResource textResource3, TextResource textResource4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = strainBreakDownModel.cardioPercentDisplay;
        }
        if ((i13 & 2) != 0) {
            textResource2 = strainBreakDownModel.cardioTitleDisplay;
        }
        if ((i13 & 4) != 0) {
            d3 = strainBreakDownModel.cardioTotalPercent;
        }
        if ((i13 & 8) != 0) {
            textResource3 = strainBreakDownModel.mskPercentDisplay;
        }
        if ((i13 & 16) != 0) {
            textResource4 = strainBreakDownModel.mskTitleDisplay;
        }
        double d14 = d3;
        return strainBreakDownModel.copy(textResource, textResource2, d14, textResource3, textResource4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(StrainBreakDownModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.cardioPercentDisplay);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.cardioTitleDisplay);
        output.encodeDoubleElement(serialDesc, 2, self.cardioTotalPercent);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.mskPercentDisplay);
        output.encodeSerializableElement(serialDesc, 4, c25452a, self.mskTitleDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getCardioPercentDisplay() {
        return this.cardioPercentDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getCardioTitleDisplay() {
        return this.cardioTitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getCardioTotalPercent() {
        return this.cardioTotalPercent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getMskPercentDisplay() {
        return this.mskPercentDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getMskTitleDisplay() {
        return this.mskTitleDisplay;
    }

    public final StrainBreakDownModel copy(TextResource cardioPercentDisplay, TextResource cardioTitleDisplay, double cardioTotalPercent, TextResource mskPercentDisplay, TextResource mskTitleDisplay) {
        AbstractC22676k.m65750j(cardioPercentDisplay, "cardioPercentDisplay");
        AbstractC22676k.m65750j(cardioTitleDisplay, "cardioTitleDisplay");
        AbstractC22676k.m65750j(mskPercentDisplay, "mskPercentDisplay");
        AbstractC22676k.m65750j(mskTitleDisplay, "mskTitleDisplay");
        return new StrainBreakDownModel(cardioPercentDisplay, cardioTitleDisplay, cardioTotalPercent, mskPercentDisplay, mskTitleDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrainBreakDownModel)) {
            return false;
        }
        StrainBreakDownModel strainBreakDownModel = (StrainBreakDownModel) other;
        return AbstractC22676k.m65745e(this.cardioPercentDisplay, strainBreakDownModel.cardioPercentDisplay) && AbstractC22676k.m65745e(this.cardioTitleDisplay, strainBreakDownModel.cardioTitleDisplay) && Double.compare(this.cardioTotalPercent, strainBreakDownModel.cardioTotalPercent) == 0 && AbstractC22676k.m65745e(this.mskPercentDisplay, strainBreakDownModel.mskPercentDisplay) && AbstractC22676k.m65745e(this.mskTitleDisplay, strainBreakDownModel.mskTitleDisplay);
    }

    public final TextResource getCardioPercentDisplay() {
        return this.cardioPercentDisplay;
    }

    public final TextResource getCardioTitleDisplay() {
        return this.cardioTitleDisplay;
    }

    public final double getCardioTotalPercent() {
        return this.cardioTotalPercent;
    }

    public final TextResource getMskPercentDisplay() {
        return this.mskPercentDisplay;
    }

    public final TextResource getMskTitleDisplay() {
        return this.mskTitleDisplay;
    }

    public int hashCode() {
        return this.mskTitleDisplay.hashCode() + AbstractC31061c.m95625a(AbstractC17176i.m48499a(AbstractC31061c.m95625a(this.cardioPercentDisplay.hashCode() * 31, this.cardioTitleDisplay, 31), 31, this.cardioTotalPercent), this.mskPercentDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.cardioPercentDisplay;
        TextResource textResource2 = this.cardioTitleDisplay;
        double d3 = this.cardioTotalPercent;
        TextResource textResource3 = this.mskPercentDisplay;
        TextResource textResource4 = this.mskTitleDisplay;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("StrainBreakDownModel(cardioPercentDisplay=", textResource, ", cardioTitleDisplay=", textResource2, ", cardioTotalPercent=");
        sbM106658q.append(d3);
        sbM106658q.append(", mskPercentDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", mskTitleDisplay=");
        sbM106658q.append(textResource4);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public StrainBreakDownModel(TextResource cardioPercentDisplay, TextResource cardioTitleDisplay, double d3, TextResource mskPercentDisplay, TextResource mskTitleDisplay) {
        AbstractC22676k.m65750j(cardioPercentDisplay, "cardioPercentDisplay");
        AbstractC22676k.m65750j(cardioTitleDisplay, "cardioTitleDisplay");
        AbstractC22676k.m65750j(mskPercentDisplay, "mskPercentDisplay");
        AbstractC22676k.m65750j(mskTitleDisplay, "mskTitleDisplay");
        this.cardioPercentDisplay = cardioPercentDisplay;
        this.cardioTitleDisplay = cardioTitleDisplay;
        this.cardioTotalPercent = d3;
        this.mskPercentDisplay = mskPercentDisplay;
        this.mskTitleDisplay = mskTitleDisplay;
    }
}
