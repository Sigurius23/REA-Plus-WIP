.class public final Lxj0/u0;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/u0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lxj0/u0;",
        "Lxj0/b;",
        "Lfk2/a;",
        "time",
        "<init>",
        "(Lfk2/a;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "i",
        "Lfk2/a;",
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
.field public static final j:Lxj0/u0$a;


# instance fields
.field private final i:Lfk2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/u0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/u0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/u0;->j:Lxj0/u0$a;

    return-void
.end method

.method public constructor <init>(Lfk2/a;)V
    .locals 7

    const-string v0, "time"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Llt0/e;->SET_ALARM_TIME:Llt0/e;

    sget-object v0, Lxj0/u0;->j:Lxj0/u0$a;

    invoke-static {v0, p1}, Lxj0/u0$a;->a(Lxj0/u0$a;Lfk2/a;)Ljava/nio/ByteBuffer;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, v1, Lxj0/u0;->i:Lfk2/a;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lxj0/u0;->i:Lfk2/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SetAlarmTime(time="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
