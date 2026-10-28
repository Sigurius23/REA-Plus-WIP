.class public final synthetic Lt1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/Collection;


# direct methods
.method public synthetic constructor <init>(ILjava/util/Collection;)V
    .locals 0

    iput p1, p0, Lt1/b;->w:I

    iput-object p2, p0, Lt1/b;->x:Ljava/util/Collection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt1/b;->x:Ljava/util/Collection;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lt1/b;->x:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lt1/b;->x:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
