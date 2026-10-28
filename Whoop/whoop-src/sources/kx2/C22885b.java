package kx2;

import ax2.InterfaceC2121a;
import com.whoop.whooplabs.C10823a;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignDetailsScreenResponse;
import ex2.C13731b;
import ex2.C13732c;
import l83.C23454a0;
import mx2.InterfaceC26015b;
import nz2.AbstractC27308b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import zw2.C41178b;

/* JADX INFO: renamed from: kx2.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0011J\u0019\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0013\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lkx2/b;", "", "Lex2/b;", "labsCampaignRepository", "Lzw2/b;", "analytics", "Lcom/whoop/whooplabs/a;", "labsServiceConnector", "Lex2/c;", "labsRepository", "<init>", "(Lex2/b;Lzw2/b;Lcom/whoop/whooplabs/a;Lex2/c;)V", "", "campaignId", "Lax2/a;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", "d", "(I)Lax2/a;", "Lmx2/b$a;", "action", "Ll83/a0;", "a", "(Lmx2/b$a;)Lax2/a;", "b", "Lmx2/b;", "c", "(Lmx2/b;)Lax2/a;", "Lex2/b;", "Lzw2/b;", "Lcom/whoop/whooplabs/a;", "Lex2/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22885b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13731b labsCampaignRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C41178b analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C10823a labsServiceConnector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C13732c labsRepository;

    public C22885b(C13731b labsCampaignRepository, C41178b analytics, C10823a labsServiceConnector, C13732c labsRepository) {
        AbstractC22676k.m65750j(labsCampaignRepository, "labsCampaignRepository");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(labsServiceConnector, "labsServiceConnector");
        AbstractC22676k.m65750j(labsRepository, "labsRepository");
        this.labsCampaignRepository = labsCampaignRepository;
        this.analytics = analytics;
        this.labsServiceConnector = labsServiceConnector;
        this.labsRepository = labsRepository;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2121a<C23454a0> m66511a(InterfaceC26015b.a action) {
        AbstractC22676k.m65750j(action, "action");
        return new C22884a(action, this.labsCampaignRepository, AbstractC27308b.m82458a(C22884a.INSTANCE.m66510a()));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2121a<C23454a0> m66512b(int campaignId) {
        return new C22886c(campaignId, this.labsCampaignRepository, this.analytics, this.labsServiceConnector, AbstractC27308b.m82458a(C22886c.INSTANCE.m66516a()));
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2121a<?> m66513c(InterfaceC26015b action) {
        AbstractC22676k.m65750j(action, "action");
        if (action instanceof InterfaceC26015b.a) {
            return m66511a((InterfaceC26015b.a) action);
        }
        if (action instanceof InterfaceC26015b.b) {
            return m66512b(((InterfaceC26015b.b) action).getCampaignId());
        }
        if (action instanceof InterfaceC26015b.d) {
            return new C22888e((InterfaceC26015b.d) action, AbstractC27308b.m82458a(C22888e.INSTANCE.m66520a()));
        }
        if (action instanceof InterfaceC26015b.c) {
            return m66512b(((InterfaceC26015b.c) action).getCampaignId());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2121a<CampaignDetailsScreenResponse> m66514d(int campaignId) {
        return new C22887d(campaignId, this.labsCampaignRepository, AbstractC27308b.m82458a(C22887d.INSTANCE.m66518a()));
    }
}
