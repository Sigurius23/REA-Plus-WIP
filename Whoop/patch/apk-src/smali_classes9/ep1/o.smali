.class public final synthetic Lep1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lep1/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep1/o;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lep1/o;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, Lep1/o;->z:Z

    iput-object p4, p0, Lep1/o;->E:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lep1/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lep1/o;->z:Z

    iput-object p2, p0, Lep1/o;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lep1/o;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lep1/o;->E:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lep1/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lep1/o;->z:Z

    iget-object v1, p0, Lep1/o;->E:Lp1/c1;

    iget-object v2, p0, Lep1/o;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lep1/o;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v1, v0}, Lm80/f;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lep1/o;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lep1/o;->E:Lp1/c1;

    iget-object v2, p0, Lep1/o;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Lep1/o;->z:Z

    invoke-static {v2, v0, v1, v3}, Lep1/q;->q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
