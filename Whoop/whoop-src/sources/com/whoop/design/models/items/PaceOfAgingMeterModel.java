package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36961h;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)Jt\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b8\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b9\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b:\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b=\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/design/models/items/PaceOfAgingMeterModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/design/models/items/PaceOfAgingMeterTickModel;", "ticks", "", "leftLabelDisplay", "leftIcon", "rightLabelDisplay", "rightIcon", "", "currentValueRiseStartTickIndex", "titleDisplay", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "()Lcom/whoop/design/models/items/ImpactModel;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;)Lcom/whoop/design/models/items/PaceOfAgingMeterModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTicks", "Ljava/lang/String;", "getLeftLabelDisplay", "getLeftIcon", "getRightLabelDisplay", "getRightIcon", "Ljava/lang/Integer;", "getCurrentValueRiseStartTickIndex", "getTitleDisplay", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaceOfAgingMeterModel implements DesignSystemModel {
    private final Integer currentValueRiseStartTickIndex;
    private final String leftIcon;
    private final String leftLabelDisplay;
    private final String rightIcon;
    private final String rightLabelDisplay;
    private final List<PaceOfAgingMeterTickModel> ticks;
    private final String titleDisplay;
    private final ImpactModel trend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36961h(16)), null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/PaceOfAgingMeterModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/PaceOfAgingMeterModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaceOfAgingMeterModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaceOfAgingMeterModel(int i13, List list, String str, String str2, String str3, String str4, Integer num, String str5, ImpactModel impactModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, PaceOfAgingMeterModel$$serializer.INSTANCE.getDescriptor());
        }
        this.ticks = list;
        this.leftLabelDisplay = str;
        this.leftIcon = str2;
        this.rightLabelDisplay = str3;
        this.rightIcon = str4;
        this.currentValueRiseStartTickIndex = num;
        this.titleDisplay = str5;
        this.trend = impactModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(PaceOfAgingMeterTickModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaceOfAgingMeterModel copy$default(PaceOfAgingMeterModel paceOfAgingMeterModel, List list, String str, String str2, String str3, String str4, Integer num, String str5, ImpactModel impactModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = paceOfAgingMeterModel.ticks;
        }
        if ((i13 & 2) != 0) {
            str = paceOfAgingMeterModel.leftLabelDisplay;
        }
        if ((i13 & 4) != 0) {
            str2 = paceOfAgingMeterModel.leftIcon;
        }
        if ((i13 & 8) != 0) {
            str3 = paceOfAgingMeterModel.rightLabelDisplay;
        }
        if ((i13 & 16) != 0) {
            str4 = paceOfAgingMeterModel.rightIcon;
        }
        if ((i13 & 32) != 0) {
            num = paceOfAgingMeterModel.currentValueRiseStartTickIndex;
        }
        if ((i13 & 64) != 0) {
            str5 = paceOfAgingMeterModel.titleDisplay;
        }
        if ((i13 & 128) != 0) {
            impactModel = paceOfAgingMeterModel.trend;
        }
        String str6 = str5;
        ImpactModel impactModel2 = impactModel;
        String str7 = str4;
        Integer num2 = num;
        return paceOfAgingMeterModel.copy(list, str, str2, str3, str7, num2, str6, impactModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(PaceOfAgingMeterModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.ticks);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.leftLabelDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.leftIcon);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.rightLabelDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.currentValueRiseStartTickIndex);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.titleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 7, ImpactModel$$serializer.INSTANCE, self.trend);
    }

    public final List<PaceOfAgingMeterTickModel> component1() {
        return this.ticks;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeftLabelDisplay() {
        return this.leftLabelDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightLabelDisplay() {
        return this.rightLabelDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCurrentValueRiseStartTickIndex() {
        return this.currentValueRiseStartTickIndex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    public final PaceOfAgingMeterModel copy(List<PaceOfAgingMeterTickModel> ticks, String leftLabelDisplay, String leftIcon, String rightLabelDisplay, String rightIcon, Integer currentValueRiseStartTickIndex, String titleDisplay, ImpactModel trend) {
        AbstractC22676k.m65750j(ticks, "ticks");
        return new PaceOfAgingMeterModel(ticks, leftLabelDisplay, leftIcon, rightLabelDisplay, rightIcon, currentValueRiseStartTickIndex, titleDisplay, trend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaceOfAgingMeterModel)) {
            return false;
        }
        PaceOfAgingMeterModel paceOfAgingMeterModel = (PaceOfAgingMeterModel) other;
        return AbstractC22676k.m65745e(this.ticks, paceOfAgingMeterModel.ticks) && AbstractC22676k.m65745e(this.leftLabelDisplay, paceOfAgingMeterModel.leftLabelDisplay) && AbstractC22676k.m65745e(this.leftIcon, paceOfAgingMeterModel.leftIcon) && AbstractC22676k.m65745e(this.rightLabelDisplay, paceOfAgingMeterModel.rightLabelDisplay) && AbstractC22676k.m65745e(this.rightIcon, paceOfAgingMeterModel.rightIcon) && AbstractC22676k.m65745e(this.currentValueRiseStartTickIndex, paceOfAgingMeterModel.currentValueRiseStartTickIndex) && AbstractC22676k.m65745e(this.titleDisplay, paceOfAgingMeterModel.titleDisplay) && AbstractC22676k.m65745e(this.trend, paceOfAgingMeterModel.trend);
    }

    public final Integer getCurrentValueRiseStartTickIndex() {
        return this.currentValueRiseStartTickIndex;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getLeftLabelDisplay() {
        return this.leftLabelDisplay;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getRightLabelDisplay() {
        return this.rightLabelDisplay;
    }

    public final List<PaceOfAgingMeterTickModel> getTicks() {
        return this.ticks;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iHashCode = this.ticks.hashCode() * 31;
        String str = this.leftLabelDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.leftIcon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rightLabelDisplay;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rightIcon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.currentValueRiseStartTickIndex;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.titleDisplay;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ImpactModel impactModel = this.trend;
        return iHashCode7 + (impactModel != null ? impactModel.hashCode() : 0);
    }

    public String toString() {
        List<PaceOfAgingMeterTickModel> list = this.ticks;
        String str = this.leftLabelDisplay;
        String str2 = this.leftIcon;
        String str3 = this.rightLabelDisplay;
        String str4 = this.rightIcon;
        Integer num = this.currentValueRiseStartTickIndex;
        String str5 = this.titleDisplay;
        ImpactModel impactModel = this.trend;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("PaceOfAgingMeterModel(ticks=", ", leftLabelDisplay=", str, ", leftIcon=", list);
        AbstractC11266d.m30444B(sbM79507k, str2, ", rightLabelDisplay=", str3, ", rightIcon=");
        AbstractC30007c.m91853w(num, str4, ", currentValueRiseStartTickIndex=", ", titleDisplay=", sbM79507k);
        sbM79507k.append(str5);
        sbM79507k.append(", trend=");
        sbM79507k.append(impactModel);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    public PaceOfAgingMeterModel(List<PaceOfAgingMeterTickModel> ticks, String str, String str2, String str3, String str4, Integer num, String str5, ImpactModel impactModel) {
        AbstractC22676k.m65750j(ticks, "ticks");
        this.ticks = ticks;
        this.leftLabelDisplay = str;
        this.leftIcon = str2;
        this.rightLabelDisplay = str3;
        this.rightIcon = str4;
        this.currentValueRiseStartTickIndex = num;
        this.titleDisplay = str5;
        this.trend = impactModel;
    }
}
