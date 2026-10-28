.class public final Lcom/whoop/weightlifting/StrengthTrainerDestination$a;
.super Lcom/whoop/weightlifting/StrengthTrainerDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/StrengthTrainerDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J+\u0010\r\u001a\u00020\u000c*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u000c*\u00020\u0005\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u000c*\u00020\u0005\u00a2\u0006\u0004\u0008\u0011\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$a;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;",
        "<init>",
        "()V",
        "Leb/a0;",
        "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "strapLocation",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "strapLaterality",
        "",
        "isQuickStart",
        "Ll83/a0;",
        "k",
        "(Leb/a0;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V",
        "n",
        "(Leb/a0;)V",
        "o",
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
.field public static final a:Lcom/whoop/weightlifting/StrengthTrainerDestination$a;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;

    invoke-direct {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 9

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->e(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "restoreState"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->f(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "strapLocation"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v1, Leb/f;

    new-instance v2, Leb/m;

    invoke-direct {v2}, Leb/m;-><init>()V

    invoke-static {v2}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->g(Leb/m;)Ll83/a0;

    iget-object v2, v2, Leb/m;->a:Leb/k;

    invoke-virtual {v2}, Leb/k;->a()Leb/l;

    move-result-object v2

    const-string v3, "strapLaterality"

    invoke-direct {v1, v3, v2}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    new-instance v2, Leb/f;

    new-instance v3, Leb/m;

    invoke-direct {v3}, Leb/m;-><init>()V

    invoke-static {v3}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->h(Leb/m;)Ll83/a0;

    iget-object v3, v3, Leb/m;->a:Leb/k;

    invoke-virtual {v3}, Leb/k;->a()Leb/l;

    move-result-object v3

    const-string v4, "isQuickStart"

    invoke-direct {v2, v4, v3}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    filled-new-array {v0, v1, v2}, [Leb/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0xb

    invoke-direct {v7, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    const/4 v8, 0x0

    const-string v4, "activeWorkout"

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/weightlifting/StrengthTrainerDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Leb/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->j(Leb/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->m(Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->p(Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->i(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;

    move-result-object p0

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

.method private static final i(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "strapLocation"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Lcom/whoop/weightlifting/data/domain/StrapLocation;->Wrist:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/StrapLocation;->values()[Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    if-ge v6, v4, :cond_2

    aget-object v7, v3, v6

    invoke-interface {v7}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    move-object v7, v1

    :goto_2
    if-nez v7, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object v9, v7

    :goto_3
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v2, "strapLaterality"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_4
    move-object v0, v1

    :goto_4
    sget-object v2, Lcom/whoop/weightlifting/data/domain/StrapLaterality;->Left:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/StrapLaterality;->values()[Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    move-result-object v3

    array-length v4, v3

    move v6, v5

    :goto_5
    if-ge v6, v4, :cond_6

    aget-object v7, v3, v6

    invoke-interface {v7}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_6
    move-object v7, v1

    :goto_6
    if-nez v7, :cond_7

    move-object v10, v2

    goto :goto_7

    :cond_7
    move-object v10, v7

    :goto_7
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_8

    const-string v2, "restoreState"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    move v11, v0

    goto :goto_8

    :cond_8
    move v11, v5

    :goto_8
    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v2, "isQuickStart"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    move v12, v0

    goto :goto_9

    :cond_9
    move v12, v5

    :goto_9
    invoke-virtual {p0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v0

    const-string v2, "indexOfFirstNewGroup"

    invoke-virtual {v0, v2}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v2, Lin2/e;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v5, v3, v1}, Lin2/e;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v2

    goto :goto_a

    :cond_a
    move-object v13, v1

    :goto_a
    new-instance v14, Lcu2/i;

    const/4 v0, 0x0

    invoke-direct {v14, p0, v0}, Lcu2/i;-><init>(Leb/q;I)V

    new-instance v8, Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;

    invoke-direct/range {v8 .. v14}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;-><init>(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZZLin2/e;Lc93/a;)V

    return-object v8
.end method

.method private static final j(Leb/q;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object p0

    const-string v0, "indexOfFirstNewGroup"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/k1;->d(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/weightlifting/StrengthTrainerDestination$a;Leb/a0;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->k(Leb/a0;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V

    return-void
.end method

.method private static final m(Leb/y0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$navigate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v0

    const-string v1, "route"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p0, Leb/y0;->e:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Leb/y0;->d:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Leb/y0;->f:Z

    iput-boolean v0, p0, Leb/y0;->g:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot pop up to an empty route"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final p(Leb/y0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$navigate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v0

    const-string v1, "route"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p0, Leb/y0;->e:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Leb/y0;->d:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Leb/y0;->f:Z

    iput-boolean v0, p0, Leb/y0;->g:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot pop up to an empty route"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final k(Leb/a0;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLocation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "strapLaterality"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v3, Ll83/k;

    const-string v4, "restoreState"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/StrapLocation;->getSerializedValue()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3}, Lcom/whoop/weightlifting/data/domain/StrapLaterality;->getSerializedValue()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ll83/k;

    invoke-direct {p3, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    new-instance p4, Ll83/k;

    const-string v0, "isQuickStart"

    invoke-direct {p4, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v2, p3, p4}, [Ll83/k;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lcom/whoop/profile/view/edit/form/c;

    const/16 p4, 0xc

    invoke-direct {p3, p4}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    invoke-virtual {p1, p2, p3}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final n(Leb/a0;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/weightlifting/data/domain/StrapLocation;->Wrist:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/StrapLaterality;->Left:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->k(Leb/a0;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V

    return-void
.end method

.method public final o(Leb/a0;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v1, Ll83/k;

    const-string v2, "restoreState"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/whoop/profile/view/edit/form/c;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
