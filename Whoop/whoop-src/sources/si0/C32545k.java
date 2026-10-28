package si0;

import com.whoop.archv2.model.template.MetaData;
import com.whoop.archv2.model.template.SingleItemTemplate;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FooterModel;
import com.whoop.design.models.items.NavigationBarModel;
import ep0.C13404j;
import java.util.Map;
import jb1.C21535a;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import ri0.C31447f;
import ti0.C33845j;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: si0.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lsi0/k;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/archv2/model/template/SingleItemTemplate;", "template", "", "manualRefresh", "displayRefreshingSpinner", "", "", "accumulatedState", "Lti0/j;", "a", "(Lcom/whoop/archv2/model/template/SingleItemTemplate;ZZLjava/util/Map;)Lti0/j;", "Ljb1/a;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32545k {

    /* JADX INFO: renamed from: b */
    public static final int f134855b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C32545k(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    public final C33845j m101576a(SingleItemTemplate template, boolean manualRefresh, boolean displayRefreshingSpinner, Map<String, ? extends Object> accumulatedState) {
        MetaData metaDataBind;
        AiContextMetadata aiContextMetadata;
        AbstractC22676k.m65750j(template, "template");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        DesignSystemModel item = template.getItem();
        C25306o c25306o = item != null ? (C25306o) AbstractC25265s.m74100H0(this.reducer.m60543j(AbstractC37056f.m118958J(item), accumulatedState)) : null;
        MetaData screenMetadata = template.getScreenMetadata();
        C13404j c13404jM18523a = (screenMetadata == null || (metaDataBind = screenMetadata.bind(accumulatedState)) == null || (aiContextMetadata = metaDataBind.getAiContextMetadata()) == null) ? null : AbstractC6219a.m18523a(aiContextMetadata);
        NavigationBarModel navigationBar = template.getNavigationBar();
        C31447f c31447fM101572a = navigationBar != null ? AbstractC32543i.m101572a(navigationBar, manualRefresh, displayRefreshingSpinner, this.reducer) : null;
        FooterModel footer = template.getFooter();
        return new C33845j(c13404jM18523a, c31447fM101572a, c25306o, footer != null ? AbstractC32538d.m101552a(footer, accumulatedState, this.reducer) : null, template.getHorizontalAlignment(), template.getVerticalAlignment(), template.getFillMode(), AbstractC32546l.m101577a(template.getPadding()), C32535a.f134840a.m101546b(template.getBackground(), template.getBackgroundImageUrl()));
    }
}
