package kotlinx.serialization.internal;

import ce3.C4509j;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.C25263q;
import p002a0.C0030i1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import vf3.AbstractC35952b;
import yc3.AbstractC39447k;
import yc3.C39446j;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lyc3/g;", "getElementDescriptor", "(I)Lyc3/g;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lyc3/k;", "kind", "Lyc3/k;", "getKind", "()Lyc3/k;", "", "elementDescriptors$delegate", "Ll83/h;", "getElementDescriptors", "()[Lyc3/g;", "elementDescriptors", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: elementDescriptors$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h elementDescriptors;
    private final AbstractC39447k kind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(String name, int i13) {
        super(name, null, i13, 2, null);
        AbstractC22676k.m65750j(name, "name");
        this.kind = C39446j.f169712a;
        this.elementDescriptors = AbstractC30060g.m92088H(new C4509j(i13, name, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC39443g[] elementDescriptors_delegate$lambda$0(int i13, String str, EnumDescriptor enumDescriptor) {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            interfaceC39443gArr[i14] = AbstractC35952b.m114197e(str + '.' + enumDescriptor.getElementName(i14), C39448l.f169716d, new InterfaceC39443g[0]);
        }
        return interfaceC39443gArr;
    }

    private final InterfaceC39443g[] getElementDescriptors() {
        return (InterfaceC39443g[]) this.elementDescriptors.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof InterfaceC39443g)) {
            return false;
        }
        InterfaceC39443g interfaceC39443g = (InterfaceC39443g) other;
        return interfaceC39443g.getKind() == C39446j.f169712a && AbstractC22676k.m65745e(getSerialName(), interfaceC39443g.getSerialName()) && AbstractC22676k.m65745e(Platform_commonKt.cachedSerialNames(this), Platform_commonKt.cachedSerialNames(interfaceC39443g));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, yc3.InterfaceC39443g
    public InterfaceC39443g getElementDescriptor(int index) {
        return getElementDescriptors()[index];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, yc3.InterfaceC39443g
    public AbstractC39447k getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int iHashCode = getSerialName().hashCode();
        C0030i1 c0030i1 = new C0030i1(this);
        int iHashCode2 = 1;
        while (c0030i1.hasNext()) {
            int i13 = iHashCode2 * 31;
            String str = (String) c0030i1.next();
            iHashCode2 = i13 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        return AbstractC25265s.m74110N0(new C25263q(this, 3), ", ", getSerialName() + '(', ")", null, 56);
    }
}
