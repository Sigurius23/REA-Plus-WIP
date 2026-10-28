.class public final synthetic Lou1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lou1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lou1/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/time/format/DateTimeFormatterBuilder;

    invoke-direct {v0}, Ljava/time/format/DateTimeFormatterBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->parseCaseInsensitive()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    const-string v1, "+HHmmss"

    const-string v2, "Z"

    invoke-virtual {v0, v1, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendOffset(Ljava/lang/String;Ljava/lang/String;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->toFormatter()Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/time/format/DateTimeFormatterBuilder;

    invoke-direct {v0}, Ljava/time/format/DateTimeFormatterBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->parseCaseInsensitive()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->appendOffsetId()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->toFormatter()Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lpc2/d;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lpc1/b;->b()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lp90/d;->m()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lp90/d;->i()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lp90/d;->t()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lp90/d;->v()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsMiniArchModelResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsMiniArchModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/personalrecords/miniarch/domain/models/ArchMiniPersonalRecordsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/personalrecords/miniarch/domain/models/ArchMiniPersonalRecords;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lp21/e;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lp12/x;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Loy0/a;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_16
    invoke-static {}, Lox2/e;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lox0/c;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSectionModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

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
