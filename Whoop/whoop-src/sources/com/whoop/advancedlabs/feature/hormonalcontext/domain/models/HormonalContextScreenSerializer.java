package com.whoop.advancedlabs.feature.hormonalcontext.domain.models;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializer;", "Lwc3/c;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;", "<init>", "()V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;)V", "", "ID", "Ljava/lang/String;", "TYPE", "CONTENT", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HormonalContextScreenSerializer implements InterfaceC37138c {
    public static final int $stable;
    private static final String CONTENT = "content";
    private static final String ID = "id";
    public static final HormonalContextScreenSerializer INSTANCE = new HormonalContextScreenSerializer();
    private static final String TYPE = "type";
    private static final InterfaceC39443g descriptor;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HormonalContextScreenType.values().length];
            try {
                iArr[HormonalContextScreenType.SINGLE_SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HormonalContextScreenType.LAST_PERIOD_INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HormonalContextScreenType.INFORMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HormonalContextScreenType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("HormonalContextScreen")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("HormonalContextScreen");
        descriptor$lambda$0(c39437a);
        descriptor = new C39444h("HormonalContextScreen", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
        $stable = 8;
    }

    private HormonalContextScreenSerializer() {
    }

    private static final C23454a0 descriptor$lambda$0(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        buildClassSerialDescriptor.m125993a(ID, stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a(TYPE, stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a(CONTENT, JsonElement.Companion.serializer().getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // wc3.InterfaceC37137b
    public HormonalContextScreen deserialize(InterfaceC40541d decoder) {
        String strM1844f;
        HormonalContextScreenContent hormonalContextScreenContent;
        String strM1844f2;
        AbstractC22676k.m65750j(decoder, "decoder");
        HormonalContextScreenType hormonalContextScreenType = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new IllegalStateException("HormonalContextScreenSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) ID);
        String str = "";
        if (jsonElement == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
            strM1844f = "";
        }
        JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) TYPE);
        if (jsonElement2 != null && (strM1844f2 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement2))) != null) {
            str = strM1844f2;
        }
        JsonElement jsonObject = (JsonElement) jsonObjectM1847i.get((Object) CONTENT);
        if (jsonObject == null) {
            jsonObject = new JsonObject(C25272z.f99163w);
        }
        HormonalContextScreenType hormonalContextScreenType2 = HormonalContextScreenType.UNKNOWN;
        for (HormonalContextScreenType hormonalContextScreenType3 : HormonalContextScreenType.values()) {
            if (AbstractC22676k.m65745e(hormonalContextScreenType3.name(), str)) {
                hormonalContextScreenType = hormonalContextScreenType3;
                break;
            }
        }
        if (hormonalContextScreenType != null) {
            hormonalContextScreenType2 = hormonalContextScreenType;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[hormonalContextScreenType2.ordinal()];
        if (i13 == 1) {
            AbstractC0757c abstractC0757cMo1837a = interfaceC0768k.mo1837a();
            abstractC0757cMo1837a.getClass();
            hormonalContextScreenContent = (HormonalContextScreenContent) abstractC0757cMo1837a.m1830a(SingleSelectScreenContent.INSTANCE.serializer(), jsonObject);
        } else {
            if (i13 != 2 && i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            hormonalContextScreenContent = UnknownScreenContent.INSTANCE;
        }
        return new HormonalContextScreen(strM1844f, str, hormonalContextScreenContent);
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, HormonalContextScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of HormonalContextScreen is not supported. Avoid calling this method.");
    }
}
