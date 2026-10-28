.class final Lv41/q0$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/q0;->F(Ljava/lang/String;Lud3/l0;Ltr2/n;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/lang/String;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.WhoopLottieOverrideViewKt$fetchLottieJson$2"
    f = "WhoopLottieOverrideView.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lud3/l0;

.field final synthetic z:Ltr2/n;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lud3/l0;Ltr2/n;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lud3/l0;",
            "Ltr2/n;",
            "Lq83/d<",
            "-",
            "Lv41/q0$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/q0$h;->x:Ljava/lang/String;

    iput-object p2, p0, Lv41/q0$h;->y:Lud3/l0;

    iput-object p3, p0, Lv41/q0$h;->z:Ltr2/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lv41/q0$h;

    iget-object v0, p0, Lv41/q0$h;->x:Ljava/lang/String;

    iget-object v1, p0, Lv41/q0$h;->y:Lud3/l0;

    iget-object v2, p0, Lv41/q0$h;->z:Ltr2/n;

    invoke-direct {p1, v0, v1, v2, p2}, Lv41/q0$h;-><init>(Ljava/lang/String;Lud3/l0;Ltr2/n;Lq83/d;)V

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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lv41/q0$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/q0$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/q0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/q0$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lv41/q0$h;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lud3/n0;

    invoke-direct {v1}, Lud3/n0;-><init>()V

    iget-object v2, p0, Lv41/q0$h;->x:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lud3/n0;->f(Ljava/lang/String;)V

    new-instance v2, Lud3/o0;

    invoke-direct {v2, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    iget-object v1, p0, Lv41/q0$h;->y:Lud3/l0;

    invoke-virtual {v1, v2}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object v1

    invoke-virtual {v1}, Lzd3/o;->e()Lud3/x0;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-boolean v2, v1, Lud3/x0;->Q:Z

    if-nez v2, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    iget-object v2, v1, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v2}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-virtual {v1}, Lud3/x0;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :catchall_0
    move-exception v2

    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-static {v1, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    iget-object v2, p0, Lv41/q0$h;->z:Ltr2/n;

    iget-object v3, p0, Lv41/q0$h;->x:Ljava/lang/String;

    const-string v4, "Invalid URL for Lottie JSON: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v2, v3, v1, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_3

    :goto_2
    iget-object v2, p0, Lv41/q0$h;->z:Ltr2/n;

    const-string v3, "Failed to fetch Lottie JSON"

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v2, v3, v1, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_3
    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
