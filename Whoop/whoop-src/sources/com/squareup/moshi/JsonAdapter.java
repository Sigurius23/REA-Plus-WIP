package com.squareup.moshi;

import java.io.IOException;
import ne3.C26616h;
import ne3.InterfaceC26618i;
import ne3.InterfaceC26620j;
import p441qx.AbstractC30704c0;
import p441qx.C30700a0;
import p441qx.C30702b0;
import p441qx.C30726n0;
import p441qx.C30733r;
import p441qx.C30742x;
import p441qx.C30743y;
import p441qx.EnumC30741w;
import p471rx.C31879a;
import p471rx.C31880b;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonAdapter<T> {
    public final JsonAdapter<T> failOnUnknown() {
        return new C30733r(this, 2);
    }

    public abstract Object fromJson(JsonReader jsonReader);

    public final T fromJson(String str) throws IOException {
        C26616h c26616h = new C26616h();
        c26616h.m79232u1(str);
        C30742x c30742x = new C30742x(c26616h);
        T t14 = (T) fromJson(c30742x);
        if (isLenient() || c30742x.mo16731k() == EnumC30741w.f126547J) {
            return t14;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final T fromJsonValue(Object obj) {
        try {
            return (T) fromJson(new C30700a0(obj));
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public JsonAdapter<T> indent(String str) {
        if (str != null) {
            return new C30726n0(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final JsonAdapter<T> lenient() {
        return new C30733r(this, 1);
    }

    public final JsonAdapter<T> nonNull() {
        return this instanceof C31879a ? this : new C31879a(this);
    }

    public final JsonAdapter<T> nullSafe() {
        return this instanceof C31880b ? this : new C31880b(this);
    }

    public final JsonAdapter<T> serializeNulls() {
        return new C30733r(this, 0);
    }

    public final String toJson(T t14) {
        C26616h c26616h = new C26616h();
        try {
            toJson(c26616h, t14);
            return c26616h.m79194S0();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public abstract void toJson(AbstractC30704c0 abstractC30704c0, Object obj);

    public final Object toJsonValue(T t14) {
        C30702b0 c30702b0 = new C30702b0();
        try {
            toJson(c30702b0, t14);
            return c30702b0.m94366S0();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public final void toJson(InterfaceC26618i interfaceC26618i, T t14) throws IOException {
        toJson(new C30743y(interfaceC26618i), t14);
    }

    public final T fromJson(InterfaceC26620j interfaceC26620j) throws IOException {
        return (T) fromJson(new C30742x(interfaceC26620j));
    }
}
