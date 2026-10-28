package p70;

import ci2.InterfaceC4733b;
import com.whoop.domain.model.WhoopStrapInfo;
import jk0.InterfaceC21750d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m65681d2 = {"Lp70/a;", "Lp70/b;", "Lci2/b;", "whoopStrapProvider", "<init>", "(Lci2/b;)V", "Lcom/whoop/domain/model/WhoopStrapInfo;", "a", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "Lci2/b;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28953a implements InterfaceC28954b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    public C28953a(InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.whoopStrapProvider = whoopStrapProvider;
    }

    @Override // p70.InterfaceC28954b
    /* JADX INFO: renamed from: a */
    public WhoopStrapInfo mo87912a() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
        if (interfaceC21750d != null) {
            return interfaceC21750d.get_strapInfo();
        }
        return null;
    }
}
