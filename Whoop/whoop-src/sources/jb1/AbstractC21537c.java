package jb1;

import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.items.SectionModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25267u;
import p710im1.C18689p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jb1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0013\u0010\u0014*$\b\u0002\u0010\u0016\"\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u000e2\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u000e¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/design/models/DesignSystemModel;", "model", "", "", "", "accumulatedState", "c", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;", "original", "updatedModel", "g", "(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;", "Lkotlin/Function1;", "Ljb1/b;", "Ll83/a0;", "block", "Ljb1/a;", "d", "(Lkotlin/jvm/functions/Function1;)Ljb1/a;", "Lm91/u;", "ItemConfig", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21537c {
    /* JADX INFO: renamed from: c */
    public static final DesignSystemModel m60553c(DesignSystemModel designSystemModel, Map<String, ? extends Object> accumulatedState) {
        DesignSystemModel model = designSystemModel;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if (accumulatedState.isEmpty()) {
            return model;
        }
        DesignSystemModel designSystemModelM60558h = m60558h(model);
        if (designSystemModelM60558h instanceof SectionModel) {
            SectionModel sectionModel = (SectionModel) designSystemModelM60558h;
            List<DesignSystemModel> items = sectionModel.getItems();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(m60553c((DesignSystemModel) it.next(), accumulatedState));
            }
            model = m60557g(model, SectionModel.copy$default(sectionModel, null, null, null, arrayList, 0.0f, 0.0f, 0.0f, null, false, null, null, 2039, null), accumulatedState);
        }
        DesignSystemModel designSystemModelM60558h2 = m60558h(model);
        WithGeneratedBindings withGeneratedBindings = designSystemModelM60558h2 instanceof WithGeneratedBindings ? (WithGeneratedBindings) designSystemModelM60558h2 : null;
        WithGeneratedBindings withGeneratedBindingsBind = withGeneratedBindings != null ? withGeneratedBindings.bind(accumulatedState) : null;
        DesignSystemModel designSystemModel2 = withGeneratedBindingsBind instanceof DesignSystemModel ? (DesignSystemModel) withGeneratedBindingsBind : null;
        if (designSystemModel2 != null) {
            designSystemModelM60558h2 = designSystemModel2;
        }
        return m60557g(model, designSystemModelM60558h2, accumulatedState);
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m60554d(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        C21536b c21536b = new C21536b();
        block.invoke(c21536b);
        return new C21535a(c21536b.getModelMapper(), c21536b.m60549d());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C21535a m60555e(Function1 function1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = new C18689p0(24);
        }
        return m60554d(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m60556f(C21536b c21536b) {
        AbstractC22676k.m65750j(c21536b, "<this>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final DesignSystemModel m60557g(DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, Map<String, ? extends Object> map) {
        return designSystemModel instanceof DesignModelWrapper ? ((DesignModelWrapper) designSystemModel).rewrap$design_models_release(designSystemModel2, map) : designSystemModel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final DesignSystemModel m60558h(DesignSystemModel designSystemModel) {
        return DesignSystemModelKt.unwrap(designSystemModel);
    }
}
