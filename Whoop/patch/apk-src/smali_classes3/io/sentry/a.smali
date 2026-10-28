.class public final Lio/sentry/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:Lio/sentry/protocol/j0;

.field public final c:Lcom/iterable/iterableapi/n1;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/n1;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lio/sentry/a;->a:[B

    .line 17
    iput-object v0, p0, Lio/sentry/a;->b:Lio/sentry/protocol/j0;

    .line 18
    iput-object p1, p0, Lio/sentry/a;->c:Lcom/iterable/iterableapi/n1;

    .line 19
    const-string p1, "screenshot.png"

    iput-object p1, p0, Lio/sentry/a;->d:Ljava/lang/String;

    .line 20
    const-string p1, "image/png"

    iput-object p1, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 21
    const-string p1, "event.attachment"

    iput-object p1, p0, Lio/sentry/a;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/j0;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lio/sentry/a;->a:[B

    .line 10
    iput-object p1, p0, Lio/sentry/a;->b:Lio/sentry/protocol/j0;

    .line 11
    iput-object v0, p0, Lio/sentry/a;->c:Lcom/iterable/iterableapi/n1;

    .line 12
    const-string p1, "view-hierarchy.json"

    iput-object p1, p0, Lio/sentry/a;->d:Ljava/lang/String;

    .line 13
    const-string p1, "application/json"

    iput-object p1, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 14
    const-string p1, "event.view_hierarchy"

    iput-object p1, p0, Lio/sentry/a;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p4, p0, Lio/sentry/a;->a:[B

    const/4 p4, 0x0

    .line 3
    iput-object p4, p0, Lio/sentry/a;->b:Lio/sentry/protocol/j0;

    .line 4
    iput-object p4, p0, Lio/sentry/a;->c:Lcom/iterable/iterableapi/n1;

    .line 5
    iput-object p1, p0, Lio/sentry/a;->d:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lio/sentry/a;->f:Ljava/lang/String;

    return-void
.end method

.method public static a(Lcom/iterable/iterableapi/n1;)Lio/sentry/a;
    .locals 1

    new-instance v0, Lio/sentry/a;

    invoke-direct {v0, p0}, Lio/sentry/a;-><init>(Lcom/iterable/iterableapi/n1;)V

    return-object v0
.end method

.method public static b([B)Lio/sentry/a;
    .locals 4

    new-instance v0, Lio/sentry/a;

    const-string v1, "text/plain"

    const-string v2, "event.attachment"

    const-string v3, "thread-dump.txt"

    invoke-direct {v0, v3, v1, v2, p0}, Lio/sentry/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object v0
.end method

.method public static c(Lio/sentry/protocol/j0;)Lio/sentry/a;
    .locals 1

    new-instance v0, Lio/sentry/a;

    invoke-direct {v0, p0}, Lio/sentry/a;-><init>(Lio/sentry/protocol/j0;)V

    return-object v0
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/a;->d:Ljava/lang/String;

    return-object v0
.end method
