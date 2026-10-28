.class final Lzo0/f$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo0/f;->z(Lep0/j;)Lzo0/f$a;
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
    c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$onScreenRegistered$4"
    f = "ProactiveCoordinator.kt"
    l = {
        0x8b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lzo0/f;


# direct methods
.method public constructor <init>(Lzo0/f;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo0/f;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lzo0/f$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzo0/f$k;->z:Lzo0/f;

    iput-object p2, p0, Lzo0/f$k;->E:Ljava/lang/String;

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

    new-instance p1, Lzo0/f$k;

    iget-object v0, p0, Lzo0/f$k;->z:Lzo0/f;

    iget-object v1, p0, Lzo0/f$k;->E:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lzo0/f$k;-><init>(Lzo0/f;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lzo0/f$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzo0/f$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzo0/f$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzo0/f$k;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lzo0/f$k;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lzo0/f$k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzo0/f$k;->z:Lzo0/f;

    invoke-static {p1}, Lzo0/f;->d(Lzo0/f;)Lzo0/d;

    move-result-object p1

    invoke-virtual {p1}, Lzo0/d;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lzo0/f$k;->z:Lzo0/f;

    iget-object v3, p0, Lzo0/f$k;->E:Ljava/lang/String;

    invoke-static {v1}, Lzo0/f;->b(Lzo0/f;)Lec3/o1;

    move-result-object v1

    new-instance v4, Lzo0/g$c;

    invoke-direct {v4, v3, p1}, Lzo0/g$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lzo0/f$k;->w:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lzo0/f$k;->x:I

    iput v2, p0, Lzo0/f$k;->y:I

    invoke-interface {v1, v4, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
