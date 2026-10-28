.class public final Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u001d\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00022\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001b\u0010\'\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010!\u001a\u0004\u0008&\u0010#R\u001a\u0010(\u001a\u00020\u00028\u0000X\u0080D\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u0017\u001a\u0004\u0008)\u0010*R\'\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000c0+8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008,\u0010\u001b\u001a\u0004\u0008-\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00102\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;",
        "",
        "",
        "src",
        "",
        "cacheEnabled",
        "<init>",
        "(Ljava/lang/String;Z)V",
        "Ll83/a0;",
        "logCacheHitStats",
        "()V",
        "rawValue",
        "Ljava/util/Date;",
        "parseInternal",
        "(Ljava/lang/String;)Ljava/util/Date;",
        "fetchFromCache",
        "date",
        "saveToCache",
        "(Ljava/lang/String;Ljava/util/Date;)V",
        "parse$stream_chat_android_client_release",
        "parse",
        "format",
        "(Ljava/util/Date;)Ljava/lang/String;",
        "Ljava/lang/String;",
        "Z",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Ljava/text/SimpleDateFormat;",
        "dateFormat$delegate",
        "Lf93/c;",
        "getDateFormat",
        "()Ljava/text/SimpleDateFormat;",
        "dateFormat",
        "dateFormatWithoutNanoseconds$delegate",
        "getDateFormatWithoutNanoseconds",
        "dateFormatWithoutNanoseconds",
        "datePattern",
        "getDatePattern$stream_chat_android_client_release",
        "()Ljava/lang/String;",
        "La0/a0;",
        "cache$delegate",
        "getCache",
        "()La0/a0;",
        "cache",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "cacheHit",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "allRequests",
        "Companion",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field private static final Companion:Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter$Companion;

.field public static final DATE_FORMAT:Ljava/lang/String; = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final DATE_FORMAT_WITHOUT_NANOSECONDS:Ljava/lang/String; = "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final STATS:Z = false
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final allRequests:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final cache$delegate:Ll83/h;

.field private final cacheEnabled:Z

.field private final cacheHit:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final dateFormat$delegate:Lf93/c;

.field private final dateFormatWithoutNanoseconds$delegate:Lf93/c;

.field private final datePattern:Ljava/lang/String;

.field private final logger$delegate:Ll83/h;

.field private final src:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;

    const-string v2, "dateFormat"

    const-string v3, "getDateFormat()Ljava/text/SimpleDateFormat;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "dateFormatWithoutNanoseconds"

    const-string v5, "getDateFormatWithoutNanoseconds()Ljava/text/SimpleDateFormat;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->$$delegatedProperties:[Lj93/z;

    new-instance v0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->Companion:Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v2}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->src:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->cacheEnabled:Z

    .line 5
    const-string p1, "StreamDateFormatter"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->logger$delegate:Ll83/h;

    .line 6
    new-instance p1, Lim1/l0;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Lim1/l0;-><init>(I)V

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/ThreadLocalDelegateKt;->threadLocal(Lc93/a;)Lf93/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->dateFormat$delegate:Lf93/c;

    .line 7
    new-instance p1, Lim1/l0;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lim1/l0;-><init>(I)V

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/ThreadLocalDelegateKt;->threadLocal(Lc93/a;)Lf93/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->dateFormatWithoutNanoseconds$delegate:Lf93/c;

    .line 8
    const-string p1, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->datePattern:Ljava/lang/String;

    .line 9
    new-instance p1, Lim1/l0;

    const/16 p2, 0x9

    invoke-direct {p1, p2}, Lim1/l0;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->cache$delegate:Ll83/h;

    .line 10
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->cacheHit:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->allRequests:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic a()La0/a0;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->cache_delegate$lambda$4()La0/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ljava/text/SimpleDateFormat;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->dateFormat_delegate$lambda$1()Ljava/text/SimpleDateFormat;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ljava/text/SimpleDateFormat;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->dateFormatWithoutNanoseconds_delegate$lambda$3()Ljava/text/SimpleDateFormat;

    move-result-object v0

    return-object v0
.end method

.method private static final cache_delegate$lambda$4()La0/a0;
    .locals 2

    new-instance v0, La0/a0;

    const/16 v1, 0x12c

    invoke-direct {v0, v1}, La0/a0;-><init>(I)V

    return-object v0
.end method

.method private static final dateFormatWithoutNanoseconds_delegate$lambda$3()Ljava/text/SimpleDateFormat;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-object v0
.end method

.method private static final dateFormat_delegate$lambda$1()Ljava/text/SimpleDateFormat;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-object v0
.end method

.method private final fetchFromCache(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->cacheEnabled:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->getCache()La0/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    return-object p1
.end method

.method private final getCache()La0/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La0/a0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->cache$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/a0;

    return-object v0
.end method

.method private final getDateFormat()Ljava/text/SimpleDateFormat;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->dateFormat$delegate:Lf93/c;

    sget-object v1, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method private final getDateFormatWithoutNanoseconds()Ljava/text/SimpleDateFormat;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->dateFormatWithoutNanoseconds$delegate:Lf93/c;

    sget-object v1, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final logCacheHitStats()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->allRequests:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->cacheHit:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    return-void
.end method

.method private final parseInternal(Ljava/lang/String;)Ljava/util/Date;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->allRequests:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->fetchFromCache(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->cacheHit:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-object v0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-static {p1}, Lsc3/l;->i(Ljava/lang/String;)Ljava/time/OffsetDateTime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/OffsetDateTime;->toInstant()Ljava/time/Instant;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Date;->from(Ljava/time/Instant;)Ljava/util/Date;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    goto :goto_0

    :catchall_0
    :try_start_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->getDateFormatWithoutNanoseconds()Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :goto_0
    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->saveToCache(Ljava/lang/String;Ljava/util/Date;)V

    return-object v1
.end method

.method private final saveToCache(Ljava/lang/String;Ljava/util/Date;)V
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->cacheEnabled:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->getCache()La0/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final format(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    move-result-object p1

    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-virtual {p1, v0}, Ljava/time/Instant;->atOffset(Ljava/time/ZoneOffset;)Ljava/time/OffsetDateTime;

    move-result-object p1

    invoke-static {p1}, Lsc3/l;->g(Ljava/time/OffsetDateTime;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getDatePattern$stream_chat_android_client_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->datePattern:Ljava/lang/String;

    return-object v0
.end method

.method public final parse$stream_chat_android_client_release(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->logCacheHitStats()V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;->parseInternal(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method
