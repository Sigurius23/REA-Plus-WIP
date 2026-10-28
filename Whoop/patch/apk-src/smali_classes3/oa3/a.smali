.class public final Loa3/a;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/m;


# static fields
.field public static final x:Loa3/a;

.field public static final y:Loa3/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Loa3/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Loa3/a;-><init>(I)V

    sput-object v0, Loa3/a;->x:Loa3/a;

    new-instance v0, Loa3/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Loa3/a;-><init>(I)V

    sput-object v0, Loa3/a;->y:Loa3/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Loa3/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Loa3/a;->w:I

    check-cast p1, Loa3/d;

    check-cast p2, Loa3/r;

    packed-switch v0, :pswitch_data_0

    const-string v0, "$this$loadConstantFromProperty"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Loa3/d;->b:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "$this$loadConstantFromProperty"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Loa3/d;->c:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
