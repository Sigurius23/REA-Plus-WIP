.class public final synthetic Ls40/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/view/CardMultilineWidget;


# direct methods
.method public synthetic constructor <init>(ILcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    iput p1, p0, Ls40/m;->w:I

    iput-object p2, p0, Ls40/m;->x:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ls40/m;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Ls40/m;->x:Lcom/stripe/android/view/CardMultilineWidget;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    new-instance v0, Ls40/n;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2}, Ls40/n;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-object v1

    :pswitch_0
    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    new-instance v0, Ls40/n;

    const/4 v3, 0x2

    invoke-direct {v0, v3, v2}, Ls40/n;-><init>(ILcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
