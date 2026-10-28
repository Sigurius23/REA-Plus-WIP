.class public final synthetic Lcu1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ldu1/a;


# direct methods
.method public synthetic constructor <init>(Ldu1/a;I)V
    .locals 0

    iput p2, p0, Lcu1/c;->w:I

    iput-object p1, p0, Lcu1/c;->x:Ldu1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcu1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcu1/c;->x:Ldu1/a;

    check-cast p1, Lrt1/b$e;

    invoke-static {v0, p1}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->y(Ldu1/a;Lrt1/b$e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcu1/c;->x:Ldu1/a;

    check-cast p1, Lit1/a$d;

    invoke-static {v0, p1}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->y(Ldu1/a;Lit1/a$d;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
