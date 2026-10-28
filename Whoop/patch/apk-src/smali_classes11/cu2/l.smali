.class public final synthetic Lcu2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcu2/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcu2/l;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/design/models/items/emoji/EmojiSize;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/design/models/items/emoji/EmojiModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Ld62/g;->n()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Ld62/c;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Ld41/e;->n()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    sget-object v0, Ld40/p;->h:Ld40/g;

    return-object v0

    :pswitch_8
    sget-object v0, Ld40/p;->i:Ld40/m;

    return-object v0

    :pswitch_9
    sget-object v0, Ld40/r;->c:Lp1/u2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_a
    sget-object v0, Ld40/p;->j:Ld40/h;

    return-object v0

    :pswitch_b
    sget-object v0, Ld40/p;->g:Ljava/lang/Float;

    return-object v0

    :pswitch_c
    sget-object v0, Ld40/p;->d:Ld40/s;

    return-object v0

    :pswitch_d
    sget-object v0, Ld40/p;->c:Ld40/o;

    return-object v0

    :pswitch_e
    sget-object v0, Ld40/p;->b:Ld40/n;

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Ld11/f;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    const-string v0, "Couldn\'t find an instance of InitializationDataSource. Are you instantiating CustomerSheet unconditionally in your app?"

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/ScreeningSubmissionDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/ScreeningResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentCompletedDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/data/remote/domain/response/journal/TextDisplayOption;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/weightlifting/a;->n()Ll83/a0;

    move-result-object v0

    return-object v0

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
