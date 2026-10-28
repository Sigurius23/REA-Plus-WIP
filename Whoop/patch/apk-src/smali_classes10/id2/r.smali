.class public final synthetic Lid2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lid2/r;->w:I

    iput-object p1, p0, Lid2/r;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lid2/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lid2/r;->x:Ljava/lang/Object;

    check-cast v0, Ll83/h;

    check-cast p1, Lcd2/a;

    invoke-static {v0, p1}, Lid2/t;->m(Ll83/h;Lcd2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lid2/r;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    check-cast p1, Lc31/c;

    invoke-static {v0, p1}, Lid2/t;->q(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
