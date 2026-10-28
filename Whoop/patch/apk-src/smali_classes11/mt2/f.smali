.class public final Lmt2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmt2/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u000c2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001bR\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lmt2/f;",
        "",
        "Leb/a0;",
        "composeNavController",
        "Lls2/b;",
        "analyticHelper",
        "",
        "planName",
        "category",
        "<init>",
        "(Leb/a0;Lls2/b;Ljava/lang/String;Ljava/lang/String;)V",
        "event",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/Object;)V",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "targetGoalType",
        "b",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V",
        "screen",
        "c",
        "(Ljava/lang/String;)V",
        "action",
        "d",
        "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V",
        "Leb/a0;",
        "Lls2/b;",
        "Ljava/lang/String;",
        "weekly-plan_release"
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

.field private final b:Lls2/b;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Leb/a0;Lls2/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "composeNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "planName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmt2/f;->a:Leb/a0;

    iput-object p2, p0, Lmt2/f;->b:Lls2/b;

    iput-object p3, p0, Lmt2/f;->c:Ljava/lang/String;

    iput-object p4, p0, Lmt2/f;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lmt2/g$b;

    if-eqz v0, :cond_2

    check-cast p1, Lmt2/g$b;

    invoke-virtual {p1}, Lmt2/g$b;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lmt2/f$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const-string v0, "Close"

    invoke-virtual {p1}, Lmt2/g$b;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lmt2/f;->d(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lmt2/g$b;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p1

    invoke-virtual {p0, p1}, Lmt2/f;->b(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    :goto_1
    iget-object p1, p0, Lmt2/f;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    instance-of v0, p1, Lmt2/g$g;

    const/4 v1, 0x6

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Lmt2/g$g;

    invoke-virtual {p1}, Lmt2/g$g;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p1

    const-string v0, "Edit Plan"

    invoke-virtual {p0, v0, p1}, Lmt2/f;->d(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    iget-object p1, p0, Lmt2/f;->a:Leb/a0;

    const-string v0, "SLIDER_CUSTOMIZATION"

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_3
    instance-of v0, p1, Lmt2/g$e;

    const-string v3, "toLowerCase(...)"

    if-eqz v0, :cond_4

    const-string p1, "Metrics"

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lmt2/f;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lmt2/f;->a:Leb/a0;

    const-string v0, "CONTRIBUTOR_SELECTION"

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_4
    instance-of v0, p1, Lmt2/g$a;

    if-eqz v0, :cond_5

    const-string p1, "Activities"

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lmt2/f;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lmt2/f;->a:Leb/a0;

    const-string v0, "ACTIVITY_SELECTION"

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_5
    instance-of p1, p1, Lmt2/g$c;

    if-eqz p1, :cond_6

    const-string p1, "Behaviors"

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lmt2/f;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lmt2/f;->a:Leb/a0;

    const-string v0, "BEHAVIOR_SELECTION"

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    :cond_6
    return-void
.end method

.method public final b(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p0, Lmt2/f;->b:Lls2/b;

    sget-object v1, Lmt2/f$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    const-string v2, "toLowerCase(...)"

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const-string p1, "Metrics"

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Behaviors"

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "Activities"

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    new-instance v1, Lls2/a$d;

    const-string v2, "Close"

    invoke-direct {v1, v2, p1}, Lls2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lls2/b;->q(Lls2/a;)V

    :cond_2
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmt2/f;->b:Lls2/b;

    new-instance v1, Lls2/a$h;

    iget-object v2, p0, Lmt2/f;->c:Ljava/lang/String;

    iget-object v3, p0, Lmt2/f;->d:Ljava/lang/String;

    invoke-direct {v1, p1, v2, v3}, Lls2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lls2/b;->q(Lls2/a;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V
    .locals 2

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object v0, p0, Lmt2/f;->b:Lls2/b;

    new-instance v1, Lls2/a$i;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lls2/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lls2/b;->q(Lls2/a;)V

    :cond_0
    return-void
.end method
