.class public final synthetic Lmr1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/a0;


# direct methods
.method public synthetic constructor <init>(Leb/a0;I)V
    .locals 0

    iput p2, p0, Lmr1/h;->w:I

    iput-object p1, p0, Lmr1/h;->x:Leb/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmr1/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmr1/h;->x:Leb/a0;

    invoke-static {v0}, Lcom/whoop/entitlements/ui/NotFoundFragment;->z(Leb/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmr1/h;->x:Leb/a0;

    invoke-static {v0}, Lcom/whoop/settings/language/LanguagePrefsFragment;->z(Leb/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lmr1/h;->x:Leb/a0;

    invoke-static {v0}, Lmr1/j;->a(Leb/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lmr1/h;->x:Leb/a0;

    invoke-static {v0}, Lmr1/j;->b(Leb/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
