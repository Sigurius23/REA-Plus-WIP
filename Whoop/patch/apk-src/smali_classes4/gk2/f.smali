.class public final Lgk2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lgk2/f;",
        "",
        "Lic/p0;",
        "workManager",
        "<init>",
        "(Lic/p0;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "Lic/p0;",
        "tombstone_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lic/p0;


# direct methods
.method public constructor <init>(Lic/p0;)V
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgk2/f;->a:Lic/p0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    new-instance v0, Lrc/e;

    sget-object v0, Lic/x;->w:Lic/x;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v3, Lic/x;->x:Lic/x;

    new-instance v2, Lrc/e;

    const/4 v1, 0x0

    invoke-direct {v2, v1}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v12

    new-instance v1, Lic/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, -0x1

    move-wide v10, v8

    invoke-direct/range {v1 .. v12}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    const-wide/16 v2, 0x1

    invoke-static {v2, v3}, Ljava/time/Duration;->ofDays(J)Ljava/time/Duration;

    move-result-object v0

    const-string v2, "ofDays(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x2

    invoke-static {v2, v3}, Ljava/time/Duration;->ofHours(J)Ljava/time/Duration;

    move-result-object v2

    const-string v3, "ofHours(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lic/j0;

    const-class v4, Lcom/whoop/tombstone/TombstoneWorker;

    invoke-direct {v3, v4}, Lic/q0;-><init>(Ljava/lang/Class;)V

    iget-object v4, v3, Lic/q0;->c:Lqc/q;

    invoke-virtual {v0}, Ljava/time/Duration;->toMillis()J

    move-result-wide v5

    invoke-virtual {v2}, Ljava/time/Duration;->toMillis()J

    move-result-wide v7

    invoke-virtual {v4, v5, v6, v7, v8}, Lqc/q;->f(JJ)V

    invoke-virtual {v3, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    sget-object v1, Lic/a;->w:Lic/a;

    const-wide/16 v1, 0x5

    invoke-static {v1, v2}, Ljava/time/Duration;->ofMinutes(J)Ljava/time/Duration;

    move-result-object v1

    const-string v2, "ofMinutes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lic/a;->x:Lic/a;

    const/4 v3, 0x1

    iput-boolean v3, v0, Lic/q0;->a:Z

    iget-object v3, v0, Lic/q0;->c:Lqc/q;

    iput-object v2, v3, Lqc/q;->l:Lic/a;

    invoke-virtual {v1}, Ljava/time/Duration;->toMillis()J

    move-result-wide v1

    invoke-virtual {v3, v1, v2}, Lqc/q;->d(J)V

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/k0;

    iget-object v1, p0, Lgk2/f;->a:Lic/p0;

    const-string v2, "tombstoneworker"

    sget-object v3, Lic/k;->w:Lic/k;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    return-void
.end method
