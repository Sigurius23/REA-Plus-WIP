.class public final synthetic Lev2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lbm/t;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lbm/t;I)V
    .locals 0

    iput p3, p0, Lev2/t;->w:I

    iput-object p1, p0, Lev2/t;->x:Lbc3/c0;

    iput-object p2, p0, Lev2/t;->y:Lbm/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lev2/t;->w:I

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev2/t;->x:Lbc3/c0;

    iget-object v1, p0, Lev2/t;->y:Lbm/t;

    invoke-static {v0, v1, p1}, Lqu2/h;->l(Lbc3/c0;Lbm/t;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lev2/t;->x:Lbc3/c0;

    iget-object v1, p0, Lev2/t;->y:Lbm/t;

    invoke-static {v0, v1, p1}, Lev2/u;->z(Lbc3/c0;Lbm/t;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
