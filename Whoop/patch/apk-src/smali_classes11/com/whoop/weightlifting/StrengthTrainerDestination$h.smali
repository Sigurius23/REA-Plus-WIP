.class public final Lcom/whoop/weightlifting/StrengthTrainerDestination$h;
.super Lcom/whoop/weightlifting/StrengthTrainerDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/StrengthTrainerDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\r\u001a\u00020\u000c*\u00020\u000b2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0012\u001a\u00020\u000c*\u00020\u000b2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\u0008\u00030\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$h;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;",
        "<init>",
        "()V",
        "",
        "isLinkingExercise",
        "",
        "exerciseDetailsSource",
        "e",
        "(ZLjava/lang/String;)Ljava/lang/String;",
        "Leb/a0;",
        "Ll83/a0;",
        "g",
        "(Leb/a0;ZLjava/lang/String;)V",
        "",
        "indexOfFirstNewGroup",
        "popUpToDestination",
        "f",
        "(Leb/a0;Ljava/lang/Integer;Lcom/whoop/weightlifting/StrengthTrainerDestination;)V",
        "exerciseIdToSelect",
        "i",
        "(Leb/a0;Ljava/lang/String;)Z",
        "a",
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


# static fields
.field public static final a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    invoke-direct {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 9

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->b(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "linkingExerciseFlow"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->c(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "exerciseDetailsSource"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0x14

    invoke-direct {v7, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    const/4 v8, 0x0

    const-string v4, "selectExercises"

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/weightlifting/StrengthTrainerDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->d(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->l:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final c(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->o:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    const-string v0, "Workout Builder"

    invoke-virtual {p0, v0}, Leb/m;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v0

    const-string v1, "exerciseIdToSelect"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroidx/lifecycle/k1;->d(Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "linkingExerciseFlow"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v3, "exerciseDetailsSource"

    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    :cond_1
    const-string p0, "Workout Builder"

    :cond_2
    invoke-direct {v1, v0, v2, p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    return-object v1
.end method

.method public static synthetic h(Lcom/whoop/weightlifting/StrengthTrainerDestination$h;Leb/a0;ZLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const-string p3, "Workout Builder"

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->g(Leb/a0;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final e(ZLjava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "exerciseDetailsSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "linkingExerciseFlow"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, p1}, [Ll83/k;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f(Leb/a0;Ljava/lang/Integer;Lcom/whoop/weightlifting/StrengthTrainerDestination;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/a0;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "popUpToDestination"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Leb/a0;->h()Leb/q;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Leb/n0;->I:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v3, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    if-eqz v0, :cond_2

    iget-object v1, v0, Leb/n0;->I:Ljava/lang/String;

    :cond_2
    sget-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$d;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    sget-object v3, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$a;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/16 v10, 0x3b

    const/4 v11, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p1

    move-object v6, p3

    move-object v1, v0

    invoke-static/range {v1 .. v11}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->n(Lcom/whoop/weightlifting/StrengthTrainerDestination$d;Leb/a0;JLjava/lang/String;Lcom/whoop/weightlifting/StrengthTrainerDestination;ZZLjava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_4
    :goto_1
    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v1, "indexOfFirstNewGroup"

    invoke-virtual {v0, p2, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void
.end method

.method public final g(Leb/a0;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseDetailsSource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3}, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->e(ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x6

    invoke-static {p1, p2, p3, v0}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void
.end method

.method public final i(Leb/a0;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseIdToSelect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, v1, Leb/q;->x:Leb/n0;

    if-eqz v1, :cond_0

    iget-object v1, v1, Leb/n0;->I:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sget-object v2, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, p2, v0}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    return p1
.end method
