.class public final Leb/v;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Leb/v;

.field public static final F:Leb/v;

.field public static final G:Leb/v;

.field public static final H:Leb/v;

.field public static final x:Leb/v;

.field public static final y:Leb/v;

.field public static final z:Leb/v;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Leb/v;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leb/v;-><init>(II)V

    sput-object v0, Leb/v;->x:Leb/v;

    new-instance v0, Leb/v;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Leb/v;-><init>(II)V

    sput-object v0, Leb/v;->y:Leb/v;

    new-instance v0, Leb/v;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Leb/v;-><init>(II)V

    sput-object v0, Leb/v;->z:Leb/v;

    new-instance v0, Leb/v;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Leb/v;-><init>(II)V

    sput-object v0, Leb/v;->E:Leb/v;

    new-instance v0, Leb/v;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Leb/v;-><init>(II)V

    sput-object v0, Leb/v;->F:Leb/v;

    new-instance v0, Leb/v;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Leb/v;-><init>(II)V

    sput-object v0, Leb/v;->G:Leb/v;

    new-instance v0, Leb/v;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Leb/v;-><init>(II)V

    sput-object v0, Leb/v;->H:Leb/v;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Leb/v;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Leb/v;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Leb/y0;

    const-string v0, "$this$navOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Leb/y0;->b:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Leb/k1;

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Leb/n0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Leb/r0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Leb/r0;

    iget v0, p1, Leb/r0;->M:I

    const/4 v2, 0x0

    invoke-virtual {p1, v0, p1, v1, v2}, Leb/r0;->r(ILeb/n0;Leb/n0;Z)Leb/n0;

    move-result-object v1

    :cond_0
    return-object v1

    :pswitch_2
    check-cast p1, Leb/n0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Leb/n0;->H:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Leb/n0;

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Leb/n0;->x:Leb/r0;

    if-eqz v0, :cond_1

    iget v1, v0, Leb/r0;->M:I

    iget p1, p1, Leb/n0;->H:I

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_4
    check-cast p1, Leb/n0;

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Leb/n0;->x:Leb/r0;

    if-eqz v0, :cond_2

    iget v1, v0, Leb/r0;->M:I

    iget p1, p1, Leb/n0;->H:I

    if-ne v1, p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return-object v0

    :pswitch_5
    check-cast p1, Leb/y0;

    const-string v0, "$this$navOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Leb/y0;->c:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
