.class public final synthetic Lqi/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/v;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqi/w;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lqi/w;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lqi/m;->a:I

    iput-object p1, p0, Lqi/m;->b:Lqi/w;

    iput-object p2, p0, Lqi/m;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lqi/m;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqi/m;->b:Lqi/w;

    iget-object v1, p0, Lqi/m;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lqi/w;->v(Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lqi/m;->b:Lqi/w;

    iget-object v1, p0, Lqi/m;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lqi/w;->s(Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lqi/m;->b:Lqi/w;

    iget-object v1, p0, Lqi/m;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lqi/w;->t(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
