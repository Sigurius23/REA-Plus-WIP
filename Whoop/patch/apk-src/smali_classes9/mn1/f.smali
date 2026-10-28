.class public final synthetic Lmn1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;I)V
    .locals 0

    iput p2, p0, Lmn1/f;->w:I

    iput-object p1, p0, Lmn1/f;->x:Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmn1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmn1/f;->x:Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;

    check-cast p1, Lhn1/d;

    invoke-static {v0, p1}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->C(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lhn1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmn1/f;->x:Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;

    check-cast p1, Ljn1/b;

    invoke-static {v0, p1}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->B(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Ljn1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmn1/f;->x:Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;

    check-cast p1, Lg1/z3;

    invoke-static {v0, p1}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->A(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lg1/z3;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
