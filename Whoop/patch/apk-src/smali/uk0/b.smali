.class public final Luk0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0008\t\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Luk0/b;",
        "",
        "<init>",
        "()V",
        "",
        "value",
        "",
        "d",
        "(I)J",
        "",
        "",
        "b",
        "(B)S",
        "c",
        "(J)I",
        "e",
        "(S)I",
        "a",
        "(S)B",
        "essentials_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Luk0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luk0/b;

    invoke-direct {v0}, Luk0/b;-><init>()V

    sput-object v0, Luk0/b;->a:Luk0/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(B)S
    .locals 0

    int-to-short p0, p0

    and-int/lit16 p0, p0, 0xff

    int-to-short p0, p0

    return p0
.end method

.method public static final d(I)J
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final a(S)B
    .locals 0

    and-int/lit16 p1, p1, 0xff

    int-to-short p1, p1

    int-to-byte p1, p1

    return p1
.end method

.method public final c(J)I
    .locals 0

    long-to-int p1, p1

    return p1
.end method

.method public final e(S)I
    .locals 1

    const v0, 0xffff

    and-int/2addr p1, v0

    return p1
.end method
