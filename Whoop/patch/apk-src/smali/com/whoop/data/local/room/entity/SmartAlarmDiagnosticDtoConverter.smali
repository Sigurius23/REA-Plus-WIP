.class public final Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;",
        "",
        "<init>",
        "()V",
        "Lf82/a;",
        "eventType",
        "",
        "fromSmartAlarmEventType",
        "(Lf82/a;)Ljava/lang/String;",
        "eventTypeName",
        "toSmartAlarmEventType",
        "(Ljava/lang/String;)Lf82/a;",
        "app_prodStandardRelease"
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
.field public static final $stable:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromSmartAlarmEventType(Lf82/a;)Ljava/lang/String;
    .locals 1

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final toSmartAlarmEventType(Ljava/lang/String;)Lf82/a;
    .locals 1

    const-string v0, "eventTypeName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lf82/a;->valueOf(Ljava/lang/String;)Lf82/a;

    move-result-object p1

    return-object p1
.end method
