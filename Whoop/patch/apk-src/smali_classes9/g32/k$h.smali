.class final Lg32/k$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg32/k;->D(Lg32/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ly00/o4;",
        "paymentMethod",
        "",
        "postalCode",
        "Lh20/e;",
        "<anonymous>",
        "(Ly00/o4;Ljava/lang/String;)Lh20/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.payments.stripebottomsheettile.view.StripeBottomSheetTileKt$StripeBottomSheetTile$presentPaymentSheet$1$1"
    f = "StripeBottomSheetTile.kt"
    l = {
        0x6d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lg32/m;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Le32/e;


# direct methods
.method public constructor <init>(Le32/e;Lg32/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le32/e;",
            "Lg32/m;",
            "Lq83/d<",
            "-",
            "Lg32/k$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lg32/k$h;->z:Le32/e;

    iput-object p2, p0, Lg32/k$h;->E:Lg32/m;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ly00/o4;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly00/o4;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lh20/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lg32/k$h;

    iget-object v1, p0, Lg32/k$h;->z:Le32/e;

    iget-object v2, p0, Lg32/k$h;->E:Lg32/m;

    invoke-direct {v0, v1, v2, p3}, Lg32/k$h;-><init>(Le32/e;Lg32/m;Lq83/d;)V

    iput-object p1, v0, Lg32/k$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Lg32/k$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lg32/k$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly00/o4;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lg32/k$h;->f(Ly00/o4;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lg32/k$h;->x:Ljava/lang/Object;

    check-cast v0, Ly00/o4;

    iget-object v1, p0, Lg32/k$h;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lg32/k$h;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg32/k$h;->z:Le32/e;

    iget-object v3, p0, Lg32/k$h;->E:Lg32/m;

    invoke-virtual {v3}, Lg32/m;->d()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    iput-object v5, p0, Lg32/k$h;->x:Ljava/lang/Object;

    iput-object v5, p0, Lg32/k$h;->y:Ljava/lang/Object;

    iput v4, p0, Lg32/k$h;->w:I

    invoke-virtual {p1, v0, v1, v3, p0}, Le32/e;->o(Ly00/o4;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    return-object p1
.end method
