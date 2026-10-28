.class public interface abstract Lh0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lh0/r;->a:Lh0/r;

    sput-object v0, Lh0/s;->a:Lh0/r;

    return-void
.end method

.method public static b()Ld0/i1;
    .locals 1

    sget-object v0, Lh0/s;->a:Lh0/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lh0/r;->b:Ld0/i1;

    return-object v0
.end method


# virtual methods
.method public a(FFF)F
    .locals 2

    sget-object v0, Lh0/s;->a:Lh0/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-float/2addr p2, p1

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-ltz v1, :cond_0

    cmpg-float v1, p2, p3

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    cmpl-float v1, p2, p3

    if-lez v1, :cond_1

    :goto_0
    return v0

    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sub-float/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpg-float p3, v0, p3

    if-gez p3, :cond_2

    return p1

    :cond_2
    return p2
.end method
