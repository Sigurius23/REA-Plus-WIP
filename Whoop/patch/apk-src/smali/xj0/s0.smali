.class public final Lxj0/s0;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/s0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxj0/s0;",
        "Lxj0/b;",
        "",
        "strapAlarmId",
        "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;",
        "alarmHapticsPattern",
        "",
        "alarmTimeMillis",
        "<init>",
        "(ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)V",
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
.field public static final i:Lxj0/s0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/s0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/s0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/s0;->i:Lxj0/s0$a;

    return-void
.end method

.method public constructor <init>(ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)V
    .locals 7

    const-string v0, "alarmHapticsPattern"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Llt0/e;->SET_ALARM_TIME:Llt0/e;

    sget-object v0, Lxj0/s0;->i:Lxj0/s0$a;

    invoke-static {v0, p1, p2, p3, p4}, Lxj0/s0$a;->a(Lxj0/s0$a;ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)Ljava/nio/ByteBuffer;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
