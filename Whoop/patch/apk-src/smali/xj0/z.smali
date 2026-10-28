.class public final Lxj0/z;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/z$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxj0/z;",
        "Lxj0/b;",
        "",
        "index",
        "",
        "data",
        "Lst0/v;",
        "deviceType",
        "<init>",
        "(J[BLst0/v;)V",
        "i",
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
.field public static final i:Lxj0/z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/z$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/z;->i:Lxj0/z$a;

    return-void
.end method

.method public constructor <init>(J[BLst0/v;)V
    .locals 2

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llt0/e;->LOAD_FIRMWARE_DATA_NEW:Llt0/e;

    sget-object v1, Lxj0/z;->i:Lxj0/z$a;

    invoke-static {v1, p1, p2, p3}, Lxj0/z$a;->a(Lxj0/z$a;J[B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-direct {p0, v0, p1, p4}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V

    return-void
.end method
