.class final Lh01/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh01/f;->e(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.molecule.card.notification.NotificationCardCounterKt$CardCounter$3$1"
    f = "NotificationCardCounter.kt"
    l = {
        0x57,
        0x5d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Z

.field final synthetic y:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic z:F


# direct methods
.method public constructor <init>(ZLd0/e;FLc93/a;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ld0/e;",
            "F",
            "Lc93/a;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lh01/f$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lh01/f$a;->x:Z

    iput-object p2, p0, Lh01/f$a;->y:Ld0/e;

    iput p3, p0, Lh01/f$a;->z:F

    iput-object p4, p0, Lh01/f$a;->E:Lc93/a;

    iput-object p5, p0, Lh01/f$a;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lh01/f$a;

    iget-boolean v1, p0, Lh01/f$a;->x:Z

    iget-object v2, p0, Lh01/f$a;->y:Ld0/e;

    iget v3, p0, Lh01/f$a;->z:F

    iget-object v4, p0, Lh01/f$a;->E:Lc93/a;

    iget-object v5, p0, Lh01/f$a;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lh01/f$a;-><init>(ZLd0/e;FLc93/a;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lh01/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh01/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh01/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh01/f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh01/f$a;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lh01/f$a;->x:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lh01/f$a;->F:Lp1/c1;

    invoke-static {p1, v4}, Lh01/f;->o(Lp1/c1;Z)V

    iget-object v5, p0, Lh01/f$a;->y:Ld0/e;

    iget p1, p0, Lh01/f$a;->z:F

    new-instance v6, Ljava/lang/Float;

    invoke-direct {v6, p1}, Ljava/lang/Float;-><init>(F)V

    const/16 p1, 0x3e8

    const/4 v1, 0x6

    const/4 v7, 0x0

    invoke-static {p1, v2, v7, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v7

    iput v4, p0, Lh01/f$a;->w:I

    const/4 v8, 0x0

    const/16 v10, 0xc

    move-object v9, p0

    invoke-static/range {v5 .. v10}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, v9, Lh01/f$a;->F:Lp1/c1;

    invoke-static {p1, v2}, Lh01/f;->o(Lp1/c1;Z)V

    iget-object p1, v9, Lh01/f$a;->E:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object p1, v9, Lh01/f$a;->y:Ld0/e;

    iget v1, v9, Lh01/f$a;->z:F

    neg-float v1, v1

    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    iput v3, v9, Lh01/f$a;->w:I

    invoke-virtual {p1, v2, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    move-object v9, p0

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
