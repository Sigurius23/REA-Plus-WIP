.class public abstract Lpu2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpu2/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "Lcom/whoop/domain/model/UnitSystem;",
        "unitSystem",
        "Lo11/h$c;",
        "c",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/domain/model/UnitSystem;)Lo11/h$c;",
        "Lcom/whoop/design/util/TextResource$b;",
        "b",
        "(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource$b;",
        "",
        "a",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/lang/Integer;",
        "Lo11/h$c;",
        "emptyExerciseStats",
        "weightlifting_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lo11/h$c;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lo11/h$c;

    new-instance v1, Lsz0/q;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/16 v14, 0xfbd

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lsz0/q;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/16 v15, 0xfbd

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v2 .. v16}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lsz0/q;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const/16 v16, 0xfbd

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v5, 0x8

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lo11/h$c;-><init>(Lsz0/q;Lsz0/q;Lsz0/q;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpu2/j;->a:Lo11/h$c;

    return-void
.end method

.method public static final a(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/lang/Integer;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTimeAsIntSeconds()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getVolumeInputFormat()Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    sget-object v3, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->Time:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    if-ne v2, v3, :cond_1

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-result-object p0

    instance-of p0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;

    if-eqz p0, :cond_1

    return-object v0

    :cond_1
    return-object v1
.end method

.method public static final b(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource$b;
    .locals 1

    const-string v0, "unitSystem"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpu2/j$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget p0, Lcu2/h;->Y0:I

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget p0, Lcu2/h;->X0:I

    :goto_0
    invoke-static {p0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/domain/model/UnitSystem;)Lo11/h$c;
    .locals 23

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lpu2/j;->a:Lo11/h$c;

    return-object v0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object v3

    if-nez v3, :cond_1

    sget-object v0, Lpu2/j;->a:Lo11/h$c;

    return-object v0

    :cond_1
    new-instance v4, Lo11/h$c;

    new-instance v5, Lsz0/q;

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lcu2/h;->I1:I

    new-instance v8, Lcom/whoop/design/util/TextResource$d$b;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetIndex()I

    move-result v1

    const/4 v9, 0x1

    add-int/2addr v1, v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v8, v1}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    new-instance v1, Lcom/whoop/design/util/TextResource$d$b;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-direct {v1, v10}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    const/4 v10, 0x2

    new-array v10, v10, [Lcom/whoop/design/util/TextResource$d;

    const/4 v11, 0x0

    aput-object v8, v10, v11

    aput-object v1, v10, v9

    invoke-direct {v7, v6, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    sget v1, Lcu2/h;->H1:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    const/16 v18, 0xfbd

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move v1, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v5 .. v19}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getVolumeInputFormat()Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-result-object v0

    sget-object v6, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->Time:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    if-ne v0, v6, :cond_3

    new-instance v7, Lsz0/q;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    sget v0, Lgy0/f;->u1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr41/h;->G(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_1
    sget v0, Lcu2/h;->O1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v14

    const/16 v20, 0xfbd

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v7 .. v21}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_3
    new-instance v8, Lsz0/q;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getNumberOfReps()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_4

    sget v0, Lgy0/f;->u1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    :goto_2
    move-object v10, v0

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getNumberOfReps()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_2

    :goto_3
    sget v0, Lcu2/h;->r1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v15

    const/16 v21, 0xfbd

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v8 .. v22}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v8

    :goto_4
    new-instance v8, Lsz0/q;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getWeight()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    sget v0, Lgy0/f;->u1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    :goto_5
    move-object v10, v0

    goto :goto_6

    :cond_5
    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getWeight()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_5

    :goto_6
    invoke-static {v2}, Lpu2/j;->b(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource$b;

    move-result-object v15

    const/16 v21, 0xfbd

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v8 .. v22}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v5, v7, v8, v1}, Lo11/h$c;-><init>(Lsz0/q;Lsz0/q;Lsz0/q;Z)V

    return-object v4
.end method
