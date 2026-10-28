package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import m83.C25271y;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.AbstractC39442f;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"¨\u0006*"}, m65681d2 = {"Lkotlinx/serialization/internal/PrimitiveSerialDescriptor;", "Lyc3/g;", "", "serialName", "Lyc3/f;", "kind", "<init>", "(Ljava/lang/String;Lyc3/f;)V", "", "error", "()Ljava/lang/Void;", "", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "getElementDescriptor", "(I)Lyc3/g;", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getSerialName", "Lyc3/f;", "getKind", "()Lyc3/f;", "getElementsCount", "elementsCount", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PrimitiveSerialDescriptor implements InterfaceC39443g {
    private final AbstractC39442f kind;
    private final String serialName;

    public PrimitiveSerialDescriptor(String serialName, AbstractC39442f kind) {
        AbstractC22676k.m65750j(serialName, "serialName");
        AbstractC22676k.m65750j(kind, "kind");
        this.serialName = serialName;
        this.kind = kind;
    }

    private final Void error() {
        throw new IllegalStateException("Primitive descriptor " + getSerialName() + " does not have elements");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimitiveSerialDescriptor)) {
            return false;
        }
        PrimitiveSerialDescriptor primitiveSerialDescriptor = (PrimitiveSerialDescriptor) other;
        return AbstractC22676k.m65745e(getSerialName(), primitiveSerialDescriptor.getSerialName()) && AbstractC22676k.m65745e(getKind(), primitiveSerialDescriptor.getKind());
    }

    @Override // yc3.InterfaceC39443g
    public List<Annotation> getAnnotations() {
        return C25271y.f99162w;
    }

    @Override // yc3.InterfaceC39443g
    public List<Annotation> getElementAnnotations(int index) {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // yc3.InterfaceC39443g
    public InterfaceC39443g getElementDescriptor(int index) {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // yc3.InterfaceC39443g
    public int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        error();
        throw new KotlinNothingValueException();
    }

    @Override // yc3.InterfaceC39443g
    public String getElementName(int index) {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // yc3.InterfaceC39443g
    public int getElementsCount() {
        return 0;
    }

    @Override // yc3.InterfaceC39443g
    public String getSerialName() {
        return this.serialName;
    }

    public int hashCode() {
        return (getKind().hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // yc3.InterfaceC39443g
    public boolean isElementOptional(int index) {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // yc3.InterfaceC39443g
    public boolean isInline() {
        return false;
    }

    @Override // yc3.InterfaceC39443g
    public boolean isNullable() {
        return false;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + getSerialName() + ')';
    }

    @Override // yc3.InterfaceC39443g
    public AbstractC39442f getKind() {
        return this.kind;
    }
}
