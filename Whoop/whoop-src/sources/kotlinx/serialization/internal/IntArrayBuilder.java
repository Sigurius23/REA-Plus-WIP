package kotlinx.serialization.internal;

import java.util.Arrays;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lkotlinx/serialization/internal/IntArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "bufferWithData", "<init>", "([I)V", "", "requiredCapacity", "Ll83/a0;", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "c", "append$kotlinx_serialization_core", "append", "build$kotlinx_serialization_core", "()[I", "build", "buffer", "[I", "value", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class IntArrayBuilder extends PrimitiveArrayBuilder<int[]> {
    private int[] buffer;
    private int position;

    public IntArrayBuilder(int[] bufferWithData) {
        AbstractC22676k.m65750j(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(int c3) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int[] iArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        iArr[position] = c3;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        int[] iArr = this.buffer;
        if (iArr.length < requiredCapacity) {
            int length = iArr.length * 2;
            if (requiredCapacity < length) {
                requiredCapacity = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, requiredCapacity);
            AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
            this.buffer = iArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: getPosition$kotlinx_serialization_core, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int[] build$kotlinx_serialization_core() {
        int[] iArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
