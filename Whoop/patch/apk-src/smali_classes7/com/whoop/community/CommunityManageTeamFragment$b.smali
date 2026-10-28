.class public final Lcom/whoop/community/CommunityManageTeamFragment$b;
.super Lfc/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/CommunityManageTeamFragment;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/community/CommunityManageTeamFragment$b",
        "Lfc/k;",
        "",
        "position",
        "Ll83/a0;",
        "c",
        "(I)V",
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
.field final synthetic a:Lcom/whoop/community/CommunityManageTeamFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/community/CommunityManageTeamFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/community/CommunityManageTeamFragment$b;->a:Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/community/CommunityManageTeamFragment$b;->a:Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityManageTeamFragment;->b0(Lcom/whoop/community/CommunityManageTeamFragment;)Lrq0/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrq0/d;->x(I)I

    move-result p1

    iget-object v0, p0, Lcom/whoop/community/CommunityManageTeamFragment$b;->a:Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityManageTeamFragment;->c0(Lcom/whoop/community/CommunityManageTeamFragment;)Lrq0/b0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrq0/b0;->O(I)V

    iget-object v0, p0, Lcom/whoop/community/CommunityManageTeamFragment$b;->a:Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityManageTeamFragment;->c0(Lcom/whoop/community/CommunityManageTeamFragment;)Lrq0/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/community/CommunityManageTeamFragment$b;->a:Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-static {v1}, Lcom/whoop/community/CommunityManageTeamFragment;->b0(Lcom/whoop/community/CommunityManageTeamFragment;)Lrq0/d;

    move-result-object v1

    invoke-virtual {v1}, Lrq0/d;->v()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lrq0/b0;->P(I)V

    return-void
.end method
