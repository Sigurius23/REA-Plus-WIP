.class public final Lkotlinx/serialization/internal/IntArraySerializer;
.super Lkotlinx/serialization/internal/PrimitiveArraySerializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/serialization/internal/PrimitiveArraySerializer<",
        "Ljava/lang/Integer;",
        "[I",
        "Lkotlinx/serialization/internal/IntArrayBuilder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\u0008\u001a\u00020\u0004*\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkotlinx/serialization/internal/IntArraySerializer;",
        "Lwc3/c;",
        "",
        "Lkotlinx/serialization/internal/PrimitiveArraySerializer;",
        "",
        "Lkotlinx/serialization/internal/IntArrayBuilder;",
        "<init>",
        "()V",
        "collectionSize",
        "([I)I",
        "toBuilder",
        "([I)Lkotlinx/serialization/internal/IntArrayBuilder;",
        "empty",
        "()[I",
        "Lzc3/b;",
        "decoder",
        "index",
        "builder",
        "",
        "checkIndex",
        "Ll83/a0;",
        "readElement",
        "(Lzc3/b;ILkotlinx/serialization/internal/IntArrayBuilder;Z)V",
        "Lzc3/c;",
        "encoder",
        "content",
        "size",
        "writeContent",
        "(Lzc3/c;[II)V",
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
.field public static final INSTANCE:Lkotlinx/serialization/internal/IntArraySerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/serialization/internal/IntArraySerializer;

    invoke-direct {v0}, Lkotlinx/serialization/internal/IntArraySerializer;-><init>()V

    sput-object v0, Lkotlinx/serialization/internal/IntArraySerializer;->INSTANCE:Lkotlinx/serialization/internal/IntArraySerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-direct {p0, v0}, Lkotlinx/serialization/internal/PrimitiveArraySerializer;-><init>(Lwc3/c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic collectionSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, [I

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/IntArraySerializer;->collectionSize([I)I

    move-result p1

    return p1
.end method

.method public collectionSize([I)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    array-length p1, p1

    return p1
.end method

.method public bridge synthetic empty()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlinx/serialization/internal/IntArraySerializer;->empty()[I

    move-result-object v0

    return-object v0
.end method

.method public empty()[I
    .locals 1

    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    return-object v0
.end method

.method public bridge synthetic readElement(Lzc3/b;ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    check-cast p3, Lkotlinx/serialization/internal/IntArrayBuilder;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkotlinx/serialization/internal/IntArraySerializer;->readElement(Lzc3/b;ILkotlinx/serialization/internal/IntArrayBuilder;Z)V

    return-void
.end method

.method public readElement(Lzc3/b;ILkotlinx/serialization/internal/IntArrayBuilder;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lkotlinx/serialization/internal/PrimitiveArraySerializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-interface {p1, p4, p2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result p1

    invoke-virtual {p3, p1}, Lkotlinx/serialization/internal/IntArrayBuilder;->append$kotlinx_serialization_core(I)V

    return-void
.end method

.method public bridge synthetic readElement(Lzc3/b;ILkotlinx/serialization/internal/PrimitiveArrayBuilder;Z)V
    .locals 0

    .line 2
    check-cast p3, Lkotlinx/serialization/internal/IntArrayBuilder;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkotlinx/serialization/internal/IntArraySerializer;->readElement(Lzc3/b;ILkotlinx/serialization/internal/IntArrayBuilder;Z)V

    return-void
.end method

.method public bridge synthetic toBuilder(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [I

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/IntArraySerializer;->toBuilder([I)Lkotlinx/serialization/internal/IntArrayBuilder;

    move-result-object p1

    return-object p1
.end method

.method public toBuilder([I)Lkotlinx/serialization/internal/IntArrayBuilder;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lkotlinx/serialization/internal/IntArrayBuilder;

    invoke-direct {v0, p1}, Lkotlinx/serialization/internal/IntArrayBuilder;-><init>([I)V

    return-object v0
.end method

.method public bridge synthetic writeContent(Lzc3/c;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, [I

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/serialization/internal/IntArraySerializer;->writeContent(Lzc3/c;[II)V

    return-void
.end method

.method public writeContent(Lzc3/c;[II)V
    .locals 3

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    .line 2
    invoke-virtual {p0}, Lkotlinx/serialization/internal/PrimitiveArraySerializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    aget v2, p2, v0

    invoke-interface {p1, v1, v0, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
