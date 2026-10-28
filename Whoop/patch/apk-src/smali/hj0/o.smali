.class public abstract Lhj0/o;
.super Landroidx/lifecycle/w1;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0015\u00a2\u0006\u0004\u0008\u0008\u0010\tJ+\u0010\u000e\u001a\u00020\u0007\"\u0008\u0008\u0000\u0010\u000b*\u00020\n*\u0008\u0012\u0004\u0012\u00028\u00000\u000c2\u0006\u0010\r\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u0016\u001a\u0004\u0008(\u0010)R\u0014\u0010-\u001a\u00020\u00108&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,R<\u00102\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u000b*\u00020\n*\u0008\u0012\u0004\u0012\u00028\u00000\u000c2\u0008\u0010.\u001a\u0004\u0018\u00018\u00008D@DX\u0084\u000e\u00a2\u0006\u000c\u001a\u0004\u0008/\u00100\"\u0004\u00081\u0010\u000f\u00a8\u00063"
    }
    d2 = {
        "Lhj0/o;",
        "Landroidx/lifecycle/w1;",
        "Lof3/a;",
        "Lbc3/c0;",
        "viewModelScope",
        "<init>",
        "(Lbc3/c0;)V",
        "Ll83/a0;",
        "onCleared",
        "()V",
        "",
        "T",
        "Landroidx/lifecycle/p0;",
        "newValue",
        "t",
        "(Landroidx/lifecycle/p0;Ljava/lang/Object;)V",
        "",
        "sourceId",
        "u",
        "(Ljava/lang/String;)V",
        "Ltr2/n;",
        "w",
        "Ll83/h;",
        "n",
        "()Ltr2/n;",
        "log",
        "Lmh3/c;",
        "x",
        "Lmh3/c;",
        "q",
        "()Lmh3/c;",
        "subscriptions",
        "Ln73/a;",
        "y",
        "Ln73/a;",
        "l",
        "()Ln73/a;",
        "disposables",
        "Lcom/whoop/data/repositories/NotificationRepository;",
        "z",
        "p",
        "()Lcom/whoop/data/repositories/NotificationRepository;",
        "notificationRepository",
        "o",
        "()Ljava/lang/String;",
        "logTag",
        "value",
        "getLatestValue",
        "(Landroidx/lifecycle/p0;)Ljava/lang/Object;",
        "v",
        "latestValue",
        "feature_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# instance fields
.field private final w:Ll83/h;

.field private final x:Lmh3/c;

.field private final y:Ln73/a;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lhj0/o;-><init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lbc3/c0;)V
    .locals 2

    const-string v0, "viewModelScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 3
    new-instance p1, Lh02/n0;

    const/16 v0, 0x9

    invoke-direct {p1, p0, v0}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lhj0/o;->w:Ll83/h;

    .line 4
    new-instance p1, Lmh3/c;

    .line 5
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lhj0/o;->x:Lmh3/c;

    .line 7
    new-instance p1, Ln73/a;

    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lhj0/o;->y:Ln73/a;

    .line 10
    sget-object p1, Ll83/i;->w:Ll83/i;

    .line 11
    new-instance v0, Lhj0/o$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Lhj0/o$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    .line 12
    iput-object p1, p0, Lhj0/o;->z:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    .line 13
    new-instance p1, Lor2/m;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p3, p2}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1}, Lhj0/o;-><init>(Lbc3/c0;)V

    return-void
.end method

.method public static synthetic g(Lhj0/o;)Ltr2/n;
    .locals 0

    invoke-static {p0}, Lhj0/o;->r(Lhj0/o;)Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lhj0/o;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-direct {p0}, Lhj0/o;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method

.method private final p()Lcom/whoop/data/repositories/NotificationRepository;
    .locals 1

    iget-object v0, p0, Lhj0/o;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/NotificationRepository;

    return-object v0
.end method

.method private static final r(Lhj0/o;)Ltr2/n;
    .locals 1

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    invoke-virtual {p0}, Lhj0/o;->o()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public final l()Ln73/a;
    .locals 1

    iget-object v0, p0, Lhj0/o;->y:Ln73/a;

    return-object v0
.end method

.method public final n()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lhj0/o;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltr2/n;

    return-object v0
.end method

.method public abstract o()Ljava/lang/String;
.end method

.method public onCleared()V
    .locals 3

    invoke-virtual {p0}, Lhj0/o;->n()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "onCleared"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lhj0/o;->x:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->d()V

    iget-object v0, p0, Lhj0/o;->y:Ln73/a;

    invoke-virtual {v0}, Ln73/a;->d()V

    return-void
.end method

.method public final q()Lmh3/c;
    .locals 1

    iget-object v0, p0, Lhj0/o;->x:Lmh3/c;

    return-object v0
.end method

.method public final t(Landroidx/lifecycle/p0;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/p0;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/lifecycle/u0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final u(Ljava/lang/String;)V
    .locals 3

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lhj0/o$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lhj0/o$a;-><init>(Lhj0/o;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final v(Landroidx/lifecycle/p0;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/p0;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/lifecycle/u0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
