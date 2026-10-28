.class public final Lfn2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfn2/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lfn2/f;",
        "Lfn2/d;",
        "Landroid/content/Context;",
        "context",
        "Lfn2/g;",
        "orientationHelper",
        "Lfn2/c;",
        "orientationLockChecker",
        "<init>",
        "(Landroid/content/Context;Lfn2/g;Lfn2/c;)V",
        "",
        "expectedOrientation",
        "Ll83/a0;",
        "f",
        "(ILq83/d;)Ljava/lang/Object;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "Lfn2/g;",
        "c",
        "Lfn2/c;",
        "core_release"
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
.field private final a:Landroid/content/Context;

.field private final b:Lfn2/g;

.field private final c:Lfn2/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lfn2/g;Lfn2/c;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientationHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientationLockChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn2/f;->a:Landroid/content/Context;

    iput-object p2, p0, Lfn2/f;->b:Lfn2/g;

    iput-object p3, p0, Lfn2/f;->c:Lfn2/c;

    return-void
.end method

.method public static final synthetic c(Lfn2/f;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lfn2/f;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic d(Lfn2/f;)Lfn2/g;
    .locals 0

    iget-object p0, p0, Lfn2/f;->b:Lfn2/g;

    return-object p0
.end method

.method public static final synthetic e(Lfn2/f;)Lfn2/c;
    .locals 0

    iget-object p0, p0, Lfn2/f;->c:Lfn2/c;

    return-object p0
.end method

.method private final f(ILq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    invoke-static {p0}, Lfn2/f;->c(Lfn2/f;)Landroid/content/Context;

    move-result-object p2

    new-instance v1, Lfn2/f$b;

    invoke-direct {v1, p0, p1, v0, p2}, Lfn2/f$b;-><init>(Lfn2/f;ILbc3/k;Landroid/content/Context;)V

    invoke-virtual {v1}, Landroid/view/OrientationEventListener;->enable()V

    new-instance p1, Lfn2/f$a;

    invoke-direct {p1, v1}, Lfn2/f$a;-><init>(Lfn2/f$b;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lfn2/f;->f(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lfn2/f;->f(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
