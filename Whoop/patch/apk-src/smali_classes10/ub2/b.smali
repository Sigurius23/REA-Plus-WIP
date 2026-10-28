.class public final synthetic Lub2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;I)V
    .locals 0

    iput p2, p0, Lub2/b;->w:I

    iput-object p1, p0, Lub2/b;->x:Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lub2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lub2/b;->x:Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;

    invoke-static {v0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->I(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lub2/b;->x:Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;

    invoke-static {v0}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->H(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
