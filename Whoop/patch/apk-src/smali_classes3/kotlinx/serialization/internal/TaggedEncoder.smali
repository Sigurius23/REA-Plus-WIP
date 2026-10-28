.class public abstract Lkotlinx/serialization/internal/TaggedEncoder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzc3/e;
.implements Lzc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Tag:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lzc3/e;",
        "Lzc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008<\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\'\u0018\u0000*\n\u0008\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H$\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0016H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0019H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u001cH\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u001fH\u0014\u00a2\u0006\u0004\u0008 \u0010!J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\"H\u0014\u00a2\u0006\u0004\u0008#\u0010$J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020%H\u0014\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020(H\u0014\u00a2\u0006\u0004\u0008)\u0010*J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020+H\u0014\u00a2\u0006\u0004\u0008,\u0010-J\'\u00100\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u00080\u00101J\u001f\u00103\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u00102\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u00083\u00104J\u0017\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u00086\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u00088\u0010\u0006J\u000f\u00109\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u00089\u0010\u0006J\u0015\u0010:\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020%\u00a2\u0006\u0004\u0008:\u0010;J\u0015\u0010<\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0016\u00a2\u0006\u0004\u0008<\u0010=J\u0015\u0010>\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0019\u00a2\u0006\u0004\u0008>\u0010?J\u0015\u0010@\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008@\u0010AJ\u0015\u0010B\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001c\u00a2\u0006\u0004\u0008B\u0010CJ\u0015\u0010D\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001f\u00a2\u0006\u0004\u0008D\u0010EJ\u0015\u0010F\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\"\u00a2\u0006\u0004\u0008F\u0010GJ\u0015\u0010H\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(\u00a2\u0006\u0004\u0008H\u0010IJ\u0015\u0010J\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020+\u00a2\u0006\u0004\u0008J\u0010KJ\u001d\u0010L\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008L\u0010MJ\u0017\u0010N\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008N\u0010OJ\u0015\u0010P\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0007\u00a2\u0006\u0004\u0008P\u0010QJ\u0017\u0010R\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008R\u0010QJ%\u0010S\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020%\u00a2\u0006\u0004\u0008S\u0010TJ%\u0010U\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u0016\u00a2\u0006\u0004\u0008U\u0010VJ%\u0010W\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u0019\u00a2\u0006\u0004\u0008W\u0010XJ%\u0010Y\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008Y\u0010ZJ%\u0010[\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u001c\u00a2\u0006\u0004\u0008[\u0010\\J%\u0010]\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u001f\u00a2\u0006\u0004\u0008]\u0010^J%\u0010_\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\"\u00a2\u0006\u0004\u0008_\u0010`J%\u0010a\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020(\u00a2\u0006\u0004\u0008a\u0010bJ%\u0010c\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020+\u00a2\u0006\u0004\u0008c\u0010dJ\u001d\u0010e\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008e\u0010fJA\u0010j\u001a\u00020\u000e\"\n\u0008\u0001\u0010g*\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010i\u001a\u0008\u0012\u0004\u0012\u00028\u00010h2\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008j\u0010kJA\u0010l\u001a\u00020\u000e\"\u0008\u0008\u0001\u0010g*\u00020\u00012\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010i\u001a\u0008\u0012\u0004\u0012\u00028\u00010h2\u0008\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0016\u00a2\u0006\u0004\u0008l\u0010kJ\u0017\u0010n\u001a\u00020\u000e2\u0006\u0010m\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\u0008n\u0010\u0012J\u000f\u0010o\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\u0008o\u0010pJ\u001f\u0010r\u001a\u00020%2\u0006\u0010q\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008r\u0010sR$\u0010v\u001a\u0012\u0012\u0004\u0012\u00028\u00000tj\u0008\u0012\u0004\u0012\u00028\u0000`u8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008v\u0010wR\u0014\u0010{\u001a\u00020x8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008y\u0010zR\u0014\u0010}\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008|\u0010pR\u0016\u0010\u007f\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008~\u0010p\u00a8\u0006\u0080\u0001"
    }
    d2 = {
        "Lkotlinx/serialization/internal/TaggedEncoder;",
        "",
        "Tag",
        "Lzc3/e;",
        "Lzc3/c;",
        "<init>",
        "()V",
        "Lyc3/g;",
        "",
        "index",
        "getTag",
        "(Lyc3/g;I)Ljava/lang/Object;",
        "tag",
        "value",
        "Ll83/a0;",
        "encodeTaggedValue",
        "(Ljava/lang/Object;Ljava/lang/Object;)V",
        "encodeTaggedNonNullMark",
        "(Ljava/lang/Object;)V",
        "encodeTaggedNull",
        "encodeTaggedInt",
        "(Ljava/lang/Object;I)V",
        "",
        "encodeTaggedByte",
        "(Ljava/lang/Object;B)V",
        "",
        "encodeTaggedShort",
        "(Ljava/lang/Object;S)V",
        "",
        "encodeTaggedLong",
        "(Ljava/lang/Object;J)V",
        "",
        "encodeTaggedFloat",
        "(Ljava/lang/Object;F)V",
        "",
        "encodeTaggedDouble",
        "(Ljava/lang/Object;D)V",
        "",
        "encodeTaggedBoolean",
        "(Ljava/lang/Object;Z)V",
        "",
        "encodeTaggedChar",
        "(Ljava/lang/Object;C)V",
        "",
        "encodeTaggedString",
        "(Ljava/lang/Object;Ljava/lang/String;)V",
        "enumDescriptor",
        "ordinal",
        "encodeTaggedEnum",
        "(Ljava/lang/Object;Lyc3/g;I)V",
        "inlineDescriptor",
        "encodeTaggedInline",
        "(Ljava/lang/Object;Lyc3/g;)Lzc3/e;",
        "descriptor",
        "encodeInline",
        "(Lyc3/g;)Lzc3/e;",
        "encodeNotNullMark",
        "encodeNull",
        "encodeBoolean",
        "(Z)V",
        "encodeByte",
        "(B)V",
        "encodeShort",
        "(S)V",
        "encodeInt",
        "(I)V",
        "encodeLong",
        "(J)V",
        "encodeFloat",
        "(F)V",
        "encodeDouble",
        "(D)V",
        "encodeChar",
        "(C)V",
        "encodeString",
        "(Ljava/lang/String;)V",
        "encodeEnum",
        "(Lyc3/g;I)V",
        "beginStructure",
        "(Lyc3/g;)Lzc3/c;",
        "endStructure",
        "(Lyc3/g;)V",
        "endEncode",
        "encodeBooleanElement",
        "(Lyc3/g;IZ)V",
        "encodeByteElement",
        "(Lyc3/g;IB)V",
        "encodeShortElement",
        "(Lyc3/g;IS)V",
        "encodeIntElement",
        "(Lyc3/g;II)V",
        "encodeLongElement",
        "(Lyc3/g;IJ)V",
        "encodeFloatElement",
        "(Lyc3/g;IF)V",
        "encodeDoubleElement",
        "(Lyc3/g;ID)V",
        "encodeCharElement",
        "(Lyc3/g;IC)V",
        "encodeStringElement",
        "(Lyc3/g;ILjava/lang/String;)V",
        "encodeInlineElement",
        "(Lyc3/g;I)Lzc3/e;",
        "T",
        "Lwc3/j;",
        "serializer",
        "encodeSerializableElement",
        "(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V",
        "encodeNullableSerializableElement",
        "name",
        "pushTag",
        "popTag",
        "()Ljava/lang/Object;",
        "desc",
        "encodeElement",
        "(Lyc3/g;I)Z",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "tagStack",
        "Ljava/util/ArrayList;",
        "Lcd3/f;",
        "getSerializersModule",
        "()Lcd3/f;",
        "serializersModule",
        "getCurrentTag",
        "currentTag",
        "getCurrentTagOrNull",
        "currentTagOrNull",
        "kotlinx-serialization-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final tagStack:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "TTag;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkotlinx/serialization/internal/TaggedEncoder;->tagStack:Ljava/util/ArrayList;

    return-void
.end method

.method private final encodeElement(Lyc3/g;I)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->pushTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public beginCollection(Lyc3/g;I)Lzc3/c;
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    return-object p1
.end method

.method public beginStructure(Lyc3/g;)Lzc3/c;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final encodeBoolean(Z)V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedBoolean(Ljava/lang/Object;Z)V

    return-void
.end method

.method public final encodeBooleanElement(Lyc3/g;IZ)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedBoolean(Ljava/lang/Object;Z)V

    return-void
.end method

.method public final encodeByte(B)V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedByte(Ljava/lang/Object;B)V

    return-void
.end method

.method public final encodeByteElement(Lyc3/g;IB)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedByte(Ljava/lang/Object;B)V

    return-void
.end method

.method public final encodeChar(C)V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedChar(Ljava/lang/Object;C)V

    return-void
.end method

.method public final encodeCharElement(Lyc3/g;IC)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedChar(Ljava/lang/Object;C)V

    return-void
.end method

.method public final encodeDouble(D)V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedDouble(Ljava/lang/Object;D)V

    return-void
.end method

.method public final encodeDoubleElement(Lyc3/g;ID)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3, p4}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedDouble(Ljava/lang/Object;D)V

    return-void
