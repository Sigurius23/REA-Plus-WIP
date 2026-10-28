.class public final Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;",
        "",
        "Lnm0/e;",
        "cachedApiSource",
        "Ltr2/n;",
        "logger",
        "",
        "maxAttempts",
        "",
        "retryDelayMs",
        "<init>",
        "(Lnm0/e;Ltr2/n;IJ)V",
        "",
        "activityType",
        "Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;",
        "d",
        "(Ljava/lang/String;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Ltr2/n;",
        "c",
        "I",
        "J",
        "e",
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
.field public static final e:Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$a;

.field public static final f:I


# instance fields
.field private final a:Lnm0/e;

.field private final b:Ltr2/n;

.field private final c:I

.field private final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->e:Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->f:I

    return-void
.end method

.method public constructor <init>(Lnm0/e;Ltr2/n;IJ)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->a:Lnm0/e;

    .line 3
    iput-object p2, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->b:Ltr2/n;

    .line 4
    iput p3, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->c:I

    .line 5
    iput-wide p4, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Ltr2/n;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 6
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p7, "SessionTargetsFetcher"

    invoke-virtual {p2, p7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x3

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const-wide/16 p4, 0x1f4

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-wide v4, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;-><init>(Lnm0/e;Ltr2/n;IJ)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->f(Ljava/lang/String;Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;II)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->e(Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;II)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->b:Ltr2/n;

    return-object p0
.end method

.method private static final e(Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;II)Ll83/a0;
    .locals 4

    iget-object v0, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->b:Ltr2/n;

    add-int/lit8 p2, p2, 0x1

    iget p0, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->c:I

    const-string v1, ") for ["

    const-string v2, "]; retry "

    const-string v3, "Live activity targets transient error ("

    invoke-static {p3, v3, v1, p1, v2}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " of "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v0, p0, p1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ljava/lang/String;Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;)Lec3/l;
    .locals 3

    new-instance v0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$fetch$2$1;

    invoke-direct {v0, p2}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$fetch$2$1;-><init>(Ljava/lang/String;)V

    new-instance p2, La6/u;

    const/4 v1, 0x1

    invoke-direct {p2, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p2, v1, p0, v0, v1}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p2

    iget-object v0, p1, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->a:Lnm0/e;

    new-instance v2, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$c;

    invoke-direct {v2, v1, v0}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$c;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p2, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p2

    new-instance v0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;

    invoke-direct {v0, p1, p0, v1}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;-><init>(Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;Lq83/d;)V

    new-instance p0, Lec3/a0;

    invoke-direct {p0, p2, v0}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/String;)Lec3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "activityType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lec3/k;->w:Lec3/k;

    return-object p1

    :cond_0
    sget-object v0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->e:Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$a;

    invoke-virtual {v0, p1}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->c:I

    iget-wide v2, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->d:J

    new-instance v4, Lj21/d;

    const/16 v5, 0x10

    invoke-direct {v4, v5, p0, v0}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lim1/a0;

    const/16 v6, 0x1d

    invoke-direct {v5, v6, p0, p1, v0}, Lim1/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4, v5}, Lmk2/h;->c(IJLc93/m;Lc93/a;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
