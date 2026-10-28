.class public final Landroidx/constraintlayout/widget/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Landroidx/constraintlayout/widget/n;

.field public final c:Landroidx/constraintlayout/widget/m;

.field public final d:Landroidx/constraintlayout/widget/l;

.field public final e:Landroidx/constraintlayout/widget/o;

.field public f:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/constraintlayout/widget/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Landroidx/constraintlayout/widget/n;->a:I

    iput v1, v0, Landroidx/constraintlayout/widget/n;->b:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Landroidx/constraintlayout/widget/n;->c:F

    const/high16 v3, 0x7fc00000    # Float.NaN

    iput v3, v0, Landroidx/constraintlayout/widget/n;->d:F

    iput-object v0, p0, Landroidx/constraintlayout/widget/k;->b:Landroidx/constraintlayout/widget/n;

    new-instance v0, Landroidx/constraintlayout/widget/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v4, -0x1

    iput v4, v0, Landroidx/constraintlayout/widget/m;->a:I

    iput v1, v0, Landroidx/constraintlayout/widget/m;->b:I

    iput v4, v0, Landroidx/constraintlayout/widget/m;->c:I

    iput v3, v0, Landroidx/constraintlayout/widget/m;->d:F

    iput v3, v0, Landroidx/constraintlayout/widget/m;->e:F

    iput v3, v0, Landroidx/constraintlayout/widget/m;->f:F

    iput v4, v0, Landroidx/constraintlayout/widget/m;->g:I

    const/4 v5, 0x0

    iput-object v5, v0, Landroidx/constraintlayout/widget/m;->h:Ljava/lang/String;

    iput v4, v0, Landroidx/constraintlayout/widget/m;->i:I

    iput-object v0, p0, Landroidx/constraintlayout/widget/k;->c:Landroidx/constraintlayout/widget/m;

    new-instance v0, Landroidx/constraintlayout/widget/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/l;->a:Z

    iput v4, v0, Landroidx/constraintlayout/widget/l;->d:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->e:I

    const/high16 v6, -0x40800000    # -1.0f

    iput v6, v0, Landroidx/constraintlayout/widget/l;->f:F

    const/4 v7, 0x1

    iput-boolean v7, v0, Landroidx/constraintlayout/widget/l;->g:Z

    iput v4, v0, Landroidx/constraintlayout/widget/l;->h:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->i:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->j:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->k:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->l:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->m:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->n:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->o:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->p:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->q:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->r:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->s:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->t:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->u:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->v:I

    const/high16 v8, 0x3f000000    # 0.5f

    iput v8, v0, Landroidx/constraintlayout/widget/l;->w:F

    iput v8, v0, Landroidx/constraintlayout/widget/l;->x:F

    iput-object v5, v0, Landroidx/constraintlayout/widget/l;->y:Ljava/lang/String;

    iput v4, v0, Landroidx/constraintlayout/widget/l;->z:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->A:I

    const/4 v5, 0x0

    iput v5, v0, Landroidx/constraintlayout/widget/l;->B:F

    iput v4, v0, Landroidx/constraintlayout/widget/l;->C:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->D:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->E:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->F:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->G:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->H:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->I:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->J:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->K:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->L:I

    const/high16 v8, -0x80000000

    iput v8, v0, Landroidx/constraintlayout/widget/l;->M:I

    iput v8, v0, Landroidx/constraintlayout/widget/l;->N:I

    iput v8, v0, Landroidx/constraintlayout/widget/l;->O:I

    iput v8, v0, Landroidx/constraintlayout/widget/l;->P:I

    iput v8, v0, Landroidx/constraintlayout/widget/l;->Q:I

    iput v8, v0, Landroidx/constraintlayout/widget/l;->R:I

    iput v8, v0, Landroidx/constraintlayout/widget/l;->S:I

    iput v6, v0, Landroidx/constraintlayout/widget/l;->T:F

    iput v6, v0, Landroidx/constraintlayout/widget/l;->U:F

    iput v1, v0, Landroidx/constraintlayout/widget/l;->V:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->W:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->X:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->Y:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->Z:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->a0:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->b0:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->c0:I

    iput v2, v0, Landroidx/constraintlayout/widget/l;->d0:F

    iput v2, v0, Landroidx/constraintlayout/widget/l;->e0:F

    iput v4, v0, Landroidx/constraintlayout/widget/l;->f0:I

    iput v1, v0, Landroidx/constraintlayout/widget/l;->g0:I

    iput v4, v0, Landroidx/constraintlayout/widget/l;->h0:I

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/l;->l0:Z

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/l;->m0:Z

    iput-boolean v7, v0, Landroidx/constraintlayout/widget/l;->n0:Z

    iput v1, v0, Landroidx/constraintlayout/widget/l;->o0:I

    iput-object v0, p0, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    new-instance v0, Landroidx/constraintlayout/widget/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v5, v0, Landroidx/constraintlayout/widget/o;->a:F

    iput v5, v0, Landroidx/constraintlayout/widget/o;->b:F

    iput v5, v0, Landroidx/constraintlayout/widget/o;->c:F

    iput v2, v0, Landroidx/constraintlayout/widget/o;->d:F

    iput v2, v0, Landroidx/constraintlayout/widget/o;->e:F

    iput v3, v0, Landroidx/constraintlayout/widget/o;->f:F

    iput v3, v0, Landroidx/constraintlayout/widget/o;->g:F

    iput v4, v0, Landroidx/constraintlayout/widget/o;->h:I

    iput v5, v0, Landroidx/constraintlayout/widget/o;->i:F

    iput v5, v0, Landroidx/constraintlayout/widget/o;->j:F

    iput v5, v0, Landroidx/constraintlayout/widget/o;->k:F

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/o;->l:Z

    iput v5, v0, Landroidx/constraintlayout/widget/o;->m:F

    iput-object v0, p0, Landroidx/constraintlayout/widget/k;->e:Landroidx/constraintlayout/widget/o;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/k;->f:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/constraintlayout/widget/d;)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    iget v1, v0, Landroidx/constraintlayout/widget/l;->h:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->e:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->i:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->f:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->j:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->g:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->k:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->h:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->l:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->i:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->m:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->j:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->n:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->k:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->o:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->l:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->p:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->m:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->q:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->n:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->r:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->o:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->s:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->s:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->t:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->t:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->u:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->u:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->v:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->v:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->F:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->G:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->H:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->I:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->R:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->A:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->Q:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->B:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->N:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->x:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->P:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->z:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->w:F

    iput v1, p1, Landroidx/constraintlayout/widget/d;->E:F

    iget v1, v0, Landroidx/constraintlayout/widget/l;->x:F

    iput v1, p1, Landroidx/constraintlayout/widget/d;->F:F

    iget v1, v0, Landroidx/constraintlayout/widget/l;->z:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->p:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->A:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->q:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->B:F

    iput v1, p1, Landroidx/constraintlayout/widget/d;->r:F

    iget-object v1, v0, Landroidx/constraintlayout/widget/l;->y:Ljava/lang/String;

    iput-object v1, p1, Landroidx/constraintlayout/widget/d;->G:Ljava/lang/String;

    iget v1, v0, Landroidx/constraintlayout/widget/l;->C:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->T:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->D:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->U:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->T:F

    iput v1, p1, Landroidx/constraintlayout/widget/d;->I:F

    iget v1, v0, Landroidx/constraintlayout/widget/l;->U:F

    iput v1, p1, Landroidx/constraintlayout/widget/d;->H:F

    iget v1, v0, Landroidx/constraintlayout/widget/l;->W:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->K:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->V:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->J:I

    iget-boolean v1, v0, Landroidx/constraintlayout/widget/l;->l0:Z

    iput-boolean v1, p1, Landroidx/constraintlayout/widget/d;->W:Z

    iget-boolean v1, v0, Landroidx/constraintlayout/widget/l;->m0:Z

    iput-boolean v1, p1, Landroidx/constraintlayout/widget/d;->X:Z

    iget v1, v0, Landroidx/constraintlayout/widget/l;->X:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->L:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->Y:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->M:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->Z:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->P:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->a0:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->Q:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->b0:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->N:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->c0:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->O:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->d0:F

    iput v1, p1, Landroidx/constraintlayout/widget/d;->R:F

    iget v1, v0, Landroidx/constraintlayout/widget/l;->e0:F

    iput v1, p1, Landroidx/constraintlayout/widget/d;->S:F

    iget v1, v0, Landroidx/constraintlayout/widget/l;->E:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->V:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->f:F

    iput v1, p1, Landroidx/constraintlayout/widget/d;->c:F

    iget v1, v0, Landroidx/constraintlayout/widget/l;->d:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->a:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->e:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->b:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->b:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->c:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v1, v0, Landroidx/constraintlayout/widget/l;->k0:Ljava/lang/String;

    if-eqz v1, :cond_0

    iput-object v1, p1, Landroidx/constraintlayout/widget/d;->Y:Ljava/lang/String;

    :cond_0
    iget v1, v0, Landroidx/constraintlayout/widget/l;->o0:I

    iput v1, p1, Landroidx/constraintlayout/widget/d;->Z:I

    iget v1, v0, Landroidx/constraintlayout/widget/l;->K:I

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget v0, v0, Landroidx/constraintlayout/widget/l;->J:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1}, Landroidx/constraintlayout/widget/d;->a()V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    new-instance v0, Landroidx/constraintlayout/widget/k;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/k;-><init>()V

    iget-object v1, v0, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/l;->a:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/l;->a:Z

    iget v3, v2, Landroidx/constraintlayout/widget/l;->b:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->b:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->c:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->c:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->d:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->d:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->e:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->e:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->f:F

    iput v3, v1, Landroidx/constraintlayout/widget/l;->f:F

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/l;->g:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/l;->g:Z

    iget v3, v2, Landroidx/constraintlayout/widget/l;->h:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->h:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->i:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->i:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->j:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->j:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->k:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->k:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->l:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->l:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->m:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->m:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->n:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->n:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->o:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->o:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->p:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->p:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->q:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->q:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->r:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->r:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->s:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->s:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->t:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->t:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->u:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->u:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->v:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->v:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->w:F

    iput v3, v1, Landroidx/constraintlayout/widget/l;->w:F

    iget v3, v2, Landroidx/constraintlayout/widget/l;->x:F

    iput v3, v1, Landroidx/constraintlayout/widget/l;->x:F

    iget-object v3, v2, Landroidx/constraintlayout/widget/l;->y:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/l;->y:Ljava/lang/String;

    iget v3, v2, Landroidx/constraintlayout/widget/l;->z:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->z:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->A:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->A:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->B:F

    iput v3, v1, Landroidx/constraintlayout/widget/l;->B:F

    iget v3, v2, Landroidx/constraintlayout/widget/l;->C:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->C:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->D:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->D:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->E:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->E:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->F:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->F:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->G:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->G:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->H:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->H:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->I:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->I:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->J:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->J:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->K:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->K:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->L:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->L:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->M:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->M:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->N:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->N:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->O:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->O:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->P:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->P:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->Q:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->Q:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->R:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->R:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->S:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->S:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->T:F

    iput v3, v1, Landroidx/constraintlayout/widget/l;->T:F

    iget v3, v2, Landroidx/constraintlayout/widget/l;->U:F

    iput v3, v1, Landroidx/constraintlayout/widget/l;->U:F

    iget v3, v2, Landroidx/constraintlayout/widget/l;->V:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->V:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->W:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->W:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->X:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->X:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->Y:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->Y:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->Z:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->Z:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->a0:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->a0:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->b0:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->b0:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->c0:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->c0:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->d0:F

    iput v3, v1, Landroidx/constraintlayout/widget/l;->d0:F

    iget v3, v2, Landroidx/constraintlayout/widget/l;->e0:F

    iput v3, v1, Landroidx/constraintlayout/widget/l;->e0:F

    iget v3, v2, Landroidx/constraintlayout/widget/l;->f0:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->f0:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->g0:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->g0:I

    iget v3, v2, Landroidx/constraintlayout/widget/l;->h0:I

    iput v3, v1, Landroidx/constraintlayout/widget/l;->h0:I

    iget-object v3, v2, Landroidx/constraintlayout/widget/l;->k0:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/l;->k0:Ljava/lang/String;

    iget-object v3, v2, Landroidx/constraintlayout/widget/l;->i0:[I

    if-eqz v3, :cond_0

    iget-object v4, v2, Landroidx/constraintlayout/widget/l;->j0:Ljava/lang/String;

    if-nez v4, :cond_0

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, Landroidx/constraintlayout/widget/l;->i0:[I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    iput-object v3, v1, Landroidx/constraintlayout/widget/l;->i0:[I

    :goto_0
    iget-object v3, v2, Landroidx/constraintlayout/widget/l;->j0:Ljava/lang/String;

    iput-object v3, v1, Landroidx/constraintlayout/widget/l;->j0:Ljava/lang/String;

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/l;->l0:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/l;->l0:Z

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/l;->m0:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/l;->m0:Z

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/l;->n0:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/l;->n0:Z

    iget v2, v2, Landroidx/constraintlayout/widget/l;->o0:I

    iput v2, v1, Landroidx/constraintlayout/widget/l;->o0:I

    iget-object v1, v0, Landroidx/constraintlayout/widget/k;->c:Landroidx/constraintlayout/widget/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Landroidx/constraintlayout/widget/k;->c:Landroidx/constraintlayout/widget/m;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Landroidx/constraintlayout/widget/m;->a:I

    iput v3, v1, Landroidx/constraintlayout/widget/m;->a:I

    iget v3, v2, Landroidx/constraintlayout/widget/m;->c:I

    iput v3, v1, Landroidx/constraintlayout/widget/m;->c:I

    iget v3, v2, Landroidx/constraintlayout/widget/m;->e:F

    iput v3, v1, Landroidx/constraintlayout/widget/m;->e:F

    iget v2, v2, Landroidx/constraintlayout/widget/m;->d:F

    iput v2, v1, Landroidx/constraintlayout/widget/m;->d:F

    iget-object v1, p0, Landroidx/constraintlayout/widget/k;->b:Landroidx/constraintlayout/widget/n;

    iget v2, v1, Landroidx/constraintlayout/widget/n;->a:I

    iget-object v3, v0, Landroidx/constraintlayout/widget/k;->b:Landroidx/constraintlayout/widget/n;

    iput v2, v3, Landroidx/constraintlayout/widget/n;->a:I

    iget v2, v1, Landroidx/constraintlayout/widget/n;->c:F

    iput v2, v3, Landroidx/constraintlayout/widget/n;->c:F

    iget v2, v1, Landroidx/constraintlayout/widget/n;->d:F

    iput v2, v3, Landroidx/constraintlayout/widget/n;->d:F

    iget v1, v1, Landroidx/constraintlayout/widget/n;->b:I

    iput v1, v3, Landroidx/constraintlayout/widget/n;->b:I

    iget-object v1, v0, Landroidx/constraintlayout/widget/k;->e:Landroidx/constraintlayout/widget/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Landroidx/constraintlayout/widget/k;->e:Landroidx/constraintlayout/widget/o;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Landroidx/constraintlayout/widget/o;->a:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->a:F

    iget v3, v2, Landroidx/constraintlayout/widget/o;->b:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->b:F

    iget v3, v2, Landroidx/constraintlayout/widget/o;->c:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->c:F

    iget v3, v2, Landroidx/constraintlayout/widget/o;->d:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->d:F

    iget v3, v2, Landroidx/constraintlayout/widget/o;->e:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->e:F

    iget v3, v2, Landroidx/constraintlayout/widget/o;->f:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->f:F

    iget v3, v2, Landroidx/constraintlayout/widget/o;->g:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->g:F

    iget v3, v2, Landroidx/constraintlayout/widget/o;->h:I

    iput v3, v1, Landroidx/constraintlayout/widget/o;->h:I

    iget v3, v2, Landroidx/constraintlayout/widget/o;->i:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->i:F

    iget v3, v2, Landroidx/constraintlayout/widget/o;->j:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->j:F

    iget v3, v2, Landroidx/constraintlayout/widget/o;->k:F

    iput v3, v1, Landroidx/constraintlayout/widget/o;->k:F

    iget-boolean v3, v2, Landroidx/constraintlayout/widget/o;->l:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/o;->l:Z

    iget v2, v2, Landroidx/constraintlayout/widget/o;->m:F

    iput v2, v1, Landroidx/constraintlayout/widget/o;->m:F

    iget v1, p0, Landroidx/constraintlayout/widget/k;->a:I

    iput v1, v0, Landroidx/constraintlayout/widget/k;->a:I

    return-object v0
.end method
