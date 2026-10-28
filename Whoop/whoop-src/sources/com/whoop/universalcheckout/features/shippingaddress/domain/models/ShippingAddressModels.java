package com.whoop.universalcheckout.features.shippingaddress.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lj1.C24474b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JT\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00066"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;", "", "", "type", "id", "ctaText", "title", "countryCode", "", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;", "fields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getId", "getCtaText", "getTitle", "getCountryCode", "Ljava/util/List;", "getFields", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShippingAddressModels {
    private final String countryCode;
    private final String ctaText;
    private final List<ShippingAddressField> fields;
    private final String id;
    private final String title;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24474b(28))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShippingAddressModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShippingAddressModels(int i13, String str, String str2, String str3, String str4, String str5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (47 != (i13 & 47)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 47, ShippingAddressModels$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.id = str2;
        this.ctaText = str3;
        this.title = str4;
        if ((i13 & 16) == 0) {
            this.countryCode = null;
        } else {
            this.countryCode = str5;
        }
        this.fields = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ShippingAddressField$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShippingAddressModels copy$default(ShippingAddressModels shippingAddressModels, String str, String str2, String str3, String str4, String str5, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shippingAddressModels.type;
        }
        if ((i13 & 2) != 0) {
            str2 = shippingAddressModels.id;
        }
        if ((i13 & 4) != 0) {
            str3 = shippingAddressModels.ctaText;
        }
        if ((i13 & 8) != 0) {
            str4 = shippingAddressModels.title;
        }
        if ((i13 & 16) != 0) {
            str5 = shippingAddressModels.countryCode;
        }
        if ((i13 & 32) != 0) {
            list = shippingAddressModels.fields;
        }
        String str6 = str5;
        List list2 = list;
        return shippingAddressModels.copy(str, str2, str3, str4, str6, list2);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(ShippingAddressModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeStringElement(serialDesc, 2, self.ctaText);
        output.encodeStringElement(serialDesc, 3, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.countryCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.countryCode);
        }
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.fields);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<ShippingAddressField> component6() {
        return this.fields;
    }

    public final ShippingAddressModels copy(String type, String id4, String ctaText, String title, String countryCode, List<ShippingAddressField> fields) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(fields, "fields");
        return new ShippingAddressModels(type, id4, ctaText, title, countryCode, fields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShippingAddressModels)) {
            return false;
        }
        ShippingAddressModels shippingAddressModels = (ShippingAddressModels) other;
        return AbstractC22676k.m65745e(this.type, shippingAddressModels.type) && AbstractC22676k.m65745e(this.id, shippingAddressModels.id) && AbstractC22676k.m65745e(this.ctaText, shippingAddressModels.ctaText) && AbstractC22676k.m65745e(this.title, shippingAddressModels.title) && AbstractC22676k.m65745e(this.countryCode, shippingAddressModels.countryCode) && AbstractC22676k.m65745e(this.fields, shippingAddressModels.fields);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final List<ShippingAddressField> getFields() {
        return this.fields;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.id), 31, this.ctaText), 31, this.title);
        String str = this.countryCode;
        return this.fields.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.id;
        String str3 = this.ctaText;
        String str4 = this.title;
        String str5 = this.countryCode;
        List<ShippingAddressField> list = this.fields;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShippingAddressModels(type=", str, ", id=", str2, ", ctaText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", title=", str4, ", countryCode=");
        return AbstractC30007c.m91840j(str5, ", fields=", ")", sbM32001t, list);
    }

    public ShippingAddressModels(String type, String id4, String ctaText, String title, String str, List<ShippingAddressField> fields) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(fields, "fields");
        this.type = type;
        this.id = id4;
        this.ctaText = ctaText;
        this.title = title;
        this.countryCode = str;
        this.fields = fields;
    }

    public /* synthetic */ ShippingAddressModels(String str, String str2, String str3, String str4, String str5, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : str5, list);
    }
}
