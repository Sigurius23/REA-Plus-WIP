.class public final Ldp2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\n2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ!\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\n2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Ldp2/a;",
        "",
        "Lap2/a;",
        "analytics",
        "Lad3/c;",
        "json",
        "<init>",
        "(Lap2/a;Lad3/c;)V",
        "Lep2/a$k;",
        "event",
        "Lep2/a;",
        "d",
        "(Lep2/a$k;)Lep2/a;",
        "Lny0/h;",
        "cardButton",
        "c",
        "(Lny0/h;)Lep2/a;",
        "",
        "Lm91/u;",
        "elements",
        "a",
        "(Ljava/util/List;)Lep2/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "e",
        "(Lcom/whoop/navigation/e;)Lep2/a;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "b",
        "(Lcom/whoop/navigation/models/GenericInteraction;)Lep2/a;",
        "actionEvent",
        "",
        "source",
        "f",
        "(Lep2/a;Ljava/lang/String;)Lep2/a;",
        "Lap2/a;",
        "Lad3/c;",
        "universal-checkout_release"
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
.field private final a:Lap2/a;

.field private final b:Lad3/c;


# direct methods
.method public constructor <init>(Lap2/a;Lad3/c;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp2/a;->a:Lap2/a;

    iput-object p2, p0, Ldp2/a;->b:Lad3/c;

    return-void
.end method

.method private final a(Ljava/util/List;)Lep2/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;)",
            "Lep2/a;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/u;

    instance-of v1, v0, Lny0/h;

    if-eqz v1, :cond_0

    new-instance p1, Lep2/a$k;

    invoke-direct {p1, v0, v0}, Lep2/a$k;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-direct {p0, p1}, Ldp2/a;->d(Lep2/a$k;)Lep2/a;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/models/GenericInteraction;)Lep2/a;
    .locals 1

    iget-object v0, p0, Ldp2/a;->b:Lad3/c;

    invoke-static {p1, v0}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->toDecodedGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Lep2/a$d;

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lep2/a$d;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getDismissEvent()Lj02/s;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, Lep2/a$c;

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getDismissEvent()Lj02/s;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lep2/a$c;-><init>(Lj02/s;)V

    return-object v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final c(Lny0/h;)Lep2/a;
    .locals 3

    invoke-virtual {p1}, Lny0/h;->e()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lny0/h;->n()Lj02/s;

    move-result-object v1

    instance-of v2, v0, Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v2, :cond_0

    new-instance p1, Lep2/a$n;

    check-cast v0, Lcom/whoop/design/models/modal/AnyModal;

    invoke-direct {p1, v0}, Lep2/a$n;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object p1

    :cond_0
    if-eqz v1, :cond_1

    new-instance p1, Lep2/a$m;

    invoke-direct {p1, v1}, Lep2/a$m;-><init>(Lj02/s;)V

    return-object p1

    :cond_1
    new-instance v0, Lep2/a$b;

    invoke-direct {v0, p1}, Lep2/a$b;-><init>(Lm91/u;)V

    return-object v0
.end method

.method private final d(Lep2/a$k;)Lep2/a;
    .locals 1

    invoke-virtual {p1}, Lep2/a$k;->a()Lm91/u;

    move-result-object v0

    instance-of v0, v0, Ls21/h;

    if-eqz v0, :cond_0

    new-instance v0, Lep2/a$b;

    invoke-virtual {p1}, Lep2/a$k;->a()Lm91/u;

    move-result-object p1

    invoke-direct {v0, p1}, Lep2/a$b;-><init>(Lm91/u;)V

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lep2/a$k;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_1

    check-cast p1, Lny0/h;

    invoke-direct {p0, p1}, Ldp2/a;->c(Lny0/h;)Lep2/a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_2

    new-instance v0, Lep2/a$b;

    check-cast p1, Lm91/u;

    invoke-direct {v0, p1}, Lep2/a$b;-><init>(Lm91/u;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Ldp2/a;->e(Lcom/whoop/navigation/e;)Lep2/a;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, p1, Lio2/o;

    if-eqz p1, :cond_4

    sget-object p1, Lep2/a$p;->a:Lep2/a$p;

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method private final e(Lcom/whoop/navigation/e;)Lep2/a;
    .locals 1

    new-instance v0, Lep2/a$d;

    invoke-direct {v0, p1}, Lep2/a$d;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final f(Lep2/a;Ljava/lang/String;)Lep2/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lep2/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldp2/a;->a:Lap2/a;

    move-object v1, p1

    check-cast v1, Lep2/a$a;

    invoke-virtual {v0, v1, p2}, Lap2/a;->a(Lep2/a$a;Ljava/lang/String;)V

    :cond_0
    instance-of p2, p1, Lep2/a$k;

    if-eqz p2, :cond_1

    check-cast p1, Lep2/a$k;

    invoke-direct {p0, p1}, Ldp2/a;->d(Lep2/a$k;)Lep2/a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p2, p1, Lep2/a$h;

    if-eqz p2, :cond_2

    check-cast p1, Lep2/a$h;

    invoke-virtual {p1}, Lep2/a$h;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Ldp2/a;->a(Ljava/util/List;)Lep2/a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p2, p1, Lep2/a$i;

    if-eqz p2, :cond_3

    check-cast p1, Lep2/a$i;

    invoke-virtual {p1}, Lep2/a$i;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-direct {p0, p1}, Ldp2/a;->b(Lcom/whoop/navigation/models/GenericInteraction;)Lep2/a;

    move-result-object p1

    :cond_3
    return-object p1
.end method
