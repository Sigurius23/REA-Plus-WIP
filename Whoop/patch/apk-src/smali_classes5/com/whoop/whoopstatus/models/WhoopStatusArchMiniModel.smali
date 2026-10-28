.class public final Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel$$serializer;,
        Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J\'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "<init>",
        "()V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_status_release",
        "(Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Companion",
        "$serializer",
        "a",
        "whoop-status_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;->Companion:Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic write$Self$whoop_status_release(Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;Lzc3/c;Lyc3/g;)V
    .locals 0

    return-void
.end method
