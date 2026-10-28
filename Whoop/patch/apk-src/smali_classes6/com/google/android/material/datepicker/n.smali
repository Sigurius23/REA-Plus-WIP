.class public final Lcom/google/android/material/datepicker/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u;
.implements Ldn/d;
.implements Lko/k;
.implements Lna/b;
.implements Lp1/c;
.implements Lq3/r;


# instance fields
.field public final synthetic w:I

.field public final x:I

.field public y:I

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x5

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Lio/sentry/internal/debugmeta/c;

    const/16 v1, 0x17

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/internal/debugmeta/c;-><init>(IB)V

    iput-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    const/16 v0, 0x1f40

    .line 11
    iput v0, p0, Lcom/google/android/material/datepicker/n;->x:I

    .line 12
    iput v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    const/4 v1, 0x1

    aput p1, v0, v1

    const/4 v1, 0x0

    aput p2, v0, v1

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    iput-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    .line 3
    iput p1, p0, Lcom/google/android/material/datepicker/n;->x:I

    .line 4
    iput p2, p0, Lcom/google/android/material/datepicker/n;->y:I

    return-void
.end method

.method public constructor <init>(IILc93/a;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/material/datepicker/n;->x:I

    iput p2, p0, Lcom/google/android/material/datepicker/n;->y:I

    iput-object p3, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;II)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/material/datepicker/n;->x:I

    iput p3, p0, Lcom/google/android/material/datepicker/n;->y:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/material/datepicker/n;->x:I

    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/material/datepicker/n;->y:I

    return-void
.end method

