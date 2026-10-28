package rg3;

import androidx.room.AbstractC1772c1;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import ne3.C26616h;
import p007a6.C0430i1;
import pg3.InterfaceC29201n;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import yb3.C39412p;

/* JADX INFO: renamed from: rg3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C31411b implements InterfaceC29201n {

    /* JADX INFO: renamed from: y */
    public static final C34818h0 f129267y;

    /* JADX INFO: renamed from: w */
    public final Gson f129268w;

    /* JADX INFO: renamed from: x */
    public final TypeAdapter f129269x;

    static {
        C39412p c39412p = C34818h0.f146589e;
        f129267y = AbstractC1772c1.m5403u("application/json; charset=UTF-8");
    }

    public C31411b(Gson gson, TypeAdapter typeAdapter) {
        this.f129268w = gson;
        this.f129269x = typeAdapter;
    }

    @Override // pg3.InterfaceC29201n
    public final Object convert(Object obj) throws IOException {
        C26616h c26616h = new C26616h();
        JsonWriter jsonWriterNewJsonWriter = this.f129268w.newJsonWriter(new OutputStreamWriter(new C0430i1(c26616h), StandardCharsets.UTF_8));
        this.f129269x.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return AbstractC34846v0.create(f129267y, c26616h.mo79218m0(c26616h.f105866x));
    }
}
