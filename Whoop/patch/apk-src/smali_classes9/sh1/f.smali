.class public final Lsh1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lsh1/f;",
        "Lof3/a;",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lbc3/c0;)V",
        "",
        "Landroid/location/Location;",
        "locations",
        "Ll83/a0;",
        "d",
        "(Ljava/util/List;)V",
        "w",
        "Lbc3/c0;",
        "Lii1/a;",
        "x",
        "Ll83/h;",
        "b",
        "()Lii1/a;",
        "gpsStorage",
        "Ltr2/n;",
        "y",
        "Ltr2/n;",
        "c",
        "()Ltr2/n;",
        "logger",
        "gps-tracking_release"
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
.field private final w:Lbc3/c0;

.field private final x:Ll83/h;

.field private final y:Ltr2/n;


# direct methods
.method public constructor <init>(Lbc3/c0;)V
    .locals 2

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsh1/f;->w:Lbc3/c0;

    .line 3
    sget-object p1, Ll83/i;->w:Ll83/i;

    .line 4
    new-instance v0, Lsh1/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Lsh1/f$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    .line 5
    iput-object p1, p0, Lsh1/f;->x:Ll83/h;

    .line 6
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "BackgroundLocationReceiver"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lsh1/f;->y:Ltr2/n;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 7
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    .line 8
    sget-object p2, Lkc3/d;->w:Lkc3/d;

    .line 9
    invoke-static {p1, p2}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    .line 10
    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Lsh1/f;-><init>(Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic a(Lsh1/f;)Lii1/a;
    .locals 0

    invoke-direct {p0}, Lsh1/f;->b()Lii1/a;

    move-result-object p0

    return-object p0
.end method

.method private final b()Lii1/a;
    .locals 1

    iget-object v0, p0, Lsh1/f;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lii1/a;

    return-object v0
.end method


# virtual methods
.method public final c()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lsh1/f;->y:Ltr2/n;

    return-object v0
.end method

.method public final d(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsh1/f;->w:Lbc3/c0;

    new-instance v1, Lsh1/f$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lsh1/f$a;-><init>(Ljava/util/List;Lsh1/f;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
