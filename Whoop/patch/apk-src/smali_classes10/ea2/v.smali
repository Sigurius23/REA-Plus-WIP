.class public final synthetic Lea2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u;
.implements Lio/j;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lea2/v;->w:I

    iput-object p1, p0, Lea2/v;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lea2/v;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/whoop/community/CommunityLandingHostFragment;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lea2/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lea2/v;->x:Z

    iput-object p2, p0, Lea2/v;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(ILsn/w0;[I)Lzr/w0;
    .locals 8

    iget-object v0, p0, Lea2/v;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lio/f;

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v0

    const/4 v1, 0x0

    move v4, v1

    :goto_0
    iget v1, p2, Lsn/w0;->w:I

    if-ge v4, v1, :cond_0

    new-instance v1, Lio/d;

    aget v6, p3, v4

    iget-boolean v7, p0, Lea2/v;->x:Z

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lio/d;-><init>(ILsn/w0;ILio/f;IZ)V

    invoke-virtual {v0, v1}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lzr/d0;->f()Lzr/w0;

    move-result-object p1

    return-object p1
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 2

    iget v0, p0, Lea2/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lea2/v;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityLandingHostFragment;

    iget-boolean v1, p0, Lea2/v;->x:Z

    invoke-static {v1, v0, p1, p2}, Lcom/whoop/community/CommunityLandingHostFragment;->Z(ZLcom/whoop/community/CommunityLandingHostFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lea2/v;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/SettingsLandingFragment;

    iget-boolean v1, p0, Lea2/v;->x:Z

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment;->O(Lcom/whoop/settings/SettingsLandingFragment;ZLandroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
