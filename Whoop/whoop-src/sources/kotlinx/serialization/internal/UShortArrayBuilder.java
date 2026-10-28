package kotlinx.serialization.internal;

import java.util.Arrays;
import l83.C23480z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lkotlinx/serialization/internal/UShortArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Ll83/z;", "bufferWithData", "<init>", "([SLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "Ll83/a0;", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "Ll83/y;", "c", "append-xj2QHRw$kotlinx_serialization_core", "(S)V", "append", "build-amswpOA$kotlinx_serialization_core", "()[S", "build", "buffer", "[S", "value", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UShortArrayBuilder extends PrimitiveArrayBuilder<C23480z> {
    private short[] buffer;
    private int position;

    public /* synthetic */ UShortArrayBuilder(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    /* JADX INFO: renamed from: append-xj2QHRw$kotlinx_serialization_core, reason: not valid java name */
    public final void m134439appendxj2QHRw$kotlinx_serialization_core(short c3) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        short[] sArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        sArr[position] = c3;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* synthetic */ C23480z build$kotlinx_serialization_core() {
        return new C23480z(m134440buildamswpOA$kotlinx_serialization_core());
    }

    /* JADX INFO: renamed from: build-amswpOA$kotlinx_serialization_core, reason: not valid java name */
    public short[] m134440buildamswpOA$kotlinx_serialization_core() {
        short[] sArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        AbstractC22676k.m65749i(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        short[] sArr = this.buffer;
        if (sArr.length < requiredCapacity) {
            int length = sArr.length * 2;
            if (requiredCapacity < length) {
                requiredCapacity = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, requiredCapacity);
            AbstractC22676k.m65749i(sArrCopyOf, "copyOf(...)");
            this.buffer = sArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: getPosition$kotlinx_serialization_core, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    private UShortArrayBuilder(short[] bufferWithData) {
        AbstractC22676k.m65750j(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }
}
