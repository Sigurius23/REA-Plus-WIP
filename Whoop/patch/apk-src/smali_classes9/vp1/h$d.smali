.class final Lvp1/h$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvp1/h;->x0(Ltp1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.hormonalinsights.settings.view.HormonalSettingsScreenKt$HormonalSettingsScreen$11$1"
    f = "HormonalSettingsScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ltp1/o;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltp1/o;Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltp1/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lvp1/h$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvp1/h$d;->x:Ltp1/o;

    iput-object p2, p0, Lvp1/h$d;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lvp1/h$d;->z:Lp1/c1;

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

    new-instance p1, Lvp1/h$d;

    iget-object v0, p0, Lvp1/h$d;->x:Ltp1/o;

    iget-object v1, p0, Lvp1/h$d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lvp1/h$d;->z:Lp1/c1;

    invoke-direct {p1, v0, v1, v2, p2}, Lvp1/h$d;-><init>(Ltp1/o;Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvp1/h$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvp1/h$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvp1/h$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvp1/h$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lvp1/h$d;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvp1/h$d;->z:Lp1/c1;

    invoke-static {p1}, Lvp1/h;->U1(Lp1/c1;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvp1/h$d;->x:Ltp1/o;

    instance-of v1, p1, Ltp1/o$f;

    if-eqz v1, :cond_0

    check-cast p1, Ltp1/o$f;

    invoke-virtual {p1}, Ltp1/o$f;->a()Ltp1/j;

    move-result-object p1

    invoke-virtual {p1}, Ltp1/j;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvp1/h$d;->z:Lp1/c1;

    invoke-static {p1, v0}, Lvp1/h;->V1(Lp1/c1;Z)V

    iget-object p1, p0, Lvp1/h$d;->y:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lsp1/a$e;

    iget-object v1, p0, Lvp1/h$d;->x:Ltp1/o;

    check-cast v1, Ltp1/o$f;

    invoke-virtual {v1}, Ltp1/o$f;->a()Ltp1/j;

    move-result-object v1

    invoke-virtual {v1}, Ltp1/j;->b()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lsp1/a$e;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lvp1/h$d;->x:Ltp1/o;

    instance-of p1, p1, Ltp1/o$c;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lvp1/h$d;->z:Lp1/c1;

    invoke-static {p1, v0}, Lvp1/h;->V1(Lp1/c1;Z)V

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
