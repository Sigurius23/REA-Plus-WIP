package com.whoop.universalcheckout.features.shippingmethod.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33691b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBi\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u00069"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;", "", "", "type", "id", "ctaText", "title", "", "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;", "shippingMethods", "", "analyticsPayload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getId", "getCtaText", "getTitle", "Ljava/util/List;", "getShippingMethods", "Ljava/util/Map;", "getAnalyticsPayload", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShippingMethodModels {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, Object> analyticsPayload;
    private final String ctaText;
    private final String id;
    private final List<ShippingMethod> shippingMethods;
    private final String title;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShippingMethodModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33691b(24)), AbstractC30060g.m92087G(enumC23463i, new C33691b(25))};
    }

    public /* synthetic */ ShippingMethodModels(int i13, String str, String str2, String str3, String str4, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ShippingMethodModels$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.id = str2;
        this.ctaText = str3;
        this.title = str4;
        this.shippingMethods = list;
        if ((i13 & 32) == 0) {
            this.analyticsPayload = null;
        } else {
            this.analyticsPayload = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ShippingMethod$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(Object.class), null, new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShippingMethodModels copy$default(ShippingMethodModels shippingMethodModels, String str, String str2, String str3, String str4, List list, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shippingMethodModels.type;
        }
        if ((i13 & 2) != 0) {
            str2 = shippingMethodModels.id;
        }
        if ((i13 & 4) != 0) {
            str3 = shippingMethodModels.ctaText;
        }
        if ((i13 & 8) != 0) {
            str4 = shippingMethodModels.title;
        }
        if ((i13 & 16) != 0) {
            list = shippingMethodModels.shippingMethods;
        }
        if ((i13 & 32) != 0) {
            map = shippingMethodModels.analyticsPayload;
        }
        List list2 = list;
        Map map2 = map;
        return shippingMethodModels.copy(str, str2, str3, str4, list2, map2);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(ShippingMethodModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeStringElement(serialDesc, 2, self.ctaText);
        output.encodeStringElement(serialDesc, 3, self.title);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.shippingMethods);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.analyticsPayload == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.analyticsPayload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ShippingMethod> component5() {
        return this.shippingMethods;
    }

    public final Map<String, Object> component6() {
        return this.analyticsPayload;
    }

    public final ShippingMethodModels copy(String type, String id4, String ctaText, String title, List<ShippingMethod> shippingMethods, Map<String, ? extends Object> analyticsPayload) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(shippingMethods, "shippingMethods");
        return new ShippingMethodModels(type, id4, ctaText, title, shippingMethods, analyticsPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShippingMethodModels)) {
            return false;
        }
        ShippingMethodModels shippingMethodModels = (ShippingMethodModels) other;
        return AbstractC22676k.m65745e(this.type, shippingMethodModels.type) && AbstractC22676k.m65745e(this.id, shippingMethodModels.id) && AbstractC22676k.m65745e(this.ctaText, shippingMethodModels.ctaText) && AbstractC22676k.m65745e(this.title, shippingMethodModels.title) && AbstractC22676k.m65745e(this.shippingMethods, shippingMethodModels.shippingMethods) && AbstractC22676k.m65745e(this.analyticsPayload, shippingMethodModels.analyticsPayload);
    }

    public final Map<String, Object> getAnalyticsPayload() {
        return this.analyticsPayload;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ShippingMethod> getShippingMethods() {
        return this.shippingMethods;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.id), 31, this.ctaText), 31, this.title), 31, this.shippingMethods);
        Map<String, Object> map = this.analyticsPayload;
        return iM31983b + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        String str = this.type;
        String str2 = this.id;
        String str3 = this.ctaText;
        String str4 = this.title;
        List<ShippingMethod> list = this.shippingMethods;
        Map<String, Object> map = this.analyticsPayload;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShippingMethodModels(type=", str, ", id=", str2, ", ctaText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", title=", str4, ", shippingMethods=");
        sbM32001t.append(list);
        sbM32001t.append(", analyticsPayload=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ShippingMethodModels(String type, String id4, String ctaText, String title, List<ShippingMethod> shippingMethods, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(shippingMethods, "shippingMethods");
        this.type = type;
        this.id = id4;
        this.ctaText = ctaText;
        this.title = title;
        this.shippingMethods = shippingMethods;
        this.analyticsPayload = map;
    }

    public /* synthetic */ ShippingMethodModels(String str, String str2, String str3, String str4, List list, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, (i13 & 32) != 0 ? null : map);
    }
}
