.class public final Lv53/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lv53/a;

.field public static final y:Lv53/a;

.field public static final z:Lv53/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lv53/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lv53/a;-><init>(II)V

    sput-object v0, Lv53/a;->x:Lv53/a;

    new-instance v0, Lv53/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lv53/a;-><init>(II)V

    sput-object v0, Lv53/a;->y:Lv53/a;

    new-instance v0, Lv53/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lv53/a;-><init>(II)V

    sput-object v0, Lv53/a;->z:Lv53/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lv53/a;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lv53/a;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lz53/b;

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lv53/c;

    const-string v0, "$this$install"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lv53/c;->E:Le63/f;

    sget-object v1, Le63/f;->j:Lhc3/x;

    new-instance v2, La63/b;

    const/4 v3, 0x1

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct {v2, v4, v3, v5}, La63/b;-><init>(IILq83/d;)V

    invoke-virtual {v0, v1, v2}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    iget-object p1, p1, Lv53/c;->F:Lf63/b;

    sget-object v0, Lf63/b;->k:Lhc3/x;

    new-instance v1, La63/j;

    invoke-direct {v1, v4, v5}, La63/j;-><init>(ILq83/d;)V

    invoke-virtual {p1, v0, v1}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    new-instance v1, La63/c;

    const/4 v2, 0x1

    invoke-direct {v1, v4, v2, v5}, La63/c;-><init>(IILq83/d;)V

    invoke-virtual {p1, v0, v1}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
