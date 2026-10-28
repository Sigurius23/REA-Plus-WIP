.class public final Le43/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:Le43/a;

.field public static final y:Le43/a;

.field public static final z:Le43/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Le43/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le43/a;-><init>(II)V

    sput-object v0, Le43/a;->x:Le43/a;

    new-instance v0, Le43/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Le43/a;-><init>(II)V

    sput-object v0, Le43/a;->y:Le43/a;

    new-instance v0, Le43/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Le43/a;-><init>(II)V

    sput-object v0, Le43/a;->z:Le43/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Le43/a;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le43/a;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_1
    const/high16 v0, 0xc000000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
