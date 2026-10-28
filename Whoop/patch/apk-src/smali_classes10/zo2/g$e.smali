.class final Lzo2/g$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo2/g;->g(Lxo2/a$d;Leb/a0;Leb/a0;Landroidx/fragment/app/r0;Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.universalcheckout.features.externalwebcheckout.view.ExternalWebCheckoutScreenKt$ExternalWebCheckoutScreen$1$1"
    f = "ExternalWebCheckoutScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lxo2/a$d;

.field final synthetic y:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;

.field final synthetic z:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxo2/a$d;Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;Ll83/h;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo2/a$d;",
            "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;",
            "Ll83/h;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lzo2/g$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzo2/g$e;->x:Lxo2/a$d;

    iput-object p2, p0, Lzo2/g$e;->y:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;

    iput-object p3, p0, Lzo2/g$e;->z:Ll83/h;

    iput-object p4, p0, Lzo2/g$e;->E:Ll83/h;

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

    new-instance v0, Lzo2/g$e;

    iget-object v1, p0, Lzo2/g$e;->x:Lxo2/a$d;

    iget-object v2, p0, Lzo2/g$e;->y:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;

    iget-object v3, p0, Lzo2/g$e;->z:Ll83/h;

    iget-object v4, p0, Lzo2/g$e;->E:Ll83/h;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lzo2/g$e;-><init>(Lxo2/a$d;Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;Ll83/h;Ll83/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lzo2/g$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzo2/g$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzo2/g$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzo2/g$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lzo2/g$e;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzo2/g$e;->z:Ll83/h;

    invoke-static {p1}, Lzo2/g;->u(Ll83/h;)Lwo2/a;

    move-result-object p1

    iget-object v0, p0, Lzo2/g$e;->x:Lxo2/a$d;

    invoke-virtual {p1, v0}, Lwo2/a;->a(Lxo2/a;)Lxo2/a;

    iget-object p1, p0, Lzo2/g$e;->E:Ll83/h;

    invoke-static {p1}, Lzo2/g;->t(Ll83/h;)Lxo2/b;

    move-result-object p1

    new-instance v0, Lxo2/a$e;

    iget-object v1, p0, Lzo2/g$e;->y:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lxo2/a$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lxo2/b;->n(Lxo2/a$j;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
