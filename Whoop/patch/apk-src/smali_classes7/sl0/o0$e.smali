.class final Lsl0/o0$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/o0;->J(Ln0/u;Lc93/a;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.bot.view.AiConversationScreenContentKt$OnKeyboardOpenScrollHandler$1$1"
    f = "AiConversationScreenContent.kt"
    l = {
        0x10e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic F:Lg2/i;

.field final synthetic G:Ln0/u;

.field w:I

.field final synthetic x:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field final synthetic y:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic z:Ly3/c;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lp1/t2;Ly3/c;Lc93/a;Lg2/i;Ln0/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lp1/t2;",
            "Ly3/c;",
            "Lc93/a;",
            "Lg2/i;",
            "Ln0/u;",
            "Lq83/d<",
            "-",
            "Lsl0/o0$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/o0$e;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p2, p0, Lsl0/o0$e;->y:Lp1/t2;

    iput-object p3, p0, Lsl0/o0$e;->z:Ly3/c;

    iput-object p4, p0, Lsl0/o0$e;->E:Lc93/a;

    iput-object p5, p0, Lsl0/o0$e;->F:Lg2/i;

    iput-object p6, p0, Lsl0/o0$e;->G:Ln0/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/t2;Ly3/c;)F
    .locals 0

    invoke-static {p0, p1}, Lsl0/o0$e;->h(Lp1/t2;Ly3/c;)F

    move-result p0

    return p0
.end method

.method private static final h(Lp1/t2;Ly3/c;)F
    .locals 0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll0/b2;

    invoke-interface {p0, p1}, Ll0/b2;->c(Ly3/c;)I

    move-result p0

    int-to-float p0, p0

    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lsl0/o0$e;

    iget-object v1, p0, Lsl0/o0$e;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v2, p0, Lsl0/o0$e;->y:Lp1/t2;

    iget-object v3, p0, Lsl0/o0$e;->z:Ly3/c;

    iget-object v4, p0, Lsl0/o0$e;->E:Lc93/a;

    iget-object v5, p0, Lsl0/o0$e;->F:Lg2/i;

    iget-object v6, p0, Lsl0/o0$e;->G:Ln0/u;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lsl0/o0$e;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lp1/t2;Ly3/c;Lc93/a;Lg2/i;Ln0/u;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/o0$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/o0$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/o0$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/o0$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/o0$e;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/o0$e;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "coach-message-streaming-android-v2"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lsl0/o0$e;->y:Lp1/t2;

    iget-object v1, p0, Lsl0/o0$e;->z:Ly3/c;

    new-instance v3, Lsl0/a0;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p1, v1}, Lsl0/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lsl0/e2;

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v4, v4, v3, v5}, Lsl0/e2;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lsl0/o0$e$a;

    invoke-direct {v3, v5}, Lsl0/o0$e$a;-><init>(Lq83/d;)V

    new-instance v4, Lec3/l1;

    invoke-direct {v4, v1, p1, v3}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lsl0/o0$e$c;

    invoke-direct {p1, v4}, Lsl0/o0$e$c;-><init>(Lec3/l;)V

    new-instance v1, Lsl0/o0$e$b;

    iget-object v3, p0, Lsl0/o0$e;->E:Lc93/a;

    iget-object v4, p0, Lsl0/o0$e;->F:Lg2/i;

    iget-object v5, p0, Lsl0/o0$e;->G:Ln0/u;

    invoke-direct {v1, v3, v4, v5}, Lsl0/o0$e$b;-><init>(Lc93/a;Lg2/i;Ln0/u;)V

    iput v2, p0, Lsl0/o0$e;->w:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
