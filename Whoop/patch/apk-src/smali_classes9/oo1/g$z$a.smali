.class final Loo1/g$z$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g$z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$pollDataFromCache$1$job$1"
    f = "MciOverviewInteractor.kt"
    l = {
        0x141
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field

.field final synthetic F:Z

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Loo1/g;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Loo1/g;Ljava/lang/String;Ldc3/u;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g;",
            "Ljava/lang/String;",
            "Ldc3/u;",
            "Z",
            "Lq83/d<",
            "-",
            "Loo1/g$z$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$z$a;->y:Loo1/g;

    iput-object p2, p0, Loo1/g$z$a;->z:Ljava/lang/String;

    iput-object p3, p0, Loo1/g$z$a;->E:Ldc3/u;

    iput-boolean p4, p0, Loo1/g$z$a;->F:Z

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

    new-instance v0, Loo1/g$z$a;

    iget-object v1, p0, Loo1/g$z$a;->y:Loo1/g;

    iget-object v2, p0, Loo1/g$z$a;->z:Ljava/lang/String;

    iget-object v3, p0, Loo1/g$z$a;->E:Ldc3/u;

    iget-boolean v4, p0, Loo1/g$z$a;->F:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Loo1/g$z$a;-><init>(Loo1/g;Ljava/lang/String;Ldc3/u;ZLq83/d;)V

    iput-object p1, v0, Loo1/g$z$a;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Loo1/g$z$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loo1/g$z$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loo1/g$z$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loo1/g$z$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Loo1/g$z$a;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Loo1/g$z$a;->w:I

    const/4 v7, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v7, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Loo1/g$z$a;->y:Loo1/g;

    iget-object v1, p0, Loo1/g$z$a;->z:Ljava/lang/String;

    invoke-static {p1, v1}, Loo1/g;->f(Loo1/g;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    instance-of v1, p1, Lec3/d;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Lec3/f;

    invoke-direct {v1, p1}, Lec3/f;-><init>(Lec3/l;)V

    move-object p1, v1

    :goto_0
    new-instance v1, Loo1/g$z$a$a;

    iget-object v2, p0, Loo1/g$z$a;->E:Ldc3/u;

    iget-object v3, p0, Loo1/g$z$a;->y:Loo1/g;

    iget-object v4, p0, Loo1/g$z$a;->z:Ljava/lang/String;

    iget-boolean v5, p0, Loo1/g$z$a;->F:Z

    invoke-direct/range {v1 .. v6}, Loo1/g$z$a$a;-><init>(Ldc3/u;Loo1/g;Ljava/lang/String;ZLbc3/c0;)V

    const/4 v2, 0x0

    iput-object v2, p0, Loo1/g$z$a;->x:Ljava/lang/Object;

    iput v7, p0, Loo1/g$z$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
