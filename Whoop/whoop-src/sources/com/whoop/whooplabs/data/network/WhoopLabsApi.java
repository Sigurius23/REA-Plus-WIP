package com.whoop.whooplabs.data.network;

import com.whoop.whooplabs.data.remote.domain.dto.AbandonCampaignBody;
import com.whoop.whooplabs.data.remote.domain.dto.LegalDocumentCompletedDto;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudyDto;
import l83.C23454a0;
import live.hms.video.utils.HMSFieldTrials;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37277h;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\\\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0013\u0010\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0017\u0010\u0014J4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0011H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/whooplabs/data/network/WhoopLabsApi;", "", "", "hardwareVersion", "firmwareVersion", "bluetoothVersion", "sigProcVersion", "whoopStrapId", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;", "body", "Lpg3/v0;", "Ll83/a0;", "uploadStudy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentCompletedDto;", "markLegalDocumentAsCompleted", "(Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentCompletedDto;Lq83/d;)Ljava/lang/Object;", "", "campaignId", "abandonCampaign", "(ILq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;", "(ILcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;Lq83/d;)Ljava/lang/Object;", "stopStudy", "Lud3/v0;", "deviceName", "packetLength", "uploadRawDataFromThirdParty", "(Lud3/v0;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface WhoopLabsApi {
    @InterfaceC37277h(hasBody = HMSFieldTrials.DisableVideoAutoSubscribe, method = "DELETE", path = "/research-service/v2/research/campaigns/{campaignId}")
    Object abandonCampaign(@InterfaceC37288s("campaignId") int i13, @InterfaceC37270a AbandonCampaignBody abandonCampaignBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("/research-service/v2/research/campaigns/{campaignId}")
    Object abandonCampaign(@InterfaceC37288s("campaignId") int i13, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("research-service/v1/research/legal")
    Object markLegalDocumentAsCompleted(@InterfaceC37270a LegalDocumentCompletedDto legalDocumentCompletedDto, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("/research-service/v1/campaigns/{campaign_id}/event")
    Object stopStudy(@InterfaceC37288s("campaign_id") int i13, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("/research-service/v1/bthr")
    Object uploadRawDataFromThirdParty(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37278i("X-WHOOP-Research-Device-Name") String str, @InterfaceC37278i("X-WHOOP-Research-Packet-Length") int i13, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("research-service/v2/research/study")
    Object uploadStudy(@InterfaceC37278i("X-WHOOP-HW-Version") String str, @InterfaceC37278i("X-WHOOP-FW-Version") String str2, @InterfaceC37278i("X-WHOOP-Nordic-Version") String str3, @InterfaceC37278i("X-WHOOP-DSP-Version") String str4, @InterfaceC37278i("X-WHOOP-Strap-Id") String str5, @InterfaceC37270a WhoopLabsStudyDto whoopLabsStudyDto, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
