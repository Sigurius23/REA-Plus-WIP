.class public final synthetic Lv10/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lv10/p;->w:I

    iput-object p2, p0, Lv10/p;->x:Ljava/lang/Object;

    iput-object p3, p0, Lv10/p;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwz/r0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lv10/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv10/p;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/i;

    iput-object p2, p0, Lv10/p;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lv10/p;->w:I

    const-string v1, "linkActivityResult"

    iget-object v2, p0, Lv10/p;->y:Ljava/lang/Object;

    iget-object v3, p0, Lv10/p;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lwz/r0;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lwz/q;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p1, v2}, Lwz/r0;->a(Lwz/q;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_0
    check-cast v3, Lwz/r0;

    check-cast v2, Lkotlin/jvm/internal/i;

    check-cast p1, Lwz/q;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p1, v2}, Lwz/r0;->a(Lwz/q;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_1
    check-cast v3, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;

    check-cast v2, Lyx/b;

    check-cast p1, Lj/a;

    sget v0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->x:I

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->o(Lyx/b;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
