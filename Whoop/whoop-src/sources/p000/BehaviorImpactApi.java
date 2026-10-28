package p000;

import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"LBehaviorImpactApi;", "", "", "impactId", "target", "Lpg3/v0;", "Ll83/a0;", "deleteNewTag", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface BehaviorImpactApi {
    @InterfaceC37271b("impact-service/v1/impact-tags/{impactId}")
    Object deleteNewTag(@InterfaceC37288s("impactId") String str, @InterfaceC37289t("target") String str2, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
