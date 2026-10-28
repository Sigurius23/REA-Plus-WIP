.class public Lng3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng3/q;
.implements Lpm/a;
.implements Lqa/j;
.implements Lsn/r0;
.implements Lxr/l;
.implements Lt9/e;


# instance fields
.field public final synthetic w:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lng3/o;->w:I

    packed-switch p1, :pswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string p1, "TelecomPermissions"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    return-void

    .line 5
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    .line 7
    sget-object p1, Lzr/w0;->E:Lzr/w0;

    return-void

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lng3/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lgm/j;)V
    .locals 0

    const/16 p1, 0x1a

    iput p1, p0, Lng3/o;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final f(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 9

    invoke-static {p0}, Ls2/d;->p(Ljava/util/List;)Ljava/util/LinkedList;

    move-result-object p0

    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-ltz v4, :cond_0

    check-cast v5, Ljava/security/cert/X509Certificate;

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x1

    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    const-string v8, "ca_%d"

    invoke-static {v5, v8, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/Certificate;

    invoke-virtual {v0, v5, v4}, Ljava/security/KeyStore;->setCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V

    move v4, v6

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    throw v1

    :cond_1
    new-instance p1, Ljava/security/cert/X509CertSelector;

    invoke-direct {p1}, Ljava/security/cert/X509CertSelector;-><init>()V

    invoke-virtual {p0, v3}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-virtual {p1, v1}, Ljava/security/cert/X509CertSelector;->setCertificate(Ljava/security/cert/X509Certificate;)V

    new-instance v1, Ljava/security/cert/PKIXBuilderParameters;

    invoke-direct {v1, v0, p1}, Ljava/security/cert/PKIXBuilderParameters;-><init>(Ljava/security/KeyStore;Ljava/security/cert/CertSelector;)V

    invoke-virtual {v1, v3}, Ljava/security/cert/PKIXParameters;->setRevocationEnabled(Z)V

    new-instance p1, Ljava/security/cert/CollectionCertStoreParameters;

    invoke-direct {p1, p0}, Ljava/security/cert/CollectionCertStoreParameters;-><init>(Ljava/util/Collection;)V

    const-string p0, "Collection"

    invoke-static {p0, p1}, Ljava/security/cert/CertStore;->getInstance(Ljava/lang/String;Ljava/security/cert/CertStoreParameters;)Ljava/security/cert/CertStore;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/security/cert/PKIXParameters;->addCertStore(Ljava/security/cert/CertStore;)V

    const-string p0, "PKIX"

    invoke-static {p0}, Ljava/security/cert/CertPathBuilder;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertPathBuilder;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/security/cert/CertPathBuilder;->build(Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathBuilderResult;

    return-void
.end method

.method public static k(Lcom/google/android/material/tabs/TabLayout;Landroid/view/View;)Landroid/graphics/RectF;
    .locals 3

    if-nez p1, :cond_0

    new-instance p0, Landroid/graphics/RectF;

    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    return-object p0

    :cond_0
    iget-boolean p0, p0, Lcom/google/android/material/tabs/TabLayout;->h0:Z

    if-nez p0, :cond_2

    instance-of p0, p1, Lor/k;

    if-eqz p0, :cond_2

    check-cast p1, Lor/k;

    invoke-virtual {p1}, Lor/k;->getContentWidth()I

    move-result p0

    invoke-virtual {p1}, Lor/k;->getContentHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x18

    invoke-static {v1, v2}, Lcr/m;->d(Landroid/content/Context;I)F

    move-result v1

    float-to-int v1, v1

    if-ge p0, v1, :cond_1

    move p0, v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v2

    add-int/2addr v2, v1

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    add-int/2addr p1, v1

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p0, p0, 0x2

    sub-int v1, v2, p0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, p1, v0

    add-int/2addr p0, v2

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, p1

    new-instance p1, Landroid/graphics/RectF;

    int-to-float v1, v1

    int-to-float v0, v0

    int-to-float p0, p0

    int-to-float v2, v2

    invoke-direct {p1, v1, v0, p0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1

    :cond_2
    new-instance p0, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    int-to-float p1, p1

    invoke-direct {p0, v0, v1, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p0
.end method

.method public static m(Lj43/c;Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p0, p0, Lj43/c;->e:Z

    if-eqz p0, :cond_0

    sget-object p0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Lt23/i3;->a:Lt23/i3;

    :cond_0
    return-void
.end method

.method public static n(Ljava/lang/String;)Lo33/b;
    .locals 5

    const-string v0, "alias"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lo33/b;->values()[Lo33/b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lo33/b;->w:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    sget-object p0, Lo33/b;->y:Lo33/b;

    return-object p0

    :cond_2
    return-object v3
.end method

.method public static o(Ljava/lang/String;)Lr30/j;
    .locals 3

    sget-object v0, Lr30/j;->J:Lt83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lr30/j;

    iget-object v2, v2, Lr30/j;->w:Ljava/lang/String;

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lr30/j;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lng3/n;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(J)J
    .locals 0

    return-wide p1
.end method

.method public e(Lxl/a;Lum/c;I)I
    .locals 0

    const/4 p1, 0x4

    iput p1, p2, La9/a;->x:I

    const/4 p1, -0x4

    return p1
.end method

.method public g(Lu8/p;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getTime()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method

.method public h(Lu8/p;)Lqa/l;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This SubtitleParser.Factory doesn\'t support any formats."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i(Lu8/p;)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public j(J)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public l(Lng3/k;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lng3/o;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lng3/a;->W:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->a(Lng3/m;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    sget-object v0, Lng3/p;->a:Lg73/a;

    invoke-interface {p1, v0}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljg3/o;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lng3/p;->e:Lng3/n;

    invoke-interface {p1, v0}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljg3/o;

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public p(Lcom/google/android/material/tabs/TabLayout;Landroid/view/View;Landroid/view/View;FLandroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-static {p1, p2}, Lng3/o;->k(Lcom/google/android/material/tabs/TabLayout;Landroid/view/View;)Landroid/graphics/RectF;

    move-result-object p2

    invoke-static {p1, p3}, Lng3/o;->k(Lcom/google/android/material/tabs/TabLayout;Landroid/view/View;)Landroid/graphics/RectF;

    move-result-object p1

    iget p3, p2, Landroid/graphics/RectF;->left:F

    float-to-int p3, p3

    iget v0, p1, Landroid/graphics/RectF;->left:F

    float-to-int v0, v0

    invoke-static {p4, p3, v0}, Lkq/a;->c(FII)I

    move-result p3

    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->top:I

    iget p2, p2, Landroid/graphics/RectF;->right:F

    float-to-int p2, p2

    iget p1, p1, Landroid/graphics/RectF;->right:F

    float-to-int p1, p1

    invoke-static {p4, p2, p1}, Lkq/a;->c(FII)I

    move-result p1

    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p2

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p5, p3, v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    return-void
.end method
