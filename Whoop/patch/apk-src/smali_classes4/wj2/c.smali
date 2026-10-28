.class public final Lwj2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwj2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lwj2/c;",
        "",
        "Lcom/whoop/tiltgraph/api/TiltGraphApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Luj2/b;",
        "analyticsHelper",
        "<init>",
        "(Lcom/whoop/tiltgraph/api/TiltGraphApi;Ltr2/n;Luj2/b;)V",
        "Ljava/time/LocalDate;",
        "date",
        "",
        "entrySource",
        "",
        "shouldLogAnalytics",
        "Lwj2/b;",
        "f",
        "(Ljava/time/LocalDate;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lwj2/a;",
        "upstream",
        "g",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/tiltgraph/api/TiltGraphApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Luj2/b;",
        "d",
        "tilt-graph_release"
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
.field public static final d:Lwj2/c$a;

.field public static final e:I

.field private static final f:Ljava/time/format/DateTimeFormatter;


# instance fields
.field private final a:Lcom/whoop/tiltgraph/api/TiltGraphApi;

.field private final b:Ltr2/n;

.field private final c:Luj2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwj2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwj2/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwj2/c;->d:Lwj2/c$a;

    const/16 v0, 0x8

    sput v0, Lwj2/c;->e:I

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lwj2/c;->f:Ljava/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/tiltgraph/api/TiltGraphApi;Ltr2/n;Luj2/b;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwj2/c;->a:Lcom/whoop/tiltgraph/api/TiltGraphApi;

    .line 3
    iput-object p2, p0, Lwj2/c;->b:Ltr2/n;

    .line 4
    iput-object p3, p0, Lwj2/c;->c:Luj2/b;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/tiltgraph/api/TiltGraphApi;Ltr2/n;Luj2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "TiltGraphInteractor"

    invoke-virtual {p2, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lwj2/c;-><init>(Lcom/whoop/tiltgraph/api/TiltGraphApi;Ltr2/n;Luj2/b;)V

    return-void
.end method

.method public static final synthetic a(Lwj2/c;Ljava/time/LocalDate;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lwj2/c;->f(Ljava/time/LocalDate;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lwj2/c;)Luj2/b;
    .locals 0

    iget-object p0, p0, Lwj2/c;->c:Luj2/b;

    return-object p0
.end method

.method public static final synthetic c(Lwj2/c;)Lcom/whoop/tiltgraph/api/TiltGraphApi;
    .locals 0

    iget-object p0, p0, Lwj2/c;->a:Lcom/whoop/tiltgraph/api/TiltGraphApi;

    return-object p0
.end method

.method public static final synthetic d()Ljava/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lwj2/c;->f:Ljava/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final synthetic e(Lwj2/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lwj2/c;->b:Ltr2/n;

    return-object p0
.end method

.method private final f(Ljava/time/LocalDate;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/time/LocalDate;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Lwj2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lwj2/c$b;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lwj2/c$b;-><init>(Lwj2/c;Ljava/time/LocalDate;ZLjava/lang/String;Lq83/d;)V

    const-wide/16 p1, 0x3e8

    invoke-static {p1, p2, v0, p4}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final g(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwj2/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lwj2/c$c;-><init>(Lq83/d;Lwj2/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
