.class public final Lhh1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000c\u001a\u00020\u0007*\u00020\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lhh1/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Ldh1/c;",
        "Lgh1/d;",
        "b",
        "(Ldh1/c;)Lgh1/d;",
        "Lgh1/d$c;",
        "dialog",
        "c",
        "(Ldh1/c;Lgh1/d$c;)Lgh1/d;",
        "domainResult",
        "a",
        "Ljb1/a;",
        "gifting_release"
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lhh1/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhh1/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lhh1/b;->b()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lhh1/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Ldh1/c;)Lgh1/d;
    .locals 10

    invoke-virtual {p1}, Ldh1/c;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-virtual {p1}, Ldh1/c;->c()Ldh1/a;

    move-result-object p1

    instance-of v1, p1, Ldh1/a$b;

    if-eqz v1, :cond_1

    new-instance v2, Lgh1/d;

    new-instance v3, Lgh1/d$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lgh1/d$b;-><init>(Lsz0/q0;Lgh1/b;Lgh1/b;Lgh1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x5

    move-object v4, v3

    const/4 v3, 0x0

    invoke-direct/range {v2 .. v7}, Lgh1/d;-><init>(Lgh1/d$c;Lgh1/d$b;Lgh1/d$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    instance-of v1, p1, Ldh1/a$c;

    if-eqz v1, :cond_2

    new-instance v2, Lgh1/d;

    new-instance v3, Lgh1/d$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v4

    new-instance v5, Lgh1/b$i;

    invoke-direct {v5, v0}, Lgh1/b$i;-><init>(Ljava/lang/String;)V

    sget-object v7, Lgh1/b$d;->a:Lgh1/b$d;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Lgh1/d$b;-><init>(Lsz0/q0;Lgh1/b;Lgh1/b;Lgh1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x5

    const/4 v7, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lgh1/d;-><init>(Lgh1/d$c;Lgh1/d$b;Lgh1/d$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    instance-of v1, p1, Ldh1/a$d;

    if-eqz v1, :cond_3

    new-instance v2, Lgh1/d;

    new-instance v3, Lgh1/d$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v4

    new-instance v5, Lgh1/b$i;

    invoke-direct {v5, v0}, Lgh1/b$i;-><init>(Ljava/lang/String;)V

    sget-object v7, Lgh1/b$d;->a:Lgh1/b$d;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Lgh1/d$b;-><init>(Lsz0/q0;Lgh1/b;Lgh1/b;Lgh1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x5

    const/4 v7, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lgh1/d;-><init>(Lgh1/d$c;Lgh1/d$b;Lgh1/d$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_3
    instance-of p1, p1, Ldh1/a$e;

    if-eqz p1, :cond_4

    new-instance v0, Lgh1/d;

    new-instance v1, Lgh1/d$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lgh1/d$b;-><init>(Lsz0/q0;Lgh1/b;Lgh1/b;Lgh1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    move-object v2, v1

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v5}, Lgh1/d;-><init>(Lgh1/d$c;Lgh1/d$b;Lgh1/d$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_4
    new-instance v1, Lgh1/d;

    new-instance v2, Lgh1/d$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lgh1/d$b;-><init>(Lsz0/q0;Lgh1/b;Lgh1/b;Lgh1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lgh1/d;-><init>(Lgh1/d$c;Lgh1/d$b;Lgh1/d$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final c(Ldh1/c;Lgh1/d$c;)Lgh1/d;
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Ldh1/c;->h()Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;->getAlignment()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v3, ""

    if-nez v1, :cond_1

    move-object v1, v3

    :cond_1
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "toUpperCase(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "BOTTOM"

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v1, Ll0/m;->d:Ll0/g;

    :goto_1
    move-object v10, v1

    goto :goto_2

    :cond_2
    const-string v6, "CENTER"

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Ll0/m;->e:Ll0/h;

    goto :goto_1

    :cond_3
    sget-object v1, Ll0/m;->c:Ll0/g;

    goto :goto_1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Ldh1/c;->h()Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;->getStyle()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    if-nez v1, :cond_5

    move-object v1, v3

    :cond_5
    const-string v6, "ADVANCED_LABS"

    invoke-static {v1, v4, v5, v6}, Lhc3/i;->v(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lgh1/a;->ADVANCED_LABS:Lgh1/a;

    :goto_4
    move-object v11, v1

    goto :goto_5

    :cond_6
    sget-object v1, Lgh1/a;->DEFAULT:Lgh1/a;

    goto :goto_4

    :goto_5
    invoke-virtual/range {p1 .. p1}, Ldh1/c;->h()Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;->getBottomStickyItems()Lcom/whoop/gifting/feature/gifted/domain/models/GiftedStickyModel;

    move-result-object v1

    goto :goto_6

    :cond_7
    const/4 v1, 0x0

    :goto_6
    if-eqz v1, :cond_8

    new-instance v4, Lgh1/d$e;

    invoke-virtual {v1}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedStickyModel;->getText()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lhh1/a;->a:Ljb1/a;

    invoke-virtual {v1}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedStickyModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v4, v6, v1}, Lgh1/d$e;-><init>(Ljava/lang/String;Ljava/util/List;)V

    move-object v12, v4

    goto :goto_7

    :cond_8
    const/4 v12, 0x0

    :goto_7
    invoke-virtual/range {p1 .. p1}, Ldh1/c;->h()Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-static {v1}, Lhh1/b;->c(Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    :goto_8
    move-object v13, v1

    goto :goto_a

    :cond_a
    :goto_9
    sget-object v1, Lm83/z;->w:Lm83/z;

    goto :goto_8

    :goto_a
    invoke-virtual/range {p1 .. p1}, Ldh1/c;->h()Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;->getToolBarTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_b

    goto :goto_c

    :cond_b
    :goto_b
    move-object v7, v1

    goto :goto_d

    :cond_c
    :goto_c
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    goto :goto_b

    :goto_d
    invoke-virtual/range {p1 .. p1}, Ldh1/c;->h()Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;->getSections()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_12

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v1, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedSectionModel;

    invoke-virtual {v8}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_d

    move-object v9, v3

    :cond_d
    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v14}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v14, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedSectionSpacingType;->COMPACT:Lcom/whoop/gifting/feature/gifted/domain/models/GiftedSectionSpacingType;

    invoke-static {}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedSectionSpacingType;->values()[Lcom/whoop/gifting/feature/gifted/domain/models/GiftedSectionSpacingType;

    move-result-object v15

    array-length v2, v15

    const/4 v4, 0x0

    :goto_f
    if-ge v4, v2, :cond_f

    aget-object v16, v15, v4

    move-object/from16 v17, v1

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_10

    :cond_e
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, v17

    goto :goto_f

    :cond_f
    move-object/from16 v17, v1

    const/16 v16, 0x0

    :goto_10
    if-nez v16, :cond_10

    goto :goto_11

    :cond_10
    move-object/from16 v14, v16

    :goto_11
    new-instance v1, Lgh1/d$a;

    iget-object v2, v0, Lhh1/a;->a:Ljb1/a;

    invoke-virtual {v8}, Lcom/whoop/gifting/feature/gifted/domain/models/GiftedSectionModel;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2, v14}, Lgh1/d$a;-><init>(Ljava/util/List;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedSectionSpacingType;)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v17

    goto :goto_e

    :cond_11
    :goto_12
    move-object v8, v6

    goto :goto_13

    :cond_12
    sget-object v6, Lm83/y;->w:Lm83/y;

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p1}, Ldh1/c;->g()Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual/range {p1 .. p1}, Ldh1/c;->d()Z

    move-result v1

    if-eqz v1, :cond_13

    const/4 v4, 0x1

    move v9, v4

    goto :goto_14

    :cond_13
    const/4 v9, 0x0

    :goto_14
    new-instance v4, Lgh1/d$d;

    move-object v6, v4

    invoke-direct/range {v6 .. v13}, Lgh1/d$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLl0/l;Lgh1/a;Lgh1/d$e;Ljava/util/Map;)V

    new-instance v1, Lgh1/d;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v6}, Lgh1/d;-><init>(Lgh1/d$c;Lgh1/d$b;Lgh1/d$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public final a(Ldh1/c;)Lgh1/d;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ldh1/c;->c()Ldh1/a;

    move-result-object v0

    instance-of v0, v0, Ldh1/a$a;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lhh1/a;->b(Ldh1/c;)Lgh1/d;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhh1/a;->c(Ldh1/c;Lgh1/d$c;)Lgh1/d;

    move-result-object p1

    return-object p1
.end method
