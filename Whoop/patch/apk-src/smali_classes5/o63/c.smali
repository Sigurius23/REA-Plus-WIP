.class public final Lo63/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lo63/c;

.field public static final x:Lo63/c;

.field public static final y:Lo63/c;

.field public static final z:Lo63/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lo63/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo63/c;-><init>(II)V

    sput-object v0, Lo63/c;->x:Lo63/c;

    new-instance v0, Lo63/c;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo63/c;-><init>(II)V

    sput-object v0, Lo63/c;->y:Lo63/c;

    new-instance v0, Lo63/c;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo63/c;-><init>(II)V

    sput-object v0, Lo63/c;->z:Lo63/c;

    new-instance v0, Lo63/c;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo63/c;-><init>(II)V

    sput-object v0, Lo63/c;->E:Lo63/c;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lo63/c;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lo63/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ldt/b;->h(Ljava/lang/String;)Lo63/e;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lo63/e;

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lo63/e;->a:Ljava/lang/String;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo63/j;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ldt/b;->h(Ljava/lang/String;)Lo63/e;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lo63/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_2
    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo63/j;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo63/e;

    iget-object v1, v1, Lo63/e;->a:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lo63/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
