.class final Lgt1/n$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgt1/n;->r(Lft1/c$g;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.details.view.LabradorDetailsSuccessScreenKt$LabradorDetailsSuccessScreen$10$1$2$1$1"
    f = "LabradorDetailsSuccessScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic F:Lft1/c$g;

.field final synthetic G:Ljava/lang/String;

.field w:I

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic z:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lkotlin/jvm/functions/Function1;Lft1/c$g;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lft1/c$g;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lgt1/n$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgt1/n$b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lgt1/n$b;->y:Ljava/util/List;

    iput-object p3, p0, Lgt1/n$b;->z:Lc93/a;

    iput-object p4, p0, Lgt1/n$b;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lgt1/n$b;->F:Lft1/c$g;

    iput-object p6, p0, Lgt1/n$b;->G:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lgt1/n$b;

    iget-object v1, p0, Lgt1/n$b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lgt1/n$b;->y:Ljava/util/List;

    iget-object v3, p0, Lgt1/n$b;->z:Lc93/a;

    iget-object v4, p0, Lgt1/n$b;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lgt1/n$b;->F:Lft1/c$g;

    iget-object v6, p0, Lgt1/n$b;->G:Ljava/lang/String;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lgt1/n$b;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lkotlin/jvm/functions/Function1;Lft1/c$g;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lgt1/n$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgt1/n$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgt1/n$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgt1/n$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lgt1/n$b;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgt1/n$b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lgt1/n$b;->y:Ljava/util/List;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lgt1/n$b;->z:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Lgt1/n$b;->E:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lft1/a$h;

    iget-object v1, p0, Lgt1/n$b;->F:Lft1/c$g;

    invoke-virtual {v1}, Lft1/c$g;->f()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lgt1/n$b;->F:Lft1/c$g;

    invoke-virtual {v2}, Lft1/c$g;->u()Ljava/time/Instant;

    move-result-object v2

    iget-object v3, p0, Lgt1/n$b;->y:Ljava/util/List;

    iget-object v4, p0, Lgt1/n$b;->G:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lft1/a$h;-><init>(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
