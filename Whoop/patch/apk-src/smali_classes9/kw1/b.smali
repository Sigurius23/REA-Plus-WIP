.class public final synthetic Lkw1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Liw1/b;


# direct methods
.method public synthetic constructor <init>(Liw1/b;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lkw1/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkw1/b;->y:Liw1/b;

    iput-object p2, p0, Lkw1/b;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Liw1/b;I)V
    .locals 0

    .line 2
    iput p3, p0, Lkw1/b;->w:I

    iput-object p1, p0, Lkw1/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lkw1/b;->y:Liw1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lkw1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkw1/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lkw1/b;->y:Liw1/b;

    invoke-static {v1, v0, p1}, Lkw1/d;->o(Liw1/b;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkw1/b;->y:Liw1/b;

    check-cast p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    iget-object v1, p0, Lkw1/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lkw1/d;->j(Lkotlin/jvm/functions/Function1;Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lkw1/b;->y:Liw1/b;

    check-cast p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    iget-object v1, p0, Lkw1/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lkw1/d;->c(Lkotlin/jvm/functions/Function1;Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
