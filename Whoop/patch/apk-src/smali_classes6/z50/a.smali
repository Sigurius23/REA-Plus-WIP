.class public final synthetic Lz50/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/access/omronauth/view/OmronAuthFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/access/omronauth/view/OmronAuthFragment;I)V
    .locals 0

    iput p2, p0, Lz50/a;->w:I

    iput-object p1, p0, Lz50/a;->x:Lcom/whoop/access/omronauth/view/OmronAuthFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lz50/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lz50/a;->x:Lcom/whoop/access/omronauth/view/OmronAuthFragment;

    check-cast p1, Lx50/a$j;

    invoke-static {v0, p1}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->A(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Lx50/a$j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lz50/a;->x:Lcom/whoop/access/omronauth/view/OmronAuthFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->y(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
