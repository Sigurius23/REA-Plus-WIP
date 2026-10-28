.class public final Lq20/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Landroid/graphics/drawable/ShapeDrawable;


# instance fields
.field public final a:Landroid/content/res/Resources;

.field public final b:Lm40/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    sput-object v0, Lq20/l;->c:Landroid/graphics/drawable/ShapeDrawable;

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lm40/w;)V
    .locals 1

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq20/l;->a:Landroid/content/res/Resources;

    iput-object p2, p0, Lq20/l;->b:Lm40/w;

    return-void
.end method

.method public static final b(Lq20/l;ILjava/lang/Integer;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lq20/k;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lq20/k;

    iget v1, v0, Lq20/k;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq20/k;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq20/k;

    invoke-direct {v0, p4}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lq20/k;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq20/k;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lq20/k;->y:I

    iget-object p2, v0, Lq20/k;->x:Ljava/lang/Integer;

    iget-object p0, v0, Lq20/k;->w:Lq20/l;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p3, p4, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Lq20/l;->b:Lm40/w;

    iput-object p0, v0, Lq20/k;->w:Lq20/l;

    iput-object p2, v0, Lq20/k;->x:Ljava/lang/Integer;

    iput p1, v0, Lq20/k;->y:I

    iput v3, v0, Lq20/k;->E:I

    invoke-virtual {p4, p3, v0}, Lm40/w;->h(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    instance-of p4, p3, Ll83/m;

    if-eqz p4, :cond_4

    const/4 p3, 0x0

    :cond_4
    check-cast p3, Landroid/graphics/Bitmap;

    if-eqz p3, :cond_5

    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object p0, p0, Lq20/l;->a:Landroid/content/res/Resources;

    invoke-direct {p1, p0, p3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object p1

    :cond_5
    invoke-static {p0, p1, p2}, Lq20/l;->c(Lq20/l;ILjava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lq20/l;ILjava/lang/Integer;)Landroid/graphics/drawable/Drawable;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lq20/l;->a:Landroid/content/res/Resources;

    invoke-virtual {p0}, Lq20/l;->a()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p0, Lu4/k;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_2
    instance-of p1, p0, Ll83/m;

    if-eqz p1, :cond_2

    goto :goto_3

    :cond_2
    move-object v0, p0

    :goto_3
    check-cast v0, Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_3

    sget-object v0, Lq20/l;->c:Landroid/graphics/drawable/ShapeDrawable;

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 4

    iget-object v0, p0, Lq20/l;->a:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ld40/p;->b:Ld40/n;

    iget-wide v0, v0, Ld40/n;->a:J

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
