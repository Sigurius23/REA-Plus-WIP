.class public final La3/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:La3/j;

.field public static final y:La3/j;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, La3/j;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La3/j;-><init>(II)V

    sput-object v0, La3/j;->x:La3/j;

    new-instance v0, La3/j;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La3/j;-><init>(II)V

    sput-object v0, La3/j;->y:La3/j;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, La3/j;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, La3/j;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La3/n0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, La3/n0;-><init>(I)V

    return-object v0

    :pswitch_0
    new-instance v0, La3/n0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, La3/n0;-><init>(I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
