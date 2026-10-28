.class public final synthetic Lio/getstream/chat/android/ui/utils/extensions/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Landroidx/lifecycle/p0;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/lifecycle/t0;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Landroidx/lifecycle/p0;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;I)V
    .locals 0

    iput p5, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->x:Landroidx/lifecycle/t0;

    iput-object p2, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->y:Lc93/m;

    iput-object p3, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->z:Landroidx/lifecycle/p0;

    iput-object p4, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->E:Landroidx/lifecycle/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->z:Landroidx/lifecycle/p0;

    iget-object v1, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->E:Landroidx/lifecycle/p0;

    iget-object v2, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->x:Landroidx/lifecycle/t0;

    iget-object v3, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->y:Lc93/m;

    invoke-static {v2, v3, v0, v1, p1}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;->a(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->z:Landroidx/lifecycle/p0;

    iget-object v1, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->E:Landroidx/lifecycle/p0;

    iget-object v2, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->x:Landroidx/lifecycle/t0;

    iget-object v3, p0, Lio/getstream/chat/android/ui/utils/extensions/a;->y:Lc93/m;

    invoke-static {v2, v3, v0, v1, p1}, Lio/getstream/chat/android/ui/utils/extensions/LiveDataKt;->b(Landroidx/lifecycle/t0;Lc93/m;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
