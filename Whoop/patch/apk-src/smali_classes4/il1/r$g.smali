.class final Lil1/r$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil1/r;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "",
        "Lil1/u;",
        "action",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Lil1/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$1"
    f = "HomeFeedDomainInteractor.kt"
    l = {
        0x4b,
        0x50
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lil1/r;


# direct methods
.method public constructor <init>(Lil1/r;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/r;",
            "Lq83/d<",
            "-",
            "Lil1/r$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lil1/r$g;->z:Lil1/r;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lec3/m;Lil1/u;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lil1/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lil1/r$g;

    iget-object v1, p0, Lil1/r$g;->z:Lil1/r;

    invoke-direct {v0, v1, p3}, Lil1/r$g;-><init>(Lil1/r;Lq83/d;)V

    iput-object p1, v0, Lil1/r$g;->x:Ljava/lang/Object;

    iput-object p2, v0, Lil1/r$g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lil1/r$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lec3/m;

    check-cast p2, Lil1/u;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lil1/r$g;->f(Lec3/m;Lil1/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lil1/r$g;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lil1/r$g;->y:Ljava/lang/Object;

    check-cast v1, Lil1/u;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lil1/r$g;->w:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lil1/u$a;

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p0, Lil1/r$g;->z:Lil1/r;

    check-cast v1, Lil1/u$a;

    invoke-static {p1, v1}, Lil1/r;->l(Lil1/r;Lil1/u$a;)Lec3/l;

    move-result-object p1

    iput-object v3, p0, Lil1/r$g;->x:Ljava/lang/Object;

    iput-object v3, p0, Lil1/r$g;->y:Ljava/lang/Object;

    iput v5, p0, Lil1/r$g;->w:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_1

    :cond_3
    iput-object v3, p0, Lil1/r$g;->x:Ljava/lang/Object;

    iput-object v3, p0, Lil1/r$g;->y:Ljava/lang/Object;

    iput v4, p0, Lil1/r$g;->w:I

    invoke-interface {v0, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    :goto_1
    return-object v2

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
