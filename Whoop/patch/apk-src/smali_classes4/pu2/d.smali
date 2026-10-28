.class public final Lpu2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0008\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010&R\u0014\u0010*\u001a\u00020\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lpu2/d;",
        "",
        "Lod1/u;",
        "userContext",
        "<init>",
        "(Lod1/u;)V",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "Lpu2/q;",
        "g",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/q;",
        "",
        "currentHeartRate",
        "Lpu2/r;",
        "f",
        "(Ljava/lang/Integer;)Lpu2/r;",
        "currentSetTimeInSeconds",
        "Lpu2/s;",
        "h",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/Integer;)Lpu2/s;",
        "Lpu2/o;",
        "e",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/o;",
        "Lsz0/q;",
        "Lpu2/p;",
        "i",
        "(Lsz0/q;)Lpu2/p;",
        "Lcom/whoop/design/util/TextResource;",
        "label",
        "a",
        "(Lcom/whoop/design/util/TextResource;)Lpu2/p;",
        "Lpu2/n;",
        "d",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/n;",
        "Lnu2/c;",
        "domainState",
        "Lpu2/e;",
        "c",
        "(Lnu2/c;)Lpu2/e;",
        "Lod1/u;",
        "Lcom/whoop/domain/model/UnitSystem;",
        "b",
        "()Lcom/whoop/domain/model/UnitSystem;",
        "unitSystem",
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
.field private final a:Lod1/u;


# direct methods
.method public constructor <init>(Lod1/u;)V
    .locals 1

    const-string v0, "userContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpu2/d;->a:Lod1/u;

    return-void
.end method

.method private final a(Lcom/whoop/design/util/TextResource;)Lpu2/p;
    .locals 3

    new-instance v0, Lpu2/p;

    sget v1, Lgy0/f;->u1:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget v2, Lcu2/c;->i:I

    invoke-direct {v0, v1, p1, v2, v2}, Lpu2/p;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    return-object v0
.end method

.method private final b()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    iget-object v0, p0, Lpu2/d;->a:Lod1/u;

    invoke-virtual {v0}, Lod1/u;->f()Lcom/whoop/domain/model/User;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getProfile()Lcom/whoop/domain/model/UserProfile;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/domain/model/UserProfile;->getUnitSystem()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-static {}, Liu2/c;->a()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    return-object v0
.end method

