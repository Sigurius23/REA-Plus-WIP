.class final Lpu2/f$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpu2/f;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lpu2/i;Lou2/a;Lpu2/d;Lnu2/b;Liu2/a;Ltd1/b;Lnu2/e;Lnu2/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroidx/lifecycle/k1;Lbc3/c0;Lpu2/b;Leq1/a;Lus0/g;)V
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
        "Lnu2/c;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lnu2/c;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$domainState$1"
    f = "ActiveWorkoutViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lpu2/f;


# direct methods
.method public constructor <init>(Lpu2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpu2/f;",
            "Lq83/d<",
            "-",
            "Lpu2/f$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpu2/f$c;->y:Lpu2/f;

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

    new-instance v0, Lpu2/f$c;

    iget-object v1, p0, Lpu2/f$c;->y:Lpu2/f;

    invoke-direct {v0, v1, p2}, Lpu2/f$c;-><init>(Lpu2/f;Lq83/d;)V

    iput-object p1, v0, Lpu2/f$c;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lnu2/c;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu2/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lpu2/f$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpu2/f$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpu2/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu2/c;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpu2/f$c;->f(Lnu2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpu2/f$c;->x:Ljava/lang/Object;

    check-cast v0, Lnu2/c;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpu2/f$c;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnu2/c;->a()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lpu2/f$c;->y:Lpu2/f;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {v0}, Lpu2/f;->l(Lpu2/f;)Lus0/g;

    move-result-object v0

    const-string v1, "weightlifting"

    invoke-interface {v0, p1, v1}, Lus0/g;->a(ILjava/lang/String;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
