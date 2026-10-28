.class public final Lp00/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final x:Lp00/a;

.field public static final y:Lp00/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lp00/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp00/a;-><init>(I)V

    sput-object v0, Lp00/a;->x:Lp00/a;

    new-instance v0, Lp00/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp00/a;-><init>(I)V

    sput-object v0, Lp00/a;->y:Lp00/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lp00/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lp00/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/i0;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    const-string p2, "$this$AnimatedVisibility"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, v7

    check-cast p1, Lp1/q;

    const p2, -0x1a6f7841

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lg00/g;->c:Lp1/u2;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg00/b;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Lp1/q;->q(Z)V

    iget-wide v3, p2, Lg00/b;->m:J

    const/4 p1, 0x3

    int-to-float v0, p1

    sget-object p1, Lb2/t;->w:Lb2/t;

    const-string p2, "verification_resend_loader_tag"

    invoke-static {p1, p2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/16 p2, 0x12

    int-to-float p2, p2

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v1, 0xc06

    const/4 v2, 0x4

    const-wide/16 v5, 0x0

    invoke-static/range {v0 .. v8}, Lup/d;->f(FIIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "$this$VerificationBodyContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    const/4 p3, 0x3

    const/4 v0, 0x0

    invoke-static {v0, v0, p2, p1, p3}, Lug/m;->b(Landroidx/compose/ui/Modifier;Ly3/f;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
