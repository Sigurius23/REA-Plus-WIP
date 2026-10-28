.class public final Lfp2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0010\u001a\u00020\n*\u00020\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J+\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00122\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lfp2/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lbp2/a$a;",
        "",
        "cartId",
        "source",
        "Lep2/c;",
        "d",
        "(Lbp2/a$a;Ljava/lang/String;Ljava/lang/String;)Lep2/c;",
        "Lbp2/c;",
        "Lep2/c$c;",
        "dialog",
        "e",
        "(Lbp2/c;Lep2/c$c;)Lep2/c;",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "models",
        "",
        "orderDetailsIsExpanded",
        "Lm91/u;",
        "c",
        "(Ljava/util/List;Z)Ljava/util/List;",
        "spacing",
        "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;",
        "domainResult",
        "b",
        "(Lbp2/c;)Lep2/c;",
        "Ljb1/a;",
        "universal-checkout_release"
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

    sput v0, Lfp2/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfp2/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lmn2/a;->o()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lfp2/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;
    .locals 2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x76664f19    # -3.699977E-33f

    if-eq v0, v1, :cond_4

    const v1, 0x44dc31b

    if-eq v0, v1, :cond_2

    const v1, 0x6372c703

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "COMPACT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->COMPACT:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    return-object p1

    :cond_2
    const-string v0, "LARGE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->LARGE:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    return-object p1

    :cond_4
    const-string v0, "NORMAL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    sget-object p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->COMPACT:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    return-object p1

    :cond_5
    sget-object p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->NORMAL:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    return-object p1
.end method

