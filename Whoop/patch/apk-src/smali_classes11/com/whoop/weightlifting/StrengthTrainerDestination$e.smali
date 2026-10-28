.class public final Lcom/whoop/weightlifting/StrengthTrainerDestination$e;
.super Lcom/whoop/weightlifting/StrengthTrainerDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/StrengthTrainerDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J=\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJA\u0010\u0011\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$e;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;",
        "<init>",
        "()V",
        "",
        "exerciseId",
        "",
        "showSelectExerciseCTA",
        "Lcu2/b;",
        "entryPointType",
        "analyticsEntryPoint",
        "isExerciseDetailsV2ExperimentEnabled",
        "j",
        "(Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)Ljava/lang/String;",
        "Leb/a0;",
        "Ll83/a0;",
        "o",
        "(Leb/a0;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)V",
        "l",
        "(Leb/a0;Ljava/lang/String;Z)V",
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
.field public static final a:Lcom/whoop/weightlifting/StrengthTrainerDestination$e;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;

    invoke-direct {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$e;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 7

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->d(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "exerciseId"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v1, Leb/f;

    new-instance v2, Leb/m;

    invoke-direct {v2}, Leb/m;-><init>()V

    invoke-static {v2}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->e(Leb/m;)Ll83/a0;

    iget-object v2, v2, Leb/m;->a:Leb/k;

    invoke-virtual {v2}, Leb/k;->a()Leb/l;

    move-result-object v2

    const-string v3, "showCTA"

    invoke-direct {v1, v3, v2}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    filled-new-array {v0, v1}, [Leb/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->f(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "entryPointType"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v1, Leb/f;

    new-instance v2, Leb/m;

    invoke-direct {v2}, Leb/m;-><init>()V

    invoke-static {v2}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->g(Leb/m;)Ll83/a0;

    iget-object v2, v2, Leb/m;->a:Leb/k;

    invoke-virtual {v2}, Leb/k;->a()Leb/l;

    move-result-object v2

    const-string v4, "analyticsEntryPoint"

    invoke-direct {v1, v4, v2}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v2, Leb/f;

    new-instance v4, Leb/m;

    invoke-direct {v4}, Leb/m;-><init>()V

    invoke-static {v4}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->h(Leb/m;)Ll83/a0;

    iget-object v4, v4, Leb/m;->a:Leb/k;

    invoke-virtual {v4}, Leb/k;->a()Leb/l;

    move-result-object v4

    const-string v5, "isExerciseDetailsV2ExperimentEnabled"

    invoke-direct {v2, v5, v4}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    filled-new-array {v0, v1, v2}, [Leb/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0xf

    invoke-direct {v5, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    const/4 v6, 0x0

    const-string v2, "exerciseDetails"

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/weightlifting/StrengthTrainerDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Leb/k1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->n(Leb/k1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->i(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->m(Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->o:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->l:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->o:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    const-string v0, "INTERNAL"

    invoke-virtual {p0, v0}, Leb/m;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->o:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    const-string v0, ""

    invoke-virtual {p0, v0}, Leb/m;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->l:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Leb/m;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcu2/b;->getEntries()Lt83/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcu2/b;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_1

    const-string v5, "entryPointType"

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    check-cast v1, Lcu2/b;

    if-nez v1, :cond_3

    sget-object v1, Lcu2/b;->INTERNAL:Lcu2/b;

    :cond_3
    move-object v6, v1

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "exerciseId"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    goto :goto_2

    :cond_4
    move-object v4, v2

    :goto_2
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const-string v3, "showCTA"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    move v5, v0

    goto :goto_3

    :cond_5
    move v5, v1

    :goto_3
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v3, "analyticsEntryPoint"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_7

    :cond_6
    move-object v7, v2

    goto :goto_4

    :cond_7
    move-object v7, v0

    :goto_4
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_8

    const-string v0, "isExerciseDetailsV2ExperimentEnabled"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    :cond_8
    move v8, v1

    new-instance v3, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    invoke-direct/range {v3 .. v8}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;-><init>(Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)V

    return-object v3
.end method

.method public static synthetic k(Lcom/whoop/weightlifting/StrengthTrainerDestination$e;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    sget-object p3, Lcu2/b;->INTERNAL:Lcu2/b;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->j(Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Leb/y0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$navigate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$b;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/whoop/profile/view/edit/form/c;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    invoke-virtual {p0, v0, v1}, Leb/y0;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Leb/k1;)Ll83/a0;
    .locals 1

    const-string v0, "$this$popUpTo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/k1;->a:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic p(Lcom/whoop/weightlifting/StrengthTrainerDestination$e;Leb/a0;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    sget-object p4, Lcu2/b;->INTERNAL:Lcu2/b;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x8

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v5, p5

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_2

    const/4 p6, 0x0

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->o(Leb/a0;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    const-string v0, "exerciseId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "entryPointType"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v0, "showCTA"

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ll83/k;

    invoke-direct {p3, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-nez p4, :cond_0

    const-string p4, ""

    :cond_0
    new-instance p1, Ll83/k;

    const-string v0, "analyticsEntryPoint"

    invoke-direct {p1, v0, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    new-instance p5, Ll83/k;

    const-string v0, "isExerciseDetailsV2ExperimentEnabled"

    invoke-direct {p5, v0, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p2, p3, p1, p5}, [Ll83/k;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final l(Leb/a0;Ljava/lang/String;Z)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseId"

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
    invoke-virtual {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object p3

    if-eqz p3, :cond_1

    const-string v0, "exerciseDetailsRefresh"

    invoke-virtual {p3, p2, v0}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p2

    move v6, p3

    invoke-static/range {v1 .. v8}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->k(Lcom/whoop/weightlifting/StrengthTrainerDestination$e;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0x10

    invoke-direct {p3, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    invoke-virtual {p1, p2, p3}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final o(Leb/a0;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "entryPointType"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    new-instance p3, Ll83/k;

    const-string v0, "showCTA"

    invoke-direct {p3, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    new-instance p4, Ll83/k;

    invoke-direct {p4, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-nez p5, :cond_0

    const-string p5, ""

    :cond_0
    new-instance p2, Ll83/k;

    const-string v0, "analyticsEntryPoint"

    invoke-direct {p2, v0, p5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p5

    new-instance p6, Ll83/k;

    const-string v0, "isExerciseDetailsV2ExperimentEnabled"

    invoke-direct {p6, v0, p5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p3, p4, p2, p6}, [Ll83/k;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p4, 0x6

    invoke-static {p1, p2, p3, p4}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void
.end method
