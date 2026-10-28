.class public final Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmb/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase$b;",
        "Lmb/a;",
        "<init>",
        "()V",
        "connectivity-data-packets_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lub/a;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge f(Ltb/a;)V
    .locals 0

    invoke-super {p0, p1}, Lmb/a;->f(Ltb/a;)V

    return-void
.end method
