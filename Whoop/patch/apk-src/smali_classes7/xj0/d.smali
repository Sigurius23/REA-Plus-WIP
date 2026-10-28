.class public final Lxj0/d;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0008"
    }
    d2 = {
        "Lxj0/d;",
        "Lxj0/b;",
        "Llt0/j;",
        "revision",
        "<init>",
        "(Llt0/j;)V",
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
.field public static final i:Lxj0/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/d;->i:Lxj0/d$a;

    return-void
.end method

.method public constructor <init>(Llt0/j;)V
    .locals 7

    const-string v0, "revision"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Llt0/e;->DISABLE_ALARM:Llt0/e;

    sget-object v0, Lxj0/d;->i:Lxj0/d$a;

    invoke-static {v0, p1}, Lxj0/d$a;->a(Lxj0/d$a;Llt0/j;)Ljava/nio/ByteBuffer;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
