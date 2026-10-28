.class public final Lcb3/b;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lcb3/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcb3/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcb3/b;-><init>(I)V

    sput-object v0, Lcb3/b;->x:Lcb3/b;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcb3/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcb3/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr93/c;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Lcb3/e;->l(Lr93/c;)Lxb3/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lr93/k;

    sget v0, Lcb3/e;->a:I

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
