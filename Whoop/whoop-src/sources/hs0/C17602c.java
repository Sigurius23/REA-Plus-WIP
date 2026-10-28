package hs0;

import com.whoop.communityreactions.domain.model.QuickReactionModel;
import com.whoop.communityreactions.domain.model.ReactionsResponse;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import ds0.C12324c;
import ds0.C12327f;
import ds0.InterfaceC12322a;
import is0.C20874c;
import is0.C20878e;
import is0.C20907s0;
import is0.InterfaceC20880f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import kd1.AbstractC22403o;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import p720m91.C25306o;

/* JADX INFO: renamed from: hs0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lhs0/c;", "", "<init>", "()V", "Lds0/f;", "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "response", "Lis0/s0;", "d", "(Lds0/f;Lcom/whoop/communityreactions/domain/model/ReactionsResponse;)Lis0/s0;", "Lds0/a;", "Lis0/f;", "c", "(Lds0/a;)Lis0/f;", "Lds0/c;", "Lis0/e;", "b", "(Lds0/c;)Lis0/e;", "domainState", "a", "(Lds0/f;)Lis0/s0;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17602c {
    /* JADX INFO: renamed from: b */
    private final C20878e m50131b(C12324c c12324c) {
        return new C20878e(AbstractC17603d.m50135a(c12324c.getSubmissionId()), AbstractC22403o.b.f87641b, AbstractC8693b.m21267a(), AbstractC8693b.m21278l(c12324c.getText()), null, c12324c.getRenderStyle(), null, true, 80, null);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC20880f m50132c(InterfaceC12322a interfaceC12322a) {
        if (AbstractC22676k.m65745e(interfaceC12322a, InterfaceC12322a.b.f41257a)) {
            return InterfaceC20880f.b.f78558a;
        }
        if (AbstractC22676k.m65745e(interfaceC12322a, InterfaceC12322a.c.f41258a)) {
            return InterfaceC20880f.c.f78559a;
        }
        if (interfaceC12322a instanceof InterfaceC12322a.a) {
            return new InterfaceC20880f.a(((InterfaceC12322a.a) interfaceC12322a).getRetry());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    private final C20907s0 m50133d(C12327f c12327f, ReactionsResponse reactionsResponse) {
        Duration durationM134260boximpl;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(reactionsResponse.getInput().getPlaceholder());
        GenericInteraction submitAction = reactionsResponse.getInput().getSubmitAction();
        List<QuickReactionModel> quickReactions = reactionsResponse.getQuickReactions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(quickReactions, 10));
        for (QuickReactionModel quickReactionModel : quickReactions) {
            arrayList.add(new C20874c(quickReactionModel.getEmoji(), c12327f.m34381i().contains(quickReactionModel.getEmoji()), quickReactionModel.getAction()));
        }
        List listM60536k = C21535a.m60536k(AbstractC17600a.m50119e(), reactionsResponse.getItems(), null, 2, null);
        List<C12324c> listM34380h = c12327f.m34380h();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM34380h, 10));
        Iterator<T> it = listM34380h.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C25306o(m50131b((C12324c) it.next()), null, 2, null));
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(listM60536k, arrayList2);
        String previewSummaryLabel = reactionsResponse.getPreviewSummaryLabel();
        TextResource textResourceM21278l2 = previewSummaryLabel != null ? AbstractC8693b.m21278l(previewSummaryLabel) : null;
        Integer previewRotationSeconds = reactionsResponse.getPreviewRotationSeconds();
        if (previewRotationSeconds != null) {
            Duration.Companion companion = Duration.INSTANCE;
            durationM134260boximpl = Duration.m134260boximpl(DurationKt.toDuration(previewRotationSeconds.intValue(), DurationUnit.SECONDS));
        } else {
            durationM134260boximpl = null;
        }
        AnyModal modal = c12327f.getModal();
        InterfaceC12322a actionProgress = c12327f.getActionProgress();
        return new C20907s0(false, false, textResourceM21278l, submitAction, arrayList, arrayListM74129g1, textResourceM21278l2, durationM134260boximpl, modal, actionProgress != null ? m50132c(actionProgress) : null, 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final C20907s0 m50134a(C12327f domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.getIsError()) {
            return new C20907s0(false, true, null, null, null, null, null, null, null, null, 1020, null);
        }
        return domainState.getData() == null ? new C20907s0(domainState.getIsLoading(), false, null, null, null, null, null, null, null, null, 1022, null) : m50133d(domainState, domainState.getData());
    }
}
