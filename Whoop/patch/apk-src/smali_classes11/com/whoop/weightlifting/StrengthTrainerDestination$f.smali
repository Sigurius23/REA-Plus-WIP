.class public final Lcom/whoop/weightlifting/StrengthTrainerDestination$f;
.super Lcom/whoop/weightlifting/StrengthTrainerDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/StrengthTrainerDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\t\u001a\u00020\u0008*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$f;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;",
        "<init>",
        "()V",
        "Leb/a0;",
        "",
        "isBuildingNewWorkout",
        "Ll83/a0;",
        "d",
        "(Leb/a0;Z)V",
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
.field public static final a:Lcom/whoop/weightlifting/StrengthTrainerDestination$f;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$f;

    invoke-direct {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$f;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$f;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$f;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$f;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 10

    new-instance v0, Leb/f;

    new-instance v1, Leb/m;

    invoke-direct {v1}, Leb/m;-><init>()V

    invoke-static {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$f;->b(Leb/m;)Ll83/a0;

    iget-object v1, v1, Leb/m;->a:Leb/k;

    invoke-virtual {v1}, Leb/k;->a()Leb/l;

    move-result-object v1

    const-string v2, "isBuildingNewWorkout"

    invoke-direct {v0, v2, v1}, Leb/f;-><init>(Ljava/lang/String;Leb/l;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v7, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0x12

    invoke-direct {v7, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v4, "inputWorkoutName"

    const/4 v6, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v9}, Lcom/whoop/weightlifting/StrengthTrainerDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$f;->c(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;

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

.method private static final c(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "isBuildingNewWorkout"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    invoke-direct {v0, p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;-><init>(Z)V

    return-object v0
.end method


# virtual methods
.method public final d(Leb/a0;Z)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    new-instance v0, Ll83/k;

    const-string v1, "isBuildingNewWorkout"

    invoke-direct {v0, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->routeWithArgs([Ll83/k;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p1, p2, v0, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void
.end method
