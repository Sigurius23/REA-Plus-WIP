.class public abstract Lwe/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    sget-object v0, Ltg/f;->a:[C

    const/16 v0, 0x20

    new-array v0, v0, [B

    const/16 v1, 0x40

    const/4 v2, 0x0

    invoke-static {v2, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    const/4 v3, 0x2

    invoke-static {v3, v1}, Le93/b;->d0(ILi93/j;)Li93/h;

    move-result-object v1

    iget v3, v1, Li93/h;->w:I

    iget v4, v1, Li93/h;->x:I

    iget v1, v1, Li93/h;->y:I

    if-lez v1, :cond_0

    if-le v3, v4, :cond_1

    :cond_0
    if-gez v1, :cond_2

    if-gt v4, v3, :cond_2

    :cond_1
    move v5, v2

    :goto_0
    const-string v6, "FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC63254F"

    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Lva3/d;->e(C)I

    move-result v7

    shl-int/lit8 v7, v7, 0x4

    add-int/lit8 v8, v3, 0x1

    invoke-virtual {v6, v8}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Lva3/d;->e(C)I

    move-result v6

    add-int/lit8 v8, v5, 0x1

    or-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v0, v5

    if-eq v3, v4, :cond_2

    add-int/2addr v3, v1

    move v5, v8

    goto :goto_0

    :cond_2
    new-instance v1, Lkf/a;

    const/4 v3, 0x1

    new-array v3, v3, [B

    aput-byte v2, v3, v2

    invoke-static {v3, v0}, Lm83/n;->F0([B[B)[B

    move-result-object v0

    invoke-direct {v1, v0}, Lkf/a;-><init>([B)V

    sput-object v1, Lwe/h0;->a:Lkf/a;

    return-void
.end method
