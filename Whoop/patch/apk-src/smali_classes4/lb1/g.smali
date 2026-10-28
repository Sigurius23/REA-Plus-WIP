.class public abstract Llb1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "aiChatTalkTextEmptyStateMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/g;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/g;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;)Ly31/e;
    .locals 0

    invoke-static {p0}, Llb1/g;->d(Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;)Ly31/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/g$a;

    invoke-direct {v2, v0}, Llb1/g$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;)Ly31/e;
    .locals 24

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->getSmallButton()Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    move-result-object v0

    const-string v2, ""

    const-string v3, "toUpperCase(...)"

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object v8, v6

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v6, v2

    :goto_1
    sget-object v7, Lgz0/m0;->KEYBOARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v9

    array-length v10, v9

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_3

    aget-object v12, v9, v11

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    :goto_3
    if-nez v12, :cond_4

    move-object v9, v7

    goto :goto_4

    :cond_4
    move-object v9, v12

    :goto_4
    invoke-virtual {v0}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getVoiceoverText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->isEmphasized()Z

    move-result v12

    new-instance v7, Ly31/a;

    const/4 v13, 0x0

    const/16 v14, 0x20

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v15}, Ly31/a;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_5
    const/4 v7, 0x0

    :goto_5
    invoke-static {v7}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->getTitleIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v7, :cond_7

    aget-object v10, v6, v8

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_7
    const/4 v10, 0x0

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->getLargeButtons()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v13, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    invoke-virtual {v6}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v15, v7

    goto :goto_9

    :cond_8
    const/4 v15, 0x0

    :goto_9
    invoke-virtual {v6}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_9

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_a

    :cond_9
    move-object v7, v2

    :goto_a
    sget-object v8, Lgz0/m0;->MICROPHONE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v14

    array-length v4, v14

    const/4 v5, 0x0

    :goto_b
    if-ge v5, v4, :cond_b

    aget-object v16, v14, v5

    move-object/from16 v23, v0

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_c

    :cond_a
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v23

    goto :goto_b

    :cond_b
    move-object/from16 v23, v0

    const/16 v16, 0x0

    :goto_c
    if-nez v16, :cond_c

    move-object/from16 v16, v8

    :cond_c
    invoke-virtual {v6}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getVoiceoverText()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v6}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v18

    invoke-virtual {v6}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->isEmphasized()Z

    move-result v19

    new-instance v14, Ly31/a;

    const/16 v20, 0x0

    const/16 v21, 0x20

    const/16 v22, 0x0

    invoke-direct/range {v14 .. v22}, Ly31/a;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v23

    goto :goto_8

    :cond_d
    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->getImageUrl()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->getBottomNavText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object/from16 v16, v5

    goto :goto_d

    :cond_e
    const/16 v16, 0x0

    :goto_d
    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->getBottomNavDestination()Lcom/whoop/navigation/e;

    move-result-object v17

    new-instance v8, Ly31/e;

    const/4 v15, 0x1

    invoke-direct/range {v8 .. v17}, Ly31/e;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V

    return-object v8
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/g;->a:Llb1/y0;

    return-object v0
.end method
