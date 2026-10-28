.class public final Le4/c;
.super Lf93/b;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le4/e;F)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le4/c;->w:I

    .line 4
    iput-object p1, p0, Le4/c;->x:Ljava/lang/Object;

    .line 5
    new-instance p1, Ly3/f;

    invoke-direct {p1, p2}, Ly3/f;-><init>(F)V

    .line 6
    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Le4/e;Le4/n;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le4/c;->w:I

    .line 2
    iput-object p1, p0, Le4/c;->x:Ljava/lang/Object;

    .line 3
    invoke-direct {p0, p2}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lxa3/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Le4/c;->w:I

    iput-object p2, p0, Le4/c;->x:Ljava/lang/Object;

    .line 1
    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Le4/c;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lf93/b;->afterChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p2, Ly3/f;

    iget p2, p2, Ly3/f;->w:F

    check-cast p3, Ly3/f;

    iget p2, p3, Ly3/f;->w:F

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-nez p3, :cond_0

    iget-object p3, p0, Le4/c;->x:Ljava/lang/Object;

    check-cast p3, Le4/e;

    iget-object p3, p3, Le4/e;->b:Li4/g;

    invoke-interface {p1}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Li4/e;

    invoke-direct {v0, p2}, Li4/e;-><init>(F)V

    invoke-virtual {p3, p1, v0}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    :cond_0
    return-void

    :pswitch_1
    check-cast p2, Le4/n;

    check-cast p3, Le4/n;

    iget-object p2, p0, Le4/c;->x:Ljava/lang/Object;

    check-cast p2, Le4/e;

    iget-object p2, p2, Le4/e;->b:Li4/g;

    invoke-interface {p1}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p3, Le4/n;->a:La3/p;

    iget-object v1, p3, Le4/n;->c:La3/p;

    iget-object p3, p3, Le4/n;->b:La3/p;

    iget-object v2, p3, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Ly3/f;

    if-nez v2, :cond_1

    iget-object v2, p3, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    iget-object v2, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Ly3/f;

    if-nez v2, :cond_1

    iget-object v2, v1, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    invoke-virtual {v0}, La3/p;->c()Li4/c;

    move-result-object p3

    goto :goto_2

    :cond_1
    new-instance v2, Li4/g;

    const/4 v3, 0x0

    new-array v3, v3, [C

    invoke-direct {v2, v3}, Li4/b;-><init>([C)V

    iget-object v3, p3, La3/p;->x:Ljava/lang/Object;

    check-cast v3, Ly3/f;

    if-nez v3, :cond_2

    iget-object v3, p3, La3/p;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    const-string v3, "min"

    invoke-virtual {p3}, La3/p;->c()Li4/c;

    move-result-object p3

    invoke-virtual {v2, v3, p3}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    :goto_0
    iget-object p3, v1, La3/p;->x:Ljava/lang/Object;

    check-cast p3, Ly3/f;

    if-nez p3, :cond_3

    iget-object p3, v1, La3/p;->y:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_3

    goto :goto_1

    :cond_3
    const-string p3, "max"

    invoke-virtual {v1}, La3/p;->c()Li4/c;

    move-result-object v1

    invoke-virtual {v2, p3, v1}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    :goto_1
    const-string p3, "value"

    invoke-virtual {v0}, La3/p;->c()Li4/c;

    move-result-object v0

    invoke-virtual {v2, p3, v0}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    move-object p3, v2

    :goto_2
    invoke-virtual {p2, p1, p3}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Le4/c;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lf93/b;->beforeChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    const-string p2, "property"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le4/c;->x:Ljava/lang/Object;

    check-cast p1, Lxa3/l;

    iget-boolean p1, p1, Lxa3/l;->a:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot modify readonly DescriptorRendererOptions"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
