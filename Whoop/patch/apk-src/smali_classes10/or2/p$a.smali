.class final Lor2/p$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lor2/p;->a(Lm/m;Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;J)V
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
    c = "com.whoop.util.CompanionDeviceInteractorKt$associateCompanionDevice$1"
    f = "CompanionDeviceInteractor.kt"
    l = {
        0x71
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:J

.field final synthetic y:Ltr2/n;

.field final synthetic z:Landroid/companion/CompanionDeviceManager$Callback;


# direct methods
.method public constructor <init>(JLtr2/n;Landroid/companion/CompanionDeviceManager$Callback;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ltr2/n;",
            "Landroid/companion/CompanionDeviceManager$Callback;",
            "Lq83/d<",
            "-",
            "Lor2/p$a;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lor2/p$a;->x:J

    iput-object p3, p0, Lor2/p$a;->y:Ltr2/n;

    iput-object p4, p0, Lor2/p$a;->z:Landroid/companion/CompanionDeviceManager$Callback;

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

    new-instance v0, Lor2/p$a;

    iget-wide v1, p0, Lor2/p$a;->x:J

    iget-object v3, p0, Lor2/p$a;->y:Ltr2/n;

    iget-object v4, p0, Lor2/p$a;->z:Landroid/companion/CompanionDeviceManager$Callback;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lor2/p$a;-><init>(JLtr2/n;Landroid/companion/CompanionDeviceManager$Callback;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lor2/p$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lor2/p$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lor2/p$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lor2/p$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lor2/p$a;->w:I

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

    iget-wide v3, p0, Lor2/p$a;->x:J

    iput v2, p0, Lor2/p$a;->w:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lor2/p$a;->y:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Companion Device Manager Timed Out"

    invoke-interface {p1, v1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lor2/p$a;->z:Landroid/companion/CompanionDeviceManager$Callback;

    invoke-virtual {p1, v1}, Landroid/companion/CompanionDeviceManager$Callback;->onFailure(Ljava/lang/CharSequence;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
