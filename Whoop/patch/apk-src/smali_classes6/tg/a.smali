.class public abstract Ltg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x100

    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_1

    const/16 v4, 0x3d

    if-ne v3, v4, :cond_0

    const/16 v4, 0xff

    goto :goto_1

    :cond_0
    int-to-char v4, v3

    const/4 v5, 0x6

    const-string v6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    invoke-static {v6, v4, v2, v2, v5}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v4

    :goto_1
    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sput-object v1, Ltg/a;->a:[I

    return-void
.end method

.method public static final a(B)I
    .locals 2

    sget-object v0, Ltg/a;->a:[I

    aget v0, v0, p0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "decode base64: invalid input byte: "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
