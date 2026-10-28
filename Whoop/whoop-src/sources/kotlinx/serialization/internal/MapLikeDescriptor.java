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
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010$R\u001a\u0010&\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001dR\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0001\u0002-.¨\u0006/"}, m65681d2 = {"Lkotlinx/serialization/internal/MapLikeDescriptor;", "Lyc3/g;", "", "serialName", "keyDescriptor", "valueDescriptor", "<init>", "(Ljava/lang/String;Lyc3/g;Lyc3/g;)V", "", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lyc3/g;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getSerialName", "Lyc3/g;", "getKeyDescriptor", "()Lyc3/g;", "getValueDescriptor", "elementsCount", "I", "getElementsCount", "Lyc3/k;", "getKind", "()Lyc3/k;", "kind", "Lkotlinx/serialization/internal/HashMapClassDesc;", "Lkotlinx/serialization/internal/LinkedHashMapClassDesc;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class MapLikeDescriptor implements InterfaceC39443g {
    private final int elementsCount;
    private final InterfaceC39443g keyDescriptor;
    private final String serialName;
    private final InterfaceC39443g valueDescriptor;

    public /* synthetic */ MapLikeDescriptor(String str, InterfaceC39443g interfaceC39443g, InterfaceC39443g interfaceC39443g2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC39443g, interfaceC39443g2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapLikeDescriptor)) {
            return false;
        }
        MapLikeDescriptor mapLikeDescriptor = (MapLikeDescriptor) other;
        return AbstractC22676k.m65745e(getSerialName(), mapLikeDescriptor.getSerialName()) && AbstractC22676k.m65745e(this.keyDescriptor, mapLikeDescriptor.keyDescriptor) && AbstractC22676k.m65745e(this.valueDescriptor, mapLikeDescriptor.valueDescriptor);
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

    @Override // yc3.InterfaceC39443g
    public InterfaceC39443g getElementDescriptor(int index) {
        if (index < 0) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(index, "Illegal index ", ", ");
            sbM30466t.append(getSerialName());
            sbM30466t.append(" expects only non-negative indices");
            throw new IllegalArgumentException(sbM30466t.toString().toString());
        }
        int i13 = index % 2;
        if (i13 == 0) {
            return this.keyDescriptor;
        }
        if (i13 == 1) {
            return this.valueDescriptor;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // yc3.InterfaceC39443g
    public int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        Integer numM125932Q = AbstractC39421y.m125932Q(name);
        if (numM125932Q != null) {
            return numM125932Q.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // yc3.InterfaceC39443g
    public String getElementName(int index) {
        return String.valueOf(index);
    }

    @Override // yc3.InterfaceC39443g
    public int getElementsCount() {
        return this.elementsCount;
    }

    public final InterfaceC39443g getKeyDescriptor() {
        return this.keyDescriptor;
    }

    @Override // yc3.InterfaceC39443g
    public AbstractC39447k getKind() {
        return C39448l.f169715c;
    }

    @Override // yc3.InterfaceC39443g
    public String getSerialName() {
        return this.serialName;
    }

    public final InterfaceC39443g getValueDescriptor() {
        return this.valueDescriptor;
    }

    public int hashCode() {
        return this.valueDescriptor.hashCode() + ((this.keyDescriptor.hashCode() + (getSerialName().hashCode() * 31)) * 31);
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
        return getSerialName() + '(' + this.keyDescriptor + ", " + this.valueDescriptor + ')';
    }

    private MapLikeDescriptor(String str, InterfaceC39443g interfaceC39443g, InterfaceC39443g interfaceC39443g2) {
        this.serialName = str;
        this.keyDescriptor = interfaceC39443g;
        this.valueDescriptor = interfaceC39443g2;
        this.elementsCount = 2;
    }
}
