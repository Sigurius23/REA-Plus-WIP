.class public final Lbe3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/n0;


# instance fields
.field public final synthetic w:I

.field public x:Z

.field public final y:Ljava/lang/Object;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbe3/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lbe3/e;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe3/e;->z:Ljava/lang/Object;

    .line 5
    new-instance v0, Lne3/t;

    .line 6
    iget-object p1, p1, Lbe3/g;->c:Ls/m2;

    .line 7
    iget-object p1, p1, Ls/m2;->y:Ljava/lang/Object;

    check-cast p1, Lne3/h0;

    .line 8
    iget-object p1, p1, Lne3/h0;->w:Lne3/n0;

    .line 9
    invoke-interface {p1}, Lne3/n0;->timeout()Lne3/r0;

    move-result-object p1

    .line 10
    invoke-direct {v0, p1}, Lne3/t;-><init>(Lne3/r0;)V

    iput-object v0, p0, Lbe3/e;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lne3/n0;Lrq0/x;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lbe3/e;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbe3/e;->y:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lbe3/e;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget v0, p0, Lbe3/e;->w:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, Lbe3/e;->y:Ljava/lang/Object;

    check-cast v0, Lne3/n0;

    invoke-interface {v0}, Lne3/n0;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lbe3/e;->x:Z

    iget-object v1, p0, Lbe3/e;->z:Ljava/lang/Object;

    check-cast v1, Lrq0/x;

    invoke-virtual {v1, v0}, Lrq0/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lbe3/e;->z:Ljava/lang/Object;

    check-cast v0, Lbe3/g;

    iget-boolean v1, p0, Lbe3/e;->x:Z

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lbe3/e;->x:Z

    iget-object v1, p0, Lbe3/e;->y:Ljava/lang/Object;

    check-cast v1, Lne3/t;

    iget-object v2, v1, Lne3/t;->e:Lne3/r0;

    sget-object v3, Lne3/r0;->d:Lne3/q0;

    iput-object v3, v1, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v2}, Lne3/r0;->a()Lne3/r0;

    invoke-virtual {v2}, Lne3/r0;->b()Lne3/r0;

    const/4 v1, 0x3

    iput v1, v0, Lbe3/g;->d:I

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 2

    iget v0, p0, Lbe3/e;->w:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, Lbe3/e;->y:Ljava/lang/Object;

    check-cast v0, Lne3/n0;

    invoke-interface {v0}, Lne3/n0;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lbe3/e;->x:Z

    iget-object v1, p0, Lbe3/e;->z:Ljava/lang/Object;

    check-cast v1, Lrq0/x;

    invoke-virtual {v1, v0}, Lrq0/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lbe3/e;->x:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lbe3/e;->z:Ljava/lang/Object;

    check-cast v0, Lbe3/g;

    iget-object v0, v0, Lbe3/g;->c:Ls/m2;

    iget-object v0, v0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->flush()V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget v0, p0, Lbe3/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbe3/e;->y:Ljava/lang/Object;

    check-cast v0, Lne3/n0;

    invoke-interface {v0}, Lne3/n0;->timeout()Lne3/r0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbe3/e;->y:Ljava/lang/Object;

    check-cast v0, Lne3/t;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final write(Lne3/h;J)V
    .locals 7

    iget v0, p0, Lbe3/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lbe3/e;->x:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, p3}, Lne3/h;->skip(J)V

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lbe3/e;->y:Ljava/lang/Object;

    check-cast v0, Lne3/n0;

    invoke-interface {v0, p1, p2, p3}, Lne3/n0;->write(Lne3/h;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    const/4 p2, 0x1

    iput-boolean p2, p0, Lbe3/e;->x:Z

    iget-object p2, p0, Lbe3/e;->z:Ljava/lang/Object;

    check-cast p2, Lrq0/x;

    invoke-virtual {p2, p1}, Lrq0/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void

    :pswitch_0
    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lbe3/e;->x:Z

    if-nez v0, :cond_1

    iget-wide v1, p1, Lne3/h;->x:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lwd3/f;->a(JJJ)V

    iget-object p2, p0, Lbe3/e;->z:Ljava/lang/Object;

    check-cast p2, Lbe3/g;

    iget-object p2, p2, Lbe3/g;->c:Ls/m2;

    iget-object p2, p2, Ls/m2;->y:Ljava/lang/Object;

    check-cast p2, Lne3/h0;

    invoke-virtual {p2, p1, v5, v6}, Lne3/h0;->write(Lne3/h;J)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
