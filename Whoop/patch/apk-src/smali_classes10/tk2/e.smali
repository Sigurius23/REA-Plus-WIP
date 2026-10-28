.class public final Ltk2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ltk2/e;",
        "",
        "<init>",
        "()V",
        "Ljava/time/Duration;",
        "duration",
        "Ll83/k;",
        "Lcom/whoop/design/util/TextResource;",
        "b",
        "(Ljava/time/Duration;)Ll83/k;",
        "target",
        "a",
        "(Ljava/time/Duration;)Lcom/whoop/design/util/TextResource;",
        "track-activity_release"
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
.field public static final a:Ltk2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltk2/e;

    invoke-direct {v0}, Ltk2/e;-><init>()V

    sput-object v0, Ltk2/e;->a:Ltk2/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/time/Duration;)Lcom/whoop/design/util/TextResource;
    .locals 8

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    move-wide v0, v2

    :cond_0
    const-wide/16 v2, 0xe10

    div-long v4, v0, v2

    rem-long v2, v0, v2

    const-wide/16 v6, 0x3c

    div-long/2addr v2, v6

    rem-long/2addr v0, v6

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lkk2/d;->Z:I

    new-instance v7, Lcom/whoop/design/util/TextResource$d$a;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v7, v4}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$d$a;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v4, v2}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lcom/whoop/design/util/TextResource$d$a;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/whoop/design/util/TextResource$d;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    const/4 v1, 0x1

    aput-object v4, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    invoke-direct {p1, v6, v0}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    return-object p1
.end method

.method public final b(Ljava/time/Duration;)Ll83/k;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/time/Duration;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    move-wide v0, v2

    :cond_0
    const-wide/16 v2, 0xe10

    div-long v4, v0, v2

    rem-long v2, v0, v2

    const-wide/16 v6, 0x3c

    div-long/2addr v2, v6

    rem-long/2addr v0, v6

    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lkk2/d;->Y:I

    new-instance v7, Lcom/whoop/design/util/TextResource$d$a;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v7, v4}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$d$a;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v4, v2}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/whoop/design/util/TextResource$d;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    const/4 v5, 0x1

    aput-object v4, v2, v5

    invoke-direct {p1, v6, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lkk2/d;->a0:I

    new-instance v6, Lcom/whoop/design/util/TextResource$d$a;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    new-array v0, v5, [Lcom/whoop/design/util/TextResource$d;

    aput-object v6, v0, v3

    invoke-direct {v2, v4, v0}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
