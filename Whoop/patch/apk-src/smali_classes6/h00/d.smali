.class public final Lh00/d;
.super Ls2/e;
.source "SourceFile"


# static fields
.field public static final a:Lh00/d;

.field public static final b:Landroidx/compose/ui/Modifier;

.field public static final c:Landroidx/compose/ui/Modifier;

.field public static final d:Ll3/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    new-instance v0, Lh00/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh00/d;->a:Lh00/d;

    const/4 v0, 0x4

    int-to-float v3, v0

    sget-object v0, Lt0/j;->a:Lt0/i;

    const/4 v2, 0x0

    const/4 v6, 0x1

    sget-object v1, Lb2/t;->w:Lb2/t;

    move v4, v3

    move v5, v3

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v7, 0xc

    int-to-float v2, v7

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lh00/d;->b:Landroidx/compose/ui/Modifier;

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lh00/d;->c:Landroidx/compose/ui/Modifier;

    sget-object v13, Lp3/r;->H:Lp3/r;

    invoke-static {v7}, Lv63/c;->h(I)J

    move-result-wide v11

    const/16 v0, 0x10

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v21

    new-instance v8, Ll3/v0;

    const/16 v20, 0x0

    const v23, 0xfdffd9

    const-wide/16 v9, 0x0

    const/4 v14, 0x0

    sget-object v15, Lp3/i;->w:Lp3/f;

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v8 .. v23}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    sput-object v8, Lh00/d;->d:Ll3/v0;

    return-void
.end method


# virtual methods
.method public final C()Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lh00/d;->b:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final J()Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lh00/d;->c:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final K()Ll3/v0;
    .locals 1

    sget-object v0, Lh00/d;->d:Ll3/v0;

    return-object v0
.end method
