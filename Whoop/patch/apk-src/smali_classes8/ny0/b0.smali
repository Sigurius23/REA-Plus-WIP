.class public final synthetic Lny0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lg1/u0;

.field public final synthetic F:Lf0/t;

.field public final synthetic G:Ljava/lang/Integer;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Ljava/lang/Integer;Lc93/a;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lny0/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/b0;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lny0/b0;->y:Z

    iput-object p3, p0, Lny0/b0;->z:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lny0/b0;->E:Lg1/u0;

    iput-object p5, p0, Lny0/b0;->F:Lf0/t;

    iput-object p6, p0, Lny0/b0;->G:Ljava/lang/Integer;

    iput-object p7, p0, Lny0/b0;->H:Lc93/a;

    iput p8, p0, Lny0/b0;->I:I

    iput p9, p0, Lny0/b0;->J:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Lc93/a;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lny0/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/b0;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lny0/b0;->y:Z

    iput-object p3, p0, Lny0/b0;->G:Ljava/lang/Integer;

    iput-object p4, p0, Lny0/b0;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lny0/b0;->E:Lg1/u0;

    iput-object p6, p0, Lny0/b0;->F:Lf0/t;

    iput-object p7, p0, Lny0/b0;->H:Lc93/a;

    iput p8, p0, Lny0/b0;->I:I

    iput p9, p0, Lny0/b0;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lny0/b0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lny0/b0;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Lny0/b0;->y:Z

    iget-object v3, p0, Lny0/b0;->z:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lny0/b0;->E:Lg1/u0;

    iget-object v5, p0, Lny0/b0;->F:Lf0/t;

    iget-object v6, p0, Lny0/b0;->G:Ljava/lang/Integer;

    iget-object v7, p0, Lny0/b0;->H:Lc93/a;

    iget v8, p0, Lny0/b0;->I:I

    iget v9, p0, Lny0/b0;->J:I

    invoke-static/range {v1 .. v11}, Lny0/q0;->a(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Ljava/lang/Integer;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lny0/b0;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lny0/b0;->y:Z

    iget-object v2, p0, Lny0/b0;->z:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lny0/b0;->E:Lg1/u0;

    iget-object v4, p0, Lny0/b0;->F:Lf0/t;

    iget-object v5, p0, Lny0/b0;->G:Ljava/lang/Integer;

    iget-object v6, p0, Lny0/b0;->H:Lc93/a;

    iget v7, p0, Lny0/b0;->I:I

    iget v8, p0, Lny0/b0;->J:I

    invoke-static/range {v0 .. v10}, Lny0/c0;->a(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Ljava/lang/Integer;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
