.class public final synthetic Lmp0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmp0/v;


# direct methods
.method public synthetic constructor <init>(Lmp0/v;I)V
    .locals 0

    iput p2, p0, Lmp0/t;->w:I

    iput-object p1, p0, Lmp0/t;->x:Lmp0/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/t;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lmp0/t;->x:Lmp0/v;

    invoke-static {v0, p1}, Lmp0/v;->G(Lmp0/v;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmp0/t;->x:Lmp0/v;

    check-cast p1, Lmp0/p;

    invoke-static {v0, p1}, Lmp0/v;->F(Lmp0/v;Lmp0/p;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmp0/t;->x:Lmp0/v;

    check-cast p1, Lmp0/c;

    invoke-static {v0, p1}, Lmp0/v;->E(Lmp0/v;Lmp0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
