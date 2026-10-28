.class public final synthetic Lod1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lod1/x;


# direct methods
.method public synthetic constructor <init>(Lod1/x;I)V
    .locals 0

    iput p2, p0, Lod1/w;->w:I

    iput-object p1, p0, Lod1/w;->x:Lod1/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lod1/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lod1/w;->x:Lod1/x;

    check-cast p1, Ll83/k;

    invoke-virtual {v0, p1}, Lod1/x;->o(Ll83/k;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lod1/w;->x:Lod1/x;

    check-cast p1, Lod1/u$a;

    invoke-static {v0, p1}, Lod1/x;->c(Lod1/x;Lod1/u$a;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lod1/w;->x:Lod1/x;

    check-cast p1, Lod1/u$a;

    invoke-static {v0, p1}, Lod1/x;->b(Lod1/x;Lod1/u$a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
