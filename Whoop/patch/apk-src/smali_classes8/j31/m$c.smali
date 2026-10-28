.class final Lj31/m$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/m;->P(II)V
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
    c = "com.whoop.design.atomic.molecule.reordable.ReorderableState$onDrag$1$1"
    f = "ReorderableState.kt"
    l = {
        0x95
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lj31/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj31/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic y:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final synthetic z:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj31/m;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj31/m<",
            "TT;>;TT;TT;",
            "Lq83/d<",
            "-",
            "Lj31/m$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj31/m$c;->x:Lj31/m;

    iput-object p2, p0, Lj31/m$c;->y:Ljava/lang/Object;

    iput-object p3, p0, Lj31/m$c;->z:Ljava/lang/Object;

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

    new-instance p1, Lj31/m$c;

    iget-object v0, p0, Lj31/m$c;->x:Lj31/m;

    iget-object v1, p0, Lj31/m$c;->y:Ljava/lang/Object;

    iget-object v2, p0, Lj31/m$c;->z:Ljava/lang/Object;

    invoke-direct {p1, v0, v1, v2, p2}, Lj31/m$c;-><init>(Lj31/m;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lj31/m$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj31/m$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj31/m$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj31/m$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj31/m$c;->w:I

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

    iget-object p1, p0, Lj31/m$c;->x:Lj31/m;

    invoke-static {p1}, Lj31/m;->l(Lj31/m;)Lc93/m;

    move-result-object p1

    new-instance v1, Lj31/d;

    iget-object v3, p0, Lj31/m$c;->x:Lj31/m;

    iget-object v4, p0, Lj31/m$c;->y:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Lj31/m;->D(Ljava/lang/Object;)I

    move-result v3

    iget-object v4, p0, Lj31/m$c;->x:Lj31/m;

    iget-object v5, p0, Lj31/m$c;->y:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Lj31/m;->E(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lj31/d;-><init>(ILjava/lang/Object;)V

    new-instance v3, Lj31/d;

    iget-object v4, p0, Lj31/m$c;->x:Lj31/m;

    iget-object v5, p0, Lj31/m$c;->z:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Lj31/m;->D(Ljava/lang/Object;)I

    move-result v4

    iget-object v5, p0, Lj31/m$c;->x:Lj31/m;

    iget-object v6, p0, Lj31/m$c;->z:Ljava/lang/Object;

    invoke-virtual {v5, v6}, Lj31/m;->E(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lj31/d;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v1, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lj31/m$c;->x:Lj31/m;

    invoke-virtual {p1}, Lj31/m;->z()I

    move-result v1

    iget-object v3, p0, Lj31/m$c;->x:Lj31/m;

    invoke-virtual {v3}, Lj31/m;->A()I

    move-result v3

    iput v2, p0, Lj31/m$c;->w:I

    invoke-virtual {p1, v1, v3, p0}, Lj31/m;->S(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
