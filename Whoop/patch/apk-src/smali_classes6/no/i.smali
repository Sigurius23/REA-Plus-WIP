.class public final Lno/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:[F

.field public static final j:[F

.field public static final k:[F


# instance fields
.field public a:I

.field public b:Lno/h;

.field public c:Lab/i0;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x9

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    sput-object v1, Lno/i;->i:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_1

    sput-object v1, Lno/i;->j:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_2

    sput-object v0, Lno/i;->k:[F

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x41000000    # -0.5f
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static a(Lno/g;)Z
    .locals 4

    iget-object v0, p0, Lno/g;->a:Lno/e;

    iget-object p0, p0, Lno/g;->b:Lno/e;

    iget-object v0, v0, Lno/e;->a:[Lno/f;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    aget-object v0, v0, v2

    iget v0, v0, Lno/f;->a:I

    if-nez v0, :cond_0

    iget-object p0, p0, Lno/e;->a:[Lno/f;

    array-length v0, p0

    if-ne v0, v3, :cond_0

    aget-object p0, p0, v2

    iget p0, p0, Lno/f;->a:I

    if-nez p0, :cond_0

    return v3

    :cond_0
    return v2
.end method
