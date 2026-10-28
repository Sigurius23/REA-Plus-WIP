.class public final synthetic Lcu1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/a0;


# direct methods
.method public synthetic constructor <init>(Leb/a0;I)V
    .locals 0

    iput p2, p0, Lcu1/e;->w:I

    iput-object p1, p0, Lcu1/e;->x:Leb/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcu1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcu1/e;->x:Leb/a0;

    check-cast p1, Lbe2/b$c;

    invoke-static {v0, p1}, Lcom/whoop/shepherd/fragment/ShepherdRegistrationFragment;->y(Leb/a0;Lbe2/b$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcu1/e;->x:Leb/a0;

    check-cast p1, Lvt1/a$c;

    invoke-static {v0, p1}, Lcom/whoop/labrador/fragment/LabradorRegistrationFragment;->z(Leb/a0;Lvt1/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
