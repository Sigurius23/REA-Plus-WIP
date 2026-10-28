.class public final Lrq0/c1;
.super Lib/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lib/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010 R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0017\u0010\'\u001a\u00020#8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lrq0/c1;",
        "Lib/p;",
        "Lcom/whoop/domain/model/teams/LeadersEntry;",
        "Lrq0/d1;",
        "Lcom/whoop/ui/ScoreContext;",
        "scoreContext",
        "Lrq0/h1;",
        "viewModel",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "Lkotlin/Function1;",
        "Lcom/whoop/domain/model/teams/TeamUserListing;",
        "Ll83/a0;",
        "onClick",
        "<init>",
        "(Lcom/whoop/ui/ScoreContext;Lrq0/h1;Lcom/whoop/data/repositories/FeatureFlagRepository;Lkotlin/jvm/functions/Function1;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "g",
        "(Landroid/view/ViewGroup;I)Lrq0/d1;",
        "holder",
        "position",
        "e",
        "(Lrq0/d1;I)V",
        "getItemCount",
        "()I",
        "c",
        "Lcom/whoop/ui/ScoreContext;",
        "d",
        "Lrq0/h1;",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "f",
        "Lkotlin/jvm/functions/Function1;",
        "Ltr2/n;",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
        "logger",
        "community_release"
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
.field private final c:Lcom/whoop/ui/ScoreContext;

.field private final d:Lrq0/h1;

.field private final e:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final f:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final g:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/ScoreContext;Lrq0/h1;Lcom/whoop/data/repositories/FeatureFlagRepository;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/ScoreContext;",
            "Lrq0/h1;",
            "Lcom/whoop/data/repositories/FeatureFlagRepository;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "scoreContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrq0/c1$a;

    invoke-direct {v0}, Lrq0/c1$a;-><init>()V

    invoke-direct {p0, v0}, Lib/p;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lrq0/c1;->c:Lcom/whoop/ui/ScoreContext;

    iput-object p2, p0, Lrq0/c1;->d:Lrq0/h1;

    iput-object p3, p0, Lrq0/c1;->e:Lcom/whoop/data/repositories/FeatureFlagRepository;

    iput-object p4, p0, Lrq0/c1;->f:Lkotlin/jvm/functions/Function1;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "TeamsListAdapter"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lrq0/c1;->g:Ltr2/n;

    return-void
.end method

