.class final Lol1/b$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lol1/b;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lol1/c;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor$interact$1$3"
    f = "ProcessNowInteractor.kt"
    l = {
        0x4f,
        0x50,
        0x51,
        0x57,
        0x58,
        0x59,
        0x5b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lol1/b;

.field final synthetic z:Lil1/z;


# direct methods
.method public constructor <init>(Lol1/b;Lil1/z;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lol1/b;",
            "Lil1/z;",
            "Lq83/d<",
            "-",
            "Lol1/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lol1/b$e;->y:Lol1/b;

    iput-object p2, p0, Lol1/b$e;->z:Lil1/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lol1/b$e;

    iget-object v1, p0, Lol1/b$e;->y:Lol1/b;

    iget-object v2, p0, Lol1/b$e;->z:Lil1/z;

    invoke-direct {v0, v1, v2, p2}, Lol1/b$e;-><init>(Lol1/b;Lil1/z;Lq83/d;)V

    iput-object p1, v0, Lol1/b$e;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lol1/b$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lol1/b$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lol1/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lol1/b$e;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lol1/b$e;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lol1/b$e;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lol1/c$c;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lfl1/b;->B:I

    invoke-direct {v2, v5, v4, v3, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v2}, Lol1/c$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    iput-object v0, p0, Lol1/b$e;->x:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lol1/b$e;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_0
    iget-object p1, p0, Lol1/b$e;->y:Lol1/b;

    iget-object v2, p0, Lol1/b$e;->z:Lil1/z;

    check-cast v2, Lil1/z$a;

    iput-object v0, p0, Lol1/b$e;->x:Ljava/lang/Object;

    iput v3, p0, Lol1/b$e;->w:I

    invoke-static {p1, v2, p0}, Lol1/b;->h(Lol1/b;Lil1/z$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_5

    :cond_1
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Lol1/c$e;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lfl1/b;->D:I

    invoke-direct {v2, v5, v4, v3, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lfl1/b;->x:I

    invoke-direct {v5, v6, v4, v3, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v2, v5}, Lol1/c$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    iput-object v0, p0, Lol1/b$e;->x:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Lol1/b$e;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_5

    :cond_2
    :goto_2
    iput-object v0, p0, Lol1/b$e;->x:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lol1/b$e;->w:I

    const-wide/16 v2, 0x9c4

    invoke-static {v2, v3, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_5

    :cond_3
    :goto_3
    sget-object p1, Lol1/c$b;->a:Lol1/c$b;

    iput-object v0, p0, Lol1/b$e;->x:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, p0, Lol1/b$e;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    new-instance p1, Lol1/c$a;

    sget-object v2, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->WAD:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-direct {p1, v2}, Lol1/c$a;-><init>(Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;)V

    iput-object v4, p0, Lol1/b$e;->x:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, p0, Lol1/b$e;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_5

    :cond_5
    new-instance p1, Lol1/c$d;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lfl1/b;->A:I

    invoke-direct {v2, v5, v4, v3, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lfl1/b;->z:I

    invoke-direct {v5, v6, v4, v3, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lfl1/b;->y:I

    invoke-direct {v6, v7, v4, v3, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v2, v5, v6}, Lol1/c$d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    iput-object v4, p0, Lol1/b$e;->x:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, p0, Lol1/b$e;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_5
    return-object v1

    :cond_6
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
