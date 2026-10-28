.class public abstract Lh5/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lh5/q1;

.field public b:[Lv4/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lh5/q1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh5/q1;-><init>(Lh5/q1;)V

    invoke-direct {p0, v0}, Lh5/h1;-><init>(Lh5/q1;)V

    return-void
.end method

.method public constructor <init>(Lh5/q1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lh5/h1;->a:Lh5/q1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lh5/h1;->b:[Lv4/b;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iget-object v3, p0, Lh5/h1;->a:Lh5/q1;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    iget-object v4, v3, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v4, v0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v0

    :cond_0
    if-nez v1, :cond_1

    iget-object v1, v3, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v1, v2}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v1

    :cond_1
    invoke-static {v1, v0}, Lv4/b;->a(Lv4/b;Lv4/b;)Lv4/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lh5/h1;->g(Lv4/b;)V

    iget-object v0, p0, Lh5/h1;->b:[Lv4/b;

    const/16 v1, 0x10

    invoke-static {v1}, Lq83/g;->B(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lh5/h1;->f(Lv4/b;)V

    :cond_2
    iget-object v0, p0, Lh5/h1;->b:[Lv4/b;

    const/16 v1, 0x20

    invoke-static {v1}, Lq83/g;->B(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lh5/h1;->d(Lv4/b;)V

    :cond_3
    iget-object v0, p0, Lh5/h1;->b:[Lv4/b;

    const/16 v1, 0x40

    invoke-static {v1}, Lq83/g;->B(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lh5/h1;->h(Lv4/b;)V

    :cond_4
    return-void
.end method

.method public abstract b()Lh5/q1;
.end method

.method public c(ILv4/b;)V
    .locals 3

    iget-object v0, p0, Lh5/h1;->b:[Lv4/b;

    if-nez v0, :cond_0

    const/16 v0, 0x9

    new-array v0, v0, [Lv4/b;

    iput-object v0, p0, Lh5/h1;->b:[Lv4/b;

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    and-int v1, p1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lh5/h1;->b:[Lv4/b;

    invoke-static {v0}, Lq83/g;->B(I)I

    move-result v2

    aput-object p2, v1, v2

    :goto_1
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public d(Lv4/b;)V
    .locals 0

    return-void
.end method

.method public abstract e(Lv4/b;)V
.end method

.method public f(Lv4/b;)V
    .locals 0

    return-void
.end method

.method public abstract g(Lv4/b;)V
.end method

.method public h(Lv4/b;)V
    .locals 0

    return-void
.end method
