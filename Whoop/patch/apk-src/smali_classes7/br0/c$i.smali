.class final Lbr0/c$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbr0/c;->t(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lbr0/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor$interact$1"
    f = "CommunityFollowerContainerInteractor.kt"
    l = {
        0x27,
        0x29
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lbr0/c;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lec3/l;Lbr0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lbr0/c;",
            "Lq83/d<",
            "-",
            "Lbr0/c$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbr0/c$i;->z:Lec3/l;

    iput-object p2, p0, Lbr0/c$i;->E:Lbr0/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lbr0/c$i;

    iget-object v1, p0, Lbr0/c$i;->z:Lec3/l;

    iget-object v2, p0, Lbr0/c$i;->E:Lbr0/c;

    invoke-direct {v0, v1, v2, p2}, Lbr0/c$i;-><init>(Lec3/l;Lbr0/c;Lq83/d;)V

    iput-object p1, v0, Lbr0/c$i;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lbr0/c$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbr0/c$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbr0/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbr0/c$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lbr0/c$i;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lbr0/c$i;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lbr0/c$i;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lbr0/c$i;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v2

    new-instance v5, Lbr0/b;

    const/16 v12, 0x3f

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lbr0/b;-><init>(ZZLcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;Ljava/lang/String;Lbr0/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v5, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v0, p0, Lbr0/c$i;->y:Ljava/lang/Object;

    iput-object v2, p0, Lbr0/c$i;->w:Ljava/lang/Object;

    iput v4, p0, Lbr0/c$i;->x:I

    invoke-interface {v0, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lbr0/c$i;->z:Lec3/l;

    iget-object v5, p0, Lbr0/c$i;->E:Lbr0/c;

    invoke-static {v5}, Lbr0/c;->e(Lbr0/c;)Lec3/l;

    move-result-object v5

    new-array v4, v4, [Lec3/l;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {p1, v4}, Lor2/e0;->a(Lec3/l;[Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v4, Lbr0/c$i$a;

    iget-object v5, p0, Lbr0/c$i;->E:Lbr0/c;

    invoke-direct {v4, v2, v5, v0}, Lbr0/c$i$a;-><init>(Lkotlin/jvm/internal/g0;Lbr0/c;Lec3/m;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lbr0/c$i;->y:Ljava/lang/Object;

    iput-object v0, p0, Lbr0/c$i;->w:Ljava/lang/Object;

    iput v3, p0, Lbr0/c$i;->x:I

    invoke-interface {p1, v4, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
