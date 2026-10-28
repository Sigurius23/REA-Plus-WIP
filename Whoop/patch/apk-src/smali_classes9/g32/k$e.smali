.class final Lg32/k$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
    c = "com.whoop.payments.stripebottomsheettile.view.StripeBottomSheetTileKt$StripeBottomSheetTile$4$1"
    f = "StripeBottomSheetTile.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lg32/l;

.field final synthetic y:Le32/e;

.field final synthetic z:Lg32/m;


# direct methods
.method public constructor <init>(Lg32/l;Le32/e;Lg32/m;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg32/l;",
            "Le32/e;",
            "Lg32/m;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lg32/k$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lg32/k$e;->x:Lg32/l;

    iput-object p2, p0, Lg32/k$e;->y:Le32/e;

    iput-object p3, p0, Lg32/k$e;->z:Lg32/m;

    iput-object p4, p0, Lg32/k$e;->E:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lg32/k$e;

    iget-object v1, p0, Lg32/k$e;->x:Lg32/l;

    iget-object v2, p0, Lg32/k$e;->y:Le32/e;

    iget-object v3, p0, Lg32/k$e;->z:Lg32/m;

    iget-object v4, p0, Lg32/k$e;->E:Lc93/a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lg32/k$e;-><init>(Lg32/l;Le32/e;Lg32/m;Lc93/a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lg32/k$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg32/k$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg32/k$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg32/k$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lg32/k$e;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg32/k$e;->x:Lg32/l;

    invoke-virtual {p1}, Lg32/l;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lg32/k$e;->y:Le32/e;

    iget-object v0, p0, Lg32/k$e;->z:Lg32/m;

    invoke-virtual {v0}, Lg32/m;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le32/e;->p(Ljava/lang/String;)V

    iget-object p1, p0, Lg32/k$e;->E:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
