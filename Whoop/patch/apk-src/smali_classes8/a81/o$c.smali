.class final La81/o$c;
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
    c = "com.whoop.design.atomic.organism.modal.GenericModalKt$RenderBottomSheet$3$1$1"
    f = "GenericModal.kt"
    l = {
        0xe0
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic F:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Ll1/w3;

.field final synthetic y:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

.field final synthetic z:Lfi0/a;


# direct methods
.method public constructor <init>(Ll1/w3;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/w3;",
            "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;",
            "Lfi0/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "La81/o$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La81/o$c;->x:Ll1/w3;

    iput-object p2, p0, La81/o$c;->y:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iput-object p3, p0, La81/o$c;->z:Lfi0/a;

    iput-object p4, p0, La81/o$c;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La81/o$c;->F:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, La81/o$c;

    iget-object v1, p0, La81/o$c;->x:Ll1/w3;

    iget-object v2, p0, La81/o$c;->y:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iget-object v3, p0, La81/o$c;->z:Lfi0/a;

    iget-object v4, p0, La81/o$c;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, La81/o$c;->F:Lc93/a;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, La81/o$c;-><init>(Ll1/w3;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, La81/o$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La81/o$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La81/o$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La81/o$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La81/o$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La81/o$c;->x:Ll1/w3;

    iput v2, p0, La81/o$c;->w:I

    invoke-virtual {p1, p0}, Ll1/w3;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, La81/o$c;->y:Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iget-object v0, p0, La81/o$c;->z:Lfi0/a;

    iget-object v1, p0, La81/o$c;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, La81/o$c;->F:Lc93/a;

    invoke-static {p1, v0, v1, v2}, La81/o;->c0(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
