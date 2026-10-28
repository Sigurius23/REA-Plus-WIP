.class final Lis0/p$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/p;->m(Landroidx/compose/ui/Modifier;Lis0/s0;FZFFLis0/a0;Lkotlin/jvm/functions/Function1;Lj0/i;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.communityreactions.view.ReactionsBarInputRowKt$ReactionsBarInputRow$2$1"
    f = "ReactionsBarInputRow.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lis0/s0;

.field final synthetic y:Lis0/a0;

.field final synthetic z:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lis0/s0;Lis0/a0;Lp1/t2;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lis0/s0;",
            "Lis0/a0;",
            "Lp1/t2;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lis0/p$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lis0/p$a;->x:Lis0/s0;

    iput-object p2, p0, Lis0/p$a;->y:Lis0/a0;

    iput-object p3, p0, Lis0/p$a;->z:Lp1/t2;

    iput-object p4, p0, Lis0/p$a;->E:Lp1/c1;

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

    new-instance v0, Lis0/p$a;

    iget-object v1, p0, Lis0/p$a;->x:Lis0/s0;

    iget-object v2, p0, Lis0/p$a;->y:Lis0/a0;

    iget-object v3, p0, Lis0/p$a;->z:Lp1/t2;

    iget-object v4, p0, Lis0/p$a;->E:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lis0/p$a;-><init>(Lis0/s0;Lis0/a0;Lp1/t2;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lis0/p$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lis0/p$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lis0/p$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lis0/p$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lis0/p$a;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lis0/p$a;->z:Lp1/t2;

    invoke-static {p1}, Lis0/p;->z(Lp1/t2;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lis0/p$a;->x:Lis0/s0;

    invoke-virtual {p1}, Lis0/s0;->k()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lis0/p$a;->E:Lp1/c1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lis0/p;->B(Lp1/c1;Z)V

    iget-object p1, p0, Lis0/p$a;->y:Lis0/a0;

    invoke-virtual {p1}, Lis0/a0;->p()Lc93/a;

    move-result-object p1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lis0/p$a;->z:Lp1/t2;

    invoke-static {p1}, Lis0/p;->z(Lp1/t2;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lis0/p$a;->E:Lp1/c1;

    invoke-static {p1}, Lis0/p;->A(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lis0/p$a;->E:Lp1/c1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lis0/p;->B(Lp1/c1;Z)V

    iget-object p1, p0, Lis0/p$a;->y:Lis0/a0;

    invoke-virtual {p1}, Lis0/a0;->r()Lc93/a;

    move-result-object p1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
