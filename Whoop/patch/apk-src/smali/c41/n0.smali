.class public abstract Lc41/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc41/n0$a;,
        Lc41/n0$b;,
        Lc41/n0$c;,
        Lc41/n0$d;,
        Lc41/n0$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0005\t\u0010\u000f\u000b\u0011B%\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\r\u001a\u0004\u0008\t\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\r\u001a\u0004\u0008\u000f\u0010\u000e\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lc41/n0;",
        "",
        "",
        "icon",
        "Ly81/f;",
        "color",
        "titleTint",
        "<init>",
        "(ILy81/f;Ly81/f;)V",
        "a",
        "I",
        "b",
        "()I",
        "Ly81/f;",
        "()Ly81/f;",
        "c",
        "e",
        "d",
        "Lc41/n0$a;",
        "Lc41/n0$b;",
        "Lc41/n0$c;",
        "Lc41/n0$d;",
        "Lc41/n0$e;",
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
.field private final a:I

.field private final b:Ly81/f;

.field private final c:Ly81/f;


# direct methods
.method private constructor <init>(ILy81/f;Ly81/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc41/n0;->a:I

    iput-object p2, p0, Lc41/n0;->b:Ly81/f;

    iput-object p3, p0, Lc41/n0;->c:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(ILy81/f;Ly81/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lc41/n0;-><init>(ILy81/f;Ly81/f;)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/f;
    .locals 1

    iget-object v0, p0, Lc41/n0;->b:Ly81/f;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lc41/n0;->a:I

    return v0
.end method

.method public final c()Ly81/f;
    .locals 1

    iget-object v0, p0, Lc41/n0;->c:Ly81/f;

    return-object v0
.end method
