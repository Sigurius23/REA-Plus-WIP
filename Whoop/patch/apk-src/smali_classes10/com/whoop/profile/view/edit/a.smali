.class public final synthetic Lcom/whoop/profile/view/edit/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V
    .locals 0

    iput p2, p0, Lcom/whoop/profile/view/edit/a;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/edit/a;->x:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/a;->y:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/a;->z:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/whoop/profile/view/edit/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/a;->y:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/a;->z:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/a;->x:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lr51/e;->g(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/edit/a;->y:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/a;->z:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/a;->x:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->f(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
