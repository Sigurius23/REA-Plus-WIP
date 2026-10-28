.class final Lto2/a$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lto2/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Leb/a0;Leb/a0;Landroidx/fragment/app/r0;Leb/q;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.universalcheckout.features.checkout.view.screens.UniversalCheckoutScreenKt$UniversalCheckoutScreen$2$1"
    f = "UniversalCheckoutScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Loo2/c;

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
.method public constructor <init>(Loo2/c;Lp1/t2;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo2/c;",
            "Lp1/t2;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lto2/a$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lto2/a$i;->x:Loo2/c;

    iput-object p2, p0, Lto2/a$i;->y:Lp1/t2;

    iput-object p3, p0, Lto2/a$i;->z:Ll83/h;

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

    new-instance p1, Lto2/a$i;

    iget-object v0, p0, Lto2/a$i;->x:Loo2/c;

    iget-object v1, p0, Lto2/a$i;->y:Lp1/t2;

    iget-object v2, p0, Lto2/a$i;->z:Ll83/h;

    invoke-direct {p1, v0, v1, v2, p2}, Lto2/a$i;-><init>(Loo2/c;Lp1/t2;Ll83/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lto2/a$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lto2/a$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lto2/a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lto2/a$i;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lto2/a$i;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lto2/a$i;->y:Lp1/t2;

    invoke-static {p1}, Lto2/a;->y(Lp1/t2;)Lpo2/c;

    move-result-object p1

    invoke-virtual {p1}, Lpo2/c;->d()Lj02/x0;

    move-result-object p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lto2/a$i;->y:Lp1/t2;

    invoke-static {v1}, Lto2/a;->y(Lp1/t2;)Lpo2/c;

    move-result-object v1

    invoke-virtual {v1}, Lpo2/c;->e()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lj02/x0;->SHIPPING_ADDRESS:Lj02/x0;

    if-ne p1, v2, :cond_1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lto2/a$i;->x:Loo2/c;

    new-instance v3, Lpo2/a$r;

    invoke-direct {v3, v1}, Lpo2/a$r;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Loo2/c;->d(Lpo2/a$s;)V

    :cond_1
    iget-object v1, p0, Lto2/a$i;->z:Ll83/h;

    invoke-static {v1}, Lto2/a;->x(Ll83/h;)Lpo2/b;

    move-result-object v1

    new-instance v2, Lpo2/a$n;

    invoke-direct {v2, p1}, Lpo2/a$n;-><init>(Lj02/x0;)V

    invoke-virtual {v1, v2}, Lpo2/b;->r(Lpo2/a$n0;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
