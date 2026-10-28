.class final La81/o$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La81/o;->T(Lcom/whoop/design/models/modal/BottomSheet;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.modal.GenericModalKt$RenderBottomSheet$2$1"
    f = "GenericModal.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lbc3/c0;

.field final synthetic y:Lcom/whoop/design/models/modal/BottomSheet;

.field final synthetic z:Ll1/w3;


# direct methods
.method public constructor <init>(Lbc3/c0;Lcom/whoop/design/models/modal/BottomSheet;Ll1/w3;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lcom/whoop/design/models/modal/BottomSheet;",
            "Ll1/w3;",
            "Lq83/d<",
            "-",
            "La81/o$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La81/o$b;->x:Lbc3/c0;

    iput-object p2, p0, La81/o$b;->y:Lcom/whoop/design/models/modal/BottomSheet;

    iput-object p3, p0, La81/o$b;->z:Ll1/w3;

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

    new-instance p1, La81/o$b;

    iget-object v0, p0, La81/o$b;->x:Lbc3/c0;

    iget-object v1, p0, La81/o$b;->y:Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v2, p0, La81/o$b;->z:Ll1/w3;

    invoke-direct {p1, v0, v1, v2, p2}, La81/o$b;-><init>(Lbc3/c0;Lcom/whoop/design/models/modal/BottomSheet;Ll1/w3;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, La81/o$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La81/o$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La81/o$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La81/o$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, La81/o$b;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La81/o$b;->x:Lbc3/c0;

    new-instance v0, La81/o$b$a;

    iget-object v1, p0, La81/o$b;->y:Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v2, p0, La81/o$b;->z:Ll1/w3;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, La81/o$b$a;-><init>(Lcom/whoop/design/models/modal/BottomSheet;Ll1/w3;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
