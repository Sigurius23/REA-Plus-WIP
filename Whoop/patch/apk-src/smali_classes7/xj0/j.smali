.class public final Lxj0/j;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0019\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxj0/j;",
        "Lxj0/b;",
        "Llt0/j;",
        "revision",
        "<init>",
        "(Llt0/j;)V",
        "rev",
        "",
        "alarmId",
        "(Llt0/j;I)V",
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
.field public static final i:Lxj0/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/j;->i:Lxj0/j$a;

    return-void
.end method

.method public constructor <init>(Llt0/j;)V
    .locals 7

    const-string v0, "revision"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v2, Llt0/e;->GET_ALARM_TIME:Llt0/e;

    sget-object v0, Lxj0/j;->i:Lxj0/j$a;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lxj0/j$a;->a(Lxj0/j$a;Llt0/j;I)Ljava/nio/ByteBuffer;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    sget-object v0, Llt0/j;->REVISION_1:Llt0/j;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only packet revision 1 can call this constructor"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Llt0/j;I)V
    .locals 7

    const-string v0, "rev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v2, Llt0/e;->GET_ALARM_TIME:Llt0/e;

    sget-object v0, Lxj0/j;->i:Lxj0/j$a;

    invoke-static {v0, p1, p2}, Lxj0/j$a;->a(Lxj0/j$a;Llt0/j;I)Ljava/nio/ByteBuffer;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    sget-object p2, Llt0/j;->REVISION_4:Llt0/j;

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only packet revision 4 can call this constructor"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
