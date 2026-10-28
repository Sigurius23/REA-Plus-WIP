.class final Lzd1/c$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd1/c;-><init>(Lxd1/c;Lod1/n;Lzd1/a;Lbc3/c0;Lzr2/a;)V
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lxd1/b;",
        "screenState",
        "Lod1/m;",
        "searchState",
        "Lzd1/d;",
        "<anonymous>",
        "(Lxd1/b;Lod1/m;)Lzd1/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.edit.presentation.EditActivityViewModel$viewState$1"
    f = "EditActivityViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lzd1/c;


# direct methods
.method public constructor <init>(Lzd1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzd1/c;",
            "Lq83/d<",
            "-",
            "Lzd1/c$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzd1/c$i;->z:Lzd1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lxd1/b;Lod1/m;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd1/b;",
            "Lod1/m;",
            "Lq83/d<",
            "-",
            "Lzd1/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lzd1/c$i;

    iget-object v1, p0, Lzd1/c$i;->z:Lzd1/c;

    invoke-direct {v0, v1, p3}, Lzd1/c$i;-><init>(Lzd1/c;Lq83/d;)V

    iput-object p1, v0, Lzd1/c$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lzd1/c$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lzd1/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxd1/b;

    check-cast p2, Lod1/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lzd1/c$i;->f(Lxd1/b;Lod1/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lzd1/c$i;->x:Ljava/lang/Object;

    check-cast v0, Lxd1/b;

    iget-object v1, p0, Lzd1/c$i;->y:Ljava/lang/Object;

    check-cast v1, Lod1/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lzd1/c$i;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzd1/c$i;->z:Lzd1/c;

    invoke-static {p1}, Lzd1/c;->j(Lzd1/c;)Lzd1/a;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Lzd1/a;->n(Lxd1/b;Lod1/m;)Lzd1/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
