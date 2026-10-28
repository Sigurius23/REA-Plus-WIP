.class public final synthetic Lrq0/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrq0/z0;


# direct methods
.method public synthetic constructor <init>(Lrq0/z0;I)V
    .locals 0

    iput p2, p0, Lrq0/y0;->w:I

    iput-object p1, p0, Lrq0/y0;->x:Lrq0/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrq0/y0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/y0;->x:Lrq0/z0;

    check-cast p1, Lib/n;

    invoke-static {v0, p1}, Lrq0/z0;->G(Lrq0/z0;Lib/n;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrq0/y0;->x:Lrq0/z0;

    check-cast p1, Lrq0/i1;

    invoke-static {v0, p1}, Lrq0/z0;->E(Lrq0/z0;Lrq0/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
