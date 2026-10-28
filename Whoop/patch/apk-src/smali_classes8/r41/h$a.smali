.class final Lr41/h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr41/h;->o(Lr41/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.molecule.weightliftingset.WeightliftingSetKt$WeightliftingSet$2$2$10$1$1"
    f = "WeightliftingSet.kt"
    l = {
        0x153,
        0x15a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field w:I

.field x:I

.field final synthetic y:Lr41/i;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr41/i;Lp1/c1;Ld0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr41/i;",
            "Lp1/c1;",
            "Ld0/e;",
            "Lq83/d<",
            "-",
            "Lr41/h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr41/h$a;->y:Lr41/i;

    iput-object p2, p0, Lr41/h$a;->z:Lp1/c1;

    iput-object p3, p0, Lr41/h$a;->E:Ld0/e;

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

    new-instance p1, Lr41/h$a;

    iget-object v0, p0, Lr41/h$a;->y:Lr41/i;

    iget-object v1, p0, Lr41/h$a;->z:Lp1/c1;

    iget-object v2, p0, Lr41/h$a;->E:Ld0/e;

    invoke-direct {p1, v0, v1, v2, p2}, Lr41/h$a;-><init>(Lr41/i;Lp1/c1;Ld0/e;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lr41/h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lr41/h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lr41/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lr41/h$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lr41/h$a;->x:I

    const/4 v7, 0x4

    const v8, 0x44bb8000    # 1500.0f

    const/high16 v9, 0x3f000000    # 0.5f

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v11, 0x2

    const/4 v1, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v11, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lr41/h$a;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lr41/h$a;->y:Lr41/i;

    invoke-virtual {v0}, Lr41/i;->j()Z

    move-result v0

    iget-object v2, p0, Lr41/h$a;->z:Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eq v0, v2, :cond_3

    move v13, v1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    move v13, v0

    :goto_0
    iget-object v0, p0, Lr41/h$a;->z:Lp1/c1;

    iget-object v2, p0, Lr41/h$a;->y:Lr41/i;

    invoke-virtual {v2}, Lr41/i;->j()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    if-eqz v13, :cond_5

    iget-object v0, p0, Lr41/h$a;->E:Ld0/e;

    invoke-virtual {v0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    cmpg-float v0, v0, v10

    if-nez v0, :cond_5

    iget-object v0, p0, Lr41/h$a;->E:Ld0/e;

    invoke-virtual {v0}, Ld0/e;->f()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lr41/h$a;->E:Ld0/e;

    new-instance v2, Ljava/lang/Float;

    const v3, 0x3fa66666    # 1.3f

    invoke-direct {v2, v3}, Ljava/lang/Float;-><init>(F)V

    move-object v3, v2

    invoke-static {v9, v8, v7, v12}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v2

    iput v13, p0, Lr41/h$a;->w:I

    iput v1, p0, Lr41/h$a;->x:I

    move-object v1, v3

    const/4 v3, 0x0

    const/16 v5, 0xc

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_4

    goto :goto_2

    :cond_4
    move v0, v13

    :goto_1
    iget-object v1, p0, Lr41/h$a;->E:Ld0/e;

    move-object v2, v1

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v10}, Ljava/lang/Float;-><init>(F)V

    invoke-static {v9, v8, v7, v12}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v3

    iput v0, p0, Lr41/h$a;->w:I

    iput v11, p0, Lr41/h$a;->x:I

    move-object v0, v2

    move-object v2, v3

    const/4 v3, 0x0

    const/16 v5, 0xc

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_5

    :goto_2
    return-object v6

    :cond_5
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
