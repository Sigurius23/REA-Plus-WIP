.class public final Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;",
        "",
        "<init>",
        "()V",
        "fromSmartGoalType",
        "",
        "goalType",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "toSmartGoalType",
        "goal",
        "core_release"
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
.method public final fromSmartGoalType(Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;)Ljava/lang/String;
    .locals 1

    const-string v0, "goalType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->getGoalType()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final toSmartGoalType(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    const-string v0, "goal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->valueOf(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    move-result-object p1

    return-object p1
.end method
