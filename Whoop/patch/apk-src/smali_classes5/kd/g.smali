.class public final Lkd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/k;
.implements Lcf/g;


# instance fields
.field public final E:Lm83/y;

.field public final F:Lve/c;

.field public final G:Lg73/d;

.field public final H:Lcg/o;

.field public final I:Ljava/util/ArrayList;

.field public final J:Lcf/e;

.field public final K:Lle/a;

.field public final L:Lmg/h;

.field public final M:Z

.field public final N:Z

.field public final O:Ljava/lang/String;

.field public final P:Lfd/a;

.field public final synthetic w:Lad3/z;

.field public final synthetic x:Laj/d;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkd/e;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lkd/e;->a:Lzt/q;

    invoke-virtual {v0}, Lzt/q;->q()Lad3/z;

    move-result-object v0

    iput-object v0, p0, Lkd/g;->w:Lad3/z;

    iget-object v1, p1, Lkd/e;->b:Lcf/h;

    invoke-virtual {v1}, Lcf/h;->a()Lcf/g;

    move-result-object v1

    check-cast v1, Laj/d;

    iput-object v1, p0, Lkd/g;->x:Laj/d;

    iget-object v1, p1, Lkd/e;->c:Ljava/lang/String;

    iput-object v1, p0, Lkd/g;->y:Ljava/lang/String;

    iget-object v1, p1, Lkd/e;->d:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    new-instance v1, Lkd/f;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

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
    iput-object v1, p0, Lkd/g;->z:Ljava/lang/String;

    new-instance v3, Lme/b;

    const/4 v4, 0x7

    invoke-direct {v3, v2, v2, v4}, Lme/b;-><init>(Lvg/n;Ls/m2;I)V

    iget-object v2, p1, Lkd/e;->e:Ljava/util/List;

    iget-object v3, p1, Lkd/e;->f:Lm83/y;

    iput-object v3, p0, Lkd/g;->E:Lm83/y;

    new-instance v3, Lwc/c;

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lpf/a;

    invoke-direct {v3, v0, v1}, Lwc/c;-><init>(Lpf/a;Ljava/lang/String;)V

    invoke-static {v3}, Lv63/h;->c(Lwc/c;)Lve/c;

    move-result-object v0

    iput-object v0, p0, Lkd/g;->F:Lve/c;

    new-instance v0, Lg73/d;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    iput-object v0, p0, Lkd/g;->G:Lg73/d;

    iget-object v0, p1, Lkd/e;->g:Lcg/o;

    iput-object v0, p0, Lkd/g;->H:Lcg/o;

    iget-object v0, p1, Lkd/e;->h:Ljava/util/ArrayList;

    iput-object v0, p0, Lkd/g;->I:Ljava/util/ArrayList;

    iget-object v0, p1, Lkd/e;->i:Lcf/e;

    if-nez v0, :cond_2

    sget-object v0, Lcf/c;->d:Lcf/c;

    :cond_2
    iput-object v0, p0, Lkd/g;->J:Lcf/e;

    sget-object v0, Lle/a;->y:Lle/a;

    iput-object v0, p0, Lkd/g;->K:Lle/a;

    iget-object v0, p1, Lkd/e;->j:Lmg/h;

    if-nez v0, :cond_3

    sget-object v0, Lmg/h;->a:Lmg/g;

    invoke-static {v0}, Lpf/c;->z(Lmg/g;)Lmg/h;

    move-result-object v0

    :cond_3
    iput-object v0, p0, Lkd/g;->L:Lmg/h;

    iget-object v0, p1, Lkd/e;->k:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_4
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lkd/g;->M:Z

    iget-object v0, p1, Lkd/e;->l:Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_5
    iput-boolean v1, p0, Lkd/g;->N:Z

    iget-object p1, p1, Lkd/e;->m:Ljava/lang/String;

    iput-object p1, p0, Lkd/g;->O:Ljava/lang/String;

    new-instance p1, Lfd/a;

    const/4 v0, 0x1

    invoke-direct {p1, v2, v0}, Lfd/a;-><init>(Ljava/util/List;I)V

    iput-object p1, p0, Lkd/g;->P:Lfd/a;

    return-void
.end method
