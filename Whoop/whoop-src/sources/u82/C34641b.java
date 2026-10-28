package u82;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.SerializationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: u82.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lu82/b;", "Lwc3/c;", "Ljava/util/Date;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "b", "(Lzc3/e;Ljava/util/Date;)V", "Lzc3/d;", "decoder", "a", "(Lzc3/d;)Ljava/util/Date;", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Lyc3/g;", "c", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "serialization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34641b implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C34641b f145940a = new C34641b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final SimpleDateFormat dateFormat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        dateFormat = simpleDateFormat;
        descriptor = AbstractC35952b.m114194b("java.util.Date", C39441e.f169698i);
    }

    private C34641b() {
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        try {
            String strDecodeString = decoder.decodeString();
            Date date = dateFormat.parse(strDecodeString);
            if (date != null) {
                return date;
            }
            throw new IllegalArgumentException("Invalid date format: " + strDecodeString);
        } catch (Exception e5) {
            throw new SerializationException("Failed to deserialize Date", e5);
        }
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, Date value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        try {
            String str = dateFormat.format(value);
            AbstractC22676k.m65747g(str);
            encoder.encodeString(str);
        } catch (Exception e5) {
            throw new SerializationException("Failed to serialize Date", e5);
        }
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
