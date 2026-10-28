package com.whoop.pairing.membershipAdjustment.api;

import com.whoop.pairing.membershipAdjustment.domain.models.AdjustMembershipBody;
import com.whoop.pairing.membershipAdjustment.domain.models.MembershipAdjustmentResponse;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;", "", "", "strapSerial", "strapSignature", "Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;", "getMembershipAdjustment", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", QueryParams.URL, "", "body", "Ll83/a0;", "adjustMembership", "(Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/pairing/membershipAdjustment/domain/models/AdjustMembershipBody;", "postMembershipAdjustment", "(Lcom/whoop/pairing/membershipAdjustment/domain/models/AdjustMembershipBody;Lq83/d;)Ljava/lang/Object;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface MembershipAdjustmentApi {
    @InterfaceC37284o
    Object adjustMembership(@InterfaceC37294y String str, @InterfaceC37270a Map<String, String> map, InterfaceC30057d<C23454a0> interfaceC30057d);

    @InterfaceC37275f("membership-service/v2/straps/pairing-adjustment")
    Object getMembershipAdjustment(@InterfaceC37289t("strapSerial") String str, @InterfaceC37289t("strapSignature") String str2, InterfaceC30057d<? super MembershipAdjustmentResponse> interfaceC30057d);

    @InterfaceC37284o("membership-service/v2/straps/pairing-adjustment")
    Object postMembershipAdjustment(@InterfaceC37270a AdjustMembershipBody adjustMembershipBody, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
