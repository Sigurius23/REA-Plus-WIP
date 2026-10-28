.class public final synthetic Llb1/x3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llb1/x3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llb1/x3;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/n4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/design/models/items/SingleSelectModel;

    invoke-static {p1}, Llb1/l4;->b(Lcom/whoop/design/models/items/SingleSelectModel;)Lt31/c;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/l4;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/design/models/items/SelectionWidgetModel;

    invoke-static {p1}, Llb1/j4;->a(Lcom/whoop/design/models/items/SelectionWidgetModel;)Lr31/f;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/j4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/design/models/items/SelectableChipModel;

    invoke-static {p1}, Llb1/i4;->a(Lcom/whoop/design/models/items/SelectableChipModel;)Lb81/j;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/i4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-static {p1}, Llb1/h4;->a(Lcom/whoop/design/models/items/SelectableCellModel;)Lry0/d;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/h4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/design/models/items/SelectableCellListModel;

    invoke-static {p1}, Llb1/g4;->a(Lcom/whoop/design/models/items/SelectableCellListModel;)Ln01/e;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/g4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/design/models/items/SegmentedContentModel;

    invoke-static {p1}, Llb1/f4;->b(Lcom/whoop/design/models/items/SegmentedContentModel;)Lq31/f;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/f4;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/design/models/items/SectionModel;

    invoke-static {p1}, Llb1/e4;->c(Lcom/whoop/design/models/items/SectionModel;)Lk81/e;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/e4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/design/models/items/CardIconButtonModel;

    invoke-static {p1}, Llb1/d4;->b(Lcom/whoop/design/models/items/CardIconButtonModel;)Lny0/l;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {p1}, Llb1/d4;->d(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-static {p1}, Llb1/d4;->a(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/d4;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/design/models/items/searchable/SearchableListModel;

    invoke-static {p1}, Llb1/c4;->c(Lcom/whoop/design/models/items/searchable/SearchableListModel;)Lm31/c;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/design/models/items/searchable/SearchableSectionModel;

    invoke-static {p1}, Llb1/c4;->d(Lcom/whoop/design/models/items/searchable/SearchableSectionModel;)Lm31/j;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/design/models/items/searchable/SearchableRowModel;

    invoke-static {p1}, Llb1/c4;->b(Lcom/whoop/design/models/items/searchable/SearchableRowModel;)Lm31/f;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/c4;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/design/models/items/SearchBarModel;

    invoke-static {p1}, Llb1/b4;->b(Lcom/whoop/design/models/items/SearchBarModel;)Lo31/e;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/b4;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/design/models/items/ArchMiniSearchModel;

    invoke-static {p1}, Llb1/a4;->a(Lcom/whoop/design/models/items/ArchMiniSearchModel;)Ln31/i;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/a4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/design/models/items/RewardsSectionModel;

    invoke-static {p1}, Llb1/z3;->b(Lcom/whoop/design/models/items/RewardsSectionModel;)Lh81/g;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/z3;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/design/models/items/RewardItemModel;

    invoke-static {p1}, Llb1/y3;->a(Lcom/whoop/design/models/items/RewardItemModel;)Lh81/c;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
