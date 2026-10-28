.class public final Lfc3/f;
.super Lfc3/d;
.source "SourceFile"


# instance fields
.field public final E:I

.field public final z:Lec3/a0;


# direct methods
.method public constructor <init>(Lec3/a0;ILq83/j;ILdc3/a;)V
    .locals 0

    invoke-direct {p0, p3, p4, p5}, Lfc3/d;-><init>(Lq83/j;ILdc3/a;)V

    iput-object p1, p0, Lfc3/f;->z:Lec3/a0;

    iput p2, p0, Lfc3/f;->E:I

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "concurrency="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lfc3/f;->E:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lfc3/f;->E:I

    invoke-static {v0}, Lmc3/j;->a(I)Lmc3/i;

    move-result-object v3

    new-instance v5, Lfc3/w;

    invoke-direct {v5, p1}, Lfc3/w;-><init>(Ldc3/u;)V

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lbc3/k1;

    new-instance v1, Landroidx/room/b2;

    const/4 v6, 0x2

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Landroidx/room/b2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Lfc3/f;->z:Lec3/a0;

    invoke-virtual {p1, v1, p2}, Lec3/a0;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final f(Lq83/j;ILdc3/a;)Lfc3/d;
    .locals 6

    new-instance v0, Lfc3/f;

    iget-object v1, p0, Lfc3/f;->z:Lec3/a0;

    iget v2, p0, Lfc3/f;->E:I

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lfc3/f;-><init>(Lec3/a0;ILq83/j;ILdc3/a;)V

    return-object v0
.end method

.method public final h(Lbc3/c0;)Ldc3/w;
    .locals 5

    new-instance v0, La6/c;

    const/4 v1, 0x0

    const/16 v2, 0xf

    invoke-direct {v0, p0, v1, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v1, Ldc3/a;->w:Ldc3/a;

    sget-object v2, Lbc3/d0;->w:Lbc3/d0;

    const/4 v3, 0x4

    iget v4, p0, Lfc3/d;->x:I

    invoke-static {v4, v3, v1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v1

    iget-object v3, p0, Lfc3/d;->w:Lq83/j;

    invoke-static {p1, v3}, Lbc3/f0;->A(Lbc3/c0;Lq83/j;)Lq83/j;

    move-result-object p1

    new-instance v3, Ldc3/t;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v1, v4, v4}, Ldc3/t;-><init>(Lq83/j;Ldc3/h;ZZ)V

    invoke-virtual {v3, v2, v3, v0}, Lbc3/a;->b0(Lbc3/d0;Lbc3/a;Lc93/m;)V

    return-object v3
.end method
