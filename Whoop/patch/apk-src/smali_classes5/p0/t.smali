.class public final Lp0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final s:J

.field public static final synthetic t:I


# instance fields
.field public final a:Lbc3/c0;

.field public final b:Li2/f0;

.field public final c:Lnr0/e;

.field public d:Ld0/c0;

.field public e:Ld0/c0;

.field public f:Ld0/c0;

.field public g:Z

.field public final h:Lp1/k1;

.field public final i:Lp1/k1;

.field public final j:Lp1/k1;

.field public final k:Lp1/k1;

.field public l:J

.field public m:J

.field public n:Ll2/c;

.field public final o:Ld0/e;

.field public final p:Ld0/e;

.field public final q:Lp1/k1;

.field public r:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const v0, 0x7fffffff

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long v2, v0, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    sput-wide v0, Lp0/t;->s:J

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Li2/f0;Lnr0/e;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/t;->a:Lbc3/c0;

    iput-object p2, p0, Lp0/t;->b:Li2/f0;

    iput-object p3, p0, Lp0/t;->c:Lnr0/e;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p3

    iput-object p3, p0, Lp0/t;->h:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p3

    iput-object p3, p0, Lp0/t;->i:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p3

    iput-object p3, p0, Lp0/t;->j:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lp0/t;->k:Lp1/k1;

    sget-wide v0, Lp0/t;->s:J

    iput-wide v0, p0, Lp0/t;->l:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lp0/t;->m:J

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Li2/f0;->a()Ll2/c;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p0, Lp0/t;->n:Ll2/c;

    new-instance p2, Ld0/e;

    new-instance p3, Ly3/j;

    invoke-direct {p3, v2, v3}, Ly3/j;-><init>(J)V

    sget-object v4, Ld0/f;->o:Ld0/f2;

    const/16 v5, 0xc

    invoke-direct {p2, p3, v4, p1, v5}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    iput-object p2, p0, Lp0/t;->o:Ld0/e;

    new-instance p2, Ld0/e;

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    sget-object v4, Ld0/f;->i:Ld0/f2;

    invoke-direct {p2, p3, v4, p1, v5}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    iput-object p2, p0, Lp0/t;->p:Ld0/e;

    new-instance p1, Ly3/j;

    invoke-direct {p1, v2, v3}, Ly3/j;-><init>(J)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lp0/t;->q:Lp1/k1;

    iput-wide v0, p0, Lp0/t;->r:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget-object v4, p0, Lp0/t;->n:Ll2/c;

    iget-object v3, p0, Lp0/t;->d:Ld0/c0;

    iget-object v0, p0, Lp0/t;->i:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v6, 0x3

    iget-object v7, p0, Lp0/t;->a:Lbc3/c0;

    const/4 v8, 0x0

    if-nez v0, :cond_0

    if-eqz v3, :cond_0

    if-nez v4, :cond_1

    :cond_0
    move-object v2, p0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp0/t;->j(Z)V

    invoke-virtual {p0}, Lp0/t;->g()Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    if-nez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ll2/c;->e(F)V

    :cond_2
    new-instance v0, La30/u;

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, La30/u;-><init>(ZLp0/t;Ld0/c0;Ll2/c;Lq83/d;)V

    invoke-static {v7, v8, v8, v0, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :goto_0
    invoke-virtual {p0}, Lp0/t;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz v4, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v4, v0}, Ll2/c;->e(F)V

    :cond_3
    new-instance v0, Lp0/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v8, v1}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

    invoke-static {v7, v8, v8, v0, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_4
    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v3, p0, Lp0/t;->n:Ll2/c;

    iget-object v2, p0, Lp0/t;->f:Ld0/c0;

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lp0/t;->g()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez v2, :cond_1

    :cond_0
    move-object v1, p0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp0/t;->k(Z)V

    new-instance v0, Ln43/a;

    const/4 v5, 0x6

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    iget-object v3, v1, Lp0/t;->a:Lbc3/c0;

    invoke-static {v3, v4, v4, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_0
    return-void
.end method

.method public final c(JZ)V
    .locals 7

    iget-object v2, p0, Lp0/t;->e:Ld0/c0;

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lp0/t;->q:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/j;

    iget-wide v0, v0, Ly3/j;->a:J

    invoke-static {v0, v1, p1, p2}, Ly3/j;->c(JJ)J

    move-result-wide v3

    invoke-virtual {p0, v3, v4}, Lp0/t;->m(J)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lp0/t;->l(Z)V

    iput-boolean p3, p0, Lp0/t;->g:Z

    new-instance v0, Lf0/c;

    const/4 v5, 0x0

    const/4 v6, 0x4

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lf0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLq83/d;I)V

    const/4 p1, 0x3

    iget-object p2, v1, Lp0/t;->a:Lbc3/c0;

    const/4 p3, 0x0

    invoke-static {p2, p3, p3, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final d()Ll2/c;
    .locals 1

    iget-object v0, p0, Lp0/t;->n:Ll2/c;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lp0/t;->l:J

    return-wide v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lp0/t;->k:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Lp0/t;->j:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lp0/t;->h:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final i()V
    .locals 6

    invoke-virtual {p0}, Lp0/t;->h()Z

    move-result v0

    const/4 v1, 0x3

    iget-object v2, p0, Lp0/t;->a:Lbc3/c0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v3}, Lp0/t;->l(Z)V

    new-instance v0, Lp0/r;

    const/4 v5, 0x2

    invoke-direct {v0, p0, v4, v5}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

    invoke-static {v2, v4, v4, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    iget-object v0, p0, Lp0/t;->i:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v3}, Lp0/t;->j(Z)V

    new-instance v0, Lp0/r;

    const/4 v5, 0x3

    invoke-direct {v0, p0, v4, v5}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

    invoke-static {v2, v4, v4, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    invoke-virtual {p0}, Lp0/t;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v3}, Lp0/t;->k(Z)V

    new-instance v0, Lp0/r;

    const/4 v5, 0x4

    invoke-direct {v0, p0, v4, v5}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

    invoke-static {v2, v4, v4, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    iput-boolean v3, p0, Lp0/t;->g:Z

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lp0/t;->m(J)V

    sget-wide v0, Lp0/t;->s:J

    iput-wide v0, p0, Lp0/t;->l:J

    iget-object v0, p0, Lp0/t;->n:Ll2/c;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lp0/t;->b:Li2/f0;

    if-eqz v1, :cond_3

    invoke-interface {v1, v0}, Li2/f0;->b(Ll2/c;)V

    :cond_3
    iput-object v4, p0, Lp0/t;->n:Ll2/c;

    iput-object v4, p0, Lp0/t;->d:Ld0/c0;

    iput-object v4, p0, Lp0/t;->f:Ld0/c0;

    iput-object v4, p0, Lp0/t;->e:Ld0/c0;

    return-void
.end method

.method public final j(Z)V
    .locals 1

    iget-object v0, p0, Lp0/t;->i:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Z)V
    .locals 1

    iget-object v0, p0, Lp0/t;->j:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final l(Z)V
    .locals 1

    iget-object v0, p0, Lp0/t;->h:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final m(J)V
    .locals 1

    new-instance v0, Ly3/j;

    invoke-direct {v0, p1, p2}, Ly3/j;-><init>(J)V

    iget-object p1, p0, Lp0/t;->q:Lp1/k1;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final n(J)V
    .locals 0

    iput-wide p1, p0, Lp0/t;->l:J

    return-void
.end method
