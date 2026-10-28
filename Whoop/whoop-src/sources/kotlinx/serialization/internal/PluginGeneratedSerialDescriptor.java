package kotlinx.serialization.internal;

import c93.InterfaceC4339a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import yc3.AbstractC39447k;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010-R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010+R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0003048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u000107048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER!\u0010J\u001a\b\u0012\u0004\u0012\u00020\u0001048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010IR\u001b\u0010M\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010+R\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Y"}, m65681d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lyc3/g;", "Lkotlinx/serialization/internal/CachedNames;", "", "serialName", "Lkotlinx/serialization/internal/GeneratedSerializer;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "", "buildIndices", "()Ljava/util/Map;", "name", "", "isOptional", "Ll83/a0;", "addElement", "(Ljava/lang/String;Z)V", "", "annotation", "pushAnnotation", "(Ljava/lang/annotation/Annotation;)V", "a", "pushClassAnnotation", "index", "getElementDescriptor", "(I)Lyc3/g;", "isElementOptional", "(I)Z", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementName", "(I)Ljava/lang/String;", "getElementIndex", "(Ljava/lang/String;)I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getSerialName", "Lkotlinx/serialization/internal/GeneratedSerializer;", "I", "getElementsCount", "added", "", "names", "[Ljava/lang/String;", "", "propertiesAnnotations", "[Ljava/util/List;", "classAnnotations", "Ljava/util/List;", "", "elementsOptionality", "[Z", "indices", "Ljava/util/Map;", "Lwc3/c;", "childSerializers$delegate", "Ll83/h;", "getChildSerializers", "()[Lwc3/c;", "childSerializers", "typeParameterDescriptors$delegate", "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lyc3/g;", "typeParameterDescriptors", "_hashCode$delegate", "get_hashCode", "_hashCode", "Lyc3/k;", "getKind", "()Lyc3/k;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "getSerialNames", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class PluginGeneratedSerialDescriptor implements InterfaceC39443g, CachedNames {

    /* JADX INFO: renamed from: _hashCode$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h _hashCode;
    private int added;

    /* JADX INFO: renamed from: childSerializers$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h childSerializers;
    private List<Annotation> classAnnotations;
    private final int elementsCount;
    private final boolean[] elementsOptionality;
    private final GeneratedSerializer<?> generatedSerializer;
    private Map<String, Integer> indices;
    private final String[] names;
    private final List<Annotation>[] propertiesAnnotations;
    private final String serialName;

    /* JADX INFO: renamed from: typeParameterDescriptors$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h typeParameterDescriptors;

    public PluginGeneratedSerialDescriptor(String serialName, GeneratedSerializer<?> generatedSerializer, int i13) {
        AbstractC22676k.m65750j(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = generatedSerializer;
        this.elementsCount = i13;
        this.added = -1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            strArr[i14] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i15 = this.elementsCount;
        this.propertiesAnnotations = new List[i15];
        this.elementsOptionality = new boolean[i15];
        this.indices = C25272z.f99163w;
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        final int i16 = 0;
        this.childSerializers = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlinx.serialization.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f89407x;

            {
                this.f89407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(this.f89407x);
                    case 1:
                        return PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(this.f89407x);
                    default:
                        return Integer.valueOf(PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(this.f89407x));
                }
            }
        });
        final int i17 = 1;
        this.typeParameterDescriptors = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlinx.serialization.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f89407x;

            {
                this.f89407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(this.f89407x);
                    case 1:
                        return PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(this.f89407x);
                    default:
                        return Integer.valueOf(PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(this.f89407x));
                }
            }
        });
        final int i18 = 2;
        this._hashCode = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: kotlinx.serialization.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f89407x;

            {
                this.f89407x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(this.f89407x);
                    case 1:
                        return PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(this.f89407x);
                    default:
                        return Integer.valueOf(PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(this.f89407x));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _hashCode_delegate$lambda$3(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core());
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z4, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        pluginGeneratedSerialDescriptor.addElement(str, z4);
    }

    private final Map<String, Integer> buildIndices() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i13 = 0; i13 < length; i13++) {
            map.put(this.names[i13], Integer.valueOf(i13));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c[] childSerializers_delegate$lambda$0(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        InterfaceC37138c[] interfaceC37138cArrChildSerializers;
        GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        return (generatedSerializer == null || (interfaceC37138cArrChildSerializers = generatedSerializer.childSerializers()) == null) ? PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY : interfaceC37138cArrChildSerializers;
    }

    private final InterfaceC37138c[] getChildSerializers() {
        return (InterfaceC37138c[]) this.childSerializers.getValue();
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC39443g[] typeParameterDescriptors_delegate$lambda$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        ArrayList arrayList;
        InterfaceC37138c[] interfaceC37138cArrTypeParametersSerializers;
        GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        if (generatedSerializer == null || (interfaceC37138cArrTypeParametersSerializers = generatedSerializer.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(interfaceC37138cArrTypeParametersSerializers.length);
            for (InterfaceC37138c interfaceC37138c : interfaceC37138cArrTypeParametersSerializers) {
                arrayList.add(interfaceC37138c.getDescriptor());
            }
        }
        return Platform_commonKt.compactArray(arrayList);
    }

    public final void addElement(String name, boolean isOptional) {
        AbstractC22676k.m65750j(name, "name");
        String[] strArr = this.names;
        int i13 = this.added + 1;
        this.added = i13;
        strArr[i13] = name;
        this.elementsOptionality[i13] = isOptional;
        this.propertiesAnnotations[i13] = null;
        if (i13 == this.elementsCount - 1) {
            this.indices = buildIndices();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PluginGeneratedSerialDescriptor) {
            InterfaceC39443g interfaceC39443g = (InterfaceC39443g) other;
            if (AbstractC22676k.m65745e(getSerialName(), interfaceC39443g.getSerialName()) && Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((PluginGeneratedSerialDescriptor) other).getTypeParameterDescriptors$kotlinx_serialization_core()) && getElementsCount() == interfaceC39443g.getElementsCount()) {
                int elementsCount = getElementsCount();
                for (int i13 = 0; i13 < elementsCount; i13++) {
                    if (AbstractC22676k.m65745e(getElementDescriptor(i13).getSerialName(), interfaceC39443g.getElementDescriptor(i13).getSerialName()) && AbstractC22676k.m65745e(getElementDescriptor(i13).getKind(), interfaceC39443g.getElementDescriptor(i13).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // yc3.InterfaceC39443g
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        return list == null ? C25271y.f99162w : list;
    }

    @Override // yc3.InterfaceC39443g
    public List<Annotation> getElementAnnotations(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        return list == null ? C25271y.f99162w : list;
    }

    @Override // yc3.InterfaceC39443g
    public InterfaceC39443g getElementDescriptor(int index) {
        return getChildSerializers()[index].getDescriptor();
    }

    @Override // yc3.InterfaceC39443g
    public int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // yc3.InterfaceC39443g
    public String getElementName(int index) {
        return this.names[index];
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // yc3.InterfaceC39443g
    public AbstractC39447k getKind() {
        return C39448l.f169713a;
    }

    @Override // yc3.InterfaceC39443g
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    public final InterfaceC39443g[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (InterfaceC39443g[]) this.typeParameterDescriptors.getValue();
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // yc3.InterfaceC39443g
    public boolean isElementOptional(int index) {
        return this.elementsOptionality[index];
    }

    @Override // yc3.InterfaceC39443g
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return false;
    }

    @Override // yc3.InterfaceC39443g
    public boolean isNullable() {
        return false;
    }

    public final void pushAnnotation(Annotation annotation) {
        AbstractC22676k.m65750j(annotation, "annotation");
        List<Annotation> arrayList = this.propertiesAnnotations[this.added];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.propertiesAnnotations[this.added] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void pushClassAnnotation(Annotation a5) {
        AbstractC22676k.m65750j(a5, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        AbstractC22676k.m65747g(list);
        list.add(a5);
    }

    public String toString() {
        return PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? null : generatedSerializer, i13);
    }
}
