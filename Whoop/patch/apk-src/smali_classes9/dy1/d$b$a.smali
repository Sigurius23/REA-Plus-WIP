.class final Ldy1/d$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldy1/d$b;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.memfault.NewMemfaultManager$chunkSendCallback$1$onQueueEmpty$1"
    f = "NewMemfaultManager.kt"
    l = {
        0x30,
        0x36,
        0x3a,
        0x3b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ldy1/d;

.field final synthetic y:I


# direct methods
.method public constructor <init>(Ldy1/d;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldy1/d;",
            "I",
            "Lq83/d<",
            "-",
            "Ldy1/d$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    iput p2, p0, Ldy1/d$b$a;->y:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Ldy1/d$b$a;

    iget-object v0, p0, Ldy1/d$b$a;->x:Ldy1/d;

    iget v1, p0, Ldy1/d$b$a;->y:I

    invoke-direct {p1, v0, v1, p2}, Ldy1/d$b$a;-><init>(Ldy1/d;ILq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldy1/d$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldy1/d$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldy1/d$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldy1/d$b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldy1/d$b$a;->w:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_0

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    :cond_0
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->f(Ldy1/d;)Lju0/a;

    move-result-object p1

    iget-object v1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {v1}, Ldy1/d;->g(Ldy1/d;)Ljava/util/List;

    move-result-object v1

    iput v5, p0, Ldy1/d$b$a;->w:I

    invoke-interface {p1, v1, p0}, Lju0/a;->b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    iget-object p1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->g(Ldy1/d;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->b(Ldy1/d;)I

    move-result v1

    iget v5, p0, Ldy1/d$b$a;->y:I

    add-int/2addr v1, v5

    invoke-static {p1, v1}, Ldy1/d;->q(Ldy1/d;I)V

    iget p1, p0, Ldy1/d$b$a;->y:I

    const/16 v1, 0x64

    if-ne p1, v1, :cond_6

    iget-object p1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->b(Ldy1/d;)I

    move-result p1

    add-int/2addr p1, v1

    const/16 v1, 0x3e8

    if-ge p1, v1, :cond_6

    iget-object p1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->e(Ldy1/d;)Ltr2/n;

    move-result-object p1

    const-string v1, "Triggering another upload"

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->a(Ldy1/d;)Lec3/o1;

    move-result-object p1

    iput v4, p0, Ldy1/d$b$a;->w:I

    invoke-interface {p1, v6, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_2

    :cond_6
    iget-object p1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->e(Ldy1/d;)Ltr2/n;

    move-result-object p1

    const-string v1, "Too many packets to upload, cooldown for 65000 ms"

    new-array v4, v7, [Lqr2/a$a;

    invoke-interface {p1, v1, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iput v3, p0, Ldy1/d$b$a;->w:I

    const-wide/32 v3, 0xfde8

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_7
    :goto_1
    iget-object p1, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->a(Ldy1/d;)Lec3/o1;

    move-result-object p1

    iput v2, p0, Ldy1/d$b$a;->w:I

    invoke-interface {p1, v6, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p1, v0, :cond_8

    :goto_2
    return-object v0

    :goto_3
    iget-object v0, p0, Ldy1/d$b$a;->x:Ldy1/d;

    invoke-static {v0}, Ldy1/d;->e(Ldy1/d;)Ltr2/n;

    move-result-object v0

    const-string v1, "Error deleting memfault packets"

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_8
    :goto_4
    return-object v6
.end method
