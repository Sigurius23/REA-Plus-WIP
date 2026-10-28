package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J^\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b\b\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b;\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010)¨\u0006@"}, m65681d2 = {"Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "percentValue", "centerSubtitle", "", "isPreview", "Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;", "center", "centerImageUrl", "Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;", "footer", "<init>", "(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()F", "component3", "component4", "()Z", "component5", "()Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;", "component6", "component7", "()Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;", "copy", "(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;)Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "F", "getPercentValue", "getCenterSubtitle", "Z", "Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;", "getCenter", "getCenterImageUrl", "Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;", "getFooter", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChallengeProgressGaugeModel implements DesignSystemModel {
    private final ChallengeProgressGaugeCenterModel center;
    private final String centerImageUrl;
    private final String centerSubtitle;
    private final ChallengeProgressGaugeFooterModel footer;
    private final String id;
    private final boolean isPreview;
    private final float percentValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ChallengeProgressGaugeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChallengeProgressGaugeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ChallengeProgressGaugeModel() {
        this((String) null, 0.0f, (String) null, false, (ChallengeProgressGaugeCenterModel) null, (String) null, (ChallengeProgressGaugeFooterModel) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ChallengeProgressGaugeModel copy$default(ChallengeProgressGaugeModel challengeProgressGaugeModel, String str, float f13, String str2, boolean z4, ChallengeProgressGaugeCenterModel challengeProgressGaugeCenterModel, String str3, ChallengeProgressGaugeFooterModel challengeProgressGaugeFooterModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = challengeProgressGaugeModel.id;
        }
        if ((i13 & 2) != 0) {
            f13 = challengeProgressGaugeModel.percentValue;
        }
        if ((i13 & 4) != 0) {
            str2 = challengeProgressGaugeModel.centerSubtitle;
        }
        if ((i13 & 8) != 0) {
            z4 = challengeProgressGaugeModel.isPreview;
        }
        if ((i13 & 16) != 0) {
            challengeProgressGaugeCenterModel = challengeProgressGaugeModel.center;
        }
        if ((i13 & 32) != 0) {
            str3 = challengeProgressGaugeModel.centerImageUrl;
        }
        if ((i13 & 64) != 0) {
            challengeProgressGaugeFooterModel = challengeProgressGaugeModel.footer;
        }
        String str4 = str3;
        ChallengeProgressGaugeFooterModel challengeProgressGaugeFooterModel2 = challengeProgressGaugeFooterModel;
        ChallengeProgressGaugeCenterModel challengeProgressGaugeCenterModel2 = challengeProgressGaugeCenterModel;
        String str5 = str2;
        return challengeProgressGaugeModel.copy(str, f13, str5, z4, challengeProgressGaugeCenterModel2, str4, challengeProgressGaugeFooterModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ChallengeProgressGaugeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Float.compare(self.percentValue, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 1, self.percentValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.centerSubtitle, "")) {
            output.encodeStringElement(serialDesc, 2, self.centerSubtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.isPreview) {
            output.encodeBooleanElement(serialDesc, 3, self.isPreview);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.center != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, ChallengeProgressGaugeCenterModel$$serializer.INSTANCE, self.center);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.centerImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.centerImageUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.footer == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, ChallengeProgressGaugeFooterModel$$serializer.INSTANCE, self.footer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getPercentValue() {
        return this.percentValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCenterSubtitle() {
        return this.centerSubtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsPreview() {
        return this.isPreview;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChallengeProgressGaugeCenterModel getCenter() {
        return this.center;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCenterImageUrl() {
        return this.centerImageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ChallengeProgressGaugeFooterModel getFooter() {
        return this.footer;
    }

    public final ChallengeProgressGaugeModel copy(String id4, float percentValue, String centerSubtitle, boolean isPreview, ChallengeProgressGaugeCenterModel center, String centerImageUrl, ChallengeProgressGaugeFooterModel footer) {
        AbstractC22676k.m65750j(centerSubtitle, "centerSubtitle");
        return new ChallengeProgressGaugeModel(id4, percentValue, centerSubtitle, isPreview, center, centerImageUrl, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeProgressGaugeModel)) {
            return false;
        }
        ChallengeProgressGaugeModel challengeProgressGaugeModel = (ChallengeProgressGaugeModel) other;
        return AbstractC22676k.m65745e(this.id, challengeProgressGaugeModel.id) && Float.compare(this.percentValue, challengeProgressGaugeModel.percentValue) == 0 && AbstractC22676k.m65745e(this.centerSubtitle, challengeProgressGaugeModel.centerSubtitle) && this.isPreview == challengeProgressGaugeModel.isPreview && AbstractC22676k.m65745e(this.center, challengeProgressGaugeModel.center) && AbstractC22676k.m65745e(this.centerImageUrl, challengeProgressGaugeModel.centerImageUrl) && AbstractC22676k.m65745e(this.footer, challengeProgressGaugeModel.footer);
    }

    public final ChallengeProgressGaugeCenterModel getCenter() {
        return this.center;
    }

    public final String getCenterImageUrl() {
        return this.centerImageUrl;
    }

    public final String getCenterSubtitle() {
        return this.centerSubtitle;
    }

    public final ChallengeProgressGaugeFooterModel getFooter() {
        return this.footer;
    }

    public final String getId() {
        return this.id;
    }

    public final float getPercentValue() {
        return this.percentValue;
    }

    public int hashCode() {
        String str = this.id;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.percentValue, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.centerSubtitle), 31, this.isPreview);
        ChallengeProgressGaugeCenterModel challengeProgressGaugeCenterModel = this.center;
        int iHashCode = (iM8289b + (challengeProgressGaugeCenterModel == null ? 0 : challengeProgressGaugeCenterModel.hashCode())) * 31;
        String str2 = this.centerImageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChallengeProgressGaugeFooterModel challengeProgressGaugeFooterModel = this.footer;
        return iHashCode2 + (challengeProgressGaugeFooterModel != null ? challengeProgressGaugeFooterModel.hashCode() : 0);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public String toString() {
        String str = this.id;
        float f13 = this.percentValue;
        String str2 = this.centerSubtitle;
        boolean z4 = this.isPreview;
        ChallengeProgressGaugeCenterModel challengeProgressGaugeCenterModel = this.center;
        String str3 = this.centerImageUrl;
        ChallengeProgressGaugeFooterModel challengeProgressGaugeFooterModel = this.footer;
        StringBuilder sb4 = new StringBuilder("ChallengeProgressGaugeModel(id=");
        sb4.append(str);
        sb4.append(", percentValue=");
        sb4.append(f13);
        sb4.append(", centerSubtitle=");
        AbstractC38963t7.m124390t(sb4, str2, ", isPreview=", z4, ", center=");
        sb4.append(challengeProgressGaugeCenterModel);
        sb4.append(", centerImageUrl=");
        sb4.append(str3);
        sb4.append(", footer=");
        sb4.append(challengeProgressGaugeFooterModel);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ ChallengeProgressGaugeModel(int i13, String str, float f13, String str2, boolean z4, ChallengeProgressGaugeCenterModel challengeProgressGaugeCenterModel, String str3, ChallengeProgressGaugeFooterModel challengeProgressGaugeFooterModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.percentValue = 0.0f;
        } else {
            this.percentValue = f13;
        }
        if ((i13 & 4) == 0) {
            this.centerSubtitle = "";
        } else {
            this.centerSubtitle = str2;
        }
        if ((i13 & 8) == 0) {
            this.isPreview = false;
        } else {
            this.isPreview = z4;
        }
        if ((i13 & 16) == 0) {
            this.center = null;
        } else {
            this.center = challengeProgressGaugeCenterModel;
        }
        if ((i13 & 32) == 0) {
            this.centerImageUrl = null;
        } else {
            this.centerImageUrl = str3;
        }
        if ((i13 & 64) == 0) {
            this.footer = null;
        } else {
            this.footer = challengeProgressGaugeFooterModel;
        }
    }

    public ChallengeProgressGaugeModel(String str, float f13, String centerSubtitle, boolean z4, ChallengeProgressGaugeCenterModel challengeProgressGaugeCenterModel, String str2, ChallengeProgressGaugeFooterModel challengeProgressGaugeFooterModel) {
        AbstractC22676k.m65750j(centerSubtitle, "centerSubtitle");
        this.id = str;
        this.percentValue = f13;
        this.centerSubtitle = centerSubtitle;
        this.isPreview = z4;
        this.center = challengeProgressGaugeCenterModel;
        this.centerImageUrl = str2;
        this.footer = challengeProgressGaugeFooterModel;
    }

    public /* synthetic */ ChallengeProgressGaugeModel(String str, float f13, String str2, boolean z4, ChallengeProgressGaugeCenterModel challengeProgressGaugeCenterModel, String str3, ChallengeProgressGaugeFooterModel challengeProgressGaugeFooterModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? 0.0f : f13, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : challengeProgressGaugeCenterModel, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : challengeProgressGaugeFooterModel);
    }
}