.method private final c(Ljava/util/List;Z)Ljava/util/List;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;Z)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 v3, p0

    iget-object v4, v3, Lfp2/a;->a:Ljb1/a;

    invoke-virtual {v4, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    instance-of v4, v2, Lio2/u;

    if-eqz v4, :cond_0

    move-object v5, v2

    check-cast v5, Lio2/u;

    const/16 v12, 0x1f

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v11, p2

    invoke-static/range {v5 .. v13}, Lio2/u;->b(Lio2/u;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lio2/k;Lio2/t;ZILjava/lang/Object;)Lio2/u;

    move-result-object v2

    goto/16 :goto_3

    :cond_0
    instance-of v4, v2, Lio2/b0;

    if-eqz v4, :cond_3

    move-object v5, v2

    check-cast v5, Lio2/b0;

    invoke-virtual {v5}, Lio2/b0;->h()Ly71/o;

    move-result-object v6

    invoke-virtual {v5}, Lio2/b0;->h()Ly71/o;

    move-result-object v2

    invoke-virtual {v2}, Ly71/o;->c()Ly71/l;

    move-result-object v2

    instance-of v4, v2, Ly71/l$b;

    if-eqz v4, :cond_2

    move-object v7, v2

    check-cast v7, Ly71/l$b;

    const/16 v20, 0x7ff

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    invoke-static/range {v7 .. v21}, Ly71/l$b;->b(Ly71/l$b;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZILjava/lang/Object;)Ly71/l$b;

    move-result-object v2

    :cond_1
    :goto_1
    move-object v12, v2

    goto :goto_2

    :cond_2
    instance-of v4, v2, Ly71/l$c;

    if-eqz v4, :cond_1

    move-object v7, v2

    check-cast v7, Ly71/l$c;

    const/16 v20, 0x7ff

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    invoke-static/range {v7 .. v21}, Ly71/l$c;->b(Ly71/l$c;Lcom/whoop/design/util/TextResource;Ly81/e;Lkd1/o;Ly81/e;Lkd1/o;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZILjava/lang/Object;)Ly71/l$c;

    move-result-object v2

    goto :goto_1

    :goto_2
    const/16 v22, 0x7bdf

    const/16 v23, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v6 .. v23}, Ly71/o;->b(Ly71/o;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Ly71/o;

    move-result-object v7

    const/16 v13, 0x7d

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v14}, Lio2/b0;->b(Lio2/b0;Lp31/p;Ly71/o;Ly71/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lio2/b0;

    move-result-object v2

    :cond_3
    :goto_3
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    move-object/from16 v3, p0

    return-object v1
.end method

.method private final d(Lbp2/a$a;Ljava/lang/String;Ljava/lang/String;)Lep2/c;
    .locals 9

    instance-of v0, p1, Lbp2/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Lep2/c;

    new-instance v2, Lep2/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lep2/c$b;-><init>(Lsz0/q0;Lep2/a;Lep2/a;Lep2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0xd

    const/4 v7, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v7}, Lep2/c;-><init>(Lep2/c$c;Lep2/c$b;Lep2/c$d;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lbp2/a$c;

    if-eqz v0, :cond_1

    new-instance v1, Lep2/c;

    new-instance v2, Lep2/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lep2/a$g;

    invoke-direct {v4, p2, p3}, Lep2/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Lep2/a$j;->a:Lep2/a$j;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lep2/c$b;-><init>(Lsz0/q0;Lep2/a;Lep2/a;Lep2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0xd

    const/4 v7, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lep2/c;-><init>(Lep2/c$c;Lep2/c$b;Lep2/c$d;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Lbp2/a$d;

    if-eqz p1, :cond_2

    new-instance v0, Lep2/c;

    new-instance v1, Lep2/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v2

    new-instance v3, Lep2/a$g;

    invoke-direct {v3, p2, p3}, Lep2/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lep2/a$j;->a:Lep2/a$j;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lep2/c$b;-><init>(Lsz0/q0;Lep2/a;Lep2/a;Lep2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v5, 0xd

    const/4 v6, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lep2/c;-><init>(Lep2/c$c;Lep2/c$b;Lep2/c$d;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final e(Lbp2/c;Lep2/c$c;)Lep2/c;
    .locals 12

    invoke-virtual {p1}, Lbp2/c;->g()Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->getSections()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;

    invoke-virtual {v4}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v5, "sticky-bottom-items"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lbp2/c;->e()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v9

    invoke-virtual {p1}, Lbp2/c;->g()Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v0, v3

    :goto_1
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;

    invoke-virtual {v5}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-direct {p0, v6}, Lfp2/a;->a(Ljava/lang/String;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    move-result-object v6

    if-nez v6, :cond_6

    :cond_5
    sget-object v6, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->COMPACT:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    :cond_6
    new-instance v7, Lep2/c$a;

    invoke-virtual {v5}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;->getItems()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p1}, Lbp2/c;->f()Z

    move-result v8

    invoke-direct {p0, v5, v8}, Lfp2/a;->c(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v5

    invoke-direct {v7, v5, v6}, Lep2/c$a;-><init>(Ljava/util/List;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;

    invoke-virtual {v5}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;->getItems()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v2, v5}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, Lbp2/c;->f()Z

    move-result v1

    invoke-direct {p0, v2, v1}, Lfp2/a;->c(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lbp2/c;->g()Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->getCloseInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v3

    :cond_9
    new-instance v8, Lep2/c$d;

    invoke-direct {v8, v0, v4, v1, v3}, Lep2/c$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;)V

    new-instance v5, Lep2/c;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v7, 0x0

    move-object v6, p2

    invoke-direct/range {v5 .. v11}, Lep2/c;-><init>(Lep2/c$c;Lep2/c$b;Lep2/c$d;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method


# virtual methods
.method public final b(Lbp2/c;)Lep2/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lbp2/c;->d()Lbp2/a;

    move-result-object v0

    instance-of v0, v0, Lbp2/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lbp2/c;->d()Lbp2/a;

    move-result-object v0

    check-cast v0, Lbp2/a$a;

    invoke-virtual {p1}, Lbp2/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lbp2/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lfp2/a;->d(Lbp2/a$a;Ljava/lang/String;Ljava/lang/String;)Lep2/c;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lfp2/a;->e(Lbp2/c;Lep2/c$c;)Lep2/c;

    move-result-object p1

    return-object p1
.end method
