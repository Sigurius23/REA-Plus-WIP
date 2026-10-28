.class public final Lz53/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lz53/a;

.field public static final y:Lz53/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lz53/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz53/a;-><init>(II)V

    sput-object v0, Lz53/a;->x:Lz53/a;

    new-instance v0, Lz53/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz53/a;-><init>(II)V

    sput-object v0, Lz53/a;->y:Lz53/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lz53/a;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lz53/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lud3/l0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lud3/k0;

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p1, Lud3/k0;->i:Z

    iput-boolean v0, p1, Lud3/k0;->j:Z

    const/4 v0, 0x1

    iput-boolean v0, p1, Lud3/k0;->f:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
