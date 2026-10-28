.class public final synthetic Lkz2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Z

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZII)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lkz2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkz2/b;->x:Lc93/a;

    iput-object p2, p0, Lkz2/b;->y:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lkz2/b;->z:Lc93/a;

    iput-object p4, p0, Lkz2/b;->E:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lkz2/b;->F:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lkz2/b;->G:Lcom/whoop/design/util/TextResource;

    iput-boolean p7, p0, Lkz2/b;->H:Z

    iput p8, p0, Lkz2/b;->I:I

    iput p9, p0, Lkz2/b;->J:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lkz2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkz2/b;->y:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lkz2/b;->E:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lkz2/b;->F:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lkz2/b;->x:Lc93/a;

    iput-object p5, p0, Lkz2/b;->G:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lkz2/b;->z:Lc93/a;

    iput-boolean p7, p0, Lkz2/b;->H:Z

    iput p8, p0, Lkz2/b;->I:I

    iput p9, p0, Lkz2/b;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lkz2/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lkz2/b;->x:Lc93/a;

    iget-object v2, p0, Lkz2/b;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lkz2/b;->z:Lc93/a;

    iget-object v4, p0, Lkz2/b;->E:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lkz2/b;->F:Lcom/whoop/design/util/TextResource;

    iget-object v6, p0, Lkz2/b;->G:Lcom/whoop/design/util/TextResource;

    iget-boolean v7, p0, Lkz2/b;->H:Z

    iget v8, p0, Lkz2/b;->I:I

    iget v9, p0, Lkz2/b;->J:I

    invoke-static/range {v1 .. v11}, Lkz2/c;->a(Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lkz2/b;->x:Lc93/a;

    iget-object v1, p0, Lkz2/b;->y:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lkz2/b;->z:Lc93/a;

    iget-object v3, p0, Lkz2/b;->E:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lkz2/b;->F:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lkz2/b;->G:Lcom/whoop/design/util/TextResource;

    iget-boolean v6, p0, Lkz2/b;->H:Z

    iget v7, p0, Lkz2/b;->I:I

    iget v8, p0, Lkz2/b;->J:I

    invoke-static/range {v0 .. v10}, Lkz2/c;->b(Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
