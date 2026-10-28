.class public final synthetic Lcom/whoop/profile/view/edit/form/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lcom/whoop/profile/view/edit/form/e;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/edit/form/e;->x:Lc93/m;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/form/e;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/profile/view/edit/form/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/e;->x:Lc93/m;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/e;->y:Lp1/c1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->c(Lc93/m;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/e;->x:Lc93/m;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/e;->y:Lp1/c1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->f(Lc93/m;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
