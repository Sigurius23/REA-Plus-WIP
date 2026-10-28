.class public final Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/i1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R(\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;",
        "Landroidx/recyclerview/widget/i1;",
        "Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;",
        "<init>",
        "()V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;",
        "holder",
        "position",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;I)V",
        "getItemCount",
        "()I",
        "",
        "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
        "dataList",
        "Ljava/util/List;",
        "getDataList",
        "()Ljava/util/List;",
        "setDataList",
        "(Ljava/util/List;)V",
        "ViewHolder",
        "profile_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private dataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;->dataList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;->dataList:Ljava/util/List;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;->onBindViewHolder(Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;I)V
    .locals 6

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;->dataList:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;

    .line 4
    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v1

    .line 5
    invoke-virtual {p2}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getBadgeUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v1

    .line 6
    sget v2, Lcom/whoop/profile/R$drawable;->ic_placeholder_badge:I

    invoke-virtual {v1, v2}, Lpl/a;->j(I)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    .line 7
    sget v2, Lcom/whoop/profile/R$drawable;->ic_placeholder_badge:I

    invoke-virtual {v1, v2}, Lpl/a;->f(I)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    .line 8
    sget-object v2, Lzk/k;->b:Lzk/k;

    invoke-virtual {v1, v2}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    .line 9
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getBadgeImageView()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    .line 10
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getTier()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p2}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getTier()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "getDefault(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toUpperCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getLevel()Landroid/widget/TextView;

    move-result-object v1

    sget v2, Lcom/whoop/profile/R$string;->profile_level_title:I

    invoke-virtual {p2}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getLevelId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getDescription()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/whoop/profile/R$plurals;->membership_recoveries:I

    invoke-virtual {p2}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getLevelId()I

    move-result v4

    invoke-virtual {p2}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->getMinExperience()Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    invoke-virtual {p2}, Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;->isLocked()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getTier()Landroid/widget/TextView;

    move-result-object p2

    sget v1, Lvu1/a;->Q:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 15
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getLevel()Landroid/widget/TextView;

    move-result-object p2

    sget v1, Lvu1/a;->Q:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 16
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getDescription()Landroid/widget/TextView;

    move-result-object p1

    sget p2, Lvu1/a;->Q:I

    invoke-virtual {v0, p2}, Landroid/content/Context;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getTier()Landroid/widget/TextView;

    move-result-object p2

    sget v1, Lvu1/a;->Q:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 18
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getLevel()Landroid/widget/TextView;

    move-result-object p2

    sget v1, Lvu1/a;->c0:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 19
    invoke-virtual {p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->getDescription()Landroid/widget/TextView;

    move-result-object p1

    sget p2, Lvu1/a;->R:I

    invoke-virtual {v0, p2}, Landroid/content/Context;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;
    .locals 1

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    .line 3
    invoke-static {p2, p1, v0}, Lcom/whoop/profile/databinding/ViewMemberLevelBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/whoop/profile/databinding/ViewMemberLevelBinding;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance p2, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;

    invoke-direct {p2, p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;-><init>(Lcom/whoop/profile/databinding/ViewMemberLevelBinding;)V

    return-object p2
.end method

.method public final setDataList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;->dataList:Ljava/util/List;

    return-void
.end method
