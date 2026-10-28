.class public final Lc0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/q;


# instance fields
.field public final a:Ld0/z1;

.field public b:Lb2/h;

.field public c:Ly3/m;

.field public final d:Lp1/k1;

.field public final e:La0/v0;

.field public f:Ld0/r1;


# direct methods
.method public constructor <init>(Ld0/z1;Lb2/h;Ly3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/x;->a:Ld0/z1;

    iput-object p2, p0, Lc0/x;->b:Lb2/h;

    iput-object p3, p0, Lc0/x;->c:Ly3/m;

    new-instance p1, Ly3/l;

    const-wide/16 p2, 0x0

    invoke-direct {p1, p2, p3}, Ly3/l;-><init>(J)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lc0/x;->d:Lp1/k1;

    sget-object p1, La0/d1;->a:[J

    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    iput-object p1, p0, Lc0/x;->e:La0/v0;

    return-void
.end method

.method public static final e(Lc0/x;JJ)J
    .locals 6

    iget-object v0, p0, Lc0/x;->b:Lb2/h;

    sget-object v5, Ly3/m;->w:Ly3/m;

    move-wide v1, p1

    move-wide v3, p3

    invoke-interface/range {v0 .. v5}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final f(Lc0/x;)J
    .locals 2

    iget-object v0, p0, Lc0/x;->f:Ld0/r1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld0/r1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/l;

    iget-wide v0, p0, Ly3/l;->a:J

    return-wide v0

    :cond_0
    iget-object p0, p0, Lc0/x;->d:Lp1/k1;

    invoke-virtual {p0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/l;

    iget-wide v0, p0, Ly3/l;->a:J

    return-wide v0
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lc0/x;->a:Ld0/z1;

    invoke-virtual {v0}, Ld0/z1;->f()Ld0/t1;

    move-result-object v0

    invoke-interface {v0}, Ld0/t1;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lc0/x;->a:Ld0/z1;

    invoke-virtual {v0}, Ld0/z1;->f()Ld0/t1;

    move-result-object v0

    invoke-interface {v0}, Ld0/t1;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g(I)Z
    .locals 3

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lvp/c;->G(II)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x4

    invoke-static {p1, v1}, Lvp/c;->G(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc0/x;->c:Ly3/m;

    sget-object v2, Ly3/m;->w:Ly3/m;

    if-eq v1, v2, :cond_2

    :cond_0
    const/4 v1, 0x5

    invoke-static {p1, v1}, Lvp/c;->G(II)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc0/x;->c:Ly3/m;

    sget-object v1, Ly3/m;->x:Ly3/m;

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final h(I)Z
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lvp/c;->G(II)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x4

    invoke-static {p1, v1}, Lvp/c;->G(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc0/x;->c:Ly3/m;

    sget-object v2, Ly3/m;->x:Ly3/m;

    if-eq v1, v2, :cond_2

    :cond_0
    const/4 v1, 0x5

    invoke-static {p1, v1}, Lvp/c;->G(II)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc0/x;->c:Ly3/m;

    sget-object v1, Ly3/m;->w:Ly3/m;

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v0
.end method
