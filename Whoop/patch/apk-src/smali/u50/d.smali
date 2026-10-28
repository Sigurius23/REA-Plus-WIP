.class public final Lu50/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J1\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010!\u00a8\u0006$"
    }
    d2 = {
        "Lu50/d;",
        "",
        "Lg12/d;",
        "flowPerformer",
        "Lec3/l;",
        "Lg12/c;",
        "performerEvents",
        "Lg50/c;",
        "analyticsHelper",
        "<init>",
        "(Lg12/d;Lec3/l;Lg50/c;)V",
        "Ll83/a0;",
        "g",
        "(Lg12/c;)V",
        "Lx50/a$j;",
        "f",
        "(Lg12/c;)Lx50/a$j;",
        "",
        "omronUrl",
        "Lbc3/c0;",
        "scope",
        "Lkotlin/Function1;",
        "onViewEvent",
        "e",
        "(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;)V",
        "a",
        "Lg12/d;",
        "b",
        "Lec3/l;",
        "c",
        "Lg50/c;",
        "Lbc3/k1;",
        "d",
        "Lbc3/k1;",
        "eventsJob",
        "flowJob",
        "access_release"
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
.field private final a:Lg12/d;

.field private final b:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final c:Lg50/c;

.field private d:Lbc3/k1;

.field private e:Lbc3/k1;


# direct methods
.method public constructor <init>(Lg12/d;Lec3/l;Lg50/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg12/d;",
            "Lec3/l;",
            "Lg50/c;",
            ")V"
        }
    .end annotation

    const-string v0, "flowPerformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "performerEvents"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu50/d;->a:Lg12/d;

    iput-object p2, p0, Lu50/d;->b:Lec3/l;

    iput-object p3, p0, Lu50/d;->c:Lg50/c;

    return-void
.end method

.method public static final synthetic a(Lu50/d;)Lg12/d;
    .locals 0

    iget-object p0, p0, Lu50/d;->a:Lg12/d;

    return-object p0
.end method

.method public static final synthetic b(Lu50/d;)Lec3/l;
    .locals 0

    iget-object p0, p0, Lu50/d;->b:Lec3/l;

    return-object p0
.end method

.method public static final synthetic c(Lu50/d;Lg12/c;)Lx50/a$j;
    .locals 0

    invoke-direct {p0, p1}, Lu50/d;->f(Lg12/c;)Lx50/a$j;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lu50/d;Lg12/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lu50/d;->g(Lg12/c;)V

    return-void
.end method

.method private final f(Lg12/c;)Lx50/a$j;
    .locals 1

    sget-object v0, Lg12/c$d;->a:Lg12/c$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lx50/a$e;->a:Lx50/a$e;

    return-object p1

    :cond_0
    sget-object v0, Lg12/c$a;->a:Lg12/c$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lx50/a$h;->a:Lx50/a$h;

    return-object p1

    :cond_1
    sget-object v0, Lg12/c$c;->a:Lg12/c$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Lx50/a$c;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lx50/a$c;-><init>(Z)V

    return-object p1

    :cond_2
    sget-object v0, Lg12/c$b;->a:Lg12/c$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lx50/a$c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lx50/a$c;-><init>(Z)V

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lg12/c;)V
    .locals 1

    sget-object v0, Lg12/c$d;->a:Lg12/c$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lu50/d;->c:Lg50/c;

    sget-object v0, Lg50/b;->OmronConnectStart:Lg50/b;

    invoke-virtual {p1, v0}, Lg50/c;->b(Lg50/b;)V

    return-void

    :cond_0
    sget-object v0, Lg12/c$c;->a:Lg12/c$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lu50/d;->c:Lg50/c;

    sget-object v0, Lg50/b;->OmronConnectSuccess:Lg50/b;

    invoke-virtual {p1, v0}, Lg50/c;->b(Lg50/b;)V

    return-void

    :cond_1
    sget-object v0, Lg12/c$b;->a:Lg12/c$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lu50/d;->c:Lg50/c;

    sget-object v0, Lg50/b;->OmronConnectFailure:Lg50/b;

    invoke-virtual {p1, v0}, Lg50/c;->b(Lg50/b;)V

    return-void

    :cond_2
    sget-object v0, Lg12/c$a;->a:Lg12/c$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final e(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lbc3/c0;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "omronUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu50/d;->d:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lu50/d;->e:Lbc3/k1;

    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    sget-object v0, Lx50/a$e;->a:Lx50/a$e;

    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lu50/d$a;

    invoke-direct {v0, p0, p3, v1}, Lu50/d$a;-><init>(Lu50/d;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 p3, 0x3

    invoke-static {p2, v1, v1, v0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lu50/d;->d:Lbc3/k1;

    new-instance v0, Lu50/d$b;

    invoke-direct {v0, p0, p1, v1}, Lu50/d$b;-><init>(Lu50/d;Ljava/lang/String;Lq83/d;)V

    invoke-static {p2, v1, v1, v0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lu50/d;->e:Lbc3/k1;

    return-void
.end method
