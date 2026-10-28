.class public final synthetic Lgv1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p9, p0, Lgv1/f;->w:I

    iput-object p1, p0, Lgv1/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Lgv1/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Lgv1/f;->z:Ljava/lang/Object;

    iput-object p4, p0, Lgv1/f;->E:Ljava/lang/Object;

    iput-object p5, p0, Lgv1/f;->F:Ljava/lang/Object;

    iput-object p6, p0, Lgv1/f;->G:Ljava/lang/Object;

    iput-object p7, p0, Lgv1/f;->H:Ljava/lang/Object;

    iput-object p8, p0, Lgv1/f;->I:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lgv1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgv1/f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/profile/navigation/ProfileNavigationRouter;

    iget-object v0, p0, Lgv1/f;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/profile/navigation/ProfileActionRouter;

    iget-object v0, p0, Lgv1/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ltr2/n;

    iget-object v0, p0, Lgv1/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Lgv1/f;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    iget-object v0, p0, Lgv1/f;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    iget-object v0, p0, Lgv1/f;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    iget-object v0, p0, Lgv1/f;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Landroidx/fragment/app/r0;

    move-object v9, p1

    check-cast v9, Leb/q;

    move-object v10, p2

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v1 .. v11}, Lcom/whoop/profile/view/navigation/ProfileNavHostKt;->b(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgv1/f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh/i;

    iget-object v0, p0, Lgv1/f;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lgv1/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lgv1/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Lgv1/f;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, Lgv1/f;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    iget-object v0, p0, Lgv1/f;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lp1/c1;

    iget-object v0, p0, Lgv1/f;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lp1/c1;

    move-object v9, p1

    check-cast v9, Ll0/y;

    move-object v10, p2

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v1 .. v11}, Lgv1/g;->j(Lh/i;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
