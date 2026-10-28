.class public final Lkotlinx/serialization/internal/UByteArraySerializer;
.super Lkotlinx/serialization/internal/PrimitiveArraySerializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/serialization/internal/PrimitiveArraySerializer<",
        "Ll83/r;",
        "Ll83/s;",
        "Lkotlinx/serialization/internal/UByteArrayBuilder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\u0008*\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\'\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lkotlinx/serialization/internal/UByteArraySerializer;",
        "Lwc3/c;",
        "Ll83/s;",
        "Lkotlinx/serialization/internal/PrimitiveArraySerializer;",
        "Ll83/r;",
        "Lkotlinx/serialization/internal/UByteArrayBuilder;",
        "<init>",
        "()V",
        "",
        "collectionSize-GBYM_sE",
        "([B)I",
        "collectionSize",
        "toBuilder-GBYM_sE",
        "([B)Lkotlinx/serialization/internal/UByteArrayBuilder;",
        "toBuilder",
        "empty-TcUX1vc",
        "()[B",
        "empty",
        "Lzc3/b;",
        "decoder",
        "index",
        "builder",
        "",
        "checkIndex",
        "Ll83/a0;",
        "readElement",
        "(Lzc3/b;ILkotlinx/serialization/internal/UByteArrayBuilder;Z)V",
        "Lzc3/c;",
        "encoder",
        "content",
        "size",
        "writeContent-Coi6ktg",
        "(Lzc3/c;[BI)V",
        "writeContent",
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


# static fields
.field public static final INSTANCE:Lkotlinx/serialization/internal/UByteArraySerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/serialization/internal/UByteArraySerializer;

    invoke-direct {v0}, Lkotlinx/serialization/internal/UByteArraySerializer;-><init>()V

    sput-object v0, Lkotlinx/serialization/internal/UByteArraySerializer;->INSTANCE:Lkotlinx/serialization/internal/UByteArraySerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, Lkotlinx/serialization/internal/UByteSerializer;->INSTANCE:Lkotlinx/serialization/internal/UByteSerializer;

    invoke-direct {p0, v0}, Lkotlinx/serialization/internal/PrimitiveArraySerializer;-><init>(Lwc3/c;)V

    return-void
.end method


# virtual methods
.method public synthetic collectionSize(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ll83/s;

    iget-object p1, p1, Ll83/s;->w:[B

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/UByteArraySerializer;->collectionSize-GBYM_sE([B)I

    move-result p1

    return p1
.end method

.method public collectionSize-GBYM_sE([B)I
    .locals 1

    const-string v0, "$this$collectionSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    return p1
.end method

.method public synthetic empty()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lkotlinx/serialization/internal/UByteArraySerializer;->empty-TcUX1vc()[B

    move-result-object v0

    new-instance v1, Ll83/s;

    invoke-direct {v1, v0}, Ll83/s;-><init>([B)V

    return-object v1
.end method

.method public empty-TcUX1vc()[B
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public bridge synthetic readElement(Lzc3/b;ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    check-cast p3, Lkotlinx/serialization/internal/UByteArrayBuilder;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkotlinx/serialization/internal/UByteArraySerializer;->readElement(Lzc3/b;ILkotlinx/serialization/internal/UByteArrayBuilder;Z)V

    return-void
.end method

.method public bridge synthetic readElement(Lzc3/b;ILkotlinx/serialization/internal/PrimitiveArrayBuilder;Z)V
    .locals 0

    .line 2
    check-cast p3, Lkotlinx/serialization/internal/UByteArrayBuilder;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkotlinx/serialization/internal/UByteArraySerializer;->readElement(Lzc3/b;ILkotlinx/serialization/internal/UByteArrayBuilder;Z)V

    return-void
.end method

.method public readElement(Lzc3/b;ILkotlinx/serialization/internal/UByteArrayBuilder;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lkotlinx/serialization/internal/PrimitiveArraySerializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-interface {p1, p4, p2}, Lzc3/b;->decodeInlineElement(Lyc3/g;I)Lzc3/d;

    move-result-object p1

    invoke-interface {p1}, Lzc3/d;->decodeByte()B

    move-result p1

    invoke-virtual {p3, p1}, Lkotlinx/serialization/internal/UByteArrayBuilder;->append-7apg3OU$kotlinx_serialization_core(B)V

    return-void
.end method

.method public synthetic toBuilder(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll83/s;

    iget-object p1, p1, Ll83/s;->w:[B

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/UByteArraySerializer;->toBuilder-GBYM_sE([B)Lkotlinx/serialization/internal/UByteArrayBuilder;

    move-result-object p1

    return-object p1
.end method

.method public toBuilder-GBYM_sE([B)Lkotlinx/serialization/internal/UByteArrayBuilder;
    .locals 2

    const-string v0, "$this$toBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/internal/UByteArrayBuilder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lkotlinx/serialization/internal/UByteArrayBuilder;-><init>([BLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public synthetic writeContent(Lzc3/c;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Ll83/s;

    iget-object p2, p2, Ll83/s;->w:[B

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/serialization/internal/UByteArraySerializer;->writeContent-Coi6ktg(Lzc3/c;[BI)V

    return-void
.end method

.method public writeContent-Coi6ktg(Lzc3/c;[BI)V
    .locals 3

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    invoke-virtual {p0}, Lkotlinx/serialization/internal/PrimitiveArraySerializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lzc3/c;->encodeInlineElement(Lyc3/g;I)Lzc3/e;

    move-result-object v1

    aget-byte v2, p2, v0

    invoke-interface {v1, v2}, Lzc3/e;->encodeByte(B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
