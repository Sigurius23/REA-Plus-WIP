package com.whoop.sanguine.domain;

import com.whoop.sanguine.domain.models.SanguineWaitlistBiomarkersResponse;
import com.whoop.sanguine.domain.models.SanguineWaitlistResponse;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0004J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/sanguine/domain/SanguineApi;", "", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;", "getSanguineWaitlistRequest", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;", "getSanguineWaitlistBiomarkersRequest", "joinSanguineWaitlist", "", "inviteCode", "Lpg3/v0;", "Ll83/a0;", "acceptAdvancedLabsInvite", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SanguineApi {
    @InterfaceC37284o("/sanguine-service/v1/advanced-labs/early-access/accept-invite")
    Object acceptAdvancedLabsInvite(@InterfaceC37289t("inviteCode") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("sanguine-service/v1/sanguine/waitlist/biomarkers/bff")
    Object getSanguineWaitlistBiomarkersRequest(InterfaceC30057d<? super SanguineWaitlistBiomarkersResponse> interfaceC30057d);

    @InterfaceC37275f("sanguine-service/v1/sanguine/waitlist/bff")
    Object getSanguineWaitlistRequest(InterfaceC30057d<? super SanguineWaitlistResponse> interfaceC30057d);

    @InterfaceC37285p("/sanguine-service/v1/sanguine/waitlist")
    Object joinSanguineWaitlist(InterfaceC30057d<? super SanguineWaitlistResponse> interfaceC30057d);
}
