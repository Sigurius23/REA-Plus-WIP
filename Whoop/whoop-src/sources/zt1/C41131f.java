package zt1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.labrador.feature.results.domain.model.LabradorPaginatedGroupModel;
import com.whoop.labrador.feature.results.domain.model.LabradorPaginatedResultModel;
import com.whoop.labrador.feature.results.domain.model.PaginatedLabradorResultsModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.LabradorAboutScreenModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import rs1.AbstractC31794f;
import xt1.InterfaceC38645b;

/* JADX INFO: renamed from: zt1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lzt1/f;", "", "<init>", "()V", "Lxt1/b$d;", "state", "Lzt1/c$c;", "c", "(Lxt1/b$d;)Lzt1/c$c;", "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;", "Lzt1/a;", "b", "(Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;)Lzt1/a;", "Lxt1/b;", "Lzt1/c;", "a", "(Lxt1/b;)Lzt1/c;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41131f {
    /* JADX INFO: renamed from: b */
    private final C41126a m133538b(LabradorPaginatedGroupModel state) {
        TextResource title = state.getTitle();
        String id4 = state.getId();
        List<LabradorPaginatedResultModel> items = state.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (LabradorPaginatedResultModel labradorPaginatedResultModel : items) {
            arrayList.add(new C41127b(labradorPaginatedResultModel.getAlertState(), labradorPaginatedResultModel.getTitle(), labradorPaginatedResultModel.getDescription(), labradorPaginatedResultModel.getId()));
        }
        return new C41126a(title, id4, arrayList);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC41128c.c m133539c(InterfaceC38645b.d state) {
        PaginatedLabradorResultsModel response = state.getResponse();
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC31794f.f131671n);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC31794f.f131672n0);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC31794f.f131653e);
        String nextToken = response.getNextToken();
        C9598e learnMoreDestination = state.getResponse().getLearnMoreDestination();
        C9598e c9598e = learnMoreDestination == null ? new C9598e(AppScreen.C9299e3.f27574w, LabradorAboutScreenModel.INSTANCE, null, 4, null) : learnMoreDestination;
        boolean z4 = state instanceof InterfaceC38645b.h;
        boolean z13 = state instanceof InterfaceC38645b.g;
        List<LabradorPaginatedGroupModel> records = state.getResponse().getRecords();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(records, 10));
        Iterator<T> it = records.iterator();
        while (it.hasNext()) {
            arrayList.add(m133538b((LabradorPaginatedGroupModel) it.next()));
        }
        return new InterfaceC41128c.c(c8688bM21277k, c8688bM21277k2, c8688bM21277k3, c9598e, nextToken, z4, z13, arrayList, state instanceof InterfaceC38645b.b, state instanceof InterfaceC38645b.a);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC41128c m133540a(InterfaceC38645b state) {
        AbstractC22676k.m65750j(state, "state");
        if (state.equals(InterfaceC38645b.c.f166209a)) {
            return InterfaceC41128c.a.f177292a;
        }
        if (state instanceof InterfaceC38645b.e) {
            return InterfaceC41128c.b.f177293a;
        }
        if (state instanceof InterfaceC38645b.d) {
            return m133539c((InterfaceC38645b.d) state);
        }
        throw new NoWhenBranchMatchedException();
    }
}
