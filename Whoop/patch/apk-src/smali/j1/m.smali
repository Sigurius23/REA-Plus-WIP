.class public final synthetic Lj1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lj1/l;

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/internal/d0;

.field public final synthetic z:Lkotlin/jvm/internal/d0;


# direct methods
.method public synthetic constructor <init>(Lj1/l;ZLkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/m;->w:Lj1/l;

    iput-boolean p2, p0, Lj1/m;->x:Z

    iput-object p3, p0, Lj1/m;->y:Lkotlin/jvm/internal/d0;

    iput-object p4, p0, Lj1/m;->z:Lkotlin/jvm/internal/d0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lj1/m;->w:Lj1/l;

    invoke-virtual {v0}, Lj1/l;->b()Z

    move-result v1

    iget-object v2, v0, Lj1/l;->a:Lbc3/c0;

    iget-object v3, v0, Lj1/l;->h:Lp1/g1;

    const/4 v4, 0x3

    const/4 v5, 0x0

    iget-boolean v6, p0, Lj1/m;->x:Z

    if-eq v1, v6, :cond_1

    iget-object v1, v0, Lj1/l;->d:Lp1/k1;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v1, v7}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lj1/l;->f:Lp1/g1;

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Lp1/g1;->y(F)V

    if-eqz v6, :cond_0

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result v7

    :cond_0
    new-instance v1, Lg1/l;

    const/4 v6, 0x3

    invoke-direct {v1, v0, v7, v5, v6}, Lg1/l;-><init>(Ljava/lang/Object;FLq83/d;I)V

    invoke-static {v2, v5, v5, v1, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    iget-object v1, p0, Lj1/m;->y:Lkotlin/jvm/internal/d0;

    iget v1, v1, Lkotlin/jvm/internal/d0;->w:F

    iget-object v6, v0, Lj1/l;->g:Lp1/g1;

    invoke-virtual {v6, v1}, Lp1/g1;->y(F)V

    iget-object v1, p0, Lj1/m;->z:Lkotlin/jvm/internal/d0;

    iget v1, v1, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result v6

    cmpg-float v6, v6, v1

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v3, v1}, Lp1/g1;->y(F)V

    invoke-virtual {v0}, Lj1/l;->b()Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Lg1/l;

    const/4 v6, 0x3

    invoke-direct {v3, v0, v1, v5, v6}, Lg1/l;-><init>(Ljava/lang/Object;FLq83/d;I)V

    invoke-static {v2, v5, v5, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_3
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
