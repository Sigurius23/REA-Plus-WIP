.class final Lv41/q0$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/q0;->l(Landroidx/compose/ui/Modifier;Lv41/r0;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IZLjava/lang/Float;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;III)V
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
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lp1/r1;",
        "",
        "",
        "Landroid/graphics/Typeface;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lp1/r1;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.WhoopLottieOverrideViewKt$WhoopLottieOverrideView$fontMap$2$1"
    f = "WhoopLottieOverrideView.kt"
    l = {
        0x6a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lv41/r0;

.field final synthetic F:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLv41/r0;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lv41/r0;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lv41/q0$e;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lv41/q0$e;->z:Z

    iput-object p2, p0, Lv41/q0$e;->E:Lv41/r0;

    iput-object p3, p0, Lv41/q0$e;->F:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lv41/q0$e;

    iget-boolean v1, p0, Lv41/q0$e;->z:Z

    iget-object v2, p0, Lv41/q0$e;->E:Lv41/r0;

    iget-object v3, p0, Lv41/q0$e;->F:Lc93/a;

    invoke-direct {v0, v1, v2, v3, p2}, Lv41/q0$e;-><init>(ZLv41/r0;Lc93/a;Lq83/d;)V

    iput-object p1, v0, Lv41/q0$e;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lp1/r1;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/r1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lv41/q0$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/q0$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/q0$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp1/r1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/q0$e;->f(Lp1/r1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lv41/q0$e;->y:Ljava/lang/Object;

    check-cast v0, Lp1/r1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lv41/q0$e;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lv41/q0$e;->w:Ljava/lang/Object;

    check-cast v0, Lp1/r1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lv41/q0$e;->z:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lv41/q0$e;->E:Lv41/r0;

    iget-object v2, p0, Lv41/q0$e;->F:Lc93/a;

    const/4 v4, 0x0

    iput-object v4, p0, Lv41/q0$e;->y:Ljava/lang/Object;

    iput-object v0, p0, Lv41/q0$e;->w:Ljava/lang/Object;

    iput v3, p0, Lv41/q0$e;->x:I

    invoke-static {p1, v2, p0}, Lv41/q0;->I(Lv41/r0;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/Map;

    goto :goto_1

    :cond_3
    sget-object p1, Lm83/z;->w:Lm83/z;

    :goto_1
    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
