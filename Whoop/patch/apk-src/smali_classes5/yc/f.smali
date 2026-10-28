.class public final Lyc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/k;
.implements Lcf/g;


# instance fields
.field public final E:Lff/a;

.field public final F:Ljava/util/List;

.field public final G:Lm83/y;

.field public final H:Lve/f;

.field public final I:Lkr/e;

.field public final J:Lcg/o;

.field public final K:Ljava/util/ArrayList;

.field public final L:Lcf/e;

.field public final M:Lgg/g;

.field public final N:Lmg/h;

.field public final O:Z

.field public final P:Z

.field public final Q:Ljava/lang/String;

.field public final R:Lfd/a;

.field public final synthetic w:Lad3/z;

.field public final synthetic x:Laj/d;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lyc/e;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lyc/e;->a:Lzt/q;

    invoke-virtual {v0}, Lzt/q;->q()Lad3/z;

    move-result-object v0

    iput-object v0, p0, Lyc/f;->w:Lad3/z;

    iget-object v1, p1, Lyc/e;->b:Lcf/h;

    invoke-virtual {v1}, Lcf/h;->a()Lcf/g;

    move-result-object v1

    check-cast v1, Laj/d;

    iput-object v1, p0, Lyc/f;->x:Laj/d;

    iget-object v1, p1, Lyc/e;->c:Ljava/lang/String;

    iput-object v1, p0, Lyc/f;->y:Ljava/lang/String;

    iget-object v1, p1, Lyc/e;->d:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    new-instance v1, Lsz/q;

    const/16 v3, 0x12

    invoke-direct {v1, p1, v2, v3}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v3, Lq83/k;->w:Lq83/k;

    invoke-static {v3, v1}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :cond_0
    if-eqz v1, :cond_1

    invoke-static {v1}, Lj93/l0;->h0(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    iput-object v1, p0, Lyc/f;->z:Ljava/lang/String;

    iget-object v3, p1, Lyc/e;->e:Lff/a;

    if-nez v3, :cond_2

    new-instance v3, Lme/b;

    const/4 v4, 0x7

    invoke-direct {v3, v2, v2, v4}, Lme/b;-><init>(Lvg/n;Ls/m2;I)V

    :cond_2
    iput-object v3, p0, Lyc/f;->E:Lff/a;

    iget-object v2, p1, Lyc/e;->f:Ljava/util/List;

    iput-object v2, p0, Lyc/f;->F:Ljava/util/List;

    iget-object v3, p1, Lyc/e;->g:Lm83/y;

    iput-object v3, p0, Lyc/f;->G:Lm83/y;

    iget-object v3, p1, Lyc/e;->h:Lve/f;

    if-nez v3, :cond_3

    new-instance v3, Lwc/c;

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lpf/a;

    invoke-direct {v3, v0, v1}, Lwc/c;-><init>(Lpf/a;Ljava/lang/String;)V

    invoke-static {v3}, Lv63/h;->c(Lwc/c;)Lve/c;

    move-result-object v3

    :cond_3
    iput-object v3, p0, Lyc/f;->H:Lve/f;

    iget-object v0, p1, Lyc/e;->i:Lkr/e;

    if-nez v0, :cond_4

    new-instance v0, Lkr/e;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    :cond_4
    iput-object v0, p0, Lyc/f;->I:Lkr/e;

    iget-object v0, p1, Lyc/e;->j:Lcg/o;

    iput-object v0, p0, Lyc/f;->J:Lcg/o;

    iget-object v0, p1, Lyc/e;->k:Ljava/util/ArrayList;

    iput-object v0, p0, Lyc/f;->K:Ljava/util/ArrayList;

    iget-object v0, p1, Lyc/e;->l:Lcf/e;

    if-nez v0, :cond_5

    sget-object v0, Lcf/c;->d:Lcf/c;

    :cond_5
    iput-object v0, p0, Lyc/f;->L:Lcf/e;

    iget-object v0, p1, Lyc/e;->m:Lgg/g;

    if-nez v0, :cond_6

    sget-object v0, Lle/a;->y:Lle/a;

    :cond_6
    iput-object v0, p0, Lyc/f;->M:Lgg/g;

    iget-object v0, p1, Lyc/e;->n:Lmg/h;

    if-nez v0, :cond_7

    sget-object v0, Lmg/h;->a:Lmg/g;

    invoke-static {v0}, Lpf/c;->z(Lmg/g;)Lmg/h;

    move-result-object v0

    :cond_7
    iput-object v0, p0, Lyc/f;->N:Lmg/h;

    iget-object v0, p1, Lyc/e;->o:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_8
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lyc/f;->O:Z

    iget-object v0, p1, Lyc/e;->p:Ljava/lang/Boolean;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_9
    iput-boolean v1, p0, Lyc/f;->P:Z

    iget-object v0, p1, Lyc/e;->q:Ljava/lang/String;

    iput-object v0, p0, Lyc/f;->Q:Ljava/lang/String;

    iget-object p1, p1, Lyc/e;->r:Lfd/a;

    if-nez p1, :cond_a

    new-instance p1, Lfd/a;

    const/4 v0, 0x3

    invoke-direct {p1, v2, v0}, Lfd/a;-><init>(Ljava/util/List;I)V

    :cond_a
    iput-object p1, p0, Lyc/f;->R:Lfd/a;

    return-void
.end method
