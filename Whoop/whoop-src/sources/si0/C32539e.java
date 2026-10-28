package si0;

import com.whoop.archv2.feature.domain.EnumC6009o;
import com.whoop.archv2.model.template.FlowTemplate;
import com.whoop.archv2.model.template.ListTemplate;
import com.whoop.archv2.model.template.NavigationTemplate;
import com.whoop.archv2.model.template.PaginationErrorState;
import com.whoop.archv2.model.template.ScreenTemplate;
import com.whoop.archv2.model.template.SingleItemTemplate;
import com.whoop.archv2.model.template.UnknownTemplate;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.navigation.models.ApiRequest;
import java.util.Map;
import jb1.C21535a;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r12.C30856a;
import ti0.AbstractC33837b;
import ti0.C33836a;

/* JADX INFO: renamed from: si0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJW\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020 2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0002¢\u0006\u0004\b!\u0010\"Je\u0010$\u001a\u0004\u0018\u00010\u001a2\b\u0010\r\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010+¨\u0006,"}, m65681d2 = {"Lsi0/e;", "", "Lsi0/h;", "listContentStateReducer", "Lsi0/j;", "navigationContentStateReducer", "Lsi0/k;", "singleItemContentStateReducer", "Lsi0/c;", "flowContentStateReducer", "<init>", "(Lsi0/h;Lsi0/j;Lsi0/k;Lsi0/c;)V", "Lcom/whoop/archv2/model/template/ListTemplate;", "template", "", "manualRefresh", "displayRefreshingSpinner", "", "", "accumulatedState", "Lcom/whoop/navigation/models/ApiRequest;", "nextPageRequest", "Lcom/whoop/archv2/feature/domain/o;", "paginationStatus", "Lcom/whoop/archv2/model/template/PaginationErrorState;", "paginationErrorState", "Lti0/a;", "f", "(Lcom/whoop/archv2/model/template/ListTemplate;ZZLjava/util/Map;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/a;", "Lcom/whoop/archv2/model/template/SingleItemTemplate;", "g", "(Lcom/whoop/archv2/model/template/SingleItemTemplate;ZZLjava/util/Map;)Lti0/a;", "Lcom/whoop/archv2/model/template/FlowTemplate;", "d", "(Lcom/whoop/archv2/model/template/FlowTemplate;Ljava/util/Map;)Lti0/a;", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "b", "(Lcom/whoop/archv2/model/template/ScreenTemplate;ZZLjava/util/Map;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/a;", "a", "Lsi0/h;", "Lsi0/j;", "c", "Lsi0/k;", "Lsi0/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32539e {

    /* JADX INFO: renamed from: e */
    public static final int f134842e = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C32542h listContentStateReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32544j navigationContentStateReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32545k singleItemContentStateReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C32537c flowContentStateReducer;

    public C32539e(C32542h listContentStateReducer, C32544j navigationContentStateReducer, C32545k singleItemContentStateReducer, C32537c flowContentStateReducer) {
        AbstractC22676k.m65750j(listContentStateReducer, "listContentStateReducer");
        AbstractC22676k.m65750j(navigationContentStateReducer, "navigationContentStateReducer");
        AbstractC22676k.m65750j(singleItemContentStateReducer, "singleItemContentStateReducer");
        AbstractC22676k.m65750j(flowContentStateReducer, "flowContentStateReducer");
        this.listContentStateReducer = listContentStateReducer;
        this.navigationContentStateReducer = navigationContentStateReducer;
        this.singleItemContentStateReducer = singleItemContentStateReducer;
        this.flowContentStateReducer = flowContentStateReducer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C33836a m101554c(C32539e c32539e, ScreenTemplate screenTemplate, boolean z4, boolean z13, Map map, ApiRequest apiRequest, EnumC6009o enumC6009o, PaginationErrorState paginationErrorState, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        if ((i13 & 8) != 0) {
            map = C25272z.f99163w;
        }
        if ((i13 & 16) != 0) {
            apiRequest = null;
        }
        if ((i13 & 32) != 0) {
            enumC6009o = EnumC6009o.IDLE;
        }
        if ((i13 & 64) != 0) {
            paginationErrorState = null;
        }
        return c32539e.m101559b(screenTemplate, z4, z13, map, apiRequest, enumC6009o, paginationErrorState);
    }

    /* JADX INFO: renamed from: d */
    private final C33836a m101555d(FlowTemplate template, Map<String, ? extends Object> accumulatedState) {
        WithGeneratedBindings withGeneratedBindingsBind = template.bind(accumulatedState);
        FlowTemplate flowTemplate = withGeneratedBindingsBind instanceof FlowTemplate ? (FlowTemplate) withGeneratedBindingsBind : null;
        if (flowTemplate != null) {
            template = flowTemplate;
        }
        return AbstractC33837b.m107006a(this.flowContentStateReducer.m101551b(template, accumulatedState, new C30856a(this, 23)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C33836a m101556e(C32539e c32539e, ScreenTemplate screenTemplate, Map stepState) {
        AbstractC22676k.m65750j(stepState, "stepState");
        return m101554c(c32539e, screenTemplate, false, false, stepState, null, null, null, 118, null);
    }

    /* JADX INFO: renamed from: f */
    private final C33836a m101557f(ListTemplate template, boolean manualRefresh, boolean displayRefreshingSpinner, Map<String, ? extends Object> accumulatedState, ApiRequest nextPageRequest, EnumC6009o paginationStatus, PaginationErrorState paginationErrorState) {
        return AbstractC33837b.m107006a(this.listContentStateReducer.m101571a(template, manualRefresh, displayRefreshingSpinner, accumulatedState, nextPageRequest, paginationStatus, paginationErrorState));
    }

    /* JADX INFO: renamed from: g */
    private final C33836a m101558g(SingleItemTemplate template, boolean manualRefresh, boolean displayRefreshingSpinner, Map<String, ? extends Object> accumulatedState) {
        return AbstractC33837b.m107006a(this.singleItemContentStateReducer.m101576a(template, manualRefresh, displayRefreshingSpinner, accumulatedState));
    }

    /* JADX INFO: renamed from: b */
    public final C33836a m101559b(ScreenTemplate template, boolean manualRefresh, boolean displayRefreshingSpinner, Map<String, ? extends Object> accumulatedState, ApiRequest nextPageRequest, EnumC6009o paginationStatus, PaginationErrorState paginationErrorState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65750j(paginationStatus, "paginationStatus");
        if (template == null) {
            return null;
        }
        if (template instanceof ListTemplate) {
            return m101557f((ListTemplate) template, manualRefresh, displayRefreshingSpinner, accumulatedState, nextPageRequest, paginationStatus, paginationErrorState);
        }
        if (template instanceof NavigationTemplate) {
            return AbstractC33837b.m107006a(this.navigationContentStateReducer.m101575a((NavigationTemplate) template));
        }
        if (template instanceof SingleItemTemplate) {
            return m101558g((SingleItemTemplate) template, manualRefresh, displayRefreshingSpinner, accumulatedState);
        }
        if (template instanceof FlowTemplate) {
            return m101555d((FlowTemplate) template, accumulatedState);
        }
        if (template instanceof UnknownTemplate) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
