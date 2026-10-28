.class public final Ly22/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ+\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Ly22/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lu22/b$b;",
        "Lx22/c$b;",
        "c",
        "(Lu22/b$b;)Lx22/c$b;",
        "Lu22/b$e;",
        "Lx22/c$c;",
        "b",
        "(Lu22/b$e;)Lx22/c$c;",
        "Lu22/d;",
        "dialog",
        "fullScreenModal",
        "Lx22/c;",
        "d",
        "(Lu22/d;Lx22/c$c;Lx22/c$b;)Lx22/c;",
        "domainResult",
        "a",
        "(Lu22/d;)Lx22/c;",
        "Ljb1/a;",
        "payments_release"
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

    sput v0, Ly22/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly22/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Ly22/b;->d()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ly22/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Lu22/b$e;)Lx22/c$c;
    .locals 14

    instance-of v0, p1, Lu22/b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lu22/b$a;

    invoke-virtual {p1}, Lu22/b$a;->a()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p1}, Lu22/b$a;->a()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;->getPrimaryButton()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lu22/b$a;->a()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;->getSecondaryButton()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementButtonModel;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v9, Lj11/p;->DEFAULT:Lj11/p;

    sget-object v10, Lx22/a$g;->a:Lx22/a$g;

    sget-object v11, Lx22/a$e;->a:Lx22/a$e;

    new-instance v1, Lx22/c$c;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v1 .. v13}, Lx22/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lx22/a;Lx22/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final c(Lu22/b$b;)Lx22/c$b;
    .locals 16

    move-object/from16 v0, p1

    instance-of v1, v0, Lu22/b$c;

    if-eqz v1, :cond_0

    new-instance v2, Lx22/c$b;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lx22/c$b;-><init>(Lsz0/q0;Lx22/a;Lx22/a;Lx22/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    instance-of v1, v0, Lu22/b$d;

    if-eqz v1, :cond_1

    new-instance v2, Lx22/c$b;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    sget-object v4, Lx22/a$t;->a:Lx22/a$t;

    sget-object v6, Lx22/a$j;->a:Lx22/a$j;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lx22/c$b;-><init>(Lsz0/q0;Lx22/a;Lx22/a;Lx22/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    instance-of v1, v0, Lu22/b$f;

    if-eqz v1, :cond_2

    new-instance v2, Lx22/c$b;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v3

    sget-object v4, Lx22/a$t;->a:Lx22/a$t;

    sget-object v6, Lx22/a$j;->a:Lx22/a$j;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lx22/c$b;-><init>(Lsz0/q0;Lx22/a;Lx22/a;Lx22/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    instance-of v1, v0, Lu22/b$h;

    if-eqz v1, :cond_3

    new-instance v2, Lx22/c$b;

    new-instance v3, Lsz0/q0;

    new-instance v5, Lsz0/p0$d;

    sget v0, Lp22/b;->m:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    invoke-direct {v5, v0}, Lsz0/p0$d;-><init>(Lcom/whoop/design/util/TextResource;)V

    const/16 v14, 0x1fd

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-direct/range {v3 .. v15}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v7, 0xe

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lx22/c$b;-><init>(Lsz0/q0;Lx22/a;Lx22/a;Lx22/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_3
    instance-of v1, v0, Lu22/b$i;

    if-eqz v1, :cond_4

    new-instance v2, Lx22/c$b;

    new-instance v3, Lsz0/q0;

    new-instance v4, Lsz0/p0$h;

    sget v0, Lp22/b;->n:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const/4 v9, 0x6

    const/4 v10, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x1fd

    const/4 v15, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-direct/range {v3 .. v15}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lx22/a$j;->a:Lx22/a$j;

    const/16 v7, 0xc

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lx22/c$b;-><init>(Lsz0/q0;Lx22/a;Lx22/a;Lx22/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_4
    instance-of v0, v0, Lu22/b$g;

    if-eqz v0, :cond_5

    new-instance v1, Lx22/c$b;

    new-instance v2, Lsz0/p0$b;

    sget v0, Lp22/b;->l:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lp22/b;->k:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget v0, Lp22/b;->o:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    move-object v4, v2

    new-instance v2, Lsz0/q0;

    const/16 v13, 0x1e9

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-direct/range {v2 .. v14}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Lx22/a$u;->a:Lx22/a$u;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lx22/c$b;-><init>(Lsz0/q0;Lx22/a;Lx22/a;Lx22/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final d(Lu22/d;Lx22/c$c;Lx22/c$b;)Lx22/c;
    .locals 21

    invoke-virtual/range {p1 .. p1}, Lu22/d;->h()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->getAnalyticsProperties()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sget-object v1, Lm83/z;->w:Lm83/z;

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lu22/d;->h()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->getNavigationBar()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lu22/d;->h()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->getSections()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_d

    check-cast v3, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;

    invoke-virtual {v7}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_6

    const-string v8, ""

    :cond_6
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "toUpperCase(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lv22/a;->COMPACT:Lv22/a;

    invoke-static {}, Lv22/a;->values()[Lv22/a;

    move-result-object v10

    array-length v11, v10

    move v12, v4

    :goto_3
    if-ge v12, v11, :cond_8

    aget-object v13, v10, v12

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_8
    move-object v13, v2

    :goto_4
    if-nez v13, :cond_9

    :goto_5
    move-object/from16 v8, p0

    goto :goto_6

    :cond_9
    move-object v9, v13

    goto :goto_5

    :goto_6
    iget-object v10, v8, Ly22/a;->a:Ljb1/a;

    invoke-virtual {v7}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;->getItems()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v10, v7}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v7, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm91/u;

    instance-of v12, v11, Lg32/l;

    if-eqz v12, :cond_a

    move-object v13, v11

    check-cast v13, Lg32/l;

    invoke-virtual/range {p1 .. p1}, Lu22/d;->c()Z

    move-result v18

    const/16 v19, 0xf

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v20}, Lg32/l;->b(Lg32/l;Lp31/p;Ly71/o;Ljava/util/List;Lg32/m;ZILjava/lang/Object;)Lg32/l;

    move-result-object v11

    :cond_a
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_b
    new-instance v7, Lx22/c$a;

    invoke-direct {v7, v10, v9}, Lx22/c$a;-><init>(Ljava/util/List;Lv22/a;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_c
    move-object/from16 v8, p0

    goto :goto_8

    :cond_d
    move-object/from16 v8, p0

    sget-object v5, Lm83/y;->w:Lm83/y;

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lu22/d;->g()Z

    move-result v2

    if-nez v2, :cond_e

    invoke-virtual/range {p1 .. p1}, Lu22/d;->e()Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v4, 0x1

    :cond_e
    new-instance v2, Lx22/c$d;

    invoke-direct {v2, v0, v5, v4, v1}, Lx22/c$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLjava/util/Map;)V

    new-instance v0, Lx22/c;

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    invoke-direct {v0, v1, v3, v2}, Lx22/c;-><init>(Lx22/c$c;Lx22/c$b;Lx22/c$d;)V

    return-object v0
.end method

.method public static synthetic e(Ly22/a;Lu22/d;Lx22/c$c;Lx22/c$b;ILjava/lang/Object;)Lx22/c;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ly22/a;->d(Lu22/d;Lx22/c$c;Lx22/c$b;)Lx22/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lu22/d;)Lx22/c;
    .locals 7

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lu22/d;->d()Lu22/b;

    move-result-object v0

    instance-of v1, v0, Lu22/b$b;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lu22/d;->d()Lu22/b;

    move-result-object v0

    check-cast v0, Lu22/b$b;

    invoke-direct {p0, v0}, Ly22/a;->c(Lu22/b$b;)Lx22/c$b;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Ly22/a;->e(Ly22/a;Lu22/d;Lx22/c$c;Lx22/c$b;ILjava/lang/Object;)Lx22/c;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v1, p0

    move-object v2, p1

    instance-of p1, v0, Lu22/b$e;

    if-eqz p1, :cond_1

    invoke-virtual {v2}, Lu22/d;->d()Lu22/b;

    move-result-object p1

    check-cast p1, Lu22/b$e;

    invoke-direct {p0, p1}, Ly22/a;->b(Lu22/b$e;)Lx22/c$c;

    move-result-object p1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v1

    move-object v1, v2

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Ly22/a;->e(Ly22/a;Lu22/d;Lx22/c$c;Lx22/c$b;ILjava/lang/Object;)Lx22/c;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v1, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Ly22/a;->e(Ly22/a;Lu22/d;Lx22/c$c;Lx22/c$b;ILjava/lang/Object;)Lx22/c;

    move-result-object p1

    return-object p1
.end method
