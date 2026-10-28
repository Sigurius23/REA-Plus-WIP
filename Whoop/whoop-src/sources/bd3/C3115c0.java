package bd3;

import ad3.C0766i;
import ad3.C0776s;
import hm.C17417d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import l83.AbstractC23453a;
import l83.C23455b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32267a;

/* JADX INFO: renamed from: bd3.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3115c0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3110a f12232a;

    /* JADX INFO: renamed from: b */
    public final boolean f12233b;

    /* JADX INFO: renamed from: c */
    public int f12234c;

    public C3115c0(C0766i c0766i, AbstractC3110a abstractC3110a) {
        this.f12232a = abstractC3110a;
        this.f12233b = c0766i.f2791c;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m8978a(C3115c0 c3115c0, C23455b c23455b, AbstractC32267a abstractC32267a) {
        C3113b0 c3113b0;
        LinkedHashMap linkedHashMap;
        C23455b c23455b2;
        byte bMo8953f;
        C3115c0 c3115c1;
        AbstractC3110a abstractC3110a;
        AbstractC3110a abstractC3110a2 = c3115c0.f12232a;
        if (abstractC32267a instanceof C3113b0) {
            c3113b0 = (C3113b0) abstractC32267a;
            int i13 = c3113b0.f12223H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3113b0.f12223H = i13 - Integer.MIN_VALUE;
            } else {
                c3113b0 = new C3113b0(c3115c0, abstractC32267a);
            }
        } else {
            c3113b0 = new C3113b0(c3115c0, abstractC32267a);
        }
        Object obj = c3113b0.f12221F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3113b0.f12223H;
        int i15 = 0;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = c3113b0.f12220E;
            String str = c3113b0.f12227z;
            linkedHashMap = c3113b0.f12226y;
            c3115c1 = c3113b0.f12225x;
            c23455b2 = c3113b0.f12224w;
            AbstractC34132o.m107864I(obj);
            linkedHashMap.put(str, (JsonElement) obj);
            bMo8953f = c3115c1.f12232a.mo8953f();
            if (bMo8953f == 4) {
                i15 = i16;
                c3115c0 = c3115c1;
            } else if (bMo8953f != 7) {
                AbstractC3110a.m8942r(c3115c1.f12232a, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            abstractC3110a = c3115c1.f12232a;
            if (bMo8953f == 6) {
                abstractC3110a.m8954g((byte) 7);
            } else if (bMo8953f == 4) {
                AbstractC3138q.m9021q(abstractC3110a, "object");
                throw null;
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractC34132o.m107864I(obj);
        byte bM8954g = abstractC3110a2.m8954g((byte) 6);
        if (abstractC3110a2.m8968w() == 4) {
            AbstractC3110a.m8942r(abstractC3110a2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        c23455b2 = c23455b;
        bMo8953f = bM8954g;
        AbstractC3110a abstractC3110a3 = c3115c0.f12232a;
        if (!abstractC3110a3.mo8950c()) {
            c3115c1 = c3115c0;
            abstractC3110a = c3115c1.f12232a;
            if (bMo8953f == 6) {
                abstractC3110a.m8954g((byte) 7);
            } else if (bMo8953f == 4) {
                AbstractC3138q.m9021q(abstractC3110a, "object");
                throw null;
            }
            return new JsonObject(linkedHashMap);
        }
        String strM8959l = c3115c0.f12233b ? abstractC3110a3.m8959l() : abstractC3110a3.m8957j();
        abstractC3110a3.m8954g((byte) 5);
        c3113b0.f12224w = c23455b2;
        c3113b0.f12225x = c3115c0;
        c3113b0.f12226y = linkedHashMap;
        c3113b0.f12227z = strM8959l;
        c3113b0.f12220E = i15;
        c3113b0.f12223H = 1;
        c23455b2.m68036a(c3113b0);
        return enumC31071a;
    }

    /* JADX INFO: renamed from: b */
    public final JsonElement m8979b() {
        JsonElement jsonObject;
        AbstractC3110a abstractC3110a = this.f12232a;
        byte bM8968w = abstractC3110a.m8968w();
        if (bM8968w == 1) {
            return m8981d(true);
        }
        if (bM8968w == 0) {
            return m8981d(false);
        }
        if (bM8968w != 6) {
            if (bM8968w == 8) {
                return m8980c();
            }
            AbstractC3110a.m8942r(abstractC3110a, "Cannot read Json element because of unexpected ".concat(AbstractC3138q.m9028x(bM8968w)), 0, null, 6);
            throw null;
        }
        int i13 = this.f12234c + 1;
        this.f12234c = i13;
        if (i13 == 200) {
            jsonObject = (JsonElement) AbstractC23453a.m68035a(new C17417d(new C3111a0(this, null), 29));
        } else {
            byte bM8954g = abstractC3110a.m8954g((byte) 6);
            if (abstractC3110a.m8968w() == 4) {
                AbstractC3110a.m8942r(abstractC3110a, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (abstractC3110a.mo8950c()) {
                String strM8959l = this.f12233b ? abstractC3110a.m8959l() : abstractC3110a.m8957j();
                abstractC3110a.m8954g((byte) 5);
                linkedHashMap.put(strM8959l, m8979b());
                bM8954g = abstractC3110a.mo8953f();
                if (bM8954g != 4) {
                    if (bM8954g == 7) {
                        break;
                    }
                    AbstractC3110a.m8942r(abstractC3110a, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bM8954g == 6) {
                abstractC3110a.m8954g((byte) 7);
            } else if (bM8954g == 4) {
                AbstractC3138q.m9021q(abstractC3110a, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.f12234c--;
        return jsonObject;
    }

    /* JADX INFO: renamed from: c */
    public final JsonArray m8980c() {
        AbstractC3110a abstractC3110a = this.f12232a;
        byte bMo8953f = abstractC3110a.mo8953f();
        if (abstractC3110a.m8968w() == 4) {
            AbstractC3110a.m8942r(abstractC3110a, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractC3110a.mo8950c()) {
            arrayList.add(m8979b());
            bMo8953f = abstractC3110a.mo8953f();
            if (bMo8953f != 4) {
                boolean z4 = bMo8953f == 9;
                int i13 = abstractC3110a.f12210a;
                if (!z4) {
                    AbstractC3110a.m8942r(abstractC3110a, "Expected end of the array or comma", i13, null, 4);
                    throw null;
                }
            }
        }
        if (bMo8953f == 8) {
            abstractC3110a.m8954g((byte) 9);
        } else if (bMo8953f == 4) {
            AbstractC3138q.m9021q(abstractC3110a, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final JsonPrimitive m8981d(boolean z4) {
        boolean z13 = this.f12233b;
        AbstractC3110a abstractC3110a = this.f12232a;
        String strM8959l = (z13 || !z4) ? abstractC3110a.m8959l() : abstractC3110a.m8957j();
        return (z4 || !AbstractC22676k.m65745e(strM8959l, "null")) ? new C0776s(strM8959l, z4, null) : JsonNull.INSTANCE;
    }
}
