package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import j02.C21137d0;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBY\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00066"}, m65681d2 = {"Lcom/whoop/navigation/ReferAFriendScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "shareMessage", "source", "checkoutOrigin", "", "analyticsProperties", "", "disableDefaultOpenSheetAnalytic", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/ReferAFriendScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;)Lcom/whoop/navigation/ReferAFriendScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShareMessage", "getSource", "getCheckoutOrigin", "Ljava/util/Map;", "getAnalyticsProperties", "Ljava/lang/Boolean;", "getDisableDefaultOpenSheetAnalytic", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReferAFriendScreenModel implements CommonNavigationScreenModel {
    private final Map<String, String> analyticsProperties;
    private final String checkoutOrigin;
    private final Boolean disableDefaultOpenSheetAnalytic;
    private final String shareMessage;
    private final String source;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21137d0(17)), null};

    /* JADX INFO: renamed from: com.whoop.navigation.ReferAFriendScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/ReferAFriendScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/ReferAFriendScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReferAFriendScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ReferAFriendScreenModel() {
        this((String) null, (String) null, (String) null, (Map) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferAFriendScreenModel copy$default(ReferAFriendScreenModel referAFriendScreenModel, String str, String str2, String str3, Map map, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = referAFriendScreenModel.shareMessage;
        }
        if ((i13 & 2) != 0) {
            str2 = referAFriendScreenModel.source;
        }
        if ((i13 & 4) != 0) {
            str3 = referAFriendScreenModel.checkoutOrigin;
        }
        if ((i13 & 8) != 0) {
            map = referAFriendScreenModel.analyticsProperties;
        }
        if ((i13 & 16) != 0) {
            bool = referAFriendScreenModel.disableDefaultOpenSheetAnalytic;
        }
        Boolean bool2 = bool;
        String str4 = str3;
        return referAFriendScreenModel.copy(str, str2, str4, map, bool2);
    }

    public static final /* synthetic */ void write$Self$navigation_release(ReferAFriendScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.shareMessage, "")) {
            output.encodeStringElement(serialDesc, 0, self.shareMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.source, "")) {
            output.encodeStringElement(serialDesc, 1, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.checkoutOrigin, "")) {
            output.encodeStringElement(serialDesc, 2, self.checkoutOrigin);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.analyticsProperties != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.analyticsProperties);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.disableDefaultOpenSheetAnalytic == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.disableDefaultOpenSheetAnalytic);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareMessage() {
        return this.shareMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCheckoutOrigin() {
        return this.checkoutOrigin;
    }

    public final Map<String, String> component4() {
        return this.analyticsProperties;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getDisableDefaultOpenSheetAnalytic() {
        return this.disableDefaultOpenSheetAnalytic;
    }

    public final ReferAFriendScreenModel copy(String shareMessage, String source, String checkoutOrigin, Map<String, String> analyticsProperties, Boolean disableDefaultOpenSheetAnalytic) {
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(checkoutOrigin, "checkoutOrigin");
        return new ReferAFriendScreenModel(shareMessage, source, checkoutOrigin, analyticsProperties, disableDefaultOpenSheetAnalytic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferAFriendScreenModel)) {
            return false;
        }
        ReferAFriendScreenModel referAFriendScreenModel = (ReferAFriendScreenModel) other;
        return AbstractC22676k.m65745e(this.shareMessage, referAFriendScreenModel.shareMessage) && AbstractC22676k.m65745e(this.source, referAFriendScreenModel.source) && AbstractC22676k.m65745e(this.checkoutOrigin, referAFriendScreenModel.checkoutOrigin) && AbstractC22676k.m65745e(this.analyticsProperties, referAFriendScreenModel.analyticsProperties) && AbstractC22676k.m65745e(this.disableDefaultOpenSheetAnalytic, referAFriendScreenModel.disableDefaultOpenSheetAnalytic);
    }

    public final Map<String, String> getAnalyticsProperties() {
        return this.analyticsProperties;
    }

    public final String getCheckoutOrigin() {
        return this.checkoutOrigin;
    }

    public final Boolean getDisableDefaultOpenSheetAnalytic() {
        return this.disableDefaultOpenSheetAnalytic;
    }

    public final String getShareMessage() {
        return this.shareMessage;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.shareMessage.hashCode() * 31, 31, this.source), 31, this.checkoutOrigin);
        Map<String, String> map = this.analyticsProperties;
        int iHashCode = (iM30450d + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.disableDefaultOpenSheetAnalytic;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.shareMessage;
        String str2 = this.source;
        String str3 = this.checkoutOrigin;
        Map<String, String> map = this.analyticsProperties;
        Boolean bool = this.disableDefaultOpenSheetAnalytic;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReferAFriendScreenModel(shareMessage=", str, ", source=", str2, ", checkoutOrigin=");
        AbstractC36095b.m114695w(sbM32001t, str3, ", analyticsProperties=", map, ", disableDefaultOpenSheetAnalytic=");
        return AbstractC11478a.m30858j(sbM32001t, bool, ")");
    }

    public /* synthetic */ ReferAFriendScreenModel(int i13, String str, String str2, String str3, Map map, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.shareMessage = "";
        } else {
            this.shareMessage = str;
        }
        if ((i13 & 2) == 0) {
            this.source = "";
        } else {
            this.source = str2;
        }
        if ((i13 & 4) == 0) {
            this.checkoutOrigin = "";
        } else {
            this.checkoutOrigin = str3;
        }
        if ((i13 & 8) == 0) {
            this.analyticsProperties = null;
        } else {
            this.analyticsProperties = map;
        }
        if ((i13 & 16) == 0) {
            this.disableDefaultOpenSheetAnalytic = null;
        } else {
            this.disableDefaultOpenSheetAnalytic = bool;
        }
    }

    public ReferAFriendScreenModel(String shareMessage, String source, String checkoutOrigin, Map<String, String> map, Boolean bool) {
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(checkoutOrigin, "checkoutOrigin");
        this.shareMessage = shareMessage;
        this.source = source;
        this.checkoutOrigin = checkoutOrigin;
        this.analyticsProperties = map;
        this.disableDefaultOpenSheetAnalytic = bool;
    }

    public /* synthetic */ ReferAFriendScreenModel(String str, String str2, String str3, Map map, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : map, (i13 & 16) != 0 ? null : bool);
    }
}
