package com.iterable.iterableapi;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iterable.iterableapi.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5335i1 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f21709a;

    /* JADX INFO: renamed from: b */
    public final int f21710b;

    public C5335i1(JSONObject jSONObject) {
        this.f21709a = jSONObject;
        String strOptString = jSONObject.optString("type");
        strOptString.getClass();
        if (strOptString.equals("never")) {
            this.f21710b = 3;
        } else if (strOptString.equals("immediate")) {
            this.f21710b = 1;
        } else {
            this.f21710b = 3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5335i1) {
            return Objects.equals(this.f21709a, ((C5335i1) obj).f21709a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21709a);
    }

    public C5335i1() {
        this.f21709a = null;
        this.f21710b = 1;
    }
}
