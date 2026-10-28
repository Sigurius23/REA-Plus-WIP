.class public final Lo2/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:Lo2/f;

.field public static final y:Lo2/f;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lo2/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo2/f;-><init>(II)V

    sput-object v0, Lo2/f;->x:Lo2/f;

    new-instance v0, Lo2/f;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo2/f;-><init>(II)V

    sput-object v0, Lo2/f;->y:Lo2/f;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lo2/f;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo2/f;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    invoke-static {}, Luf/c0;->r()Li2/l;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
