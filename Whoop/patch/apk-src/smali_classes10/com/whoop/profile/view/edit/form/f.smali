.class public final synthetic Lcom/whoop/profile/view/edit/form/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;Lc93/a;Ljava/lang/String;Z)V
    .locals 0

    iput p3, p0, Lcom/whoop/profile/view/edit/form/f;->w:I

    iput-object p6, p0, Lcom/whoop/profile/view/edit/form/f;->x:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/whoop/profile/view/edit/form/f;->y:Z

    iput-object p5, p0, Lcom/whoop/profile/view/edit/form/f;->z:Lc93/a;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/form/f;->E:Landroidx/compose/ui/Modifier;

    iput p1, p0, Lcom/whoop/profile/view/edit/form/f;->F:I

    iput p2, p0, Lcom/whoop/profile/view/edit/form/f;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lcom/whoop/profile/view/edit/form/f;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/f;->x:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/profile/view/edit/form/f;->y:Z

    iget-object v3, p0, Lcom/whoop/profile/view/edit/form/f;->z:Lc93/a;

    iget-object v4, p0, Lcom/whoop/profile/view/edit/form/f;->E:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lcom/whoop/profile/view/edit/form/f;->F:I

    iget v6, p0, Lcom/whoop/profile/view/edit/form/f;->G:I

    invoke-static/range {v1 .. v8}, Lno0/w0;->c(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/f;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/f;->y:Z

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/f;->z:Lc93/a;

    iget-object v3, p0, Lcom/whoop/profile/view/edit/form/f;->E:Landroidx/compose/ui/Modifier;

    iget v4, p0, Lcom/whoop/profile/view/edit/form/f;->F:I

    iget v5, p0, Lcom/whoop/profile/view/edit/form/f;->G:I

    invoke-static/range {v0 .. v7}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->d(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
