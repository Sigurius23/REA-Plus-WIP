.class public abstract Llk0/b;
.super Len0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llk0/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Len0/a<",
        "Llt0/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\tB\u0013\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Llk0/b;",
        "Len0/a;",
        "Llt0/m;",
        "",
        "Landroid/os/Handler;",
        "handler",
        "<init>",
        "(Landroid/os/Handler;)V",
        "y",
        "a",
        "connectivity_release"
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
.field private static final y:Llk0/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llk0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llk0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llk0/b;->y:Llk0/b$a;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Len0/a;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Handler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Llk0/b;-><init>(Landroid/os/Handler;)V

    return-void
.end method
