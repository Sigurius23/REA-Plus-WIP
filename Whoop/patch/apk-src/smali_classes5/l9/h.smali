.class public final Ll9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/i0;
.implements Lg9/e;


# instance fields
.field public final w:Ljava/lang/Object;

.field public x:Lg9/d;

.field public y:Lg9/d;

.field public final synthetic z:Ll9/j;


# direct methods
.method public constructor <init>(Ll9/j;Ljava/lang/Object;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/h;->z:Ll9/j;

    iget-object v0, p1, Ll9/a;->c:Lg9/d;

    new-instance v1, Lg9/d;

    iget-object v0, v0, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    iput-object v1, p0, Ll9/h;->x:Lg9/d;

    iget-object p1, p1, Ll9/a;->d:Lg9/d;

    new-instance v0, Lg9/d;

    iget-object p1, p1, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, p1, v2, v3}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    iput-object v0, p0, Ll9/h;->y:Lg9/d;

    iput-object p2, p0, Ll9/h;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(ILl9/c0;Ll9/t;Ll9/y;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ll9/h;->g(ILl9/c0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll9/h;->x:Lg9/d;

    invoke-virtual {p0, p4, p2}, Ll9/h;->h(Ll9/y;Ll9/c0;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p4, Ll9/f0;

    const/4 v0, 0x0

    invoke-direct {p4, p1, p3, p2, v0}, Ll9/f0;-><init>(Lg9/d;Ll9/t;Ll9/y;I)V

    invoke-virtual {p1, p4}, Lg9/d;->a(Lx8/d;)V

    :cond_0
    return-void
.end method

.method public final b(ILl9/c0;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V
    .locals 6

    invoke-virtual {p0, p1, p2}, Ll9/h;->g(ILl9/c0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Ll9/h;->x:Lg9/d;

    invoke-virtual {p0, p4, p2}, Ll9/h;->h(Ll9/y;Ll9/c0;)Ll9/y;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ll9/g0;

    move-object v2, p3

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Ll9/g0;-><init>(Lg9/d;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V

    invoke-virtual {v1, v0}, Lg9/d;->a(Lx8/d;)V

    :cond_0
    return-void
.end method

.method public final c(ILl9/c0;Ll9/t;Ll9/y;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ll9/h;->g(ILl9/c0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll9/h;->x:Lg9/d;

    invoke-virtual {p0, p4, p2}, Ll9/h;->h(Ll9/y;Ll9/c0;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p4, Ll9/f0;

    const/4 v0, 0x1

    invoke-direct {p4, p1, p3, p2, v0}, Ll9/f0;-><init>(Lg9/d;Ll9/t;Ll9/y;I)V

    invoke-virtual {p1, p4}, Lg9/d;->a(Lx8/d;)V

    :cond_0
    return-void
.end method

.method public final d(ILl9/c0;Ll9/y;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ll9/h;->g(ILl9/c0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll9/h;->x:Lg9/d;

    invoke-virtual {p0, p3, p2}, Ll9/h;->h(Ll9/y;Ll9/c0;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lc9/c;

    const/16 v0, 0x13

    invoke-direct {p3, v0, p1, p2}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p3}, Lg9/d;->a(Lx8/d;)V

    :cond_0
    return-void
.end method

.method public final e(ILl9/c0;Ll9/y;)V
    .locals 2

    invoke-virtual {p0, p1, p2}, Ll9/h;->g(ILl9/c0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll9/h;->x:Lg9/d;

    invoke-virtual {p0, p3, p2}, Ll9/h;->h(Ll9/y;Ll9/c0;)Ll9/y;

    move-result-object p2

    iget-object p3, p1, Lg9/d;->b:Ll9/c0;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lbc/i;

    const/16 v1, 0x8

    invoke-direct {v0, p1, p3, p2, v1}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lg9/d;->a(Lx8/d;)V

    :cond_0
    return-void
.end method

.method public final f(ILl9/c0;Ll9/t;Ll9/y;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Ll9/h;->g(ILl9/c0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll9/h;->x:Lg9/d;

    invoke-virtual {p0, p4, p2}, Ll9/h;->h(Ll9/y;Ll9/c0;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p4, Ll9/e0;

    invoke-direct {p4, p1, p3, p2, p5}, Ll9/e0;-><init>(Lg9/d;Ll9/t;Ll9/y;I)V

    invoke-virtual {p1, p4}, Lg9/d;->a(Lx8/d;)V

    :cond_0
    return-void
.end method

.method public final g(ILl9/c0;)Z
    .locals 3

    iget-object v0, p0, Ll9/h;->w:Ljava/lang/Object;

    iget-object v1, p0, Ll9/h;->z:Ll9/j;

    if-eqz p2, :cond_0

    invoke-virtual {v1, v0, p2}, Ll9/j;->s(Ljava/lang/Object;Ll9/c0;)Ll9/c0;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x0

    :cond_1
    invoke-virtual {v1, p1, v0}, Ll9/j;->u(ILjava/lang/Object;)I

    move-result p1

    iget-object v0, p0, Ll9/h;->x:Lg9/d;

    iget v2, v0, Lg9/d;->a:I

    if-ne v2, p1, :cond_2

    iget-object v0, v0, Lg9/d;->b:Ll9/c0;

    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, v1, Ll9/a;->c:Lg9/d;

    new-instance v2, Lg9/d;

    iget-object v0, v0, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2, v0, p1, p2}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    iput-object v2, p0, Ll9/h;->x:Lg9/d;

    :cond_3
    iget-object v0, p0, Ll9/h;->y:Lg9/d;

    iget v2, v0, Lg9/d;->a:I

    if-ne v2, p1, :cond_4

    iget-object v0, v0, Lg9/d;->b:Ll9/c0;

    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, v1, Ll9/a;->d:Lg9/d;

    new-instance v1, Lg9/d;

    iget-object v0, v0, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1, v0, p1, p2}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    iput-object v1, p0, Ll9/h;->y:Lg9/d;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public final h(Ll9/y;Ll9/c0;)Ll9/y;
    .locals 13

    iget-wide v0, p1, Ll9/y;->e:J

    iget-object p2, p0, Ll9/h;->z:Ll9/j;

    iget-object v2, p0, Ll9/h;->w:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1, v2}, Ll9/j;->t(JLjava/lang/Object;)J

    move-result-wide v9

    iget-wide v3, p1, Ll9/y;->f:J

    invoke-virtual {p2, v3, v4, v2}, Ll9/j;->t(JLjava/lang/Object;)J

    move-result-wide v11

    cmp-long p2, v9, v0

    if-nez p2, :cond_0

    cmp-long p2, v11, v3

    if-nez p2, :cond_0

    return-object p1

    :cond_0
    new-instance v3, Ll9/y;

    iget v4, p1, Ll9/y;->a:I

    iget v5, p1, Ll9/y;->b:I

    iget-object p2, p1, Ll9/y;->g:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lu8/p;

    iget v7, p1, Ll9/y;->c:I

    iget-object v8, p1, Ll9/y;->d:Ljava/lang/Object;

    invoke-direct/range {v3 .. v12}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    return-object v3
.end method
