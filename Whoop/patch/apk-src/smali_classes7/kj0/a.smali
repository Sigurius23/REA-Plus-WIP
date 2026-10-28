.class public abstract Lkj0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\r\"\u001a\u0010\u0005\u001a\u00020\u00008\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u0012\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0008\"\u0017\u0010\n\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0008\"\u0017\u0010\u000c\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Ljava/util/UUID;",
        "a",
        "Ljava/util/UUID;",
        "getUUID_SECURE_DFU_SERVICE$annotations",
        "()V",
        "UUID_SECURE_DFU_SERVICE",
        "b",
        "c",
        "()Ljava/util/UUID;",
        "UUID_HR_SERVICE",
        "UUID_HR_CHARACTERISTIC",
        "d",
        "UUID_CLIENT_CHARACTERISTIC_CONFIG",
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


# static fields
.field public static final a:Ljava/util/UUID;

.field private static final b:Ljava/util/UUID;

.field private static final c:Ljava/util/UUID;

.field private static final d:Ljava/util/UUID;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "0000fe59-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string v1, "fromString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkj0/a;->a:Ljava/util/UUID;

    const-string v0, "0000180d-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkj0/a;->b:Ljava/util/UUID;

    const-string v0, "00002a37-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkj0/a;->c:Ljava/util/UUID;

    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lkj0/a;->d:Ljava/util/UUID;

    return-void
.end method

.method public static final a()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lkj0/a;->d:Ljava/util/UUID;

    return-object v0
.end method

.method public static final b()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lkj0/a;->c:Ljava/util/UUID;

    return-object v0
.end method

.method public static final c()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lkj0/a;->b:Ljava/util/UUID;

    return-object v0
.end method
