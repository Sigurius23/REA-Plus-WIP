.class public final synthetic Lhy0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lhy0/w;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lhy0/w;->x:J

    iput-wide p3, p0, Lhy0/w;->y:J

    iput-object p5, p0, Lhy0/w;->F:Ljava/lang/Object;

    iput-object p6, p0, Lhy0/w;->G:Ljava/lang/Object;

    iput p7, p0, Lhy0/w;->z:I

    iput p8, p0, Lhy0/w;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lhy0/z;JJLandroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lhy0/w;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/w;->F:Ljava/lang/Object;

    iput-wide p2, p0, Lhy0/w;->x:J

    iput-wide p4, p0, Lhy0/w;->y:J

    iput-object p6, p0, Lhy0/w;->G:Ljava/lang/Object;

    iput p7, p0, Lhy0/w;->z:I

    iput p8, p0, Lhy0/w;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;JLi2/a1;JII)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lhy0/w;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/w;->F:Ljava/lang/Object;

    iput-wide p2, p0, Lhy0/w;->x:J

    iput-object p4, p0, Lhy0/w;->G:Ljava/lang/Object;

    iput-wide p5, p0, Lhy0/w;->y:J

    iput p7, p0, Lhy0/w;->z:I

    iput p8, p0, Lhy0/w;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lhy0/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhy0/w;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lhy0/w;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Li2/a1;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-wide v2, p0, Lhy0/w;->x:J

    iget-wide v5, p0, Lhy0/w;->y:J

    iget v7, p0, Lhy0/w;->z:I

    iget v8, p0, Lhy0/w;->E:I

    invoke-static/range {v1 .. v10}, Lzc1/j8;->b(Ljava/util/List;JLi2/a1;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhy0/w;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lhy0/w;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/whoop/design/util/TextResource;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-wide v1, p0, Lhy0/w;->x:J

    iget-wide v3, p0, Lhy0/w;->y:J

    iget v7, p0, Lhy0/w;->z:I

    iget v8, p0, Lhy0/w;->E:I

    invoke-static/range {v1 .. v10}, Li21/n;->f(JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhy0/w;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhy0/z;

    iget-object v0, p0, Lhy0/w;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Landroidx/compose/ui/Modifier;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-wide v2, p0, Lhy0/w;->x:J

    iget-wide v4, p0, Lhy0/w;->y:J

    iget v7, p0, Lhy0/w;->z:I

    iget v8, p0, Lhy0/w;->E:I

    invoke-static/range {v1 .. v10}, Lhy0/y;->d(Lhy0/z;JJLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
