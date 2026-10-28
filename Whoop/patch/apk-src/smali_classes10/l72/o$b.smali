.class final Ll72/o$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll72/o;->N(Lj72/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.sage.onboarding.view.SageOnboardingScreenKt$SageOnboardingScreen$5$1"
    f = "SageOnboardingScreen.kt"
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

.field final synthetic x:Z

.field final synthetic y:Lj72/j;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLj72/j;Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lj72/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Ll72/o$b;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Ll72/o$b;->x:Z

    iput-object p2, p0, Ll72/o$b;->y:Lj72/j;

    iput-object p3, p0, Ll72/o$b;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ll72/o$b;->E:Lp1/c1;

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

    new-instance v0, Ll72/o$b;

    iget-boolean v1, p0, Ll72/o$b;->x:Z

    iget-object v2, p0, Ll72/o$b;->y:Lj72/j;

    iget-object v3, p0, Ll72/o$b;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll72/o$b;->E:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ll72/o$b;-><init>(ZLj72/j;Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ll72/o$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll72/o$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll72/o$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll72/o$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Ll72/o$b;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Ll72/o$b;->x:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Ll72/o$b;->E:Lp1/c1;

    invoke-static {p1}, Ll72/o;->B0(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll72/o$b;->y:Lj72/j;

    invoke-static {p1}, Ll72/o;->D0(Lj72/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll72/o$b;->E:Lp1/c1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ll72/o;->C0(Lp1/c1;Z)V

    iget-object p1, p0, Ll72/o$b;->z:Lkotlin/jvm/functions/Function1;

    sget-object v0, La72/a$q;->a:La72/a$q;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
