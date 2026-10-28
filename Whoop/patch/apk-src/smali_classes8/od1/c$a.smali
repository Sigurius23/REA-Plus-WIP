.class final Lod1/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod1/c;-><init>(Lcom/whoop/service/network/CycleMetadataApi;Lin2/d;Ltr2/n;)V
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;",
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
    c = "com.whoop.domain.CurrentCycleInteractor$cycleDataFlow$1"
    f = "CurrentCycleInteractor.kt"
    l = {
        0x13,
        0x1a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lod1/c;


# direct methods
.method public constructor <init>(Lod1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod1/c;",
            "Lq83/d<",
            "-",
            "Lod1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lod1/c$a;->z:Lod1/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lod1/c$a;

    iget-object v1, p0, Lod1/c$a;->z:Lod1/c;

    invoke-direct {v0, v1, p2}, Lod1/c$a;-><init>(Lod1/c;Lq83/d;)V

    iput-object p1, v0, Lod1/c$a;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lod1/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lod1/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lod1/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lod1/c$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lod1/c$a;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lod1/c$a;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lod1/c$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lod1/c$a;->z:Lod1/c;

    invoke-static {p1}, Lod1/c;->b(Lod1/c;)Lin2/d;

    move-result-object p1

    invoke-interface {p1}, Lin2/d;->b()Lq83/j;

    move-result-object p1

    new-instance v2, Lod1/c$a$a;

    iget-object v6, p0, Lod1/c$a;->z:Lod1/c;

    invoke-direct {v2, v6, v5}, Lod1/c$a$a;-><init>(Lod1/c;Lq83/d;)V

    iput-object v0, p0, Lod1/c$a;->y:Ljava/lang/Object;

    iput v4, p0, Lod1/c$a;->x:I

    invoke-static {p1, v2, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_3

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    iget-object v2, p0, Lod1/c$a;->z:Lod1/c;

    invoke-static {v2}, Lod1/c;->c(Lod1/c;)Ltr2/n;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    const-string v6, "Failed to fetch cycle data"

    invoke-interface {v2, v6, p1, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move-object p1, v5

    :goto_2
    iput-object v5, p0, Lod1/c$a;->y:Ljava/lang/Object;

    iput-object v5, p0, Lod1/c$a;->w:Ljava/lang/Object;

    iput v3, p0, Lod1/c$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_3
    return-object v1

    :cond_4
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
