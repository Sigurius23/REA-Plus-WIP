package com.whoop.archv2.feature.domain;

import ad3.AbstractC0770m;
import cj0.AbstractC4741c;
import com.whoop.archv2.model.template.FlowStep;
import com.whoop.archv2.model.template.FlowTemplate;
import com.whoop.archv2.model.template.ListPagination;
import com.whoop.archv2.model.template.ListTemplate;
import com.whoop.archv2.model.template.PaginationErrorState;
import com.whoop.archv2.model.template.PaginationStates;
import com.whoop.archv2.model.template.ScreenTemplate;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.whoopaction.domain.models.ReloadAction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\"\u0004\b\u0000\u0010\u000e*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u00020\u0014*\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u00020\u0014*\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016\u001a+\u0010\u001d\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%\u001a?\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(\u001a+\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u000f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010.\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/\u001a\u001b\u00101\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102\u001a\u001b\u00104\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105¨\u00066"}, m65681d2 = {"", "screenCacheKey", "requestPath", "p", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "reloadAction", "n", "(Lcom/whoop/whoopaction/domain/models/ReloadAction;)Ljava/lang/String;", "Lcom/whoop/archv2/feature/domain/a;", "previous", "incoming", "k", "(Lcom/whoop/archv2/feature/domain/a;Lcom/whoop/archv2/feature/domain/a;)Lcom/whoop/archv2/feature/domain/a;", "T", "", "fallback", "l", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/archv2/feature/domain/b;", "", "j", "(Lcom/whoop/archv2/feature/domain/b;)Z", "r", "Lcom/whoop/archv2/feature/domain/f;", "Lcom/whoop/archv2/feature/domain/i$m;", "action", "preserveActiveDialog", "reconcileFlowSteps", "i", "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$m;ZZ)Lcom/whoop/archv2/feature/domain/f;", "", "", "accumulatedState", "Lcom/whoop/archv2/model/template/FlowTemplate;", "template", "q", "(Ljava/util/Map;Lcom/whoop/archv2/model/template/FlowTemplate;Z)Ljava/util/Map;", "key", "m", "(Ljava/util/Map;Ljava/lang/String;Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/util/Map;", "Lkotlinx/serialization/json/JsonElement;", "stack", "o", "(Ljava/util/List;Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/util/List;", "Lcom/whoop/archv2/feature/domain/i$h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$h;)Lcom/whoop/archv2/feature/domain/f;", "Lcom/whoop/archv2/feature/domain/i$g;", "g", "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$g;)Lcom/whoop/archv2/feature/domain/f;", "Lcom/whoop/archv2/feature/domain/i$a;", "f", "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$a;)Lcom/whoop/archv2/feature/domain/f;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6000h {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C5998f m17991f(C5998f c5998f, AbstractC6001i.a aVar) {
        List<DesignSystemModel> items;
        ScreenTemplate screenTemplate;
        ScreenTemplate screenTemplate2 = c5998f.getScreenTemplate();
        ListTemplate listTemplate = screenTemplate2 instanceof ListTemplate ? (ListTemplate) screenTemplate2 : null;
        if (listTemplate == null || (items = listTemplate.getItems()) == null) {
            items = C25271y.f99162w;
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(items, aVar.m18004a());
        if (listTemplate == null || (screenTemplate = ListTemplate.copy$default(listTemplate, null, null, arrayListM74129g1, null, null, null, null, null, null, null, 1019, null)) == null) {
            screenTemplate = c5998f.getScreenTemplate();
        }
        return C5998f.m17897b(c5998f, null, screenTemplate, false, false, false, null, null, null, null, false, null, null, aVar.getNextPageRequest(), EnumC6009o.IDLE, c5998f.getPaginationErrorState(), null, null, null, null, 495613, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C5998f m17992g(C5998f c5998f, AbstractC6001i.g gVar) {
        Object obj = c5998f.m17899c().get(gVar.getKey());
        JsonArray jsonArray = obj instanceof JsonArray ? (JsonArray) obj : null;
        List listM74093D1 = jsonArray != null ? AbstractC25265s.m74093D1(jsonArray) : null;
        if (listM74093D1 == null) {
            listM74093D1 = C25271y.f99162w;
        }
        return listM74093D1.isEmpty() ? c5998f : C5998f.m17897b(c5998f, null, null, false, false, false, null, null, null, null, false, AbstractC25247g0.m73996e0(c5998f.m17899c(), new C23465k(gVar.getKey(), new JsonArray(AbstractC25265s.m74086A0(1, listM74093D1)))), null, null, null, null, null, null, null, null, 523263, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C5998f m17993h(C5998f c5998f, AbstractC6001i.h hVar) {
        Object obj = c5998f.m17899c().get(hVar.getKey());
        JsonArray jsonArray = obj instanceof JsonArray ? (JsonArray) obj : null;
        List listM74093D1 = jsonArray != null ? AbstractC25265s.m74093D1(jsonArray) : null;
        if (listM74093D1 == null) {
            listM74093D1 = C25271y.f99162w;
        }
        return C5998f.m17897b(c5998f, null, null, false, false, false, null, null, null, null, false, AbstractC25247g0.m73996e0(c5998f.m17899c(), new C23465k(hVar.getKey(), new JsonArray(AbstractC25265s.m74128f1(hVar.getValue(), listM74093D1)))), null, null, null, null, null, null, null, null, 523263, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C5998f m17994i(C5998f c5998f, AbstractC6001i.m mVar, boolean z4, boolean z13) {
        Map<String, Object> mapM17899c;
        ListPagination pagination;
        PaginationStates states;
        ListPagination pagination2;
        C5998f domainState = mVar.getDomainState();
        InterfaceC5994b currentDialogType = (z4 && m17995j(c5998f.getCurrentDialogType()) && m18003r(domainState.getCurrentDialogType())) ? c5998f.getCurrentDialogType() : domainState.getCurrentDialogType();
        Map<String, Object> mapM17899c2 = c5998f.m17899c();
        C6010p pendingMediaPick = c5998f.getPendingMediaPick();
        AnyModal modal = domainState.getModal();
        if (modal == null) {
            modal = c5998f.getModal();
        }
        AnyModal anyModal = modal;
        AnyModal nestedModal = domainState.getNestedModal();
        if (nestedModal == null) {
            nestedModal = c5998f.getNestedModal();
        }
        C5998f c5998fM17897b = C5998f.m17897b(domainState, currentDialogType, null, false, false, false, null, anyModal, nestedModal, null, false, mapM17899c2, null, null, null, null, null, null, pendingMediaPick, m17996k(c5998f.getTopItems(), domainState.getTopItems()), 129854, null);
        ScreenTemplate screenTemplate = c5998fM17897b.getScreenTemplate();
        PaginationErrorState errorState = null;
        ListTemplate listTemplate = screenTemplate instanceof ListTemplate ? (ListTemplate) screenTemplate : null;
        ScreenTemplate screenTemplate2 = c5998fM17897b.getScreenTemplate();
        FlowTemplate flowTemplate = screenTemplate2 instanceof FlowTemplate ? (FlowTemplate) screenTemplate2 : null;
        if (flowTemplate == null || (mapM17899c = m18002q(c5998fM17897b.m17899c(), flowTemplate, z13)) == null) {
            mapM17899c = c5998fM17897b.m17899c();
        }
        Map<String, Object> map = mapM17899c;
        ApiRequest nextPageRequest = (listTemplate == null || (pagination2 = listTemplate.getPagination()) == null) ? null : pagination2.getNextPageRequest();
        EnumC6009o enumC6009o = EnumC6009o.IDLE;
        if (listTemplate != null && (pagination = listTemplate.getPagination()) != null && (states = pagination.getStates()) != null) {
            errorState = states.getErrorState();
        }
        return C5998f.m17897b(c5998fM17897b, null, null, false, false, false, null, null, null, null, false, map, null, nextPageRequest, enumC6009o, errorState, null, null, null, null, 494591, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final boolean m17995j(InterfaceC5994b interfaceC5994b) {
        return (interfaceC5994b instanceof InterfaceC5994b.b) || AbstractC22676k.m65745e(interfaceC5994b, InterfaceC5994b.e.f23692a);
    }

    /* JADX INFO: renamed from: k */
    private static final C5993a m17996k(C5993a c5993a, C5993a c5993a2) {
        List listM17997l = m17997l(c5993a != null ? c5993a.m17879b() : null, c5993a2 != null ? c5993a2.m17879b() : null);
        List listM17997l2 = m17997l(c5993a != null ? c5993a.m17878a() : null, c5993a2 != null ? c5993a2.m17878a() : null);
        if (listM17997l == null && listM17997l2 == null) {
            return null;
        }
        return new C5993a(listM17997l, listM17997l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private static final <T> List<T> m17997l(List<? extends T> list, List<? extends T> list2) {
        List<? extends T> list3 = list;
        return (list3 == null || list3.isEmpty()) ? list2 : list;
    }

    /* JADX INFO: renamed from: m */
    private static final Map<String, Object> m17998m(Map<String, ? extends Object> map, String str, FlowTemplate flowTemplate) {
        String content;
        Object obj = map.get(str);
        JsonArray jsonArray = obj instanceof JsonArray ? (JsonArray) obj : null;
        if (jsonArray != null) {
            ArrayList arrayList = new ArrayList();
            for (JsonElement jsonElement : jsonArray) {
                JsonElement jsonElement2 = jsonElement;
                JsonPrimitive jsonPrimitive = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
                if ((jsonPrimitive == null || (content = jsonPrimitive.getContent()) == null) ? false : flowTemplate.getSteps().containsKey(content)) {
                    arrayList.add(jsonElement);
                }
            }
            if (arrayList.isEmpty()) {
                List<String> currentStepList = flowTemplate.getCurrentStepList();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(currentStepList, 10));
                Iterator<T> it = currentStepList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(AbstractC0770m.m1841c((String) it.next()));
                }
                arrayList = arrayList2;
            }
            JsonArray jsonArray2 = new JsonArray(m18000o(arrayList, flowTemplate));
            if (!jsonArray2.equals(jsonArray)) {
                return AbstractC25247g0.m73996e0(map, new C23465k(str, jsonArray2));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: n */
    public static final String m17999n(ReloadAction reloadAction) {
        String cacheKey;
        AbstractC22676k.m65750j(reloadAction, "reloadAction");
        CachePolicyModel cachePolicy = reloadAction.getCachePolicy();
        return (cachePolicy == null || (cacheKey = cachePolicy.getCacheKey()) == null) ? reloadAction.getRequest().getPath() : cacheKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    private static final List<JsonElement> m18000o(List<? extends JsonElement> list, FlowTemplate flowTemplate) {
        List<String> currentStepList = flowTemplate.getCurrentStepList();
        Map<String, FlowStep> steps = flowTemplate.getSteps();
        ArrayList arrayList = new ArrayList();
        for (Object obj : currentStepList) {
            if (steps.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (JsonElement jsonElement : list) {
                JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
                String content = jsonPrimitive != null ? jsonPrimitive.getContent() : null;
                if (content != null) {
                    arrayList2.add(content);
                }
            }
            if (!AbstractC25265s.m74156w1(arrayList2, arrayList.size()).equals(arrayList)) {
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(AbstractC0770m.m1841c((String) it.next()));
                }
                return arrayList3;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: p */
    public static final String m18001p(String str, String str2) {
        return str == null ? str2 : str;
    }

    /* JADX INFO: renamed from: q */
    private static final Map<String, Object> m18002q(Map<String, ? extends Object> map, FlowTemplate flowTemplate, boolean z4) {
        String strM14894a = AbstractC4741c.m14894a(flowTemplate);
        if (strM14894a == null) {
            return map;
        }
        if (map.containsKey(strM14894a)) {
            return z4 ? m17998m(map, strM14894a, flowTemplate) : map;
        }
        List<String> currentStepList = flowTemplate.getCurrentStepList();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(currentStepList, 10));
        Iterator<T> it = currentStepList.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0770m.m1841c((String) it.next()));
        }
        return AbstractC25247g0.m73996e0(map, new C23465k(strM14894a, new JsonArray(arrayList)));
    }

    /* JADX INFO: renamed from: r */
    private static final boolean m18003r(InterfaceC5994b interfaceC5994b) {
        return interfaceC5994b == null || (interfaceC5994b instanceof InterfaceC5994b.b);
    }
}
