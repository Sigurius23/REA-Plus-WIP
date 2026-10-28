.class public final Lmj/n;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmj/p;


# direct methods
.method public synthetic constructor <init>(Lmj/p;I)V
    .locals 0

    iput p2, p0, Lmj/n;->w:I

    iput-object p1, p0, Lmj/n;->x:Lmj/p;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lmj/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmj/n;->x:Lmj/p;

    iget-object v1, v0, Lmj/p;->a:Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lmj/p;->b:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v1, v0}, Lcom/amplitude/android/engagement/a;->b(Lcom/amplitude/android/engagement/types/Nudge;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmj/n;->x:Lmj/p;

    iget-object v1, v0, Lmj/p;->a:Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lmj/p;->b:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v1, v0}, Lcom/amplitude/android/engagement/a;->b(Lcom/amplitude/android/engagement/types/Nudge;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
