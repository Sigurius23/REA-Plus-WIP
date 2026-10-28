.class public final synthetic Lu0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lq3/y;

.field public final synthetic F:Lq3/l;

.field public final synthetic G:Lq3/r;

.field public final synthetic H:Lf1/s1;

.field public final synthetic I:Lbc3/c0;

.field public final synthetic J:Lr0/a;

.field public final synthetic w:Lu0/s0;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lq3/z;


# direct methods
.method public synthetic constructor <init>(Lu0/s0;ZZLq3/z;Lq3/y;Lq3/l;Lq3/r;Lf1/s1;Lbc3/c0;Lr0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/u;->w:Lu0/s0;

    iput-boolean p2, p0, Lu0/u;->x:Z

    iput-boolean p3, p0, Lu0/u;->y:Z

    iput-object p4, p0, Lu0/u;->z:Lq3/z;

    iput-object p5, p0, Lu0/u;->E:Lq3/y;

    iput-object p6, p0, Lu0/u;->F:Lq3/l;

    iput-object p7, p0, Lu0/u;->G:Lq3/r;

    iput-object p8, p0, Lu0/u;->H:Lf1/s1;

    iput-object p9, p0, Lu0/u;->I:Lbc3/c0;

    iput-object p10, p0, Lu0/u;->J:Lr0/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Lg2/v;

    iget-object v3, p0, Lu0/u;->w:Lu0/s0;

    invoke-virtual {v3}, Lu0/s0;->b()Z

    move-result v0

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result v0

    iget-object v1, v3, Lu0/s0;->f:Lp1/k1;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lu0/s0;->b()Z

    move-result v0

    iget-object v2, p0, Lu0/u;->E:Lq3/y;

    iget-object v5, p0, Lu0/u;->G:Lq3/r;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu0/u;->x:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu0/u;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lu0/u;->z:Lq3/z;

    iget-object v1, p0, Lu0/u;->F:Lq3/l;

    invoke-static {v0, v3, v2, v1, v5}, Lu0/n0;->u(Lq3/z;Lu0/s0;Lq3/y;Lq3/l;Lq3/r;)V

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lu0/n0;->l(Lu0/s0;)V

    :goto_0
    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result v0

    const/4 v8, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v3}, Lu0/s0;->d()Lu0/p1;

    move-result-object v4

    if-eqz v4, :cond_2

    new-instance v0, Lcz/d;

    const/4 v6, 0x0

    const/16 v7, 0xf

    iget-object v1, p0, Lu0/u;->J:Lr0/a;

    invoke-direct/range {v0 .. v7}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Lu0/u;->I:Lbc3/c0;

    invoke-static {v2, v8, v8, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lu0/u;->H:Lf1/s1;

    invoke-virtual {p1, v8}, Lf1/s1;->g(Lh2/b;)V

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
