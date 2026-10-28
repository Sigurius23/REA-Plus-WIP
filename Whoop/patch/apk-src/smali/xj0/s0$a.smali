.class public final Lxj0/s0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxj0/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lxj0/s0$a;",
        "",
        "<init>",
        "()V",
        "",
        "strapAlarmId",
        "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;",
        "alarmHapticsPattern",
        "",
        "alarmTimeMillis",
        "Ljava/nio/ByteBuffer;",
        "b",
        "(ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)Ljava/nio/ByteBuffer;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxj0/s0$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lxj0/s0$a;ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lxj0/s0$a;->b(ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method private final b(ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)Ljava/nio/ByteBuffer;
    .locals 3

    new-instance v0, Lfk2/a;

    sget-object v1, Lfk2/a$c;->MILLIS:Lfk2/a$c;

    invoke-direct {v0, p3, p4, v1}, Lfk2/a;-><init>(JLfk2/a$c;)V

    const/16 p3, 0x15

    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p3

    sget-object p4, Llt0/j;->REVISION_4:Llt0/j;

    invoke-virtual {p4}, Llt0/j;->getValue()B

    move-result p4

    invoke-virtual {p3, p4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    int-to-byte p1, p1

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    sget-object p1, Luk0/b;->a:Luk0/b;

    invoke-virtual {v0}, Lfk2/a;->f()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Luk0/b;->c(J)I

    move-result p4

    invoke-virtual {p3, p4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Lfk2/a;->e()J

    move-result-wide v0

    long-to-int p4, v0

    int-to-short p4, p4

    invoke-virtual {p1, p4}, Luk0/b;->e(S)I

    move-result p1

    int-to-short p1, p1

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-static {p2}, Lxj0/t0;->a(Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return-object p3
.end method
