.class public final synthetic Li21/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JZLcom/whoop/design/util/TextResource;Ly81/f;Lhy0/h1;Ljava/util/List;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Li21/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li21/b;->x:Lcom/whoop/design/util/TextResource;

    iput-wide p2, p0, Li21/b;->E:J

    iput-boolean p4, p0, Li21/b;->z:Z

    iput-object p5, p0, Li21/b;->y:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Li21/b;->G:Ljava/lang/Object;

    iput-object p7, p0, Li21/b;->H:Ljava/lang/Object;

    iput-object p8, p0, Li21/b;->I:Ljava/lang/Object;

    iput p9, p0, Li21/b;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Li21/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li21/b;->x:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Li21/b;->y:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Li21/b;->G:Ljava/lang/Object;

    iput-boolean p4, p0, Li21/b;->z:Z

    iput-wide p5, p0, Li21/b;->E:J

    iput-object p7, p0, Li21/b;->H:Ljava/lang/Object;

    iput-object p8, p0, Li21/b;->I:Ljava/lang/Object;

    iput p9, p0, Li21/b;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Li21/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li21/b;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Li21/b;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Li21/b;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/whoop/design/util/TextResource;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Li21/b;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Li21/b;->y:Lcom/whoop/design/util/TextResource;

    iget-boolean v4, p0, Li21/b;->z:Z

    iget-wide v5, p0, Li21/b;->E:J

    iget v9, p0, Li21/b;->F:I

    invoke-static/range {v1 .. v11}, Ly11/k;->h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Li21/b;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ly81/f;

    iget-object v0, p0, Li21/b;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lhy0/h1;

    iget-object v0, p0, Li21/b;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Li21/b;->x:Lcom/whoop/design/util/TextResource;

    iget-wide v2, p0, Li21/b;->E:J

    iget-boolean v4, p0, Li21/b;->z:Z

    iget-object v5, p0, Li21/b;->y:Lcom/whoop/design/util/TextResource;

    iget v9, p0, Li21/b;->F:I

    invoke-static/range {v1 .. v11}, Li21/c;->f(Lcom/whoop/design/util/TextResource;JZLcom/whoop/design/util/TextResource;Ly81/f;Lhy0/h1;Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
