.class public final Lmd0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u00020\u0007*\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J-\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lmd0/d;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lsb0/a$a;",
        "Lkd0/c;",
        "e",
        "(Lsb0/a$a;)Lkd0/c;",
        "Lsb0/c;",
        "Lkd0/c$a;",
        "dialog",
        "f",
        "(Lsb0/c;Lkd0/c$a;)Lkd0/c;",
        "Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;",
        "Lkd0/c$b;",
        "d",
        "(Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)Lkd0/c$b;",
        "Lq31/f;",
        "item",
        "",
        "selectedSegmentId",
        "a",
        "(Lq31/f;Ljava/lang/String;)Lq31/f;",
        "",
        "Lm91/u;",
        "items",
        "b",
        "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;",
        "domainResult",
        "c",
        "(Lsb0/c;)Lkd0/c;",
        "Ljb1/a;",
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


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lmd0/d;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmd0/d;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lmd0/d;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Lq31/f;Ljava/lang/String;)Lq31/f;
    .locals 10

    invoke-virtual {p1}, Lq31/f;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq31/a;

    invoke-virtual {v2}, Lq31/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    if-ltz v1, :cond_2

    :goto_2
    move v5, v1

    goto :goto_3

    :cond_2
    invoke-virtual {p1}, Lq31/f;->c()I

    move-result v1

    goto :goto_2

    :goto_3
    const/16 v8, 0x1b

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lq31/f;->b(Lq31/f;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILjava/lang/Object;)Lq31/f;

    move-result-object p1

    return-object p1
.end method

