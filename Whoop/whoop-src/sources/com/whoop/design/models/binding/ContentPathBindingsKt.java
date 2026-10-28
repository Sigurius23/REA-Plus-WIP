package com.whoop.design.models.binding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a{\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u0002H\u00012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0018\u00010\n¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m65681d2 = {"overlayContentPathBindings", "T", "contentBinding", "", "", "propertyWireKey", "accumulatedState", "", "base", "serialize", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "deserialize", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ContentPathBindingsKt {
    public static final <T> T overlayContentPathBindings(Map<String, String> map, String propertyWireKey, Map<String, ? extends Object> accumulatedState, T t14, Function1 function1, Function1 function2) {
        JsonElement nestedValue;
        AbstractC22676k.m65750j(propertyWireKey, "propertyWireKey");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if (map != null && !map.isEmpty()) {
            String strConcat = propertyWireKey.concat(".");
            String strM8299l = AbstractC2875y.m8299l(AggregateBindingKt.camelToSnakeCase(propertyWireKey), ".");
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            ArrayList arrayList = new ArrayList();
            for (T t15 : setEntrySet) {
                String str = (String) ((Map.Entry) t15).getKey();
                if (AbstractC39421y.m125930O(str, strConcat, false) || AbstractC39421y.m125930O(str, strM8299l, false)) {
                    arrayList.add(t15);
                }
            }
            List<Map.Entry> listM74152u1 = AbstractC25265s.m74152u1(arrayList, new Comparator() { // from class: com.whoop.design.models.binding.ContentPathBindingsKt$overlayContentPathBindings$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t16, T t17) {
                    return AbstractC30060g.m92127q((String) ((Map.Entry) t16).getKey(), (String) ((Map.Entry) t17).getKey());
                }
            });
            if (!listM74152u1.isEmpty() && function1 != null && function2 != null) {
                InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("JdslBinding");
                JsonElement jsonElement = (JsonElement) function1.invoke(t14);
                if (jsonElement != null) {
                    boolean z4 = false;
                    for (Map.Entry entry : listM74152u1) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        List listM74161z0 = AbstractC25265s.m74161z0(AbstractC39414r.m125905x0(str2, new char[]{'.'}, 0, 6), 1);
                        List list = listM74161z0;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((String) it.next()).length() == 0) {
                                        interfaceC34116nM107848a.mo85222m(AbstractC2875y.m8300m("binding malformed: property=\"", propertyWireKey, "\" path_key=\"", str2, "\""), new AbstractC30556a.a[0]);
                                    }
                                }
                            }
                        }
                        Object objResolveStateRef = StateLookupKt.resolveStateRef(str3, accumulatedState);
                        if (objResolveStateRef == null) {
                            interfaceC34116nM107848a.mo85228t(AbstractC25012a.m73376i(str3, "\"", AbstractC11895b.m32001t("content_binding state absent: property=\"", propertyWireKey, "\" path_key=\"", str2, "\" reference=\"")), new AbstractC30556a.a[0]);
                        } else {
                            JsonElement jsonElementAnyToJsonElement = DotPathBindingsKt.anyToJsonElement(objResolveStateRef);
                            if (jsonElementAnyToJsonElement != null && (nestedValue = JsonPathSetterKt.setNestedValue(jsonElement, listM74161z0, jsonElementAnyToJsonElement, true)) != null) {
                                interfaceC34116nM107848a.mo85228t(AbstractC2875y.m8300m("content_binding path=", str2, " key=", str3, " -> applied"), new AbstractC30556a.a[0]);
                                jsonElement = nestedValue;
                                z4 = true;
                            }
                        }
                    }
                    if (z4) {
                        T t16 = (T) function2.invoke(jsonElement);
                        if (t16 != null) {
                            return t16;
                        }
                        interfaceC34116nM107848a.mo85222m(AbstractC11895b.m31996o("content_binding path decode failed: property=\"", propertyWireKey, "\""), new AbstractC30556a.a[0]);
                        return t14;
                    }
                }
            }
        }
        return t14;
    }
}
