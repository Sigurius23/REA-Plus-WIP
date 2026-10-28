.class final Lm90/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm90/b;->l(Lm90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.activation.view.screens.nameinformation.NameInformationScreenKt$NameInformationScreenView$2$1"
    f = "NameInformationScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lm90/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm90/b$a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lm90/b$a;->y:Lp1/c1;

    iput-object p3, p0, Lm90/b$a;->z:Lp1/c1;

    iput-object p4, p0, Lm90/b$a;->E:Lp1/c1;

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

    new-instance v0, Lm90/b$a;

    iget-object v1, p0, Lm90/b$a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lm90/b$a;->y:Lp1/c1;

    iget-object v3, p0, Lm90/b$a;->z:Lp1/c1;

    iget-object v4, p0, Lm90/b$a;->E:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lm90/b$a;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lm90/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm90/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm90/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm90/b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lm90/b$a;->w:I

    if-nez v0, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lm90/b$a;->y:Lp1/c1;

    invoke-static {p1}, Lm90/b;->E(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lm90/b$a;->z:Lp1/c1;

    invoke-static {p1}, Lm90/b;->F(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lm90/b$a;->E:Lp1/c1;

    invoke-static {p1}, Lm90/b;->G(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    :cond_0
    iget-object p1, p0, Lm90/b$a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lm90/b$a;->y:Lp1/c1;

    invoke-static {v0}, Lm90/b;->E(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    new-instance v1, Ld70/d;

    invoke-direct {v1, v0}, Ld70/d;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    iget-object v0, p0, Lm90/b$a;->z:Lp1/c1;

    invoke-static {v0}, Lm90/b;->F(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_4

    new-instance v3, Ld70/d;

    invoke-direct {v3, v0}, Ld70/d;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    move-object v3, v2

    :goto_3
    iget-object v0, p0, Lm90/b$a;->E:Lp1/c1;

    invoke-static {v0}, Lm90/b;->G(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    move-object v2, v0

    :cond_5
    new-instance v0, Lj80/a$t0;

    invoke-direct {v0, v1, v3, v2}, Lj80/a$t0;-><init>(Ld70/d;Ld70/d;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
