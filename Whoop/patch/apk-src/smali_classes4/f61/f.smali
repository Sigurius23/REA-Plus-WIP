.class public final synthetic Lf61/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lf61/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf61/f;->z:Ljava/lang/Object;

    iput-object p2, p0, Lf61/f;->E:Ljava/lang/Object;

    iput-object p3, p0, Lf61/f;->F:Ljava/lang/Object;

    iput-boolean p4, p0, Lf61/f;->x:Z

    iput-object p5, p0, Lf61/f;->G:Ljava/lang/Object;

    iput p6, p0, Lf61/f;->y:I

    return-void
.end method

.method public synthetic constructor <init>(Lf61/i;Ll0/s1;Ljava/util/List;Lp91/a;ZI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lf61/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf61/f;->z:Ljava/lang/Object;

    iput-object p2, p0, Lf61/f;->E:Ljava/lang/Object;

    iput-object p3, p0, Lf61/f;->F:Ljava/lang/Object;

    iput-object p4, p0, Lf61/f;->G:Ljava/lang/Object;

    iput-boolean p5, p0, Lf61/f;->x:Z

    iput p6, p0, Lf61/f;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lf61/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf61/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lf61/f;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lb91/a;

    iget-object v0, p0, Lf61/f;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lf61/f;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v4, p0, Lf61/f;->x:Z

    iget v6, p0, Lf61/f;->y:I

    invoke-static/range {v1 .. v8}, Lly0/e;->a(Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf61/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf61/i;

    iget-object v0, p0, Lf61/f;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ll0/s1;

    iget-object v0, p0, Lf61/f;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    iget-object v0, p0, Lf61/f;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp91/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v5, p0, Lf61/f;->x:Z

    iget v6, p0, Lf61/f;->y:I

    invoke-static/range {v1 .. v8}, Lf61/i;->o(Lf61/i;Ll0/s1;Ljava/util/List;Lp91/a;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
