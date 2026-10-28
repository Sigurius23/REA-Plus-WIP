.class final Lbm1/e$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbm1/e;->c(Lcom/whoop/home/domain/models/StreakMetadata;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lf6/a;",
        "prefs",
        "Ll83/a0;",
        "<anonymous>",
        "(Lf6/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.streaks.StreaksHomePreviousStreakDataStoreHandler$updatePreviousStreakData$2"
    f = "StreaksHomePreviousStreakDataStoreHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lbm1/e;

.field final synthetic z:Lcom/whoop/home/domain/models/StreakMetadata;


# direct methods
.method public constructor <init>(Lbm1/e;Lcom/whoop/home/domain/models/StreakMetadata;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbm1/e;",
            "Lcom/whoop/home/domain/models/StreakMetadata;",
            "Lq83/d<",
            "-",
            "Lbm1/e$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbm1/e$c;->y:Lbm1/e;

    iput-object p2, p0, Lbm1/e$c;->z:Lcom/whoop/home/domain/models/StreakMetadata;

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

    new-instance v0, Lbm1/e$c;

    iget-object v1, p0, Lbm1/e$c;->y:Lbm1/e;

    iget-object v2, p0, Lbm1/e$c;->z:Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-direct {v0, v1, v2, p2}, Lbm1/e$c;-><init>(Lbm1/e;Lcom/whoop/home/domain/models/StreakMetadata;Lq83/d;)V

    iput-object p1, v0, Lbm1/e$c;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lbm1/e$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbm1/e$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbm1/e$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lf6/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbm1/e$c;->invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lbm1/e$c;->x:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbm1/e$c;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lts0/b;->a:Lts0/b;

    invoke-virtual {p1}, Lts0/b;->a()Lf6/d;

    move-result-object p1

    iget-object v1, p0, Lbm1/e$c;->y:Lbm1/e;

    invoke-static {v1}, Lbm1/e;->a(Lbm1/e;)Lcom/google/gson/Gson;

    move-result-object v1

    new-instance v2, Lbm1/a;

    iget-object v3, p0, Lbm1/e$c;->z:Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-virtual {v3}, Lcom/whoop/home/domain/models/StreakMetadata;->getStreakValue()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lbm1/e$c;->z:Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/StreakMetadata;->getStreakState()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lbm1/e$c;->z:Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-virtual {v5}, Lcom/whoop/home/domain/models/StreakMetadata;->getLottieUrl()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lbm1/e$c;->z:Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-virtual {v6}, Lcom/whoop/home/domain/models/StreakMetadata;->getImageUrl()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lbm1/e$c;->z:Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-virtual {v7}, Lcom/whoop/home/domain/models/StreakMetadata;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v7

    iget-object v8, p0, Lbm1/e$c;->z:Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-virtual {v8}, Lcom/whoop/home/domain/models/StreakMetadata;->getAnimationAccentColor()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v2 .. v8}, Lbm1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
