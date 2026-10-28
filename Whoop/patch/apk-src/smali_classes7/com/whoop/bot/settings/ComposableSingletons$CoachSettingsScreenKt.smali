.class public final Lcom/whoop/bot/settings/ComposableSingletons$CoachSettingsScreenKt;
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
.field public static final INSTANCE:Lcom/whoop/bot/settings/ComposableSingletons$CoachSettingsScreenKt;

.field private static lambda$919338267:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/bot/settings/ComposableSingletons$CoachSettingsScreenKt;

    invoke-direct {v0}, Lcom/whoop/bot/settings/ComposableSingletons$CoachSettingsScreenKt;-><init>()V

    sput-object v0, Lcom/whoop/bot/settings/ComposableSingletons$CoachSettingsScreenKt;->INSTANCE:Lcom/whoop/bot/settings/ComposableSingletons$CoachSettingsScreenKt;

    new-instance v0, Lck1/h;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lck1/h;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x36cbfd1b

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lcom/whoop/bot/settings/ComposableSingletons$CoachSettingsScreenKt;->lambda$919338267:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/bot/settings/ComposableSingletons$CoachSettingsScreenKt;->lambda_919338267$lambda$0(Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final lambda_919338267$lambda$0(Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    const-string v0, "$this$item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p0, p2, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p0, v0, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    and-int/2addr p2, v1

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, v7, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->V0()J

    move-result-wide v3

    int-to-float v5, v1

    const/4 p2, 0x2

    int-to-float p2, p2

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p2, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v1, v0

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, p2, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-virtual {p0, v7, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->W0()J

    move-result-wide p0

    new-instance v1, Lhy0/h;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lhy0/h;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p2, p0, p1, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v8, 0x180

    const/16 v9, 0x8

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final getLambda$919338267$bot_release()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/bot/settings/ComposableSingletons$CoachSettingsScreenKt;->lambda$919338267:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
