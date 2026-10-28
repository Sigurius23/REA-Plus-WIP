.class public final synthetic Lcy1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;I)V
    .locals 0

    iput p2, p0, Lcy1/a;->w:I

    iput-object p1, p0, Lcy1/a;->x:Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcy1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcy1/a;->x:Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;

    check-cast p1, Lox1/a;

    invoke-static {v0, p1}, Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;->y(Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;Lox1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcy1/a;->x:Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;

    check-cast p1, Lpx1/a;

    invoke-static {v0, p1}, Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;->A(Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;Lpx1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
