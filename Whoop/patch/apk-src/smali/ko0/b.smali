.class public final Lko0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lko0/b;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Lad3/c;",
        "json",
        "<init>",
        "(Lj02/o0;Leb/a0;Lad3/c;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "b",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "genericInteraction",
        "c",
        "(Lcom/whoop/navigation/models/GenericInteraction;)V",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "d",
        "(Lcom/whoop/navigation/e;)V",
        "Llo0/j;",
        "event",
        "e",
        "(Llo0/j;)V",
        "Lj02/o0;",
        "Leb/a0;",
        "Lad3/c;",
        "clinician-in-the-loop_release"
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
.field private final a:Lj02/o0;

.field private final b:Leb/a0;

.field private final c:Lad3/c;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Lad3/c;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko0/b;->a:Lj02/o0;

    iput-object p2, p0, Lko0/b;->b:Leb/a0;

    iput-object p3, p0, Lko0/b;->c:Lad3/c;

    return-void
.end method

.method private final a()V
    .locals 1

    iget-object v0, p0, Lko0/b;->b:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lko0/b;->b()V

    :cond_0
    return-void
.end method

.method private final b()V
    .locals 6

    new-instance v0, Lcom/whoop/navigation/e;

    new-instance v2, Lcom/whoop/navigation/HomeScreenModel;

    const/4 v1, 0x0

    const/4 v3, 0x3

    invoke-direct {v2, v1, v1, v3, v1}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lko0/b;->d(Lcom/whoop/navigation/e;)V

    return-void
.end method

.method private final c(Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    invoke-direct {p0}, Lko0/b;->a()V

    iget-object v0, p0, Lko0/b;->c:Lad3/c;

    invoke-static {p1, v0}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->toDecodedGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object p1

    if-nez p1, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lko0/b;->d(Lcom/whoop/navigation/e;)V

    return-void
.end method

.method private final d(Lcom/whoop/navigation/e;)V
    .locals 1

    iget-object v0, p0, Lko0/b;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void
.end method


# virtual methods
.method public final e(Llo0/j;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llo0/h;->a:Llo0/h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lko0/b;->a()V

    return-void

    :cond_0
    instance-of v0, p1, Llo0/g;

    if-eqz v0, :cond_1

    check-cast p1, Llo0/g;

    invoke-virtual {p1}, Llo0/g;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-direct {p0, p1}, Lko0/b;->c(Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
