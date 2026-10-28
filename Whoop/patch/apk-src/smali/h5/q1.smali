.class public final Lh5/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lh5/q1;


# instance fields
.field public final a:Lh5/o1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, Lh5/n1;->q:Lh5/q1;

    sput-object v0, Lh5/q1;->b:Lh5/q1;

    return-void

    :cond_0
    sget-object v0, Lh5/o1;->b:Lh5/q1;

    sput-object v0, Lh5/q1;->b:Lh5/q1;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lh5/n1;

    invoke-direct {v0, p0, p1}, Lh5/n1;-><init>(Lh5/q1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lh5/q1;->a:Lh5/o1;

    return-void

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lh5/l1;

    invoke-direct {v0, p0, p1}, Lh5/l1;-><init>(Lh5/q1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lh5/q1;->a:Lh5/o1;

    return-void

    .line 5
    :cond_1
    new-instance v0, Lh5/k1;

    invoke-direct {v0, p0, p1}, Lh5/k1;-><init>(Lh5/q1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lh5/q1;->a:Lh5/o1;

    return-void
.end method

.method public constructor <init>(Lh5/q1;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    .line 7
    iget-object p1, p1, Lh5/q1;->a:Lh5/o1;

    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, Lh5/n1;

    if-eqz v1, :cond_0

    .line 9
    new-instance v0, Lh5/n1;

    move-object v1, p1

    check-cast v1, Lh5/n1;

    invoke-direct {v0, p0, v1}, Lh5/n1;-><init>(Lh5/q1;Lh5/n1;)V

    iput-object v0, p0, Lh5/q1;->a:Lh5/o1;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 10
    instance-of v0, p1, Lh5/l1;

    if-eqz v0, :cond_1

    .line 11
    new-instance v0, Lh5/l1;

    move-object v1, p1

    check-cast v1, Lh5/l1;

    invoke-direct {v0, p0, v1}, Lh5/l1;-><init>(Lh5/q1;Lh5/l1;)V

    iput-object v0, p0, Lh5/q1;->a:Lh5/o1;

    goto :goto_0

    .line 12
    :cond_1
    instance-of v0, p1, Lh5/k1;

    if-eqz v0, :cond_2

    .line 13
    new-instance v0, Lh5/k1;

    move-object v1, p1

    check-cast v1, Lh5/k1;

    invoke-direct {v0, p0, v1}, Lh5/k1;-><init>(Lh5/q1;Lh5/k1;)V

    iput-object v0, p0, Lh5/q1;->a:Lh5/o1;

    goto :goto_0

    .line 14
    :cond_2
    instance-of v0, p1, Lh5/j1;

    if-eqz v0, :cond_3

    .line 15
    new-instance v0, Lh5/j1;

    move-object v1, p1

    check-cast v1, Lh5/j1;

    invoke-direct {v0, p0, v1}, Lh5/j1;-><init>(Lh5/q1;Lh5/j1;)V

    iput-object v0, p0, Lh5/q1;->a:Lh5/o1;

    goto :goto_0

    .line 16
    :cond_3
    instance-of v0, p1, Lh5/i1;

    if-eqz v0, :cond_4

    .line 17
    new-instance v0, Lh5/i1;

    move-object v1, p1

    check-cast v1, Lh5/i1;

    invoke-direct {v0, p0, v1}, Lh5/i1;-><init>(Lh5/q1;Lh5/i1;)V

    iput-object v0, p0, Lh5/q1;->a:Lh5/o1;

    goto :goto_0

    .line 18
    :cond_4
    new-instance v0, Lh5/o1;

    invoke-direct {v0, p0}, Lh5/o1;-><init>(Lh5/q1;)V

    iput-object v0, p0, Lh5/q1;->a:Lh5/o1;

    .line 19
    :goto_0
    invoke-virtual {p1, p0}, Lh5/o1;->e(Lh5/q1;)V

    return-void

    .line 20
    :cond_5
    new-instance p1, Lh5/o1;

    invoke-direct {p1, p0}, Lh5/o1;-><init>(Lh5/q1;)V

    iput-object p1, p0, Lh5/q1;->a:Lh5/o1;

    return-void
.end method

.method public static e(Lv4/b;IIII)Lv4/b;
    .locals 5

    iget v0, p0, Lv4/b;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, Lv4/b;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lv4/b;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, Lv4/b;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, Lv4/b;->b(IIII)Lv4/b;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/view/View;Landroid/view/WindowInsets;)Lh5/q1;
    .locals 2

    new-instance v0, Lh5/q1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p1}, Lh5/q1;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, Lh5/i0;->a(Landroid/view/View;)Lh5/q1;

    move-result-object p1

    iget-object v1, v0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v1, p1}, Lh5/o1;->t(Lh5/q1;)V

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v1, p0}, Lh5/o1;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v0}, Lh5/o1;->l()Lv4/b;

    move-result-object v0

    iget v0, v0, Lv4/b;->d:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v0}, Lh5/o1;->l()Lv4/b;

    move-result-object v0

    iget v0, v0, Lv4/b;->a:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v0}, Lh5/o1;->l()Lv4/b;

    move-result-object v0

    iget v0, v0, Lv4/b;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v0}, Lh5/o1;->l()Lv4/b;

    move-result-object v0

    iget v0, v0, Lv4/b;->b:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lh5/q1;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lh5/q1;

    iget-object v0, p0, Lh5/q1;->a:Lh5/o1;

    iget-object p1, p1, Lh5/q1;->a:Lh5/o1;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(IIII)Lh5/q1;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Lh5/g1;

    invoke-direct {v0, p0}, Lh5/g1;-><init>(Lh5/q1;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Lh5/f1;

    invoke-direct {v0, p0}, Lh5/f1;-><init>(Lh5/q1;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lh5/e1;

    invoke-direct {v0, p0}, Lh5/e1;-><init>(Lh5/q1;)V

    :goto_0
    invoke-static {p1, p2, p3, p4}, Lv4/b;->b(IIII)Lv4/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh5/h1;->g(Lv4/b;)V

    invoke-virtual {v0}, Lh5/h1;->b()Lh5/q1;

    move-result-object p1

    return-object p1
.end method

.method public final g()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, Lh5/q1;->a:Lh5/o1;

    instance-of v1, v0, Lh5/i1;

    if-eqz v1, :cond_0

    check-cast v0, Lh5/i1;

    iget-object v0, v0, Lh5/i1;->c:Landroid/view/WindowInsets;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lh5/q1;->a:Lh5/o1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lh5/o1;->hashCode()I

    move-result v0

    return v0
.end method
