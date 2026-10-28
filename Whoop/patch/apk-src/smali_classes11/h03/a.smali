.class public abstract Lh03/a;
.super Lp6/s0;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\n\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lh03/a;",
        "Lp6/s0;",
        "Lof3/a;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "onEnabled",
        "(Landroid/content/Context;)V",
        "onDisabled",
        "Le03/a;",
        "y",
        "Ll83/h;",
        "h",
        "()Le03/a;",
        "analyticsManager",
        "Lh03/b;",
        "z",
        "i",
        "()Lh03/b;",
        "widgetRefreshScheduler",
        "Lj03/a;",
        "j",
        "()Lj03/a;",
        "widgetType",
        "widget_release"
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
.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lp6/s0;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lh03/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lh03/a$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lh03/a;->y:Ll83/h;

    new-instance v1, Lh03/a$b;

    invoke-direct {v1, p0, v2, v2}, Lh03/a$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lh03/a;->z:Ll83/h;

    return-void
.end method

.method private final h()Le03/a;
    .locals 1

    iget-object v0, p0, Lh03/a;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le03/a;

    return-object v0
.end method

.method private final i()Lh03/b;
    .locals 1

    iget-object v0, p0, Lh03/a;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh03/b;

    return-object v0
.end method


# virtual methods
.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public abstract j()Lj03/a;
.end method

.method public onDisabled(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/appwidget/AppWidgetProvider;->onDisabled(Landroid/content/Context;)V

    invoke-direct {p0}, Lh03/a;->h()Le03/a;

    move-result-object p1

    invoke-virtual {p0}, Lh03/a;->j()Lj03/a;

    move-result-object v0

    invoke-virtual {v0}, Lj03/a;->getSegmentName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le03/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onEnabled(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/appwidget/AppWidgetProvider;->onEnabled(Landroid/content/Context;)V

    invoke-direct {p0}, Lh03/a;->h()Le03/a;

    move-result-object p1

    invoke-virtual {p0}, Lh03/a;->j()Lj03/a;

    move-result-object v0

    invoke-virtual {v0}, Lj03/a;->getSegmentName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le03/a;->b(Ljava/lang/String;)V

    invoke-direct {p0}, Lh03/a;->i()Lh03/b;

    move-result-object p1

    invoke-virtual {p1}, Lh03/b;->c()V

    return-void
.end method
