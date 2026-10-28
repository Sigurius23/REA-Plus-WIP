.class public final Lfb0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lfb0/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Ldp0/g;",
        "globalCoachManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Leb/a0;Lj02/o0;Ldp0/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/navigation/e;",
        "navigationAction",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/navigation/e;)V",
        "Lcom/whoop/navigation/AiCoachChatScreenModel;",
        "Lep0/j;",
        "c",
        "(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lep0/j;",
        "Lfb0/a;",
        "navigationEvent",
        "b",
        "(Lfb0/a;)V",
        "Leb/a0;",
        "Lj02/o0;",
        "Ldp0/g;",
        "d",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "advanced-labs_release"
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

.field private final b:Lj02/o0;

.field private final c:Ldp0/g;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Ldp0/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalCoachManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb0/b;->a:Leb/a0;

    iput-object p2, p0, Lfb0/b;->b:Lj02/o0;

    iput-object p3, p0, Lfb0/b;->c:Ldp0/g;

    iput-object p4, p0, Lfb0/b;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method private final a(Lcom/whoop/navigation/e;)V
    .locals 9

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lfb0/b;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "wce-dynamic-bdn-deeplink-support"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lfb0/b;->c:Ldp0/g;

    check-cast v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    invoke-direct {p0, v0}, Lfb0/b;->c(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lep0/j;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Ldp0/g;->f(Ldp0/g;JLjava/lang/String;Lep0/j;ILjava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lfb0/b;->b:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_1
    iget-object v0, p0, Lfb0/b;->b:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void
.end method

.method private final c(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lep0/j;
    .locals 26

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getFingerprint()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getUserMessage()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getPresetQuestionKey()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    xor-int/lit8 v14, v0, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lm83/z;->w:Lm83/z;

    :cond_2
    move-object/from16 v17, v0

    sget-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->Companion:Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getEducationType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;->a(Ljava/lang/String;)Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getOnboardingAnalyticSource()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v0

    :cond_3
    move-object/from16 v16, v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getShouldOpenFullSize()Z

    move-result v19

    new-instance v0, Lep0/j;

    const v24, 0x7a044b

    const/16 v25, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v0 .. v25}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lfb0/a;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "navigationEvent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lfb0/a$b;

    if-eqz v2, :cond_0

    iget-object v1, v0, Lfb0/b;->a:Leb/a0;

    invoke-virtual {v1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v2, v1, Lfb0/a$c;

    if-eqz v2, :cond_1

    check-cast v1, Lfb0/a$c;

    invoke-virtual {v1}, Lfb0/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lfb0/b;->a(Lcom/whoop/navigation/e;)V

    return-void

    :cond_1
    instance-of v2, v1, Lfb0/a$a;

    if-eqz v2, :cond_3

    check-cast v1, Lfb0/a$a;

    invoke-virtual {v1}, Lfb0/a$a;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v2, v0, Lfb0/b;->b:Lj02/o0;

    new-instance v4, Lj02/m0$f3;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lfb0/a$a;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTag()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    move-object v6, v1

    sget-object v1, Ljd0/c;->f:Ljd0/c$a;

    invoke-virtual {v1}, Ljd0/c$a;->a()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lj02/m0$f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v4}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_3
    instance-of v2, v1, Lfb0/a$d;

    if-eqz v2, :cond_4

    iget-object v2, v0, Lfb0/b;->b:Lj02/o0;

    new-instance v3, Lj02/m0$z;

    check-cast v1, Lfb0/a$d;

    invoke-virtual {v1}, Lfb0/a$d;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v16, 0xffb

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Lj02/m0$z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
