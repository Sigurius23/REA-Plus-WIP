.class public abstract Lm4/l;
.super Lm4/j;
.source "SourceFile"


# instance fields
.field public A0:I

.field public B0:I

.field public final C0:Ln4/b;

.field public D0:Ln4/c;

.field public t0:I

.field public u0:I

.field public v0:I

.field public w0:I

.field public x0:I

.field public y0:I

.field public z0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lm4/j;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lm4/l;->t0:I

    iput v0, p0, Lm4/l;->u0:I

    iput v0, p0, Lm4/l;->v0:I

    iput v0, p0, Lm4/l;->w0:I

    iput v0, p0, Lm4/l;->x0:I

    iput v0, p0, Lm4/l;->y0:I

    iput-boolean v0, p0, Lm4/l;->z0:Z

    iput v0, p0, Lm4/l;->A0:I

    iput v0, p0, Lm4/l;->B0:I

    new-instance v0, Ln4/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lm4/l;->C0:Ln4/b;

    const/4 v0, 0x0

    iput-object v0, p0, Lm4/l;->D0:Ln4/c;

    return-void
.end method


# virtual methods
.method public final X()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lm4/j;->s0:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lm4/j;->r0:[Lm4/e;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, v1, Lm4/e;->G:Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abstract Y(IIII)V
.end method

.method public final Z(IIIILm4/e;)V
    .locals 2

    :goto_0
    iget-object v0, p0, Lm4/l;->D0:Ln4/c;

    if-nez v0, :cond_0

    iget-object v1, p0, Lm4/e;->U:Lm4/f;

    if-eqz v1, :cond_0

    iget-object v0, v1, Lm4/f;->v0:Ln4/c;

    iput-object v0, p0, Lm4/l;->D0:Ln4/c;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lm4/l;->C0:Ln4/b;

    iput p1, v1, Ln4/b;->a:I

    iput p3, v1, Ln4/b;->b:I

    iput p2, v1, Ln4/b;->c:I

    iput p4, v1, Ln4/b;->d:I

    invoke-interface {v0, p5, v1}, Ln4/c;->a(Lm4/e;Ln4/b;)V

    iget p1, v1, Ln4/b;->e:I

    invoke-virtual {p5, p1}, Lm4/e;->S(I)V

    iget p1, v1, Ln4/b;->f:I

    invoke-virtual {p5, p1}, Lm4/e;->N(I)V

    iget-boolean p1, v1, Ln4/b;->h:Z

    iput-boolean p1, p5, Lm4/e;->F:Z

    iget p1, v1, Ln4/b;->g:I

    invoke-virtual {p5, p1}, Lm4/e;->J(I)V

    return-void
.end method
