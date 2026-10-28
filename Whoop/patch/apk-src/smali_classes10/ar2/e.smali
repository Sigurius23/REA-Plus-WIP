.class public final synthetic Lar2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lar2/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar2/e;->x:Ljava/lang/String;

    iput-object p2, p0, Lar2/e;->z:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lar2/e;->y:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lar2/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar2/e;->x:Ljava/lang/String;

    iput-object p2, p0, Lar2/e;->y:Lp1/c1;

    iput-object p3, p0, Lar2/e;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lar2/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar2/e;->z:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lar2/e;->x:Ljava/lang/String;

    iput-object p3, p0, Lar2/e;->y:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lar2/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lar2/e;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lar2/e;->y:Lp1/c1;

    iget-object v2, p0, Lar2/e;->x:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Ly21/i;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lar2/e;->y:Lp1/c1;

    iget-object v1, p0, Lar2/e;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lar2/e;->x:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Leg2/i;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lar2/e;->x:Ljava/lang/String;

    iget-object v1, p0, Lar2/e;->y:Lp1/c1;

    iget-object v2, p0, Lar2/e;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v1}, Lar2/g;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
