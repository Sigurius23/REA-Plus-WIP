package com.whoop.design.models.celebration;

import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import ad3.InterfaceC0773p;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;", "Lwc3/c;", "Lcom/whoop/design/models/celebration/SlotConfigModel;", "<init>", "()V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/celebration/SlotConfigModel;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/celebration/SlotConfigModel;)V", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SlotConfigModelSerializer implements InterfaceC37138c {
    public static final int $stable;
    public static final SlotConfigModelSerializer INSTANCE = new SlotConfigModelSerializer();
    private static final InterfaceC39443g descriptor;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SlotModeModel.values().length];
            try {
                iArr[SlotModeModel.CUMULATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlotModeModel.EXCLUSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SlotModeModel.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SlotModeModel.GROUPED_CUMULATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SlotModeModel.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("SlotConfigModel")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("SlotConfigModel");
        descriptor$lambda$0(c39437a);
        descriptor = new C39444h("SlotConfigModel", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
        $stable = 8;
    }

    private SlotConfigModelSerializer() {
    }

    private static final C23454a0 descriptor$lambda$0(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        buildClassSerialDescriptor.m125993a("name", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("mode", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("options", JsonObject.Companion.serializer().getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // wc3.InterfaceC37137b
    public SlotConfigModel deserialize(InterfaceC40541d decoder) {
        SlotOptionsModel slotOptionsModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC0768k interfaceC0768k = (InterfaceC0768k) decoder;
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "name");
        if (jsonElement == null) {
            throw new IllegalStateException("SlotConfigModel: required field 'name' is missing");
        }
        String content = AbstractC0770m.m1848j(jsonElement).getContent();
        JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "mode");
        if (jsonElement2 == null) {
            throw new IllegalStateException("SlotConfigModel: required field 'mode' is missing");
        }
        SlotModeModel mode = SlotModeModel.INSTANCE.getMode(AbstractC0770m.m1848j(jsonElement2).getContent());
        JsonElement jsonObject = (JsonElement) jsonObjectM1847i.get((Object) "options");
        if (jsonObject == null) {
            jsonObject = new JsonObject(C25272z.f99163w);
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i13 == 1) {
            slotOptionsModel = (SlotOptionsModel) interfaceC0768k.mo1837a().m1830a(SlotOptionsModel.CumulativeOptionsModel.INSTANCE.serializer(), jsonObject);
        } else if (i13 == 2) {
            slotOptionsModel = (SlotOptionsModel) interfaceC0768k.mo1837a().m1830a(SlotOptionsModel.ExclusiveOptionsModel.INSTANCE.serializer(), jsonObject);
        } else if (i13 == 3) {
            slotOptionsModel = (SlotOptionsModel) interfaceC0768k.mo1837a().m1830a(SlotOptionsModel.BooleanOptionsModel.INSTANCE.serializer(), jsonObject);
        } else if (i13 == 4) {
            slotOptionsModel = (SlotOptionsModel) interfaceC0768k.mo1837a().m1830a(SlotOptionsModel.GroupedCumulativeOptionsModel.INSTANCE.serializer(), jsonObject);
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            slotOptionsModel = SlotOptionsModel.UnknownOptionsModel.INSTANCE;
        }
        return new SlotConfigModel(content, mode, slotOptionsModel);
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, SlotConfigModel value) {
        JsonElement jsonObject;
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC0773p interfaceC0773p = (InterfaceC0773p) encoder;
        SlotOptionsModel options = value.getOptions();
        if (options instanceof SlotOptionsModel.CumulativeOptionsModel) {
            jsonObject = interfaceC0773p.mo1852a().m1832c(SlotOptionsModel.CumulativeOptionsModel.INSTANCE.serializer(), options);
        } else if (options instanceof SlotOptionsModel.ExclusiveOptionsModel) {
            jsonObject = interfaceC0773p.mo1852a().m1832c(SlotOptionsModel.ExclusiveOptionsModel.INSTANCE.serializer(), options);
        } else if (options instanceof SlotOptionsModel.BooleanOptionsModel) {
            jsonObject = interfaceC0773p.mo1852a().m1832c(SlotOptionsModel.BooleanOptionsModel.INSTANCE.serializer(), options);
        } else if (options instanceof SlotOptionsModel.GroupedCumulativeOptionsModel) {
            jsonObject = interfaceC0773p.mo1852a().m1832c(SlotOptionsModel.GroupedCumulativeOptionsModel.INSTANCE.serializer(), options);
        } else {
            if (!(options instanceof SlotOptionsModel.UnknownOptionsModel)) {
                throw new NoWhenBranchMatchedException();
            }
            jsonObject = new JsonObject(C25272z.f99163w);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive element = AbstractC0770m.m1841c(value.getName());
        AbstractC22676k.m65750j(element, "element");
        String lowerCase = value.getMode().name().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        JsonPrimitive element2 = AbstractC0770m.m1841c(lowerCase);
        AbstractC22676k.m65750j(element2, "element");
        interfaceC0773p.mo1853c(new JsonObject(linkedHashMap));
    }
}
