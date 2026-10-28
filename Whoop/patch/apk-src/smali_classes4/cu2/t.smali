.class public final Lcu2/t;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcu2/t;",
        "Landroidx/lifecycle/w1;",
        "Ln92/e;",
        "iterableInAppMessagingClient",
        "Liu2/b;",
        "weightliftingRepository",
        "Llf1/f;",
        "experimentHelper",
        "<init>",
        "(Ln92/e;Liu2/b;Llf1/f;)V",
        "",
        "l",
        "()Z",
        "p",
        "(Lq83/d;)Ljava/lang/Object;",
        "j",
        "Ll83/a0;",
        "o",
        "()V",
        "onCleared",
        "w",
        "Ln92/e;",
        "x",
        "Liu2/b;",
        "y",
        "Llf1/f;",
        "Lec3/f2;",
        "z",
        "Lec3/f2;",
        "n",
        "()Lec3/f2;",
        "isExerciseDetailsV2ExperimentEnabled",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Ln92/e;

.field private final x:Liu2/b;

.field private final y:Llf1/f;

.field private final z:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln92/e;Liu2/b;Llf1/f;)V
    .locals 1

    const-string v0, "iterableInAppMessagingClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weightliftingRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experimentHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lcu2/t;->w:Ln92/e;

    iput-object p2, p0, Lcu2/t;->x:Liu2/b;

    iput-object p3, p0, Lcu2/t;->y:Llf1/f;

    new-instance p1, Lcu2/t$a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcu2/t$a;-><init>(Lcu2/t;Lq83/d;)V

    new-instance p2, Lec3/s1;

    invoke-direct {p2, p1}, Lec3/s1;-><init>(Lc93/m;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    sget-object p3, Lec3/z1;->a:Lec3/b2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, p1, p3, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lcu2/t;->z:Lec3/f2;

    return-void
.end method

.method public static final synthetic g(Lcu2/t;)Llf1/f;
    .locals 0

    iget-object p0, p0, Lcu2/t;->y:Llf1/f;

    return-object p0
.end method


# virtual methods
.method public final j(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, Lcu2/t;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcu2/t;->p(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lcu2/t;->x:Liu2/b;

    invoke-virtual {v0}, Liu2/b;->t()Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->getLastSavedActiveWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final n()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lcu2/t;->z:Lec3/f2;

    return-object v0
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Lcu2/t;->w:Ln92/e;

    invoke-interface {v0}, Ln92/e;->e()V

    return-void
.end method

.method public onCleared()V
    .locals 1

    invoke-super {p0}, Landroidx/lifecycle/w1;->onCleared()V

    iget-object v0, p0, Lcu2/t;->w:Ln92/e;

    invoke-interface {v0}, Ln92/e;->c()V

    return-void
.end method

.method public final p(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcu2/t;->x:Liu2/b;

    invoke-virtual {v0, p1}, Liu2/b;->x(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
