package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import m83.C25271y;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.AbstractC39447k;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0019R\u0014\u0010)\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001f¨\u0006*"}, m65681d2 = {"Lkotlinx/serialization/internal/NothingSerialDescriptor;", "Lyc3/g;", "<init>", "()V", "", "error", "()Ljava/lang/Void;", "", "index", "", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "getElementDescriptor", "(I)Lyc3/g;", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lyc3/k;", "kind", "Lyc3/k;", "getKind", "()Lyc3/k;", "serialName", "Ljava/lang/String;", "getSerialName", "getElementsCount", "elementsCount", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NothingSerialDescriptor implements InterfaceC39443g {
    public static final NothingSerialDescriptor INSTANCE = new NothingSerialDescriptor();
    private static final AbstractC39447k kind = C39448l.f169716d;
    private static final String serialName = "kotlin.Nothing";

    private NothingSerialDescriptor() {
    }

    private final Void error() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public boolean equals(Object other) {
        return this == other;
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
    public AbstractC39447k getKind() {
        return kind;
    }

    @Override // yc3.InterfaceC39443g
    public String getSerialName() {
        return serialName;
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
        return "NothingSerialDescriptor";
    }
}
