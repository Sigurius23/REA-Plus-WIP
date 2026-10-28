.class public final Lh00/c;
.super Ls2/e;
.source "SourceFile"


# static fields
.field public static final a:Lh00/c;

.field public static final b:Landroidx/compose/ui/Modifier;

.field public static final c:Landroidx/compose/ui/Modifier;

.field public static final d:Ll3/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lh00/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh00/c;->a:Lh00/c;

    sget-object v0, Lt0/j;->a:Lt0/i;

    const/4 v0, 0x6

    int-to-float v4, v0

    const/16 v0, 0xc

    int-to-float v3, v0

    const/4 v2, 0x0

    const/4 v6, 0x1

    sget-object v1, Lb2/t;->w:Lb2/t;

    move v5, v3

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0x14

    int-to-float v4, v2

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lh00/c;->b:Landroidx/compose/ui/Modifier;

    const/4 v6, 0x0

    const/4 v10, 0x1

    move v8, v3

    move v9, v3

    move-object v5, v1

    move v7, v3

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lh00/c;->c:Landroidx/compose/ui/Modifier;

    sget-object v8, Lp3/r;->F:Lp3/r;

    const/16 v0, 0xe

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v6

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v16

    new-instance v3, Ll3/v0;

    const/4 v15, 0x0

    const v18, 0xfdffd9

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    sget-object v10, Lp3/i;->w:Lp3/f;

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v3 .. v18}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    sput-object v3, Lh00/c;->d:Ll3/v0;

    return-void
.end method


# virtual methods
.method public final C()Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lh00/c;->b:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final J()Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lh00/c;->c:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final K()Ll3/v0;
    .locals 1

    sget-object v0, Lh00/c;->d:Ll3/v0;

    return-object v0
.end method
