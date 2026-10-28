.class public final synthetic Lcom/whoop/profile/view/edit/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lg1/y3;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p7, p0, Lcom/whoop/profile/view/edit/d;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/edit/d;->x:Lbc3/c0;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/d;->y:Lg1/y3;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/d;->z:Lp1/c1;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/d;->E:Lp1/c1;

    iput-object p5, p0, Lcom/whoop/profile/view/edit/d;->F:Lp1/c1;

    iput-object p6, p0, Lcom/whoop/profile/view/edit/d;->G:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcom/whoop/profile/view/edit/d;->w:I

    iget-object v5, p0, Lcom/whoop/profile/view/edit/d;->F:Lp1/c1;

    iget-object v6, p0, Lcom/whoop/profile/view/edit/d;->G:Lp1/c1;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/d;->x:Lbc3/c0;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/d;->y:Lg1/y3;

    iget-object v3, p0, Lcom/whoop/profile/view/edit/d;->z:Lp1/c1;

    iget-object v4, p0, Lcom/whoop/profile/view/edit/d;->E:Lp1/c1;

    packed-switch v0, :pswitch_data_0

    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->h(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->o(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
