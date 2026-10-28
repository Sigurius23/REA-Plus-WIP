.class public final synthetic Lsg2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lng2/f;


# direct methods
.method public synthetic constructor <init>(Lng2/f;I)V
    .locals 0

    iput p2, p0, Lsg2/u;->w:I

    iput-object p1, p0, Lsg2/u;->x:Lng2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsg2/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsg2/u;->x:Lng2/f;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lsg2/v;->c(Lng2/f;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsg2/u;->x:Lng2/f;

    invoke-static {v0, p1}, Lsg2/v;->k(Lng2/f;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
