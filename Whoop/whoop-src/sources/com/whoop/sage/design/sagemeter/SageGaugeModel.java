package com.whoop.sage.design.sagemeter;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JP\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/sage/design/sagemeter/SageGaugeModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "gaugeLastUpdatedDisplay", "gaugeSubtextDisplay", "gaugeLastUpdatedDisplayStyle", "Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;", "gaugeLeftSubtext", "gaugeRightSubtext", "", "gaugeFillPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/design/sagemeter/SageGaugeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;", "component5", "component6", "()Ljava/lang/Float;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;)Lcom/whoop/sage/design/sagemeter/SageGaugeModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGaugeLastUpdatedDisplay", "getGaugeSubtextDisplay", "getGaugeLastUpdatedDisplayStyle", "Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;", "getGaugeLeftSubtext", "getGaugeRightSubtext", "Ljava/lang/Float;", "getGaugeFillPercentage", "Companion", "$serializer", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageGaugeModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Float gaugeFillPercentage;
    private final String gaugeLastUpdatedDisplay;
    private final String gaugeLastUpdatedDisplayStyle;
    private final SageGaugeSubtextModel gaugeLeftSubtext;
    private final SageGaugeSubtextModel gaugeRightSubtext;
    private final String gaugeSubtextDisplay;

    /* JADX INFO: renamed from: com.whoop.sage.design.sagemeter.SageGaugeModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/design/sagemeter/SageGaugeModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/design/sagemeter/SageGaugeModel;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageGaugeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SageGaugeModel(int i13, String str, String str2, String str3, SageGaugeSubtextModel sageGaugeSubtextModel, SageGaugeSubtextModel sageGaugeSubtextModel2, Float f13, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, SageGaugeModel$$serializer.INSTANCE.getDescriptor());
        }
        this.gaugeLastUpdatedDisplay = str;
        this.gaugeSubtextDisplay = str2;
        this.gaugeLastUpdatedDisplayStyle = str3;
        this.gaugeLeftSubtext = sageGaugeSubtextModel;
        this.gaugeRightSubtext = sageGaugeSubtextModel2;
        this.gaugeFillPercentage = f13;
    }

    public static /* synthetic */ SageGaugeModel copy$default(SageGaugeModel sageGaugeModel, String str, String str2, String str3, SageGaugeSubtextModel sageGaugeSubtextModel, SageGaugeSubtextModel sageGaugeSubtextModel2, Float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sageGaugeModel.gaugeLastUpdatedDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = sageGaugeModel.gaugeSubtextDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = sageGaugeModel.gaugeLastUpdatedDisplayStyle;
        }
        if ((i13 & 8) != 0) {
            sageGaugeSubtextModel = sageGaugeModel.gaugeLeftSubtext;
        }
        if ((i13 & 16) != 0) {
            sageGaugeSubtextModel2 = sageGaugeModel.gaugeRightSubtext;
        }
        if ((i13 & 32) != 0) {
            f13 = sageGaugeModel.gaugeFillPercentage;
        }
        SageGaugeSubtextModel sageGaugeSubtextModel3 = sageGaugeSubtextModel2;
        Float f14 = f13;
        return sageGaugeModel.copy(str, str2, str3, sageGaugeSubtextModel, sageGaugeSubtextModel3, f14);
    }

    public static final /* synthetic */ void write$Self$sage_release(SageGaugeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.gaugeLastUpdatedDisplay);
        output.encodeStringElement(serialDesc, 1, self.gaugeSubtextDisplay);
        output.encodeStringElement(serialDesc, 2, self.gaugeLastUpdatedDisplayStyle);
        SageGaugeSubtextModel$$serializer sageGaugeSubtextModel$$serializer = SageGaugeSubtextModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, sageGaugeSubtextModel$$serializer, self.gaugeLeftSubtext);
        output.encodeSerializableElement(serialDesc, 4, sageGaugeSubtextModel$$serializer, self.gaugeRightSubtext);
        output.encodeNullableSerializableElement(serialDesc, 5, FloatSerializer.INSTANCE, self.gaugeFillPercentage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGaugeLastUpdatedDisplay() {
        return this.gaugeLastUpdatedDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGaugeSubtextDisplay() {
        return this.gaugeSubtextDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGaugeLastUpdatedDisplayStyle() {
        return this.gaugeLastUpdatedDisplayStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SageGaugeSubtextModel getGaugeLeftSubtext() {
        return this.gaugeLeftSubtext;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SageGaugeSubtextModel getGaugeRightSubtext() {
        return this.gaugeRightSubtext;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    public final SageGaugeModel copy(String gaugeLastUpdatedDisplay, String gaugeSubtextDisplay, String gaugeLastUpdatedDisplayStyle, SageGaugeSubtextModel gaugeLeftSubtext, SageGaugeSubtextModel gaugeRightSubtext, Float gaugeFillPercentage) {
        AbstractC22676k.m65750j(gaugeSubtextDisplay, "gaugeSubtextDisplay");
        AbstractC22676k.m65750j(gaugeLastUpdatedDisplayStyle, "gaugeLastUpdatedDisplayStyle");
        AbstractC22676k.m65750j(gaugeLeftSubtext, "gaugeLeftSubtext");
        AbstractC22676k.m65750j(gaugeRightSubtext, "gaugeRightSubtext");
        return new SageGaugeModel(gaugeLastUpdatedDisplay, gaugeSubtextDisplay, gaugeLastUpdatedDisplayStyle, gaugeLeftSubtext, gaugeRightSubtext, gaugeFillPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageGaugeModel)) {
            return false;
        }
        SageGaugeModel sageGaugeModel = (SageGaugeModel) other;
        return AbstractC22676k.m65745e(this.gaugeLastUpdatedDisplay, sageGaugeModel.gaugeLastUpdatedDisplay) && AbstractC22676k.m65745e(this.gaugeSubtextDisplay, sageGaugeModel.gaugeSubtextDisplay) && AbstractC22676k.m65745e(this.gaugeLastUpdatedDisplayStyle, sageGaugeModel.gaugeLastUpdatedDisplayStyle) && AbstractC22676k.m65745e(this.gaugeLeftSubtext, sageGaugeModel.gaugeLeftSubtext) && AbstractC22676k.m65745e(this.gaugeRightSubtext, sageGaugeModel.gaugeRightSubtext) && AbstractC22676k.m65745e(this.gaugeFillPercentage, sageGaugeModel.gaugeFillPercentage);
    }

    public final Float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    public final String getGaugeLastUpdatedDisplay() {
        return this.gaugeLastUpdatedDisplay;
    }

    public final String getGaugeLastUpdatedDisplayStyle() {
        return this.gaugeLastUpdatedDisplayStyle;
    }

    public final SageGaugeSubtextModel getGaugeLeftSubtext() {
        return this.gaugeLeftSubtext;
    }

    public final SageGaugeSubtextModel getGaugeRightSubtext() {
        return this.gaugeRightSubtext;
    }

    public final String getGaugeSubtextDisplay() {
        return this.gaugeSubtextDisplay;
    }

    public int hashCode() {
        String str = this.gaugeLastUpdatedDisplay;
        int iHashCode = (this.gaugeRightSubtext.hashCode() + ((this.gaugeLeftSubtext.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.gaugeSubtextDisplay), 31, this.gaugeLastUpdatedDisplayStyle)) * 31)) * 31;
        Float f13 = this.gaugeFillPercentage;
        return iHashCode + (f13 != null ? f13.hashCode() : 0);
    }

    public String toString() {
        String str = this.gaugeLastUpdatedDisplay;
        String str2 = this.gaugeSubtextDisplay;
        String str3 = this.gaugeLastUpdatedDisplayStyle;
        SageGaugeSubtextModel sageGaugeSubtextModel = this.gaugeLeftSubtext;
        SageGaugeSubtextModel sageGaugeSubtextModel2 = this.gaugeRightSubtext;
        Float f13 = this.gaugeFillPercentage;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SageGaugeModel(gaugeLastUpdatedDisplay=", str, ", gaugeSubtextDisplay=", str2, ", gaugeLastUpdatedDisplayStyle=");
        sbM32001t.append(str3);
        sbM32001t.append(", gaugeLeftSubtext=");
        sbM32001t.append(sageGaugeSubtextModel);
        sbM32001t.append(", gaugeRightSubtext=");
        sbM32001t.append(sageGaugeSubtextModel2);
        sbM32001t.append(", gaugeFillPercentage=");
        sbM32001t.append(f13);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SageGaugeModel(String str, String gaugeSubtextDisplay, String gaugeLastUpdatedDisplayStyle, SageGaugeSubtextModel gaugeLeftSubtext, SageGaugeSubtextModel gaugeRightSubtext, Float f13) {
        AbstractC22676k.m65750j(gaugeSubtextDisplay, "gaugeSubtextDisplay");
        AbstractC22676k.m65750j(gaugeLastUpdatedDisplayStyle, "gaugeLastUpdatedDisplayStyle");
        AbstractC22676k.m65750j(gaugeLeftSubtext, "gaugeLeftSubtext");
        AbstractC22676k.m65750j(gaugeRightSubtext, "gaugeRightSubtext");
        this.gaugeLastUpdatedDisplay = str;
        this.gaugeSubtextDisplay = gaugeSubtextDisplay;
        this.gaugeLastUpdatedDisplayStyle = gaugeLastUpdatedDisplayStyle;
        this.gaugeLeftSubtext = gaugeLeftSubtext;
        this.gaugeRightSubtext = gaugeRightSubtext;
        this.gaugeFillPercentage = f13;
    }
}
