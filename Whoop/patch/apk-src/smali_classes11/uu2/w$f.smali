.class final Luu2/w$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luu2/w;->J(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/a0;Leb/a0;Lj02/o0;Lfi0/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ScreenKt$ExerciseDetailsV2Screen$4$1"
    f = "ExerciseDetailsV2Screen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Leb/a0;

.field final synthetic y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

.field final synthetic z:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Leb/a0;Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/a0;",
            "Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Luu2/w$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Luu2/w$f;->x:Leb/a0;

    iput-object p2, p0, Luu2/w$f;->y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    iput-object p3, p0, Luu2/w$f;->z:Ll83/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Luu2/w$f;

    iget-object v0, p0, Luu2/w$f;->x:Leb/a0;

    iget-object v1, p0, Luu2/w$f;->y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    iget-object v2, p0, Luu2/w$f;->z:Ll83/h;

    invoke-direct {p1, v0, v1, v2, p2}, Luu2/w$f;-><init>(Leb/a0;Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Ll83/h;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Luu2/w$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Luu2/w$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Luu2/w$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Luu2/w$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Luu2/w$f;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Luu2/w$f;->x:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->h()Leb/q;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Luu2/w$f;->y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    iget-object v1, p0, Luu2/w$f;->z:Ll83/h;

    const-string v2, "exerciseDetailsRefresh"

    invoke-virtual {p1, v2}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-static {v1}, Luu2/w;->b0(Ll83/h;)Luu2/x;

    move-result-object v1

    new-instance v4, Luu2/p$d;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;->b()Lcu2/b;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v3, v5, v0}, Luu2/p$d;-><init>(Ljava/lang/String;Lcu2/b;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Luu2/x;->n(Luu2/p$g;)V

    invoke-virtual {p1, v2}, Landroidx/lifecycle/k1;->d(Ljava/lang/String;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
