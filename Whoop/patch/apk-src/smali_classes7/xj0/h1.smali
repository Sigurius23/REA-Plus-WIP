.class public final Lxj0/h1;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/h1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00082\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lxj0/h1;",
        "Lxj0/b;",
        "",
        "enabled",
        "Lst0/v;",
        "deviceType",
        "<init>",
        "(ZLst0/v;)V",
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
.field public static final i:Lxj0/h1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/h1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/h1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/h1;->i:Lxj0/h1$a;

    return-void
.end method

.method public constructor <init>(ZLst0/v;)V
    .locals 2

    const-string v0, "deviceType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Llt0/e;->TOGGLE_IMU_MODE:Llt0/e;

    sget-object v1, Lxj0/h1;->i:Lxj0/h1$a;

    invoke-virtual {v1, p1}, Lxj0/h1$a;->a(Z)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 4
    invoke-direct {p0, v0, p1, p2}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V

    return-void
.end method

.method public synthetic constructor <init>(ZLst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    sget-object p2, Lst0/v;->MAVERICK:Lst0/v;

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lxj0/h1;-><init>(ZLst0/v;)V

    return-void
.end method
