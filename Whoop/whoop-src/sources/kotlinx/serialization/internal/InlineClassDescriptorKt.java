package kotlinx.serialization.internal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"T", "", "name", "Lwc3/c;", "primitiveSerializer", "Lyc3/g;", "InlinePrimitiveDescriptor", "(Ljava/lang/String;Lwc3/c;)Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class InlineClassDescriptorKt {
    public static final <T> InterfaceC39443g InlinePrimitiveDescriptor(String name, final InterfaceC37138c primitiveSerializer) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(primitiveSerializer, "primitiveSerializer");
        return new InlineClassDescriptor(name, new GeneratedSerializer<T>() { // from class: kotlinx.serialization.internal.InlineClassDescriptorKt.InlinePrimitiveDescriptor.1
            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public InterfaceC37138c[] childSerializers() {
                return new InterfaceC37138c[]{primitiveSerializer};
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
            public T deserialize(InterfaceC40541d decoder) {
                AbstractC22676k.m65750j(decoder, "decoder");
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
            public InterfaceC39443g getDescriptor() {
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
            public void serialize(InterfaceC40542e encoder, T value) {
                AbstractC22676k.m65750j(encoder, "encoder");
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public InterfaceC37138c[] typeParametersSerializers() {
                return super.typeParametersSerializers();
            }
        });
    }
}
