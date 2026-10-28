.class public final Lvh/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/k;


# instance fields
.field public final a:Lsh/q;

.field public final b:Lfi/o;

.field public final c:Z


# direct methods
.method public constructor <init>(Lsh/q;Lfi/o;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvh/d;->a:Lsh/q;

    iput-object p2, p0, Lvh/d;->b:Lfi/o;

    iput-boolean p3, p0, Lvh/d;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lvh/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lvh/b;

    iget v1, v0, Lvh/b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvh/b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvh/b;

    check-cast p1, Ls83/c;

    invoke-direct {v0, p0, p1}, Lvh/b;-><init>(Lvh/d;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lvh/b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvh/b;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lvh/b;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lvh/b;->x:Lkotlin/jvm/internal/b0;

    iget-object v4, v0, Lvh/b;->w:Ljava/lang/Object;

    check-cast v4, Lvh/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/b0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lui0/q;

    const/16 v5, 0xf

    invoke-direct {v2, v5, p0, p1}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p0, v0, Lvh/b;->w:Ljava/lang/Object;

    iput-object p1, v0, Lvh/b;->x:Lkotlin/jvm/internal/b0;

    iput v4, v0, Lvh/b;->E:I

    invoke-static {v2, v0}, Lbc3/f0;->G(Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v2

    move-object v2, p1

    move-object p1, v4

    move-object v4, p0

    :goto_1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    iput-object v2, v0, Lvh/b;->w:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, Lvh/b;->x:Lkotlin/jvm/internal/b0;

    iput v3, v0, Lvh/b;->E:I

    invoke-virtual {v4, p1, v0}, Lvh/d;->b(Landroid/graphics/drawable/Drawable;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, v2

    :goto_3
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object p1

    iget-boolean v0, v0, Lkotlin/jvm/internal/b0;->w:Z

    new-instance v1, Lsh/i;

    invoke-direct {v1, p1, v0}, Lsh/i;-><init>(Lrh/j;Z)V

    return-object v1
.end method

.method public final b(Landroid/graphics/drawable/Drawable;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lvh/c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvh/c;

    iget v1, v0, Lvh/c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvh/c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvh/c;

    invoke-direct {v0, p0, p2}, Lvh/c;-><init>(Lvh/d;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lvh/c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvh/c;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvh/c;->x:Landroid/graphics/drawable/AnimatedImageDrawable;

    iget-object v0, v0, Lvh/c;->w:Lvh/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Landroid/graphics/drawable/AnimatedImageDrawable;

    if-nez p2, :cond_3

    return-object p1

    :cond_3
    iget-object p2, p0, Lvh/d;->b:Lfi/o;

    sget-object v2, Lvh/f;->a:Lf93/a;

    invoke-static {p2, v2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    const/4 v5, -0x2

    if-eq v4, v5, :cond_4

    move-object v4, p1

    check-cast v4, Landroid/graphics/drawable/AnimatedImageDrawable;

    invoke-static {p2, v2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/graphics/drawable/AnimatedImageDrawable;->setRepeatCount(I)V

    :cond_4
    sget-object v2, Lvh/f;->c:Lf93/a;

    invoke-static {p2, v2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lc93/a;

    sget-object v2, Lvh/f;->d:Lf93/a;

    invoke-static {p2, v2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p2

    move-object v7, p2

    check-cast v7, Lc93/a;

    if-nez v6, :cond_6

    if-eqz v7, :cond_5

    goto :goto_1

    :cond_5
    move-object v0, p0

    goto :goto_2

    :cond_6
    :goto_1
    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    sget-object p2, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {p2}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p2

    new-instance v4, Lay/u;

    const/4 v8, 0x0

    const/16 v9, 0x18

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p0, v0, Lvh/c;->w:Lvh/d;

    move-object p1, v5

    check-cast p1, Landroid/graphics/drawable/AnimatedImageDrawable;

    iput-object p1, v0, Lvh/c;->x:Landroid/graphics/drawable/AnimatedImageDrawable;

    iput v3, v0, Lvh/c;->E:I

    invoke-static {p2, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object v0, p0

    move-object p1, v5

    :goto_2
    new-instance p2, Lgi/h;

    iget-object v0, v0, Lvh/d;->b:Lfi/o;

    iget-object v0, v0, Lfi/o;->c:Lgi/g;

    invoke-direct {p2, p1, v0}, Lgi/h;-><init>(Landroid/graphics/drawable/Drawable;Lgi/g;)V

    return-object p2
.end method
