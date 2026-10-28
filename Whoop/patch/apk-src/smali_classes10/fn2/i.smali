.class public final Lfn2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfn2/l;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lfn2/i;",
        "Lfn2/l;",
        "Landroid/content/Context;",
        "context",
        "Lfn2/g;",
        "orientationHelper",
        "Lfn2/c;",
        "orientationLockChecker",
        "<init>",
        "(Landroid/content/Context;Lfn2/g;Lfn2/c;)V",
        "Lec3/l;",
        "Lfn2/j;",
        "a",
        "()Lec3/l;",
        "Ll83/a0;",
        "b",
        "()V",
        "Landroid/content/Context;",
        "Lfn2/g;",
        "c",
        "Lfn2/c;",
        "Lfn2/k;",
        "d",
        "Lfn2/k;",
        "tracker",
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

.field private volatile d:Lfn2/k;


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

    iput-object p1, p0, Lfn2/i;->a:Landroid/content/Context;

    iput-object p2, p0, Lfn2/i;->b:Lfn2/g;

    iput-object p3, p0, Lfn2/i;->c:Lfn2/c;

    new-instance p1, Lfn2/k;

    invoke-direct {p1, p2}, Lfn2/k;-><init>(Lfn2/g;)V

    iput-object p1, p0, Lfn2/i;->d:Lfn2/k;

    return-void
.end method

.method public static final synthetic c(Lfn2/i;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lfn2/i;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic d(Lfn2/i;)Lfn2/g;
    .locals 0

    iget-object p0, p0, Lfn2/i;->b:Lfn2/g;

    return-object p0
.end method

.method public static final synthetic e(Lfn2/i;)Lfn2/c;
    .locals 0

    iget-object p0, p0, Lfn2/i;->c:Lfn2/c;

    return-object p0
.end method

.method public static final synthetic f(Lfn2/i;)Lfn2/k;
    .locals 0

    iget-object p0, p0, Lfn2/i;->d:Lfn2/k;

    return-object p0
.end method

.method public static final synthetic g(Lfn2/i;Lfn2/k;)V
    .locals 0

    iput-object p1, p0, Lfn2/i;->d:Lfn2/k;

    return-void
.end method


# virtual methods
.method public a()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lfn2/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lfn2/i$a;-><init>(Lfn2/i;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 2

    new-instance v0, Lfn2/k;

    iget-object v1, p0, Lfn2/i;->b:Lfn2/g;

    invoke-direct {v0, v1}, Lfn2/k;-><init>(Lfn2/g;)V

    iput-object v0, p0, Lfn2/i;->d:Lfn2/k;

    return-void
.end method
