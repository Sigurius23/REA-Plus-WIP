package o91;

import ad3.InterfaceC0768k;
import b61.C2755j;
import c93.InterfaceC4351m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.UnknownDesignModel;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: o91.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\f\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007j\u0002`\u000b0\u0000*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\f\u0010\r*0\b\u0002\u0010\u000e\"\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00072\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¨\u0006\u000f"}, m65681d2 = {"", "", "Lj93/d;", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lkotlin/Function2;", "Lad3/k;", "Lkotlinx/serialization/json/JsonElement;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/json/serializers/DesignSystemModelFactory;", "c", "(Ljava/util/Map;Ltr2/n;Lrr2/c;)Ljava/util/Map;", "DesignSystemModelFactory", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27685b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Map<String, InterfaceC4351m> m83693c(Map<String, ? extends InterfaceC21461d> map, InterfaceC34116n interfaceC34116n, InterfaceC31766c interfaceC31766c) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new C2755j((InterfaceC21461d) entry.getValue(), interfaceC34116n, (String) entry.getKey(), interfaceC31766c, 2));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final DesignSystemModel m83694d(InterfaceC21461d interfaceC21461d, InterfaceC34116n interfaceC34116n, String str, InterfaceC31766c interfaceC31766c, InterfaceC0768k decoder, JsonElement content) {
        Object objM1830a;
        AbstractC22676k.m65750j(decoder, "decoder");
        AbstractC22676k.m65750j(content, "content");
        try {
            InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(interfaceC21461d);
            if (interfaceC37138cM113847j == null || (objM1830a = decoder.mo1837a().m1830a(interfaceC37138cM113847j, content)) == null) {
                objM1830a = UnknownDesignModel.INSTANCE;
            }
            DesignSystemModel designSystemModel = objM1830a instanceof DesignSystemModel ? (DesignSystemModel) objM1830a : null;
            return designSystemModel == null ? UnknownDesignModel.INSTANCE : designSystemModel;
        } catch (SerializationException e5) {
            interfaceC34116n.mo85230v(AbstractC11266d.m30461o("Failed to deserialize design model type: ", str), e5, new AbstractC30556a.a[0]);
            if (interfaceC31766c != null) {
                interfaceC31766c.mo98631p(e5);
            }
            return UnknownDesignModel.INSTANCE;
        }
    }
}
