.class final Lhc2/j$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhc2/j;->Q()Lbc3/k1;
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
    c = "com.whoop.settings.myaccount.MyAccountViewModel$collectMyAccountHeaderViewState$1"
    f = "MyAccountViewModel.kt"
    l = {
        0x9a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lhc2/j;


# direct methods
.method public constructor <init>(Lhc2/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhc2/j;",
            "Lq83/d<",
            "-",
            "Lhc2/j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhc2/j$a;->x:Lhc2/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lhc2/j$a;

    iget-object v0, p0, Lhc2/j$a;->x:Lhc2/j;

    invoke-direct {p1, v0, p2}, Lhc2/j$a;-><init>(Lhc2/j;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lhc2/j$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lhc2/j$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lhc2/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lhc2/j$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lhc2/j$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lhc2/j$a;->x:Lhc2/j;

    invoke-static {p1}, Lhc2/j;->F(Lhc2/j;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lhc2/j$a$a;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lhc2/j$a$a;-><init>(Lq83/d;)V

    new-instance v3, Lec3/a0;

    invoke-direct {v3, v1, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    iget-object p1, p0, Lhc2/j$a;->x:Lhc2/j;

    invoke-static {p1}, Lhc2/j;->C(Lhc2/j;)Lka2/a;

    move-result-object p1

    invoke-static {v3, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    iget-object v1, p0, Lhc2/j$a;->x:Lhc2/j;

    new-instance v3, Lhc2/j$a$c;

    invoke-direct {v3, p1, v1}, Lhc2/j$a$c;-><init>(Lec3/l;Lhc2/j;)V

    new-instance p1, Lhc2/j$a$b;

    iget-object v1, p0, Lhc2/j$a;->x:Lhc2/j;

    invoke-direct {p1, v1}, Lhc2/j$a$b;-><init>(Lhc2/j;)V

    iput v2, p0, Lhc2/j$a;->w:I

    invoke-interface {v3, p1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
