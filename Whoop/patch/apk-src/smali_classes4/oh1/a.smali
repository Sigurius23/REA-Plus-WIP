.class public final Loh1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J3\u0010\r\u001a\u00020\u000c*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u000c*\u00020\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J=\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0014*\u00020\u000f2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Loh1/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lkh1/a$a;",
        "",
        "source",
        "giftType",
        "testCount",
        "selectedTier",
        "Lnh1/c;",
        "c",
        "(Lkh1/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnh1/c;",
        "Lkh1/c;",
        "Lnh1/c$c;",
        "dialog",
        "d",
        "(Lkh1/c;Lnh1/c$c;)Lnh1/c;",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "models",
        "",
        "selectedQuantity",
        "selectedCountry",
        "Lm91/u;",
        "a",
        "(Lkh1/c;Ljava/util/List;ILjava/lang/String;)Ljava/util/List;",
        "domainResult",
        "b",
        "(Lkh1/c;)Lnh1/c;",
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

    sput v0, Loh1/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Loh1/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Loh1/b;->e()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Loh1/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Lkh1/c;Ljava/util/List;ILjava/lang/String;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkh1/c;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    iget-object v2, v0, Loh1/a;->a:Ljb1/a;

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm91/u;

    instance-of v5, v4, Lnh1/d;

    if-eqz v5, :cond_0

    move-object v6, v4

    check-cast v6, Lnh1/d;

    const/16 v12, 0xf

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v11, p3

    invoke-static/range {v6 .. v13}, Lnh1/d;->b(Lnh1/d;Ljava/lang/String;Lcom/whoop/design/util/TextResource;IIIILjava/lang/Object;)Lnh1/d;

    move-result-object v4

    goto/16 :goto_9

    :cond_0
    instance-of v5, v4, Lr51/f;

    if-eqz v5, :cond_7

    if-eqz v1, :cond_6

    move-object v5, v4

    check-cast v5, Lr51/f;

    invoke-virtual {v5}, Lr51/f;->f()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_3

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lr51/g;

    invoke-virtual {v8}, Lr51/g;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    check-cast v7, Lr51/g;

    if-nez v7, :cond_4

    :cond_3
    invoke-virtual {v5}, Lr51/f;->i()Lr51/g;

    move-result-object v7

    :cond_4
    if-nez v7, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    move-object v11, v7

    goto :goto_4

    :cond_6
    :goto_3
    move-object v5, v4

    check-cast v5, Lr51/f;

    invoke-virtual {v5}, Lr51/f;->i()Lr51/g;

    move-result-object v7

    goto :goto_2

    :goto_4
    move-object v8, v4

    check-cast v8, Lr51/f;

    const/16 v16, 0x7b

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v8 .. v17}, Lr51/f;->b(Lr51/f;Lny0/h;Lny0/h;Lr51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ILjava/lang/Object;)Lr51/f;

    move-result-object v4

    goto :goto_9

    :cond_7
    instance-of v5, v4, Lq31/f;

    if-eqz v5, :cond_b

    move-object v6, v4

    check-cast v6, Lq31/f;

    invoke-virtual {v6}, Lq31/f;->e()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq31/a;

    invoke-virtual {v7}, Lq31/a;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lkh1/c;->k()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_6

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_9
    const/4 v5, -0x1

    :goto_6
    if-ltz v5, :cond_a

    :goto_7
    move v9, v5

    goto :goto_8

    :cond_a
    invoke-virtual {v6}, Lq31/f;->c()I

    move-result v5

    goto :goto_7

    :goto_8
    const/16 v12, 0x1b

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lq31/f;->b(Lq31/f;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILjava/lang/Object;)Lq31/f;

    move-result-object v4

    :cond_b
    :goto_9
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_c
    return-object v3
.end method

