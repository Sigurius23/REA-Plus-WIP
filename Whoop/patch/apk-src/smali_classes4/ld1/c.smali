.class public abstract Lld1/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VS:",
        "Ljava/lang/Object;",
        "VE:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/w1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u00020\u0003B\u0011\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00028\u0001H&\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lld1/c;",
        "VS",
        "VE",
        "Landroidx/lifecycle/w1;",
        "Lbc3/c0;",
        "viewModelScope",
        "<init>",
        "(Lbc3/c0;)V",
        "event",
        "Ll83/a0;",
        "g",
        "(Ljava/lang/Object;)V",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
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


# static fields
.field public static final w:I = 0x8


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lld1/c;-><init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lbc3/c0;)V
    .locals 1

    const-string v0, "viewModelScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lor2/m;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p3, p2}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1}, Lld1/c;-><init>(Lbc3/c0;)V

    return-void
.end method


# virtual methods
.method public abstract g(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVE;)V"
        }
    .end annotation
.end method

.method public abstract getViewState()Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation
.end method
