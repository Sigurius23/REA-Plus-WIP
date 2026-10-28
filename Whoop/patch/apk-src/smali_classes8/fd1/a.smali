.class public final synthetic Lfd1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;I)V
    .locals 0

    iput p2, p0, Lfd1/a;->w:I

    iput-object p1, p0, Lfd1/a;->x:Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfd1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfd1/a;->x:Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;

    invoke-static {v0}, Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;->D(Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfd1/a;->x:Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;

    invoke-static {v0}, Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;->z(Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
