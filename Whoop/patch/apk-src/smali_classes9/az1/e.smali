.class public final synthetic Laz1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lyy1/d;


# direct methods
.method public synthetic constructor <init>(Lyy1/d;I)V
    .locals 0

    iput p2, p0, Laz1/e;->w:I

    iput-object p1, p0, Laz1/e;->x:Lyy1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Laz1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laz1/e;->x:Lyy1/d;

    check-cast p1, Lyy1/c;

    invoke-static {v0, p1}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->C(Lyy1/d;Lyy1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Laz1/e;->x:Lyy1/d;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->A(Lyy1/d;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
