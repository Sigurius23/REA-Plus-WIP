.class final Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
    c = "com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$onCreateView$1$2$1"
    f = "UniversalBuyNowDialogFragment.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lwn2/i;

.field final synthetic y:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

.field final synthetic z:Landroid/view/View;


# direct methods
.method public constructor <init>(Lwn2/i;Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Landroid/view/View;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwn2/i;",
            "Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;",
            "Landroid/view/View;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->x:Lwn2/i;

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->y:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->z:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->x:Lwn2/i;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->y:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->z:Landroid/view/View;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;-><init>(Lwn2/i;Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Landroid/view/View;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->x:Lwn2/i;

    instance-of p1, p1, Lwn2/i$c;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->y:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->z:Landroid/view/View;

    invoke-static {p1, v0}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->J(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Landroid/view/View;)V

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->y:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    invoke-static {p1}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->G(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;)Lqn2/a;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$c;->x:Lwn2/i;

    check-cast v0, Lwn2/i$c;

    invoke-virtual {p1, v0}, Lqn2/a;->c(Lwn2/i$c;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
