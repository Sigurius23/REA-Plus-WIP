package kotlinx.serialization.internal;

import java.util.Arrays;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lkotlinx/serialization/internal/LongArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "bufferWithData", "<init>", "([J)V", "", "requiredCapacity", "Ll83/a0;", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "", "c", "append$kotlinx_serialization_core", "(J)V", "append", "build$kotlinx_serialization_core", "()[J", "build", "buffer", "[J", "value", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LongArrayBuilder extends PrimitiveArrayBuilder<long[]> {
    private long[] buffer;
    private int position;

    public LongArrayBuilder(long[] bufferWithData) {
        AbstractC22676k.m65750j(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(long c3) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        long[] jArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        jArr[position] = c3;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        long[] jArr = this.buffer;
        if (jArr.length < requiredCapacity) {
            int length = jArr.length * 2;
            if (requiredCapacity < length) {
                requiredCapacity = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, requiredCapacity);
            AbstractC22676k.m65749i(jArrCopyOf, "copyOf(...)");
            this.buffer = jArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: getPosition$kotlinx_serialization_core, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public long[] build$kotlinx_serialization_core() {
        long[] jArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        AbstractC22676k.m65749i(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
