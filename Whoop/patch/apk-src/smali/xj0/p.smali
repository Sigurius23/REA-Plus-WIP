.class public final Lxj0/p;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/p$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lxj0/p;",
        "Lxj0/b;",
        "Llt0/j;",
        "revision",
        "Lst0/v;",
        "deviceType",
        "<init>",
        "(Llt0/j;Lst0/v;)V",
        "",
        "i",
        "Z",
        "p",
        "()Z",
        "dualResponse",
        "j",
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
.field public static final j:Lxj0/p$a;


# instance fields
.field private final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/p;->j:Lxj0/p$a;

    return-void
.end method

.method public constructor <init>(Llt0/j;Lst0/v;)V
    .locals 2

    const-string v0, "revision"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Llt0/e;->GET_HELLO:Llt0/e;

    sget-object v1, Lxj0/p;->j:Lxj0/p$a;

    invoke-static {v1, p1}, Lxj0/p$a;->a(Lxj0/p$a;Llt0/j;)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 5
    invoke-direct {p0, v0, p1, p2}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lxj0/p;->i:Z

    return-void
.end method

.method public synthetic constructor <init>(Llt0/j;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 1
    sget-object p1, Llt0/j;->REVISION_1:Llt0/j;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 2
    sget-object p2, Lst0/v;->GEN_4:Lst0/v;

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2}, Lxj0/p;-><init>(Llt0/j;Lst0/v;)V

    return-void
.end method


# virtual methods
.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lxj0/p;->i:Z

    return v0
.end method
