.class public Led3/n;
.super Landroidx/glance/appwidget/protobuf/l;
.source "SourceFile"

# interfaces
.implements Lzc3/e;
.implements Lzc3/c;


# instance fields
.field public c:Led3/p;

.field public final d:Ldd3/a;

.field public final e:Le10/k0;

.field public final f:Lyc3/g;


# direct methods
.method public constructor <init>(Ldd3/a;Le10/k0;Lyc3/g;)V
    .locals 1

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Landroidx/glance/appwidget/protobuf/l;-><init>(I)V

    sget-object v0, Led3/p;->E:Led3/p;

    iput-object v0, p0, Led3/n;->c:Led3/p;

    iput-object p1, p0, Led3/n;->d:Ldd3/a;

    iput-object p2, p0, Led3/n;->e:Le10/k0;

    iput-object p3, p0, Led3/n;->f:Lyc3/g;

    return-void
.end method


# virtual methods
.method public final K(JD)V
    .locals 4

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p1, v0

    iget-object v1, p0, Led3/n;->e:Le10/k0;

    if-nez v0, :cond_0

    iget-object p1, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Led3/b;

    invoke-static {p3, p4}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Led3/b;->d(J)V

    return-void

    :cond_0
    const-wide/32 v2, 0x7fffffff

    and-long/2addr p1, v2

    long-to-int p1, p1

    iget-object p2, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p2, Led3/b;

    sget-object v0, Led3/l;->F:Led3/l;

    invoke-virtual {v0, p1}, Led3/l;->a(I)I

    move-result p1

    invoke-static {v1, p2, p1}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    iget-object p1, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Led3/b;

    invoke-static {p3, p4}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Led3/b;->d(J)V

    return-void
.end method

.method public final L(FJ)V
    .locals 4

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p2, v0

    iget-object v1, p0, Led3/n;->e:Le10/k0;

    if-nez v0, :cond_0

    iget-object p2, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p2, Led3/b;

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result p1

    invoke-virtual {p2, p1}, Led3/b;->c(I)V

    return-void

    :cond_0
    const-wide/32 v2, 0x7fffffff

    and-long/2addr p2, v2

    long-to-int p2, p2

    iget-object p3, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p3, Led3/b;

    sget-object v0, Led3/l;->H:Led3/l;

    invoke-virtual {v0, p2}, Led3/l;->a(I)I

    move-result p2

    invoke-static {v1, p3, p2}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    iget-object p2, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p2, Led3/b;

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result p1

    invoke-virtual {p2, p1}, Led3/b;->c(I)V

    return-void
.end method

.method public final M(IJ)V
    .locals 4

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p2, v0

    iget-object v1, p0, Led3/n;->e:Le10/k0;

    if-nez v0, :cond_0

    iget-object p2, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p2, Led3/b;

    invoke-static {v1, p2, p1}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    return-void

    :cond_0
    const-wide/32 v2, 0x7fffffff

    and-long/2addr v2, p2

    long-to-int v0, v2

    invoke-static {p2, p3}, Luf/c0;->S(J)Ldd3/b;

    move-result-object p2

    invoke-virtual {v1, p1, v0, p2}, Le10/k0;->Q(IILdd3/b;)V

    return-void
.end method

.method public final N(JJ)V
    .locals 4

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p1, v0

    iget-object v1, p0, Led3/n;->e:Le10/k0;

    if-nez v0, :cond_0

    iget-object p1, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Led3/b;

    sget-object p2, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {v1, p1, p3, p4, p2}, Le10/k0;->p(Led3/b;JLdd3/b;)V

    return-void

    :cond_0
    const-wide/32 v2, 0x7fffffff

    and-long/2addr v2, p1

    long-to-int v0, v2

    invoke-static {p1, p2}, Luf/c0;->S(J)Ldd3/b;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p2, Led3/b;

    sget-object v2, Ldd3/b;->z:Ldd3/b;

    if-ne p1, v2, :cond_1

    sget-object v2, Led3/l;->F:Led3/l;

    goto :goto_0

    :cond_1
    sget-object v2, Led3/l;->E:Led3/l;

    :goto_0
    invoke-virtual {v2, v0}, Led3/l;->a(I)I

    move-result v0

    invoke-static {v1, p2, v0}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    invoke-virtual {v1, p2, p3, p4, p1}, Le10/k0;->p(Led3/b;JLdd3/b;)V

    return-void
.end method

