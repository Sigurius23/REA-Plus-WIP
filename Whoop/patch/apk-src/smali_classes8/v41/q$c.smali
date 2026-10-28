.class final Lv41/q$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/q;->e(Ljava/lang/String;Lud3/l0;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "",
        "Landroid/graphics/Typeface;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.LottieJsonCache$fontMap$2"
    f = "LottieJsonCache.kt"
    l = {
        0x7f,
        0x80
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lud3/l0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lud3/l0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lud3/l0;",
            "Lq83/d<",
            "-",
            "Lv41/q$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/q$c;->y:Ljava/lang/String;

    iput-object p2, p0, Lv41/q$c;->z:Lud3/l0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lv41/q$c;

    iget-object v1, p0, Lv41/q$c;->y:Ljava/lang/String;

    iget-object v2, p0, Lv41/q$c;->z:Lud3/l0;

    invoke-direct {v0, v1, v2, p1}, Lv41/q$c;-><init>(Ljava/lang/String;Lud3/l0;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lv41/q$c;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Landroid/graphics/Typeface;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lv41/q$c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/q$c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lv41/q$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lv41/q$c;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lv41/q$c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lv41/q;->a:Lv41/q;

    iget-object v1, p0, Lv41/q$c;->y:Ljava/lang/String;

    iget-object v4, p0, Lv41/q$c;->z:Lud3/l0;

    iput v3, p0, Lv41/q$c;->x:I

    invoke-virtual {p1, v1, v4, p0}, Lv41/q;->j(Ljava/lang/String;Lud3/l0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-nez p1, :cond_4

    return-object v1

    :cond_4
    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    new-instance v4, Lv41/q$c$a;

    invoke-direct {v4, p1, v1}, Lv41/q$c$a;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v1, p0, Lv41/q$c;->w:Ljava/lang/Object;

    iput v2, p0, Lv41/q$c;->x:I

    invoke-static {v3, v4, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    return-object p1
.end method
