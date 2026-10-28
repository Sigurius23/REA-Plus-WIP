package kotlinx.serialization.internal;

import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lkotlinx/serialization/internal/UnitSerializer;", "Lwc3/c;", "Ll83/a0;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "serialize", "(Lzc3/e;Ll83/a0;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UnitSerializer implements InterfaceC37138c {
    public static final UnitSerializer INSTANCE = new UnitSerializer();
    private final /* synthetic */ ObjectSerializer<C23454a0> $$delegate_0 = new ObjectSerializer<>("kotlin.Unit", C23454a0.f92919a);

    private UnitSerializer() {
    }

    /* JADX INFO: renamed from: deserialize, reason: collision with other method in class */
    public void m134447deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        this.$$delegate_0.deserialize(decoder);
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.$$delegate_0.getDescriptor();
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, C23454a0 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        this.$$delegate_0.serialize(encoder, value);
    }

    @Override // wc3.InterfaceC37137b
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC40541d interfaceC40541d) {
        m134447deserialize(interfaceC40541d);
        return C23454a0.f92919a;
    }
}
