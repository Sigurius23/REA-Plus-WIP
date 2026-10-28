.class public final synthetic Lea2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:Lcom/whoop/settings/SettingsLandingFragment;

.field public final synthetic x:Leb/x0;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/SettingsLandingFragment;Leb/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea2/x;->w:Lcom/whoop/settings/SettingsLandingFragment;

    iput-object p2, p0, Lea2/x;->x:Leb/x0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lea2/x;->w:Lcom/whoop/settings/SettingsLandingFragment;

    iget-object v1, p0, Lea2/x;->x:Leb/x0;

    invoke-static {v0, v1, p1}, Lcom/whoop/settings/SettingsLandingFragment;->x0(Lcom/whoop/settings/SettingsLandingFragment;Leb/x0;Landroid/view/View;)V

    return-void
.end method
