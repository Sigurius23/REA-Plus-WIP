.class public final synthetic Lcom/whoop/profile/view/edit/form/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;I)V
    .locals 0

    iput p3, p0, Lcom/whoop/profile/view/edit/form/b;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/edit/form/b;->x:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/form/b;->y:Lcom/whoop/design/util/TextResource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/profile/view/edit/form/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/b;->y:Lcom/whoop/design/util/TextResource;

    check-cast p1, Ljb1/b;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/b;->x:Ljava/lang/String;

    invoke-static {v1, v0, p1}, Lvw1/c;->a(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/b;->y:Lcom/whoop/design/util/TextResource;

    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/b;->x:Ljava/lang/String;

    invoke-static {v1, v0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->d(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
