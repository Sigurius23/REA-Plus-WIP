package si0;

import com.whoop.archv2.feature.domain.EnumC6009o;
import com.whoop.archv2.model.template.ListTemplate;
import com.whoop.archv2.model.template.MetaData;
import com.whoop.archv2.model.template.PaginationErrorState;
import com.whoop.archv2.model.template.PullToRefreshBehavior;
import com.whoop.archv2.model.template.TemplatePadding;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FooterModel;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.navigation.models.ApiRequest;
import ep0.C13404j;
import java.util.List;
import java.util.Map;
import jb1.C21535a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pi0.EnumC29250b;
import ri0.C31442a;
import ri0.C31446e;
import ri0.C31447f;
import ti0.C33840e;
import ti0.C33842g;
import ti0.EnumC33847l;
import ti0.InterfaceC33843h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: si0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJa\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00142\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lsi0/h;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/navigation/models/ApiRequest;", "nextPageRequest", "Lcom/whoop/archv2/feature/domain/o;", "paginationStatus", "Lcom/whoop/archv2/model/template/PaginationErrorState;", "paginationErrorState", "Lti0/g;", "c", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/g;", "Lcom/whoop/archv2/model/template/ListTemplate;", "template", "", "manualRefresh", "displayRefreshingSpinner", "", "", "accumulatedState", "Lti0/e;", "a", "(Lcom/whoop/archv2/model/template/ListTemplate;ZZLjava/util/Map;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/e;", "Ljb1/a;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32542h {

    /* JADX INFO: renamed from: b */
    public static final int f134853b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C32542h(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33840e m101569b(C32542h c32542h, ListTemplate listTemplate, boolean z4, boolean z13, Map map, ApiRequest apiRequest, EnumC6009o enumC6009o, PaginationErrorState paginationErrorState, int i13, Object obj) {
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
        return c32542h.m101571a(listTemplate, z4, z13, map, apiRequest, enumC6009o, paginationErrorState);
    }

    /* JADX INFO: renamed from: c */
    private final C33842g m101570c(ApiRequest nextPageRequest, EnumC6009o paginationStatus, PaginationErrorState paginationErrorState) {
        if (nextPageRequest == null) {
            return null;
        }
        String errorMessageText = paginationErrorState != null ? paginationErrorState.getErrorMessageText() : null;
        if (errorMessageText == null) {
            errorMessageText = "";
        }
        return new C33842g(paginationStatus, nextPageRequest, errorMessageText, paginationErrorState != null ? paginationErrorState.getRetryActionText() : null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    /* JADX INFO: renamed from: a */
    public final C33840e m101571a(ListTemplate template, boolean manualRefresh, boolean displayRefreshingSpinner, Map<String, ? extends Object> accumulatedState, ApiRequest nextPageRequest, EnumC6009o paginationStatus, PaginationErrorState paginationErrorState) {
        List listM118958J;
        MetaData metaDataBind;
        AiContextMetadata aiContextMetadata;
        AbstractC22676k.m65750j(template, "template");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65750j(paginationStatus, "paginationStatus");
        List<DesignSystemModel> items = template.getItems();
        if (items == null) {
            listM118958J = null;
        } else {
            if (items.isEmpty()) {
                items = null;
            }
            if (items != null) {
                listM118958J = AbstractC37056f.m118958J(new C31446e.a(this.reducer.m60543j(items, accumulatedState), EnumC29250b.COMPACT));
            } else {
                listM118958J = null;
            }
        }
        if (listM118958J == null) {
            listM118958J = C25271y.f99162w;
        }
        List list = listM118958J;
        FooterModel footer = template.getFooter();
        C31442a c31442aM101552a = footer != null ? AbstractC32538d.m101552a(footer, accumulatedState, this.reducer) : null;
        EnumC33847l enumC33847lM101547a = AbstractC32536b.m101547a(template.getBackgroundTheme());
        String backgroundImageUrl = template.getBackgroundImageUrl();
        AbstractC22403o abstractC22403oM64503l = enumC33847lM101547a == EnumC33847l.DEFAULT ? backgroundImageUrl != null ? AbstractC22404p.m64503l(backgroundImageUrl) : null : null;
        MetaData screenMetadata = template.getScreenMetadata();
        C13404j c13404jM18523a = (screenMetadata == null || (metaDataBind = screenMetadata.bind(accumulatedState)) == null || (aiContextMetadata = metaDataBind.getAiContextMetadata()) == null) ? null : AbstractC6219a.m18523a(aiContextMetadata);
        NavigationBarModel navigationBar = template.getNavigationBar();
        C31447f c31447fM101572a = navigationBar != null ? AbstractC32543i.m101572a(navigationBar, manualRefresh, displayRefreshingSpinner, this.reducer) : null;
        C33842g c33842gM101570c = m101570c(nextPageRequest, paginationStatus, paginationErrorState);
        InterfaceC33843h.Companion companion = InterfaceC33843h.INSTANCE;
        PullToRefreshBehavior pullToRefreshBehavior = template.getPullToRefreshBehavior();
        boolean z4 = false;
        boolean enabled = pullToRefreshBehavior != null ? pullToRefreshBehavior.getEnabled() : false;
        if (manualRefresh && displayRefreshingSpinner) {
            z4 = true;
        }
        InterfaceC33843h interfaceC33843hM107034a = companion.m107034a(enabled, z4);
        PullToRefreshBehavior pullToRefreshBehavior2 = template.getPullToRefreshBehavior();
        String scopeToUpdate = pullToRefreshBehavior2 != null ? pullToRefreshBehavior2.getScopeToUpdate() : null;
        TemplatePadding padding = template.getPadding();
        return new C33840e(c13404jM18523a, c31447fM101572a, list, c31442aM101552a, enumC33847lM101547a, abstractC22403oM64503l, c33842gM101570c, interfaceC33843hM107034a, scopeToUpdate, padding != null ? AbstractC32546l.m101577a(padding) : null);
    }
}
