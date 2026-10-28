.class public final Lyu2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lyu2/a;",
        "",
        "Leb/a0;",
        "strengthTrainerNavController",
        "globalNavController",
        "Lj02/o0;",
        "appNavigator",
        "<init>",
        "(Leb/a0;Leb/a0;Lj02/o0;)V",
        "Lhu2/b$f;",
        "event",
        "",
        "isExerciseDetailsV2ExperimentEnabled",
        "Ll83/a0;",
        "a",
        "(Lhu2/b$f;Z)V",
        "Leb/a0;",
        "b",
        "c",
        "Lj02/o0;",
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
.field private final a:Leb/a0;

.field private final b:Leb/a0;

.field private final c:Lj02/o0;


# direct methods
.method public constructor <init>(Leb/a0;Leb/a0;Lj02/o0;)V
    .locals 1

    const-string v0, "strengthTrainerNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalNavController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appNavigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyu2/a;->a:Leb/a0;

    iput-object p2, p0, Lyu2/a;->b:Leb/a0;

    iput-object p3, p0, Lyu2/a;->c:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final a(Lhu2/b$f;Z)V
    .locals 10

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lhu2/b$c;->w:Lhu2/b$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lyu2/a;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    sget-object v0, Lhu2/c;->w:Lhu2/c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    iget-object v2, p0, Lyu2/a;->a:Leb/a0;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->h(Lcom/whoop/weightlifting/StrengthTrainerDestination$h;Leb/a0;ZLjava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_1
    sget-object v0, Lhu2/b$h;->w:Lhu2/b$h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lyu2/a;->c:Lj02/o0;

    new-instance p2, Lj02/m0$z1;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p2, v1, v0, v1}, Lj02/m0$z1;-><init>(Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p2}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    sget-object v0, Lhu2/b$o;->w:Lhu2/b$o;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lcom/whoop/weightlifting/StrengthTrainerDestination$c;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$c;

    iget-object p2, p0, Lyu2/a;->a:Leb/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/StrengthTrainerDestination$c;->a(Leb/a0;)V

    return-void

    :cond_3
    sget-object v0, Lhu2/b$d;->w:Lhu2/b$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, Lyu2/a;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_4
    instance-of v0, p1, Lhu2/b$g;

    if-eqz v0, :cond_5

    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$e;

    iget-object v2, p0, Lyu2/a;->a:Leb/a0;

    check-cast p1, Lhu2/b$g;

    invoke-virtual {p1}, Lhu2/b$g;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "Workout Builder"

    move v7, p2

    invoke-static/range {v1 .. v9}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->p(Lcom/whoop/weightlifting/StrengthTrainerDestination$e;Leb/a0;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
