.class final Lmr1/j$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmr1/j;->f(Leb/a0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchScreenKt$UniversalCheckoutDataFetchScreen$2$1"
    f = "UniversalCheckoutDataFetchScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Leb/a0;

.field final synthetic y:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic z:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Leb/a0;Lp1/t2;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/a0;",
            "Lp1/t2;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lmr1/j$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmr1/j$b;->x:Leb/a0;

    iput-object p2, p0, Lmr1/j$b;->y:Lp1/t2;

    iput-object p3, p0, Lmr1/j$b;->z:Ll83/h;

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

    new-instance p1, Lmr1/j$b;

    iget-object v0, p0, Lmr1/j$b;->x:Leb/a0;

    iget-object v1, p0, Lmr1/j$b;->y:Lp1/t2;

    iget-object v2, p0, Lmr1/j$b;->z:Ll83/h;

    invoke-direct {p1, v0, v1, v2, p2}, Lmr1/j$b;-><init>(Leb/a0;Lp1/t2;Ll83/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lmr1/j$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmr1/j$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmr1/j$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmr1/j$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lmr1/j$b;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmr1/j$b;->y:Lp1/t2;

    invoke-static {p1}, Lmr1/j;->o(Lp1/t2;)Lmr1/l;

    move-result-object p1

    invoke-virtual {p1}, Lmr1/l;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lmr1/j$b;->y:Lp1/t2;

    invoke-static {p1}, Lmr1/j;->o(Lp1/t2;)Lmr1/l;

    move-result-object p1

    invoke-virtual {p1}, Lmr1/l;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lmr1/j$b;->y:Lp1/t2;

    invoke-static {p1}, Lmr1/j;->o(Lp1/t2;)Lmr1/l;

    move-result-object p1

    invoke-virtual {p1}, Lmr1/l;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Leb/x0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, v3

    move v7, v3

    move v8, v3

    move v9, v3

    invoke-direct/range {v0 .. v9}, Leb/x0;-><init>(ZZIZZIIII)V

    iget-object v1, p0, Lmr1/j$b;->x:Leb/a0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android-app://com.whoop/UniversalCheckout?path=/commerce-service/v2/mobile/carts&payload={\"cart_items\":[{\"sku\":\"810114362662\",\"quantity\":1},{\"sku\":\"ALBL1-OTP-12M-STA\",\"quantity\":1}]}&source=debug&cartId="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Leb/a0;->r(Landroid/net/Uri;Leb/x0;)V

    iget-object p1, p0, Lmr1/j$b;->z:Ll83/h;

    invoke-static {p1}, Lmr1/j;->n(Ll83/h;)Lmr1/k;

    move-result-object p1

    sget-object v0, Lmr1/d$a$c;->a:Lmr1/d$a$c;

    invoke-virtual {p1, v0}, Lmr1/k;->n(Lmr1/d$a;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
