.class public final Lek0/y;
.super Lot0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lek0/y$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0018\u0000 #2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0017R\u0011\u0010 \u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0013\u00a8\u0006%"
    }
    d2 = {
        "Lek0/y;",
        "Lot0/a;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Ltr2/n;",
        "e",
        "Ltr2/n;",
        "logger",
        "",
        "U",
        "()J",
        "flashBacklogInPages",
        "",
        "V",
        "()F",
        "flashBacklogInTenthsPercent",
        "",
        "W",
        "()I",
        "flashStatus",
        "T",
        "chargingStatus",
        "Y",
        "wristState",
        "",
        "Z",
        "()Z",
        "isOnWrist",
        "X",
        "socInTenthsPercent",
        "f",
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
.field public static final f:Lek0/y$a;


# instance fields
.field private final e:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lek0/y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lek0/y$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lek0/y;->f:Lek0/y$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lot0/a;-><init>(Ljava/nio/ByteBuffer;)V

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "StrapConditionReportEventPacket"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lek0/y;->e:Ltr2/n;

    return-void
.end method

.method private final T()I
    .locals 2

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Lwj0/a;->a(B)I

    move-result v0

    return v0
.end method

.method private final U()J
    .locals 2

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lwj0/a;->c(I)J

    move-result-wide v0

    return-wide v0
.end method

.method private final V()F
    .locals 2

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    invoke-static {v0}, Lwj0/a;->b(S)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    return v0
.end method

.method private final W()I
    .locals 2

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Lwj0/a;->a(B)I

    move-result v0

    return v0
.end method

.method private final Y()I
    .locals 2

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Lwj0/a;->a(B)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final X()F
    .locals 2

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    invoke-static {v0}, Lwj0/a;->b(S)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public final Z()Z
    .locals 2

    invoke-direct {p0}, Lek0/y;->Y()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    const-string v0, "BLE - Strap Condition Report | Flash backlog in pages: "

    :try_start_0
    invoke-direct {p0}, Lek0/y;->U()J

    move-result-wide v1

    invoke-direct {p0}, Lek0/y;->V()F

    move-result v3

    invoke-virtual {p0}, Lek0/y;->X()F

    move-result v4

    invoke-direct {p0}, Lek0/y;->W()I

    move-result v5

    invoke-direct {p0}, Lek0/y;->T()I

    move-result v6

    invoke-direct {p0}, Lek0/y;->Y()I

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " | Flash backlog in tenths: "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " | SOC in tenths: "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " | Flash status: "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " | Charging status (tri-state): "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " |  Wrist State (tri-state): "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lek0/y;->e:Ltr2/n;

    const-string v2, "Caught an exception when trying to parse StrapConditionReportEventPacket: "

    invoke-static {v0, v2}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-super {p0}, Lot0/a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
