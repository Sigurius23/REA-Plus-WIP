.class public final Lcom/whoop/weightlifting/StrengthTrainerDestination$b;
.super Lcom/whoop/weightlifting/StrengthTrainerDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/StrengthTrainerDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u000c\u001a\u00020\u000b*\u00020\n2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$b;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;",
        "<init>",
        "()V",
        "",
        "exerciseId",
        "source",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "Leb/a0;",
        "Ll83/a0;",
        "f",
        "(Leb/a0;Ljava/lang/String;Ljava/lang/String;)V",
        "exerciseIdToLink",
        "",
        "h",
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
.field public static final a:Lcom/whoop/weightlifting/StrengthTrainerDestination$b;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;

    invoke-direct {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$b;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 8

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->b(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "exerciseId"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v1, Leb/f;

    new-instance v2, Leb/m;

    invoke-direct {v2}, Leb/m;-><init>()V

    invoke-static {v2}, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->c(Leb/m;)Ll83/a0;

    iget-object v2, v2, Leb/m;->a:Leb/k;

    invoke-virtual {v2}, Leb/k;->a()Leb/l;

    move-result-object v2

    const-string v3, "source"

    invoke-direct {v1, v3, v2}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    filled-new-array {v0, v1}, [Leb/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0xd

    invoke-direct {v5, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v2, "customExerciseScreen"

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/weightlifting/StrengthTrainerDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->d(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Leb/m;)Ll83/a0;
    .locals 2

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->o:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    const/4 v0, 0x1

    iget-object v1, p0, Leb/m;->a:Leb/k;

    iput-boolean v0, v1, Leb/k;->a:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Leb/m;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final c(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->o:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    const-string v0, "Exercise Details"

    invoke-virtual {p0, v0}, Leb/m;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "exerciseId"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v2

    const-string v3, "linkedExerciseId"

    invoke-virtual {v2, v3}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_1

    const-string v5, "source"

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz v4, :cond_2

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    const-string v4, "Exercise Details"

    :cond_3
    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    if-eqz v2, :cond_5

    invoke-static {v2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    move-object v1, v0

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {p0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object p0

    invoke-virtual {p0, v3}, Landroidx/lifecycle/k1;->d(Ljava/lang/String;)V

    :cond_6
    move-object v0, v1

    :goto_2
    new-instance p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;

    invoke-direct {p0, v0, v4}, Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/weightlifting/StrengthTrainerDestination$b;Leb/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const-string p3, "Exercise Details"

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->f(Leb/a0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "exerciseId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "source"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p2, "Exercise Details"

    :cond_0
    new-instance p1, Ll83/k;

    invoke-direct {p1, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p1}, [Ll83/k;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f(Leb/a0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ll83/k;

    const-string v2, "exerciseId"

    invoke-direct {v1, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p3, "Exercise Details"

    :cond_0
    new-instance p2, Ll83/k;

    invoke-direct {p2, v0, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, p2}, [Ll83/k;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x6

    invoke-static {p1, p2, p3, v0}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void
.end method

.method public final h(Leb/a0;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseIdToLink"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Leb/n0;->I:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$b;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "linkedExerciseId"

    invoke-virtual {v0, p2, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    return p1
.end method
