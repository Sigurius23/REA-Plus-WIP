.class public final synthetic Lcom/whoop/profile/view/edit/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll83/h;


# direct methods
.method public synthetic constructor <init>(Ll83/h;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/profile/view/edit/o;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/edit/o;->x:Ll83/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/edit/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/o;->x:Ll83/h;

    invoke-static {v0}, Lql2/a;->d(Ll83/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/edit/o;->x:Ll83/h;

    invoke-static {v0}, Lql2/a;->a(Ll83/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/profile/view/edit/o;->x:Ll83/h;

    invoke-static {v0}, Lmr1/j;->c(Ll83/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/profile/view/edit/o;->x:Ll83/h;

    invoke-static {v0}, Lmr1/j;->e(Ll83/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/profile/view/edit/o;->x:Ll83/h;

    invoke-static {v0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->k(Ll83/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
