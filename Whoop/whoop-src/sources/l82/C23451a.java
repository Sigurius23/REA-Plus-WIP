package l82;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.FollowerRequestModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.searcharchmini.domain.model.SearchArchMiniResponse;
import i82.AbstractC18219c;
import i82.C18218b;
import i82.C18223g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import n31.C26220e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: l82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ll82/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/design/models/DesignSystemModel;", "model", "", "", "Li82/b;", "stages", "a", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;", "Li82/g;", "domainState", "Ln31/e;", "b", "(Li82/g;)Ln31/e;", "Ljb1/a;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23451a {

    /* JADX INFO: renamed from: b */
    public static final int f92916b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C23451a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: a */
    private final DesignSystemModel m68030a(DesignSystemModel model, Map<String, C18218b> stages) {
        DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap(model);
        FollowerRequestModel followerRequestModel = designSystemModelUnwrap instanceof FollowerRequestModel ? (FollowerRequestModel) designSystemModelUnwrap : null;
        if (followerRequestModel == null) {
            return model;
        }
        FollowerRequestModel followerRequestModelM52425e = AbstractC18219c.m52425e(followerRequestModel, stages.get(followerRequestModel.getId()));
        return model instanceof DesignModelWrapper ? DesignModelWrapper.copy$default((DesignModelWrapper) model, followerRequestModelM52425e, null, null, null, null, 30, null) : followerRequestModelM52425e;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX INFO: renamed from: b */
    public final C26220e m68031b(C18223g domainState) {
        TextResource.C8691e c8691eM21279m;
        List<C25306o> listM60543j;
        String loadingHintText;
        Long searchDebounceMs;
        AbstractC22676k.m65750j(domainState, "domainState");
        SearchArchMiniResponse data = domainState.getData();
        boolean followerItemActionProgressVisibleInUi = domainState.getFollowerItemActionProgressVisibleInUi();
        String inFlightFollowerRequestId = domainState.getInFlightFollowerRequestId();
        if (inFlightFollowerRequestId == null || !followerItemActionProgressVisibleInUi) {
            inFlightFollowerRequestId = null;
        }
        boolean isLoading = domainState.getIsLoading();
        boolean isError = domainState.getIsError();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(data != null ? data.getSearchPlaceHolderText() : null);
        long jLongValue = (data == null || (searchDebounceMs = data.getSearchDebounceMs()) == null) ? 300L : searchDebounceMs.longValue();
        if (data == null || (loadingHintText = data.getLoadingHintText()) == null) {
            c8691eM21279m = null;
        } else {
            if (AbstractC39414r.m125890i0(loadingHintText)) {
                loadingHintText = null;
            }
            if (loadingHintText != null) {
                c8691eM21279m = AbstractC8693b.m21279m(loadingHintText);
            } else {
                c8691eM21279m = null;
            }
        }
        AnalyticEventModel analyticEvent = (domainState.getIsLoading() || domainState.getIsError() || data == null) ? null : data.getAnalyticEvent();
        if (data != null) {
            List<DesignSystemModel> items = data.getItems();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(m68030a((DesignSystemModel) it.next(), domainState.m52441f()));
            }
            listM60543j = this.designItemReducer.m60543j(arrayList, C25272z.f99163w);
            if (inFlightFollowerRequestId != null) {
                listM60543j = AbstractC23452b.m68033b(listM60543j, inFlightFollowerRequestId);
            }
            if (listM60543j == null) {
                listM60543j = C25271y.f99162w;
            }
        } else {
            listM60543j = C25271y.f99162w;
        }
        List<C25306o> list = listM60543j;
        String actionError = domainState.getActionError();
        return new C26220e(isLoading, isError, textResourceM21278l, jLongValue, c8691eM21279m, analyticEvent, list, (actionError == null || domainState.getPendingInteraction() != null) ? null : actionError, followerItemActionProgressVisibleInUi && domainState.getItemActionInProgress(), inFlightFollowerRequestId, domainState.getPendingInteraction());
    }

    public /* synthetic */ C23451a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60555e(null, 1, null) : c21535a);
    }
}
