.class final Lfn0/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn0/a;->b(Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;)V
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
    c = "com.whoop.cdm.CompanionDeviceInteractorRedesignImpl$associateCompanionDevice$1"
    f = "CompanionDeviceInteractorRedesignImpl.kt"
    l = {
        0x53
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lfn0/a;

.field final synthetic y:Lfn0/a$c;


# direct methods
.method public constructor <init>(Lfn0/a;Lfn0/a$c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn0/a;",
            "Lfn0/a$c;",
            "Lq83/d<",
            "-",
            "Lfn0/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfn0/a$b;->x:Lfn0/a;

    iput-object p2, p0, Lfn0/a$b;->y:Lfn0/a$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lfn0/a$b;

    iget-object v0, p0, Lfn0/a$b;->x:Lfn0/a;

    iget-object v1, p0, Lfn0/a$b;->y:Lfn0/a$c;

    invoke-direct {p1, v0, v1, p2}, Lfn0/a$b;-><init>(Lfn0/a;Lfn0/a$c;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lfn0/a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfn0/a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfn0/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfn0/a$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfn0/a$b;->w:I

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

    iput v2, p0, Lfn0/a$b;->w:I

    const-wide/16 v1, 0x1388

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lfn0/a$b;->x:Lfn0/a;

    invoke-static {p1}, Lfn0/a;->d(Lfn0/a;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "CDM: Companion Device Manager Timed Out"

    invoke-interface {p1, v1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lfn0/a$b;->y:Lfn0/a$c;

    const-string v0, "Companion Device Manager Timed Out"

    invoke-virtual {p1, v0}, Lfn0/a$c;->onFailure(Ljava/lang/CharSequence;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
