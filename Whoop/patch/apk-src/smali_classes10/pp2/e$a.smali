.class final Lpp2/e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpp2/e;->i(Lnp2/c$a;Lg1/y3;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.universalcheckout.features.shippingaddress.view.ShippingAddressBottomSheetKt$ShippingAddressBottomSheet$1$1"
    f = "ShippingAddressBottomSheet.kt"
    l = {
        0x30
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lnp2/c$a;

.field final synthetic F:Lbc3/c0;

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic H:Lg1/y3;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnp2/c$a;Lbc3/c0;Lp1/c1;Lg1/y3;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp2/c$a;",
            "Lbc3/c0;",
            "Lp1/c1;",
            "Lg1/y3;",
            "Lq83/d<",
            "-",
            "Lpp2/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpp2/e$a;->E:Lnp2/c$a;

    iput-object p2, p0, Lpp2/e$a;->F:Lbc3/c0;

    iput-object p3, p0, Lpp2/e$a;->G:Lp1/c1;

    iput-object p4, p0, Lpp2/e$a;->H:Lg1/y3;

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

    new-instance v0, Lpp2/e$a;

    iget-object v1, p0, Lpp2/e$a;->E:Lnp2/c$a;

    iget-object v2, p0, Lpp2/e$a;->F:Lbc3/c0;

    iget-object v3, p0, Lpp2/e$a;->G:Lp1/c1;

    iget-object v4, p0, Lpp2/e$a;->H:Lg1/y3;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lpp2/e$a;-><init>(Lnp2/c$a;Lbc3/c0;Lp1/c1;Lg1/y3;Lq83/d;)V

    iput-object p1, v0, Lpp2/e$a;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lpp2/e$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpp2/e$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpp2/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpp2/e$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpp2/e$a;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpp2/e$a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lpp2/e$a;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lpp2/e$a;->E:Lnp2/c$a;

    const/4 v1, 0x0

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lpp2/e$a;->F:Lbc3/c0;

    iget-object v0, p0, Lpp2/e$a;->G:Lp1/c1;

    iget-object v2, p0, Lpp2/e$a;->H:Lg1/y3;

    invoke-static {v0, v1}, Lpp2/e;->y(Lp1/c1;Z)V

    new-instance v0, Lpp2/e$a$a;

    invoke-direct {v0, v2, v3}, Lpp2/e$a$a;-><init>(Lg1/y3;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lpp2/e$a;->H:Lg1/y3;

    iput-object v3, p0, Lpp2/e$a;->z:Ljava/lang/Object;

    iput-object v3, p0, Lpp2/e$a;->w:Ljava/lang/Object;

    iput v1, p0, Lpp2/e$a;->x:I

    iput v2, p0, Lpp2/e$a;->y:I

    invoke-virtual {p1, p0}, Lg1/y3;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
