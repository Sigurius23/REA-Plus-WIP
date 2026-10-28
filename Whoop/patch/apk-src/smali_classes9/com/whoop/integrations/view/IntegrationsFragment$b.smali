.class public final Lcom/whoop/integrations/view/IntegrationsFragment$b;
.super Lg/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/integrations/view/IntegrationsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
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
        "com/whoop/integrations/view/IntegrationsFragment$b",
        "Lg/t;",
        "Ll83/a0;",
        "d",
        "()V",
        "integrations_release"
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
.field final synthetic d:Lfr1/d;

.field final synthetic e:Lcom/whoop/integrations/view/IntegrationsFragment;


# direct methods
.method public constructor <init>(Lfr1/d;Lcom/whoop/integrations/view/IntegrationsFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/integrations/view/IntegrationsFragment$b;->d:Lfr1/d;

    iput-object p2, p0, Lcom/whoop/integrations/view/IntegrationsFragment$b;->e:Lcom/whoop/integrations/view/IntegrationsFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/integrations/view/IntegrationsFragment$b;->d:Lfr1/d;

    new-instance v1, Lfr1/c$a;

    iget-object v2, p0, Lcom/whoop/integrations/view/IntegrationsFragment$b;->e:Lcom/whoop/integrations/view/IntegrationsFragment;

    invoke-static {v2}, Lcom/whoop/integrations/view/IntegrationsFragment;->I(Lcom/whoop/integrations/view/IntegrationsFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lfr1/c$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lfr1/d;->k(Lfr1/c;)V

    return-void
.end method