.method private final b(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/u;

    instance-of v3, v2, Lkf0/k;

    if-eqz v3, :cond_2

    move-object v4, v2

    check-cast v4, Lkf0/k;

    invoke-virtual {v4}, Lkf0/k;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    instance-of v5, v3, Lq31/f;

    if-eqz v5, :cond_0

    if-eqz p2, :cond_0

    check-cast v3, Lq31/f;

    invoke-direct {p0, v3, p2}, Lmd0/d;->a(Lq31/f;Ljava/lang/String;)Lq31/f;

    move-result-object v3

    :cond_0
    invoke-interface {v8, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lkf0/k;->b(Lkf0/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lkf0/k;

    move-result-object v2

    :cond_2
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private final d(Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)Lkd0/c$b;
    .locals 6

    new-instance v0, Lkd0/c$b;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    iget-object v3, p0, Lmd0/d;->a:Ljb1/a;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;->getPrimaryButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lny0/h;

    iget-object v5, p0, Lmd0/d;->a:Ljb1/a;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;->getSecondaryButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lny0/h;

    invoke-direct {v0, v1, v2, v3, p1}, Lkd0/c$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/h;Lny0/h;)V

    return-object v0
.end method

.method private final e(Lsb0/a$a;)Lkd0/c;
    .locals 9

    instance-of v0, p1, Lsb0/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Lkd0/c;

    new-instance v2, Lkd0/c$d;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd0/c$d;-><init>(Lsz0/q0;Lkd0/a;Lkd0/a;Lkd0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lkd0/c;-><init>(Lkd0/c$a;Lkd0/c$d;Lkd0/c$g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lsb0/a$c;

    if-eqz v0, :cond_1

    new-instance v1, Lkd0/c;

    new-instance v2, Lkd0/c$d;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    sget-object v4, Lkd0/a$k0;->a:Lkd0/a$k0;

    sget-object v6, Lkd0/a$t;->a:Lkd0/a$t;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lkd0/c$d;-><init>(Lsz0/q0;Lkd0/a;Lkd0/a;Lkd0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lkd0/c;-><init>(Lkd0/c$a;Lkd0/c$d;Lkd0/c$g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Lsb0/a$d;

    if-eqz p1, :cond_2

    new-instance v0, Lkd0/c;

    new-instance v1, Lkd0/c$d;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v2

    sget-object v3, Lkd0/a$k0;->a:Lkd0/a$k0;

    sget-object v5, Lkd0/a$t;->a:Lkd0/a$t;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lkd0/c$d;-><init>(Lsz0/q0;Lkd0/a;Lkd0/a;Lkd0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lkd0/c;-><init>(Lkd0/c$a;Lkd0/c$d;Lkd0/c$g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Lsb0/c;Lkd0/c$a;)Lkd0/c;
    .locals 23

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lsb0/c;->e()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->getBottomStickyItems()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lsb0/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    new-instance v3, Lkd0/c$h;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;->getText()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lmd0/d;->a:Ljb1/a;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lsb0/c;->f()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v1, v5}, Lmd0/d;->b(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lkd0/c$h;-><init>(Ljava/lang/String;Ljava/util/List;)V

    move-object v11, v3

    goto :goto_1

    :cond_1
    move-object v11, v2

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lsb0/c;->e()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->getMetadata()Lcom/whoop/advancedlabs/domain/models/MetaData;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v3

    move-object v6, v3

    goto :goto_2

    :cond_2
    move-object v6, v2

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationRightButton()Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v8, :cond_4

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_4
    move-object v10, v2

    :goto_4
    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v4

    new-instance v5, Lkd0/c$f;

    invoke-direct {v5, v10, v4}, Lkd0/c$f;-><init>(Lgz0/m0;Lcom/whoop/navigation/e;)V

    goto :goto_5

    :cond_5
    move-object v5, v2

    :goto_5
    new-instance v7, Lkd0/c$e;

    invoke-direct {v7, v3, v5}, Lkd0/c$e;-><init>(Ljava/lang/String;Lkd0/c$f;)V

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->getSections()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;

    iget-object v9, v0, Lmd0/d;->a:Ljb1/a;

    invoke-virtual {v9, v5}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v5

    instance-of v9, v5, Lkf0/k;

    if-eqz v9, :cond_8

    move-object v12, v5

    check-cast v12, Lkf0/k;

    invoke-virtual {v12}, Lkf0/k;->e()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm91/u;

    instance-of v13, v10, Llf0/t1;

    if-eqz v13, :cond_6

    move-object v14, v10

    check-cast v14, Llf0/t1;

    invoke-virtual {v14}, Llf0/t1;->e()Le81/f0;

    move-result-object v15

    const/16 v19, 0x5

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Le81/f0;->b(Le81/f0;Ljava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Le81/f0;

    move-result-object v16

    const/16 v21, 0x3d

    const/16 v22, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v14 .. v22}, Llf0/t1;->b(Llf0/t1;Ljava/lang/String;Le81/f0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Llf0/t1;

    move-result-object v10

    :cond_6
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    const/16 v17, 0x7

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v9

    invoke-static/range {v12 .. v18}, Lkf0/k;->b(Lkf0/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lkf0/k;

    move-result-object v5

    :cond_8
    new-instance v9, Lkd0/c$c;

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lsb0/c;->f()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v5, v10}, Lmd0/d;->b(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v9, v5}, Lkd0/c$c;-><init>(Ljava/util/List;)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_9
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lsb0/c;->d()Z

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lsb0/c;->f()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->getAttendedAppointmentDialog()Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-direct {v0, v1}, Lmd0/d;->d(Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)Lkd0/c$b;

    move-result-object v2

    :cond_a
    move-object v13, v2

    new-instance v5, Lkd0/c$g;

    const/4 v14, 0x0

    const/16 v15, 0x100

    const/16 v16, 0x0

    invoke-direct/range {v5 .. v16}, Lkd0/c$g;-><init>(Lep0/j;Lkd0/c$e;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;ZLkd0/c$h;Ljava/lang/String;Lkd0/c$b;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v5

    goto :goto_8

    :cond_b
    move-object v9, v2

    :goto_8
    new-instance v6, Lkd0/c;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object/from16 v7, p2

    invoke-direct/range {v6 .. v11}, Lkd0/c;-><init>(Lkd0/c$a;Lkd0/c$d;Lkd0/c$g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method


# virtual methods
.method public final c(Lsb0/c;)Lkd0/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lsb0/c;->c()Lsb0/a;

    move-result-object v0

    instance-of v0, v0, Lsb0/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lsb0/c;->c()Lsb0/a;

    move-result-object p1

    check-cast p1, Lsb0/a$a;

    invoke-direct {p0, p1}, Lmd0/d;->e(Lsb0/a$a;)Lkd0/c;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lmd0/d;->f(Lsb0/c;Lkd0/c$a;)Lkd0/c;

    move-result-object p1

    return-object p1
.end method
