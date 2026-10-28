.class public final Lk20/i;
.super Lk20/t;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;I)V
    .locals 0

    iput p2, p0, Lk20/i;->w:I

    packed-switch p2, :pswitch_data_0

    const-string p2, "mode"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string p2, "cannot_return_from_link_and_lpms"

    invoke-static {p1, p2}, Lg73/a;->p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lk20/i;->x:Ljava/lang/String;

    return-void

    .line 3
    :pswitch_0
    const-string p2, "mode"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const-string p2, "sheet_newpm_show"

    invoke-static {p1, p2}, Lg73/a;->p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lk20/i;->x:Ljava/lang/String;

    return-void

    .line 6
    :pswitch_1
    const-string p2, "mode"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string p2, "manage_savedpm_show"

    invoke-static {p1, p2}, Lg73/a;->p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lk20/i;->x:Ljava/lang/String;

    return-void

    .line 9
    :pswitch_2
    const-string p2, "mode"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const-string p2, "sheet_savedpm_show"

    invoke-static {p1, p2}, Lg73/a;->p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lk20/i;->x:Ljava/lang/String;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lq20/y;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lk20/i;->w:I

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-static {p2}, Lg73/a;->o(Lq20/y;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "paymentoption_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "_select"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lg73/a;->p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lk20/i;->x:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lk20/i;->w:I

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, "(?<=.)(?=\\p{Upper})"

    .line 16
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    const-string v1, "_"

    .line 18
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "replaceAll(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    const-string v0, "autofill_"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lk20/i;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lk20/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk20/i;->x:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lk20/i;->x:Ljava/lang/String;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lk20/i;->x:Ljava/lang/String;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lk20/i;->x:Ljava/lang/String;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lk20/i;->x:Ljava/lang/String;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lk20/i;->x:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
