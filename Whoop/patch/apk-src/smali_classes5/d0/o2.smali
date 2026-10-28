.class public final Ld0/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/i2;
.implements Ldp/a;
.implements Lf93/c;
.implements Lrl/c;
.implements Luc3/e;


# instance fields
.field public final synthetic w:I

.field public x:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Ld0/o2;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x3

    iput p1, p0, Ld0/o2;->x:I

    return-void

    .line 2
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 3
    new-array p1, p1, [Ljava/lang/Object;

    .line 4
    sget-object v0, Lm83/y;->w:Lm83/y;

    const v1, 0x7f140fef

    .line 5
    invoke-static {v1, p1, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    const/16 p1, 0x8

    .line 6
    iput p1, p0, Ld0/o2;->x:I

    return-void

    .line 7
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 8
    iput p1, p0, Ld0/o2;->x:I

    return-void

    .line 9
    :sswitch_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput p1, p0, Ld0/o2;->x:I

    return-void

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_2
        0x7 -> :sswitch_1
        0xa -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 12
    iput p2, p0, Ld0/o2;->w:I

    iput p1, p0, Ld0/o2;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 3

    iget v0, p0, Ld0/o2;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expected at most "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ld0/o2;->x:I

    const-string v2, " digits"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expected at least "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ld0/o2;->x:I

    const-string v2, " digits"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;Z)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public e(Ljava/lang/Object;Lql/b;)Z
    .locals 3

    check-cast p1, Landroid/graphics/drawable/Drawable;

    iget-object p2, p2, Lql/k;->x:Landroid/view/View;

    move-object v0, p2

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    :cond_0
    new-instance v2, Landroid/graphics/drawable/TransitionDrawable;

    filled-new-array {v0, p1}, [Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-direct {v2, p1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    iget p1, p0, Ld0/o2;->x:I

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    check-cast p2, Landroid/widget/ImageView;

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public g()Lu8/d;
    .locals 2

    new-instance v0, Lu8/d;

    iget v1, p0, Ld0/o2;->x:I

    invoke-direct {v0, v1}, Lu8/d;-><init>(I)V

    return-object v0
.end method

.method public getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lrb3/d;

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lrb3/d;->w:Lrb3/a;

    iget p2, p0, Ld0/o2;->x:I

    invoke-virtual {p1, p2}, Lrb3/a;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 4

    iget p5, p0, Ld0/o2;->x:I

    int-to-long v0, p5

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    return-object p3

    :cond_0
    return-object p4
.end method

.method public i()I
    .locals 1

    iget v0, p0, Ld0/o2;->x:I

    return v0
.end method

.method public j(Ly00/i;Ljava/util/List;Ljava/lang/String;I)Lg40/s3;
    .locals 2

    const-string p2, "brand"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "number"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly00/i;->b()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    sget-object p1, Lg40/t3;->b:Lg40/t3;

    return-object p1

    :cond_1
    sget-object v0, Ly00/i;->X:Ly00/i;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p1, p4, :cond_4

    new-instance p1, Lg40/x3;

    invoke-direct {p1, v1}, Lg40/x3;-><init>(Lg40/g1;)V

    return-object p1

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, p4, :cond_3

    new-instance p1, Lg40/x3;

    invoke-direct {p1, v1}, Lg40/x3;-><init>(Lg40/g1;)V

    return-object p1

    :cond_3
    if-eqz p2, :cond_5

    iget-object p1, p1, Ly00/i;->F:Ljava/util/Set;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    sget-object p1, Lg40/y3;->a:Lg40/y3;

    return-object p1

    :cond_5
    const p1, 0x7f141020

    if-eqz p2, :cond_6

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, p4, :cond_6

    new-instance p2, Lg40/u3;

    invoke-direct {p2, p1}, Lg40/u3;-><init>(I)V

    return-object p2

    :cond_6
    const/4 v0, 0x6

    if-eqz p2, :cond_7

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    if-le p2, p4, :cond_7

    new-instance p2, Lg40/v3;

    invoke-direct {p2, p1, v0, v1}, Lg40/v3;-><init>(IILjava/util/List;)V

    return-object p2

    :cond_7
    new-instance p2, Lg40/v3;

    invoke-direct {p2, p1, v0, v1}, Lg40/v3;-><init>(IILjava/util/List;)V

    return-object p2
.end method

.method public k(Landroid/content/Context;Ljava/lang/String;)I
    .locals 0

    iget p1, p0, Ld0/o2;->x:I

    return p1
.end method

.method public l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 0

    return-object p5
.end method

.method public n()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ld0/o2;->x:I

    return-void
.end method

.method public o(I)V
    .locals 1

    if-eqz p1, :cond_2

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/16 v0, 0x17

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "Invalid environment value "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p1, 0x0

    :cond_2
    :goto_0
    iput p1, p0, Ld0/o2;->x:I

    return-void
.end method
