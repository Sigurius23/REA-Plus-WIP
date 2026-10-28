.class public final synthetic Leg2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ldg2/b;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ldg2/b;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Leg2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leg2/f;->x:Ldg2/b;

    iput-object p2, p0, Leg2/f;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ldg2/b;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Leg2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leg2/f;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Leg2/f;->x:Ldg2/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Leg2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leg2/f;->x:Ldg2/b;

    iget-object v1, p0, Leg2/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Leg2/j;->d(Ldg2/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Leg2/f;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Leg2/f;->x:Ldg2/b;

    invoke-static {v1, v0}, Leg2/i;->d(Ldg2/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
