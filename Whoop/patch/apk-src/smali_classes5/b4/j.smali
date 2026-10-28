.class public final Lb4/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:Lb4/j;

.field public static final y:Lb4/j;

.field public static final z:Lb4/j;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lb4/j;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb4/j;-><init>(II)V

    sput-object v0, Lb4/j;->x:Lb4/j;

    new-instance v0, Lb4/j;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb4/j;-><init>(II)V

    sput-object v0, Lb4/j;->y:Lb4/j;

    new-instance v0, Lb4/j;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lb4/j;-><init>(II)V

    sput-object v0, Lb4/j;->z:Lb4/j;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lb4/j;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb4/j;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
