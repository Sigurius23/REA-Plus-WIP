package com.whoop.analytics;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ep0.C13395a;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\rBo\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\tHÆ\u0003¢\u0006\u0004\b#\u0010$Jl\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001dR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u0006:"}, m65681d2 = {"Lcom/whoop/analytics/AnalyticEventModel;", "", "", "name", "category", "source", "action", "label", "value", "", "Lkotlinx/serialization/json/JsonElement;", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$analytics_release", "(Lcom/whoop/analytics/AnalyticEventModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/analytics/AnalyticEventModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getCategory", "getSource", "getAction", "getLabel", "getValue", "Ljava/util/Map;", "getProperties", "Companion", "$serializer", "a", "analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AnalyticEventModel {
    private final String action;
    private final String category;
    private final String label;
    private final String name;
    private final Map<String, JsonElement> properties;
    private final String source;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13395a(6))};

    /* JADX INFO: renamed from: com.whoop.analytics.AnalyticEventModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/analytics/AnalyticEventModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/analytics/AnalyticEventModel;", "serializer", "()Lwc3/c;", "analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AnalyticEventModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AnalyticEventModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, AnalyticEventModel$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.category = str2;
        if ((i13 & 4) == 0) {
            this.source = null;
        } else {
            this.source = str3;
        }
        if ((i13 & 8) == 0) {
            this.action = null;
        } else {
            this.action = str4;
        }
        if ((i13 & 16) == 0) {
            this.label = null;
        } else {
            this.label = str5;
        }
        if ((i13 & 32) == 0) {
            this.value = null;
        } else {
            this.value = str6;
        }
        if ((i13 & 64) == 0) {
            this.properties = C25272z.f99163w;
        } else {
            this.properties = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, AbstractC38195a.m122336d(C0771n.f2806a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticEventModel copy$default(AnalyticEventModel analyticEventModel, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = analyticEventModel.name;
        }
        if ((i13 & 2) != 0) {
            str2 = analyticEventModel.category;
        }
        if ((i13 & 4) != 0) {
            str3 = analyticEventModel.source;
        }
        if ((i13 & 8) != 0) {
            str4 = analyticEventModel.action;
        }
        if ((i13 & 16) != 0) {
            str5 = analyticEventModel.label;
        }
        if ((i13 & 32) != 0) {
            str6 = analyticEventModel.value;
        }
        if ((i13 & 64) != 0) {
            map = analyticEventModel.properties;
        }
        String str7 = str6;
        Map map2 = map;
        String str8 = str5;
        String str9 = str3;
        return analyticEventModel.copy(str, str2, str9, str4, str8, str7, map2);
    }

    public static final /* synthetic */ void write$Self$analytics_release(AnalyticEventModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeStringElement(serialDesc, 1, self.category);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.value);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && AbstractC22676k.m65745e(self.properties, C25272z.f99163w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.properties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final Map<String, JsonElement> component7() {
        return this.properties;
    }

    public final AnalyticEventModel copy(String name, String category, String source, String action, String label, String value, Map<String, ? extends JsonElement> properties) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(properties, "properties");
        return new AnalyticEventModel(name, category, source, action, label, value, properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticEventModel)) {
            return false;
        }
        AnalyticEventModel analyticEventModel = (AnalyticEventModel) other;
        return AbstractC22676k.m65745e(this.name, analyticEventModel.name) && AbstractC22676k.m65745e(this.category, analyticEventModel.category) && AbstractC22676k.m65745e(this.source, analyticEventModel.source) && AbstractC22676k.m65745e(this.action, analyticEventModel.action) && AbstractC22676k.m65745e(this.label, analyticEventModel.label) && AbstractC22676k.m65745e(this.value, analyticEventModel.value) && AbstractC22676k.m65745e(this.properties, analyticEventModel.properties);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, JsonElement> getProperties() {
        return this.properties;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.category);
        String str = this.source;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.value;
        return this.properties.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.category;
        String str3 = this.source;
        String str4 = this.action;
        String str5 = this.label;
        String str6 = this.value;
        Map<String, JsonElement> map = this.properties;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AnalyticEventModel(name=", str, ", category=", str2, ", source=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", action=", str4, ", label=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", value=", str6, ", properties=");
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticEventModel(String name, String category, String str, String str2, String str3, String str4, Map<String, ? extends JsonElement> properties) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(properties, "properties");
        this.name = name;
        this.category = category;
        this.source = str;
        this.action = str2;
        this.label = str3;
        this.value = str4;
        this.properties = properties;
    }

    public /* synthetic */ AnalyticEventModel(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? C25272z.f99163w : map);
    }
}
