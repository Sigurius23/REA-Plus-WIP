.class public final Led3/k;
.super Led3/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(JLdd3/a;Le10/k0;Lyc3/g;)V
    .locals 7

    new-instance v6, Led3/b;

    invoke-direct {v6}, Led3/b;-><init>()V

    const-string v0, "proto"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-wide v3, p1

    move-object v1, p3

    move-object v2, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Led3/e;-><init>(Ldd3/a;Le10/k0;JLyc3/g;Led3/b;)V

    return-void
.end method


# virtual methods
.method public final O(JLjava/lang/String;)V
    .locals 0

    const-string p1, "value"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string p2, "Packing only supports primitive number types"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final P(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Led3/e;->j:Led3/b;

    iget v0, v0, Led3/b;->b:I

    if-lez v0, :cond_0

    invoke-super {p0, p1}, Led3/e;->P(Lyc3/g;)V

    :cond_0
    return-void
.end method

.method public final Q(Lyc3/g;I)J
    .locals 0

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 p1, 0x4c2c

    return-wide p1
.end method

.method public final beginCollection(Lyc3/g;I)Lzc3/c;
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string p2, "Packing only supports primitive number types"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final beginStructure(Lyc3/g;)Lzc3/c;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Packing only supports primitive number types"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
