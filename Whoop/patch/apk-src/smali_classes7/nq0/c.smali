.class public final Lnq0/c;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0007\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010!R\u0014\u0010$\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001eR\u0014\u0010&\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010!R\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u001eR\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lnq0/c;",
        "Landroidx/recyclerview/widget/o2;",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "isFloating",
        "<init>",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V",
        "",
        "memberCount",
        "",
        "d",
        "(I)Ljava/lang/String;",
        "Lcom/whoop/domain/model/teams/FeatureTeam;",
        "team",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onClick",
        "b",
        "(Lcom/whoop/domain/model/teams/FeatureTeam;Lkotlin/jvm/functions/Function1;)V",
        "a",
        "Z",
        "()Z",
        "Lde/hdodenhof/circleimageview/CircleImageView;",
        "Lde/hdodenhof/circleimageview/CircleImageView;",
        "teamIcon",
        "Landroid/widget/TextView;",
        "c",
        "Landroid/widget/TextView;",
        "teamName",
        "Landroid/widget/ImageView;",
        "Landroid/widget/ImageView;",
        "teamBanner",
        "e",
        "teamMemberCount",
        "f",
        "featureTeamBanner",
        "g",
        "featureTeamBannerText",
        "Landroidx/cardview/widget/CardView;",
        "h",
        "Landroidx/cardview/widget/CardView;",
        "parentLayout",
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
.field private final a:Z

.field private final b:Lde/hdodenhof/circleimageview/CircleImageView;

.field private final c:Landroid/widget/TextView;

.field private final d:Landroid/widget/ImageView;

.field private final e:Landroid/widget/TextView;

.field private final f:Landroid/widget/ImageView;

.field private final g:Landroid/widget/TextView;

.field private final h:Landroidx/cardview/widget/CardView;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V
    .locals 2

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget v0, Lxp0/b0;->r:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-boolean p3, p0, Lnq0/c;->a:Z

    .line 4
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p2, Lxp0/a0;->M0:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lde/hdodenhof/circleimageview/CircleImageView;

    iput-object p1, p0, Lnq0/c;->b:Lde/hdodenhof/circleimageview/CircleImageView;

    .line 5
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->P0:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lnq0/c;->c:Landroid/widget/TextView;

    .line 6
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->L0:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnq0/c;->d:Landroid/widget/ImageView;

    .line 7
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->O0:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lnq0/c;->e:Landroid/widget/TextView;

    .line 8
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->w2:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnq0/c;->f:Landroid/widget/ImageView;

    .line 9
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->x2:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lnq0/c;->g:Landroid/widget/TextView;

    .line 10
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->N0:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/cardview/widget/CardView;

    iput-object p1, p0, Lnq0/c;->h:Landroidx/cardview/widget/CardView;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lnq0/c;-><init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/FeatureTeam;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lnq0/c;->c(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/FeatureTeam;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/FeatureTeam;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final d(I)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lnq0/c;->h:Landroidx/cardview/widget/CardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lxp0/c0;->b:I

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v2}, Ljava/text/NumberFormat;->getNumberInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getQuantityString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final b(Lcom/whoop/domain/model/teams/FeatureTeam;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/teams/FeatureTeam;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "team"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/FeatureTeam;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v0

    sget-object v1, Lgl/k;->b:Lgl/k;

    new-instance v2, Lgl/r;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lpl/a;->n(Lgl/k;Lgl/d;Z)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    sget-object v1, Lzk/k;->b:Lzk/k;

    invoke-virtual {v0, v1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    sget v2, Lvu1/c;->n:I

    invoke-virtual {v0, v2}, Lpl/a;->j(I)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    iget-object v2, p0, Lnq0/c;->b:Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/FeatureTeam;->getBannerUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v0

    invoke-virtual {v0, v1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    sget v1, Lvu1/c;->n:I

    invoke-virtual {v0, v1}, Lpl/a;->j(I)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    iget-object v1, p0, Lnq0/c;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    iget-object v0, p0, Lnq0/c;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/FeatureTeam;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnq0/c;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/FeatureTeam;->getMemberCount()I

    move-result v1

    invoke-direct {p0, v1}, Lnq0/c;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnq0/c;->h:Landroidx/cardview/widget/CardView;

    new-instance v1, Llq0/d;

    const/16 v2, 0x1c

    invoke-direct {v1, v2, p2, p1}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p0, Lnq0/c;->f:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/FeatureTeam;->getShowBadge()Z

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p2, p0, Lnq0/c;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/FeatureTeam;->getShowBadge()Z

    move-result p1

    if-eqz p1, :cond_1

    move v1, v2

    :cond_1
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
