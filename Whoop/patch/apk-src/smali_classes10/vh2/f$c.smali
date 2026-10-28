.class final Lvh2/f$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh2/f;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lf6/a;",
        "prefs",
        "Ll83/a0;",
        "<anonymous>",
        "(Lf6/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.strapauth.unlock.StuckLockedCountStore$increment$2"
    f = "StuckLockedCountStore.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lkotlin/jvm/internal/e0;

.field final synthetic z:Lvh2/f;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/e0;Lvh2/f;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/e0;",
            "Lvh2/f;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvh2/f$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvh2/f$c;->y:Lkotlin/jvm/internal/e0;

    iput-object p2, p0, Lvh2/f$c;->z:Lvh2/f;

    iput-object p3, p0, Lvh2/f$c;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lvh2/f$c;

    iget-object v1, p0, Lvh2/f$c;->y:Lkotlin/jvm/internal/e0;

    iget-object v2, p0, Lvh2/f$c;->z:Lvh2/f;

    iget-object v3, p0, Lvh2/f$c;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lvh2/f$c;-><init>(Lkotlin/jvm/internal/e0;Lvh2/f;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lvh2/f$c;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvh2/f$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvh2/f$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvh2/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lf6/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvh2/f$c;->invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvh2/f$c;->x:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvh2/f$c;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvh2/f$c;->y:Lkotlin/jvm/internal/e0;

    iget-object v1, p0, Lvh2/f$c;->z:Lvh2/f;

    iget-object v2, p0, Lvh2/f$c;->E:Ljava/lang/String;

    invoke-static {v1, v2}, Lvh2/f;->a(Lvh2/f;Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf6/a;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Lkotlin/jvm/internal/e0;->w:I

    iget-object p1, p0, Lvh2/f$c;->z:Lvh2/f;

    iget-object v1, p0, Lvh2/f$c;->E:Ljava/lang/String;

    invoke-static {p1, v1}, Lvh2/f;->a(Lvh2/f;Ljava/lang/String;)Lf6/d;

    move-result-object p1

    iget-object v1, p0, Lvh2/f$c;->y:Lkotlin/jvm/internal/e0;

    iget v1, v1, Lkotlin/jvm/internal/e0;->w:I

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, p1, v2}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
