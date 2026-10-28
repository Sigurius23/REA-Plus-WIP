.class public abstract Llb1/o2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/o2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "journalEntryPointModelMapper",
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

    new-instance v0, Llb1/t1;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/o2;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/o2;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/JournalEntrypointModel;)Lu71/j;
    .locals 0

    invoke-static {p0}, Llb1/o2;->e(Lcom/whoop/design/models/items/JournalEntrypointModel;)Lu71/j;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/o2;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t1;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/JournalEntrypointModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/o2$b;

    invoke-direct {v2, v0}, Llb1/o2$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/JournalEntrypointModel;)Lu71/j;
    .locals 19

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/JournalEntrypointModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lgz0/m0;->JOURNAL:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_1

    aget-object v8, v3, v6

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_1
    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v8

    :goto_2
    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/JournalEntrypointModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/JournalEntrypointModel;->getState()Lcom/whoop/design/models/items/JournalEntrypointState;

    move-result-object v0

    sget-object v2, Llb1/o2$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v2, 0x3

    if-ne v0, v2, :cond_3

    sget-object v0, Lu71/l$b;->a:Lu71/l$b;

    :goto_3
    move-object v11, v0

    goto :goto_4

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    sget-object v0, Lu71/l$c;->a:Lu71/l$c;

    goto :goto_3

    :cond_5
    sget-object v0, Lu71/l$a;->a:Lu71/l$a;

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/JournalEntrypointModel;->getCta()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/JournalEntrypointModel;->getBodyText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v13, v0

    goto :goto_5

    :cond_6
    const/4 v13, 0x0

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/JournalEntrypointModel;->getActionTag()Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalEntrypointTagModel;->getTagStyle()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lhy0/o1;->NONE:Lhy0/o1;

    invoke-static {}, Lhy0/o1;->values()[Lhy0/o1;

    move-result-object v4

    array-length v6, v4

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v6, :cond_8

    aget-object v14, v4, v8

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_8
    const/4 v14, 0x0

    :goto_7
    if-nez v14, :cond_9

    goto :goto_8

    :cond_9
    move-object v3, v14

    :goto_8
    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalEntrypointTagModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_d

    sget-object v4, Lgz0/m0;->JOURNAL:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v8, v6

    const/4 v14, 0x0

    :goto_9
    if-ge v14, v8, :cond_b

    aget-object v15, v6, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_a

    :cond_a
    add-int/lit8 v14, v14, 0x1

    goto :goto_9

    :cond_b
    const/4 v15, 0x0

    :goto_a
    if-nez v15, :cond_c

    goto :goto_b

    :cond_c
    move-object v4, v15

    :goto_b
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalEntrypointTagModel;->getTagLabel()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Ly71/g;

    invoke-direct {v5, v2, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    goto :goto_c

    :cond_d
    const/4 v5, 0x0

    :goto_c
    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalEntrypointTagModel;->getTagLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v2, Lu71/e;

    invoke-direct {v2, v3, v5, v0}, Lu71/e;-><init>(Lhy0/o1;Ly71/g;Lcom/whoop/design/util/TextResource;)V

    move-object v14, v2

    goto :goto_d

    :cond_e
    const/4 v14, 0x0

    :goto_d
    invoke-virtual {v1}, Lcom/whoop/design/models/items/JournalEntrypointModel;->getBehaviorTags()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;->getTagLabel()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;->getTagStyle()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lhy0/o1;->NONE:Lhy0/o1;

    invoke-static {}, Lhy0/o1;->values()[Lhy0/o1;

    move-result-object v6

    array-length v8, v6

    const/4 v7, 0x0

    :goto_f
    if-ge v7, v8, :cond_10

    aget-object v17, v6, v7

    move-object/from16 v18, v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_10

    :cond_f
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, v18

    goto :goto_f

    :cond_10
    move-object/from16 v18, v0

    const/16 v17, 0x0

    :goto_10
    if-nez v17, :cond_11

    goto :goto_11

    :cond_11
    move-object/from16 v5, v17

    :goto_11
    invoke-virtual {v2}, Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Lgz0/m0;->JOURNAL:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_12
    if-ge v8, v7, :cond_13

    aget-object v17, v6, v8

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_13

    :cond_12
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, p0

    goto :goto_12

    :cond_13
    const/16 v17, 0x0

    :goto_13
    if-nez v17, :cond_14

    goto :goto_14

    :cond_14
    move-object/from16 v4, v17

    :goto_14
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-virtual {v2}, Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;->getTagLabel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Ly71/g;

    invoke-direct {v2, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    new-instance v0, Lu71/f;

    invoke-direct {v0, v3, v5, v2}, Lu71/f;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/o1;Ly71/g;)V

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p0

    move-object/from16 v0, v18

    goto/16 :goto_e

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalEntrypointModel;->getNote()Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalEntrypointNoteModel;->getNoteIcon()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lgz0/m0;->JOURNAL:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_15
    if-ge v5, v4, :cond_17

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    move-object v7, v6

    goto :goto_16

    :cond_16
    add-int/lit8 v5, v5, 0x1

    goto :goto_15

    :cond_17
    const/4 v7, 0x0

    :goto_16
    if-nez v7, :cond_18

    goto :goto_17

    :cond_18
    move-object v2, v7

    :goto_17
    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalEntrypointNoteModel;->getNoteText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v7, Lu71/k;

    invoke-direct {v7, v1, v0}, Lu71/k;-><init>(ILcom/whoop/design/util/TextResource;)V

    move-object/from16 v16, v7

    goto :goto_18

    :cond_19
    const/16 v16, 0x0

    :goto_18
    new-instance v8, Lu71/j;

    invoke-direct/range {v8 .. v16}, Lu71/j;-><init>(ILcom/whoop/design/util/TextResource;Lu71/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lu71/e;Ljava/util/List;Lu71/k;)V

    return-object v8
.end method
