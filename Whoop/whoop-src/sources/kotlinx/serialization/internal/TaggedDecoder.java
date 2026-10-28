package kotlinx.serialization.internal;

import c93.InterfaceC4339a;
import cd3.AbstractC4454f;
import cd3.AbstractC4457i;
import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import wc3.InterfaceC37137b;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40541d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH$¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0007H\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u00102J3\u00107\u001a\u00028\u0001\"\n\b\u0001\u00103*\u0004\u0018\u00010\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0001042\b\u00106\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000fH\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u000f¢\u0006\u0004\b@\u0010=J\r\u0010A\u001a\u00020\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0019¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\b¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u001e¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020!¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020$¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020'¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020*¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020U2\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\bV\u0010WJ\u001d\u0010X\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bZ\u0010[J\u001d\u0010\\\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b^\u0010_J\u001d\u0010`\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020!2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bb\u0010cJ\u001d\u0010d\u001a\u00020$2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bd\u0010eJ\u001d\u0010f\u001a\u00020'2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bf\u0010gJ\u001d\u0010h\u001a\u00020*2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bh\u0010iJ\u001d\u0010j\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bj\u0010kJA\u0010l\u001a\u00028\u0001\"\n\b\u0001\u00103*\u0004\u0018\u00010\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0001042\b\u00106\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bl\u0010mJC\u0010n\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u00103*\u00020\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001042\b\u00106\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bn\u0010mJ\u0017\u0010p\u001a\u00020U2\u0006\u0010o\u001a\u00028\u0000H\u0004¢\u0006\u0004\bp\u0010qJ\u001d\u0010s\u001a\u00020U2\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0004¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00028\u0000H\u0004¢\u0006\u0004\bu\u0010vJ+\u0010z\u001a\u00028\u0001\"\u0004\b\u0001\u0010w2\u0006\u0010\f\u001a\u00028\u00002\f\u0010y\u001a\b\u0012\u0004\u0012\u00028\u00010xH\u0002¢\u0006\u0004\bz\u0010{R,\u0010~\u001a\u0012\u0012\u0004\u0012\u00028\u00000|j\b\u0012\u0004\u0012\u00028\u0000`}8\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0089\u0001\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010vR\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010v¨\u0006\u008c\u0001"}, m65681d2 = {"Lkotlinx/serialization/internal/TaggedDecoder;", "", "Tag", "Lzc3/d;", "Lzc3/b;", "<init>", "()V", "Lyc3/g;", "", "index", "getTag", "(Lyc3/g;I)Ljava/lang/Object;", "tag", "decodeTaggedValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "decodeTaggedNotNullMark", "(Ljava/lang/Object;)Z", "", "decodeTaggedNull", "(Ljava/lang/Object;)Ljava/lang/Void;", "decodeTaggedBoolean", "", "decodeTaggedByte", "(Ljava/lang/Object;)B", "", "decodeTaggedShort", "(Ljava/lang/Object;)S", "decodeTaggedInt", "(Ljava/lang/Object;)I", "", "decodeTaggedLong", "(Ljava/lang/Object;)J", "", "decodeTaggedFloat", "(Ljava/lang/Object;)F", "", "decodeTaggedDouble", "(Ljava/lang/Object;)D", "", "decodeTaggedChar", "(Ljava/lang/Object;)C", "", "decodeTaggedString", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "decodeTaggedEnum", "(Ljava/lang/Object;Lyc3/g;)I", "inlineDescriptor", "decodeTaggedInline", "(Ljava/lang/Object;Lyc3/g;)Lzc3/d;", "T", "Lwc3/b;", "deserializer", "previousValue", "decodeSerializableValue", "(Lwc3/b;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "decodeInline", "(Lyc3/g;)Lzc3/d;", "decodeNotNullMark", "()Z", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "decodeByte", "()B", "decodeShort", "()S", "decodeInt", "()I", "decodeLong", "()J", "decodeFloat", "()F", "decodeDouble", "()D", "decodeChar", "()C", "decodeString", "()Ljava/lang/String;", "decodeEnum", "(Lyc3/g;)I", "beginStructure", "(Lyc3/g;)Lzc3/b;", "Ll83/a0;", "endStructure", "(Lyc3/g;)V", "decodeBooleanElement", "(Lyc3/g;I)Z", "decodeByteElement", "(Lyc3/g;I)B", "decodeShortElement", "(Lyc3/g;I)S", "decodeIntElement", "(Lyc3/g;I)I", "decodeLongElement", "(Lyc3/g;I)J", "decodeFloatElement", "(Lyc3/g;I)F", "decodeDoubleElement", "(Lyc3/g;I)D", "decodeCharElement", "(Lyc3/g;I)C", "decodeStringElement", "(Lyc3/g;I)Ljava/lang/String;", "decodeInlineElement", "(Lyc3/g;I)Lzc3/d;", "decodeSerializableElement", "(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "name", "pushTag", "(Ljava/lang/Object;)V", "other", "copyTagsTo", "(Lkotlinx/serialization/internal/TaggedDecoder;)V", "popTag", "()Ljava/lang/Object;", "E", "Lkotlin/Function0;", "block", "tagBlock", "(Ljava/lang/Object;Lc93/a;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "tagStack", "Ljava/util/ArrayList;", "getTagStack$kotlinx_serialization_core", "()Ljava/util/ArrayList;", "flag", "Z", "Lcd3/f;", "getSerializersModule", "()Lcd3/f;", "serializersModule", "getCurrentTag", "currentTag", "getCurrentTagOrNull", "currentTagOrNull", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class TaggedDecoder<Tag> implements InterfaceC40541d, InterfaceC40539b {
    private boolean flag;
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object decodeNullableSerializableElement$lambda$3(TaggedDecoder taggedDecoder, InterfaceC37137b interfaceC37137b, Object obj) {
        return (interfaceC37137b.getDescriptor().isNullable() || taggedDecoder.decodeNotNullMark()) ? taggedDecoder.decodeSerializableValue(interfaceC37137b, obj) : taggedDecoder.decodeNull();
    }

    private final <E> E tagBlock(Tag tag, InterfaceC4339a block) {
        pushTag(tag);
        E e5 = (E) block.invoke();
        if (!this.flag) {
            popTag();
        }
        this.flag = false;
        return e5;
    }

    @Override // zc3.InterfaceC40541d
    public InterfaceC40539b beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return this;
    }

    public final void copyTagsTo(TaggedDecoder<Tag> other) {
        AbstractC22676k.m65750j(other, "other");
        other.tagStack.addAll(this.tagStack);
    }

    @Override // zc3.InterfaceC40541d
    public final boolean decodeBoolean() {
        return decodeTaggedBoolean(popTag());
    }

    @Override // zc3.InterfaceC40539b
    public final boolean decodeBooleanElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedBoolean(getTag(descriptor, index));
    }

    @Override // zc3.InterfaceC40541d
    public final byte decodeByte() {
        return decodeTaggedByte(popTag());
    }

    @Override // zc3.InterfaceC40539b
    public final byte decodeByteElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedByte(getTag(descriptor, index));
    }

    @Override // zc3.InterfaceC40541d
    public final char decodeChar() {
        return decodeTaggedChar(popTag());
    }

    @Override // zc3.InterfaceC40539b
    public final char decodeCharElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedChar(getTag(descriptor, index));
    }

    @Override // zc3.InterfaceC40539b
    public int decodeCollectionSize(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return -1;
    }

    @Override // zc3.InterfaceC40541d
    public final double decodeDouble() {
        return decodeTaggedDouble(popTag());
    }

    @Override // zc3.InterfaceC40539b
    public final double decodeDoubleElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedDouble(getTag(descriptor, index));
    }

    public abstract /* synthetic */ int decodeElementIndex(InterfaceC39443g interfaceC39443g);

    @Override // zc3.InterfaceC40541d
    public final int decodeEnum(InterfaceC39443g enumDescriptor) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        return decodeTaggedEnum(popTag(), enumDescriptor);
    }

    @Override // zc3.InterfaceC40541d
    public final float decodeFloat() {
        return decodeTaggedFloat(popTag());
    }

    @Override // zc3.InterfaceC40539b
    public final float decodeFloatElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedFloat(getTag(descriptor, index));
    }

    @Override // zc3.InterfaceC40541d
    public InterfaceC40541d decodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedInline(popTag(), descriptor);
    }

    @Override // zc3.InterfaceC40539b
    public final InterfaceC40541d decodeInlineElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedInline(getTag(descriptor, index), descriptor.getElementDescriptor(index));
    }

    @Override // zc3.InterfaceC40541d
    public final int decodeInt() {
        return decodeTaggedInt(popTag());
    }

    @Override // zc3.InterfaceC40539b
    public final int decodeIntElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedInt(getTag(descriptor, index));
    }

    @Override // zc3.InterfaceC40541d
    public final long decodeLong() {
        return decodeTaggedLong(popTag());
    }

    @Override // zc3.InterfaceC40539b
    public final long decodeLongElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedLong(getTag(descriptor, index));
    }

    @Override // zc3.InterfaceC40541d
    public boolean decodeNotNullMark() {
        Tag currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            return false;
        }
        return decodeTaggedNotNullMark(currentTagOrNull);
    }

    @Override // zc3.InterfaceC40541d
    public final Void decodeNull() {
        return null;
    }

    @Override // zc3.InterfaceC40539b
    public final <T> T decodeNullableSerializableElement(InterfaceC39443g descriptor, int index, InterfaceC37137b deserializer, T previousValue) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return (T) tagBlock(getTag(descriptor, index), new C22732b(this, deserializer, previousValue, 1));
    }

    public <T> T decodeNullableSerializableValue(InterfaceC37137b deserializer) {
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return (deserializer.getDescriptor().isNullable() || decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer) : (T) decodeNull();
    }

    @Override // zc3.InterfaceC40539b
    public boolean decodeSequentially() {
        return false;
    }

    @Override // zc3.InterfaceC40539b
    public final <T> T decodeSerializableElement(InterfaceC39443g descriptor, int index, InterfaceC37137b deserializer, T previousValue) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return (T) tagBlock(getTag(descriptor, index), new C22732b(this, deserializer, previousValue, 0));
    }

    @Override // zc3.InterfaceC40541d
    public <T> T decodeSerializableValue(InterfaceC37137b deserializer) {
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return (T) deserializer.deserialize(this);
    }

    @Override // zc3.InterfaceC40541d
    public final short decodeShort() {
        return decodeTaggedShort(popTag());
    }

    @Override // zc3.InterfaceC40539b
    public final short decodeShortElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedShort(getTag(descriptor, index));
    }

    @Override // zc3.InterfaceC40541d
    public final String decodeString() {
        return decodeTaggedString(popTag());
    }

    @Override // zc3.InterfaceC40539b
    public final String decodeStringElement(InterfaceC39443g descriptor, int index) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeTaggedString(getTag(descriptor, index));
    }

    public boolean decodeTaggedBoolean(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeTaggedValue).booleanValue();
    }

    public byte decodeTaggedByte(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeTaggedValue).byteValue();
    }

    public char decodeTaggedChar(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeTaggedValue).charValue();
    }

    public double decodeTaggedDouble(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeTaggedValue).doubleValue();
    }

    public int decodeTaggedEnum(Tag tag, InterfaceC39443g enumDescriptor) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeTaggedValue).intValue();
    }

    public float decodeTaggedFloat(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeTaggedValue).floatValue();
    }

    public InterfaceC40541d decodeTaggedInline(Tag tag, InterfaceC39443g inlineDescriptor) {
        AbstractC22676k.m65750j(inlineDescriptor, "inlineDescriptor");
        pushTag(tag);
        return this;
    }

    public int decodeTaggedInt(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeTaggedValue).intValue();
    }

    public long decodeTaggedLong(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeTaggedValue).longValue();
    }

    public boolean decodeTaggedNotNullMark(Tag tag) {
        return true;
    }

    public Void decodeTaggedNull(Tag tag) {
        return null;
    }

    public short decodeTaggedShort(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeTaggedValue).shortValue();
    }

    public String decodeTaggedString(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        AbstractC22676k.m65748h(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeTaggedValue;
    }

    public Object decodeTaggedValue(Tag tag) {
        throw new SerializationException(AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    public void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
    }

    public final Tag getCurrentTag() {
        return (Tag) AbstractC25265s.m74112P0(this.tagStack);
    }

    public final Tag getCurrentTagOrNull() {
        return (Tag) AbstractC25265s.m74114R0(this.tagStack);
    }

    @Override // zc3.InterfaceC40541d, zc3.InterfaceC40539b
    public AbstractC4454f getSerializersModule() {
        return AbstractC4457i.f17965a;
    }

    public abstract Tag getTag(InterfaceC39443g interfaceC39443g, int i13);

    public final ArrayList<Tag> getTagStack$kotlinx_serialization_core() {
        return this.tagStack;
    }

    public final Tag popTag() {
        ArrayList<Tag> arrayList = this.tagStack;
        Tag tagRemove = arrayList.remove(AbstractC37056f.m118951C(arrayList));
        this.flag = true;
        return tagRemove;
    }

    public final void pushTag(Tag name) {
        this.tagStack.add(name);
    }

    public <T> T decodeSerializableValue(InterfaceC37137b deserializer, T previousValue) {
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }
}
