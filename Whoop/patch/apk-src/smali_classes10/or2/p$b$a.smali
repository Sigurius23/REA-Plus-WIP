.class final Lor2/p$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lor2/p$b;->onDeviceFound(Landroid/content/IntentSender;)V
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
    c = "com.whoop.util.CompanionDeviceInteractorKt$associateCompanionDevice$internalCallback$1$onDeviceFound$1"
    f = "CompanionDeviceInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lm/m;

.field final synthetic y:Landroid/companion/CompanionDeviceManager$Callback;

.field final synthetic z:Landroid/content/IntentSender;


# direct methods
.method public constructor <init>(Lm/m;Landroid/companion/CompanionDeviceManager$Callback;Landroid/content/IntentSender;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/m;",
            "Landroid/companion/CompanionDeviceManager$Callback;",
            "Landroid/content/IntentSender;",
            "Lq83/d<",
            "-",
            "Lor2/p$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lor2/p$b$a;->x:Lm/m;

    iput-object p2, p0, Lor2/p$b$a;->y:Landroid/companion/CompanionDeviceManager$Callback;

    iput-object p3, p0, Lor2/p$b$a;->z:Landroid/content/IntentSender;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Landroid/companion/CompanionDeviceManager$Callback;Landroid/content/IntentSender;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lor2/p$b$a;->h(Landroid/companion/CompanionDeviceManager$Callback;Landroid/content/IntentSender;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Landroid/companion/CompanionDeviceManager$Callback;Landroid/content/IntentSender;Z)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/companion/CompanionDeviceManager$Callback;->onDeviceFound(Landroid/content/IntentSender;)V

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

    new-instance p1, Lor2/p$b$a;

    iget-object v0, p0, Lor2/p$b$a;->x:Lm/m;

    iget-object v1, p0, Lor2/p$b$a;->y:Landroid/companion/CompanionDeviceManager$Callback;

    iget-object v2, p0, Lor2/p$b$a;->z:Landroid/content/IntentSender;

    invoke-direct {p1, v0, v1, v2, p2}, Lor2/p$b$a;-><init>(Lm/m;Landroid/companion/CompanionDeviceManager$Callback;Landroid/content/IntentSender;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lor2/p$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lor2/p$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lor2/p$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lor2/p$b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lor2/p$b$a;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lkn2/g;

    iget-object v2, p0, Lor2/p$b$a;->x:Lm/m;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lkn2/g;-><init>(Landroid/content/Context;ZLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lor2/p$b$a;->x:Lm/m;

    sget v0, Lhi0/j;->K:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string p1, "getString(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lor2/p$b$a;->x:Lm/m;

    sget v3, Lhi0/j;->J:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lor2/p$b$a;->x:Lm/m;

    sget v0, Lhi0/j;->A:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lor2/p$b$a;->y:Landroid/companion/CompanionDeviceManager$Callback;

    iget-object v0, p0, Lor2/p$b$a;->z:Landroid/content/IntentSender;

    new-instance v7, Lor2/q;

    const/4 v5, 0x0

    invoke-direct {v7, v5, p1, v0}, Lor2/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Lkn2/g;->j(Lkn2/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
