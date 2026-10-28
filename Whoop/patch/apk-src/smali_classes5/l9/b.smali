.class public final Ll9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/z0;


# instance fields
.field public final w:Ll9/z0;

.field public x:Z

.field public final synthetic y:Ll9/c;


# direct methods
.method public constructor <init>(Ll9/c;Ll9/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/b;->y:Ll9/c;

    iput-object p2, p0, Ll9/b;->w:Ll9/z0;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Ll9/b;->y:Ll9/c;

    invoke-virtual {v0}, Ll9/c;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll9/b;->w:Ll9/z0;

    invoke-interface {v0}, Ll9/z0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ll9/b;->w:Ll9/z0;

    invoke-interface {v0}, Ll9/z0;->c()V

    return-void
.end method

.method public final j(J)I
    .locals 1

    iget-object v0, p0, Ll9/b;->y:Ll9/c;

    invoke-virtual {v0}, Ll9/c;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x3

    return p1

    :cond_0
    iget-object v0, p0, Ll9/b;->w:Ll9/z0;

    invoke-interface {v0, p1, p2}, Ll9/z0;->j(J)I

    move-result p1

    return p1
.end method

.method public final l(Lqg3/d;La9/e;I)I
    .locals 11

    iget-object v0, p0, Ll9/b;->y:Ll9/c;

    invoke-virtual {v0}, Ll9/c;->g()Z

    move-result v1

    const/4 v2, -0x3

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-boolean v1, p0, Ll9/b;->x:Z

    const/4 v3, 0x4

    const/4 v4, -0x4

    if-eqz v1, :cond_1

    iput v3, p2, La9/a;->x:I

    return v4

    :cond_1
    invoke-virtual {v0}, Ll9/c;->m()J

    move-result-wide v5

    iget-object v1, p0, Ll9/b;->w:Ll9/z0;

    invoke-interface {v1, p1, p2, p3}, Ll9/z0;->l(Lqg3/d;La9/e;I)I

    move-result p3

    const/4 v1, -0x5

    const-wide/high16 v7, -0x8000000000000000L

    if-ne p3, v1, :cond_6

    iget-object p2, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p2, Lu8/p;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p3, p2, Lu8/p;->H:I

    iget v2, p2, Lu8/p;->G:I

    if-nez v2, :cond_3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    iget-wide v3, v0, Ll9/c;->E:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    move v2, v4

    :cond_4
    iget-wide v5, v0, Ll9/c;->F:J

    cmp-long v0, v5, v7

    if-eqz v0, :cond_5

    move p3, v4

    :cond_5
    invoke-virtual {p2}, Lu8/p;->a()Lu8/o;

    move-result-object p2

    iput v2, p2, Lu8/o;->F:I

    iput p3, p2, Lu8/o;->G:I

    new-instance p3, Lu8/p;

    invoke-direct {p3, p2}, Lu8/p;-><init>(Lu8/o;)V

    iput-object p3, p1, Lqg3/d;->y:Ljava/lang/Object;

    return v1

    :cond_6
    iget-wide v0, v0, Ll9/c;->F:J

    cmp-long p1, v0, v7

    if-eqz p1, :cond_9

    if-ne p3, v4, :cond_7

    iget-wide v9, p2, La9/e;->G:J

    cmp-long p1, v9, v0

    if-gez p1, :cond_8

    :cond_7
    if-ne p3, v2, :cond_9

    cmp-long p1, v5, v7

    if-nez p1, :cond_9

    iget-boolean p1, p2, La9/e;->F:Z

    if-nez p1, :cond_9

    :cond_8
    invoke-virtual {p2}, La9/e;->o()V

    iput v3, p2, La9/a;->x:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll9/b;->x:Z

    return v4

    :cond_9
    return p3
.end method
