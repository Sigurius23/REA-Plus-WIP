.class public final synthetic Ljt2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljt2/p$l;

.field public final synthetic y:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljt2/p$l;Ljava/util/ArrayList;I)V
    .locals 0

    iput p3, p0, Ljt2/h;->w:I

    iput-object p1, p0, Ljt2/h;->x:Ljt2/p$l;

    iput-object p2, p0, Ljt2/h;->y:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljt2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljt2/h;->y:Ljava/util/ArrayList;

    check-cast p1, Ljt2/b;

    iget-object v1, p0, Ljt2/h;->x:Ljt2/p$l;

    invoke-static {v1, v0, p1}, Ljt2/i;->b(Ljt2/p$l;Ljava/util/ArrayList;Ljt2/b;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljt2/h;->y:Ljava/util/ArrayList;

    check-cast p1, Ljt2/a;

    iget-object v1, p0, Ljt2/h;->x:Ljt2/p$l;

    invoke-static {v1, v0, p1}, Ljt2/i;->c(Ljt2/p$l;Ljava/util/ArrayList;Ljt2/a;)Z

    move-result p1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
