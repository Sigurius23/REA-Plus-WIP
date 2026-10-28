.class public final Lcom/whoop/core/details/view/CoreDetailsFragment$c;
.super Lg/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/core/details/view/CoreDetailsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
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
        "com/whoop/core/details/view/CoreDetailsFragment$c",
        "Lg/t;",
        "Ll83/a0;",
        "d",
        "()V",
        "core-details_release"
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
.field final synthetic d:Lcom/whoop/core/details/view/CoreDetailsFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/core/details/view/CoreDetailsFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/core/details/view/CoreDetailsFragment$c;->d:Lcom/whoop/core/details/view/CoreDetailsFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/core/details/view/CoreDetailsFragment$c;->d:Lcom/whoop/core/details/view/CoreDetailsFragment;

    invoke-static {v0}, Lcom/whoop/core/details/view/CoreDetailsFragment;->C(Lcom/whoop/core/details/view/CoreDetailsFragment;)Lhw0/c;

    move-result-object v0

    new-instance v1, Lcom/whoop/core/details/view/b$b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Lcom/whoop/core/details/view/b$b;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lhw0/c;->p(Lcom/whoop/core/details/view/b;)Lbc3/k1;

    return-void
.end method
