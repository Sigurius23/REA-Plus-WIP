package mi0;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import com.whoop.archv2.model.template.AnyScreenTemplate;
import com.whoop.archv2.model.template.FlowTemplate;
import com.whoop.archv2.model.template.ListTemplate;
import com.whoop.archv2.model.template.NavigationTemplate;
import com.whoop.archv2.model.template.ScreenTemplate;
import com.whoop.archv2.model.template.SingleItemTemplate;
import com.whoop.archv2.model.template.UnknownTemplate;
import com.whoop.cache.api.prefetch.PrefetchList;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.modal.LifecycleInteractions;
import j93.InterfaceC21461d;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: mi0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lmi0/a;", "Lwc3/c;", "Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "c", "(Lzc3/e;Lcom/whoop/archv2/model/template/AnyScreenTemplate;)V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "Lyc3/g;", "a", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25571a implements InterfaceC37138c {

    /* JADX INFO: renamed from: c */
    public static final int f100264c = 8;

    /* JADX INFO: renamed from: d */
    private static final Map<String, InterfaceC21461d> f100265d;

    /* JADX INFO: renamed from: e */
    private static final InterfaceC34116n f100266e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39443g descriptor;

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f100265d = AbstractC25247g0.m73990Y(new C23465k("LIST", c22673i0.getOrCreateKotlinClass(ListTemplate.class)), new C23465k("NAVIGATE", c22673i0.getOrCreateKotlinClass(NavigationTemplate.class)), new C23465k("SINGLE_ITEM", c22673i0.getOrCreateKotlinClass(SingleItemTemplate.class)), new C23465k("FLOW", c22673i0.getOrCreateKotlinClass(FlowTemplate.class)));
        f100266e = InterfaceC34116n.INSTANCE.m107848a("AnyScreenTemplateSerializer");
    }

    public C25571a() {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("AnyScreenTemplate")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("AnyScreenTemplate");
        m75182a(c39437a);
        this.descriptor = new C39444h("AnyScreenTemplate", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX INFO: renamed from: a */
    private static final C23454a0 m75182a(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        buildClassSerialDescriptor.m125993a("type", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("content", JsonElement.Companion.serializer().getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("prefetch_list", PrefetchList.INSTANCE.serializer().getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("lifecycle_interactions", LifecycleInteractions.INSTANCE.serializer().getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("bindings", new LinkedHashMapSerializer(stringSerializer, stringSerializer).getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("aggregate_bindings", new LinkedHashMapSerializer(stringSerializer, AggregateBinding.INSTANCE.serializer()).getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AnyScreenTemplate deserialize(InterfaceC40541d decoder) {
        ScreenTemplate screenTemplate;
        PrefetchList prefetchList;
        LifecycleInteractions lifecycleInteractions;
        Map map;
        Map map2;
        String strM1844f;
        AbstractC22676k.m65750j(decoder, "decoder");
        Map map3 = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new SerializationException("AnyScreenTemplateSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        try {
            JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "type");
            if (jsonElement == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
                throw new SerializationException("Missing \"type\" field");
            }
            Map<String, InterfaceC21461d> map4 = f100265d;
            String upperCase = strM1844f.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            InterfaceC21461d interfaceC21461d = map4.get(upperCase);
            if (interfaceC21461d == null) {
                throw new SerializationException("Unknown template type: ".concat(strM1844f));
            }
            InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(interfaceC21461d);
            if (interfaceC37138cM113847j == null) {
                throw new SerializationException("No serializer found for template type: ".concat(strM1844f));
            }
            JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "content");
            if (jsonElement2 == null) {
                throw new SerializationException("Missing \"content\" field");
            }
            screenTemplate = (ScreenTemplate) interfaceC0768k.mo1837a().m1830a(interfaceC37138cM113847j, jsonElement2);
            ScreenTemplate screenTemplate2 = screenTemplate;
            try {
                JsonElement jsonElement3 = (JsonElement) jsonObjectM1847i.get((Object) "prefetch_list");
                prefetchList = (jsonElement3 == null || jsonElement3.equals(JsonNull.INSTANCE)) ? null : (PrefetchList) interfaceC0768k.mo1837a().m1830a(PrefetchList.INSTANCE.serializer(), jsonElement3);
            } catch (SerializationException e5) {
                f100266e.mo85213c("PrefetchList deserialization failed, returning null", e5, new AbstractC30556a.a[0]);
                prefetchList = null;
            }
            try {
                JsonElement jsonElement4 = (JsonElement) jsonObjectM1847i.get((Object) "lifecycle_interactions");
                lifecycleInteractions = (jsonElement4 == null || jsonElement4.equals(JsonNull.INSTANCE)) ? null : (LifecycleInteractions) interfaceC0768k.mo1837a().m1830a(LifecycleInteractions.INSTANCE.serializer(), jsonElement4);
            } catch (SerializationException e13) {
                f100266e.mo85213c("LifecycleInteractions deserialization failed, returning null", e13, new AbstractC30556a.a[0]);
                lifecycleInteractions = null;
            }
            try {
                JsonElement jsonElement5 = (JsonElement) jsonObjectM1847i.get((Object) "bindings");
                if (jsonElement5 == null || jsonElement5.equals(JsonNull.INSTANCE)) {
                    map2 = null;
                } else {
                    AbstractC0757c abstractC0757cMo1837a = interfaceC0768k.mo1837a();
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    map2 = (Map) abstractC0757cMo1837a.m1830a(AbstractC38195a.m122335c(stringSerializer, stringSerializer), jsonElement5);
                }
                map = map2;
            } catch (SerializationException e14) {
                f100266e.mo85213c("bindings deserialization failed, returning null", e14, new AbstractC30556a.a[0]);
                map = null;
            }
            try {
                JsonElement jsonElement6 = (JsonElement) jsonObjectM1847i.get((Object) "aggregate_bindings");
                if (jsonElement6 != null && !jsonElement6.equals(JsonNull.INSTANCE)) {
                    map3 = (Map) interfaceC0768k.mo1837a().m1830a(LenientAggregateBindingsSerializer.INSTANCE, jsonElement6);
                }
            } catch (SerializationException e15) {
                f100266e.mo85213c("aggregate_bindings deserialization failed, returning null", e15, new AbstractC30556a.a[0]);
            } catch (IllegalArgumentException e16) {
                f100266e.mo85213c("aggregate_bindings deserialization failed, returning null", e16, new AbstractC30556a.a[0]);
            }
            return new AnyScreenTemplate(screenTemplate2, prefetchList, lifecycleInteractions, map, map3);
        } catch (SerializationException e17) {
            f100266e.mo85213c("Template deserialization failed, returning UnknownTemplate", e17, new AbstractC30556a.a[0]);
            screenTemplate = UnknownTemplate.INSTANCE;
        }
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, AnyScreenTemplate value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of AnyScreenTemplate not supported. Templates only deserialized from backend.");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }
}
