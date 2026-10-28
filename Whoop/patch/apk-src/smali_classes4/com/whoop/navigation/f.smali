.class public final Lcom/whoop/navigation/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\rH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/navigation/f;",
        "",
        "Ll02/a;",
        "queryParamDeserializer",
        "<init>",
        "(Ll02/a;)V",
        "Lcom/whoop/navigation/AppScreen;",
        "appScreen",
        "",
        "query",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "a",
        "(Lcom/whoop/navigation/AppScreen;Ljava/lang/String;)Lcom/whoop/navigation/NavigationScreenModel;",
        "",
        "queryMap",
        "b",
        "(Lcom/whoop/navigation/AppScreen;Ljava/util/Map;)Lcom/whoop/navigation/NavigationScreenModel;",
        "Ll02/a;",
        "navigation_release"
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
.field public static final b:Lcom/whoop/navigation/f$a;

.field public static final c:I


# instance fields
.field private final a:Ll02/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/navigation/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/f;->b:Lcom/whoop/navigation/f$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/f;->c:I

    return-void
.end method

.method public constructor <init>(Ll02/a;)V
    .locals 1

    const-string v0, "queryParamDeserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/navigation/f;->a:Ll02/a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/navigation/AppScreen;Ljava/lang/String;)Lcom/whoop/navigation/NavigationScreenModel;
    .locals 4

    const-string v0, "appScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [C

    const/16 v1, 0x26

    const/4 v2, 0x0

    aput-char v1, v0, v2

    const/4 v1, 0x6

    invoke-static {p2, v0, v2, v1}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1

    move v0, v1

    :cond_1
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v2, 0x3d

    invoke-static {v0, v2}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v0}, Lyb3/r;->D0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    :goto_1
    sget-object v1, Lm83/z;->w:Lm83/z;

    :cond_3
    invoke-virtual {p0, p1, v1}, Lcom/whoop/navigation/f;->b(Lcom/whoop/navigation/AppScreen;Ljava/util/Map;)Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/whoop/navigation/AppScreen;Ljava/util/Map;)Lcom/whoop/navigation/NavigationScreenModel;
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/AppScreen;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/navigation/NavigationScreenModel;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v4, p2

    const-string v2, "appScreen"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "queryMap"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$c;->w:Lcom/whoop/navigation/AppScreen$c;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "source"

    const-string v5, ""

    if-eqz v2, :cond_2

    new-instance v0, Lcom/whoop/navigation/AchievementsScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_0

    move-object v2, v5

    :cond_0
    const-string v3, "milestone_type"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v5, v3

    :goto_0
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/AchievementsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_2
    sget-object v2, Lcom/whoop/navigation/AppScreen$a;->w:Lcom/whoop/navigation/AppScreen$a;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v0, Lcom/whoop/navigation/AccessReconfirmBaselinesScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v5, v2

    :goto_1
    const-string v2, "nextScreen"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/AccessReconfirmBaselinesScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_4
    sget-object v2, Lcom/whoop/navigation/AppScreen$h4;->w:Lcom/whoop/navigation/AppScreen$h4;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance v0, Lcom/whoop/navigation/OmronAuthScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    move-object v5, v2

    :goto_2
    invoke-direct {v0, v5}, Lcom/whoop/navigation/OmronAuthScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_6
    sget-object v2, Lcom/whoop/navigation/AppScreen$b;->w:Lcom/whoop/navigation/AppScreen$b;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v0, Lcom/whoop/navigation/AchievementMilestoneUnlockScreenModel;

    const-string v2, "achievement_type"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/AchievementMilestoneUnlockScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_7
    sget-object v2, Lcom/whoop/navigation/AppScreen$t5;->w:Lcom/whoop/navigation/AppScreen$t5;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v0, Lcom/whoop/navigation/StreakCelebrationScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "celebration_type"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/whoop/navigation/StreakCelebrationScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_8
    sget-object v2, Lcom/whoop/navigation/AppScreen$w1;->w:Lcom/whoop/navigation/AppScreen$w1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    new-instance v0, Lcom/whoop/navigation/DayZeroSplashScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/DayZeroSplashScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_9
    sget-object v2, Lcom/whoop/navigation/AppScreen$y;->w:Lcom/whoop/navigation/AppScreen$y;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v6, "end_time"

    const-string v7, "start_time"

    const-string v8, "activity_id"

    if-eqz v2, :cond_10

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_a

    move-object v9, v5

    goto :goto_3

    :cond_a
    move-object v9, v0

    :goto_3
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_b

    move-object v10, v5

    goto :goto_4

    :cond_b
    move-object v10, v0

    :goto_4
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_c

    move-object v11, v5

    goto :goto_5

    :cond_c
    move-object v11, v0

    :goto_5
    const-string v0, "activity_score_type"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_d

    move-object v13, v5

    goto :goto_6

    :cond_d
    move-object v13, v0

    :goto_6
    const-string v0, "internal_name"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_e

    move-object v12, v5

    goto :goto_7

    :cond_e
    move-object v12, v0

    :goto_7
    const-string v0, "flow"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_f

    move-object v14, v5

    goto :goto_8

    :cond_f
    move-object v14, v0

    :goto_8
    const-string v0, "is_deletable"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v15

    new-instance v8, Lcom/whoop/navigation/ActivityEditModel;

    invoke-direct/range {v8 .. v15}, Lcom/whoop/navigation/ActivityEditModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v8

    :cond_10
    sget-object v2, Lcom/whoop/navigation/AppScreen$z;->w:Lcom/whoop/navigation/AppScreen$z;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v9, "activity_type"

    if-eqz v2, :cond_14

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_11

    move-object v0, v5

    :cond_11
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_12

    move-object v2, v5

    :cond_12
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_13

    goto :goto_9

    :cond_13
    move-object v5, v3

    :goto_9
    new-instance v3, Lcom/whoop/navigation/AddActivityModel;

    invoke-direct {v3, v2, v5, v0}, Lcom/whoop/navigation/AddActivityModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_14
    sget-object v2, Lcom/whoop/navigation/AppScreen$a0;->w:Lcom/whoop/navigation/AppScreen$a0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v6, 0x2

    const/4 v7, 0x0

    if-eqz v2, :cond_16

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_15

    goto :goto_a

    :cond_15
    move-object v5, v2

    :goto_a
    invoke-direct {v0, v5, v7, v6, v7}, Lcom/whoop/navigation/AdvancedLabsScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_16
    sget-object v2, Lcom/whoop/navigation/AppScreen$b0;->w:Lcom/whoop/navigation/AppScreen$b0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v10, "test_id"

    if-eqz v2, :cond_17

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsActionPlanScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/AdvancedLabsActionPlanScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_17
    sget-object v2, Lcom/whoop/navigation/AppScreen$e0;->w:Lcom/whoop/navigation/AppScreen$e0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsHormonalContextScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_18

    goto :goto_b

    :cond_18
    move-object v5, v2

    :goto_b
    invoke-direct {v0, v5}, Lcom/whoop/navigation/AdvancedLabsHormonalContextScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_19
    sget-object v2, Lcom/whoop/navigation/AppScreen$f0;->w:Lcom/whoop/navigation/AppScreen$f0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    new-instance v11, Lcom/whoop/navigation/AdvancedLabsInsightsScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1a

    move-object v13, v5

    goto :goto_c

    :cond_1a
    move-object v13, v0

    :goto_c
    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/whoop/navigation/AdvancedLabsInsightsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11

    :cond_1b
    sget-object v2, Lcom/whoop/navigation/AppScreen$g0;->w:Lcom/whoop/navigation/AppScreen$g0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsInsightsDeepDiveScreenModel;

    const-string v2, "insight_id"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1c

    goto :goto_d

    :cond_1c
    move-object v5, v2

    :goto_d
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/AdvancedLabsInsightsDeepDiveScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1d
    sget-object v2, Lcom/whoop/navigation/AppScreen$h0;->w:Lcom/whoop/navigation/AppScreen$h0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v11, "test_count"

    if-eqz v2, :cond_20

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1e

    move-object v2, v5

    :cond_1e
    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_1f

    goto :goto_e

    :cond_1f
    move-object v5, v3

    :goto_e
    const-string v3, "initially_selected_segment_id"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v5, v3}, Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_20
    sget-object v2, Lcom/whoop/navigation/AppScreen$i0;->w:Lcom/whoop/navigation/AppScreen$i0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v12, "navigation_style"

    if-eqz v2, :cond_22

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsManagementScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_21

    goto :goto_f

    :cond_21
    move-object v5, v2

    :goto_f
    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/AdvancedLabsManagementScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_22
    sget-object v2, Lcom/whoop/navigation/AppScreen$l0;->w:Lcom/whoop/navigation/AppScreen$l0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsPrimerScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_23

    goto :goto_10

    :cond_23
    move-object v5, v2

    :goto_10
    invoke-direct {v0, v5}, Lcom/whoop/navigation/AdvancedLabsPrimerScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_24
    sget-object v2, Lcom/whoop/navigation/AppScreen$c0;->w:Lcom/whoop/navigation/AppScreen$c0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_26

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_25

    goto :goto_11

    :cond_25
    move-object v5, v2

    :goto_11
    const-string v2, "is_ai_confirmation"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :cond_26
    sget-object v2, Lcom/whoop/navigation/AppScreen$d0;->w:Lcom/whoop/navigation/AppScreen$d0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsEditTestDetailsScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_27

    goto :goto_12

    :cond_27
    move-object v5, v2

    :goto_12
    invoke-direct {v0, v5}, Lcom/whoop/navigation/AdvancedLabsEditTestDetailsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_28
    sget-object v2, Lcom/whoop/navigation/AppScreen$n0;->w:Lcom/whoop/navigation/AppScreen$n0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v13, "biomarker_test_id"

    const-string v14, "test_type"

    if-eqz v2, :cond_29

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsSchedulingFormScreenModel;

    const-string v2, "episode_id"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v0, v2, v3, v4}, Lcom/whoop/navigation/AdvancedLabsSchedulingFormScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_29
    sget-object v2, Lcom/whoop/navigation/AppScreen$o0;->w:Lcom/whoop/navigation/AppScreen$o0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2b

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;

    const-string v2, "step"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_2a

    goto :goto_13

    :cond_2a
    move-object v5, v2

    :goto_13
    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_2b
    sget-object v2, Lcom/whoop/navigation/AppScreen$k0;->w:Lcom/whoop/navigation/AppScreen$k0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2c

    sget-object v0, Lcom/whoop/navigation/AdvancedLabsNativeSchedulingScreenModel;->INSTANCE:Lcom/whoop/navigation/AdvancedLabsNativeSchedulingScreenModel;

    return-object v0

    :cond_2c
    sget-object v2, Lcom/whoop/navigation/AppScreen$q0;->w:Lcom/whoop/navigation/AppScreen$q0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2f

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel;

    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_2d

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :cond_2d
    if-nez v2, :cond_2e

    goto :goto_14

    :cond_2e
    move-object v5, v2

    :goto_14
    invoke-direct {v0, v5}, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2f
    sget-object v2, Lcom/whoop/navigation/AppScreen$p0;->w:Lcom/whoop/navigation/AppScreen$p0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_30

    sget-object v0, Lcom/whoop/navigation/AdvancedLabsTestHistoryScreenModel;->INSTANCE:Lcom/whoop/navigation/AdvancedLabsTestHistoryScreenModel;

    return-object v0

    :cond_30
    sget-object v2, Lcom/whoop/navigation/AppScreen$r0;->w:Lcom/whoop/navigation/AppScreen$r0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v10, "url"

    if-eqz v2, :cond_33

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsTypeformWebviewScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_31

    move-object v2, v5

    :cond_31
    const-string v3, "testTokenId"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_32

    goto :goto_15

    :cond_32
    move-object v5, v3

    :goto_15
    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v5, v3}, Lcom/whoop/navigation/AdvancedLabsTypeformWebviewScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_33
    sget-object v2, Lcom/whoop/navigation/AppScreen$t0;->w:Lcom/whoop/navigation/AppScreen$t0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_34

    sget-object v0, Lcom/whoop/navigation/AdvancedLabsUploadTestScreenModel;->INSTANCE:Lcom/whoop/navigation/AdvancedLabsUploadTestScreenModel;

    return-object v0

    :cond_34
    sget-object v2, Lcom/whoop/navigation/AppScreen$u0;->w:Lcom/whoop/navigation/AppScreen$u0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v13, "should_open_full_size"

    sget-object v15, Lm83/z;->w:Lm83/z;

    const-string v6, "args"

    const-string v7, "education_type"

    const-class v18, Ljava/util/Map;

    move/from16 v19, v2

    const-string v2, "source_type"

    move-object/from16 v20, v5

    const-string v5, "source_id"

    move-object/from16 v21, v15

    const-string v15, "Failed to deserialize query param JSON to "

    move-object/from16 v22, v12

    const/4 v12, 0x0

    if-eqz v19, :cond_3a

    const-string v0, "fingerprint"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_35

    move-object/from16 v23, v20

    goto :goto_16

    :cond_35
    move-object/from16 v23, v0

    :goto_16
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/String;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_36

    move-object/from16 v25, v20

    goto :goto_17

    :cond_36
    move-object/from16 v25, v0

    :goto_17
    const-string v0, "static_initial_message"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Ljava/lang/String;

    const-string v0, "user_message"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Ljava/lang/String;

    const-string v0, "onboarding_analytic_source"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v28, v0

    check-cast v28, Ljava/lang/String;

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v29, v0

    check-cast v29, Ljava/lang/String;

    iget-object v2, v1, Lcom/whoop/navigation/f;->a:Ll02/a;

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_38

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_37

    goto :goto_18

    :cond_37
    const/4 v0, 0x0

    :goto_18
    if-eqz v0, :cond_38

    invoke-virtual {v2}, Ll02/a;->c()Lad3/c;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v7, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v7}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-static {v5}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-virtual {v3, v5, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_19

    :catch_0
    move-exception v0

    invoke-virtual {v2}, Ll02/a;->d()Ltr2/n;

    move-result-object v2

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v5, v12, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_38
    const/4 v7, 0x0

    :goto_19
    check-cast v7, Ljava/util/Map;

    if-nez v7, :cond_39

    move-object/from16 v31, v21

    goto :goto_1a

    :cond_39
    move-object/from16 v31, v7

    :goto_1a
    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v32

    new-instance v22, Lcom/whoop/navigation/AiCoachChatScreenModel;

    const/16 v30, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x7c80

    const/16 v39, 0x0

    invoke-direct/range {v22 .. v39}, Lcom/whoop/navigation/AiCoachChatScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_9b

    :cond_3a
    sget-object v12, Lcom/whoop/navigation/AppScreen$v0;->w:Lcom/whoop/navigation/AppScreen$v0;

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3d

    new-instance v0, Lcom/whoop/navigation/AiInsightsScreenModel;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_3b

    move-object/from16 v2, v20

    :cond_3b
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_3c

    move-object/from16 v5, v20

    goto :goto_1b

    :cond_3c
    move-object v5, v4

    :goto_1b
    invoke-direct {v0, v2, v3, v5}, Lcom/whoop/navigation/AiInsightsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3d
    sget-object v9, Lcom/whoop/navigation/AppScreen$w0;->w:Lcom/whoop/navigation/AppScreen$w0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3e

    new-instance v0, Lcom/whoop/navigation/AllBiomarkerRecordingsScreenModel;

    const-string v2, "biomarkerName"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/AllBiomarkerRecordingsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3e
    sget-object v9, Lcom/whoop/navigation/AppScreen$x0;->w:Lcom/whoop/navigation/AppScreen$x0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/4 v12, 0x1

    if-eqz v9, :cond_3f

    new-instance v0, Lcom/whoop/navigation/AnnualUpsellSwitchModel;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v12, v2}, Lcom/whoop/navigation/AnnualUpsellSwitchModel;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3f
    sget-object v9, Lcom/whoop/navigation/AppScreen$y0;->w:Lcom/whoop/navigation/AppScreen$y0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_41

    new-instance v23, Lcom/whoop/navigation/AuthenticatedWebViewModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_40

    move-object/from16 v24, v20

    goto :goto_1c

    :cond_40
    move-object/from16 v24, v0

    :goto_1c
    const/16 v27, 0x6

    const/16 v28, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v23 .. v28}, Lcom/whoop/navigation/AuthenticatedWebViewModel;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v23

    :cond_41
    sget-object v9, Lcom/whoop/navigation/AppScreen$z0;->w:Lcom/whoop/navigation/AppScreen$z0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_42

    new-instance v0, Lcom/whoop/navigation/BehaviorDetailsScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/BehaviorDetailsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_42
    sget-object v9, Lcom/whoop/navigation/AppScreen$a1;->w:Lcom/whoop/navigation/AppScreen$a1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_44

    new-instance v0, Lcom/whoop/navigation/BehaviorImpactsScreenModel;

    const-string v2, "detail_id"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_43

    move-object/from16 v5, v20

    goto :goto_1d

    :cond_43
    move-object v5, v2

    :goto_1d
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/BehaviorImpactsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_44
    sget-object v9, Lcom/whoop/navigation/AppScreen$b1;->w:Lcom/whoop/navigation/AppScreen$b1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_46

    new-instance v0, Lcom/whoop/navigation/BiomarkerDetailsScreenModel;

    const-string v2, "biomarkerId"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_45

    const-string v2, "biomarker_name"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_45

    move-object/from16 v5, v20

    goto :goto_1e

    :cond_45
    move-object v5, v2

    :goto_1e
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/BiomarkerDetailsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_46
    sget-object v9, Lcom/whoop/navigation/AppScreen$j0;->w:Lcom/whoop/navigation/AppScreen$j0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_48

    new-instance v0, Lcom/whoop/navigation/MultiConsentScreenModel;

    const-string v2, "consent_action"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_47

    move-object/from16 v5, v20

    goto :goto_1f

    :cond_47
    move-object v5, v2

    :goto_1f
    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/MultiConsentScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_48
    sget-object v9, Lcom/whoop/navigation/AppScreen$c1;->w:Lcom/whoop/navigation/AppScreen$c1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_49

    new-instance v0, Lcom/whoop/navigation/BiomarkerSummaryScreenModel;

    const-string v2, "status_type"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4, v3, v4}, Lcom/whoop/navigation/BiomarkerSummaryScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_49
    sget-object v9, Lcom/whoop/navigation/AppScreen$d1;->w:Lcom/whoop/navigation/AppScreen$d1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const-string v14, "entry_point"

    if-eqz v9, :cond_4c

    new-instance v23, Lcom/whoop/navigation/CardioDetailsScreenModel;

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_4a

    move-object/from16 v24, v20

    goto :goto_20

    :cond_4a
    move-object/from16 v24, v0

    :goto_20
    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_4b

    move-object/from16 v25, v20

    goto :goto_21

    :cond_4b
    move-object/from16 v25, v0

    :goto_21
    const/16 v27, 0x4

    const/16 v28, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v23 .. v28}, Lcom/whoop/navigation/CardioDetailsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v23

    :cond_4c
    sget-object v9, Lcom/whoop/navigation/AppScreen$f1;->w:Lcom/whoop/navigation/AppScreen$f1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4e

    new-instance v0, Lcom/whoop/navigation/ChallengesScreenModel;

    const-string v2, "name"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_4d

    move-object/from16 v5, v20

    goto :goto_22

    :cond_4d
    move-object v5, v2

    :goto_22
    invoke-direct {v0, v5}, Lcom/whoop/navigation/ChallengesScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4e
    sget-object v9, Lcom/whoop/navigation/AppScreen$e1;->w:Lcom/whoop/navigation/AppScreen$e1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4f

    new-instance v0, Lcom/whoop/navigation/ChallengeLandingScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/ChallengeLandingScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4f
    sget-object v9, Lcom/whoop/navigation/AppScreen$g1;->w:Lcom/whoop/navigation/AppScreen$g1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const-string v12, "path"

    if-eqz v9, :cond_51

    new-instance v2, Lcom/whoop/navigation/CheckoutScreenModel;

    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_50

    move-object/from16 v3, v20

    goto :goto_23

    :cond_50
    move-object v3, v0

    :goto_23
    const-string v0, "payment_method_id"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    const-string v0, "skip_confirmation"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const-string v0, "category"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/CheckoutScreenModel;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-object v2

    :cond_51
    sget-object v9, Lcom/whoop/navigation/AppScreen$j1;->w:Lcom/whoop/navigation/AppScreen$j1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    move/from16 v24, v9

    const-string v9, "appointmentId"

    if-eqz v24, :cond_55

    const-string v0, "appointmentType"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_52

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_52

    goto :goto_24

    :cond_52
    const/4 v0, 0x0

    :goto_24
    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_53

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_53

    goto :goto_25

    :cond_53
    const/4 v2, 0x0

    :goto_25
    const-string v3, "intakeType"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_54

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_54

    move-object v7, v3

    goto :goto_26

    :cond_54
    const/4 v7, 0x0

    :goto_26
    new-instance v3, Lcom/whoop/navigation/ClinicianVideoSchedulingIntakeScreenModel;

    invoke-direct {v3, v0, v2, v7}, Lcom/whoop/navigation/ClinicianVideoSchedulingIntakeScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_55
    move-object/from16 v24, v8

    sget-object v8, Lcom/whoop/navigation/AppScreen$i1;->w:Lcom/whoop/navigation/AppScreen$i1;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_57

    new-instance v0, Lcom/whoop/navigation/ClinicianSchedulingConfirmationScreenModel;

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_56

    move-object/from16 v5, v20

    goto :goto_27

    :cond_56
    move-object v5, v2

    :goto_27
    invoke-direct {v0, v5}, Lcom/whoop/navigation/ClinicianSchedulingConfirmationScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_57
    sget-object v8, Lcom/whoop/navigation/AppScreen$k1;->w:Lcom/whoop/navigation/AppScreen$k1;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "id"

    if-eqz v8, :cond_62

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_58

    move-object/from16 v25, v20

    goto :goto_28

    :cond_58
    move-object/from16 v25, v0

    :goto_28
    const-string v0, "entry_text"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_59

    move-object/from16 v26, v20

    goto :goto_29

    :cond_59
    move-object/from16 v26, v0

    :goto_29
    const-string v0, "conversation_seed_id"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_5a

    move-object/from16 v27, v20

    goto :goto_2a

    :cond_5a
    move-object/from16 v27, v0

    :goto_2a
    const-string v0, "card_variant"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5b

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v28, v0

    goto :goto_2b

    :cond_5b
    const/16 v28, 0x0

    :goto_2b
    const-string v0, "preset_question"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v30, v0

    check-cast v30, Ljava/lang/String;

    const-string v0, "include_initial_message"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5c

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v12

    move/from16 v31, v12

    goto :goto_2c

    :cond_5c
    const/16 v31, 0x1

    :goto_2c
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v32, v0

    check-cast v32, Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_5d

    move-object/from16 v34, v20

    goto :goto_2d

    :cond_5d
    move-object/from16 v34, v0

    :goto_2d
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v35, v0

    check-cast v35, Ljava/lang/String;

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v36, v0

    check-cast v36, Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v37, v0

    check-cast v37, Ljava/lang/String;

    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5e

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    move/from16 v38, v0

    goto :goto_2e

    :cond_5e
    const/16 v38, 0x0

    :goto_2e
    iget-object v2, v1, Lcom/whoop/navigation/f;->a:Ll02/a;

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_60

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_5f

    goto :goto_2f

    :cond_5f
    const/4 v0, 0x0

    :goto_2f
    if-eqz v0, :cond_60

    invoke-virtual {v2}, Ll02/a;->c()Lad3/c;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v6, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v6}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/b;

    invoke-virtual {v3, v4, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_30

    :catch_1
    move-exception v0

    invoke-virtual {v2}, Ll02/a;->d()Ltr2/n;

    move-result-object v2

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_60
    const/4 v7, 0x0

    :goto_30
    check-cast v7, Ljava/util/Map;

    if-nez v7, :cond_61

    move-object/from16 v33, v21

    goto :goto_31

    :cond_61
    move-object/from16 v33, v7

    :goto_31
    new-instance v24, Lcom/whoop/navigation/CoachScreenModel;

    const/16 v39, 0x10

    const/16 v40, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v24 .. v40}, Lcom/whoop/navigation/CoachScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v24

    goto/16 :goto_9b

    :cond_62
    sget-object v2, Lcom/whoop/navigation/AppScreen$l1;->w:Lcom/whoop/navigation/AppScreen$l1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_63

    sget-object v0, Lcom/whoop/navigation/CoachSettingsScreenModel;->INSTANCE:Lcom/whoop/navigation/CoachSettingsScreenModel;

    return-object v0

    :cond_63
    sget-object v2, Lcom/whoop/navigation/AppScreen$m1;->w:Lcom/whoop/navigation/AppScreen$m1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_64

    new-instance v0, Lcom/whoop/navigation/CommunityScreenModel;

    const-string v2, "share_code"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v4, v2, v3, v4}, Lcom/whoop/navigation/CommunityScreenModel;-><init>(Lcom/whoop/navigation/AiAction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_64
    sget-object v2, Lcom/whoop/navigation/AppScreen$y1;->w:Lcom/whoop/navigation/AppScreen$y1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_65

    sget-object v0, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;->INSTANCE:Lcom/whoop/navigation/ConnectivityNavigationScreenModel;

    return-object v0

    :cond_65
    sget-object v2, Lcom/whoop/navigation/AppScreen$z1;->w:Lcom/whoop/navigation/AppScreen$z1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_67

    new-instance v0, Lcom/whoop/navigation/DownloadedFileExportScreenModel;

    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_66

    move-object/from16 v5, v20

    goto :goto_32

    :cond_66
    move-object v5, v2

    :goto_32
    invoke-direct {v0, v5}, Lcom/whoop/navigation/DownloadedFileExportScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_67
    sget-object v2, Lcom/whoop/navigation/AppScreen$s1;->w:Lcom/whoop/navigation/AppScreen$s1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_68

    sget-object v0, Lcom/whoop/navigation/CustomizeJournalScreenModel;->INSTANCE:Lcom/whoop/navigation/CustomizeJournalScreenModel;

    return-object v0

    :cond_68
    sget-object v2, Lcom/whoop/navigation/AppScreen$t1;->w:Lcom/whoop/navigation/AppScreen$t1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_69

    sget-object v0, Lcom/whoop/navigation/CustomizeOverviewModel;->INSTANCE:Lcom/whoop/navigation/CustomizeOverviewModel;

    return-object v0

    :cond_69
    sget-object v2, Lcom/whoop/navigation/AppScreen$u1;->w:Lcom/whoop/navigation/AppScreen$u1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6a

    sget-object v0, Lcom/whoop/navigation/CyclePatternHistoryScreenModel;->INSTANCE:Lcom/whoop/navigation/CyclePatternHistoryScreenModel;

    return-object v0

    :cond_6a
    sget-object v2, Lcom/whoop/navigation/AppScreen$x1;->w:Lcom/whoop/navigation/AppScreen$x1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v5, "date"

    if-eqz v2, :cond_6e

    new-instance v25, Lcom/whoop/navigation/DeepDiveScreenModel;

    const-string v0, "pillar"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_6b

    move-object/from16 v26, v20

    goto :goto_33

    :cond_6b
    move-object/from16 v26, v0

    :goto_33
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_6c

    move-object/from16 v27, v20

    goto :goto_34

    :cond_6c
    move-object/from16 v27, v0

    :goto_34
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_6d

    move-object/from16 v28, v20

    goto :goto_35

    :cond_6d
    move-object/from16 v28, v0

    :goto_35
    const/16 v30, 0x8

    const/16 v31, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v25 .. v31}, Lcom/whoop/navigation/DeepDiveScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v25

    :cond_6e
    sget-object v2, Lcom/whoop/navigation/AppScreen$a2;->w:Lcom/whoop/navigation/AppScreen$a2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6f

    new-instance v0, Lcom/whoop/navigation/EditActivitiesDrawerScreenModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4, v3, v4}, Lcom/whoop/navigation/EditActivitiesDrawerScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_6f
    sget-object v2, Lcom/whoop/navigation/AppScreen$b2;->w:Lcom/whoop/navigation/AppScreen$b2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v6, "entryPoint"

    const-string v7, "exerciseId"

    const-string v8, "exercise_id"

    if-eqz v2, :cond_75

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_71

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_70

    goto :goto_36

    :cond_70
    const/4 v0, 0x0

    :goto_36
    if-nez v0, :cond_72

    :cond_71
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_72
    if-nez v0, :cond_73

    move-object/from16 v5, v20

    goto :goto_37

    :cond_73
    move-object v5, v0

    :goto_37
    new-instance v0, Lcom/whoop/navigation/EditCustomExerciseModel;

    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_74

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :cond_74
    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/EditCustomExerciseModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_75
    sget-object v2, Lcom/whoop/navigation/AppScreen$d2;->w:Lcom/whoop/navigation/AppScreen$d2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7e

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_77

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_76

    goto :goto_38

    :cond_76
    const/4 v0, 0x0

    :goto_38
    if-nez v0, :cond_78

    :cond_77
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_78
    if-nez v0, :cond_79

    move-object/from16 v5, v20

    goto :goto_39

    :cond_79
    move-object v5, v0

    :goto_39
    const-string v0, "show_cta"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_7a

    const-string v0, "showCTA"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_7a
    if-eqz v0, :cond_7b

    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_7b

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    goto :goto_3a

    :cond_7b
    const/4 v12, 0x0

    :goto_3a
    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_7c

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_7c

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_7c
    const-string v2, "entry_point_type"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_7d

    const-string v2, "entryPointType"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_7d

    const-string v2, "EXTERNAL"

    :cond_7d
    new-instance v3, Lcom/whoop/navigation/ExerciseDetailsScreenModel;

    invoke-direct {v3, v5, v12, v0, v2}, Lcom/whoop/navigation/ExerciseDetailsScreenModel;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_7e
    sget-object v2, Lcom/whoop/navigation/AppScreen$e2;->w:Lcom/whoop/navigation/AppScreen$e2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_80

    new-instance v0, Lcom/whoop/navigation/ExtensionsScreenModel;

    const-string v2, "pc"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_7f

    move-object/from16 v5, v20

    :goto_3b
    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    goto :goto_3c

    :cond_7f
    move-object v5, v2

    goto :goto_3b

    :goto_3c
    invoke-direct {v0, v5, v4, v3, v2}, Lcom/whoop/navigation/ExtensionsScreenModel;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_80
    sget-object v2, Lcom/whoop/navigation/AppScreen$j4;->w:Lcom/whoop/navigation/AppScreen$j4;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_82

    new-instance v0, Lcom/whoop/navigation/OrderConfirmationScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_81

    move-object/from16 v5, v20

    goto :goto_3d

    :cond_81
    move-object v5, v2

    :goto_3d
    invoke-direct {v0, v5}, Lcom/whoop/navigation/OrderConfirmationScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_82
    sget-object v2, Lcom/whoop/navigation/AppScreen$k4;->w:Lcom/whoop/navigation/AppScreen$k4;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_83

    new-instance v0, Lcom/whoop/navigation/PairDeviceScreenModel;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v4, v3, v4}, Lcom/whoop/navigation/PairDeviceScreenModel;-><init>(Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_83
    sget-object v2, Lcom/whoop/navigation/AppScreen$l4;->w:Lcom/whoop/navigation/AppScreen$l4;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_84

    new-instance v0, Lcom/whoop/navigation/PasswordResetScreenModel;

    const-string v2, "token"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "expires"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v5, "email"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v0, v2, v3, v4}, Lcom/whoop/navigation/PasswordResetScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_84
    sget-object v2, Lcom/whoop/navigation/AppScreen$f2;->w:Lcom/whoop/navigation/AppScreen$f2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_85

    sget-object v0, Lcom/whoop/navigation/FamilyPlanScreenModel;->INSTANCE:Lcom/whoop/navigation/FamilyPlanScreenModel;

    return-object v0

    :cond_85
    sget-object v2, Lcom/whoop/navigation/AppScreen$g2;->w:Lcom/whoop/navigation/AppScreen$g2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_87

    new-instance v0, Lcom/whoop/navigation/FamilyPlanHubScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_86

    move-object/from16 v5, v20

    goto :goto_3e

    :cond_86
    move-object v5, v2

    :goto_3e
    invoke-direct {v0, v5}, Lcom/whoop/navigation/FamilyPlanHubScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_87
    sget-object v2, Lcom/whoop/navigation/AppScreen$h2;->w:Lcom/whoop/navigation/AppScreen$h2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_89

    new-instance v0, Lcom/whoop/navigation/FamilyPlanInviteScreenModel;

    const-string v2, "is_new_member"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_88

    move-object/from16 v5, v20

    goto :goto_3f

    :cond_88
    move-object v5, v3

    :goto_3f
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/FamilyPlanInviteScreenModel;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_89
    sget-object v2, Lcom/whoop/navigation/AppScreen$j2;->w:Lcom/whoop/navigation/AppScreen$j2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8b

    new-instance v0, Lcom/whoop/navigation/FeedbackSurveyScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_8a

    move-object/from16 v5, v20

    goto :goto_40

    :cond_8a
    move-object v5, v2

    :goto_40
    invoke-direct {v0, v5}, Lcom/whoop/navigation/FeedbackSurveyScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_8b
    sget-object v2, Lcom/whoop/navigation/AppScreen$l2;->w:Lcom/whoop/navigation/AppScreen$l2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8c

    new-instance v0, Lcom/whoop/navigation/GiftHubScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/GiftHubScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_8c
    sget-object v2, Lcom/whoop/navigation/AppScreen$m2;->w:Lcom/whoop/navigation/AppScreen$m2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8f

    new-instance v0, Lcom/whoop/navigation/GiftedScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_8d

    move-object/from16 v2, v20

    :cond_8d
    const-string v3, "giftCode"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_8e

    move-object/from16 v5, v20

    goto :goto_41

    :cond_8e
    move-object v5, v3

    :goto_41
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/GiftedScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_8f
    sget-object v2, Lcom/whoop/navigation/AppScreen$n2;->w:Lcom/whoop/navigation/AppScreen$n2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_95

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_90

    move-object/from16 v0, v20

    :cond_90
    const-string v2, "giftType"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_91

    const-string v2, "gift_type"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :cond_91
    if-nez v2, :cond_92

    move-object/from16 v2, v20

    :cond_92
    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_93

    move-object/from16 v3, v20

    :cond_93
    const-string v5, "selected_tier"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_94

    move-object/from16 v5, v20

    goto :goto_42

    :cond_94
    move-object v5, v4

    :goto_42
    new-instance v4, Lcom/whoop/navigation/GiftingScreenModel;

    invoke-direct {v4, v0, v3, v2, v5}, Lcom/whoop/navigation/GiftingScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4

    :cond_95
    sget-object v2, Lcom/whoop/navigation/AppScreen$o2;->w:Lcom/whoop/navigation/AppScreen$o2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_97

    new-instance v25, Lcom/whoop/navigation/HealthMonitorScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_96

    move-object/from16 v28, v20

    goto :goto_43

    :cond_96
    move-object/from16 v28, v0

    :goto_43
    const/16 v30, 0xb

    const/16 v31, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v25 .. v31}, Lcom/whoop/navigation/HealthMonitorScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v25

    :cond_97
    sget-object v2, Lcom/whoop/navigation/AppScreen$p2;->w:Lcom/whoop/navigation/AppScreen$p2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_98

    sget-object v0, Lcom/whoop/navigation/HealthReportScreenModel;->INSTANCE:Lcom/whoop/navigation/HealthReportScreenModel;

    return-object v0

    :cond_98
    sget-object v2, Lcom/whoop/navigation/AppScreen$r2;->w:Lcom/whoop/navigation/AppScreen$r2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9a

    new-instance v25, Lcom/whoop/navigation/HealthspanScreenModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_99

    move-object/from16 v26, v20

    goto :goto_44

    :cond_99
    move-object/from16 v26, v0

    :goto_44
    const/16 v29, 0x6

    const/16 v30, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v25 .. v30}, Lcom/whoop/navigation/HealthspanScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v25

    :cond_9a
    sget-object v2, Lcom/whoop/navigation/AppScreen$q2;->w:Lcom/whoop/navigation/AppScreen$q2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9c

    new-instance v0, Lcom/whoop/navigation/HealthTabScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_9b

    move-object/from16 v5, v20

    :goto_45
    const/4 v2, 0x0

    const/4 v3, 0x2

    goto :goto_46

    :cond_9b
    move-object v5, v2

    goto :goto_45

    :goto_46
    invoke-direct {v0, v5, v2, v3, v2}, Lcom/whoop/navigation/HealthTabScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_9c
    const/4 v2, 0x0

    sget-object v6, Lcom/whoop/navigation/AppScreen$s2;->w:Lcom/whoop/navigation/AppScreen$s2;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9d

    new-instance v0, Lcom/whoop/navigation/HeartScreenerModel;

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v2}, Lcom/whoop/navigation/HeartScreenerModel;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_9d
    sget-object v2, Lcom/whoop/navigation/AppScreen$t2;->w:Lcom/whoop/navigation/AppScreen$t2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9e

    sget-object v0, Lcom/whoop/navigation/HiddenMetricsModel;->INSTANCE:Lcom/whoop/navigation/HiddenMetricsModel;

    return-object v0

    :cond_9e
    sget-object v2, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9f

    new-instance v0, Lcom/whoop/navigation/HomeScreenModel;

    const-string v2, "home_pillar"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lcom/whoop/navigation/AiAction;->Companion:Lcom/whoop/navigation/AiAction$a;

    invoke-virtual {v3, v4}, Lcom/whoop/navigation/AiAction$a;->a(Ljava/util/Map;)Lcom/whoop/navigation/AiAction;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v0

    :cond_9f
    sget-object v2, Lcom/whoop/navigation/AppScreen$v2;->w:Lcom/whoop/navigation/AppScreen$v2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a1

    new-instance v0, Lcom/whoop/navigation/HormonalInsightsOnboardingModel;

    const-string v2, "feature"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_a0

    move-object/from16 v5, v20

    goto :goto_47

    :cond_a0
    move-object v5, v2

    :goto_47
    invoke-direct {v0, v5}, Lcom/whoop/navigation/HormonalInsightsOnboardingModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_a1
    sget-object v2, Lcom/whoop/navigation/AppScreen$w2;->w:Lcom/whoop/navigation/AppScreen$w2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a2

    sget-object v0, Lcom/whoop/navigation/HormonalInsightsSettingsScreenModel;->INSTANCE:Lcom/whoop/navigation/HormonalInsightsSettingsScreenModel;

    return-object v0

    :cond_a2
    sget-object v2, Lcom/whoop/navigation/AppScreen$x2;->w:Lcom/whoop/navigation/AppScreen$x2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a3

    sget-object v0, Lcom/whoop/navigation/HrSettingsScreenModel;->INSTANCE:Lcom/whoop/navigation/HrSettingsScreenModel;

    return-object v0

    :cond_a3
    sget-object v2, Lcom/whoop/navigation/AppScreen$y2;->w:Lcom/whoop/navigation/AppScreen$y2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a5

    new-instance v0, Lcom/whoop/navigation/InAppBrowserScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_a4

    move-object/from16 v5, v20

    goto :goto_48

    :cond_a4
    move-object v5, v2

    :goto_48
    invoke-direct {v0, v5}, Lcom/whoop/navigation/InAppBrowserScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_a5
    sget-object v2, Lcom/whoop/navigation/AppScreen$z2;->w:Lcom/whoop/navigation/AppScreen$z2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a7

    new-instance v25, Lcom/whoop/navigation/IntegrationsScreenModel;

    const-string v0, "integrationId"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_a6

    move-object/from16 v26, v20

    goto :goto_49

    :cond_a6
    move-object/from16 v26, v0

    :goto_49
    sget-object v0, Lcom/whoop/navigation/AiAction;->Companion:Lcom/whoop/navigation/AiAction$a;

    invoke-virtual {v0, v4}, Lcom/whoop/navigation/AiAction$a;->a(Ljava/util/Map;)Lcom/whoop/navigation/AiAction;

    move-result-object v28

    const/16 v29, 0x2

    const/16 v30, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v25 .. v30}, Lcom/whoop/navigation/IntegrationsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v25

    :cond_a7
    sget-object v2, Lcom/whoop/navigation/AppScreen$a3;->w:Lcom/whoop/navigation/AppScreen$a3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a8

    sget-object v0, Lcom/whoop/navigation/IntegrationsDisclaimerScreenModel;->INSTANCE:Lcom/whoop/navigation/IntegrationsDisclaimerScreenModel;

    return-object v0

    :cond_a8
    sget-object v2, Lcom/whoop/navigation/AppScreen$r1;->w:Lcom/whoop/navigation/AppScreen$r1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_aa

    new-instance v0, Lcom/whoop/navigation/CustomizeBottomSheetScreenModel;

    const-string v2, "type"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_a9

    move-object/from16 v5, v20

    goto :goto_4a

    :cond_a9
    move-object v5, v2

    :goto_4a
    invoke-direct {v0, v5}, Lcom/whoop/navigation/CustomizeBottomSheetScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_aa
    sget-object v2, Lcom/whoop/navigation/AppScreen$b3;->w:Lcom/whoop/navigation/AppScreen$b3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-wide/16 v6, 0x0

    const-string v8, "cycle_id"

    if-eqz v2, :cond_ad

    new-instance v0, Lcom/whoop/navigation/JournalScreenModel;

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_ab

    invoke-static {v2}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_ab

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    :cond_ab
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_ac

    move-object/from16 v5, v20

    goto :goto_4b

    :cond_ac
    move-object v5, v2

    :goto_4b
    const-string v2, "should_show_onboarding"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-direct {v0, v6, v7, v5, v2}, Lcom/whoop/navigation/JournalScreenModel;-><init>(JLjava/lang/String;Z)V

    return-object v0

    :cond_ad
    sget-object v2, Lcom/whoop/navigation/AppScreen$d3;->w:Lcom/whoop/navigation/AppScreen$d3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b1

    new-instance v0, Lcom/whoop/navigation/InterdayJournalScreenModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_ae

    move-object/from16 v2, v20

    :cond_ae
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_af

    invoke-static {v5}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_af

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    goto :goto_4c

    :cond_af
    const-wide/16 v5, -0x1

    :goto_4c
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_b0

    move-object/from16 v3, v20

    :cond_b0
    invoke-direct {v0, v2, v5, v6, v3}, Lcom/whoop/navigation/InterdayJournalScreenModel;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    return-object v0

    :cond_b1
    sget-object v2, Lcom/whoop/navigation/AppScreen$e3;->w:Lcom/whoop/navigation/AppScreen$e3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b2

    sget-object v0, Lcom/whoop/navigation/LabradorAboutScreenModel;->INSTANCE:Lcom/whoop/navigation/LabradorAboutScreenModel;

    return-object v0

    :cond_b2
    sget-object v2, Lcom/whoop/navigation/AppScreen$f3;->w:Lcom/whoop/navigation/AppScreen$f3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b4

    new-instance v0, Lcom/whoop/navigation/LabradorDetailsScreenModel;

    const-string v2, "ecg_reading_id"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_b3

    move-object/from16 v5, v20

    goto :goto_4d

    :cond_b3
    move-object v5, v2

    :goto_4d
    invoke-direct {v0, v5}, Lcom/whoop/navigation/LabradorDetailsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_b4
    sget-object v2, Lcom/whoop/navigation/AppScreen$g3;->w:Lcom/whoop/navigation/AppScreen$g3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b5

    sget-object v0, Lcom/whoop/navigation/LabradorDeviceLocationModel;->INSTANCE:Lcom/whoop/navigation/LabradorDeviceLocationModel;

    return-object v0

    :cond_b5
    sget-object v2, Lcom/whoop/navigation/AppScreen$h3;->w:Lcom/whoop/navigation/AppScreen$h3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b6

    sget-object v0, Lcom/whoop/navigation/LabradorOnboardingModel;->INSTANCE:Lcom/whoop/navigation/LabradorOnboardingModel;

    return-object v0

    :cond_b6
    sget-object v2, Lcom/whoop/navigation/AppScreen$i3;->w:Lcom/whoop/navigation/AppScreen$i3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b8

    new-instance v0, Lcom/whoop/navigation/LabradorReadingModel;

    const-string v2, "selectedWrist"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_b7

    move-object/from16 v5, v20

    goto :goto_4e

    :cond_b7
    move-object v5, v2

    :goto_4e
    invoke-direct {v0, v5}, Lcom/whoop/navigation/LabradorReadingModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_b8
    sget-object v2, Lcom/whoop/navigation/AppScreen$j3;->w:Lcom/whoop/navigation/AppScreen$j3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b9

    sget-object v0, Lcom/whoop/navigation/LabradorRegistrationModel;->INSTANCE:Lcom/whoop/navigation/LabradorRegistrationModel;

    return-object v0

    :cond_b9
    sget-object v2, Lcom/whoop/navigation/AppScreen$k3;->w:Lcom/whoop/navigation/AppScreen$k3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_ba

    sget-object v0, Lcom/whoop/navigation/LabradorResultsModel;->INSTANCE:Lcom/whoop/navigation/LabradorResultsModel;

    return-object v0

    :cond_ba
    sget-object v2, Lcom/whoop/navigation/AppScreen$l3;->w:Lcom/whoop/navigation/AppScreen$l3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_bb

    sget-object v0, Lcom/whoop/navigation/LanguageSettingsScreenModel;->INSTANCE:Lcom/whoop/navigation/LanguageSettingsScreenModel;

    return-object v0

    :cond_bb
    sget-object v2, Lcom/whoop/navigation/AppScreen$m3;->w:Lcom/whoop/navigation/AppScreen$m3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_bc

    sget-object v0, Lcom/whoop/navigation/LegacyProCheckoutScreenModel;->INSTANCE:Lcom/whoop/navigation/LegacyProCheckoutScreenModel;

    return-object v0

    :cond_bc
    sget-object v2, Lcom/whoop/navigation/AppScreen$n3;->w:Lcom/whoop/navigation/AppScreen$n3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_ca

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_bd

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    move-wide/from16 v22, v2

    goto :goto_4f

    :cond_bd
    move-wide/from16 v22, v6

    :goto_4f
    const-string v2, "level"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_be

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move/from16 v24, v0

    goto :goto_50

    :cond_be
    const/16 v24, 0x0

    :goto_50
    const-string v0, "experience"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_bf

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move/from16 v25, v0

    goto :goto_51

    :cond_bf
    const/16 v25, 0x0

    :goto_51
    const-string v0, "user_id"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_c0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    :cond_c0
    move-wide/from16 v26, v6

    iget-object v3, v1, Lcom/whoop/navigation/f;->a:Ll02/a;

    const-string v0, "progression_level"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_c2

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_c1

    goto :goto_52

    :cond_c1
    const/4 v0, 0x0

    :goto_52
    if-eqz v0, :cond_c2

    invoke-virtual {v3}, Ll02/a;->c()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lcom/whoop/navigation/ProgressionLevel;->Companion:Lcom/whoop/navigation/ProgressionLevel$a;

    invoke-virtual {v6}, Lcom/whoop/navigation/ProgressionLevel$a;->serializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-virtual {v5, v6, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_53

    :catch_2
    move-exception v0

    invoke-virtual {v3}, Ll02/a;->d()Ltr2/n;

    move-result-object v3

    const-class v5, Lcom/whoop/navigation/ProgressionLevel;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-interface {v5}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v15, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {v3, v5, v0, v7}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_c2
    const/4 v0, 0x0

    :goto_53
    check-cast v0, Lcom/whoop/navigation/ProgressionLevel;

    if-nez v0, :cond_c9

    new-instance v3, Lcom/whoop/navigation/ProgressionLevel;

    const-string v0, "tier"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_c3

    move-object/from16 v0, v20

    :cond_c3
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_c4

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    move v5, v2

    goto :goto_54

    :cond_c4
    const/4 v5, 0x0

    :goto_54
    const-string v2, "badge"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_c5

    move-object/from16 v6, v20

    goto :goto_55

    :cond_c5
    move-object v6, v2

    :goto_55
    const-string v2, "mini_badge"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_c6

    move-object/from16 v7, v20

    goto :goto_56

    :cond_c6
    move-object v7, v2

    :goto_56
    const-string v2, "minimum_experience"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_c7

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    move v8, v12

    goto :goto_57

    :cond_c7
    const/4 v8, 0x0

    :goto_57
    const-string v2, "maximum_experience"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_c8

    invoke-static {v2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    move-object v9, v2

    :goto_58
    move-object v4, v0

    goto :goto_59

    :cond_c8
    const/4 v9, 0x0

    goto :goto_58

    :goto_59
    invoke-direct/range {v3 .. v9}, Lcom/whoop/navigation/ProgressionLevel;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V

    move-object/from16 v28, v3

    goto :goto_5a

    :cond_c9
    move-object/from16 v28, v0

    :goto_5a
    new-instance v21, Lcom/whoop/navigation/MemberLevelInfo;

    invoke-direct/range {v21 .. v28}, Lcom/whoop/navigation/MemberLevelInfo;-><init>(JIIJLcom/whoop/navigation/ProgressionLevel;)V

    move-object/from16 v0, v21

    new-instance v2, Lcom/whoop/navigation/LevelsScreenModel;

    invoke-direct {v2, v0}, Lcom/whoop/navigation/LevelsScreenModel;-><init>(Lcom/whoop/navigation/MemberLevelInfo;)V

    move-object/from16 v22, v2

    goto/16 :goto_9b

    :cond_ca
    sget-object v2, Lcom/whoop/navigation/AppScreen$o3;->w:Lcom/whoop/navigation/AppScreen$o3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_cd

    new-instance v0, Lcom/whoop/navigation/LimitedTimeOfferScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_cb

    move-object/from16 v2, v20

    :cond_cb
    const-string v3, "offer_id"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_cc

    move-object/from16 v5, v20

    goto :goto_5b

    :cond_cc
    move-object v5, v3

    :goto_5b
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/LimitedTimeOfferScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_cd
    sget-object v2, Lcom/whoop/navigation/AppScreen$p3;->w:Lcom/whoop/navigation/AppScreen$p3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d0

    move-object/from16 v2, v24

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_cf

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_ce

    move-object v7, v0

    goto :goto_5c

    :cond_ce
    const/4 v7, 0x0

    :goto_5c
    if-eqz v7, :cond_cf

    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "activity_name"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Lcom/whoop/navigation/LinkWorkoutScreenModel;

    invoke-direct {v3, v7, v0, v2}, Lcom/whoop/navigation/LinkWorkoutScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_cf
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "activity_id is required for LINK_WORKOUT deep link"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d0
    move-object/from16 v2, v24

    sget-object v10, Lcom/whoop/navigation/AppScreen$q3;->w:Lcom/whoop/navigation/AppScreen$q3;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d2

    new-instance v0, Lcom/whoop/navigation/LogSymptomsScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_d1

    move-object/from16 v5, v20

    goto :goto_5d

    :cond_d1
    move-object v5, v2

    :goto_5d
    const-string v2, "requestDate"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/LogSymptomsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_d2
    sget-object v10, Lcom/whoop/navigation/AppScreen$r3;->w:Lcom/whoop/navigation/AppScreen$r3;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d3

    new-instance v0, Lcom/whoop/navigation/LoginScreenModel;

    const-string v2, "show_create_account"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-direct {v0, v2}, Lcom/whoop/navigation/LoginScreenModel;-><init>(Z)V

    return-object v0

    :cond_d3
    sget-object v10, Lcom/whoop/navigation/AppScreen$s3;->w:Lcom/whoop/navigation/AppScreen$s3;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d5

    new-instance v0, Lcom/whoop/navigation/MarketingConsentScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_d4

    move-object/from16 v5, v20

    :goto_5e
    const/4 v4, 0x0

    goto :goto_5f

    :cond_d4
    move-object v5, v2

    goto :goto_5e

    :goto_5f
    invoke-direct {v0, v5, v4}, Lcom/whoop/navigation/MarketingConsentScreenModel;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0

    :cond_d5
    sget-object v10, Lcom/whoop/navigation/AppScreen$t3;->w:Lcom/whoop/navigation/AppScreen$t3;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d6

    new-instance v0, Lcom/whoop/navigation/MciLogCalendarScreenModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/whoop/navigation/MciLogCalendarScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_d6
    sget-object v10, Lcom/whoop/navigation/AppScreen$u3;->w:Lcom/whoop/navigation/AppScreen$u3;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d9

    new-instance v24, Lcom/whoop/navigation/MciOverviewScreenModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_d7

    move-object/from16 v25, v20

    goto :goto_60

    :cond_d7
    move-object/from16 v25, v0

    :goto_60
    const-string v0, "preSelectedLogValue"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_d8

    move-object/from16 v26, v20

    goto :goto_61

    :cond_d8
    move-object/from16 v26, v0

    :goto_61
    const-string v0, "analyticsSource"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Ljava/lang/String;

    const/16 v29, 0x8

    const/16 v30, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v24 .. v30}, Lcom/whoop/navigation/MciOverviewScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v24

    :cond_d9
    sget-object v10, Lcom/whoop/navigation/AppScreen$v3;->w:Lcom/whoop/navigation/AppScreen$v3;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_db

    new-instance v0, Lcom/whoop/navigation/MciPhaseCoachingScreenModel;

    const-string v2, "phase"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_da

    move-object/from16 v5, v20

    goto :goto_62

    :cond_da
    move-object v5, v2

    :goto_62
    sget-object v2, Lcom/whoop/navigation/AiAction;->Companion:Lcom/whoop/navigation/AiAction$a;

    invoke-virtual {v2, v4}, Lcom/whoop/navigation/AiAction$a;->a(Ljava/util/Map;)Lcom/whoop/navigation/AiAction;

    move-result-object v2

    invoke-direct {v0, v5, v2}, Lcom/whoop/navigation/MciPhaseCoachingScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v0

    :cond_db
    sget-object v10, Lcom/whoop/navigation/AppScreen$w3;->w:Lcom/whoop/navigation/AppScreen$w3;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_dd

    new-instance v0, Lcom/whoop/navigation/MediaFocusModel;

    const-string v2, "video_url"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_dc

    move-object/from16 v5, v20

    goto :goto_63

    :cond_dc
    move-object v5, v2

    :goto_63
    invoke-direct {v0, v5}, Lcom/whoop/navigation/MediaFocusModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_dd
    sget-object v10, Lcom/whoop/navigation/AppScreen$y3;->w:Lcom/whoop/navigation/AppScreen$y3;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_de
    :goto_64
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v5, "tracking_source"

    const-string v6, "tracking_tier"

    if-eqz v3, :cond_df

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    filled-new-array {v6, v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_de

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_64

    :cond_df
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_e0

    move-object/from16 v5, v20

    goto :goto_65

    :cond_e0
    move-object v5, v3

    :goto_65
    new-instance v3, Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;

    invoke-direct {v3, v0, v2, v5}, Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;-><init>(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_e1
    sget-object v10, Lcom/whoop/navigation/AppScreen$z3;->w:Lcom/whoop/navigation/AppScreen$z3;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e2

    sget-object v0, Lcom/whoop/navigation/MembershipAndBillingScreenModel;->INSTANCE:Lcom/whoop/navigation/MembershipAndBillingScreenModel;

    return-object v0

    :cond_e2
    sget-object v10, Lcom/whoop/navigation/AppScreen$a4;->w:Lcom/whoop/navigation/AppScreen$a4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e3

    sget-object v0, Lcom/whoop/navigation/MembershipManagementScreenModel;->INSTANCE:Lcom/whoop/navigation/MembershipManagementScreenModel;

    return-object v0

    :cond_e3
    sget-object v10, Lcom/whoop/navigation/AppScreen$b4;->w:Lcom/whoop/navigation/AppScreen$b4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e4

    sget-object v0, Lcom/whoop/navigation/MenuScreenModel;->INSTANCE:Lcom/whoop/navigation/MenuScreenModel;

    return-object v0

    :cond_e4
    sget-object v10, Lcom/whoop/navigation/AppScreen$d4;->w:Lcom/whoop/navigation/AppScreen$d4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e5

    sget-object v0, Lcom/whoop/navigation/MyAccountScreenModel;->INSTANCE:Lcom/whoop/navigation/MyAccountScreenModel;

    return-object v0

    :cond_e5
    sget-object v10, Lcom/whoop/navigation/AppScreen$e4;->w:Lcom/whoop/navigation/AppScreen$e4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e7

    new-instance v0, Lcom/whoop/navigation/NativePlanSwitchModel;

    const-string v2, "subscription_type"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_e6

    move-object/from16 v5, v20

    goto :goto_66

    :cond_e6
    move-object v5, v2

    :goto_66
    invoke-direct {v0, v5}, Lcom/whoop/navigation/NativePlanSwitchModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_e7
    sget-object v10, Lcom/whoop/navigation/AppScreen$g4;->w:Lcom/whoop/navigation/AppScreen$g4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e9

    new-instance v0, Lcom/whoop/navigation/NativeStoreScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_e8

    const-string v2, "deeplink"

    :cond_e8
    invoke-direct {v0, v2}, Lcom/whoop/navigation/NativeStoreScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_e9
    sget-object v10, Lcom/whoop/navigation/AppScreen$f4;->w:Lcom/whoop/navigation/AppScreen$f4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const-string v13, "sku"

    if-eqz v10, :cond_eb

    new-instance v0, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;

    const-string v2, "slug"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_ea

    move-object/from16 v5, v20

    goto :goto_67

    :cond_ea
    move-object v5, v2

    :goto_67
    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v5, v2, v3}, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_eb
    sget-object v10, Lcom/whoop/navigation/AppScreen$r4;->w:Lcom/whoop/navigation/AppScreen$r4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_ed

    new-instance v0, Lcom/whoop/navigation/ProductSizeGuideScreenModel;

    const-string v2, "key"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_ec

    move-object/from16 v5, v20

    goto :goto_68

    :cond_ec
    move-object v5, v2

    :goto_68
    invoke-direct {v0, v5}, Lcom/whoop/navigation/ProductSizeGuideScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_ed
    sget-object v10, Lcom/whoop/navigation/AppScreen$m4;->w:Lcom/whoop/navigation/AppScreen$m4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_ef

    new-instance v0, Lcom/whoop/navigation/PaymentMethodManagementScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_ee

    move-object/from16 v5, v20

    goto :goto_69

    :cond_ee
    move-object v5, v2

    :goto_69
    invoke-direct {v0, v5}, Lcom/whoop/navigation/PaymentMethodManagementScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_ef
    sget-object v10, Lcom/whoop/navigation/AppScreen$n4;->w:Lcom/whoop/navigation/AppScreen$n4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f2

    new-instance v0, Lcom/whoop/navigation/PregnancyInsightsScreenModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_f0

    move-object/from16 v2, v20

    :cond_f0
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_f1

    move-object/from16 v5, v20

    goto :goto_6a

    :cond_f1
    move-object v5, v3

    :goto_6a
    sget-object v3, Lcom/whoop/navigation/AiAction;->Companion:Lcom/whoop/navigation/AiAction$a;

    invoke-virtual {v3, v4}, Lcom/whoop/navigation/AiAction$a;->a(Ljava/util/Map;)Lcom/whoop/navigation/AiAction;

    move-result-object v3

    invoke-direct {v0, v2, v5, v3}, Lcom/whoop/navigation/PregnancyInsightsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v0

    :cond_f2
    sget-object v10, Lcom/whoop/navigation/AppScreen$o4;->w:Lcom/whoop/navigation/AppScreen$o4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f5

    new-instance v0, Lcom/whoop/navigation/PregnancySettingsScreenModel;

    const-string v2, "pregnancyScreen"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_f3

    move-object/from16 v2, v20

    :cond_f3
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_f4

    move-object/from16 v5, v20

    goto :goto_6b

    :cond_f4
    move-object v5, v3

    :goto_6b
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/PregnancySettingsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_f5
    sget-object v10, Lcom/whoop/navigation/AppScreen$p4;->w:Lcom/whoop/navigation/AppScreen$p4;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f7

    new-instance v0, Lcom/whoop/navigation/PreviousPregnancyScreenModel;

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_f6

    move-object/from16 v5, v20

    goto :goto_6c

    :cond_f6
    move-object v5, v2

    :goto_6c
    invoke-direct {v0, v5}, Lcom/whoop/navigation/PreviousPregnancyScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_f7
    sget-object v10, Lcom/whoop/navigation/AppScreen$o1;->w:Lcom/whoop/navigation/AppScreen$o1;

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f9

    new-instance v0, Lcom/whoop/navigation/CommunityTeamScreenModel;

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_f8

    invoke-static {v2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_f8

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    goto :goto_6d

    :cond_f8
    const/4 v12, 0x0

    :goto_6d
    invoke-direct {v0, v12}, Lcom/whoop/navigation/CommunityTeamScreenModel;-><init>(I)V

    return-object v0

    :cond_f9
    sget-object v9, Lcom/whoop/navigation/AppScreen$p1;->w:Lcom/whoop/navigation/AppScreen$p1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_fa

    sget-object v0, Lcom/whoop/navigation/CommunityTeamsHubScreenModel;->INSTANCE:Lcom/whoop/navigation/CommunityTeamsHubScreenModel;

    return-object v0

    :cond_fa
    sget-object v9, Lcom/whoop/navigation/AppScreen$q4;->w:Lcom/whoop/navigation/AppScreen$q4;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_fb

    sget-object v0, Lcom/whoop/navigation/PrivacyScreenModel;->INSTANCE:Lcom/whoop/navigation/PrivacyScreenModel;

    return-object v0

    :cond_fb
    sget-object v9, Lcom/whoop/navigation/AppScreen$c2;->w:Lcom/whoop/navigation/AppScreen$c2;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_fc

    sget-object v0, Lcom/whoop/navigation/EnterpriseProgramSettingsScreenModel;->INSTANCE:Lcom/whoop/navigation/EnterpriseProgramSettingsScreenModel;

    return-object v0

    :cond_fc
    sget-object v9, Lcom/whoop/navigation/AppScreen$u4;->w:Lcom/whoop/navigation/AppScreen$u4;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_ff

    new-instance v24, Lcom/whoop/navigation/RecoveryDetailsScreenModel;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_fd

    move-object/from16 v25, v20

    goto :goto_6e

    :cond_fd
    move-object/from16 v25, v0

    :goto_6e
    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_fe

    move-object/from16 v26, v20

    goto :goto_6f

    :cond_fe
    move-object/from16 v26, v0

    :goto_6f
    const/16 v28, 0x4

    const/16 v29, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v24 .. v29}, Lcom/whoop/navigation/RecoveryDetailsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v24

    :cond_ff
    sget-object v9, Lcom/whoop/navigation/AppScreen$v4;->w:Lcom/whoop/navigation/AppScreen$v4;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const-string v10, "share_message"

    if-eqz v9, :cond_106

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_100

    move-object/from16 v5, v20

    goto :goto_70

    :cond_100
    move-object v5, v0

    :goto_70
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_101

    move-object/from16 v6, v20

    goto :goto_71

    :cond_101
    move-object v6, v0

    :goto_71
    const-string v0, "checkout_origin"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_102

    move-object/from16 v7, v20

    goto :goto_72

    :cond_102
    move-object v7, v0

    :goto_72
    iget-object v2, v1, Lcom/whoop/navigation/f;->a:Ll02/a;

    const-string v0, "analytics_properties"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_104

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_103

    goto :goto_73

    :cond_103
    const/4 v0, 0x0

    :goto_73
    if-eqz v0, :cond_104

    invoke-virtual {v2}, Ll02/a;->c()Lad3/c;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v8, v9, v9}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-virtual {v3, v8, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_74

    :catch_3
    move-exception v0

    invoke-virtual {v2}, Ll02/a;->d()Ltr2/n;

    move-result-object v2

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x0

    new-array v8, v8, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v8}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_104
    const/4 v0, 0x0

    :goto_74
    move-object v8, v0

    check-cast v8, Ljava/util/Map;

    const-string v0, "disable_default_open_sheet_analytic"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_105

    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    move-object v9, v0

    goto :goto_75

    :cond_105
    const/4 v9, 0x0

    :goto_75
    new-instance v4, Lcom/whoop/navigation/ReferAFriendScreenModel;

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/ReferAFriendScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;)V

    move-object/from16 v22, v4

    goto/16 :goto_9b

    :cond_106
    sget-object v9, Lcom/whoop/navigation/AppScreen$w4;->w:Lcom/whoop/navigation/AppScreen$w4;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10c

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_107

    move-object/from16 v5, v20

    goto :goto_76

    :cond_107
    move-object v5, v0

    :goto_76
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_109

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_108

    goto :goto_77

    :cond_108
    const/4 v0, 0x0

    :goto_77
    if-nez v0, :cond_10a

    :cond_109
    const-string v0, "Deeplink"

    :cond_10a
    const-string v2, "graph_id"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_10b

    invoke-static {v2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_78

    :cond_10b
    const/4 v7, 0x0

    :goto_78
    new-instance v2, Lcom/whoop/navigation/ReferAFriendHubScreenModel;

    const/4 v3, 0x1

    invoke-direct {v2, v5, v0, v7, v3}, Lcom/whoop/navigation/ReferAFriendHubScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V

    return-object v2

    :cond_10c
    sget-object v9, Lcom/whoop/navigation/AppScreen$x4;->w:Lcom/whoop/navigation/AppScreen$x4;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10e

    new-instance v0, Lcom/whoop/navigation/ReferAFriendReceiverScreenModel;

    const-string v2, "code"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_10d

    move-object/from16 v5, v20

    goto :goto_79

    :cond_10d
    move-object v5, v2

    :goto_79
    invoke-direct {v0, v5}, Lcom/whoop/navigation/ReferAFriendReceiverScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_10e
    sget-object v9, Lcom/whoop/navigation/AppScreen$z4;->w:Lcom/whoop/navigation/AppScreen$z4;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10f

    sget-object v0, Lcom/whoop/navigation/ReturnsScreenModel;->INSTANCE:Lcom/whoop/navigation/ReturnsScreenModel;

    return-object v0

    :cond_10f
    sget-object v9, Lcom/whoop/navigation/AppScreen$y4;->w:Lcom/whoop/navigation/AppScreen$y4;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_110

    new-instance v24, Lcom/whoop/navigation/CheckoutScreenModel;

    const-string v0, "resume_link"

    invoke-static {v3, v0}, Lwb3/f;->e0(Ljava/lang/Object;Ljava/lang/Object;)Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v26

    sget-object v28, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/16 v29, 0x0

    const-string v25, "/growth-content-service/v1/reactivations/one-click-resume"

    const/16 v27, 0x0

    invoke-direct/range {v24 .. v29}, Lcom/whoop/navigation/CheckoutScreenModel;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-object v24

    :cond_110
    sget-object v9, Lcom/whoop/navigation/AppScreen$a5;->w:Lcom/whoop/navigation/AppScreen$a5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_113

    new-instance v0, Lcom/whoop/navigation/SageScreenModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_111

    move-object/from16 v2, v20

    :cond_111
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_112

    move-object/from16 v5, v20

    goto :goto_7a

    :cond_112
    move-object v5, v3

    :goto_7a
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/SageScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_113
    sget-object v9, Lcom/whoop/navigation/AppScreen$b5;->w:Lcom/whoop/navigation/AppScreen$b5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_114

    new-instance v0, Lcom/whoop/navigation/SageManualEntryScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/SageManualEntryScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_114
    sget-object v9, Lcom/whoop/navigation/AppScreen$c5;->w:Lcom/whoop/navigation/AppScreen$c5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_115

    sget-object v0, Lcom/whoop/navigation/SageOnboardingScreenModel;->INSTANCE:Lcom/whoop/navigation/SageOnboardingScreenModel;

    return-object v0

    :cond_115
    sget-object v9, Lcom/whoop/navigation/AppScreen$d5;->w:Lcom/whoop/navigation/AppScreen$d5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_117

    new-instance v0, Lcom/whoop/navigation/SanguineWaitlistScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "sign_up_on_entry"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_116

    invoke-static {v3}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_7b

    :cond_116
    const/4 v7, 0x0

    :goto_7b
    invoke-direct {v0, v2, v7}, Lcom/whoop/navigation/SanguineWaitlistScreenModel;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0

    :cond_117
    sget-object v9, Lcom/whoop/navigation/AppScreen$e5;->w:Lcom/whoop/navigation/AppScreen$e5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_118

    sget-object v0, Lcom/whoop/navigation/SanguineWaitlistBiomarkersScreenModel;->INSTANCE:Lcom/whoop/navigation/SanguineWaitlistBiomarkersScreenModel;

    return-object v0

    :cond_118
    sget-object v9, Lcom/whoop/navigation/AppScreen$f5;->w:Lcom/whoop/navigation/AppScreen$f5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11a

    new-instance v0, Lcom/whoop/navigation/SeeAllRecordingsScreenModel;

    const-string v2, "measurement_id"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_119

    move-object/from16 v5, v20

    goto :goto_7c

    :cond_119
    move-object v5, v2

    :goto_7c
    invoke-direct {v0, v5}, Lcom/whoop/navigation/SeeAllRecordingsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_11a
    sget-object v9, Lcom/whoop/navigation/AppScreen$g5;->w:Lcom/whoop/navigation/AppScreen$g5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11b

    sget-object v0, Lcom/whoop/navigation/ShepherdAboutModel;->INSTANCE:Lcom/whoop/navigation/ShepherdAboutModel;

    return-object v0

    :cond_11b
    sget-object v9, Lcom/whoop/navigation/AppScreen$h5;->w:Lcom/whoop/navigation/AppScreen$h5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11e

    new-instance v0, Lcom/whoop/navigation/ShepherdDetailsModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_11c

    move-object/from16 v2, v20

    :cond_11c
    const-string v3, "education_name"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_11d

    move-object/from16 v5, v20

    goto :goto_7d

    :cond_11d
    move-object v5, v3

    :goto_7d
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/ShepherdDetailsModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_11e
    sget-object v9, Lcom/whoop/navigation/AppScreen$i5;->w:Lcom/whoop/navigation/AppScreen$i5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11f

    sget-object v0, Lcom/whoop/navigation/ShepherdHistoryModel;->INSTANCE:Lcom/whoop/navigation/ShepherdHistoryModel;

    return-object v0

    :cond_11f
    sget-object v9, Lcom/whoop/navigation/AppScreen$j5;->w:Lcom/whoop/navigation/AppScreen$j5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_120

    sget-object v0, Lcom/whoop/navigation/ShepherdOnboardingModel;->INSTANCE:Lcom/whoop/navigation/ShepherdOnboardingModel;

    return-object v0

    :cond_120
    sget-object v9, Lcom/whoop/navigation/AppScreen$k5;->w:Lcom/whoop/navigation/AppScreen$k5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_121

    sget-object v0, Lcom/whoop/navigation/ShepherdRegistrationModel;->INSTANCE:Lcom/whoop/navigation/ShepherdRegistrationModel;

    return-object v0

    :cond_121
    sget-object v9, Lcom/whoop/navigation/AppScreen$l5;->w:Lcom/whoop/navigation/AppScreen$l5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_122

    sget-object v0, Lcom/whoop/navigation/ShepherdSettingsModel;->INSTANCE:Lcom/whoop/navigation/ShepherdSettingsModel;

    return-object v0

    :cond_122
    sget-object v9, Lcom/whoop/navigation/AppScreen$m5;->w:Lcom/whoop/navigation/AppScreen$m5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_124

    new-instance v24, Lcom/whoop/navigation/SleepDetailsScreenModel;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_123

    move-object/from16 v25, v20

    goto :goto_7e

    :cond_123
    move-object/from16 v25, v0

    :goto_7e
    const/16 v28, 0x6

    const/16 v29, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v24 .. v29}, Lcom/whoop/navigation/SleepDetailsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v24

    :cond_124
    sget-object v9, Lcom/whoop/navigation/AppScreen$n5;->w:Lcom/whoop/navigation/AppScreen$n5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_125

    sget-object v0, Lcom/whoop/navigation/SleepPlannerScreenModel;->INSTANCE:Lcom/whoop/navigation/SleepPlannerScreenModel;

    return-object v0

    :cond_125
    sget-object v9, Lcom/whoop/navigation/AppScreen$p5;->w:Lcom/whoop/navigation/AppScreen$p5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_126

    sget-object v0, Lcom/whoop/navigation/StartActivityScreenModel;->INSTANCE:Lcom/whoop/navigation/StartActivityScreenModel;

    return-object v0

    :cond_126
    sget-object v9, Lcom/whoop/navigation/AppScreen$q5;->w:Lcom/whoop/navigation/AppScreen$q5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_127

    sget-object v0, Lcom/whoop/navigation/StartActivityScreenModel;->INSTANCE:Lcom/whoop/navigation/StartActivityScreenModel;

    return-object v0

    :cond_127
    sget-object v9, Lcom/whoop/navigation/AppScreen$r5;->w:Lcom/whoop/navigation/AppScreen$r5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_128

    sget-object v0, Lcom/whoop/navigation/StartActivityScreenModel;->INSTANCE:Lcom/whoop/navigation/StartActivityScreenModel;

    return-object v0

    :cond_128
    sget-object v9, Lcom/whoop/navigation/AppScreen$s5;->w:Lcom/whoop/navigation/AppScreen$s5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12b

    new-instance v0, Lcom/whoop/navigation/StartActivitySportModel;

    const-string v2, "sport_id"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_129

    invoke-static {v2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_7f

    :cond_129
    const/4 v2, 0x0

    :goto_7f
    const-string v3, "auto_start_activity"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_12a

    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_80

    :cond_12a
    const/4 v7, 0x0

    :goto_80
    invoke-direct {v0, v2, v7}, Lcom/whoop/navigation/StartActivitySportModel;-><init>(Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-object v0

    :cond_12b
    sget-object v9, Lcom/whoop/navigation/AppScreen$u5;->w:Lcom/whoop/navigation/AppScreen$u5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12c

    sget-object v0, Lcom/whoop/navigation/StreaksExplainerModel;->INSTANCE:Lcom/whoop/navigation/StreaksExplainerModel;

    return-object v0

    :cond_12c
    sget-object v9, Lcom/whoop/navigation/AppScreen$v5;->w:Lcom/whoop/navigation/AppScreen$v5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12f

    const-string v0, "open_tab"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_12d

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_12d

    move-object v7, v0

    goto :goto_81

    :cond_12d
    const/4 v7, 0x0

    :goto_81
    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_12e

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_12e

    move-object v6, v0

    goto :goto_82

    :cond_12e
    const/4 v6, 0x0

    :goto_82
    sget-object v0, Lcom/whoop/navigation/AiAction;->Companion:Lcom/whoop/navigation/AiAction$a;

    invoke-virtual {v0, v4}, Lcom/whoop/navigation/AiAction$a;->a(Ljava/util/Map;)Lcom/whoop/navigation/AiAction;

    move-result-object v9

    new-instance v3, Lcom/whoop/navigation/StrengthTrainerScreenModel;

    const/16 v10, 0x13

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/whoop/navigation/StrengthTrainerScreenModel;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_12f
    sget-object v9, Lcom/whoop/navigation/AppScreen$w5;->w:Lcom/whoop/navigation/AppScreen$w5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_131

    new-instance v0, Lcom/whoop/navigation/StressInterventionModel;

    const-string v2, "intervention_type"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_130

    move-object/from16 v5, v20

    goto :goto_83

    :cond_130
    move-object v5, v2

    :goto_83
    invoke-direct {v0, v5}, Lcom/whoop/navigation/StressInterventionModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_131
    sget-object v9, Lcom/whoop/navigation/AppScreen$x5;->w:Lcom/whoop/navigation/AppScreen$x5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_132

    new-instance v0, Lcom/whoop/navigation/StressMonitorScreenModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4, v3, v4}, Lcom/whoop/navigation/StressMonitorScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_132
    sget-object v9, Lcom/whoop/navigation/AppScreen$y5;->w:Lcom/whoop/navigation/AppScreen$y5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_133

    new-instance v0, Lcom/whoop/navigation/SymptomPatternsScreenModel;

    const-string v2, "featureType"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/SymptomPatternsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_133
    sget-object v9, Lcom/whoop/navigation/AppScreen$z5;->w:Lcom/whoop/navigation/AppScreen$z5;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_134

    new-instance v0, Lcom/whoop/navigation/TiltModeScreenModel;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/whoop/navigation/TiltModeScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_134
    sget-object v9, Lcom/whoop/navigation/AppScreen$a6;->w:Lcom/whoop/navigation/AppScreen$a6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_137

    new-instance v24, Lcom/whoop/navigation/TrendsScreenModel;

    const-string v0, "trend_key"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_135

    move-object/from16 v25, v20

    goto :goto_84

    :cond_135
    move-object/from16 v25, v0

    :goto_84
    const-string v0, "duration"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_136

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_136

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v12

    move/from16 v26, v12

    goto :goto_85

    :cond_136
    const/16 v26, 0x1

    :goto_85
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Ljava/lang/String;

    const/16 v31, 0x38

    const/16 v32, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v24 .. v32}, Lcom/whoop/navigation/TrendsScreenModel;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v24

    :cond_137
    sget-object v9, Lcom/whoop/navigation/AppScreen$d6;->w:Lcom/whoop/navigation/AppScreen$d6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const-string v10, "method"

    const-string v14, "payload"

    if-eqz v9, :cond_13d

    iget-object v2, v1, Lcom/whoop/navigation/f;->a:Ll02/a;

    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_139

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_138

    goto :goto_86

    :cond_138
    const/4 v0, 0x0

    :goto_86
    if-eqz v0, :cond_139

    invoke-virtual {v2}, Ll02/a;->c()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lcom/whoop/navigation/UniversalCheckoutPayload;->Companion:Lcom/whoop/navigation/UniversalCheckoutPayload$a;

    invoke-virtual {v6}, Lcom/whoop/navigation/UniversalCheckoutPayload$a;->serializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-virtual {v5, v6, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_87

    :catch_4
    move-exception v0

    invoke-virtual {v2}, Ll02/a;->d()Ltr2/n;

    move-result-object v2

    const-class v5, Lcom/whoop/navigation/UniversalCheckoutPayload;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-interface {v5}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v15, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v2, v5, v0, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_139
    const/4 v0, 0x0

    :goto_87
    check-cast v0, Lcom/whoop/navigation/UniversalCheckoutPayload;

    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_13a

    move-object/from16 v2, v20

    :cond_13a
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_13b

    move-object/from16 v5, v20

    goto :goto_88

    :cond_13b
    move-object v5, v3

    :goto_88
    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_13c

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_13c

    move-object v7, v3

    goto :goto_89

    :cond_13c
    const/4 v7, 0x0

    :goto_89
    new-instance v3, Lcom/whoop/navigation/UniversalCheckoutScreenModel;

    invoke-direct {v3, v2, v0, v5, v7}, Lcom/whoop/navigation/UniversalCheckoutScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/UniversalCheckoutPayload;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v22, v3

    goto/16 :goto_9b

    :cond_13d
    sget-object v9, Lcom/whoop/navigation/AppScreen$h1;->w:Lcom/whoop/navigation/AppScreen$h1;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_143

    iget-object v2, v1, Lcom/whoop/navigation/f;->a:Ll02/a;

    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_13f

    :try_start_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_13e

    goto :goto_8a

    :cond_13e
    const/4 v0, 0x0

    :goto_8a
    if-eqz v0, :cond_13f

    invoke-virtual {v2}, Ll02/a;->c()Lad3/c;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lcom/whoop/navigation/CheckoutWithCartPayload;->Companion:Lcom/whoop/navigation/CheckoutWithCartPayload$a;

    invoke-virtual {v6}, Lcom/whoop/navigation/CheckoutWithCartPayload$a;->serializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-virtual {v5, v6, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_8b

    :catch_5
    move-exception v0

    invoke-virtual {v2}, Ll02/a;->d()Ltr2/n;

    move-result-object v2

    const-class v5, Lcom/whoop/navigation/CheckoutWithCartPayload;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-interface {v5}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v15, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v2, v5, v0, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_13f
    const/4 v7, 0x0

    :goto_8b
    check-cast v7, Lcom/whoop/navigation/CheckoutWithCartPayload;

    new-instance v0, Lcom/whoop/navigation/CheckoutWithCartScreenModel;

    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_140

    move-object/from16 v2, v20

    :cond_140
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_141

    move-object/from16 v3, v20

    :cond_141
    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_142

    move-object/from16 v5, v20

    goto :goto_8c

    :cond_142
    move-object v5, v4

    :goto_8c
    invoke-direct {v0, v2, v7, v3, v5}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/CheckoutWithCartPayload;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v22, v0

    goto/16 :goto_9b

    :cond_143
    sget-object v9, Lcom/whoop/navigation/AppScreen$e6;->w:Lcom/whoop/navigation/AppScreen$e6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const-string v10, "cart_id"

    if-eqz v9, :cond_146

    new-instance v0, Lcom/whoop/navigation/UniversalCheckoutShippingAddressScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_144

    move-object/from16 v2, v20

    :cond_144
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_145

    move-object/from16 v5, v20

    goto :goto_8d

    :cond_145
    move-object v5, v3

    :goto_8d
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/UniversalCheckoutShippingAddressScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_146
    sget-object v9, Lcom/whoop/navigation/AppScreen$f6;->w:Lcom/whoop/navigation/AppScreen$f6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_149

    new-instance v0, Lcom/whoop/navigation/UniversalCheckoutShippingMethodScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_147

    move-object/from16 v2, v20

    :cond_147
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_148

    move-object/from16 v5, v20

    goto :goto_8e

    :cond_148
    move-object v5, v3

    :goto_8e
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/UniversalCheckoutShippingMethodScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_149
    sget-object v9, Lcom/whoop/navigation/AppScreen$c6;->w:Lcom/whoop/navigation/AppScreen$c6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_14a

    new-instance v0, Lcom/whoop/navigation/UniversalCartScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v5, v3}, Lcom/whoop/navigation/UniversalCartScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_14a
    sget-object v9, Lcom/whoop/navigation/AppScreen$b6;->w:Lcom/whoop/navigation/AppScreen$b6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x6

    const/16 v14, 0x2c

    if-eqz v9, :cond_14e

    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Ljava/lang/String;

    const-string v0, "pack_sku"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Ljava/lang/String;

    const-string v0, "child_item_skus"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_14d

    const/4 v3, 0x1

    new-array v2, v3, [C

    const/4 v6, 0x0

    aput-char v14, v2, v6

    invoke-static {v0, v2, v6, v10}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_14b
    :goto_8f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_14b

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8f

    :cond_14c
    move-object/from16 v27, v7

    goto :goto_90

    :cond_14d
    const/16 v27, 0x0

    :goto_90
    const-string v0, "wyw_sku"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v28, v0

    check-cast v28, Ljava/lang/String;

    const-string v0, "band_sku"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v29, v0

    check-cast v29, Ljava/lang/String;

    const-string v0, "clasp_sku"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v30, v0

    check-cast v30, Ljava/lang/String;

    const-string v0, "hook_sku"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v31, v0

    check-cast v31, Ljava/lang/String;

    const-string v0, "fast_link_sku"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v32, v0

    check-cast v32, Ljava/lang/String;

    const-string v0, "store_domain"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v33, v0

    check-cast v33, Ljava/lang/String;

    new-instance v24, Lcom/whoop/navigation/UniversalBuyNowScreenModel;

    invoke-direct/range {v24 .. v33}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v24

    :cond_14e
    sget-object v9, Lcom/whoop/navigation/AppScreen$s0;->w:Lcom/whoop/navigation/AppScreen$s0;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_151

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsUpdateTestsScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_14f

    move-object/from16 v2, v20

    :cond_14f
    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_150

    move-object/from16 v5, v20

    goto :goto_91

    :cond_150
    move-object v5, v3

    :goto_91
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/AdvancedLabsUpdateTestsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_151
    sget-object v9, Lcom/whoop/navigation/AppScreen$j6;->w:Lcom/whoop/navigation/AppScreen$j6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_152

    sget-object v0, Lcom/whoop/navigation/WeekInReviewScreenModel;->INSTANCE:Lcom/whoop/navigation/WeekInReviewScreenModel;

    return-object v0

    :cond_152
    sget-object v9, Lcom/whoop/navigation/AppScreen$k6;->w:Lcom/whoop/navigation/AppScreen$k6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const-string v13, "analytics_source"

    if-eqz v9, :cond_155

    new-instance v0, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;

    const-string v2, "plan_edit_screens"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_153

    const-string v3, "["

    const-string v5, "]"

    invoke-static {v2, v3, v5}, Lyb3/r;->t0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [C

    const/4 v6, 0x0

    aput-char v14, v3, v6

    invoke-static {v2, v3, v6, v10}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v2

    goto :goto_92

    :cond_153
    sget-object v2, Lm83/y;->w:Lm83/y;

    :goto_92
    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_154

    move-object/from16 v5, v20

    goto :goto_93

    :cond_154
    move-object v5, v3

    :goto_93
    invoke-direct {v0, v2, v5}, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v0

    :cond_155
    sget-object v9, Lcom/whoop/navigation/AppScreen$m6;->w:Lcom/whoop/navigation/AppScreen$m6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const-string v10, "plan_id"

    if-eqz v9, :cond_157

    new-instance v0, Lcom/whoop/navigation/WeeklyPlanPresetLandingScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_156

    move-object/from16 v5, v20

    goto :goto_94

    :cond_156
    move-object v5, v2

    :goto_94
    invoke-direct {v0, v5}, Lcom/whoop/navigation/WeeklyPlanPresetLandingScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_157
    sget-object v9, Lcom/whoop/navigation/AppScreen$o6;->w:Lcom/whoop/navigation/AppScreen$o6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_159

    new-instance v0, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_158

    move-object/from16 v5, v20

    :goto_95
    const/4 v3, 0x2

    const/4 v4, 0x0

    goto :goto_96

    :cond_158
    move-object v5, v2

    goto :goto_95

    :goto_96
    invoke-direct {v0, v5, v4, v3, v4}, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_159
    sget-object v9, Lcom/whoop/navigation/AppScreen$n6;->w:Lcom/whoop/navigation/AppScreen$n6;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_161

    const-string v0, "initialSelection"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_15a

    const-string v0, "initial_selection"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_15a
    move-object v2, v0

    iget-object v6, v1, Lcom/whoop/navigation/f;->a:Ll02/a;

    if-eqz v2, :cond_15c

    :try_start_6
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_15b

    goto :goto_97

    :cond_15b
    const/4 v2, 0x0

    :goto_97
    if-eqz v2, :cond_15c

    invoke-virtual {v6}, Ll02/a;->c()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lcom/whoop/navigation/InitialSelectionModel;->Companion:Lcom/whoop/navigation/InitialSelectionModel$a;

    invoke-virtual {v7}, Lcom/whoop/navigation/InitialSelectionModel$a;->serializer()Lwc3/c;

    move-result-object v7

    check-cast v7, Lwc3/b;

    invoke-virtual {v0, v7, v2}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_98

    :catch_6
    move-exception v0

    invoke-virtual {v6}, Ll02/a;->d()Ltr2/n;

    move-result-object v2

    const-class v6, Lcom/whoop/navigation/InitialSelectionModel;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-interface {v6}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x0

    new-array v7, v9, [Lqr2/a$a;

    invoke-interface {v2, v6, v0, v7}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_15c
    const/4 v7, 0x0

    :goto_98
    move-object/from16 v26, v7

    check-cast v26, Lcom/whoop/navigation/InitialSelectionModel;

    new-instance v21, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    const-string v0, "plan_name"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_15d

    move-object/from16 v22, v20

    goto :goto_99

    :cond_15d
    move-object/from16 v22, v0

    :goto_99
    const-string v0, "locked"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v23

    const-string v0, "no_plan_show_metric_selection"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v24

    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_15e

    move-object/from16 v25, v20

    goto :goto_9a

    :cond_15e
    move-object/from16 v25, v0

    :goto_9a
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v28, v0

    check-cast v28, Ljava/lang/String;

    const-string v0, "presetPlanCategory"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v29, v0

    check-cast v29, Ljava/lang/String;

    const-string v0, "planTitle"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v30, v0

    check-cast v30, Ljava/lang/String;

    const-string v0, "description"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v31, v0

    check-cast v31, Ljava/lang/String;

    const-string v0, "explanationTitle"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_15f

    const-string v0, "explanation_title"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_15f
    move-object/from16 v32, v0

    const-string v0, "explanation"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v33, v0

    check-cast v33, Ljava/lang/String;

    const-string v0, "templateId"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_160

    const-string v0, "template_id"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_160
    move-object/from16 v34, v0

    const v38, 0xe000

    const/16 v39, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v21 .. v39}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;-><init>(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v21

    :goto_9b
    return-object v22

    :cond_161
    const/4 v9, 0x0

    sget-object v5, Lcom/whoop/navigation/AppScreen$l6;->w:Lcom/whoop/navigation/AppScreen$l6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_163

    new-instance v23, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;

    const-string v0, "scroll_id"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_162

    move-object/from16 v25, v20

    goto :goto_9c

    :cond_162
    move-object/from16 v25, v0

    :goto_9c
    const/16 v28, 0xd

    const/16 v29, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v23 .. v29}, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v23

    :cond_163
    sget-object v5, Lcom/whoop/navigation/AppScreen$p6;->w:Lcom/whoop/navigation/AppScreen$p6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_165

    new-instance v0, Lcom/whoop/navigation/WeightliftingDetailsScreenModel;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_164

    move-object/from16 v5, v20

    :goto_9d
    const/4 v2, 0x0

    const/4 v3, 0x2

    goto :goto_9e

    :cond_164
    move-object v5, v2

    goto :goto_9d

    :goto_9e
    invoke-direct {v0, v5, v2, v3, v2}, Lcom/whoop/navigation/WeightliftingDetailsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_165
    const/4 v2, 0x0

    sget-object v5, Lcom/whoop/navigation/AppScreen$r6;->w:Lcom/whoop/navigation/AppScreen$r6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const-string v10, "sessionId"

    const-string v13, "campaignId"

    if-eqz v5, :cond_168

    new-instance v14, Lcom/whoop/navigation/WhoopLabsHomeScreenModel;

    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_166

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    move-object v15, v0

    goto :goto_9f

    :cond_166
    move-object v15, v2

    :goto_9f
    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_167

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v16, v7

    goto :goto_a0

    :cond_167
    move-object/from16 v16, v2

    :goto_a0
    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lcom/whoop/navigation/WhoopLabsHomeScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14

    :cond_168
    sget-object v5, Lcom/whoop/navigation/AppScreen$s6;->w:Lcom/whoop/navigation/AppScreen$s6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_16b

    new-instance v14, Lcom/whoop/navigation/WhoopLabsScreenModel;

    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_169

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_169

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v12

    goto :goto_a1

    :cond_169
    move v12, v9

    :goto_a1
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_16a

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v16, v7

    goto :goto_a2

    :cond_16a
    move-object/from16 v16, v2

    :goto_a2
    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lcom/whoop/navigation/WhoopLabsScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14

    :cond_16b
    sget-object v5, Lcom/whoop/navigation/AppScreen$t6;->w:Lcom/whoop/navigation/AppScreen$t6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_16d

    new-instance v13, Lcom/whoop/navigation/WhoopLabsScreenModel;

    const-string v0, "campaign_filter"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_16c

    move-object/from16 v16, v20

    goto :goto_a3

    :cond_16c
    move-object/from16 v16, v0

    :goto_a3
    const/16 v17, 0x3

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v13 .. v18}, Lcom/whoop/navigation/WhoopLabsScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v13

    :cond_16d
    sget-object v5, Lcom/whoop/navigation/AppScreen$v6;->w:Lcom/whoop/navigation/AppScreen$v6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_16e

    new-instance v0, Lcom/whoop/navigation/WhoopShareScreenModel;

    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/whoop/navigation/WhoopShareScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_16e
    sget-object v5, Lcom/whoop/navigation/AppScreen$u6;->w:Lcom/whoop/navigation/AppScreen$u6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_175

    new-instance v23, Lcom/whoop/navigation/WhoopLiveScreenModel;

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_16f

    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v24, v0

    goto :goto_a4

    :cond_16f
    move-object/from16 v24, v2

    :goto_a4
    const-string v0, "lower_bound"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Ljava/lang/String;

    const-string v0, "upper_bound"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Ljava/lang/String;

    const-string v0, "day_strain"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_170

    invoke-static {v0}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v27, v0

    goto :goto_a5

    :cond_170
    move-object/from16 v27, v2

    :goto_a5
    const-string v0, "recovery_score"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_171

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v28, v0

    goto :goto_a6

    :cond_171
    move-object/from16 v28, v2

    :goto_a6
    const-string v0, "sleep_milliseconds"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_172

    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v29, v0

    goto :goto_a7

    :cond_172
    move-object/from16 v29, v2

    :goto_a7
    const-string v0, "calories"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_173

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v30, v0

    goto :goto_a8

    :cond_173
    move-object/from16 v30, v2

    :goto_a8
    const-string v0, "is_complete"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_174

    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v7

    move-object/from16 v31, v7

    goto :goto_a9

    :cond_174
    move-object/from16 v31, v2

    :goto_a9
    invoke-direct/range {v23 .. v31}, Lcom/whoop/navigation/WhoopLiveScreenModel;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-object v23

    :cond_175
    sget-object v5, Lcom/whoop/navigation/AppScreen$q6;->w:Lcom/whoop/navigation/AppScreen$q6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_176

    sget-object v0, Lcom/whoop/navigation/WhatToExpectScreenModel;->INSTANCE:Lcom/whoop/navigation/WhatToExpectScreenModel;

    return-object v0

    :cond_176
    sget-object v5, Lcom/whoop/navigation/AppScreen$w6;->w:Lcom/whoop/navigation/AppScreen$w6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_178

    new-instance v0, Lcom/whoop/navigation/YearInReviewScreenModel;

    const-string v2, "year"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_177

    invoke-static {v2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_177

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_aa

    :cond_177
    const/16 v2, 0x7e9

    :goto_aa
    invoke-direct {v0, v2}, Lcom/whoop/navigation/YearInReviewScreenModel;-><init>(I)V

    return-object v0

    :cond_178
    sget-object v5, Lcom/whoop/navigation/AppScreen$h6;->w:Lcom/whoop/navigation/AppScreen$h6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_179

    sget-object v0, Lcom/whoop/navigation/UpcycleLandingScreenModel;->INSTANCE:Lcom/whoop/navigation/UpcycleLandingScreenModel;

    return-object v0

    :cond_179
    sget-object v5, Lcom/whoop/navigation/AppScreen$i6;->w:Lcom/whoop/navigation/AppScreen$i6;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_17b

    new-instance v0, Lcom/whoop/navigation/VideoCallScreenModel;

    const-string v2, "call_id"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_17a

    move-object/from16 v5, v20

    goto :goto_ab

    :cond_17a
    move-object v5, v2

    :goto_ab
    invoke-direct {v0, v5}, Lcom/whoop/navigation/VideoCallScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_17b
    sget-object v5, Lcom/whoop/navigation/AppScreen$s4;->w:Lcom/whoop/navigation/AppScreen$s4;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_17f

    new-instance v12, Lcom/whoop/navigation/ProfileScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_17c

    move-object/from16 v13, v20

    goto :goto_ac

    :cond_17c
    move-object v13, v0

    :goto_ac
    const-string v0, "targetUserId"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_17d

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    move-object v14, v0

    goto :goto_ad

    :cond_17d
    move-object v14, v2

    :goto_ad
    const-string v0, "communityId"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_17e

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    move-object v15, v7

    goto :goto_ae

    :cond_17e
    move-object v15, v2

    :goto_ae
    const/16 v17, 0x8

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lcom/whoop/navigation/ProfileScreenModel;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v12

    :cond_17f
    sget-object v2, Lcom/whoop/navigation/AppScreen$m0;->w:Lcom/whoop/navigation/AppScreen$m0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_182

    new-instance v0, Lcom/whoop/navigation/AdvancedLabsPurchaseAddOnsScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_180

    move-object/from16 v2, v20

    :cond_180
    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_181

    move-object/from16 v5, v20

    :goto_af
    move-object/from16 v3, v22

    goto :goto_b0

    :cond_181
    move-object v5, v3

    goto :goto_af

    :goto_b0
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v5, v3}, Lcom/whoop/navigation/AdvancedLabsPurchaseAddOnsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_182
    sget-object v2, Lcom/whoop/navigation/AppScreen$t4;->w:Lcom/whoop/navigation/AppScreen$t4;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_183

    sget-object v0, Lcom/whoop/navigation/ReactivationUpsellScreenModel;->INSTANCE:Lcom/whoop/navigation/ReactivationUpsellScreenModel;

    return-object v0

    :cond_183
    sget-object v2, Lcom/whoop/navigation/AppScreen$i4;->w:Lcom/whoop/navigation/AppScreen$i4;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_186

    new-instance v0, Lcom/whoop/navigation/OnboardingStoryScreenModel;

    const-string v2, "onboarding_story_name"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_184

    move-object/from16 v5, v20

    goto :goto_b1

    :cond_184
    move-object v5, v2

    :goto_b1
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_185

    invoke-static {v2}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_185

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    :cond_185
    invoke-direct {v0, v5, v6, v7}, Lcom/whoop/navigation/OnboardingStoryScreenModel;-><init>(Ljava/lang/String;J)V

    return-object v0

    :cond_186
    sget-object v2, Lcom/whoop/navigation/AppScreen$i2;->w:Lcom/whoop/navigation/AppScreen$i2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_188

    new-instance v0, Lcom/whoop/navigation/FeatureEducationModel;

    const-string v2, "feature_education_name"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_187

    move-object/from16 v5, v20

    goto :goto_b2

    :cond_187
    move-object v5, v2

    :goto_b2
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/FeatureEducationModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_188
    sget-object v2, Lcom/whoop/navigation/AppScreen$d;->w:Lcom/whoop/navigation/AppScreen$d;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_189

    new-instance v2, Lcom/whoop/navigation/ActivationAccountActivationScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationAccountActivationScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_189
    sget-object v2, Lcom/whoop/navigation/AppScreen$e;->w:Lcom/whoop/navigation/AppScreen$e;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18a

    new-instance v2, Lcom/whoop/navigation/ActivationAccountCreationScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationAccountCreationScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_18a
    sget-object v2, Lcom/whoop/navigation/AppScreen$f;->w:Lcom/whoop/navigation/AppScreen$f;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18b

    new-instance v2, Lcom/whoop/navigation/ActivationAccountTransitionLegacyAfterActivationScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationAccountTransitionLegacyAfterActivationScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_18b
    sget-object v2, Lcom/whoop/navigation/AppScreen$g;->w:Lcom/whoop/navigation/AppScreen$g;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18c

    new-instance v2, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_18c
    sget-object v2, Lcom/whoop/navigation/AppScreen$h;->w:Lcom/whoop/navigation/AppScreen$h;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18d

    new-instance v2, Lcom/whoop/navigation/ActivationAlAfterActivationScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationAlAfterActivationScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_18d
    sget-object v2, Lcom/whoop/navigation/AppScreen$i;->w:Lcom/whoop/navigation/AppScreen$i;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18e

    new-instance v2, Lcom/whoop/navigation/ActivationAlPermissionsScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationAlPermissionsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_18e
    sget-object v2, Lcom/whoop/navigation/AppScreen$j;->w:Lcom/whoop/navigation/AppScreen$j;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18f

    new-instance v2, Lcom/whoop/navigation/ActivationAlProfileScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationAlProfileScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_18f
    sget-object v2, Lcom/whoop/navigation/AppScreen$k;->w:Lcom/whoop/navigation/AppScreen$k;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_190

    new-instance v2, Lcom/whoop/navigation/ActivationDeviceEducationScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationDeviceEducationScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_190
    sget-object v2, Lcom/whoop/navigation/AppScreen$l;->w:Lcom/whoop/navigation/AppScreen$l;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_191

    new-instance v2, Lcom/whoop/navigation/ActivationEnterYourEmailScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationEnterYourEmailScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_191
    sget-object v2, Lcom/whoop/navigation/AppScreen$m;->w:Lcom/whoop/navigation/AppScreen$m;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_192

    new-instance v2, Lcom/whoop/navigation/ActivationEnterYourPasswordScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationEnterYourPasswordScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_192
    sget-object v2, Lcom/whoop/navigation/AppScreen$n;->w:Lcom/whoop/navigation/AppScreen$n;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_193

    new-instance v2, Lcom/whoop/navigation/ActivationHwOnlyAfterActivationScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationHwOnlyAfterActivationScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_193
    sget-object v2, Lcom/whoop/navigation/AppScreen$o;->w:Lcom/whoop/navigation/AppScreen$o;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_194

    new-instance v2, Lcom/whoop/navigation/ActivationHwOnlyPermissionsScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationHwOnlyPermissionsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_194
    sget-object v2, Lcom/whoop/navigation/AppScreen$p;->w:Lcom/whoop/navigation/AppScreen$p;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_195

    new-instance v2, Lcom/whoop/navigation/ActivationHwOnlyProfileScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationHwOnlyProfileScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_195
    sget-object v2, Lcom/whoop/navigation/AppScreen$q;->w:Lcom/whoop/navigation/AppScreen$q;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_196

    new-instance v2, Lcom/whoop/navigation/ActivationInAppJoinFlowScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationInAppJoinFlowScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_196
    sget-object v2, Lcom/whoop/navigation/AppScreen$r;->w:Lcom/whoop/navigation/AppScreen$r;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_197

    new-instance v2, Lcom/whoop/navigation/ActivationMedicareAfterActivationScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationMedicareAfterActivationScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_197
    sget-object v2, Lcom/whoop/navigation/AppScreen$s;->w:Lcom/whoop/navigation/AppScreen$s;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_198

    new-instance v2, Lcom/whoop/navigation/ActivationMedicarePermissionsScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationMedicarePermissionsScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_198
    sget-object v2, Lcom/whoop/navigation/AppScreen$t;->w:Lcom/whoop/navigation/AppScreen$t;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_199

    new-instance v2, Lcom/whoop/navigation/ActivationMembershipServicesScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationMembershipServicesScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_199
    sget-object v2, Lcom/whoop/navigation/AppScreen$u;->w:Lcom/whoop/navigation/AppScreen$u;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19a

    new-instance v2, Lcom/whoop/navigation/ActivationMfaChallengeScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationMfaChallengeScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_19a
    sget-object v2, Lcom/whoop/navigation/AppScreen$v;->w:Lcom/whoop/navigation/AppScreen$v;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19b

    new-instance v2, Lcom/whoop/navigation/ActivationPairingScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationPairingScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_19b
    sget-object v2, Lcom/whoop/navigation/AppScreen$w;->w:Lcom/whoop/navigation/AppScreen$w;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19c

    new-instance v2, Lcom/whoop/navigation/ActivationPostPairingScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationPostPairingScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_19c
    sget-object v2, Lcom/whoop/navigation/AppScreen$x;->w:Lcom/whoop/navigation/AppScreen$x;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19d

    new-instance v2, Lcom/whoop/navigation/ActivationStartScreenScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/navigation/ActivationStartScreenScreenModel;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_19d
    sget-object v2, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a1

    sget-object v2, Lcom/whoop/navigation/AppScreen$x3;->w:Lcom/whoop/navigation/AppScreen$x3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a1

    sget-object v2, Lcom/whoop/navigation/AppScreen$k2;->w:Lcom/whoop/navigation/AppScreen$k2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a1

    sget-object v2, Lcom/whoop/navigation/AppScreen$v1;->w:Lcom/whoop/navigation/AppScreen$v1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a1

    sget-object v2, Lcom/whoop/navigation/AppScreen$n1;->w:Lcom/whoop/navigation/AppScreen$n1;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a1

    sget-object v2, Lcom/whoop/navigation/AppScreen$c3;->w:Lcom/whoop/navigation/AppScreen$c3;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a1

    instance-of v2, v0, Lcom/whoop/navigation/AppScreen$URLScreen;

    if-nez v2, :cond_1a1

    instance-of v2, v0, Lcom/whoop/navigation/FeatureSpecificAppScreen;

    if-eqz v2, :cond_19e

    goto :goto_b3

    :cond_19e
    sget-object v2, Lcom/whoop/navigation/AppScreen$c4;->w:Lcom/whoop/navigation/AppScreen$c4;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19f

    new-instance v0, Lcom/whoop/navigation/MfaSetupScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/MfaSetupScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_19f
    sget-object v2, Lcom/whoop/navigation/AppScreen$o5;->w:Lcom/whoop/navigation/AppScreen$o5;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a0

    new-instance v0, Lcom/whoop/navigation/SmsSetupScreenModel;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/navigation/SmsSetupScreenModel;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1a0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1a1
    :goto_b3
    sget-object v0, Lcom/whoop/navigation/NavigationScreenModel$None;->INSTANCE:Lcom/whoop/navigation/NavigationScreenModel$None;

    return-object v0
.end method
