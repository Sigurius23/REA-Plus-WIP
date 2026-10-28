.class public final Ls90/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls90/g;->q(Ls90/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
        "s90/g$a",
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
.field final synthetic a:Lkotlin/jvm/functions/Function1;

.field final synthetic b:Ls90/h;

.field final synthetic c:Lp1/a1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;)V
    .locals 0

    iput-object p1, p0, Ls90/g$a;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ls90/g$a;->b:Ls90/h;

    iput-object p3, p0, Ls90/g$a;->c:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 6

    iget-object v0, p0, Ls90/g$a;->a:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lh80/b$h;

    iget-object v2, p0, Ls90/g$a;->b:Ls90/h;

    invoke-virtual {v2}, Ls90/h;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ls90/g$a;->c:Lp1/a1;

    invoke-static {v3}, Ls90/g;->G(Lp1/a1;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "refer_a_friend"

    const-string v5, "codes"

    invoke-direct {v1, v2, v5, v3, v4}, Lh80/b$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
