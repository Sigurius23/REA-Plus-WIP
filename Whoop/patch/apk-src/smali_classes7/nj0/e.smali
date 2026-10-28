.class public abstract Lnj0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\"\u001a\u0010\u0006\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0005\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0008\u0010\u0003\"\u001a\u0010\n\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0003\u00a8\u0006\u000b"
    }
    d2 = {
        "Ljava/util/UUID;",
        "a",
        "Ljava/util/UUID;",
        "()Ljava/util/UUID;",
        "HARVARD_SERVICE_UUID",
        "b",
        "MAVERICK_SERVICE_UUID",
        "c",
        "d",
        "SYMPHONY_SERVICE_UUID",
        "MONUMENT_SERVICE_UUID",
        "whoop-ble-api"
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
.field private static final a:Ljava/util/UUID;

.field private static final b:Ljava/util/UUID;

.field private static final c:Ljava/util/UUID;

.field private static final d:Ljava/util/UUID;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "61080001-8d6d-82b8-614a-1c8cb0f8dcc6"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string v1, "fromString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lnj0/e;->a:Ljava/util/UUID;

    const-string v0, "fd4b0001-cce1-4033-93ce-002d5875f58a"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lnj0/e;->b:Ljava/util/UUID;

    const-string v0, "59830001-5955-419b-bb8d-c8262926af23"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lnj0/e;->c:Ljava/util/UUID;

    const-string v0, "8a580001-2fe8-4796-9267-b87a2b0c8234"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lnj0/e;->d:Ljava/util/UUID;

    return-void
.end method

.method public static final a()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lnj0/e;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public static final b()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lnj0/e;->b:Ljava/util/UUID;

    return-object v0
.end method

.method public static final c()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lnj0/e;->d:Ljava/util/UUID;

    return-object v0
.end method

.method public static final d()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lnj0/e;->c:Ljava/util/UUID;

    return-object v0
.end method
