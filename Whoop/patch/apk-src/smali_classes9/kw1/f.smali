.class public final synthetic Lkw1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Liw1/f;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Liw1/f;I)V
    .locals 0

    iput p3, p0, Lkw1/f;->w:I

    iput-object p1, p0, Lkw1/f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lkw1/f;->y:Liw1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lkw1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkw1/f;->y:Liw1/f;

    check-cast p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    iget-object v1, p0, Lkw1/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lkw1/g;->b(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkw1/f;->y:Liw1/f;

    check-cast p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    iget-object v1, p0, Lkw1/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lkw1/g;->c(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lkw1/f;->y:Liw1/f;

    check-cast p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    iget-object v1, p0, Lkw1/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lkw1/g;->e(Lkotlin/jvm/functions/Function1;Liw1/f;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
