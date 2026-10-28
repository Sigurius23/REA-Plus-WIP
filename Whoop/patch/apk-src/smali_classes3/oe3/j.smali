.class public final synthetic Loe3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/internal/g0;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/g0;

.field public final synthetic y:Lne3/j0;

.field public final synthetic z:Lkotlin/jvm/internal/g0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;Lne3/j0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Loe3/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loe3/j;->x:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Loe3/j;->y:Lne3/j0;

    iput-object p3, p0, Loe3/j;->z:Lkotlin/jvm/internal/g0;

    iput-object p4, p0, Loe3/j;->E:Lkotlin/jvm/internal/g0;

    return-void
.end method

.method public synthetic constructor <init>(Lne3/j0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Loe3/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loe3/j;->y:Lne3/j0;

    iput-object p2, p0, Loe3/j;->x:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Loe3/j;->z:Lkotlin/jvm/internal/g0;

    iput-object p4, p0, Loe3/j;->E:Lkotlin/jvm/internal/g0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Loe3/j;->w:I

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Long;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Loe3/j;->x:Lkotlin/jvm/internal/g0;

    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez p2, :cond_1

    const-wide/16 v2, 0x18

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iget-object p2, p0, Loe3/j;->y:Lne3/j0;

    invoke-virtual {p2}, Lne3/j0;->e0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p2}, Lne3/j0;->e0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-object v0, p0, Loe3/j;->z:Lkotlin/jvm/internal/g0;

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p2}, Lne3/j0;->e0()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-object p2, p0, Loe3/j;->E:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: NTFS extra attribute tag 0x0001 size != 24"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: NTFS extra attribute tag 0x0001 repeated"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const/16 p2, 0x5455

    if-ne p1, p2, :cond_d

    const-wide/16 p1, 0x1

    cmp-long v2, v0, p1

    const-string v3, "bad zip: extended timestamp extra too short"

    if-ltz v2, :cond_c

    iget-object v2, p0, Loe3/j;->y:Lne3/j0;

    invoke-virtual {v2}, Lne3/j0;->readByte()B

    move-result v4

    and-int/lit8 v5, v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v5, v7, :cond_3

    move v5, v7

    goto :goto_1

    :cond_3
    move v5, v6

    :goto_1
    and-int/lit8 v8, v4, 0x2

    const/4 v9, 0x2

    if-ne v8, v9, :cond_4

    move v8, v7

    goto :goto_2

    :cond_4
    move v8, v6

    :goto_2
    const/4 v9, 0x4

    and-int/2addr v4, v9

    if-ne v4, v9, :cond_5

    move v6, v7

    :cond_5
    if-eqz v5, :cond_6

    const-wide/16 p1, 0x5

    :cond_6
    const-wide/16 v9, 0x4

    if-eqz v8, :cond_7

    add-long/2addr p1, v9

    :cond_7
    if-eqz v6, :cond_8

    add-long/2addr p1, v9

    :cond_8
    cmp-long p1, v0, p1

    if-ltz p1, :cond_b

    if-eqz v5, :cond_9

    invoke-virtual {v2}, Lne3/j0;->Q0()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Loe3/j;->x:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_9
    if-eqz v8, :cond_a

    invoke-virtual {v2}, Lne3/j0;->Q0()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Loe3/j;->z:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_a
    if-eqz v6, :cond_d

    invoke-virtual {v2}, Lne3/j0;->Q0()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Loe3/j;->E:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_3

    :cond_b
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
