.class public final Lh3/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lh3/b;

.field public static final y:Lh3/b;

.field public static final z:Lh3/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lh3/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh3/b;-><init>(II)V

    sput-object v0, Lh3/b;->x:Lh3/b;

    new-instance v0, Lh3/b;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh3/b;-><init>(II)V

    sput-object v0, Lh3/b;->y:Lh3/b;

    new-instance v0, Lh3/b;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lh3/b;-><init>(II)V

    sput-object v0, Lh3/b;->z:Lh3/b;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lh3/b;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh3/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh3/k;

    iget-object p1, p1, Lh3/k;->c:Ly3/k;

    invoke-virtual {p1}, Ly3/k;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lh3/k;

    iget p1, p1, Lh3/k;->b:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
