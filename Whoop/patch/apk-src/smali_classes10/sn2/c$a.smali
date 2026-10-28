.class final Lsn2/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsn2/c;->k(Lsn2/b;Lkotlin/jvm/functions/Function1;)Lec3/l;
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
        "Lsn2/b;",
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
    c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor$admittedRequest$1"
    f = "BuyNowInteractor.kt"
    l = {
        0x38,
        0x39,
        0x3d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic F:Lsn2/c;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lsn2/b;


# direct methods
.method public constructor <init>(Lsn2/b;Lkotlin/jvm/functions/Function1;Lsn2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn2/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lsn2/c;",
            "Lq83/d<",
            "-",
            "Lsn2/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsn2/c$a;->z:Lsn2/b;

    iput-object p2, p0, Lsn2/c$a;->E:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsn2/c$a;->F:Lsn2/c;

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

    new-instance v0, Lsn2/c$a;

    iget-object v1, p0, Lsn2/c$a;->z:Lsn2/b;

    iget-object v2, p0, Lsn2/c$a;->E:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lsn2/c$a;->F:Lsn2/c;

    invoke-direct {v0, v1, v2, v3, p2}, Lsn2/c$a;-><init>(Lsn2/b;Lkotlin/jvm/functions/Function1;Lsn2/c;Lq83/d;)V

    iput-object p1, v0, Lsn2/c$a;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lsn2/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsn2/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsn2/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsn2/c$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lsn2/c$a;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lsn2/c$a;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lsn2/c$a;->w:Ljava/lang/Object;

    check-cast v0, Lsn2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lsn2/c$a;->z:Lsn2/b;

    iput-object v0, p0, Lsn2/c$a;->y:Ljava/lang/Object;

    iput v5, p0, Lsn2/c$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lsn2/c$a;->E:Lkotlin/jvm/functions/Function1;

    iput-object v0, p0, Lsn2/c$a;->y:Ljava/lang/Object;

    iput v4, p0, Lsn2/c$a;->x:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lsn2/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v2, p0, Lsn2/c$a;->F:Lsn2/c;

    invoke-static {v2}, Lsn2/c;->f(Lsn2/c;)Lsn2/e;

    move-result-object v2

    invoke-virtual {v2}, Lsn2/e;->d()V

    iget-object v2, p0, Lsn2/c$a;->F:Lsn2/c;

    invoke-static {v2}, Lsn2/c;->f(Lsn2/c;)Lsn2/e;

    move-result-object v2

    invoke-virtual {v2}, Lsn2/e;->f()Z

    move-result v2

    if-nez v2, :cond_6

    const/4 v2, 0x0

    iput-object v2, p0, Lsn2/c$a;->y:Ljava/lang/Object;

    iput-object v2, p0, Lsn2/c$a;->w:Ljava/lang/Object;

    iput v3, p0, Lsn2/c$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_4
    iget-object v0, p0, Lsn2/c$a;->F:Lsn2/c;

    invoke-static {v0}, Lsn2/c;->f(Lsn2/c;)Lsn2/e;

    move-result-object v0

    invoke-virtual {v0}, Lsn2/e;->d()V

    throw p1
.end method
