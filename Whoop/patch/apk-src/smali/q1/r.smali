.class public final Lq1/r;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final e:Lq1/r;

.field public static final f:Lq1/r;

.field public static final g:Lq1/r;

.field public static final h:Lq1/r;


# instance fields
.field public final synthetic d:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Lq1/r;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lq1/r;-><init>(III)V

    sput-object v0, Lq1/r;->e:Lq1/r;

    new-instance v0, Lq1/r;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v1, v2}, Lq1/r;-><init>(III)V

    sput-object v0, Lq1/r;->f:Lq1/r;

    new-instance v0, Lq1/r;

    const/4 v1, 0x2

    const/4 v2, 0x2

    invoke-direct {v0, v3, v1, v2}, Lq1/r;-><init>(III)V

    sput-object v0, Lq1/r;->g:Lq1/r;

    new-instance v0, Lq1/r;

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Lq1/r;-><init>(III)V

    sput-object v0, Lq1/r;->h:Lq1/r;

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 1

    iput p3, p0, Lq1/r;->d:I

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lq1/j0;-><init>(IIIB)V

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 2

    iget p5, p0, Lq1/r;->d:I

    packed-switch p5, :pswitch_data_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p1, p2}, Lb83/i;->b(I)I

    move-result p1

    instance-of p2, p5, Lp1/a2;

    if-eqz p2, :cond_0

    move-object p2, p5

    check-cast p2, Lp1/a2;

    iget-object v0, p4, Lx1/h;->e:Lr1/c;

    invoke-virtual {v0, p2}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object v0, p4, Lx1/h;->d:La0/w0;

    invoke-virtual {v0, p2}, La0/w0;->a(Ljava/lang/Object;)Z

    :cond_0
    iget p2, p3, Lp1/i2;->t:I

    invoke-virtual {p3, p2, p1, p5}, Lp1/i2;->J(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lp1/a2;

    if-eqz p2, :cond_1

    check-cast p1, Lp1/a2;

    invoke-virtual {p4, p1}, Lx1/h;->e(Lp1/a2;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lp1/v1;

    if-eqz p2, :cond_2

    check-cast p1, Lp1/v1;

    invoke-virtual {p1}, Lp1/v1;->d()V

    :cond_2
    :goto_0
    return-void

    :pswitch_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p5

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/a;

    invoke-virtual {p1, p2}, Lb83/i;->b(I)I

    move-result p1

    instance-of p2, p5, Lp1/a2;

    if-eqz p2, :cond_3

    move-object p2, p5

    check-cast p2, Lp1/a2;

    iget-object v1, p4, Lx1/h;->e:Lr1/c;

    invoke-virtual {v1, p2}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object v1, p4, Lx1/h;->d:La0/w0;

    invoke-virtual {v1, p2}, La0/w0;->a(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p3, v0}, Lp1/i2;->c(Lp1/a;)I

    move-result p2

    invoke-virtual {p3, p2, p1, p5}, Lp1/i2;->J(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lp1/a2;

    if-eqz p2, :cond_4

    check-cast p1, Lp1/a2;

    invoke-virtual {p4, p1}, Lx1/h;->e(Lp1/a2;)V

    goto :goto_1

    :cond_4
    instance-of p2, p1, Lp1/v1;

    if-eqz p2, :cond_5

    check-cast p1, Lp1/v1;

    invoke-virtual {p1}, Lp1/v1;->d()V

    :cond_5
    :goto_1
    return-void

    :pswitch_1
    const/4 p4, 0x0

    invoke-virtual {p1, p4}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lp1/a;

    invoke-virtual {p1, p4}, Lb83/i;->b(I)I

    move-result p1

    invoke-interface {p2}, Lp1/c;->p()V

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, p5}, Lp1/i2;->c(Lp1/a;)I

    move-result p4

    invoke-virtual {p3, p4}, Lp1/i2;->C(I)Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lp1/c;->k(ILjava/lang/Object;)V

    return-void

    :pswitch_2
    const/4 p4, 0x0

    invoke-virtual {p1, p4}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lc93/a;

    invoke-interface {p5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p5

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/a;

    invoke-virtual {p1, p4}, Lb83/i;->b(I)I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v0}, Lp1/i2;->c(Lp1/a;)I

    move-result p4

    invoke-virtual {p3, p4, p5}, Lp1/i2;->T(ILjava/lang/Object;)V

    invoke-interface {p2, p1, p5}, Lp1/c;->g(ILjava/lang/Object;)V

    invoke-interface {p2, p5}, Lp1/c;->l(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lb83/i;)Lp1/a;
    .locals 1

    iget v0, p0, Lq1/r;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lq1/j0;->f(Lb83/i;)Lp1/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/a;

    return-object p1

    :pswitch_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/a;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
