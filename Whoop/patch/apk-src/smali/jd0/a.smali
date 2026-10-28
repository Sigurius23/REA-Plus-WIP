.class public final Ljd0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Ljd0/a;",
        "",
        "Lya0/a;",
        "analytics",
        "<init>",
        "(Lya0/a;)V",
        "Lkd0/a$x;",
        "event",
        "Lkd0/a;",
        "b",
        "(Lkd0/a$x;)Lkd0/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "c",
        "(Lcom/whoop/navigation/e;)Lkd0/a;",
        "actionEvent",
        "d",
        "(Lkd0/a;)Lkd0/a;",
        "Lk11/e;",
        "a",
        "(Lk11/e;)Lkd0/a;",
        "Lya0/a;",
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


# instance fields
.field private final a:Lya0/a;


# direct methods
.method public constructor <init>(Lya0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljd0/a;->a:Lya0/a;

    return-void
.end method

.method private final b(Lkd0/a$x;)Lkd0/a;
    .locals 4

    invoke-virtual {p1}, Lkd0/a$x;->d()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/item/DesignItemInteraction;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {v0}, Lcom/whoop/design/item/DesignItemInteraction;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v3, p0, Ljd0/a;->a:Lya0/a;

    invoke-virtual {v3, v1}, Lya0/a;->d(Lcom/whoop/analytics/AnalyticEventModel;)V

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/item/DesignItemInteraction;->getActionArgument()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1c

    const/4 v1, 0x2

    invoke-static {p1, v0, v2, v1, v2}, Lkd0/a$x;->b(Lkd0/a$x;Ljava/lang/Object;Lm91/u;ILjava/lang/Object;)Lkd0/a$x;

    move-result-object p1

    invoke-direct {p0, p1}, Ljd0/a;->b(Lkd0/a$x;)Lkd0/a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Lcom/whoop/navigation/e;

    if-eqz p1, :cond_2

    check-cast v0, Lcom/whoop/navigation/e;

    invoke-direct {p0, v0}, Ljd0/a;->c(Lcom/whoop/navigation/e;)Lkd0/a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz p1, :cond_3

    new-instance p1, Lkd0/a$i;

    new-instance v1, Lvw2/c;

    check-cast v0, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {v1, v0}, Lvw2/c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-direct {p1, v1}, Lkd0/a$i;-><init>(Lvw2/a;)V

    return-object p1

    :cond_3
    instance-of p1, v0, Lcom/whoop/design/models/items/ArticleTileModelEvent;

    if-eqz p1, :cond_8

    move-object p1, v0

    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModelEvent;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v3, p0, Ljd0/a;->a:Lya0/a;

    invoke-virtual {v3, v1}, Lya0/a;->d(Lcom/whoop/analytics/AnalyticEventModel;)V

    :cond_4
    instance-of v1, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    if-eqz v1, :cond_6

    iget-object p1, p0, Ljd0/a;->a:Lya0/a;

    new-instance v1, Lkd0/a$q;

    check-cast v0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getIndex()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :cond_5
    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lkd0/a$q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lya0/a;->e(Lkd0/a$c;)V

    new-instance p1, Lkd0/a$h;

    invoke-direct {p1, v0}, Lkd0/a$h;-><init>(Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;)V

    return-object p1

    :cond_6
    instance-of v0, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Cta;

    if-nez v0, :cond_1c

    instance-of p1, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;

    if-eqz p1, :cond_7

    goto/16 :goto_1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    instance-of p1, v0, Lj21/b$a;

    if-eqz p1, :cond_9

    new-instance p1, Lkd0/a$z;

    check-cast v0, Lj21/b$a;

    invoke-virtual {v0}, Lj21/b$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkd0/a$z;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_9
    instance-of p1, v0, Lj21/b$b;

    if-eqz p1, :cond_a

    check-cast v0, Lj21/b$b;

    invoke-virtual {v0}, Lj21/b$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Ljd0/a;->c(Lcom/whoop/navigation/e;)Lkd0/a;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, v0, Ld11/i;

    if-eqz p1, :cond_b

    check-cast v0, Ld11/i;

    invoke-virtual {v0}, Ld11/i;->x()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_1c

    invoke-direct {p0, p1}, Ljd0/a;->c(Lcom/whoop/navigation/e;)Lkd0/a;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of p1, v0, Ls01/d;

    if-eqz p1, :cond_e

    check-cast v0, Ls01/d;

    invoke-virtual {v0}, Ls01/d;->c()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-direct {p0, p1}, Ljd0/a;->c(Lcom/whoop/navigation/e;)Lkd0/a;

    move-result-object p1

    if-nez p1, :cond_c

    goto :goto_0

    :cond_c
    return-object p1

    :cond_d
    :goto_0
    new-instance p1, Lkd0/a$h1;

    invoke-virtual {v0}, Ls01/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkd0/a$h1;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_e
    instance-of p1, v0, Lny0/h;

    if-eqz p1, :cond_13

    check-cast v0, Lny0/h;

    invoke-virtual {v0}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v1, "advanced_labs_home_info_callout_missed_test_callout_reschedule_button"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p1, p0, Ljd0/a;->a:Lya0/a;

    new-instance v1, Lkd0/a$g;

    const-string v2, "appt_no_show"

    invoke-direct {v1, v2}, Lkd0/a$g;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lya0/a;->e(Lkd0/a$c;)V

    :cond_f
    invoke-virtual {v0}, Lny0/h;->e()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, Lny0/h;->n()Lj02/s;

    move-result-object v1

    invoke-virtual {v0}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v2

    if-eqz v2, :cond_10

    new-instance p1, Lkd0/a$i;

    new-instance v0, Lvw2/c;

    invoke-direct {v0, v2}, Lvw2/c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-direct {p1, v0}, Lkd0/a$i;-><init>(Lvw2/a;)V

    return-object p1

    :cond_10
    instance-of v2, p1, Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v2, :cond_11

    new-instance v0, Lkd0/a$j0;

    check-cast p1, Lcom/whoop/design/models/modal/AnyModal;

    invoke-direct {v0, p1}, Lkd0/a$j0;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0

    :cond_11
    if-eqz v1, :cond_12

    new-instance p1, Lkd0/a$i0;

    invoke-direct {p1, v1}, Lkd0/a$i0;-><init>(Lj02/s;)V

    return-object p1

    :cond_12
    invoke-virtual {v0}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Ljd0/a;->c(Lcom/whoop/navigation/e;)Lkd0/a;

    move-result-object p1

    return-object p1

    :cond_13
    instance-of p1, v0, Lk11/e;

    if-eqz p1, :cond_14

    check-cast v0, Lk11/e;

    invoke-virtual {p0, v0}, Ljd0/a;->a(Lk11/e;)Lkd0/a;

    move-result-object p1

    return-object p1

    :cond_14
    instance-of p1, v0, Lm91/u;

    if-eqz p1, :cond_15

    new-instance p1, Lkd0/a$d;

    check-cast v0, Lm91/u;

    invoke-direct {p1, v0}, Lkd0/a$d;-><init>(Lm91/u;)V

    return-object p1

    :cond_15
    instance-of p1, v0, Llf0/i$a;

    if-eqz p1, :cond_16

    iget-object p1, p0, Ljd0/a;->a:Lya0/a;

    sget-object v0, Lkd0/a$e;->a:Lkd0/a$e;

    invoke-virtual {p1, v0}, Lya0/a;->e(Lkd0/a$c;)V

    return-object v2

    :cond_16
    instance-of p1, v0, Llf0/i$b;

    if-eqz p1, :cond_17

    iget-object p1, p0, Ljd0/a;->a:Lya0/a;

    new-instance v0, Lkd0/a$g;

    const-string v1, "workflow_tile"

    invoke-direct {v0, v1}, Lkd0/a$g;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lya0/a;->e(Lkd0/a$c;)V

    return-object v2

    :cond_17
    instance-of p1, v0, Llf0/i$c;

    if-eqz p1, :cond_19

    iget-object p1, p0, Ljd0/a;->a:Lya0/a;

    sget-object v1, Lkd0/a$f;->a:Lkd0/a$f;

    invoke-virtual {p1, v1}, Lya0/a;->e(Lkd0/a$c;)V

    check-cast v0, Llf0/i$c;

    invoke-virtual {v0}, Llf0/i$c;->a()Lny0/h;

    move-result-object p1

    invoke-virtual {p1}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    if-eqz p1, :cond_18

    new-instance v0, Lkd0/a$i;

    new-instance v1, Lvw2/c;

    invoke-direct {v1, p1}, Lvw2/c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-direct {v0, v1}, Lkd0/a$i;-><init>(Lvw2/a;)V

    return-object v0

    :cond_18
    invoke-virtual {v0}, Llf0/i$c;->a()Lny0/h;

    move-result-object p1

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Ljd0/a;->c(Lcom/whoop/navigation/e;)Lkd0/a;

    move-result-object p1

    return-object p1

    :cond_19
    instance-of p1, v0, Lq31/b;

    if-eqz p1, :cond_1a

    iget-object p1, p0, Ljd0/a;->a:Lya0/a;

    new-instance v1, Lkd0/a$o0;

    check-cast v0, Lq31/b;

    invoke-virtual {v0}, Lq31/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lkd0/a$o0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lya0/a;->e(Lkd0/a$c;)V

    new-instance p1, Lkd0/a$o0;

    invoke-virtual {v0}, Lq31/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkd0/a$o0;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_1a
    instance-of p1, v0, La41/b;

    if-eqz p1, :cond_1b

    iget-object p1, p0, Ljd0/a;->a:Lya0/a;

    new-instance v1, Lkd0/a$t0;

    check-cast v0, La41/b;

    invoke-virtual {v0}, La41/b;->a()Ljava/lang/String;

    move-result-object v0

    const-string v3, "advanced_labs_home"

    invoke-direct {v1, v0, v3}, Lkd0/a$t0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lya0/a;->e(Lkd0/a$c;)V

    return-object v2

    :cond_1b
    instance-of p1, v0, Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    if-eqz p1, :cond_1c

    new-instance p1, Lkd0/a$p0;

    check-cast v0, Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    invoke-direct {p1, v0}, Lkd0/a$p0;-><init>(Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)V

    return-object p1

    :cond_1c
    :goto_1
    return-object v2
.end method

.method private final c(Lcom/whoop/navigation/e;)Lkd0/a;
    .locals 1

    new-instance v0, Lkd0/a$j;

    invoke-direct {v0, p1}, Lkd0/a$j;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lk11/e;)Lkd0/a;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lk11/e$a;

    if-eqz v0, :cond_0

    new-instance v0, Lkd0/a$i;

    new-instance v1, Lvw2/c;

    check-cast p1, Lk11/e$a;

    invoke-virtual {p1}, Lk11/e$a;->b()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    invoke-direct {v1, p1}, Lvw2/c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-direct {v0, v1}, Lkd0/a$i;-><init>(Lvw2/a;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lk11/e$b;

    if-eqz v0, :cond_1

    check-cast p1, Lk11/e$b;

    invoke-virtual {p1}, Lk11/e$b;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Ljd0/a;->c(Lcom/whoop/navigation/e;)Lkd0/a;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d(Lkd0/a;)Lkd0/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkd0/a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljd0/a;->a:Lya0/a;

    move-object v1, p1

    check-cast v1, Lkd0/a$c;

    invoke-virtual {v0, v1}, Lya0/a;->e(Lkd0/a$c;)V

    :cond_0
    instance-of v0, p1, Lkd0/a$x;

    if-eqz v0, :cond_1

    check-cast p1, Lkd0/a$x;

    invoke-direct {p0, p1}, Ljd0/a;->b(Lkd0/a$x;)Lkd0/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method
