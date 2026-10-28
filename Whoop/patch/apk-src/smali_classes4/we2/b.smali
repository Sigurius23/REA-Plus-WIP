.class public final Lwe2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe2/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\r\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00082\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lwe2/b;",
        "",
        "Lz82/b;",
        "analyticsManager",
        "<init>",
        "(Lz82/b;)V",
        "Lxe2/a;",
        "alarmMode",
        "",
        "a",
        "(Lxe2/a;)Ljava/lang/String;",
        "Laf2/i;",
        "sleepGoal",
        "b",
        "(Lxe2/a;Laf2/i;)Ljava/lang/String;",
        "action",
        "label",
        "eventName",
        "",
        "properties",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "Lwe2/a;",
        "analyticEvent",
        "c",
        "(Lwe2/a;)V",
        "Lz82/b;",
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


# instance fields
.field private final a:Lz82/b;


# direct methods
.method public constructor <init>(Lz82/b;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe2/b;->a:Lz82/b;

    return-void
.end method

.method private final a(Lxe2/a;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lwe2/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-string p1, "No Alarm"

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "In The Green"

    return-object p1

    :cond_2
    const-string p1, "Sleep Goal"

    return-object p1

    :cond_3
    const-string p1, "Exact Time"

    return-object p1
.end method

.method private final b(Lxe2/a;Laf2/i;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lxe2/a;->EXACT_TIME:Lxe2/a;

    if-ne p1, v0, :cond_0

    const-string p1, "Exact Time"

    return-object p1

    :cond_0
    sget-object v0, Lxe2/a;->IN_THE_GREEN:Lxe2/a;

    if-ne p1, v0, :cond_1

    const-string p1, "67%"

    return-object p1

    :cond_1
    sget-object v0, Lxe2/a;->SLEEP_GOAL:Lxe2/a;

    if-ne p1, v0, :cond_2

    sget-object v1, Laf2/i;->PEAK:Laf2/i;

    if-ne p2, v1, :cond_2

    const-string p1, "Peak"

    return-object p1

    :cond_2
    if-ne p1, v0, :cond_3

    sget-object v1, Laf2/i;->PERFORM:Laf2/i;

    if-ne p2, v1, :cond_3

    const-string p1, "Perform"

    return-object p1

    :cond_3
    if-ne p1, v0, :cond_4

    sget-object v0, Laf2/i;->GET_BY:Laf2/i;

    if-ne p2, v0, :cond_4

    const-string p1, "Get By"

    return-object p1

    :cond_4
    sget-object p2, Lxe2/a;->NO_ALARM:Lxe2/a;

    if-ne p1, p2, :cond_5

    const-string p1, "No Alarm"

    return-object p1

    :cond_5
    const-string p1, ""

    return-object p1
.end method

.method private final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lwe2/b;->a:Lz82/b;

    const-string v1, "Sleep Coach - "

    invoke-static {v1, p3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "Sleep Coach"

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic e(Lwe2/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    sget-object p4, Lm83/z;->w:Lm83/z;

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lwe2/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final c(Lwe2/a;)V
    .locals 7

    const-string v1, "analyticEvent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lwe2/a$e;->a:Lwe2/a$e;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "object"

    if-eqz v1, :cond_0

    const-string v0, "Schedule Page"

    invoke-static {v2, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string v1, "View"

    const/4 v2, 0x0

    const-string v3, "View Schedule Page"

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lwe2/b;->e(Lwe2/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v3, p1, Lwe2/a$d;

    const-string v4, "Press"

    if-eqz v3, :cond_1

    move-object v0, p1

    check-cast v0, Lwe2/a$d;

    invoke-virtual {v0}, Lwe2/a$d;->a()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Schedule Card"

    invoke-static {v2, v3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "Press Schedule Card"

    invoke-direct {p0, v4, v0, v3, v2}, Lwe2/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_1
    sget-object v3, Lwe2/a$b;->a:Lwe2/a$b;

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v5, 0xa

    const/4 v6, 0x0

    const-string v1, "Press"

    const/4 v2, 0x0

    const-string v3, "Create Schedule"

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lwe2/b;->e(Lwe2/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_2
    instance-of v3, p1, Lwe2/a$a;

    const-string v5, "Create Schedule"

    if-eqz v3, :cond_3

    move-object v0, p1

    check-cast v0, Lwe2/a$a;

    invoke-virtual {v0}, Lwe2/a$a;->a()Lxe2/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lwe2/b;->a(Lxe2/a;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Alarm Mode"

    invoke-static {v2, v3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {p0, v4, v0, v5, v2}, Lwe2/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_3
    instance-of v3, p1, Lwe2/a$c;

    if-eqz v3, :cond_4

    move-object v0, p1

    check-cast v0, Lwe2/a$c;

    invoke-virtual {v0}, Lwe2/a$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Recurring Days"

    invoke-static {v2, v3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {p0, v4, v0, v5, v2}, Lwe2/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_4
    instance-of v3, p1, Lwe2/a$f;

    if-eqz v3, :cond_5

    move-object v0, p1

    check-cast v0, Lwe2/a$f;

    invoke-virtual {v0}, Lwe2/a$f;->a()Lxe2/a;

    move-result-object v3

    invoke-virtual {v0}, Lwe2/a$f;->b()Laf2/i;

    move-result-object v0

    invoke-direct {p0, v3, v0}, Lwe2/b;->b(Lxe2/a;Laf2/i;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Wake Time"

    invoke-static {v2, v3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {p0, v4, v0, v5, v2}, Lwe2/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