.method public static synthetic d(Lrq0/c1;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lrq0/c1;->f(Lrq0/c1;Landroid/view/View;)V

    return-void
.end method

.method private static final f(Lrq0/c1;Landroid/view/View;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-nez v0, :cond_0

    iget-object v0, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v0}, Lrq0/h1;->g0()I

    move-result v0

    iget-object v2, p0, Lrq0/c1;->d:Lrq0/h1;

    iget-object v3, p0, Lrq0/c1;->c:Lcom/whoop/ui/ScoreContext;

    invoke-virtual {v2, v3}, Lrq0/h1;->w0(Lcom/whoop/ui/ScoreContext;)V

    iget-object v2, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v2}, Lrq0/h1;->f0()I

    move-result v2

    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/i1;->notifyItemRangeChanged(II)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public e(Lrq0/d1;I)V
    .locals 12

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lrq0/d1;->f()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    if-ltz p2, :cond_4

    invoke-super {p0}, Lib/p;->getItemCount()I

    move-result v0

    if-lt p2, v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0, p2}, Lib/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/teams/LeadersEntry;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/LeadersEntry;->toTeamUserListing()Lcom/whoop/domain/model/teams/TeamUserListing;

    move-result-object v6

    if-eqz v6, :cond_2

    iget-object v0, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v0}, Lrq0/h1;->c0()Lcom/whoop/domain/model/teams/Team;

    move-result-object v7

    if-eqz v7, :cond_2

    iget-object v2, p0, Lrq0/c1;->c:Lcom/whoop/ui/ScoreContext;

    iget-object v0, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v0}, Lrq0/h1;->d0()Lcom/whoop/community/domain/model/teams/TimePeriod;

    move-result-object v3

    iget-object v0, p0, Lrq0/c1;->d:Lrq0/h1;

    iget-object v1, p0, Lrq0/c1;->c:Lcom/whoop/ui/ScoreContext;

    invoke-virtual {v0, v1}, Lrq0/h1;->Z(Lcom/whoop/ui/ScoreContext;)Lrq0/v0;

    move-result-object v4

    invoke-virtual {v6}, Lcom/whoop/domain/model/teams/TeamUserListing;->getRank()I

    move-result v5

    iget-object v0, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v0}, Lrq0/h1;->X()Lcom/whoop/community/domain/model/teams/TimePeriod;

    move-result-object v8

    iget-object v0, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v0}, Lrq0/h1;->W()Lorg/joda/time/LocalDate;

    move-result-object v9

    iget-object v10, p0, Lrq0/c1;->e:Lcom/whoop/data/repositories/FeatureFlagRepository;

    iget-object v11, p0, Lrq0/c1;->f:Lkotlin/jvm/functions/Function1;

    move-object v1, p1

    invoke-virtual/range {v1 .. v11}, Lrq0/d1;->b(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;Lrq0/v0;ILcom/whoop/domain/model/teams/TeamUserListing;Lcom/whoop/domain/model/teams/Team;Lcom/whoop/community/domain/model/teams/TimePeriod;Lorg/joda/time/LocalDate;Lcom/whoop/data/repositories/FeatureFlagRepository;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_2
    move-object v1, p1

    :goto_0
    iget-object p1, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {p1}, Lrq0/h1;->X()Lcom/whoop/community/domain/model/teams/TimePeriod;

    move-result-object p1

    sget-object v0, Lcom/whoop/community/domain/model/teams/TimePeriod;->DAILY:Lcom/whoop/community/domain/model/teams/TimePeriod;

    if-eq p1, v0, :cond_4

    iget-object p1, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {p1}, Lrq0/h1;->g0()I

    move-result p1

    iget-object v0, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v0}, Lrq0/h1;->V()Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lrq0/c1;->c:Lcom/whoop/ui/ScoreContext;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {p1}, Lrq0/h1;->g0()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-ne p2, p1, :cond_4

    iget-object p1, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {p1}, Lrq0/h1;->f0()I

    move-result p1

    const/4 p2, 0x2

    if-lt p1, p2, :cond_4

    iget-object p1, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {p1}, Lrq0/h1;->e0()I

    move-result p1

    const/16 p2, 0xa

    if-lt p1, p2, :cond_4

    invoke-virtual {v1}, Lrq0/d1;->d()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {v1}, Lrq0/d1;->d()Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lxp0/d0;->e0:I

    iget-object v2, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v2}, Lrq0/h1;->f0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lrq0/d1;->e()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {v1}, Lrq0/d1;->e()Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lxp0/d0;->C:I

    iget-object v2, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v2}, Lrq0/h1;->f0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lrq0/d1;->f()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1}, Lrq0/d1;->f()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    new-instance p2, Ljo/j;

    const/16 v0, 0xf

    invoke-direct {p2, p0, v0}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public g(Landroid/view/ViewGroup;I)Lrq0/d1;
    .locals 6

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrq0/d1;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const-string p2, "from(...)"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lrq0/d1;-><init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public getItemCount()I
    .locals 4

    invoke-super {p0}, Lib/p;->getItemCount()I

    move-result v0

    iget-object v1, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v1}, Lrq0/h1;->V()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lrq0/c1;->c:Lcom/whoop/ui/ScoreContext;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lrq0/c1;->d:Lrq0/h1;

    invoke-virtual {v2}, Lrq0/h1;->X()Lcom/whoop/community/domain/model/teams/TimePeriod;

    move-result-object v2

    sget-object v3, Lcom/whoop/community/domain/model/teams/TimePeriod;->DAILY:Lcom/whoop/community/domain/model/teams/TimePeriod;

    if-eq v2, v3, :cond_1

    if-lez v1, :cond_1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_1
    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    check-cast p1, Lrq0/d1;

    invoke-virtual {p0, p1, p2}, Lrq0/c1;->e(Lrq0/d1;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lrq0/c1;->g(Landroid/view/ViewGroup;I)Lrq0/d1;

    move-result-object p1

    return-object p1
.end method
