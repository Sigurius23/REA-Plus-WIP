.class final Lz72/g$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz72/g;->k0(Lw72/g;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.sanguine.view.SanguineWaitlistScreenKt$SanguineWaitlistScreen$13$1"
    f = "SanguineWaitlistScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lw72/g;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lw72/g;Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw72/g;",
            "Lp1/c1;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lz72/g$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz72/g$d;->x:Lw72/g;

    iput-object p2, p0, Lz72/g$d;->y:Lp1/c1;

    iput-object p3, p0, Lz72/g$d;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lz72/g$d;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lz72/g$d;

    iget-object v1, p0, Lz72/g$d;->x:Lw72/g;

    iget-object v2, p0, Lz72/g$d;->y:Lp1/c1;

    iget-object v3, p0, Lz72/g$d;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lz72/g$d;->E:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lz72/g$d;-><init>(Lw72/g;Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lz72/g$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lz72/g$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lz72/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lz72/g$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lz72/g$d;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lz72/g$d;->y:Lp1/c1;

    invoke-static {p1}, Lz72/g;->y0(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lz72/g$d;->x:Lw72/g;

    check-cast p1, Lw72/g$c;

    invoke-virtual {p1}, Lw72/g$c;->d()Lw72/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz72/g$d;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lz72/g$d;->E:Ljava/lang/String;

    iget-object v2, p0, Lz72/g$d;->y:Lp1/c1;

    new-instance v3, Lr72/a$h;

    invoke-virtual {p1}, Lw72/a;->a()Z

    move-result v4

    invoke-virtual {p1}, Lw72/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v1, v4, p1}, Lr72/a$h;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-static {v2, p1}, Lz72/g;->z0(Lp1/c1;Z)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
