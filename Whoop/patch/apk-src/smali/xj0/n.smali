.class public final Lxj0/n;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxj0/n;",
        "Lxj0/b;",
        "Lst0/v;",
        "deviceType",
        "<init>",
        "(Lst0/v;)V",
        "",
        "i",
        "Z",
        "p",
        "()Z",
        "dualResponse",
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


# instance fields
.field private final i:Z


# direct methods
.method public constructor <init>(Lst0/v;)V
    .locals 7

    const-string v0, "deviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Llt0/e;->GET_DATA_RANGE:Llt0/e;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x1

    iput-boolean p1, v1, Lxj0/n;->i:Z

    return-void
.end method


# virtual methods
.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lxj0/n;->i:Z

    return v0
.end method
