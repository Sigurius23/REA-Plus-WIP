.class final Lq81/g$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq81/g;->E(Landroidx/compose/ui/Modifier;Landroidx/lifecycle/g0;Ll3/v0;Lb91/a;Lq81/h;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.weightliftingtimer.WeightliftingTimerKt$WeightliftingTimer$2$1$1"
    f = "WeightliftingTimer.kt"
    l = {
        0xcf
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

.field final synthetic F:Lq81/h;

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field x:I

.field y:F

.field z:I


# direct methods
.method public constructor <init>(Ld0/e;Lq81/h;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/e;",
            "Lq81/h;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lq81/g$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lq81/g$h;->E:Ld0/e;

    iput-object p2, p0, Lq81/g$h;->F:Lq81/h;

    iput-object p3, p0, Lq81/g$h;->G:Lp1/c1;

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

    new-instance p1, Lq81/g$h;

    iget-object v0, p0, Lq81/g$h;->E:Ld0/e;

    iget-object v1, p0, Lq81/g$h;->F:Lq81/h;

    iget-object v2, p0, Lq81/g$h;->G:Lp1/c1;

    invoke-direct {p1, v0, v1, v2, p2}, Lq81/g$h;-><init>(Ld0/e;Lq81/h;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lq81/g$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq81/g$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq81/g$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lq81/g$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq81/g$h;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lq81/g$h;->E:Ld0/e;

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v1

    if-gez p1, :cond_3

    iget-object p1, p0, Lq81/g$h;->F:Lq81/h;

    invoke-virtual {p1}, Lq81/h;->c()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v3, p0, Lq81/g$h;->E:Ld0/e;

    iget-object v4, p0, Lq81/g$h;->G:Lp1/c1;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-float v5, v2

    invoke-static {v4}, Lq81/g;->M(Lp1/c1;)Ljava/lang/Float;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    goto :goto_0

    :cond_2
    move v4, v1

    :goto_0
    sub-float/2addr v5, v4

    new-instance v4, Ljava/lang/Float;

    invoke-direct {v4, v1}, Ljava/lang/Float;-><init>(F)V

    mul-int/lit16 v1, p1, 0x3e8

    int-to-float v1, v1

    mul-float/2addr v1, v5

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    sget-object v6, Ld0/b0;->c:Lb23/h;

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v1, v8, v6, v7}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    iput p1, p0, Lq81/g$h;->w:I

    iput v8, p0, Lq81/g$h;->x:I

    iput v5, p0, Lq81/g$h;->y:F

    iput v2, p0, Lq81/g$h;->z:I

    const/4 v6, 0x0

    const/16 v8, 0xc

    move-object v7, p0

    move-object v5, v1

    invoke-static/range {v3 .. v8}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
