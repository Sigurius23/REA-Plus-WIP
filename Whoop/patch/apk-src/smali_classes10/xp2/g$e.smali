.class final Lxp2/g$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxp2/g;->f(Lvp2/a$j;Leb/a0;Landroidx/fragment/app/r0;Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.universalcheckout.features.shippingmethod.view.ShippingMethodScreenKt$ShippingMethodScreen$1$1"
    f = "ShippingMethodScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;

.field final synthetic y:Lvp2/a$j;

.field final synthetic z:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;Lvp2/a$j;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;",
            "Lvp2/a$j;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lxp2/g$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxp2/g$e;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;

    iput-object p2, p0, Lxp2/g$e;->y:Lvp2/a$j;

    iput-object p3, p0, Lxp2/g$e;->z:Ll83/h;

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

    new-instance p1, Lxp2/g$e;

    iget-object v0, p0, Lxp2/g$e;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;

    iget-object v1, p0, Lxp2/g$e;->y:Lvp2/a$j;

    iget-object v2, p0, Lxp2/g$e;->z:Ll83/h;

    invoke-direct {p1, v0, v1, v2, p2}, Lxp2/g$e;-><init>(Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;Lvp2/a$j;Ll83/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lxp2/g$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxp2/g$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxp2/g$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxp2/g$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lxp2/g$e;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lxp2/g$e;->z:Ll83/h;

    invoke-static {p1}, Lxp2/g;->r(Ll83/h;)Lvp2/b;

    move-result-object p1

    new-instance v0, Lvp2/a$h;

    iget-object v1, p0, Lxp2/g$e;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lxp2/g$e;->y:Lvp2/a$j;

    invoke-virtual {v2}, Lvp2/a$j;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lvp2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lvp2/b;->n(Lvp2/a$l;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
