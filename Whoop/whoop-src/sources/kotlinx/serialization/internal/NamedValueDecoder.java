package kotlinx.serialization.internal;

import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/internal/TaggedDecoder;", "", "<init>", "()V", "Lyc3/g;", "", "index", "getTag", "(Lyc3/g;I)Ljava/lang/String;", "nestedName", "nested", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "elementName", "parentName", "childName", "composeName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "renderTagStack", "()Ljava/lang/String;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class NamedValueDecoder extends TaggedDecoder<String> {
    public String composeName(String parentName, String childName) {
        AbstractC22676k.m65750j(parentName, "parentName");
        AbstractC22676k.m65750j(childName, "childName");
        return parentName.length() == 0 ? childName : AbstractC11895b.m31992k('.', parentName, childName);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40539b
    public abstract /* synthetic */ int decodeElementIndex(InterfaceC39443g interfaceC39443g);

    public String elementName(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return descriptor.getElementName(index);
    }

    public final String nested(String nestedName) {
        AbstractC22676k.m65750j(nestedName, "nestedName");
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            currentTagOrNull = "";
        }
        return composeName(currentTagOrNull, nestedName);
    }

    public final String renderTagStack() {
        return getTagStack$kotlinx_serialization_core().isEmpty() ? "$" : AbstractC25265s.m74110N0(getTagStack$kotlinx_serialization_core(), ".", "$.", null, null, 60);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final String getTag(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        return nested(elementName(interfaceC39443g, i13));
    }
}
