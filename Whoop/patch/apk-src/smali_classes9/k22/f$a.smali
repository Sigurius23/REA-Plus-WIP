.class final Lk22/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk22/f;-><init>(Lbc3/c0;Ltr2/n;Ll22/a;Lk22/c;Lj22/g;Lqt0/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lk22/a;",
        "action",
        "",
        "Lqt0/b;",
        "devices",
        "Lk22/b;",
        "<anonymous>",
        "(Lk22/a;Ljava/util/List;)Lk22/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.pairing.ui.presentation.PairingViewModel$domainState$1"
    f = "PairingViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lk22/c;


# direct methods
.method public constructor <init>(Lk22/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk22/c;",
            "Lq83/d<",
            "-",
            "Lk22/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lk22/f$a;->z:Lk22/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lk22/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk22/a;",
            "Ljava/util/List<",
            "Lqt0/b;",
            ">;",
            "Lq83/d<",
            "-",
            "Lk22/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lk22/f$a;

    iget-object v1, p0, Lk22/f$a;->z:Lk22/c;

    invoke-direct {v0, v1, p3}, Lk22/f$a;-><init>(Lk22/c;Lq83/d;)V

    iput-object p1, v0, Lk22/f$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lk22/f$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lk22/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk22/a;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lk22/f$a;->f(Lk22/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lk22/f$a;->x:Ljava/lang/Object;

    check-cast v0, Lk22/a;

    iget-object v1, p0, Lk22/f$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lk22/f$a;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lk22/f$a;->z:Lk22/c;

    invoke-virtual {p1, v0, v1}, Lk22/c;->a(Lk22/a;Ljava/util/List;)Lk22/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
