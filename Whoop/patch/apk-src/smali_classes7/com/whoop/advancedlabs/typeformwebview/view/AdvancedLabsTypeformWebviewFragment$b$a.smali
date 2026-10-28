.class final Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lef0/a;",
        "navigationEvent",
        "Ll83/a0;",
        "<anonymous>",
        "(Lef0/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$onCreateView$1$2$1$1"
    f = "AdvancedLabsTypeformWebviewFragment.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;

.field final synthetic z:Lef0/c;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;Lef0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;",
            "Lef0/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->y:Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;

    iput-object p2, p0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->z:Lef0/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;

    iget-object v1, p0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->y:Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;

    iget-object v2, p0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->z:Lef0/c;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;-><init>(Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;Lef0/c;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lef0/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lef0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lef0/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->f(Lef0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->x:Ljava/lang/Object;

    check-cast v0, Lef0/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lef0/a$c;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->y:Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;->M(Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;Z)V

    :cond_0
    iget-object p1, p0, Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment$b$a;->z:Lef0/c;

    invoke-virtual {p1, v0}, Lef0/c;->a(Lef0/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
