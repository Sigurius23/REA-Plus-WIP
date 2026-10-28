package kotlinx.serialization.internal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lyc3/g;", "primitive", "<init>", "(Lyc3/g;)V", "", "serialName", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PrimitiveArrayDescriptor extends ListLikeDescriptor {
    private final String serialName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArrayDescriptor(InterfaceC39443g primitive) {
        super(primitive, null);
        AbstractC22676k.m65750j(primitive, "primitive");
        this.serialName = primitive.getSerialName() + "Array";
    }

    @Override // kotlinx.serialization.internal.ListLikeDescriptor, yc3.InterfaceC39443g
    public String getSerialName() {
        return this.serialName;
    }
}
