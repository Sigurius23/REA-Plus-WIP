.class public final Lry2/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry2/f;->g(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "ry2/f$a",
        "Lp1/h0;",
        "Ll83/a0;",
        "dispose",
        "()V",
        "runtime"
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
.field final synthetic a:Landroidx/lifecycle/g0;

.field final synthetic b:Landroidx/lifecycle/e0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/g0;Landroidx/lifecycle/e0;)V
    .locals 0

    iput-object p1, p0, Lry2/f$a;->a:Landroidx/lifecycle/g0;

    iput-object p2, p0, Lry2/f$a;->b:Landroidx/lifecycle/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lry2/f$a;->a:Landroidx/lifecycle/g0;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    iget-object v1, p0, Lry2/f$a;->b:Landroidx/lifecycle/e0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    return-void
.end method