.end method

.method public final encodeEnum(Lyc3/g;I)V
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedEnum(Ljava/lang/Object;Lyc3/g;I)V

    return-void
.end method

.method public final encodeFloat(F)V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedFloat(Ljava/lang/Object;F)V

    return-void
.end method

.method public final encodeFloatElement(Lyc3/g;IF)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedFloat(Ljava/lang/Object;F)V

    return-void
.end method

.method public encodeInline(Lyc3/g;)Lzc3/e;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedInline(Ljava/lang/Object;Lyc3/g;)Lzc3/e;

    move-result-object p1

    return-object p1
.end method

.method public final encodeInlineElement(Lyc3/g;I)Lzc3/e;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, p2}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedInline(Ljava/lang/Object;Lyc3/g;)Lzc3/e;

    move-result-object p1

    return-object p1
.end method

.method public final encodeInt(I)V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedInt(Ljava/lang/Object;I)V

    return-void
.end method

.method public final encodeIntElement(Lyc3/g;II)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedInt(Ljava/lang/Object;I)V

    return-void
.end method

.method public final encodeLong(J)V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedLong(Ljava/lang/Object;J)V

    return-void
.end method

.method public final encodeLongElement(Lyc3/g;IJ)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3, p4}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedLong(Ljava/lang/Object;J)V

    return-void
