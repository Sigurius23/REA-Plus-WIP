.class public final synthetic Lcw2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcw2/b;->w:I

    iput-object p1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p2, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;I)V
    .locals 0

    .line 2
    iput p3, p0, Lcw2/b;->w:I

    iput-object p1, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcw2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Lzq0/x;->b(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v1, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lzq0/f;->g(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Lwr0/z;->a(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Lwr0/z;->h(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Lu01/d;->f(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Lsz0/e;->d(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Lnr0/i;->d(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Li31/c;->c(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Li11/e;->b(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Li11/e;->f(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lcw2/b;->y:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v1, p0, Lcw2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcw2/d;->d(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
