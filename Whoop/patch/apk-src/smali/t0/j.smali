.class public abstract Lt0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x32

    invoke-static {v0}, Lt0/j;->b(I)Lt0/i;

    move-result-object v0

    sput-object v0, Lt0/j;->a:Lt0/i;

    return-void
.end method

.method public static final a(F)Lt0/i;
    .locals 1

    new-instance v0, Lt0/h;

    invoke-direct {v0, p0}, Lt0/h;-><init>(F)V

    new-instance p0, Lt0/i;

    invoke-direct {p0, v0, v0, v0, v0}, Lt0/a;-><init>(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)V

    return-object p0
.end method

.method public static final b(I)Lt0/i;
    .locals 1

    invoke-static {p0}, Lt0/d;->a(I)Lt0/g;

    move-result-object p0

    new-instance v0, Lt0/i;

    invoke-direct {v0, p0, p0, p0, p0}, Lt0/a;-><init>(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)V

    return-object v0
.end method

.method public static final c(IIII)Lt0/i;
    .locals 1

    new-instance v0, Lt0/i;

    invoke-static {p0}, Lt0/d;->a(I)Lt0/g;

    move-result-object p0

    invoke-static {p1}, Lt0/d;->a(I)Lt0/g;

    move-result-object p1

    invoke-static {p2}, Lt0/d;->a(I)Lt0/g;

    move-result-object p2

    invoke-static {p3}, Lt0/d;->a(I)Lt0/g;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Lt0/a;-><init>(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)V

    return-object v0
.end method

.method public static synthetic d(I)Lt0/i;
    .locals 5

    and-int/lit8 v0, p0, 0x1

    const/16 v1, 0x32

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v3, p0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, p0, 0x4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move v4, v1

    :goto_2
    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_3

    move v1, v2

    :cond_3
    invoke-static {v0, v3, v4, v1}, Lt0/j;->c(IIII)Lt0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final e(F)Lt0/i;
    .locals 1

    new-instance v0, Lt0/e;

    invoke-direct {v0, p0}, Lt0/e;-><init>(F)V

    new-instance p0, Lt0/i;

    invoke-direct {p0, v0, v0, v0, v0}, Lt0/a;-><init>(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)V

    return-object p0
.end method

.method public static final f(FFFF)Lt0/i;
    .locals 2

    new-instance v0, Lt0/i;

    new-instance v1, Lt0/e;

    invoke-direct {v1, p0}, Lt0/e;-><init>(F)V

    new-instance p0, Lt0/e;

    invoke-direct {p0, p1}, Lt0/e;-><init>(F)V

    new-instance p1, Lt0/e;

    invoke-direct {p1, p2}, Lt0/e;-><init>(F)V

    new-instance p2, Lt0/e;

    invoke-direct {p2, p3}, Lt0/e;-><init>(F)V

    invoke-direct {v0, v1, p0, p1, p2}, Lt0/a;-><init>(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)V

    return-object v0
.end method

.method public static g(FFFFI)Lt0/i;
    .locals 2

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p0, v1

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    int-to-float p1, v1

    :cond_1
    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_2

    int-to-float p2, v1

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    int-to-float p3, v1

    :cond_3
    invoke-static {p0, p1, p2, p3}, Lt0/j;->f(FFFF)Lt0/i;

    move-result-object p0

    return-object p0
.end method
