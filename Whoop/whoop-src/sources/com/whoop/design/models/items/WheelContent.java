package com.whoop.design.models.items;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36965l;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jf\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, m65681d2 = {"Lcom/whoop/design/models/items/WheelContent;", "", "Lcom/whoop/design/models/items/WheelContentType;", "type", "", "lowerBound", "upperBound", "stepSize", "", "padTo", "", "prefix", "", "Lcom/whoop/design/models/items/WheelOption;", "options", "<init>", "(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/WheelContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/WheelContentType;", "component2", "()Ljava/lang/Double;", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/lang/String;", "component7", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/items/WheelContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/WheelContentType;", "getType", "Ljava/lang/Double;", "getLowerBound", "getUpperBound", "getStepSize", "Ljava/lang/Integer;", "getPadTo", "Ljava/lang/String;", "getPrefix", "Ljava/util/List;", "getOptions", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WheelContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final Double lowerBound;
    private final List<WheelOption> options;
    private final Integer padTo;
    private final String prefix;
    private final Double stepSize;
    private final WheelContentType type;
    private final Double upperBound;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/WheelContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/WheelContent;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WheelContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36965l(6)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36965l(7))};
    }

    public /* synthetic */ WheelContent(int i13, WheelContentType wheelContentType, Double d3, Double d14, Double d15, Integer num, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, WheelContent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = wheelContentType;
        this.lowerBound = d3;
        this.upperBound = d14;
        this.stepSize = d15;
        this.padTo = num;
        this.prefix = str;
        if ((i13 & 64) == 0) {
            this.options = C25271y.f99162w;
        } else {
            this.options = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.WheelContentType", WheelContentType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(WheelOption$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WheelContent copy$default(WheelContent wheelContent, WheelContentType wheelContentType, Double d3, Double d14, Double d15, Integer num, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            wheelContentType = wheelContent.type;
        }
        if ((i13 & 2) != 0) {
            d3 = wheelContent.lowerBound;
        }
        if ((i13 & 4) != 0) {
            d14 = wheelContent.upperBound;
        }
        if ((i13 & 8) != 0) {
            d15 = wheelContent.stepSize;
        }
        if ((i13 & 16) != 0) {
            num = wheelContent.padTo;
        }
        if ((i13 & 32) != 0) {
            str = wheelContent.prefix;
        }
        if ((i13 & 64) != 0) {
            list = wheelContent.options;
        }
        String str2 = str;
        List list2 = list;
        Integer num2 = num;
        Double d16 = d14;
        return wheelContent.copy(wheelContentType, d3, d16, d15, num2, str2, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(WheelContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.type);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, doubleSerializer, self.lowerBound);
        output.encodeNullableSerializableElement(serialDesc, 2, doubleSerializer, self.upperBound);
        output.encodeNullableSerializableElement(serialDesc, 3, doubleSerializer, self.stepSize);
        output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.padTo);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.prefix);
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && AbstractC22676k.m65745e(self.options, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.options);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WheelContentType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getUpperBound() {
        return this.upperBound;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getStepSize() {
        return this.stepSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPadTo() {
        return this.padTo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    public final List<WheelOption> component7() {
        return this.options;
    }

    public final WheelContent copy(WheelContentType type, Double lowerBound, Double upperBound, Double stepSize, Integer padTo, String prefix, List<WheelOption> options) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(options, "options");
        return new WheelContent(type, lowerBound, upperBound, stepSize, padTo, prefix, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WheelContent)) {
            return false;
        }
        WheelContent wheelContent = (WheelContent) other;
        return this.type == wheelContent.type && AbstractC22676k.m65745e(this.lowerBound, wheelContent.lowerBound) && AbstractC22676k.m65745e(this.upperBound, wheelContent.upperBound) && AbstractC22676k.m65745e(this.stepSize, wheelContent.stepSize) && AbstractC22676k.m65745e(this.padTo, wheelContent.padTo) && AbstractC22676k.m65745e(this.prefix, wheelContent.prefix) && AbstractC22676k.m65745e(this.options, wheelContent.options);
    }

    public final Double getLowerBound() {
        return this.lowerBound;
    }

    public final List<WheelOption> getOptions() {
        return this.options;
    }

    public final Integer getPadTo() {
        return this.padTo;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final Double getStepSize() {
        return this.stepSize;
    }

    public final WheelContentType getType() {
        return this.type;
    }

    public final Double getUpperBound() {
        return this.upperBound;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Double d3 = this.lowerBound;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.upperBound;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.stepSize;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num = this.padTo;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.prefix;
        return this.options.hashCode() + ((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        WheelContentType wheelContentType = this.type;
        Double d3 = this.lowerBound;
        Double d14 = this.upperBound;
        Double d15 = this.stepSize;
        Integer num = this.padTo;
        String str = this.prefix;
        List<WheelOption> list = this.options;
        StringBuilder sb4 = new StringBuilder("WheelContent(type=");
        sb4.append(wheelContentType);
        sb4.append(", lowerBound=");
        sb4.append(d3);
        sb4.append(", upperBound=");
        AbstractC21702c.m61146q(sb4, d14, ", stepSize=", d15, ", padTo=");
        AbstractC13673n.m38577x(num, ", prefix=", str, ", options=", sb4);
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public WheelContent(WheelContentType type, Double d3, Double d14, Double d15, Integer num, String str, List<WheelOption> options) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(options, "options");
        this.type = type;
        this.lowerBound = d3;
        this.upperBound = d14;
        this.stepSize = d15;
        this.padTo = num;
        this.prefix = str;
        this.options = options;
    }

    public /* synthetic */ WheelContent(WheelContentType wheelContentType, Double d3, Double d14, Double d15, Integer num, String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(wheelContentType, d3, d14, d15, num, str, (i13 & 64) != 0 ? C25271y.f99162w : list);
    }
}
