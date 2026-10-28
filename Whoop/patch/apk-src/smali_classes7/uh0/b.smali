.class public final Luh0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001bR\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Luh0/b;",
        "",
        "Leb/a0;",
        "composeNavController",
        "Lj02/o0;",
        "navigator",
        "Ldp0/g;",
        "globalCoachManager",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismiss",
        "<init>",
        "(Leb/a0;Lj02/o0;Ldp0/g;Lc93/a;)V",
        "Lcom/whoop/navigation/e;",
        "action",
        "a",
        "(Lcom/whoop/navigation/e;)V",
        "Lcom/whoop/navigation/AiCoachChatScreenModel;",
        "model",
        "b",
        "(Lcom/whoop/navigation/AiCoachChatScreenModel;)V",
        "Luh0/a;",
        "navEvent",
        "c",
        "(Luh0/a;)V",
        "Leb/a0;",
        "Lj02/o0;",
        "Ldp0/g;",
        "d",
        "Lc93/a;",
        "ai-insights_release"
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

.field private final d:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Ldp0/g;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/a0;",
            "Lj02/o0;",
            "Ldp0/g;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "composeNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalCoachManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh0/b;->a:Leb/a0;

    iput-object p2, p0, Luh0/b;->b:Lj02/o0;

    iput-object p3, p0, Luh0/b;->c:Ldp0/g;

    iput-object p4, p0, Luh0/b;->d:Lc93/a;

    return-void
.end method

.method private final a(Lcom/whoop/navigation/e;)V
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    instance-of v1, v1, Lcom/whoop/navigation/AppScreen$u0;

    if-eqz v1, :cond_0

    instance-of v1, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    invoke-direct {p0, v0}, Luh0/b;->b(Lcom/whoop/navigation/AiCoachChatScreenModel;)V

    return-void

    :cond_0
    iget-object v0, p0, Luh0/b;->b:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void
.end method

.method private final b(Lcom/whoop/navigation/AiCoachChatScreenModel;)V
    .locals 28

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getFingerprint()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getPresetQuestionKey()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v2

    :goto_1
    xor-int/lit8 v15, v1, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, Lm83/z;->w:Lm83/z;

    :cond_2
    move-object/from16 v18, v1

    sget-object v1, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->Companion:Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getEducationType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;->a(Ljava/lang/String;)Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v16

    new-instance v1, Lep0/j;

    const v25, 0x7e8e4b

    const/16 v26, 0x0

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x1

    move v8, v5

    const/4 v5, 0x0

    move v11, v8

    const/4 v8, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v27, v24

    const/16 v24, 0x0

    invoke-direct/range {v1 .. v26}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v0, Luh0/b;->c:Ldp0/g;

    const/4 v4, 0x0

    invoke-interface {v2, v4, v1}, Ldp0/g;->t(ZLep0/j;)V

    iget-object v5, v0, Luh0/b;->c:Ldp0/g;

    const/4 v10, 0x6

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Ldp0/g;->f(Ldp0/g;JLjava/lang/String;Lep0/j;ILjava/lang/Object;)V

    iget-object v1, v0, Luh0/b;->d:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Luh0/a;)V
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Luh0/a$a;

    if-eqz v0, :cond_0

    check-cast p1, Luh0/a$a;

    invoke-virtual {p1}, Luh0/a$a;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Luh0/b;->a(Lcom/whoop/navigation/e;)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
