.class public final Lio/sentry/android/replay/util/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Ljava/lang/Object;

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ll83/i;->y:Ll83/i;

    sget-object v1, Lio/sentry/android/replay/util/b;->x:Lio/sentry/android/replay/util/b;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/android/replay/util/c;->w:Ljava/lang/Object;

    new-instance v1, Lav/b;

    const/16 v2, 0x1a

    invoke-direct {v1, p0, v2}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/android/replay/util/c;->x:Ljava/lang/Object;

    sget-object v1, Lio/sentry/android/replay/util/b;->y:Lio/sentry/android/replay/util/b;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/replay/util/c;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Landroid/graphics/Bitmap;Lio/sentry/android/replay/viewhierarchy/g;Landroid/graphics/Matrix;)Ljava/util/List;
    .locals 7

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    if-eqz p3, :cond_1

    invoke-virtual {v5, p3}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    :cond_1
    new-instance v0, Lc4/k;

    const/4 v6, 0x2

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lc4/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Lio/sentry/android/replay/viewhierarchy/g;->a(Lc4/k;)V

    return-object v4
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/util/c;->w:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    return-void
.end method
