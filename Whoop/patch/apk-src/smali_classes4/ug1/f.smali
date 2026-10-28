.class public final Lug1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug1/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lug1/f;",
        "",
        "Lug1/b;",
        "defaultUpdateStrategy",
        "Lug1/k;",
        "unifiedUpdateStrategy",
        "Lug1/a;",
        "batteryPackUpdateStrategy",
        "<init>",
        "(Lug1/b;Lug1/k;Lug1/a;)V",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "device",
        "Lug1/e;",
        "a",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lug1/e;",
        "Lug1/b;",
        "b",
        "Lug1/k;",
        "c",
        "Lug1/a;",
        "firmware-update-service_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lug1/b;

.field private final b:Lug1/k;

.field private final c:Lug1/a;


# direct methods
.method public constructor <init>(Lug1/b;Lug1/k;Lug1/a;)V
    .locals 1

    const-string v0, "defaultUpdateStrategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifiedUpdateStrategy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batteryPackUpdateStrategy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug1/f;->a:Lug1/b;

    iput-object p2, p0, Lug1/f;->b:Lug1/k;

    iput-object p3, p0, Lug1/f;->c:Lug1/a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lug1/e;
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object p1

    sget-object v0, Lug1/f$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ll83/j;

    const-string v0, "An operation is not implemented: Other strategies"

    invoke-direct {p1, v0}, Ll83/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, p0, Lug1/f;->c:Lug1/a;

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lug1/f;->b:Lug1/k;

    return-object p1

    :pswitch_2
    iget-object p1, p0, Lug1/f;->a:Lug1/b;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
