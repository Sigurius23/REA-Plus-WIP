.class public final Lfn2/i$a$a;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn2/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "fn2/i$a$a",
        "Landroid/view/OrientationEventListener;",
        "",
        "orientation",
        "Ll83/a0;",
        "onOrientationChanged",
        "(I)V",
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
.field final synthetic a:Lfn2/i;

.field final synthetic b:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfn2/i;Ldc3/u;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn2/i;",
            "Ldc3/u;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lfn2/i$a$a;->a:Lfn2/i;

    iput-object p2, p0, Lfn2/i$a$a;->b:Ldc3/u;

    const/4 p1, 0x2

    invoke-direct {p0, p3, p1}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 1

    iget-object v0, p0, Lfn2/i$a$a;->a:Lfn2/i;

    invoke-static {v0}, Lfn2/i;->e(Lfn2/i;)Lfn2/c;

    move-result-object v0

    invoke-interface {v0}, Lfn2/c;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfn2/i$a$a;->a:Lfn2/i;

    invoke-static {v0}, Lfn2/i;->f(Lfn2/i;)Lfn2/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lfn2/k;->a(I)Lfn2/j;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lfn2/i$a$a;->b:Ldc3/u;

    check-cast v0, Ldc3/t;

    iget-object v0, v0, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v0, p1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method
