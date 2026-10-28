.class public final Lab0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lab0/b;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Ldp0/g;",
        "globalCoachManager",
        "<init>",
        "(Lj02/o0;Leb/a0;Ldp0/g;)V",
        "Lep0/j;",
        "screenContext",
        "Ll83/a0;",
        "b",
        "(Lep0/j;)V",
        "Lcom/whoop/navigation/AiCoachChatScreenModel;",
        "c",
        "(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lep0/j;",
        "Lcom/whoop/navigation/CoachScreenModel;",
        "d",
        "(Lcom/whoop/navigation/CoachScreenModel;)Lep0/j;",
        "Lab0/a;",
        "navigationEvent",
        "a",
        "(Lab0/a;)V",
        "Lj02/o0;",
        "Leb/a0;",
        "Ldp0/g;",
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
.field private final a:Lj02/o0;

.field private final b:Leb/a0;

.field private final c:Ldp0/g;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Ldp0/g;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalCoachManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab0/b;->a:Lj02/o0;

    iput-object p2, p0, Lab0/b;->b:Leb/a0;

    iput-object p3, p0, Lab0/b;->c:Ldp0/g;

    return-void
.end method

.method private final b(Lep0/j;)V
    .locals 4

    iget-object v0, p0, Lab0/b;->c:Ldp0/g;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Ldp0/g;->t(ZLep0/j;)V

    iget-object v0, p0, Lab0/b;->c:Ldp0/g;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3, p1}, Ldp0/g;->g(JLjava/lang/String;Lep0/j;)V

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

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v16

    new-instance v0, Lep0/j;

    const v24, 0x7e164b

    const/16 v25, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v0 .. v25}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final d(Lcom/whoop/navigation/CoachScreenModel;)Lep0/j;
    .locals 26

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getConversationSeedId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getEntryText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getPresetQuestion()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getIncludeInitialMessage()Z

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/z;->w:Lm83/z;

    :cond_0
    move-object/from16 v17, v0

    sget-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->Companion:Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getEducationType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;->a(Ljava/lang/String;)Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/CoachScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v16

    new-instance v0, Lep0/j;

    const v24, 0x7e168b

    const/16 v25, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v0 .. v25}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lab0/a;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "navigationEvent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lab0/a$b;

    if-eqz v2, :cond_0

    iget-object v1, v0, Lab0/b;->b:Leb/a0;

    invoke-virtual {v1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v2, v1, Lab0/a$a;

    if-eqz v2, :cond_2

    check-cast v1, Lab0/a$a;

    invoke-virtual {v1}, Lab0/a$a;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v2, v0, Lab0/b;->a:Lj02/o0;

    new-instance v4, Lj02/m0$f3;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lab0/a$a;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTag()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
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

    :cond_2
    instance-of v2, v1, Lab0/a$c;

    if-eqz v2, :cond_5

    check-cast v1, Lab0/a$c;

    invoke-virtual {v1}, Lab0/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/navigation/AiCoachChatScreenModel;

    if-eqz v3, :cond_3

    check-cast v2, Lcom/whoop/navigation/AiCoachChatScreenModel;

    invoke-direct {v0, v2}, Lab0/b;->c(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lep0/j;

    move-result-object v1

    invoke-direct {v0, v1}, Lab0/b;->b(Lep0/j;)V

    return-void

    :cond_3
    instance-of v3, v2, Lcom/whoop/navigation/CoachScreenModel;

    if-eqz v3, :cond_4

    check-cast v2, Lcom/whoop/navigation/CoachScreenModel;

    invoke-direct {v0, v2}, Lab0/b;->d(Lcom/whoop/navigation/CoachScreenModel;)Lep0/j;

    move-result-object v1

    invoke-direct {v0, v1}, Lab0/b;->b(Lep0/j;)V

    return-void

    :cond_4
    iget-object v2, v0, Lab0/b;->a:Lj02/o0;

    invoke-virtual {v1}, Lab0/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-interface {v2, v1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_5
    instance-of v2, v1, Lab0/a$d;

    if-eqz v2, :cond_6

    check-cast v1, Lab0/a$d;

    invoke-virtual {v1}, Lab0/a$d;->a()Ljava/lang/String;

    move-result-object v11

    new-instance v2, Lep0/j;

    const v26, 0x7fdefb

    const/16 v27, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v2 .. v27}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v2}, Lab0/b;->b(Lep0/j;)V

    return-void

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
