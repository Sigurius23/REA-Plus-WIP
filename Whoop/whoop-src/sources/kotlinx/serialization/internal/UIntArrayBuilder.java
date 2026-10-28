package kotlinx.serialization.internal;

import java.util.Arrays;
import l83.C23475u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lkotlinx/serialization/internal/UIntArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Ll83/u;", "bufferWithData", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "Ll83/a0;", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "Ll83/t;", "c", "append-WZ4Q5Ns$kotlinx_serialization_core", "append", "build--hP7Qyg$kotlinx_serialization_core", "()[I", "build", "buffer", "[I", "value", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UIntArrayBuilder extends PrimitiveArrayBuilder<C23475u> {
    private int[] buffer;
    private int position;

    public /* synthetic */ UIntArrayBuilder(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    /* JADX INFO: renamed from: append-WZ4Q5Ns$kotlinx_serialization_core, reason: not valid java name */
    public final void m134423appendWZ4Q5Ns$kotlinx_serialization_core(int c3) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int[] iArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        iArr[position] = c3;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* synthetic */ C23475u build$kotlinx_serialization_core() {
        return new C23475u(m134424buildhP7Qyg$kotlinx_serialization_core());
    }

    /* JADX INFO: renamed from: build--hP7Qyg$kotlinx_serialization_core, reason: not valid java name */
    public int[] m134424buildhP7Qyg$kotlinx_serialization_core() {
        int[] iArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        AbstractC22676k.m65749i(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
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

    private UIntArrayBuilder(int[] bufferWithData) {
        AbstractC22676k.m65750j(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }
}
