package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010 ¨\u00066"}, m65681d2 = {"Lcom/whoop/design/models/items/RecoveryGaugeModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "scoreDisplay", "", "gaugeFillPercentage", "", "recoveryLevel", "gaugeType", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/RecoveryGaugeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()F", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLjava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/RecoveryGaugeModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getScoreDisplay", "F", "getGaugeFillPercentage", "Ljava/lang/String;", "getRecoveryLevel", "getGaugeType", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecoveryGaugeModel implements DesignSystemModel {
    private final float gaugeFillPercentage;
    private final String gaugeType;
    private final String recoveryLevel;
    private final TextResource scoreDisplay;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/RecoveryGaugeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/RecoveryGaugeModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecoveryGaugeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RecoveryGaugeModel() {
        this((TextResource) null, (TextResource) null, 0.0f, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RecoveryGaugeModel copy$default(RecoveryGaugeModel recoveryGaugeModel, TextResource textResource, TextResource textResource2, float f13, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = recoveryGaugeModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = recoveryGaugeModel.scoreDisplay;
        }
        if ((i13 & 4) != 0) {
            f13 = recoveryGaugeModel.gaugeFillPercentage;
        }
        if ((i13 & 8) != 0) {
            str = recoveryGaugeModel.recoveryLevel;
        }
        if ((i13 & 16) != 0) {
            str2 = recoveryGaugeModel.gaugeType;
        }
        String str3 = str2;
        float f14 = f13;
        return recoveryGaugeModel.copy(textResource, textResource2, f14, str, str3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RecoveryGaugeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.scoreDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.scoreDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Float.compare(self.gaugeFillPercentage, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 2, self.gaugeFillPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.recoveryLevel, "")) {
            output.encodeStringElement(serialDesc, 3, self.recoveryLevel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && AbstractC22676k.m65745e(self.gaugeType, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 4, self.gaugeType);
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
    public final String getRecoveryLevel() {
        return this.recoveryLevel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGaugeType() {
        return this.gaugeType;
    }

    public final RecoveryGaugeModel copy(TextResource title, TextResource scoreDisplay, float gaugeFillPercentage, String recoveryLevel, String gaugeType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(recoveryLevel, "recoveryLevel");
        AbstractC22676k.m65750j(gaugeType, "gaugeType");
        return new RecoveryGaugeModel(title, scoreDisplay, gaugeFillPercentage, recoveryLevel, gaugeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecoveryGaugeModel)) {
            return false;
        }
        RecoveryGaugeModel recoveryGaugeModel = (RecoveryGaugeModel) other;
        return AbstractC22676k.m65745e(this.title, recoveryGaugeModel.title) && AbstractC22676k.m65745e(this.scoreDisplay, recoveryGaugeModel.scoreDisplay) && Float.compare(this.gaugeFillPercentage, recoveryGaugeModel.gaugeFillPercentage) == 0 && AbstractC22676k.m65745e(this.recoveryLevel, recoveryGaugeModel.recoveryLevel) && AbstractC22676k.m65745e(this.gaugeType, recoveryGaugeModel.gaugeType);
    }

    public final float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    public final String getGaugeType() {
        return this.gaugeType;
    }

    public final String getRecoveryLevel() {
        return this.recoveryLevel;
    }

    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.gaugeType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.gaugeFillPercentage, AbstractC31061c.m95625a(this.title.hashCode() * 31, this.scoreDisplay, 31), 31), 31, this.recoveryLevel);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.scoreDisplay;
        float f13 = this.gaugeFillPercentage;
        String str = this.recoveryLevel;
        String str2 = this.gaugeType;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("RecoveryGaugeModel(title=", textResource, ", scoreDisplay=", textResource2, ", gaugeFillPercentage=");
        sbM106658q.append(f13);
        sbM106658q.append(", recoveryLevel=");
        sbM106658q.append(str);
        sbM106658q.append(", gaugeType=");
        return AbstractC25012a.m73376i(str2, ")", sbM106658q);
    }

    public /* synthetic */ RecoveryGaugeModel(int i13, TextResource textResource, TextResource textResource2, float f13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.recoveryLevel = "";
        } else {
            this.recoveryLevel = str;
        }
        if ((i13 & 16) == 0) {
            this.gaugeType = "";
        } else {
            this.gaugeType = str2;
        }
    }

    public RecoveryGaugeModel(TextResource title, TextResource scoreDisplay, float f13, String recoveryLevel, String gaugeType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(recoveryLevel, "recoveryLevel");
        AbstractC22676k.m65750j(gaugeType, "gaugeType");
        this.title = title;
        this.scoreDisplay = scoreDisplay;
        this.gaugeFillPercentage = f13;
        this.recoveryLevel = recoveryLevel;
        this.gaugeType = gaugeType;
    }

    public /* synthetic */ RecoveryGaugeModel(TextResource textResource, TextResource textResource2, float f13, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? 0.0f : f13, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? "" : str2);
    }
}
