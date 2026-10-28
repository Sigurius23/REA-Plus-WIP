.class public final Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/remote/domain/dto/DateTimeRange;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\t\u0010\u0003\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;",
        "",
        "<init>",
        "()V",
        "rangeDelimiter",
        "",
        "lowerUpperDelimiter",
        "dateTimeFormatter",
        "Lorg/joda/time/format/DateTimeFormatter;",
        "getDateTimeFormatter$annotations",
        "getDateTimeFormatter",
        "()Lorg/joda/time/format/DateTimeFormatter;",
        "dateTimeRangeFormatter",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getDateTimeFormatter$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->access$getDateTimeFormatter$cp()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0
.end method
