.class public final Lmf/o;
.super Lmf/k;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Long;

.field public final synthetic c:Ljava/io/Closeable;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Lyf/u;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lmf/o;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lmf/o;->c:Ljava/io/Closeable;

    .line 3
    iput-object p1, p0, Lmf/o;->b:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Lud3/x0;)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Lmf/o;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lmf/o;->c:Ljava/io/Closeable;

    .line 6
    iget-object v0, p1, Lud3/x0;->G:Lud3/a1;

    .line 7
    invoke-virtual {v0}, Lud3/a1;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 8
    iget-object p1, p1, Lud3/x0;->G:Lud3/a1;

    .line 9
    invoke-virtual {p1}, Lud3/a1;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lmf/o;->b:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    iget v0, p0, Lmf/o;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmf/o;->b:Ljava/lang/Long;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmf/o;->b:Ljava/lang/Long;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Z
    .locals 1

    iget v0, p0, Lmf/o;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lyf/u;
    .locals 2

    iget v0, p0, Lmf/o;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmf/o;->c:Ljava/io/Closeable;

    check-cast v0, Lud3/x0;

    iget-object v0, v0, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->d1()Lne3/j;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lzf/h;

    if-eqz v1, :cond_0

    check-cast v0, Lzf/h;

    iget-object v0, v0, Lzf/h;->w:Lyf/u;

    goto :goto_0

    :cond_0
    new-instance v1, Lzf/f;

    invoke-direct {v1, v0}, Lzf/f;-><init>(Lne3/j;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmf/o;->c:Ljava/io/Closeable;

    check-cast v0, Lyf/u;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
