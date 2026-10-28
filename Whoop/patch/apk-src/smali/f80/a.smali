.class public final Lf80/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ*\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lf80/a;",
        "",
        "Lm5/f;",
        "credentialManager",
        "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
        "emailDataStoreHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lm5/f;Lcom/whoop/data/datastore/EmailDataStoreHelper;Ltr2/n;)V",
        "Landroid/content/Context;",
        "context",
        "Lf80/b;",
        "a",
        "(Landroid/content/Context;Lq83/d;)Ljava/lang/Object;",
        "",
        "email",
        "password",
        "Lf80/c;",
        "b",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lm5/f;",
        "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
        "c",
        "Ltr2/n;",
        "activation_release"
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
.field private final a:Lm5/f;

.field private final b:Lcom/whoop/data/datastore/EmailDataStoreHelper;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lm5/f;Lcom/whoop/data/datastore/EmailDataStoreHelper;Ltr2/n;)V
    .locals 1

    const-string v0, "credentialManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailDataStoreHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf80/a;->a:Lm5/f;

    .line 3
    iput-object p2, p0, Lf80/a;->b:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    .line 4
    iput-object p3, p0, Lf80/a;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lm5/f;Lcom/whoop/data/datastore/EmailDataStoreHelper;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "ActivationCredentialManagerHelper"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lf80/a;-><init>(Lm5/f;Lcom/whoop/data/datastore/EmailDataStoreHelper;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lq83/d<",
            "-",
            "Lf80/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lf80/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf80/a$a;

    iget v1, v0, Lf80/a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf80/a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf80/a$a;

    invoke-direct {v0, p0, p2}, Lf80/a$a;-><init>(Lf80/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lf80/a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf80/a$a;->E:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lf80/a$a;->x:Ljava/lang/Object;

    check-cast p1, Lm5/n;

    iget-object p1, v0, Lf80/a$a;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_5

    :catch_2
    move-exception p1

    goto/16 :goto_6

    :catch_3
    move-exception p1

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lm5/n;

    new-instance v2, Lm5/p;

    invoke-direct {v2}, Lm5/p;-><init>()V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {p2, v2}, Lm5/n;-><init>(Ljava/util/List;)V

    :try_start_1
    iget-object v2, p0, Lf80/a;->a:Lm5/f;

    iput-object v5, v0, Lf80/a$a;->w:Ljava/lang/Object;

    iput-object v5, v0, Lf80/a$a;->x:Ljava/lang/Object;

    iput v3, v0, Lf80/a$a;->E:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2, v0}, Lm5/f;->a(Landroid/content/Context;Lm5/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lm5/o;

    invoke-virtual {p2}, Lm5/o;->a()Le4/a;

    move-result-object p1

    instance-of p2, p1, Lm5/q;

    if-eqz p2, :cond_4

    check-cast p1, Lm5/q;

    goto :goto_2

    :cond_4
    move-object p1, v5

    :goto_2
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lm5/q;->U()Ljava/lang/String;

    move-result-object v5

    :cond_5
    if-eqz v5, :cond_7

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_3

    :cond_6
    new-instance p1, Lf80/b$b;

    invoke-direct {p1, v5}, Lf80/b$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_7
    :goto_3
    new-instance p1, Lf80/b$a;

    const-string p2, "no_password_credential"

    invoke-direct {p1, p2}, Lf80/b$a;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Landroidx/credentials/exceptions/GetCredentialCancellationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_4
    iget-object p2, p0, Lf80/a;->c:Ltr2/n;

    const-string v0, "CredentialManager: retrievePassword failed (unexpected)"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->a(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p2, Lf80/b$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lf80/b$a;-><init>(Ljava/lang/String;)V

    goto :goto_8

    :goto_5
    throw p1

    :goto_6
    iget-object p2, p0, Lf80/a;->c:Ltr2/n;

    const-string v0, "CredentialManager: retrievePassword failed"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->a(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p2, Lf80/b$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lf80/b$a;-><init>(Ljava/lang/String;)V

    goto :goto_8

    :goto_7
    iget-object p2, p0, Lf80/a;->c:Ltr2/n;

    const-string v0, "CredentialManager: retrievePassword cancelled by user"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->a(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p2, Lf80/b$c;->a:Lf80/b$c;

    :goto_8
    return-object p2
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lf80/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lf80/a$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lf80/a$b;

    iget v1, v0, Lf80/a$b;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf80/a$b;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf80/a$b;

    invoke-direct {v0, p0, p4}, Lf80/a$b;-><init>(Lf80/a;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lf80/a$b;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf80/a$b;->H:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lf80/a$b;->E:Ljava/lang/Object;

    check-cast p1, Lm5/d;

    iget-object p1, v0, Lf80/a$b;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lf80/a$b;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lf80/a$b;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lf80/a$b;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/credentials/exceptions/CreateCredentialCancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroidx/credentials/exceptions/CreateCredentialException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :catch_1
    move-exception p1

    goto/16 :goto_7

    :catch_2
    move-exception p1

    goto/16 :goto_8

    :catch_3
    move-exception p1

    goto/16 :goto_9

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lf80/a$b;->y:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Ljava/lang/String;

    iget-object p1, v0, Lf80/a$b;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lf80/a$b;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p2, :cond_4

    invoke-static {p2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_4
    move-object p2, v6

    :goto_1
    if-eqz p2, :cond_5

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_6

    :cond_5
    move-object p2, v6

    :cond_6
    if-nez p2, :cond_9

    iget-object p2, p0, Lf80/a;->b:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    iput-object p1, v0, Lf80/a$b;->w:Ljava/lang/Object;

    iput-object v6, v0, Lf80/a$b;->x:Ljava/lang/Object;

    iput-object p3, v0, Lf80/a$b;->y:Ljava/lang/Object;

    iput v4, v0, Lf80/a$b;->H:I

    invoke-virtual {p2, v0}, Lcom/whoop/data/datastore/EmailDataStoreHelper;->getEmail(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast p4, Ljava/lang/String;

    if-eqz p4, :cond_8

    invoke-static {p4}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_8
    move-object p2, v6

    :goto_3
    if-nez p2, :cond_9

    const-string p2, ""

    :cond_9
    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p4

    if-nez p4, :cond_c

    invoke-static {p3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_a

    goto :goto_b

    :cond_a
    new-instance p4, Lm5/d;

    invoke-direct {p4, p2, p3}, Lm5/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    iget-object p2, p0, Lf80/a;->a:Lm5/f;

    iput-object v6, v0, Lf80/a$b;->w:Ljava/lang/Object;

    iput-object v6, v0, Lf80/a$b;->x:Ljava/lang/Object;

    iput-object v6, v0, Lf80/a$b;->y:Ljava/lang/Object;

    iput-object v6, v0, Lf80/a$b;->z:Ljava/lang/Object;

    iput-object v6, v0, Lf80/a$b;->E:Ljava/lang/Object;

    iput v3, v0, Lf80/a$b;->H:I

    invoke-interface {p2, p1, p4, v0}, Lm5/f;->b(Landroid/content/Context;Lm5/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_4
    return-object v1

    :cond_b
    :goto_5
    sget-object p1, Lf80/c;->Success:Lf80/c;
    :try_end_1
    .catch Landroidx/credentials/exceptions/CreateCredentialCancellationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroidx/credentials/exceptions/CreateCredentialException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_6
    iget-object p2, p0, Lf80/a;->c:Ltr2/n;

    const-string p3, "CredentialManager: savePassword failed (unexpected)"

    new-array p4, v5, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, p4}, Ltr2/n;->a(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lf80/c;->Failure:Lf80/c;

    goto :goto_a

    :goto_7
    iget-object p2, p0, Lf80/a;->c:Ltr2/n;

    const-string p3, "CredentialManager: savePassword failed"

    new-array p4, v5, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, p4}, Ltr2/n;->a(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lf80/c;->Failure:Lf80/c;

    goto :goto_a

    :goto_8
    throw p1

    :goto_9
    iget-object p2, p0, Lf80/a;->c:Ltr2/n;

    const-string p3, "CredentialManager: savePassword cancelled by user"

    new-array p4, v5, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, p4}, Ltr2/n;->a(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lf80/c;->UserCancelled:Lf80/c;

    :goto_a
    return-object p1

    :cond_c
    :goto_b
    sget-object p1, Lf80/c;->NotAttempted:Lf80/c;

    return-object p1
.end method
