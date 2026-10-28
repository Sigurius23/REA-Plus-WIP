.class public abstract Lmp0/k0;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000f\u001a\u00020\n8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u000e\u00a8\u0006\u0017"
    }
    d2 = {
        "Lmp0/k0;",
        "Lhj0/m;",
        "<init>",
        "()V",
        "Lmp0/b1;",
        "w",
        "Ll83/h;",
        "F",
        "()Lmp0/b1;",
        "conductorViewModel",
        "",
        "x",
        "Z",
        "getShowBottomNavigationBar",
        "()Z",
        "showBottomNavigationBar",
        "Lor2/u0;",
        "y",
        "G",
        "()Lor2/u0;",
        "localizedDateTimeFormatter",
        "H",
        "isUsing24HourFormat",
        "sleep-coach_release"
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
.field private final w:Ll83/h;

.field private final x:Z

.field private final y:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/m;-><init>()V

    new-instance v0, Lmp0/k0$b;

    invoke-direct {v0, p0}, Lmp0/k0$b;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lmp0/k0$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lmp0/k0$c;-><init>(Landroidx/fragment/app/m0;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lmp0/k0;->w:Ll83/h;

    new-instance v0, Llive/hms/video/connection/degredation/a;

    const/16 v1, 0xe

    invoke-direct {v0, p0, v1}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lmp0/k0$a;

    invoke-direct {v2, p0, v3, v0}, Lmp0/k0$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lmp0/k0;->y:Ll83/h;

    return-void
.end method

.method public static synthetic E(Lmp0/k0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lmp0/k0;->I(Lmp0/k0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final G()Lor2/u0;
    .locals 1

    iget-object v0, p0, Lmp0/k0;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/u0;

    return-object v0
.end method

.method private static final I(Lmp0/k0;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F()Lmp0/b1;
    .locals 1

    iget-object v0, p0, Lmp0/k0;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmp0/b1;

    return-object v0
.end method

.method public final H()Z
    .locals 1

    invoke-direct {p0}, Lmp0/k0;->G()Lor2/u0;

    move-result-object v0

    invoke-virtual {v0}, Lor2/u0;->l()Z

    move-result v0

    return v0
.end method

.method public getShowBottomNavigationBar()Z
    .locals 1

    iget-boolean v0, p0, Lmp0/k0;->x:Z

    return v0
.end method
