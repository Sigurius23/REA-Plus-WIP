package com.whoop.design.models.calendar.archmini;

import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import java.util.Locale;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import m83.AbstractC25260n;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;", "Lwc3/c;", "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CalendarDayModelSerializer implements InterfaceC37138c {
    private static final String CONTENT = "content";
    private static final String TYPE = "type";
    private final InterfaceC39443g descriptor;
    public static final int $stable = 8;
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("CalendarDayModelSerializer");

    public CalendarDayModelSerializer() {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("CalendarDayModel")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("CalendarDayModel");
        descriptor$lambda$0(c39437a);
        this.descriptor = new C39444h("CalendarDayModel", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    private static final C23454a0 descriptor$lambda$0(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.m125993a(TYPE, StringSerializer.INSTANCE.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a(CONTENT, JsonElement.Companion.serializer().getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    @Override // wc3.InterfaceC37137b
    public CalendarDayModel deserialize(InterfaceC40541d decoder) {
        String strM1844f;
        AbstractC22676k.m65750j(decoder, "decoder");
        Object obj = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new SerializationException("CalendarDayModelSerializer can only be used with JSON");
        }
        try {
            JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
            JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) TYPE);
            if (jsonElement == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
                throw new SerializationException("Missing \"type\" field");
            }
            for (Object obj2 : CalendarDayType.getEntries()) {
                String strName = ((CalendarDayType) obj2).name();
                String upperCase = strM1844f.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                if (AbstractC22676k.m65745e(strName, upperCase)) {
                    obj = obj2;
                    break;
                }
            }
            CalendarDayType calendarDayType = (CalendarDayType) obj;
            if (calendarDayType == null) {
                throw new SerializationException("Unknown calendar day type: " + strM1844f);
            }
            InterfaceC37138c interfaceC37138cM113847j = AbstractC35862g.m113847j(calendarDayType.getModelType());
            if (interfaceC37138cM113847j != null) {
                JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) CONTENT);
                if (jsonElement2 != null) {
                    return (CalendarDayModel) interfaceC0768k.mo1837a().m1830a(interfaceC37138cM113847j, jsonElement2);
                }
                throw new SerializationException("Missing \"content\" field");
            }
            throw new SerializationException("No serializer found for calendar day type: " + strM1844f);
        } catch (IllegalArgumentException e5) {
            logger.mo85213c("Calendar day deserialization failed, returning UnknownCalendarDayModel", e5, new AbstractC30556a.a[0]);
            return UnknownCalendarDayModel.INSTANCE;
        }
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, CalendarDayModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of CalendarDayModel is not supported. Calendar days are only deserialized from the backend.");
    }
}
