.class final Lsz0/m0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "Landroidx/lifecycle/x;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;Landroidx/lifecycle/x;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.molecule.ProgressModalKt$ProgressModal$5$3$1"
    f = "ProgressModal.kt"
    l = {
        0xa2
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lsz0/p0;


# direct methods
.method public constructor <init>(Lsz0/p0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsz0/p0;",
            "Lq83/d<",
            "-",
            "Lsz0/m0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsz0/m0$b;->x:Lsz0/p0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lbc3/c0;Landroidx/lifecycle/x;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Landroidx/lifecycle/x;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lsz0/m0$b;

    iget-object p2, p0, Lsz0/m0$b;->x:Lsz0/p0;

    invoke-direct {p1, p2, p3}, Lsz0/m0$b;-><init>(Lsz0/p0;Lq83/d;)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsz0/m0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Landroidx/lifecycle/x;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lsz0/m0$b;->f(Lbc3/c0;Landroidx/lifecycle/x;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsz0/m0$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsz0/m0$b;->x:Lsz0/p0;

    check-cast p1, Lsz0/p0$h;

    invoke-virtual {p1}, Lsz0/p0$h;->h()J

    move-result-wide v3

    iput v2, p0, Lsz0/m0$b;->w:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lsz0/m0$b;->x:Lsz0/p0;

    check-cast p1, Lsz0/p0$h;

    invoke-virtual {p1}, Lsz0/p0$h;->i()Lc93/a;

    move-result-object p1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
