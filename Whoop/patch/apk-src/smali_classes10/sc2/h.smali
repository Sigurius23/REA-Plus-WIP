.class public final synthetic Lsc2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lcom/whoop/settings/strap/StrapSettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/strap/StrapSettingsFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc2/h;->w:Lcom/whoop/settings/strap/StrapSettingsFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lsc2/h;->w:Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v0}, Lcom/whoop/settings/strap/StrapSettingsFragment;->N(Lcom/whoop/settings/strap/StrapSettingsFragment;)V

    return-void
.end method
