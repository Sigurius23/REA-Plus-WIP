package ur0;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import java.util.Map;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ur0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/DesignSystemModel;", "", "", "", "accumulatedState", "b", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;", "community-moments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35183d {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final DesignSystemModel m111384b(DesignSystemModel designSystemModel, Map<String, ? extends Object> map) {
        WithGeneratedBindings withGeneratedBindings = designSystemModel instanceof WithGeneratedBindings ? (WithGeneratedBindings) designSystemModel : null;
        WithGeneratedBindings withGeneratedBindingsBind = withGeneratedBindings != null ? withGeneratedBindings.bind(map) : null;
        DesignSystemModel designSystemModel2 = withGeneratedBindingsBind instanceof DesignSystemModel ? (DesignSystemModel) withGeneratedBindingsBind : null;
        return designSystemModel2 == null ? designSystemModel : designSystemModel2;
    }
}
