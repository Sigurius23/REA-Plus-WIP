.class public final Lou2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lou2/b;",
        "",
        "Leb/a0;",
        "strengthTrainerNavController",
        "Lj02/o0;",
        "appNavigator",
        "<init>",
        "(Leb/a0;Lj02/o0;)V",
        "Lhu2/a$k;",
        "event",
        "",
        "isExerciseDetailsV2ExperimentEnabled",
        "Ll83/a0;",
        "a",
        "(Lhu2/a$k;Z)V",
        "Leb/a0;",
        "b",
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

.field private final b:Lj02/o0;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;)V
    .locals 1

    const-string v0, "strengthTrainerNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appNavigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lou2/b;->a:Leb/a0;

    iput-object p2, p0, Lou2/b;->b:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final a(Lhu2/a$k;Z)V
    .locals 10

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhu2/a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lou2/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lhu2/a$i;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$e;

    iget-object v2, p0, Lou2/b;->a:Leb/a0;

    check-cast p1, Lhu2/a$i;

    invoke-virtual {p1}, Lhu2/a$i;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "Live Session"

    move v7, p2

    invoke-static/range {v1 .. v9}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->p(Lcom/whoop/weightlifting/StrengthTrainerDestination$e;Leb/a0;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_1
    instance-of p2, p1, Lhu2/c;

    if-eqz p2, :cond_2

    sget-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    iget-object v1, p0, Lou2/b;->a:Leb/a0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    const-string v3, "Live Session"

    invoke-static/range {v0 .. v5}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->h(Lcom/whoop/weightlifting/StrengthTrainerDestination$h;Leb/a0;ZLjava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_2
    instance-of p1, p1, Lhu2/a$j;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lou2/b;->b:Lj02/o0;

    new-instance p2, Lj02/m0$z1;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p2, v1, v0, v1}, Lj02/m0$z1;-><init>(Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p2}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
