.class public final Lcom/whoop/add/activity/view/AddActivityFragment$b;
.super Lg/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/add/activity/view/AddActivityFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
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
        "com/whoop/add/activity/view/AddActivityFragment$b",
        "Lg/t;",
        "Ll83/a0;",
        "d",
        "()V",
        "add-activity_release"
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
.field final synthetic d:Lcom/whoop/add/activity/view/AddActivityFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/add/activity/view/AddActivityFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/add/activity/view/AddActivityFragment$b;->d:Lcom/whoop/add/activity/view/AddActivityFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/add/activity/view/AddActivityFragment$b;->d:Lcom/whoop/add/activity/view/AddActivityFragment;

    invoke-static {v0}, Lcom/whoop/add/activity/view/AddActivityFragment;->I(Lcom/whoop/add/activity/view/AddActivityFragment;)Lda0/c;

    move-result-object v0

    new-instance v1, Lda0/b$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lda0/b$b;-><init>(Z)V

    invoke-virtual {v0, v1}, Lda0/c;->u(Lda0/b;)Lbc3/k1;

    return-void
.end method
