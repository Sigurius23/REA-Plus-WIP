.class public final Lj92/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj92/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u000c2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lj92/m;",
        "",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "<init>",
        "(Lcom/whoop/data/local/prefs/PreferenceHelper;)V",
        "",
        "a",
        "()Z",
        "",
        "delaySeconds",
        "Ll83/a0;",
        "b",
        "(I)V",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
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


# static fields
.field public static final b:Lj92/m$a;


# instance fields
.field private final a:Lcom/whoop/data/local/prefs/PreferenceHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj92/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj92/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lj92/m;->b:Lj92/m$a;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/local/prefs/PreferenceHelper;)V
    .locals 1

    const-string v0, "preferenceHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj92/m;->a:Lcom/whoop/data/local/prefs/PreferenceHelper;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj92/m;->a:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "APIRateLimitUntilMillis"

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getLongValueFromMainPrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;JILjava/lang/Object;)J

    move-result-wide v0

    sget-object v2, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-static {v2}, Lorg/joda/time/DateTime;->now(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(I)V
    .locals 4

    monitor-enter p0

    :try_start_0
    sget-object v0, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-static {v0}, Lorg/joda/time/DateTime;->now(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object p1

    iget-object v0, p0, Lj92/m;->a:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "APIRateLimitUntilMillis"

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putLongValueIntoMainPrefs(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
