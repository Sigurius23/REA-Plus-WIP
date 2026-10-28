.class public abstract Llb1/h;
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
        "aiChatTalkTextMapper",
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

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/h;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/h;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/AiChatTalkTextModel;)Ly31/e;
    .locals 0

    invoke-static {p0}, Llb1/h;->d(Lcom/whoop/design/models/items/AiChatTalkTextModel;)Ly31/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/AiChatTalkTextModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/h$a;

    invoke-direct {v2, v0}, Llb1/h$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/AiChatTalkTextModel;)Ly31/e;
    .locals 21

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->getTitleIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->getSmallButtons()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, ""

    const-string v11, "toUpperCase(...)"

    if-eqz v9, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    invoke-virtual {v9}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_2

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    move-object v14, v12

    goto :goto_3

    :cond_2
    const/4 v14, 0x0

    :goto_3
    invoke-virtual {v9}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_3

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v12, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    sget-object v11, Lgz0/m0;->KEYBOARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v12

    array-length v13, v12

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v13, :cond_5

    aget-object v16, v12, v15

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    :cond_5
    const/16 v16, 0x0

    :goto_5
    if-nez v16, :cond_6

    move-object v15, v11

    goto :goto_6

    :cond_6
    move-object/from16 v15, v16

    :goto_6
    invoke-virtual {v9}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getVoiceoverText()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v9}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v17

    invoke-virtual {v9}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->isEmphasized()Z

    move-result v18

    invoke-virtual {v9}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v19

    new-instance v13, Ly31/a;

    invoke-direct/range {v13 .. v19}, Ly31/a;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLjava/lang/Object;)V

    invoke-interface {v6, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->getLargeButtons()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    move-object v5, v6

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v3, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    invoke-virtual {v7}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_8

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object v13, v9

    goto :goto_8

    :cond_8
    const/4 v13, 0x0

    :goto_8
    invoke-virtual {v7}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_9

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_9

    :cond_9
    move-object v9, v10

    :goto_9
    sget-object v12, Lgz0/m0;->MICROPHONE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v14

    array-length v15, v14

    const/4 v4, 0x0

    :goto_a
    if-ge v4, v15, :cond_b

    aget-object v16, v14, v4

    move-object/from16 v20, v0

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_b

    :cond_a
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, v20

    goto :goto_a

    :cond_b
    move-object/from16 v20, v0

    const/16 v16, 0x0

    :goto_b
    if-nez v16, :cond_c

    move-object v14, v12

    goto :goto_c

    :cond_c
    move-object/from16 v14, v16

    :goto_c
    invoke-virtual {v7}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getVoiceoverText()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v16

    invoke-virtual {v7}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->isEmphasized()Z

    move-result v17

    invoke-virtual {v7}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v18

    new-instance v12, Ly31/a;

    invoke-direct/range {v12 .. v18}, Ly31/a;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLjava/lang/Object;)V

    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v20

    goto :goto_7

    :cond_d
    move-object/from16 v20, v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->getHeaderImage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_e

    const/4 v7, 0x0

    goto :goto_d

    :cond_e
    move-object v7, v0

    :goto_d
    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->isCenterAligned()Z

    move-result v0

    const/4 v3, 0x1

    if-nez v0, :cond_10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->getTitleTextAlignment()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CENTER"

    invoke-static {v0, v1, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_e

    :cond_f
    const/4 v3, 0x0

    :cond_10
    :goto_e
    new-instance v1, Ly31/e;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x180

    const/4 v12, 0x0

    move-object v4, v8

    move v8, v3

    move-object v3, v4

    move-object/from16 v4, v20

    invoke-direct/range {v1 .. v12}, Ly31/e;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/h;->a:Llb1/y0;

    return-object v0
.end method
