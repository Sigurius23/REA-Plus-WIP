.class final Lid2/t$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lid2/t;->e0(Lid2/d;Lid2/j;Lhd2/d$b;Lhd2/d$a;ZLandroid/content/Context;Lbd2/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.share.view.WhoopShareSheetKt$executeShareAction$loaded$1"
    f = "WhoopShareSheet.kt"
    l = {
        0x19e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lkd1/m;


# direct methods
.method public constructor <init>(Lkd1/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/m;",
            "Lq83/d<",
            "-",
            "Lid2/t$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lid2/t$j;->x:Lkd1/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lkd1/m;)Z
    .locals 0

    invoke-static {p0}, Lid2/t$j;->h(Lkd1/m;)Z

    move-result p0

    return p0
.end method

.method private static final h(Lkd1/m;)Z
    .locals 0

    invoke-virtual {p0}, Lkd1/m;->a()Z

    move-result p0

    return p0
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

    new-instance p1, Lid2/t$j;

    iget-object v0, p0, Lid2/t$j;->x:Lkd1/m;

    invoke-direct {p1, v0, p2}, Lid2/t$j;-><init>(Lkd1/m;Lq83/d;)V

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lid2/t$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lid2/t$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lid2/t$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lid2/t$j;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lid2/t$j;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lid2/t$j;->x:Lkd1/m;

    new-instance v1, Lid2/u;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lid2/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lid2/t$j$a;

    invoke-direct {v1, p1}, Lid2/t$j$a;-><init>(Lec3/l;)V

    iput v2, p0, Lid2/t$j;->w:I

    invoke-static {v1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
