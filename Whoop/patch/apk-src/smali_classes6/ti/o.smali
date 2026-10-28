.class public final Lti/o;
.super Ld1/j;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ld1/j;

.field public final synthetic F:Lwi/b;

.field public final synthetic z:Lej/b;


# direct methods
.method public constructor <init>(Lej/b;Ld1/j;Lwi/b;)V
    .locals 0

    iput-object p1, p0, Lti/o;->z:Lej/b;

    iput-object p2, p0, Lti/o;->E:Ld1/j;

    iput-object p3, p0, Lti/o;->F:Lwi/b;

    const/16 p1, 0xb

    invoke-direct {p0, p1}, Ld1/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final z(Lej/b;)Ljava/lang/Object;
    .locals 13

    iget v0, p1, Lej/b;->a:F

    iget v1, p1, Lej/b;->b:F

    iget-object v2, p1, Lej/b;->c:Ljava/lang/Object;

    check-cast v2, Lwi/b;

    iget-object v2, v2, Lwi/b;->a:Ljava/lang/String;

    iget-object v3, p1, Lej/b;->d:Ljava/lang/Object;

    check-cast v3, Lwi/b;

    iget-object v3, v3, Lwi/b;->a:Ljava/lang/String;

    iget v4, p1, Lej/b;->e:F

    iget v5, p1, Lej/b;->f:F

    iget v6, p1, Lej/b;->g:F

    iget-object v7, p0, Lti/o;->z:Lej/b;

    iput v0, v7, Lej/b;->a:F

    iput v1, v7, Lej/b;->b:F

    iput-object v2, v7, Lej/b;->c:Ljava/lang/Object;

    iput-object v3, v7, Lej/b;->d:Ljava/lang/Object;

    iput v4, v7, Lej/b;->e:F

    iput v5, v7, Lej/b;->f:F

    iput v6, v7, Lej/b;->g:F

    iget-object v0, p0, Lti/o;->E:Ld1/j;

    invoke-virtual {v0, v7}, Ld1/j;->z(Lej/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget v1, p1, Lej/b;->f:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    iget-object p1, p1, Lej/b;->d:Ljava/lang/Object;

    :goto_0
    check-cast p1, Lwi/b;

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lej/b;->c:Ljava/lang/Object;

    goto :goto_0

    :goto_1
    iget-object v1, p1, Lwi/b;->b:Ljava/lang/String;

    iget v2, p1, Lwi/b;->c:F

    iget v3, p1, Lwi/b;->d:I

    iget v4, p1, Lwi/b;->e:I

    iget v5, p1, Lwi/b;->f:F

    iget v6, p1, Lwi/b;->g:F

    iget v7, p1, Lwi/b;->h:I

    iget v8, p1, Lwi/b;->i:I

    iget v9, p1, Lwi/b;->j:F

    iget-boolean v10, p1, Lwi/b;->k:Z

    iget-object v11, p1, Lwi/b;->l:Landroid/graphics/PointF;

    iget-object p1, p1, Lwi/b;->m:Landroid/graphics/PointF;

    iget-object v12, p0, Lti/o;->F:Lwi/b;

    iput-object v0, v12, Lwi/b;->a:Ljava/lang/String;

    iput-object v1, v12, Lwi/b;->b:Ljava/lang/String;

    iput v2, v12, Lwi/b;->c:F

    iput v3, v12, Lwi/b;->d:I

    iput v4, v12, Lwi/b;->e:I

    iput v5, v12, Lwi/b;->f:F

    iput v6, v12, Lwi/b;->g:F

    iput v7, v12, Lwi/b;->h:I

    iput v8, v12, Lwi/b;->i:I

    iput v9, v12, Lwi/b;->j:F

    iput-boolean v10, v12, Lwi/b;->k:Z

    iput-object v11, v12, Lwi/b;->l:Landroid/graphics/PointF;

    iput-object p1, v12, Lwi/b;->m:Landroid/graphics/PointF;

    return-object v12
.end method
