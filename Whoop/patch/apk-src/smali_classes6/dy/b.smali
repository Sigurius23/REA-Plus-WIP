.class public final Ldy/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;I)V
    .locals 0

    iput p2, p0, Ldy/b;->w:I

    iput-object p1, p0, Ldy/b;->x:Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldy/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldy/b;->x:Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;

    invoke-virtual {v0}, Lg/l;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldy/b;->x:Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;

    invoke-virtual {v0}, Lg/l;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
