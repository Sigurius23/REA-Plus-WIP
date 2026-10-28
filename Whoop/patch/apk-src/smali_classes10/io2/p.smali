.class public final synthetic Lio2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/navigation/e;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lio2/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio2/p;->y:Lkotlin/jvm/functions/Function1;

    iput-object p1, p0, Lio2/p;->x:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lio2/p;->w:I

    iput-object p1, p0, Lio2/p;->x:Lcom/whoop/navigation/e;

    iput-object p2, p0, Lio2/p;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio2/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio2/p;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc31/c;

    iget-object v1, p0, Lio2/p;->x:Lcom/whoop/navigation/e;

    invoke-static {v1, v0, p1}, Lle0/b;->g(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio2/p;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lio2/p;->x:Lcom/whoop/navigation/e;

    invoke-static {v1, v0, p1}, Ll01/m;->c(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio2/p;->x:Lcom/whoop/navigation/e;

    check-cast p1, Li3/z;

    iget-object v1, p0, Lio2/p;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lio2/s;->j(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
