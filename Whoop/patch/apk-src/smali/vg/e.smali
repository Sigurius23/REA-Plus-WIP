.class public final synthetic Lvg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljc/b0;


# direct methods
.method public synthetic constructor <init>(Ljc/b0;I)V
    .locals 0

    iput p2, p0, Lvg/e;->w:I

    iput-object p1, p0, Lvg/e;->x:Ljc/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lvg/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvg/e;->x:Ljc/b0;

    iget-object v1, v0, Ljc/b0;->c:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, v0, Ljc/b0;->e:Ljava/lang/Object;

    check-cast v0, Lvg/g;

    new-instance v2, Lvb1/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lvb1/a;-><init>(I)V

    invoke-interface {v0, v2}, Lvg/g;->g(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvg/e;->x:Ljc/b0;

    iget-object v1, v0, Ljc/b0;->c:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, v0, Ljc/b0;->d:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v2, Leg/o;

    new-instance v3, Lae3/k;

    new-instance v4, Leg/k;

    invoke-direct {v4}, Leg/k;-><init>()V

    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v3, v4}, Lae3/k;-><init>(Leg/k;)V

    invoke-direct {v2, v3}, Leg/o;-><init>(Lae3/k;)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
