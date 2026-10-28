.class public final Lmp0/s0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmp0/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lmp0/s0$a;",
        "",
        "<init>",
        "()V",
        "",
        "selectedRadioId",
        "Landroid/content/res/Resources;",
        "resources",
        "Lkp0/q;",
        "weeklyGoal",
        "Lkp0/r;",
        "weeklyGoalSleep",
        "Lkp0/k;",
        "optimizeSleep",
        "Lkp0/o;",
        "c",
        "(ILandroid/content/res/Resources;Lkp0/q;Lkp0/r;Lkp0/k;)Lkp0/o;",
        "setting",
        "",
        "isWeeklyPlanV2SleepFFOn",
        "a",
        "(Lkp0/o;Z)I",
        "sleepGoalSetting",
        "b",
        "(Lkp0/o;)I",
        "sleep-coach_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmp0/s0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkp0/o;Z)I
    .locals 1

    const-string v0, "setting"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkp0/l;

    if-eqz v0, :cond_0

    sget p1, Lqe2/e;->G0:I

    return p1

    :cond_0
    instance-of v0, p1, Lkp0/m;

    if-eqz v0, :cond_1

    sget p1, Lqe2/e;->H0:I

    return p1

    :cond_1
    instance-of v0, p1, Lkp0/d;

    if-eqz v0, :cond_2

    sget p1, Lqe2/e;->E0:I

    return p1

    :cond_2
    instance-of v0, p1, Lkp0/q;

    if-eqz v0, :cond_3

    sget p1, Lqe2/e;->I0:I

    return p1

    :cond_3
    instance-of v0, p1, Lkp0/r;

    if-eqz v0, :cond_5

    if-eqz p2, :cond_4

    sget p1, Lqe2/e;->K0:I

    return p1

    :cond_4
    sget p1, Lqe2/e;->J0:I

    return p1

    :cond_5
    instance-of p1, p1, Lkp0/k;

    if-eqz p1, :cond_6

    sget p1, Lqe2/e;->F0:I

    return p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(Lkp0/o;)I
    .locals 1

    const-string v0, "sleepGoalSetting"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkp0/k;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of v0, p1, Lkp0/l;

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    instance-of v0, p1, Lkp0/m;

    if-eqz v0, :cond_2

    const/4 p1, 0x2

    return p1

    :cond_2
    instance-of v0, p1, Lkp0/d;

    if-eqz v0, :cond_3

    const/4 p1, 0x3

    return p1

    :cond_3
    instance-of v0, p1, Lkp0/q;

    if-eqz v0, :cond_4

    const/4 p1, 0x4

    return p1

    :cond_4
    instance-of p1, p1, Lkp0/r;

    if-eqz p1, :cond_5

    const/4 p1, 0x5

    return p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final c(ILandroid/content/res/Resources;Lkp0/q;Lkp0/r;Lkp0/k;)Lkp0/o;
    .locals 1

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lqe2/e;->G0:I

    if-ne p1, v0, :cond_0

    sget-object p1, Lkp0/l;->z:Lkp0/l;

    return-object p1

    :cond_0
    sget v0, Lqe2/e;->H0:I

    if-ne p1, v0, :cond_1

    sget-object p1, Lkp0/m;->z:Lkp0/m;

    return-object p1

    :cond_1
    sget v0, Lqe2/e;->E0:I

    if-ne p1, v0, :cond_2

    sget-object p1, Lkp0/d;->z:Lkp0/d;

    return-object p1

    :cond_2
    sget v0, Lqe2/e;->I0:I

    if-ne p1, v0, :cond_4

    if-nez p3, :cond_3

    sget-object p1, Lkp0/l;->z:Lkp0/l;

    return-object p1

    :cond_3
    return-object p3

    :cond_4
    sget p3, Lqe2/e;->J0:I

    if-eq p1, p3, :cond_8

    sget p3, Lqe2/e;->K0:I

    if-ne p1, p3, :cond_5

    goto :goto_0

    :cond_5
    sget p3, Lqe2/e;->F0:I

    if-ne p1, p3, :cond_7

    if-nez p5, :cond_6

    sget-object p1, Lkp0/l;->z:Lkp0/l;

    return-object p1

    :cond_6
    return-object p5

    :cond_7
    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Unknown radio button id "

    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_8
    :goto_0
    if-nez p4, :cond_9

    sget-object p1, Lkp0/l;->z:Lkp0/l;

    return-object p1

    :cond_9
    return-object p4
.end method
