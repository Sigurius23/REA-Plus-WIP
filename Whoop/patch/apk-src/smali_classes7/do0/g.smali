.class public final synthetic Ldo0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;I)V
    .locals 0

    iput p2, p0, Ldo0/g;->w:I

    iput-object p1, p0, Ldo0/g;->x:Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldo0/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldo0/g;->x:Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;

    check-cast p1, Ltn0/a;

    invoke-static {v0, p1}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->A(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Ltn0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ldo0/g;->x:Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;

    check-cast p1, Lzn0/a;

    invoke-static {v0, p1}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->B(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Lzn0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
