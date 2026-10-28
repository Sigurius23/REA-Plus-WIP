.class public final synthetic Lb3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb3/k;->w:I

    iput-object p1, p0, Lb3/k;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    iget v0, p0, Lb3/k;->w:I

    iget-object v1, p0, Lb3/k;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/amplitude/android/engagement/a;

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    iget-object v2, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v2, Lhj/v;

    iget v2, v2, Lhj/v;->w:I

    const/4 v3, 0x4

    if-le v3, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "OnGlobalLayout Listener fired, publishing view hierarchy mutation"

    sget-object v3, Lhj/v;->E:Lhj/v;

    invoke-virtual {v0, v3, v2}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    :goto_0
    iget-object v0, v1, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v1, "globalThis.viewHierarchyMutationActions.publishViewHierarchyMutation()"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-void

    :pswitch_0
    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->O()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
