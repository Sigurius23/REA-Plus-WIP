package com.whoop.profile.domain.models.components;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import sr2.C32940v;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)JT\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bB\u0010;\u001a\u0004\bA\u0010)¨\u0006E"}, m65681d2 = {"Lcom/whoop/profile/domain/models/components/ReferralsTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;", "header", "Lcom/whoop/profile/domain/models/components/ReferredListModel;", "referredList", "Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;", "footer", "Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;", "button", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$profile_release", "(Lcom/whoop/profile/domain/models/components/ReferralsTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;", "component3", "()Lcom/whoop/profile/domain/models/components/ReferredListModel;", "component4", "()Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;", "component5", "()Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;", "component6", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;)Lcom/whoop/profile/domain/models/components/ReferralsTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;", "getHeader", "Lcom/whoop/profile/domain/models/components/ReferredListModel;", "getReferredList", "getReferredList$annotations", "()V", "Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;", "getFooter", "Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;", "getButton", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Companion", "$serializer", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReferralsTileModel implements DesignSystemModel {
    private final ReferralsTileButtonModel button;
    private final C9598e destination;
    private final ReferralsTileFooterModel footer;
    private final ReferralsTileHeaderModel header;
    private final String id;
    private final ReferredListModel referredList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32940v(28))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/domain/models/components/ReferralsTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/profile/domain/models/components/ReferralsTileModel;", "serializer", "()Lwc3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReferralsTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReferralsTileModel(int i13, String str, ReferralsTileHeaderModel referralsTileHeaderModel, ReferredListModel referredListModel, ReferralsTileFooterModel referralsTileFooterModel, ReferralsTileButtonModel referralsTileButtonModel, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ReferralsTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.header = referralsTileHeaderModel;
        this.referredList = referredListModel;
        this.footer = referralsTileFooterModel;
        this.button = referralsTileButtonModel;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ReferralsTileModel copy$default(ReferralsTileModel referralsTileModel, String str, ReferralsTileHeaderModel referralsTileHeaderModel, ReferredListModel referredListModel, ReferralsTileFooterModel referralsTileFooterModel, ReferralsTileButtonModel referralsTileButtonModel, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = referralsTileModel.id;
        }
        if ((i13 & 2) != 0) {
            referralsTileHeaderModel = referralsTileModel.header;
        }
        if ((i13 & 4) != 0) {
            referredListModel = referralsTileModel.referredList;
        }
        if ((i13 & 8) != 0) {
            referralsTileFooterModel = referralsTileModel.footer;
        }
        if ((i13 & 16) != 0) {
            referralsTileButtonModel = referralsTileModel.button;
        }
        if ((i13 & 32) != 0) {
            c9598e = referralsTileModel.destination;
        }
        ReferralsTileButtonModel referralsTileButtonModel2 = referralsTileButtonModel;
        C9598e c9598e2 = c9598e;
        return referralsTileModel.copy(str, referralsTileHeaderModel, referredListModel, referralsTileFooterModel, referralsTileButtonModel2, c9598e2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC37143h("referred_list")
    public static /* synthetic */ void getReferredList$annotations() {
    }

    public static final /* synthetic */ void write$Self$profile_release(ReferralsTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, ReferralsTileHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeNullableSerializableElement(serialDesc, 2, ReferredListModel$$serializer.INSTANCE, self.referredList);
        output.encodeNullableSerializableElement(serialDesc, 3, ReferralsTileFooterModel$$serializer.INSTANCE, self.footer);
        output.encodeNullableSerializableElement(serialDesc, 4, ReferralsTileButtonModel$$serializer.INSTANCE, self.button);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReferralsTileHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ReferredListModel getReferredList() {
        return this.referredList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ReferralsTileFooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ReferralsTileButtonModel getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final ReferralsTileModel copy(String id4, ReferralsTileHeaderModel header, ReferredListModel referredList, ReferralsTileFooterModel footer, ReferralsTileButtonModel button, C9598e destination) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(header, "header");
        return new ReferralsTileModel(id4, header, referredList, footer, button, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralsTileModel)) {
            return false;
        }
        ReferralsTileModel referralsTileModel = (ReferralsTileModel) other;
        return AbstractC22676k.m65745e(this.id, referralsTileModel.id) && AbstractC22676k.m65745e(this.header, referralsTileModel.header) && AbstractC22676k.m65745e(this.referredList, referralsTileModel.referredList) && AbstractC22676k.m65745e(this.footer, referralsTileModel.footer) && AbstractC22676k.m65745e(this.button, referralsTileModel.button) && AbstractC22676k.m65745e(this.destination, referralsTileModel.destination);
    }

    public final ReferralsTileButtonModel getButton() {
        return this.button;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final ReferralsTileFooterModel getFooter() {
        return this.footer;
    }

    public final ReferralsTileHeaderModel getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final ReferredListModel getReferredList() {
        return this.referredList;
    }

    public int hashCode() {
        int iHashCode = (this.header.hashCode() + (this.id.hashCode() * 31)) * 31;
        ReferredListModel referredListModel = this.referredList;
        int iHashCode2 = (iHashCode + (referredListModel == null ? 0 : referredListModel.hashCode())) * 31;
        ReferralsTileFooterModel referralsTileFooterModel = this.footer;
        int iHashCode3 = (iHashCode2 + (referralsTileFooterModel == null ? 0 : referralsTileFooterModel.hashCode())) * 31;
        ReferralsTileButtonModel referralsTileButtonModel = this.button;
        int iHashCode4 = (iHashCode3 + (referralsTileButtonModel == null ? 0 : referralsTileButtonModel.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode4 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        return "ReferralsTileModel(id=" + this.id + ", header=" + this.header + ", referredList=" + this.referredList + ", footer=" + this.footer + ", button=" + this.button + ", destination=" + this.destination + ")";
    }

    public ReferralsTileModel(String id4, ReferralsTileHeaderModel header, ReferredListModel referredListModel, ReferralsTileFooterModel referralsTileFooterModel, ReferralsTileButtonModel referralsTileButtonModel, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(header, "header");
        this.id = id4;
        this.header = header;
        this.referredList = referredListModel;
        this.footer = referralsTileFooterModel;
        this.button = referralsTileButtonModel;
        this.destination = c9598e;
    }
}
