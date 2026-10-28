package kotlinx.serialization.internal;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00028\u0000H ¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00058 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Array", "", "<init>", "()V", "", "requiredCapacity", "Ll83/a0;", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "build$kotlinx_serialization_core", "()Ljava/lang/Object;", "build", "getPosition$kotlinx_serialization_core", "()I", "position", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class PrimitiveArrayBuilder<Array> {
    public static /* synthetic */ void ensureCapacity$kotlinx_serialization_core$default(PrimitiveArrayBuilder primitiveArrayBuilder, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i14 & 1) != 0) {
            i13 = primitiveArrayBuilder.getPosition$kotlinx_serialization_core() + 1;
        }
        primitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core(i13);
    }

    public abstract Array build$kotlinx_serialization_core();

    public abstract void ensureCapacity$kotlinx_serialization_core(int requiredCapacity);

    public abstract int getPosition$kotlinx_serialization_core();
}
