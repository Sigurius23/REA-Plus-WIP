.class public final Lbw0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbw0/b$a;,
        Lbw0/b$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJG\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u00082\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lbw0/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lmc1/b;",
        "selectedHrZone",
        "",
        "a",
        "(Lmc1/b;)Ljava/lang/String;",
        "category",
        "action",
        "label",
        "eventName",
        "",
        "properties",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "d",
        "(Lcom/whoop/analytics/AnalyticEventModel;)V",
        "Lbw0/a;",
        "e",
        "(Lbw0/a;)V",
        "Lfi0/a;",
        "core-details_release"
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
.field public static final b:Lbw0/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbw0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbw0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbw0/b;->b:Lbw0/b$a;

    const/16 v0, 0x8

    sput v0, Lbw0/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbw0/b;->a:Lfi0/a;

    return-void
.end method

.method private final a(Lmc1/b;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lbw0/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const-string p1, "MEDIUM_STRESS"

    return-object p1

    :pswitch_1
    const-string p1, "LOW_STRESS"

    return-object p1

    :pswitch_2
    const-string p1, "HIGH_STRESS"

    return-object p1

    :pswitch_3
    const-string p1, "LIGHT_SLEEP"

    return-object p1

    :pswitch_4
    const-string p1, "WAKE"

    return-object p1

    :pswitch_5
    const-string p1, "NO_DATA"

    return-object p1

    :pswitch_6
    const-string p1, "REM"

    return-object p1

    :pswitch_7
    const-string p1, "SWS"

    return-object p1

    :pswitch_8
    const-string p1, "HOLD"

    return-object p1

    :pswitch_9
    const-string p1, "EXHALE"

    return-object p1

    :pswitch_a
    const-string p1, "INHALE"

    return-object p1

    :pswitch_b
    const-string p1, "RESTORATIVE (<50%)"

    return-object p1

    :pswitch_c
    const-string p1, "VERY LIGHT (50-60%)"

    return-object p1

    :pswitch_d
    const-string p1, "LIGHT (60-70%)"

    return-object p1

    :pswitch_e
    const-string p1, "MODERATE (70-80%)"

    return-object p1

    :pswitch_f
    const-string p1, "HARD (80-90%)"

    return-object p1

    :pswitch_10
    const-string p1, "MAX (90-100%)"

    return-object p1

    :pswitch_11
    const-string p1, ""

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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

    iget-object v0, p0, Lbw0/b;->a:Lfi0/a;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic c(Lbw0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const-string p3, ""

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_1

    sget-object p5, Lm83/z;->w:Lm83/z;

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lbw0/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final d(Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 1

    const-string v0, "analyticEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbw0/b;->a:Lfi0/a;

    invoke-static {v0, p1}, Lfi0/b;->a(Lfi0/a;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void
.end method

.method public final e(Lbw0/a;)V
    .locals 14

    const-string v1, "analyticEvent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lbw0/a$h;

    const-string v2, "type"

    const-string v3, "activityID"

    if-eqz v1, :cond_0

    move-object v0, p1

    check-cast v0, Lbw0/a$h;

    invoke-virtual {v0}, Lbw0/a$h;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$h;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v5

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v1, "Activity"

    const-string v2, "Press"

    const/4 v3, 0x0

    const-string v4, "Activity - Press More"

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lbw0/b;->c(Lbw0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v4, p1, Lbw0/a$f;

    if-eqz v4, :cond_2

    move-object v0, p1

    check-cast v0, Lbw0/a$f;

    invoke-virtual {v0}, Lbw0/a$f;->c()Lmc1/b;

    move-result-object v4

    sget-object v5, Lmc1/b;->NONE:Lmc1/b;

    if-eq v4, v5, :cond_1

    invoke-virtual {v0}, Lbw0/a$f;->c()Lmc1/b;

    move-result-object v4

    invoke-direct {p0, v4}, Lbw0/b;->a(Lmc1/b;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lbw0/a$f;->a()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ll83/k;

    invoke-direct {v6, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$f;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v5

    const-string v1, "Activity"

    const-string v2, "Press, Open"

    move-object v3, v4

    const-string v4, "Activity - Press Horizontal Bar Graph"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lbw0/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_1
    return-void

    :cond_2
    instance-of v1, p1, Lbw0/a$g;

    if-eqz v1, :cond_3

    move-object v0, p1

    check-cast v0, Lbw0/a$g;

    invoke-virtual {v0}, Lbw0/a$g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lbw0/a$g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const-string v2, "Press"

    const-string v3, "Activity Details"

    const-string v4, "Data Scrubbing"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lbw0/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_3
    instance-of v1, p1, Lbw0/a$a;

    if-eqz v1, :cond_4

    move-object v0, p1

    check-cast v0, Lbw0/a$a;

    invoke-virtual {v0}, Lbw0/a$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lbw0/a$a;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, " - "

    invoke-static {v1, v5, v4}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lbw0/a$a;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$a;->c()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$a;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v6, "Source"

    invoke-direct {v3, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$a;->e()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v6, "new_home"

    invoke-direct {v2, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v4, v3, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v5

    const-string v2, "Review Activity, Open"

    const-string v4, "Activity - Open"

    move-object v3, v1

    const-string v1, "Activity, Reviewing Data"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lbw0/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_4
    instance-of v1, p1, Lbw0/a$d;

    const-string v4, "activity"

    if-eqz v1, :cond_5

    move-object v0, p1

    check-cast v0, Lbw0/a$d;

    invoke-virtual {v0}, Lbw0/a$d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lbw0/a$d;->a()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ll83/k;

    invoke-direct {v6, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$d;->c()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-direct {v5, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$d;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ll83/k;

    invoke-direct {v2, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v5, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v5

    const-string v2, "Delete"

    const-string v4, "Activity - Delete"

    move-object v3, v1

    const-string v1, "Edit Activities, Edit, Reviewing Data"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lbw0/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_5
    instance-of v1, p1, Lbw0/a$b;

    if-eqz v1, :cond_6

    move-object v0, p1

    check-cast v0, Lbw0/a$b;

    invoke-virtual {v0}, Lbw0/a$b;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, " - Delete Activity Cancel"

    invoke-static {v1, v2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lbw0/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const-string v2, "Cancel"

    const-string v4, "Activity - Delete - Cancel"

    move-object v3, v1

    const-string v1, "Edit Activities, Edit, Reviewing Data"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lbw0/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_6
    instance-of v1, p1, Lbw0/a$c;

    if-eqz v1, :cond_e

    move-object v0, p1

    check-cast v0, Lbw0/a$c;

    invoke-virtual {v0}, Lbw0/a$c;->c()Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-result-object v1

    const-string v5, ""

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->getActivityTypeInternalName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    :cond_7
    move-object v1, v5

    :cond_8
    invoke-virtual {v0}, Lbw0/a$c;->c()Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->getEndTimeSelector()Lcom/whoop/core/details/network/model/TimeSelectorSection;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lcom/whoop/core/details/network/model/TimeSelectorSection;->getInitialValue()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_a

    :cond_9
    move-object v6, v5

    :cond_a
    invoke-virtual {v0}, Lbw0/a$c;->c()Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->getStartTimeSelector()Lcom/whoop/core/details/network/model/TimeSelectorSection;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Lcom/whoop/core/details/network/model/TimeSelectorSection;->getInitialValue()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_b

    goto :goto_0

    :cond_b
    move-object v5, v7

    :cond_c
    :goto_0
    invoke-virtual {v0}, Lbw0/a$c;->c()Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-result-object v7

    if-eqz v7, :cond_d

    invoke-virtual {v7}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->getActivityTypeInternalName()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_d
    const/4 v7, 0x0

    :goto_1
    const-string v8, " - Delete Activity Confirm"

    invoke-static {v7, v8}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ll83/k;

    invoke-direct {v8, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$c;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v9, Ll83/k;

    invoke-direct {v9, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$c;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v10, Ll83/k;

    invoke-direct {v10, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Ll83/k;

    const-string v0, "Previous.Activity"

    invoke-direct {v11, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    const-string v0, "Previous.StartTime"

    invoke-direct {v12, v0, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Ll83/k;

    const-string v0, "Previous.EndTime"

    invoke-direct {v13, v0, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v8 .. v13}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v5

    const-string v2, "Confirm"

    const-string v4, "Activity - Delete - Confirm"

    const-string v1, "Edit Activities, Edit, Reviewing Data"

    move-object v0, p0

    move-object v3, v7

    invoke-direct/range {v0 .. v5}, Lbw0/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_e
    instance-of v2, p1, Lbw0/a$i;

    if-eqz v2, :cond_f

    iget-object v4, p0, Lbw0/b;->a:Lfi0/a;

    move-object v0, p1

    check-cast v0, Lbw0/a$i;

    invoke-virtual {v0}, Lbw0/a$i;->a()Ljava/lang/String;

    move-result-object v9

    const-string v5, "Recovery Details"

    const-string v6, "Toggle"

    const-string v7, "Stress Monitor"

    const-string v8, "Breathwork Recovery"

    invoke-interface/range {v4 .. v9}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_f
    instance-of v2, p1, Lbw0/a$e;

    if-eqz v2, :cond_10

    iget-object v4, p0, Lbw0/b;->a:Lfi0/a;

    move-object v0, p1

    check-cast v0, Lbw0/a$e;

    invoke-virtual {v0}, Lbw0/a$e;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbw0/a$e;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "activity_type"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v3, "source"

    const-string v6, "Activity Details"

    invoke-direct {v0, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v2, v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v10

    const/16 v11, 0x15

    const/4 v12, 0x0

    const/4 v5, 0x0

    const-string v6, "Dismiss CTA"

    const/4 v7, 0x0

    const-string v8, "Link Workout"

    const/4 v9, 0x0

    invoke-static/range {v4 .. v12}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
