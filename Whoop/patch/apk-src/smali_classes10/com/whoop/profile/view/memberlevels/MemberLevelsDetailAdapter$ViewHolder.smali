.class public final Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\r\u001a\u0004\u0008\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0013\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lcom/whoop/profile/databinding/ViewMemberLevelBinding;",
        "view",
        "<init>",
        "(Lcom/whoop/profile/databinding/ViewMemberLevelBinding;)V",
        "Landroid/widget/ImageView;",
        "badgeImageView",
        "Landroid/widget/ImageView;",
        "getBadgeImageView",
        "()Landroid/widget/ImageView;",
        "Landroid/widget/TextView;",
        "tier",
        "Landroid/widget/TextView;",
        "getTier",
        "()Landroid/widget/TextView;",
        "level",
        "getLevel",
        "description",
        "getDescription",
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
.field private final badgeImageView:Landroid/widget/ImageView;

.field private final description:Landroid/widget/TextView;

.field private final level:Landroid/widget/TextView;

.field private final tier:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/whoop/profile/databinding/ViewMemberLevelBinding;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iget-object v0, p1, Lcom/whoop/profile/databinding/ViewMemberLevelBinding;->levelBadge:Landroid/widget/ImageView;

    const-string v1, "levelBadge"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->badgeImageView:Landroid/widget/ImageView;

    iget-object v0, p1, Lcom/whoop/profile/databinding/ViewMemberLevelBinding;->tier:Landroid/widget/TextView;

    const-string v1, "tier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->tier:Landroid/widget/TextView;

    iget-object v0, p1, Lcom/whoop/profile/databinding/ViewMemberLevelBinding;->level:Landroid/widget/TextView;

    const-string v1, "level"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->level:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/whoop/profile/databinding/ViewMemberLevelBinding;->levelDescription:Landroid/widget/TextView;

    const-string v0, "levelDescription"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->description:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final getBadgeImageView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->badgeImageView:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getDescription()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->description:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getLevel()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->level:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTier()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/MemberLevelsDetailAdapter$ViewHolder;->tier:Landroid/widget/TextView;

    return-object v0
.end method
