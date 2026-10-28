package uw2;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.AddToCalendarParameters;
import com.whoop.whoopaction.domain.models.DialPhoneNumberParameters;
import com.whoop.whoopaction.domain.models.OSAction;
import com.whoop.whoopaction.domain.models.OSActionParameters;
import com.whoop.whoopaction.domain.models.OSActionType;
import com.whoop.whoopaction.domain.models.PermissionParameters;
import com.whoop.whoopaction.domain.models.PickMediaParameters;
import com.whoop.whoopaction.domain.models.UnknownOSActionParameters;
import j93.InterfaceC21461d;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: uw2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Luw2/d;", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/OSAction;", "<init>", "()V", "Lkotlinx/serialization/json/JsonObject;", "jsonObject", "", "key", "Lad3/c;", "json", "Lcom/whoop/navigation/models/GenericInteraction;", "a", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lad3/c;)Lcom/whoop/navigation/models/GenericInteraction;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "c", "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/OSAction;)V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/OSAction;", "Ltr2/n;", "Ltr2/n;", "logger", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35319d implements InterfaceC37138c {

    /* JADX INFO: renamed from: d */
    public static final int f150516d = 8;

    /* JADX INFO: renamed from: e */
    private static final Map<OSActionType, InterfaceC21461d> f150517e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("OSActionSerializer");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39443g descriptor = AbstractC35952b.m114195c("OSAction", new InterfaceC39443g[0]);

    static {
        OSActionType oSActionType = OSActionType.ADD_TO_CALENDAR;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f150517e = AbstractC25247g0.m73990Y(new C23465k(oSActionType, c22673i0.getOrCreateKotlinClass(AddToCalendarParameters.class)), new C23465k(OSActionType.DIAL, c22673i0.getOrCreateKotlinClass(DialPhoneNumberParameters.class)), new C23465k(OSActionType.PERMISSION, c22673i0.getOrCreateKotlinClass(PermissionParameters.class)), new C23465k(OSActionType.PICK_MEDIA, c22673i0.getOrCreateKotlinClass(PickMediaParameters.class)));
    }

    /* JADX INFO: renamed from: a */
    private final GenericInteraction m112175a(JsonObject jsonObject, String key, AbstractC0757c json) {
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) key);
        if (jsonElement != null) {
            if (jsonElement instanceof JsonNull) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                json.getClass();
                return (GenericInteraction) json.m1830a(AbstractC38195a.m122336d(GenericInteraction.INSTANCE.serializer()), jsonElement);
            }
        }
        return null;
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OSAction deserialize(InterfaceC40541d decoder) {
        String strM1844f;
        AbstractC22676k.m65750j(decoder, "decoder");
        Object obj = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new SerializationException("OSActionSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get("type");
        if (jsonElement == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
            throw new SerializationException("OSAction is missing \"type\" field");
        }
        JsonElement jsonObject = (JsonElement) jsonObjectM1847i.get("parameters");
        if (jsonObject == null) {
            jsonObject = new JsonObject(C25272z.f99163w);
        }
        GenericInteraction genericInteractionM112175a = m112175a(jsonObjectM1847i, "on_success", interfaceC0768k.mo1837a());
        GenericInteraction genericInteractionM112175a2 = m112175a(jsonObjectM1847i, "on_error", interfaceC0768k.mo1837a());
        for (Object obj2 : OSActionType.getEntries()) {
            if (AbstractC22676k.m65745e(((OSActionType) obj2).name(), strM1844f)) {
                obj = obj2;
                break;
            }
        }
        OSActionType oSActionType = (OSActionType) obj;
        if (oSActionType == null) {
            oSActionType = OSActionType.UNKNOWN;
        }
        InterfaceC21461d interfaceC21461d = f150517e.get(oSActionType);
        if (interfaceC21461d == null) {
            this.logger.mo85226q("Unrecognized OSActionType: ".concat(strM1844f), new AbstractC30556a.a[0]);
            return new OSAction(OSActionType.UNKNOWN, new UnknownOSActionParameters(jsonObject), genericInteractionM112175a, genericInteractionM112175a2);
        }
        InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(interfaceC21461d);
        if (interfaceC37138cM113847j == null) {
            throw new SerializationException("No serializer found for OS action type: ".concat(strM1844f));
        }
        OSActionParameters oSActionParameters = (OSActionParameters) interfaceC0768k.mo1837a().m1830a(interfaceC37138cM113847j, jsonObject);
        AbstractC22676k.m65748h(oSActionParameters, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.OSActionParameters");
        return new OSAction(oSActionType, oSActionParameters, genericInteractionM112175a, genericInteractionM112175a2);
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, OSAction value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of OSAction not supported. Actions only deserialized from backend.");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }
}
