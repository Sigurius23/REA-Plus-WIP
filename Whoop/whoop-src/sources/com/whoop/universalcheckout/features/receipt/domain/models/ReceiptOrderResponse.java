package com.whoop.universalcheckout.features.receipt.domain.models;

import ad3.C0771n;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cp0.C10977m;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JN\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010!R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010#¨\u00067"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;", "", "", "title", "", "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;", "sections", "Lcom/whoop/navigation/models/GenericInteraction;", "closeInteraction", "", "Lkotlinx/serialization/json/JsonElement;", "analyticsPayload", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/navigation/models/GenericInteraction;", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSections", "Lcom/whoop/navigation/models/GenericInteraction;", "getCloseInteraction", "Ljava/util/Map;", "getAnalyticsPayload", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReceiptOrderResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, JsonElement> analyticsPayload;
    private final GenericInteraction closeInteraction;
    private final List<ReceiptSectionModel> sections;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReceiptOrderResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C10977m(20)), null, AbstractC30060g.m92087G(enumC23463i, new C10977m(21))};
    }

    public /* synthetic */ ReceiptOrderResponse(int i13, String str, List list, GenericInteraction genericInteraction, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ReceiptOrderResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.sections = list;
        if ((i13 & 4) == 0) {
            this.closeInteraction = null;
        } else {
            this.closeInteraction = genericInteraction;
        }
        if ((i13 & 8) == 0) {
            this.analyticsPayload = null;
        } else {
            this.analyticsPayload = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ReceiptSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReceiptOrderResponse copy$default(ReceiptOrderResponse receiptOrderResponse, String str, List list, GenericInteraction genericInteraction, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = receiptOrderResponse.title;
        }
        if ((i13 & 2) != 0) {
            list = receiptOrderResponse.sections;
        }
        if ((i13 & 4) != 0) {
            genericInteraction = receiptOrderResponse.closeInteraction;
        }
        if ((i13 & 8) != 0) {
            map = receiptOrderResponse.analyticsPayload;
        }
        return receiptOrderResponse.copy(str, list, genericInteraction, map);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(ReceiptOrderResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.closeInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, GenericInteraction$$serializer.INSTANCE, self.closeInteraction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.analyticsPayload == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.analyticsPayload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ReceiptSectionModel> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GenericInteraction getCloseInteraction() {
        return this.closeInteraction;
    }

    public final Map<String, JsonElement> component4() {
        return this.analyticsPayload;
    }

    public final ReceiptOrderResponse copy(String title, List<ReceiptSectionModel> sections, GenericInteraction closeInteraction, Map<String, ? extends JsonElement> analyticsPayload) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        return new ReceiptOrderResponse(title, sections, closeInteraction, analyticsPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptOrderResponse)) {
            return false;
        }
        ReceiptOrderResponse receiptOrderResponse = (ReceiptOrderResponse) other;
        return AbstractC22676k.m65745e(this.title, receiptOrderResponse.title) && AbstractC22676k.m65745e(this.sections, receiptOrderResponse.sections) && AbstractC22676k.m65745e(this.closeInteraction, receiptOrderResponse.closeInteraction) && AbstractC22676k.m65745e(this.analyticsPayload, receiptOrderResponse.analyticsPayload);
    }

    public final Map<String, JsonElement> getAnalyticsPayload() {
        return this.analyticsPayload;
    }

    public final GenericInteraction getCloseInteraction() {
        return this.closeInteraction;
    }

    public final List<ReceiptSectionModel> getSections() {
        return this.sections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.sections);
        GenericInteraction genericInteraction = this.closeInteraction;
        int iHashCode = (iM31983b + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        Map<String, JsonElement> map = this.analyticsPayload;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<ReceiptSectionModel> list = this.sections;
        GenericInteraction genericInteraction = this.closeInteraction;
        Map<String, JsonElement> map = this.analyticsPayload;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ReceiptOrderResponse(title=", str, ", sections=", ", closeInteraction=", list);
        sbM94766o.append(genericInteraction);
        sbM94766o.append(", analyticsPayload=");
        sbM94766o.append(map);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiptOrderResponse(String title, List<ReceiptSectionModel> sections, GenericInteraction genericInteraction, Map<String, ? extends JsonElement> map) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        this.title = title;
        this.sections = sections;
        this.closeInteraction = genericInteraction;
        this.analyticsPayload = map;
    }

    public /* synthetic */ ReceiptOrderResponse(String str, List list, GenericInteraction genericInteraction, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i13 & 4) != 0 ? null : genericInteraction, (i13 & 8) != 0 ? null : map);
    }
}
