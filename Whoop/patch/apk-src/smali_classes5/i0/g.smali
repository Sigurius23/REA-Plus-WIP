.class public final Li0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/p3;


# instance fields
.field public final a:Li0/l;

.field public final b:Ld0/x;

.field public final c:Ld0/l;

.field public final d:Lh0/m2;


# direct methods
.method public constructor <init>(Li0/l;Ld0/x;Ld0/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/g;->a:Li0/l;

    iput-object p2, p0, Li0/g;->b:Ld0/x;

    iput-object p3, p0, Li0/g;->c:Ld0/l;

    sget-object p1, Landroidx/compose/foundation/gestures/b;->c:Lh0/m2;

    iput-object p1, p0, Li0/g;->d:Lh0/m2;

    return-void
.end method

.method public static final b(Li0/g;Lh0/k2;FFLi0/d;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p5, Li0/f;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Li0/f;

    iget v1, v0, Li0/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li0/f;->y:I

    :goto_0
    move-object p5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Li0/f;

    invoke-direct {v0, p0, p5}, Li0/f;-><init>(Li0/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, p5, Li0/f;->w:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, p5, Li0/f;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_4

    :goto_2
    const/16 p0, 0x1c

    invoke-static {p2, p3, p0}, Ld0/f;->b(FFI)Ld0/m;

    move-result-object p0

    return-object p0

    :cond_4
    iput v2, p5, Li0/f;->y:I

    iget-object v0, p0, Li0/g;->b:Ld0/x;

    invoke-static {v0, v1, p3}, Ld0/f;->k(Ld0/x;FF)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_5

    new-instance p0, Lhm/d;

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    goto :goto_3

    :cond_5
    new-instance v0, Lhm/d;

    iget-object p0, p0, Li0/g;->c:Ld0/l;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    move-object p0, v0

    :goto_3
    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, p2}, Ljava/lang/Float;-><init>(F)V

    new-instance p2, Ljava/lang/Float;

    invoke-direct {p2, p3}, Ljava/lang/Float;-><init>(F)V

    iget p3, p0, Lhm/d;->w:I

    packed-switch p3, :pswitch_data_0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    const/4 p3, 0x0

    const/16 v0, 0x1c

    invoke-static {p3, p2, v0}, Ld0/f;->b(FFI)Ld0/m;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result p2

    mul-float v2, p2, p3

    iget-object p0, p0, Lhm/d;->x:Ljava/lang/Object;

    move-object v5, p0

    check-cast v5, Ld0/l;

    move-object v1, p1

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v1 .. v7}, Li0/k;->b(Lh0/k2;FFLd0/m;Ld0/l;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_6

    goto :goto_4

    :cond_6
    check-cast p0, Li0/a;

    :goto_4
    move-object v0, p0

    goto :goto_5

    :pswitch_0
    move-object v1, p1

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    const/4 p3, 0x0

    const/16 v0, 0x1c

    invoke-static {p3, p2, v0}, Ld0/f;->b(FFI)Ld0/m;

    move-result-object p2

    iget-object p0, p0, Lhm/d;->x:Ljava/lang/Object;

    move-object p3, p0

    check-cast p3, Ld0/x;

    move-object p0, v1

    invoke-static/range {p0 .. p5}, Li0/k;->a(Lh0/k2;FLd0/m;Ld0/x;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_7

    goto :goto_4

    :cond_7
    check-cast p0, Li0/a;

    goto :goto_4

    :goto_5
    if-ne v0, v8, :cond_8

    return-object v8

    :cond_8
    :goto_6
    check-cast v0, Li0/a;

    iget-object p0, v0, Li0/a;->b:Ld0/m;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final c(Lh0/k2;FLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Li0/c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Li0/c;

    iget v1, v0, Li0/c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li0/c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Li0/c;

    invoke-direct {v0, p0, p4}, Li0/c;-><init>(Li0/g;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Li0/c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Li0/c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p3, v0, Li0/c;->w:Lkotlin/jvm/functions/Function1;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Lh0/a0;

    const/4 v9, 0x0

    move-object v5, p0

    move-object v8, p1

    move v6, p2

    move-object v7, p3

    invoke-direct/range {v4 .. v9}, Lh0/a0;-><init>(Li0/g;FLkotlin/jvm/functions/Function1;Lh0/k2;Lq83/d;)V

    iput-object v7, v0, Li0/c;->w:Lkotlin/jvm/functions/Function1;

    iput v3, v0, Li0/c;->z:I

    iget-object p1, v5, Li0/g;->d:Lh0/m2;

    invoke-static {p1, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p3, v7

    :goto_1
    check-cast p4, Li0/a;

    new-instance p1, Ljava/lang/Float;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p4
.end method

.method public final d(Lh0/k2;FLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Li0/e;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Li0/e;

    iget v1, v0, Li0/e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li0/e;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Li0/e;

    invoke-direct {v0, p0, p4}, Li0/e;-><init>(Li0/g;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Li0/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Li0/e;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Li0/e;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Li0/g;->c(Lh0/k2;FLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Li0/a;

    iget-object p1, p4, Li0/a;->a:Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p2, p4, Li0/a;->b:Ld0/m;

    const/4 p3, 0x0

    cmpg-float p1, p1, p3

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Ld0/m;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p3

    :goto_2
    new-instance p1, Ljava/lang/Float;

    invoke-direct {p1, p3}, Ljava/lang/Float;-><init>(F)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Li0/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Li0/g;

    iget-object v0, p1, Li0/g;->c:Ld0/l;

    iget-object v2, p0, Li0/g;->c:Ld0/l;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Li0/g;->b:Ld0/x;

    iget-object v2, p0, Li0/g;->b:Ld0/x;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Li0/g;->a:Li0/l;

    iget-object v0, p0, Li0/g;->a:Li0/l;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Li0/g;->c:Ld0/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Li0/g;->b:Ld0/x;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Li0/g;->a:Li0/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
