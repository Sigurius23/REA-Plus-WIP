.class public final synthetic Lsl0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lnl0/f;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lnl0/f;I)V
    .locals 0

    iput p3, p0, Lsl0/k;->w:I

    iput-object p1, p0, Lsl0/k;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lsl0/k;->y:Lnl0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lsl0/k;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    move-object v4, p2

    check-cast v4, Ljava/util/List;

    move-object v5, p3

    check-cast v5, Ljava/util/List;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v1, p0, Lsl0/k;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lsl0/k;->y:Lnl0/f;

    invoke-static/range {v1 .. v6}, Lsl0/o0;->l(Lkotlin/jvm/functions/Function1;Lnl0/f;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    move-object v3, p2

    check-cast v3, Ljava/util/List;

    move-object v4, p3

    check-cast v4, Ljava/util/List;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v0, p0, Lsl0/k;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsl0/k;->y:Lnl0/f;

    invoke-static/range {v0 .. v5}, Lsl0/p;->c(Lkotlin/jvm/functions/Function1;Lnl0/f;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
