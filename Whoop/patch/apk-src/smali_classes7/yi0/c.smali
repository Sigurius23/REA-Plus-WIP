.class public final synthetic Lyi0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lti0/d;


# direct methods
.method public synthetic constructor <init>(Lti0/d;I)V
    .locals 0

    iput p2, p0, Lyi0/c;->w:I

    iput-object p1, p0, Lyi0/c;->x:Lti0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyi0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyi0/c;->x:Lti0/d;

    check-cast p1, Lti0/a;

    invoke-static {v0, p1}, Lyi0/d;->i(Lti0/d;Lti0/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyi0/c;->x:Lti0/d;

    check-cast p1, Lcom/whoop/archv2/model/template/BackgroundModel;

    invoke-static {v0, p1}, Lyi0/d;->k(Lti0/d;Lcom/whoop/archv2/model/template/BackgroundModel;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
