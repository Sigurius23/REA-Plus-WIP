.class public final Lh40/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg1/y3;

.field public final b:Lh40/d;

.field public c:Lh40/g;


# direct methods
.method public constructor <init>(Lg1/y3;Lh40/d;)V
    .locals 1

    const-string v0, "modalBottomSheetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyboardHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh40/k;->a:Lg1/y3;

    iput-object p2, p0, Lh40/k;->b:Lh40/d;

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Enum;
    .locals 7

    instance-of v0, p1, Lh40/h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh40/h;

    iget v1, v0, Lh40/h;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh40/h;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh40/h;

    invoke-direct {v0, p0, p1}, Lh40/h;-><init>(Lh40/k;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lh40/h;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh40/h;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lh40/h;->w:Lh40/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lh40/f;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lh40/f;-><init>(Lh40/k;I)V

    invoke-static {p1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v2, Lh40/c;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct {v2, v4, v5, v6}, Lh40/c;-><init>(IILq83/d;)V

    iput-object p0, v0, Lh40/h;->w:Lh40/k;

    iput v3, v0, Lh40/h;->z:I

    invoke-static {p1, v2, v0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, Lh40/k;->c:Lh40/g;

    if-nez p1, :cond_4

    sget-object p1, Lh40/g;->x:Lh40/g;

    :cond_4
    return-object p1
.end method

.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lh40/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh40/i;

    iget v1, v0, Lh40/i;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh40/i;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh40/i;

    invoke-direct {v0, p0, p1}, Lh40/i;-><init>(Lh40/k;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lh40/i;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh40/i;->z:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lh40/i;->w:Lh40/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lh40/g;->w:Lh40/g;

    iput-object p1, p0, Lh40/k;->c:Lh40/g;

    iput-object p0, v0, Lh40/i;->w:Lh40/k;

    iput v3, v0, Lh40/i;->z:I

    iget-object p1, p0, Lh40/k;->b:Lh40/d;

    iget-object v2, p1, Lh40/d;->b:Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p1, Lh40/d;->a:Lb3/x2;

    if-eqz v2, :cond_4

    check-cast v2, Lb3/x1;

    invoke-virtual {v2}, Lb3/x1;->a()V

    :cond_4
    new-instance v2, Lh02/n0;

    const/4 v3, 0x5

    invoke-direct {v2, p1, v3}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v2, Lh40/c;

    const/4 v3, 0x0

    invoke-direct {v2, v5, v3, v4}, Lh40/c;-><init>(IILq83/d;)V

    invoke-static {p1, v2, v0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_1

    :cond_5
    move-object p1, v6

    :goto_1
    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    move-object p1, v6

    :goto_2
    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v2, p0

    :goto_3
    iget-object p1, v2, Lh40/k;->a:Lg1/y3;

    invoke-virtual {p1}, Lg1/y3;->e()Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p1, Lh00/f;

    const/4 v3, 0x1

    invoke-direct {p1, v2, v4, v3}, Lh00/f;-><init>(Lh40/k;Lq83/d;I)V

    iput-object v4, v0, Lh40/i;->w:Lh40/k;

    iput v5, v0, Lh40/i;->z:I

    const/16 v2, 0xa

    invoke-static {v2, p1, v0}, Lvd/e;->g(ILkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    return-object v6
.end method

.method public final c(Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lh40/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh40/j;

    iget v1, v0, Lh40/j;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh40/j;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh40/j;

    invoke-direct {v0, p0, p1}, Lh40/j;-><init>(Lh40/k;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lh40/j;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh40/j;->z:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lh40/j;->w:Lh40/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lh00/f;

    const/4 v2, 0x2

    invoke-direct {p1, p0, v4, v2}, Lh00/f;-><init>(Lh40/k;Lq83/d;I)V

    iput-object p0, v0, Lh40/j;->w:Lh40/k;

    iput v3, v0, Lh40/j;->z:I

    const/16 v2, 0xa

    invoke-static {v2, p1, v0}, Lvd/e;->g(ILkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    new-instance p1, Lh40/f;

    const/4 v3, 0x1

    invoke-direct {p1, v2, v3}, Lh40/f;-><init>(Lh40/k;I)V

    invoke-static {p1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v2, Lh40/c;

    const/4 v3, 0x2

    invoke-direct {v2, v5, v3, v4}, Lh40/c;-><init>(IILq83/d;)V

    iput-object v4, v0, Lh40/j;->w:Lh40/k;

    iput v5, v0, Lh40/j;->z:I

    invoke-static {p1, v2, v0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
