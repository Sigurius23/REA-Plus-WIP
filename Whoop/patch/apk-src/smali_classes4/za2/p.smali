.class public final Lza2/p;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001d\u0010(\u001a\u0008\u0012\u0004\u0012\u00020$0\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\"\u001a\u0004\u0008&\u0010\'R\u001d\u0010,\u001a\u0008\u0012\u0004\u0012\u00020)0\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010\"\u001a\u0004\u0008+\u0010\'\u00a8\u0006-"
    }
    d2 = {
        "Lza2/p;",
        "Landroidx/lifecycle/w1;",
        "Lza2/d;",
        "combiner",
        "Lza2/r;",
        "viewStateReducer",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lza2/d;Lza2/r;Lbc3/c0;)V",
        "Lza2/o;",
        "event",
        "Ll83/a0;",
        "n",
        "(Lza2/o;)V",
        "w",
        "Lza2/r;",
        "x",
        "Lbc3/c0;",
        "getScope",
        "()Lbc3/c0;",
        "Ltr2/n;",
        "y",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
        "logger",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lza2/e;",
        "E",
        "Lec3/l;",
        "output",
        "Lza2/q;",
        "F",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "Lza2/g;",
        "G",
        "l",
        "effects",
        "settings_release"
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
.field private final E:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final F:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
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

.field private final w:Lza2/r;

.field private final x:Lbc3/c0;

.field private final y:Ltr2/n;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lza2/d;Lza2/r;Lbc3/c0;)V
    .locals 4

    const-string v0, "combiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lza2/p;->w:Lza2/r;

    .line 3
    iput-object p3, p0, Lza2/p;->x:Lbc3/c0;

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "SettingsBannerViewModel"

    invoke-virtual {p2, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    iput-object p2, p0, Lza2/p;->y:Ltr2/n;

    const/4 p2, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 5
    invoke-static {v0, v0, v1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lza2/p;->z:Lec3/o1;

    .line 6
    new-instance v2, Lza2/p$a;

    invoke-direct {v2, v1}, Lza2/p$a;-><init>(Lq83/d;)V

    .line 7
    new-instance v1, Lec3/a0;

    invoke-direct {v1, v2, p2}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 8
    invoke-static {v1, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 9
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 v1, 0x1

    invoke-static {p1, p3, p2, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lza2/p;->E:Lec3/l;

    .line 10
    new-instance v2, Lza2/p$c;

    invoke-direct {v2, p1}, Lza2/p$c;-><init>(Lec3/l;)V

    .line 11
    new-instance v3, Lza2/p$e;

    invoke-direct {v3, v2, p0}, Lza2/p$e;-><init>(Lec3/l;Lza2/p;)V

    .line 12
    invoke-static {v3, p3, p2, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object v1

    iput-object v1, p0, Lza2/p;->F:Lec3/l;

    .line 13
    new-instance v1, Lza2/p$d;

    invoke-direct {v1, p1}, Lza2/p$d;-><init>(Lec3/l;)V

    .line 14
    new-instance p1, Lza2/p$f;

    invoke-direct {p1, v1}, Lza2/p$f;-><init>(Lec3/l;)V

    .line 15
    invoke-static {p1, p3, p2, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lza2/p;->G:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lza2/d;Lza2/r;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 16
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lza2/p;-><init>(Lza2/d;Lza2/r;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lza2/p;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lza2/p;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lza2/p;)Lza2/r;
    .locals 0

    iget-object p0, p0, Lza2/p;->w:Lza2/r;

    return-object p0
.end method


# virtual methods
.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lza2/p;->F:Lec3/l;

    return-object v0
.end method

.method public final l()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lza2/p;->G:Lec3/l;

    return-object v0
.end method

.method public final n(Lza2/o;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lza2/p;->x:Lbc3/c0;

    new-instance v1, Lza2/p$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lza2/p$b;-><init>(Lza2/p;Lza2/o;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
