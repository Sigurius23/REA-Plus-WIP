package p305lj;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0755b;
import ad3.C0775r;
import ad3.InterfaceC0773p;
import com.amplitude.android.engagement.types.AfterTimeData;
import com.amplitude.android.engagement.types.AfterTimeTriggerConfig;
import com.amplitude.android.engagement.types.ElementAppearedData;
import com.amplitude.android.engagement.types.ElementAppearedTriggerConfig;
import com.amplitude.android.engagement.types.ElementClickedData;
import com.amplitude.android.engagement.types.ElementClickedTriggerConfig;
import com.amplitude.android.engagement.types.EventData;
import com.amplitude.android.engagement.types.EventTriggerConfig;
import com.amplitude.android.engagement.types.SimpleTriggerConfig;
import com.amplitude.android.engagement.types.TriggerConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25260n;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: lj.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C24451r0 implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C24451r0 f95330a = new C24451r0();

    /* JADX INFO: renamed from: b */
    public static final C0775r f95331b = AbstractC34132o.m107878b(AbstractC0757c.f2762d, C24449q0.f95328y);

    /* JADX INFO: renamed from: c */
    public static final C39444h f95332c;

    static {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        C24449q0 c24449q0 = C24449q0.f95327x;
        if (AbstractC39414r.m125890i0("TriggerConfig")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("TriggerConfig");
        c24449q0.invoke(c39437a);
        f95332c = new C39444h("TriggerConfig", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r0.equals("rage_click") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (r0.equals("user_confusion") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        if (r0.equals("none") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        if (r0.equals("smart_delay") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
    
        if (r0.equals("immediately") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        r2 = com.amplitude.android.engagement.types.SimpleNudgeTriggerType.values();
        r3 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        if (r5 >= r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        r6 = r2[r5];
        r7 = r6.name();
        r8 = java.util.Locale.ROOT;
        r7 = r7.toLowerCase(r8);
        p715kotlin.jvm.internal.AbstractC22676k.m65749i(r7, "toLowerCase(...)");
        r8 = r0.toLowerCase(r8);
        p715kotlin.jvm.internal.AbstractC22676k.m65749i(r8, "toLowerCase(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        if (r7.equals(r8) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013e, code lost:
    
        if (r6 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
    
        r6 = com.amplitude.android.engagement.types.SimpleNudgeTriggerType.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
    
        return new p305lj.C24447p0(new com.amplitude.android.engagement.types.SimpleTriggerConfig(r6, r1, (kotlinx.serialization.json.JsonElement) r11.get((java.lang.Object) "data")));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // wc3.InterfaceC37137b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(zc3.InterfaceC40541d r11) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p305lj.C24451r0.deserialize(zc3.d):java.lang.Object");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f95332c;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        JsonObject jsonObject;
        TriggerConfig value = (TriggerConfig) obj;
        AbstractC22676k.m65750j(value, "value");
        InterfaceC0773p interfaceC0773p = (InterfaceC0773p) interfaceC40542e;
        if (value instanceof C24447p0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SimpleTriggerConfig simpleTriggerConfig = ((C24447p0) value).f95326a;
            String lowerCase = simpleTriggerConfig.getType().name().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            JsonPrimitive element = AbstractC0770m.m1841c(lowerCase);
            AbstractC22676k.m65750j(element, "element");
            C0755b c0755b = AbstractC0757c.f2762d;
            ArrayListSerializer arrayListSerializerM122333a = AbstractC38195a.m122333a(AbstractC38195a.m122333a(JsonElement.Companion.serializer()));
            List<List<JsonElement>> conditions = simpleTriggerConfig.getConditions();
            c0755b.getClass();
            JsonElement data = simpleTriggerConfig.getData();
            if (data != null) {
            }
            jsonObject = new JsonObject(linkedHashMap);
        } else {
            boolean z4 = value instanceof C24445o0;
            C0775r c0775r = f95331b;
            if (z4) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                JsonPrimitive element2 = AbstractC0770m.m1841c("analytics_event");
                AbstractC22676k.m65750j(element2, "element");
                InterfaceC37138c interfaceC37138cSerializer = EventData.Companion.serializer();
                EventTriggerConfig eventTriggerConfig = ((C24445o0) value).f95325a;
                jsonObject = new JsonObject(linkedHashMap2);
            } else if (value instanceof C24441m0) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                JsonPrimitive element3 = AbstractC0770m.m1841c("element_appeared");
                AbstractC22676k.m65750j(element3, "element");
                InterfaceC37138c interfaceC37138cSerializer2 = ElementAppearedData.Companion.serializer();
                ElementAppearedTriggerConfig elementAppearedTriggerConfig = ((C24441m0) value).f95323a;
                jsonObject = new JsonObject(linkedHashMap3);
            } else if (value instanceof C24443n0) {
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                JsonPrimitive element4 = AbstractC0770m.m1841c("element_clicked");
                AbstractC22676k.m65750j(element4, "element");
                InterfaceC37138c interfaceC37138cSerializer3 = ElementClickedData.Companion.serializer();
                ElementClickedTriggerConfig elementClickedTriggerConfig = ((C24443n0) value).f95324a;
                jsonObject = new JsonObject(linkedHashMap4);
            } else {
                if (!(value instanceof C24437k0)) {
                    throw new NoWhenBranchMatchedException();
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                JsonPrimitive element5 = AbstractC0770m.m1841c("after_time");
                AbstractC22676k.m65750j(element5, "element");
                InterfaceC37138c interfaceC37138cSerializer4 = AfterTimeData.Companion.serializer();
                AfterTimeTriggerConfig afterTimeTriggerConfig = ((C24437k0) value).f95322a;
                jsonObject = new JsonObject(linkedHashMap5);
            }
        }
        interfaceC0773p.mo1853c(jsonObject);
    }
}
