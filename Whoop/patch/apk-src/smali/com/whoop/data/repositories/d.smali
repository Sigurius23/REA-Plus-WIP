.class public final synthetic Lcom/whoop/data/repositories/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lbc3/c2;


# direct methods
.method public synthetic constructor <init>(Lbc3/c2;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/data/repositories/d;->a:I

    iput-object p1, p0, Lcom/whoop/data/repositories/d;->b:Lbc3/c2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget v0, p0, Lcom/whoop/data/repositories/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/repositories/d;->b:Lbc3/c2;

    invoke-static {v0}, Lod1/y;->a(Lbc3/c2;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/repositories/d;->b:Lbc3/c2;

    invoke-static {v0}, Lcom/whoop/data/repositories/SportsRepository;->a(Lbc3/c2;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
