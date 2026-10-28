.class public final Lx41/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx41/g;->e(Lw41/f;Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
        "x41/g$b",
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
.field final synthetic a:Lw41/f;


# direct methods
.method public constructor <init>(Lw41/f;)V
    .locals 0

    iput-object p1, p0, Lx41/g$b;->a:Lw41/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lx41/g$b;->a:Lw41/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lw41/f;->g(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    iget-object v0, p0, Lx41/g$b;->a:Lw41/f;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lw41/f;->i(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    iget-object v0, p0, Lx41/g$b;->a:Lw41/f;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lw41/f;->j(Lkotlin/jvm/functions/Function1;)V

    :cond_2
    iget-object v0, p0, Lx41/g$b;->a:Lw41/f;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lw41/f;->h(Z)V

    :cond_3
    return-void
.end method
