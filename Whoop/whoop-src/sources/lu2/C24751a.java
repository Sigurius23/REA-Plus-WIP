package lu2;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: lu2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Llu2/a;", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "b", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/DateTimeRange;)V", "Lzc3/d;", "decoder", "a", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24751a implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C24751a f96786a = new C24751a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor = AbstractC35952b.m114194b("com.whoop.weightlifting.data.serialization.DateTimeRangeSerializer", C39441e.f169698i);

    /* JADX INFO: renamed from: c */
    public static final int f96788c = 8;

    private C24751a() {
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DateTimeRange deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        return new DateTimeRange(decoder.decodeString());
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, DateTimeRange value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        encoder.encodeString(value.getDuring());
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
