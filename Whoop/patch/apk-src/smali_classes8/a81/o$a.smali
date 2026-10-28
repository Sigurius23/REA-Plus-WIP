.class final La81/o$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La81/o;->P(Lcom/whoop/design/models/modal/AnyModal;Lkotlin/jvm/functions/Function1;Liy1/c;Lfi0/a;Lc93/a;Lc93/p;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.modal.GenericModalKt$GenericModal$2$1"
    f = "GenericModal.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/design/models/modal/AnyModal;

.field final synthetic y:Liy1/c;

.field final synthetic z:Lfi0/a;


# direct methods
.method public constructor <init>(Lcom/whoop/design/models/modal/AnyModal;Liy1/c;Lfi0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Liy1/c;",
            "Lfi0/a;",
            "Lq83/d<",
            "-",
            "La81/o$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La81/o$a;->x:Lcom/whoop/design/models/modal/AnyModal;

    iput-object p2, p0, La81/o$a;->y:Liy1/c;

    iput-object p3, p0, La81/o$a;->z:Lfi0/a;

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

    new-instance p1, La81/o$a;

    iget-object v0, p0, La81/o$a;->x:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v1, p0, La81/o$a;->y:Liy1/c;

    iget-object v2, p0, La81/o$a;->z:Lfi0/a;

    invoke-direct {p1, v0, v1, v2, p2}, La81/o$a;-><init>(Lcom/whoop/design/models/modal/AnyModal;Liy1/c;Lfi0/a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, La81/o$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La81/o$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La81/o$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La81/o$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, La81/o$a;->w:I

    if-nez v0, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La81/o$a;->x:Lcom/whoop/design/models/modal/AnyModal;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_6

    sget-object v1, Lcom/whoop/design/models/modal/ModalType;->Companion:Lcom/whoop/design/models/modal/ModalType$Companion;

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/whoop/design/models/modal/ModalType$Companion;->fromModal(Lcom/whoop/design/models/modal/Modal;)Lcom/whoop/design/models/modal/ModalType;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, La81/o$a;->x:Lcom/whoop/design/models/modal/AnyModal;

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/modal/DialogModel;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/whoop/design/models/modal/DialogModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DialogModel;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v2, v1, Lcom/whoop/design/models/modal/BottomSheet;

    if-eqz v2, :cond_2

    check-cast v1, Lcom/whoop/design/models/modal/BottomSheet;

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/BottomSheet;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of v2, v1, Lcom/whoop/design/models/modal/FullScreenContentModal;

    if-eqz v2, :cond_3

    check-cast v1, Lcom/whoop/design/models/modal/FullScreenContentModal;

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/FullScreenContentModal;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    instance-of v2, v1, Lcom/whoop/design/models/modal/ToastModal;

    if-eqz v2, :cond_4

    check-cast v1, Lcom/whoop/design/models/modal/ToastModal;

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/ToastModal;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_5

    return-object v0

    :cond_5
    iget-object v2, p0, La81/o$a;->y:Liy1/c;

    invoke-static {p1, v1, v2}, Lcom/whoop/design/models/modal/ModalTrackingKt;->trackModalPresentedMetric(Lcom/whoop/design/models/modal/ModalType;Ljava/lang/String;Liy1/c;)V

    iget-object p1, p0, La81/o$a;->x:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v1, p0, La81/o$a;->z:Lfi0/a;

    invoke-static {p1, v1}, Lcom/whoop/design/models/modal/ModalTrackingKt;->trackModalViewed(Lcom/whoop/design/models/modal/AnyModal;Lfi0/a;)V

    :cond_6
    return-object v0

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
