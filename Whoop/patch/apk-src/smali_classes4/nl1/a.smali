.class public final Lnl1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0013\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001d\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001d0!8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lnl1/a;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Ltr2/n;",
        "logger",
        "Lgt0/e;",
        "firmwareUpdateApi",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Ltr2/n;Lgt0/e;Lci2/b;Lbc3/c0;)V",
        "Ll83/a0;",
        "d",
        "()V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "e",
        "w",
        "Ltr2/n;",
        "x",
        "Lgt0/e;",
        "y",
        "Lci2/b;",
        "z",
        "Lbc3/c0;",
        "Lec3/p1;",
        "Lgt0/h;",
        "E",
        "Lec3/p1;",
        "otaFwUpdateStatusFlow",
        "Lec3/f2;",
        "F",
        "Lec3/f2;",
        "c",
        "()Lec3/f2;",
        "strapFwUpdateMonitorFlow",
        "connectivity-common-ui_release"
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
.field private final E:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final F:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final w:Ltr2/n;

.field private final x:Lgt0/e;

.field private final y:Lci2/b;

.field private final z:Lbc3/c0;


# direct methods
.method public constructor <init>(Ltr2/n;Lgt0/e;Lci2/b;Lbc3/c0;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareUpdateApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnl1/a;->w:Ltr2/n;

    iput-object p2, p0, Lnl1/a;->x:Lgt0/e;

    iput-object p3, p0, Lnl1/a;->y:Lci2/b;

    iput-object p4, p0, Lnl1/a;->z:Lbc3/c0;

    sget-object p1, Lgt0/h$h;->b:Lgt0/h$h;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lnl1/a;->E:Lec3/p1;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lnl1/a;->F:Lec3/f2;

    return-void
.end method

.method public static final synthetic a(Lnl1/a;)Lgt0/e;
    .locals 0

    iget-object p0, p0, Lnl1/a;->x:Lgt0/e;

    return-object p0
.end method

.method public static final synthetic b(Lnl1/a;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lnl1/a;->E:Lec3/p1;

    return-object p0
.end method

.method private final d()V
    .locals 4

    iget-object v0, p0, Lnl1/a;->y:Lci2/b;

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v0, Lnl1/a$a;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0}, Lnl1/a$a;-><init>(Lq83/d;Lnl1/a;)V

    invoke-static {v1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lnl1/a$c;

    invoke-direct {v1, p0, v2}, Lnl1/a$c;-><init>(Lnl1/a;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object v0, p0, Lnl1/a;->z:Lbc3/c0;

    invoke-static {v2, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method


# virtual methods
.method public final c()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lnl1/a;->F:Lec3/f2;

    return-object v0
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lnl1/a;->E:Lec3/p1;

    sget-object v1, Lgt0/h$h;->b:Lgt0/h$h;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lnl1/a;->d()V

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
