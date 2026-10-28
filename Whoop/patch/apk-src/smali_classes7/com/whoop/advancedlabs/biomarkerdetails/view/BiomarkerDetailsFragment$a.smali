.class final Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
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
    c = "com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment$onCreateView$1$1$1"
    f = "BiomarkerDetailsFragment.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;->x:Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;

    iget-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;->x:Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;-><init>(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;->x:Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;

    invoke-static {p1}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->G(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;->x:Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->H(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Lbb0/c;

    move-result-object v0

    new-instance v1, Lbb0/b$b;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3, v2, v3}, Lbb0/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lbb0/c;->p(Lbb0/b;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
