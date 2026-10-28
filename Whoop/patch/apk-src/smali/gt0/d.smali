.class public interface abstract Lgt0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001JK\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0008H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019\u00c0\u0006\u0003"
    }
    d2 = {
        "Lgt0/d;",
        "",
        "Lgt0/b;",
        "category",
        "Lgt0/c;",
        "value",
        "Lgt0/a;",
        "action",
        "",
        "deviceName",
        "targetFwVersion",
        "errorCause",
        "Ll83/a0;",
        "b",
        "(Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "userAcceptanceRequired",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "device",
        "c",
        "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V",
        "",
        "duration",
        "d",
        "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;J)V",
        "connectivity-core_release"
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
.method public static synthetic a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 7

    if-nez p8, :cond_2

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    const-string p5, ""

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    const/4 p6, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lgt0/d;->b(Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: sendFwUpdateSegmentEvent"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract b(Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract c(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V
.end method

.method public abstract d(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;J)V
.end method
