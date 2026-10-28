package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.AbstractC39447k;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\rR \u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u0010+R\u0014\u00102\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u0010\u0010R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m65681d2 = {"Lkotlinx/serialization/internal/SerialDescriptorForNullable;", "Lyc3/g;", "Lkotlinx/serialization/internal/CachedNames;", "original", "<init>", "(Lyc3/g;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lyc3/g;", "isElementOptional", "(I)Z", "Lyc3/g;", "getOriginal$kotlinx_serialization_core", "()Lyc3/g;", "serialName", "Ljava/lang/String;", "getSerialName", "", "serialNames", "Ljava/util/Set;", "getSerialNames", "()Ljava/util/Set;", "isNullable", "()Z", "Lyc3/k;", "getKind", "()Lyc3/k;", "kind", "isInline", "getElementsCount", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SerialDescriptorForNullable implements InterfaceC39443g, CachedNames {
    private final InterfaceC39443g original;
    private final String serialName;
    private final Set<String> serialNames;

    public SerialDescriptorForNullable(InterfaceC39443g original) {
        AbstractC22676k.m65750j(original, "original");
        this.original = original;
        this.serialName = original.getSerialName() + '?';
        this.serialNames = Platform_commonKt.cachedSerialNames(original);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SerialDescriptorForNullable) && AbstractC22676k.m65745e(this.original, ((SerialDescriptorForNullable) other).original);
    }

    @Override // yc3.InterfaceC39443g
    public List<Annotation> getAnnotations() {
        return this.original.getAnnotations();
    }

    @Override // yc3.InterfaceC39443g
    public List<Annotation> getElementAnnotations(int index) {
        return this.original.getElementAnnotations(index);
    }

    @Override // yc3.InterfaceC39443g
    public InterfaceC39443g getElementDescriptor(int index) {
        return this.original.getElementDescriptor(index);
    }

    @Override // yc3.InterfaceC39443g
    public int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        return this.original.getElementIndex(name);
    }

    @Override // yc3.InterfaceC39443g
    public String getElementName(int index) {
        return this.original.getElementName(index);
    }

    @Override // yc3.InterfaceC39443g
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // yc3.InterfaceC39443g
    public AbstractC39447k getKind() {
        return this.original.getKind();
    }

    /* JADX INFO: renamed from: getOriginal$kotlinx_serialization_core, reason: from getter */
    public final InterfaceC39443g getOriginal() {
        return this.original;
    }

    @Override // yc3.InterfaceC39443g
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.serialNames;
    }

    public int hashCode() {
        return this.original.hashCode() * 31;
    }

    @Override // yc3.InterfaceC39443g
    public boolean isElementOptional(int index) {
        return this.original.isElementOptional(index);
    }

    @Override // yc3.InterfaceC39443g
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override // yc3.InterfaceC39443g
    public boolean isNullable() {
        return true;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.original);
        sb4.append('?');
        return sb4.toString();
    }
}
