.class final Lcom/whoop/archv2/feature/domain/g$t;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->w(Lcom/whoop/archv2/feature/domain/c$f;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;)Lec3/l;
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
        "Lcom/whoop/archv2/feature/domain/i;",
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
    c = "com.whoop.archv2.feature.domain.GenericInteractor$handleMediaPickFailed$1"
    f = "GenericInteractor.kt"
    l = {
        0x1d7,
        0x1da,
        0x1dc
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/archv2/feature/domain/g;

.field final synthetic F:Lcom/whoop/navigation/models/ApiRequest;

.field final synthetic G:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/archv2/feature/domain/c$f;


# direct methods
.method public constructor <init>(Lcom/whoop/archv2/feature/domain/c$f;Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/c$f;",
            "Lcom/whoop/archv2/feature/domain/g;",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/g$t;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/g$t;->z:Lcom/whoop/archv2/feature/domain/c$f;

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/g$t;->E:Lcom/whoop/archv2/feature/domain/g;

    iput-object p3, p0, Lcom/whoop/archv2/feature/domain/g$t;->F:Lcom/whoop/navigation/models/ApiRequest;

    iput-object p4, p0, Lcom/whoop/archv2/feature/domain/g$t;->G:Lc93/m;

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

    new-instance v0, Lcom/whoop/archv2/feature/domain/g$t;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$t;->z:Lcom/whoop/archv2/feature/domain/c$f;

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/g$t;->E:Lcom/whoop/archv2/feature/domain/g;

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$t;->F:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v4, p0, Lcom/whoop/archv2/feature/domain/g$t;->G:Lc93/m;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/archv2/feature/domain/g$t;-><init>(Lcom/whoop/archv2/feature/domain/c$f;Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/archv2/feature/domain/g$t;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/g$t;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/archv2/feature/domain/g$t;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/archv2/feature/domain/g$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/g$t;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$t;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/archv2/feature/domain/g$t;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$t;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/archv2/feature/domain/i$c;

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/g$t;->z:Lcom/whoop/archv2/feature/domain/c$f;

    invoke-direct {p1, v2}, Lcom/whoop/archv2/feature/domain/i$c;-><init>(Lcom/whoop/archv2/feature/domain/c;)V

    iput-object v0, p0, Lcom/whoop/archv2/feature/domain/g$t;->y:Ljava/lang/Object;

    iput v5, p0, Lcom/whoop/archv2/feature/domain/g$t;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/g$t;->z:Lcom/whoop/archv2/feature/domain/c$f;

    invoke-virtual {p1}, Lcom/whoop/archv2/feature/domain/c$f;->a()Lcom/whoop/archv2/feature/domain/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/archv2/feature/domain/p;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_5

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$t;->E:Lcom/whoop/archv2/feature/domain/g;

    iget-object v5, p0, Lcom/whoop/archv2/feature/domain/g$t;->F:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v6, p0, Lcom/whoop/archv2/feature/domain/g$t;->G:Lc93/m;

    invoke-static {v3, p1, v5, v6}, Lcom/whoop/archv2/feature/domain/g;->g(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;)Lec3/l;

    move-result-object p1

    iput-object v2, p0, Lcom/whoop/archv2/feature/domain/g$t;->y:Ljava/lang/Object;

    iput-object v2, p0, Lcom/whoop/archv2/feature/domain/g$t;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/archv2/feature/domain/g$t;->x:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_5
    new-instance p1, Lcom/whoop/archv2/feature/domain/i$o;

    new-instance v4, Lcom/whoop/archv2/feature/domain/b$d;

    const/4 v6, 0x0

    invoke-direct {v4, v6, v5, v2}, Lcom/whoop/archv2/feature/domain/b$d;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v4}, Lcom/whoop/archv2/feature/domain/i$o;-><init>(Lcom/whoop/archv2/feature/domain/b;)V

    iput-object v2, p0, Lcom/whoop/archv2/feature/domain/g$t;->y:Ljava/lang/Object;

    iput-object v2, p0, Lcom/whoop/archv2/feature/domain/g$t;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/archv2/feature/domain/g$t;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
