.class public final synthetic Lcom/whoop/settings/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lcom/whoop/settings/SettingsLandingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/SettingsLandingFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/settings/j;->w:Lcom/whoop/settings/SettingsLandingFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/j;->w:Lcom/whoop/settings/SettingsLandingFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/SettingsLandingFragment$g;->f(Lcom/whoop/settings/SettingsLandingFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
