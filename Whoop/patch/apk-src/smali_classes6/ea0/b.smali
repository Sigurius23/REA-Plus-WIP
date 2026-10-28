.class public final synthetic Lea0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/add/activity/view/AddActivityFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/add/activity/view/AddActivityFragment;I)V
    .locals 0

    iput p2, p0, Lea0/b;->w:I

    iput-object p1, p0, Lea0/b;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lea0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lea0/b;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    check-cast p1, Ln82/b;

    invoke-static {v0, p1}, Lcom/whoop/add/activity/view/AddActivityFragment;->D(Lcom/whoop/add/activity/view/AddActivityFragment;Ln82/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lea0/b;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    check-cast p1, Lda0/b;

    invoke-static {v0, p1}, Lcom/whoop/add/activity/view/AddActivityFragment;->A(Lcom/whoop/add/activity/view/AddActivityFragment;Lda0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
