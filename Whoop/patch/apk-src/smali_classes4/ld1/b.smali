.class public final Lld1/b;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VS:",
        "Ljava/lang/Object;",
        "VE:",
        "Ljava/lang/Object;",
        ">",
        "Lld1/c<",
        "TVS;TVE;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0006R \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lld1/b;",
        "VS",
        "VE",
        "Lld1/c;",
        "value",
        "<init>",
        "(Ljava/lang/Object;)V",
        "event",
        "Ll83/a0;",
        "g",
        "Lec3/l;",
        "x",
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


# instance fields
.field private final x:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVS;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lld1/c;-><init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, La6/u;

    invoke-direct {v0, p1, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lld1/b;->x:Lec3/l;

    return-void
.end method


# virtual methods
.method public g(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVE;)V"
        }
    .end annotation

    return-void
.end method

.method public getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lld1/b;->x:Lec3/l;

    return-object v0
.end method
