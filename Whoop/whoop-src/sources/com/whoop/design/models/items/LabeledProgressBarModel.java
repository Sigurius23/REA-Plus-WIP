package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JT\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/LabeledProgressBarModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "leftLabel", "leftSublabel", "rightLabel", "rightSublabel", "", NotificationCompat.CATEGORY_PROGRESS, "Lcom/whoop/design/models/items/LabeledProgressBarStyle;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/LabeledProgressBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()F", "component6", "()Lcom/whoop/design/models/items/LabeledProgressBarStyle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;)Lcom/whoop/design/models/items/LabeledProgressBarModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeftLabel", "getLeftSublabel", "getRightLabel", "getRightSublabel", "F", "getProgress", "Lcom/whoop/design/models/items/LabeledProgressBarStyle;", "getStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabeledProgressBarModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final String leftLabel;
    private final String leftSublabel;
    private final float progress;
    private final String rightLabel;
    private final String rightSublabel;
    private final LabeledProgressBarStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36960g(7))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/LabeledProgressBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/LabeledProgressBarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabeledProgressBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LabeledProgressBarModel(int i13, String str, String str2, String str3, String str4, float f13, LabeledProgressBarStyle labeledProgressBarStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, LabeledProgressBarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.leftLabel = str;
        this.leftSublabel = str2;
        this.rightLabel = str3;
        this.rightSublabel = str4;
        this.progress = f13;
        this.style = labeledProgressBarStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return LabeledProgressBarStyle.INSTANCE.serializer();
    }

    public static /* synthetic */ LabeledProgressBarModel copy$default(LabeledProgressBarModel labeledProgressBarModel, String str, String str2, String str3, String str4, float f13, LabeledProgressBarStyle labeledProgressBarStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = labeledProgressBarModel.leftLabel;
        }
        if ((i13 & 2) != 0) {
            str2 = labeledProgressBarModel.leftSublabel;
        }
        if ((i13 & 4) != 0) {
            str3 = labeledProgressBarModel.rightLabel;
        }
        if ((i13 & 8) != 0) {
            str4 = labeledProgressBarModel.rightSublabel;
        }
        if ((i13 & 16) != 0) {
            f13 = labeledProgressBarModel.progress;
        }
        if ((i13 & 32) != 0) {
            labeledProgressBarStyle = labeledProgressBarModel.style;
        }
        float f14 = f13;
        LabeledProgressBarStyle labeledProgressBarStyle2 = labeledProgressBarStyle;
        return labeledProgressBarModel.copy(str, str2, str3, str4, f14, labeledProgressBarStyle2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(LabeledProgressBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.leftLabel);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.leftSublabel);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.rightLabel);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.rightSublabel);
        output.encodeFloatElement(serialDesc, 4, self.progress);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeftLabel() {
        return this.leftLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeftSublabel() {
        return this.leftSublabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRightLabel() {
        return this.rightLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightSublabel() {
        return this.rightSublabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LabeledProgressBarStyle getStyle() {
        return this.style;
    }

    public final LabeledProgressBarModel copy(String leftLabel, String leftSublabel, String rightLabel, String rightSublabel, float progress, LabeledProgressBarStyle style) {
        AbstractC22676k.m65750j(style, "style");
        return new LabeledProgressBarModel(leftLabel, leftSublabel, rightLabel, rightSublabel, progress, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabeledProgressBarModel)) {
            return false;
        }
        LabeledProgressBarModel labeledProgressBarModel = (LabeledProgressBarModel) other;
        return AbstractC22676k.m65745e(this.leftLabel, labeledProgressBarModel.leftLabel) && AbstractC22676k.m65745e(this.leftSublabel, labeledProgressBarModel.leftSublabel) && AbstractC22676k.m65745e(this.rightLabel, labeledProgressBarModel.rightLabel) && AbstractC22676k.m65745e(this.rightSublabel, labeledProgressBarModel.rightSublabel) && Float.compare(this.progress, labeledProgressBarModel.progress) == 0 && this.style == labeledProgressBarModel.style;
    }

    public final String getLeftLabel() {
        return this.leftLabel;
    }

    public final String getLeftSublabel() {
        return this.leftSublabel;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final String getRightLabel() {
        return this.rightLabel;
    }

    public final String getRightSublabel() {
        return this.rightSublabel;
    }

    public final LabeledProgressBarStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        String str = this.leftLabel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leftSublabel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rightLabel;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rightSublabel;
        return this.style.hashCode() + AbstractC11266d.m30447a(this.progress, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.leftLabel;
        String str2 = this.leftSublabel;
        String str3 = this.rightLabel;
        String str4 = this.rightSublabel;
        float f13 = this.progress;
        LabeledProgressBarStyle labeledProgressBarStyle = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LabeledProgressBarModel(leftLabel=", str, ", leftSublabel=", str2, ", rightLabel=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", rightSublabel=", str4, ", progress=");
        sbM32001t.append(f13);
        sbM32001t.append(", style=");
        sbM32001t.append(labeledProgressBarStyle);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public LabeledProgressBarModel(String str, String str2, String str3, String str4, float f13, LabeledProgressBarStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.leftLabel = str;
        this.leftSublabel = str2;
        this.rightLabel = str3;
        this.rightSublabel = str4;
        this.progress = f13;
        this.style = style;
    }
}
