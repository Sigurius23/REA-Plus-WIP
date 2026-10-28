package io.sentry;

import io.sentry.vendor.gson.stream.EnumC20612b;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.j3 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20392j3 extends Closeable {
    /* JADX INFO: renamed from: I */
    void mo56494I(InterfaceC20602v0 interfaceC20602v0, AbstractMap abstractMap, String str);

    /* JADX INFO: renamed from: K */
    TimeZone mo56495K(InterfaceC20602v0 interfaceC20602v0);

    /* JADX INFO: renamed from: O0 */
    Float mo56496O0();

    /* JADX INFO: renamed from: R */
    Double mo56497R();

    /* JADX INFO: renamed from: U */
    Date mo56498U(InterfaceC20602v0 interfaceC20602v0);

    /* JADX INFO: renamed from: U0 */
    Object mo56499U0();

    /* JADX INFO: renamed from: W */
    Boolean mo56500W();

    /* JADX INFO: renamed from: Z */
    Object mo56501Z(InterfaceC20602v0 interfaceC20602v0, InterfaceC20603v1 interfaceC20603v1);

    void beginArray();

    void beginObject();

    /* JADX INFO: renamed from: c1 */
    ArrayList mo56503c1(InterfaceC20602v0 interfaceC20602v0, InterfaceC20603v1 interfaceC20603v1);

    void endArray();

    void endObject();

    boolean hasNext();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    String nextName();

    String nextString();

    EnumC20612b peek();

    /* JADX INFO: renamed from: q0 */
    Integer mo56507q0();

    /* JADX INFO: renamed from: s0 */
    Long mo56508s0();

    void setLenient(boolean z4);

    void skipValue();

    /* JADX INFO: renamed from: w0 */
    String mo56509w0();

    /* JADX INFO: renamed from: y0 */
    HashMap mo56510y0(InterfaceC20602v0 interfaceC20602v0, InterfaceC20603v1 interfaceC20603v1);
}
