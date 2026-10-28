.class public final synthetic Lk80/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(IILc93/a;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lk80/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk80/l;->x:I

    iput-object p4, p0, Lk80/l;->y:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lk80/l;->z:Lc93/a;

    iput p2, p0, Lk80/l;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lc93/a;III)V
    .locals 0

    .line 2
    iput p5, p0, Lk80/l;->w:I

    iput-object p1, p0, Lk80/l;->y:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lk80/l;->z:Lc93/a;

    iput p3, p0, Lk80/l;->x:I

    iput p4, p0, Lk80/l;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lk80/l;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Lk80/l;->x:I

    iget-object v2, p0, Lk80/l;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lk80/l;->z:Lc93/a;

    iget v4, p0, Lk80/l;->E:I

    invoke-static/range {v1 .. v6}, Lzq2/e;->b(ILcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lk80/l;->x:I

    iget-object v1, p0, Lk80/l;->y:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lk80/l;->z:Lc93/a;

    iget v3, p0, Lk80/l;->E:I

    invoke-static/range {v0 .. v5}, Lzi1/f0;->c(ILcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lk80/l;->x:I

    iget-object v1, p0, Lk80/l;->y:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lk80/l;->z:Lc93/a;

    iget v3, p0, Lk80/l;->E:I

    invoke-static/range {v0 .. v5}, Lkz2/a;->a(ILcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lk80/l;->x:I

    iget-object v1, p0, Lk80/l;->y:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lk80/l;->z:Lc93/a;

    iget v3, p0, Lk80/l;->E:I

    invoke-static/range {v0 .. v5}, Lk80/m;->a(ILcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
