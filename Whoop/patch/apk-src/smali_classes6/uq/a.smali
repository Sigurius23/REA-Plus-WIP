.class public final synthetic Luq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Luq/a;->a:I

    iput-object p1, p0, Luq/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget v0, p0, Luq/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luq/a;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/community/CommunityManageTeamFragment;->J(Lcom/whoop/community/CommunityManageTeamFragment;Landroid/widget/CompoundButton;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Luq/a;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/chip/Chip;

    iget-object v0, v0, Lcom/google/android/material/chip/Chip;->I:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
