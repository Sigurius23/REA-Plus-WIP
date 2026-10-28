package bd3;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0779v;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25247g0;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import yc3.AbstractC39440d;
import yc3.C39446j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;

/* JADX INFO: renamed from: bd3.w */
/* JADX INFO: loaded from: classes5.dex */
public class C3144w extends AbstractC3112b {

    /* JADX INFO: renamed from: d */
    public final JsonObject f12312d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC39443g f12313e;

    /* JADX INFO: renamed from: f */
    public int f12314f;

    /* JADX INFO: renamed from: g */
    public boolean f12315g;

    public /* synthetic */ C3144w(AbstractC0757c abstractC0757c, JsonObject jsonObject, String str, int i13) {
        this(abstractC0757c, jsonObject, (i13 & 4) != 0 ? null : str, (InterfaceC39443g) null);
    }

    @Override // bd3.AbstractC3112b, kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40541d
    public final InterfaceC40539b beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        InterfaceC39443g interfaceC39443g = this.f12313e;
        if (descriptor != interfaceC39443g) {
            return super.beginStructure(descriptor);
        }
        JsonElement jsonElementM8973f = m8973f();
        String serialName = interfaceC39443g.getSerialName();
        if (jsonElementM8973f instanceof JsonObject) {
            String str = this.f12218b;
            return new C3144w(this.f12217a, (JsonObject) jsonElementM8973f, str, interfaceC39443g);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(JsonObject.class).getSimpleName());
        sb4.append(", but had ");
        sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementM8973f.getClass()).getSimpleName());
        sb4.append(" as the serialized body of ");
        sb4.append(serialName);
        sb4.append(" at element: ");
        sb4.append(renderTagStack());
        throw AbstractC3138q.m9008d(jsonElementM8973f.toString(), -1, sb4.toString());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x007e, please report this as an issue */
    @Override // kotlinx.serialization.internal.NamedValueDecoder, kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40539b
    public int decodeElementIndex(InterfaceC39443g descriptor) {
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        String strM1844f;
        int iM9018n;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        while (this.f12314f < descriptor.getElementsCount()) {
            int i13 = this.f12314f;
            this.f12314f = i13 + 1;
            String tag = getTag(descriptor, i13);
            int i14 = this.f12314f - 1;
            this.f12315g = false;
            if (mo8974g().containsKey((Object) tag) || m9049k(descriptor, i14)) {
                if (this.f12219c.f2796h) {
                    boolean zIsElementOptional = descriptor.isElementOptional(i14);
                    InterfaceC39443g elementDescriptor = descriptor.getElementDescriptor(i14);
                    if (zIsElementOptional && !elementDescriptor.isNullable()) {
                        AbstractC22676k.m65750j(tag, "tag");
                        if (((JsonElement) mo8974g().get((Object) tag)) instanceof JsonNull) {
                            continue;
                        }
                    }
                    if (AbstractC22676k.m65745e(elementDescriptor.getKind(), C39446j.f169712a)) {
                        if (elementDescriptor.isNullable()) {
                            AbstractC22676k.m65750j(tag, "tag");
                            if (!(((JsonElement) mo8974g().get((Object) tag)) instanceof JsonNull)) {
                                AbstractC22676k.m65750j(tag, "tag");
                                jsonElement = (JsonElement) mo8974g().get((Object) tag);
                                if (jsonElement instanceof JsonPrimitive) {
                                    jsonPrimitive = (JsonPrimitive) jsonElement;
                                } else {
                                    jsonPrimitive = null;
                                }
                                strM1844f = jsonPrimitive != null ? AbstractC0770m.m1844f(jsonPrimitive) : null;
                                if (strM1844f == null) {
                                    AbstractC0757c abstractC0757c = this.f12217a;
                                    iM9018n = AbstractC3138q.m9018n(elementDescriptor, abstractC0757c, strM1844f);
                                    boolean z4 = abstractC0757c.f2763a.f2794f && elementDescriptor.isNullable();
                                    if (iM9018n == -3 || ((!zIsElementOptional && !z4) || m9049k(descriptor, i14))) {
                                    }
                                }
                            }
                        } else {
                            AbstractC22676k.m65750j(tag, "tag");
                            jsonElement = (JsonElement) mo8974g().get((Object) tag);
                            if (jsonElement instanceof JsonPrimitive) {
                                jsonPrimitive = (JsonPrimitive) jsonElement;
                            } else {
                                jsonPrimitive = null;
                            }
                            if (jsonPrimitive != null) {
                            }
                            if (strM1844f == null) {
                                AbstractC0757c abstractC0757c2 = this.f12217a;
                                iM9018n = AbstractC3138q.m9018n(elementDescriptor, abstractC0757c2, strM1844f);
                                if (abstractC0757c2.f2763a.f2794f) {
                                }
                                if (iM9018n == -3) {
                                }
                            }
                        }
                    }
                }
                return i14;
            }
        }
        return -1;
    }

    @Override // bd3.AbstractC3112b, kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40541d
    public final boolean decodeNotNullMark() {
        return !this.f12315g && super.decodeNotNullMark();
    }

    @Override // bd3.AbstractC3112b
    /* JADX INFO: renamed from: e */
    public JsonElement mo8972e(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        return (JsonElement) AbstractC25247g0.m73986U(tag, mo8974g());
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(InterfaceC39443g descriptor, int i13) {
        Object next;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC0757c abstractC0757c = this.f12217a;
        C0779v c0779vM9023s = AbstractC3138q.m9023s(abstractC0757c, descriptor);
        String elementName = descriptor.getElementName(i13);
        if (c0779vM9023s != null || (this.f12219c.f2799k && !mo8974g().keySet().contains(elementName))) {
            Map mapM9015k = AbstractC3138q.m9015k(abstractC0757c, descriptor);
            Iterator<T> it = mo8974g().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) mapM9015k.get((String) next);
                if (num != null && num.intValue() == i13) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
            String strM1854a = c0779vM9023s != null ? c0779vM9023s.m1854a(descriptor, elementName) : null;
            if (strM1854a != null) {
                return strM1854a;
            }
        }
        return elementName;
    }

    @Override // bd3.AbstractC3112b, kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40539b
    public void endStructure(InterfaceC39443g descriptor) {
        Set setM34556E;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC0757c abstractC0757c = this.f12217a;
        if (AbstractC3138q.m9020p(abstractC0757c, descriptor) || (descriptor.getKind() instanceof AbstractC39440d)) {
            return;
        }
        C0779v c0779vM9023s = AbstractC3138q.m9023s(abstractC0757c, descriptor);
        if (c0779vM9023s == null && !this.f12219c.f2799k) {
            setM34556E = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
        } else if (c0779vM9023s != null) {
            setM34556E = AbstractC3138q.m9015k(abstractC0757c, descriptor).keySet();
        } else {
            Set<String> setJsonCachedSerialNames = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            Map map = (Map) abstractC0757c.f2765c.m1868l(descriptor, AbstractC3138q.f12296a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = C25235a0.f99113w;
            }
            setM34556E = AbstractC12350b.m34556E(setJsonCachedSerialNames, setKeySet);
        }
        for (String str : mo8974g().keySet()) {
            if (!setM34556E.contains(str) && !AbstractC22676k.m65745e(str, this.f12218b)) {
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Encountered an unknown key '", str, "' at element: ");
                sbM53375p.append(renderTagStack());
                sbM53375p.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbM53375p.append((Object) AbstractC3138q.m9022r(-1, mo8974g().toString()));
                throw AbstractC3138q.m9007c(-1, sbM53375p.toString());
            }
        }
    }

    @Override // bd3.AbstractC3112b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public JsonObject mo8974g() {
        return this.f12312d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9049k(InterfaceC39443g interfaceC39443g, int i13) {
        boolean z4 = (this.f12217a.f2763a.f2794f || interfaceC39443g.isElementOptional(i13) || !interfaceC39443g.getElementDescriptor(i13).isNullable()) ? false : true;
        this.f12315g = z4;
        return z4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3144w(AbstractC0757c json, JsonObject value, String str, InterfaceC39443g interfaceC39443g) {
        super(json, str);
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(value, "value");
        this.f12312d = value;
        this.f12313e = interfaceC39443g;
    }
}
