package com.whoop.nativestore.pdp.domain.model;

import c13.AbstractC3855a;
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
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
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
import zz1.C41253a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010%J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b3\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;", "", "", "wywSku", "wywInitialPrice", "", "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayComponentMetadata;", "wywComponentMetadata", "wywDeviceProductKey", "", "wywImageLabelOrder", "", "wywCustomizationFeeAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "component5", "()Ljava/util/List;", "component6", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;I)Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWywSku", "getWywInitialPrice", "Ljava/util/Map;", "getWywComponentMetadata", "getWywDeviceProductKey", "Ljava/util/List;", "getWywImageLabelOrder", "I", "getWywCustomizationFeeAmount", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopYourWayMetadata {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, WhoopYourWayComponentMetadata> wywComponentMetadata;
    private final int wywCustomizationFeeAmount;
    private final String wywDeviceProductKey;
    private final List<String> wywImageLabelOrder;
    private final String wywInitialPrice;
    private final String wywSku;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.WhoopYourWayMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopYourWayMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C41253a(13)), null, AbstractC30060g.m92087G(enumC23463i, new C41253a(14)), null};
    }

    public /* synthetic */ WhoopYourWayMetadata(int i13, String str, String str2, Map map, String str3, List list, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i13 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 11, WhoopYourWayMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.wywSku = str;
        this.wywInitialPrice = str2;
        if ((i13 & 4) == 0) {
            this.wywComponentMetadata = C25272z.f99163w;
        } else {
            this.wywComponentMetadata = map;
        }
        this.wywDeviceProductKey = str3;
        if ((i13 & 16) == 0) {
            this.wywImageLabelOrder = C25271y.f99162w;
        } else {
            this.wywImageLabelOrder = list;
        }
        if ((i13 & 32) == 0) {
            this.wywCustomizationFeeAmount = 0;
        } else {
            this.wywCustomizationFeeAmount = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, WhoopYourWayComponentMetadata$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhoopYourWayMetadata copy$default(WhoopYourWayMetadata whoopYourWayMetadata, String str, String str2, Map map, String str3, List list, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = whoopYourWayMetadata.wywSku;
        }
        if ((i14 & 2) != 0) {
            str2 = whoopYourWayMetadata.wywInitialPrice;
        }
        if ((i14 & 4) != 0) {
            map = whoopYourWayMetadata.wywComponentMetadata;
        }
        if ((i14 & 8) != 0) {
            str3 = whoopYourWayMetadata.wywDeviceProductKey;
        }
        if ((i14 & 16) != 0) {
            list = whoopYourWayMetadata.wywImageLabelOrder;
        }
        if ((i14 & 32) != 0) {
            i13 = whoopYourWayMetadata.wywCustomizationFeeAmount;
        }
        List list2 = list;
        int i15 = i13;
        return whoopYourWayMetadata.copy(str, str2, map, str3, list2, i15);
    }

    public static final /* synthetic */ void write$Self$native_store_release(WhoopYourWayMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.wywSku);
        output.encodeStringElement(serialDesc, 1, self.wywInitialPrice);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.wywComponentMetadata, C25272z.f99163w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.wywComponentMetadata);
        }
        output.encodeStringElement(serialDesc, 3, self.wywDeviceProductKey);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.wywImageLabelOrder, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.wywImageLabelOrder);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.wywCustomizationFeeAmount == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 5, self.wywCustomizationFeeAmount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWywSku() {
        return this.wywSku;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWywInitialPrice() {
        return this.wywInitialPrice;
    }

    public final Map<String, WhoopYourWayComponentMetadata> component3() {
        return this.wywComponentMetadata;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWywDeviceProductKey() {
        return this.wywDeviceProductKey;
    }

    public final List<String> component5() {
        return this.wywImageLabelOrder;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWywCustomizationFeeAmount() {
        return this.wywCustomizationFeeAmount;
    }

    public final WhoopYourWayMetadata copy(String wywSku, String wywInitialPrice, Map<String, WhoopYourWayComponentMetadata> wywComponentMetadata, String wywDeviceProductKey, List<String> wywImageLabelOrder, int wywCustomizationFeeAmount) {
        AbstractC22676k.m65750j(wywSku, "wywSku");
        AbstractC22676k.m65750j(wywInitialPrice, "wywInitialPrice");
        AbstractC22676k.m65750j(wywComponentMetadata, "wywComponentMetadata");
        AbstractC22676k.m65750j(wywDeviceProductKey, "wywDeviceProductKey");
        AbstractC22676k.m65750j(wywImageLabelOrder, "wywImageLabelOrder");
        return new WhoopYourWayMetadata(wywSku, wywInitialPrice, wywComponentMetadata, wywDeviceProductKey, wywImageLabelOrder, wywCustomizationFeeAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopYourWayMetadata)) {
            return false;
        }
        WhoopYourWayMetadata whoopYourWayMetadata = (WhoopYourWayMetadata) other;
        return AbstractC22676k.m65745e(this.wywSku, whoopYourWayMetadata.wywSku) && AbstractC22676k.m65745e(this.wywInitialPrice, whoopYourWayMetadata.wywInitialPrice) && AbstractC22676k.m65745e(this.wywComponentMetadata, whoopYourWayMetadata.wywComponentMetadata) && AbstractC22676k.m65745e(this.wywDeviceProductKey, whoopYourWayMetadata.wywDeviceProductKey) && AbstractC22676k.m65745e(this.wywImageLabelOrder, whoopYourWayMetadata.wywImageLabelOrder) && this.wywCustomizationFeeAmount == whoopYourWayMetadata.wywCustomizationFeeAmount;
    }

    public final Map<String, WhoopYourWayComponentMetadata> getWywComponentMetadata() {
        return this.wywComponentMetadata;
    }

    public final int getWywCustomizationFeeAmount() {
        return this.wywCustomizationFeeAmount;
    }

    public final String getWywDeviceProductKey() {
        return this.wywDeviceProductKey;
    }

    public final List<String> getWywImageLabelOrder() {
        return this.wywImageLabelOrder;
    }

    public final String getWywInitialPrice() {
        return this.wywInitialPrice;
    }

    public final String getWywSku() {
        return this.wywSku;
    }

    public int hashCode() {
        return Integer.hashCode(this.wywCustomizationFeeAmount) + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC3855a.m11821e(this.wywComponentMetadata, AbstractC11266d.m30450d(this.wywSku.hashCode() * 31, 31, this.wywInitialPrice), 31), 31, this.wywDeviceProductKey), 31, this.wywImageLabelOrder);
    }

    public String toString() {
        String str = this.wywSku;
        String str2 = this.wywInitialPrice;
        Map<String, WhoopYourWayComponentMetadata> map = this.wywComponentMetadata;
        String str3 = this.wywDeviceProductKey;
        List<String> list = this.wywImageLabelOrder;
        int i13 = this.wywCustomizationFeeAmount;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WhoopYourWayMetadata(wywSku=", str, ", wywInitialPrice=", str2, ", wywComponentMetadata=");
        sbM32001t.append(map);
        sbM32001t.append(", wywDeviceProductKey=");
        sbM32001t.append(str3);
        sbM32001t.append(", wywImageLabelOrder=");
        sbM32001t.append(list);
        sbM32001t.append(", wywCustomizationFeeAmount=");
        sbM32001t.append(i13);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public WhoopYourWayMetadata(String wywSku, String wywInitialPrice, Map<String, WhoopYourWayComponentMetadata> wywComponentMetadata, String wywDeviceProductKey, List<String> wywImageLabelOrder, int i13) {
        AbstractC22676k.m65750j(wywSku, "wywSku");
        AbstractC22676k.m65750j(wywInitialPrice, "wywInitialPrice");
        AbstractC22676k.m65750j(wywComponentMetadata, "wywComponentMetadata");
        AbstractC22676k.m65750j(wywDeviceProductKey, "wywDeviceProductKey");
        AbstractC22676k.m65750j(wywImageLabelOrder, "wywImageLabelOrder");
        this.wywSku = wywSku;
        this.wywInitialPrice = wywInitialPrice;
        this.wywComponentMetadata = wywComponentMetadata;
        this.wywDeviceProductKey = wywDeviceProductKey;
        this.wywImageLabelOrder = wywImageLabelOrder;
        this.wywCustomizationFeeAmount = i13;
    }

    public /* synthetic */ WhoopYourWayMetadata(String str, String str2, Map map, String str3, List list, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i14 & 4) != 0 ? C25272z.f99163w : map, str3, (i14 & 16) != 0 ? C25271y.f99162w : list, (i14 & 32) != 0 ? 0 : i13);
    }
}
