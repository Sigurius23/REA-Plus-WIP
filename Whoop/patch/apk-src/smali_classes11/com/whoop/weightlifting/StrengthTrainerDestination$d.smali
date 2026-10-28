.class public final Lcom/whoop/weightlifting/StrengthTrainerDestination$d;
.super Lcom/whoop/weightlifting/StrengthTrainerDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/StrengthTrainerDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004JW\u0010\u0010\u001a\u00020\u000f*\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$d;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;",
        "<init>",
        "()V",
        "Leb/a0;",
        "",
        "templateId",
        "",
        "activityId",
        "popUpToDestination",
        "",
        "isFromWhoopCoach",
        "isCopyFlow",
        "entryPoint",
        "Ll83/a0;",
        "l",
        "(Leb/a0;JLjava/lang/String;Lcom/whoop/weightlifting/StrengthTrainerDestination;ZZLjava/lang/String;)V",
        "sharedTemplateId",
        "m",
        "(Leb/a0;Ljava/lang/String;)V",
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
.field public static final a:Lcom/whoop/weightlifting/StrengthTrainerDestination$d;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;

    invoke-direct {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$d;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 8

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->d(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "templateId"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v1, Leb/f;

    new-instance v2, Leb/m;

    invoke-direct {v2}, Leb/m;-><init>()V

    invoke-static {v2}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->e(Leb/m;)Ll83/a0;

    iget-object v2, v2, Leb/m;->a:Leb/k;

    invoke-virtual {v2}, Leb/k;->a()Leb/l;

    move-result-object v2

    const-string v3, "activityId"

    invoke-direct {v1, v3, v2}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v2, Leb/f;

    new-instance v3, Leb/m;

    invoke-direct {v3}, Leb/m;-><init>()V

    invoke-static {v3}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->f(Leb/m;)Ll83/a0;

    iget-object v3, v3, Leb/m;->a:Leb/k;

    invoke-virtual {v3}, Leb/k;->a()Leb/l;

    move-result-object v3

    const-string v4, "sharedTemplateId"

    invoke-direct {v2, v4, v3}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v3, Leb/f;

    new-instance v4, Leb/m;

    invoke-direct {v4}, Leb/m;-><init>()V

    invoke-static {v4}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->g(Leb/m;)Ll83/a0;

    iget-object v4, v4, Leb/m;->a:Leb/k;

    invoke-virtual {v4}, Leb/k;->a()Leb/l;

    move-result-object v4

    const-string v5, "isFromWhoopCoach"

    invoke-direct {v3, v5, v4}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v4, Leb/f;

    new-instance v5, Leb/m;

    invoke-direct {v5}, Leb/m;-><init>()V

    invoke-static {v5}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->h(Leb/m;)Ll83/a0;

    iget-object v5, v5, Leb/m;->a:Leb/k;

    invoke-virtual {v5}, Leb/k;->a()Leb/l;

    move-result-object v5

    const-string v6, "isCopyFlow"

    invoke-direct {v4, v6, v5}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v5, Leb/f;

    new-instance v6, Leb/m;

    invoke-direct {v6}, Leb/m;-><init>()V

    invoke-static {v6}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->i(Leb/m;)Ll83/a0;

    iget-object v6, v6, Leb/m;->a:Leb/k;

    invoke-virtual {v6}, Leb/k;->a()Leb/l;

    move-result-object v6

    const-string v7, "entryPoint"

    invoke-direct {v5, v7, v6}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    filled-new-array/range {v0 .. v5}, [Leb/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0xe

    invoke-direct {v5, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v2, "editWorkout"

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/weightlifting/StrengthTrainerDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/weightlifting/StrengthTrainerDestination;Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->o(Lcom/whoop/weightlifting/StrengthTrainerDestination;Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Leb/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->k(Leb/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->j(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Leb/m;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/g1;->f:Leb/a1;

    invoke-virtual {p0, v0}, Leb/m;->b(Leb/g1;)V

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Leb/m;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Leb/m;)Ll83/a0;
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

.method private static final f(Leb/m;)Ll83/a0;
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

.method private static final g(Leb/m;)Ll83/a0;
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

.method private static final i(Leb/m;)Ll83/a0;
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

.method private static final j(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "isCopyFlow"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_0
    move v9, v1

    :goto_0
    invoke-virtual {p0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v0

    const-string v2, "indexOfFirstNewGroup"

    invoke-virtual {v0, v2}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v3, Lin2/e;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v1, v4, v2}, Lin2/e;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    new-instance v4, Lcu2/i;

    const/4 v0, 0x1

    invoke-direct {v4, p0, v0}, Lcu2/i;-><init>(Leb/q;I)V

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "templateId"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-wide/16 v6, -0x1

    cmp-long v0, v0, v6

    if-lez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v5, v2

    :goto_2
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "activityId"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    move-object v6, v0

    goto :goto_3

    :cond_3
    move-object v6, v2

    :goto_3
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "sharedTemplateId"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_4

    :cond_4
    move-object v7, v2

    :goto_4
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v1, "isFromWhoopCoach"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object v8, v0

    goto :goto_5

    :cond_5
    move-object v8, v2

    :goto_5
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_6

    const-string v0, "entryPoint"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_6
    move-object v10, v2

    new-instance v2, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    invoke-direct/range {v2 .. v10}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;-><init>(Lin2/e;Lc93/a;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;)V

    return-object v2
.end method

.method private static final k(Leb/q;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object p0

    const-string v0, "indexOfFirstNewGroup"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/k1;->d(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic n(Lcom/whoop/weightlifting/StrengthTrainerDestination$d;Leb/a0;JLjava/lang/String;Lcom/whoop/weightlifting/StrengthTrainerDestination;ZZLjava/lang/String;ILjava/lang/Object;)V
    .locals 8

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_0
    move-wide v0, p2

    :goto_0
    and-int/lit8 v2, p9, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    move-object v2, p4

    :goto_1
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_2

    sget-object v4, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

    goto :goto_2

    :cond_2
    move-object v4, p5

    :goto_2
    and-int/lit8 v5, p9, 0x8

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    move v5, p6

    :goto_3
    and-int/lit8 v7, p9, 0x10

    if-eqz v7, :cond_4

    goto :goto_4

    :cond_4
    move v6, p7

    :goto_4
    and-int/lit8 v7, p9, 0x20

    if-eqz v7, :cond_5

    move-object/from16 p10, v3

    :goto_5
    move-object p2, p0

    move-object p3, p1

    move-wide p4, v0

    move-object p6, v2

    move-object p7, v4

    move/from16 p8, v5

    move/from16 p9, v6

    goto :goto_6

    :cond_5
    move-object/from16 p10, p8

    goto :goto_5

    :goto_6
    invoke-virtual/range {p2 .. p10}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->l(Leb/a0;JLjava/lang/String;Lcom/whoop/weightlifting/StrengthTrainerDestination;ZZLjava/lang/String;)V

    return-void
.end method

.method private static final o(Lcom/whoop/weightlifting/StrengthTrainerDestination;Leb/y0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$navigate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object p0

    const-string v0, "route"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p0, p1, Leb/y0;->e:Ljava/lang/String;

    const/4 p0, -0x1

    iput p0, p1, Leb/y0;->d:I

    const/4 p0, 0x0

    iput-boolean p0, p1, Leb/y0;->f:Z

    iput-boolean p0, p1, Leb/y0;->g:Z

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot pop up to an empty route"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final l(Leb/a0;JLjava/lang/String;Lcom/whoop/weightlifting/StrengthTrainerDestination;ZZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/a0;",
            "J",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
            "*>;ZZ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    new-instance p3, Ll83/k;

    const-string v0, "templateId"

    invoke-direct {p3, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    const-string v0, "activityId"

    invoke-direct {p2, v0, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    new-instance p6, Ll83/k;

    const-string v0, "isFromWhoopCoach"

    invoke-direct {p6, v0, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    new-instance p7, Ll83/k;

    const-string v0, "isCopyFlow"

    invoke-direct {p7, v0, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p4, Ll83/k;

    const-string v0, "entryPoint"

    invoke-direct {p4, v0, p8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p3, p2, p6, p7, p4}, [Ll83/k;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lck1/c;

    const/16 p4, 0xc

    invoke-direct {p3, p5, p4}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2, p3}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final m(Leb/a0;Ljava/lang/String;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedTemplateId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p1, p2, v0, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void
.end method
