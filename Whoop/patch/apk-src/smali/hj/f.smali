.class public final synthetic Lhj/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/a;

.field public final synthetic y:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/a;Landroid/app/Activity;I)V
    .locals 0

    iput p3, p0, Lhj/f;->w:I

    iput-object p1, p0, Lhj/f;->x:Lcom/amplitude/android/engagement/a;

    iput-object p2, p0, Lhj/f;->y:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lhj/f;->w:I

    iget-object v1, p0, Lhj/f;->y:Landroid/app/Activity;

    iget-object v2, p0, Lhj/f;->x:Lcom/amplitude/android/engagement/a;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lcom/amplitude/android/engagement/a;->n:Ll83/p;

    const/4 v0, 0x0

    invoke-virtual {v2, v1, v0}, Lcom/amplitude/android/engagement/a;->e(Landroid/app/Activity;Z)V

    return-void

    :pswitch_0
    const-string v0, "this$0"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v1, v0}, Lcom/amplitude/android/engagement/a;->e(Landroid/app/Activity;Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
