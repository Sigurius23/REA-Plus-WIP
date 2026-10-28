package com.whoop.experiments.api;

import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/experiments/api/ExperimentsApi;", "", "", "experimentName", "", "disableTracking", "Lpg3/v0;", "getVariantForExperiment", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "experiments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ExperimentsApi {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m21412a(ExperimentsApi experimentsApi, String str, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVariantForExperiment");
        }
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return experimentsApi.getVariantForExperiment(str, z4, interfaceC30057d);
    }

    @InterfaceC37284o("experiment-service/v1/experiments/name/{experimentName}/variant")
    Object getVariantForExperiment(@InterfaceC37288s("experimentName") String str, @InterfaceC37289t("disableTracking") boolean z4, InterfaceC30057d<? super C29218v0<String>> interfaceC30057d);
}
