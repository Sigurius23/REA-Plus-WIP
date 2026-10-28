.class public abstract Lv4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lts/o;

.field public static final b:La0/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "TypefaceCompat static init"

    invoke-static {v0}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lv4/g;

    invoke-direct {v0}, Lts/o;-><init>()V

    sput-object v0, Lv4/e;->a:Lts/o;

    goto :goto_0

    :cond_0
    new-instance v0, Lv4/f;

    invoke-direct {v0}, Lv4/f;-><init>()V

    sput-object v0, Lv4/e;->a:Lts/o;

    :goto_0
    new-instance v0, La0/a0;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, La0/a0;-><init>(I)V

    sput-object v0, Lv4/e;->b:La0/a0;

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lu4/d;Landroid/content/res/Resources;ILjava/lang/String;IILu4/b;Z)Landroid/graphics/Typeface;
    .locals 6

    instance-of v0, p1, Lu4/g;

    if-eqz v0, :cond_a

    check-cast p1, Lu4/g;

    invoke-virtual {p1}, Lu4/g;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v3, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz v0, :cond_1

    invoke-virtual {v0, v3}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    move-object v1, v0

    :cond_1
    :goto_0
    if-eqz v1, :cond_3

    if-eqz p7, :cond_2

    invoke-virtual {p7, v1}, Lu4/b;->b(Landroid/graphics/Typeface;)V

    :cond_2
    return-object v1

    :cond_3
    const/4 v0, 0x1

    if-eqz p8, :cond_5

    invoke-virtual {p1}, Lu4/g;->b()I

    move-result v1

    if-nez v1, :cond_4

    :goto_1
    move v1, v0

    goto :goto_2

    :cond_4
    move v1, v2

    goto :goto_2

    :cond_5
    if-nez p7, :cond_4

    goto :goto_1

    :goto_2
    if-eqz p8, :cond_6

    invoke-virtual {p1}, Lu4/g;->e()I

    move-result p8

    goto :goto_3

    :cond_6
    const/4 p8, -0x1

    :goto_3
    invoke-static {}, Lu4/b;->g()Landroid/os/Handler;

    move-result-object v3

    new-instance v4, Lty/c;

    const/16 v5, 0xa

    invoke-direct {v4, p7, v5}, Lty/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1}, Lu4/g;->a()Lc5/d;

    move-result-object p7

    if-eqz p7, :cond_7

    invoke-virtual {p1}, Lu4/g;->c()Lc5/d;

    move-result-object p7

    invoke-virtual {p1}, Lu4/g;->a()Lc5/d;

    move-result-object p1

    invoke-static {p7, p1}, Lte0/d;->s(Lc5/d;Lc5/d;)Ljava/util/List;

    move-result-object p1

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Lu4/g;->c()Lc5/d;

    move-result-object p1

    invoke-static {p1}, Lte0/d;->r(Lc5/d;)Ljava/util/List;

    move-result-object p1

    :goto_4
    new-instance p7, Lio/sentry/internal/debugmeta/c;

    invoke-static {v3}, Lug/m;->s(Landroid/os/Handler;)Lc5/l;

    move-result-object v3

    const/4 v5, 0x6

    invoke-direct {p7, v5, v4, v3}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    if-eqz v1, :cond_9

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, v0, :cond_8

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc5/d;

    invoke-static {p0, p1, p7, p6, p8}, Lc5/h;->d(Landroid/content/Context;Lc5/d;Lio/sentry/internal/debugmeta/c;II)Landroid/graphics/Typeface;

    move-result-object p0

    goto :goto_5

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Fallbacks with blocking fetches are not supported for performance reasons"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    invoke-static {p0, p1, p6, p7}, Lc5/h;->c(Landroid/content/Context;Ljava/util/List;ILio/sentry/internal/debugmeta/c;)Landroid/graphics/Typeface;

    move-result-object p0

    goto :goto_5

    :cond_a
    sget-object p8, Lv4/e;->a:Lts/o;

    check-cast p1, Lu4/e;

    invoke-virtual {p8, p0, p1, p2, p6}, Lts/o;->m(Landroid/content/Context;Lu4/e;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz p7, :cond_c

    if-eqz p0, :cond_b

    invoke-virtual {p7, p0}, Lu4/b;->b(Landroid/graphics/Typeface;)V

    goto :goto_5

    :cond_b
    const/4 p1, -0x3

    invoke-virtual {p7, p1}, Lu4/b;->a(I)V

    :cond_c
    :goto_5
    if-eqz p0, :cond_d

    sget-object p1, Lv4/e;->b:La0/a0;

    invoke-static {p2, p3, p4, p5, p6}, Lv4/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    return-object p0
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
