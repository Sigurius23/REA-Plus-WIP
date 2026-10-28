package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25260n;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p714k80.C22275d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bB'\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0007\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lkotlinx/serialization/internal/ObjectSerializer;", "", "T", "Lwc3/c;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "", "classAnnotations", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Ljava/lang/Object;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Ljava/lang/Object;", "Ljava/lang/Object;", "", "_annotations", "Ljava/util/List;", "Lyc3/g;", "descriptor$delegate", "Ll83/h;", "getDescriptor", "()Lyc3/g;", "descriptor", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ObjectSerializer<T> implements InterfaceC37138c {
    private List<? extends Annotation> _annotations;

    /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h descriptor;
    private final T objectInstance;

    public ObjectSerializer(String serialName, T objectInstance) {
        AbstractC22676k.m65750j(serialName, "serialName");
        AbstractC22676k.m65750j(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = C25271y.f99162w;
        this.descriptor = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22275d(2, serialName, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC39443g descriptor_delegate$lambda$1(String serialName, ObjectSerializer objectSerializer) {
        C39448l c39448l = C39448l.f169716d;
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        AbstractC22676k.m65750j(serialName, "serialName");
        if (AbstractC39414r.m125890i0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (c39448l.equals(C39448l.f169713a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C39437a c39437a = new C39437a(serialName);
        descriptor_delegate$lambda$1$lambda$0(objectSerializer, c39437a);
        return new C39444h(serialName, c39448l, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    private static final C23454a0 descriptor_delegate$lambda$1$lambda$0(ObjectSerializer objectSerializer, C39437a buildSerialDescriptor) {
        AbstractC22676k.m65750j(buildSerialDescriptor, "$this$buildSerialDescriptor");
        List<? extends Annotation> list = objectSerializer._annotations;
        AbstractC22676k.m65750j(list, "<set-?>");
        buildSerialDescriptor.f169679b = list;
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37137b
    public T deserialize(InterfaceC40541d decoder) {
        int iDecodeElementIndex;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor);
        if (!interfaceC40539bBeginStructure.decodeSequentially() && (iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(getDescriptor())) != -1) {
            throw new SerializationException(AbstractC2875y.m8295h(iDecodeElementIndex, "Unexpected index "));
        }
        interfaceC40539bBeginStructure.endStructure(descriptor);
        return this.objectInstance;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return (InterfaceC39443g) this.descriptor.getValue();
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, T value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectSerializer(String serialName, T objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        AbstractC22676k.m65750j(serialName, "serialName");
        AbstractC22676k.m65750j(objectInstance, "objectInstance");
        AbstractC22676k.m65750j(classAnnotations, "classAnnotations");
        this._annotations = AbstractC25260n.m74048W(classAnnotations);
    }
}
