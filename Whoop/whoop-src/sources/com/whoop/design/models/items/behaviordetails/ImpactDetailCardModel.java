package com.whoop.design.models.items.behaviordetails;

import com.whoop.design.models.items.ImpactBarSegmentModel;
import com.whoop.design.models.items.ImpactBarSegmentModel$$serializer;
import com.whoop.design.models.items.ImpactStyle;
import com.whoop.design.models.items.TileTagModel;
import com.whoop.design.models.items.TileTagModel$$serializer;
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
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import z91.C40204a;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jj\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, m65681d2 = {"Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;", "", "", "titleDisplay", "Lcom/whoop/design/models/items/ImpactStyle;", "impactStyle", "Lcom/whoop/design/models/items/TileTagModel;", "tileTag", "impactPercentageValue", "impactPercentageSymbol", "subBarLabel", "subBarPercent", "Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "impactBarSegment", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/ImpactStyle;", "component3", "()Lcom/whoop/design/models/items/TileTagModel;", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "Lcom/whoop/design/models/items/ImpactStyle;", "getImpactStyle", "Lcom/whoop/design/models/items/TileTagModel;", "getTileTag", "getImpactPercentageValue", "getImpactPercentageSymbol", "getSubBarLabel", "getSubBarPercent", "Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "getImpactBarSegment", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImpactDetailCardModel {
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
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C40204a(0)), null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImpactDetailCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImpactDetailCardModel(int i13, String str, ImpactStyle impactStyle, TileTagModel tileTagModel, String str2, String str3, String str4, String str5, ImpactBarSegmentModel impactBarSegmentModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (131 != (i13 & 131)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 131, ImpactDetailCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.impactStyle = impactStyle;
        if ((i13 & 4) == 0) {
            this.tileTag = null;
        } else {
            this.tileTag = tileTagModel;
        }
        if ((i13 & 8) == 0) {
            this.impactPercentageValue = null;
        } else {
            this.impactPercentageValue = str2;
        }
        if ((i13 & 16) == 0) {
            this.impactPercentageSymbol = null;
        } else {
            this.impactPercentageSymbol = str3;
        }
        if ((i13 & 32) == 0) {
            this.subBarLabel = null;
        } else {
            this.subBarLabel = str4;
        }
        if ((i13 & 64) == 0) {
            this.subBarPercent = null;
        } else {
            this.subBarPercent = str5;
        }
        this.impactBarSegment = impactBarSegmentModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ImpactStyle", ImpactStyle.values());
    }

    public static /* synthetic */ ImpactDetailCardModel copy$default(ImpactDetailCardModel impactDetailCardModel, String str, ImpactStyle impactStyle, TileTagModel tileTagModel, String str2, String str3, String str4, String str5, ImpactBarSegmentModel impactBarSegmentModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = impactDetailCardModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            impactStyle = impactDetailCardModel.impactStyle;
        }
        if ((i13 & 4) != 0) {
            tileTagModel = impactDetailCardModel.tileTag;
        }
        if ((i13 & 8) != 0) {
            str2 = impactDetailCardModel.impactPercentageValue;
        }
        if ((i13 & 16) != 0) {
            str3 = impactDetailCardModel.impactPercentageSymbol;
        }
        if ((i13 & 32) != 0) {
            str4 = impactDetailCardModel.subBarLabel;
        }
        if ((i13 & 64) != 0) {
            str5 = impactDetailCardModel.subBarPercent;
        }
        if ((i13 & 128) != 0) {
            impactBarSegmentModel = impactDetailCardModel.impactBarSegment;
        }
        String str6 = str5;
        ImpactBarSegmentModel impactBarSegmentModel2 = impactBarSegmentModel;
        String str7 = str3;
        String str8 = str4;
        return impactDetailCardModel.copy(str, impactStyle, tileTagModel, str2, str7, str8, str6, impactBarSegmentModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ImpactDetailCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.impactStyle);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.tileTag != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, TileTagModel$$serializer.INSTANCE, self.tileTag);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.impactPercentageValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.impactPercentageValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.impactPercentageSymbol != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.impactPercentageSymbol);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.subBarLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.subBarLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.subBarPercent != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.subBarPercent);
        }
        output.encodeSerializableElement(serialDesc, 7, ImpactBarSegmentModel$$serializer.INSTANCE, self.impactBarSegment);
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

    public final ImpactDetailCardModel copy(String titleDisplay, ImpactStyle impactStyle, TileTagModel tileTag, String impactPercentageValue, String impactPercentageSymbol, String subBarLabel, String subBarPercent, ImpactBarSegmentModel impactBarSegment) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        AbstractC22676k.m65750j(impactBarSegment, "impactBarSegment");
        return new ImpactDetailCardModel(titleDisplay, impactStyle, tileTag, impactPercentageValue, impactPercentageSymbol, subBarLabel, subBarPercent, impactBarSegment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpactDetailCardModel)) {
            return false;
        }
        ImpactDetailCardModel impactDetailCardModel = (ImpactDetailCardModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, impactDetailCardModel.titleDisplay) && this.impactStyle == impactDetailCardModel.impactStyle && AbstractC22676k.m65745e(this.tileTag, impactDetailCardModel.tileTag) && AbstractC22676k.m65745e(this.impactPercentageValue, impactDetailCardModel.impactPercentageValue) && AbstractC22676k.m65745e(this.impactPercentageSymbol, impactDetailCardModel.impactPercentageSymbol) && AbstractC22676k.m65745e(this.subBarLabel, impactDetailCardModel.subBarLabel) && AbstractC22676k.m65745e(this.subBarPercent, impactDetailCardModel.subBarPercent) && AbstractC22676k.m65745e(this.impactBarSegment, impactDetailCardModel.impactBarSegment);
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
        int iHashCode = (this.impactStyle.hashCode() + (this.titleDisplay.hashCode() * 31)) * 31;
        TileTagModel tileTagModel = this.tileTag;
        int iHashCode2 = (iHashCode + (tileTagModel == null ? 0 : tileTagModel.hashCode())) * 31;
        String str = this.impactPercentageValue;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.impactPercentageSymbol;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subBarLabel;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subBarPercent;
        return this.impactBarSegment.hashCode() + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31);
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
        StringBuilder sb4 = new StringBuilder("ImpactDetailCardModel(titleDisplay=");
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

    public ImpactDetailCardModel(String titleDisplay, ImpactStyle impactStyle, TileTagModel tileTagModel, String str, String str2, String str3, String str4, ImpactBarSegmentModel impactBarSegment) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        AbstractC22676k.m65750j(impactBarSegment, "impactBarSegment");
        this.titleDisplay = titleDisplay;
        this.impactStyle = impactStyle;
        this.tileTag = tileTagModel;
        this.impactPercentageValue = str;
        this.impactPercentageSymbol = str2;
        this.subBarLabel = str3;
        this.subBarPercent = str4;
        this.impactBarSegment = impactBarSegment;
    }

    public /* synthetic */ ImpactDetailCardModel(String str, ImpactStyle impactStyle, TileTagModel tileTagModel, String str2, String str3, String str4, String str5, ImpactBarSegmentModel impactBarSegmentModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, impactStyle, (i13 & 4) != 0 ? null : tileTagModel, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : str5, impactBarSegmentModel);
    }
}
