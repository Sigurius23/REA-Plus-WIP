.class final Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $offset$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $scale$delegate:Lp1/z0;


# direct methods
.method public constructor <init>(Lp1/z0;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/z0;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1;->$scale$delegate:Lp1/z0;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1;->$offset$delegate:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp1/z0;Lp1/c1;Lh2/b;Lh2/b;FF)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1;->invoke$lambda$0(Lp1/z0;Lp1/c1;Lh2/b;Lh2/b;FF)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$0(Lp1/z0;Lp1/c1;Lh2/b;Lh2/b;FF)Ll83/a0;
    .locals 6

    invoke-static {p0}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$2(Lp1/z0;)F

    move-result p2

    mul-float/2addr p2, p4

    const/high16 p4, 0x3f000000    # 0.5f

    const/high16 p5, 0x40400000    # 3.0f

    invoke-static {p2, p4, p5}, Le93/b;->m(FFF)F

    move-result p2

    invoke-static {p0, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$3(Lp1/z0;F)V

    invoke-static {p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$5(Lp1/c1;)J

    move-result-wide p4

    const/16 p0, 0x20

    shr-long/2addr p4, p0

    long-to-int p2, p4

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    iget-wide p4, p3, Lh2/b;->a:J

    shr-long/2addr p4, p0

    long-to-int p4, p4

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p4

    add-float/2addr p4, p2

    const/high16 p2, -0x3cb80000    # -200.0f

    const/high16 p5, 0x43480000    # 200.0f

    invoke-static {p4, p2, p5}, Le93/b;->m(FFF)F

    move-result p4

    invoke-static {p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$5(Lp1/c1;)J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget-wide v4, p3, Lh2/b;->a:J

    and-long/2addr v4, v2

    long-to-int p3, v4

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    add-float/2addr p3, v0

    invoke-static {p3, p2, p5}, Le93/b;->m(FFF)F

    move-result p2

    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long p3, p3

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v0, p2

    shl-long p2, p3, p0

    and-long p4, v0, v2

    or-long/2addr p2, p4

    invoke-static {p1, p2, p3}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$6(Lp1/c1;J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/v;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1;->$scale$delegate:Lp1/z0;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1;->$offset$delegate:Lp1/c1;

    new-instance v2, Lcom/whoop/profile/view/edit/avatar/c;

    invoke-direct {v2, v0, v1}, Lcom/whoop/profile/view/edit/avatar/c;-><init>(Lp1/z0;Lp1/c1;)V

    new-instance v0, Lh0/u3;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lh0/u3;-><init>(Lcom/whoop/profile/view/edit/avatar/c;Lq83/d;)V

    invoke-static {p1, v0, p2}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method
