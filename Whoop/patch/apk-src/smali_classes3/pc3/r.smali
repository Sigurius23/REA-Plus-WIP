.class public final synthetic Lpc3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lpc3/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lpc3/r;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lpy0/d;->m()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lpy0/d;->v()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lpy0/b;->F()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lpy0/b;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lpy0/b;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lpy0/b;->u()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lpy0/b;->p()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lpy0/b;->l()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lpx0/c;->i()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lpx0/c;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lpx0/c;->g()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lpx0/c;->d()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lpt2/v;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lpq2/a;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lpp2/h;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lpp2/e;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lpp2/b;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lpp1/i;->m()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lpj2/t;->n()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lpj2/q;->I()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lpj2/q;->A()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lpj2/q;->u()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lpj2/i;->Q()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/archv2/feature/domain/models/GenericSectionModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/archv2/feature/domain/models/GenericModels;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lph1/i;->q()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lph1/b;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0

    :pswitch_1b
    new-instance v0, Ljava/time/format/DateTimeFormatterBuilder;

    invoke-direct {v0}, Ljava/time/format/DateTimeFormatterBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->parseCaseInsensitive()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    sget-object v1, Ljava/time/temporal/ChronoField;->YEAR:Ljava/time/temporal/ChronoField;

    const/16 v2, 0xa

    sget-object v3, Ljava/time/format/SignStyle;->EXCEEDS_PAD:Ljava/time/format/SignStyle;

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v4, v2, v3}, Ljava/time/format/DateTimeFormatterBuilder;->appendValue(Ljava/time/temporal/TemporalField;IILjava/time/format/SignStyle;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/time/format/DateTimeFormatterBuilder;->appendLiteral(C)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    sget-object v1, Ljava/time/temporal/ChronoField;->MONTH_OF_YEAR:Ljava/time/temporal/ChronoField;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendValue(Ljava/time/temporal/TemporalField;I)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->toFormatter()Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0

    :pswitch_1c
    new-instance v0, Ljava/time/format/DateTimeFormatterBuilder;

    invoke-direct {v0}, Ljava/time/format/DateTimeFormatterBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->parseCaseInsensitive()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    const-string v1, "+HHMM"

    const-string v2, "+0000"

    invoke-virtual {v0, v1, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendOffset(Ljava/lang/String;Ljava/lang/String;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->toFormatter()Ljava/time/format/DateTimeFormatter;

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
