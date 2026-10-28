.class public final synthetic Li21/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:J

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLt71/g$a;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Li21/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li21/p;->x:Lcom/whoop/design/util/TextResource;

    iput-wide p2, p0, Li21/p;->y:J

    iput-object p4, p0, Li21/p;->z:Lcom/whoop/design/util/TextResource;

    iput-wide p5, p0, Li21/p;->E:J

    iput-object p7, p0, Li21/p;->H:Ljava/lang/Object;

    iput-object p8, p0, Li21/p;->I:Ljava/lang/Object;

    iput-object p9, p0, Li21/p;->F:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Li21/p;->G:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public synthetic constructor <init>(Ly11/r;Lcom/whoop/design/util/TextResource;JLt71/g$b;Lcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Li21/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li21/p;->H:Ljava/lang/Object;

    iput-object p2, p0, Li21/p;->x:Lcom/whoop/design/util/TextResource;

    iput-wide p3, p0, Li21/p;->y:J

    iput-object p5, p0, Li21/p;->I:Ljava/lang/Object;

    iput-object p6, p0, Li21/p;->z:Lcom/whoop/design/util/TextResource;

    iput-wide p7, p0, Li21/p;->E:J

    iput-object p9, p0, Li21/p;->F:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Li21/p;->G:Lcom/whoop/design/util/TextResource;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Li21/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li21/p;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly11/r;

    iget-object v0, p0, Li21/p;->I:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lt71/g$b;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v2, p0, Li21/p;->x:Lcom/whoop/design/util/TextResource;

    iget-wide v3, p0, Li21/p;->y:J

    iget-object v6, p0, Li21/p;->z:Lcom/whoop/design/util/TextResource;

    iget-wide v7, p0, Li21/p;->E:J

    iget-object v9, p0, Li21/p;->F:Lkotlin/jvm/functions/Function1;

    iget-object v10, p0, Li21/p;->G:Lcom/whoop/design/util/TextResource;

    invoke-static/range {v1 .. v12}, Li21/t;->d(Ly11/r;Lcom/whoop/design/util/TextResource;JLt71/g$b;Lcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Li21/p;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lt71/g$a;

    iget-object v0, p0, Li21/p;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v1, p0, Li21/p;->x:Lcom/whoop/design/util/TextResource;

    iget-wide v2, p0, Li21/p;->y:J

    iget-object v4, p0, Li21/p;->z:Lcom/whoop/design/util/TextResource;

    iget-wide v5, p0, Li21/p;->E:J

    iget-object v9, p0, Li21/p;->F:Lkotlin/jvm/functions/Function1;

    iget-object v10, p0, Li21/p;->G:Lcom/whoop/design/util/TextResource;

    invoke-static/range {v1 .. v12}, Li21/s;->c(Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLt71/g$a;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
