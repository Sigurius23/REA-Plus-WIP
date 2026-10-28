.class public final Lsl0/p2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsl0/n2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/p2;->h(Lc93/m;Landroidx/compose/runtime/Composer;I)Lsl0/n2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "sl0/p2$a",
        "Lsl0/n2;",
        "Lsl0/q2;",
        "mode",
        "Ll83/a0;",
        "a",
        "(Lsl0/q2;)V",
        "bot_release"
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
.field final synthetic a:Lh/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/i;"
        }
    .end annotation
.end field

.field final synthetic b:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic c:Lh/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh/i;Lp1/c1;Lh/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/i;",
            "Lp1/c1;",
            "Lh/i;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/p2$a;->a:Lh/i;

    iput-object p2, p0, Lsl0/p2$a;->b:Lp1/c1;

    iput-object p3, p0, Lsl0/p2$a;->c:Lh/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsl0/q2;)V
    .locals 3

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsl0/q2$c;->a:Lsl0/q2$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lsl0/p2$a;->a:Lh/i;

    sget-object v0, Lk/d;->a:Lk/d;

    invoke-static {v0}, Lse/g;->f(Lk/f;)Lj/m;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_0
    sget-object v0, Lsl0/q2$a;->a:Lsl0/q2$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "android.permission.CAMERA"

    if-eqz v0, :cond_1

    iget-object p1, p0, Lsl0/p2$a;->b:Lp1/c1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/p2$a;->c:Lh/i;

    invoke-virtual {p1, v2, v1}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_1
    sget-object v0, Lsl0/q2$b;->a:Lsl0/q2$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lsl0/p2$a;->b:Lp1/c1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/p2$a;->c:Lh/i;

    invoke-virtual {p1, v2, v1}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
