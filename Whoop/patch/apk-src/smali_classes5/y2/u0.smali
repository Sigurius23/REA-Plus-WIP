.class public final Ly2/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/q0;


# instance fields
.field public final w:Ly2/q0;

.field public final x:Ly2/w0;

.field public final y:Ly2/x0;


# direct methods
.method public constructor <init>(Ly2/q0;Ly2/w0;Ly2/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/u0;->w:Ly2/q0;

    iput-object p2, p0, Ly2/u0;->x:Ly2/w0;

    iput-object p3, p0, Ly2/u0;->y:Ly2/x0;

    return-void
.end method


# virtual methods
.method public final C(I)I
    .locals 1

    iget-object v0, p0, Ly2/u0;->w:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->C(I)I

    move-result p1

    return p1
.end method

.method public final O(I)I
    .locals 1

    iget-object v0, p0, Ly2/u0;->w:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->O(I)I

    move-result p1

    return p1
.end method

.method public final Q(I)I
    .locals 1

    iget-object v0, p0, Ly2/u0;->w:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->Q(I)I

    move-result p1

    return p1
.end method

.method public final T(J)Ly2/j1;
    .locals 5

    iget-object v0, p0, Ly2/u0;->y:Ly2/x0;

    sget-object v1, Ly2/x0;->w:Ly2/x0;

    const/16 v2, 0x7fff

    iget-object v3, p0, Ly2/u0;->x:Ly2/w0;

    iget-object v4, p0, Ly2/u0;->w:Ly2/q0;

    if-ne v0, v1, :cond_2

    sget-object v0, Ly2/w0;->x:Ly2/w0;

    if-ne v3, v0, :cond_0

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->Q(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->O(I)I

    move-result v0

    :goto_0
    invoke-static {p1, p2}, Ly3/a;->d(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v2

    :cond_1
    new-instance p1, Ly2/v0;

    invoke-direct {p1, v0, v2}, Ly2/v0;-><init>(II)V

    return-object p1

    :cond_2
    sget-object v0, Ly2/w0;->x:Ly2/w0;

    if-ne v3, v0, :cond_3

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->b(I)I

    move-result v0

    goto :goto_1

    :cond_3
    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->C(I)I

    move-result v0

    :goto_1
    invoke-static {p1, p2}, Ly3/a;->e(J)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v2

    :cond_4
    new-instance p1, Ly2/v0;

    invoke-direct {p1, v2, v0}, Ly2/v0;-><init>(II)V

    return-object p1
.end method

.method public final b(I)I
    .locals 1

    iget-object v0, p0, Ly2/u0;->w:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->b(I)I

    move-result p1

    return p1
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly2/u0;->w:Ly2/q0;

    invoke-interface {v0}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
