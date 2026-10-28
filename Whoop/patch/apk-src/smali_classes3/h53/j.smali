.class public final Lh53/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final E:Lh53/j;

.field public static final F:Lh53/j;

.field public static final G:Lh53/j;

.field public static final H:Lh53/j;

.field public static final I:Lh53/j;

.field public static final J:Lh53/j;

.field public static final K:Lh53/j;

.field public static final x:Lh53/j;

.field public static final y:Lh53/j;

.field public static final z:Lh53/j;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lh53/j;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->x:Lh53/j;

    new-instance v0, Lh53/j;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->y:Lh53/j;

    new-instance v0, Lh53/j;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->z:Lh53/j;

    new-instance v0, Lh53/j;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->E:Lh53/j;

    new-instance v0, Lh53/j;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->F:Lh53/j;

    new-instance v0, Lh53/j;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->G:Lh53/j;

    new-instance v0, Lh53/j;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->H:Lh53/j;

    new-instance v0, Lh53/j;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->I:Lh53/j;

    new-instance v0, Lh53/j;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->J:Lh53/j;

    new-instance v0, Lh53/j;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lh53/j;-><init>(II)V

    sput-object v0, Lh53/j;->K:Lh53/j;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lh53/j;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh53/j;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li53/d;

    check-cast p2, Li53/o;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Li53/c;->a:Li53/c;

    return-object p1

    :pswitch_0
    check-cast p1, Li53/d;

    check-cast p2, Li53/k;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li53/b;

    iget-object v0, p2, Li53/k;->a:Lx43/c;

    iget-object p2, p2, Li53/k;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-direct {p1, v0, p2}, Li53/b;-><init>(Lx43/c;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    return-object p1

    :pswitch_1
    check-cast p1, Li53/e;

    if-nez p2, :cond_0

    const-string p2, "$this$onEvent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Li53/g;->a:Li53/g;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_2
    check-cast p1, Li53/e;

    check-cast p2, Li53/o;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Li53/c;->a:Li53/c;

    return-object p1

    :pswitch_3
    check-cast p1, Li53/e;

    check-cast p2, Li53/m;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li53/e;

    iget-object v0, p2, Li53/m;->a:Ln23/c;

    iget-object p2, p2, Li53/m;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-direct {p1, v0, p2}, Li53/e;-><init>(Ln23/c;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    return-object p1

    :pswitch_4
    check-cast p1, Li53/e;

    check-cast p2, Li53/q;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li53/d;

    iget-object p2, p2, Li53/q;->a:Ln23/c;

    invoke-direct {p1, p2}, Li53/d;-><init>(Ln23/c;)V

    return-object p1

    :pswitch_5
    check-cast p1, Li53/e;

    check-cast p2, Li53/r;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Li53/h;->a:Li53/h;

    return-object p1

    :pswitch_6
    check-cast p1, Li53/e;

    check-cast p2, Li53/n;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Li53/f;->a:Li53/f;

    return-object p1

    :pswitch_7
    check-cast p1, Li53/e;

    check-cast p2, Li53/l;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li53/a;

    iget-object p2, p2, Li53/l;->a:Lv33/n;

    invoke-direct {p1, p2}, Li53/a;-><init>(Lv33/n;)V

    return-object p1

    :pswitch_8
    check-cast p1, Li53/e;

    check-cast p2, Li53/k;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li53/b;

    iget-object v0, p2, Li53/k;->a:Lx43/c;

    iget-object p2, p2, Li53/k;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-direct {p1, v0, p2}, Li53/b;-><init>(Lx43/c;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
