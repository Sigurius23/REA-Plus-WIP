.class public abstract Lw41/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a3\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\u000c\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000b\"\u0014\u0010\r\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000b\u00a8\u0006\u0010"
    }
    d2 = {
        "Lw41/z;",
        "mapState",
        "",
        "a",
        "(Lw41/z;)Z",
        "interactive",
        "isStartActivityRevampEnabled",
        "hasExternalControls",
        "Leu/d0;",
        "b",
        "(ZLw41/z;ZZ)Leu/d0;",
        "Leu/d0;",
        "InteractiveMapUiSettings",
        "LiveInteractiveMapUiSettings",
        "c",
        "StaticMapUiSettings",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Leu/d0;

.field private static final b:Leu/d0;

.field private static final c:Leu/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Leu/d0;

    const/4 v4, 0x0

    const/16 v5, 0x3ff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Leu/d0;-><init>(ZZZZI)V

    sput-object v0, Lw41/q;->a:Leu/d0;

    new-instance v1, Leu/d0;

    const/4 v5, 0x1

    const/16 v6, 0x43

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-direct/range {v1 .. v6}, Leu/d0;-><init>(ZZZZI)V

    sput-object v1, Lw41/q;->b:Leu/d0;

    new-instance v2, Leu/d0;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Leu/d0;-><init>(ZZZZZZZZZZ)V

    sput-object v2, Lw41/q;->c:Leu/d0;

    return-void
.end method

.method public static final a(Lw41/z;)Z
    .locals 1
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const-string v0, "mapState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lw41/z$b;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lw41/z$a;

    if-eqz v0, :cond_1

    check-cast p0, Lw41/z$a;

    invoke-virtual {p0}, Lw41/z$a;->f()Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(ZLw41/z;ZZ)Leu/d0;
    .locals 11
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const-string v0, "mapState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    sget-object p0, Lw41/q;->c:Leu/d0;

    return-object p0

    :cond_0
    instance-of p0, p1, Lw41/z$a;

    if-eqz p0, :cond_2

    if-eqz p2, :cond_2

    if-eqz p3, :cond_1

    sget-object p0, Lw41/q;->b:Leu/d0;

    iget-boolean v1, p0, Leu/d0;->a:Z

    iget-boolean v2, p0, Leu/d0;->b:Z

    iget-boolean v3, p0, Leu/d0;->c:Z

    iget-boolean v5, p0, Leu/d0;->e:Z

    iget-boolean v6, p0, Leu/d0;->f:Z

    iget-boolean v7, p0, Leu/d0;->g:Z

    iget-boolean v8, p0, Leu/d0;->h:Z

    iget-boolean v10, p0, Leu/d0;->j:Z

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Leu/d0;

    const/4 v4, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v10}, Leu/d0;-><init>(ZZZZZZZZZZ)V

    return-object v0

    :cond_1
    sget-object p0, Lw41/q;->b:Leu/d0;

    return-object p0

    :cond_2
    sget-object p0, Lw41/q;->a:Leu/d0;

    return-object p0
.end method
