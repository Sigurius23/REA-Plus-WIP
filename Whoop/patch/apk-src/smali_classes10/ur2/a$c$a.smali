.class final Lur2/a$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur2/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.util.log.exporter.LocalLogExporter$emailLogData$1$1"
    f = "LocalLogExporter.kt"
    l = {
        0x45,
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lur2/a;

.field final synthetic F:I

.field final synthetic G:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic H:Landroid/content/Context;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lur2/a;ILkotlin/jvm/internal/g0;Landroid/content/Context;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lur2/a;",
            "I",
            "Lkotlin/jvm/internal/g0;",
            "Landroid/content/Context;",
            "Lq83/d<",
            "-",
            "Lur2/a$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lur2/a$c$a;->E:Lur2/a;

    iput p2, p0, Lur2/a$c$a;->F:I

    iput-object p3, p0, Lur2/a$c$a;->G:Lkotlin/jvm/internal/g0;

    iput-object p4, p0, Lur2/a$c$a;->H:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lur2/a$c$a;

    iget-object v1, p0, Lur2/a$c$a;->E:Lur2/a;

    iget v2, p0, Lur2/a$c$a;->F:I

    iget-object v3, p0, Lur2/a$c$a;->G:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Lur2/a$c$a;->H:Landroid/content/Context;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lur2/a$c$a;-><init>(Lur2/a;ILkotlin/jvm/internal/g0;Landroid/content/Context;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lur2/a$c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lur2/a$c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lur2/a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lur2/a$c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lur2/a$c$a;->z:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lur2/a$c$a;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lur2/a$c$a;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v3, p0, Lur2/a$c$a;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lur2/a$c$a;->E:Lur2/a;

    invoke-static {p1}, Lur2/a;->d(Lur2/a;)Ltr2/f;

    move-result-object p1

    iget v1, p0, Lur2/a$c$a;->F:I

    iput v4, p0, Lur2/a$c$a;->z:I

    invoke-interface {p1, v1, p0}, Ltr2/f;->d(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_3

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :goto_1
    iget-object v1, p0, Lur2/a$c$a;->E:Lur2/a;

    invoke-static {v1}, Lur2/a;->i(Lur2/a;)Ltr2/n;

    move-result-object v1

    const-string v4, "Failed to get logs from db"

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {v1, v4, p1, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v4, "no logs for export seems suspicious"

    invoke-direct {v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Lur2/a$c$a;->E:Lur2/a;

    invoke-static {v6}, Lur2/a;->i(Lur2/a;)Ltr2/n;

    move-result-object v6

    new-instance v7, Lur2/a$b;

    invoke-direct {v7, v1}, Lur2/a$b;-><init>(Ljava/lang/Exception;)V

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {v6, v4, v7, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_4
    iget-object v1, p0, Lur2/a$c$a;->G:Lkotlin/jvm/internal/g0;

    :try_start_3
    iget-object v4, p0, Lur2/a$c$a;->E:Lur2/a;

    iget-object v6, p0, Lur2/a$c$a;->H:Landroid/content/Context;

    iput-object v2, p0, Lur2/a$c$a;->w:Ljava/lang/Object;

    iput-object v1, p0, Lur2/a$c$a;->x:Ljava/lang/Object;

    iput-object v1, p0, Lur2/a$c$a;->y:Ljava/lang/Object;

    iput v3, p0, Lur2/a$c$a;->z:I

    invoke-static {v4, p1, v6, p0}, Lur2/a;->a(Lur2/a;Ljava/util/List;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    move-object v0, v1

    :goto_4
    check-cast p1, Ljava/io/File;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object v2, p1

    goto :goto_6

    :goto_5
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Lur2/a$c$a;->E:Lur2/a;

    invoke-static {v0}, Lur2/a;->i(Lur2/a;)Ltr2/n;

    move-result-object v0

    new-instance v3, Lur2/a$b;

    invoke-direct {v3, p1}, Lur2/a$b;-><init>(Ljava/lang/Exception;)V

    new-array p1, v5, [Lqr2/a$a;

    const-string v4, "LocalLogExporter failed to export logs"

    invoke-interface {v0, v4, v3, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move-object v0, v1

    :goto_6
    iput-object v2, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
