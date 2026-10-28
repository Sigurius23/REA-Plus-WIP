.class final Lis0/m0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/m0;->n(Lh0/p3;FLq83/d;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lh0/a;",
        "Lh0/h1;",
        "Lis0/b0;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lh0/a;Lh0/h1;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.communityreactions.view.ReactionsPanelState$settle$2"
    f = "ReactionsPanelState.kt"
    l = {
        0x63
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lh0/p3;

.field final synthetic F:Lis0/m0;

.field final synthetic G:F

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh0/p3;Lis0/m0;FLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/p3;",
            "Lis0/m0;",
            "F",
            "Lq83/d<",
            "-",
            "Lis0/m0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lis0/m0$b;->E:Lh0/p3;

    iput-object p2, p0, Lis0/m0$b;->F:Lis0/m0;

    iput p3, p0, Lis0/m0$b;->G:F

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lh0/a;Lh0/h1;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/a;",
            "Lh0/h1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p2, Lis0/m0$b;

    iget-object v0, p0, Lis0/m0$b;->E:Lh0/p3;

    iget-object v1, p0, Lis0/m0$b;->F:Lis0/m0;

    iget v2, p0, Lis0/m0$b;->G:F

    invoke-direct {p2, v0, v1, v2, p3}, Lis0/m0$b;-><init>(Lh0/p3;Lis0/m0;FLq83/d;)V

    iput-object p1, p2, Lis0/m0$b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, Lis0/m0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/a;

    check-cast p2, Lh0/h1;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lis0/m0$b;->f(Lh0/a;Lh0/h1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lis0/m0$b;->z:Ljava/lang/Object;

    check-cast v0, Lh0/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lis0/m0$b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lis0/m0$b;->w:Ljava/lang/Object;

    check-cast v0, Lh0/p3;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lis0/m0$b;->E:Lh0/p3;

    iget-object v2, p0, Lis0/m0$b;->F:Lis0/m0;

    iget v4, p0, Lis0/m0$b;->G:F

    invoke-static {v2, v0}, Lis0/m0;->a(Lis0/m0;Lh0/a;)Lis0/m0$a;

    move-result-object v0

    const/4 v2, 0x0

    iput-object v2, p0, Lis0/m0$b;->z:Ljava/lang/Object;

    iput-object v2, p0, Lis0/m0$b;->w:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, p0, Lis0/m0$b;->x:I

    iput v3, p0, Lis0/m0$b;->y:I

    invoke-interface {p1, v0, v4, p0}, Lh0/p3;->a(Lh0/k2;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
