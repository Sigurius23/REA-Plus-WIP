.class public final Lux1/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lux1/c;",
        "Landroidx/lifecycle/w1;",
        "Lsx1/c;",
        "coordinator",
        "<init>",
        "(Lsx1/c;)V",
        "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;",
        "Lux1/d;",
        "n",
        "(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;)Lux1/d;",
        "Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;",
        "Lux1/a;",
        "l",
        "(Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;)Lux1/a;",
        "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;",
        "Lux1/b;",
        "j",
        "(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;)Lux1/b;",
        "w",
        "Lux1/d;",
        "g",
        "()Lux1/d;",
        "viewState",
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


# instance fields
.field private final w:Lux1/d;


# direct methods
.method public constructor <init>(Lsx1/c;)V
    .locals 1

    const-string v0, "coordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    invoke-virtual {p1}, Lsx1/c;->c()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsx1/e;

    invoke-virtual {p1}, Lsx1/e;->c()Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lux1/c;->n(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;)Lux1/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lux1/c;->w:Lux1/d;

    return-void
.end method

.method private final j(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;)Lux1/b;
    .locals 10

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;->getTrackingLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lgz0/m0;->REPORT:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v8, v3

    :goto_1
    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v8

    :goto_2
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    new-instance v4, Ly71/g;

    const/4 v5, 0x2

    invoke-direct {v4, v2, v3, v5, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v4

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    new-instance v2, Lux1/b;

    invoke-direct {v2, v0, v1, v3, p1}, Lux1/b;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ly71/g;Lcom/whoop/navigation/e;)V

    return-object v2
.end method

.method private final l(Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;)Lux1/a;
    .locals 6

    new-instance v0, Lux1/a;

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lux1/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final n(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;)Lux1/d;
    .locals 10

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->getMediaUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-eqz v3, :cond_0

    new-instance v2, Lkd1/o$c;

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/u;->g()I

    move-result v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->getIcon()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lgz0/m0;->REPORT:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_2

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    move-object v8, v0

    :goto_2
    if-nez v8, :cond_3

    goto :goto_3

    :cond_3
    move-object v4, v8

    :goto_3
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    move v4, v3

    new-instance v3, Ly71/g;

    const/4 v5, 0x2

    invoke-direct {v3, v4, v0, v5, v0}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->getTagText()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->getSubtitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->getMemberStatistics()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    move-object v8, v7

    new-instance v7, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v8, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;

    invoke-direct {p0, v9}, Lux1/c;->l(Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;)Lux1/a;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->getCta()Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;

    move-result-object v8

    invoke-direct {p0, v8}, Lux1/c;->j(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;)Lux1/b;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;->getSecondaryCta()Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-direct {p0, p1}, Lux1/c;->j(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;)Lux1/b;

    move-result-object v0

    :cond_5
    move-object v9, v0

    new-instance v0, Lux1/d;

    invoke-direct/range {v0 .. v9}, Lux1/d;-><init>(Ljava/lang/String;Lkd1/o;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lux1/b;Lux1/b;)V

    return-object v0
.end method


# virtual methods
.method public final g()Lux1/d;
    .locals 1

    iget-object v0, p0, Lux1/c;->w:Lux1/d;

    return-object v0
.end method
