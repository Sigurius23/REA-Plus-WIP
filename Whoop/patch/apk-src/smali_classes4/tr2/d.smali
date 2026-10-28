.class public Ltr2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/time/format/DateTimeFormatter;


# instance fields
.field private final a:Llh3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/k;"
        }
    .end annotation
.end field

.field private final b:Lxg3/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "H:mm:ss:SSS"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Ltr2/d;->c:Ljava/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Ltr2/e;Ltr2/j;Lxg3/k;Lor2/g;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llh3/j;

    new-instance v1, Llh3/h;

    const/16 v2, 0x3e8

    invoke-direct {v1, v2}, Llh3/h;-><init>(I)V

    new-instance v2, Llh3/d;

    invoke-direct {v2, v1}, Llh3/d;-><init>(Llh3/h;)V

    new-instance v1, Llh3/i;

    invoke-direct {v1, v2}, Llh3/i;-><init>(Llh3/d;)V

    invoke-direct {v0, v1}, Llh3/j;-><init>(Llh3/k;)V

    iput-object v0, p0, Ltr2/d;->a:Llh3/k;

    iput-object p3, p0, Ltr2/d;->b:Lxg3/k;

    invoke-virtual {p4}, Lor2/g;->e()Ljava/lang/String;

    move-result-object p3

    const-string p4, "qaDev"

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    new-instance p3, Ltr2/c;

    invoke-direct {p3, p0, p2}, Ltr2/c;-><init>(Ltr2/d;Ltr2/j;)V

    invoke-virtual {p1, p3}, Ltr2/e;->y(Ltr2/k;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Ltr2/d;Ltr2/j;Lcom/whoop/domain/model/event/LoggableEvent;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ltr2/d;->b(Ltr2/j;Lcom/whoop/domain/model/event/LoggableEvent;)V

    return-void
.end method

.method private synthetic b(Ltr2/j;Lcom/whoop/domain/model/event/LoggableEvent;)V
    .locals 2

    iget-object v0, p2, Lqr2/a;->tags:Ljava/util/Set;

    sget-object v1, Lqr2/a$a;->CHATTY:Lqr2/a$a;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Ltr2/j;->a(Lcom/whoop/domain/model/event/LoggableEvent;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ltr2/d;->a:Llh3/k;

    new-instance v1, Lmm2/c;

    iget p2, p2, Lcom/whoop/domain/model/event/LoggableEvent;->level:I

    invoke-direct {v1, p1, p2}, Lmm2/c;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public c()Lxg3/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/util/List<",
            "Lmm2/c;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ltr2/d;->a:Llh3/k;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Ltr2/d;->b:Lxg3/k;

    const-wide/16 v3, 0x12c

    invoke-virtual {v0, v3, v4, v1, v2}, Lxg3/g;->c(JLjava/util/concurrent/TimeUnit;Lxg3/k;)Lxg3/g;

    move-result-object v0

    return-object v0
.end method
