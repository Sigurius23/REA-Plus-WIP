.class public final synthetic Landroidx/fragment/app/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/r0;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/r0;I)V
    .locals 0

    iput p2, p0, Landroidx/fragment/app/o0;->a:I

    iput-object p1, p0, Landroidx/fragment/app/o0;->b:Landroidx/fragment/app/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Landroidx/fragment/app/o0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/content/Intent;

    iget-object p1, p0, Landroidx/fragment/app/o0;->b:Landroidx/fragment/app/r0;

    iget-object p1, p1, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    invoke-virtual {p1}, Landroidx/fragment/app/v0;->a()V

    return-void

    :pswitch_0
    check-cast p1, Landroid/content/res/Configuration;

    iget-object p1, p0, Landroidx/fragment/app/o0;->b:Landroidx/fragment/app/r0;

    iget-object p1, p1, Landroidx/fragment/app/r0;->mFragments:Landroidx/fragment/app/v0;

    invoke-virtual {p1}, Landroidx/fragment/app/v0;->a()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
