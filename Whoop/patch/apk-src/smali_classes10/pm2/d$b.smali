.class final Lpm2/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpm2/d;->I(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lgt0/h;",
        "result",
        "Ll83/a0;",
        "<anonymous>",
        "(Lgt0/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapViewModel$checkForUpdate$1"
    f = "AdvancedStrapViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lpm2/d;


# direct methods
.method public constructor <init>(Lpm2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm2/d;",
            "Lq83/d<",
            "-",
            "Lpm2/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpm2/d$b;->y:Lpm2/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lpm2/d$b;

    iget-object v1, p0, Lpm2/d$b;->y:Lpm2/d;

    invoke-direct {v0, v1, p2}, Lpm2/d$b;-><init>(Lpm2/d;Lq83/d;)V

    iput-object p1, v0, Lpm2/d$b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lgt0/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgt0/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lpm2/d$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpm2/d$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpm2/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgt0/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpm2/d$b;->f(Lgt0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpm2/d$b;->x:Ljava/lang/Object;

    check-cast v0, Lgt0/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpm2/d$b;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lgt0/h$f;->b:Lgt0/h$f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpm2/d$b;->y:Lpm2/d;

    invoke-virtual {p1}, Lpm2/d;->V()Lor2/s0;

    move-result-object p1

    sget-object v0, Lpm2/g;->FIRMWARE_SHOW_UPDATE_DIALOG:Lpm2/g;

    invoke-virtual {p1, v0}, Lor2/s0;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lgt0/h$h;->b:Lgt0/h$h;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lpm2/d$b;->y:Lpm2/d;

    invoke-virtual {p1}, Lpm2/d;->V()Lor2/s0;

    move-result-object p1

    sget-object v0, Lpm2/g;->FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED:Lpm2/g;

    invoke-virtual {p1, v0}, Lor2/s0;->e(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
