.class public final synthetic Lqa2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lqa2/b;


# direct methods
.method public synthetic constructor <init>(Lqa2/b;I)V
    .locals 0

    iput p2, p0, Lqa2/a;->w:I

    iput-object p1, p0, Lqa2/a;->x:Lqa2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqa2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqa2/a;->x:Lqa2/b;

    check-cast p1, Lta2/a;

    invoke-static {v0, p1}, Lqa2/b;->A(Lqa2/b;Lta2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lqa2/a;->x:Lqa2/b;

    check-cast p1, Lra2/a;

    invoke-static {v0, p1}, Lqa2/b;->B(Lqa2/b;Lra2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
