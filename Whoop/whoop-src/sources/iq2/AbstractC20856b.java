package iq2;

import ad3.AbstractC0757c;
import ad3.C0764g;
import cd3.AbstractC4454f;
import cd3.AbstractC4457i;
import cd3.C4455g;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.user.journey.model.UserJourneyStep;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iq2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "", "Lj93/d;", "featureModels", "Lad3/c;", "b", "(Ljava/util/Map;)Lad3/c;", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20856b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final AbstractC0757c m57607b(Map<String, ? extends InterfaceC21461d> featureModels) {
        AbstractC22676k.m65750j(featureModels, "featureModels");
        AbstractC0757c abstractC0757cM20379d = AbstractC6728b.m20379d(featureModels, null, null, null, null, 30, null);
        C4455g c4455g = new C4455g();
        c4455g.mo2325k(AbstractC22671h0.f89337a.getOrCreateKotlinClass(UserJourneyStep.class), new C20857c(null, 1, 0 == true ? 1 : 0));
        return AbstractC34132o.m107878b(abstractC0757cM20379d, new C20855a(abstractC0757cM20379d, c4455g.m13953r(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m57608c(AbstractC0757c abstractC0757c, AbstractC4454f abstractC4454f, C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2788o = AbstractC4457i.m13960a(abstractC0757c.f2764b, abstractC4454f);
        return C23454a0.f92919a;
    }
}
