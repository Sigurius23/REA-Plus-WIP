.class public final Lp0/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly1/c;

.field public final b:Lo0/i;

.field public final c:La0/v0;


# direct methods
.method public constructor <init>(Ly1/c;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/a0;->a:Ly1/c;

    iput-object p2, p0, Lp0/a0;->b:Lo0/i;

    sget-object p1, La0/d1;->a:[J

    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    iput-object p1, p0, Lp0/a0;->c:La0/v0;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/lang/Object;)Lc93/m;
    .locals 5

    iget-object v0, p0, Lp0/a0;->c:La0/v0;

    invoke-virtual {v0, p2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp0/z;

    const/4 v2, 0x1

    const v3, 0x30c58c04

    if-eqz v1, :cond_1

    iget v4, v1, Lp0/z;->c:I

    if-ne v4, p1, :cond_1

    iget-object v4, v1, Lp0/z;->b:Ljava/lang/Object;

    invoke-static {v4, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object p1, v1, Lp0/z;->d:Lx1/b;

    if-nez p1, :cond_0

    new-instance p1, Lb30/w2;

    iget-object p2, v1, Lp0/z;->e:Lp0/a0;

    const/16 p3, 0x19

    invoke-direct {p1, p3, p2, v1}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Lx1/b;

    invoke-direct {p2, p1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    iput-object p2, v1, Lp0/z;->d:Lx1/b;

    return-object p2

    :cond_0
    return-object p1

    :cond_1
    new-instance v1, Lp0/z;

    invoke-direct {v1, p0, p1, p2, p3}, Lp0/z;-><init>(Lp0/a0;ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2, v1}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v1, Lp0/z;->d:Lx1/b;

    if-nez p1, :cond_2

    new-instance p1, Lb30/w2;

    const/16 p2, 0x19

    invoke-direct {p1, p2, p0, v1}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Lx1/b;

    invoke-direct {p2, p1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    iput-object p2, v1, Lp0/z;->d:Lx1/b;

    return-object p2

    :cond_2
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/a0;->c:La0/v0;

    invoke-virtual {v0, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp0/z;

    if-eqz v0, :cond_1

    iget-object p1, v0, Lp0/z;->b:Ljava/lang/Object;

    return-object p1

    :cond_1
    iget-object v0, p0, Lp0/a0;->b:Lo0/i;

    invoke-virtual {v0}, Lo0/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp0/b0;

    invoke-interface {v0, p1}, Lp0/b0;->b(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_2

    invoke-interface {v0, p1}, Lp0/b0;->a(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
