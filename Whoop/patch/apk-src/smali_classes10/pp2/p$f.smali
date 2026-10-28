.class final Lpp2/p$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpp2/p;->h(Lnp2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.universalcheckout.features.shippingaddress.view.ShippingAddressScreenKt$ShippingAddressScreen$5$1"
    f = "ShippingAddressScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lg1/y3;

.field final synthetic y:Lnp2/c;

.field final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lg1/y3;Lnp2/c;Lbc3/c0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/y3;",
            "Lnp2/c;",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lpp2/p$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpp2/p$f;->x:Lg1/y3;

    iput-object p2, p0, Lpp2/p$f;->y:Lnp2/c;

    iput-object p3, p0, Lpp2/p$f;->z:Lbc3/c0;

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

    new-instance p1, Lpp2/p$f;

    iget-object v0, p0, Lpp2/p$f;->x:Lg1/y3;

    iget-object v1, p0, Lpp2/p$f;->y:Lnp2/c;

    iget-object v2, p0, Lpp2/p$f;->z:Lbc3/c0;

    invoke-direct {p1, v0, v1, v2, p2}, Lpp2/p$f;-><init>(Lg1/y3;Lnp2/c;Lbc3/c0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lpp2/p$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpp2/p$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpp2/p$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpp2/p$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lpp2/p$f;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lpp2/p$f;->x:Lg1/y3;

    invoke-virtual {p1}, Lg1/y3;->e()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lpp2/p$f;->y:Lnp2/c;

    invoke-virtual {p1}, Lnp2/c;->d()Lnp2/c$a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpp2/p$f;->z:Lbc3/c0;

    new-instance v0, Lpp2/p$f$a;

    iget-object v1, p0, Lpp2/p$f;->x:Lg1/y3;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpp2/p$f$a;-><init>(Lg1/y3;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
