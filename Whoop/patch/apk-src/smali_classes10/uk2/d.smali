.class public abstract Luk2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Ljava/time/OffsetDateTime;",
        "",
        "b",
        "(Ljava/time/OffsetDateTime;)Ljava/lang/String;",
        "Ljava/time/format/DateTimeFormatter;",
        "a",
        "Ljava/time/format/DateTimeFormatter;",
        "addActivityDateTimeFormatter",
        "track-activity_release"
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
.field private static final a:Ljava/time/format/DateTimeFormatter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss.SSSX"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "ofPattern(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Luk2/d;->a:Ljava/time/format/DateTimeFormatter;

    return-void
.end method

.method public static final synthetic a(Ljava/time/OffsetDateTime;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Luk2/d;->b(Ljava/time/OffsetDateTime;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/time/OffsetDateTime;)Ljava/lang/String;
    .locals 1

    sget-object v0, Luk2/d;->a:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {p0, v0}, Ljava/time/OffsetDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "format(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
