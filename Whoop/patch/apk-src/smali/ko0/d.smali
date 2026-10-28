.class public final Lko0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lko0/d;",
        "",
        "<init>",
        "()V",
        "Llo0/z$c;",
        "actionEvent",
        "Llo0/z;",
        "a",
        "(Llo0/z$c;)Llo0/z;",
        "Llo0/z$e;",
        "event",
        "b",
        "(Llo0/z$e;)Llo0/z;",
        "Lm91/u;",
        "itemViewState",
        "c",
        "(Lm91/u;)Llo0/z;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "d",
        "(Lcom/whoop/navigation/e;)Llo0/z;",
        "e",
        "(Llo0/z;)Llo0/z;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Llo0/z$c;)Llo0/z;
    .locals 7

    invoke-virtual {p1}, Llo0/z$c;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lo71/f;

    if-eqz v0, :cond_0

    new-instance v1, Llo0/z$q;

    check-cast p1, Lo71/f;

    invoke-virtual {p1}, Lo71/f;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1}, Lo71/f;->a()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Llo0/z$q;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lo71/d;

    if-eqz v0, :cond_1

    new-instance v1, Llo0/z$q;

    check-cast p1, Lo71/d;

    invoke-virtual {p1}, Lo71/d;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lo71/d;->b()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Llo0/z$q;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lo71/e;

    if-eqz v0, :cond_2

    new-instance v0, Llo0/z$q;

    check-cast p1, Lo71/e;

    invoke-virtual {p1}, Lo71/e;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lo71/e;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lo71/e;->b()Lcom/whoop/domain/model/UnitSystem;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Llo0/z$q;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;)V

    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Llo0/z$e;)Llo0/z;
    .locals 1

    invoke-virtual {p1}, Llo0/z$e;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ln01/f;

    if-eqz v0, :cond_0

    new-instance v0, Llo0/z$k;

    check-cast p1, Ln01/f;

    invoke-virtual {p1}, Ln01/f;->b()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Llo0/z$k;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_1

    check-cast p1, Lm91/u;

    invoke-direct {p0, p1}, Lko0/d;->c(Lm91/u;)Llo0/z;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Lko0/d;->d(Lcom/whoop/navigation/e;)Llo0/z;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private final c(Lm91/u;)Llo0/z;
    .locals 1

    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_0

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lko0/d;->d(Lcom/whoop/navigation/e;)Llo0/z;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final d(Lcom/whoop/navigation/e;)Llo0/z;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Llo0/z$a;

    invoke-direct {v0, p1}, Llo0/z$a;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    sget-object p1, Llo0/z$b;->a:Llo0/z$b;

    return-object p1
.end method


# virtual methods
.method public final e(Llo0/z;)Llo0/z;
    .locals 1

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llo0/z$e;

    if-eqz v0, :cond_0

    check-cast p1, Llo0/z$e;

    invoke-direct {p0, p1}, Lko0/d;->b(Llo0/z$e;)Llo0/z;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Llo0/z$c;

    if-eqz v0, :cond_1

    check-cast p1, Llo0/z$c;

    invoke-direct {p0, p1}, Lko0/d;->a(Llo0/z$c;)Llo0/z;

    move-result-object p1

    :cond_1
    return-object p1
.end method
