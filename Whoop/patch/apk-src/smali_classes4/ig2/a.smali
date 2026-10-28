.class final Lig2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/s;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lig2/a;",
        "Lm91/s;",
        "<init>",
        "()V",
        "Lm91/q;",
        "builder",
        "Ll83/a0;",
        "a",
        "(Lm91/q;)V",
        "start-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm91/q;)V
    .locals 3

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkg2/c;->j()Lm91/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm91/q;->b(Lm91/p;)V

    invoke-static {}, Lrg2/b;->b()Lm91/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm91/q;->b(Lm91/p;)V

    invoke-virtual {p1}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lng2/c;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lsg2/r;

    invoke-direct {v2}, Lsg2/r;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ltg2/f;->f()Lm91/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm91/q;->b(Lm91/p;)V

    invoke-static {}, Ljg2/d;->j()Lm91/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm91/q;->b(Lm91/p;)V

    invoke-static {}, Lug2/b;->b()Lm91/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm91/q;->b(Lm91/p;)V

    invoke-static {}, Lcom/whoop/startactivity/goals/targetcard/a;->g()Lm91/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm91/q;->b(Lm91/p;)V

    return-void
.end method
