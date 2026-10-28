.class public final Lk91/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk91/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lk91/a$a;",
        "",
        "<init>",
        "()V",
        "Ly3/f;",
        "start",
        "end",
        "Lk91/a;",
        "c",
        "(FF)Lk91/a;",
        "b",
        "radius",
        "a",
        "(F)Lk91/a;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk91/a$a;-><init>()V

    return-void
.end method

.method public static synthetic d(Lk91/a$a;FFILjava/lang/Object;)Lk91/a;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    move p2, p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lk91/a$a;->c(FF)Lk91/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(F)Lk91/a;
    .locals 6

    new-instance v0, Lk91/a;

    const/4 v5, 0x0

    move v2, p1

    move v3, p1

    move v4, p1

    move v1, p1

    invoke-direct/range {v0 .. v5}, Lk91/a;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final b(FF)Lk91/a;
    .locals 7

    new-instance v0, Lk91/a;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v4, p1

    move v3, p2

    invoke-direct/range {v0 .. v6}, Lk91/a;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final c(FF)Lk91/a;
    .locals 7

    new-instance v0, Lk91/a;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, Lk91/a;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
