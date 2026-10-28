package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/StrainGaugeModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "scoreDisplay", "", "gaugeFillPercentage", "", "gaugeType", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/StrainGaugeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()F", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLjava/lang/String;)Lcom/whoop/design/models/items/StrainGaugeModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getScoreDisplay", "F", "getGaugeFillPercentage", "Ljava/lang/String;", "getGaugeType", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrainGaugeModel implements DesignSystemModel {
    private final float gaugeFillPercentage;
    private final String gaugeType;
    private final TextResource scoreDisplay;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/StrainGaugeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/StrainGaugeModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrainGaugeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StrainGaugeModel() {
        this((TextResource) null, (TextResource) null, 0.0f, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StrainGaugeModel copy$default(StrainGaugeModel strainGaugeModel, TextResource textResource, TextResource textResource2, float f13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = strainGaugeModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = strainGaugeModel.scoreDisplay;
        }
        if ((i13 & 4) != 0) {
            f13 = strainGaugeModel.gaugeFillPercentage;
        }
        if ((i13 & 8) != 0) {
            str = strainGaugeModel.gaugeType;
        }
        return strainGaugeModel.copy(textResource, textResource2, f13, str);
    }

    public static final /* synthetic */ void write$Self$design_models_release(StrainGaugeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.scoreDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.scoreDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Float.compare(self.gaugeFillPercentage, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 2, self.gaugeFillPercentage);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.gaugeType, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 3, self.gaugeType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGaugeType() {
        return this.gaugeType;
    }

    public final StrainGaugeModel copy(TextResource title, TextResource scoreDisplay, float gaugeFillPercentage, String gaugeType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(gaugeType, "gaugeType");
        return new StrainGaugeModel(title, scoreDisplay, gaugeFillPercentage, gaugeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrainGaugeModel)) {
            return false;
        }
        StrainGaugeModel strainGaugeModel = (StrainGaugeModel) other;
        return AbstractC22676k.m65745e(this.title, strainGaugeModel.title) && AbstractC22676k.m65745e(this.scoreDisplay, strainGaugeModel.scoreDisplay) && Float.compare(this.gaugeFillPercentage, strainGaugeModel.gaugeFillPercentage) == 0 && AbstractC22676k.m65745e(this.gaugeType, strainGaugeModel.gaugeType);
    }

    public final float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    public final String getGaugeType() {
        return this.gaugeType;
    }

    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.gaugeType.hashCode() + AbstractC11266d.m30447a(this.gaugeFillPercentage, AbstractC31061c.m95625a(this.title.hashCode() * 31, this.scoreDisplay, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.scoreDisplay;
        float f13 = this.gaugeFillPercentage;
        String str = this.gaugeType;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("StrainGaugeModel(title=", textResource, ", scoreDisplay=", textResource2, ", gaugeFillPercentage=");
        sbM106658q.append(f13);
        sbM106658q.append(", gaugeType=");
        sbM106658q.append(str);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ StrainGaugeModel(int i13, TextResource textResource, TextResource textResource2, float f13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.scoreDisplay = AbstractC8693b.m21267a();
        } else {
            this.scoreDisplay = textResource2;
        }
        if ((i13 & 4) == 0) {
            this.gaugeFillPercentage = 0.0f;
        } else {
            this.gaugeFillPercentage = f13;
        }
        if ((i13 & 8) == 0) {
            this.gaugeType = "";
        } else {
            this.gaugeType = str;
        }
    }

    public StrainGaugeModel(TextResource title, TextResource scoreDisplay, float f13, String gaugeType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(gaugeType, "gaugeType");
        this.title = title;
        this.scoreDisplay = scoreDisplay;
        this.gaugeFillPercentage = f13;
        this.gaugeType = gaugeType;
    }

    public /* synthetic */ StrainGaugeModel(TextResource textResource, TextResource textResource2, float f13, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? 0.0f : f13, (i13 & 8) != 0 ? "" : str);
    }
}
