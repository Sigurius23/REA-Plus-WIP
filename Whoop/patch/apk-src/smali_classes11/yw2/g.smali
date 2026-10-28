.class public final synthetic Lyw2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/whooplabs/WhoopLabsService;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/whooplabs/WhoopLabsService;I)V
    .locals 0

    iput p2, p0, Lyw2/g;->w:I

    iput-object p1, p0, Lyw2/g;->x:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyw2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyw2/g;->x:Lcom/whoop/whooplabs/WhoopLabsService;

    check-cast p1, Lcom/whoop/design/util/TextResource;

    invoke-static {v0, p1}, Lcom/whoop/whooplabs/WhoopLabsService;->b(Lcom/whoop/whooplabs/WhoopLabsService;Lcom/whoop/design/util/TextResource;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyw2/g;->x:Lcom/whoop/whooplabs/WhoopLabsService;

    check-cast p1, Ll83/a0;

    invoke-static {v0, p1}, Lcom/whoop/whooplabs/WhoopLabsService;->a(Lcom/whoop/whooplabs/WhoopLabsService;Ll83/a0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
