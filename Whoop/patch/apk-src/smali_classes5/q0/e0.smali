.class public final Lq0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/o1;


# instance fields
.field public final a:Lh0/p3;

.field public final b:Lq0/y;


# direct methods
.method public constructor <init>(Lh0/p3;Lq0/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/e0;->a:Lh0/p3;

    iput-object p2, p0, Lq0/e0;->b:Lq0/y;

    return-void
.end method


# virtual methods
.method public final a(Lh0/k2;FLq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lq0/d0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lq0/d0;

    iget v1, v0, Lq0/d0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq0/d0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq0/d0;

    check-cast p3, Ls83/c;

    invoke-direct {v0, p0, p3}, Lq0/d0;-><init>(Lq0/e0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lq0/d0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq0/d0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Lpf/b;

    invoke-direct {p3, p0, p1}, Lpf/b;-><init>(Lq0/e0;Lh0/k2;)V

    iput v3, v0, Lq0/d0;->y:I

    iget-object v2, p0, Lq0/e0;->a:Lh0/p3;

    check-cast v2, Li0/g;

    invoke-virtual {v2, p1, p2, p3, v0}, Li0/g;->d(Lh0/k2;FLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p2, p0, Lq0/e0;->b:Lq0/y;

    iget-object p3, p2, Lq0/y;->d:Ll9/o;

    iget-object v0, p2, Lq0/y;->d:Ll9/o;

    iget-object p3, p3, Ll9/o;->d:Ljava/lang/Object;

    check-cast p3, Lp1/g1;

    invoke-virtual {p3}, Lp1/g1;->x()F

    move-result p3

    const/4 v1, 0x0

    cmpg-float p3, p3, v1

    if-nez p3, :cond_4

    goto :goto_2

    :cond_4
    iget-object p3, v0, Ll9/o;->d:Ljava/lang/Object;

    check-cast p3, Lp1/g1;

    invoke-virtual {p3}, Lp1/g1;->x()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    float-to-double v2, p3

    const-wide v4, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double p3, v2, v4

    if-gez p3, :cond_6

    invoke-virtual {p2}, Lq0/y;->k()I

    move-result p3

    iget-object v0, p2, Lq0/y;->k:Lh0/d0;

    invoke-virtual {v0}, Lh0/d0;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p2, Lq0/y;->p:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/q;

    iget-object v0, v0, Lq0/q;->s:Lbc3/c0;

    new-instance v2, Lq0/m;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v2, p2, v3, v4}, Lq0/m;-><init>(Lq0/y;ILq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v4, v4, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_5
    const/4 v0, 0x0

    invoke-virtual {p2, v1, p3, v0}, Lq0/y;->w(FIZ)V

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p2, v0, Ll9/o;->d:Ljava/lang/Object;

    check-cast p2, Lp1/g1;

    invoke-virtual {p2}, Lp1/g1;->x()F

    move-result p2

    new-instance p3, Ljava/lang/Float;

    invoke-direct {p3, p2}, Ljava/lang/Float;-><init>(F)V

    :goto_3
    new-instance p2, Ljava/lang/Float;

    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    return-object p2
.end method
