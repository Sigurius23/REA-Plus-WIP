package kotlinx.serialization.internal;

import cd3.AbstractC4454f;
import cd3.AbstractC4457i;
import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import wb3.AbstractC37056f;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH$¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\bH\u0014¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u00102\u001a\u00020\u0007H\u0014¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u0006J\u0015\u0010:\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020%¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0019¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001c¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001f¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\"¢\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020+¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0007¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0007H\u0014¢\u0006\u0004\bR\u0010QJ%\u0010S\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020%¢\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0016¢\u0006\u0004\bU\u0010VJ%\u0010W\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0019¢\u0006\u0004\bW\u0010XJ%\u0010Y\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001c¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001f¢\u0006\u0004\b]\u0010^J%\u0010_\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\"¢\u0006\u0004\b_\u0010`J%\u0010a\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020(¢\u0006\u0004\ba\u0010bJ%\u0010c\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020+¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\be\u0010fJA\u0010j\u001a\u00020\u000e\"\n\b\u0001\u0010g*\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00010h2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\bj\u0010kJA\u0010l\u001a\u00020\u000e\"\b\b\u0001\u0010g*\u00020\u00012\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00010h2\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\bl\u0010kJ\u0017\u0010n\u001a\u00020\u000e2\u0006\u0010m\u001a\u00028\u0000H\u0004¢\u0006\u0004\bn\u0010\u0012J\u000f\u0010o\u001a\u00028\u0000H\u0004¢\u0006\u0004\bo\u0010pJ\u001f\u0010r\u001a\u00020%2\u0006\u0010q\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\br\u0010sR$\u0010v\u001a\u0012\u0012\u0004\u0012\u00028\u00000tj\b\u0012\u0004\u0012\u00028\u0000`u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010{\u001a\u00020x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b|\u0010pR\u0016\u0010\u007f\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b~\u0010p¨\u0006\u0080\u0001"}, m65681d2 = {"Lkotlinx/serialization/internal/TaggedEncoder;", "", "Tag", "Lzc3/e;", "Lzc3/c;", "<init>", "()V", "Lyc3/g;", "", "index", "getTag", "(Lyc3/g;I)Ljava/lang/Object;", "tag", "value", "Ll83/a0;", "encodeTaggedValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "encodeTaggedNonNullMark", "(Ljava/lang/Object;)V", "encodeTaggedNull", "encodeTaggedInt", "(Ljava/lang/Object;I)V", "", "encodeTaggedByte", "(Ljava/lang/Object;B)V", "", "encodeTaggedShort", "(Ljava/lang/Object;S)V", "", "encodeTaggedLong", "(Ljava/lang/Object;J)V", "", "encodeTaggedFloat", "(Ljava/lang/Object;F)V", "", "encodeTaggedDouble", "(Ljava/lang/Object;D)V", "", "encodeTaggedBoolean", "(Ljava/lang/Object;Z)V", "", "encodeTaggedChar", "(Ljava/lang/Object;C)V", "", "encodeTaggedString", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "encodeTaggedEnum", "(Ljava/lang/Object;Lyc3/g;I)V", "inlineDescriptor", "encodeTaggedInline", "(Ljava/lang/Object;Lyc3/g;)Lzc3/e;", "descriptor", "encodeInline", "(Lyc3/g;)Lzc3/e;", "encodeNotNullMark", "encodeNull", "encodeBoolean", "(Z)V", "encodeByte", "(B)V", "encodeShort", "(S)V", "encodeInt", "(I)V", "encodeLong", "(J)V", "encodeFloat", "(F)V", "encodeDouble", "(D)V", "encodeChar", "(C)V", "encodeString", "(Ljava/lang/String;)V", "encodeEnum", "(Lyc3/g;I)V", "beginStructure", "(Lyc3/g;)Lzc3/c;", "endStructure", "(Lyc3/g;)V", "endEncode", "encodeBooleanElement", "(Lyc3/g;IZ)V", "encodeByteElement", "(Lyc3/g;IB)V", "encodeShortElement", "(Lyc3/g;IS)V", "encodeIntElement", "(Lyc3/g;II)V", "encodeLongElement", "(Lyc3/g;IJ)V", "encodeFloatElement", "(Lyc3/g;IF)V", "encodeDoubleElement", "(Lyc3/g;ID)V", "encodeCharElement", "(Lyc3/g;IC)V", "encodeStringElement", "(Lyc3/g;ILjava/lang/String;)V", "encodeInlineElement", "(Lyc3/g;I)Lzc3/e;", "T", "Lwc3/j;", "serializer", "encodeSerializableElement", "(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V", "encodeNullableSerializableElement", "name", "pushTag", "popTag", "()Ljava/lang/Object;", "desc", "encodeElement", "(Lyc3/g;I)Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "tagStack", "Ljava/util/ArrayList;", "Lcd3/f;", "getSerializersModule", "()Lcd3/f;", "serializersModule", "getCurrentTag", "currentTag", "getCurrentTagOrNull", "currentTagOrNull", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class TaggedEncoder<Tag> implements InterfaceC40542e, InterfaceC40540c {
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    private final boolean encodeElement(InterfaceC39443g desc, int index) {
        pushTag(getTag(desc, index));
        return true;
    }

    @Override // zc3.InterfaceC40542e
    public InterfaceC40540c beginCollection(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    @Override // zc3.InterfaceC40542e
    public InterfaceC40540c beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return this;
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeBoolean(boolean value) {
        encodeTaggedBoolean(popTag(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeBooleanElement(InterfaceC39443g descriptor, int index, boolean value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        encodeTaggedBoolean(getTag(descriptor, index), value);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeByte(byte value) {
        encodeTaggedByte(popTag(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeByteElement(InterfaceC39443g descriptor, int index, byte value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        encodeTaggedByte(getTag(descriptor, index), value);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeChar(char value) {
        encodeTaggedChar(popTag(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeCharElement(InterfaceC39443g descriptor, int index, char value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        encodeTaggedChar(getTag(descriptor, index), value);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeDouble(double value) {
        encodeTaggedDouble(popTag(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeDoubleElement(InterfaceC39443g descriptor, int index, double value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        encodeTaggedDouble(getTag(descriptor, index), value);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeEnum(InterfaceC39443g enumDescriptor, int index) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        encodeTaggedEnum(popTag(), enumDescriptor, index);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeFloat(float value) {
        encodeTaggedFloat(popTag(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeFloatElement(InterfaceC39443g descriptor, int index, float value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        encodeTaggedFloat(getTag(descriptor, index), value);
    }

    @Override // zc3.InterfaceC40542e
    public InterfaceC40542e encodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return encodeTaggedInline(popTag(), descriptor);
    }

    @Override // zc3.InterfaceC40540c
    public final InterfaceC40542e encodeInlineElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return encodeTaggedInline(getTag(descriptor, index), descriptor.getElementDescriptor(index));
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeInt(int value) {
        encodeTaggedInt(popTag(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeIntElement(InterfaceC39443g descriptor, int index, int value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        encodeTaggedInt(getTag(descriptor, index), value);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeLong(long value) {
        encodeTaggedLong(popTag(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeLongElement(InterfaceC39443g descriptor, int index, long value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        encodeTaggedLong(getTag(descriptor, index), value);
    }

    @Override // zc3.InterfaceC40542e
    public void encodeNotNullMark() {
        encodeTaggedNonNullMark(getCurrentTag());
    }

    @Override // zc3.InterfaceC40542e
    public void encodeNull() {
        encodeTaggedNull(popTag());
    }

    public <T> void encodeNullableSerializableElement(InterfaceC39443g descriptor, int index, InterfaceC37145j serializer, T value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(serializer, "serializer");
        if (encodeElement(descriptor, index)) {
            encodeNullableSerializableValue(serializer, value);
        }
    }

    @Override // zc3.InterfaceC40542e
    public <T> void encodeNullableSerializableValue(InterfaceC37145j interfaceC37145j, T t14) {
        super.encodeNullableSerializableValue(interfaceC37145j, t14);
    }

    @Override // zc3.InterfaceC40540c
    public <T> void encodeSerializableElement(InterfaceC39443g descriptor, int index, InterfaceC37145j serializer, T value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(serializer, "serializer");
        if (encodeElement(descriptor, index)) {
            encodeSerializableValue(serializer, value);
        }
    }

    @Override // zc3.InterfaceC40542e
    public <T> void encodeSerializableValue(InterfaceC37145j serializer, T t14) {
        AbstractC22676k.m65750j(serializer, "serializer");
        serializer.serialize(this, t14);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeShort(short value) {
        encodeTaggedShort(popTag(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeShortElement(InterfaceC39443g descriptor, int index, short value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        encodeTaggedShort(getTag(descriptor, index), value);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeString(String value) {
        AbstractC22676k.m65750j(value, "value");
        encodeTaggedString(popTag(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeStringElement(InterfaceC39443g descriptor, int index, String value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(value, "value");
        encodeTaggedString(getTag(descriptor, index), value);
    }

    public void encodeTaggedBoolean(Tag tag, boolean value) {
        encodeTaggedValue(tag, Boolean.valueOf(value));
    }

    public void encodeTaggedByte(Tag tag, byte value) {
        encodeTaggedValue(tag, Byte.valueOf(value));
    }

    public void encodeTaggedChar(Tag tag, char value) {
        encodeTaggedValue(tag, Character.valueOf(value));
    }

    public void encodeTaggedDouble(Tag tag, double value) {
        encodeTaggedValue(tag, Double.valueOf(value));
    }

    public void encodeTaggedEnum(Tag tag, InterfaceC39443g enumDescriptor, int ordinal) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        encodeTaggedValue(tag, Integer.valueOf(ordinal));
    }

    public void encodeTaggedFloat(Tag tag, float value) {
        encodeTaggedValue(tag, Float.valueOf(value));
    }

    public InterfaceC40542e encodeTaggedInline(Tag tag, InterfaceC39443g inlineDescriptor) {
        AbstractC22676k.m65750j(inlineDescriptor, "inlineDescriptor");
        pushTag(tag);
        return this;
    }

    public void encodeTaggedInt(Tag tag, int value) {
        encodeTaggedValue(tag, Integer.valueOf(value));
    }

    public void encodeTaggedLong(Tag tag, long value) {
        encodeTaggedValue(tag, Long.valueOf(value));
    }

    public void encodeTaggedNonNullMark(Tag tag) {
    }

    public void encodeTaggedNull(Tag tag) {
        throw new SerializationException("null is not supported");
    }

    public void encodeTaggedShort(Tag tag, short value) {
        encodeTaggedValue(tag, Short.valueOf(value));
    }

    public void encodeTaggedString(Tag tag, String value) {
        AbstractC22676k.m65750j(value, "value");
        encodeTaggedValue(tag, value);
    }

    public void encodeTaggedValue(Tag tag, Object value) {
        AbstractC22676k.m65750j(value, "value");
        StringBuilder sb4 = new StringBuilder("Non-serializable ");
        Class<?> cls = value.getClass();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(cls));
        sb4.append(" is not supported by ");
        sb4.append(c22673i0.getOrCreateKotlinClass(getClass()));
        sb4.append(" encoder");
        throw new SerializationException(sb4.toString());
    }

    public void endEncode(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
    }

    @Override // zc3.InterfaceC40540c
    public final void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (!this.tagStack.isEmpty()) {
            popTag();
        }
        endEncode(descriptor);
    }

    public final Tag getCurrentTag() {
        return (Tag) AbstractC25265s.m74112P0(this.tagStack);
    }

    public final Tag getCurrentTagOrNull() {
        return (Tag) AbstractC25265s.m74114R0(this.tagStack);
    }

    @Override // zc3.InterfaceC40542e
    public AbstractC4454f getSerializersModule() {
        return AbstractC4457i.f17965a;
    }

    public abstract Tag getTag(InterfaceC39443g interfaceC39443g, int i13);

    public final Tag popTag() {
        if (this.tagStack.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.tagStack;
        return arrayList.remove(AbstractC37056f.m118951C(arrayList));
    }

    public final void pushTag(Tag name) {
        this.tagStack.add(name);
    }

    public boolean shouldEncodeElementDefault(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return true;
    }
}
