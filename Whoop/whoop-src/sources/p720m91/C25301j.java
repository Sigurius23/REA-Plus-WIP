package p720m91;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.json.C9602a;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.UnknownAction;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import u82.AbstractC34647h;
import uw2.C35317b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: m91.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lm91/j;", "Lwc3/c;", "Lcom/whoop/design/item/DesignItemInteraction;", "<init>", "()V", "Lad3/k;", "jsonDecoder", "Lkotlinx/serialization/json/JsonElement;", "element", "", "c", "(Lad3/k;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "f", "e", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "d", "(Lzc3/e;Lcom/whoop/design/item/DesignItemInteraction;)V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/design/item/DesignItemInteraction;", "Lyc3/g;", "a", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25301j implements InterfaceC37138c {

    /* JADX INFO: renamed from: c */
    public static final int f99289c = 8;

    /* JADX INFO: renamed from: d */
    private static final InterfaceC34116n f99290d = InterfaceC34116n.INSTANCE.m107848a("DesignItemInteractionSerializer");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39443g descriptor;

    public C25301j() {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("DesignItemInteraction")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("DesignItemInteraction");
        m74264a(c39437a);
        this.descriptor = new C39444h("DesignItemInteraction", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX INFO: renamed from: a */
    private static final C23454a0 m74264a(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.m125993a("action_argument", AbstractC38195a.m122336d(JsonElement.Companion.serializer()).getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("analytic_event", AbstractC38195a.m122336d(AnalyticEventModel.INSTANCE.serializer()).getDescriptor(), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    private final Object m74265c(InterfaceC0768k jsonDecoder, JsonElement element) {
        Object objM74267f = m74267f(jsonDecoder, element);
        if (objM74267f != null) {
            return objM74267f;
        }
        Object objM74266e = m74266e(jsonDecoder, element);
        return objM74266e == null ? AbstractC34647h.m109488c(element) : objM74266e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    private final Object m74266e(InterfaceC0768k jsonDecoder, JsonElement element) {
        Map map = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            Action action = (Action) jsonDecoder.mo1837a().m1830a(new C35317b(map, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0), element);
            if (action instanceof UnknownAction) {
                return null;
            }
            return action;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    private final Object m74267f(InterfaceC0768k jsonDecoder, JsonElement element) {
        Map map = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            C9598e c9598e = (C9598e) jsonDecoder.mo1837a().m1830a(new C9602a(map, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0), element);
            if (AbstractC22676k.m65745e(c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                return null;
            }
            return c9598e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DesignItemInteraction deserialize(InterfaceC40541d decoder) {
        AnalyticEventModel analyticEventModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        Object objM74265c = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new SerializationException("DesignItemInteractionSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        try {
            JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "analytic_event");
            if (jsonElement == null) {
                analyticEventModel = null;
            } else {
                if (jsonElement instanceof JsonNull) {
                    jsonElement = null;
                }
                if (jsonElement != null) {
                    AbstractC0757c abstractC0757cMo1837a = interfaceC0768k.mo1837a();
                    abstractC0757cMo1837a.getClass();
                    analyticEventModel = (AnalyticEventModel) abstractC0757cMo1837a.m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonElement);
                } else {
                    analyticEventModel = null;
                }
            }
        } catch (SerializationException e5) {
            f99290d.mo85213c("AnalyticEvent deserialization failed, returning null", e5, new AbstractC30556a.a[0]);
        }
        try {
            JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "action_argument");
            if (jsonElement2 != null) {
                if (jsonElement2 instanceof JsonNull) {
                    jsonElement2 = null;
                }
                if (jsonElement2 != null) {
                    objM74265c = m74265c(interfaceC0768k, jsonElement2);
                }
            }
        } catch (SerializationException e13) {
            f99290d.mo85213c("ActionArgument deserialization failed, returning null", e13, new AbstractC30556a.a[0]);
        }
        return new DesignItemInteraction(objM74265c, analyticEventModel);
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, DesignItemInteraction value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of DesignItemInteraction not supported. DesignItemInteraction only deserialized from backend.");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }
}
