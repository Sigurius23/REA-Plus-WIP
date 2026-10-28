.class public final Lcom/whoop/data/datastore/EmailDataStoreHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u000eR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
        "",
        "La6/g;",
        "Lf6/f;",
        "prefs",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(La6/g;Ltr2/n;)V",
        "Lec3/l;",
        "",
        "emailFlow",
        "()Lec3/l;",
        "getEmail",
        "(Lq83/d;)Ljava/lang/Object;",
        "value",
        "Ll83/a0;",
        "saveEmail",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "clearEmail",
        "La6/g;",
        "Ltr2/n;",
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


# instance fields
.field private final logger:Ltr2/n;

.field private final prefs:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La6/g;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "prefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->prefs:La6/g;

    .line 3
    iput-object p2, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->logger:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(La6/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "EmailDataStoreHelper"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/data/datastore/EmailDataStoreHelper;-><init>(La6/g;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/data/datastore/EmailDataStoreHelper;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->logger:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public final clearEmail(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;

    iget v1, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;-><init>(Lcom/whoop/data/datastore/EmailDataStoreHelper;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->prefs:La6/g;

    new-instance v2, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$2;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$2;-><init>(Lq83/d;)V

    iput v3, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$clearEmail$1;->label:I

    invoke-static {p1, v2, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object v0, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->logger:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "[EmailDataStoreHelper] Failed to clear email"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    throw p1
.end method

.method public final emailFlow()Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->prefs:La6/g;

    invoke-interface {v0}, La6/g;->getData()Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/datastore/EmailDataStoreHelper$emailFlow$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/datastore/EmailDataStoreHelper$emailFlow$1;-><init>(Lcom/whoop/data/datastore/EmailDataStoreHelper;Lq83/d;)V

    new-instance v2, Lec3/a0;

    invoke-direct {v2, v0, v1}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$emailFlow$$inlined$map$1;

    invoke-direct {v0, v2}, Lcom/whoop/data/datastore/EmailDataStoreHelper$emailFlow$$inlined$map$1;-><init>(Lec3/l;)V

    invoke-static {v0}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v0

    return-object v0
.end method

.method public final getEmail(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/datastore/EmailDataStoreHelper$getEmail$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$getEmail$1;

    iget v1, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$getEmail$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$getEmail$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$getEmail$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/datastore/EmailDataStoreHelper$getEmail$1;-><init>(Lcom/whoop/data/datastore/EmailDataStoreHelper;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$getEmail$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$getEmail$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->prefs:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v3, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$getEmail$1;->label:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lf6/f;

    invoke-static {}, Lcom/whoop/data/datastore/EmailDataStoreHelperKt;->access$getEMAIL_KEY$p()Lf6/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v0, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->logger:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "[EmailDataStoreHelper] Failed to read email"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1

    :goto_3
    throw p1
.end method

.method public final saveEmail(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;

    iget v1, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;-><init>(Lcom/whoop/data/datastore/EmailDataStoreHelper;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->prefs:La6/g;

    new-instance v2, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$2;

    const/4 v4, 0x0

    invoke-direct {v2, p1, v4}, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$2;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v4, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/datastore/EmailDataStoreHelper$saveEmail$1;->label:I

    invoke-static {p2, v2, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object p2, p0, Lcom/whoop/data/datastore/EmailDataStoreHelper;->logger:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "[EmailDataStoreHelper] Failed to save email"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    throw p1
.end method
