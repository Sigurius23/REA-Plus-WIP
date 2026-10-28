.class final Lcom/whoop/archv2/feature/domain/g$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->q(Lcom/whoop/archv2/feature/domain/g$b;)Lec3/l;
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
        "Lcom/whoop/archv2/feature/domain/i$m;",
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
    c = "com.whoop.archv2.feature.domain.GenericInteractor$buildFetchFlow$reloadFetchFlow$1"
    f = "GenericInteractor.kt"
    l = {
        0x105
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/archv2/feature/domain/g;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lcom/whoop/archv2/feature/domain/c$n;


# direct methods
.method public constructor <init>(Lcom/whoop/archv2/feature/domain/c$n;Lcom/whoop/archv2/feature/domain/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/c$n;",
            "Lcom/whoop/archv2/feature/domain/g;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/g$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/g$f;->z:Lcom/whoop/archv2/feature/domain/c$n;

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/g$f;->E:Lcom/whoop/archv2/feature/domain/g;

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

    new-instance p1, Lcom/whoop/archv2/feature/domain/g$f;

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$f;->z:Lcom/whoop/archv2/feature/domain/c$n;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$f;->E:Lcom/whoop/archv2/feature/domain/g;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/archv2/feature/domain/g$f;-><init>(Lcom/whoop/archv2/feature/domain/c$n;Lcom/whoop/archv2/feature/domain/g;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/g$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/archv2/feature/domain/g$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/archv2/feature/domain/g$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/g$f;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/archv2/feature/domain/g$f;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$f;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/g$f;->z:Lcom/whoop/archv2/feature/domain/c$n;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/archv2/feature/domain/c$n;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$f;->E:Lcom/whoop/archv2/feature/domain/g;

    invoke-static {v1}, Lcom/whoop/archv2/feature/domain/g;->f(Lcom/whoop/archv2/feature/domain/g;)Lwm0/a;

    move-result-object v1

    iput-object v3, p0, Lcom/whoop/archv2/feature/domain/g$f;->w:Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, p0, Lcom/whoop/archv2/feature/domain/g$f;->x:I

    iput v2, p0, Lcom/whoop/archv2/feature/domain/g$f;->y:I

    invoke-virtual {v1, p1, p0}, Lwm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
