.class public final Lkx1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkx1/d;",
        "",
        "Lq22/e;",
        "paymentFormValidator",
        "<init>",
        "(Lq22/e;)V",
        "Lex1/b;",
        "result",
        "Ljx1/c0;",
        "e",
        "(Lex1/b;)Ljx1/c0;",
        "Lfx1/b;",
        "Ljx1/o;",
        "d",
        "(Lfx1/b;)Ljx1/o;",
        "Ldx1/b;",
        "Ljx1/l;",
        "c",
        "(Ldx1/b;)Ljx1/l;",
        "Lbx1/b;",
        "Ljx1/e;",
        "b",
        "(Lbx1/b;)Ljx1/e;",
        "Lcx1/a;",
        "domainResult",
        "Ljx1/e0;",
        "a",
        "(Lcx1/a;)Ljx1/e0;",
        "Lq22/e;",
        "membership_release"
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
.field private final a:Lq22/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lq22/e;->d:I

    sput v0, Lkx1/d;->b:I

    return-void
.end method

.method public constructor <init>(Lq22/e;)V
    .locals 1

    const-string v0, "paymentFormValidator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkx1/d;->a:Lq22/e;

    return-void
.end method

.method private final b(Lbx1/b;)Ljx1/e;
    .locals 3

    sget-object v0, Lbx1/b$b;->a:Lbx1/b$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ljx1/e$b;->a:Ljx1/e$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Lbx1/b$a;

    if-eqz v0, :cond_2

    new-instance v0, Ljx1/e$a;

    check-cast p1, Lbx1/b$a;

    invoke-virtual {p1}, Lbx1/b$a;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    invoke-virtual {p1}, Lbx1/b$a;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lbx1/b$a;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Ljx1/e$a;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;)V

    return-object v0

    :cond_2
    sget-object v0, Lbx1/b$c;->a:Lbx1/b$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Ljx1/e$c;->a:Ljx1/e$c;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final c(Ldx1/b;)Ljx1/l;
    .locals 8

    instance-of v0, p1, Ldx1/b$c;

    if-eqz v0, :cond_5

    check-cast p1, Ldx1/b$c;

    invoke-virtual {p1}, Ldx1/b$c;->a()Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;->getNavigationBarText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ldx1/b$c;->a()Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/membership/management/domain/models/ScreenSection;

    invoke-virtual {v4}, Lcom/whoop/membership/management/domain/models/ScreenSection;->getItems()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {}, Lkx1/c;->i()Ljb1/a;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v4, Ljx1/f0;

    invoke-direct {v4, v5}, Ljx1/f0;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ldx1/b$c;->a()Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;->getStyle()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljx1/n;->ONE:Ljx1/n;

    invoke-static {}, Ljx1/n;->values()[Ljx1/n;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_3

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_3
    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    move-object v1, v6

    :goto_4
    new-instance p1, Ljx1/l$b;

    invoke-direct {p1, v0, v2, v1}, Ljx1/l$b;-><init>(Ljava/lang/String;Ljava/util/List;Ljx1/n;)V

    return-object p1

    :cond_5
    sget-object v0, Ldx1/b$a;->a:Ldx1/b$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Ljx1/l$a;->a:Ljx1/l$a;

    return-object p1

    :cond_6
    sget-object v0, Ldx1/b$b;->a:Ldx1/b$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p1, Ljx1/l$c;->a:Ljx1/l$c;

    return-object p1

    :cond_7
    sget-object v0, Ldx1/b$d;->a:Ldx1/b$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, Ljx1/l$d;->a:Ljx1/l$d;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final d(Lfx1/b;)Ljx1/o;
    .locals 35

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v0

    instance-of v1, v0, Lfx1/c$d;

    if-eqz v1, :cond_b

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v0

    check-cast v0, Lfx1/c$d;

    invoke-virtual {v0}, Lfx1/c$d;->e()Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;->getNavigationBarText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v1

    check-cast v1, Lfx1/c$d;

    invoke-virtual {v1}, Lfx1/c$d;->e()Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/membership/management/domain/models/ScreenSection;

    invoke-virtual {v4}, Lcom/whoop/membership/management/domain/models/ScreenSection;->getItems()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {}, Lkx1/c;->i()Ljb1/a;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v8

    instance-of v9, v8, Ljx1/s;

    if-eqz v9, :cond_5

    move-object v10, v8

    check-cast v10, Ljx1/s;

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v8

    check-cast v8, Lfx1/c$d;

    invoke-virtual {v8}, Lfx1/c$d;->i()Z

    move-result v24

    move-object/from16 v9, p0

    iget-object v8, v9, Lkx1/d;->a:Lq22/e;

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v11

    check-cast v11, Lfx1/c$d;

    invoke-virtual {v11}, Lfx1/c$d;->f()I

    move-result v20

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v11

    check-cast v11, Lfx1/c$d;

    invoke-virtual {v11}, Lfx1/c$d;->c()Lcom/whoop/payments/domain/models/Card;

    move-result-object v26

    invoke-virtual {v10}, Ljx1/s;->o()Ljx1/d;

    move-result-object v11

    if-eqz v11, :cond_0

    invoke-virtual {v11}, Ljx1/d;->b()Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    :cond_0
    move-object v11, v6

    :goto_2
    if-eqz v11, :cond_2

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v11

    check-cast v11, Lfx1/c$d;

    invoke-virtual {v11}, Lfx1/c$d;->f()I

    move-result v11

    if-eqz v11, :cond_3

    :cond_2
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v11

    check-cast v11, Lfx1/c$d;

    invoke-virtual {v11}, Lfx1/c$d;->h()Z

    move-result v11

    if-eqz v11, :cond_4

    :cond_3
    const/4 v11, 0x1

    move/from16 v27, v11

    goto :goto_4

    :cond_4
    move/from16 v27, v5

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v11

    check-cast v11, Lfx1/c$d;

    invoke-virtual {v11}, Lfx1/c$d;->g()Z

    move-result v29

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v11

    check-cast v11, Lfx1/c$d;

    invoke-virtual {v11}, Lfx1/c$d;->e()Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;->getTrackingMonths()I

    move-result v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v32

    const v33, 0x1a1dff

    const/16 v34, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v25, v8

    invoke-static/range {v10 .. v34}, Ljx1/s;->b(Ljx1/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;ILjava/lang/Object;)Ljx1/s;

    move-result-object v8

    goto :goto_5

    :cond_5
    move-object/from16 v9, p0

    :goto_5
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_6
    move-object/from16 v9, p0

    new-instance v4, Ljx1/f0;

    invoke-direct {v4, v7}, Ljx1/f0;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    move-object/from16 v9, p0

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v1

    check-cast v1, Lfx1/c$d;

    invoke-virtual {v1}, Lfx1/c$d;->e()Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/MembershipAdjustmentCheckoutScreenResponse;->getStyle()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljx1/n;->ONE:Ljx1/n;

    invoke-static {}, Ljx1/n;->values()[Ljx1/n;

    move-result-object v4

    array-length v7, v4

    :goto_6
    if-ge v5, v7, :cond_9

    aget-object v8, v4, v5

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move-object v6, v8

    goto :goto_7

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_9
    :goto_7
    if-nez v6, :cond_a

    goto :goto_8

    :cond_a
    move-object v3, v6

    :goto_8
    new-instance v1, Ljx1/o$c;

    invoke-direct {v1, v0, v2, v3}, Ljx1/o$c;-><init>(Ljava/lang/String;Ljava/util/List;Ljx1/n;)V

    return-object v1

    :cond_b
    move-object/from16 v9, p0

    instance-of v1, v0, Lfx1/c$a;

    if-eqz v1, :cond_c

    new-instance v0, Ljx1/o$a;

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v1

    check-cast v1, Lfx1/c$a;

    invoke-virtual {v1}, Lfx1/c$a;->a()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljx1/o$a;-><init>(Ljava/util/Map;)V

    return-object v0

    :cond_c
    sget-object v1, Lfx1/c$c;->a:Lfx1/c$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    sget-object v0, Ljx1/o$d;->b:Ljx1/o$d;

    return-object v0

    :cond_d
    sget-object v1, Lfx1/c$e;->a:Lfx1/c$e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v0, Ljx1/o$e;->b:Ljx1/o$e;

    return-object v0

    :cond_e
    instance-of v0, v0, Lfx1/c$b;

    if-eqz v0, :cond_10

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v1

    check-cast v1, Lfx1/c$b;

    invoke-virtual {v1}, Lfx1/c$b;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v2

    check-cast v2, Lfx1/c$b;

    invoke-virtual {v2}, Lfx1/c$b;->c()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_f

    const-string v2, ""

    :cond_f
    invoke-virtual/range {p1 .. p1}, Lfx1/b;->d()Lfx1/c;

    move-result-object v3

    check-cast v3, Lfx1/c$b;

    invoke-virtual {v3}, Lfx1/c$b;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v3

    new-instance v4, Ljx1/o$b;

    invoke-direct {v4, v0, v2, v1, v3}, Ljx1/o$b;-><init>(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;)V

    return-object v4

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final e(Lex1/b;)Ljx1/c0;
    .locals 7

    instance-of v0, p1, Lex1/b$d;

    if-eqz v0, :cond_2

    check-cast p1, Lex1/b$d;

    invoke-virtual {p1}, Lex1/b$d;->a()Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;->getNavigationBarText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lex1/b$d;->a()Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;->getSections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/membership/management/domain/models/ScreenSection;

    invoke-virtual {v3}, Lcom/whoop/membership/management/domain/models/ScreenSection;->getItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {}, Lkx1/c;->i()Ljb1/a;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v3, Ljx1/f0;

    invoke-direct {v3, v4}, Ljx1/f0;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljx1/c0$c;

    invoke-direct {p1, v0, v1}, Ljx1/c0$c;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p1

    :cond_2
    sget-object v0, Lex1/b$a;->a:Lex1/b$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Ljx1/c0$a;->a:Ljx1/c0$a;

    return-object p1

    :cond_3
    sget-object v0, Lex1/b$c;->a:Lex1/b$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Ljx1/c0$d;->a:Ljx1/c0$d;

    return-object p1

    :cond_4
    sget-object v0, Lex1/b$f;->a:Lex1/b$f;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Ljx1/c0$f;->a:Ljx1/c0$f;

    return-object p1

    :cond_5
    instance-of v0, p1, Lex1/b$b;

    if-eqz v0, :cond_6

    new-instance v0, Ljx1/c0$b;

    check-cast p1, Lex1/b$b;

    invoke-virtual {p1}, Lex1/b$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lex1/b$b;->b()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljx1/c0$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0

    :cond_6
    sget-object v0, Lex1/b$e;->a:Lex1/b$e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Ljx1/c0$e;->a:Ljx1/c0$e;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final a(Lcx1/a;)Ljx1/e0;
    .locals 4

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljx1/e0;

    invoke-virtual {p1}, Lcx1/a;->d()Lex1/b;

    move-result-object v1

    invoke-direct {p0, v1}, Lkx1/d;->e(Lex1/b;)Ljx1/c0;

    move-result-object v1

    invoke-virtual {p1}, Lcx1/a;->c()Lfx1/b;

    move-result-object v2

    invoke-direct {p0, v2}, Lkx1/d;->d(Lfx1/b;)Ljx1/o;

    move-result-object v2

    invoke-virtual {p1}, Lcx1/a;->b()Ldx1/b;

    move-result-object v3

    invoke-direct {p0, v3}, Lkx1/d;->c(Ldx1/b;)Ljx1/l;

    move-result-object v3

    invoke-virtual {p1}, Lcx1/a;->a()Lbx1/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lkx1/d;->b(Lbx1/b;)Ljx1/e;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Ljx1/e0;-><init>(Ljx1/c0;Ljx1/o;Ljx1/l;Ljx1/e;)V

    return-object v0
.end method
