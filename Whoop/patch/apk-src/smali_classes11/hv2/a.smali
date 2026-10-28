.class public final Lhv2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lhv2/a;",
        "",
        "Leb/a0;",
        "strengthTrainerNavController",
        "globalNavController",
        "",
        "isExerciseDetailsV2ExperimentEnabled",
        "<init>",
        "(Leb/a0;Leb/a0;Z)V",
        "Lgv2/a$g;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lgv2/a$g;)V",
        "Leb/a0;",
        "b",
        "c",
        "Z",
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

.field private final c:Z


# direct methods
.method public constructor <init>(Leb/a0;Leb/a0;Z)V
    .locals 1

    const-string v0, "strengthTrainerNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalNavController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhv2/a;->a:Leb/a0;

    iput-object p2, p0, Lhv2/a;->b:Leb/a0;

    iput-boolean p3, p0, Lhv2/a;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lgv2/a$g;)V
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgv2/a$e;->a:Lgv2/a$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lhv2/a;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lhv2/a;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    sget-object v0, Lgv2/a$f;->a:Lgv2/a$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    iget-object v2, p0, Lhv2/a;->a:Leb/a0;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->h(Lcom/whoop/weightlifting/StrengthTrainerDestination$h;Leb/a0;ZLjava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_1
    instance-of v0, p1, Lgv2/a$j;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    iget-object v1, p0, Lhv2/a;->a:Leb/a0;

    check-cast p1, Lgv2/a$j;

    invoke-virtual {p1}, Lgv2/a$j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->i(Leb/a0;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lhv2/a;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    :cond_2
    return-void

    :cond_3
    instance-of v0, p1, Lgv2/a$i;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$e;

    iget-object v1, p0, Lhv2/a;->a:Leb/a0;

    check-cast p1, Lgv2/a$i;

    invoke-virtual {p1}, Lgv2/a$i;->a()Ljava/lang/String;

    move-result-object p1

    iget-boolean v2, p0, Lhv2/a;->c:Z

    invoke-virtual {v0, v1, p1, v2}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->l(Leb/a0;Ljava/lang/String;Z)V

    return-void

    :cond_4
    instance-of p1, p1, Lgv2/a$h;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lhv2/a;->b:Leb/a0;

    const-string v0, "android-app://com.whoop/education?path=CUSTOM_EXERCISE_EDUCATION&screenName=Custom%20Exercise&entryPoint=customExercise"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
