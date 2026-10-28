package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36954a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jn\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, m65681d2 = {"Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;", "", "", "titleDisplay", "Lcom/whoop/design/models/items/ImpactStyle;", "impactStyle", "Lcom/whoop/design/models/items/TileTagModel;", "tileTag", "impactPercentageValue", "impactPercentageSymbol", "subBarLabel", "subBarPercent", "Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "impactBarSegment", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/ImpactStyle;", "component3", "()Lcom/whoop/design/models/items/TileTagModel;", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "Lcom/whoop/design/models/items/ImpactStyle;", "getImpactStyle", "Lcom/whoop/design/models/items/TileTagModel;", "getTileTag", "getImpactPercentageValue", "getImpactPercentageSymbol", "getSubBarLabel", "getSubBarPercent", "Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "getImpactBarSegment", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorDetailsTileImpactCard {
    private final ImpactBarSegmentModel impactBarSegment;
    private final String impactPercentageSymbol;
    private final String impactPercentageValue;
    private final ImpactStyle impactStyle;
    private final String subBarLabel;
    private final String subBarPercent;
    private final TileTagModel tileTag;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36954a(8)), null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorDetailsTileImpactCard$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorDetailsTileImpactCard(int i13, String str, ImpactStyle impactStyle, TileTagModel tileTagModel, String str2, String str3, String str4, String str5, ImpactBarSegmentModel impactBarSegmentModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, BehaviorDetailsTileImpactCard$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.impactStyle = impactStyle;
        this.tileTag = tileTagModel;
        this.impactPercentageValue = str2;
        this.impactPercentageSymbol = str3;
        this.subBarLabel = str4;
        this.subBarPercent = str5;
        this.impactBarSegment = impactBarSegmentModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ImpactStyle", ImpactStyle.values());
    }

    public static /* synthetic */ BehaviorDetailsTileImpactCard copy$default(BehaviorDetailsTileImpactCard behaviorDetailsTileImpactCard, String str, ImpactStyle impactStyle, TileTagModel tileTagModel, String str2, String str3, String str4, String str5, ImpactBarSegmentModel impactBarSegmentModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = behaviorDetailsTileImpactCard.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            impactStyle = behaviorDetailsTileImpactCard.impactStyle;
        }
        if ((i13 & 4) != 0) {
            tileTagModel = behaviorDetailsTileImpactCard.tileTag;
        }
        if ((i13 & 8) != 0) {
            str2 = behaviorDetailsTileImpactCard.impactPercentageValue;
        }
        if ((i13 & 16) != 0) {
            str3 = behaviorDetailsTileImpactCard.impactPercentageSymbol;
        }
        if ((i13 & 32) != 0) {
            str4 = behaviorDetailsTileImpactCard.subBarLabel;
        }
        if ((i13 & 64) != 0) {
            str5 = behaviorDetailsTileImpactCard.subBarPercent;
        }
        if ((i13 & 128) != 0) {
            impactBarSegmentModel = behaviorDetailsTileImpactCard.impactBarSegment;
        }
        String str6 = str5;
        ImpactBarSegmentModel impactBarSegmentModel2 = impactBarSegmentModel;
        String str7 = str3;
        String str8 = str4;
        return behaviorDetailsTileImpactCard.copy(str, impactStyle, tileTagModel, str2, str7, str8, str6, impactBarSegmentModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BehaviorDetailsTileImpactCard self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.impactStyle);
        output.encodeNullableSerializableElement(serialDesc, 2, TileTagModel$$serializer.INSTANCE, self.tileTag);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.impactPercentageValue);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.impactPercentageSymbol);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.subBarLabel);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.subBarPercent);
        output.encodeNullableSerializableElement(serialDesc, 7, ImpactBarSegmentModel$$serializer.INSTANCE, self.impactBarSegment);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImpactStyle getImpactStyle() {
        return this.impactStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TileTagModel getTileTag() {
        return this.tileTag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImpactPercentageValue() {
        return this.impactPercentageValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImpactPercentageSymbol() {
        return this.impactPercentageSymbol;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubBarLabel() {
        return this.subBarLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubBarPercent() {
        return this.subBarPercent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ImpactBarSegmentModel getImpactBarSegment() {
        return this.impactBarSegment;
    }

    public final BehaviorDetailsTileImpactCard copy(String titleDisplay, ImpactStyle impactStyle, TileTagModel tileTag, String impactPercentageValue, String impactPercentageSymbol, String subBarLabel, String subBarPercent, ImpactBarSegmentModel impactBarSegment) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        return new BehaviorDetailsTileImpactCard(titleDisplay, impactStyle, tileTag, impactPercentageValue, impactPercentageSymbol, subBarLabel, subBarPercent, impactBarSegment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorDetailsTileImpactCard)) {
            return false;
        }
        BehaviorDetailsTileImpactCard behaviorDetailsTileImpactCard = (BehaviorDetailsTileImpactCard) other;
        return AbstractC22676k.m65745e(this.titleDisplay, behaviorDetailsTileImpactCard.titleDisplay) && this.impactStyle == behaviorDetailsTileImpactCard.impactStyle && AbstractC22676k.m65745e(this.tileTag, behaviorDetailsTileImpactCard.tileTag) && AbstractC22676k.m65745e(this.impactPercentageValue, behaviorDetailsTileImpactCard.impactPercentageValue) && AbstractC22676k.m65745e(this.impactPercentageSymbol, behaviorDetailsTileImpactCard.impactPercentageSymbol) && AbstractC22676k.m65745e(this.subBarLabel, behaviorDetailsTileImpactCard.subBarLabel) && AbstractC22676k.m65745e(this.subBarPercent, behaviorDetailsTileImpactCard.subBarPercent) && AbstractC22676k.m65745e(this.impactBarSegment, behaviorDetailsTileImpactCard.impactBarSegment);
    }

    public final ImpactBarSegmentModel getImpactBarSegment() {
        return this.impactBarSegment;
    }

    public final String getImpactPercentageSymbol() {
        return this.impactPercentageSymbol;
    }

    public final String getImpactPercentageValue() {
        return this.impactPercentageValue;
    }

    public final ImpactStyle getImpactStyle() {
        return this.impactStyle;
    }

    public final String getSubBarLabel() {
        return this.subBarLabel;
    }

    public final String getSubBarPercent() {
        return this.subBarPercent;
    }

    public final TileTagModel getTileTag() {
        return this.tileTag;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        String str = this.titleDisplay;
        int iHashCode = (this.impactStyle.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        TileTagModel tileTagModel = this.tileTag;
        int iHashCode2 = (iHashCode + (tileTagModel == null ? 0 : tileTagModel.hashCode())) * 31;
        String str2 = this.impactPercentageValue;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.impactPercentageSymbol;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subBarLabel;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subBarPercent;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ImpactBarSegmentModel impactBarSegmentModel = this.impactBarSegment;
        return iHashCode6 + (impactBarSegmentModel != null ? impactBarSegmentModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleDisplay;
        ImpactStyle impactStyle = this.impactStyle;
        TileTagModel tileTagModel = this.tileTag;
        String str2 = this.impactPercentageValue;
        String str3 = this.impactPercentageSymbol;
        String str4 = this.subBarLabel;
        String str5 = this.subBarPercent;
        ImpactBarSegmentModel impactBarSegmentModel = this.impactBarSegment;
        StringBuilder sb4 = new StringBuilder("BehaviorDetailsTileImpactCard(titleDisplay=");
        sb4.append(str);
        sb4.append(", impactStyle=");
        sb4.append(impactStyle);
        sb4.append(", tileTag=");
        sb4.append(tileTagModel);
        sb4.append(", impactPercentageValue=");
        sb4.append(str2);
        sb4.append(", impactPercentageSymbol=");
        AbstractC11266d.m30444B(sb4, str3, ", subBarLabel=", str4, ", subBarPercent=");
        sb4.append(str5);
        sb4.append(", impactBarSegment=");
        sb4.append(impactBarSegmentModel);
        sb4.append(")");
        return sb4.toString();
    }

    public BehaviorDetailsTileImpactCard(String str, ImpactStyle impactStyle, TileTagModel tileTagModel, String str2, String str3, String str4, String str5, ImpactBarSegmentModel impactBarSegmentModel) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        this.titleDisplay = str;
        this.impactStyle = impactStyle;
        this.tileTag = tileTagModel;
        this.impactPercentageValue = str2;
        this.impactPercentageSymbol = str3;
        this.subBarLabel = str4;
        this.subBarPercent = str5;
        this.impactBarSegment = impactBarSegmentModel;
    }
}
