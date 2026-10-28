package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39421y;
import yc3.AbstractC39447k;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u001e\u001a\u0004\b\u0014\u0010\u001fR\u001a\u0010 \u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001bR\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0001\u0005'()*+¨\u0006,"}, m65681d2 = {"Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lyc3/g;", "elementDescriptor", "<init>", "(Lyc3/g;)V", "", "index", "", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lyc3/g;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lyc3/g;", "()Lyc3/g;", "elementsCount", "I", "getElementsCount", "Lyc3/k;", "getKind", "()Lyc3/k;", "kind", "Lkotlinx/serialization/internal/ArrayClassDesc;", "Lkotlinx/serialization/internal/ArrayListClassDesc;", "Lkotlinx/serialization/internal/HashSetClassDesc;", "Lkotlinx/serialization/internal/LinkedHashSetClassDesc;", "Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ListLikeDescriptor implements InterfaceC39443g {
    private final InterfaceC39443g elementDescriptor;
    private final int elementsCount;

    public /* synthetic */ ListLikeDescriptor(InterfaceC39443g interfaceC39443g, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39443g);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListLikeDescriptor)) {
            return false;
        }
        ListLikeDescriptor listLikeDescriptor = (ListLikeDescriptor) other;
        return AbstractC22676k.m65745e(this.elementDescriptor, listLikeDescriptor.elementDescriptor) && AbstractC22676k.m65745e(getSerialName(), listLikeDescriptor.getSerialName());
    }

    @Override // yc3.InterfaceC39443g
    public List<Annotation> getAnnotations() {
        return C25271y.f99162w;
    }

    @Override // yc3.InterfaceC39443g
    public List<Annotation> getElementAnnotations(int index) {
        if (index >= 0) {
            return C25271y.f99162w;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(index, "Illegal index ", ", ");
        sbM30466t.append(getSerialName());
        sbM30466t.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM30466t.toString().toString());
    }

    public final InterfaceC39443g getElementDescriptor() {
        return this.elementDescriptor;
    }

    @Override // yc3.InterfaceC39443g
    public int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        Integer numM125932Q = AbstractC39421y.m125932Q(name);
        if (numM125932Q != null) {
            return numM125932Q.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // yc3.InterfaceC39443g
    public String getElementName(int index) {
        return String.valueOf(index);
    }

    @Override // yc3.InterfaceC39443g
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // yc3.InterfaceC39443g
    public AbstractC39447k getKind() {
        return C39448l.f169714b;
    }

    @Override // yc3.InterfaceC39443g
    public abstract /* synthetic */ String getSerialName();

    public int hashCode() {
        return getSerialName().hashCode() + (this.elementDescriptor.hashCode() * 31);
    }

    @Override // yc3.InterfaceC39443g
    public boolean isElementOptional(int index) {
        if (index >= 0) {
            return false;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(index, "Illegal index ", ", ");
        sbM30466t.append(getSerialName());
        sbM30466t.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM30466t.toString().toString());
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
        return getSerialName() + '(' + this.elementDescriptor + ')';
    }

    private ListLikeDescriptor(InterfaceC39443g interfaceC39443g) {
        this.elementDescriptor = interfaceC39443g;
        this.elementsCount = 1;
    }

    @Override // yc3.InterfaceC39443g
    public InterfaceC39443g getElementDescriptor(int index) {
        if (index >= 0) {
            return this.elementDescriptor;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(index, "Illegal index ", ", ");
        sbM30466t.append(getSerialName());
        sbM30466t.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM30466t.toString().toString());
    }
}
