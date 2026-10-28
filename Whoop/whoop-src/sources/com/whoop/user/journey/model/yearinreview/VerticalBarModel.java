package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cq2.C11062a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010!JP\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b4\u0010!R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b5\u0010!¨\u00068"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;", "", "", "fillPercentage", "Ly81/f;", "barColor", "labelColor", "", "labelText", "labelSuffix", "labelSubtext", "<init>", "(FLy81/f;Ly81/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLy81/f;Ly81/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "()Ly81/f;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "copy", "(FLy81/f;Ly81/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getFillPercentage", "Ly81/f;", "getBarColor", "getLabelColor", "Ljava/lang/String;", "getLabelText", "getLabelSuffix", "getLabelSubtext", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VerticalBarModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EnumC39333f barColor;
    private final float fillPercentage;
    private final EnumC39333f labelColor;
    private final String labelSubtext;
    private final String labelSuffix;
    private final String labelText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/VerticalBarModel;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VerticalBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C11062a(20)), AbstractC30060g.m92087G(enumC23463i, new C11062a(21)), null, null, null};
    }

    public VerticalBarModel(float f13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, String labelText, String labelSuffix, String labelSubtext) {
        AbstractC22676k.m65750j(labelText, "labelText");
        AbstractC22676k.m65750j(labelSuffix, "labelSuffix");
        AbstractC22676k.m65750j(labelSubtext, "labelSubtext");
        this.fillPercentage = f13;
        this.barColor = enumC39333f;
        this.labelColor = enumC39333f2;
        this.labelText = labelText;
        this.labelSuffix = labelSuffix;
        this.labelSubtext = labelSubtext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    public static /* synthetic */ VerticalBarModel copy$default(VerticalBarModel verticalBarModel, float f13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = verticalBarModel.fillPercentage;
        }
        if ((i13 & 2) != 0) {
            enumC39333f = verticalBarModel.barColor;
        }
        if ((i13 & 4) != 0) {
            enumC39333f2 = verticalBarModel.labelColor;
        }
        if ((i13 & 8) != 0) {
            str = verticalBarModel.labelText;
        }
        if ((i13 & 16) != 0) {
            str2 = verticalBarModel.labelSuffix;
        }
        if ((i13 & 32) != 0) {
            str3 = verticalBarModel.labelSubtext;
        }
        String str4 = str2;
        String str5 = str3;
        return verticalBarModel.copy(f13, enumC39333f, enumC39333f2, str, str4, str5);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(VerticalBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeFloatElement(serialDesc, 0, self.fillPercentage);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.barColor);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.labelColor);
        output.encodeStringElement(serialDesc, 3, self.labelText);
        output.encodeStringElement(serialDesc, 4, self.labelSuffix);
        output.encodeStringElement(serialDesc, 5, self.labelSubtext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC39333f getBarColor() {
        return this.barColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC39333f getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLabelSuffix() {
        return this.labelSuffix;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLabelSubtext() {
        return this.labelSubtext;
    }

    public final VerticalBarModel copy(float fillPercentage, EnumC39333f barColor, EnumC39333f labelColor, String labelText, String labelSuffix, String labelSubtext) {
        AbstractC22676k.m65750j(labelText, "labelText");
        AbstractC22676k.m65750j(labelSuffix, "labelSuffix");
        AbstractC22676k.m65750j(labelSubtext, "labelSubtext");
        return new VerticalBarModel(fillPercentage, barColor, labelColor, labelText, labelSuffix, labelSubtext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalBarModel)) {
            return false;
        }
        VerticalBarModel verticalBarModel = (VerticalBarModel) other;
        return Float.compare(this.fillPercentage, verticalBarModel.fillPercentage) == 0 && this.barColor == verticalBarModel.barColor && this.labelColor == verticalBarModel.labelColor && AbstractC22676k.m65745e(this.labelText, verticalBarModel.labelText) && AbstractC22676k.m65745e(this.labelSuffix, verticalBarModel.labelSuffix) && AbstractC22676k.m65745e(this.labelSubtext, verticalBarModel.labelSubtext);
    }

    public final EnumC39333f getBarColor() {
        return this.barColor;
    }

    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    public final EnumC39333f getLabelColor() {
        return this.labelColor;
    }

    public final String getLabelSubtext() {
        return this.labelSubtext;
    }

    public final String getLabelSuffix() {
        return this.labelSuffix;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.fillPercentage) * 31;
        EnumC39333f enumC39333f = this.barColor;
        int iHashCode2 = (iHashCode + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        EnumC39333f enumC39333f2 = this.labelColor;
        return this.labelSubtext.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (enumC39333f2 != null ? enumC39333f2.hashCode() : 0)) * 31, 31, this.labelText), 31, this.labelSuffix);
    }

    public String toString() {
        float f13 = this.fillPercentage;
        EnumC39333f enumC39333f = this.barColor;
        EnumC39333f enumC39333f2 = this.labelColor;
        String str = this.labelText;
        String str2 = this.labelSuffix;
        String str3 = this.labelSubtext;
        StringBuilder sb4 = new StringBuilder("VerticalBarModel(fillPercentage=");
        sb4.append(f13);
        sb4.append(", barColor=");
        sb4.append(enumC39333f);
        sb4.append(", labelColor=");
        sb4.append(enumC39333f2);
        sb4.append(", labelText=");
        sb4.append(str);
        sb4.append(", labelSuffix=");
        return AbstractC11266d.m30464r(sb4, str2, ", labelSubtext=", str3, ")");
    }

    public /* synthetic */ VerticalBarModel(int i13, float f13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, VerticalBarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.fillPercentage = f13;
        this.barColor = enumC39333f;
        this.labelColor = enumC39333f2;
        this.labelText = str;
        this.labelSuffix = str2;
        this.labelSubtext = str3;
    }
}
