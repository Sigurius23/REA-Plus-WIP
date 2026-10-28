package com.whoop.profile.domain.models.components;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import sr2.C32940v;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0019¨\u00060"}, m65681d2 = {"Lcom/whoop/profile/domain/models/components/ReferredListModel;", "", "", "id", "", "Lcom/whoop/profile/domain/models/components/ReferredMemberModel;", "referredMembers", "additionalReferralDisplay", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$profile_release", "(Lcom/whoop/profile/domain/models/components/ReferredListModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/profile/domain/models/components/ReferredListModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getReferredMembers", "getReferredMembers$annotations", "()V", "getAdditionalReferralDisplay", "getAdditionalReferralDisplay$annotations", "Companion", "$serializer", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReferredListModel {
    private final String additionalReferralDisplay;
    private final String id;
    private final List<ReferredMemberModel> referredMembers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32940v(29)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/domain/models/components/ReferredListModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/profile/domain/models/components/ReferredListModel;", "serializer", "()Lwc3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReferredListModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ReferredListModel() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ReferredMemberModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferredListModel copy$default(ReferredListModel referredListModel, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = referredListModel.id;
        }
        if ((i13 & 2) != 0) {
            list = referredListModel.referredMembers;
        }
        if ((i13 & 4) != 0) {
            str2 = referredListModel.additionalReferralDisplay;
        }
        return referredListModel.copy(str, list, str2);
    }

    @InterfaceC37143h("additional_referral_display")
    public static /* synthetic */ void getAdditionalReferralDisplay$annotations() {
    }

    @InterfaceC37143h("referred_members")
    public static /* synthetic */ void getReferredMembers$annotations() {
    }

    public static final /* synthetic */ void write$Self$profile_release(ReferredListModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.referredMembers, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.referredMembers);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.additionalReferralDisplay == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.additionalReferralDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<ReferredMemberModel> component2() {
        return this.referredMembers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdditionalReferralDisplay() {
        return this.additionalReferralDisplay;
    }

    public final ReferredListModel copy(String id4, List<ReferredMemberModel> referredMembers, String additionalReferralDisplay) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(referredMembers, "referredMembers");
        return new ReferredListModel(id4, referredMembers, additionalReferralDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferredListModel)) {
            return false;
        }
        ReferredListModel referredListModel = (ReferredListModel) other;
        return AbstractC22676k.m65745e(this.id, referredListModel.id) && AbstractC22676k.m65745e(this.referredMembers, referredListModel.referredMembers) && AbstractC22676k.m65745e(this.additionalReferralDisplay, referredListModel.additionalReferralDisplay);
    }

    public final String getAdditionalReferralDisplay() {
        return this.additionalReferralDisplay;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ReferredMemberModel> getReferredMembers() {
        return this.referredMembers;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.referredMembers);
        String str = this.additionalReferralDisplay;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.additionalReferralDisplay, ")", AbstractC30802r.m94766o("ReferredListModel(id=", this.id, ", referredMembers=", ", additionalReferralDisplay=", this.referredMembers));
    }

    public /* synthetic */ ReferredListModel(int i13, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.referredMembers = C25271y.f99162w;
        } else {
            this.referredMembers = list;
        }
        if ((i13 & 4) == 0) {
            this.additionalReferralDisplay = null;
        } else {
            this.additionalReferralDisplay = str2;
        }
    }

    public ReferredListModel(String id4, List<ReferredMemberModel> referredMembers, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(referredMembers, "referredMembers");
        this.id = id4;
        this.referredMembers = referredMembers;
        this.additionalReferralDisplay = str;
    }

    public /* synthetic */ ReferredListModel(String str, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str2);
    }
}
