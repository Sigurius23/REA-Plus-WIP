.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

.field public static final y:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

.field public static final z:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;-><init>(I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;->x:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;-><init>(I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;->y:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;-><init>(I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;->z:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr93/b;

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_0
    check-cast p1, Lr93/n0;

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_1
    check-cast p1, Lu93/q0;

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
