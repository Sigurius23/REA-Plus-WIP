.class final Lwg0/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwg0/f;->interact(Lec3/l;)Lec3/l;
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
        "Lwg0/h;",
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
    c = "com.whoop.ai.chat.domain.interpolation.TurnInterpolationInteractor$interact$1"
    f = "TurnInterpolationInteractor.kt"
    l = {
        0x35
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lwg0/f;

.field final synthetic F:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwg0/f;Lec3/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwg0/f;",
            "Lec3/l;",
            "Lq83/d<",
            "-",
            "Lwg0/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwg0/f$a;->E:Lwg0/f;

    iput-object p2, p0, Lwg0/f$a;->F:Lec3/l;

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

    new-instance v0, Lwg0/f$a;

    iget-object v1, p0, Lwg0/f$a;->E:Lwg0/f;

    iget-object v2, p0, Lwg0/f$a;->F:Lec3/l;

    invoke-direct {v0, v1, v2, p2}, Lwg0/f$a;-><init>(Lwg0/f;Lec3/l;Lq83/d;)V

    iput-object p1, v0, Lwg0/f$a;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lwg0/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwg0/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwg0/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwg0/f$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lwg0/f$a;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lwg0/f$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lwg0/f$a;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v0, p0, Lwg0/f$a;->w:Ljava/lang/Object;

    check-cast v0, Lwg0/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwg0/f$a;->E:Lwg0/f;

    invoke-static {p1}, Lwg0/f;->c(Lwg0/f;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v2, "android-coach-smooth-streaming"

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lwg0/e;->SMOOTH:Lwg0/e;

    goto :goto_0

    :cond_2
    sget-object p1, Lwg0/e;->CONTROL:Lwg0/e;

    :goto_0
    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v4, p0, Lwg0/f$a;->F:Lec3/l;

    new-instance v5, Lwg0/f$a$a;

    const/4 v6, 0x0

    invoke-direct {v5, v2, p1, v6}, Lwg0/f$a$a;-><init>(Lkotlin/jvm/internal/g0;Lwg0/e;Lq83/d;)V

    invoke-static {v4, v5}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    iput-object v6, p0, Lwg0/f$a;->z:Ljava/lang/Object;

    iput-object v6, p0, Lwg0/f$a;->w:Ljava/lang/Object;

    iput-object v6, p0, Lwg0/f$a;->x:Ljava/lang/Object;

    iput v3, p0, Lwg0/f$a;->y:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
