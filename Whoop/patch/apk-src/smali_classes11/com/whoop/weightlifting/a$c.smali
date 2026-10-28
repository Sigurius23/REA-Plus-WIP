.class final Lcom/whoop/weightlifting/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/a;->s(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;III)V
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
    c = "com.whoop.weightlifting.StrengthTrainerNavGraphKt$StrengthTrainerNavGraph$4$1$1$1$1"
    f = "StrengthTrainerNavGraph.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Leb/u0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Leb/u0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Leb/u0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/a$c;->x:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/weightlifting/a$c;->y:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weightlifting/a$c;->z:Leb/u0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Leb/k1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/a$c;->k(Leb/k1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/a$c;->l(Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Leb/y0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/a$c;->j(Leb/y0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Leb/y0;)Ll83/a0;
    .locals 2

    new-instance v0, Lcom/whoop/weightlifting/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/b;-><init>(I)V

    const-string v1, "deepLinkEntry"

    invoke-virtual {p0, v1, v0}, Leb/y0;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/y0;->b:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Leb/k1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/k1;->a:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Leb/y0;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/y0;->b:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcom/whoop/weightlifting/a$c;

    iget-object v0, p0, Lcom/whoop/weightlifting/a$c;->x:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weightlifting/a$c;->y:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weightlifting/a$c;->z:Leb/u0;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/weightlifting/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Leb/u0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/a$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/weightlifting/a$c;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/weightlifting/a$c;->x:Ljava/lang/String;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/a$c;->y:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/whoop/weightlifting/a$c;->z:Leb/u0;

    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/weightlifting/b;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/whoop/weightlifting/b;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/a$c;->z:Leb/u0;

    new-instance v1, Lcom/whoop/weightlifting/b;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/whoop/weightlifting/b;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
