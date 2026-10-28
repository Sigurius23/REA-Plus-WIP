package com.whoop.health.monitor.medical.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hy0.EnumC17727b2;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import md1.C25452a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wi0.C37312d;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0081\b\u0018\u0000 E2\u00020\u0001:\u0002FEBg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012Bw\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJp\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010 R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010\"R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bC\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bD\u0010\u001e¨\u0006G"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lhy0/b2;", "trendType", "", "icon", "Lcom/whoop/navigation/e;", "destination", "", "", "samples", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;", "readings", "trailingTimestamp", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Lhy0/b2;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/whoop/navigation/e;", "component6", "()Ljava/util/List;", "component7", "component8", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$kennel_release", "(Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Lhy0/b2;", "getTrendType", "Ljava/lang/String;", "getIcon", "Lcom/whoop/navigation/e;", "getDestination", "Ljava/util/List;", "getSamples", "getReadings", "getTrailingTimestamp", "Companion", "$serializer", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabradorResultModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final String icon;
    private final List<ShepherdReadingModel> readings;
    private final List<Double> samples;
    private final TextResource subtitle;
    private final TextResource title;
    private final String trailingTimestamp;
    private final EnumC17727b2 trendType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;", "serializer", "()Lwc3/c;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabradorResultModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C37312d(5)), null, AbstractC30060g.m92087G(enumC23463i, new C37312d(6)), AbstractC30060g.m92087G(enumC23463i, new C37312d(7)), AbstractC30060g.m92087G(enumC23463i, new C37312d(8)), null};
    }

    public LabradorResultModel() {
        this((TextResource) null, (TextResource) null, (EnumC17727b2) null, (String) null, (C9598e) null, (List) null, (List) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.TrendTypeState", EnumC17727b2.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(DoubleSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(ShepherdReadingModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabradorResultModel copy$default(LabradorResultModel labradorResultModel, TextResource textResource, TextResource textResource2, EnumC17727b2 enumC17727b2, String str, C9598e c9598e, List list, List list2, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = labradorResultModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = labradorResultModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            enumC17727b2 = labradorResultModel.trendType;
        }
        if ((i13 & 8) != 0) {
            str = labradorResultModel.icon;
        }
        if ((i13 & 16) != 0) {
            c9598e = labradorResultModel.destination;
        }
        if ((i13 & 32) != 0) {
            list = labradorResultModel.samples;
        }
        if ((i13 & 64) != 0) {
            list2 = labradorResultModel.readings;
        }
        if ((i13 & 128) != 0) {
            str2 = labradorResultModel.trailingTimestamp;
        }
        List list3 = list2;
        String str3 = str2;
        C9598e c9598e2 = c9598e;
        List list4 = list;
        return labradorResultModel.copy(textResource, textResource2, enumC17727b2, str, c9598e2, list4, list3, str3);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    public static final /* synthetic */ void write$Self$kennel_release(LabradorResultModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.subtitle, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.trendType != EnumC17727b2.NEUTRAL) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.trendType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.icon, "")) {
            output.encodeStringElement(serialDesc, 3, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
        } else {
            if (!AbstractC22676k.m65745e(self.destination, new C9598e(null, null, null, 7, null))) {
                output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.samples != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.samples);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.readings, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.readings);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.trailingTimestamp == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.trailingTimestamp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC17727b2 getTrendType() {
        return this.trendType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final List<Double> component6() {
        return this.samples;
    }

    public final List<ShepherdReadingModel> component7() {
        return this.readings;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTrailingTimestamp() {
        return this.trailingTimestamp;
    }

    public final LabradorResultModel copy(TextResource title, TextResource subtitle, EnumC17727b2 trendType, String icon, C9598e destination, List<Double> samples, List<ShepherdReadingModel> readings, String trailingTimestamp) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(trendType, "trendType");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(readings, "readings");
        return new LabradorResultModel(title, subtitle, trendType, icon, destination, samples, readings, trailingTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorResultModel)) {
            return false;
        }
        LabradorResultModel labradorResultModel = (LabradorResultModel) other;
        return AbstractC22676k.m65745e(this.title, labradorResultModel.title) && AbstractC22676k.m65745e(this.subtitle, labradorResultModel.subtitle) && this.trendType == labradorResultModel.trendType && AbstractC22676k.m65745e(this.icon, labradorResultModel.icon) && AbstractC22676k.m65745e(this.destination, labradorResultModel.destination) && AbstractC22676k.m65745e(this.samples, labradorResultModel.samples) && AbstractC22676k.m65745e(this.readings, labradorResultModel.readings) && AbstractC22676k.m65745e(this.trailingTimestamp, labradorResultModel.trailingTimestamp);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final List<ShepherdReadingModel> getReadings() {
        return this.readings;
    }

    public final List<Double> getSamples() {
        return this.samples;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final String getTrailingTimestamp() {
        return this.trailingTimestamp;
    }

    public final EnumC17727b2 getTrendType() {
        return this.trendType;
    }

    public int hashCode() {
        int iM114673a = AbstractC36095b.m114673a(this.destination, AbstractC11266d.m30450d((this.trendType.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31)) * 31, 31, this.icon), 31);
        List<Double> list = this.samples;
        int iM31983b = AbstractC11895b.m31983b((iM114673a + (list == null ? 0 : list.hashCode())) * 31, 31, this.readings);
        String str = this.trailingTimestamp;
        return iM31983b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        EnumC17727b2 enumC17727b2 = this.trendType;
        String str = this.icon;
        C9598e c9598e = this.destination;
        List<Double> list = this.samples;
        List<ShepherdReadingModel> list2 = this.readings;
        String str2 = this.trailingTimestamp;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("LabradorResultModel(title=", textResource, ", subtitle=", textResource2, ", trendType=");
        sbM106658q.append(enumC17727b2);
        sbM106658q.append(", icon=");
        sbM106658q.append(str);
        sbM106658q.append(", destination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", samples=");
        sbM106658q.append(list);
        sbM106658q.append(", readings=");
        return AbstractC38963t7.m124377g(", trailingTimestamp=", str2, ")", sbM106658q, list2);
    }

    public /* synthetic */ LabradorResultModel(int i13, TextResource textResource, TextResource textResource2, EnumC17727b2 enumC17727b2, String str, C9598e c9598e, List list, List list2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.subtitle = AbstractC8693b.m21267a();
        } else {
            this.subtitle = textResource2;
        }
        if ((i13 & 4) == 0) {
            this.trendType = EnumC17727b2.NEUTRAL;
        } else {
            this.trendType = enumC17727b2;
        }
        if ((i13 & 8) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
        if ((i13 & 16) == 0) {
            this.destination = new C9598e(null, null, null, 7, null);
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 32) == 0) {
            this.samples = null;
        } else {
            this.samples = list;
        }
        if ((i13 & 64) == 0) {
            this.readings = C25271y.f99162w;
        } else {
            this.readings = list2;
        }
        if ((i13 & 128) == 0) {
            this.trailingTimestamp = null;
        } else {
            this.trailingTimestamp = str2;
        }
    }

    public LabradorResultModel(TextResource title, TextResource subtitle, EnumC17727b2 trendType, String icon, C9598e destination, List<Double> list, List<ShepherdReadingModel> readings, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(trendType, "trendType");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(readings, "readings");
        this.title = title;
        this.subtitle = subtitle;
        this.trendType = trendType;
        this.icon = icon;
        this.destination = destination;
        this.samples = list;
        this.readings = readings;
        this.trailingTimestamp = str;
    }

    public /* synthetic */ LabradorResultModel(TextResource textResource, TextResource textResource2, EnumC17727b2 enumC17727b2, String str, C9598e c9598e, List list, List list2, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? EnumC17727b2.NEUTRAL : enumC17727b2, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? new C9598e(null, null, null, 7, null) : c9598e, (i13 & 32) != 0 ? null : list, (i13 & 64) != 0 ? C25271y.f99162w : list2, (i13 & 128) != 0 ? null : str2);
    }
}
