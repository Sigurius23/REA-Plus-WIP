.class public final Leg/f;
.super Leg/o;
.source "SourceFile"


# static fields
.field public static final d:Lu00/e;


# instance fields
.field public final c:Leg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu00/e;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lu00/e;-><init>(I)V

    sput-object v0, Leg/f;->d:Lu00/e;

    return-void
.end method

.method public constructor <init>(Leg/b;)V
    .locals 0

    invoke-direct {p0, p1}, Leg/o;-><init>(Lae3/k;)V

    iput-object p1, p0, Leg/f;->c:Leg/b;

    return-void
.end method


# virtual methods
.method public final a(ILgg/e;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Leg/c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Leg/c;

    iget v1, v0, Leg/c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Leg/c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Leg/c;

    check-cast p3, Ls83/c;

    invoke-direct {v0, p0, p3}, Leg/c;-><init>(Leg/f;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Leg/c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Leg/c;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Leg/c;->w:I

    iget-object p2, v0, Leg/c;->x:Lgg/e;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p2, v0, Leg/c;->x:Lgg/e;

    iput p1, v0, Leg/c;->w:I

    iput v5, v0, Leg/c;->E:I

    if-ne v3, v1, :cond_4

    goto :goto_4

    :cond_4
    :goto_1
    instance-of p3, p2, Lgg/b;

    const/4 v2, 0x0

    if-eqz p3, :cond_5

    check-cast p2, Lgg/b;

    goto :goto_2

    :cond_5
    move-object p2, v2

    :goto_2
    if-eqz p2, :cond_6

    iget-object p2, p2, Lgg/b;->a:Lgg/f;

    goto :goto_3

    :cond_6
    move-object p2, v2

    :goto_3
    iget-object p3, p0, Leg/f;->c:Leg/b;

    iget-object p3, p3, Leg/b;->e:Lfg/m;

    iput-object v2, v0, Leg/c;->x:Lgg/e;

    iput p1, v0, Leg/c;->w:I

    iput v4, v0, Leg/c;->E:I

    check-cast p3, Lfg/e;

    invoke-virtual {p3, p2, v0}, Lfg/e;->c(Lgg/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_4
    return-object v1

    :cond_7
    return-object v3
.end method

.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Leg/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Leg/d;

    iget v1, v0, Leg/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Leg/d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Leg/d;

    check-cast p1, Ls83/c;

    invoke-direct {v0, p0, p1}, Leg/d;-><init>(Leg/f;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Leg/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Leg/d;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v5, v0, Leg/d;->y:I

    if-ne v3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Leg/f;->c:Leg/b;

    iget-object p1, p1, Leg/b;->e:Lfg/m;

    iput v4, v0, Leg/d;->y:I

    check-cast p1, Lfg/e;

    invoke-virtual {p1, v5, v0}, Lfg/e;->a(ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object v3
.end method

.method public final c(ILq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Leg/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Leg/e;

    iget v1, v0, Leg/e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Leg/e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Leg/e;

    check-cast p2, Ls83/c;

    invoke-direct {v0, p0, p2}, Leg/e;-><init>(Leg/f;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Leg/e;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Leg/e;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Leg/e;->w:I

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput p1, v0, Leg/e;->w:I

    iput v5, v0, Leg/e;->z:I

    if-ne v3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p2, p0, Leg/f;->c:Leg/b;

    iget-object p2, p2, Leg/b;->e:Lfg/m;

    iput p1, v0, Leg/e;->w:I

    iput v4, v0, Leg/e;->z:I

    check-cast p2, Lfg/e;

    invoke-virtual {p2, v5, v0}, Lfg/e;->a(ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object v3
.end method

.method public final e()Lae3/k;
    .locals 1

    iget-object v0, p0, Leg/f;->c:Leg/b;

    return-object v0
.end method

.method public final f()Lae3/k;
    .locals 1

    iget-object v0, p0, Leg/f;->c:Leg/b;

    return-object v0
.end method
