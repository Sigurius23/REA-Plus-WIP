.class public final Lwb3/e;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lwb3/e;

.field public static final y:Lwb3/e;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lwb3/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwb3/e;-><init>(I)V

    sput-object v0, Lwb3/e;->x:Lwb3/e;

    new-instance v0, Lwb3/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lwb3/e;-><init>(I)V

    sput-object v0, Lwb3/e;->y:Lwb3/e;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lwb3/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwb3/e;->w:I

    check-cast p1, Lj93/d;

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lj93/d;->getTypeParameters()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    return-object p1

    :pswitch_0
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lj93/d;->isInner()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
