.class public final Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;

.field private static lambda$259284293:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;

    invoke-direct {v0}, Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;-><init>()V

    sput-object v0, Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;->INSTANCE:Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;

    new-instance v0, Lck1/h;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lck1/h;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0xf745d45

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;->lambda$259284293:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;->lambda_259284293$lambda$0(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final lambda_259284293$lambda$0(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 5

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p0, p2, 0x11

    const/4 v0, 0x1

    const/16 v1, 0x10

    if-eq p0, v1, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    and-int/2addr p2, v0

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    int-to-float p2, v1

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr p2, v1

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object p2, Lb2/e;->N:Lb2/k;

    sget-object v1, Ll0/m;->c:Ll0/g;

    const/16 v2, 0x30

    invoke-static {v1, p2, p1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p2

    iget-wide v1, p1, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {p1, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v4, p1, Lp1/q;->S:Z

    if-eqz v4, :cond_1

    invoke-virtual {p1, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {p1, v3, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {p1, p2, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v2, p1, Lp1/q;->S:Z

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v1, p1, v1, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {p1, p2, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final getLambda$259284293$profile_release()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;->lambda$259284293:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
