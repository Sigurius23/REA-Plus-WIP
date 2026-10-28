.class public final Lnq0/n;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lnq0/n;",
        "Landroidx/recyclerview/widget/o2;",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "isFloating",
        "<init>",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V",
        "Lcom/whoop/domain/model/teams/TeamInviteDto;",
        "teamInviteDto",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onClick",
        "b",
        "(Lcom/whoop/domain/model/teams/TeamInviteDto;Lkotlin/jvm/functions/Function1;)V",
        "Lde/hdodenhof/circleimageview/CircleImageView;",
        "a",
        "Lde/hdodenhof/circleimageview/CircleImageView;",
        "teamIcon",
        "sendUserIcon",
        "Landroid/widget/TextView;",
        "c",
        "Landroid/widget/TextView;",
        "inviteMessage",
        "d",
        "teamName",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "e",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "parentLayout",
        "Landroid/widget/ImageView;",
        "f",
        "Landroid/widget/ImageView;",
        "seenBadge",
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
.field private final a:Lde/hdodenhof/circleimageview/CircleImageView;

.field private final b:Lde/hdodenhof/circleimageview/CircleImageView;

.field private final c:Landroid/widget/TextView;

.field private final d:Landroid/widget/TextView;

.field private final e:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private final f:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget v0, Lxp0/b0;->u:I

    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    .line 4
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p2, Lxp0/a0;->n1:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lde/hdodenhof/circleimageview/CircleImageView;

    iput-object p1, p0, Lnq0/n;->a:Lde/hdodenhof/circleimageview/CircleImageView;

    .line 5
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->p1:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lde/hdodenhof/circleimageview/CircleImageView;

    iput-object p1, p0, Lnq0/n;->b:Lde/hdodenhof/circleimageview/CircleImageView;

    .line 6
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->k1:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lnq0/n;->c:Landroid/widget/TextView;

    .line 7
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->o1:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lnq0/n;->d:Landroid/widget/TextView;

    .line 8
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->R0:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, p0, Lnq0/n;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p3, Lxp0/a0;->m1:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lnq0/n;->f:Landroid/widget/ImageView;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lnq0/n;-><init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamInviteDto;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lnq0/n;->c(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamInviteDto;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamInviteDto;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/whoop/domain/model/teams/TeamInviteDto;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "teamInviteDto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getCommunity()Lcom/whoop/domain/model/teams/CommunityDto;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/CommunityDto;->getAvatar()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v0

    sget-object v1, Lzk/k;->b:Lzk/k;

    invoke-virtual {v0, v1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    sget v3, Lvu1/c;->n:I

    invoke-virtual {v0, v3}, Lpl/a;->j(I)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    iget-object v3, p0, Lnq0/n;->a:Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-virtual {v0, v3}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getSender()Lcom/whoop/domain/model/teams/CommunityMemberDto;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/whoop/domain/model/teams/CommunityMemberDto;->getAvatarUrl()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    invoke-virtual {v0, v3}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v0

    invoke-virtual {v0, v1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    sget v1, Lvu1/c;->n:I

    invoke-virtual {v0, v1}, Lpl/a;->j(I)Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    iget-object v1, p0, Lnq0/n;->b:Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    iget-object v0, p0, Lnq0/n;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getCommunity()Lcom/whoop/domain/model/teams/CommunityDto;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/CommunityDto;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lnq0/n;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v3, Lxp0/d0;->d0:I

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getSender()Lcom/whoop/domain/model/teams/CommunityMemberDto;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/whoop/domain/model/teams/CommunityMemberDto;->getName()Ljava/lang/String;

    move-result-object v2

    :cond_3
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getShowBadge()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnq0/n;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lnq0/n;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_3
    iget-object v0, p0, Lnq0/n;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v1, Lnq0/m;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p2, p1}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
