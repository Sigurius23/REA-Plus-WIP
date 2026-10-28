.class public final Lq0/w;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Ld0/l;

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lq0/y;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lq0/y;IFLd0/l;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lq0/w;->y:Lq0/y;

    iput p2, p0, Lq0/w;->z:I

    iput p3, p0, Lq0/w;->E:F

    iput-object p4, p0, Lq0/w;->F:Ld0/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lq0/w;

    iget v3, p0, Lq0/w;->E:F

    iget-object v4, p0, Lq0/w;->F:Ld0/l;

    iget-object v1, p0, Lq0/w;->y:Lq0/y;

    iget v2, p0, Lq0/w;->z:I

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lq0/w;-><init>(Lq0/y;IFLd0/l;Lq83/d;)V

    iput-object p1, v0, Lq0/w;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lq0/w;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq0/w;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq0/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq0/w;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lq0/w;->x:Ljava/lang/Object;

    check-cast p1, Lh0/k2;

    new-instance v1, Ln0/r;

    iget-object v4, p0, Lq0/w;->y:Lq0/y;

    invoke-direct {v1, p1, v4, v3}, Ln0/r;-><init>(Lh0/k2;Lh0/x2;I)V

    iput v3, p0, Lq0/w;->w:I

    sget p1, Lq0/c0;->a:F

    new-instance p1, Ljava/lang/Integer;

    iget v5, p0, Lq0/w;->z:I

    invoke-direct {p1, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v4, p1}, Lq0/y;->j(I)I

    move-result p1

    iget-object v6, v4, Lq0/y;->s:Lp1/h1;

    invoke-virtual {v6, p1}, Lp1/h1;->y(I)V

    iget p1, v4, Lq0/y;->e:I

    const/4 v6, 0x0

    if-le v5, p1, :cond_2

    move p1, v3

    goto :goto_0

    :cond_2
    move p1, v6

    :goto_0
    invoke-virtual {v1}, Ln0/r;->e()I

    move-result v7

    iget v8, v4, Lq0/y;->e:I

    sub-int/2addr v7, v8

    add-int/2addr v7, v3

    if-eqz p1, :cond_3

    invoke-virtual {v1}, Ln0/r;->e()I

    move-result v8

    if-gt v5, v8, :cond_4

    :cond_3
    if-nez p1, :cond_8

    iget v8, v4, Lq0/y;->e:I

    if-ge v5, v8, :cond_8

    :cond_4
    iget v8, v4, Lq0/y;->e:I

    sub-int v8, v5, v8

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    const/4 v9, 0x3

    if-lt v8, v9, :cond_8

    if-eqz p1, :cond_5

    sub-int p1, v5, v7

    iget v4, v4, Lq0/y;->e:I

    if-ge p1, v4, :cond_7

    move p1, v4

    goto :goto_1

    :cond_5
    add-int/2addr v7, v5

    iget p1, v4, Lq0/y;->e:I

    if-le v7, p1, :cond_6

    goto :goto_1

    :cond_6
    move p1, v7

    :cond_7
    :goto_1
    invoke-virtual {v1, p1, v6}, Ln0/r;->f(II)V

    :cond_8
    invoke-virtual {v1, v5}, Ln0/r;->b(I)I

    move-result p1

    int-to-float p1, p1

    iget v4, p0, Lq0/w;->E:F

    add-float v6, p1, v4

    new-instance p1, Lkotlin/jvm/internal/d0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lpp2/o;

    invoke-direct {v8, v3, p1, v1}, Lpp2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v10, 0x4

    const/4 v5, 0x0

    iget-object v7, p0, Lq0/w;->F:Ld0/l;

    move-object v9, p0

    invoke-static/range {v5 .. v10}, Ld0/f;->e(FFLd0/l;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_2

    :cond_9
    move-object p1, v2

    :goto_2
    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    return-object v2
.end method
