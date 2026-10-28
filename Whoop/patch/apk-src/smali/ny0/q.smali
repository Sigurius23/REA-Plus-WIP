.class public abstract Lny0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lny0/q$a;,
        Lny0/q$b;,
        Lny0/q$c;,
        Lny0/q$d;,
        Lny0/q$e;,
        Lny0/q$f;,
        Lny0/q$g;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0007\u0010\u000f\u000b\u0014\u0015\u0011\rB7\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000c\u001a\u0004\u0008\u0010\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u000b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000c\u001a\u0004\u0008\u000f\u0010\u000eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u0082\u0001\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lny0/q;",
        "",
        "Ly3/f;",
        "touchArea",
        "imageSize",
        "borderDiameter",
        "borderWidth",
        "",
        "isSecondary",
        "<init>",
        "(FFFFZ)V",
        "a",
        "F",
        "d",
        "()F",
        "b",
        "c",
        "e",
        "Z",
        "()Z",
        "g",
        "f",
        "Lny0/q$a;",
        "Lny0/q$b;",
        "Lny0/q$c;",
        "Lny0/q$d;",
        "Lny0/q$e;",
        "Lny0/q$f;",
        "Lny0/q$g;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:Z


# direct methods
.method private constructor <init>(FFFFZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lny0/q;->a:F

    .line 4
    iput p2, p0, Lny0/q;->b:F

    .line 5
    iput p3, p0, Lny0/q;->c:F

    .line 6
    iput p4, p0, Lny0/q;->d:F

    .line 7
    iput-boolean p5, p0, Lny0/q;->e:Z

    return-void
.end method

.method public constructor <init>(FFFFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    int-to-float p3, v0

    :cond_0
    move v4, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    int-to-float p4, v0

    :cond_1
    move v5, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    move v6, v0

    goto :goto_0

    :cond_2
    move v6, p5

    :goto_0
    const/4 v7, 0x0

    move-object v1, p0

    move v2, p1

    move v3, p2

    .line 8
    invoke-direct/range {v1 .. v7}, Lny0/q;-><init>(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lny0/q;-><init>(FFFFZ)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lny0/q;->c:F

    return v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lny0/q;->d:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lny0/q;->b:F

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Lny0/q;->a:F

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lny0/q;->e:Z

    return v0
.end method
