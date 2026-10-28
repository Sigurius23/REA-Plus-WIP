package com.whoop.hormonalinsights.postpartum.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gp1.C16065a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJP\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b5\u0010\u001d¨\u00068"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;", "", "", "deliveryDate", "Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;", "deliveryMethod", "", "Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;", "babies", "", "turnOnStealth", "pregnancyName", "<init>", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;", "component3", "()Ljava/util/List;", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeliveryDate", "Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;", "getDeliveryMethod", "Ljava/util/List;", "getBabies", "Z", "getTurnOnStealth", "getPregnancyName", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PostPartumRequest {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<BabyData> babies;
    private final String deliveryDate;
    private final DeliveryType deliveryMethod;
    private final String pregnancyName;
    private final boolean turnOnStealth;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PostPartumRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C16065a(3)), AbstractC30060g.m92087G(enumC23463i, new C16065a(4)), null, null};
    }

    public /* synthetic */ PostPartumRequest(int i13, String str, DeliveryType deliveryType, List list, boolean z4, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, PostPartumRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.deliveryDate = str;
        this.deliveryMethod = deliveryType;
        this.babies = list;
        this.turnOnStealth = z4;
        this.pregnancyName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.DeliveryType", DeliveryType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(BabyData$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostPartumRequest copy$default(PostPartumRequest postPartumRequest, String str, DeliveryType deliveryType, List list, boolean z4, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = postPartumRequest.deliveryDate;
        }
        if ((i13 & 2) != 0) {
            deliveryType = postPartumRequest.deliveryMethod;
        }
        if ((i13 & 4) != 0) {
            list = postPartumRequest.babies;
        }
        if ((i13 & 8) != 0) {
            z4 = postPartumRequest.turnOnStealth;
        }
        if ((i13 & 16) != 0) {
            str2 = postPartumRequest.pregnancyName;
        }
        String str3 = str2;
        List list2 = list;
        return postPartumRequest.copy(str, deliveryType, list2, z4, str3);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(PostPartumRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.deliveryDate);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.deliveryMethod);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.babies);
        output.encodeBooleanElement(serialDesc, 3, self.turnOnStealth);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.pregnancyName);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeliveryDate() {
        return this.deliveryDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeliveryType getDeliveryMethod() {
        return this.deliveryMethod;
    }

    public final List<BabyData> component3() {
        return this.babies;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getTurnOnStealth() {
        return this.turnOnStealth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPregnancyName() {
        return this.pregnancyName;
    }

    public final PostPartumRequest copy(String deliveryDate, DeliveryType deliveryMethod, List<BabyData> babies, boolean turnOnStealth, String pregnancyName) {
        return new PostPartumRequest(deliveryDate, deliveryMethod, babies, turnOnStealth, pregnancyName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostPartumRequest)) {
            return false;
        }
        PostPartumRequest postPartumRequest = (PostPartumRequest) other;
        return AbstractC22676k.m65745e(this.deliveryDate, postPartumRequest.deliveryDate) && this.deliveryMethod == postPartumRequest.deliveryMethod && AbstractC22676k.m65745e(this.babies, postPartumRequest.babies) && this.turnOnStealth == postPartumRequest.turnOnStealth && AbstractC22676k.m65745e(this.pregnancyName, postPartumRequest.pregnancyName);
    }

    public final List<BabyData> getBabies() {
        return this.babies;
    }

    public final String getDeliveryDate() {
        return this.deliveryDate;
    }

    public final DeliveryType getDeliveryMethod() {
        return this.deliveryMethod;
    }

    public final String getPregnancyName() {
        return this.pregnancyName;
    }

    public final boolean getTurnOnStealth() {
        return this.turnOnStealth;
    }

    public int hashCode() {
        String str = this.deliveryDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeliveryType deliveryType = this.deliveryMethod;
        int iHashCode2 = (iHashCode + (deliveryType == null ? 0 : deliveryType.hashCode())) * 31;
        List<BabyData> list = this.babies;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.turnOnStealth);
        String str2 = this.pregnancyName;
        return iM8289b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.deliveryDate;
        DeliveryType deliveryType = this.deliveryMethod;
        List<BabyData> list = this.babies;
        boolean z4 = this.turnOnStealth;
        String str2 = this.pregnancyName;
        StringBuilder sb4 = new StringBuilder("PostPartumRequest(deliveryDate=");
        sb4.append(str);
        sb4.append(", deliveryMethod=");
        sb4.append(deliveryType);
        sb4.append(", babies=");
        AbstractC26725a.m79512p(", turnOnStealth=", ", pregnancyName=", sb4, list, z4);
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public PostPartumRequest(String str, DeliveryType deliveryType, List<BabyData> list, boolean z4, String str2) {
        this.deliveryDate = str;
        this.deliveryMethod = deliveryType;
        this.babies = list;
        this.turnOnStealth = z4;
        this.pregnancyName = str2;
    }
}
