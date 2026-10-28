.class public final synthetic Lub2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;I)V
    .locals 0

    iput p2, p0, Lub2/c;->w:I

    iput-object p1, p0, Lub2/c;->x:Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lub2/c;->w:I

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lub2/c;->x:Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;

    invoke-static {v0, p1}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->M(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lub2/c;->x:Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;

    invoke-static {v0, p1}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->L(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
