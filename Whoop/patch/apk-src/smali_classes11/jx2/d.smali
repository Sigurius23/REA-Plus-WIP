.class public final synthetic Ljx2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/whooplabs/feature/navigation/b;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/whooplabs/feature/navigation/b;I)V
    .locals 0

    iput p2, p0, Ljx2/d;->w:I

    iput-object p1, p0, Ljx2/d;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljx2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljx2/d;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c;

    invoke-static {v0, p1}, Ljx2/f;->F(Lcom/whoop/whooplabs/feature/navigation/b;Lcom/whoop/whooplabs/feature/navigation/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljx2/d;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c;

    invoke-static {v0, p1}, Ljx2/f;->c(Lcom/whoop/whooplabs/feature/navigation/b;Lcom/whoop/whooplabs/feature/navigation/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljx2/d;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c;

    invoke-static {v0, p1}, Ljx2/f;->j(Lcom/whoop/whooplabs/feature/navigation/b;Lcom/whoop/whooplabs/feature/navigation/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ljx2/d;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c;

    invoke-static {v0, p1}, Ljx2/f;->l(Lcom/whoop/whooplabs/feature/navigation/b;Lcom/whoop/whooplabs/feature/navigation/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ljx2/d;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c;

    invoke-static {v0, p1}, Ljx2/f;->C(Lcom/whoop/whooplabs/feature/navigation/b;Lcom/whoop/whooplabs/feature/navigation/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Ljx2/d;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c;

    invoke-static {v0, p1}, Ljx2/f;->r(Lcom/whoop/whooplabs/feature/navigation/b;Lcom/whoop/whooplabs/feature/navigation/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Ljx2/d;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c;

    invoke-static {v0, p1}, Ljx2/f;->x(Lcom/whoop/whooplabs/feature/navigation/b;Lcom/whoop/whooplabs/feature/navigation/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Ljx2/d;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c;

    invoke-static {v0, p1}, Ljx2/f;->A(Lcom/whoop/whooplabs/feature/navigation/b;Lcom/whoop/whooplabs/feature/navigation/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
