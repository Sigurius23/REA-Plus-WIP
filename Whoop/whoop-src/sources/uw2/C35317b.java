package uw2;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import ad3.InterfaceC0773p;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.ActionSequenceAction;
import com.whoop.whoopaction.domain.models.AuthAction;
import com.whoop.whoopaction.domain.models.DismissModalAction;
import com.whoop.whoopaction.domain.models.DownloadAction;
import com.whoop.whoopaction.domain.models.OSAction;
import com.whoop.whoopaction.domain.models.PollingAction;
import com.whoop.whoopaction.domain.models.RefreshScopeAction;
import com.whoop.whoopaction.domain.models.ReloadAction;
import com.whoop.whoopaction.domain.models.StateClearAction;
import com.whoop.whoopaction.domain.models.StatePopAction;
import com.whoop.whoopaction.domain.models.StatePushAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import com.whoop.whoopaction.domain.models.UnknownAction;
import com.whoop.whoopaction.domain.models.UpdateAction;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12313p;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: uw2.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B/\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00050\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R(\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u001a\u0010(\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Luw2/b;", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/Action;", "", "", "Lj93/d;", "customActionTypes", "Ltr2/n;", "logger", "<init>", "(Ljava/util/Map;Ltr2/n;)V", "Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "action", "Ll83/a0;", "f", "(Lcom/whoop/whoopaction/domain/models/StateUpdateAction;)V", "Lcom/whoop/whoopaction/domain/models/StateClearAction;", "d", "(Lcom/whoop/whoopaction/domain/models/StateClearAction;)V", "key", "actionName", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "Lzc3/e;", "encoder", "value", "c", "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/Action;)V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/Action;", "a", "Ljava/util/Map;", "Ltr2/n;", "allActionTypes", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35317b implements InterfaceC37138c {

    /* JADX INFO: renamed from: f */
    public static final int f150506f = 8;

    /* JADX INFO: renamed from: g */
    private static final Map<String, InterfaceC21461d> f150507g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, InterfaceC21461d> customActionTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, InterfaceC21461d> allActionTypes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39443g descriptor;

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f150507g = AbstractC25247g0.m73990Y(new C23465k("ACTION_SEQUENCE", c22673i0.getOrCreateKotlinClass(ActionSequenceAction.class)), new C23465k("UPDATE", c22673i0.getOrCreateKotlinClass(UpdateAction.class)), new C23465k("DOWNLOAD", c22673i0.getOrCreateKotlinClass(DownloadAction.class)), new C23465k("POLLING", c22673i0.getOrCreateKotlinClass(PollingAction.class)), new C23465k("STATE_UPDATE", c22673i0.getOrCreateKotlinClass(StateUpdateAction.class)), new C23465k("STATE_CLEAR", c22673i0.getOrCreateKotlinClass(StateClearAction.class)), new C23465k("STATE_PUSH", c22673i0.getOrCreateKotlinClass(StatePushAction.class)), new C23465k("STATE_POP", c22673i0.getOrCreateKotlinClass(StatePopAction.class)), new C23465k("DISMISS_MODAL", c22673i0.getOrCreateKotlinClass(DismissModalAction.class)), new C23465k("OS_ACTION", c22673i0.getOrCreateKotlinClass(OSAction.class)), new C23465k("RELOAD", c22673i0.getOrCreateKotlinClass(ReloadAction.class)), new C23465k("REFRESH_SCOPE", c22673i0.getOrCreateKotlinClass(RefreshScopeAction.class)), new C23465k("AUTH", c22673i0.getOrCreateKotlinClass(AuthAction.class)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C35317b(Map<String, ? extends InterfaceC21461d> customActionTypes, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(customActionTypes, "customActionTypes");
        AbstractC22676k.m65750j(logger, "logger");
        this.customActionTypes = customActionTypes;
        this.logger = logger;
        this.allActionTypes = AbstractC25247g0.m73995d0(f150507g, customActionTypes);
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("Action")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("Action");
        m112167a(c39437a);
        this.descriptor = new C39444h("Action", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX INFO: renamed from: a */
    private static final C23454a0 m112167a(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.m125993a("type", StringSerializer.INSTANCE.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("parameters", JsonElement.Companion.serializer().getDescriptor(), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private final void m112168d(StateClearAction action) {
        List<String> keys = action.getKeys();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keys) {
            if (!AbstractC39421y.m125930O((String) obj, "$", false)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new SerializationException(AbstractC11895b.m31996o("StateClearAction validation failed: The 'keys' parameter contains variable names that must start with '$'. Invalid keys found in 'keys': [", AbstractC25265s.m74110N0(arrayList, ", ", null, null, null, 62), "]. Expected format: \"$variable_name\""));
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m112169e(String key, String actionName) {
        if (!AbstractC39421y.m125930O(key, "$", false)) {
            throw new SerializationException(AbstractC11895b.m31997p(actionName, " validation failed: 'key' must start with '$'. Invalid key: \"", key, "\". Expected format: \"$variable_name\""));
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m112170f(StateUpdateAction action) {
        Set<String> setKeySet = action.getState().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!AbstractC39421y.m125930O((String) obj, "$", false)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new SerializationException(AbstractC11895b.m31996o("StateUpdateAction validation failed: The 'state' parameter contains variable names that must start with '$'. Invalid keys found in 'state': [", AbstractC25265s.m74110N0(arrayList, ", ", null, null, null, 62), "]. Expected format: \"$variable_name\""));
        }
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Action deserialize(InterfaceC40541d decoder) {
        String strM1844f;
        AbstractC22676k.m65750j(decoder, "decoder");
        try {
            InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
            if (interfaceC0768k == null) {
                throw new SerializationException("ActionSerializer can only be used with JSON");
            }
            JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
            JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "type");
            if (jsonElement == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
                throw new SerializationException("Action is missing \"type\" field");
            }
            InterfaceC21461d interfaceC21461d = this.allActionTypes.get(strM1844f);
            if (interfaceC21461d == null) {
                throw new SerializationException("Unknown action type: ".concat(strM1844f));
            }
            InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(interfaceC21461d);
            if (interfaceC37138cM113847j == null) {
                throw new SerializationException("No serializer found for action type: ".concat(strM1844f));
            }
            JsonElement jsonObject = (JsonElement) jsonObjectM1847i.get((Object) "parameters");
            if (jsonObject == null) {
                jsonObject = new JsonObject(C25272z.f99163w);
            }
            Action action = (Action) interfaceC0768k.mo1837a().m1830a(interfaceC37138cM113847j, jsonObject);
            if (action instanceof StateUpdateAction) {
                m112170f((StateUpdateAction) action);
                return action;
            }
            if (action instanceof StateClearAction) {
                m112168d((StateClearAction) action);
                return action;
            }
            if (action instanceof StatePushAction) {
                m112169e(((StatePushAction) action).getKey(), "StatePushAction");
                return action;
            }
            if (action instanceof StatePopAction) {
                m112169e(((StatePopAction) action).getKey(), "StatePopAction");
            }
            return action;
        } catch (Exception e5) {
            this.logger.mo85230v("Action deserialization failed, returning UnknownAction", e5, new AbstractC30556a.a[0]);
            return UnknownAction.INSTANCE;
        }
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, Action value) {
        Object next;
        String str;
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC0773p interfaceC0773p = encoder instanceof InterfaceC0773p ? (InterfaceC0773p) encoder : null;
        if (interfaceC0773p == null) {
            throw new SerializationException("ActionSerializer can only be used with JSON");
        }
        Iterator<T> it = this.allActionTypes.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC21461d) ((Map.Entry) next).getValue()).isInstance(value));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (str = (String) entry.getKey()) == null) {
            throw new SerializationException(AbstractC11266d.m30461o("No registered type for action ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(value.getClass()).getSimpleName()));
        }
        InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(AbstractC22671h0.f89337a.getOrCreateKotlinClass(value.getClass()));
        InterfaceC37138c interfaceC37138c = interfaceC37138cM113847j instanceof InterfaceC37138c ? interfaceC37138cM113847j : null;
        if (interfaceC37138c == null) {
            throw new SerializationException("No serializer found for action type: ".concat(str));
        }
        AbstractC0757c abstractC0757cMo1852a = interfaceC0773p.mo1852a();
        abstractC0757cMo1852a.getClass();
        JsonElement jsonElementM34290h0 = AbstractC12313p.m34290h0(abstractC0757cMo1852a, value, interfaceC37138c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive element = AbstractC0770m.m1841c(str);
        AbstractC22676k.m65750j(element, "element");
        interfaceC0773p.mo1853c(new JsonObject(linkedHashMap));
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    public /* synthetic */ C35317b(Map map, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActionSerializer") : interfaceC34116n);
    }
}
