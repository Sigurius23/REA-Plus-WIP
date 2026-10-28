package o91;

import ad3.AbstractC0757c;
import ad3.C0755b;
import ad3.InterfaceC0768k;
import ad3.InterfaceC0773p;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: o91.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lo91/f;", "Lwc3/c;", "Lcom/google/gson/JsonObject;", "<init>", "()V", "Lzc3/d;", "decoder", "a", "(Lzc3/d;)Lcom/google/gson/JsonObject;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "b", "(Lzc3/e;Lcom/google/gson/JsonObject;)V", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27689f implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C27689f f111463a = new C27689f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor = AbstractC35952b.m114195c("JsonObject", new InterfaceC39443g[0]);

    /* JADX INFO: renamed from: c */
    public static final int f111465c = 8;

    private C27689f() {
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        if (!(decoder instanceof InterfaceC0768k)) {
            throw new IllegalArgumentException("This serializer can only be used with Json format");
        }
        JsonObject asJsonObject = JsonParser.parseString(((InterfaceC0768k) decoder).mo1838b().toString()).getAsJsonObject();
        AbstractC22676k.m65749i(asJsonObject, "getAsJsonObject(...)");
        return asJsonObject;
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, JsonObject value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        if (!(encoder instanceof InterfaceC0773p)) {
            throw new IllegalArgumentException("This serializer can only be used with Json format");
        }
        C0755b c0755b = AbstractC0757c.f2762d;
        String string = value.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        ((InterfaceC0773p) encoder).mo1853c(c0755b.m1835f(string));
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
