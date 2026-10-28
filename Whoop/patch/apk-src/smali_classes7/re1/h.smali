.class public final synthetic Lre1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/model/FeatureEducationParagraph;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/model/FeatureEducationParagraph;Lkotlin/jvm/functions/Function1;ZIII)V
    .locals 0

    iput p6, p0, Lre1/h;->w:I

    iput-object p1, p0, Lre1/h;->x:Lcom/whoop/design/model/FeatureEducationParagraph;

    iput-object p2, p0, Lre1/h;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, Lre1/h;->z:Z

    iput p4, p0, Lre1/h;->E:I

    iput p5, p0, Lre1/h;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lre1/h;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lre1/h;->x:Lcom/whoop/design/model/FeatureEducationParagraph;

    iget-object v2, p0, Lre1/h;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Lre1/h;->z:Z

    iget v4, p0, Lre1/h;->E:I

    iget v5, p0, Lre1/h;->F:I

    invoke-static/range {v1 .. v7}, Lre1/j;->r(Lcom/whoop/design/model/FeatureEducationParagraph;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lre1/h;->x:Lcom/whoop/design/model/FeatureEducationParagraph;

    iget-object v1, p0, Lre1/h;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v2, p0, Lre1/h;->z:Z

    iget v3, p0, Lre1/h;->E:I

    iget v4, p0, Lre1/h;->F:I

    invoke-static/range {v0 .. v6}, Lre1/j;->f(Lcom/whoop/design/model/FeatureEducationParagraph;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
