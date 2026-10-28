package com.iterable.iterableapi;

import com.google.crypto.tink.internal.C5101l0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p581we.C37199o;

/* JADX INFO: renamed from: com.iterable.iterableapi.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5310c0 implements InterfaceC5321f {

    /* JADX INFO: renamed from: w */
    public C5341k f21651w;

    /* JADX INFO: renamed from: x */
    public C37199o f21652x;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: a */
    public final void mo16418a() {
        C37199o c37199o = this.f21652x;
        if (((C5314d0) c37199o.f159041x).f21656a == null) {
            AbstractC12350b.m34595p("EmbeddedSessionManager", "Embedded session ended without start");
            return;
        }
        if (((LinkedHashMap) c37199o.f159040w).isEmpty()) {
            return;
        }
        Iterator it = ((LinkedHashMap) c37199o.f159040w).values().iterator();
        if (it.hasNext()) {
            AbstractC30802r.m94771t(it.next());
            throw null;
        }
        Date date = ((C5314d0) c37199o.f159041x).f21656a;
        Date date2 = new Date();
        ArrayList arrayList = new ArrayList();
        Iterator it3 = ((LinkedHashMap) c37199o.f159040w).values().iterator();
        if (it3.hasNext()) {
            AbstractC30802r.m94771t(it3.next());
            throw null;
        }
        String strM31995n = AbstractC11895b.m31995n("toString(...)");
        C5341k c5341k = C5341k.f21742r;
        if (c5341k.m16482a()) {
            if (date != null) {
                C5101l0 c5101l0 = c5341k.f21752j;
                JSONObject jSONObject = new JSONObject();
                try {
                    c5101l0.m16027B(jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", strM31995n);
                    jSONObject2.put("start", date.getTime());
                    jSONObject2.put("end", date2.getTime());
                    jSONObject.put("session", jSONObject2);
                    JSONArray jSONArray = new JSONArray();
                    Iterator it4 = arrayList.iterator();
                    if (it4.hasNext()) {
                        AbstractC30802r.m94771t(it4.next());
                        new JSONObject();
                        throw null;
                    }
                    jSONObject.put("impressions", jSONArray);
                    jSONObject.putOpt("deviceInfo", c5101l0.m16036O());
                    c5101l0.m16055f0("embedded-messaging/events/session", jSONObject);
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            } else {
                AbstractC12350b.m34595p("IterableApi", "trackEmbeddedSession: sessionStartTime and sessionEndTime must be set");
            }
        }
        c37199o.f159041x = new C5314d0(null);
        c37199o.f159040w = new LinkedHashMap();
    }

    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: b */
    public final void mo16419b() {
        AbstractC12350b.m34557F();
        C37199o c37199o = this.f21652x;
        if (((C5314d0) c37199o.f159041x).f21656a != null) {
            AbstractC12350b.m34595p("EmbeddedSessionManager", "Embedded session started twice");
        } else {
            c37199o.f159041x = new C5314d0(new Date());
        }
        AbstractC12350b.m34593n("IterableEmbeddedManager", "Calling start session");
        this.f21651w.f21744b.getClass();
    }
}