.end method

.method public encodeNotNullMark()V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->getCurrentTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedNonNullMark(Ljava/lang/Object;)V

    return-void
.end method

.method public encodeNull()V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedNull(Ljava/lang/Object;)V

    return-void
.end method

.method public encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyc3/g;",
            "I",
            "Lwc3/j;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeNullableSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public encodeNullableSerializableValue(Lwc3/j;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwc3/j;",
            "TT;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lzc3/e;->encodeNullableSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyc3/g;",
            "I",
            "Lwc3/j;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwc3/j;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeShort(S)V
    .locals 1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedShort(Ljava/lang/Object;S)V

    return-void
.end method

.method public final encodeShortElement(Lyc3/g;IS)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedShort(Ljava/lang/Object;S)V

    return-void
.end method

.method public final encodeString(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedString(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final encodeStringElement(Lyc3/g;ILjava/lang/String;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->getTag(Lyc3/g;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedString(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public encodeTaggedBoolean(Ljava/lang/Object;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;Z)V"
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedByte(Ljava/lang/Object;B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;B)V"
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedChar(Ljava/lang/Object;C)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;C)V"
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedDouble(Ljava/lang/Object;D)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;D)V"
        }
    .end annotation

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedEnum(Ljava/lang/Object;Lyc3/g;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;",
            "Lyc3/g;",
            "I)V"
        }
    .end annotation

    const-string v0, "enumDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedFloat(Ljava/lang/Object;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;F)V"
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedInline(Ljava/lang/Object;Lyc3/g;)Lzc3/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;",
            "Lyc3/g;",
            ")",
            "Lzc3/e;"
        }
    .end annotation

    const-string v0, "inlineDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->pushTag(Ljava/lang/Object;)V

    return-object p0
.end method

.method public encodeTaggedInt(Ljava/lang/Object;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;I)V"
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedLong(Ljava/lang/Object;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;J)V"
        }
    .end annotation

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedNonNullMark(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;)V"
        }
    .end annotation

    return-void
.end method

.method public encodeTaggedNull(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;)V"
        }
    .end annotation

    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "null is not supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public encodeTaggedShort(Ljava/lang/Object;S)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;S)V"
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedString(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Non-serializable "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is not supported by "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v1, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " encoder"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public endEncode(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final endStructure(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlinx/serialization/internal/TaggedEncoder;->tagStack:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->popTag()Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->endEncode(Lyc3/g;)V

    return-void
.end method

.method public final getCurrentTag()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTag;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/TaggedEncoder;->tagStack:Ljava/util/ArrayList;

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getCurrentTagOrNull()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTag;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/TaggedEncoder;->tagStack:Ljava/util/ArrayList;

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getSerializersModule()Lcd3/f;
    .locals 1

    sget-object v0, Lcd3/i;->a:Lcd3/d;

    return-object v0
.end method

.method public abstract getTag(Lyc3/g;I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyc3/g;",
            "I)TTag;"
        }
    .end annotation
.end method

.method public final popTag()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTag;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/TaggedEncoder;->tagStack:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkotlinx/serialization/internal/TaggedEncoder;->tagStack:Ljava/util/ArrayList;

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v1, "No tag in stack for requested element"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final pushTag(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTag;)V"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/TaggedEncoder;->tagStack:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public shouldEncodeElementDefault(Lyc3/g;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
