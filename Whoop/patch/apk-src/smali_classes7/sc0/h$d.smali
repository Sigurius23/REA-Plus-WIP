.class final Lsc0/h$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsc0/h;->g(Ljava/lang/String;Lpc0/c;Lpc0/a;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsc0/h$d$a;
    }
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
    c = "com.whoop.advancedlabs.feature.marketingconsent.view.MarketingConsentScreenKt$MarketingConsentScreen$3$1"
    f = "MarketingConsentScreen.kt"
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

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lmc0/c;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lmc0/c;Ljava/lang/String;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lmc0/c;",
            "Ljava/lang/String;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lsc0/h$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsc0/h$d;->x:Ljava/lang/String;

    iput-object p2, p0, Lsc0/h$d;->y:Lmc0/c;

    iput-object p3, p0, Lsc0/h$d;->z:Ljava/lang/String;

    iput-object p4, p0, Lsc0/h$d;->E:Lp1/c1;

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

    new-instance v0, Lsc0/h$d;

    iget-object v1, p0, Lsc0/h$d;->x:Ljava/lang/String;

    iget-object v2, p0, Lsc0/h$d;->y:Lmc0/c;

    iget-object v3, p0, Lsc0/h$d;->z:Ljava/lang/String;

    iget-object v4, p0, Lsc0/h$d;->E:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lsc0/h$d;-><init>(Ljava/lang/String;Lmc0/c;Ljava/lang/String;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsc0/h$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsc0/h$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsc0/h$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsc0/h$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lsc0/h$d;->w:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsc0/h$d;->x:Ljava/lang/String;

    invoke-static {p1}, Lmc0/b;->a(Ljava/lang/String;)Lmc0/a;

    move-result-object p1

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lsc0/h$d$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    if-eq p1, v0, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lsc0/h$d;->y:Lmc0/c;

    iget-object v0, p0, Lsc0/h$d;->z:Ljava/lang/String;

    const-string v1, "restricted"

    invoke-virtual {p1, v0, v1}, Lmc0/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lsc0/h$d;->E:Lp1/c1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-object p1, p0, Lsc0/h$d;->y:Lmc0/c;

    iget-object v0, p0, Lsc0/h$d;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lmc0/c;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lsc0/h$d;->E:Lp1/c1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
