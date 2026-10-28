.class public final synthetic Lg62/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/referafriend/ReferAFriendFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/referafriend/ReferAFriendFragment;I)V
    .locals 0

    iput p2, p0, Lg62/b;->w:I

    iput-object p1, p0, Lg62/b;->x:Lcom/whoop/referafriend/ReferAFriendFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg62/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg62/b;->x:Lcom/whoop/referafriend/ReferAFriendFragment;

    check-cast p1, Lh62/a;

    invoke-static {v0, p1}, Lcom/whoop/referafriend/ReferAFriendFragment;->B(Lcom/whoop/referafriend/ReferAFriendFragment;Lh62/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg62/b;->x:Lcom/whoop/referafriend/ReferAFriendFragment;

    check-cast p1, Ll62/a;

    invoke-static {v0, p1}, Lcom/whoop/referafriend/ReferAFriendFragment;->D(Lcom/whoop/referafriend/ReferAFriendFragment;Ll62/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lg62/b;->x:Lcom/whoop/referafriend/ReferAFriendFragment;

    check-cast p1, Lm62/j;

    invoke-static {v0, p1}, Lcom/whoop/referafriend/ReferAFriendFragment;->A(Lcom/whoop/referafriend/ReferAFriendFragment;Lm62/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
