.class public final synthetic Lkw1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lkw1/k;->w:I

    iput-object p1, p0, Lkw1/k;->x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iput-object p2, p0, Lkw1/k;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/extensions/domain/models/ProgressContent;I)V
    .locals 0

    .line 2
    iput p3, p0, Lkw1/k;->w:I

    iput-object p1, p0, Lkw1/k;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lkw1/k;->x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lkw1/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkw1/k;->x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-object v1, p0, Lkw1/k;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkw1/v;->a(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkw1/k;->x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-object v1, p0, Lkw1/k;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkw1/r;->d(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lkw1/k;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lkw1/k;->x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    invoke-static {v1, v0}, Lkw1/r;->a(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lkw1/k;->x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-object v1, p0, Lkw1/k;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkw1/n;->a(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lkw1/k;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lkw1/k;->x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    invoke-static {v1, v0}, Lkw1/n;->d(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lkw1/k;->x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-object v1, p0, Lkw1/k;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkw1/m;->c(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lkw1/k;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lkw1/k;->x:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    invoke-static {v1, v0}, Lkw1/m;->b(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