.method private final d(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/n;
    .locals 6

    new-instance v0, Lpu2/n;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    if-nez v2, :cond_3

    instance-of v2, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    instance-of v2, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz v2, :cond_1

    new-instance v1, Lhu2/a$f;

    sget-object v2, Ldu2/c;->NOTIFICATION:Ldu2/c;

    invoke-direct {v1, v2}, Lhu2/a$f;-><init>(Ldu2/c;)V

    goto :goto_1

    :cond_1
    instance-of v1, v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz v1, :cond_2

    sget-object v1, Lhu2/a$g;->w:Lhu2/a$g;

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    new-instance v1, Lhu2/a$t;

    sget-object v2, Ldu2/c;->NOTIFICATION:Ldu2/c;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, Lhu2/a$t;-><init>(Ldu2/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    if-nez v3, :cond_7

    instance-of v3, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    instance-of v3, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz v3, :cond_5

    sget v2, Lgy0/a;->w3:I

    goto :goto_3

    :cond_5
    instance-of v2, v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz v2, :cond_6

    sget v2, Lgy0/a;->x3:I

    goto :goto_3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    sget v2, Lgy0/a;->r2:I

    :goto_3
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v3

    instance-of v4, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    if-nez v4, :cond_b

    instance-of v4, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    if-eqz v4, :cond_8

    goto :goto_5

    :cond_8
    instance-of v4, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-nez v4, :cond_a

    instance-of v3, v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    :goto_4
    sget v3, Lcu2/c;->d:I

    goto :goto_6

    :cond_b
    :goto_5
    sget v3, Lcu2/c;->c:I

    :goto_6
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v4

    instance-of v5, v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    if-nez v5, :cond_f

    instance-of v5, v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    if-eqz v5, :cond_c

    goto :goto_8

    :cond_c
    instance-of v5, v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-nez v5, :cond_e

    instance-of v4, v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz v4, :cond_d

    goto :goto_7

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_e
    :goto_7
    sget v4, Lcu2/d;->b:I

    goto :goto_9

    :cond_f
    :goto_8
    sget v4, Lcu2/d;->a:I

    :goto_9
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object p1

    instance-of v5, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    if-nez v5, :cond_13

    instance-of v5, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    if-eqz v5, :cond_10

    goto :goto_b

    :cond_10
    instance-of v5, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz v5, :cond_11

    sget p1, Lcu2/h;->k:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    :goto_a
    move-object v5, p1

    goto :goto_c

    :cond_11
    instance-of p1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz p1, :cond_12

    sget p1, Lcu2/h;->K0:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    goto :goto_a

    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_13
    :goto_b
    sget p1, Lcu2/h;->H:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    goto :goto_a

    :goto_c
    invoke-direct/range {v0 .. v5}, Lpu2/n;-><init>(Lhu2/a$c0;IIILcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private final e(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/o;
    .locals 4

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lpu2/d;->b()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    invoke-static {p1, v0}, Lpu2/j;->c(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/domain/model/UnitSystem;)Lo11/h$c;

    move-result-object p1

    new-instance v0, Lpu2/o;

    invoke-virtual {p1}, Lo11/h$c;->a()Lsz0/q;

    move-result-object v1

    invoke-direct {p0, v1}, Lpu2/d;->i(Lsz0/q;)Lpu2/p;

    move-result-object v1

    invoke-virtual {p1}, Lo11/h$c;->b()Lsz0/q;

    move-result-object v2

    const-string v3, "Required value was null."

    if-eqz v2, :cond_2

    invoke-direct {p0, v2}, Lpu2/d;->i(Lsz0/q;)Lpu2/p;

    move-result-object v2

    invoke-virtual {p1}, Lo11/h$c;->c()Lsz0/q;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Lpu2/d;->i(Lsz0/q;)Lpu2/p;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lpu2/o;-><init>(Lpu2/p;Lpu2/p;Lpu2/p;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    new-instance p1, Lpu2/o;

    sget v0, Lcu2/h;->H1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lpu2/d;->a(Lcom/whoop/design/util/TextResource;)Lpu2/p;

    move-result-object v0

    sget v1, Lcu2/h;->r1:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {p0, v1}, Lpu2/d;->a(Lcom/whoop/design/util/TextResource;)Lpu2/p;

    move-result-object v1

    invoke-direct {p0}, Lpu2/d;->b()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v2

    invoke-static {v2}, Lpu2/j;->b(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    invoke-direct {p0, v2}, Lpu2/d;->a(Lcom/whoop/design/util/TextResource;)Lpu2/p;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lpu2/o;-><init>(Lpu2/p;Lpu2/p;Lpu2/p;)V

    return-object p1
.end method

.method private final f(Ljava/lang/Integer;)Lpu2/r;
    .locals 4

    new-instance v0, Lpu2/r;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget p1, Lgy0/f;->u1:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    :cond_1
    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Lpu2/r;-><init>(Lcom/whoop/design/util/TextResource;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final g(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/q;
    .locals 9

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    if-eqz v1, :cond_0

    new-instance v2, Lpu2/q;

    sget p1, Lcu2/h;->W1:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v4, Lcu2/c;->g:I

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lpu2/q;-><init>(Lcom/whoop/design/util/TextResource;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    instance-of v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz v1, :cond_1

    new-instance v2, Lpu2/q;

    sget p1, Lcu2/h;->j0:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v4, Lcu2/c;->f:I

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lpu2/q;-><init>(Lcom/whoop/design/util/TextResource;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    instance-of v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    new-instance v3, Lpu2/q;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getName()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v3 .. v8}, Lpu2/q;-><init>(Lcom/whoop/design/util/TextResource;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_3
    instance-of v0, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz v0, :cond_5

    new-instance v3, Lpu2/q;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getName()Ljava/lang/String;

    move-result-object v2

    :cond_4
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lpu2/q;-><init>(Lcom/whoop/design/util/TextResource;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/Integer;)Lpu2/s;
    .locals 5

    invoke-static {p1}, Lpu2/j;->a(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Lq81/a;->k(IZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_1
    if-eqz p2, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt p2, v0, :cond_2

    sget p1, Lcu2/c;->h:I

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object p1

    instance-of p2, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;

    if-eqz p2, :cond_3

    sget p1, Lcu2/c;->e:I

    goto :goto_0

    :cond_3
    instance-of p2, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz p2, :cond_4

    sget p1, Lcu2/c;->a:I

    goto :goto_0

    :cond_4
    instance-of p2, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;

    if-eqz p2, :cond_5

    sget p1, Lcu2/c;->g:I

    goto :goto_0

    :cond_5
    instance-of p1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;

    if-eqz p1, :cond_6

    sget p1, Lcu2/c;->f:I

    :goto_0
    new-instance p2, Lpu2/s;

    invoke-direct {p2, v1, p1}, Lpu2/s;-><init>(Lcom/whoop/design/util/TextResource;I)V

    return-object p2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final i(Lsz0/q;)Lpu2/p;
    .locals 7

    new-instance v0, Lpu2/p;

    invoke-virtual {p1}, Lsz0/q;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lsz0/q;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lpu2/p;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lnu2/c;)Lpu2/e;
    .locals 6

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lnu2/c;->e()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getGroups()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lpu2/e$b;->a:Lpu2/e$b;

    goto :goto_0

    :cond_0
    move-object v1, v0

    new-instance v0, Lpu2/e$a;

    move-object v2, v1

    invoke-direct {p0, v2}, Lpu2/d;->g(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/q;

    move-result-object v1

    invoke-virtual {p1}, Lnu2/c;->a()Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {p0, v3}, Lpu2/d;->f(Ljava/lang/Integer;)Lpu2/r;

    move-result-object v3

    invoke-virtual {p1}, Lnu2/c;->b()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lpu2/d;->h(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/Integer;)Lpu2/s;

    move-result-object p1

    invoke-direct {p0, v2}, Lpu2/d;->e(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/o;

    move-result-object v4

    invoke-direct {p0, v2}, Lpu2/d;->d(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/n;

    move-result-object v5

    move-object v2, v3

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lpu2/e$a;-><init>(Lpu2/q;Lpu2/r;Lpu2/s;Lpu2/o;Lpu2/n;)V

    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    return-object p1

    :cond_2
    :goto_1
    sget-object p1, Lpu2/e$b;->a:Lpu2/e$b;

    return-object p1
.end method