.method private final c(Lkh1/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnh1/c;
    .locals 9

    instance-of v0, p1, Lkh1/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Lnh1/c;

    new-instance v2, Lnh1/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lnh1/c$b;-><init>(Lsz0/q0;Lnh1/a;Lnh1/a;Lnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lnh1/c;-><init>(Lnh1/c$c;Lnh1/c$b;Lnh1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lkh1/a$c;

    if-eqz v0, :cond_1

    new-instance v1, Lnh1/c;

    new-instance v2, Lnh1/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lnh1/a$q;

    invoke-direct {v4, p2, p3, p4, p5}, Lnh1/a$q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Lnh1/a$j;->a:Lnh1/a$j;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lnh1/c$b;-><init>(Lsz0/q0;Lnh1/a;Lnh1/a;Lnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lnh1/c;-><init>(Lnh1/c$c;Lnh1/c$b;Lnh1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lkh1/a$d;

    if-eqz v0, :cond_2

    new-instance v1, Lnh1/c;

    new-instance v2, Lnh1/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lnh1/a$q;

    invoke-direct {v4, p2, p3, p4, p5}, Lnh1/a$q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Lnh1/a$j;->a:Lnh1/a$j;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lnh1/c$b;-><init>(Lsz0/q0;Lnh1/a;Lnh1/a;Lnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lnh1/c;-><init>(Lnh1/c$c;Lnh1/c$b;Lnh1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of p1, p1, Lkh1/a$e;

    if-eqz p1, :cond_3

    new-instance v0, Lnh1/c;

    new-instance v1, Lnh1/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lnh1/c$b;-><init>(Lsz0/q0;Lnh1/a;Lnh1/a;Lnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    move-object v2, v1

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v5}, Lnh1/c;-><init>(Lnh1/c$c;Lnh1/c$b;Lnh1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final d(Lkh1/c;Lnh1/c$c;)Lnh1/c;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Lkh1/c;->h()Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getBottomCommonStickyItems()Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1}, Lkh1/c;->h()Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getBottomStickyItems()Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, Lkh1/c;->k()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    sget-object v5, Lm83/y;->w:Lm83/y;

    if-nez v2, :cond_3

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v12, 0x0

    goto :goto_4

    :cond_3
    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;->getItems()Ljava/util/List;

    move-result-object v6

    if-nez v6, :cond_5

    :cond_4
    move-object v6, v5

    :cond_5
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;->getItems()Ljava/util/List;

    move-result-object v7

    if-nez v7, :cond_7

    :cond_6
    move-object v7, v5

    :cond_7
    check-cast v6, Ljava/util/Collection;

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v6, v7}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    new-instance v7, Lnh1/c$e;

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;->getText()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_a

    :cond_8
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;->getText()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_9
    const/4 v4, 0x0

    :cond_a
    :goto_3
    invoke-virtual {v1}, Lkh1/c;->j()I

    move-result v2

    invoke-virtual {v1}, Lkh1/c;->i()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0, v1, v6, v2, v8}, Loh1/a;->a(Lkh1/c;Ljava/util/List;ILjava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v7, v4, v2}, Lnh1/c$e;-><init>(Ljava/lang/String;Ljava/util/List;)V

    move-object v12, v7

    :goto_4
    invoke-virtual {v1}, Lkh1/c;->h()Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {v2}, Loh1/b;->f(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_b

    goto :goto_6

    :cond_b
    :goto_5
    move-object/from16 v16, v2

    goto :goto_7

    :cond_c
    :goto_6
    sget-object v2, Lm83/z;->w:Lm83/z;

    goto :goto_5

    :goto_7
    invoke-virtual {v1}, Lkh1/c;->h()Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getCountrySelector()Lcom/whoop/design/models/items/CountrySelectorModel;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lkh1/c;->j()I

    move-result v4

    invoke-virtual {v1}, Lkh1/c;->i()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v1, v2, v4, v6}, Loh1/a;->a(Lkh1/c;Ljava/util/List;ILjava/lang/String;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lr51/f;

    if-eqz v7, :cond_d

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_e
    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr51/f;

    move-object v15, v2

    goto :goto_9

    :cond_f
    const/4 v15, 0x0

    :goto_9
    invoke-virtual {v1}, Lkh1/c;->h()Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getToolBarTitle()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_10

    goto :goto_b

    :cond_10
    :goto_a
    move-object v9, v2

    goto :goto_c

    :cond_11
    :goto_b
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    goto :goto_a

    :goto_c
    invoke-virtual {v1}, Lkh1/c;->h()Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_16

    invoke-virtual {v2}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getSections()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_16

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;

    invoke-virtual {v6}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_12

    const-string v7, ""

    :cond_12
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "toUpperCase(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionSpacingType;->COMPACT:Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionSpacingType;

    invoke-static {}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionSpacingType;->values()[Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionSpacingType;

    move-result-object v10

    array-length v11, v10

    move v13, v4

    :goto_e
    if-ge v13, v11, :cond_14

    aget-object v14, v10, v13

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    goto :goto_f

    :cond_13
    add-int/lit8 v13, v13, 0x1

    goto :goto_e

    :cond_14
    const/4 v14, 0x0

    :goto_f
    if-nez v14, :cond_15

    goto :goto_10

    :cond_15
    move-object v8, v14

    :goto_10
    new-instance v3, Lnh1/c$a;

    invoke-virtual {v6}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;->getItems()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v1}, Lkh1/c;->j()I

    move-result v7

    invoke-virtual {v1}, Lkh1/c;->i()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v1, v6, v7, v10}, Loh1/a;->a(Lkh1/c;Ljava/util/List;ILjava/lang/String;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v3, v6, v8}, Lnh1/c$a;-><init>(Ljava/util/List;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionSpacingType;)V

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_16
    move-object v10, v5

    invoke-virtual {v1}, Lkh1/c;->k()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lkh1/c;->j()I

    move-result v14

    invoke-virtual {v1}, Lkh1/c;->g()Z

    move-result v2

    if-nez v2, :cond_17

    invoke-virtual {v1}, Lkh1/c;->d()Z

    move-result v1

    if-eqz v1, :cond_17

    const/4 v4, 0x1

    :cond_17
    move v11, v4

    new-instance v4, Lnh1/c$d;

    move-object v8, v4

    invoke-direct/range {v8 .. v16}, Lnh1/c$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLnh1/c$e;Ljava/lang/String;ILr51/f;Ljava/util/Map;)V

    new-instance v1, Lnh1/c;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v6}, Lnh1/c;-><init>(Lnh1/c$c;Lnh1/c$b;Lnh1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public final b(Lkh1/c;)Lnh1/c;
    .locals 7

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkh1/c;->c()Lkh1/a;

    move-result-object v0

    instance-of v0, v0, Lkh1/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkh1/c;->c()Lkh1/a;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkh1/a$a;

    invoke-virtual {p1}, Lkh1/c;->m()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkh1/c;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lkh1/c;->n()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lkh1/c;->l()Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Loh1/a;->c(Lkh1/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnh1/c;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v1, p0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Loh1/a;->d(Lkh1/c;Lnh1/c$c;)Lnh1/c;

    move-result-object p1

    return-object p1
.end method
