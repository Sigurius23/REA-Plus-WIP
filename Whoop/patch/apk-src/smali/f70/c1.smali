.class public final Lf70/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lf70/c1;",
        "",
        "Lad3/c;",
        "json",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lad3/c;Ltr2/n;)V",
        "",
        "errorBody",
        "Lcom/whoop/activation/domain/interactors/activation/SubscriptionError;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/activation/domain/interactors/activation/SubscriptionError;",
        "Lad3/c;",
        "b",
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
.field private final a:Lad3/c;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lad3/c;Ltr2/n;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/c1;->a:Lad3/c;

    .line 3
    iput-object p2, p0, Lf70/c1;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lad3/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "SubscriptionErrorParser"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lf70/c1;-><init>(Lad3/c;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/whoop/activation/domain/interactors/activation/SubscriptionError;
    .locals 7

    const-string v0, ". Body: "

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_3

    :cond_0
    :try_start_0
    iget-object v3, p0, Lf70/c1;->a:Lad3/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/whoop/activation/domain/interactors/activation/SubscriptionError;->Companion:Lcom/whoop/activation/domain/interactors/activation/SubscriptionError$a;

    invoke-virtual {v4}, Lcom/whoop/activation/domain/interactors/activation/SubscriptionError$a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/b;

    invoke-virtual {v3, v4, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/interactors/activation/SubscriptionError;
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception v3

    goto :goto_0

    :catch_1
    move-exception v3

    goto :goto_1

    :goto_0
    iget-object v4, p0, Lf70/c1;->b:Ltr2/n;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Unexpected error parsing subscription response body: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, p1, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {v4, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :goto_1
    iget-object v4, p0, Lf70/c1;->b:Ltr2/n;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Failed to parse subscription error response body: "

    invoke-static {v5, v3, v0, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {v4, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_2
    return-object v1

    :cond_1
    :goto_3
    iget-object p1, p0, Lf70/c1;->b:Ltr2/n;

    const-string v0, "Error body is null or empty, cannot deserialize."

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1
.end method
