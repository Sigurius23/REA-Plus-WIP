.class public final Lud3/j0;
.super Lud3/v0;
.source "SourceFile"


# static fields
.field public static final e:Lud3/h0;

.field public static final f:Lud3/h0;

.field public static final g:[B

.field public static final h:[B

.field public static final i:[B


# instance fields
.field public final a:Lne3/l;

.field public final b:Ljava/util/List;

.field public final c:Lud3/h0;

.field public d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lud3/h0;->e:Lyb3/p;

    const-string v0, "multipart/mixed"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    sput-object v0, Lud3/j0;->e:Lud3/h0;

    const-string v0, "multipart/alternative"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    const-string v0, "multipart/digest"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    const-string v0, "multipart/parallel"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    const-string v0, "multipart/form-data"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    sput-object v0, Lud3/j0;->f:Lud3/h0;

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lud3/j0;->g:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_1

    sput-object v1, Lud3/j0;->h:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lud3/j0;->i:[B

    return-void

    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    nop

    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(Lne3/l;Lud3/h0;Ljava/util/List;)V
    .locals 1

    const-string v0, "boundaryByteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/j0;->a:Lne3/l;

    iput-object p3, p0, Lud3/j0;->b:Ljava/util/List;

    sget-object p3, Lud3/h0;->e:Lyb3/p;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; boundary="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lne3/l;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object p1

    iput-object p1, p0, Lud3/j0;->c:Lud3/h0;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lud3/j0;->d:J

    return-void
.end method


# virtual methods
.method public final a(Lne3/i;Z)J
    .locals 16

    move-object/from16 v0, p0

    if-eqz p2, :cond_0

    new-instance v1, Lne3/h;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object v2, v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move-object v2, v1

    move-object/from16 v1, p1

    :goto_0
    iget-object v3, v0, Lud3/j0;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move v8, v5

    :goto_1
    iget-object v9, v0, Lud3/j0;->a:Lne3/l;

    sget-object v10, Lud3/j0;->i:[B

    sget-object v11, Lud3/j0;->h:[B

    if-ge v8, v4, :cond_5

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lud3/i0;

    iget-object v13, v12, Lud3/i0;->a:Lud3/d0;

    iget-object v12, v12, Lud3/i0;->b:Lud3/v0;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1, v10}, Lne3/i;->write([B)Lne3/i;

    invoke-interface {v1, v9}, Lne3/i;->Q(Lne3/l;)Lne3/i;

    invoke-interface {v1, v11}, Lne3/i;->write([B)Lne3/i;

    invoke-virtual {v13}, Lud3/d0;->size()I

    move-result v9

    move v10, v5

    :goto_2
    if-ge v10, v9, :cond_1

    invoke-virtual {v13, v10}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v1, v14}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    move-result-object v14

    sget-object v15, Lud3/j0;->g:[B

    invoke-interface {v14, v15}, Lne3/i;->write([B)Lne3/i;

    move-result-object v14

    invoke-virtual {v13, v10}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    move-result-object v14

    invoke-interface {v14, v11}, Lne3/i;->write([B)Lne3/i;

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v12}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v9

    if-eqz v9, :cond_2

    const-string v10, "Content-Type: "

    invoke-interface {v1, v10}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    move-result-object v10

    iget-object v9, v9, Lud3/h0;->a:Ljava/lang/String;

    invoke-interface {v10, v9}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    move-result-object v9

    invoke-interface {v9, v11}, Lne3/i;->write([B)Lne3/i;

    :cond_2
    invoke-virtual {v12}, Lud3/v0;->contentLength()J

    move-result-wide v9

    const-wide/16 v13, -0x1

    cmp-long v15, v9, v13

    if-nez v15, :cond_3

    if-eqz p2, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lne3/h;->b()V

    return-wide v13

    :cond_3
    invoke-interface {v1, v11}, Lne3/i;->write([B)Lne3/i;

    if-eqz p2, :cond_4

    add-long/2addr v6, v9

    goto :goto_3

    :cond_4
    invoke-virtual {v12, v1}, Lud3/v0;->writeTo(Lne3/i;)V

    :goto_3
    invoke-interface {v1, v11}, Lne3/i;->write([B)Lne3/i;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1, v10}, Lne3/i;->write([B)Lne3/i;

    invoke-interface {v1, v9}, Lne3/i;->Q(Lne3/l;)Lne3/i;

    invoke-interface {v1, v10}, Lne3/i;->write([B)Lne3/i;

    invoke-interface {v1, v11}, Lne3/i;->write([B)Lne3/i;

    if-eqz p2, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v3, v2, Lne3/h;->x:J

    add-long/2addr v6, v3

    invoke-virtual {v2}, Lne3/h;->b()V

    :cond_6
    return-wide v6
.end method

.method public final contentLength()J
    .locals 4

    iget-wide v0, p0, Lud3/j0;->d:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lud3/j0;->a(Lne3/i;Z)J

    move-result-wide v0

    iput-wide v0, p0, Lud3/j0;->d:J

    :cond_0
    return-wide v0
.end method

.method public final contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lud3/j0;->c:Lud3/h0;

    return-object v0
.end method

.method public final isOneShot()Z
    .locals 2

    iget-object v0, p0, Lud3/j0;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/i0;

    iget-object v1, v1, Lud3/i0;->b:Lud3/v0;

    invoke-virtual {v1}, Lud3/v0;->isOneShot()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lud3/j0;->a(Lne3/i;Z)J

    return-void
.end method
