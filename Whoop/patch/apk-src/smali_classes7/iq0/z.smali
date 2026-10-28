.class public final synthetic Liq0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liq0/z;->a:Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    iget-object v0, p0, Liq0/z;->a:Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;->F(Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;Landroid/widget/RadioGroup;I)V

    return-void
.end method