.method public constructor <init>(Ldn/b;Lrm/c0;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iget-object p1, p1, Ldn/b;->y:Led3/a;

    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    const/16 v0, 0xc

    .line 22
    invoke-virtual {p1, v0}, Led3/a;->K(I)V

    .line 23
    invoke-virtual {p1}, Led3/a;->B()I

    move-result v0

    .line 24
    const-string v1, "audio/raw"

    iget-object v2, p2, Lrm/c0;->L:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 25
    iget v1, p2, Lrm/c0;->a0:I

    iget p2, p2, Lrm/c0;->Y:I

    invoke-static {v1, p2}, Llo/y;->r(II)I

    move-result p2

    if-eqz v0, :cond_0

    .line 26
    rem-int v1, v0, p2

    if-eqz v1, :cond_1

    .line 27
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x58

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Audio sample size mismatch. stsd sample size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", stsz sample size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 28
    const-string v1, "AtomParsers"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, p2

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, -0x1

    .line 29
    :cond_2
    iput v0, p0, Lcom/google/android/material/datepicker/n;->x:I

    .line 30
    invoke-virtual {p1}, Led3/a;->B()I

    move-result p1

    iput p1, p0, Lcom/google/android/material/datepicker/n;->y:I

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Lcom/google/android/material/datepicker/n;->x:I

    return-void
.end method

.method public constructor <init>(Lp1/c;I)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/material/datepicker/n;->x:I

    return-void
.end method

.method public constructor <init>(Lq3/r;II)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    .line 15
    iput p2, p0, Lcom/google/android/material/datepicker/n;->x:I

    .line 16
    iput p3, p0, Lcom/google/android/material/datepicker/n;->y:I

    return-void
.end method

.method public constructor <init>(Ly8/d;Lu8/p;)V
    .locals 3

    const/4 v0, 0x6

    iput v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iget-object p1, p1, Ly8/d;->y:Lx8/n;

    iput-object p1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    const/16 v0, 0xc

    .line 33
    invoke-virtual {p1, v0}, Lx8/n;->F(I)V

    .line 34
    invoke-virtual {p1}, Lx8/n;->x()I

    move-result v0

    .line 35
    const-string v1, "audio/raw"

    iget-object v2, p2, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 36
    iget v1, p2, Lu8/p;->F:I

    iget p2, p2, Lu8/p;->D:I

    .line 37
    invoke-static {v1}, Lx8/t;->r(I)I

    move-result v1

    mul-int/2addr v1, p2

    if-eqz v0, :cond_0

    .line 38
    rem-int p2, v0, v1

    if-eqz p2, :cond_1

    .line 39
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "Audio sample size mismatch. stsd sample size: "

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", stsz sample size: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "BoxParsers"

    invoke-static {v0, p2}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, -0x1

    .line 40
    :cond_2
    iput v0, p0, Lcom/google/android/material/datepicker/n;->x:I

    .line 41
    invoke-virtual {p1}, Lx8/n;->x()I

    move-result p1

    iput p1, p0, Lcom/google/android/material/datepicker/n;->y:I

    return-void
.end method

.method public static u(Ljava/io/BufferedReader;)Lcom/google/android/material/datepicker/n;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lio/sentry/android/core/internal/threaddump/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v1, v2, Lio/sentry/android/core/internal/threaddump/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/google/android/material/datepicker/n;

    invoke-direct {p0, v0}, Lcom/google/android/material/datepicker/n;-><init>(Ljava/util/ArrayList;)V

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 2

    iget v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, -0x1

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lx8/n;

    invoke-virtual {v0}, Lx8/n;->x()I

    move-result v1

    :cond_0
    return v1

    :pswitch_0
    const/4 v0, -0x1

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Led3/a;

    invoke-virtual {v0}, Led3/a;->B()I

    move-result v1

    :cond_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcom/google/android/material/datepicker/n;->x:I

    return v0

    :pswitch_0
    iget v0, p0, Lcom/google/android/material/datepicker/n;->x:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    return v0

    :pswitch_0
    iget v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public createDataSource()Lko/l;
    .locals 4

    new-instance v0, Lko/u;

    iget v1, p0, Lcom/google/android/material/datepicker/n;->y:I

    iget-object v2, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v2, Lio/sentry/internal/debugmeta/c;

    iget v3, p0, Lcom/google/android/material/datepicker/n;->x:I

    invoke-direct {v0, v3, v1, v2}, Lko/u;-><init>(IILio/sentry/internal/debugmeta/c;)V

    return-object v0
.end method

.method public d(Ljava/lang/Object;Lc93/m;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c;

    invoke-interface {v0, p1, p2}, Lp1/c;->d(Ljava/lang/Object;Lc93/m;)V

    return-void
.end method

.method public e(III)V
    .locals 2

    iget v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/material/datepicker/n;->x:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-interface {v1, p1, p2, p3}, Lp1/c;->e(III)V

    return-void
.end method

.method public f(II)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c;

    iget v1, p0, Lcom/google/android/material/datepicker/n;->y:I

    if-nez v1, :cond_0

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lp1/c;->f(II)V

    return-void
.end method

.method public g(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c;

    iget v1, p0, Lcom/google/android/material/datepicker/n;->y:I

    if-nez v1, :cond_0

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lp1/c;->g(ILjava/lang/Object;)V

    return-void
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c;

    invoke-interface {v0}, Lp1/c;->i()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public j(II)B
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, [[B

    aget-object p2, v0, p2

    aget-byte p1, p2, p1

    return p1
.end method

.method public k(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c;

    iget v1, p0, Lcom/google/android/material/datepicker/n;->y:I

    if-nez v1, :cond_0

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lp1/c;->k(ILjava/lang/Object;)V

    return-void
.end method

.method public l(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c;

    invoke-interface {v0, p1}, Lp1/c;->l(Ljava/lang/Object;)V

    return-void
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c;

    invoke-interface {v0}, Lp1/c;->m()V

    return-void
.end method

.method public n(I)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lq3/r;

    invoke-interface {v0, p1}, Lq3/r;->n(I)I

    move-result v0

    if-ltz p1, :cond_0

    iget v1, p0, Lcom/google/android/material/datepicker/n;->y:I

    if-gt p1, v1, :cond_0

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    invoke-static {v0, v1, p1}, Lu0/u1;->c(III)V

    :cond_0
    return v0
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 4

    iget-object p1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    const/4 v0, 0x7

    iget-object v1, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v1, v0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v0

    iget v0, v0, Lv4/b;->b:I

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    add-int/2addr v1, v0

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, p0, Lcom/google/android/material/datepicker/n;->y:I

    add-int/2addr v2, v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method

.method public p()V
    .locals 1

    iget v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "OffsetApplier up called with no corresponding down"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_1
    iget v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c;

    invoke-interface {v0}, Lp1/c;->p()V

    return-void
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    return v0
.end method

.method public r()Lc93/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    return-object v0
.end method

.method public s()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/datepicker/n;->x:I

    return v0
.end method

.method public t()Lio/sentry/android/core/internal/threaddump/a;
    .locals 3

    iget v0, p0, Lcom/google/android/material/datepicker/n;->y:I

    if-ltz v0, :cond_0

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/google/android/material/datepicker/n;->y:I

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/core/internal/threaddump/a;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lcom/google/android/material/datepicker/n;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    mul-int/lit8 v2, v1, 0x2

    iget v3, p0, Lcom/google/android/material/datepicker/n;->y:I

    mul-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_3

    iget-object v5, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v5, [[B

    aget-object v5, v5, v4

    move v6, v2

    :goto_1
    if-ge v6, v1, :cond_2

    aget-byte v7, v5, v6

    if-eqz v7, :cond_1

    const/4 v8, 0x1

    if-eq v7, v8, :cond_0

    const-string v7, "  "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    const-string v7, " 1"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    const-string v7, " 0"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    const/16 v5, 0xa

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public v(III)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, [[B

    aget-object p2, v0, p2

    int-to-byte p3, p3

    aput-byte p3, p2, p1

    return-void
.end method

.method public x(I)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v0, Lq3/r;

    invoke-interface {v0, p1}, Lq3/r;->x(I)I

    move-result v0

    if-ltz p1, :cond_0

    iget v1, p0, Lcom/google/android/material/datepicker/n;->x:I

    if-gt p1, v1, :cond_0

    iget v1, p0, Lcom/google/android/material/datepicker/n;->y:I

    invoke-static {v0, v1, p1}, Lu0/u1;->b(III)V

    :cond_0
    return v0
.end method
