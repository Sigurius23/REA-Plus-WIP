package com.whoop.labfileupload.domain;

import com.whoop.labfileupload.domain.models.ExternalDataUploadMetadata;
import com.whoop.labfileupload.domain.models.ExternalDataUploadResponse;
import java.util.List;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.C34820i0;
import wg3.InterfaceC37281l;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37286q;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\f\u0010\n¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/labfileupload/domain/LabFileUploadApi;", "", "", "Lud3/i0;", "files", "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;", "metadata", "Lpg3/v0;", "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadResponse;", "uploadFiles", "(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;", "", "uploadAccessFiles", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface LabFileUploadApi {
    @InterfaceC37284o("advanced-labs-service/v1/advanced-labs/access/upload")
    @InterfaceC37281l
    Object uploadAccessFiles(@InterfaceC37286q List<C34820i0> list, @InterfaceC37286q("metadata") ExternalDataUploadMetadata externalDataUploadMetadata, InterfaceC30057d<? super C29218v0<String>> interfaceC30057d);

    @InterfaceC37284o("advanced-labs-service/v1/advanced-labs/upload")
    @InterfaceC37281l
    Object uploadFiles(@InterfaceC37286q List<C34820i0> list, @InterfaceC37286q("metadata") ExternalDataUploadMetadata externalDataUploadMetadata, InterfaceC30057d<? super C29218v0<ExternalDataUploadResponse>> interfaceC30057d);
}
