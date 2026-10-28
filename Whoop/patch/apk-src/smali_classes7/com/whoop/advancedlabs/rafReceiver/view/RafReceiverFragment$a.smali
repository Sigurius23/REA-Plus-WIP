.class final Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment$onCreateView$1$1$1"
    f = "RafReceiverFragment.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->x:Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;

    iput-object p2, p0, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->y:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;

    iget-object v0, p0, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->x:Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;

    iget-object v1, p0, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->y:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;-><init>(Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->x:Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;

    invoke-static {p1}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;->D(Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;)Lrd0/b;

    move-result-object p1

    new-instance v0, Lrd0/a$b;

    iget-object v1, p0, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment$a;->y:Ljava/lang/String;

    invoke-direct {v0, v1}, Lrd0/a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lrd0/b;->n(Lrd0/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
