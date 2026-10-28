.class public final Luf/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/e;


# instance fields
.field public final synthetic a:I

.field public final b:Lyf/e;


# direct methods
.method public synthetic constructor <init>(Lyf/e;I)V
    .locals 0

    iput p2, p0, Luf/m;->a:I

    iput-object p1, p0, Luf/m;->b:Lyf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Luf/m;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Luf/u;

    iget-object v0, p0, Luf/m;->b:Lyf/e;

    invoke-interface {v0, p1, p2}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Luf/m;->b:Lyf/e;

    check-cast v0, Luf/e;

    check-cast p1, Luf/u;

    invoke-virtual {v0, p1, p2}, Luf/e;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
