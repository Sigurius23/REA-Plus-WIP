.class final Lgr0/c$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgr0/c;->t(Lec3/l;)Lec3/l;
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
        "Lgr0/b;",
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
    c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor$interact$1"
    f = "CommunityFollowerLookupInteractor.kt"
    l = {
        0x2b,
        0x2d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lgr0/c;

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
.method public constructor <init>(Lec3/l;Lgr0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lgr0/c;",
            "Lq83/d<",
            "-",
            "Lgr0/c$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgr0/c$j;->z:Lec3/l;

    iput-object p2, p0, Lgr0/c$j;->E:Lgr0/c;

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

    new-instance v0, Lgr0/c$j;

    iget-object v1, p0, Lgr0/c$j;->z:Lec3/l;

    iget-object v2, p0, Lgr0/c$j;->E:Lgr0/c;

    invoke-direct {v0, v1, v2, p2}, Lgr0/c$j;-><init>(Lec3/l;Lgr0/c;Lq83/d;)V

    iput-object p1, v0, Lgr0/c$j;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lgr0/c$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgr0/c$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgr0/c$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgr0/c$j;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lgr0/c$j;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lgr0/c$j;->x:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lgr0/c$j;->w:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, v0, Lgr0/c$j;->w:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v3

    new-instance v6, Lgr0/b;

    const/16 v15, 0xff

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lgr0/b;-><init>(ZZLcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;Ljava/lang/String;Lgr0/h;Lgr0/g;Ljava/util/Map;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v1, v0, Lgr0/c$j;->y:Ljava/lang/Object;

    iput-object v3, v0, Lgr0/c$j;->w:Ljava/lang/Object;

    iput v5, v0, Lgr0/c$j;->x:I

    invoke-interface {v1, v6, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v6, v0, Lgr0/c$j;->z:Lec3/l;

    iget-object v7, v0, Lgr0/c$j;->E:Lgr0/c;

    invoke-static {v7}, Lgr0/c;->e(Lgr0/c;)Lec3/l;

    move-result-object v7

    new-array v5, v5, [Lec3/l;

    const/4 v8, 0x0

    aput-object v7, v5, v8

    invoke-static {v6, v5}, Lor2/e0;->a(Lec3/l;[Lec3/l;)Lec3/l;

    move-result-object v5

    new-instance v6, Lgr0/c$j$a;

    iget-object v7, v0, Lgr0/c$j;->E:Lgr0/c;

    invoke-direct {v6, v3, v7, v1}, Lgr0/c$j$a;-><init>(Lkotlin/jvm/internal/g0;Lgr0/c;Lec3/m;)V

    const/4 v1, 0x0

    iput-object v1, v0, Lgr0/c$j;->y:Ljava/lang/Object;

    iput-object v1, v0, Lgr0/c$j;->w:Ljava/lang/Object;

    iput v4, v0, Lgr0/c$j;->x:I

    invoke-interface {v5, v6, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    :goto_1
    return-object v2

    :cond_4
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
