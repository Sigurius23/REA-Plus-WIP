package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010 J^\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b:\u0010 ¨\u0006="}, m65681d2 = {"Lcom/whoop/design/models/items/ProgressBreakdownModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "totalProgressSteps", "currentProgressSteps", "", "upperLeftDisplay", "upperRightDisplay", "Lcom/whoop/design/models/items/ProgressMetaDataModel;", "progressMetadata", "Lcom/whoop/design/models/items/ProgressStyle;", "progressStyle", "lowerLeftDisplay", "<init>", "(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ProgressBreakdownModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/whoop/design/models/items/ProgressMetaDataModel;", "component6", "()Lcom/whoop/design/models/items/ProgressStyle;", "component7", "copy", "(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;)Lcom/whoop/design/models/items/ProgressBreakdownModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotalProgressSteps", "getCurrentProgressSteps", "Ljava/lang/String;", "getUpperLeftDisplay", "getUpperRightDisplay", "Lcom/whoop/design/models/items/ProgressMetaDataModel;", "getProgressMetadata", "Lcom/whoop/design/models/items/ProgressStyle;", "getProgressStyle", "getLowerLeftDisplay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressBreakdownModel implements DesignSystemModel {
    private final int currentProgressSteps;
    private final String lowerLeftDisplay;
    private final ProgressMetaDataModel progressMetadata;
    private final ProgressStyle progressStyle;
    private final int totalProgressSteps;
    private final String upperLeftDisplay;
    private final String upperRightDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36962i(6)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ProgressBreakdownModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ProgressBreakdownModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressBreakdownModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressBreakdownModel(int i13, int i14, int i15, String str, String str2, ProgressMetaDataModel progressMetaDataModel, ProgressStyle progressStyle, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ProgressBreakdownModel$$serializer.INSTANCE.getDescriptor());
        }
        this.totalProgressSteps = i14;
        this.currentProgressSteps = i15;
        this.upperLeftDisplay = str;
        this.upperRightDisplay = str2;
        this.progressMetadata = progressMetaDataModel;
        this.progressStyle = progressStyle;
        this.lowerLeftDisplay = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ProgressStyle", ProgressStyle.values());
    }

    public static /* synthetic */ ProgressBreakdownModel copy$default(ProgressBreakdownModel progressBreakdownModel, int i13, int i14, String str, String str2, ProgressMetaDataModel progressMetaDataModel, ProgressStyle progressStyle, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = progressBreakdownModel.totalProgressSteps;
        }
        if ((i15 & 2) != 0) {
            i14 = progressBreakdownModel.currentProgressSteps;
        }
        if ((i15 & 4) != 0) {
            str = progressBreakdownModel.upperLeftDisplay;
        }
        if ((i15 & 8) != 0) {
            str2 = progressBreakdownModel.upperRightDisplay;
        }
        if ((i15 & 16) != 0) {
            progressMetaDataModel = progressBreakdownModel.progressMetadata;
        }
        if ((i15 & 32) != 0) {
            progressStyle = progressBreakdownModel.progressStyle;
        }
        if ((i15 & 64) != 0) {
            str3 = progressBreakdownModel.lowerLeftDisplay;
        }
        ProgressStyle progressStyle2 = progressStyle;
        String str4 = str3;
        ProgressMetaDataModel progressMetaDataModel2 = progressMetaDataModel;
        String str5 = str;
        return progressBreakdownModel.copy(i13, i14, str5, str2, progressMetaDataModel2, progressStyle2, str4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ProgressBreakdownModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.totalProgressSteps);
        output.encodeIntElement(serialDesc, 1, self.currentProgressSteps);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.upperLeftDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.upperRightDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, ProgressMetaDataModel$$serializer.INSTANCE, self.progressMetadata);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.progressStyle);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.lowerLeftDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalProgressSteps() {
        return this.totalProgressSteps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentProgressSteps() {
        return this.currentProgressSteps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpperLeftDisplay() {
        return this.upperLeftDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUpperRightDisplay() {
        return this.upperRightDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProgressMetaDataModel getProgressMetadata() {
        return this.progressMetadata;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProgressStyle getProgressStyle() {
        return this.progressStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLowerLeftDisplay() {
        return this.lowerLeftDisplay;
    }

    public final ProgressBreakdownModel copy(int totalProgressSteps, int currentProgressSteps, String upperLeftDisplay, String upperRightDisplay, ProgressMetaDataModel progressMetadata, ProgressStyle progressStyle, String lowerLeftDisplay) {
        AbstractC22676k.m65750j(progressStyle, "progressStyle");
        return new ProgressBreakdownModel(totalProgressSteps, currentProgressSteps, upperLeftDisplay, upperRightDisplay, progressMetadata, progressStyle, lowerLeftDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBreakdownModel)) {
            return false;
        }
        ProgressBreakdownModel progressBreakdownModel = (ProgressBreakdownModel) other;
        return this.totalProgressSteps == progressBreakdownModel.totalProgressSteps && this.currentProgressSteps == progressBreakdownModel.currentProgressSteps && AbstractC22676k.m65745e(this.upperLeftDisplay, progressBreakdownModel.upperLeftDisplay) && AbstractC22676k.m65745e(this.upperRightDisplay, progressBreakdownModel.upperRightDisplay) && AbstractC22676k.m65745e(this.progressMetadata, progressBreakdownModel.progressMetadata) && this.progressStyle == progressBreakdownModel.progressStyle && AbstractC22676k.m65745e(this.lowerLeftDisplay, progressBreakdownModel.lowerLeftDisplay);
    }

    public final int getCurrentProgressSteps() {
        return this.currentProgressSteps;
    }

    public final String getLowerLeftDisplay() {
        return this.lowerLeftDisplay;
    }

    public final ProgressMetaDataModel getProgressMetadata() {
        return this.progressMetadata;
    }

    public final ProgressStyle getProgressStyle() {
        return this.progressStyle;
    }

    public final int getTotalProgressSteps() {
        return this.totalProgressSteps;
    }

    public final String getUpperLeftDisplay() {
        return this.upperLeftDisplay;
    }

    public final String getUpperRightDisplay() {
        return this.upperRightDisplay;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.currentProgressSteps, Integer.hashCode(this.totalProgressSteps) * 31, 31);
        String str = this.upperLeftDisplay;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.upperRightDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProgressMetaDataModel progressMetaDataModel = this.progressMetadata;
        int iHashCode3 = (this.progressStyle.hashCode() + ((iHashCode2 + (progressMetaDataModel == null ? 0 : progressMetaDataModel.hashCode())) * 31)) * 31;
        String str3 = this.lowerLeftDisplay;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.totalProgressSteps;
        int i14 = this.currentProgressSteps;
        String str = this.upperLeftDisplay;
        String str2 = this.upperRightDisplay;
        ProgressMetaDataModel progressMetaDataModel = this.progressMetadata;
        ProgressStyle progressStyle = this.progressStyle;
        String str3 = this.lowerLeftDisplay;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ProgressBreakdownModel(totalProgressSteps=", ", currentProgressSteps=", ", upperLeftDisplay=");
        AbstractC11266d.m30444B(sbM30465s, str, ", upperRightDisplay=", str2, ", progressMetadata=");
        sbM30465s.append(progressMetaDataModel);
        sbM30465s.append(", progressStyle=");
        sbM30465s.append(progressStyle);
        sbM30465s.append(", lowerLeftDisplay=");
        return AbstractC25012a.m73376i(str3, ")", sbM30465s);
    }

    public ProgressBreakdownModel(int i13, int i14, String str, String str2, ProgressMetaDataModel progressMetaDataModel, ProgressStyle progressStyle, String str3) {
        AbstractC22676k.m65750j(progressStyle, "progressStyle");
        this.totalProgressSteps = i13;
        this.currentProgressSteps = i14;
        this.upperLeftDisplay = str;
        this.upperRightDisplay = str2;
        this.progressMetadata = progressMetaDataModel;
        this.progressStyle = progressStyle;
        this.lowerLeftDisplay = str3;
    }
}
