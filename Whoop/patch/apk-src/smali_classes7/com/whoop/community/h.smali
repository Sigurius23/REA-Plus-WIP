.class public final synthetic Lcom/whoop/community/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final synthetic w:Lcom/whoop/community/CommunityPendingInviteFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityPendingInviteFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/community/h;->w:Lcom/whoop/community/CommunityPendingInviteFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/h;->w:Lcom/whoop/community/CommunityPendingInviteFragment;

    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityPendingInviteFragment$a;->f(Lcom/whoop/community/CommunityPendingInviteFragment;Lcom/whoop/data/remote/commons/Resource;)V

    return-void
.end method
