package com.whoop.memberdataexport.services.network;

import com.whoop.memberdataexport.models.IntermediateMemberDataExportDto;
import com.whoop.memberdataexport.models.SubmitMemberDataDto;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;", "", "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;", "getMemberDataExportDetailsForUser", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;", "body", "submitMemberDataExportRequestForUser", "(Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;Lq83/d;)Ljava/lang/Object;", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface MemberDataExportServiceApi {
    @InterfaceC37275f("/member-data-export-service/v1/member-data-export-details")
    Object getMemberDataExportDetailsForUser(InterfaceC30057d<? super IntermediateMemberDataExportDto> interfaceC30057d);

    @InterfaceC37284o("/member-data-export-service/v1/member-data-export-details")
    Object submitMemberDataExportRequestForUser(@InterfaceC37270a SubmitMemberDataDto submitMemberDataDto, InterfaceC30057d<? super IntermediateMemberDataExportDto> interfaceC30057d);
}
