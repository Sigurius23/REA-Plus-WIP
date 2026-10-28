.class final Lv41/q0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/q0;->h(Landroidx/compose/ui/Modifier;Lqi/i;Lv41/r0;Ljava/lang/String;Ljava/util/Map;FZLjava/util/Map;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.design.atomic.organism.WhoopLottieOverrideViewKt$StaticLottieContent$1$1$1"
    f = "WhoopLottieOverrideView.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lqi/i;

.field final synthetic y:Z

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqi/i;ZLkotlin/jvm/functions/Function1;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqi/i;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lv41/q0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/q0$a;->x:Lqi/i;

    iput-boolean p2, p0, Lv41/q0$a;->y:Z

    iput-object p3, p0, Lv41/q0$a;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lv41/q0$a;->E:Lp1/t2;

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

    new-instance v0, Lv41/q0$a;

    iget-object v1, p0, Lv41/q0$a;->x:Lqi/i;

    iget-boolean v2, p0, Lv41/q0$a;->y:Z

    iget-object v3, p0, Lv41/q0$a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lv41/q0$a;->E:Lp1/t2;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lv41/q0$a;-><init>(Lqi/i;ZLkotlin/jvm/functions/Function1;Lp1/t2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lv41/q0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/q0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/q0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/q0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lv41/q0$a;->w:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lv41/q0$a;->x:Lqi/i;

    if-nez p1, :cond_0

    sget-object p1, Lv41/s;->LOADING:Lv41/s;

    goto :goto_1

    :cond_0
    iget-boolean p1, p0, Lv41/q0$a;->y:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lv41/q0$a;->E:Lp1/t2;

    invoke-static {p1}, Lv41/q0;->z(Lp1/t2;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lv41/s;->READY:Lv41/s;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object p1, Lv41/s;->UNCOLORED:Lv41/s;

    :goto_1
    iget-object v0, p0, Lv41/q0$a;->z:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
