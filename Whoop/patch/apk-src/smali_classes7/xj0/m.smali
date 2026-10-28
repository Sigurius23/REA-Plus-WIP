.class public final Lxj0/m;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0008"
    }
    d2 = {
        "Lxj0/m;",
        "Lxj0/b;",
        "Lst0/v;",
        "deviceType",
        "<init>",
        "(Lst0/v;)V",
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
.field public static final i:Lxj0/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/m;->i:Lxj0/m$a;

    return-void
.end method

.method public constructor <init>(Lst0/v;)V
    .locals 2

    const-string v0, "deviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lxj0/m;->i:Lxj0/m$a;

    invoke-static {v0, p1}, Lxj0/m$a;->a(Lxj0/m$a;Lst0/v;)Llt0/e;

    move-result-object v1

    invoke-static {v0, p1}, Lxj0/m$a;->b(Lxj0/m$a;Lst0/v;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-direct {p0, v1, v0, p1}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V

    return-void
.end method
