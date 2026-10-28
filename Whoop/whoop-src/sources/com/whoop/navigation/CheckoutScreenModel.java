package com.whoop.navigation;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j00.C21118u;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bB[\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00066"}, m65681d2 = {"Lcom/whoop/navigation/CheckoutScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "path", "", "payload", "paymentMethodId", "", "skipConfirmation", "category", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/CheckoutScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/whoop/navigation/CheckoutScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Ljava/util/Map;", "getPayload", "getPaymentMethodId", "Ljava/lang/Boolean;", "getSkipConfirmation", "getCategory", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CheckoutScreenModel implements CommonNavigationScreenModel {
    private final String category;
    private final String path;
    private final Map<String, String> payload;
    private final String paymentMethodId;
    private final Boolean skipConfirmation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21118u(9)), null, null, null};

    /* JADX INFO: renamed from: com.whoop.navigation.CheckoutScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/CheckoutScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/CheckoutScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CheckoutScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CheckoutScreenModel(int i13, String str, Map map, String str2, Boolean bool, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, CheckoutScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.path = "";
        } else {
            this.path = str;
        }
        this.payload = map;
        if ((i13 & 4) == 0) {
            this.paymentMethodId = "";
        } else {
            this.paymentMethodId = str2;
        }
        if ((i13 & 8) == 0) {
            this.skipConfirmation = Boolean.TRUE;
        } else {
            this.skipConfirmation = bool;
        }
        if ((i13 & 16) == 0) {
            this.category = null;
        } else {
            this.category = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, AbstractC38195a.m122336d(stringSerializer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutScreenModel copy$default(CheckoutScreenModel checkoutScreenModel, String str, Map map, String str2, Boolean bool, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = checkoutScreenModel.path;
        }
        if ((i13 & 2) != 0) {
            map = checkoutScreenModel.payload;
        }
        if ((i13 & 4) != 0) {
            str2 = checkoutScreenModel.paymentMethodId;
        }
        if ((i13 & 8) != 0) {
            bool = checkoutScreenModel.skipConfirmation;
        }
        if ((i13 & 16) != 0) {
            str3 = checkoutScreenModel.category;
        }
        String str4 = str3;
        String str5 = str2;
        return checkoutScreenModel.copy(str, map, str5, bool, str4);
    }

    public static final /* synthetic */ void write$Self$navigation_release(CheckoutScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.path, "")) {
            output.encodeStringElement(serialDesc, 0, self.path);
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.payload);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.paymentMethodId, "")) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.paymentMethodId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.skipConfirmation, Boolean.TRUE)) {
            output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.skipConfirmation);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.category == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.category);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final Map<String, String> component2() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSkipConfirmation() {
        return this.skipConfirmation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final CheckoutScreenModel copy(String path, Map<String, String> payload, String paymentMethodId, Boolean skipConfirmation, String category) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(payload, "payload");
        return new CheckoutScreenModel(path, payload, paymentMethodId, skipConfirmation, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutScreenModel)) {
            return false;
        }
        CheckoutScreenModel checkoutScreenModel = (CheckoutScreenModel) other;
        return AbstractC22676k.m65745e(this.path, checkoutScreenModel.path) && AbstractC22676k.m65745e(this.payload, checkoutScreenModel.payload) && AbstractC22676k.m65745e(this.paymentMethodId, checkoutScreenModel.paymentMethodId) && AbstractC22676k.m65745e(this.skipConfirmation, checkoutScreenModel.skipConfirmation) && AbstractC22676k.m65745e(this.category, checkoutScreenModel.category);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getPath() {
        return this.path;
    }

    public final Map<String, String> getPayload() {
        return this.payload;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final Boolean getSkipConfirmation() {
        return this.skipConfirmation;
    }

    public int hashCode() {
        int iM11821e = AbstractC3855a.m11821e(this.payload, this.path.hashCode() * 31, 31);
        String str = this.paymentMethodId;
        int iHashCode = (iM11821e + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.skipConfirmation;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.category;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.path;
        Map<String, String> map = this.payload;
        String str2 = this.paymentMethodId;
        Boolean bool = this.skipConfirmation;
        String str3 = this.category;
        StringBuilder sbM114686n = AbstractC36095b.m114686n("CheckoutScreenModel(path=", str, ", payload=", ", paymentMethodId=", map);
        AbstractC36095b.m114692t(bool, str2, ", skipConfirmation=", ", category=", sbM114686n);
        return AbstractC25012a.m73376i(str3, ")", sbM114686n);
    }

    public CheckoutScreenModel(String path, Map<String, String> payload, String str, Boolean bool, String str2) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(payload, "payload");
        this.path = path;
        this.payload = payload;
        this.paymentMethodId = str;
        this.skipConfirmation = bool;
        this.category = str2;
    }

    public /* synthetic */ CheckoutScreenModel(String str, Map map, String str2, Boolean bool, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, map, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? Boolean.TRUE : bool, (i13 & 16) != 0 ? null : str3);
    }
}
