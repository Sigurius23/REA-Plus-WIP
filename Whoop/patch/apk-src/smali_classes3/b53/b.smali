.class public final Lb53/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic e:[Lj93/z;


# instance fields
.field public final a:Lio/sentry/internal/debugmeta/c;

.field public final b:Ll83/p;

.field public final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lb53/b;

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

    sput-object v2, Lb53/b;->e:[Lj93/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "StreamDateFormatter"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    sget-object v0, Lb53/a;->y:Lb53/a;

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v1, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lc93/a;)V

    sget-object v0, Lb53/a;->z:Lb53/a;

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v1, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lc93/a;)V

    iput-object v1, p0, Lb53/b;->a:Lio/sentry/internal/debugmeta/c;

    sget-object v0, Lb53/a;->x:Lb53/a;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lb53/b;->b:Ll83/p;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lb53/b;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lb53/b;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method
