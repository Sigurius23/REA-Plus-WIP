package jb1;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.UnknownDesignModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.InterfaceC23457c;
import m83.AbstractC25267u;
import m83.C25272z;
import p710im1.C18689p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23603c1;
import p716lb1.C23743y0;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: jb1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012(\b\u0002\u0010\t\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001dJ!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0004\b\u001f\u0010\u001bJ5\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\"\u0010#J7\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b%\u0010#J\u0017\u0010&\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R4\u0010\t\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010*¨\u0006+"}, m65681d2 = {"Ljb1/a;", "", "Llb1/y0;", "modelMapper", "", "Lj93/d;", "Lkotlin/Function1;", "Lm91/u;", "Lcom/whoop/design/reducer/ItemConfig;", "itemConfigs", "<init>", "(Llb1/y0;Ljava/util/Map;)V", "item", "c", "(Lm91/u;)Lm91/u;", "Lcom/whoop/design/models/DesignSystemModel;", "model", "n", "(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;", "", "e", "(Lcom/whoop/design/models/DesignSystemModel;)Z", "f", "()Llb1/y0;", "", "models", "g", "(Ljava/util/List;)Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;", "l", "m", "", "accumulatedState", "b", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;", "Lm91/o;", "j", "i", "(Lcom/whoop/design/models/DesignSystemModel;)Lm91/o;", "a", "Llb1/y0;", "Ljava/util/Map;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21535a {

    /* JADX INFO: renamed from: c */
    public static final int f82608c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23743y0 modelMapper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<InterfaceC21461d, Function1> itemConfigs;

    /* JADX WARN: Multi-variable type inference failed */
    public C21535a(C23743y0 modelMapper, Map<InterfaceC21461d, ? extends Function1> itemConfigs) {
        AbstractC22676k.m65750j(modelMapper, "modelMapper");
        AbstractC22676k.m65750j(itemConfigs, "itemConfigs");
        this.modelMapper = modelMapper;
        this.itemConfigs = itemConfigs;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC25312u m60533c(InterfaceC25312u item) {
        return (InterfaceC25312u) this.itemConfigs.getOrDefault(AbstractC22671h0.f89337a.getOrCreateKotlinClass(item.getClass()), new C18689p0(23)).invoke(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC25312u m60534d(InterfaceC25312u it) {
        AbstractC22676k.m65750j(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m60535e(DesignSystemModel model) {
        DesignSystemModel designSystemModelM60537n = m60537n(model);
        return !(designSystemModelM60537n instanceof UnknownDesignModel) && this.modelMapper.m69690a(designSystemModelM60537n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ List m60536k(C21535a c21535a, List list, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        return c21535a.m60543j(list, map);
    }

    /* JADX INFO: renamed from: n */
    private final DesignSystemModel m60537n(DesignSystemModel model) {
        return AbstractC21537c.m60558h(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final List<DesignSystemModel> m60538b(List<? extends DesignSystemModel> models, Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(models, "models");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if (accumulatedState.isEmpty()) {
            return models;
        }
        List<? extends DesignSystemModel> list = models;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC21537c.m60553c((DesignSystemModel) it.next(), accumulatedState));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C23743y0 getModelMapper() {
        return this.modelMapper;
    }

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC25312u> m60540g(List<? extends DesignSystemModel> models) {
        AbstractC22676k.m65750j(models, "models");
        ArrayList<DesignSystemModel> arrayList = new ArrayList();
        for (Object obj : models) {
            if (m60535e((DesignSystemModel) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (DesignSystemModel designSystemModel : arrayList) {
            arrayList2.add(m60533c((InterfaceC25312u) this.modelMapper.m69691b(m60537n(designSystemModel)).invoke(m60537n(designSystemModel))));
        }
        return arrayList2;
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: h */
    public final InterfaceC25312u m60541h(DesignSystemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m60533c((InterfaceC25312u) this.modelMapper.m69691b(m60537n(model)).invoke(m60537n(model)));
    }

    /* JADX INFO: renamed from: i */
    public final C25306o m60542i(DesignSystemModel model) {
        AbstractC22676k.m65750j(model, "model");
        if (!m60535e(model)) {
            return null;
        }
        DesignSystemModel designSystemModelM60537n = m60537n(model);
        InterfaceC25312u interfaceC25312uM60533c = m60533c((InterfaceC25312u) this.modelMapper.m69691b(designSystemModelM60537n).invoke(designSystemModelM60537n));
        DesignModelWrapper designModelWrapper = model instanceof DesignModelWrapper ? (DesignModelWrapper) model : null;
        return new C25306o(interfaceC25312uM60533c, designModelWrapper != null ? designModelWrapper.getPrimaryAnalyticEvent() : null);
    }

    /* JADX INFO: renamed from: j */
    public final List<C25306o> m60543j(List<? extends DesignSystemModel> models, Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(models, "models");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        List<DesignSystemModel> listM60538b = m60538b(models, accumulatedState);
        ArrayList<DesignSystemModel> arrayList = new ArrayList();
        for (Object obj : listM60538b) {
            if (m60535e((DesignSystemModel) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (DesignSystemModel designSystemModel : arrayList) {
            DesignSystemModel designSystemModelM60537n = m60537n(designSystemModel);
            InterfaceC25312u interfaceC25312uM60533c = m60533c((InterfaceC25312u) this.modelMapper.m69691b(designSystemModelM60537n).invoke(designSystemModelM60537n));
            AnalyticEventModel primaryAnalyticEvent = null;
            DesignModelWrapper designModelWrapper = designSystemModel instanceof DesignModelWrapper ? (DesignModelWrapper) designSystemModel : null;
            if (designModelWrapper != null) {
                primaryAnalyticEvent = designModelWrapper.getPrimaryAnalyticEvent();
            }
            arrayList2.add(new C25306o(interfaceC25312uM60533c, primaryAnalyticEvent));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC25312u m60544l(DesignSystemModel model) {
        AbstractC22676k.m65750j(model, "model");
        if (!m60535e(model)) {
            return null;
        }
        DesignSystemModel designSystemModelM60537n = m60537n(model);
        return m60533c((InterfaceC25312u) this.modelMapper.m69691b(designSystemModelM60537n).invoke(designSystemModelM60537n));
    }

    /* JADX INFO: renamed from: m */
    public final List<InterfaceC25312u> m60545m(List<? extends DesignSystemModel> models) {
        AbstractC22676k.m65750j(models, "models");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = models.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60544l = m60544l((DesignSystemModel) it.next());
            if (interfaceC25312uM60544l != null) {
                arrayList.add(interfaceC25312uM60544l);
            }
        }
        return arrayList;
    }

    public /* synthetic */ C21535a(C23743y0 c23743y0, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC23603c1.m68574a() : c23743y0, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }
}
