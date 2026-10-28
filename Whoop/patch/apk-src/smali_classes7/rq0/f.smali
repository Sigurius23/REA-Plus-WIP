.class public final synthetic Lrq0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lib/x;


# direct methods
.method public synthetic constructor <init>(Lib/x;I)V
    .locals 0

    iput p2, p0, Lrq0/f;->w:I

    iput-object p1, p0, Lrq0/f;->x:Lib/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrq0/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/f;->x:Lib/x;

    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    invoke-static {v0, p1}, Lrq0/e1$b;->o(Lib/x;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrq0/f;->x:Lib/x;

    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    invoke-static {v0, p1}, Lrq0/w0;->o(Lib/x;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lrq0/f;->x:Lib/x;

    check-cast p1, Lhq0/a;

    invoke-static {v0, p1}, Lrq0/k0;->n(Lib/x;Lhq0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lrq0/f;->x:Lib/x;

    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    invoke-static {v0, p1}, Lrq0/i0$b;->l(Lib/x;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lrq0/f;->x:Lib/x;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lrq0/g;->o(Lib/x;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