.method public O(JLjava/lang/String;)V
    .locals 4

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p1, v0

    iget-object v1, p0, Led3/n;->e:Le10/k0;

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Le10/k0;->P([B)V

    return-void

    :cond_0
    const-wide/32 v2, 0x7fffffff

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p2

    iget-object p3, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p3, Led3/b;

    sget-object v0, Led3/l;->G:Led3/l;

    invoke-virtual {v0, p1}, Led3/l;->a(I)I

    move-result p1

    invoke-static {v1, p3, p1}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    invoke-virtual {v1, p2}, Le10/k0;->P([B)V

    return-void
.end method

.method public P(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public Q(Lyc3/g;I)J
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Luf/c0;->K(Lyc3/g;I)J

    move-result-wide p1

    return-wide p1
.end method

.method public beginCollection(Lyc3/g;I)Lzc3/c;
    .locals 12

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v1, Lyc3/l;->b:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v4

    const-wide v2, 0x100000000L

    and-long/2addr v2, v4

    const-wide/16 v6, 0x0

    cmp-long v0, v2, v6

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v0

    invoke-static {v0}, Luf/c0;->a0(Lyc3/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v6, Led3/k;

    iget-object v10, p0, Led3/n;->e:Le10/k0;

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v7

    iget-object v9, p0, Led3/n;->d:Ldd3/a;

    move-object v11, p1

    invoke-direct/range {v6 .. v11}, Led3/k;-><init>(JLdd3/a;Le10/k0;Lyc3/g;)V

    return-object v6

    :cond_0
    move-object v8, p1

    const-wide/16 v2, 0x4c2c

    cmp-long p1, v4, v2

    if-nez p1, :cond_1

    iget-object v0, p0, Led3/n;->e:Le10/k0;

    iget-object v2, v0, Le10/k0;->x:Ljava/lang/Object;

    check-cast v2, Led3/b;

    invoke-static {v0, v2, p2}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    :cond_1
    iget-object p2, p0, Led3/n;->f:Lyc3/g;

    invoke-interface {p2}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {p2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    new-instance v3, Led3/e;

    new-instance v9, Led3/b;

    invoke-direct {v9}, Led3/b;-><init>()V

    move-wide v6, v4

    iget-object v4, p0, Led3/n;->d:Ldd3/a;

    iget-object v5, p0, Led3/n;->e:Le10/k0;

    invoke-direct/range {v3 .. v9}, Led3/e;-><init>(Ldd3/a;Le10/k0;JLyc3/g;Led3/b;)V

    return-object v3

    :cond_2
    move-wide v6, v4

    new-instance v3, Led3/r;

    move-wide v4, v6

    iget-object v6, p0, Led3/n;->d:Ldd3/a;

    iget-object v7, p0, Led3/n;->e:Le10/k0;

    invoke-direct/range {v3 .. v8}, Led3/r;-><init>(JLdd3/a;Le10/k0;Lyc3/g;)V

    return-object v3

    :cond_3
    move-object v8, p1

    sget-object p1, Lyc3/l;->c:Lyc3/l;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance v0, Led3/d;

    iget-object p1, p0, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    check-cast p1, [J

    iget p2, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    aget-wide v1, p1, p2

    iget-object v4, p0, Led3/n;->e:Le10/k0;

    iget-object v3, p0, Led3/n;->d:Ldd3/a;

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Led3/d;-><init>(JLdd3/a;Le10/k0;Lyc3/g;)V

    return-object v0

    :cond_4
    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "This serial kind is not supported as collection: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public beginStructure(Lyc3/g;)Lzc3/c;
    .locals 8

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v1, Lyc3/l;->b:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v0

    invoke-static {v0}, Luf/c0;->a0(Lyc3/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v0

    const-wide v2, 0x100000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v1, Led3/k;

    iget-object v5, p0, Led3/n;->e:Le10/k0;

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v2

    iget-object v4, p0, Led3/n;->d:Ldd3/a;

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Led3/k;-><init>(JLdd3/a;Le10/k0;Lyc3/g;)V

    return-object v1

    :cond_0
    move-object v7, p1

    new-instance v2, Led3/r;

    iget-object v6, p0, Led3/n;->e:Le10/k0;

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v3

    iget-object v5, p0, Led3/n;->d:Ldd3/a;

    invoke-direct/range {v2 .. v7}, Led3/r;-><init>(JLdd3/a;Le10/k0;Lyc3/g;)V

    return-object v2

    :cond_1
    move-object v7, p1

    sget-object p1, Lyc3/l;->a:Lyc3/l;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Lyc3/l;->d:Lyc3/l;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    instance-of p1, v0, Lyc3/d;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lyc3/l;->c:Lyc3/l;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance v2, Led3/d;

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v3

    iget-object v6, p0, Led3/n;->e:Le10/k0;

    iget-object v5, p0, Led3/n;->d:Ldd3/a;

    invoke-direct/range {v2 .. v7}, Led3/d;-><init>(JLdd3/a;Le10/k0;Lyc3/g;)V

    return-object v2

    :cond_3
    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "This serial kind is not supported as structure: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x4c2c

    cmp-long p1, v0, v2

    if-nez p1, :cond_5

    iget-object p1, p0, Led3/n;->f:Lyc3/g;

    invoke-virtual {v7, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    return-object p0

    :cond_5
    invoke-static {v0, v1}, Luf/c0;->Z(J)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Led3/h;

    iget-object v0, p0, Led3/n;->d:Ldd3/a;

    iget-object v1, p0, Led3/n;->e:Le10/k0;

    invoke-direct {p1, v0, v1, v7}, Led3/h;-><init>(Ldd3/a;Le10/k0;Lyc3/g;)V

    return-object p1

    :cond_6
    new-instance v2, Led3/e;

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v3

    iget-object v6, p0, Led3/n;->e:Le10/k0;

    iget-object v5, p0, Led3/n;->d:Ldd3/a;

    invoke-direct/range {v2 .. v7}, Led3/e;-><init>(JLdd3/a;Le10/k0;Lyc3/g;)V

    return-object v2
.end method

.method public final encodeBoolean(Z)V
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeBooleanElement(Lyc3/g;IZ)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p3, p1, p2}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeByte(B)V
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeByteElement(Lyc3/g;IB)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p3, p1, p2}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeChar(C)V
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeCharElement(Lyc3/g;IC)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p3, p1, p2}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeDouble(D)V
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p1, p2}, Led3/n;->K(JD)V

    return-void
.end method

.method public final encodeDoubleElement(Lyc3/g;ID)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3, p4}, Led3/n;->K(JD)V

    return-void
.end method

.method public final encodeEnum(Lyc3/g;I)V
    .locals 5

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-static {p1, p2, v2}, Luf/c0;->L(Lyc3/g;IZ)I

    move-result p1

    const-wide/16 v2, 0x4c2c

    cmp-long p2, v0, v2

    iget-object v2, p0, Led3/n;->e:Le10/k0;

    if-nez p2, :cond_0

    iget-object p2, v2, Le10/k0;->x:Ljava/lang/Object;

    check-cast p2, Led3/b;

    invoke-static {v2, p2, p1}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    return-void

    :cond_0
    const-wide/32 v3, 0x7fffffff

    and-long/2addr v0, v3

    long-to-int p2, v0

    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {v2, p1, p2, v0}, Le10/k0;->Q(IILdd3/b;)V

    return-void
.end method

.method public final encodeFloat(F)V
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Led3/n;->L(FJ)V

    return-void
.end method

.method public final encodeFloatElement(Lyc3/g;IF)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p3, p1, p2}, Led3/n;->L(FJ)V

    return-void
.end method

.method public encodeInline(Lyc3/g;)Lzc3/e;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->n()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/glance/appwidget/protobuf/l;->r(J)V

    return-object p0
.end method

.method public final encodeInlineElement(Lyc3/g;I)Lzc3/e;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide v0

    invoke-interface {p1, p2}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    const-string p2, "inlineDescriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroidx/glance/appwidget/protobuf/l;->r(J)V

    return-object p0
.end method

.method public final encodeInt(I)V
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeIntElement(Lyc3/g;II)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p3, p1, p2}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeLong(J)V
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p1, p2}, Led3/n;->N(JJ)V

    return-void
