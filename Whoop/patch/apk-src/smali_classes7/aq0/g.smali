.class public final synthetic Laq0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Laq0/q;


# direct methods
.method public synthetic constructor <init>(Laq0/q;I)V
    .locals 0

    iput p2, p0, Laq0/g;->w:I

    iput-object p1, p0, Laq0/g;->x:Laq0/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Laq0/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laq0/g;->x:Laq0/q;

    invoke-static {v0, p1}, Laq0/q;->o0(Laq0/q;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Laq0/g;->x:Laq0/q;

    invoke-static {v0, p1}, Laq0/q;->a0(Laq0/q;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
