.class public final Lcom/whoop/community/CommunityFragment$e;
.super Lg/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/CommunityFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/whoop/community/CommunityFragment$e",
        "Lg/t;",
        "Ll83/a0;",
        "d",
        "()V",
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
.field final synthetic d:Lcom/whoop/community/CommunityFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/community/CommunityFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/community/CommunityFragment$e;->d:Lcom/whoop/community/CommunityFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$e;->d:Lcom/whoop/community/CommunityFragment;

    invoke-static {v0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    sget v1, Lxp0/a0;->H0:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Leb/a0;->A(IZ)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Leb/a0;->z()Z

    :cond_0
    return-void
.end method
