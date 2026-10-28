.class public final synthetic Lnm2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnm2/c;


# direct methods
.method public synthetic constructor <init>(Lnm2/c;I)V
    .locals 0

    iput p2, p0, Lnm2/a;->w:I

    iput-object p1, p0, Lnm2/a;->x:Lnm2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnm2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnm2/a;->x:Lnm2/c;

    check-cast p1, Lnm2/d;

    invoke-static {v0, p1}, Lnm2/c;->l(Lnm2/c;Lnm2/d;)Lnm2/d;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lnm2/a;->x:Lnm2/c;

    check-cast p1, Lnm2/d;

    invoke-static {v0, p1}, Lnm2/c;->g(Lnm2/c;Lnm2/d;)Lnm2/d;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
