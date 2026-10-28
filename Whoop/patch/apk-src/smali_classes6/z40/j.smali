.class public abstract synthetic Lz40/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    invoke-static {v0}, Le4/p;->f(I)[I

    move-result-object v1

    array-length v1, v1

    new-array v1, v1, [I

    const/4 v2, 0x2

    const/4 v3, 0x1

    aput v3, v1, v2

    aput v2, v1, v3

    const/4 v2, 0x0

    aput v0, v1, v2

    sput-object v1, Lz40/j;->a:[I

    return-void
.end method
