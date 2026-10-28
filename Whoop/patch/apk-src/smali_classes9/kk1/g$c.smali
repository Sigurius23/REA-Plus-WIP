.class final Lkk1/g$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkk1/g;->q0(Lik1/d;Lik1/h$c;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.healthspan.view.HealthspanSuccessScreenKt$UnlockedHealthspanContent$3$1"
    f = "HealthspanSuccessScreen.kt"
    l = {
        0xd3
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field w:F

.field x:I

.field y:I

.field final synthetic z:Lik1/d;


# direct methods
.method public constructor <init>(Lik1/d;ZLd0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lik1/d;",
            "Z",
            "Ld0/e;",
            "Lq83/d<",
            "-",
            "Lkk1/g$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkk1/g$c;->z:Lik1/d;

    iput-boolean p2, p0, Lkk1/g$c;->E:Z

    iput-object p3, p0, Lkk1/g$c;->F:Ld0/e;

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

    new-instance p1, Lkk1/g$c;

    iget-object v0, p0, Lkk1/g$c;->z:Lik1/d;

    iget-boolean v1, p0, Lkk1/g$c;->E:Z

    iget-object v2, p0, Lkk1/g$c;->F:Ld0/e;

    invoke-direct {p1, v0, v1, v2, p2}, Lkk1/g$c;-><init>(Lik1/d;ZLd0/e;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lkk1/g$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkk1/g$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkk1/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkk1/g$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkk1/g$c;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkk1/g$c;->z:Lik1/d;

    invoke-virtual {p1}, Lik1/d;->e()Lik1/c;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lkk1/g$c;->E:Z

    if-eqz p1, :cond_2

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lkk1/g$c;->z:Lik1/d;

    invoke-virtual {v1}, Lik1/d;->e()Lik1/c;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lkk1/g$c;->E:Z

    if-eqz v1, :cond_3

    move v1, v3

    goto :goto_1

    :cond_3
    const/16 v1, 0x1f4

    :goto_1
    iget-object v4, p0, Lkk1/g$c;->F:Ld0/e;

    new-instance v5, Ljava/lang/Float;

    invoke-direct {v5, p1}, Ljava/lang/Float;-><init>(F)V

    sget-object v6, Ld0/a0;->b:Ld0/v;

    const/4 v7, 0x2

    invoke-static {v1, v3, v6, v7}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v6

    iput p1, p0, Lkk1/g$c;->w:F

    iput v1, p0, Lkk1/g$c;->x:I

    iput v2, p0, Lkk1/g$c;->y:I

    const/4 v7, 0x0

    const/16 v9, 0xc

    move-object v8, p0

    invoke-static/range {v4 .. v9}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
