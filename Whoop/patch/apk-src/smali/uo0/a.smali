.class public final Luo0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo02/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luo0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Luo0/a;",
        "Lo02/d;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/navigation/AiCoachChatScreenModel;",
        "model",
        "Lj02/m0$z;",
        "d",
        "(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lj02/m0$z;",
        "Lcom/whoop/navigation/CoachScreenModel;",
        "e",
        "(Lcom/whoop/navigation/CoachScreenModel;)Lj02/m0$z;",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "Lj02/m0;",
        "c",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;",
        "a",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "b",
        "coach-everywhere_release"
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
.field public static final b:Luo0/a$a;

.field public static final c:I


# instance fields
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Luo0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Luo0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Luo0/a;->b:Luo0/a$a;

    const/16 v0, 0x8

    sput v0, Luo0/a;->c:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo0/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method private final d(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lj02/m0$z;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Luo0/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "jj-coach-screen-model-deeplink"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    sget-object v2, Lm83/z;->w:Lm83/z;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, ""

    if-eqz v1, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v1

    const-string v6, "CHAT_WITH_AGENT"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v9, v5

    goto :goto_0

    :cond_0
    move-object v9, v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getFingerprint()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getPresetQuestionKey()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    move v3, v4

    :cond_2
    xor-int/lit8 v15, v3, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    move-object/from16 v16, v5

    goto :goto_1

    :cond_3
    move-object/from16 v16, v1

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_4

    move-object/from16 v17, v2

    goto :goto_2

    :cond_4
    move-object/from16 v17, v1

    :goto_2
    new-instance v6, Lj02/m0$z;

    const/16 v19, 0x13

    const/16 v20, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v6 .. v20}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    move-object v10, v5

    goto :goto_3

    :cond_6
    move-object v10, v1

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getFingerprint()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getPresetQuestionKey()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    move v3, v4

    :cond_8
    xor-int/lit8 v16, v3, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    move-object/from16 v17, v5

    goto :goto_4

    :cond_9
    move-object/from16 v17, v1

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_a

    move-object/from16 v18, v2

    goto :goto_5

    :cond_a
    move-object/from16 v18, v1

    :goto_5
    new-instance v7, Lj02/m0$z;

    const/16 v20, 0x13

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v7 .. v21}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method private final e(Lcom/whoop/navigation/CoachScreenModel;)Lj02/m0$z;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Luo0/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "jj-coach-screen-model-deeplink"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    sget-object v2, Lm83/z;->w:Lm83/z;

    const-string v3, ""

    if-eqz v1, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    const-string v4, "CHAT_WITH_AGENT"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v10, v3

    goto :goto_0

    :cond_0
    move-object v10, v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getEntryText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v7, v3

    goto :goto_1

    :cond_1
    move-object v7, v1

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getDeeplinkConversationId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getConversationSeedId()Ljava/lang/String;

    move-result-object v1

    :cond_2
    move-object v8, v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getPresetQuestion()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getIncludeInitialMessage()Z

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getDeeplinkSourceId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    move-object v14, v3

    goto :goto_2

    :cond_3
    move-object v14, v1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_4

    move-object v15, v2

    goto :goto_3

    :cond_4
    move-object v15, v1

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSource()Ljava/lang/String;

    move-result-object v16

    new-instance v4, Lj02/m0$z;

    const/16 v17, 0x93

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v18}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getEntryText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    move-object v8, v3

    goto :goto_4

    :cond_6
    move-object v8, v1

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getConversationSeedId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getPresetQuestion()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getIncludeInitialMessage()Z

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    move-object v15, v3

    goto :goto_5

    :cond_7
    move-object v15, v1

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_8

    move-object/from16 v16, v2

    goto :goto_6

    :cond_8
    move-object/from16 v16, v1

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSource()Ljava/lang/String;

    move-result-object v17

    new-instance v5, Lj02/m0$z;

    const/16 v18, 0x93

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v19}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method


# virtual methods
.method public bridge synthetic a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
    .locals 0

    invoke-virtual {p0, p1}, Luo0/a;->c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b(Ljava/util/List;Ljava/util/Map;)Lo02/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo02/d;",
            ">;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lkotlin/jvm/functions/Function1;",
            ">;)",
            "Lo02/d;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo02/d;->b(Ljava/util/List;Ljava/util/Map;)Lo02/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;
    .locals 1

    const-string v0, "navigationScreenModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/navigation/CoachScreenModel;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/navigation/CoachScreenModel;

    invoke-direct {p0, p1}, Luo0/a;->e(Lcom/whoop/navigation/CoachScreenModel;)Lj02/m0$z;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/navigation/AiCoachChatScreenModel;

    invoke-direct {p0, p1}, Luo0/a;->d(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lj02/m0$z;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object p1
.end method
