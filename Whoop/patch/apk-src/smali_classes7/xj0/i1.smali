.class public final Lxj0/i1;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/i1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0008"
    }
    d2 = {
        "Lxj0/i1;",
        "Lxj0/b;",
        "",
        "enabled",
        "<init>",
        "(Z)V",
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
.field public static final i:Lxj0/i1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/i1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/i1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/i1;->i:Lxj0/i1$a;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 6

    sget-object v1, Llt0/e;->TOGGLE_OPTICAL_MODE:Llt0/e;

    sget-object v0, Lxj0/i1;->i:Lxj0/i1$a;

    invoke-static {v0, p1}, Lxj0/i1$a;->a(Lxj0/i1$a;Z)Ljava/nio/ByteBuffer;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
