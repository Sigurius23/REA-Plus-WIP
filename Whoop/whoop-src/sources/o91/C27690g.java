package o91;

import java.util.UUID;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: o91.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lo91/g;", "Lwc3/c;", "Ljava/util/UUID;", "<init>", "()V", "Lzc3/d;", "decoder", "a", "(Lzc3/d;)Ljava/util/UUID;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "b", "(Lzc3/e;Ljava/util/UUID;)V", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27690g implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C27690g f111466a = new C27690g();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor = StringSerializer.INSTANCE.getDescriptor();

    /* JADX INFO: renamed from: c */
    public static final int f111468c = 8;

    private C27690g() {
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UUID deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        UUID uuidFromString = UUID.fromString(decoder.decodeString());
        AbstractC22676k.m65749i(uuidFromString, "fromString(...)");
        return uuidFromString;
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, UUID value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        String string = value.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        encoder.encodeString(string);
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
