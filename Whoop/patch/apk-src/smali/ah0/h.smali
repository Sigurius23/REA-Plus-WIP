.class public final Lah0/h;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lah0/i;",
        "Lah0/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR \u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00020 8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lah0/h;",
        "Lld1/c;",
        "Lah0/i;",
        "Lah0/g;",
        "Lcom/whoop/ai/chat/domain/formwidget/f;",
        "interactor",
        "Lah0/j;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/ai/chat/domain/formwidget/f;Lah0/j;Lbc3/c0;)V",
        "event",
        "Ll83/a0;",
        "n",
        "(Lah0/g;)V",
        "x",
        "Lcom/whoop/ai/chat/domain/formwidget/f;",
        "y",
        "Lah0/j;",
        "z",
        "Lbc3/c0;",
        "Lec3/o1;",
        "Lcom/whoop/ai/chat/domain/formwidget/c;",
        "E",
        "Lec3/o1;",
        "actionFlow",
        "Lec3/t1;",
        "Lcom/whoop/ai/chat/domain/formwidget/d;",
        "F",
        "Lec3/t1;",
        "widgetState",
        "Lec3/l;",
        "G",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "bot_release"
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
.field private final E:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final F:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final G:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final x:Lcom/whoop/ai/chat/domain/formwidget/f;

.field private final y:Lah0/j;

.field private final z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lah0/j;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lah0/h;->x:Lcom/whoop/ai/chat/domain/formwidget/f;

    .line 3
    iput-object p2, p0, Lah0/h;->y:Lah0/j;

    .line 4
    iput-object p3, p0, Lah0/h;->z:Lbc3/c0;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lah0/h;->E:Lec3/o1;

    .line 6
    invoke-virtual {p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 7
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p1, p3, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lah0/h;->F:Lec3/t1;

    .line 8
    new-instance v1, Lah0/h$b;

    invoke-direct {v1, p1, p0}, Lah0/h$b;-><init>(Lec3/l;Lah0/h;)V

    .line 9
    invoke-static {v1, p3, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lah0/h;->G:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lah0/j;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 10
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lah0/h;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lah0/j;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic j(Lah0/h;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lah0/h;->E:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lah0/h;)Lah0/j;
    .locals 0

    iget-object p0, p0, Lah0/h;->y:Lah0/j;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lah0/g;

    invoke-virtual {p0, p1}, Lah0/h;->n(Lah0/g;)V

    return-void
.end method

.method public getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lah0/h;->G:Lec3/l;

    return-object v0
.end method

.method public n(Lah0/g;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lah0/h;->z:Lbc3/c0;

    new-instance v1, Lah0/h$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lah0/h$a;-><init>(Lah0/g;Lah0/h;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
