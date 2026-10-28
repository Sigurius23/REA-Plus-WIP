package com.whoop.design.json;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import ad3.InterfaceC0773p;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.design.models.modal.CoachModal;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.FullScreenContentModal;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.models.modal.ModalAnalyticEventModel;
import com.whoop.design.models.modal.ModalLifecycleInteractions;
import com.whoop.design.models.modal.ModalType;
import com.whoop.design.models.modal.ToastModal;
import com.whoop.design.models.modal.UnknownModal;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
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
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: com.whoop.design.json.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/design/json/a;", "Lwc3/c;", "Lcom/whoop/design/models/modal/AnyModal;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "e", "(Lzc3/e;Lcom/whoop/design/models/modal/AnyModal;)V", "Lcom/whoop/design/models/modal/Modal;", "modal", "Ll83/k;", "", "d", "(Lcom/whoop/design/models/modal/Modal;)Ll83/k;", "Lzc3/d;", "decoder", "c", "(Lzc3/d;)Lcom/whoop/design/models/modal/AnyModal;", "Lyc3/g;", "a", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "b", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6727a implements InterfaceC37138c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final int f25687c = 8;

    /* JADX INFO: renamed from: d */
    private static final Map<String, InterfaceC21461d> f25688d;

    /* JADX INFO: renamed from: e */
    private static final InterfaceC34116n f25689e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39443g descriptor;

    /* JADX INFO: renamed from: com.whoop.design.json.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R4\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/design/json/a$a;", "", "<init>", "()V", "", "", "Lj93/d;", "Lcom/whoop/design/models/modal/Modal;", "modalTypes", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "getModalTypes$design_models_release$annotations", "TYPE", "Ljava/lang/String;", "CONTENT", "ANALYTIC_EVENTS", "MODAL_LIFECYCLE_INTERACTIONS", "Ltr2/n;", "logger", "Ltr2/n;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, InterfaceC21461d> m20375a() {
            return C6727a.f25688d;
        }

        private Companion() {
        }
    }

    static {
        String value = ModalType.DIALOG.getValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f25688d = AbstractC25247g0.m73990Y(new C23465k(value, c22673i0.getOrCreateKotlinClass(DialogModel.class)), new C23465k(ModalType.BOTTOM_SHEET.getValue(), c22673i0.getOrCreateKotlinClass(BottomSheet.class)), new C23465k(ModalType.FULLSCREEN.getValue(), c22673i0.getOrCreateKotlinClass(FullScreenContentModal.class)), new C23465k(ModalType.COACH.getValue(), c22673i0.getOrCreateKotlinClass(CoachModal.class)), new C23465k(ModalType.TOAST.getValue(), c22673i0.getOrCreateKotlinClass(ToastModal.class)));
        f25689e = InterfaceC34116n.INSTANCE.m107848a("AnyModalSerializer");
    }

    public C6727a() {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("AnyModal")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("AnyModal");
        m20371b(c39437a);
        this.descriptor = new C39444h("AnyModal", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX INFO: renamed from: b */
    private static final C23454a0 m20371b(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.m125993a("type", StringSerializer.INSTANCE.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("content", JsonElement.Companion.serializer().getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("analytic_events", AbstractC38195a.m122336d(ModalAnalyticEventModel.INSTANCE.serializer()).getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("modal_lifecycle_interactions", AbstractC38195a.m122336d(ModalLifecycleInteractions.INSTANCE.serializer()).getDescriptor(), false);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AnyModal deserialize(InterfaceC40541d decoder) {
        Modal modal;
        ModalAnalyticEventModel modalAnalyticEventModel;
        String strM1844f;
        AbstractC22676k.m65750j(decoder, "decoder");
        ModalLifecycleInteractions modalLifecycleInteractions = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new SerializationException("AnyModalSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        try {
            JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "type");
            if (jsonElement == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
                throw new SerializationException("Missing \"type\" field");
            }
            Map<String, InterfaceC21461d> map = f25688d;
            String upperCase = strM1844f.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            InterfaceC21461d interfaceC21461d = map.get(upperCase);
            if (interfaceC21461d == null) {
                throw new SerializationException("Unknown modal type: ".concat(strM1844f));
            }
            InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(interfaceC21461d);
            if (interfaceC37138cM113847j == null) {
                throw new SerializationException("No serializer found for modal type: ".concat(strM1844f));
            }
            JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "content");
            if (jsonElement2 == null) {
                throw new SerializationException("Missing \"content\" field");
            }
            modal = (Modal) interfaceC0768k.mo1837a().m1830a(interfaceC37138cM113847j, jsonElement2);
            try {
                JsonElement jsonElement3 = (JsonElement) jsonObjectM1847i.get((Object) "analytic_events");
                if (jsonElement3 == null) {
                    modalAnalyticEventModel = null;
                } else {
                    if (jsonElement3 instanceof JsonNull) {
                        jsonElement3 = null;
                    }
                    if (jsonElement3 != null) {
                        modalAnalyticEventModel = (ModalAnalyticEventModel) interfaceC0768k.mo1837a().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonElement3);
                    } else {
                        modalAnalyticEventModel = null;
                    }
                }
            } catch (SerializationException e5) {
                f25689e.mo85213c("Modal analytic events deserialization failed, ignoring", e5, new AbstractC30556a.a[0]);
            }
            try {
                JsonElement jsonElement4 = (JsonElement) jsonObjectM1847i.get((Object) "modal_lifecycle_interactions");
                if (jsonElement4 != null) {
                    if (jsonElement4 instanceof JsonNull) {
                        jsonElement4 = null;
                    }
                    if (jsonElement4 != null) {
                        modalLifecycleInteractions = (ModalLifecycleInteractions) interfaceC0768k.mo1837a().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonElement4);
                    }
                }
            } catch (SerializationException e13) {
                f25689e.mo85213c("Modal lifecycle interactions deserialization failed, ignoring", e13, new AbstractC30556a.a[0]);
            }
            return new AnyModal(modal, modalAnalyticEventModel, modalLifecycleInteractions);
        } catch (SerializationException e14) {
            f25689e.mo85213c("Modal deserialization failed, returning UnknownModal", e14, new AbstractC30556a.a[0]);
            modal = UnknownModal.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C23465k m20373d(Modal modal) {
        Object next;
        AbstractC22676k.m65750j(modal, "modal");
        Iterator<T> it = f25688d.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((Map.Entry) next).getValue(), AbstractC22671h0.f89337a.getOrCreateKotlinClass(modal.getClass())));
        Map.Entry entry = (Map.Entry) next;
        C23465k c23465k = entry != null ? new C23465k(entry.getKey(), entry.getValue()) : null;
        return c23465k != null ? new C23465k(c23465k.f92937w, AbstractC35862g.m113846i((InterfaceC21461d) c23465k.f92938x)) : new C23465k("UNKNOWN", UnknownModal.INSTANCE.serializer());
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, AnyModal value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        Modal modal = value.getModal();
        C23465k c23465kM20373d = m20373d(modal);
        String str = (String) c23465kM20373d.f92937w;
        InterfaceC37138c interfaceC37138c = (InterfaceC37138c) c23465kM20373d.f92938x;
        InterfaceC0773p interfaceC0773p = (InterfaceC0773p) encoder;
        AbstractC0757c abstractC0757cMo1852a = interfaceC0773p.mo1852a();
        AbstractC22676k.m65748h(interfaceC37138c, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<com.whoop.design.models.modal.Modal>");
        abstractC0757cMo1852a.getClass();
        JsonElement jsonElementM34290h0 = AbstractC12313p.m34290h0(abstractC0757cMo1852a, modal, interfaceC37138c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive element = AbstractC0770m.m1841c(str);
        AbstractC22676k.m65750j(element, "element");
        ModalAnalyticEventModel analyticEvents = value.getAnalyticEvents();
        if (analyticEvents != null) {
        }
        ModalLifecycleInteractions modalLifecycleInteractions = value.getModalLifecycleInteractions();
        if (modalLifecycleInteractions != null) {
        }
        interfaceC0773p.mo1853c(new JsonObject(linkedHashMap));
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }
}
