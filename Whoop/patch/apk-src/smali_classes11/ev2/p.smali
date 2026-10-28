.class public final synthetic Lev2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/util/Set;

.field public final synthetic z:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/util/Set;Lkotlin/jvm/functions/Function3;I)V
    .locals 0

    iput p4, p0, Lev2/p;->w:I

    iput-object p1, p0, Lev2/p;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lev2/p;->y:Ljava/util/Set;

    iput-object p3, p0, Lev2/p;->z:Lkotlin/jvm/functions/Function3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lev2/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev2/p;->z:Lkotlin/jvm/functions/Function3;

    check-cast p1, Lcom/whoop/weightlifting/data/domain/FilterItem;

    iget-object v1, p0, Lev2/p;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lev2/p;->y:Ljava/util/Set;

    invoke-static {v1, v2, v0, p1}, Lev2/u;->t(Lkotlin/jvm/functions/Function1;Ljava/util/Set;Lkotlin/jvm/functions/Function3;Lcom/whoop/weightlifting/data/domain/FilterItem;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lev2/p;->z:Lkotlin/jvm/functions/Function3;

    check-cast p1, Lcom/whoop/weightlifting/data/domain/FilterItem;

    iget-object v1, p0, Lev2/p;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lev2/p;->y:Ljava/util/Set;

    invoke-static {v1, v2, v0, p1}, Lev2/u;->q(Lkotlin/jvm/functions/Function1;Ljava/util/Set;Lkotlin/jvm/functions/Function3;Lcom/whoop/weightlifting/data/domain/FilterItem;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lev2/p;->z:Lkotlin/jvm/functions/Function3;

    check-cast p1, Lcom/whoop/weightlifting/data/domain/FilterItem;

    iget-object v1, p0, Lev2/p;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lev2/p;->y:Ljava/util/Set;

    invoke-static {v1, v2, v0, p1}, Lev2/u;->y(Lkotlin/jvm/functions/Function1;Ljava/util/Set;Lkotlin/jvm/functions/Function3;Lcom/whoop/weightlifting/data/domain/FilterItem;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
