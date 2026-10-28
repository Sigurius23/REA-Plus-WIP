.class public final synthetic Ll1/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/io/Serializable;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;I)V
    .locals 0

    .line 1
    const/4 p11, 0x0

    iput p11, p0, Ll1/h0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/h0;->y:Ljava/io/Serializable;

    iput-wide p2, p0, Ll1/h0;->x:J

    iput-object p4, p0, Ll1/h0;->z:Ljava/lang/Object;

    iput-object p5, p0, Ll1/h0;->E:Ljava/lang/Object;

    iput-object p6, p0, Ll1/h0;->F:Ljava/lang/Object;

    iput-object p7, p0, Ll1/h0;->G:Ljava/lang/Object;

    iput-object p8, p0, Ll1/h0;->H:Ljava/lang/Object;

    iput-object p9, p0, Ll1/h0;->I:Ljava/lang/Object;

    iput-object p10, p0, Ll1/h0;->J:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/b0;JLkotlin/jvm/internal/f0;Lne3/j0;Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ll1/h0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/h0;->y:Ljava/io/Serializable;

    iput-wide p2, p0, Ll1/h0;->x:J

    iput-object p4, p0, Ll1/h0;->z:Ljava/lang/Object;

    iput-object p5, p0, Ll1/h0;->E:Ljava/lang/Object;

    iput-object p6, p0, Ll1/h0;->F:Ljava/lang/Object;

    iput-object p7, p0, Ll1/h0;->G:Ljava/lang/Object;

    iput-object p8, p0, Ll1/h0;->H:Ljava/lang/Object;

    iput-object p9, p0, Ll1/h0;->I:Ljava/lang/Object;

    iput-object p10, p0, Ll1/h0;->J:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Ll1/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll1/h0;->y:Ljava/io/Serializable;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v1, p0, Ll1/h0;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/f0;

    iget-object v2, p0, Ll1/h0;->E:Ljava/lang/Object;

    check-cast v2, Lne3/j0;

    iget-object v3, p0, Ll1/h0;->F:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/f0;

    iget-object v4, p0, Ll1/h0;->G:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/f0;

    iget-object v5, p0, Ll1/h0;->H:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/g0;

    iget-object v6, p0, Ll1/h0;->I:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/g0;

    iget-object v7, p0, Ll1/h0;->J:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/g0;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/16 p2, 0xa

    if-eq p1, p2, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 p1, 0x4

    cmp-long v0, v8, p1

    if-ltz v0, :cond_1

    invoke-virtual {v2, p1, p2}, Lne3/j0;->skip(J)V

    sub-long/2addr v8, p1

    long-to-int p1, v8

    new-instance p2, Loe3/j;

    invoke-direct {p2, v5, v2, v6, v7}, Loe3/j;-><init>(Lkotlin/jvm/internal/g0;Lne3/j0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;)V

    invoke-static {v2, p1, p2}, Lv8/b;->P(Lne3/j0;ILc93/m;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: NTFS extra too short"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v0, Lkotlin/jvm/internal/b0;->w:Z

    if-nez p1, :cond_7

    iput-boolean p2, v0, Lkotlin/jvm/internal/b0;->w:Z

    iget-wide p1, p0, Ll1/h0;->x:J

    cmp-long p1, v8, p1

    if-ltz p1, :cond_6

    iget-wide p1, v1, Lkotlin/jvm/internal/f0;->w:J

    const-wide v5, 0xffffffffL

    cmp-long v0, p1, v5

    if-nez v0, :cond_3

    invoke-virtual {v2}, Lne3/j0;->e0()J

    move-result-wide p1

    :cond_3
    iput-wide p1, v1, Lkotlin/jvm/internal/f0;->w:J

    iget-wide p1, v3, Lkotlin/jvm/internal/f0;->w:J

    cmp-long p1, p1, v5

    const-wide/16 v0, 0x0

    if-nez p1, :cond_4

    invoke-virtual {v2}, Lne3/j0;->e0()J

    move-result-wide p1

    goto :goto_0

    :cond_4
    move-wide p1, v0

    :goto_0
    iput-wide p1, v3, Lkotlin/jvm/internal/f0;->w:J

    iget-wide p1, v4, Lkotlin/jvm/internal/f0;->w:J

    cmp-long p1, p1, v5

    if-nez p1, :cond_5

    invoke-virtual {v2}, Lne3/j0;->e0()J

    move-result-wide v0

    :cond_5
    iput-wide v0, v4, Lkotlin/jvm/internal/f0;->w:J

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra too short"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra repeated"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Ll1/h0;->y:Ljava/io/Serializable;

    move-object v1, v0

    check-cast v1, Ljava/lang/Long;

    iget-object v0, p0, Ll1/h0;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ll1/h0;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ll1/h0;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lm1/o;

    iget-object v0, p0, Ll1/h0;->G:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Li93/j;

    iget-object v0, p0, Ll1/h0;->H:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ll1/e0;

    iget-object v0, p0, Ll1/h0;->I:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ll1/n3;

    iget-object v0, p0, Ll1/h0;->J:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ll1/y;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-wide v2, p0, Ll1/h0;->x:J

    invoke-static/range {v1 .. v12}, Ll1/f1;->c(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
