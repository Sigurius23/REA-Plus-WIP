.class public final Lfn2/f$b;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn2/f;->f(ILq83/d;)Ljava/lang/Object;
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
        "fn2/f$b",
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
.field final synthetic a:Lfn2/f;

.field final synthetic b:I

.field final synthetic c:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfn2/f;ILbc3/k;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn2/f;",
            "I",
            "Lbc3/k;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lfn2/f$b;->a:Lfn2/f;

    iput p2, p0, Lfn2/f$b;->b:I

    iput-object p3, p0, Lfn2/f$b;->c:Lbc3/k;

    invoke-direct {p0, p4}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 2

    iget-object v0, p0, Lfn2/f$b;->a:Lfn2/f;

    invoke-static {v0}, Lfn2/f;->e(Lfn2/f;)Lfn2/c;

    move-result-object v0

    invoke-interface {v0}, Lfn2/c;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Lfn2/f$b;->b:I

    iget-object v1, p0, Lfn2/f$b;->a:Lfn2/f;

    invoke-static {v1}, Lfn2/f;->d(Lfn2/f;)Lfn2/g;

    move-result-object v1

    invoke-virtual {v1, p1}, Lfn2/g;->a(I)I

    move-result p1

    if-ne v0, p1, :cond_2

    invoke-virtual {p0}, Landroid/view/OrientationEventListener;->disable()V

    iget-object p1, p0, Lfn2/f$b;->c:Lbc3/k;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, v0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method
