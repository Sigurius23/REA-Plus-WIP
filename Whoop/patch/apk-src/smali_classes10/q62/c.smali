.class public final synthetic Lq62/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm62/i$a;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lm62/i$a;Lkotlin/jvm/functions/Function1;Lp1/t2;I)V
    .locals 0

    iput p4, p0, Lq62/c;->w:I

    iput-object p1, p0, Lq62/c;->x:Lm62/i$a;

    iput-object p2, p0, Lq62/c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lq62/c;->z:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lq62/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq62/c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq62/c;->z:Lp1/t2;

    iget-object v2, p0, Lq62/c;->x:Lm62/i$a;

    invoke-static {v2, v0, v1}, Lq62/d;->d(Lm62/i$a;Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lq62/c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq62/c;->z:Lp1/t2;

    iget-object v2, p0, Lq62/c;->x:Lm62/i$a;

    invoke-static {v2, v0, v1}, Lq62/d;->a(Lm62/i$a;Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