.end method

.method public final encodeLongElement(Lyc3/g;IJ)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3, p4}, Led3/n;->N(JJ)V

    return-void
.end method

.method public final encodeNotNullMark()V
    .locals 0

    return-void
.end method

.method public final encodeNull()V
    .locals 2

    iget-object v0, p0, Led3/n;->c:Led3/p;

    sget-object v1, Led3/p;->w:Led3/p;

    if-eq v0, v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const-string v0, "\'null\' is not supported in ProtoBuf"

    goto :goto_0

    :cond_0
    const-string v0, "\'null\' is not allowed for not-null properties"

    goto :goto_0

    :cond_1
    const-string v0, "\'null\' is not supported as the value of a list element in ProtoBuf"

    goto :goto_0

    :cond_2
    const-string v0, "\'null\' is not supported as the value of collection types in ProtoBuf"

    goto :goto_0

    :cond_3
    const-string v0, "\'null\' is not supported for optional properties in ProtoBuf"

    :goto_0
    new-instance v1, Lkotlinx/serialization/SerializationException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    return-void
.end method

.method public final encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lyc3/g;->isElementOptional(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Led3/p;->x:Led3/p;

    goto :goto_1

    :cond_0
    invoke-interface {p1, p2}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v1, Lyc3/l;->c:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lyc3/l;->b:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Led3/p;->z:Led3/p;

    goto :goto_1

    :cond_2
    sget-object v0, Led3/p;->w:Led3/p;

    goto :goto_1

    :cond_3
    :goto_0
    sget-object v0, Led3/p;->y:Led3/p;

    :goto_1
    iput-object v0, p0, Led3/n;->c:Led3/p;

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/glance/appwidget/protobuf/l;->r(J)V

    invoke-super {p0, p3, p4}, Lzc3/e;->encodeNullableSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lyc3/g;->isElementOptional(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Led3/p;->x:Led3/p;

    goto :goto_1

    :cond_0
    invoke-interface {p1, p2}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->isNullable()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v0, Led3/p;->E:Led3/p;

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v1, Lyc3/l;->c:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lyc3/l;->b:Lyc3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Led3/p;->z:Led3/p;

    goto :goto_1

    :cond_3
    sget-object v0, Led3/p;->w:Led3/p;

    goto :goto_1

    :cond_4
    :goto_0
    sget-object v0, Led3/p;->y:Led3/p;

    :goto_1
    iput-object v0, p0, Led3/n;->c:Led3/p;

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/glance/appwidget/protobuf/l;->r(J)V

    invoke-virtual {p0, p3, p4}, Led3/n;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V
    .locals 5

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkotlinx/serialization/internal/MapLikeSerializer;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/serialization/internal/MapLikeSerializer;

    invoke-virtual {p1}, Lkotlinx/serialization/internal/MapLikeSerializer;->getKeySerializer()Lwc3/c;

    move-result-object v0

    invoke-virtual {p1}, Lkotlinx/serialization/internal/MapLikeSerializer;->getValueSerializer()Lwc3/c;

    move-result-object p1

    invoke-static {v0, p1}, Lxc3/a;->b(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/MapEntrySerializer;

    move-result-object p1

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashSetSerializer;

    invoke-direct {v0, p1}, Lkotlinx/serialization/internal/LinkedHashSetSerializer;-><init>(Lwc3/c;)V

    const-string p1, "null cannot be cast to non-null type kotlin.collections.Map<*, *>"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/ByteArraySerializer;->INSTANCE:Lkotlinx/serialization/internal/ByteArraySerializer;

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "null cannot be cast to non-null type kotlin.ByteArray"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, [B

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    const-wide/16 v2, 0x4c2c

    cmp-long p1, v0, v2

    iget-object v2, p0, Led3/n;->e:Le10/k0;

    if-nez p1, :cond_1

    invoke-virtual {v2, p2}, Le10/k0;->P([B)V

    return-void

    :cond_1
    const-wide/32 v3, 0x7fffffff

    and-long/2addr v0, v3

    long-to-int p1, v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Led3/b;

    sget-object v1, Led3/l;->G:Led3/l;

    invoke-virtual {v1, p1}, Led3/l;->a(I)I

    move-result p1

    invoke-static {v2, v0, p1}, Le10/k0;->o(Le10/k0;Led3/b;I)V

    invoke-virtual {v2, p2}, Le10/k0;->P([B)V

    return-void

    :cond_2
    invoke-interface {p1, p0, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeShort(S)V
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeShortElement(Lyc3/g;IS)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p3, p1, p2}, Led3/n;->M(IJ)V

    return-void
.end method

.method public final encodeString(Ljava/lang/String;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p1}, Led3/n;->O(JLjava/lang/String;)V

    return-void
.end method

.method public final encodeStringElement(Lyc3/g;ILjava/lang/String;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/n;->Q(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Led3/n;->O(JLjava/lang/String;)V

    return-void
.end method

.method public final endStructure(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->n()J

    :cond_0
    invoke-virtual {p0, p1}, Led3/n;->P(Lyc3/g;)V

    return-void
.end method

.method public final getSerializersModule()Lcd3/f;
    .locals 1

    iget-object v0, p0, Led3/n;->d:Ldd3/a;

    iget-object v0, v0, Ldd3/a;->a:Lcd3/f;

    return-object v0
.end method

.method public final shouldEncodeElementDefault(Lyc3/g;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Led3/n;->d:Ldd3/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method
