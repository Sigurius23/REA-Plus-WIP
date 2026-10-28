.class public abstract Lxj0/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;",
        "Ljava/nio/ByteBuffer;",
        "b",
        "(Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;)Ljava/nio/ByteBuffer;",
        "connectivity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-static {p0}, Lxj0/t0;->b(Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;)Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0xc

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getWaveFormEffect1()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getWaveFormEffect2()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getWaveFormEffect3()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getWaveFormEffect4()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getWaveFormEffect5()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getWaveFormEffect6()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getWaveFormEffect7()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getWaveFormEffect8()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getLoopControlForEffects()S

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getOverallWaveformLoopControl()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->getAlarmDurationInSeconds()I

    move-result p0

    int-to-byte p0, p0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-object v0
.end method
