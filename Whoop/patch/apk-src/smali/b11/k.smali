.class public abstract Lb11/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb11/k$a;,
        Lb11/k$b;,
        Lb11/k$c;,
        Lb11/k$d;,
        Lb11/k$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0005\u000c\u0013\u000e\u0014\nB#\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\n\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u0012\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lb11/k;",
        "",
        "",
        "icon",
        "Ly81/e;",
        "color",
        "",
        "enableIconAnimation",
        "<init>",
        "(ILy81/e;Z)V",
        "a",
        "I",
        "c",
        "()I",
        "b",
        "Ly81/e;",
        "()Ly81/e;",
        "Z",
        "()Z",
        "d",
        "e",
        "Lb11/k$a;",
        "Lb11/k$b;",
        "Lb11/k$c;",
        "Lb11/k$d;",
        "Lb11/k$e;",
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

.field private final b:Ly81/e;

.field private final c:Z


# direct methods
.method private constructor <init>(ILy81/e;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lb11/k;->a:I

    .line 4
    iput-object p2, p0, Lb11/k;->b:Ly81/e;

    .line 5
    iput-boolean p3, p0, Lb11/k;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(ILy81/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    const/4 p4, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, p4}, Lb11/k;-><init>(ILy81/e;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILy81/e;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lb11/k;-><init>(ILy81/e;Z)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/e;
    .locals 1

    iget-object v0, p0, Lb11/k;->b:Ly81/e;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lb11/k;->c:Z

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lb11/k;->a:I

    return v0
.end method
