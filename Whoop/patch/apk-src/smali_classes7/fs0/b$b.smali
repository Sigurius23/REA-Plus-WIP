.class final Lfs0/b$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs0/b;->m(Lec3/l;Lec3/f2;)Lec3/l;
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
        "Lds0/e;",
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
    c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$interact$1"
    f = "ReactionsSendInteractor.kt"
    l = {
        0x33
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field final synthetic F:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfs0/b;


# direct methods
.method public constructor <init>(Lfs0/b;Lec3/f2;Lec3/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfs0/b;",
            "Lec3/f2;",
            "Lec3/l;",
            "Lq83/d<",
            "-",
            "Lfs0/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfs0/b$b;->z:Lfs0/b;

    iput-object p2, p0, Lfs0/b$b;->E:Lec3/f2;

    iput-object p3, p0, Lfs0/b$b;->F:Lec3/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lfs0/b$b;

    iget-object v1, p0, Lfs0/b$b;->z:Lfs0/b;

    iget-object v2, p0, Lfs0/b$b;->E:Lec3/f2;

    iget-object v3, p0, Lfs0/b$b;->F:Lec3/l;

    invoke-direct {v0, v1, v2, v3, p2}, Lfs0/b$b;-><init>(Lfs0/b;Lec3/f2;Lec3/l;Lq83/d;)V

    iput-object p1, v0, Lfs0/b$b;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfs0/b$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfs0/b$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfs0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfs0/b$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lfs0/b$b;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lfs0/b$b;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lfs0/b$b;->w:Ljava/lang/Object;

    check-cast v0, Lfs0/b$a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lfs0/b$a;

    iget-object v2, p0, Lfs0/b$b;->z:Lfs0/b;

    iget-object v4, p0, Lfs0/b$b;->E:Lec3/f2;

    invoke-direct {p1, v2, v4}, Lfs0/b$a;-><init>(Lfs0/b;Lec3/f2;)V

    invoke-virtual {p1}, Lfs0/b$a;->f()Lec3/o1;

    move-result-object v2

    iget-object v4, p0, Lfs0/b$b;->F:Lec3/l;

    invoke-virtual {p1, v4}, Lfs0/b$a;->h(Lec3/l;)Lec3/l;

    move-result-object v4

    invoke-virtual {p1}, Lfs0/b$a;->g()Lec3/l;

    move-result-object p1

    const/4 v5, 0x3

    new-array v5, v5, [Lec3/l;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    aput-object v4, v5, v3

    const/4 v2, 0x2

    aput-object p1, v5, v2

    invoke-static {v5}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, p0, Lfs0/b$b;->y:Ljava/lang/Object;

    iput-object v2, p0, Lfs0/b$b;->w:Ljava/lang/Object;

    iput v3, p0, Lfs0/b$b;->x:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
