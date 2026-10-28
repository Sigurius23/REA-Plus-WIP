.class public abstract Lyf/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lyf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyf/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyf/d;-><init>(Ljava/lang/Throwable;)V

    sput-object v0, Lyf/j;->a:Lyf/d;

    return-void
.end method

.method public static final a(Lyf/t;)Lyf/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lyf/l;

    if-eqz v0, :cond_0

    check-cast p0, Lyf/l;

    return-object p0

    :cond_0
    new-instance v0, Lyf/a;

    instance-of v1, p0, Lzf/e;

    if-eqz v1, :cond_1

    check-cast p0, Lzf/e;

    iget-object p0, p0, Lzf/e;->w:Lne3/n0;

    goto :goto_0

    :cond_1
    new-instance v1, Lzf/g;

    invoke-direct {v1, p0}, Lzf/g;-><init>(Lyf/t;)V

    move-object p0, v1

    :goto_0
    invoke-static {p0}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p0

    invoke-direct {v0, p0}, Lyf/a;-><init>(Lne3/h0;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ljava/io/Closeable;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/io/Closeable;

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    :cond_0
    return-void
.end method

.method public static final c(Lyf/o;Lyf/t;Ls83/c;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lzf/i;->a:Lkc3/d;

    new-instance v1, Lf0/c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lf0/c;-><init>(Lyf/t;Lyf/o;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lyf/o;Lyf/k;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lyf/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lyf/p;

    iget v1, v0, Lyf/p;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyf/p;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyf/p;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lyf/p;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyf/p;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lyf/p;->x:Lyf/k;

    iget-object p1, v0, Lyf/p;->w:Lyf/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    iput-object p0, v0, Lyf/p;->w:Lyf/o;

    iput-object p1, v0, Lyf/p;->x:Lyf/k;

    iput v3, v0, Lyf/p;->z:I

    const-wide v4, 0x7fffffffffffffffL

    invoke-interface {p0, p1, v4, v5, v0}, Lyf/o;->b(Lyf/k;JLs83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-interface {p0}, Lyf/o;->h()Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Lt9/u;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lyf/q;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lyf/q;

    iget v1, v0, Lyf/q;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyf/q;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyf/q;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lyf/q;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyf/q;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lyf/q;->w:Lyf/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lyf/k;

    invoke-direct {p1}, Lyf/k;-><init>()V

    iput-object p1, v0, Lyf/q;->w:Lyf/k;

    iput v3, v0, Lyf/q;->y:I

    invoke-static {p0, p1, v0}, Lyf/j;->d(Lyf/o;Lyf/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
